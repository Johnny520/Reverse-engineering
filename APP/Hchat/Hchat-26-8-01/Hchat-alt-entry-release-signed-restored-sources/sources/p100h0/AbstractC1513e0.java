package p100h0;

import android.view.MotionEvent;
import p089g1.C1275d;
import p267s1.C3903k;
import p267s1.C3914t;

/* JADX INFO: renamed from: h0.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1513e0 {

    /* JADX INFO: renamed from: a */
    public static final C1275d f5060a = C1556w.f5192e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m4035a(C3903k c3903k) {
        MotionEvent motionEventM8098a;
        ?? r02 = c3903k.f12800a;
        int size = r02.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            if (((C3914t) r02.get(i9)).f12842i == 2) {
                i9++;
            } else {
                MotionEvent motionEventM8098a2 = c3903k.m8098a();
                if ((motionEventM8098a2 == null || !motionEventM8098a2.isFromSource(8194)) && ((motionEventM8098a = c3903k.m8098a()) == null || !motionEventM8098a.isFromSource(1048584))) {
                    return false;
                }
            }
        }
    }
}
