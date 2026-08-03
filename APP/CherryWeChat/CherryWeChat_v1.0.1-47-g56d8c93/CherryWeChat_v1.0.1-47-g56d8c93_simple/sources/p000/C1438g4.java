package p000;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: g4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1438g4 extends AbstractC0585Nj {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5041j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f5042k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ WeakReference f5043l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C2175l4 f5044m;

    public C1438g4(C2175l4 r1, int r2, int r3, WeakReference r4) {
        this.f5044m = r1;
        this.f5041j = r2;
        this.f5042k = r3;
        this.f5043l = r4;
    }

    @Override // p000.AbstractC0585Nj
    /* JADX INFO: renamed from: I */
    public final void mo1159I(int r1) {
    }

    @Override // p000.AbstractC0585Nj
    /* JADX INFO: renamed from: J */
    public final void mo1160J(Typeface r4) {
        int r1 = this.f5041j;
        if (r1 != (-1)) goto L5;
    L9:
        C2175l4 r0 = this.f5044m;
        if (r0.f7583m == false) goto L19;
        r0.f7582l = r4;
        TextView r12 = (TextView) this.f5043l.get();
        if (r12 != null) goto L14;
        return;
    L14:
        if (r12.isAttachedToWindow() == false) goto L17;
        r12.post(new RunnableC1482h4(r12, r4, r0.f7580j));
        return;
    L17:
        r12.setTypeface(r4, r0.f7580j);
        return;
    L19:
        return;
    L5:
        if ((this.f5042k & 2) == 0) goto L7;
        boolean r02 = true;
    L8:
        r4 = AbstractC2127k4.m4311a(r4, r1, r02);
        goto L9
    L7:
        r02 = false;
        goto L8
    }
}
