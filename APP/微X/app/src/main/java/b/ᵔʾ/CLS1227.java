// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.widget.LinearLayout;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS16;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS6;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS44;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS67;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS79;
import b.ˈˈ.CLS91;
import b.ˈˈ.CLS93;
import b.ˑٴ.CLS737;
import b.ˑٴ.CLS751;
import b.ˑٴ.CLS786;
import b.ˑٴ.CLS794;
import b.ᐧˉ.CLS1019;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS210;
import b.ⁱʾ.CLS347;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS412.CLS411;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1625;
import b.ﾞˎ.CLS1627;
import b.ﾞˎ.CLS1629;
import b.ﾞˎ.CLS528;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

public final class CLS1227 implements CLS6, CLS16, CLS17, CLS39, CLS379 {
    public final int FLD2921;
    public final Object FLD2922;
    public final int FLD2923;
    public final Object FLD2924;
    public final Object FLD2925;
    public final Object FLD2926;
    public final Object FLD2927;

    public CLS1227(Activity activity0, CLS1629 ⁱˉ0, CLS1622 ˑٴ0, CLS1629 ⁱˉ1, CLS1629 ⁱˉ2, int v) {
        this.FLD2921 = 6;
        super();
        this.FLD2925 = activity0;
        this.FLD2922 = ⁱˉ0;
        this.FLD2924 = ˑٴ0;
        this.FLD2927 = ⁱˉ1;
        this.FLD2926 = ⁱˉ2;
        this.FLD2923 = v;
    }

    public CLS1227(CLS43 ˆʿ0, String s, ArrayList arrayList0, int v, ArrayList arrayList1, CLS347 ᐧי0) {
        this.FLD2921 = 8;
        super();
        this.FLD2925 = ˆʿ0;
        this.FLD2924 = s;
        this.FLD2927 = arrayList0;
        this.FLD2923 = v;
        this.FLD2926 = arrayList1;
        this.FLD2922 = ᐧי0;
    }

    public CLS1227(CLS794 ᴵʽ0, String s, String s1, int v, ContentValues contentValues0, String s2) {
        this.FLD2921 = 2;
        super();
        this.FLD2925 = ᴵʽ0;
        this.FLD2924 = s;
        this.FLD2922 = s1;
        this.FLD2923 = v;
        this.FLD2927 = contentValues0;
        this.FLD2926 = s2;
    }

    public CLS1227(CLS210 ˋʼ0, int v, ArrayList arrayList0, CLS359 ⁱˉ0, Activity activity0, CLS1624 יﹳ0) {
        this.FLD2921 = 4;
        super();
        this.FLD2925 = ˋʼ0;
        this.FLD2923 = v;
        this.FLD2927 = arrayList0;
        this.FLD2922 = ⁱˉ0;
        this.FLD2924 = activity0;
        this.FLD2926 = יﹳ0;
    }

    public CLS1227(CLS1019 ˎʻ0, String s, int v, ArrayList arrayList0, ArrayList arrayList1, ArrayList arrayList2) {
        this.FLD2921 = 5;
        super();
        this.FLD2925 = ˎʻ0;
        this.FLD2924 = s;
        this.FLD2923 = v;
        this.FLD2927 = arrayList0;
        this.FLD2926 = arrayList1;
        this.FLD2922 = arrayList2;
    }

    public CLS1227(CLS280 ʻᵎ0, CLS1228 ʾˈ0, String s, int v, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD2921 = 0;
        super();
        this.FLD2925 = ʻᵎ0;
        this.FLD2922 = ʾˈ0;
        this.FLD2924 = s;
        this.FLD2923 = v;
        this.FLD2927 = arrayList0;
        this.FLD2926 = arrayList1;
    }

    public CLS1227(Object object0, String s, Object object1, Object object2, int v, Object object3, int v1) {
        this.FLD2921 = v1;
        this.FLD2925 = object0;
        this.FLD2924 = s;
        this.FLD2922 = object1;
        this.FLD2927 = object2;
        this.FLD2923 = v;
        this.FLD2926 = object3;
        super();
    }

    public CLS1227(Object object0, String s, String s1, Serializable serializable0, Object object1, int v, int v1) {
        this.FLD2921 = v1;
        this.FLD2925 = object0;
        this.FLD2924 = s;
        this.FLD2922 = s1;
        this.FLD2927 = serializable0;
        this.FLD2926 = object1;
        this.FLD2923 = v;
        super();
    }

