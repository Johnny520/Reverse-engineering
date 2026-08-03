package p332wb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p063e9.C0846q;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p117i0.InterfaceC1809a1;
import p126ia.RunnableC2018l;
import p218og.AbstractC3149m;
import p251r.C3623h;
import p266s0.C3874d;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.oc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5172oc implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19368g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f19369h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19370i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f19371j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5172oc(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f19369h = context;
        this.f19370i = interfaceC1809a1;
        this.f19371j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        int i9 = this.f19368g;
        Context context = this.f19369h;
        InterfaceC1809a1 interfaceC1809a1 = this.f19371j;
        InterfaceC1809a1 interfaceC1809a12 = this.f19370i;
        C3967n c3967n = C3967n.f12976a;
        switch (i9) {
            case 0:
                Boolean bool = (Boolean) obj;
                final boolean zBooleanValue = bool.booleanValue();
                final InterfaceC1809a1 interfaceC1809a13 = this.f19370i;
                final boolean zBooleanValue2 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                interfaceC1809a13.setValue(bool);
                final Context context2 = this.f19369h;
                final InterfaceC1809a1 interfaceC1809a14 = this.f19371j;
                new Thread(new Runnable() { // from class: wb.gg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScriptPluginRuntime scriptPluginRuntime = ScriptPluginRuntime.INSTANCE;
                        Context context3 = context2;
                        new Handler(Looper.getMainLooper()).post(new RunnableC2018l(scriptPluginRuntime.m10925setGlobalEnabledgIAlus(context3, zBooleanValue), zBooleanValue2, context3, interfaceC1809a13, interfaceC1809a14));
                    }
                }, "Hchat-Script-Global").start();
                break;
            case 1:
                String strM2123h = (String) obj;
                strM2123h.getClass();
                if (!AbstractC3149m.m6721t0(strM2123h)) {
                    if (((Number) interfaceC1809a12.getValue()).intValue() == 1) {
                        AtomicBoolean atomicBoolean = C0846q.f2580a;
                        strM2123h = C0846q.m2123h(context, strM2123h);
                    }
                    interfaceC1809a1.setValue(strM2123h);
                }
                break;
            default:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19886v0, 3);
                C3623h.m7604a(c3623h, null, new C3874d(2004525492, new C5326t1(24, interfaceC1809a12, interfaceC1809a1), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19893w0, 3);
                C3623h.m7604a(c3623h, null, new C3874d(-755045134, new C5170oa(context, interfaceC1809a1, 6), true), 3);
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C5172oc(InterfaceC1809a1 interfaceC1809a1, Context context, InterfaceC1809a1 interfaceC1809a12) {
        this.f19370i = interfaceC1809a1;
        this.f19369h = context;
        this.f19371j = interfaceC1809a12;
    }

    public /* synthetic */ C5172oc(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, Context context) {
        this.f19370i = interfaceC1809a1;
        this.f19371j = interfaceC1809a12;
        this.f19369h = context;
    }
}
