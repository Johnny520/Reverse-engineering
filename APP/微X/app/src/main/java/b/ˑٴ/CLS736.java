// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆʿ.CLS54;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS82;
import b.ˈˈ.CLS85.CLS83;
import b.ˈˈ.CLS85.CLS84;
import b.ˈˈ.CLS85;
import b.ᐧˉ.CLS210;
import b.ᵔʾ.CLS288;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1413;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS462;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.util.ArrayList;

public final class CLS736 implements CLS3 {
    public final int FLD917;
    public final Object FLD918;
    public final Object FLD919;
    public final int FLD920;
    public final Object FLD921;

    public CLS736(Object object0, int v, Object object1, Object object2, int v1) {
        this.FLD917 = v1;
        this.FLD919 = object0;
        this.FLD920 = v;
        this.FLD921 = object1;
        this.FLD918 = object2;
        super();
    }

    public CLS736(Object object0, Object object1, int v, Object object2, int v1) {
        this.FLD917 = v1;
        this.FLD919 = object0;
        this.FLD921 = object1;
        this.FLD920 = v;
        this.FLD918 = object2;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        StringBuilder stringBuilder0;
        Intent intent0;
        int v1 = this.FLD920;
        Object object0 = this.FLD918;
        Object object1 = this.FLD921;
        Object object2 = this.FLD919;
        switch(this.FLD917) {
            case 0: {
                ((CLS818)object2).getClass();
                if(v1 == -1 || v1 == CLS66.MTH1499(((String)object1))) {
                    String s = CLS372.MTH5418("chatroom_friendreq_type", "chatroom");
                    CLS85 ـˏ0 = new CLS85(((String)object1), CLS66.MTH1452(((String)object0), ((String)object1)), s);
                    ـˏ0.FLD340 = (String)object0;
                    ـˏ0.FLD329 = true;
                    ـˏ0.FLD330 = CLS83.FLD318;
                    ـˏ0.FLD334 = true;
                    int v3 = ((CLS818)object2).FLD1445.MTH927(0, "friendreq_permission_type");
                    int v4 = ((CLS818)object2).FLD1445.MTH927(0, "friendreq_history_type");
                    ـˏ0.MTH1692((v3 == 0 ? CLS84.FLD325 : CLS84.FLD327), v4);
                    CLS288.FLD2989.MTH4731(ـˏ0);
                    CLS288.FLD2989.MTH4734();
                }
                return;
            }
            case 1: {
                ((CLS210)object2).getClass();
                switch(v1) {
                    case 0xFFFFFFD1: {
                        CLS462.MTH6487(((Activity)object0), ((ContentValues)object1).getAsString("img"));
                        return;
                    }
                    case -33: {
                        String s2 = ((ContentValues)object1).getAsString("voice_id");
                        CLS82 יﹳ0 = CLS54.FLD172.MTH1250(s2);
                        if(יﹳ0 != null) {
                            CLS476.MTH6647(((Activity)object0), יﹳ0, null);
                            return;
                        }
                        break;
                    }
                    case -16: {
                        CLS462.MTH6486(((Activity)object0), ((ContentValues)object1).getAsString("path"));
                        return;
                    }
                    case -2: {
                        CLS462.MTH6489(((Activity)object0), ((ContentValues)object1).getAsString("img"));
                        return;
                    }
                    case 2: {
                        intent0 = new Intent();
                        intent0.putExtra("key_detail_info_id", ((ContentValues)object1).getAsLong("localId"));
                        if(!CLS66.MTH1515(((Activity)object0), ".ui.FavImgGalleryUI", intent0)) {
                            intent0.setClassName(((Activity)object0), CLS27.MTH897(CLS370.MTH5289(4100630394632459061L)));
                            ((Activity)object0).startActivity(intent0);
                            return;
                        }
                        break;
                    }
                    case 3: {
                        intent0 = new Intent();
                        intent0.putExtra("key_detail_create_time", 0);
                        intent0.putExtra("key_detail_info_id", ((ContentValues)object1).getAsLong("localId"));
                        if(!CLS66.MTH1515(((Activity)object0), ".ui.detail.FavoriteVoiceDetailUI", intent0)) {
                            intent0.setClassName(((Activity)object0), CLS27.MTH897(CLS370.MTH5289(0x38E85A052B3CD335L)));
                            ((Activity)object0).startActivity(intent0);
                            return;
                        }
                        break;
                    }
                    case 4: 
                    case 16: {
                        intent0 = new Intent();
                        intent0.putExtra("key_detail_info_id", ((ContentValues)object1).getAsLong("localId"));
                        if(!CLS66.MTH1515(((Activity)object0), ".ui.detail.FavoriteSightDetailUI", intent0)) {
                            intent0.setClassName(((Activity)object0), CLS27.MTH897(CLS370.MTH5289(4100627340910711605L)));
                            ((Activity)object0).startActivity(intent0);
                        }
                        break;
                    }
                    case 101: {
                        ArrayList arrayList0 = new ArrayList();
                        String[] arr_s = CLS502.MTH6941(((ContentValues)object1).getAsString("chatrooms"));
                        for(int v = 0; v < arr_s.length; ++v) {
                            String s1 = arr_s[v];
                            arrayList0.add(new CLS78(s1, ((CLS210)object2).FLD2006.MTH5316(s1)));
                        }
                        CLS387.MTH5595(true, ((Activity)object0), "", arrayList0, null);
                        return;
                    }
                    default: {
                        return;
                    }
                }
                return;
            }
            case 2: {
                CLS523.MTH7142(((Activity)object2), ((CLS11)new CLS1413(((ArrayList)object1), v1, ((CLS347)object0))));
                return;
            }
            case 3: {
                if(new File(((ContentValues)object2).getAsString("vid")).delete()) {
                    ((ArrayList)object1).remove(v1);
                    ((CLS335)object0).notifyDataSetChanged();
                }
                return;
            }
            case 4: {
                CLS523.MTH7165(((Activity)object2), CLS27.MTH889("order"), "", String.valueOf(v1 + 1), 2, ((CLS16)new CLS838(((CLS369)object1), v1, ((CLS82)object0), 6)));
                return;
            }
            case 5: {
                ContentValues contentValues0 = (ContentValues)object2;
                String s3 = (String)object1;
                contentValues0.put("url", s3);
                try {
                    if(v1 == 1) {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(CLS27.MTH889("web_img"));
                        goto label_93;
                    }
                    else if(v1 == 15) {
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append(CLS27.MTH889("web_vid"));
                    label_93:
                        stringBuilder0.append(": ");
                        stringBuilder0.append(s3);
                        contentValues0.put("desc", stringBuilder0.toString());
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                ((CLS335)object0).notifyDataSetChanged();
                return;
            }
            default: {
                Bundle bundle0 = (Bundle)object2;
                CLS335 ˑٴ0 = (CLS335)object1;
                Activity activity0 = (Activity)object0;
                try {
                    int v2 = bundle0.getInt("type");
                    if(v2 == 1) {
                        CLS462.MTH6489(activity0, ((ContentValues)ˑٴ0.getItem(v1)).getAsString("img"));
                        return;
                    }
                    if(v2 == 15) {
                        CLS462.MTH6486(activity0, ((ContentValues)ˑٴ0.getItem(v1)).getAsString("vid"));
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

