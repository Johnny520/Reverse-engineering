package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.sentry.config.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1859d {
    /* JADX INFO: renamed from: a */
    Map mo4081a();

    /* JADX INFO: renamed from: b */
    default Boolean m4083b(String str) {
        String property = getProperty(str);
        if (property != null) {
            return Boolean.valueOf(property);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    default Long m4084c(String str) {
        String property = getProperty(str);
        if (property != null) {
            try {
                return Long.valueOf(property);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    default List m4085d(String str) {
        String property = getProperty(str);
        return property != null ? Arrays.asList(property.split(",")) : Collections.EMPTY_LIST;
    }

    String getProperty(String str);
}
