package com.p055lu.magic.p056ui;

import androidx.fragment.app.AbstractComponentCallbacksC0434l;
import androidx.lifecycle.EnumC0478m;
import androidx.lifecycle.InterfaceC0482q;
import androidx.lifecycle.InterfaceC0484s;
import p069i.C0709q1;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleAutoViewBinding<F extends AbstractComponentCallbacksC0434l, V> implements InterfaceC0482q {

    /* JADX INFO: renamed from: a */
    public C0709q1 f1627a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0482q
    /* JADX INFO: renamed from: c */
    public final void mo391c(InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m) {
        if (enumC0478m == EnumC0478m.ON_DESTROY) {
            this.f1627a = null;
            interfaceC0484s.mo636c().m932f(this);
        }
    }
}
