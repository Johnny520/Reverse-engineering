package p000;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dn2 {

    /* JADX INFO: renamed from: a */
    public static final c80 f2126a = gd3.f3422I;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1062a(h12 h12Var) {
        MotionEvent motionEventM2043a;
        List list = h12Var.f3776a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((o12) list.get(i)).f7428i == 2) {
                i++;
            } else {
                MotionEvent motionEventM2043a2 = h12Var.m2043a();
                if ((motionEventM2043a2 == null || !motionEventM2043a2.isFromSource(8194)) && ((motionEventM2043a = h12Var.m2043a()) == null || !motionEventM2043a.isFromSource(1048584))) {
                    return false;
                }
            }
        }
    }
}
