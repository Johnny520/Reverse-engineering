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

    public C1438g4(C2175l4 c2175l4, int i, int i2, WeakReference weakReference) {
        this.f5044m = c2175l4;
        this.f5041j = i;
        this.f5042k = i2;
        this.f5043l = weakReference;
    }

    @Override // p000.AbstractC0585Nj
    /* JADX INFO: renamed from: I */
    public final void mo1159I(int i) {
    }

    @Override // p000.AbstractC0585Nj
    /* JADX INFO: renamed from: J */
    public final void mo1160J(Typeface typeface) {
        int i = this.f5041j;
        if (i != -1) {
            typeface = AbstractC2127k4.m4311a(typeface, i, (this.f5042k & 2) != 0);
        }
        C2175l4 c2175l4 = this.f5044m;
        if (c2175l4.f7583m) {
            c2175l4.f7582l = typeface;
            TextView textView = (TextView) this.f5043l.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC1482h4(textView, typeface, c2175l4.f7580j));
                } else {
                    textView.setTypeface(typeface, c2175l4.f7580j);
                }
            }
        }
    }
}
