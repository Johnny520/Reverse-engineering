package yyds;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛳᛳᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0558 implements InterfaceC1240 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2653;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f2654;

    public /* synthetic */ C0558(int i, Object obj) {
        this.f2653 = i;
        this.f2654 = obj;
    }

    @Override // yyds.InterfaceC1240
    public final Iterator iterator() {
        int i = this.f2653;
        Object obj = this.f2654;
        switch (i) {
            case 0:
                return new C0437(1, (Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new C0862(this);
            case 3:
                C1728 c1728 = new C1728();
                c1728.f8730 = ((AbstractC0332) ((InterfaceC0477) obj)).mo630(c1728, c1728);
                return c1728;
            case 4:
                return (Iterator) obj;
            case 5:
                ArrayList arrayListM3162 = AbstractC1529.m3162((C2722) obj);
                AbstractC0405.m1162(arrayListM3162, C2055.f10195);
                return arrayListM3162.iterator();
            default:
                return new C0648((CharSequence) obj);
        }
    }
}
