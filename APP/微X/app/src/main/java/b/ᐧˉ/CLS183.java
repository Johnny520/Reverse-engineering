// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.content.ContentValues;
import android.database.Cursor;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS79;
import b.ⁱᵔ.CLS371;
import java.util.ArrayList;

public final class CLS183 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1757;
    public final CLS946 FLD1758;

    public CLS183(CLS946 ʿ0, int v) {
        this.FLD1757 = v;
        this.FLD1758 = ʿ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS946 ʿ0 = this.FLD1758;
        switch(this.FLD1757) {
            case 0: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "float_video_enable");
                return;
            }
            case 1: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "modify_steps_max_enable");
                return;
            }
            case 2: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "werun_autolike_enable");
                return;
            }
            case 3: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "scan_gallery_to_camera");
                return;
            }
            case 4: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "force_tablet_mode_enable");
                return;
            }
            case 5: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "sight_use_front_camera_enable");
                return;
            }
            case 6: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "selective_copy_enable");
                return;
            }
            case 7: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "quote_enable");
                return;
            }
            case 8: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "repeat_msg_send");
                return;
            }
            case 9: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "prevent_message_fold");
                if(z) {
                    CLS371 ʻ0 = CLS371.FLD3470;
                    if(ʻ0.MTH5358("message_fold")) {
                        ArrayList arrayList0 = new ArrayList();
                        Cursor cursor0 = ʻ0.MTH5307("select username from rconversation where parentRef = \'message_fold\'", null);
                        if(cursor0 != null) {
                            if(cursor0.moveToFirst()) {
                                while(true) {
                                    arrayList0.add(cursor0.getString(cursor0.getColumnIndex("username")));
                                    if(!cursor0.moveToNext()) {
                                        break;
                                    }
                                }
                            }
                            cursor0.close();
                        }
                        for(Object object0: arrayList0) {
                            ContentValues contentValues0 = new ContentValues();
                            contentValues0.put(CLS182.MTH3496(0x38EAE4B92B3CD335L, contentValues0, ((String)object0), 4101342483030266677L), "");
                            ʻ0.MTH5327(contentValues0, ((String)object0));
                        }
                        ʻ0.MTH5370("message_fold");
                        CLS79.FLD292.MTH1633();
                        return;
                    }
                }
                else {
                    CLS371 ʻ1 = CLS371.FLD3470;
                    if(!ʻ1.MTH5358("message_fold")) {
                        ArrayList arrayList1 = ʻ1.MTH5377();
                        ArrayList arrayList2 = new ArrayList();
                        long v = System.currentTimeMillis();
                        for(Object object1: arrayList1) {
                            String s = (String)object1;
                            if(CLS66.MTH1364(s)) {
                                arrayList2.add(s);
                                long v1 = ʻ1.MTH5317(s);
                                if(v1 < v) {
                                    v = v1;
                                }
                            }
                        }
                        if(arrayList2.size() >= 11) {
                            for(Object object2: arrayList2) {
                                ContentValues contentValues1 = new ContentValues();
                                contentValues1.put(CLS182.MTH3496(4101342641944056629L, contentValues1, ((String)object2), 0x38EAE5702B3CD335L), "message_fold");
                                ʻ1.MTH5327(contentValues1, ((String)object2));
                            }
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("username", "message_fold");
                            contentValues2.put("flag", v);
                            contentValues2.put("content", "Hide stickied chats");
                            contentValues2.put("conversationTime", 0);
                            ʻ1.MTH5327(contentValues2, "message_fold");
                            CLS79.FLD292.MTH1633();
                        }
                    }
                }
                return;
            }
            case 10: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "fast_switch_enable");
                return;
            }
            case 11: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "webwx_auto_confirm");
                return;
            }
            case 12: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "storygallery_download");
                return;
            }
            case 13: {
                ʿ0.getClass();
                CLS27.MTH885().edit().putBoolean("settings_multi_webview", z).commit();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "MultiWebView");
                return;
            }
            case 14: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_close_bindmobile");
                return;
            }
            case 15: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "add_actionbar_items_enable");
                return;
            }
            case 16: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "custom_dice_enable");
                return;
            }
            case 17: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "fake_region_enable");
                return;
            }
            case 18: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "fake_gps_enable");
                return;
            }
            default: {
                ʿ0.getClass();
                ʿ0.FLD2151.MTH922(Boolean.valueOf(z), "modify_steps_enable");
            }
        }
    }
}

