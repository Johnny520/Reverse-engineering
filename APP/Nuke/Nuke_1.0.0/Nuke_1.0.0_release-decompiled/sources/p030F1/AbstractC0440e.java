package p030F1;

import com.bumptech.glide.AbstractC1926h;

/* JADX INFO: renamed from: F1.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0440e {

    /* JADX INFO: renamed from: a */
    public AbstractC1926h f1318a;

    /* JADX INFO: renamed from: b */
    public boolean f1319b;

    /* JADX INFO: renamed from: c */
    public C0438c f1320c;

    /* JADX INFO: renamed from: a */
    public abstract void mo703a();

    /* JADX INFO: renamed from: b */
    public abstract void mo704b();

    /* JADX INFO: renamed from: c */
    public abstract void mo705c(C0437b c0437b);

    /* JADX INFO: renamed from: d */
    public abstract void mo706d(C0437b c0437b);

    /* JADX INFO: renamed from: e */
    public final void m707e() {
        C0438c c0438c = this.f1320c;
        if (c0438c == null || !c0438c.f1316c.remove(this)) {
            return;
        }
        C0443h c0443h = c0438c.f1315b;
        c0443h.getClass();
        if (equals(c0443h.f1330f)) {
            if (c0443h.f1331g == -1) {
                mo703a();
            }
            c0443h.f1330f = null;
            c0443h.f1331g = 0;
            c0443h.f1332h = null;
        }
        c0443h.f1328d.remove(this);
        c0443h.f1329e.remove(this);
        this.f1320c = null;
        c0443h.m712b();
    }

    /* JADX INFO: renamed from: f */
    public final void m708f(boolean z5) {
        C0443h c0443h;
        if (this.f1319b == z5) {
            return;
        }
        this.f1319b = z5;
        C0438c c0438c = this.f1320c;
        if (c0438c == null || (c0443h = c0438c.f1315b) == null) {
            return;
        }
        c0443h.m712b();
    }
}
