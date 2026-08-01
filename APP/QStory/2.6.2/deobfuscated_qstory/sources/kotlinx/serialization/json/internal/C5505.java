package kotlinx.serialization.json.internal;

import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0107;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5505 extends C0064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f15229;

    public C5505(C0107 c0107, boolean z) {
        super(c0107);
        this.f15229 = z;
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo192(short s) {
        if (this.f15229) {
            mo191(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((C0107) this.f139).m344(strValueOf);
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo199(int i) {
        boolean z = this.f15229;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo191(unsignedString);
        } else {
            unsignedString.getClass();
            ((C0107) this.f139).m344(unsignedString);
        }
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo200(long j) {
        boolean z = this.f15229;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo191(unsignedString);
        } else {
            unsignedString.getClass();
            ((C0107) this.f139).m344(unsignedString);
        }
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo201(byte b) {
        if (this.f15229) {
            mo191(String.valueOf(b & DefaultClassResolver.NAME));
            return;
        }
        String strValueOf = String.valueOf(b & DefaultClassResolver.NAME);
        strValueOf.getClass();
        ((C0107) this.f139).m344(strValueOf);
    }
}
