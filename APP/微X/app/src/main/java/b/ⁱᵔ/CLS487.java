// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS16;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ᐧˉ.CLS182;
import b.ⁱʾ.CLS335;
import b.ⁱˉ.CLS370;

public final class CLS487 implements AdapterView.OnItemLongClickListener {
    public final int FLD4774;
    public final Activity FLD4775;
    public final CLS335 FLD4776;

    public CLS487(int v, Activity activity0, CLS335 ˑٴ0) {
        this.FLD4774 = v;
        this.FLD4776 = ˑٴ0;
        this.FLD4775 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView0, View view0, int v, long v1) {
        Intent intent0;
        CLS335 ˑٴ0 = this.FLD4776;
        if(this.FLD4774 == 0) {
            ContentValues contentValues0 = (ContentValues)ˑٴ0.getItem(v);
            if(contentValues0 != null) {
                int v2 = CLS182.MTH3474(4100835754198750005L, contentValues0);
                Activity activity0 = this.FLD4775;
                if(v2 == 2) {
                    intent0 = new Intent();
                    intent0.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
                    if(!CLS66.MTH1515(activity0, ".ui.FavImgGalleryUI", intent0)) {
                        intent0.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100835427781235509L)));
                        activity0.startActivity(intent0);
                        return true;
                    }
                }
                else {
                    switch(v2) {
                        case 3: {
                            intent0 = new Intent();
                            intent0.putExtra("key_detail_create_time", 0);
                            intent0.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
                            if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteVoiceDetailUI", intent0)) {
                                intent0.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(0x38E918FF2B3CD335L)));
                                activity0.startActivity(intent0);
                                return true;
                            }
                            break;
                        }
                        case 4: 
                        case 16: {
                            intent0 = new Intent();
                            intent0.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
                            if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteSightDetailUI", intent0)) {
                                intent0.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100836772105999157L)));
                                activity0.startActivity(intent0);
                            }
                            break;
                        }
                        default: {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        Object object0 = ˑٴ0.getItem(v);
        int v3 = CLS182.MTH3474(4101200225123488565L, ((ContentValues)object0));
        String s = ((ContentValues)object0).getAsString("USERNAME");
        String s1 = ((ContentValues)object0).getAsString("CHATROOM");
        String s2 = CLS27.MTH889("modify");
        CLS1506 ٴʿ0 = new CLS1506(s1, s, ((ContentValues)object0), ˑٴ0, 2);
        CLS523.MTH7165(this.FLD4775, s2, "", String.valueOf(v3), 2, ((CLS16)ٴʿ0));
        return true;
    }
}

