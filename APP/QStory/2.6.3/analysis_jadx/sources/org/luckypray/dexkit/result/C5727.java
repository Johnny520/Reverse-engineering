package org.luckypray.dexkit.result;

import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.jvm.internal.AbstractC4395;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.wrap.C5735;
import p052.InterfaceC6543;
import p365.AbstractC8948;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5727 extends AbstractC8948 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f15701;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f15702;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f15703;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f15704;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f15705;

    public C5727(final DexKitBridge dexKitBridge, final int i, final int i2, int i3, int i4, String str, int i5) {
        super(dexKitBridge, i, i2);
        this.f15703 = i3;
        this.f15702 = i4;
        this.f15701 = str;
        this.f15705 = i5;
        this.f15704 = AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.FieldData$dexField$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final C5735 invoke() {
                return new C5735(this.this$0.f15701);
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.FieldData$declaredClass$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final C5724 invoke() {
                return dexKitBridge.m11092(new long[]{AbstractC8948.m14557(i2, this.f15703)}).first();
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.FieldData$type$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final C5724 invoke() {
                return dexKitBridge.m11092(new long[]{AbstractC8948.m14557(i2, this.f15705)}).first();
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.FieldData$annotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final List<C5723> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11105(AbstractC8948.m14557(i6, i7));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.FieldData$readers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11091(AbstractC8948.m14557(i6, i7));
            }
        });
        AbstractC5187.m10214(new InterfaceC6543() { // from class: org.luckypray.dexkit.result.FieldData$writers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5727 c5727 = this;
                int i6 = i2;
                int i7 = i;
                c5727.getClass();
                return dexKitBridge2.m11094(AbstractC8948.m14557(i6, i7));
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5727) && AbstractC4395.m8907(((C5727) obj).f15701, this.f15701);
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
        sb.append(m11125().f15724);
        sb.append(" ");
        sb.append(m11125().f15726);
        sb.append(".");
        sb.append(m11125().f15725);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5735 m11125() {
        return (C5735) this.f15704.getValue();
    }
}
