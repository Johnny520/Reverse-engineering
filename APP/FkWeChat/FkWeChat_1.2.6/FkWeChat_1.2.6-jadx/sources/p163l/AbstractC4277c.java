package p163l;

import p024b9.C1047m;

/* JADX INFO: renamed from: l.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4277c {

    /* JADX INFO: renamed from: a */
    public static final C4337o f12522a = AbstractC4362t.m17115a(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: b */
    public static final C4342p f12523b = AbstractC4362t.m17116b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: c */
    public static final C4347q f12524c = AbstractC4362t.m17117c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final C4352r f12525d = AbstractC4362t.m17118d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e */
    public static final C4337o f12526e = AbstractC4362t.m17115a(Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: f */
    public static final C4342p f12527f = AbstractC4362t.m17116b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: g */
    public static final C4347q f12528g = AbstractC4362t.m17117c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: h */
    public static final C4352r f12529h = AbstractC4362t.m17118d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: a */
    public static final C4271b m16815a(float f10, float f11) {
        return new C4271b(Float.valueOf(f10), AbstractC4336n3.m17025t(C1047m.f3206a), Float.valueOf(f11), null, 8, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C4271b m16816b(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.01f;
        }
        return m16815a(f10, f11);
    }
}
