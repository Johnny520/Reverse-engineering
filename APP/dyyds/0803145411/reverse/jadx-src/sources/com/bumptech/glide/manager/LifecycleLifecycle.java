package com.bumptech.glide.manager;

import java.util.Iterator;
import yyds.AbstractC0181;
import yyds.EnumC0637;
import yyds.InterfaceC0623;
import yyds.InterfaceC1021;
import yyds.InterfaceC1626;
import yyds.InterfaceC2111;
import yyds.InterfaceC2345;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements InterfaceC2111, InterfaceC0623 {
    @InterfaceC1626(EnumC0637.ON_DESTROY)
    public void onDestroy(InterfaceC2345 interfaceC2345) {
        Iterator it = AbstractC0181.m741(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1021) it.next()).mo1202();
        }
        interfaceC2345.mo14().m126(this);
    }

    @InterfaceC1626(EnumC0637.ON_START)
    public void onStart(InterfaceC2345 interfaceC2345) {
        Iterator it = AbstractC0181.m741(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1021) it.next()).mo1203();
        }
    }

    @InterfaceC1626(EnumC0637.ON_STOP)
    public void onStop(InterfaceC2345 interfaceC2345) {
        Iterator it = AbstractC0181.m741(null).iterator();
        while (it.hasNext()) {
            ((InterfaceC1021) it.next()).mo1204();
        }
    }

    @Override // yyds.InterfaceC2111
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo246(InterfaceC1021 interfaceC1021) {
        throw null;
    }

    @Override // yyds.InterfaceC2111
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void mo247(InterfaceC1021 interfaceC1021) {
        throw null;
    }
}
