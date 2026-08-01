// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.app.Activity;
import android.app.AlertDialog;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˈˈ.CLS69;
import b.ˈˊ.CLS99;
import b.ᵔʾ.CLS304.CLS303;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1635;
import b.ﾞˎ.CLS534.CLS533;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public final class CLS1213 implements CLS17, CLS379 {
    public final Object FLD2865;
    public final Object FLD2866;
    public final Activity FLD2867;
    public final Object FLD2868;
    public final CLS1635 FLD2869;
    public final boolean FLD2870;
    public final Object FLD2871;
    public final Object FLD2872;
    public final Object FLD2873;

    public CLS1213(CLS1078 ـˆ0, CLS99 ﾞᵎ0, String s, Activity activity0, AlertDialog[] arr_alertDialog, CLS978 ˉˉ0, boolean z, ArrayList arrayList0, CLS1635 ﾞᵎ1) {
        this.FLD2871 = ـˆ0;
        this.FLD2868 = ﾞᵎ0;
        this.FLD2873 = s;
        this.FLD2867 = activity0;
        this.FLD2872 = arr_alertDialog;
        this.FLD2865 = ˉˉ0;
        this.FLD2870 = z;
        this.FLD2866 = arrayList0;
        this.FLD2869 = ﾞᵎ1;
    }

    public CLS1213(CLS1622 ˑٴ0, Activity activity0, CLS1635 ﾞᵎ0, CLS1626 ـﹳ0, CLS1635 ﾞᵎ1, CLS1622 ˑٴ1, CLS1625 ـˏ0, boolean z, CLS303 ᵔʾ$ˆٴ0) {
        this.FLD2871 = ˑٴ0;
        this.FLD2867 = activity0;
        this.FLD2869 = ﾞᵎ0;
        this.FLD2872 = ـﹳ0;
        this.FLD2873 = ﾞᵎ1;
        this.FLD2868 = ˑٴ1;
        this.FLD2865 = ـˏ0;
        this.FLD2870 = z;
        this.FLD2866 = ᵔʾ$ˆٴ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        String[] arr_s4;
        List list0;
        CLS1078 ـˆ0 = (CLS1078)this.FLD2871;
        CLS99 ﾞᵎ0 = (CLS99)this.FLD2868;
        String s = (String)this.FLD2873;
        Activity activity0 = this.FLD2867;
        AlertDialog[] arr_alertDialog = (AlertDialog[])this.FLD2872;
        CLS3 ˆٴ0 = (CLS3)this.FLD2865;
        boolean z = this.FLD2870;
        ـˆ0.getClass();
        LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
        Calendar calendar0 = Calendar.getInstance();
        CLS1635 ﾞᵎ1 = this.FLD2869;
        ArrayList arrayList0 = (ArrayList)this.FLD2866;
        calendar0.setTime(new Date(System.currentTimeMillis()));
        SimpleDateFormat simpleDateFormat0 = ـˆ0.FLD2316;
        if(ﾞᵎ0.FLD489 && !ﾞᵎ0.FLD497) {
            if(TextUtils.isEmpty(s)) {
                CLS1625 ـˏ0 = new CLS1625(activity0);
                ـˏ0.MTH800(CLS27.MTH889("set_multi_days"));
                ـˏ0.MTH7320(new CLS258(ـˆ0, arr_alertDialog, ﾞᵎ0, ˆٴ0, 6));
                CLS523.MTH7147(linearLayout0, ((CLS18)ـˏ0), true);
            }
            CLS1626 ـﹳ0 = new CLS1626(activity0);
            CLS1626 ـﹳ1 = new CLS1626(activity0);
            CLS1622 ˑٴ0 = new CLS1622(activity0);
            CLS1626 ـﹳ2 = new CLS1626(activity0);
            String[] arr_s = TextUtils.isEmpty(s) ? new String[]{"#" + calendar0.get(7), simpleDateFormat0.format(calendar0.getTime()), "08:00_20:00_30_f"} : s.split(" ");
            if(!z || arr_s.length != 2) {
                arrayList0.clear();
                list0 = Arrays.asList(arr_s);
            }
            else {
                arrayList0.clear();
                list0 = Arrays.asList(new String[]{arr_s[0], arr_s[1], "08:00_20:00_30_f"});
            }
            arrayList0.addAll(list0);
            CLS69 ʾᵢ0 = new CLS69();
            ʾᵢ0.MTH1560(CLS182.MTH3497(1, ʾᵢ0, CLS182.MTH3497(7, ʾᵢ0, CLS182.MTH3497(6, ʾᵢ0, CLS182.MTH3497(5, ʾᵢ0, CLS182.MTH3497(4, ʾᵢ0, CLS182.MTH3497(3, ʾᵢ0, CLS182.MTH3497(2, ʾᵢ0, CLS27.MTH889("week_mon"), 4100610650667799349L), 4100610689322505013L), 4100610727977210677L), 4100606918341219125L), 4100606956995924789L), 4100606995650630453L), 4100607034305336117L), 8);
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add(CLS27.MTH889("week_mon"));
            arrayList1.add(CLS27.MTH889("week_tue"));
            arrayList1.add(CLS27.MTH889("week_wed"));
            arrayList1.add(CLS27.MTH889("week_thu"));
            arrayList1.add(CLS27.MTH889("week_fri"));
            arrayList1.add(CLS27.MTH889("week_sat"));
            arrayList1.add(CLS27.MTH889("week_sun"));
            arrayList1.add(CLS27.MTH889("every_day"));
            CLS1620 ˊˏ0 = new CLS1620(activity0);
            ˊˏ0.MTH7248(((CLS533)new CLS1036(arrayList0, ʾᵢ0, z, ﾞᵎ1, ـﹳ0, ـﹳ1, ˑٴ0, ـﹳ2)));
            int v = Integer.parseInt(((String)arrayList0.get(0)).substring(1));
            ˊˏ0.MTH7247(arrayList1);
            ˊˏ0.MTH7246(((String)ʾᵢ0.MTH1559(v)));
            if(arrayList0.size() > 2) {
                String[] arr_s1 = ((String)arrayList0.get(2)).split("_");
                if(arr_s1.length > 3) {
                    ﾞᵎ1.MTH7437("t".equals(arr_s1[3]));
                }
            }
            ﾞᵎ1.MTH800(CLS27.MTH889("interval_repeat"));
            ﾞᵎ1.MTH7438(new CLS256(ـﹳ0, ـﹳ1, ˑٴ0, ـﹳ2, arrayList0));
            ـﹳ0.MTH800(CLS27.MTH889("start_time"));
            ـﹳ0.MTH7324(new CLS260(ـˆ0, arrayList0, activity0, ـﹳ0, ˑٴ0, 0));
            ـﹳ1.MTH800(CLS27.MTH889("end_time"));
            ـﹳ1.MTH7324(new CLS260(ـˆ0, arrayList0, activity0, ـﹳ1, ˑٴ0, 1));
            ˑٴ0.MTH800(CLS27.MTH889("repeat_time"));
            if(arrayList0.size() > 2) {
                String[] arr_s2 = ((String)arrayList0.get(2)).split("_");
                if(arr_s2.length > 2) {
                    ˑٴ0.MTH7277(arr_s2[2]);
                    ˑٴ0.MTH798((arr_s2.length <= 3 || !"t".equals(arr_s2[3]) ? "" : String.format(CLS27.MTH889("timestring_repeat_interval"), arr_s2[0], arr_s2[1], arr_s2[2])));
                }
            }
            ˑٴ0.FLD5252 = new CLS1156(arrayList0, ˑٴ0, 10);
            ـﹳ2.MTH800(CLS27.MTH889("select_time"));
            ـﹳ2.MTH7325(((String)arrayList0.get(1)));
            ـﹳ2.MTH7324(new CLS254(ـˆ0, arrayList0, calendar0, activity0, ـﹳ2, 0));
            if(!z || !((String)arrayList0.get(0)).equals("#8")) {
                CLS523.MTH7157(true, new CLS18[]{ﾞᵎ1, ـﹳ0, ـﹳ1, ˑٴ0});
            }
            else {
                CLS523.MTH7157(!ﾞᵎ1.MTH7444(), new CLS18[]{ـﹳ0, ـﹳ1, ˑٴ0});
                CLS523.MTH7157(ﾞᵎ1.MTH7444(), new CLS18[]{ـﹳ2});
                if(arrayList0.size() > 2) {
                    String[] arr_s3 = ((String)arrayList0.get(2)).split("_");
                    ـﹳ0.MTH7325(arr_s3[0]);
                    ـﹳ1.MTH7325(arr_s3[1]);
                }
            }
            CLS1623 יᐧ0 = new CLS1623(activity0);
            יᐧ0.MTH7289(new Object[]{ˊˏ0, ـﹳ2, ﾞᵎ1, ـﹳ0, ـﹳ1, ˑٴ0});
            יᐧ0.MTH7290(linearLayout0, CLS523.MTH7137(3));
            return;
        }
        arrayList0.clear();
        if(TextUtils.isEmpty(s)) {
            arr_s4 = new String[2];
            Date date0 = calendar0.getTime();
            arr_s4[0] = ـˆ0.FLD2315.format(date0);
            arr_s4[1] = simpleDateFormat0.format(calendar0.getTime());
        }
        else {
            arr_s4 = s.split(" ");
        }
        arrayList0.addAll(Arrays.asList(arr_s4));
        CLS1626 ـﹳ3 = new CLS1626(activity0);
        ـﹳ3.MTH800(CLS27.MTH889("select_date"));
        ـﹳ3.MTH7325(((String)arrayList0.get(0)));
        ـﹳ3.MTH7324(new CLS224(ـˆ0, arrayList0, activity0, ـﹳ3, 1));
        CLS1626 ـﹳ4 = new CLS1626(activity0);
        ـﹳ4.MTH800(CLS27.MTH889("select_time"));
        ـﹳ4.MTH7325(((String)arrayList0.get(1)));
        ـﹳ4.MTH7324(new CLS254(ـˆ0, arrayList0, calendar0, activity0, ـﹳ4, 1));
        CLS1623 יᐧ1 = new CLS1623(activity0);
        יᐧ1.MTH7289(new Object[]{ـﹳ3, ـﹳ4});
        יᐧ1.MTH7290(linearLayout0, CLS523.MTH7137(3));
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        CLS1622 ˑٴ0 = (CLS1622)this.FLD2871;
        CLS1626 ـﹳ0 = (CLS1626)this.FLD2872;
        CLS1635 ﾞᵎ0 = (CLS1635)this.FLD2873;
        CLS1622 ˑٴ1 = (CLS1622)this.FLD2868;
        CLS303 ᵔʾ$ˆٴ0 = (CLS303)this.FLD2866;
        int v = CLS523.MTH7137(10);
        CLS523.MTH7147(linearLayout0, ((CLS18)ˑٴ0), true);
        CLS1623 יᐧ0 = new CLS1623(this.FLD2867);
        Object[] arr_object = new Object[2];
        CLS1635 ﾞᵎ1 = this.FLD2869;
        arr_object[0] = ﾞᵎ1;
        arr_object[1] = ـﹳ0;
        יᐧ0.MTH7289(arr_object);
        CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v);
        CLS1623 יᐧ1 = new CLS1623(this.FLD2867);
        יᐧ1.MTH7289(new Object[]{ﾞᵎ0, ˑٴ1});
        יᐧ1.MTH7290(linearLayout0, v);
        CLS523.MTH7154(linearLayout0, ((CLS18)(((CLS1625)this.FLD2865))), v);
        if(this.FLD2870) {
            ᵔʾ$ˆٴ0.getClass();
            ـﹳ0.MTH798(CLS372.MTH5417(TextUtils.join(",", ᵔʾ$ˆٴ0.FLD3162)));
            ﾞᵎ1.MTH7437(ᵔʾ$ˆٴ0.FLD3159);
            ˑٴ0.MTH7277(ᵔʾ$ˆٴ0.FLD3160);
            ﾞᵎ0.MTH7437(ᵔʾ$ˆٴ0.FLD3166);
            ˑٴ1.MTH7277((ᵔʾ$ˆٴ0.FLD3166 ? ᵔʾ$ˆٴ0.MTH4903() : String.valueOf(ᵔʾ$ˆٴ0.MTH4904())));
        }
    }
}

