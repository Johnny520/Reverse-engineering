package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        this.f1098 = interfaceC0309.mo438();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC0343 m997(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432) {
        if (this.f1100 == null) {
            this.f1100 = abstractC0343.mo1038();
        }
        AbstractC0343 abstractC03433 = this.f1100;
        if (abstractC03433 == null) {
            AbstractC4394.m8918("velocityVector");
            throw null;
        }
        int iMo1039 = abstractC03433.mo1039();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03434 = this.f1100;
            if (i >= iMo1039) {
                if (abstractC03434 != null) {
                    return abstractC03434;
                }
                AbstractC4394.m8918("velocityVector");
                throw null;
            }
            if (abstractC03434 == null) {
                AbstractC4394.m8918("velocityVector");
                throw null;
            }
            abstractC0343.getClass();
            abstractC03434.mo1036(this.f1102.mo435(abstractC03432.mo1040(i), j), i);
            i++;
        }
    }
}
