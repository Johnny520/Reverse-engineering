// Decompiled by JEB v5.42.0.202606242140

package b.ˈˈ;

import android.app.Activity;
import android.content.ContentValues;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.widget.LinearLayout;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS18;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆʿ.CLS42;
import b.ˆʿ.CLS43;
import b.ˆʿ.CLS61;
import b.ˆٴ.CLS66;
import b.ˑٴ.CLS702;
import b.ˑٴ.CLS794;
import b.ˑٴ.CLS848;
import b.ˑٴ.CLS856;
import b.ᐧˉ.CLS1043;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS204;
import b.ᐧˉ.CLS208;
import b.ᐧˉ.CLS244;
import b.ᐧˉ.CLS250;
import b.ᵔʾ.CLS1234;
import b.ᵔʾ.CLS1235;
import b.ᵔʾ.CLS310;
import b.ⁱʾ.CLS359;
import b.ⁱʾ.CLS363;
import b.ⁱʾ.CLS366;
import b.ⁱʾ.CLS369;
import b.ⁱᵔ.CLS1357;
import b.ⁱᵔ.CLS1358;
import b.ⁱᵔ.CLS1403;
import b.ⁱᵔ.CLS1469;
import b.ⁱᵔ.CLS1471;
import b.ⁱᵔ.CLS1524;
import b.ⁱᵔ.CLS1553;
import b.ⁱᵔ.CLS1586;
import b.ⁱᵔ.CLS1610;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS380.CLS379;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS425;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS432;
import b.ⁱᵔ.CLS457;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import b.ﾞˎ.CLS1620;
import b.ﾞˎ.CLS1622;
import b.ﾞˎ.CLS1623;
import b.ﾞˎ.CLS1624;
import b.ﾞˎ.CLS1626;
import b.ﾞˎ.CLS1629.CLS548;
import b.ﾞˎ.CLS525;
import b.ﾞˎ.CLS534.CLS533;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;

public final class CLS580 implements CLS17, CLS39, CLS378, CLS379, CLS533, CLS548 {
    public final int FLD220;
    public final Object FLD221;
    public final Object FLD222;
    public final Object FLD223;
    public final Object FLD224;
    public final Object FLD225;
    public final Object FLD226;

    public CLS580(Activity activity0, CLS43 ˆʿ0, String s, ArrayList arrayList0, CLS366 ﾞᐧ0, String s1) {
        this.FLD220 = 7;
        super();
        this.FLD224 = activity0;
        this.FLD226 = ˆʿ0;
        this.FLD223 = s;
        this.FLD221 = arrayList0;
        this.FLD225 = ﾞᐧ0;
        this.FLD222 = s1;
    }

    public CLS580(Activity activity0, CLS369 ﾞᵎ0, String[] arr_s, HashMap hashMap0, CLS79 ˎᵢ0, ArrayList arrayList0) {
        this.FLD220 = 5;
        super();
        this.FLD224 = activity0;
        this.FLD223 = ﾞᵎ0;
        this.FLD222 = arr_s;
        this.FLD226 = hashMap0;
        this.FLD225 = ˎᵢ0;
        this.FLD221 = arrayList0;
    }

    public CLS580(Activity activity0, ArrayList arrayList0, CLS29 ˎᵢ0, String s, String s1, CLS369 ﾞᵎ0) {
        this.FLD220 = 8;
        super();
        this.FLD224 = activity0;
        this.FLD221 = arrayList0;
        this.FLD226 = ˎᵢ0;
        this.FLD223 = s;
        this.FLD225 = ﾞᵎ0;
        this.FLD222 = s1;
    }

    public CLS580(Activity activity0, HashMap hashMap0, String s, CLS79 ˎᵢ0, ArrayList arrayList0, CLS369 ﾞᵎ0) {
        this.FLD220 = 6;
        super();
        this.FLD224 = activity0;
        this.FLD222 = ˎᵢ0;
        this.FLD226 = hashMap0;
        this.FLD221 = arrayList0;
        this.FLD225 = ﾞᵎ0;
        this.FLD223 = s;
    }

