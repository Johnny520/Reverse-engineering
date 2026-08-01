package p042W;

import java.util.Calendar;
import java.util.GregorianCalendar;
import p037T.AbstractC0274y;
import p037T.C0258i;
import p037T.C0261l;
import p037T.EnumC0273x;
import p037T.InterfaceC0275z;
import p049a0.C0367a;

/* JADX INFO: renamed from: W.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0340l implements InterfaceC0275z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f760a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f761b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0340l(int i2, Object obj) {
        this.f760a = i2;
        this.f761b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.InterfaceC0275z
    /* JADX INFO: renamed from: a */
    public final AbstractC0274y mo493a(C0261l c0261l, C0367a c0367a) {
        switch (this.f760a) {
            case 0:
                if (c0367a.f860a == Number.class) {
                    return (C0332d) this.f761b;
                }
                return null;
            case 1:
                if (c0367a.f860a == Object.class) {
                    return new C0341m(c0261l, (EnumC0273x) this.f761b);
                }
                return null;
            default:
                Class cls = c0367a.f860a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C0258i) this.f761b;
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f760a) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C0258i) this.f761b) + "]";
            default:
                return super.toString();
        }
    }
}
