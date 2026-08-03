package p056f0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.widget.EditText;
import com.abc.core.hooks.ModuleLog;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0146l;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p049b0.C0569s;
import p050c0.C0614O1;
import p050c0.C0617P1;

/* JADX INFO: renamed from: f0.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0840s implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3033b;

    public /* synthetic */ C0840s(int i2, Object obj) {
        this.f3032a = i2;
        this.f3033b = obj;
    }

    @Override // p029P0.InterfaceC0275a
    public final Object invoke() {
        Object objM116u;
        Object objM116u2;
        C0146l c0146l = C0146l.f339a;
        Object obj = this.f3033b;
        switch (this.f3032a) {
            case 0:
                C0798I c0798i = (C0798I) obj;
                AbstractC0307g.m703e(c0798i, "$template");
                EditText editText = c0798i.f2899b;
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                editText.append("今日已发${totalMsg}条");
                break;
            case 1:
                AbstractC0307g.m703e((ClassLoader) obj, "$cl");
                C0617P1 c0617p1 = C0617P1.f1903a;
                if (C0617P1.f1904b.compareAndSet(false, true)) {
                    try {
                        objM116u = AbstractC0358S.m904q(Activity.class, "onResume", new C0614O1(1));
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    Throwable thM465a = AbstractC0141g.m465a(objM116u);
                    C0617P1 c0617p12 = C0617P1.f1903a;
                    if (thM465a != null) {
                        C0617P1.m1515c("hook onResume failed: " + thM465a.getMessage());
                    }
                    try {
                        Class cls = Integer.TYPE;
                        objM116u2 = AbstractC0358S.m904q(Activity.class, "onActivityResult", cls, cls, Intent.class, new C0614O1(0));
                    } catch (Throwable th2) {
                        objM116u2 = AbstractC0040p.m116u(th2);
                    }
                    Throwable thM465a2 = AbstractC0141g.m465a(objM116u2);
                    if (thM465a2 != null) {
                        C0617P1.m1515c("hook onActivityResult failed: " + thM465a2.getMessage());
                    }
                    C0617P1.m1515c("map pick bridge installed");
                }
                break;
            default:
                Context context = (Context) obj;
                AbstractC0307g.m703e(context, "$appContext");
                C0569s c0569sM882d0 = AbstractC0358S.m882d0(context);
                AtomicBoolean atomicBoolean = C0820c0.f2976a;
                C0820c0.m2130d("wechat " + c0569sM882d0.m1383a() + " range=微信 8.0.69–8.0.76（国服 / Play）");
                ModuleLog.INSTANCE.m1813i("当前微信: " + c0569sM882d0.m1383a());
                break;
        }
        return c0146l;
    }
}
