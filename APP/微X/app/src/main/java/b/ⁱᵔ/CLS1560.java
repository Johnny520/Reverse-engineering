// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱˉ.CLS370;

public final class CLS1560 implements CLS3 {
    public final int FLD4856;
    public final ContentValues FLD4857;
    public final int FLD4858;
    public final Activity FLD4859;

    public CLS1560(int v, ContentValues contentValues0, Activity activity0, int v1) {
        this.FLD4856 = v1;
        this.FLD4858 = v;
        this.FLD4857 = contentValues0;
        this.FLD4859 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS3
    public final void MTH774() {
        Intent intent1;
        Intent intent0;
        Activity activity0 = this.FLD4859;
        ContentValues contentValues0 = this.FLD4857;
        int v = this.FLD4858;
        if(this.FLD4856 == 0) {
            switch(v) {
                case 2: {
                    intent0 = new Intent();
                    intent0.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
                    if(!CLS66.MTH1515(activity0, ".ui.FavImgGalleryUI", intent0)) {
                        intent0.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100840087820751669L)));
                        activity0.startActivity(intent0);
                        return;
                    }
                    break;
                }
                case 3: {
                    intent0 = new Intent();
                    intent0.putExtra("key_detail_create_time", 0);
                    intent0.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
                    if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteVoiceDetailUI", intent0)) {
                        intent0.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100839980446569269L)));
                        activity0.startActivity(intent0);
                    }
                    break;
                }
                default: {
                    if(v != 4 && v != 16) {
                        switch(v) {
                            case 0xFFFFFFD1: {
                                CLS462.MTH6487(activity0, contentValues0.getAsString("img"));
                                return;
                            }
                            case -16: {
                                CLS462.MTH6486(activity0, contentValues0.getAsString("path"));
                                return;
                            }
                            case -2: {
                                CLS462.MTH6489(activity0, contentValues0.getAsString("img"));
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    intent0 = new Intent();
                    intent0.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
                    if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteSightDetailUI", intent0)) {
                        intent0.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100840332633887541L)));
                        activity0.startActivity(intent0);
                        return;
                    }
                }
            }
            return;
        }
        if(v == 2) {
            intent1 = new Intent();
            intent1.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
            if(!CLS66.MTH1515(activity0, ".ui.FavImgGalleryUI", intent1)) {
                intent1.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100858869712737077L)));
                activity0.startActivity(intent1);
            }
        }
        else if(v == 3) {
            intent1 = new Intent();
            intent1.putExtra("key_detail_create_time", 0);
            intent1.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
            if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteVoiceDetailUI", intent1)) {
                intent1.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100859312094368565L)));
                activity0.startActivity(intent1);
            }
        }
        else {
            if(v != 4 && v != 16) {
                switch(v) {
                    case 0xFFFFFFD1: {
                        CLS462.MTH6487(activity0, contentValues0.getAsString("img"));
                        return;
                    }
                    case -16: {
                        CLS462.MTH6486(activity0, contentValues0.getAsString("path"));
                        return;
                    }
                    case -2: {
                        CLS462.MTH6489(activity0, contentValues0.getAsString("img"));
                        return;
                    }
                    default: {
                        return;
                    }
                }
            }
            intent1 = new Intent();
            intent1.putExtra("key_detail_info_id", contentValues0.getAsLong("localId"));
            if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteSightDetailUI", intent1)) {
                intent1.setClassName(activity0, CLS27.MTH897(CLS370.MTH5289(4100859114525872949L)));
                activity0.startActivity(intent1);
            }
        }
    }
}

