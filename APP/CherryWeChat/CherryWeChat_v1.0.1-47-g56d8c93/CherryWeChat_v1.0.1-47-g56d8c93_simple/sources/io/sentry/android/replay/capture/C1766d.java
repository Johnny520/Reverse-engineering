package io.sentry.android.replay.capture;

import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1821w;
import p000.AbstractC0073Bn;
import p000.C0829TC;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1766d extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6425c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC1767e f6426d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6427e;

    public /* synthetic */ C1766d(Object r1, Object r2, AbstractC1767e r3, int r4) {
        this.f6424b = r4;
        this.f6425c = r1;
        this.f6427e = r2;
        this.f6426d = r3;
        super(0);
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f6424b) {
            case 0: goto L18;
            default: goto L4;
        };
    L4:
        C1821w r0 = (C1821w) this.f6427e;
        C1821w r1 = (C1821w) this.f6425c;
        AbstractC1767e r12 = this.f6426d;
        C1789j r2 = r12.f6436h;
        if (r2 == null) goto L7;
        r2.m3973i("config.height", String.valueOf(r0.f6590b));
    L7:
        C1789j r22 = r12.f6436h;
        if (r22 == null) goto L10;
        r22.m3973i("config.width", String.valueOf(r0.f6589a));
    L10:
        C1789j r23 = r12.f6436h;
        if (r23 == null) goto L13;
        r23.m3973i("config.frame-rate", String.valueOf(r0.f6593e));
    L13:
        C1789j r13 = r12.f6436h;
        if (r13 == null) goto L17;
        r13.m3973i("config.bit-rate", String.valueOf(r0.f6594f));
    L17:
        return C0829TC.f2620a;
    L18:
        Integer r02 = (Integer) this.f6427e;
        C1789j r14 = this.f6426d.f6436h;
        if (r14 == null) goto L22;
        r14.m3973i("segment.id", String.valueOf(r02));
    L22:
        return C0829TC.f2620a;
    }
}
