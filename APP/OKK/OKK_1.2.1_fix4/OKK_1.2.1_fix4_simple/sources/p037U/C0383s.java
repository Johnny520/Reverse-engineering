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
    public final void m961a(View r2) {
        if (this.f867j.size() > 0) goto L6;
        this.f861d = -1;
        return;
    L6:
        ((AbstractC0355O) this.f867j.get(0)).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final View m962b(C0349I r4) {
        List r1 = this.f867j;
        if (r1 != null) goto L5;
        AbstractC0355O r42 = r4.m829i(this.f861d, Long.MAX_VALUE);
        this.f861d += this.f862e;
        r42.getClass();
        return null;
    L5:
        if (r1.size() > 0) goto L7;
        return null;
    L7:
        ((AbstractC0355O) this.f867j.get(0)).getClass();
        throw null;
    }
}
