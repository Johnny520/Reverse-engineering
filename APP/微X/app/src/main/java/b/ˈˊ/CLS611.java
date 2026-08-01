// Decompiled by JEB v5.42.0.202606242140

package b.ˈˊ;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.TextView;
import b.ʻˑ.CLS9;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.יᐧ.CLS151.CLS148;
import b.ـˏ.CLS169;
import b.ٴـ.CLS896.CLS170;
import b.ᵔʾ.CLS288;
import b.ᵔʾ.CLS295.CLS294;
import b.ᵔʾ.CLS295;
import b.ⁱʾ.CLS363.CLS362;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS611 implements CLS9, CLS148, CLS362 {
    public final HashSet FLD488;

    public CLS611(HashSet hashSet0) {
        this.FLD488 = hashSet0;
        super();
    }

    @Override  // b.ʻˑ.CLS9
    public final boolean MTH787(String s) {
        return this.FLD488.contains(s);
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱʾ.CLS363$CLS362
    public final void MTH5249(TextView textView0, CLS78 ˊﾞ0) {
        CLS294 ˑٴ$ˆٴ0 = (CLS294)CLS295.FLD3055.FLD3052.MTH1744("");
        if(ˑٴ$ˆٴ0 != null && ˑٴ$ˆٴ0.FLD3048 == 1) {
            HashSet hashSet0 = this.FLD488;
            if(!hashSet0.contains("")) {
                if(!CLS502.MTH6933(ˑٴ$ˆٴ0.FLD3044)) {
                    ˊﾞ0.FLD277 = ˑٴ$ˆٴ0.FLD3044;
                }
                ˊﾞ0.FLD278 = ˑٴ$ˆٴ0.FLD3049;
                ˊﾞ0.FLD275 = ˑٴ$ˆٴ0.FLD3045;
                ˊﾞ0.FLD273 = ˑٴ$ˆٴ0.FLD3046;
                CLS371 ʻ0 = CLS371.FLD3470;
                if(ʻ0.MTH5382(ˑٴ$ˆٴ0.FLD3046)) {
                    String s = ˑٴ$ˆٴ0.FLD3046;
                    ContentValues contentValues0 = ʻ0.MTH5359(s);
                    if(contentValues0 != null) {
                        String s1 = contentValues0.getAsString("wxid");
                        if(!TextUtils.isEmpty(s1)) {
                            s = s1;
                        }
                    }
                    if(!ˊﾞ0.MTH1612()) {
                        ˊﾞ0.FLD270 = CLS372.MTH5411(s);
                    }
                    String s2 = CLS66.MTH1519(s);
                    if(!TextUtils.isEmpty(s2)) {
                        ˊﾞ0.FLD277 = s2;
                    }
                }
                else if(ˑٴ$ˆٴ0.FLD3042 != null && !ˊﾞ0.MTH1612()) {
                    ˊﾞ0.FLD270 = ˑٴ$ˆٴ0.FLD3042;
                }
                hashSet0.add("");
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("<b>");
        stringBuilder0.append("");
        stringBuilder0.append("</b>");
        String s3 = ˊﾞ0.FLD277;
        int v = ˊﾞ0.FLD278;
        if(v != -1) {
            stringBuilder0.append("<br>");
            if(v == 1) {
                stringBuilder0.append(CLS27.MTH889(CLS370.MTH5289(4101357695804429109L)));
            }
            else if(v == 2) {
                stringBuilder0.append(CLS27.MTH889(CLS370.MTH5289(4101357743049069365L)));
            }
        }
        if(!TextUtils.isEmpty(s3)) {
            stringBuilder0.append("<br><small><i>");
            stringBuilder0.append(s3);
            stringBuilder0.append("</i></small>");
        }
        if(CLS371.FLD3470.MTH5382("") || CLS371.FLD3470.MTH5382(ˊﾞ0.FLD273)) {
            stringBuilder0.append("<br>");
            stringBuilder0.append(CLS27.MTH889(CLS370.MTH5289(0x38EAF3D12B3CD335L)));
        }
        else if(CLS288.FLD2989.MTH4730("") || CLS288.FLD2989.MTH4730(ˊﾞ0.FLD273)) {
            stringBuilder0.append("<br>");
            stringBuilder0.append(CLS27.MTH889(CLS370.MTH5289(0x38EAF3E72B3CD335L)));
        }
        if(ˑٴ$ˆٴ0 != null && ˑٴ$ˆٴ0.FLD3048 != 1) {
            stringBuilder0.append("<br>");
            stringBuilder0.append(CLS27.MTH889("user_not_found"));
        }
        CLS523.MTH7155(textView0, stringBuilder0.toString());
    }

    // 此方法包含解密的字符串
    @Override  // b.יᐧ.CLS151$CLS148
    public final void MTH3131(SparseArray sparseArray0) {
        for(int v = 0; v < sparseArray0.size(); ++v) {
            CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)sparseArray0.get(sparseArray0.keyAt(v))), 2);
            ArrayList arrayList0 = new ArrayList(this.FLD488);
            ˆٴ$ˆٴ0.FLD1627.addAll(arrayList0);
            CLS21.FLD76.MTH818("sendMessageForwardItem", new Object[]{ˆٴ$ˆٴ0, Boolean.TRUE});
        }
    }
}

