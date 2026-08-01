package p366;

import com.bumptech.glide.AbstractC3055;
import com.google.flatbuffers.C3218;
import java.nio.ByteBuffer;
import org.luckypray.dexkit.query.enums.StringMatchType;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏子兰哲楪世.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8945 extends AbstractC3055 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f25149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public StringMatchType f25150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f25151;

    public C8945(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        StringMatchType stringMatchType2 = StringMatchType.Contains;
        this.f25151 = str;
        this.f25150 = stringMatchType;
        this.f25149 = z;
    }

    @Override // com.bumptech.glide.AbstractC3055
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final int mo6650(C3218 c3218) {
        String str = this.f25151;
        if (str == null) {
            C5919.m11249("value must be specified");
            return 0;
        }
        if (str.length() == 0) {
            StringMatchType stringMatchType = this.f25150;
            StringMatchType stringMatchType2 = StringMatchType.Equals;
            if (stringMatchType != stringMatchType2) {
                this.f25150 = stringMatchType2;
            }
        }
        int iM7315 = c3218.m7315(str);
        byte value = this.f25150.getValue();
        c3218.m7312(3);
        c3218.m7305(0, iM7315);
        boolean z = this.f25149;
        if (z) {
            c3218.m7311(1, 0);
            ByteBuffer byteBuffer = c3218.f10856;
            int i = c3218.f10855 - 1;
            c3218.f10855 = i;
            byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
            c3218.m7310(2);
        }
        c3218.m7308(value, 1);
        int iM7318 = c3218.m7318();
        c3218.m7316(iM7318);
        return iM7318;
    }

    public C8945() {
        this.f25150 = StringMatchType.Contains;
    }
}
