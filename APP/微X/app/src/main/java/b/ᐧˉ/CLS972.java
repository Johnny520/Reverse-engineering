// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS502;
import b.ﾞˎ.CLS528;
import java.util.ArrayList;
import java.util.Arrays;

public final class CLS972 implements CLS2 {
    public final ContentValues FLD1912;
    public final CLS244 FLD1913;
    public final CLS359 FLD1914;

    public CLS972(CLS244 ᴵʻ0, ContentValues contentValues0, CLS359 ⁱˉ0) {
        this.FLD1913 = ᴵʻ0;
        this.FLD1912 = contentValues0;
        this.FLD1914 = ⁱˉ0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        ContentValues contentValues0 = this.FLD1912;
        ArrayList arrayList1 = new ArrayList(Arrays.asList(CLS502.MTH6941(contentValues0.getAsString("chatrooms"))));
        arrayList1.add(s);
        ArrayList arrayList2 = new ArrayList();
        for(Object object0: arrayList1) {
            arrayList2.add(this.FLD1913.FLD2541.MTH5316(((String)object0)));
            stringBuilder0.append("#chatroom ");
            stringBuilder0.append(((String)object0));
            stringBuilder0.append("|");
        }
        stringBuilder0.deleteCharAt(stringBuilder0.lastIndexOf("|"));
        new CLS528(contentValues0.getAsString("msg")).FLD5165 = stringBuilder0.toString();
        contentValues0.put("desc", CLS27.MTH889("chatroom_invite") + ": " + CLS502.MTH6923(TextUtils.join(",", arrayList2)));
        contentValues0.put("msg", "");
        contentValues0.put("chatrooms", TextUtils.join(",", arrayList1));
        this.FLD1914.notifyDataSetChanged();
    }
}

