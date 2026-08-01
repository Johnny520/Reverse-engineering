package p000;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ir0 {

    /* JADX INFO: renamed from: a */
    public final List f2610a;

    /* JADX INFO: renamed from: b */
    public final C0111d f2611b;

    /* JADX INFO: renamed from: c */
    public final int f2612c;

    /* JADX INFO: renamed from: d */
    public int f2613d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ir0(List list, C0111d c0111d) {
        this.f2610a = list;
        this.f2611b = c0111d;
        MotionEvent motionEventM1596a = m1596a();
        int i = 0;
        this.f2612c = motionEventM1596a != null ? motionEventM1596a.getClassification() : 0;
        MotionEvent motionEventM1596a2 = m1596a();
        if (motionEventM1596a2 != null) {
            motionEventM1596a2.getButtonState();
        }
        MotionEvent motionEventM1596a3 = m1596a();
        if (motionEventM1596a3 != null) {
            motionEventM1596a3.getMetaState();
        }
        MotionEvent motionEventM1596a4 = m1596a();
        if (motionEventM1596a4 != null) {
            int actionMasked = motionEventM1596a4.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 7:
                        i = 3;
                        break;
                    case 8:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            }
        } else {
            int size = list.size();
            while (i < size) {
                nr0 nr0Var = (nr0) list.get(i);
                if (w60.m4904k(nr0Var)) {
                    i = 2;
                } else if (w60.m4902i(nr0Var)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.f2613d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final MotionEvent m1596a() {
        C0111d c0111d = this.f2611b;
        if (c0111d != null) {
            return (MotionEvent) ((C0111d) c0111d.f920f).f920f;
        }
        return null;
    }
}
