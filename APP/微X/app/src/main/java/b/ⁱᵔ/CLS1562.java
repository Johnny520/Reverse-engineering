// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS568;
import b.ˆʿ.CLS61;
import b.ˈˈ.CLS67;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS848;
import b.ᐧˉ.CLS1043;
import b.ᐧˉ.CLS250;
import b.ᐧˉ.CLS954;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS289;
import b.ⁱʾ.CLS335;
import b.ⁱʾ.CLS369;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS525;
import b.ﾞᐧ.CLS557;
import java.util.ArrayList;
import org.json.JSONArray;

public final class CLS1562 implements CLS16, CLS17, CLS378, CLS379 {
    public final int FLD4866;
    public final Activity FLD4867;
    public final ArrayList FLD4868;

    public CLS1562(Activity activity0, ArrayList arrayList0, int v) {
        this.FLD4866 = v;
        this.FLD4867 = activity0;
        this.FLD4868 = arrayList0;
        super();
    }

    public CLS1562(ArrayList arrayList0, Activity activity0, int v) {
        this.FLD4866 = v;
        this.FLD4868 = arrayList0;
        this.FLD4867 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        ʻˑ0.MTH7187("keep_one_chatroom", ((CLS3)new CLS954(this.FLD4867, this.FLD4868, 2)));
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        ArrayList arrayList0 = this.FLD4868;
        if(this.FLD4866 == 1) {
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            CLS568 יᐧ0 = new CLS568(new CLS557[]{null}, arrayList0, 12);
            CLS1623 יᐧ1 = new CLS1623(this.FLD4867);
            CLS1625 ـˏ0 = new CLS1625(this.FLD4867);
            ـˏ0.MTH800(CLS27.MTH889("play_voice"));
            ـˏ0.MTH7320(new CLS480(this.FLD4867, יᐧ0));
            יᐧ1.MTH7296(ـˏ0);
            יᐧ1.MTH7290(linearLayout0, CLS523.MTH7137(10));
            CLS1623 יᐧ2 = new CLS1623(this.FLD4867);
            CLS1622 ˑٴ0 = new CLS1622(this.FLD4867);
            ˑٴ0.MTH800(CLS27.MTH889("mp3_split"));
            ˑٴ0.MTH7277(String.valueOf(CLS27.MTH895().MTH927(60, "merge_voices_split")));
            ˑٴ0.FLD5252 = new CLS1225(22);
            CLS1625 ـˏ1 = new CLS1625(this.FLD4867);
            ـˏ1.MTH800(CLS27.MTH889("forward_to_friends"));
            ـˏ1.MTH7320(new CLS480(this.FLD4867, יᐧ0, 1));
            יᐧ2.MTH7289(new Object[]{ˑٴ0, ـˏ1});
            יᐧ2.MTH7290(linearLayout0, CLS523.MTH7137(10));
            CLS1623 יᐧ3 = new CLS1623(this.FLD4867);
            CLS1625 ـˏ2 = new CLS1625(this.FLD4867);
            ـˏ2.MTH800(CLS27.MTH889("export_as_mp3"));
            ـˏ2.MTH7320(new CLS480(this.FLD4867, יᐧ0, 2));
            CLS1625 ـˏ3 = new CLS1625(this.FLD4867);
            ـˏ3.MTH800(CLS27.MTH889("export_as_wav"));
            ـˏ3.MTH7320(new CLS480(this.FLD4867, יᐧ0, 3));
            יᐧ3.MTH7289(new Object[]{ـˏ2, ـˏ3});
            יᐧ3.MTH7290(linearLayout0, CLS523.MTH7137(10));
            return;
        }
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        Object object0 = CLS40.FLD157.MTH1118(CLS61.class);
        arrayList0.addAll(((CLS61)object0).MTH1316());
        CLS369 ﾞᵎ0 = new CLS369(this.FLD4867, arrayList0);
        CLS525 ʻˑ0 = new CLS525(this.FLD4867, linearLayout1, menu0);
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS702(arrayList0, ((CLS61)object0), ﾞᵎ0, 26)));
        ʻˑ0.MTH7187("import_", ((CLS3)new CLS848(((CLS61)object0), arrayList0, ﾞᵎ0, this.FLD4867, 14, 0)));
        ʻˑ0.MTH7187("export_", ((CLS3)new CLS702(arrayList0, ((CLS61)object0), this.FLD4867, 27)));
        ʻˑ0.MTH7187("add_wxid", ((CLS3)new CLS1566(this.FLD4867, arrayList0, 2, ﾞᵎ0)));
        ʻˑ0.MTH7188();
        CLS1624 יﹳ0 = new CLS1624(this.FLD4867);
        יﹳ0.FLD5274 = new CLS1043(ﾞᵎ0, 9);
        יﹳ0.MTH7302();
        יﹳ0.MTH7303(ﾞᵎ0);
        יﹳ0.MTH7308(10);
        יﹳ0.MTH7305(new CLS250(this.FLD4867, ﾞᵎ0, ((CLS61)object0), arrayList0, 4));
        CLS523.MTH7147(linearLayout1, ((CLS18)יﹳ0), true);
    }

    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        if(!TextUtils.isEmpty(s)) {
            JSONArray jSONArray0 = CLS412.MTH5997(this.FLD4868);
            String s1 = CLS31.MTH979(s, "json");
            CLS31.MTH999(this.FLD4867, jSONArray0.toString(), s1);
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        ArrayList arrayList0 = this.FLD4868;
        Activity activity0 = this.FLD4867;
        if(this.FLD4866 == 0) {
            CLS1624 יﹳ0 = new CLS1624(activity0);
            CLS335 ˑٴ0 = new CLS335(activity0);
            CLS1625 ـˏ0 = new CLS1625(activity0);
            ـˏ0.MTH800(CLS27.MTH889("exclude_wxid_module_load"));
            ـˏ0.MTH7320(new CLS67(activity0, arrayList0, ˑٴ0, 21));
            CLS1623 יᐧ0 = new CLS1623(activity0);
            יᐧ0.MTH798(CLS27.MTH889("manage_wxid_module_load_desc"));
            יᐧ0.MTH7296(ـˏ0);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(10));
            CLS1411 ˊˎ0 = new CLS1411(0, ˑٴ0, arrayList0);
            יﹳ0.MTH7303(ˑٴ0);
            יﹳ0.MTH7305(new CLS504(activity0, arrayList0, ˑٴ0, 2));
            ˊˎ0.MTH774();
            CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
            return;
        }
        CLS1624 יﹳ1 = new CLS1624(activity0);
        CLS335 ˑٴ1 = new CLS335(activity0, arrayList0);
        יﹳ1.MTH7303(ˑٴ1);
        יﹳ1.FLD5276 = false;
        יﹳ1.MTH7301(new CLS289(1, activity0, ˑٴ1));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ1), true);
    }
}

