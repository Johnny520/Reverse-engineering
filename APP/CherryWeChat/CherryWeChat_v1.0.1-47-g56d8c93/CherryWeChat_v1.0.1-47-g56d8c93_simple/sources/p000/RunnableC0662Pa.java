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

    public /* synthetic */ RunnableC0662Pa(Object r1, Object r2, int r3, int r4) {
        this.f2116a = r4;
        this.f2117b = r1;
        this.f2118c = r3;
        this.f2119d = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f2116a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        C0063Bd r0 = (C0063Bd) this.f2117b;
        Object r1 = this.f2119d;
        r0.f147b.mo131b(this.f2118c, r1);
        return;
    L6:
        C0705Qa r02 = (C0705Qa) this.f2117b;
        IntentSender.SendIntentException r12 = (IntentSender.SendIntentException) this.f2119d;
        Intent r13 = new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", r12);
        r02.m2363a(this.f2118c, 0, r13);
        return;
    L8:
        C0705Qa r03 = (C0705Qa) this.f2117b;
        Object r14 = ((C0774S0) this.f2119d).f2448a;
        String r2 = (String) r03.f4220a.get(Integer.valueOf(this.f2118c));
        if (r2 == null) goto L23;
        C0989X0 r3 = (C0989X0) r03.f4224e.get(r2);
        if (r3 == null) goto L14;
        InterfaceC0731R0 r4 = r3.f3158a;
    L15:
        if (r4 != null) goto L17;
        r03.f4226g.remove(r2);
        r03.f4225f.put(r2, r14);
        return;
    L17:
        InterfaceC0731R0 r32 = r3.f3158a;
        if (r03.f4223d.remove(r2) == false) goto L22;
        r32.mo1524a(r14);
        return;
    L22:
        return;
    L14:
        r4 = null;
        goto L15
    }
}
