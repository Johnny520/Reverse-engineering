package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2849;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2930 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Properties f9279;

    static {
        Properties properties = new Properties();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = contextClassLoader != null ? contextClassLoader.getResourceAsStream("fastjson2.properties") : ClassLoader.getSystemResourceAsStream("fastjson2.properties");
        if (resourceAsStream != null) {
            try {
                properties.load(resourceAsStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                AbstractC2849.m5725(resourceAsStream);
                throw th;
            }
            AbstractC2849.m5725(resourceAsStream);
        }
        f9279 = properties;
    }
}
