package kotlinx.serialization.json.internal;

import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0107;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5506 extends C0064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f15229;

    public C5506(C0107 c0107, boolean z) {
        super(c0107);
        this.f15229 = z;
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo193(short s) {
        if (this.f15229) {
            mo192(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((C0107) this.f139).m345(strValueOf);
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo200(int i) {
        boolean z = this.f15229;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo192(unsignedString);
        } else {
            unsignedString.getClass();
            ((C0107) this.f139).m345(unsignedString);
        }
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo201(long j) {
        boolean z = this.f15229;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo192(unsignedString);
        } else {
            unsignedString.getClass();
            ((C0107) this.f139).m345(unsignedString);
        }
    }

    @Override // androidx.appcompat.app.C0064
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo202(byte b) {
        if (this.f15229) {
            mo192(String.valueOf(b & DefaultClassResolver.NAME));
            return;
        }
        String strValueOf = String.valueOf(b & DefaultClassResolver.NAME);
        strValueOf.getClass();
        ((C0107) this.f139).m345(strValueOf);
    }
}
