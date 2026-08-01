package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2848;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2929 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Properties f9277;

    static {
        Properties properties = new Properties();
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        InputStream resourceAsStream = contextClassLoader != null ? contextClassLoader.getResourceAsStream("fastjson2.properties") : ClassLoader.getSystemResourceAsStream("fastjson2.properties");
        if (resourceAsStream != null) {
            try {
                properties.load(resourceAsStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                AbstractC2848.m5680(resourceAsStream);
                throw th;
            }
            AbstractC2848.m5680(resourceAsStream);
        }
        f9277 = properties;
    }
}
