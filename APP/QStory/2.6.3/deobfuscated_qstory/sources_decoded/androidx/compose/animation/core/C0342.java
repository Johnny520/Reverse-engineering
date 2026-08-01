package androidx.compose.animation.core;

import androidx.window.area.AbstractC2567;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0342 implements InterfaceC0327 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC0343 f1156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC0343 f1157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC0343 f1158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f1159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC0358 f1160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0326 f1161;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long f1162;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object f1163;

    public C0342(InterfaceC0334 interfaceC0334, InterfaceC0358 interfaceC0358, Object obj, AbstractC0343 abstractC0343) {
        C0326 c0326 = new C0326(((C0333) interfaceC0334).f1140);
        this.f1161 = c0326;
        this.f1160 = interfaceC0358;
        this.f1159 = obj;
        AbstractC0343 abstractC03432 = (AbstractC0343) interfaceC0358.mo1062().invoke(obj);
        this.f1158 = abstractC03432;
        this.f1157 = AbstractC0330.m1026(abstractC0343);
        InterfaceC6558 interfaceC6558Mo1061 = interfaceC0358.mo1061();
        if (c0326.f1099 == null) {
            c0326.f1099 = abstractC03432.mo1039();
        }
        AbstractC0343 abstractC03433 = c0326.f1099;
        if (abstractC03433 == null) {
            AbstractC4395.m8908("targetVector");
            throw null;
        }
        int iMo1040 = abstractC03433.mo1040();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03434 = c0326.f1099;
            InterfaceC0309 interfaceC0309 = c0326.f1102;
            if (i >= iMo1040) {
                if (abstractC03434 == null) {
                    AbstractC4395.m8908("targetVector");
                    throw null;
                }
                this.f1163 = interfaceC6558Mo1061.invoke(abstractC03434);
                if (c0326.f1100 == null) {
                    c0326.f1100 = abstractC03432.mo1039();
                }
                AbstractC0343 abstractC03435 = c0326.f1100;
                if (abstractC03435 == null) {
                    AbstractC4395.m8908("velocityVector");
                    throw null;
                }
                int iMo10402 = abstractC03435.mo1040();
                long jMax = 0;
                for (int i2 = 0; i2 < iMo10402; i2++) {
                    abstractC03432.getClass();
                    jMax = Math.max(jMax, interfaceC0309.mo451(abstractC0343.mo1041(i2)));
                }
                this.f1162 = jMax;
                AbstractC0343 abstractC0343M1026 = AbstractC0330.m1026(this.f1161.m998(jMax, this.f1158, abstractC0343));
                this.f1156 = abstractC0343M1026;
                int iMo10403 = abstractC0343M1026.mo1040();
                for (int i3 = 0; i3 < iMo10403; i3++) {
                    AbstractC0343 abstractC03436 = this.f1156;
                    float fMo1041 = abstractC03436.mo1041(i3);
                    float f = this.f1161.f1098;
                    abstractC03436.mo1037(AbstractC2567.m5071(fMo1041, -f, f), i3);
                }
                return;
            }
            if (abstractC03434 == null) {
                AbstractC4395.m8908("targetVector");
                throw null;
            }
            abstractC03434.mo1037(interfaceC0309.mo452(abstractC03432.mo1041(i), abstractC0343.mo1041(i)), i);
            i++;
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Object mo999(long j) {
        if (m1000(j)) {
            return this.f1163;
        }
        InterfaceC6558 interfaceC6558Mo1061 = this.f1160.mo1061();
        C0326 c0326 = this.f1161;
        AbstractC0343 abstractC0343 = c0326.f1101;
        AbstractC0343 abstractC03432 = this.f1158;
        if (abstractC0343 == null) {
            c0326.f1101 = abstractC03432.mo1039();
        }
        AbstractC0343 abstractC03433 = c0326.f1101;
        if (abstractC03433 == null) {
            AbstractC4395.m8908("valueVector");
            throw null;
        }
        int iMo1040 = abstractC03433.mo1040();
        int i = 0;
        while (true) {
            AbstractC0343 abstractC03434 = c0326.f1101;
            if (i >= iMo1040) {
                if (abstractC03434 != null) {
                    return interfaceC6558Mo1061.invoke(abstractC03434);
                }
                AbstractC4395.m8908("valueVector");
                throw null;
            }
            if (abstractC03434 == null) {
                AbstractC4395.m8908("valueVector");
                throw null;
            }
            abstractC03434.mo1037(c0326.f1102.mo450(abstractC03432.mo1041(i), this.f1157.mo1041(i), j), i);
            i++;
        }
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final AbstractC0343 mo1001(long j) {
        if (m1000(j)) {
            return this.f1156;
        }
        return this.f1161.m998(j, this.f1158, this.f1157);
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC0358 mo1002() {
        return this.f1160;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final long mo1003() {
        return this.f1162;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1004() {
        return false;
    }

    @Override // androidx.compose.animation.core.InterfaceC0327
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Object mo1005() {
        return this.f1163;
    }
}
