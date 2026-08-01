package kotlin.reflect.jvm.internal;

import com.bumptech.glide.AbstractC3056;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4967 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4964 f14354;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14355;

    public /* synthetic */ C4967(C4964 c4964, int i) {
        this.f14355 = i;
        this.f14354 = c4964;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f14355;
        C4964 c4964 = this.f14354;
        switch (i) {
            case 0:
                return new C4963(c4964);
            default:
                return AbstractC3056.m6687(c4964, c4964.m9973(), null, null);
        }
    }
}
