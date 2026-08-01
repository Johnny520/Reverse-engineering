package io.ktor.server.engine;

import java.io.File;
import java.io.FileNotFoundException;
import p075.C6960;
import p092.AbstractC7198;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4094 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f12435;

    static {
        C6960 c6960 = AbstractC7198.f19216;
        File file = new File(".");
        c6960.getClass();
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        File canonicalFile = file.getCanonicalFile();
        canonicalFile.getClass();
        String string = canonicalFile.toString();
        string.getClass();
        f12435 = string;
    }
}
