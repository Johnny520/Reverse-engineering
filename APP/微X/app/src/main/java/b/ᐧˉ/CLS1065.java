// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS530;
import java.util.ArrayList;
import java.util.Iterator;

public final class CLS1065 extends CLS219 {
    public final ArrayList FLD2284;

    public CLS1065(String s, String s1) {
        super(s, s1);
        this.FLD2284 = new ArrayList();
    }

    @Override  // b.ᐧˉ.CLS219
    public final void MTH3874(boolean z, boolean z1, String s) {
        this.FLD2284.clear();
        CLS1095 ٴᵔ0 = new CLS1095(this, 4);
        CLS40.FLD157.MTH1124(((CLS39)ٴᵔ0));
        if(z1) {
            ((CLS219)this).MTH3875();
        }
        CLS380 ʼˎ0 = new CLS380(((CLS219)this).MTH3883(), this.FLD2156);
        ʼˎ0.FLD3527 = new CLS1095(this, 0);
        ʼˎ0.FLD3518 = new CLS1069(((CLS219)this), z, z1, 13);
        ʼˎ0.show();
        if(z1 && !TextUtils.isEmpty(s)) {
            ((CLS219)this).MTH3882(s);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ᐧˉ.CLS219
    public final void MTH3878(LinearLayout linearLayout0, boolean z, boolean z1, boolean z2) {
        public final class CLS1064 implements CLS2 {
            public CLS1064() {
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    CLS371.FLD3470.getClass();
                    ArrayList arrayList1 = new ArrayList();
                    Cursor cursor0 = CLS371.FLD3470.MTH5307("SELECT * FROM message WHERE type = 10000 AND talker = \'" + "" + "\'", null);
                    if(cursor0 != null) {
                        if(cursor0.moveToFirst()) {
                            while(true) {
                                String s2 = CLS182.MTH3472(4101254779798082357L, cursor0);
                                int v = CLS182.MTH3490(4101254264402006837L, cursor0);
                                ContentValues contentValues0 = new ContentValues();
                                contentValues0.put(CLS182.MTH3496(4101254290171810613L, contentValues0, s2, 0x38EA95142B3CD335L), v);
                                arrayList1.add(contentValues0);
                                if(!cursor0.moveToNext()) {
                                    break;
                                }
                            }
                        }
                        if(!cursor0.isClosed()) {
                            cursor0.close();
                        }
                    }
                    if(!arrayList1.isEmpty()) {
                        String s3 = CLS27.MTH889("recalled_msg_content");
                        String s4 = CLS27.MTH895().MTH925("recalled", "");
                        if(s4.equals(s3)) {
                            s4 = "";
                        }
                        for(Object object0: arrayList1) {
                            String s5 = ((ContentValues)object0).getAsString("content");
                            int v1 = CLS182.MTH3474(4101340155157992245L, ((ContentValues)object0));
                            if(CLS502.MTH6934(s5, new String[]{s3}) || CLS502.MTH6934(s5, new String[]{s4})) {
                                CLS371.FLD3470.getClass();
                                CLS371.FLD3470.MTH5346("message", "msgId = ?", new String[]{String.valueOf(v1)});
                            }
                        }
                    }
                }
            }
        }

        int v = CLS523.MTH7137(10);
        Activity activity0 = ((CLS219)this).MTH3883();
        CLS1635 ﾞᵎ0 = ((CLS219)this).MTH3879(z1, z2);
        String s = CLS34.MTH1065(0x38E80CDF2B3CD335L, ﾞᵎ0, 0x38E80CF22B3CD335L);
        ﾞᵎ0.MTH7437(this.FLD2151.MTH938(s, true));
        ﾞᵎ0.MTH7438(new CLS178(this, 0));
        CLS1635 ﾞᵎ1 = ((CLS219)this).MTH3879(z1, z2);
        String s1 = CLS34.MTH1065(4100541226816426805L, ﾞᵎ1, 4100541325600674613L);
        boolean z3 = CLS412.MTH6002();
        ﾞᵎ1.MTH7437(this.FLD2151.MTH938(s1, !z3));
        ﾞᵎ1.MTH7438(new CLS178(this, 1));
        CLS1635 ﾞᵎ2 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ2.MTH800(CLS27.MTH889("show_moment_deleted_tag"));
        ﾞᵎ2.MTH7437(this.FLD2151.MTH938("show_moment_deleted_tag", false));
        ﾞᵎ2.MTH7438(new CLS178(this, 2));
        CLS1635 ﾞᵎ3 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ3.MTH800(CLS27.MTH889("prevent_comments_recall"));
        ﾞᵎ3.MTH7437(this.FLD2151.MTH938("prevent_comments_recall", true));
        ﾞᵎ3.MTH7438(new CLS178(this, 3));
        CLS1635 ﾞᵎ4 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ4.MTH800(CLS27.MTH889("show_comment_deleted_tag"));
        ﾞᵎ4.MTH7437(this.FLD2151.MTH938("show_comment_deleted_tag", false));
        ﾞᵎ4.MTH7438(new CLS178(this, 4));
        CLS1635 ﾞᵎ5 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ5.MTH800(CLS27.MTH889("show_recalled_hint"));
        ﾞᵎ5.MTH7437(this.FLD2151.MTH938("show_recalled_hint", true));
        ﾞᵎ5.MTH7438(new CLS178(this, 5));
        CLS1635 ﾞᵎ6 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ6.MTH800(CLS27.MTH889("show_content"));
        ﾞᵎ6.MTH7437(this.FLD2151.MTH938("show_content", false));
        ﾞᵎ6.MTH7438(new CLS178(this, 6));
        CLS1635 ﾞᵎ7 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ7.MTH800(CLS27.MTH889("keep_self_recall"));
        ﾞᵎ7.MTH7437(this.FLD2151.MTH938("keep_self_recall", false));
        ﾞᵎ7.MTH7438(new CLS178(this, 7));
        CLS1623 יᐧ0 = new CLS1623(activity0);
        יᐧ0.MTH800(CLS27.MTH889("prevent_recall"));
        יᐧ0.MTH7289(new Object[]{ﾞᵎ0, ﾞᵎ1, ﾞᵎ2, ﾞᵎ3, ﾞᵎ4, ﾞᵎ5, ﾞᵎ6, ﾞᵎ7});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        CLS1635 ﾞᵎ8 = ((CLS219)this).MTH3879(z1, z2);
        ﾞᵎ8.MTH798(CLS27.MTH889("autorecall_desc"));
        ﾞᵎ8.MTH800(CLS27.MTH889("auto_recall"));
        ﾞᵎ8.MTH7437(this.FLD2151.MTH938("autorecall", false));
        ﾞᵎ8.MTH7438(new CLS178(this, 8));
        CLS1622 ˑٴ0 = new CLS1622(activity0);
        String s2 = CLS182.MTH3469(0x38E80A5D2B3CD335L, ˑٴ0, 4100538907534086965L);
        String s3 = CLS27.MTH889("auto_recall");
        ˑٴ0.MTH7277(this.FLD2151.MTH925(s2, s3));
        ˑٴ0.FLD5252 = new CLS1095(this, 3);
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7289(new Object[]{ﾞᵎ8, ˑٴ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        CLS1622 ˑٴ1 = new CLS1622(activity0);
        ˑٴ1.MTH800(CLS27.MTH889("recalled_message"));
        ˑٴ1.FLD5256 = CLS27.MTH889("recalled_message");
        String s4 = CLS27.MTH889("recalled_msg_content");
        ˑٴ1.MTH7277(this.FLD2151.MTH925("recalled", s4));
        ˑٴ1.FLD5252 = new CLS1095(this, 1);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        ـˏ0.MTH800(CLS27.MTH889("del_unrecalled"));
        ـˏ0.MTH7320(new CLS530(this, activity0, 15));
        CLS1622 ˑٴ2 = new CLS1622(activity0);
        ˑٴ2.MTH800(CLS27.MTH889("comment_recalled_message"));
        ˑٴ2.FLD5256 = CLS27.MTH889("comment_recalled_message");
        String s5 = CLS27.MTH889("comment_recall_content");
        ˑٴ2.MTH7277(this.FLD2151.MTH925("comment_recall_content", s5));
        ˑٴ2.FLD5252 = new CLS1095(this, 2);
        CLS1623 יᐧ2 = new CLS1623(activity0);
        יᐧ2.MTH800(CLS27.MTH889("customization"));
        יᐧ2.MTH7289(new Object[]{ˑٴ1, ـˏ0, ˑٴ2});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
        CLS1625 ـˏ1 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ1.MTH800(CLS27.MTH889("unrecall_comments"));
        ـˏ1.MTH7320(new CLS267(14));
        CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ1), true);
        CLS1625 ـˏ2 = ((CLS219)this).MTH3877(z1, z2);
        ـˏ2.MTH800(CLS27.MTH889("unrecall_moments"));
        ـˏ2.MTH7320(new CLS267(15));
        CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ2), true);
    }
}

