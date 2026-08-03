package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public interface FieldNamingStrategy {
    default java.util.List<java.lang.String> alternateNames(java.lang.reflect.Field r1) {
            r0 = this;
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
    }

    java.lang.String translateName(java.lang.reflect.Field r1);
}
