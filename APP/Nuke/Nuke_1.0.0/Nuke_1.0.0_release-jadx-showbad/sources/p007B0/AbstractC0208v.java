package p007B0;

import android.view.MotionEvent;
import p112W2.InterfaceC1601c;
import p204n0.C2683b;

/* JADX INFO: renamed from: B0.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0208v {

    /* JADX INFO: renamed from: a */
    public static final C0187a f708a = new C0187a(1000);

    /* JADX INFO: renamed from: b */
    public static final C0187a f709b;

    /* JADX INFO: renamed from: c */
    public static final StackTraceElement[] f710c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C0187a(1007);
        f709b = new C0187a(1008);
        new C0187a(1002);
        f710c = new StackTraceElement[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m311a(C0209w c0209w) {
        return (c0209w.m321b() || c0209w.f718h || !c0209w.f714d) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m312b(C0209w c0209w) {
        return !c0209w.f718h && c0209w.f714d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m313c(C0209w c0209w) {
        return (c0209w.m321b() || !c0209w.f718h || c0209w.f714d) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m314d(C0209w c0209w) {
        return c0209w.f718h && !c0209w.f714d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m315e(long j5, long j6) {
        return j5 == j6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m316f(C0209w c0209w, long j5, long j6) {
        int i5 = c0209w.f719i == 1 ? 1 : 0;
        long j7 = c0209w.f713c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        float f2 = i5;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32)) * f2;
        float f5 = ((int) (j5 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L)) * f2;
        return (fIntBitsToFloat > f5) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j5 & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final long m317g(C0209w c0209w, boolean z5) {
        long jM4646d = C2683b.m4646d(c0209w.f713c, c0209w.f717g);
        if (z5 || !c0209w.m321b()) {
            return jM4646d;
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m318h(C0200n c0200n, long j5, InterfaceC1601c interfaceC1601c, boolean z5) {
        MotionEvent motionEventM310a = c0200n.m310a();
        if (motionEventM310a == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventM310a.getAction();
        if (z5) {
            motionEventM310a.setAction(3);
        }
        int i5 = (int) (j5 >> 32);
        int i6 = (int) (j5 & 4294967295L);
        motionEventM310a.offsetLocation(-Float.intBitsToFloat(i5), -Float.intBitsToFloat(i6));
        interfaceC1601c.mo1h(motionEventM310a);
        motionEventM310a.offsetLocation(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6));
        motionEventM310a.setAction(action);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m319i(long j5) {
        return "PointerId(value=" + j5 + ')';
    }
}
