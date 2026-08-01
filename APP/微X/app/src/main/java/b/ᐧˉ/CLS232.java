// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View.OnClickListener;
import android.view.View;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS8;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS34;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS78;
import b.ˊﾞ.CLS613;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public final class CLS232 implements View.OnClickListener {
    public final int FLD2257;
    public final Activity FLD2258;
    public final CLS899 FLD2259;

    public CLS232(CLS899 ʻʼ0, Activity activity0, int v) {
        this.FLD2257 = v;
        this.FLD2259 = ʻʼ0;
        this.FLD2258 = activity0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Activity activity0 = this.FLD2258;
        int v = 0;
        CLS899 ʻʼ0 = this.FLD2259;
        switch(this.FLD2257) {
            case 0: {
                ʻʼ0.getClass();
                ArrayList arrayList0 = new ArrayList();
                ʻʼ0.FLD1658.MTH5305(ʻʼ0.FLD2157, arrayList0);
                Iterator iterator0 = arrayList0.iterator();
                while(iterator0.hasNext()) {
                    iterator0.next();
                    if(CLS66.MTH1392("")) {
                        iterator0.remove();
                    }
                }
                CLS387.MTH5585(true, activity0, arrayList0, ((CLS2)new CLS915()), null, -1);
                return;
            }
            case 1: {
                ʻʼ0.getClass();
                ArrayList arrayList1 = new ArrayList();
                ʻʼ0.FLD1658.MTH5305(ʻʼ0.FLD2157, arrayList1);
                Iterator iterator1 = arrayList1.iterator();
                while(iterator1.hasNext()) {
                    iterator1.next();
                    if(!CLS66.MTH1392("")) {
                        iterator1.remove();
                    }
                }
                CLS387.MTH5585(true, activity0, arrayList1, ((CLS2)new CLS1101()), null, -1);
                return;
            }
            case 2: {
                ʻʼ0.getClass();
                try {
                    CLS976 ˉˆ0 = new CLS976();
                    CLS387.MTH5585(true, activity0, ʻʼ0.FLD1662, ((CLS2)ˉˆ0), null, -1);
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 3: {
                ʻʼ0.getClass();
                if(!CLS412.MTH6002() && !CLS27.MTH895().MTH938("add_contacts_warn_disable", false)) {
                    CLS395.MTH5745(activity0, ((CLS11)new CLS1046(activity0)), CLS27.MTH889("add_contacts_disclaimer"), "add_contacts_warn_disable");
                    return;
                }
                CLS387.MTH5594(activity0, new ArrayList(), false);
                return;
            }
            case 4: {
                ʻʼ0.getClass();
                if(!CLS412.MTH6002() && !CLS27.MTH895().MTH938("add_contacts_warn_disable", false)) {
                    CLS395.MTH5745(activity0, ((CLS11)new CLS959(activity0)), CLS27.MTH889("add_contacts_disclaimer"), "add_contacts_warn_disable");
                    return;
                }
                CLS387.MTH5594(activity0, new ArrayList(), true);
                return;
            }
            case 5: {
                ʻʼ0.getClass();
                ArrayList arrayList2 = new ArrayList();
                ʻʼ0.FLD1658.MTH5305(ʻʼ0.FLD2157, arrayList2);
                CLS387.MTH5585(true, activity0, CLS372.MTH5414(arrayList2), ((CLS2)new CLS1200(activity0)), null, -1);
                return;
            }
            case 6: {
                ʻʼ0.getClass();
                ArrayList arrayList3 = new ArrayList();
                CLS371 ʻ0 = ʻʼ0.FLD1658;
                ʻ0.MTH5305(ʻʼ0.FLD2157, arrayList3);
                Iterator iterator2 = arrayList3.iterator();
                while(iterator2.hasNext()) {
                    iterator2.next();
                    if(ʻ0.MTH5355("")) {
                        iterator2.remove();
                    }
                }
                CLS387.MTH5585(true, activity0, arrayList3, ((CLS2)new CLS613()), null, -1);
                return;
            }
            case 7: {
                ʻʼ0.getClass();
                ArrayList arrayList4 = new ArrayList();
                CLS371 ʻ1 = ʻʼ0.FLD1658;
                ʻ1.MTH5305(ʻʼ0.FLD2157, arrayList4);
                Iterator iterator3 = arrayList4.iterator();
                while(iterator3.hasNext()) {
                    iterator3.next();
                    if(!ʻ1.MTH5355("")) {
                        iterator3.remove();
                    }
                }
                CLS387.MTH5585(true, activity0, arrayList4, ((CLS2)new CLS1142()), null, -1);
                return;
            }
            case 8: {
                ʻʼ0.getClass();
                CLS69 ʾᵢ0 = new CLS69();
                ʾᵢ0.MTH1560(CLS34.MTH1059(4101030045634319157L, ʾᵢ0, CLS34.MTH1059(4101030483720983349L, ʾᵢ0, CLS34.MTH1059(4101030367756866357L, ʾᵢ0, CLS34.MTH1059(4101030247497782069L, ʾᵢ0, CLS34.MTH1059(4101029620432556853L, ʾᵢ0, CLS34.MTH1059(4101029556008047413L, ʾᵢ0, CLS34.MTH1059(4101029465813734197L, ʾᵢ0, CLS34.MTH1059(4101029921080267573L, ʾᵢ0, CLS34.MTH1059(4101029839475888949L, ʾᵢ0, CLS34.MTH1059(4101029762166477621L, ʾᵢ0, CLS34.MTH1059(4101029676267131701L, ʾᵢ0, CLS34.MTH1059(4101029053496873781L, ʾᵢ0, CLS34.MTH1059(4101028989072364341L, ʾᵢ0, CLS34.MTH1059(4101028911762953013L, ʾᵢ0, CLS27.MTH889("req_phone"), 4101028937532756789L), 4101029023432102709L), 4101029066381775669L), 4101029719216804661L), 4101029787936281397L), 0x38E9C8F12B3CD335L), 4101029401389224757L), 4101029513058374453L), 4101029581777851189L), 4101029641907393333L), 4101030286152487733L), 4101030432181375797L), 4101029968324907829L), 4101030105763861301L), "unknown");
                ArrayList arrayList5 = new ArrayList(ʾᵢ0.MTH1566());
                ArrayList arrayList6 = new ArrayList();
                String s1 = ʻʼ0.FLD2151.MTH925("friendreq_cycle_types", "");
                if(!TextUtils.isEmpty(s1)) {
                    String[] arr_s = s1.split(",");
                    while(v < arr_s.length) {
                        arrayList6.add(((String)ʾᵢ0.MTH1559(arr_s[v])));
                        ++v;
                    }
                }
                CLS523.MTH7144(activity0, ((CLS8)new CLS1090(ʻʼ0, ʾᵢ0)), TextUtils.join(",", arrayList6), arrayList5);
                return;
            }
            case 9: {
                ʻʼ0.getClass();
                try {
                    ArrayList arrayList7 = new ArrayList();
                    CLS371.FLD3470.MTH5330(arrayList7);
                    CLS387.MTH5585(true, activity0, arrayList7, ((CLS2)new CLS1216(ʻʼ0)), ʻʼ0.FLD2151.MTH925("auto_req_new_member_list", ""), -1);
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 10: {
                ʻʼ0.getClass();
                ArrayList arrayList8 = new ArrayList();
                CLS371.FLD3470.getClass();
                Cursor cursor0 = CLS371.FLD3470.MTH5307("select * from rcontact where type == 0 and username not like \'%@%\' and username not like \'gh_%\' and username not like \'fake_%\'", null);
                if(cursor0 != null) {
                    if(cursor0.moveToFirst()) {
                        while(true) {
                            String s2 = CLS182.MTH3472(4101271010479493941L, cursor0);
                            String s3 = CLS182.MTH3472(4101271049134199605L, cursor0);
                            String s4 = CLS182.MTH3472(4101271087788905269L, cursor0);
                            if(!TextUtils.isEmpty(s4)) {
                                s3 = s4;
                            }
                            if(TextUtils.isEmpty(s3)) {
                                s3 = s2;
                            }
                            String s5 = CLS613.MTH1971(s3);
                            if(!TextUtils.isEmpty(s2)) {
                                CLS78 ˊﾞ0 = new CLS78(s2, s5);
                                ˊﾞ0.FLD271 = true;
                                arrayList8.add(ˊﾞ0);
                            }
                            if(!cursor0.moveToNext()) {
                                break;
                            }
                        }
                    }
                    cursor0.close();
                }
                HashSet hashSet0 = new HashSet();
                Iterator iterator4 = arrayList8.iterator();
                while(iterator4.hasNext()) {
                    Object object0 = iterator4.next();
                    CLS78 ˊﾞ1 = (CLS78)object0;
                    if(hashSet0.contains("")) {
                        iterator4.remove();
                    }
                    else {
                        hashSet0.add("");
                    }
                }
                ArrayList arrayList9 = ʻʼ0.FLD2151.MTH929("deleted_contacts_%");
                if(!arrayList9.isEmpty()) {
                    for(Object object1: arrayList9) {
                        Pair pair0 = (Pair)object1;
                        try {
                            JSONArray jSONArray0 = new JSONArray(((String)pair0.second));
                            for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                                JSONObject jSONObject0 = jSONArray0.getJSONObject(v1);
                                String s6 = jSONObject0.getString("u");
                                if(!CLS371.FLD3470.MTH5382(s6) && !hashSet0.contains(s6)) {
                                    hashSet0.add(s6);
                                    CLS78 ˊﾞ2 = new CLS78(s6, jSONObject0.getString("n"));
                                    ˊﾞ2.FLD271 = true;
                                    arrayList8.add(ˊﾞ2);
                                }
                            }
                        }
                        catch(Throwable throwable3) {
                            CLS27.MTH893(throwable3);
                        }
                    }
                }
                CLS387.MTH5585(true, activity0, arrayList8, ((CLS2)new CLS914()), null, -1);
                return;
            }
            case 11: {
                ʻʼ0.getClass();
                CLS69 ʾᵢ1 = new CLS69();
                ʾᵢ1.MTH1560(CLS34.MTH1059(4101028387776942901L, ʾᵢ1, CLS34.MTH1059(4101028830158574389L, ʾᵢ1, CLS27.MTH889("zombie_deleted"), 4101028314762498869L), 4101028430726615861L), "banned");
                ArrayList arrayList10 = new ArrayList();
                String[] arr_s1 = CLS502.MTH6941(ʻʼ0.FLD2151.MTH925("detect_zombie_type", ""));
                while(v < arr_s1.length) {
                    arrayList10.add(((String)ʾᵢ1.MTH1559(arr_s1[v])));
                    ++v;
                }
                ArrayList arrayList11 = new ArrayList(ʾᵢ1.MTH1566());
                CLS523.MTH7146(activity0, CLS27.MTH889("zombie_type_select"), arrayList11, ((CLS8)new CLS1175(ʻʼ0, ʾᵢ1)), TextUtils.join(",", arrayList10));
                return;
            }
            default: {
                ʻʼ0.getClass();
                try {
                    CLS1029 ˎٴ0 = new CLS1029(ʻʼ0);
                    String s = ʻʼ0.FLD2151.MTH925("zombie_excl_list", "");
                    CLS387.MTH5585(true, activity0, ʻʼ0.FLD1663, ((CLS2)ˎٴ0), s, -1);
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }
    }
}

