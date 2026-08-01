// Decompiled by JEB v5.42.0.202606242140

package d.ˑʽ;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.widget.LinearLayout;
import d.יʻ.CLS69;
import d.יʻ.CLS71;
import d.ٴˑ.CLS181;
import d.ٴˑ.CLS182;
import d.ٴˑ.CLS188;
import d.ٴˑ.CLS91;
import d.ᐧˈ.CLS202;
import d.ᐧˏ.CLS108;
import d.ᐧי.CLS110;
import d.ᐧי.CLS207;
import d.ⁱٴ.CLS121;
import d.ⁱٴ.CLS123;
import d.ⁱٴ.CLS125;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class CLS155 implements CLS8, CLS9 {
    public final CLS121 FLD201;
    public final LinkedHashMap FLD202;
    public final Activity FLD203;

    public CLS155(Activity activity0, LinkedHashMap linkedHashMap0, CLS158 ـˋ0) {
        this.FLD203 = activity0;
        this.FLD202 = linkedHashMap0;
        this.FLD201 = ـˋ0;
    }

    public CLS155(LinkedHashMap linkedHashMap0, CLS158 ـˋ0, Activity activity0) {
        this.FLD202 = linkedHashMap0;
        this.FLD201 = ـˋ0;
        this.FLD203 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS9
    public final void MTH416(CLS91 ٴˆ0) {
        LinkedHashMap linkedHashMap0 = this.FLD202;
        for(Object object0: linkedHashMap0.keySet()) {
            String s = (String)linkedHashMap0.get(((String)object0));
            ٴˆ0.MTH968(((String)object0), s, ((CLS123)new CLS207(this.FLD201, s, 2)));
        }
        if(!CLS71.MTH831(0xFFFF33AB2DFB3E45L)) {
            ٴˆ0.MTH969("donate_feedback", ((CLS123)new CLS202(this.FLD203, 11)));
        }
    }

    // 此方法包含解密的字符串
    @Override  // d.ˑʽ.CLS10$CLS8
    public final void MTH415(LinearLayout linearLayout0) {
        String s6;
        String s5;
        String s4;
        StringBuilder stringBuilder2;
        long v;
        String[] arr_s;
        String s;
        Activity activity0 = this.FLD203;
        CLS182 ˆᐧ0 = new CLS182(activity0);
        CLS188 ᴵʾ0 = new CLS188(activity0);
        ᴵʾ0.FLD531 = false;
        ᴵʾ0.FLD523 = true;
        if(CLS53.FLD282.FLD280.contains(1)) {
            String s1 = CLS69.MTH805();
            if(TextUtils.isEmpty(s1)) {
                s = CLS108.MTH1103(0xFFFF239B2DFB3E45L);
            }
            else {
                Object object0 = CLS69.MTH808(150, new Object[]{6, s1});
                s = object0 == null ? CLS108.MTH1103(0xFFFF239A2DFB3E45L) : ((String)object0);
            }
        }
        else {
            s = "";
        }
        if(TextUtils.isEmpty(s)) {
            stringBuilder2 = CLS71.MTH830("");
            stringBuilder2.append(CLS69.MTH795(CLS108.MTH1103(0xFFFF33242DFB3E45L)));
            s6 = stringBuilder2.toString();
        }
        else {
            if(TextUtils.isEmpty(s)) {
                arr_s = new String[0];
            }
            else {
                if(s.contains(",")) {
                    v = 0xFFFF593E2DFB3E45L;
                }
                else if(s.contains(";")) {
                    v = 0xFFFF593A2DFB3E45L;
                }
                else if(s.contains(":")) {
                    v = 0xFFFF59362DFB3E45L;
                }
                else if(s.contains(" ")) {
                    v = 0xFFFF59322DFB3E45L;
                }
                else if(s.contains("，")) {
                    v = -183420101902779L;
                }
                else if(s.contains("；")) {
                    v = 0xFFFF592A2DFB3E45L;
                }
                else if(s.contains("：")) {
                    v = 0xFFFF59262DFB3E45L;
                }
                else if(s.contains("\n\r")) {
                    v = 0xFFFF5EDD2DFB3E45L;
                }
                else {
                    v = s.contains("\n") ? 0xFFFF5ED82DFB3E45L : 0xFFFF5EDA2DFB3E45L;
                }
                arr_s = s.split(CLS108.MTH1103(v));
            }
            HashSet hashSet0 = new HashSet(Arrays.asList(arr_s));
            if(hashSet0.isEmpty()) {
                stringBuilder2 = CLS71.MTH830("");
                stringBuilder2.append(CLS69.MTH795(CLS108.MTH1103(0xFFFF332C2DFB3E45L)));
                s6 = stringBuilder2.toString();
            }
            else {
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator0 = hashSet0.iterator();
                while(iterator0.hasNext()) {
                    String s2 = "";
                    Object object1 = iterator0.next();
                    String s3 = CLS69.MTH795(((String)object1));
                    if(!TextUtils.isEmpty(s3)) {
                        if(!TextUtils.isEmpty(s3)) {
                            if(!s3.contains("[[") || !s3.contains("]]")) {
                                s4 = "";
                            }
                            else {
                                int v1 = s3.indexOf("[[");
                                int v2 = s3.lastIndexOf("]]");
                                s4 = s3.substring(v1 + 2, v2);
                                s3 = CLS71.MTH825(s3, 0, v1, new StringBuilder(), v2, 2);
                            }
                            if(!s3.contains("{") || !s3.contains("}")) {
                                s5 = "";
                            }
                            else {
                                int v3 = s3.indexOf("{");
                                int v4 = s3.lastIndexOf("}");
                                s5 = s3.substring(v3 + 1, v4);
                                s3 = CLS71.MTH825(s3, 0, v3, new StringBuilder(), v4, 1);
                            }
                            if(s3.contains("((") && s3.contains("))")) {
                                int v5 = s3.indexOf("((");
                                int v6 = s3.lastIndexOf("))");
                                s2 = s3.substring(v5 + 2, v6);
                                s3 = CLS71.MTH825(s3, 0, v5, new StringBuilder(), v6, 2);
                            }
                            s5.getClass();
                            s4.getClass();
                            s2.getClass();
                            s2 = s3.trim();
                        }
                        arrayList0.add(s2);
                    }
                }
                StringBuilder stringBuilder0 = CLS71.MTH830("");
                stringBuilder0.append("<br>");
                stringBuilder0.append(TextUtils.join(", ", arrayList0));
                s6 = stringBuilder0.toString();
                if(CLS53.FLD282.MTH715("show_alipay")) {
                    String s7 = CLS69.MTH795("donate_max_thx");
                    if(!TextUtils.isEmpty(s7)) {
                        StringBuilder stringBuilder1 = CLS71.MTH830(s6);
                        stringBuilder1.append("<br><br><i>");
                        stringBuilder1.append(s7);
                        stringBuilder1.append("</i>");
                        s6 = stringBuilder1.toString();
                    }
                }
                ᴵʾ0.MTH1181(CLS69.MTH795("donate_thanks"));
            }
        }
        ᴵʾ0.MTH1179(s6);
        ˆᐧ0.MTH907(((CLS125)ᴵʾ0));
        CLS181 ˆـ0 = new CLS181(activity0);
        int v7 = CLS45.MTH662(5);
        long v8 = CLS43.MTH639() ? 0xFFFF58DB2DFB3E45L : 0xFFFF58D32DFB3E45L;
        ˆـ0.FLD403.setDivider(new ColorDrawable(Color.parseColor(CLS108.MTH1103(v8))));
        ˆـ0.FLD403.setDividerHeight(v7);
        CLS110 ٴˑ0 = new CLS110(activity0, this.FLD202.keySet());
        ˆـ0.MTH894(ٴˑ0);
        ˆـ0.MTH893(new CLS23(ٴˑ0, this.FLD201, this.FLD202));
        ˆᐧ0.MTH907(((CLS125)ˆـ0));
        CLS45.MTH667(linearLayout0, ((CLS125)ˆᐧ0), CLS45.MTH662(3));
    }
}

