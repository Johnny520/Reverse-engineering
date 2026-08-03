package p267s1;

import android.view.MotionEvent;
import p057e1.C0807b;
import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p356y0.InterfaceC5853o;

/* JADX INFO: renamed from: s1.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3913s {

    /* JADX INFO: renamed from: a */
    public static final C3883a f12830a = new C3883a(1000);

    /* JADX INFO: renamed from: b */
    public static final C3883a f12831b;

    /* JADX INFO: renamed from: c */
    public static final C3883a f12832c;

    /* JADX INFO: renamed from: d */
    public static final StackTraceElement[] f12833d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C3883a(1007);
        f12831b = new C3883a(1008);
        f12832c = new C3883a(1002);
        f12833d = new StackTraceElement[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m8108a(C3914t c3914t) {
        return (c3914t.m8119b() || c3914t.f12841h || !c3914t.f12837d) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m8109b(C3914t c3914t) {
        return !c3914t.f12841h && c3914t.f12837d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m8110c(C3914t c3914t) {
        return (c3914t.m8119b() || !c3914t.f12841h || c3914t.f12837d) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m8111d(C3914t c3914t) {
        return c3914t.f12841h && !c3914t.f12837d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m8112e(long j3, long j4) {
        return j3 == j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m8113f(C3914t c3914t, long j3, long j4) {
        int i9 = c3914t.f12842i == 1 ? 1 : 0;
        long j5 = c3914t.f12836c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float f3 = i9;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j4 >> 32)) * f3;
        float f10 = ((int) (j3 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j4 & 4294967295L)) * f3;
        return (fIntBitsToFloat > f10) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j3 & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static InterfaceC5853o m8114g(InterfaceC5853o interfaceC5853o, C3883a c3883a) {
        return interfaceC5853o.mo10549d(new C3908n(c3883a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final long m8115h(C3914t c3914t, boolean z9) {
        long jM2041d = C0807b.m2041d(c3914t.f12836c, c3914t.f12840g);
        if (z9 || !c3914t.m8119b()) {
            return jM2041d;
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final void m8116i(C3903k c3903k, long j3, InterfaceC1231l interfaceC1231l, boolean z9) {
        MotionEvent motionEventM8098a = c3903k.m8098a();
        if (motionEventM8098a == null) {
            C2104o.m5294t("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventM8098a.getAction();
        if (z9) {
            motionEventM8098a.setAction(3);
        }
        int i9 = (int) (j3 >> 32);
        int i10 = (int) (j3 & 4294967295L);
        motionEventM8098a.offsetLocation(-Float.intBitsToFloat(i9), -Float.intBitsToFloat(i10));
        interfaceC1231l.invoke(motionEventM8098a);
        motionEventM8098a.offsetLocation(Float.intBitsToFloat(i9), Float.intBitsToFloat(i10));
        motionEventM8098a.setAction(action);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m8117j(long j3) {
        return "PointerId(value=" + j3 + ')';
    }
}
