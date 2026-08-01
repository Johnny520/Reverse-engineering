package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.InterfaceC2962;
import com.bumptech.glide.load.data.InterfaceC2963;
import p228.C8036;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2985 implements InterfaceC2963 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2993 f9439;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f9440;

    public /* synthetic */ C2985(InterfaceC2993 interfaceC2993, Object obj) {
        this.f9439 = interfaceC2993;
        this.f9440 = obj;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2963
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo6434(Object obj) {
        C2991 c2991 = (C2991) this.f9439;
        C8036 c8036 = (C8036) this.f9440;
        C8036 c80362 = c2991.f9468;
        if (c80362 == null || c80362 != c8036) {
            return;
        }
        C2991 c29912 = (C2991) this.f9439;
        C8036 c80363 = (C8036) this.f9440;
        C3013 c3013 = c29912.f9472.f9568;
        if (obj == null || !c3013.m6510(c80363.f22186.mo6431())) {
            RunnableC3015 runnableC3015 = c29912.f9470;
            InterfaceC8393 interfaceC8393 = c80363.f22188;
            InterfaceC2962 interfaceC2962 = c80363.f22186;
            runnableC3015.mo6475(interfaceC8393, obj, interfaceC2962, interfaceC2962.mo6431(), c29912.f9469);
            return;
        }
        c29912.f9466 = obj;
        RunnableC3015 runnableC30152 = c29912.f9470;
        runnableC30152.f9608 = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        C2999 c2999 = runnableC30152.f9611;
        (c2999.f9500 ? c2999.f9513 : c2999.f9512).execute(runnableC30152);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2963
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo6435(Exception exc) {
        C2991 c2991 = (C2991) this.f9439;
        C8036 c8036 = (C8036) this.f9440;
        C8036 c80362 = c2991.f9468;
        if (c80362 == null || c80362 != c8036) {
            return;
        }
        C2991 c29912 = (C2991) this.f9439;
        C8036 c80363 = (C8036) this.f9440;
        RunnableC3015 runnableC3015 = c29912.f9470;
        C2994 c2994 = c29912.f9469;
        InterfaceC2962 interfaceC2962 = c80363.f22186;
        runnableC3015.mo6476(c2994, exc, interfaceC2962, interfaceC2962.mo6431());
    }
}
