package org.luckypray.dexkit.result;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4394;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.wrap.C5735;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p365.AbstractC8944;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5723 extends AbstractC8944 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Integer f15688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f15689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f15690;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f15691;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f15692;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC5183 f15693;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC5183 f15694;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f15695;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC5183 f15696;

    public C5723(final DexKitBridge dexKitBridge, final int i, final int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.f15690 = i3;
        this.f15689 = str;
        this.f15688 = num;
        this.f15692 = arrayList;
        this.f15691 = arrayList2;
        this.f15695 = arrayList3;
        this.f15696 = AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.ClassData$dexClass$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C5735 invoke() {
                return new C5735(this.this$0.f15689);
            }
        });
        this.f15693 = AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.ClassData$superClass$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C5723 invoke() {
                Integer num2 = this.this$0.f15688;
                if (num2 != null) {
                    return dexKitBridge.m11035(new long[]{AbstractC8944.m14538(i2, num2.intValue())}).firstOrNull();
                }
                return null;
            }
        });
        this.f15694 = AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.ClassData$interfaces$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final ClassDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                ArrayList arrayList4 = this.f15692;
                int i4 = i2;
                ArrayList arrayList5 = new ArrayList(AbstractC4344.m8832(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(Long.valueOf(AbstractC8944.m14538(i4, ((Number) it.next()).intValue())));
                }
                return dexKitBridge2.m11035(AbstractC4343.m8805(arrayList5));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.ClassData$methods$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                ArrayList arrayList4 = this.f15691;
                int i4 = i2;
                ArrayList arrayList5 = new ArrayList(AbstractC4344.m8832(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(Long.valueOf(AbstractC8944.m14538(i4, ((Number) it.next()).intValue())));
                }
                return dexKitBridge2.m11045(AbstractC4343.m8805(arrayList5));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.ClassData$fields$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final FieldDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                ArrayList arrayList4 = this.f15695;
                int i4 = i2;
                ArrayList arrayList5 = new ArrayList(AbstractC4344.m8832(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(Long.valueOf(AbstractC8944.m14538(i4, ((Number) it.next()).intValue())));
                }
                return dexKitBridge2.m11047(AbstractC4343.m8805(arrayList5));
            }
        });
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.ClassData$annotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final List<C5722> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C5723 c5723 = this;
                int i4 = i2;
                int i5 = i;
                c5723.getClass();
                return dexKitBridge2.m11052(AbstractC8944.m14538(i4, i5));
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5723) {
            return AbstractC4394.m8917(this.f15689, ((C5723) obj).f15689);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15689.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f15690;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + m11067().f15727);
        C5723 c5723 = (C5723) this.f15693.getValue();
        if (c5723 != null) {
            sb.append(" extends ");
            sb.append(c5723.m11067().f15727);
        }
        if (this.f15692.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC4343.m8813((ClassDataList) this.f15694.getValue(), ", ", null, null, new InterfaceC6557() { // from class: org.luckypray.dexkit.result.ClassData$toString$1$2
                @Override // p052.InterfaceC6557
                public final CharSequence invoke(C5723 c57232) {
                    c57232.getClass();
                    return c57232.m11067().f15727;
                }
            }, 30));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5735 m11067() {
        return (C5735) this.f15696.getValue();
    }
}
