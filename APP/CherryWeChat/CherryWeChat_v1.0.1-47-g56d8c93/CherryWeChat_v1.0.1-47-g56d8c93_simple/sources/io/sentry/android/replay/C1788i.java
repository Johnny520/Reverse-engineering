package io.sentry.android.replay;

import io.sentry.C2046v2;
import io.sentry.C2059x2;
import io.sentry.EnumC1657a2;
import io.sentry.android.replay.capture.C1770h;
import io.sentry.android.replay.capture.C1773k;
import java.io.File;
import java.io.Serializable;
import p000.AbstractC0073Bn;
import p000.C0253Fv;
import p000.C0382Iv;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1788i extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f6495c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6496d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Serializable f6497e;

    public /* synthetic */ C1788i(long r1, Object r3, Serializable r4, int r5) {
        this.f6494b = r5;
        this.f6495c = r1;
        this.f6496d = r3;
        this.f6497e = r4;
        super(1);
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r6) {
        switch(this.f6494b) {
            case 0: goto L18;
            default: goto L4;
        };
    L4:
        C1770h r0 = (C1770h) this.f6496d;
        C2059x2 r62 = ((C1773k) r6).f6459a;
        if (r62.f7285u.getTime() >= this.f6495c) goto L17;
        r0.m3957l(r0.m3955j() - 1);
        File r63 = r62.f7280p;
        C2046v2 r02 = r0.f6454r;
        if (r63 != null) goto L26;
    L15:
        ((C0253Fv) this.f6497e).f825a = true;
        return Boolean.TRUE;
    L26:
    L13:
        th = move-exception;
        r02.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Failed to delete replay segment: %s", new Object[]{r63.getAbsolutePath()});
        goto L15
    L10:
        if (r63.delete() == true) goto L15;
        r02.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete replay segment: %s", new Object[]{r63.getAbsolutePath()});     // Catch: Throwable -> L13
        goto L15
    L17:
        return Boolean.FALSE;
    L18:
        C1790k r64 = (C1790k) r6;
        if (r64.f6509b >= this.f6495c) goto L21;
        ((C1789j) this.f6496d).m3971d(r64.f6508a);
        return Boolean.TRUE;
    L21:
        C0382Iv r03 = (C0382Iv) this.f6497e;
        if (r03.f1315a != null) goto L25;
        r03.f1315a = r64.f6510c;
    L25:
        return Boolean.FALSE;
    }
}
