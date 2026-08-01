// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS48;
import b.ˆʿ.CLS53;
import b.ˆʿ.CLS62;
import b.ᵔʾ.CLS1258;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1392;
import b.ⁱᵔ.CLS1580;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS523;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public final class CLS230 implements View.OnClickListener {
    public final int FLD2234;
    public final Activity FLD2235;
    public final String FLD2236;

    public CLS230(Activity activity0, String s, int v) {
        this.FLD2234 = v;
        this.FLD2235 = activity0;
        this.FLD2236 = s;
        super();
    }

    public CLS230(String s, Activity activity0, int v) {
        this.FLD2234 = v;
        this.FLD2236 = s;
        this.FLD2235 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD2235;
        Cursor cursor0 = null;
        String s = this.FLD2236;
        switch(this.FLD2234) {
            case 0: {
                StringBuilder stringBuilder0 = CLS182.MTH3483(s);
                stringBuilder0.append("autoreply_timeframe");
                CLS395.MTH5737(activity0, stringBuilder0.toString());
                return;
            }
            case 1: {
                String s1 = "";
                switch(CLS404.MTH5890(s)) {
                    case "chatgpt_for_bot": {
                        s1 = CLS27.MTH882(CLS370.MTH5289(4100999383862793013L));
                        break;
                    }
                    case "ibot_cloud": {
                        s1 = CLS27.MTH882(CLS370.MTH5289(4100999602906125109L));
                        break;
                    }
                    case "mly_bot": {
                        s1 = CLS27.MTH882(CLS370.MTH5289(4100999667330634549L));
                        break;
                    }
                    case "openai": {
                        s1 = CLS27.MTH882(CLS370.MTH5289(4100999263603708725L));
                        break;
                    }
                    case "turing_robot": {
                        s1 = CLS27.MTH882(CLS370.MTH5289(4100999525596713781L));
                        break;
                    }
                    case "weixin_aibot": {
                        s1 = CLS27.MTH882(CLS370.MTH5289(4100999173409395509L));
                        break;
                    }
                    case "welm": {
                        s1 = CLS27.MTH882(CLS370.MTH5289(4100999328028218165L));
                    }
                }
                if(!TextUtils.isEmpty(s1)) {
                    CLS432.MTH6177(activity0, Uri.parse(s1));
                }
                return;
            }
            case 2: {
                CLS53 ٴـ0 = (CLS53)CLS40.FLD157.MTH1118(CLS53.class);
                ٴـ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                String s2 = CLS27.MTH904();
                if(!TextUtils.isEmpty(s2)) {
                    Cursor cursor1 = ٴـ0.getReadableDatabase().rawQuery("SELECT * FROM ChatroomCheckIn WHERE ACCOUNT=? AND CHATROOM=?", new String[]{s2, s});
                    if(cursor1 != null) {
                        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                        if(cursor1.moveToFirst()) {
                            while(true) {
                                String s3 = CLS182.MTH3472(4100941169876063029L, cursor1);
                                int v = CLS182.MTH3490(4100941208530768693L, cursor1);
                                long v1 = CLS34.MTH1076(4100941234300572469L, cursor1);
                                ContentValues contentValues0 = CLS53.MTH1234(v, v1, s, s3);
                                contentValues0.put("wxid", s3);
                                StringBuilder stringBuilder1 = new StringBuilder();
                                stringBuilder1.append("<b>");
                                stringBuilder1.append(CLS371.FLD3470.MTH5311(s3));
                                stringBuilder1.append("</b><br><i>");
                                stringBuilder1.append(simpleDateFormat0.format(new Date(v1)));
                                stringBuilder1.append("</i> (");
                                stringBuilder1.append(v);
                                contentValues0.put("desc", CLS182.MTH3475(4100941376034493237L, stringBuilder1));
                                arrayList0.add(contentValues0);
                                if(!cursor1.moveToNext()) {
                                    break;
                                }
                            }
                        }
                        if(!cursor1.isClosed()) {
                            cursor1.close();
                        }
                    }
                }
                String s4 = CLS371.FLD3470.MTH5316(s);
                CLS523.MTH7150(activity0, s4, ((CLS17)new CLS1580(activity0, s4, arrayList0, 1)));
                return;
            }
            case 3: {
                try {
                    CLS403.MTH5862(activity0, s, null);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 4: {
                CLS403.MTH5862(activity0, s, "_FRIENDCARD_BANWARNING_");
                return;
            }
            case 5: {
                CLS403.MTH5862(activity0, s, "_APP_BANWARNING_");
                return;
            }
            case 6: {
                CLS403.MTH5862(activity0, s, "_qrcode_BANWARNING_");
                return;
            }
            case 7: {
                CLS403.MTH5862(activity0, s, "_ARTICLE_BANWARNING_");
                return;
            }
            case 8: {
                CLS403.MTH5862(activity0, s, "_KEYWORD_BANWARNING_");
                return;
            }
            case 9: {
                CLS403.MTH5862(activity0, s, "_IMAGES_BANWARNING_");
                return;
            }
            case 10: {
                CLS412.MTH6017(activity0, s);
                CLS412.MTH6013(activity0, CLS27.MTH889("copy_to_clipboard"));
                return;
            }
            case 11: {
                CLS523.MTH7165(activity0, CLS27.MTH889("changeChatroomName"), "", CLS371.FLD3470.MTH5316(s), 1, ((CLS16)new CLS1258(13, s)));
                return;
            }
            case 12: {
                CLS523.MTH7165(activity0, CLS27.MTH889("groupAnnounce"), "", "", 1, ((CLS16)new CLS1258(12, s)));
                return;
            }
            case 13: {
                CLS48 ˊﾞ0 = CLS62.FLD190.FLD189;
                ˊﾞ0.getClass();
                ArrayList arrayList1 = new ArrayList();
                String s5 = CLS27.MTH904();
                if(!TextUtils.isEmpty(s5)) {
                    cursor0 = ˊﾞ0.getReadableDatabase().rawQuery("SELECT * FROM ChatroomKeyInvite WHERE ACCOUNT = ?  AND TAG = ? AND IS_USED <> 1 AND INVITED_TO_CHATROOM IS NULL OR INVITED_TO_CHATROOM = \'\' AND USERNAME IS NULL OR USERNAME = \'\'", new String[]{s5, s});
                }
                CLS48.MTH1209(cursor0, arrayList1);
                for(Object object0: arrayList1) {
                    ((ContentValues)object0).put("desc", CLS426.MTH6119(((ContentValues)object0)));
                }
                CLS523.MTH7150(activity0, CLS27.MTH889("invite_key_unused"), ((CLS17)new CLS1580(activity0, s, arrayList1, 2)));
                return;
            }
            case 14: {
                CLS48 ˊﾞ1 = CLS62.FLD190.FLD189;
                ˊﾞ1.getClass();
                ArrayList arrayList2 = new ArrayList();
                String s6 = CLS27.MTH904();
                if(!TextUtils.isEmpty(s6)) {
                    cursor0 = ˊﾞ1.getReadableDatabase().rawQuery("SELECT * FROM ChatroomKeyInvite WHERE ACCOUNT = ?  AND TAG = ? AND IS_USED = 1", new String[]{s6, s});
                }
                CLS48.MTH1209(cursor0, arrayList2);
                for(Object object1: arrayList2) {
                    ((ContentValues)object1).put("desc", CLS426.MTH6119(((ContentValues)object1)));
                }
                CLS523.MTH7150(activity0, CLS27.MTH889("invite_key_used"), ((CLS17)new CLS1580(activity0, s, arrayList2, 2)));
                return;
            }
            case 15: {
                CLS48 ˊﾞ2 = CLS62.FLD190.FLD189;
                ˊﾞ2.getClass();
                ArrayList arrayList3 = new ArrayList();
                String s7 = CLS27.MTH904();
                if(!TextUtils.isEmpty(s7)) {
                    cursor0 = ˊﾞ2.getReadableDatabase().rawQuery("SELECT * FROM ChatroomKeyInvite WHERE ACCOUNT = ?  AND TAG = ? AND IS_USED <> 1 AND INVITED_TO_CHATROOM IS NOT NULL AND INVITED_TO_CHATROOM != \'\' AND USERNAME IS NOT NULL AND USERNAME != \'\'", new String[]{s7, s});
                }
                CLS48.MTH1209(cursor0, arrayList3);
                for(Object object2: arrayList3) {
                    ((ContentValues)object2).put("desc", CLS426.MTH6119(((ContentValues)object2)));
                }
                CLS523.MTH7150(activity0, CLS27.MTH889("invite_key_pending"), ((CLS17)new CLS1580(activity0, s, arrayList3, 2)));
                return;
            }
            default: {
                CLS523.MTH7150(activity0, CLS27.MTH889("invite_key_add"), ((CLS17)new CLS1392(activity0, s, 3)));
            }
        }
    }
}