    public CLS580(CLS244 ᴵʻ0, JSONArray jSONArray0, ArrayList arrayList0, CLS359 ⁱˉ0, CLS1624 יﹳ0, Activity activity0) {
        this.FLD220 = 2;
        super();
        this.FLD223 = ᴵʻ0;
        this.FLD222 = jSONArray0;
        this.FLD221 = arrayList0;
        this.FLD226 = ⁱˉ0;
        this.FLD225 = יﹳ0;
        this.FLD224 = activity0;
    }

    public CLS580(CLS363 ﾞٴ0, CLS1626 ـﹳ0, Activity activity0, ArrayList arrayList0, CLS371 ʻ0, CLS500 ᵢﹶ0) {
        this.FLD220 = 11;
        super();
        this.FLD223 = ﾞٴ0;
        this.FLD222 = ـﹳ0;
        this.FLD224 = activity0;
        this.FLD221 = arrayList0;
        this.FLD226 = ʻ0;
        this.FLD225 = ᵢﹶ0;
    }

    public CLS580(CLS363 ﾞٴ0, ArrayList arrayList0, CLS1620 ˊˏ0, ArrayList arrayList1, ArrayList arrayList2, ArrayList arrayList3) {
        this.FLD220 = 10;
        super();
        this.FLD223 = ﾞٴ0;
        this.FLD221 = arrayList0;
        this.FLD222 = ˊˏ0;
        this.FLD224 = arrayList1;
        this.FLD226 = arrayList2;
        this.FLD225 = arrayList3;
    }

    public CLS580(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, int v) {
        this.FLD220 = v;
        this.FLD224 = object0;
        this.FLD223 = object1;
        this.FLD222 = object2;
        this.FLD221 = object3;
        this.FLD226 = object4;
        this.FLD225 = object5;
        super();
    }

    public CLS580(String s, Activity activity0, ArrayList arrayList0, String s1, HashSet hashSet0, HashSet hashSet1) {
        this.FLD220 = 0;
        super();
        this.FLD223 = s;
        this.FLD224 = activity0;
        this.FLD221 = arrayList0;
        this.FLD222 = s1;
        this.FLD226 = hashSet0;
        this.FLD225 = hashSet1;
    }

    public CLS580(String s, String s1, CLS1622 ˑٴ0, int[] arr_v, ArrayList arrayList0, ArrayList arrayList1) {
        this.FLD220 = 12;
        super();
        this.FLD223 = s;
        this.FLD222 = s1;
        this.FLD224 = ˑٴ0;
        this.FLD226 = arr_v;
        this.FLD221 = arrayList0;
        this.FLD225 = arrayList1;
    }

