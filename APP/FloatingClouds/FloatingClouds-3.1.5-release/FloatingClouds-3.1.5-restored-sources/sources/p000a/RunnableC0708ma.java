package p000a;

import android.widget.Switch;
import android.widget.Toast;
import p000a.C0186K3;

/* JADX INFO: renamed from: a.ma */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0708ma implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2673a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0803ra f2674b;

    public /* synthetic */ RunnableC0708ma(C0803ra c0803ra, int i) {
        this.f2673a = i;
        this.f2674b = c0803ra;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2673a) {
            case 0:
                C0803ra c0803ra = this.f2674b;
                Switch r1 = c0803ra.f3175h;
                if (r1 != null) {
                    C0186K3.f638a.getClass();
                    boolean z = C0186K3.a.m508i().f2450t && !C0915x8.m2203a();
                    if (r1.isChecked() != z) {
                        c0803ra.f3176i = true;
                        r1.setChecked(z);
                        c0803ra.f3176i = false;
                    }
                    break;
                }
                break;
            default:
                Toast.makeText(this.f2674b.f3168a, "符号定位失败或 mp0 类不存在", 0).show();
                break;
        }
    }
}
