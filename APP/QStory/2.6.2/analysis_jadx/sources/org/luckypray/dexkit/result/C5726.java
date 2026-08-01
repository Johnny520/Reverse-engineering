package org.luckypray.dexkit.result;

import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.jvm.internal.AbstractC4394;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.wrap.C5734;
import p052.InterfaceC6542;
import p365.AbstractC8944;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5726 extends AbstractC8944 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f15701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f15702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f15703;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC5183 f15704;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f15705;

    public C5726(final DexKitBridge dexKitBridge, final int i, final int i2, int i3, int i4, String str, int i5) {
        super(dexKitBridge, i, i2);
        this.f15703 = i3;
        this.f15702 = i4;
        this.f15701 = str;
        this.f15705 = i5;
        this.f15704 = AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.FieldData$dexField$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C5734 invoke() {
                return new C5734(this.this$0.f15701);
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.FieldData$declaredClass$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C5723 invoke() {
                return dexKitBridge.m11035(new long[]{AbstractC8944.m14538(i2, this.f15703)}).first();
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.FieldData$type$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C5723 invoke() {
                return dexKitBridge.m11035(new long[]{AbstractC8944.m14538(i2, this.f15705)}).first();
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.FieldData$annotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final List<C5722> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5726 c5726 = this;
                int i6 = i2;
                int i7 = i;
                c5726.getClass();
                return dexKitBridge2.m11048(AbstractC8944.m14538(i6, i7));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.FieldData$readers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5726 c5726 = this;
                int i6 = i2;
                int i7 = i;
                c5726.getClass();
                return dexKitBridge2.m11034(AbstractC8944.m14538(i6, i7));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.FieldData$writers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5726 c5726 = this;
                int i6 = i2;
                int i7 = i;
                c5726.getClass();
                return dexKitBridge2.m11037(AbstractC8944.m14538(i6, i7));
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5726) && AbstractC4394.m8917(((C5726) obj).f15701, this.f15701);
    }

    public final int hashCode() {
        return this.f15701.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f15702;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m11068().f15724);
        sb.append(" ");
        sb.append(m11068().f15726);
        sb.append(".");
        sb.append(m11068().f15725);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5734 m11068() {
        return (C5734) this.f15704.getValue();
    }
}
