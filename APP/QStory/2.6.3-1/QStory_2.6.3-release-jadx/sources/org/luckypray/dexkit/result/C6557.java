package org.luckypray.dexkit.result;

import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.jvm.internal.AbstractC5227;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.wrap.C6565;
import p068.InterfaceC7372;
import p381.AbstractC9777;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6557 extends AbstractC9777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f16046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f16047;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f16048;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f16049;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f16050;

    public C6557(final DexKitBridge dexKitBridge, final int i, final int i2, int i3, int i4, String str, int i5) {
        super(dexKitBridge, i, i2);
        this.f16048 = i3;
        this.f16047 = i4;
        this.f16046 = str;
        this.f16050 = i5;
        this.f16049 = AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.FieldData$dexField$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C6565 invoke() {
                return new C6565(this.this$0.f16046);
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.FieldData$declaredClass$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C6554 invoke() {
                return dexKitBridge.m11651(new long[]{AbstractC9777.m15116(i2, this.f16048)}).first();
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.FieldData$type$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C6554 invoke() {
                return dexKitBridge.m11651(new long[]{AbstractC9777.m15116(i2, this.f16050)}).first();
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.FieldData$annotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final List<C6553> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6557 c6557 = this;
                int i6 = i2;
                int i7 = i;
                c6557.getClass();
                return dexKitBridge2.m11664(AbstractC9777.m15116(i6, i7));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.FieldData$readers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6557 c6557 = this;
                int i6 = i2;
                int i7 = i;
                c6557.getClass();
                return dexKitBridge2.m11650(AbstractC9777.m15116(i6, i7));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.FieldData$writers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6557 c6557 = this;
                int i6 = i2;
                int i7 = i;
                c6557.getClass();
                return dexKitBridge2.m11653(AbstractC9777.m15116(i6, i7));
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6557) && AbstractC5227.m9466(((C6557) obj).f16046, this.f16046);
    }

    public final int hashCode() {
        return this.f16046.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f16047;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append(m11684().f16069);
        sb.append(" ");
        sb.append(m11684().f16071);
        sb.append(".");
        sb.append(m11684().f16070);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6565 m11684() {
        return (C6565) this.f16049.getValue();
    }
}
