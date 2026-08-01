package p073f2;

import android.view.MotionEvent;
import p010a9.InterfaceC0184l;
import p376zd.C9987e;

/* JADX INFO: renamed from: f2.p0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2260p0 {
    /* JADX INFO: renamed from: a */
    public static final void m8210a(long j10, InterfaceC0184l interfaceC0184l) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        interfaceC0184l.mo27m(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static final void m8211b(C2261q c2261q, long j10, InterfaceC0184l interfaceC0184l) {
        m8213d(c2261q, j10, interfaceC0184l, true);
    }

    /* JADX INFO: renamed from: c */
    public static final void m8212c(C2261q c2261q, long j10, InterfaceC0184l interfaceC0184l) {
        m8213d(c2261q, j10, interfaceC0184l, false);
    }

    /* JADX INFO: renamed from: d */
    public static final void m8213d(C2261q c2261q, long j10, InterfaceC0184l interfaceC0184l, boolean z10) {
        MotionEvent motionEventM8219f = c2261q.m8219f();
        if (motionEventM8219f == null) {
            C9987e.m38645a("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventM8219f.getAction();
        if (z10) {
            motionEventM8219f.setAction(3);
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        motionEventM8219f.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        interfaceC0184l.mo27m(motionEventM8219f);
        motionEventM8219f.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEventM8219f.setAction(action);
    }
}
