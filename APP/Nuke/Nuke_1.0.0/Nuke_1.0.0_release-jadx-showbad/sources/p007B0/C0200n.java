package p007B0;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import p000A.C0038T0;
import p154e2.C2029h;

/* JADX INFO: renamed from: B0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0200n {

    /* JADX INFO: renamed from: a */
    public final Object f696a;

    /* JADX INFO: renamed from: b */
    public final C2029h f697b;

    /* JADX INFO: renamed from: c */
    public final int f698c;

    /* JADX INFO: renamed from: d */
    public final int f699d;

    /* JADX INFO: renamed from: e */
    public final int f700e;

    /* JADX INFO: renamed from: f */
    public int f701f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0200n(List list, C2029h c2029h) {
        MotionEvent motionEventM310a;
        this.f696a = list;
        this.f697b = c2029h;
        int i5 = 0;
        this.f698c = (Build.VERSION.SDK_INT < 29 || (motionEventM310a = m310a()) == null) ? 0 : motionEventM310a.getClassification();
        MotionEvent motionEventM310a2 = m310a();
        this.f699d = motionEventM310a2 != null ? motionEventM310a2.getButtonState() : 0;
        MotionEvent motionEventM310a3 = m310a();
        this.f700e = motionEventM310a3 != null ? motionEventM310a3.getMetaState() : 0;
        MotionEvent motionEventM310a4 = m310a();
        if (motionEventM310a4 != null) {
            int actionMasked = motionEventM310a4.getActionMasked();
            if (actionMasked == 0) {
                i5 = 1;
            } else if (actionMasked == 1) {
                i5 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 7:
                        i5 = 3;
                        break;
                    case 8:
                        i5 = 6;
                        break;
                    case 9:
                        i5 = 4;
                        break;
                    case 10:
                        i5 = 5;
                        break;
                }
            }
        } else {
            int size = list.size();
            while (i5 < size) {
                C0209w c0209w = (C0209w) list.get(i5);
                if (AbstractC0208v.m314d(c0209w)) {
                    i5 = 2;
                } else if (AbstractC0208v.m312b(c0209w)) {
                    i5 = 1;
                } else {
                    i5++;
                }
            }
            i5 = 3;
        }
        this.f701f = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final MotionEvent m310a() {
        C2029h c2029h = this.f697b;
        if (c2029h != null) {
            return (MotionEvent) ((C0038T0) c2029h.f6764g).f170f;
        }
        return null;
    }
}
