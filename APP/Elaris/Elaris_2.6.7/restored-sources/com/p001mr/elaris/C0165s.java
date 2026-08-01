package com.p001mr.elaris;

import android.view.View;
import p000.InterfaceC0286jc;

/* JADX INFO: renamed from: com.mr.elaris.s */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0165s implements InterfaceC0286jc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f152b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0165s(View view, Object obj) {
        this.f151a = view;
        this.f152b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0286jc
    /* JADX INFO: renamed from: a */
    public final boolean mo230a() {
        return MessageRepeater.isRefreshBindingCurrent(this.f151a, this.f152b);
    }
}
