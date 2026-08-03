package p000;

import java.io.File;

/* JADX INFO: renamed from: M */
/* JADX INFO: loaded from: classes.dex */
public final class C0516M extends C2273na {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0516M(File file, int i) {
        super(file, (File) null, "Cannot list files in a directory");
        switch (i) {
            case 2:
                super(file, (File) null, "The source file doesn't exist.");
                break;
            default:
                break;
        }
    }
}
