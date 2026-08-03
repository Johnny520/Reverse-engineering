package p057g;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: g.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0850B extends AbstractC1083b {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3075e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f3076f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ WeakReference f3077g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0860G f3078h;

    public C0850B(C0860G r1, int r2, int r3, WeakReference r4) {
        this.f3078h = r1;
        this.f3075e = r2;
        this.f3076f = r3;
        this.f3077g = r4;
    }

    @Override // p083u.AbstractC1083b
    /* JADX INFO: renamed from: f */
    public final void mo2163f(int r1) {
    }

    @Override // p083u.AbstractC1083b
    /* JADX INFO: renamed from: g */
    public final void mo2164g(Typeface r4) {
        if (Build.VERSION.SDK_INT < 28) goto L11;
        int r1 = this.f3075e;
        if (r1 == (-1)) goto L11;
        if ((this.f3076f & 2) == 0) goto L9;
        boolean r02 = true;
    L10:
        r4 = AbstractC0858F.m2172a(r4, r1, r02);
        goto L11
    L9:
        r02 = false;
    L11:
        C0860G r03 = this.f3078h;
        if (r03.f3103m == false) goto L20;
        r03.f3102l = r4;
        TextView r12 = (TextView) this.f3077g.get();
        if (r12 != null) goto L16;
        return;
    L16:
        if (r12.isAttachedToWindow() == false) goto L18;
        r12.post(new RunnableC0852C(r12, r4, r03.f3100j));
        return;
    L18:
        r12.setTypeface(r4, r03.f3100j);
        return;
    }
}
