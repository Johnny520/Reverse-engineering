package io.sentry.android.replay;

import android.view.View;
import java.lang.ref.WeakReference;
import p000.AbstractC0073Bn;
import p000.AbstractC0585Nj;
import p000.InterfaceC1416fj;

/* JADX INFO: renamed from: io.sentry.android.replay.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1757B extends AbstractC0073Bn implements InterfaceC1416fj {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f6366b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f6367c;

    public /* synthetic */ C1757B(View r1, int r2) {
        this.f6366b = r2;
        this.f6367c = r1;
        super(1);
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r2) {
        switch(this.f6366b) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return Boolean.valueOf(AbstractC0585Nj.m1134a(((WeakReference) r2).get(), this.f6367c));
    L7:
        return Boolean.valueOf(AbstractC0585Nj.m1134a(((WeakReference) r2).get(), this.f6367c));
    }
}
