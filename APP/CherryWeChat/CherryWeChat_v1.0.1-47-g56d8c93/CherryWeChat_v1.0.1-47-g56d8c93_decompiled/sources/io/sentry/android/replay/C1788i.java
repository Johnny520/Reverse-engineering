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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1788i(long j, Object obj, Serializable serializable, int i) {
        super(1);
        this.f6494b = i;
        this.f6495c = j;
        this.f6496d = obj;
        this.f6497e = serializable;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        switch (this.f6494b) {
            case 0:
                C1790k c1790k = (C1790k) obj;
                if (c1790k.f6509b >= this.f6495c) {
                    C0382Iv c0382Iv = (C0382Iv) this.f6497e;
                    if (c0382Iv.f1315a == null) {
                        c0382Iv.f1315a = c1790k.f6510c;
                    }
                } else {
                    ((C1789j) this.f6496d).m3971d(c1790k.f6508a);
                }
                break;
            default:
                C1770h c1770h = (C1770h) this.f6496d;
                C2059x2 c2059x2 = ((C1773k) obj).f6459a;
                if (c2059x2.f7285u.getTime() < this.f6495c) {
                    c1770h.m3957l(c1770h.m3955j() - 1);
                    File file = c2059x2.f7280p;
                    C2046v2 c2046v2 = c1770h.f6454r;
                    if (file != null) {
                        try {
                            if (!file.delete()) {
                                c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                            }
                        } catch (Throwable th) {
                            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
                        }
                    }
                    ((C0253Fv) this.f6497e).f825a = true;
                    break;
                }
                break;
        }
        return Boolean.FALSE;
    }
}
