package com.burialpoint.library.utils;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * class GsonUtil
 *
 * @author shifeiqi
 * @version 1.0
 */
public class GsonUtil {

    private static final Gson gson;

    static {
        gson = new Gson();
    }

    /**
     * convert the object to the json string
     *
     * @param object
     * @return
     */
    public static String toJson(Object object) {
        String json = gson.toJson(object);
        return json;
    }

    /**
     * convert json string to the object
     * notice: this method do not use in List !!!
     *
     * @param json
     * @param clazz the class type,
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Class<T> clazz) {

        T object = gson.fromJson(json, clazz);
        return object;
    }

    /**
     * convert json string to the object, usually list
     * <p/>
     * <example>
     * List<Object> list = GsonUtil.fromJson(json, new TypeToken<List<Object>>() {}.getType());
     * </example>
     *
     * @param json
     * @param type
     * @param <T>
     * @return
     */
    public static <T> T fromJson(String json, Type type) {

        T object = gson.fromJson(json, type);
        return object;
    }
}
