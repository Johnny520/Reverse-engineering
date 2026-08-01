// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.database.Cursor;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.HashSet;
import t.ˆʿ.CLS32;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS34;
import t.ˆٴ.CLS67;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS139.CLS138;

public final class CLS293 implements CLS138 {
    public final int FLD797;
    public final Object FLD798;

    public CLS293(Object object0, int v) {
        this.FLD797 = v;
        this.FLD798 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        CLS290 ˊﾞ2;
        int v2;
        CLS290 ˊﾞ1;
        int v1;
        Object object0 = this.FLD798;
        int v = 0;
        if(this.FLD797 == 0) {
            CLS105 ـˏ0 = (CLS105)object0;
            ImageView imageView0 = ـˏ0.FLD782;
            if(imageView0 != null) {
                imageView0.setVisibility(4);
            }
            try {
                CLS34 ˊⁱ0 = ـˏ0.FLD780;
                if(ـˏ0.FLD783.MTH1818("DrawerShowAvatar", false)) {
                    CLS33.MTH1350(ـˏ0.FLD777, CLS133.MTH2112());
                }
                ـˏ0.MTH1833();
                CLS67 ᵔʾ0 = ـˏ0.FLD785;
                ˊⁱ0.getClass();
                CLS290 ˊﾞ0 = null;
                Cursor cursor0 = ˊⁱ0.MTH1364("select count(*) from rbottleconversation where unReadCount > 0", null);
                if(cursor0 == null) {
                    v1 = 0;
                }
                else {
                    v1 = cursor0.getCount() <= 0 || !cursor0.moveToFirst() ? 0 : cursor0.getInt(0);
                    if(!cursor0.isClosed()) {
                        cursor0.close();
                    }
                }
                HashMap hashMap0 = ᵔʾ0.FLD548;
                if(hashMap0.containsKey("bottle")) {
                    ˊﾞ1 = (CLS290)hashMap0.get(CLS114.MTH1900(0xFFFFA0C22B3CF2B7L));
                }
                else {
                    ˊﾞ1 = hashMap0.containsKey("tab_discover") ? ((CLS290)hashMap0.get(CLS114.MTH1900(-104805066542409L))) : null;
                }
                if(ˊﾞ1 != null) {
                    ˊﾞ1.FLD753 = v1 <= 0 ? "" : String.valueOf(v1);
                    ᵔʾ0.notifyDataSetChanged();
                }
                CLS67 ᵔʾ1 = ـˏ0.FLD785;
                Cursor cursor1 = ˊⁱ0.MTH1364("select count(*) from LBSVerifyMessage where status != 4", null);
                if(cursor1 == null) {
                    v2 = 0;
                }
                else {
                    v2 = cursor1.getCount() <= 0 || !cursor1.moveToFirst() ? 0 : cursor1.getInt(0);
                    if(!cursor1.isClosed()) {
                        cursor1.close();
                    }
                }
                HashMap hashMap1 = ᵔʾ1.FLD548;
                if(hashMap1.containsKey("nearbyfriends")) {
                    ˊﾞ2 = (CLS290)hashMap1.get(CLS114.MTH1900(-104345505041737L));
                }
                else {
                    ˊﾞ2 = hashMap1.containsKey("tab_discover") ? ((CLS290)hashMap1.get(CLS114.MTH1900(0xFFFFA0FE2B3CF2B7L))) : null;
                }
                if(ˊﾞ2 != null) {
                    ˊﾞ2.FLD753 = v2 <= 0 ? "" : String.valueOf(v2);
                    ᵔʾ1.notifyDataSetChanged();
                }
                CLS67 ᵔʾ2 = ـˏ0.FLD785;
                Cursor cursor2 = ˊⁱ0.MTH1364("select count(*) from ShakeVerifyMessage where status != 4", null);
                if(cursor2 != null) {
                    if(cursor2.getCount() > 0 && cursor2.moveToFirst()) {
                        v = cursor2.getInt(0);
                    }
                    if(!cursor2.isClosed()) {
                        cursor2.close();
                    }
                }
                HashMap hashMap2 = ᵔʾ2.FLD548;
                if(hashMap2.containsKey("shake")) {
                    ˊﾞ0 = (CLS290)hashMap2.get(CLS114.MTH1900(0xFFFFA0EA2B3CF2B7L));
                }
                else if(hashMap2.containsKey("tab_discover")) {
                    ˊﾞ0 = (CLS290)hashMap2.get(CLS114.MTH1900(0xFFFFA0D72B3CF2B7L));
                }
                if(ˊﾞ0 != null) {
                    ˊﾞ0.FLD753 = v <= 0 ? "" : String.valueOf(v);
                    ᵔʾ2.notifyDataSetChanged();
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            return;
        }
        ((CLS32)object0).getClass();
        ((CLS32)object0).FLD452 = (HashSet)arr_object[0];
        ((CLS32)object0).FLD448.MTH1895();
        ((CLS32)object0).FLD451.MTH1895();
        ((CLS32)object0).FLD450.MTH1895();
        ((CLS32)object0).MTH1337();
    }
}

