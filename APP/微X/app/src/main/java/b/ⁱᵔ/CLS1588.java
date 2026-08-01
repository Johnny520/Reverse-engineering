// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS566;
import b.ʾᵢ.CLS573;
import b.ˈˈ.CLS78;
import b.ˈˊ.CLS611;
import b.ˑٴ.CLS651;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS739;
import b.ˑٴ.CLS848;
import b.ᐧˉ.CLS1214;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS237;
import b.ᐧˉ.CLS267;
import b.ᵔʾ.CLS288;
import b.ᵔʾ.CLS295;
import b.ⁱʾ.CLS1266;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱˉ.CLS370;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;
import java.util.HashSet;

public final class CLS1588 implements CLS17, CLS378, CLS379 {
    public final Activity FLD4981;
    public final Object FLD4982;
    public final boolean FLD4983;
    public final ArrayList FLD4984;
    public final Object FLD4985;
    public final Object FLD4986;
    public final Object FLD4987;

    public CLS1588(Activity activity0, CLS29 ˎᵢ0, ArrayList arrayList0, CLS369 ﾞᵎ0, boolean z, String s, CLS573 ⁱʽ0) {
        this.FLD4981 = activity0;
        this.FLD4985 = ˎᵢ0;
        this.FLD4984 = arrayList0;
        this.FLD4982 = ﾞᵎ0;
        this.FLD4983 = z;
        this.FLD4987 = s;
        this.FLD4986 = ⁱʽ0;
    }

    public CLS1588(Activity activity0, CLS366 ﾞᐧ0, ArrayList arrayList0, Dialog[] arr_dialog, int[] arr_v, CLS2 ˆʿ0) {
        this.FLD4981 = activity0;
        this.FLD4985 = ﾞᐧ0;
        this.FLD4984 = arrayList0;
        this.FLD4983 = false;
        this.FLD4982 = arr_dialog;
        this.FLD4987 = arr_v;
        this.FLD4986 = ˆʿ0;
    }

