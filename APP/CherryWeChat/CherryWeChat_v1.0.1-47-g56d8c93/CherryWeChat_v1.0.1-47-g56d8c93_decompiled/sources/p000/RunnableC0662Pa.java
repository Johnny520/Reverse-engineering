package p000;

import android.content.Intent;
import android.content.IntentSender;

/* JADX INFO: renamed from: Pa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0662Pa implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2116a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2117b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2118c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f2119d;

    public /* synthetic */ RunnableC0662Pa(Object obj, Object obj2, int i, int i2) {
        this.f2116a = i2;
        this.f2117b = obj;
        this.f2118c = i;
        this.f2119d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2116a) {
            case 0:
                C0705Qa c0705Qa = (C0705Qa) this.f2117b;
                Object obj = ((C0774S0) this.f2119d).f2448a;
                String str = (String) c0705Qa.f4220a.get(Integer.valueOf(this.f2118c));
                if (str != null) {
                    C0989X0 c0989x0 = (C0989X0) c0705Qa.f4224e.get(str);
                    if ((c0989x0 != null ? c0989x0.f3158a : null) != null) {
                        InterfaceC0731R0 interfaceC0731R0 = c0989x0.f3158a;
                        if (c0705Qa.f4223d.remove(str)) {
                            interfaceC0731R0.mo1524a(obj);
                        }
                    } else {
                        c0705Qa.f4226g.remove(str);
                        c0705Qa.f4225f.put(str, obj);
                    }
                    break;
                }
                break;
            case 1:
                ((C0705Qa) this.f2117b).m2363a(this.f2118c, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f2119d));
                break;
            default:
                ((C0063Bd) this.f2117b).f147b.mo131b(this.f2118c, this.f2119d);
                break;
        }
    }
}
