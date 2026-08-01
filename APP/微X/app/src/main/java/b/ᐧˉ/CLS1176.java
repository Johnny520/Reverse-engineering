// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ˈˈ.CLS78;
import b.ⁱʾ.CLS359;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public final class CLS1176 implements CLS3 {
    public final int FLD2729;
    public final CLS359 FLD2730;
    public final ContentValues FLD2731;
    public final CLS244 FLD2732;
    public final Activity FLD2733;

    public CLS1176(int v, Activity activity0, ContentValues contentValues0, CLS359 ⁱˉ0, CLS244 ᴵʻ0) {
        this.FLD2729 = v;
        this.FLD2732 = ᴵʻ0;
        this.FLD2731 = contentValues0;
        this.FLD2733 = activity0;
        this.FLD2730 = ⁱˉ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Activity activity0 = this.FLD2733;
        CLS359 ⁱˉ0 = this.FLD2730;
        ContentValues contentValues0 = this.FLD2731;
        CLS244 ᴵʻ0 = this.FLD2732;
        if(this.FLD2729 == 0) {
            ᴵʻ0.getClass();
            ArrayList arrayList0 = new ArrayList();
            ᴵʻ0.FLD2541.MTH5313(ᴵʻ0.FLD2546, arrayList0);
            HashSet hashSet0 = new HashSet(Arrays.asList(CLS502.MTH6941(contentValues0.getAsString("chatrooms"))));
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                CLS78 ˊﾞ0 = (CLS78)object0;
                if(!hashSet0.contains("")) {
                    hashSet0.add("");
                    arrayList1.add(ˊﾞ0);
                }
            }
            CLS372.MTH5405(arrayList1);
            CLS387.MTH5600(true, activity0, arrayList1, ((CLS2)new CLS1127(ᴵʻ0, contentValues0, ⁱˉ0)));
            return;
        }
        ᴵʻ0.getClass();
        ArrayList arrayList2 = new ArrayList();
        ᴵʻ0.FLD2541.MTH5313(ᴵʻ0.FLD2546, arrayList2);
        HashSet hashSet1 = new HashSet(Arrays.asList(CLS502.MTH6941(contentValues0.getAsString("chatrooms"))));
        ArrayList arrayList3 = new ArrayList();
        for(Object object1: arrayList2) {
            CLS78 ˊﾞ1 = (CLS78)object1;
            if(!hashSet1.contains("")) {
                hashSet1.add("");
                arrayList3.add(ˊﾞ1);
            }
        }
        CLS372.MTH5405(arrayList3);
        CLS387.MTH5600(true, activity0, arrayList3, ((CLS2)new CLS972(ᴵʻ0, contentValues0, ⁱˉ0)));
    }
}

