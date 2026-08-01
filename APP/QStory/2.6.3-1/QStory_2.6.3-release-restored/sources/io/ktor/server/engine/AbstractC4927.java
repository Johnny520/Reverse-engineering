package io.ktor.server.engine;

import java.io.File;
import java.io.FileNotFoundException;
import p091.C7790;
import p108.AbstractC8028;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f12784;

    static {
        C7790 c7790 = AbstractC8028.f19556;
        File file = new File(".");
        c7790.getClass();
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        File canonicalFile = file.getCanonicalFile();
        canonicalFile.getClass();
        String string = canonicalFile.toString();
        string.getClass();
        f12784 = string;
    }
}
