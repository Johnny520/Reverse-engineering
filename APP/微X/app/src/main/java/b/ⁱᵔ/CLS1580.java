// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS848;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS200;
import b.ᐧˉ.CLS954;
import b.ⁱʾ.CLS1270;
import b.ⁱʾ.CLS335;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1627;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;

public final class CLS1580 implements CLS17 {
    public final int FLD4947;
    public final ArrayList FLD4948;
    public final Activity FLD4949;
    public final String FLD4950;

    public CLS1580(Activity activity0, String s, ArrayList arrayList0, int v) {
        this.FLD4947 = v;
        this.FLD4949 = activity0;
        this.FLD4948 = arrayList0;
        this.FLD4950 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        boolean z1;
        switch(this.FLD4947) {
            case 0: {
                Activity activity0 = this.FLD4949;
                ArrayList arrayList0 = this.FLD4948;
                String s = this.FLD4950;
                Menu menu1 = (Menu)arr_object[0];
                LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
                CLS335 ˑٴ1 = new CLS335(activity0, arrayList0);
                CLS1627 ٴـ0 = new CLS1627(8, ˑٴ1);
                CLS371.FLD3470.getClass();
                CLS1506 ٴʿ0 = new CLS1506(CLS371.FLD3470, arrayList0, s, ٴـ0, 12);
                CLS40.FLD157.MTH1124(((CLS39)ٴʿ0));
                CLS525 ʻˑ1 = new CLS525(activity0, linearLayout1, menu1);
                ʻˑ1.MTH7187("sort_reverse", ((CLS3)new CLS1411(1, ˑٴ1, arrayList0)));
                ʻˑ1.MTH7187("sort_alphabet", ((CLS3)new CLS1411(2, ˑٴ1, arrayList0)));
                ʻˑ1.MTH7187("lastMsg", ((CLS3)new CLS1411(3, ˑٴ1, arrayList0)));
                ʻˑ1.MTH7187("totalMsg", ((CLS3)new CLS1411(4, ˑٴ1, arrayList0)));
                ʻˑ1.MTH7187("todayMsg", ((CLS3)new CLS1411(5, ˑٴ1, arrayList0)));
                ʻˑ1.MTH7187("chatroom_moderator", ((CLS3)new CLS1593(s, arrayList0, ˑٴ1, 0)));
                CLS500 ᵢﹶ0 = CLS500.FLD4928;
                ᵢﹶ0.getClass();
                for(int v = 0; true; ++v) {
                    boolean z = false;
                    if(v >= 2) {
                        break;
                    }
                    if(ᵢﹶ0.MTH6895(new String[]{"wxid_friend_req", "export_chatroom_members"}[v])) {
                        z = true;
                        break;
                    }
                }
                if(z && CLS27.MTH902("export_members")) {
                    ʻˑ1.MTH7187("export_members", ((CLS3)new CLS1594(arrayList0, activity0, s, 0)));
                }
                ʻˑ1.MTH7188();
                CLS1624 יﹳ1 = new CLS1624(activity0);
                יﹳ1.MTH7303(ˑٴ1);
                יﹳ1.MTH7311();
                יﹳ1.FLD5274 = new CLS1270(ˑٴ1, 3);
                יﹳ1.MTH7302();
                יﹳ1.FLD5276 = false;
                יﹳ1.MTH7301(new CLS200(ˑٴ1, activity0, s, 3));
                if(CLS66.MTH1433(s, CLS27.MTH904())) {
                    if(CLS27.MTH895().MTH938("room_manangement_enable", false)) {
                        CLS29 ˎᵢ0 = CLS27.MTH895();
                        z1 = CLS182.MTH3480(4101202226578248501L, CLS182.MTH3483(s), ˎᵢ0, false) ? false : true;
                    }
                    else {
                        z1 = true;
                    }
                    יﹳ1.MTH7305(new CLS455(ˑٴ1, s, activity0, z1, arrayList0));
                }
                CLS523.MTH7147(linearLayout1, ((CLS18)יﹳ1), true);
                return;
            }
            case 1: {
                Menu menu2 = (Menu)arr_object[0];
                LinearLayout linearLayout2 = (LinearLayout)arr_object[1];
                CLS525 ʻˑ2 = new CLS525(this.FLD4949, linearLayout2, menu2);
                ʻˑ2.MTH7187("export_", ((CLS3)new CLS1594(this.FLD4948, this.FLD4949, this.FLD4950, 1)));
                ʻˑ2.MTH7188();
                CLS1624 יﹳ2 = new CLS1624(this.FLD4949);
                CLS335 ˑٴ2 = new CLS335(this.FLD4949, this.FLD4948);
                יﹳ2.MTH7303(ˑٴ2);
                יﹳ2.MTH7311();
                יﹳ2.FLD5274 = new CLS1270(ˑٴ2, 4);
                יﹳ2.MTH7302();
                יﹳ2.MTH7308(5);
                יﹳ2.MTH7305(new CLS487(1, this.FLD4949, ˑٴ2));
                CLS523.MTH7147(linearLayout2, ((CLS18)יﹳ2), true);
                return;
            }
            default: {
                Menu menu0 = (Menu)arr_object[0];
                LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
                CLS335 ˑٴ0 = new CLS335(this.FLD4949, this.FLD4948);
                ˑٴ0.FLD3331 = true;
                CLS1626 ـﹳ0 = new CLS1626(this.FLD4949);
                CLS525 ʻˑ0 = new CLS525(this.FLD4949, linearLayout0, menu0);
                ʻˑ0.MTH7187("clear", ((CLS3)new CLS848(this.FLD4949, this.FLD4948, ـﹳ0, ˑٴ0, 20, 0)));
                ʻˑ0.MTH7187("export_", ((CLS3)new CLS954(this.FLD4949, this.FLD4948, 4)));
                ʻˑ0.MTH7187("import_", ((CLS3)new CLS1396(this.FLD4949, this.FLD4950, this.FLD4948, ـﹳ0, ˑٴ0, 0)));
                ʻˑ0.MTH7188();
                ـﹳ0.FLD5295 = false;
                ـﹳ0.MTH800(CLS27.MTH889("total"));
                ـﹳ0.MTH7325("" + this.FLD4948.size());
                CLS523.MTH7154(linearLayout0, ((CLS18)ـﹳ0), CLS523.MTH7137(10));
                CLS1624 יﹳ0 = new CLS1624(this.FLD4949);
                יﹳ0.FLD5274 = new CLS1270(ˑٴ0, 5);
                יﹳ0.MTH7302();
                יﹳ0.MTH7311();
                יﹳ0.MTH7303(ˑٴ0);
                יﹳ0.MTH7308(10);
                יﹳ0.MTH7305(new CLS427(ˑٴ0, this.FLD4949, this.FLD4948, ـﹳ0, 0));
                CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
            }
        }
    }
}

