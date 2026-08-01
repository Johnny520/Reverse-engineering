package p227r;

/* JADX INFO: renamed from: r.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2982d {

    /* JADX INFO: renamed from: a */
    public static final C2980c f9446a = C2980c.f9435a;

    /* JADX INFO: renamed from: a */
    default float mo5197a(float f2, float f5, float f6) {
        f9446a.getClass();
        float f7 = f5 + f2;
        if ((f2 >= 0.0f && f7 <= f6) || (f2 < 0.0f && f7 > f6)) {
            return 0.0f;
        }
        float f8 = f7 - f6;
        return Math.abs(f2) < Math.abs(f8) ? f2 : f8;
    }
}
