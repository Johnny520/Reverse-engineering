package kotlinx.serialization.json.internal;

import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0954;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6338 extends C0911 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f15574;

    public C6338(C0954 c0954, boolean z) {
        super(c0954);
        this.f15574 = z;
    }

    @Override // androidx.appcompat.app.C0911
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo753(short s) {
        if (this.f15574) {
            mo752(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((C0954) this.f484).m905(strValueOf);
    }

    @Override // androidx.appcompat.app.C0911
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo760(int i) {
        boolean z = this.f15574;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            mo752(unsignedString);
        } else {
            unsignedString.getClass();
            ((C0954) this.f484).m905(unsignedString);
        }
    }

    @Override // androidx.appcompat.app.C0911
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo761(long j) {
        boolean z = this.f15574;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            mo752(unsignedString);
        } else {
            unsignedString.getClass();
            ((C0954) this.f484).m905(unsignedString);
        }
    }

    @Override // androidx.appcompat.app.C0911
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo762(byte b) {
        if (this.f15574) {
            mo752(String.valueOf(b & DefaultClassResolver.NAME));
            return;
        }
        String strValueOf = String.valueOf(b & DefaultClassResolver.NAME);
        strValueOf.getClass();
        ((C0954) this.f484).m905(strValueOf);
    }
}
