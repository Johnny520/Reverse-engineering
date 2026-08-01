// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS54;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS82;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;
import java.util.ArrayList;

public final class CLS1086 implements CLS3 {
    public final int FLD2344;
    public final Activity FLD2345;
    public final int FLD2346;
    public final CLS244 FLD2347;
    public final ContentValues FLD2348;

    public CLS1086(CLS244 ᴵʻ0, int v, ContentValues contentValues0, Activity activity0, int v1) {
        this.FLD2344 = v1;
        this.FLD2347 = ᴵʻ0;
        this.FLD2346 = v;
        this.FLD2348 = contentValues0;
        this.FLD2345 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Intent intent1;
        Intent intent0;
        int v = 0;
        Activity activity0 = this.FLD2345;
        ContentValues contentValues0 = this.FLD2348;
        int v1 = this.FLD2346;
        CLS244 ᴵʻ0 = this.FLD2347;
        if(this.FLD2344 == 0) {
            ᴵʻ0.getClass();
            if(v1 == 2) {
                intent0 = new Intent();
                intent0.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
                if(!CLS66.MTH1515(activity0, ".ui.FavImgGalleryUI", intent0)) {
                    intent0.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100680864793154357L)));
                    activity0.startActivity(intent0);
                    return;
                }
            }
            else if(v1 == 3) {
                intent0 = new Intent();
                intent0.putExtra("key_detail_create_time", 0);
                intent0.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
                if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteVoiceDetailUI", intent0)) {
                    intent0.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100677458884088629L)));
                    activity0.startActivity(intent0);
                    return;
                }
            }
            else if(v1 != 4 && v1 != 16) {
                switch(v1) {
                    case 0xFFFFFFD1: {
                        CLS462.MTH6487(activity0, contentValues0.getAsString("img"));
                        return;
                    }
                    case -33: {
                        goto label_40;
                    }
                    case -16: {
                        CLS462.MTH6486(activity0, contentValues0.getAsString("path"));
                        return;
                    }
                    case -2: {
                        CLS462.MTH6489(activity0, contentValues0.getAsString("img"));
                        return;
                    }
                    case 101: {
                        goto label_31;
                    }
                }
                return;
            label_31:
                ArrayList arrayList0 = new ArrayList();
                String[] arr_s = CLS502.MTH6941(contentValues0.getAsString("chatrooms"));
                while(v < arr_s.length) {
                    String s = arr_s[v];
                    arrayList0.add(new CLS78(s, ᴵʻ0.FLD2541.MTH5316(s)));
                    ++v;
                }
                CLS387.MTH5595(true, activity0, "", arrayList0, null);
                return;
            label_40:
                String s1 = contentValues0.getAsString("voice_id");
                CLS82 יﹳ0 = CLS54.FLD172.MTH1250(s1);
                if(יﹳ0 != null) {
                    CLS476.MTH6647(activity0, יﹳ0, null);
                    return;
                }
            }
            else {
                intent0 = new Intent();
                intent0.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
                if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteSightDetailUI", intent0)) {
                    intent0.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100677261315593013L)));
                    activity0.startActivity(intent0);
                }
            }
            return;
        }
        ᴵʻ0.getClass();
        if(v1 == 2) {
            intent1 = new Intent();
            intent1.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
            if(!CLS66.MTH1515(activity0, ".ui.FavImgGalleryUI", intent1)) {
                intent1.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100664354938868533L)));
                activity0.startActivity(intent1);
            }
        }
        else if(v1 == 3) {
            intent1 = new Intent();
            intent1.putExtra("key_detail_create_time", 0);
            intent1.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
            if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteVoiceDetailUI", intent1)) {
                intent1.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100665347076313909L)));
                activity0.startActivity(intent1);
            }
        }
        else if(v1 != 4 && v1 != 16) {
            switch(v1) {
                case 0xFFFFFFD1: {
                    CLS462.MTH6487(activity0, contentValues0.getAsString("img"));
                    return;
                }
                case -33: {
                    goto label_85;
                }
                case -16: {
                    CLS462.MTH6486(activity0, contentValues0.getAsString("path"));
                    return;
                }
                case -2: {
                    CLS462.MTH6489(activity0, contentValues0.getAsString("img"));
                    return;
                }
                case 101: {
                    goto label_76;
                }
            }
            return;
        label_76:
            ArrayList arrayList1 = new ArrayList();
            String[] arr_s1 = CLS502.MTH6941(contentValues0.getAsString("chatrooms"));
            while(v < arr_s1.length) {
                String s2 = arr_s1[v];
                arrayList1.add(new CLS78(s2, ᴵʻ0.FLD2541.MTH5316(s2)));
                ++v;
            }
            CLS387.MTH5595(true, activity0, "", arrayList1, null);
            return;
        label_85:
            String s3 = contentValues0.getAsString("voice_id");
            CLS82 יﹳ1 = CLS54.FLD172.MTH1250(s3);
            if(יﹳ1 != null) {
                CLS476.MTH6647(activity0, יﹳ1, null);
            }
        }
        else {
            intent1 = new Intent();
            intent1.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
            if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteSightDetailUI", intent1)) {
                intent1.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100665149507818293L)));
                activity0.startActivity(intent1);
            }
        }
    }
}

