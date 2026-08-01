package p073f2;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: renamed from: f2.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2261q {

    /* JADX INFO: renamed from: a */
    public final List f6212a;

    /* JADX INFO: renamed from: b */
    public final C2241g f6213b;

    /* JADX INFO: renamed from: c */
    public final int f6214c;

    /* JADX INFO: renamed from: d */
    public final int f6215d;

    /* JADX INFO: renamed from: e */
    public final int f6216e;

    /* JADX INFO: renamed from: f */
    public int f6217f;

    public C2261q(List list, C2241g c2241g) {
        MotionEvent motionEventM8219f;
        this.f6212a = list;
        this.f6213b = c2241g;
        this.f6214c = (Build.VERSION.SDK_INT < 29 || (motionEventM8219f = m8219f()) == null) ? 0 : motionEventM8219f.getClassification();
        MotionEvent motionEventM8219f2 = m8219f();
        this.f6215d = AbstractC2257o.m8206a(motionEventM8219f2 != null ? motionEventM8219f2.getButtonState() : 0);
        MotionEvent motionEventM8219f3 = m8219f();
        this.f6216e = C2262q0.m8223b(motionEventM8219f3 != null ? motionEventM8219f3.getMetaState() : 0);
        this.f6217f = m8214a();
    }

    /* JADX INFO: renamed from: a */
    public final int m8214a() {
        MotionEvent motionEventM8219f = m8219f();
        if (motionEventM8219f == null) {
            List list = this.f6212a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C2236d0 c2236d0 = (C2236d0) list.get(i10);
                if (AbstractC2263r.m8231d(c2236d0)) {
                    return AbstractC2269u.f6230a.m8269e();
                }
                if (AbstractC2263r.m8229b(c2236d0)) {
                    return AbstractC2269u.f6230a.m8268d();
                }
            }
            return AbstractC2269u.f6230a.m8267c();
        }
        int actionMasked = motionEventM8219f.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return AbstractC2269u.f6230a.m8270f();
                        case 9:
                            return AbstractC2269u.f6230a.m8265a();
                        case 10:
                            return AbstractC2269u.f6230a.m8266b();
                        default:
                            return AbstractC2269u.f6230a.m8271g();
                    }
                }
                return AbstractC2269u.f6230a.m8267c();
            }
            return AbstractC2269u.f6230a.m8269e();
        }
        return AbstractC2269u.f6230a.m8268d();
    }

    /* JADX INFO: renamed from: b */
    public final int m8215b() {
        return this.f6215d;
    }

    /* JADX INFO: renamed from: c */
    public final List m8216c() {
        return this.f6212a;
    }

    /* JADX INFO: renamed from: d */
    public final int m8217d() {
        return this.f6214c;
    }

    /* JADX INFO: renamed from: e */
    public final C2241g m8218e() {
        return this.f6213b;
    }

    /* JADX INFO: renamed from: f */
    public final MotionEvent m8219f() {
        C2241g c2241g = this.f6213b;
        if (c2241g != null) {
            return c2241g.m8125c();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final int m8220g() {
        return this.f6217f;
    }

    /* JADX INFO: renamed from: h */
    public final void m8221h(int i10) {
        this.f6217f = i10;
    }

    public C2261q(List list) {
        this(list, null);
    }
}
