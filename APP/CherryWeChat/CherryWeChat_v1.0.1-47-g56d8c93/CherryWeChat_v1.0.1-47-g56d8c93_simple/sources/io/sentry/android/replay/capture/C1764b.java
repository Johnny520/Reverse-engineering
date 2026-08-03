package io.sentry.android.replay.capture;

import io.sentry.android.replay.C1789j;
import io.sentry.config.AbstractC1856a;
import java.util.Date;
import p000.AbstractC0073Bn;
import p000.C0829TC;
import p000.InterfaceC0884Ui;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1764b extends AbstractC0073Bn implements InterfaceC0884Ui {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6418c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6419d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC1767e f6420e;

    public /* synthetic */ C1764b(Object r1, Object r2, AbstractC1767e r3, int r4) {
        this.f6417b = r4;
        this.f6418c = r1;
        this.f6419d = r2;
        this.f6420e = r3;
        super(0);
    }

    @Override // p000.InterfaceC0884Ui
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch(this.f6417b) {
            case 0: goto L22;
            case 1: goto L17;
            case 2: goto L9;
            default: goto L4;
        };
    L4:
        C1789j r0 = this.f6420e.f6436h;
        if (r0 == null) goto L8;
        r0.m3973i("replay.screen-at-start", String.valueOf(this.f6419d));
    L8:
        return C0829TC.f2620a;
    L9:
        Date r02 = (Date) this.f6419d;
        Date r1 = (Date) this.f6418c;
        C1789j r12 = this.f6420e.f6436h;
        if (r12 == null) goto L16;
        if (r02 != null) goto L13;
        String r03 = null;
    L14:
        r12.m3973i("segment.timestamp", r03);
        goto L16
    L13:
        r03 = AbstractC1856a.m4073t(r02);
    L16:
        return C0829TC.f2620a;
    L17:
        C1789j r04 = this.f6420e.f6436h;
        if (r04 == null) goto L21;
        r04.m3973i("replay.type", String.valueOf(this.f6419d));
    L21:
        return C0829TC.f2620a;
    L22:
        C1789j r05 = this.f6420e.f6436h;
        if (r05 == null) goto L26;
        r05.m3973i("replay.id", String.valueOf(this.f6419d));
    L26:
        return C0829TC.f2620a;
    }
}
