package yyds;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: renamed from: yyds.ᛴᛶᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0876 implements InterfaceC0652 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3995;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2720 f3996;

    public /* synthetic */ C0876(AbstractC2720 abstractC2720, int i) {
        this.f3995 = i;
        this.f3996 = abstractC2720;
    }

    public String toString() {
        switch (this.f3995) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((C2392) this.f3996) + "]";
            default:
                return super.toString();
        }
    }

    @Override // yyds.InterfaceC0652
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final AbstractC2720 mo976(C0114 c0114, C2805 c2805) {
        int i = this.f3995;
        AbstractC2720 abstractC2720 = this.f3996;
        switch (i) {
            case 0:
                if (c2805.f13682 == Number.class) {
                    return (C0321) abstractC2720;
                }
                return null;
            default:
                Class cls = c2805.f13682;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (C2392) abstractC2720;
                }
                return null;
        }
    }
}
