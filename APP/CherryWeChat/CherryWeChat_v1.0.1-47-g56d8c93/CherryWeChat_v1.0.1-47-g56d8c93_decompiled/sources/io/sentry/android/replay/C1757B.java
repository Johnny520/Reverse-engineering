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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1757B(View view, int i) {
        super(1);
        this.f6366b = i;
        this.f6367c = view;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object obj) {
        switch (this.f6366b) {
        }
        return Boolean.valueOf(AbstractC0585Nj.m1134a(((WeakReference) obj).get(), this.f6367c));
    }
}
