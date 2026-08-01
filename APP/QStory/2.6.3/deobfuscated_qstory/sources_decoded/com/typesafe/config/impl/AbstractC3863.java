package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import java.util.Collections;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3863 {
    static {
        C3838 c3838M8206 = C3838.m8206("hardcoded value");
        new ConfigBoolean(c3838M8206, true);
        new ConfigBoolean(c3838M8206, false);
        new ConfigNull(c3838M8206);
        new SimpleConfigList(c3838M8206, Collections.EMPTY_LIST);
        SimpleConfigObject.empty(c3838M8206);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m8240() {
        try {
            return AbstractC3859.f12087;
        } catch (ExceptionInInitializerError e) {
            Throwable cause = e.getCause();
            if (cause == null || !(cause instanceof ConfigException)) {
                throw e;
            }
            throw ((ConfigException) cause);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8241(String str) {
        System.err.println(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8242(int i, String str) {
        while (i > 0) {
            System.err.print("  ");
            i--;
        }
        System.err.println(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ConfigException.NotResolved m8243(C3858 c3858, ConfigException.NotResolved notResolved) {
        String strConcat = c3858.m8236().concat(" has not been resolved, you need to call Config#resolve(), see API docs for Config#resolve()");
        return strConcat.equals(notResolved.getMessage()) ? notResolved : new ConfigException.NotResolved(strConcat, notResolved);
    }
}
