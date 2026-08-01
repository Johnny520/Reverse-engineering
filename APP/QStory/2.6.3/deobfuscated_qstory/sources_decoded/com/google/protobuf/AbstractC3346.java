package com.google.protobuf;

import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3346 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final RuntimeVersion$RuntimeDomain f10981 = RuntimeVersion$RuntimeDomain.PUBLIC;

    static {
        Locale locale = Locale.US;
        Logger.getLogger(AbstractC3346.class.getName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7400(RuntimeVersion$RuntimeDomain runtimeVersion$RuntimeDomain, String str) {
        RuntimeVersion$RuntimeDomain runtimeVersion$RuntimeDomain2;
        String str2 = System.getenv("TEMPORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        if ((str2 == null || !str2.equals("true")) && runtimeVersion$RuntimeDomain != (runtimeVersion$RuntimeDomain2 = f10981)) {
            Locale locale = Locale.ROOT;
            final String str3 = "Detected mismatched Protobuf Gencode/Runtime domains when loading " + str + ": gencode " + runtimeVersion$RuntimeDomain + ", runtime " + runtimeVersion$RuntimeDomain2 + ". Cross-domain usage of Protobuf is not supported.";
            throw new RuntimeException(str3) { // from class: com.google.protobuf.RuntimeVersion$ProtobufRuntimeVersionException
            };
        }
    }
}
