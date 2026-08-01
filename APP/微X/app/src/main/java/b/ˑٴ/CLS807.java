// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS45;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ⁱᵔ.CLS396;
import java.util.ArrayList;
import java.util.List;

public final class CLS807 implements CLS2 {
    public final long FLD1201;
    public final List FLD1202;
    public final Object FLD1203;
    public final CLS877 FLD1204;

    public CLS807(CLS877 ﹶﾞ0, long v, Object object0, List list0) {
        this.FLD1204 = ﹶﾞ0;
        this.FLD1201 = v;
        this.FLD1203 = object0;
        this.FLD1202 = list0;
        super();
    }

    @Override  // b.ʻˑ.CLS2
    public final void MTH772() {
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS2
    public final void MTH773(String s, String s1, ArrayList arrayList0) {
        int v5;
        Throwable throwable1;
        String s2;
        int v2;
        Object object2;
        CLS877 ﹶﾞ0 = this.FLD1204;
        ﹶﾞ0.getClass();
        Class class0 = CLS27.MTH894("snsLikeClass");
        if(class0 != null) {
            Object object0 = this.FLD1203;
            if(object0 != null) {
                List list0 = this.FLD1202;
                list0.clear();
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    long v = System.currentTimeMillis();
                    int v1 = 0;
                    for(Object object1: arrayList0) {
                        CLS78 ˊﾞ0 = (CLS78)object1;
                        try {
                            object2 = CLS166.MTH3188(class0, new Object[0]);
                            CLS166.MTH3198(object2, CLS27.MTH897("snsFieldUsername"), "");
                            CLS166.MTH3198(object2, CLS27.MTH897("snsFieldNickname"), "");
                            CLS166.MTH3198(object2, CLS27.MTH897("snsFieldType"), 1);
                            v2 = v1;
                            s2 = CLS27.MTH897("snsFieldCreateTime");
                            v2 = v1 + 1;
                        }
                        catch(Throwable throwable0) {
                            throwable1 = throwable0;
                            goto label_30;
                        }
                        try {
                            CLS166.MTH3196(v1 + ((int)(v / 1000L)), object2, s2);
                            list0.add(object2);
                            goto label_31;
                        }
                        catch(Throwable throwable1) {
                        }
                    label_30:
                        CLS27.MTH893(throwable1);
                    label_31:
                        v1 = v2;
                    }
                }
                long v3 = this.FLD1201;
                if(arrayList0 == null || arrayList0.isEmpty()) {
                    ﹶﾞ0.MTH3092().MTH1189(v3);
                }
                else {
                    CLS45 ˈˈ0 = ﹶﾞ0.MTH3092();
                    ˈˈ0.getClass();
                    String s3 = CLS27.MTH904();
                    if(TextUtils.isEmpty(s3)) {
                        v5 = 0;
                    }
                    else {
                        Cursor cursor0 = ˈˈ0.getReadableDatabase().rawQuery("SELECT * FROM FAKELIKES WHERE ACCOUNT = ? AND SNSID = ?", new String[]{s3, String.valueOf(v3)});
                        if(cursor0 == null) {
                            v5 = 0;
                        }
                        else {
                            int v4 = cursor0.getCount();
                            cursor0.close();
                            v5 = v4;
                        }
                    }
                    SQLiteDatabase sQLiteDatabase0 = ˈˈ0.getWritableDatabase();
                    if(v5 == 0) {
                        sQLiteDatabase0.insert("FAKELIKES", null, CLS45.MTH1190(v3));
                        ˈˈ0.FLD163.put(v3, Boolean.TRUE);
                    }
                    else if(v5 != 1) {
                        ˈˈ0.MTH1189(v3);
                        sQLiteDatabase0.insert("FAKELIKES", null, CLS45.MTH1190(v3));
                    }
                    CLS166.MTH3196(arrayList0.size(), object0, CLS27.MTH897("snsAttrLikeFieldCount"));
                }
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("attrBuf", CLS396.MTH5764(object0));
                String s4 = CLS182.MTH3479(!list0.isEmpty(), contentValues0, "likeFlag", 0x38EDF0242B3CD335L);
                ﹶﾞ0.FLD1446.MTH5767(s4, contentValues0, "snsId = ?", new String[]{String.valueOf(v3)});
                CLS66.MTH1373();
            }
        }
    }
}

