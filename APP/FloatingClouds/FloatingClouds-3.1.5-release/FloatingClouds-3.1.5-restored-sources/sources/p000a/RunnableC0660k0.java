package p000a;

import android.app.Activity;
import android.app.ProgressDialog;
import androidx.profileinstaller.C1149b;
import java.io.Serializable;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.k0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0660k0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2469a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2470b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2471c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2472d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0660k0(Object obj, int i, Serializable serializable, int i2) {
        this.f2469a = i2;
        this.f2471c = obj;
        this.f2470b = i;
        this.f2472d = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2469a) {
            case 0:
                ProgressDialog progressDialog = (ProgressDialog) this.f2471c;
                if (progressDialog.isShowing()) {
                    progressDialog.setProgress(this.f2470b);
                    progressDialog.setMessage("正在扫描：" + ((String) this.f2472d));
                }
                break;
            case 1:
                ((C0738o2) this.f2471c).m1748a(this.f2472d, this.f2470b, 3);
                break;
            case 2:
                ((C1149b) this.f2471c).f4725b.mo2617a(this.f2470b, (Serializable) this.f2472d);
                break;
            case 3:
                ((C0953z8) this.f2471c).m2243b((Activity) this.f2472d, this.f2470b + 1);
                break;
            default:
                ((C0009A8) this.f2471c).m40d((Activity) this.f2472d, this.f2470b + 1);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ RunnableC0660k0(IPlugin iPlugin, Object obj, int i, int i2) {
        this.f2469a = i2;
        this.f2471c = iPlugin;
        this.f2472d = obj;
        this.f2470b = i;
    }
}
