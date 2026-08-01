package p260x;

import p000A.C0072l0;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: x.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3426i {

    /* JADX INFO: renamed from: a */
    public final int f10706a;

    /* JADX INFO: renamed from: b */
    public final int f10707b;

    /* JADX INFO: renamed from: c */
    public final C0072l0 f10708c;

    public C3426i(int i5, int i6, C0072l0 c0072l0) {
        this.f10706a = i5;
        this.f10707b = i6;
        this.f10708c = c0072l0;
        if (i5 < 0) {
            AbstractC3204b.m5475a("startIndex should be >= 0");
        }
        if (i6 > 0) {
            return;
        }
        AbstractC3204b.m5475a("size should be > 0");
    }
}
