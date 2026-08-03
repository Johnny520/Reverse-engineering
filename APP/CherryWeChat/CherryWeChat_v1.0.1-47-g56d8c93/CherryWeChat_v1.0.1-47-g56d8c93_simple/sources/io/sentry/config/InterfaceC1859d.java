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
    default Boolean m4083b(String r1) {
        String r12 = getProperty(r1);
        if (r12 != null) goto L5;
        return null;
    L5:
        return Boolean.valueOf(r12);
    }

    /* JADX INFO: renamed from: c */
    default Long m4084c(String r2) {
        String r22 = getProperty(r2);
        if (r22 != null) goto L8;
    L6:
        return null;
    L8:
        return Long.valueOf(r22);
    }

    /* JADX INFO: renamed from: d */
    default List m4085d(String r2) {
        String r22 = getProperty(r2);
        if (r22 == null) goto L7;
        return Arrays.asList(r22.split(","));
    L7:
        return Collections.EMPTY_LIST;
    }

    String getProperty(String r1);
}
