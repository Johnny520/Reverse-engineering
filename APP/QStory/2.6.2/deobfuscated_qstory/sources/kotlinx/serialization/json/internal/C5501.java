package kotlinx.serialization.json.internal;

import io.ktor.util.C4210;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4394;
import p088.AbstractC7147;
import p088.AbstractC7175;
import p088.C7149;
import p088.C7151;
import p088.C7154;
import p088.C7156;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5501 extends C5498 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f15218;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public String f15219;

    @Override // kotlinx.serialization.json.internal.C5498
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final void mo10676(String str, AbstractC7175 abstractC7175) {
        str.getClass();
        abstractC7175.getClass();
        if (!this.f15218) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f15207;
            String str2 = this.f15219;
            if (str2 == null) {
                AbstractC4394.m8918("tag");
                throw null;
            }
            linkedHashMap.put(str2, abstractC7175);
            this.f15218 = true;
            return;
        }
        if (abstractC7175 instanceof AbstractC7147) {
            this.f15219 = ((AbstractC7147) abstractC7175).mo12396();
            this.f15218 = false;
        } else {
            if (abstractC7175 instanceof C7151) {
                throw AbstractC5506.m10686(C7149.f19116);
            }
            if (abstractC7175 instanceof C7156) {
                throw AbstractC5506.m10686(C7154.f19124);
            }
            C4210.m8621();
        }
    }

    @Override // kotlinx.serialization.json.internal.C5498
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final AbstractC7175 mo10678() {
        return new C7151((LinkedHashMap) this.f15207);
    }
}
