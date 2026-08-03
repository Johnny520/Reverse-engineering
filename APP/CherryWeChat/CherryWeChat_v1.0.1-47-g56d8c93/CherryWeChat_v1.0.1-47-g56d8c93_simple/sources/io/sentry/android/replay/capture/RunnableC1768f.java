package io.sentry.android.replay.capture;

import io.sentry.android.replay.C1821w;
import io.sentry.protocol.C1970t;
import java.util.Date;
import p000.AbstractC0073Bn;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1768f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6445a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f6446b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Date f6447c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1970t f6448d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1821w f6449e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0073Bn f6450f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC1767e f6451g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1768f(C1770h r2, long r3, Date r5, C1970t r6, C1821w r7, InterfaceC1416fj r8) {
        this.f6445a = 0;
        this.f6451g = r2;
        this.f6446b = r3;
        this.f6447c = r5;
        this.f6448d = r6;
        this.f6449e = r7;
        this.f6450f = (AbstractC0073Bn) r8;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [Bn, fj] */
    /* JADX WARN: Type inference failed for: r1v5, types: [Bn, fj] */
    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f6445a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        C1779q r1 = (C1779q) this.f6451g;
        int r6 = r1.m3955j();
        C1821w r0 = this.f6449e;
        int r7 = r0.f6590b;
        int r8 = r0.f6589a;
        int r9 = r0.f6593e;
        int r10 = r0.f6594f;
        AbstractC1775m r02 = AbstractC1767e.m3951h(r1, this.f6446b, this.f6447c, this.f6448d, r6, r7, r8, r9, r10);
        this.f6450f.mo90g(r02);
        return;
    L6:
        C1770h r12 = (C1770h) this.f6451g;
        int r62 = r12.m3955j();
        C1821w r03 = this.f6449e;
        int r72 = r03.f6590b;
        int r82 = r03.f6589a;
        int r92 = r03.f6593e;
        int r102 = r03.f6594f;
        AbstractC1775m r04 = AbstractC1767e.m3951h(r12, this.f6446b, this.f6447c, this.f6448d, r62, r72, r82, r92, r102);
        this.f6450f.mo90g(r04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1768f(C1779q r2, long r3, Date r5, C1970t r6, C1821w r7, InterfaceC1416fj r8) {
        this.f6445a = 1;
        this.f6451g = r2;
        this.f6446b = r3;
        this.f6447c = r5;
        this.f6448d = r6;
        this.f6449e = r7;
        this.f6450f = (AbstractC0073Bn) r8;
    }
}
