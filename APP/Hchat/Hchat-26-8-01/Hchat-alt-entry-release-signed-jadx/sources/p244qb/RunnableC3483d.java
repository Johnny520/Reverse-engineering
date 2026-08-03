package p244qb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import ca.C0532s;
import gg.C1423s;
import p304uf.C4330d;
import va.ViewOnClickListenerC4541a;

/* JADX INFO: renamed from: qb.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3483d implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11302g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Activity f11303h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11304i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f11305j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f11306k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC3483d(Activity activity, C3490k c3490k, C1423s c1423s, int i9) {
        this.f11303h = activity;
        this.f11305j = c3490k;
        this.f11306k = c1423s;
        this.f11304i = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11302g) {
            case 0:
                C3490k c3490k = (C3490k) this.f11305j;
                C1423s c1423s = (C1423s) this.f11306k;
                Activity activity = this.f11303h;
                if (!activity.isFinishing()) {
                    String str = "语音转发完成: " + c1423s.f4736g + "/" + this.f11304i;
                    c3490k.getClass();
                    C3490k.m7295N(activity, str);
                }
                break;
            default:
                String str2 = (String) this.f11305j;
                ViewGroup viewGroup = (ViewGroup) this.f11306k;
                View viewM8766p = C4330d.m8766p(viewGroup, new C0532s("ID: ".concat(str2), 18));
                if (viewM8766p == null) {
                    viewM8766p = C4330d.m8766p(viewGroup, new C0532s(str2, 19));
                }
                Activity activity2 = this.f11303h;
                if (viewM8766p == null) {
                    int i9 = this.f11304i + 1;
                    if (i9 < 8) {
                        C4330d.m8758h(activity2, str2, i9);
                    }
                } else {
                    ViewOnClickListenerC4541a viewOnClickListenerC4541a = new ViewOnClickListenerC4541a(activity2, str2, 0);
                    viewM8766p.setOnClickListener(viewOnClickListenerC4541a);
                    viewM8766p.setClickable(true);
                    viewM8766p.setFocusable(false);
                    for (int i10 = 0; viewM8766p != null && i10 < 5; i10++) {
                        viewM8766p.setOnClickListener(viewOnClickListenerC4541a);
                        viewM8766p.setClickable(true);
                        viewM8766p.setFocusable(false);
                        Object parent = viewM8766p.getParent();
                        viewM8766p = parent instanceof View ? (View) parent : null;
                    }
                }
                break;
        }
    }

    public /* synthetic */ RunnableC3483d(String str, ViewGroup viewGroup, Activity activity, int i9) {
        this.f11305j = str;
        this.f11306k = viewGroup;
        this.f11303h = activity;
        this.f11304i = i9;
    }
}
