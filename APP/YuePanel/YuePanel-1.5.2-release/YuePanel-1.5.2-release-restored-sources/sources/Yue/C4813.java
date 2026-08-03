package Yue;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4813 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final File f1131;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public final List<File> f1132;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4813(@InterfaceC6399 File file, @InterfaceC6399 List<? extends File> list) {
        C5499.m17103(file, "root");
        C5499.m17103(list, "segments");
        this.f1131 = file;
        this.f1132 = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥ۠ۡۨ۠ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C4813 m14599(C4813 c4813, File file, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            file = c4813.f1131;
        }
        if ((i & 2) != 0) {
            list = c4813.f1132;
        }
        return c4813.m14600(file, list);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4813)) {
            return false;
        }
        C4813 c4813 = (C4813) obj;
        return C5499.m17094(this.f1131, c4813.f1131) && C5499.m17094(this.f1132, c4813.f1132);
    }

    public int hashCode() {
        return (this.f1131.hashCode() * 31) + this.f1132.hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return "FilePathComponents(root=" + this.f1131 + ", segments=" + this.f1132 + ')';
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final File m1721() {
        return this.f1131;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public final List<File> m1722() {
        return this.f1132;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C4813 m14600(@InterfaceC6399 File file, @InterfaceC6399 List<? extends File> list) {
        C5499.m17103(file, "root");
        C5499.m17103(list, "segments");
        return new C4813(file, list);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final File m14601() {
        return this.f1131;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final String m14602() {
        String path = this.f1131.getPath();
        C5499.m17102(path, "root.path");
        return path;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final List<File> m14603() {
        return this.f1132;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m14604() {
        return this.f1132.size();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m14605() {
        String path = this.f1131.getPath();
        C5499.m17102(path, "root.path");
        return path.length() > 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final File m14606(int i, int i2) {
        if (i < 0 || i > i2 || i2 > m14604()) {
            throw new IllegalArgumentException();
        }
        List<File> listSubList = this.f1132.subList(i, i2);
        String str = File.separator;
        C5499.m17102(str, "separator");
        return new File(C3888.m10923(listSubList, str, null, null, 0, null, null, 62, null));
    }
}
