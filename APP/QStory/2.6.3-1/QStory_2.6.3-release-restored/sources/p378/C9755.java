package p378;

import androidx.compose.foundation.draganddrop.AbstractC1298;
import com.google.flatbuffers.C4051;
import java.nio.ByteBuffer;
import org.luckypray.dexkit.query.enums.StringMatchType;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9755 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f25478;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public StringMatchType f25479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25480;

    public C9755(String str, StringMatchType stringMatchType, boolean z) {
        str.getClass();
        stringMatchType.getClass();
        StringMatchType stringMatchType2 = StringMatchType.Contains;
        this.f25480 = str;
        this.f25479 = stringMatchType;
        this.f25478 = z;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1741(C4051 c4051) {
        String str = this.f25480;
        if (str == null) {
            C6755.m11869("value must be specified");
            return 0;
        }
        if (str.length() == 0) {
            StringMatchType stringMatchType = this.f25479;
            StringMatchType stringMatchType2 = StringMatchType.Equals;
            if (stringMatchType != stringMatchType2) {
                this.f25479 = stringMatchType2;
            }
        }
        int iM7861 = c4051.m7861(str);
        byte value = this.f25479.getValue();
        c4051.m7858(3);
        c4051.m7851(0, iM7861);
        boolean z = this.f25478;
        if (z) {
            c4051.m7857(1, 0);
            ByteBuffer byteBuffer = c4051.f11206;
            int i = c4051.f11205 - 1;
            c4051.f11205 = i;
            byteBuffer.put(i, z ? (byte) 1 : (byte) 0);
            c4051.m7856(2);
        }
        c4051.m7854(value, 1);
        int iM7864 = c4051.m7864();
        c4051.m7862(iM7864);
        return iM7864;
    }

    public C9755() {
        this.f25479 = StringMatchType.Contains;
    }
}
