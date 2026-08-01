package p362;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import com.google.flatbuffers.C3219;
import java.nio.ByteBuffer;
import org.luckypray.dexkit.query.enums.StringMatchType;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8926 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f25133;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public StringMatchType f25134;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25135;

    public C8926(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        StringMatchType stringMatchType2 = StringMatchType.Contains;
        this.f25135 = str;
        this.f25134 = stringMatchType;
        this.f25133 = z;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1181(C3219 c3219) {
        String str = this.f25135;
        if (str == null) {
            C5925.m11310("value must be specified");
            return 0;
        }
        if (str.length() == 0) {
            StringMatchType stringMatchType = this.f25134;
            StringMatchType stringMatchType2 = StringMatchType.Equals;
            if (stringMatchType != stringMatchType2) {
                this.f25134 = stringMatchType2;
            }
        }
        int iM7302 = c3219.m7302(str);
        byte value = this.f25134.getValue();
        c3219.m7299(3);
        c3219.m7292(0, iM7302);
        boolean z = this.f25133;
        if (z) {
            c3219.m7298(1, 0);
            ByteBuffer byteBuffer = c3219.f10861;
            int i = c3219.f10860 - 1;
            c3219.f10860 = i;
            byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
            c3219.m7297(2);
        }
        c3219.m7295(value, 1);
        int iM7305 = c3219.m7305();
        c3219.m7303(iM7305);
        return iM7305;
    }

    public C8926() {
        this.f25134 = StringMatchType.Contains;
    }
}
