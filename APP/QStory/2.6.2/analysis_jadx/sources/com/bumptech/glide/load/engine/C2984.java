package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.InterfaceC2961;
import com.bumptech.glide.load.data.InterfaceC2962;
import p228.C8035;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2984 implements InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2992 f9437;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f9438;

    public /* synthetic */ C2984(InterfaceC2992 interfaceC2992, Object obj) {
        this.f9437 = interfaceC2992;
        this.f9438 = obj;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo6376(Object obj) {
        C2990 c2990 = (C2990) this.f9437;
        C8035 c8035 = (C8035) this.f9438;
        C8035 c80352 = c2990.f9466;
        if (c80352 == null || c80352 != c8035) {
            return;
        }
        C2990 c29902 = (C2990) this.f9437;
        C8035 c80353 = (C8035) this.f9438;
        C3012 c3012 = c29902.f9470.f9566;
        if (obj == null || !c3012.m6450(c80353.f22189.mo6373())) {
            RunnableC3014 runnableC3014 = c29902.f9468;
            InterfaceC8392 interfaceC8392 = c80353.f22191;
            InterfaceC2961 interfaceC2961 = c80353.f22189;
            runnableC3014.mo6417(interfaceC8392, obj, interfaceC2961, interfaceC2961.mo6373(), c29902.f9467);
            return;
        }
        c29902.f9464 = obj;
        RunnableC3014 runnableC30142 = c29902.f9468;
        runnableC30142.f9606 = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        C2998 c2998 = runnableC30142.f9609;
        (c2998.f9498 ? c2998.f9511 : c2998.f9510).execute(runnableC30142);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo6377(Exception exc) {
        C2990 c2990 = (C2990) this.f9437;
        C8035 c8035 = (C8035) this.f9438;
        C8035 c80352 = c2990.f9466;
        if (c80352 == null || c80352 != c8035) {
            return;
        }
        C2990 c29902 = (C2990) this.f9437;
        C8035 c80353 = (C8035) this.f9438;
        RunnableC3014 runnableC3014 = c29902.f9468;
        C2993 c2993 = c29902.f9467;
        InterfaceC2961 interfaceC2961 = c80353.f22189;
        runnableC3014.mo6418(c2993, exc, interfaceC2961, interfaceC2961.mo6373());
    }
}
