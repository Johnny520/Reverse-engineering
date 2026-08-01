package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.data.InterfaceC3794;
import com.bumptech.glide.load.data.InterfaceC3795;
import p244.C8865;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3817 implements InterfaceC3795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3825 f9784;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Object f9785;

    public /* synthetic */ C3817(InterfaceC3825 interfaceC3825, Object obj) {
        this.f9784 = interfaceC3825;
        this.f9785 = obj;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3795
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public void mo6994(Object obj) {
        C3823 c3823 = (C3823) this.f9784;
        C8865 c8865 = (C8865) this.f9785;
        C8865 c88652 = c3823.f9813;
        if (c88652 == null || c88652 != c8865) {
            return;
        }
        C3823 c38232 = (C3823) this.f9784;
        C8865 c88653 = (C8865) this.f9785;
        C3845 c3845 = c38232.f9817.f9913;
        if (obj == null || !c3845.m7070(c88653.f22531.mo6991())) {
            RunnableC3847 runnableC3847 = c38232.f9815;
            InterfaceC9222 interfaceC9222 = c88653.f22533;
            InterfaceC3794 interfaceC3794 = c88653.f22531;
            runnableC3847.mo7035(interfaceC9222, obj, interfaceC3794, interfaceC3794.mo6991(), c38232.f9814);
            return;
        }
        c38232.f9811 = obj;
        RunnableC3847 runnableC38472 = c38232.f9815;
        runnableC38472.f9953 = DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE;
        C3831 c3831 = runnableC38472.f9956;
        (c3831.f9845 ? c3831.f9858 : c3831.f9857).execute(runnableC38472);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3795
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo6995(Exception exc) {
        C3823 c3823 = (C3823) this.f9784;
        C8865 c8865 = (C8865) this.f9785;
        C8865 c88652 = c3823.f9813;
        if (c88652 == null || c88652 != c8865) {
            return;
        }
        C3823 c38232 = (C3823) this.f9784;
        C8865 c88653 = (C8865) this.f9785;
        RunnableC3847 runnableC3847 = c38232.f9815;
        C3826 c3826 = c38232.f9814;
        InterfaceC3794 interfaceC3794 = c88653.f22531;
        runnableC3847.mo7036(c3826, exc, interfaceC3794, interfaceC3794.mo6991());
    }
}
