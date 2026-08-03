package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: r3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2440r3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8555a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0176E3 f8556b;

    public /* synthetic */ RunnableC2440r3(LayoutInflaterFactory2C0176E3 r1, int r2) {
        this.f8555a = r2;
        this.f8556b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f8555a) {
            case 0: goto L16;
            default: goto L4;
        };
    L4:
        LayoutInflaterFactory2C0176E3 r0 = this.f8556b;
        r0.f506w.showAtLocation(r0.f505v, 55, 0, 0);
        C0273GE r1 = r0.f508y;
        if (r1 == null) goto L8;
        r1.m554b();
    L8:
        if (r0.f509z == false) goto L14;
        ViewGroup r12 = r0.f460A;
        if (r12 == null) goto L14;
        if (r12.isLaidOut() == false) goto L14;
        r0.f505v.setAlpha(0.0f);
        C0273GE r13 = AbstractC2185lE.m4388a(r0.f505v);
        r13.m553a(1.0f);
        r0.f508y = r13;
        r13.m556d(new C2526t3(0, this));
        return;
    L14:
        r0.f505v.setAlpha(1.0f);
        r0.f505v.setVisibility(0);
        return;
    L16:
        LayoutInflaterFactory2C0176E3 r02 = this.f8556b;
        if ((r02.f485Z & 1) == 0) goto L20;
        r02.m356v(0);
    L20:
        if ((r02.f485Z & 4096) == 0) goto L22;
        r02.m356v(108);
    L22:
        r02.f484Y = false;
        r02.f485Z = 0;
    }
}