    // 此方法包含解密的字符串
    // This method was un-flattened
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        int v5;
        int v4;
        String[] arr_s2;
        String s11;
        int v7;
        int v6;
        boolean z6;
        HashMap hashMap2;
        CLS29 ˎᵢ2;
        CLS371 ʻ2;
        HashMap hashMap5;
        HashMap hashMap4;
        String s20;
        int v12;
        String[] arr_s6;
        String[] arr_s5;
        int v = this.FLD2923;
        Object object0 = this.FLD2926;
        Object object1 = this.FLD2927;
        Object object2 = this.FLD2922;
        Object object3 = this.FLD2924;
        Object object4 = this.FLD2925;
        switch(this.FLD2921) {
            case 1: {
                ((CLS794)object4).getClass();
                ((CLS794)object4).MTH2685(v, ((String)object3), ((String)object2), ((String)object1), ((String)object0), "");
                return;
            }
            case 2: {
                String s4 = (String)object2;
                ((CLS794)object4).getClass();
                String s5 = CLS426.MTH6106(v, ((String)object3), s4);
                boolean z3 = ((ContentValues)object1).containsKey("atuserlist");
                CLS371 ʻ0 = ((CLS794)object4).FLD1444;
                if(!z3 && CLS426.MTH6129(((String)object3))) {
                    String[] arr_s = CLS426.MTH6130(((String)object3));
                    if(arr_s != null) {
                        HashMap hashMap0 = CLS66.MTH1400(s4, Arrays.asList(CLS502.MTH6941(ʻ0.MTH5335(s4))), true);
                        ArrayList arrayList1 = new ArrayList();
                        for(int v1 = 0; v1 < arr_s.length; ++v1) {
                            String s6 = arr_s[v1];
                            if(hashMap0.containsKey(s6)) {
                                String s7 = (String)hashMap0.get(s6);
                                if(!TextUtils.isEmpty(s7) && !CLS27.MTH904().equals(s7)) {
                                    arrayList1.add(s7);
                                }
                            }
                        }
                        ((ContentValues)object1).put("atuserlist", TextUtils.join(",", arrayList1));
                        ((ContentValues)object1).put("atusercount", arrayList1.size());
                    }
                }
                String s8 = ((ContentValues)object1).containsKey("atuserlist") ? ((ContentValues)object1).getAsString("atuserlist") : "";
                CLS61 ﾞٴ0 = CLS794.MTH2698();
                CLS29 ˎᵢ1 = ((CLS794)object4).FLD1445;
                String s9 = ˎᵢ1.MTH925("ban_max_time", "");
                boolean z4 = TextUtils.isEmpty(s8);
                HashMap hashMap1 = ((CLS794)object4).FLD1157;
                if(z4) {
                    CLS371 ʻ1 = ʻ0;
                    HashMap hashMap3 = hashMap1;
                    int v9 = s5.indexOf("*~");
                    if(v9 != -1) {
                        s5 = s5.substring(0, v9).trim();
                    }
                    if(s5.startsWith("#b") || s5.startsWith("#ub") || s5.startsWith("#w") || s5.startsWith("#uw") || CLS502.MTH6934(s5, new String[]{"#um"}) || CLS502.MTH6934(s5, new String[]{"#dm"}) || CLS502.MTH6934(s5, new String[]{"#pb"}) || CLS502.MTH6934(s5, new String[]{"#upb"})) {
                        String[] arr_s3 = CLS502.MTH6941(s5);
                        if(arr_s3.length > 1) {
                            String[] arr_s4 = arr_s3[1].split(Pattern.quote("|"));
                            int v10 = arr_s4.length;
                            int v11 = 0;
                            while(v11 < v10) {
                                String s19 = arr_s4[v11];
                                if(TextUtils.isEmpty(s19) || s19.equals(CLS27.MTH904())) {
                                    ʻ2 = ʻ1;
                                    arr_s5 = arr_s3;
                                label_367:
                                    arr_s6 = arr_s4;
                                    v12 = v11;
                                    hashMap5 = hashMap3;
                                }
                                else {
                                    switch(arr_s3[0]) {
                                        case "#b": {
                                            arr_s5 = arr_s3;
                                            arr_s6 = arr_s4;
                                            v12 = v11;
                                            s20 = s9;
                                            hashMap4 = hashMap3;
                                            if(CLS426.MTH6118(s4, s19) || CLS182.MTH3480(0x38EC902B2B3CD335L, CLS182.MTH3483(s4), ˎᵢ1, false) && ﾞٴ0.MTH1337(s4, s19)) {
                                                hashMap5 = hashMap4;
                                                s9 = s20;
                                                ʻ2 = ʻ1;
                                                if(CLS182.MTH3480(0x38EC90982B3CD335L, CLS182.MTH3483(s4), ˎᵢ1, false) && ﾞٴ0.MTH1337(s4, s19)) {
                                                    CLS794.MTH2683(s4, String.format(CLS27.MTH889("ban_onwhitelist"), CLS66.MTH1452(s4, s19)), ((String)object0));
                                                }
                                                else if(CLS426.MTH6118(s4, s19)) {
                                                    CLS794.MTH2683(s4, String.format(CLS27.MTH889("ban_ismod"), CLS66.MTH1452(s4, s19)), ((String)object0));
                                                }
                                            }
                                            else {
                                                if(ﾞٴ0.FLD186 && ﾞٴ0.MTH1304(s4, s19)) {
                                                    s9 = s20;
                                                    ﾞٴ0.MTH1331(s4, s19, ((String)object0), s9, "");
                                                    hashMap5 = hashMap4;
                                                    ʻ2 = ʻ1;
                                                }
                                                else if(ʻ1.MTH5337(s4, s19)) {
                                                    hashMap4.put(s4 + s19, CLS66.MTH1452(s4, s19));
                                                    ﾞٴ0.MTH1331(s4, s19, ((String)object0), s20, "");
                                                    if(CLS182.MTH3480(4101811953020490549L, CLS182.MTH3483(s4), ˎᵢ1, true)) {
                                                        StringBuilder stringBuilder8 = CLS182.MTH3483(CLS426.MTH6125(s4, s19));
                                                        String s21 = CLS182.MTH3481(CLS27.MTH889("banned_by"), new Object[]{CLS66.MTH1452(s4, ((String)object0)), CLS182.MTH3473(0x38EC90F22B3CD335L, ˎᵢ1, CLS182.MTH3475(4101812670280028981L, CLS182.MTH3483(s4)))}, stringBuilder8);
                                                        if(!ﾞٴ0.FLD186 || TextUtils.isEmpty(s20)) {
                                                            hashMap5 = hashMap4;
                                                            s9 = s20;
                                                            ʻ2 = ʻ1;
                                                        }
                                                        else {
                                                            s9 = s20;
                                                            long v13 = Long.parseLong(s9, 16);
                                                            StringBuilder stringBuilder9 = CLS182.MTH3483(s21);
                                                            stringBuilder9.append("\n");
                                                            String s22 = CLS27.MTH889("auto_unban");
                                                            Object[] arr_object = new Object[1];
                                                            ʻ2 = ʻ1;
                                                            hashMap5 = hashMap4;
                                                            arr_object[0] = ((CLS794)object4).FLD1152.format(new Date(v13 + System.currentTimeMillis()));
                                                            s21 = CLS182.MTH3481(s22, arr_object, stringBuilder9);
                                                        }
                                                        CLS66.MTH1393(s4, s21, ((String)object0));
                                                    }
                                                    else {
                                                        hashMap5 = hashMap4;
                                                        s9 = s20;
                                                        ʻ2 = ʻ1;
                                                    }
                                                    CLS794.MTH2688(s4, s19);
                                                }
                                                else {
                                                    hashMap5 = hashMap4;
                                                    s9 = s20;
                                                    ʻ2 = ʻ1;
                                                }
                                                break;
                                            }
                                            break;
                                        }
                                        case "#dm": {
                                            if(ﾞٴ0.MTH1339(s4, s19)) {
                                                String s23 = CLS27.MTH889("downgrade_moderator");
                                                Object[] arr_object1 = new Object[1];
                                                arr_s5 = arr_s3;
                                                arr_object1[0] = CLS426.MTH6125(s4, s19);
                                                CLS66.MTH1393(s4, String.format(s23, arr_object1), s19);
                                                ﾞٴ0.MTH1318(0, s4, s19);
                                                ʻ2 = ʻ1;
                                                goto label_367;
                                            }
                                            ʻ2 = ʻ1;
                                            arr_s5 = arr_s3;
                                            goto label_367;
                                        }
                                        case "#pb": {
                                            arr_s5 = arr_s3;
                                            v12 = v11;
                                            s20 = s9;
                                            arr_s6 = arr_s4;
                                            hashMap4 = hashMap3;
                                            ﾞٴ0.MTH1331(s4, s19, ((String)object0), s9, "");
                                            StringBuilder stringBuilder10 = CLS182.MTH3483(CLS426.MTH6125(s4, s19));
                                            CLS66.MTH1393(s4, CLS182.MTH3481(CLS27.MTH889("banned_by"), new Object[]{CLS66.MTH1452(s4, ((String)object0)), CLS182.MTH3473(4101813005287478069L, ˎᵢ1, CLS182.MTH3475(0x38EC91242B3CD335L, CLS182.MTH3483(s4)))}, stringBuilder10), s19);
                                            ((CLS794)object4).MTH2702(s19);
                                            hashMap5 = hashMap4;
                                            s9 = s20;
                                            ʻ2 = ʻ1;
                                            break;
                                        }
                                        case "#ub": {
                                            arr_s5 = arr_s3;
                                            arr_s6 = arr_s4;
                                            v12 = v11;
                                            s20 = s9;
                                            hashMap4 = hashMap3;
                                            if(ﾞٴ0.MTH1304(s4, s19)) {
                                                ﾞٴ0.MTH1315(s4, s19);
                                                String s24 = (String)hashMap4.get(s4 + s19);
                                                if(TextUtils.isEmpty(s24)) {
                                                    s24 = CLS66.MTH1452(s4, s19);
                                                }
                                                CLS794.MTH2689(s4, String.format(CLS27.MTH889("unbanned"), s24));
                                                CLS426.MTH6120(s4, s19, true, null);
                                            }
                                            hashMap5 = hashMap4;
                                            s9 = s20;
                                            ʻ2 = ʻ1;
                                            break;
                                        }
                                        case "#um": {
                                            arr_s5 = arr_s3;
                                            if(!ﾞٴ0.MTH1339(s4, s19)) {
                                                ﾞٴ0.MTH1340(s4, s19);
                                                CLS66.MTH1393(s4, String.format(CLS27.MTH889("upgrade_to_moderator"), CLS426.MTH6125(s4, s19)), s19);
                                            }
                                            ʻ2 = ʻ1;
                                            goto label_367;
                                        }
                                        case "#upb": {
                                            arr_s5 = arr_s3;
                                            if(ﾞٴ0.MTH1304(s4, s19)) {
                                                ﾞٴ0.MTH1315(s4, s19);
                                                CLS794.MTH2689(s4, String.format(CLS27.MTH889("unbanned"), CLS66.MTH1452(s4, s19)));
                                                CLS426.MTH6120(s4, s19, true, null);
                                                ﾞٴ0.MTH1317(s19);
                                            }
                                            ʻ2 = ʻ1;
                                            goto label_367;
                                        }
                                        case "#uw": {
                                            arr_s5 = arr_s3;
                                            arr_s6 = arr_s4;
                                            v12 = v11;
                                            if(ʻ1.MTH5337(s4, s19) && !CLS426.MTH6118(s4, s19) && (!CLS182.MTH3480(0x38EC91702B3CD335L, CLS182.MTH3483(s4), ˎᵢ1, false) || ﾞٴ0.MTH1337(s4, s19)) && !ﾞٴ0.MTH1304(s4, s19)) {
                                                CLS466.MTH6542(s4, CLS426.MTH6125(s4, s19) + String.format(CLS27.MTH889("removed_from_whitelist"), ""));
                                                ﾞٴ0.MTH1318(2, s4, s19);
                                                return;
                                            }
                                            hashMap5 = hashMap3;
                                            ʻ2 = ʻ1;
                                            break;
                                        }
                                        case "#w": {
                                            arr_s5 = arr_s3;
                                            arr_s6 = arr_s4;
                                            v12 = v11;
                                            s20 = s9;
                                            hashMap4 = hashMap3;
                                            if(ʻ1.MTH5337(s4, s19) && !CLS426.MTH6118(s4, s19) && (!CLS182.MTH3480(4101813121251595061L, CLS182.MTH3483(s4), ˎᵢ1, false) || !ﾞٴ0.MTH1337(s4, s19)) && !ﾞٴ0.MTH1304(s4, s19)) {
                                                CLS466.MTH6542(s4, CLS426.MTH6125(s4, s19) + CLS27.MTH889("add_to_whitelist"));
                                                ﾞٴ0.MTH1333(s4, s19);
                                                return;
                                            }
                                            hashMap5 = hashMap4;
                                            s9 = s20;
                                            ʻ2 = ʻ1;
                                            break;
                                        }
                                        default: {
                                            ʻ2 = ʻ1;
                                            arr_s5 = arr_s3;
                                            goto label_367;
                                        }
                                    }
                                }
                                v11 = v12 + 1;
                                arr_s3 = arr_s5;
                                ʻ1 = ʻ2;
                                arr_s4 = arr_s6;
                                hashMap3 = hashMap5;
                            }
                        }
                    }
                }
                else {
                    String[] arr_s1 = CLS502.MTH6941(s8);
                    ArrayList arrayList2 = new ArrayList();
                    boolean z5 = CLS502.MTH6934(((String)object3), new String[]{"#b"});
                    if(!z5 || arr_s1.length <= 5) {
                        int v2 = arr_s1.length;
                        int v3 = 0;
                        while(v3 < v2) {
                            String s10 = arr_s1[v3];
                            if(!TextUtils.isEmpty(s10) && !s10.equals(CLS27.MTH904())) {
                                if(!CLS426.MTH6118(s4, s10)) {
                                    arr_s2 = arr_s1;
                                    v4 = v3;
                                    v5 = v2;
                                    if(!CLS182.MTH3480(4101815350339621685L, CLS182.MTH3483(s4), ˎᵢ1, false) || !ﾞٴ0.MTH1337(s4, s10)) {
                                        if(!z5 || !ﾞٴ0.FLD186 || !ﾞٴ0.MTH1304(s4, s10)) {
                                            z6 = z5;
                                            v6 = v4;
                                            v7 = v5;
                                            s11 = s9;
                                            ˎᵢ2 = ˎᵢ1;
                                            hashMap2 = hashMap1;
                                            arrayList2.add(s10);
                                        }
                                        else {
                                            v6 = v4;
                                            v7 = v5;
                                            s11 = s9;
                                            z6 = true;
                                            ˎᵢ2 = ˎᵢ1;
                                            ﾞٴ0.MTH1331(s4, s10, ((String)object0), s9, "");
                                            hashMap2 = hashMap1;
                                        }
                                        goto label_128;
                                    }
                                    else {
                                        if(z5) {
                                            CLS794.MTH2683(s4, String.format(CLS27.MTH889("ban_onwhitelist"), CLS66.MTH1452(s4, s10)), ((String)object0));
                                        }
                                    label_99:
                                        z6 = z5;
                                        v6 = v4;
                                        v7 = v5;
                                        s11 = s9;
                                        goto label_126;
                                    }
                                }
                                else if(z5) {
                                    arr_s2 = arr_s1;
                                    CLS794.MTH2683(s4, String.format(CLS27.MTH889("ban_ismod"), CLS66.MTH1452(s4, s10)), ((String)object0));
                                    v4 = v3;
                                    v5 = v2;
                                    goto label_99;
                                }
                            }
                            arr_s2 = arr_s1;
                            v6 = v3;
                            v7 = v2;
                            s11 = s9;
                            z6 = z5;
                        label_126:
                            ˎᵢ2 = ˎᵢ1;
                            hashMap2 = hashMap1;
                        label_128:
                            v3 = v6 + 1;
                            hashMap1 = hashMap2;
                            ˎᵢ1 = ˎᵢ2;
                            arr_s1 = arr_s2;
                            v2 = v7;
                            s9 = s11;
                            z5 = z6;
                        }
                        if(!arrayList2.isEmpty()) {
                            String s12 = CLS426.MTH6121(s4, arrayList2);
                            if(CLS502.MTH6934(((String)object3), new String[]{"#b"})) {
                                ﾞٴ0.MTH1327(s4, arrayList2, ((String)object0), s9, "");
                                StringBuilder stringBuilder3 = CLS182.MTH3483(s12);
                                String s13 = CLS182.MTH3481(CLS27.MTH889("banned_by"), new Object[]{CLS66.MTH1452(s4, ((String)object0)), CLS182.MTH3473(4101815062576812853L, ˎᵢ1, CLS182.MTH3475(4101815002447270709L, CLS182.MTH3483(s4)))}, stringBuilder3);
                                if(ﾞٴ0.FLD186 && !TextUtils.isEmpty(s9)) {
                                    long v8 = Long.parseLong(s9, 16);
                                    StringBuilder stringBuilder4 = CLS182.MTH3483(s13);
                                    stringBuilder4.append("\n");
                                    s13 = CLS182.MTH3481(CLS27.MTH889("auto_unban"), new Object[]{((CLS794)object4).FLD1152.format(new Date(v8 + System.currentTimeMillis()))}, stringBuilder4);
                                }
                                CLS466.MTH6542(s4, s13);
                                CLS751 יﹳ0 = new CLS751(0, s4, arrayList2);
                                CLS40.FLD157.MTH1117(((CLS39)יﹳ0), 5000L);
                                return;
                            }
                            if(CLS502.MTH6934(((String)object3), new String[]{"#w"})) {
                                StringBuilder stringBuilder5 = CLS182.MTH3483(s12);
                                stringBuilder5.append(CLS27.MTH889("add_to_whitelist"));
                                CLS466.MTH6542(s4, stringBuilder5.toString());
                                for(Object object6: arrayList2) {
                                    ﾞٴ0.MTH1333(s4, ((String)object6));
                                }
                                return;
                            }
                            if(CLS502.MTH6934(((String)object3), new String[]{"#uw"})) {
                                StringBuilder stringBuilder6 = CLS182.MTH3483(s12);
                                stringBuilder6.append(String.format(CLS27.MTH889("removed_from_whitelist"), ""));
                                CLS466.MTH6542(s4, stringBuilder6.toString());
                                for(Object object7: arrayList2) {
                                    ﾞٴ0.MTH1318(2, s4, ((String)object7));
                                }
                                return;
                            }
                            if(CLS502.MTH6934(((String)object3), new String[]{"#ub"})) {
                                for(Object object8: arrayList2) {
                                    String s14 = (String)object8;
                                    if(ﾞٴ0.MTH1304(s4, s14)) {
                                        ﾞٴ0.MTH1315(s4, s14);
                                        String s15 = (String)hashMap1.get(s4 + s14);
                                        if(TextUtils.isEmpty(s15)) {
                                            s15 = CLS66.MTH1452(s4, s14);
                                        }
                                        CLS794.MTH2689(s4, String.format(CLS27.MTH889("unbanned"), s15));
                                        CLS426.MTH6120(s4, s14, true, null);
                                    }
                                }
                                return;
                            }
                            if(CLS502.MTH6934(((String)object3), new String[]{"#pb"})) {
                                ﾞٴ0.MTH1327(s4, arrayList2, ((String)object0), s9, "");
                                StringBuilder stringBuilder7 = CLS182.MTH3483(s12);
                                CLS66.MTH1427(s4, CLS182.MTH3481(CLS27.MTH889("banned_by"), new Object[]{CLS66.MTH1452(s4, ((String)object0)), CLS182.MTH3473(4101815608037659445L, ˎᵢ1, CLS182.MTH3475(4101815547908117301L, CLS182.MTH3483(s4)))}, stringBuilder7), arrayList2);
                                for(Object object9: arrayList2) {
                                    ((CLS794)object4).MTH2702(((String)object9));
                                }
                                return;
                            }
                            if(CLS502.MTH6934(((String)object3), new String[]{"#upb"})) {
                                for(Object object10: arrayList2) {
                                    String s16 = (String)object10;
                                    if(ﾞٴ0.MTH1304(s4, s16)) {
                                        ﾞٴ0.MTH1315(s4, s16);
                                        CLS794.MTH2689(s4, String.format(CLS27.MTH889("unbanned"), CLS66.MTH1452(s4, s16)));
                                        CLS426.MTH6120(s4, s16, true, null);
                                        ﾞٴ0.MTH1317(s16);
                                    }
                                }
                                return;
                            }
                            if(CLS502.MTH6934(((String)object3), new String[]{"#um"})) {
                                for(Object object11: arrayList2) {
                                    String s17 = (String)object11;
                                    if(!ﾞٴ0.MTH1339(s4, s17)) {
                                        ﾞٴ0.MTH1340(s4, s17);
                                        CLS66.MTH1393(s4, String.format(CLS27.MTH889("upgrade_to_moderator"), CLS426.MTH6125(s4, s17)), s17);
                                    }
                                }
                                return;
                            }
                            if(CLS502.MTH6934(((String)object3), new String[]{"#dm"})) {
                                for(Object object12: arrayList2) {
                                    String s18 = (String)object12;
                                    if(ﾞٴ0.MTH1339(s4, s18)) {
                                        CLS66.MTH1393(s4, String.format(CLS27.MTH889("downgrade_moderator"), CLS426.MTH6125(s4, s18)), s18);
                                        ﾞٴ0.MTH1318(0, s4, s18);
                                    }
                                }
                                return;
                            }
                        }
                    }
                }
                return;
            }
            default: {
                CLS91 ᵔʾ0 = null;
                ((CLS786)object4).getClass();
                boolean z = CLS426.MTH6126(((String)object3));
                boolean z1 = ((CLS786)object4).FLD1447.FLD1438.MTH6895("rp_keyword");
                CLS44 ˆٴ0 = ((CLS786)object4).MTH2662();
                if(z1) {
                    StringBuilder stringBuilder0 = CLS182.MTH3483(((String)object2));
                    stringBuilder0.append("_REDPACKETS_");
                    HashSet hashSet0 = ˆٴ0.MTH1176(stringBuilder0.toString());
                    if(!hashSet0.isEmpty()) {
                        String s = ((ContentValues)object1).getAsString("title");
                        for(Object object5: hashSet0) {
                            String s1 = (String)object5;
                            if(!TextUtils.isEmpty(s1) && CLS502.MTH6930(s1, s)) {
                                StringBuilder stringBuilder1 = CLS182.MTH3483(((String)object2));
                                stringBuilder1.append("_REDPACKETS_");
                                ᵔʾ0 = ((CLS786)object4).MTH2660(ˆٴ0.MTH1171(stringBuilder1.toString(), s1), v, z, true);
                                if(ᵔʾ0 != null) {
                                    break;
                                }
                            }
                        }
                    }
                }
                CLS29 ˎᵢ0 = ((CLS786)object4).FLD1445;
                if(ᵔʾ0 == null) {
                    StringBuilder stringBuilder2 = CLS182.MTH3483(((String)object2));
                    stringBuilder2.append("_REDPACKETS_");
                    ArrayList arrayList0 = new ArrayList(ˆٴ0.MTH1173(stringBuilder2.toString()));
                    if(!TextUtils.isEmpty(((String)object2)) && CLS182.MTH3480(0x38ECF8F62B3CD335L, CLS182.MTH3483(((String)object2)), ˎᵢ0, false)) {
                        arrayList0.addAll(ˆٴ0.MTH1173("_REDPACKETS_"));
                    }
                    ᵔʾ0 = ((CLS786)object4).MTH2660(arrayList0, v, z, z1);
                }
                String s2 = ᵔʾ0 == null ? "" : ᵔʾ0.MTH1735();
                if(z1 && CLS502.MTH6934(s2, new String[]{"#A#"})) {
                    s2 = s2.replaceAll("#A#", String.valueOf(((double)v) / 100.0));
                }
                String s3 = CLS502.MTH6939(s2, ((String)object3), ((String)object0));
                if(TextUtils.isEmpty(s3) || !s3.startsWith("#chatroom")) {
                label_42:
                    if(!TextUtils.isEmpty(s3)) {
                        boolean z2 = CLS182.MTH3480(0x38ECF8AA2B3CD335L, CLS182.MTH3483(((String)object2)), ˎᵢ0, false);
                        ((CLS786)object4).FLD1447.MTH3021(s3, ((String)object3), ((String)object0), null, z2);
                    }
                }
                else if(!z) {
                    s3 = "rp" + s3;
                    goto label_42;
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Object object0 = this.FLD2926;
        Object object1 = this.FLD2927;
        Object object2 = this.FLD2924;
        Object object3 = this.FLD2922;
        Object object4 = this.FLD2925;
        if(this.FLD2921 == 6) {
            int v = this.FLD2923;
            int v1 = CLS523.MTH7137(10);
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            CLS1623 יᐧ0 = new CLS1623(((Activity)object4));
            ((CLS1629)object3).MTH7381("radio_multiple");
            ((CLS1629)object3).MTH7381("radio_single");
            ((CLS1629)object3).MTH7375("radio_single");
            יᐧ0.MTH7296(((CLS1629)object3));
            ((CLS1622)object2).MTH798(CLS27.MTH889("dice_multiple_desc"));
            ((CLS1622)object2).MTH7278(2);
            יᐧ0.MTH7296(((CLS1622)object2));
            ((CLS1629)object1).MTH7372("1", "0");
            ((CLS1629)object1).MTH7372("2", "1");
            ((CLS1629)object1).MTH7372("3", "2");
            ((CLS1629)object1).MTH7372("4", "3");
            ((CLS1629)object1).MTH7372("5", "4");
            ((CLS1629)object1).MTH7372("6", "5");
            יᐧ0.MTH7296(((CLS1629)object1));
            ((CLS1629)object0).MTH7372(CLS27.MTH889("scissor"), "0");
            ((CLS1629)object0).MTH7372(CLS27.MTH889("rock"), "1");
            ((CLS1629)object0).MTH7372(CLS27.MTH889("paper"), "2");
            יᐧ0.MTH7296(((CLS1629)object0));
            if(!((CLS1629)object3).MTH7371("radio_multiple")) {
                ((CLS1622)object2).MTH801(8);
            }
            if(!((CLS1629)object3).MTH7371("radio_single")) {
                ((CLS1629)object1).MTH801(8);
                ((CLS1629)object0).MTH801(8);
            }
            else if(v == 49) {
                ((CLS1629)object1).MTH801(8);
            }
            else {
                ((CLS1629)object0).MTH801(8);
            }
            ((CLS1629)object3).FLD5356 = new CLS737(((CLS1622)object2), ((CLS1629)object1), ((CLS1629)object0), v, 9);
            CLS523.MTH7154(linearLayout0, ((CLS18)יᐧ0), v1);
            return;
        }
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS1625 ـˏ0 = new CLS1625(((Activity)object4));
        ـˏ0.MTH800(((String)object2));
        CLS523.MTH7147(linearLayout1, ((CLS18)ـˏ0), true);
        CLS1625 ـˏ1 = new CLS1625(((Activity)object4));
        ـˏ1.MTH800(CLS27.MTH889("disclaimer_accept"));
        ـˏ1.MTH7320(new CLS67(((String)object3), ((AlertDialog[])object1), ((CLS11)object0), 20));
        CLS523.MTH7147(linearLayout1, ((CLS18)ـˏ1), true);
        ـˏ1.FLD5289.setEnabled(false);
        CLS1262 ﾞˎ0 = new CLS1262(ـˏ1, this.FLD2923, 3);
        CLS1627 ٴـ0 = new CLS1627(7, ـˏ1);
        CLS412.MTH6016(1000L, this.FLD2923, ((CLS411)ﾞˎ0), ٴـ0);
    }

    @Override  // b.ʻˑ.CLS6
    public final void MTH783(ArrayList arrayList0) {
        ((CLS280)this.FLD2925).getClass();
        int v = CLS66.MTH1366(((String)this.FLD2924), this.FLD2923, arrayList0, ((ArrayList)this.FLD2927), ((ArrayList)this.FLD2926));
        CLS280.MTH4660(((CLS12)this.FLD2922), v);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS16
    public final void MTH795(String s) {
        int v = this.FLD2923;
        Object object0 = this.FLD2922;
        Object object1 = this.FLD2926;
        Object object2 = this.FLD2927;
        Object object3 = this.FLD2924;
        Object object4 = this.FLD2925;
        switch(this.FLD2921) {
            case 5: {
                ((CLS1019)object4).getClass();
                if(!TextUtils.isEmpty(s)) {
                    CLS93 ⁱʾ0 = new CLS93(v, ((String)object3), s);
                    ((ArrayList)object2).add(ⁱʾ0);
                    ((ArrayList)object1).add(ⁱʾ0);
                    ((ArrayList)object0).add(new CLS78(s, CLS21.FLD76.MTH826("getNicknameInChatroom", new Object[]{((String)object3), ⁱʾ0.FLD396})));
                    ((CLS1019)object4).FLD2088.MTH1326(ⁱʾ0);
                }
                return;
            }
            case 8: {
                ((CLS43)object4).getClass();
                String s2 = CLS27.MTH904();
                if(!TextUtils.isEmpty(s2)) {
                    SQLiteDatabase sQLiteDatabase0 = ((CLS43)object4).getWritableDatabase();
                    ContentValues contentValues0 = new ContentValues();
                    sQLiteDatabase0.update(CLS182.MTH3496(0x38E94F7F2B3CD335L, contentValues0, s, 0x38E94F032B3CD335L), contentValues0, "ACCOUNT=? AND TAG=?", new String[]{s2, ((String)object3)});
                }
                ((ArrayList)object2).remove(v);
                ((ArrayList)object2).add(v, s);
                ((ArrayList)object1).remove(v);
                CLS528 ʽי0 = new CLS528();
                ʽי0.FLD5165 = s;
                ʽי0.FLD5166 = "" + CLS502.MTH6941(((CLS43)object4).MTH1162(((String)object3))).length;
                ((ArrayList)object1).add(v, "");
                ((CLS347)object0).notifyDataSetChanged();
                return;
            }
            default: {
                String s1 = (String)((HashMap)object4).get(((String)object3));
                ((HashMap)object4).remove(((String)object3));
                ((HashMap)object4).put(s, s1);
                ((CLS79)object0).MTH1628(s1, s);
                ((CLS79)object0).MTH1633();
                ((ArrayList)object2).remove(((String)object3));
                ((ArrayList)object2).add(v, s);
                ((CLS369)object1).notifyDataSetChanged();
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        ((CLS210)this.FLD2925).MTH3750(this.FLD2923, ((ArrayList)this.FLD2927), ((CLS359)this.FLD2922), ((Activity)this.FLD2924), ((CLS1624)this.FLD2926), linearLayout0);
    }
}

