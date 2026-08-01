package org.luckypray.dexkit.result;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5227;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.wrap.C6566;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p381.AbstractC9777;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6554 extends AbstractC9777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Integer f16033;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f16034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f16035;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final ArrayList f16036;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f16037;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC6016 f16038;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC6016 f16039;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f16040;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6016 f16041;

    public C6554(final DexKitBridge dexKitBridge, final int i, final int i2, int i3, String str, Integer num, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(dexKitBridge, i, i2);
        this.f16035 = i3;
        this.f16034 = str;
        this.f16033 = num;
        this.f16037 = arrayList;
        this.f16036 = arrayList2;
        this.f16040 = arrayList3;
        this.f16041 = AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.ClassData$dexClass$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C6566 invoke() {
                return new C6566(this.this$0.f16034);
            }
        });
        this.f16038 = AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.ClassData$superClass$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C6554 invoke() {
                Integer num2 = this.this$0.f16033;
                if (num2 != null) {
                    return dexKitBridge.m11651(new long[]{AbstractC9777.m15116(i2, num2.intValue())}).firstOrNull();
                }
                return null;
            }
        });
        this.f16039 = AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.ClassData$interfaces$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final ClassDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                ArrayList arrayList4 = this.f16037;
                int i4 = i2;
                ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(Long.valueOf(AbstractC9777.m15116(i4, ((Number) it.next()).intValue())));
                }
                return dexKitBridge2.m11651(AbstractC5176.m9344(arrayList5));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.ClassData$methods$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final MethodDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                ArrayList arrayList4 = this.f16036;
                int i4 = i2;
                ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(Long.valueOf(AbstractC9777.m15116(i4, ((Number) it.next()).intValue())));
                }
                return dexKitBridge2.m11661(AbstractC5176.m9344(arrayList5));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.ClassData$fields$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final FieldDataList invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                ArrayList arrayList4 = this.f16040;
                int i4 = i2;
                ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    arrayList5.add(Long.valueOf(AbstractC9777.m15116(i4, ((Number) it.next()).intValue())));
                }
                return dexKitBridge2.m11663(AbstractC5176.m9344(arrayList5));
            }
        });
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.ClassData$annotations$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final List<C6553> invoke() {
                DexKitBridge dexKitBridge2 = dexKitBridge;
                C6554 c6554 = this;
                int i4 = i2;
                int i5 = i;
                c6554.getClass();
                return dexKitBridge2.m11668(AbstractC9777.m15116(i4, i5));
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6554) {
            return AbstractC5227.m9466(this.f16034, ((C6554) obj).f16034);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16034.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f16035;
        if (i > 0) {
            sb.append(Modifier.toString(i) + " ");
        }
        sb.append("class " + m11683().f16072);
        C6554 c6554 = (C6554) this.f16038.getValue();
        if (c6554 != null) {
            sb.append(" extends ");
            sb.append(c6554.m11683().f16072);
        }
        if (this.f16037.size() > 0) {
            sb.append(" implements ");
            sb.append(AbstractC5176.m9369((ClassDataList) this.f16039.getValue(), ", ", null, null, new InterfaceC7387() { // from class: org.luckypray.dexkit.result.ClassData$toString$1$2
                @Override // p068.InterfaceC7387
                public final CharSequence invoke(C6554 c65542) {
                    c65542.getClass();
                    return c65542.m11683().f16072;
                }
            }, 30));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6566 m11683() {
        return (C6566) this.f16041.getValue();
    }
}
