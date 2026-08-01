package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import java.util.Collections;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3862 {
    static {
        C3837 c3837M8219 = C3837.m8219("hardcoded value");
        new ConfigBoolean(c3837M8219, true);
        new ConfigBoolean(c3837M8219, false);
        new ConfigNull(c3837M8219);
        new SimpleConfigList(c3837M8219, Collections.EMPTY_LIST);
        SimpleConfigObject.empty(c3837M8219);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m8253() {
        try {
            return AbstractC3858.f12082;
        } catch (ExceptionInInitializerError e) {
            Throwable cause = e.getCause();
            if (cause == null || !(cause instanceof ConfigException)) {
                throw e;
            }
            throw ((ConfigException) cause);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8254(String str) {
        System.err.println(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8255(int i, String str) {
        while (i > 0) {
            System.err.print("  ");
            i--;
        }
        System.err.println(str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ConfigException.NotResolved m8256(C3857 c3857, ConfigException.NotResolved notResolved) {
        String strConcat = c3857.m8249().concat(" has not been resolved, you need to call Config#resolve(), see API docs for Config#resolve()");
        return strConcat.equals(notResolved.getMessage()) ? notResolved : new ConfigException.NotResolved(strConcat, notResolved);
    }
}
