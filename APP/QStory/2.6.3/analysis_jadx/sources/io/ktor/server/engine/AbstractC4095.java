package io.ktor.server.engine;

import java.io.File;
import java.io.FileNotFoundException;
import p075.C6961;
import p092.AbstractC7199;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f12439;

    static {
        C6961 c6961 = AbstractC7199.f19211;
        File file = new File(".");
        c6961.getClass();
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        File canonicalFile = file.getCanonicalFile();
        canonicalFile.getClass();
        String string = canonicalFile.toString();
        string.getClass();
        f12439 = string;
    }
}