    public CLS580(String[] arr_s, CLS69 ʾᵢ0, ArrayList arrayList0, CLS42 ʾᵢ1, String s, CLS366 ﾞᐧ0) {
        this.FLD220 = 9;
        super();
        this.FLD222 = arr_s;
        this.FLD224 = ʾᵢ0;
        this.FLD221 = arrayList0;
        this.FLD226 = ʾᵢ1;
        this.FLD223 = s;
        this.FLD225 = ﾞᐧ0;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        boolean z;
        StringBuilder stringBuilder1;
        String s6;
        Pattern pattern0 = null;
        Object object0 = this.FLD225;
        Object object1 = this.FLD226;
        Object object2 = this.FLD222;
        Object object3 = this.FLD221;
        Object object4 = this.FLD224;
        Object object5 = this.FLD223;
        switch(this.FLD220) {
            case 0: {
                new CLS425(((String)object5), ((Activity)object4), ((ArrayList)object3), ((String)object2), ((HashSet)object1), ((HashSet)object0)).show();
                return;
            }
            case 1: {
                String s2 = (String)object5;
                ((CLS794)object4).getClass();
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s2);
                String s3 = CLS182.MTH3475(0x38EC9E7E2B3CD335L, stringBuilder0);
                CLS29 ˎᵢ0 = ((CLS794)object4).FLD1445;
                if(ˎᵢ0.MTH938(s3, false) && ((String)object2).length() >= CLS34.MTH1064(4101827195859424053L, CLS182.MTH3483(s2), ˎᵢ0, 500) && (!CLS502.MTH6934(((String)object2), new String[]{"- - - - - - - - - - - - - -"}) || !CLS502.MTH6934(((String)object2), new String[]{"「"}))) {
                    String s4 = CLS182.MTH3473(4101828037673014069L, ˎᵢ0, CLS182.MTH3475(4101827947478700853L, CLS182.MTH3483(s2)));
                    String s5 = ˎᵢ0.MTH925(CLS182.MTH3475(0x38EC9EF22B3CD335L, CLS182.MTH3483(s2)), "");
                    ((CLS61)object3).MTH1331(s2, ((String)object1), CLS27.MTH904(), s5, s4);
                    if(ˎᵢ0.MTH938(s2 + "_chatroom_ban_sendmsg_enable", true)) {
                        s6 = CLS182.MTH3476(CLS426.MTH6125(s2, ((String)object1)), s4);
                        if(((CLS61)object3).FLD186 && !TextUtils.isEmpty(s5)) {
                            long v = Long.parseLong(s5, 16);
                            stringBuilder1 = CLS182.MTH3483(s6);
                            stringBuilder1.append("\n");
                            stringBuilder1.append(String.format(CLS27.MTH889("auto_unban"), ((CLS794)object4).FLD1152.format(new Date(v + System.currentTimeMillis()))));
                            s6 = stringBuilder1.toString();
                        }
                        CLS66.MTH1393(s2, s6, ((String)object1));
                    }
                    CLS794.MTH2688(s2, ((String)object1));
                    return;
                }
                if(CLS182.MTH3480(4101827840104518453L, CLS182.MTH3483(s2), ˎᵢ0, false)) {
                    HashMap hashMap0 = ((CLS794)object4).FLD1154;
                    if(hashMap0.containsKey(s2)) {
                        pattern0 = (Pattern)hashMap0.get(s2);
                    }
                    else {
                        String s7 = ˎᵢ0.MTH925(CLS182.MTH3475(4101828501529482037L, CLS182.MTH3483(s2)), "");
                        if(!TextUtils.isEmpty(s7)) {
                            if(s7.endsWith("|")) {
                                s7 = s7.substring(0, s7.length() - 1);
                            }
                            pattern0 = Pattern.compile(s7, 2);
                            hashMap0.put(s2, pattern0);
                        }
                    }
                    if(pattern0 != null) {
                        Matcher matcher0 = pattern0.matcher(((String)object2));
                        if(matcher0.find()) {
                            String s8 = matcher0.group(0);
                            if(TextUtils.isEmpty(s8)) {
                                z = false;
                            }
                            else if(CLS182.MTH3480(0x38EC9F652B3CD335L, CLS182.MTH3483(s2), ˎᵢ0, false) && !TextUtils.isEmpty(s8)) {
                                long v1 = CLS34.MTH1080(0x38EC9F0A2B3CD335L, ((ContentValues)object0));
                                int v2 = CLS34.MTH1064(0x38EC9F152B3CD335L, CLS182.MTH3483(s2), ˎᵢ0, 3);
                                int v3 = CLS794.MTH2694().MTH1146(v2, v1, s2, ((String)object1), "_KEYWORD_BANWARNING_");
                                z = v3 > v2 - 1;
                                if(!z) {
                                    StringBuilder stringBuilder2 = new StringBuilder();
                                    stringBuilder2.append(ˎᵢ0.MTH925(CLS182.MTH3475(4101829059875230517L, CLS182.MTH3483(s2)), CLS27.MTH889("warning_default_text")));
                                    stringBuilder2.append(" (");
                                    stringBuilder2.append(v3 + 1);
                                    stringBuilder2.append("/");
                                    stringBuilder2.append(v2);
                                    String s9 = CLS182.MTH3475(0x38EC9F812B3CD335L, stringBuilder2);
                                    StringBuilder stringBuilder3 = CLS182.MTH3483(CLS182.MTH3484(0x38EC9F832B3CD335L, CLS182.MTH3483(CLS426.MTH6125(s2, ((String)object1))), s9));
                                    stringBuilder3.append("\n");
                                    stringBuilder3.append(CLS27.MTH889("keyword"));
                                    stringBuilder3.append(": ");
                                    stringBuilder3.append(s8);
                                    CLS66.MTH1393(s2, stringBuilder3.toString(), ((String)object1));
                                }
                            }
                            else {
                                z = true;
                            }
                            if(z) {
                                String s10 = ˎᵢ0.MTH925(CLS182.MTH3475(0x38EC9F922B3CD335L, CLS182.MTH3483(s2)), "");
                                ((CLS61)object3).MTH1331(s2, ((String)object1), CLS27.MTH904(), s10, "");
                                if(ˎᵢ0.MTH938(s2 + "_chatroom_ban_sendmsg_enable", true)) {
                                    StringBuilder stringBuilder4 = CLS182.MTH3483(CLS426.MTH6125(s2, ((String)object1)));
                                    stringBuilder4.append(ˎᵢ0.MTH925(CLS182.MTH3475(0x38EC9C432B3CD335L, CLS182.MTH3483(s2)), CLS27.MTH889("goodbye_text")));
                                    String s11 = stringBuilder4.toString();
                                    if(!((CLS61)object3).FLD186 || TextUtils.isEmpty(s10)) {
                                        s6 = s11;
                                    }
                                    else {
                                        long v4 = Long.parseLong(s10, 16);
                                        stringBuilder1 = CLS182.MTH3483(s11);
                                        stringBuilder1.append("\n");
                                        stringBuilder1.append(String.format(CLS27.MTH889("auto_unban"), ((CLS794)object4).FLD1152.format(new Date(v4 + System.currentTimeMillis()))));
                                        s6 = stringBuilder1.toString();
                                    }
                                    CLS66.MTH1393(s2, s6, ((String)object1));
                                }
                                CLS794.MTH2688(s2, ((String)object1));
                            }
                        }
                    }
                }
                return;
            }
            default: {
                String s = (String)object2;
                File file0 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_shortvid_temp.mp4");
                if(CLS432.MTH6185(file0.getAbsolutePath(), ((String)object5))) {
                    File file1 = new File(CLS31.MTH1038(CLS27.MTH900()), "wx_shortvid_thumb.jpg");
                    try {
                        if(!TextUtils.isEmpty(s)) {
                            try {
                                URL uRL0 = new URL(s);
                                try {
                                    pattern0 = BitmapFactory.decodeStream(uRL0.openConnection().getInputStream());
                                }
                                catch(Exception exception1) {
                                    CLS27.MTH893(exception1);
                                }
                            }
                            catch(Exception exception0) {
                                CLS27.MTH893(exception0);
                            }
                        }
                        if(pattern0 == null) {
                            CLS518.MTH7053(file1, file0.getAbsolutePath());
                        }
                        else {
                            CLS518.MTH7077(file1, ((Bitmap)pattern0));
                        }
                    }
                    catch(Throwable throwable0) {
                        CLS518.MTH7053(file1, file0.getAbsolutePath());
                        CLS27.MTH893(throwable0);
                    }
                    String s1 = ((CLS1622)object4).MTH7285();
                    CLS66.MTH1478(((int[])object1)[0], s1, file0.getAbsolutePath(), file1.getAbsolutePath(), ((ArrayList)object3), ((ArrayList)object0));
                    CLS66.MTH1373();
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        Object object0 = this.FLD223;
        Object object1 = this.FLD225;
        Object object2 = this.FLD221;
        Object object3 = this.FLD226;
        Object object4 = this.FLD222;
        Object object5 = this.FLD224;
        switch(this.FLD220) {
            case 6: {
                ʻˑ0.MTH7187("add", ((CLS3)new CLS1524(((Activity)object5), ((CLS79)object4), ((HashMap)object3), ((ArrayList)object2), ((CLS369)object1))));
                ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1524(((Activity)object5), ((HashMap)object3), ((CLS79)object4), ((ArrayList)object2), ((CLS369)object1))));
                ʻˑ0.MTH7187("delete_multiple", ((CLS3)new CLS1524(((Activity)object5), ((ArrayList)object2), ((HashMap)object3), ((CLS79)object4), ((CLS369)object1))));
                ʻˑ0.MTH7187("import_", ((CLS3)new CLS1403(((CLS79)object4), ((String)object0), ((HashMap)object3), ((ArrayList)object2), ((CLS369)object1), ((Activity)object5))));
                ʻˑ0.MTH7187("export_", ((CLS3)new CLS1471(((Activity)object5), ((CLS79)object4), 0)));
                return;
            }
            case 7: {
                ʻˑ0.MTH7187("select", ((CLS3)new CLS1234(((Activity)object5), ((CLS43)object3), ((String)object0), ((ArrayList)object2), ((CLS366)object1), ((String)object4))));
                ʻˑ0.MTH7187("send", ((CLS3)new CLS856(((Activity)object5), ((String)object4), 1)));
                return;
            }
            case 8: {
                ʻˑ0.MTH7187("add", ((CLS3)new CLS1469(((Activity)object5), ((CLS369)object1), ((CLS29)object3), ((String)object0), ((ArrayList)object2))));
                ʻˑ0.MTH7187("delete_all", ((CLS3)new CLS1358(((Activity)object5), ((ArrayList)object2), ((CLS29)object3), ((String)object4), ((String)object0), ((CLS369)object1))));
                ʻˑ0.MTH7187("import_", ((CLS3)new CLS1358(((String)object0), ((ArrayList)object2), ((CLS29)object3), ((String)object4), ((CLS369)object1), ((Activity)object5))));
                ʻˑ0.MTH7187("export_", ((CLS3)new CLS1235(((Activity)object5), ((ArrayList)object2), ((CLS29)object3), ((String)object4), ((String)object0))));
                return;
            }
            default: {
                ʻˑ0.MTH7187("clear", ((CLS3)new CLS1610(((CLS363)object0), ((CLS1626)object4), 2)));
                ʻˑ0.MTH7187("inverse", ((CLS3)new CLS1610(((CLS363)object0), ((CLS1626)object4), 3)));
                ʻˑ0.MTH7187("custom_select", ((CLS3)new CLS1586(((Activity)object5), ((CLS363)object0), ((CLS1626)object4), 2)));
                ʻˑ0.MTH7187("random", ((CLS3)new CLS1586(((Activity)object5), ((CLS363)object0), ((CLS1626)object4), 3)));
                if(!((ArrayList)object2).isEmpty()) {
                    ʻˑ0.MTH7187("untagged", ((CLS3)new CLS702(((CLS371)object3), ((CLS363)object0), ((CLS1626)object4), 29)));
                }
                if(!((ArrayList)object2).isEmpty() && ((CLS500)object1).MTH6895("contacts_select_sex")) {
                    ʻˑ0.MTH7187("radio_female", ((CLS3)new CLS1553(((ArrayList)object2), ((CLS363)object0), ((CLS1626)object4), 0)));
                    ʻˑ0.MTH7187("radio_male", ((CLS3)new CLS1553(((ArrayList)object2), ((CLS363)object0), ((CLS1626)object4), 1)));
                }
                if(!((ArrayList)object2).isEmpty() && ((CLS500)object1).MTH6895("contacts_select_location")) {
                    ʻˑ0.MTH7187("location_addr", ((CLS3)new CLS848(((Activity)object5), ((ArrayList)object2), ((CLS363)object0), ((CLS1626)object4), 17, 0)));
                }
                if(((CLS500)object1).MTH6895("sort_contacts")) {
                    ʻˑ0.MTH7187("sort", ((CLS3)new CLS1471(((Activity)object5), ((CLS363)object0), 3)));
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        CLS363 ﾞٴ0 = (CLS363)this.FLD223;
        ArrayList arrayList0 = (ArrayList)this.FLD221;
        CLS1620 ˊˏ0 = (CLS1620)this.FLD222;
        ArrayList arrayList1 = (ArrayList)this.FLD224;
        ArrayList arrayList2 = (ArrayList)this.FLD226;
        ArrayList arrayList3 = (ArrayList)this.FLD225;
        switch(s) {
            case "radio_all": {
                ﾞٴ0.MTH5264(arrayList3);
                ˊˏ0.MTH801(0);
                return;
            }
            case "radio_chatrooms": {
                ﾞٴ0.MTH5264(arrayList2);
                break;
            }
            case "radio_friends": {
                ﾞٴ0.MTH5264(arrayList1);
                ˊˏ0.MTH801(0);
                return;
            }
            case "radio_public_account": {
                ﾞٴ0.MTH5264(arrayList0);
                break;
            }
            default: {
                return;
            }
        }
        ˊˏ0.MTH801(8);
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS534$CLS533
    public final void MTH7225(int v, String s) {
        ArrayList arrayList0 = (ArrayList)this.FLD221;
        String s1 = (String)this.FLD223;
        CLS366 ﾞᐧ0 = (CLS366)this.FLD225;
        ((String[])this.FLD222)[0] = (String)((CLS69)this.FLD224).MTH1565(s);
        arrayList0.clear();
        for(Object object0: ((CLS42)this.FLD226).MTH1150(s1, ((String[])this.FLD222)[0])) {
            String s2 = ((Bundle)object0).getString("username");
            int v1 = ((Bundle)object0).getInt("count");
            arrayList0.add(new CLS78(s2, CLS66.MTH1452(s1, s2) + " (" + v1 + ")"));
        }
        ﾞᐧ0.MTH5276(arrayList0);
    }

    // 此方法包含解密的字符串
    @Override  // b.ʻˑ.CLS17
    public final void MTH796(Object[] arr_object) {
        Object object0 = this.FLD225;
        Object object1 = this.FLD226;
        Object object2 = this.FLD221;
        Object object3 = this.FLD222;
        Object object4 = this.FLD223;
        Object object5 = this.FLD224;
        if(this.FLD220 == 3) {
            Menu menu0 = (Menu)arr_object[0];
            LinearLayout linearLayout0 = (LinearLayout)arr_object[1];
            CLS525 ʻˑ0 = new CLS525(((Activity)object5), linearLayout0, menu0);
            ʻˑ0.MTH7187("set_gps", ((CLS3)new CLS1235(((ContentValues)object4), ((CLS1622)object3), ((CLS1622)object2), ((CLS1622)object1), ((CLS1622)object0))));
            ʻˑ0.MTH7188();
            CLS1623 יᐧ0 = new CLS1623(((Activity)object5));
            יᐧ0.MTH7289(new Object[]{((CLS1622)object1), ((CLS1622)object0), ((CLS1622)object2), ((CLS1622)object3)});
            יᐧ0.MTH7290(linearLayout0, 0);
            return;
        }
        Menu menu1 = (Menu)arr_object[0];
        LinearLayout linearLayout1 = (LinearLayout)arr_object[1];
        CLS525 ʻˑ1 = new CLS525(((Activity)object5), linearLayout1, menu1);
        ʻˑ1.MTH7187("manage_tags", ((CLS3)new CLS702(((Activity)object5), ((CLS82)object4), ((CLS1626)object3), 23)));
        ʻˑ1.MTH7187("add_silk", ((CLS3)new CLS848(((Activity)object5), ((CLS82)object4), ((ArrayList)object2), ((CLS369)object1), 11)));
        if(CLS500.FLD4928.MTH6895("merge_voice") && CLS27.MTH895().MTH938("merge_voice", CLS412.MTH6002())) {
            ʻˑ1.MTH7187("merge_voices", ((CLS3)new CLS1357(((CLS82)object4), ((Activity)object5))));
        }
        ʻˑ1.MTH7188();
        CLS1623 יᐧ1 = new CLS1623(((Activity)object5));
        ((CLS1622)object0).MTH7277(((CLS82)object4).FLD317);
        יᐧ1.MTH7296(((CLS1622)object0));
        ((CLS1626)object3).MTH798(TextUtils.join(",", ((CLS82)object4).FLD316));
        יᐧ1.MTH7296(((CLS1626)object3));
        CLS523.MTH7154(linearLayout1, ((CLS18)יᐧ1), CLS523.MTH7137(10));
        CLS1624 יﹳ0 = new CLS1624(((Activity)object5));
        יﹳ0.MTH7311();
        for(int v = 0; v < ((CLS82)object4).MTH1678(); ++v) {
            ((ArrayList)object2).add(((double)((CLS82)object4).MTH1679(v)) / 1000.0 + " " + CLS27.MTH889("second"));
        }
        יﹳ0.MTH7303(((CLS369)object1));
        יﹳ0.MTH7305(new CLS250(((Activity)object5), ((ArrayList)object2), ((CLS369)object1), ((CLS82)object4), 1));
        CLS523.MTH7147(linearLayout1, ((CLS18)יﹳ0), true);
    }

    // 此方法包含解密的字符串
    @Override  // b.ⁱᵔ.CLS380$CLS379
    public final void MTH5453(LinearLayout linearLayout0) {
        Object object0 = this.FLD224;
        Object object1 = this.FLD225;
        Object object2 = this.FLD226;
        Object object3 = this.FLD221;
        Object object4 = this.FLD222;
        Object object5 = this.FLD223;
        if(this.FLD220 == 2) {
            JSONArray jSONArray0 = (JSONArray)object4;
            ArrayList arrayList0 = (ArrayList)object3;
            ((CLS244)object5).getClass();
            CLS523.MTH7137(10);
            if(jSONArray0 != null) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    try {
                        arrayList0.add(CLS412.MTH6006(jSONArray0.getJSONObject(v)));
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
            }
            ((CLS359)object2).MTH5235(arrayList0);
            for(int v1 = 0; v1 < ((CLS359)object2).getCount(); ++v1) {
                ContentValues contentValues0 = (ContentValues)((CLS359)object2).getItem(v1);
                if(contentValues0.containsKey("checked") && contentValues0.getAsBoolean("checked").booleanValue()) {
                    ((CLS359)object2).MTH5227(v1, true);
                }
            }
            ((CLS359)object2).notifyDataSetChanged();
            ((CLS1624)object1).MTH7303(((CLS359)object2));
            ((CLS1624)object1).MTH7308(5);
            ((CLS1624)object1).MTH7301(new CLS204(((CLS359)object2), 0));
            ((CLS1624)object1).MTH7305(new CLS208(((CLS244)object5), ((Activity)object0), arrayList0, ((CLS359)object2), 0));
            CLS523.MTH7147(linearLayout0, ((CLS18)(((CLS1624)object1))), true);
            return;
        }
        CLS1624 יﹳ0 = new CLS1624(((Activity)object0));
        יﹳ0.FLD5274 = new CLS1043(((CLS369)object5), 8);
        יﹳ0.MTH7311();
        יﹳ0.MTH7302();
        יﹳ0.MTH7303(((CLS369)object5));
        יﹳ0.MTH7301(new CLS457(((CLS369)object5), ((String[])object4), 1));
        יﹳ0.MTH7305(new CLS310(3, ((Activity)object0), ((CLS369)object5), ((HashMap)object2), ((CLS79)object1), ((ArrayList)object3)));
        CLS523.MTH7147(linearLayout0, ((CLS18)יﹳ0), true);
    }
}

