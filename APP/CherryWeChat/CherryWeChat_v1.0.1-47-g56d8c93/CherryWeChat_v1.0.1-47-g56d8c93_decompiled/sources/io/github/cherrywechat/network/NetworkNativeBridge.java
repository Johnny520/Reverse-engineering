package io.github.cherrywechat.network;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class NetworkNativeBridge {
    public static final native String decryptData(String str);

    public static final native Map<String, String> getHeaders(String str, String str2);
}
