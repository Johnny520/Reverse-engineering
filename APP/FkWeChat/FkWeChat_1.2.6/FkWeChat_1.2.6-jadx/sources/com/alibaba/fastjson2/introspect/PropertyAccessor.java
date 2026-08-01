package com.alibaba.fastjson2.introspect;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface PropertyAccessor {
    boolean getBooleanValue(Object obj);

    byte getByteValue(Object obj);

    char getCharValue(Object obj);

    double getDoubleValue(Object obj);

    float getFloatValue(Object obj);

    int getIntValue(Object obj);

    long getLongValue(Object obj);

    Object getObject(Object obj);

    short getShortValue(Object obj);

    String name();

    Class<?> propertyClass();

    Type propertyType();

    void setBooleanValue(Object obj, boolean z10);

    void setByteValue(Object obj, byte b10);

    void setCharValue(Object obj, char c10);

    void setDoubleValue(Object obj, double d10);

    void setFloatValue(Object obj, float f10);

    void setIntValue(Object obj, int i10);

    void setLongValue(Object obj, long j10);

    void setObject(Object obj, Object obj2);

    void setShortValue(Object obj, short s10);

    boolean supportGet();

    boolean supportSet();
}
