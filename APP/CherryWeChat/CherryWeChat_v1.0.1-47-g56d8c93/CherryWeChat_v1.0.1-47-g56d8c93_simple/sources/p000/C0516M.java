package p000;

import java.io.File;

/* JADX INFO: renamed from: M */
/* JADX INFO: loaded from: classes.dex */
public final class C0516M extends C2273na {
    public C0516M(File r2, int r3) {
        switch(r3) {
            case 2: goto L5;
            default: goto L3;
        };
    L3:
        super(r2, null, "Cannot list files in a directory");
        return;
    L5:
        super(r2, null, "The source file doesn't exist.");
    }
}
