package p237q2;

import android.text.TextPaint;
import java.util.ArrayList;
import p071f1.AbstractC1027s;
import p071f1.C1024q0;
import p071f1.InterfaceC1031u;
import p101h1.AbstractC1566c;
import p119i2.C1932j;
import p119i2.C1941n0;
import p119i2.C1942o;
import p119i2.C1947r;
import p119i2.C1952w;
import p119i2.C1953x;
import p280t2.C4096l;

/* JADX INFO: renamed from: q2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3436j {

    /* JADX INFO: renamed from: a */
    public static final C3437k f11127a = new C3437k(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m7209a(C1941n0 c1941n0) {
        C1952w c1952w;
        C1953x c1953x = c1941n0.f6582c;
        C1932j c1932j = (c1953x == null || (c1952w = c1953x.f6619a) == null) ? null : new C1932j(c1952w.f6618b);
        boolean z9 = false;
        if (c1932j != null && c1932j.f6548a == 1) {
            z9 = true;
        }
        return !z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m7210b(C1942o c1942o, InterfaceC1031u interfaceC1031u, AbstractC1027s abstractC1027s, float f3, C1024q0 c1024q0, C4096l c4096l, AbstractC1566c abstractC1566c) {
        ArrayList arrayList = c1942o.f6590h;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1947r c1947r = (C1947r) arrayList.get(i9);
            c1947r.f6596a.m4772g(interfaceC1031u, abstractC1027s, f3, c1024q0, c4096l, abstractC1566c);
            interfaceC1031u.mo2494m(0.0f, c1947r.f6596a.m4767b());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m7211c(TextPaint textPaint, float f3) {
        if (Float.isNaN(f3)) {
            return;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f3 * 255));
    }
}
