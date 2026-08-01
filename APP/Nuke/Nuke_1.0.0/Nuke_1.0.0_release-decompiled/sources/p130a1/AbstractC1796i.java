package p130a1;

import android.text.TextPaint;
import java.util.ArrayList;
import p092S0.C1260M;
import p092S0.C1272j;
import p092S0.C1277o;
import p092S0.C1279q;
import p092S0.C1284v;
import p092S0.C1285w;
import p147d1.C1962l;
import p211o0.AbstractC2758q;
import p211o0.C2737L;
import p211o0.InterfaceC2760s;
import p222q0.AbstractC2902c;

/* JADX INFO: renamed from: a1.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1796i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f6131a = 0;

    /* JADX INFO: renamed from: a */
    public static final boolean m3267a(C1260M c1260m) {
        C1284v c1284v;
        C1285w c1285w = c1260m.f4542c;
        C1272j c1272j = (c1285w == null || (c1284v = c1285w.f4618a) == null) ? null : new C1272j(c1284v.f4617b);
        boolean z5 = false;
        if (c1272j != null && c1272j.f4575a == 1) {
            z5 = true;
        }
        return !z5;
    }

    /* JADX INFO: renamed from: b */
    public static final void m3268b(C1277o c1277o, InterfaceC2760s interfaceC2760s, AbstractC2758q abstractC2758q, float f2, C2737L c2737l, C1962l c1962l, AbstractC2902c abstractC2902c) {
        ArrayList arrayList = c1277o.f4592h;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            C1279q c1279q = (C1279q) arrayList.get(i5);
            c1279q.f4595a.m2352g(interfaceC2760s, abstractC2758q, f2, c2737l, c1962l, abstractC2902c);
            interfaceC2760s.mo4846g(0.0f, c1279q.f4595a.m2347b());
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m3269c(TextPaint textPaint, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f2 * 255));
    }
}
