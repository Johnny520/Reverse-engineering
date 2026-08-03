package p000a;

import android.app.Activity;
import android.util.Log;
import android.view.View;

/* JADX INFO: renamed from: a.V7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0387V7 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1475a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0320Rc f1476b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f1477c;

    public /* synthetic */ C0387V7(C0320Rc c0320Rc, Activity activity, int i) {
        this.f1475a = i;
        this.f1476b = c0320Rc;
        this.f1477c = activity;
    }

    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        final View view = (View) obj;
        switch (this.f1475a) {
            case 0:
                C0631i9.m1482e(view, "v");
                if (view.getId() > -1) {
                    this.f1476b.f1153a++;
                    final Activity activity = this.f1477c;
                    final int i = 0;
                    view.setOnLongClickListener(new View.OnLongClickListener() { // from class: a.W7
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            switch (i) {
                                case 0:
                                    final Activity activity2 = activity;
                                    final int i2 = 0;
                                    view.post(new Runnable() { // from class: a.X7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i2) {
                                                case 0:
                                                    try {
                                                        new C0803ra(activity2).m1873l();
                                                    } catch (Exception e) {
                                                        Log.e("FC_DEBUG", "MaskUI show failed", e);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    new C0803ra(activity2).m1873l();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final Activity activity3 = activity;
                                    final int i3 = 1;
                                    view.post(new Runnable() { // from class: a.X7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    try {
                                                        new C0803ra(activity3).m1873l();
                                                    } catch (Exception e) {
                                                        Log.e("FC_DEBUG", "MaskUI show failed", e);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    new C0803ra(activity3).m1873l();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                            return true;
                        }
                    });
                }
                break;
            default:
                C0631i9.m1482e(view, "v");
                if (view.getId() > -1) {
                    this.f1476b.f1153a++;
                    final Activity activity2 = this.f1477c;
                    final int i2 = 1;
                    view.setOnLongClickListener(new View.OnLongClickListener() { // from class: a.W7
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view2) {
                            switch (i2) {
                                case 0:
                                    final Activity activity22 = activity2;
                                    final int i22 = 0;
                                    view.post(new Runnable() { // from class: a.X7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i22) {
                                                case 0:
                                                    try {
                                                        new C0803ra(activity22).m1873l();
                                                    } catch (Exception e) {
                                                        Log.e("FC_DEBUG", "MaskUI show failed", e);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    new C0803ra(activity22).m1873l();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                                default:
                                    final Activity activity3 = activity2;
                                    final int i3 = 1;
                                    view.post(new Runnable() { // from class: a.X7
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i3) {
                                                case 0:
                                                    try {
                                                        new C0803ra(activity3).m1873l();
                                                    } catch (Exception e) {
                                                        Log.e("FC_DEBUG", "MaskUI show failed", e);
                                                        return;
                                                    }
                                                    break;
                                                default:
                                                    new C0803ra(activity3).m1873l();
                                                    break;
                                            }
                                        }
                                    });
                                    break;
                            }
                            return true;
                        }
                    });
                }
                break;
        }
        return C0413Wf.f1577a;
    }
}
