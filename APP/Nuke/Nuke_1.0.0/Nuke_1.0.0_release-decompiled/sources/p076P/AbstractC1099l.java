package p076P;

import p091S.AbstractC1229a;
import p091S.AbstractC1230b;
import p244u.C3251U;
import p250v.AbstractC3349a;

/* JADX INFO: renamed from: P.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1099l {

    /* JADX INFO: renamed from: a */
    public static final C3251U f3542a;

    /* JADX INFO: renamed from: b */
    public static final float f3543b;

    /* JADX INFO: renamed from: c */
    public static final float f3544c;

    static {
        float f2 = AbstractC1229a.f4100a;
        float f5 = AbstractC1229a.f4101b;
        float f6 = 16;
        float f7 = AbstractC1230b.f4102a;
        float f8 = 8;
        new C3251U(f2, f8, f5, f8);
        if (!((f5 >= 0.0f) & (f6 >= 0.0f) & (f8 >= 0.0f) & (f8 >= 0.0f))) {
            AbstractC3349a.m5598a("Padding must be non-negative");
        }
        float f9 = 12;
        f3542a = new C3251U(f9, f8, f9, f8);
        if (!((f9 >= 0.0f) & (f8 >= 0.0f) & (f6 >= 0.0f) & (f8 >= 0.0f))) {
            AbstractC3349a.m5598a("Padding must be non-negative");
        }
        f3543b = 58;
        f3544c = AbstractC1230b.f4102a;
    }
}
