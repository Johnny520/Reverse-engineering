// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.database.Cursor;
import android.text.TextUtils;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS1606;
import b.ⁱᵔ.CLS1649;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class CLS714 implements CLS35 {
    public final int FLD850;
    public final CLS877 FLD851;

    public CLS714(CLS877 ﹶﾞ0, int v) {
        this.FLD850 = v;
        this.FLD851 = ﹶﾞ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object1;
        long v7;
        long v5;
        int v4;
        long v3;
        Object object0 = null;
        CLS877 ﹶﾞ0 = this.FLD851;
        if(this.FLD850 == 0) {
            ﹶﾞ0.getClass();
            if("sns_fake_comments".equals(((String)arr_object[0]))) {
                long v1 = (long)(((Long)arr_object[1]));
                Class class0 = CLS27.MTH894("snsAttrClass");
                Cursor cursor0 = ﹶﾞ0.FLD1446.MTH5763(v1);
                if(cursor0 == null) {
                    v4 = 0;
                    v5 = 0L;
                }
                else {
                    if(cursor0.moveToFirst()) {
                        int v2 = CLS182.MTH3490(4102181509186507573L, cursor0);
                        v3 = CLS34.MTH1076(0x38EDE0642B3CD335L, cursor0);
                        object0 = CLS66.MTH1381(class0, cursor0.getBlob(cursor0.getColumnIndex("attrBuf")));
                        v4 = v2;
                    }
                    else {
                        v4 = 0;
                        v3 = 0L;
                    }
                    cursor0.close();
                    v5 = v3;
                }
                if(v5 <= 0L && object0 != null) {
                    List[] arr_list = {((List)CLS182.MTH3492(0x38EDE0722B3CD335L, object0))};
                    Activity activity0 = ((CLS140)ﹶﾞ0).MTH3042();
                    CLS637 ʼ0 = new CLS637(v4, v5, ﹶﾞ0, object0, arr_list);
                    CLS741 ˑⁱ0 = new CLS741(v4, v5, ﹶﾞ0, object0, arr_list);
                    CLS29 ˎᵢ0 = CLS27.MTH895();
                    CLS523.MTH7151(activity0, CLS27.MTH889("sns_fake_comments"), ((CLS17)new CLS1606(activity0, ˎᵢ0, 1)), ((CLS11)new CLS1649(ˑⁱ0, ˎᵢ0, ʼ0)), CLS27.MTH889("clearFakeComments"));
                }
            }
            return;
        }
        ﹶﾞ0.getClass();
        if("sns_selflike".equals(((String)arr_object[0]))) {
            long v6 = (long)(((Long)arr_object[1]));
            Class class1 = CLS27.MTH894("snsAttrClass");
            Cursor cursor1 = ﹶﾞ0.FLD1446.MTH5763(v6);
            if(cursor1 == null) {
                object1 = null;
                v7 = 0L;
            }
            else {
                if(cursor1.moveToFirst()) {
                    v7 = CLS34.MTH1076(0x38EDE0AB2B3CD335L, cursor1);
                    object0 = CLS66.MTH1381(class1, cursor1.getBlob(cursor1.getColumnIndex("attrBuf")));
                }
                else {
                    v7 = 0L;
                }
                cursor1.close();
                object1 = object0;
            }
            if(v7 <= 0L && object1 != null) {
                Object object2 = CLS182.MTH3492(0x38EDE0B92B3CD335L, object1);
                HashSet hashSet0 = new HashSet();
                if(!((List)object2).isEmpty()) {
                    for(Object object3: ((List)object2)) {
                        hashSet0.add(((String)CLS182.MTH3492(4102182561453495093L, object3)));
                    }
                }
                ArrayList arrayList0 = new ArrayList();
                CLS29 ˎᵢ1 = ﹶﾞ0.FLD1445;
                boolean z = ˎᵢ1.MTH938("fakelikes_use_all_contacts", false);
                CLS371 ʻ0 = ﹶﾞ0.FLD1444;
                if(z) {
                    ʻ0.MTH5348(arrayList0);
                }
                else {
                    ʻ0.MTH5305("", arrayList0);
                }
                String s = ˎᵢ1.MTH925("fake_excl", "");
                if(!TextUtils.isEmpty(s)) {
                    Iterator iterator1 = arrayList0.iterator();
                    while(iterator1.hasNext()) {
                        iterator1.next();
                        if(CLS502.MTH6934(s, new String[]{""})) {
                            iterator1.remove();
                        }
                    }
                }
                if(ˎᵢ1.MTH938("fakelikes_random_sort", false)) {
                    Collections.shuffle(arrayList0);
                }
                if(ˎᵢ1.MTH938("selflikes_autoselect_enable", false)) {
                    int v8 = Math.min(arrayList0.size(), ˎᵢ1.MTH927(50, "fakelikes_autoselect_cnt"));
                    for(int v = 0; hashSet0.size() < v8; ++v) {
                        CLS78 ˊﾞ0 = (CLS78)arrayList0.get(v);
                        if(!hashSet0.contains("")) {
                            hashSet0.add("");
                        }
                    }
                }
                CLS387.MTH5586(false, ((CLS140)ﹶﾞ0).MTH3042(), arrayList0, ((CLS2)new CLS807(ﹶﾞ0, v7, object1, ((List)object2))), CLS27.MTH889("clearFakeLikes"), TextUtils.join(",", hashSet0), -1);
            }
        }
    }
}

