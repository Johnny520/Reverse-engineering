package p154k9;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import p007a7.AbstractC0018a;
import p068eh.AbstractC0921a;
import p099h.Hchat.crash.RunnableC1436e;
import p218og.AbstractC3149m;
import p259r9.C3752d0;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: k9.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2371o implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7792a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f7793b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f7794c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC2371o(Activity activity, C2366j c2366j) {
        this.f7793b = activity;
        this.f7794c = c2366j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object c3959f;
        switch (this.f7792a) {
            case 0:
                Activity activity = this.f7793b;
                C2366j c2366j = (C2366j) this.f7794c;
                String str = c2366j.f7773b;
                C2374r.m5675d(false);
                try {
                    String str2 = c2366j.f7774c;
                    int iHashCode = str2.hashCode();
                    boolean zM235W = true;
                    if (iHashCode == -1655966961) {
                        if (str2.equals("activity")) {
                            String string = AbstractC3149m.m6703R0(c2366j.f7775d).toString();
                            if (AbstractC3149m.m6694I0(string, '.')) {
                                string = activity.getPackageName() + string;
                            }
                            Intent component = new Intent().setComponent(new ComponentName(activity.getPackageName(), string));
                            component.getClass();
                            activity.startActivity(component);
                        } else {
                            zM235W = false;
                        }
                        c3959f = Boolean.valueOf(zM235W);
                    } else if (iHashCode == 1834139798) {
                        if (!str2.equals("module_settings")) {
                            zM235W = false;
                            c3959f = Boolean.valueOf(zM235W);
                        } else {
                            activity.getClass();
                            AbstractC0018a.m231S(activity, null, false);
                            c3959f = Boolean.valueOf(zM235W);
                        }
                    } else if (iHashCode == 2033820409 && str2.equals("plugin_agent")) {
                        zM235W = AbstractC0018a.m235W(activity);
                        Window window = activity.getWindow();
                        View decorView = window != null ? window.getDecorView() : null;
                        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
                        if (viewGroup != null) {
                            viewGroup.post(new RunnableC1436e(2));
                        }
                        c3959f = Boolean.valueOf(zM235W);
                    } else {
                        zM235W = false;
                        c3959f = Boolean.valueOf(zM235W);
                    }
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC0921a.m2260w("[Hchat:FloatingShortcut] 打开快捷项失败: ", str, " ", thM8182b.getMessage(), thM8182b);
                }
                Boolean bool = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = bool;
                }
                if (!((Boolean) c3959f).booleanValue()) {
                    Toast.makeText(activity, "无法打开" + str, 0).show();
                }
                break;
            default:
                ((C3752d0) this.f7794c).m7838e0(this.f7793b);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2371o(C3752d0 c3752d0, Activity activity) {
        this.f7794c = c3752d0;
        this.f7793b = activity;
    }
}
