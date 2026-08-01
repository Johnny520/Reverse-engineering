package p086r0;

import android.app.Activity;
import android.view.KeyEvent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ListAdapter;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p088s0.C0976J;
import p102z0.C1119b;

/* JADX INFO: renamed from: r0.i1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0910i1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f3214b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3215c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3216d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0910i1(InterfaceC0551a interfaceC0551a, KeyEvent.Callback callback, boolean z2, int i2) {
        this.f3213a = i2;
        this.f3215c = interfaceC0551a;
        this.f3216d = callback;
        this.f3214b = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3213a) {
            case 0:
                AbsListView absListView = (AbsListView) this.f3216d;
                ((C0919l1) this.f3215c).getClass();
                if (C0919l1.m2000B(absListView)) {
                    try {
                        Adapter adapter = absListView.getAdapter();
                        ListAdapter listAdapter = adapter instanceof ListAdapter ? (ListAdapter) adapter : null;
                        if (listAdapter != null) {
                            AbstractC0514f.m1024a(listAdapter, "notifyDataSetChanged", new Object[0]);
                        }
                        if (this.f3214b && listAdapter != null) {
                            AbstractC0514f.m1024a(absListView, "setAdapter", listAdapter);
                        }
                        absListView.invalidateViews();
                        absListView.requestLayout();
                        AbstractC0514f.f1622b.mo1012c(absListView, "layoutChildren", new Object[0]);
                    } catch (Throwable unused) {
                        return;
                    }
                }
                break;
            case 1:
                ((C0822A1) this.f3215c).m1501d((Activity) this.f3216d, this.f3214b);
                break;
            default:
                C0976J.m2165n(this.f3214b, (C0976J) this.f3215c, (C1119b) this.f3216d);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0910i1(boolean z2, C0976J c0976j, C1119b c1119b) {
        this.f3213a = 2;
        this.f3214b = z2;
        this.f3215c = c0976j;
        this.f3216d = c1119b;
    }
}
