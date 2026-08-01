package p030F1;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p178i3.C2318C;

/* JADX INFO: renamed from: F1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0450o implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0447l f1347a;

    public C0450o(C0447l c0447l) {
        this.f1347a = c0447l;
    }

    public final void onBackCancelled() {
        C0447l c0447l = this.f1347a;
        C0438c c0438c = c0447l.f1323a;
        if (c0438c == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!c0447l.f1324b) {
            c0438c.m702d(c0447l, null);
        }
        C0443h c0443h = c0438c.f1315b;
        c0443h.getClass();
        if (c0447l.equals(c0443h.f1332h) && -1 == c0443h.f1331g) {
            AbstractC0440e abstractC0440eM713c = c0443h.f1330f;
            if (abstractC0440eM713c == null) {
                abstractC0440eM713c = c0443h.m713c(-1);
            }
            c0443h.f1330f = null;
            c0443h.f1331g = 0;
            c0443h.f1332h = null;
            if (abstractC0440eM713c != null) {
                abstractC0440eM713c.mo703a();
            }
            C2318C c2318c = c0443h.f1325a;
            c2318c.getClass();
            c2318c.m4147g(null, C0444i.f1339b);
        }
        c0447l.f1324b = false;
    }

    public final void onBackInvoked() {
        this.f1347a.m709a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC1665j.m2985e(backEvent, "backEvent");
        C0437b c0437bM1381e = AbstractC0797o.m1381e(backEvent);
        C0447l c0447l = this.f1347a;
        C0438c c0438c = c0447l.f1323a;
        if (c0438c == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (c0447l.f1324b) {
            C0443h c0443h = c0438c.f1315b;
            c0443h.getClass();
            if (c0447l.equals(c0443h.f1332h) && -1 == c0443h.f1331g) {
                AbstractC0440e abstractC0440eM713c = c0443h.f1330f;
                if (abstractC0440eM713c == null) {
                    abstractC0440eM713c = c0443h.m713c(-1);
                }
                if (abstractC0440eM713c != null) {
                    abstractC0440eM713c.mo705c(c0437bM1381e);
                }
                C2318C c2318c = c0443h.f1325a;
                C0445j c0445j = new C0445j(c0437bM1381e);
                c2318c.getClass();
                c2318c.m4147g(null, c0445j);
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC1665j.m2985e(backEvent, "backEvent");
        C0437b c0437bM1381e = AbstractC0797o.m1381e(backEvent);
        C0447l c0447l = this.f1347a;
        C0438c c0438c = c0447l.f1323a;
        if (c0438c == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (c0447l.f1324b) {
            return;
        }
        c0438c.m702d(c0447l, c0437bM1381e);
        c0447l.f1324b = true;
    }
}
