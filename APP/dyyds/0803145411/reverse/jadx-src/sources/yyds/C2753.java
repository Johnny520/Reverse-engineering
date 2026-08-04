package yyds;

import java.util.Arrays;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲈᲁᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2753 extends AbstractC0145 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2753 f13472 = new C2753();

    @Override // yyds.AbstractC0145
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo420() {
        String strM4341 = AbstractC2328.m4341(-869550061683566L);
        String strM43412 = AbstractC2328.m4341(-869747630179182L);
        try {
            Class clsM2792 = AbstractC1371.m2792(strM4341, null, 3);
            if (clsM2792 == null) {
                AbstractC0145.m667(AbstractC2328.m4341(-869769105015662L).concat(strM4341));
                C1329 c1329 = C1329.f6114;
                if (AbstractC0473.m1313(strM43412)) {
                    return;
                }
                C1329.f6115.add(new Pair(strM43412, strM43412));
                return;
            }
            int i = AbstractC2293.f11258;
            C2014 c2014M1326 = AbstractC0476.m1326(clsM2792);
            ((C0903) c2014M1326.f10074).f4118 = 2;
            C2753 c2753 = f13472;
            C1189 c1189M3892 = c2014M1326.m3892();
            c1189M3892.m2391(EnumC2298.f11300);
            c1189M3892.f12003 = AbstractC2328.m4341(-869846414426990L);
            c1189M3892.m4189(Arrays.copyOf(new Object[]{AbstractC2328.m4341(-869889364099950L)}, 1));
            c1189M3892.f5455 = AbstractC2328.m4341(-870112702399342L);
            C0536 c0536 = (C0536) AbstractC1595.m3280(c1189M3892.mo736());
            c2753.getClass();
            AbstractC2328.m4341(-989955174859630L);
            if (c0536 == null) {
                C2336.f11496.m4359(AbstractC2328.m4341(-989976649696110L));
            } else {
                C0213 c0213 = new C0213();
                AbstractC2328.m4341(-870752652526446L);
                c0213.m870(new C0583(2));
                c2753.m682(c0536.f2572, null, new C0052(26, c0213));
            }
            C1329 c13292 = C1329.f6114;
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC0897.m1988(new StringBuilder(AbstractC2328.m4341(-870263026254702L)), strM4341, -870301680960366L), e);
            AbstractC2104.m4010(strM4341, strM43412, C1329.f6115);
        }
    }
}
