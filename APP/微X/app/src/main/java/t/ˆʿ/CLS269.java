// Decompiled by JEB v5.42.0.202606242140

package t.ˆʿ;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import t.ʾᵢ.CLS21;
import t.ˆٴ.CLS64;
import t.ˊﾞ.CLS107;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS143;

public final class CLS269 implements CLS143 {
    public final int FLD413;
    public final CLS64 FLD414;

    public CLS269(CLS64 ˆٴ0, int v) {
        this.FLD413 = v;
        this.FLD414 = ˆٴ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ⁱʾ.CLS143
    public final void MTH2169() {
        CLS64 ˆٴ0 = this.FLD414;
        switch(this.FLD413) {
            case 0: {
                ArrayList arrayList1 = ˆٴ0.FLD533;
                HashMap hashMap0 = new HashMap();
                for(Object object0: arrayList1) {
                    CLS107 ᵔʾ0 = (CLS107)object0;
                    if(!CLS33.MTH1346(ᵔʾ0.FLD799)) {
                        hashMap0.put(ᵔʾ0.FLD799, ᵔʾ0);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                CLS34.FLD463.getClass();
                ArrayList arrayList3 = new ArrayList();
                String s = CLS133.MTH2116("q_db34");
                Cursor cursor0 = CLS34.FLD463.MTH1364(s, null);
                if(cursor0 != null) {
                    if(cursor0.moveToFirst()) {
                        while(true) {
                            String s1 = cursor0.getString(cursor0.getColumnIndex("username"));
                            if(!CLS33.MTH1346(s1)) {
                                arrayList3.add(s1);
                            }
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                        }
                    }
                    cursor0.close();
                }
                HashSet hashSet0 = new HashSet();
                for(Object object1: arrayList3) {
                    String s2 = (String)object1;
                    if(hashMap0.containsKey(s2) && !CLS33.MTH1346(s2)) {
                        hashSet0.add(s2);
                        arrayList2.add(((CLS107)hashMap0.get(s2)));
                    }
                }
                HashSet hashSet1 = new HashSet();
                for(Object object2: arrayList1) {
                    CLS107 ᵔʾ1 = (CLS107)object2;
                    if(!hashSet0.contains(ᵔʾ1.FLD799)) {
                        String s3 = ᵔʾ1.FLD799;
                        if(!hashSet1.contains(s3)) {
                            hashSet1.add(s3);
                            arrayList2.add(ᵔʾ1);
                        }
                    }
                }
                ˆٴ0.MTH1521(arrayList2);
                return;
            }
            case 1: {
                ArrayList arrayList4 = new ArrayList(ˆٴ0.FLD533);
                try {
                    Collections.sort(arrayList4, Comparator.comparing(new CLS21(1)));
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                ˆٴ0.MTH1521(arrayList4);
                return;
            }
            default: {
                ArrayList arrayList0 = new ArrayList(ˆٴ0.FLD533);
                Collections.reverse(arrayList0);
                ˆٴ0.MTH1521(arrayList0);
            }
        }
    }
}

