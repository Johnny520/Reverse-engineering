package p037U;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: U.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0383s {

    /* JADX INFO: renamed from: a */
    public boolean f858a;

    /* JADX INFO: renamed from: b */
    public int f859b;

    /* JADX INFO: renamed from: c */
    public int f860c;

    /* JADX INFO: renamed from: d */
    public int f861d;

    /* JADX INFO: renamed from: e */
    public int f862e;

    /* JADX INFO: renamed from: f */
    public int f863f;

    /* JADX INFO: renamed from: g */
    public int f864g;

    /* JADX INFO: renamed from: h */
    public int f865h;

    /* JADX INFO: renamed from: i */
    public int f866i;

    /* JADX INFO: renamed from: j */
    public List f867j;

    /* JADX INFO: renamed from: k */
    public boolean f868k;

    /* JADX INFO: renamed from: a */
    public final void m961a(View view) {
        if (this.f867j.size() <= 0) {
            this.f861d = -1;
        } else {
            ((AbstractC0355O) this.f867j.get(0)).getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m962b(C0349I c0349i) {
        List list = this.f867j;
        if (list != null) {
            if (list.size() <= 0) {
                return null;
            }
            ((AbstractC0355O) this.f867j.get(0)).getClass();
            throw null;
        }
        AbstractC0355O abstractC0355OM829i = c0349i.m829i(this.f861d, Long.MAX_VALUE);
        this.f861d += this.f862e;
        abstractC0355OM829i.getClass();
        return null;
    }
}
