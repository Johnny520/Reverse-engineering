package Yue;

import java.io.IOException;
import java.io.PrintWriter;
import net.bytebuddy.description.type.TypeDescription;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4274 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final C4274 f8798 = new C4274(0, "NONE");

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final C4274 f8799 = new C4274(1, "OPTIONAL");

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final C4274 f8800 = new C4274(2, "ZEROMANY");

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C4274 f8801 = new C4274(3, "ONEMANY");

    /* JADX INFO: renamed from: ۥ */
    public int f779;

    /* JADX INFO: renamed from: ۥ۟ */
    public String f780;

    public C4274(int i, String str) {
        this.f779 = i;
        this.f780 = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C4274) && ((C4274) obj).f779 == this.f779;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        if (this == f8798) {
            return;
        }
        if (this == f8799) {
            printWriter.print(TypeDescription.Generic.OfWildcardType.SYMBOL);
        } else if (this == f8800) {
            printWriter.print(InterfaceC5949.f14892);
        } else if (this == f8801) {
            printWriter.print(InterfaceC5949.f14893);
        }
    }
}
