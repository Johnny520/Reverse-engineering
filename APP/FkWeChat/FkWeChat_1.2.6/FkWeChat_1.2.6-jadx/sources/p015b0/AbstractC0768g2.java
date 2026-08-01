package p015b0;

import android.view.KeyEvent;
import p042d2.AbstractC1856a;
import p042d2.AbstractC1859d;

/* JADX INFO: renamed from: b0.g2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0768g2 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0754e2 f2296a = new a();

    /* JADX INFO: renamed from: b0.g2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC0754e2 {
        @Override // p015b0.InterfaceC0754e2
        /* JADX INFO: renamed from: a */
        public EnumC0740c2 mo2879a(KeyEvent keyEvent) {
            EnumC0740c2 enumC0740c2 = null;
            if (AbstractC1859d.m6610f(keyEvent) && AbstractC1859d.m6608d(keyEvent)) {
                long jM6605a = AbstractC1859d.m6605a(keyEvent);
                C0894y2 c0894y2 = C0894y2.f2808a;
                if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3278j())) {
                    enumC0740c2 = EnumC0740c2.f2211g0;
                } else if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3279k())) {
                    enumC0740c2 = EnumC0740c2.f2212h0;
                } else if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3280l())) {
                    enumC0740c2 = EnumC0740c2.f2203Y;
                } else if (AbstractC1856a.m6573s(jM6605a, c0894y2.m3277i())) {
                    enumC0740c2 = EnumC0740c2.f2204Z;
                }
            } else if (AbstractC1859d.m6608d(keyEvent)) {
                long jM6605a2 = AbstractC1859d.m6605a(keyEvent);
                C0894y2 c0894y22 = C0894y2.f2808a;
                if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3278j())) {
                    enumC0740c2 = EnumC0740c2.f2229z;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3279k())) {
                    enumC0740c2 = EnumC0740c2.f2179A;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3280l())) {
                    enumC0740c2 = EnumC0740c2.f2185G;
                } else if (AbstractC1856a.m6573s(jM6605a2, c0894y22.m3277i())) {
                    enumC0740c2 = EnumC0740c2.f2186H;
                }
            }
            return enumC0740c2 == null ? AbstractC0761f2.m2887b().mo2879a(keyEvent) : enumC0740c2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0754e2 m2889a() {
        return f2296a;
    }
}
