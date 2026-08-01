package com.google.protobuf;

import java.util.Locale;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.protobuf.飘花落叶言世兰子苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3345 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final RuntimeVersion$RuntimeDomain f10976 = RuntimeVersion$RuntimeDomain.PUBLIC;

    static {
        Locale locale = Locale.US;
        Logger.getLogger(AbstractC3345.class.getName());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m7413(RuntimeVersion$RuntimeDomain runtimeVersion$RuntimeDomain, String str) {
        RuntimeVersion$RuntimeDomain runtimeVersion$RuntimeDomain2;
        String str2 = System.getenv("TEMPORARILY_DISABLE_PROTOBUF_VERSION_CHECK");
        if ((str2 == null || !str2.equals("true")) && runtimeVersion$RuntimeDomain != (runtimeVersion$RuntimeDomain2 = f10976)) {
            Locale locale = Locale.ROOT;
            final String str3 = "Detected mismatched Protobuf Gencode/Runtime domains when loading " + str + ": gencode " + runtimeVersion$RuntimeDomain + ", runtime " + runtimeVersion$RuntimeDomain2 + ". Cross-domain usage of Protobuf is not supported.";
            throw new RuntimeException(str3) { // from class: com.google.protobuf.RuntimeVersion$ProtobufRuntimeVersionException
            };
        }
    }
}
