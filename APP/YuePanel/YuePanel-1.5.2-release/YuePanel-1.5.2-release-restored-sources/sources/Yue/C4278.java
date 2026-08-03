package Yue;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4278 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final C4278 f8802 = new C4278(0, "FIXED");

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final C4278 f8803 = new C4278(1, "REQUIRED");

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final C4278 f8804 = new C4278(2, "IMPLIED");

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C4278 f8805 = new C4278(3, "VALUE");

    /* JADX INFO: renamed from: ۥ */
    public int f783;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f784;

    public C4278(int i, String str) {
        this.f783 = i;
        this.f784 = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C4278) && ((C4278) obj).f783 == this.f783;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        if (this == f8802) {
            printWriter.print(" #FIXED");
        } else if (this == f8803) {
            printWriter.print(" #REQUIRED");
        } else if (this == f8804) {
            printWriter.print(" #IMPLIED");
        }
    }
}