    public CLS1588(Activity activity0, ArrayList arrayList0, CLS371 ʻ0, CLS500 ᵢﹶ0, boolean z, CLS1622 ˑٴ0, CLS29 ˎᵢ0) {
        this.FLD4981 = activity0;
        this.FLD4984 = arrayList0;
        this.FLD4985 = ʻ0;
        this.FLD4982 = ᵢﹶ0;
        this.FLD4983 = z;
        this.FLD4987 = ˑٴ0;
        this.FLD4986 = ˎᵢ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        String s = (String)this.FLD4987;
        CLS12 ᵔʾ0 = (CLS12)this.FLD4986;
        ʻˑ0.MTH7187("add", ((CLS3)new CLS1479(2, this.FLD4981, ((CLS369)this.FLD4982), ((CLS29)this.FLD4985), this.FLD4984)));
        ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1568(((CLS29)this.FLD4985), this.FLD4984, ((CLS369)this.FLD4982), 2)));
        if(this.FLD4983 && !TextUtils.isEmpty(s)) {
            ʻˑ0.MTH7187(s, ((CLS3)new CLS739(ᵔʾ0, 3)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Activity activity0 = this.FLD4981;
        ArrayList arrayList0 = this.FLD4984;
        CLS500 ᵢﹶ0 = (CLS500)this.FLD4982;
        boolean z = this.FLD4983;
        CLS1622 ˑٴ0 = (CLS1622)this.FLD4987;
        CLS29 ˎᵢ0 = (CLS29)this.FLD4986;
        Menu menu0 = (Menu)arr_object[0];
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        int v = CLS523.MTH7137(10);
        CLS1625 ـˏ0 = new CLS1625(activity0);
        CLS1625 ـˏ1 = new CLS1625(activity0);
        HashSet hashSet0 = new HashSet();
        CLS566 ˈˊ0 = new CLS566(activity0, hashSet0, arrayList0, ((CLS371)this.FLD4985), 5);
        CLS525 ʻˑ0 = new CLS525(activity0, linearLayout0, menu0);
        if(ᵢﹶ0.MTH6895("friend_request_type")) {
            ʻˑ0.MTH7187("friend_request_type", ((CLS3)new CLS651(activity0, 5)));
        }
        if(ᵢﹶ0.MTH6895("friend_request_import")) {
            ʻˑ0.MTH7187("import_", ((CLS3)new CLS739(((CLS12)ˈˊ0), 2)));
        }
        if(ᵢﹶ0.MTH6895("friend_request_phone") && !CLS182.MTH3470(4101360375864021813L)) {
            ʻˑ0.MTH7187("import_phone", ((CLS3)new CLS702(activity0, hashSet0, arrayList0, 28)));
        }
        String s = CLS27.MTH895().MTH925("zombies", "");
        if(!TextUtils.isEmpty(s)) {
            ʻˑ0.MTH7187("add_zombies", ((CLS3)new CLS848(s, activity0, hashSet0, arrayList0)));
        }
        ʻˑ0.MTH7188();
        if(!CLS412.MTH6002()) {
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            ـﹳ0.MTH798(CLS27.MTH889("add_contacts_warn"));
            ـﹳ0.FLD5295 = false;
            CLS523.MTH7147(linearLayout0, ((CLS18)ـﹳ0), true);
        }
        CLS1625 ـˏ2 = new CLS1625(activity0);
        ـˏ2.MTH800(CLS27.MTH889(CLS370.MTH5289((z ? 4101356841105937205L : 4101356884055610165L))));
        ـˏ2.MTH7320(new CLS385(activity0, z, ˈˊ0));
        ˑٴ0.MTH800(CLS27.MTH889("max"));
        ˑٴ0.MTH7278(2);
        CLS1623 יᐧ0 = new CLS1623(activity0);
        if(!z) {
            יᐧ0.MTH798(CLS27.MTH889("add_wxid_warning"));
        }
        יᐧ0.MTH7289(new Object[]{ـˏ2, ˑٴ0});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        CLS387.MTH5587(activity0, linearLayout0);
        CLS1266 ʾᵢ0 = new CLS1266(activity0);
        CLS1266 ʾᵢ1 = new CLS1266(activity0);
        CLS295.FLD3055.FLD3056 = new CLS1471(ʾᵢ0, ʾᵢ1, 2);
        CLS611 ﾞᐧ0 = new CLS611(new HashSet());
        ʾᵢ0.FLD3438 = ﾞᐧ0;
        ʾᵢ1.FLD3438 = ﾞᐧ0;
        ˎᵢ0.MTH922("", CLS370.MTH5289((z ? 0x38EAF27E2B3CD335L : 0x38EAF2142B3CD335L)));
        ـˏ0.MTH800(CLS27.MTH889("config_include"));
        ـˏ0.MTH7320(new CLS394(ˎᵢ0, z, arrayList0, activity0, ʾᵢ0));
        ـˏ1.MTH800(CLS27.MTH889("config_exclude"));
        ـˏ1.MTH7320(new CLS394(activity0, ʾᵢ1, arrayList0, ˎᵢ0, z));
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7289(new Object[]{ـˏ0, ـˏ1});
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ1), v);
        CLS1623 יᐧ2 = new CLS1623(activity0);
        CLS1625 ـˏ3 = new CLS1625(activity0);
        ـˏ3.MTH800(CLS27.MTH889("stop_requests"));
        ـˏ3.MTH7320(new CLS267(16));
        יᐧ2.MTH7296(ـˏ3);
        CLS1625 ـˏ4 = new CLS1625(activity0);
        CLS1625 ـˏ5 = new CLS1625(activity0);
        ـˏ4.MTH800(CLS27.MTH889("pause_requests"));
        ـˏ4.MTH7320(new CLS237(ـˏ4, ـˏ5, 2));
        יᐧ2.MTH7296(ـˏ4);
        ـˏ5.MTH800(CLS27.MTH889("resume_requests"));
        ـˏ5.MTH7320(new CLS237(ـˏ4, ـˏ5, 3));
        יᐧ2.MTH7296(ـˏ5);
        CLS288 ˈˊ1 = CLS288.FLD2989;
        if(ˈˊ1.FLD2975) {
            ـˏ4.MTH801(8);
            ـˏ5.MTH801(0);
        }
        else {
            ـˏ5.MTH801(8);
            ـˏ4.MTH801(0);
        }
        CLS1625 ـˏ6 = new CLS1625(activity0);
        ـˏ6.MTH800(CLS27.MTH889("clear_count"));
        ـˏ6.MTH7320(new CLS267(17));
        יᐧ2.MTH7296(ـˏ6);
        CLS1626 ـﹳ1 = new CLS1626(activity0);
        ـﹳ1.FLD5295 = false;
        CLS1214 ﾞᴵ0 = new CLS1214(ـﹳ1, 1);
        ﾞᴵ0.MTH774();
        ˈˊ1.FLD2979 = ﾞᴵ0;
        יᐧ2.MTH7296(ـﹳ1);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ2), v);
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        int v;
        CLS366 ﾞᐧ0 = (CLS366)this.FLD4985;
        boolean z = this.FLD4983;
        Dialog[] arr_dialog = (Dialog[])this.FLD4982;
        int[] arr_v = (int[])this.FLD4987;
        CLS2 ˆʿ0 = (CLS2)this.FLD4986;
        Activity activity0 = this.FLD4981;
        CLS1623 יᐧ0 = new CLS1623(activity0);
        CLS1624 יﹳ0 = new CLS1624(activity0);
        יﹳ0.FLD5274 = new CLS1599(ﾞᐧ0, 3);
        יﹳ0.MTH7302();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.FLD4984;
        for(Object object0: arrayList3) {
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(CLS426.MTH6126("")) {
                arrayList0.add(ˊﾞ0);
            }
            else if(CLS372.MTH5400("")) {
                arrayList2.add(ˊﾞ0);
            }
            else {
                arrayList1.add(ˊﾞ0);
            }
        }
        CLS1629 ⁱˉ0 = new CLS1629(activity0);
        ⁱˉ0.FLD5360 = true;
        ⁱˉ0.MTH7381("radio_public_account");
        if(arrayList2.isEmpty()) {
            ⁱˉ0.MTH7378("radio_public_account");
            v = 2;
        }
        else {
            v = 3;
        }
        ⁱˉ0.MTH7381("radio_friends");
        if(arrayList1.isEmpty()) {
            --v;
            ⁱˉ0.MTH7378("radio_friends");
        }
        ⁱˉ0.MTH7381("radio_chatrooms");
        if(arrayList0.isEmpty()) {
            --v;
            ⁱˉ0.MTH7378("radio_chatrooms");
        }
        if(v > 1) {
            ⁱˉ0.MTH7381("radio_all");
            ⁱˉ0.MTH7375("radio_all");
        }
        ⁱˉ0.FLD5356 = new CLS1547(ﾞᐧ0, arrayList2, arrayList1, arrayList0, arrayList3, 1);
        if(v > 1) {
            יᐧ0.MTH7296(ⁱˉ0);
        }
        else {
            ﾞᐧ0.MTH5276(arrayList3);
        }
        יﹳ0.MTH7303(ﾞᐧ0);
        יﹳ0.FLD5276 = false;
        יﹳ0.MTH7301(new CLS477(z, arr_dialog, arr_v, ˆʿ0, ﾞᐧ0, 1));
        יᐧ0.MTH7296(יﹳ0);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), CLS523.MTH7137(3));
    }
}

