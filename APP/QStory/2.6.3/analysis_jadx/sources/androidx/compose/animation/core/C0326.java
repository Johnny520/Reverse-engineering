package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0326 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f1098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public AbstractC0343 f1099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC0343 f1100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC0343 f1101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0309 f1102;

    public C0326(InterfaceC0309 interfaceC0309) {
        this.f1102 = interfaceC0309;
        this.f1098 = interfaceC0309.mo439();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC0343 m998(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432) {
        if (this.f1100 == null) {
            this.f1100 = abstractC0343.mo1039();
        }
        AbstractC0343 abstractC03433 = this.f1100;
        if (abstractC03433 == null) {
            AbstractC4395.m8908("velocityVector");
            throw null;
        }
        int iMo1040 = abstractC03433.mo1040();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03434 = this.f1100;
            if (i >= iMo1040) {
                if (abstractC03434 != null) {
                    return abstractC03434;
                }
                AbstractC4395.m8908("velocityVector");
                throw null;
            }
            if (abstractC03434 == null) {
                AbstractC4395.m8908("velocityVector");
                throw null;
            }
            abstractC0343.getClass();
            abstractC03434.mo1037(this.f1102.mo436(abstractC03432.mo1041(i), j), i);
            i++;
        }
    }
}
