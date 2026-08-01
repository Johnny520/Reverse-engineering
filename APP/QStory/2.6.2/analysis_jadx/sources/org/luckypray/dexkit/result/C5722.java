package org.luckypray.dexkit.result;

import java.util.ArrayList;
import kotlin.AbstractC5186;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.util.AbstractC5730;
import org.luckypray.dexkit.wrap.C5735;
import p052.InterfaceC6542;
import p253.AbstractC8189;
import p365.AbstractC8944;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5722 extends AbstractC8944 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f15686;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f15687;

    public C5722(DexKitBridge dexKitBridge, String str, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f15687 = str;
        this.f15686 = arrayList;
        AbstractC5186.m10210(new InterfaceC6542() { // from class: org.luckypray.dexkit.result.AnnotationData$dexClass$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final C5735 invoke() {
                return new C5735(this.this$0.f15687);
            }
        });
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@".concat(AbstractC5730.m11074(this.f15687)));
        sb.append("(");
        int i = 0;
        for (Object obj : this.f15686) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            C5721 c5721 = (C5721) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c5721);
            i = i2;
        }
        sb.append(")");
        return sb.toString();
    }
}
