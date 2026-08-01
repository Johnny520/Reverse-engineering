package p000;

import androidx.core.graphics.drawable.C1010;
import androidx.core.widget.C1011;
import androidx.legacy.content.C1013;
import com.github.megatronking.stringfog.Base64;
import com.github.megatronking.stringfog.xor.StringFogImpl;
import com.google.android.material.carousel.C1027;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.internal.C1038;
import kotlinx.coroutines.C1055;

/* JADX INFO: loaded from: classes.dex */
public abstract class b50 {

    /* JADX INFO: renamed from: a */
    public static final StringFogImpl f682a = new StringFogImpl();

    /* JADX INFO: renamed from: a */
    public static String m492a(String str, String str2) {
        int iM3039 = C1032.m3039("ۤۤۦ");
        byte[] bArrDecode = null;
        byte[] bArr = null;
        while (true) {
            switch (iM3039) {
                case 56507:
                    iM3039 = (C1027.f5674 % C1011.f5658) + 1751151;
                    break;
                case 1747934:
                    return f682a.decrypt(bArrDecode, bArr);
                case 1751654:
                    bArrDecode = Base64.decode(str, 0);
                    iM3039 = (C1013.f5660 * C1055.f5702) + 1605030;
                    break;
                case 1751748:
                    byte[] bArrDecode2 = Base64.decode(str2, 0);
                    iM3039 = 1747933 + (C1010.f5657 / C1038.f5685);
                    bArr = bArrDecode2;
                    break;
            }
        }
    }
}
