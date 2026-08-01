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
import java.util.Iterator;

public final class CLS1038 implements CLS2 {
    public final ContentValues FLD2199;
    public final CLS359 FLD2200;

    public CLS1038(ContentValues contentValues0, CLS359 ⁱˉ0) {
        this.FLD2199 = contentValues0;
        this.FLD2200 = ⁱˉ0;
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
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            arrayList1.add("");
            stringBuilder0.append("#chatroom ");
            stringBuilder0.append("");
            stringBuilder0.append("|");
        }
        stringBuilder0.deleteCharAt(stringBuilder0.lastIndexOf("|"));
        new CLS528(this.FLD2199.getAsString("msg")).FLD5165 = stringBuilder0.toString();
        this.FLD2199.put("desc", CLS27.MTH889("chatroom_invite") + ": " + CLS502.MTH6923(s1));
        this.FLD2199.put("msg", "");
        String s2 = TextUtils.join(",", arrayList1);
        this.FLD2199.put("chatrooms", s2);
        this.FLD2200.notifyDataSetChanged();
    }
}

