package kotlinx.serialization.json.internal;

import io.ktor.util.C4211;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4395;
import p088.AbstractC7148;
import p088.AbstractC7176;
import p088.C7150;
import p088.C7152;
import p088.C7155;
import p088.C7157;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5502 extends C5499 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f15218;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public String f15219;

    @Override // kotlinx.serialization.json.internal.C5499
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo10728(String str, AbstractC7176 abstractC7176) {
        str.getClass();
        abstractC7176.getClass();
        if (!this.f15218) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f15207;
            String str2 = this.f15219;
            if (str2 == null) {
                AbstractC4395.m8908("tag");
                throw null;
            }
            linkedHashMap.put(str2, abstractC7176);
            this.f15218 = true;
            return;
        }
        if (abstractC7176 instanceof AbstractC7148) {
            this.f15219 = ((AbstractC7148) abstractC7176).mo12423();
            this.f15218 = false;
        } else {
            if (abstractC7176 instanceof C7152) {
                throw AbstractC5507.m10743(C7150.f19111);
            }
            if (abstractC7176 instanceof C7157) {
                throw AbstractC5507.m10743(C7155.f19119);
            }
            C4211.m8611();
        }
    }

    @Override // kotlinx.serialization.json.internal.C5499
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final AbstractC7176 mo10731() {
        return new C7152((LinkedHashMap) this.f15207);
    }
}
