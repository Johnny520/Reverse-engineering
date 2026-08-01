package org.luckypray.dexkit.result;

import java.util.ArrayList;
import kotlin.AbstractC6019;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.util.AbstractC6561;
import org.luckypray.dexkit.wrap.C6566;
import p050.AbstractC7176;
import p068.InterfaceC7372;
import p381.AbstractC9777;

/* JADX INFO: renamed from: org.luckypray.dexkit.result.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6553 extends AbstractC9777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f16031;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f16032;

    public C6553(DexKitBridge dexKitBridge, String str, ArrayList arrayList) {
        super(dexKitBridge, -1, -1);
        this.f16032 = str;
        this.f16031 = arrayList;
        AbstractC6019.m10773(new InterfaceC7372() { // from class: org.luckypray.dexkit.result.AnnotationData$dexClass$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final C6566 invoke() {
                return new C6566(this.this$0.f16032);
            }
        });
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("@".concat(AbstractC6561.m11690(this.f16032)));
        sb.append("(");
        int i = 0;
        for (Object obj : this.f16031) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            C6552 c6552 = (C6552) obj;
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(c6552);
            i = i2;
        }
        sb.append(")");
        return sb.toString();
    }
}
