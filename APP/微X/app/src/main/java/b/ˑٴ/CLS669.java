// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.text.TextUtils;
import android.view.MenuItem;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS7;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS36.CLS35;
import b.ˈˈ.CLS71;
import b.ˈˈ.CLS92;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS292;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS523;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

public final class CLS669 implements CLS35 {
    public final int FLD699;
    public final CLS629 FLD700;

    public CLS669(CLS629 ʻˋ0, int v) {
        this.FLD699 = v;
        this.FLD700 = ʻˋ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object8;
        String s6;
        Object object2;
        String s2;
        String s1;
        Object object0 = null;
        CLS629 ʻˋ0 = this.FLD700;
        switch(this.FLD699) {
            case 0: {
                ʻˋ0.getClass();
                try {
                    if(ʻˋ0.FLD1445.MTH938("record_forward_enable", true)) {
                        CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                        if(((MenuItem)ᵔʾ0.MTH3204()[0]).getItemId() == 20000) {
                            ᵔʾ0.MTH3207(null);
                            Object object1 = TextUtils.isEmpty(CLS27.MTH897("recordImgField2")) ? CLS164.MTH3175(ᵔʾ0.MTH3205(), CLS27.MTH897("RecordMsgImageUI")) : CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("recordImgField2"));
                            if(object1 != null) {
                                String s = (String)CLS166.MTH3195(object1, CLS27.MTH897("recordImgGetPath"), new Object[0]);
                                ArrayList arrayList0 = new ArrayList();
                                arrayList0.add(s);
                                CLS466.MTH6536(null, arrayList0);
                                return;
                            }
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 1: {
                ʻˋ0.getClass();
                try {
                    if(ʻˋ0.FLD1445.MTH938("record_forward_enable", true)) {
                        CLS167 ᵔʾ1 = new CLS167(arr_object[0]);
                        if(CLS166.MTH3195(ᵔʾ1.MTH3204()[0], "findItem", new Object[]{20000}) == null) {
                            CLS166.MTH3195(ᵔʾ1.MTH3204()[0], CLS27.MTH897("recordSightMethod2"), new Object[]{20000, CLS27.MTH889("forward_chat_to_sns")});
                            return;
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 2: {
                ʻˋ0.getClass();
                if(ʻˋ0.FLD1445.MTH938("record_forward_enable", true)) {
                    ʻˋ0.FLD553 = 0;
                }
                return;
            }
            case 3: {
                ʻˋ0.getClass();
                Class class0 = CLS27.MTH894("recordSightClass4");
                if(class0 != null) {
                    try {
                        if(ʻˋ0.FLD1445.MTH938("record_forward_enable", true)) {
                            CLS167 ᵔʾ2 = new CLS167(arr_object[0]);
                            if(((MenuItem)ᵔʾ2.MTH3204()[0]).getItemId() == 20000) {
                                ᵔʾ2.MTH3207(null);
                                int v = ʻˋ0.FLD553;
                                ʻˋ0.FLD553 = v + 1;
                                if(v == 0) {
                                    if(TextUtils.isEmpty(CLS27.MTH897("recordSightField1"))) {
                                        Object object3 = CLS164.MTH3175(ᵔʾ2.MTH3205(), CLS27.MTH897("recordSightClass"));
                                        if(object3 != null) {
                                            object2 = CLS164.MTH3175(object3, CLS27.MTH897("RecordMsgFileUI"));
                                        label_54:
                                            if(object2 != null) {
                                                Object object4 = CLS166.MTH3194(object2, CLS27.MTH897("recordSightField3"));
                                                Object object5 = CLS166.MTH3194(object2, CLS27.MTH897("recordSightField4"));
                                                if(CLS27.MTH890("recordSightMethod4")) {
                                                    s1 = (String)CLS166.MTH3192(class0, CLS27.MTH897("recordSightMethod4"), new Object[]{object4, object5});
                                                }
                                                else {
                                                    s1 = CLS27.MTH890("recordSightMethod4_b") ? ((String)CLS166.MTH3192(class0, CLS27.MTH897("recordSightMethod4_b"), new Object[]{object4, object5, 1})) : null;
                                                }
                                                if(CLS27.MTH890("recordSightMethod5")) {
                                                    s2 = (String)CLS166.MTH3192(class0, CLS27.MTH897("recordSightMethod5"), new Object[]{object4, object5});
                                                }
                                                else {
                                                    s2 = CLS27.MTH890("recordSightMethod5_b") ? ((String)CLS166.MTH3192(class0, CLS27.MTH897("recordSightMethod5_b"), new Object[]{object4, object5, 1})) : null;
                                                }
                                                CLS466.MTH6522(s1, s2, null);
                                                return;
                                            }
                                        }
                                    }
                                    else {
                                        object2 = CLS166.MTH3194(CLS166.MTH3194(ᵔʾ2.MTH3205(), CLS27.MTH897("recordSightField1")), CLS27.MTH897("recordSightField2"));
                                        goto label_54;
                                    }
                                }
                            }
                        }
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                return;
            }
            case 4: {
                ʻˋ0.getClass();
                try {
                    if(ʻˋ0.FLD1447.FLD1438.MTH6895("record_showid") && !TextUtils.isEmpty(CLS27.MTH897("RecordMsgDetailUIClass1")) && ʻˋ0.FLD1445.MTH938("record_show_id", false)) {
                        CLS167 ᵔʾ3 = new CLS167(arr_object[0]);
                        if(CLS166.MTH3195(ᵔʾ3.MTH3204()[0], "findItem", new Object[]{20000}) == null) {
                            CLS166.MTH3195(ᵔʾ3.MTH3204()[0], CLS27.MTH897("recordSightMethod2"), new Object[]{20000, CLS27.MTH889("view_id")});
                            return;
                        }
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 5: {
                ʻˋ0.getClass();
                try {
                    if(ʻˋ0.FLD1447.FLD1438.MTH6895("record_showid") && !TextUtils.isEmpty(CLS27.MTH897("RecordMsgDetailUIClass1")) && ʻˋ0.FLD1445.MTH938("record_show_id", false)) {
                        CLS167 ᵔʾ4 = new CLS167(arr_object[0]);
                        if(((MenuItem)ᵔʾ4.MTH3204()[0]).getItemId() == 20000) {
                            ᵔʾ4.MTH3207(null);
                            Activity activity0 = ((CLS140)ʻˋ0).MTH3042();
                            String s3 = activity0.getIntent().getStringExtra("record_xml");
                            if(!TextUtils.isEmpty(s3)) {
                                HashMap hashMap0 = CLS392.MTH5633(s3, "recordinfo");
                                if(hashMap0 != null && !hashMap0.isEmpty()) {
                                    HashMap hashMap1 = new HashMap();
                                    int v1 = Integer.parseInt(((String)hashMap0.get(".recordinfo.datalist.$count")));
                                    for(int v2 = 0; true; ++v2) {
                                        String s4 = "";
                                        if(v2 >= v1) {
                                            break;
                                        }
                                        if(v2 != 0) {
                                            s4 = String.valueOf(v2);
                                        }
                                        String s5 = (String)hashMap0.get(".recordinfo.datalist.dataitem" + s4 + ".sourcename");
                                        if(hashMap0.containsKey(".recordinfo.datalist.dataitem" + s4 + ".dataitemsource.fromusr")) {
                                            s6 = (String)hashMap0.get(".recordinfo.datalist.dataitem" + s4 + ".dataitemsource.fromusr");
                                        }
                                        else {
                                            s6 = hashMap0.containsKey(".recordinfo.datalist.dataitem" + s4 + ".dataitemsource.realchatname") ? ((String)hashMap0.get(".recordinfo.datalist.dataitem" + s4 + ".dataitemsource.realchatname")) : null;
                                        }
                                        if(!hashMap1.containsKey(s6)) {
                                            hashMap1.put(s6, s5);
                                        }
                                    }
                                    ArrayList arrayList1 = new ArrayList();
                                    for(Object object6: hashMap1.keySet()) {
                                        arrayList1.add(((String)hashMap1.get(((String)object6))) + " (" + ((String)object6) + ")");
                                    }
                                    CLS523.MTH7163(false, activity0, CLS27.MTH889("view_id"), arrayList1, ((CLS7)new CLS796(activity0, 0)));
                                    return;
                                }
                            }
                        }
                    }
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 6: {
                ʻˋ0.getClass();
                boolean z = CLS412.MTH6002();
                if(ʻˋ0.FLD1445.MTH938("sight_forward_large_video_enable", z) && ʻˋ0.FLD1447.FLD1438.MTH6895("sight_forward_large_video") || ʻˋ0.FLD1445.MTH938("moments_forward_enable", false) && ʻˋ0.FLD1447.FLD1438.MTH6897()) {
                    ʻˋ0.FLD547.MTH1746(((String)arr_object[0]), Boolean.TRUE);
                }
                return;
            }
            case 7: {
                ʻˋ0.getClass();
                boolean z1 = CLS412.MTH6002();
                if(ʻˋ0.FLD1445.MTH938("sight_forward_large_video_enable", z1) && ʻˋ0.FLD1447.FLD1438.MTH6895("sight_forward_large_video") || ʻˋ0.FLD1445.MTH938("moments_forward_enable", false) && ʻˋ0.FLD1447.FLD1438.MTH6897()) {
                    Object object7 = arr_object[0];
                    try {
                        Method method0 = object7.getClass().getDeclaredMethod("getResult");
                        method0.setAccessible(true);
                        object8 = null;
                        object8 = method0.invoke(object7);
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(object8 != null) {
                        int v3 = CLS166.MTH3181(object8, CLS27.MTH897("SightUtilDurationField"));
                        try {
                            Field field0 = object7.getClass().getDeclaredField("args");
                            if(field0 != null) {
                                field0.setAccessible(true);
                                object0 = field0.get(object7);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        String s7 = (String)((Object[])object0)[0];
                        String s8 = CLS31.MTH1017(CLS31.MTH992(s7));
                        CLS92 ⁱʽ0 = ʻˋ0.FLD547;
                        if(!ⁱʽ0.MTH1745(s8)) {
                            if(!CLS182.MTH3470(4102079920325055285L) && !TextUtils.isEmpty(CLS164.MTH3177(CLS27.MTH897("SubCoreMediaRptClass"))) || CLS502.MTH6934(s7, new String[]{"/cache/temp/media/capture/", "/finder/", "/media/edit/"})) {
                                ⁱʽ0.MTH1746(s8, Boolean.TRUE);
                                return;
                            }
                            ʻˋ0.FLD546.MTH1746(s8, Boolean.TRUE);
                            int v4 = CLS27.MTH903(15000, "maxSightDuration");
                            if(v3 > v4) {
                                CLS166.MTH3196(v4, object8, CLS27.MTH897("SightUtilDurationField"));
                            }
                        }
                    }
                }
                return;
            }
            case 8: {
                CLS92 ⁱʽ1 = ʻˋ0.FLD547;
                boolean z2 = CLS412.MTH6002();
                if(ʻˋ0.FLD1445.MTH938("sight_forward_large_video_enable", z2) && ʻˋ0.FLD1447.FLD1438.MTH6895("sight_forward_large_video") || ʻˋ0.FLD1445.MTH938("moments_forward_enable", false) && ʻˋ0.FLD1447.FLD1438.MTH6897()) {
                    CLS167 ᵔʾ5 = new CLS167(arr_object[0]);
                    String s9 = (String)ᵔʾ5.MTH3206();
                    if(!TextUtils.isEmpty(s9)) {
                        try {
                            JSONObject jSONObject0 = new JSONObject(s9);
                            long v5 = jSONObject0.getLong("videoDuration");
                            String s10 = (String)ᵔʾ5.MTH3204()[0];
                            String s11 = CLS31.MTH1017(CLS31.MTH992(s10));
                            if(!ⁱʽ1.MTH1745(s11) && (TextUtils.isEmpty(CLS27.MTH897("SubCoreMediaRptClass")) || TextUtils.isEmpty(CLS164.MTH3177(CLS27.MTH897("SubCoreMediaRptClass"))))) {
                                if(CLS502.MTH6934(s10, new String[]{"/cache/temp/media/capture/", "/finder/", "/media/edit/"})) {
                                    ⁱʽ1.MTH1746(s11, Boolean.TRUE);
                                    return;
                                }
                                ʻˋ0.FLD546.MTH1746(s11, Boolean.TRUE);
                                int v6 = CLS27.MTH903(15000, "maxSightDuration");
                                if(v5 > ((long)v6)) {
                                    jSONObject0.put("videoDuration", v6);
                                    ᵔʾ5.MTH3207(jSONObject0.toString());
                                    return;
                                }
                            }
                        }
                        catch(Throwable throwable5) {
                            CLS27.MTH906(s9);
                            CLS27.MTH893(throwable5);
                        }
                    }
                }
                return;
            }
            case 9: {
                ʻˋ0.getClass();
                boolean z3 = CLS412.MTH6002();
                if(ʻˋ0.FLD1445.MTH938("sight_forward_large_video_enable", z3) && ʻˋ0.FLD1447.FLD1438.MTH6895("sight_forward_large_video") || ʻˋ0.FLD1445.MTH938("moments_forward_enable", false) && ʻˋ0.FLD1447.FLD1438.MTH6897()) {
                    Object object9 = arr_object[0];
                    try {
                        Field field1 = object9.getClass().getDeclaredField("args");
                        if(field1 != null) {
                            field1.setAccessible(true);
                            object0 = field1.get(object9);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    Object object10 = ((Object[])object0)[0];
                    if(object10 != null) {
                        String s12 = (String)CLS166.MTH3194(object10, "field_fullpath");
                        if(!TextUtils.isEmpty(s12)) {
                            String s13 = CLS31.MTH992(s12);
                            String s14 = CLS31.MTH1017(s13);
                            if(!CLS502.MTH6934(s13, new String[]{"/cache/temp/media/capture/", "/finder/", "/media/edit/"})) {
                                int v7 = CLS166.MTH3181(object10, "field_appType");
                                CLS92 ⁱʽ2 = ʻˋ0.FLD546;
                                if(v7 == 0) {
                                    ⁱʽ2.FLD389.remove(s14);
                                    ʻˋ0.FLD547.MTH1746(s14, Boolean.TRUE);
                                    return;
                                }
                                if(ⁱʽ2.MTH1745(s14)) {
                                    ⁱʽ2.FLD389.remove(s14);
                                    CLS166.MTH3196(0x4F4F, object10, "field_fileType");
                                    CLS166.MTH3196(205, object10, "field_appType");
                                    CLS166.MTH3196(2, object10, "field_bzScene");
                                    CLS166.MTH3196(18, object10, "field_largesvideo");
                                    CLS166.MTH3196(6, object10, CLS27.MTH897("CdnTransportServiceField1"));
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 10: {
                this.MTH2190(arr_object);
                return;
            }
            case 11: {
                this.MTH2189(arr_object);
                return;
            }
            default: {
                ʻˋ0.getClass();
                if("send".equals(((String)arr_object[0])) && ʻˋ0.FLD1447.FLD1438.MTH6895("fast_send")) {
                    CLS71 ˆٴ0 = new CLS71(((CLS140)ʻˋ0).MTH3042(), CLS27.MTH889("send"));
                    ˆٴ0.MTH1572("normal_send", ((CLS3)new CLS738(ʻˋ0, 0)));
                    ˆٴ0.MTH1572("mass_send", ((CLS3)new CLS738(ʻˋ0, 1)));
                    ˆٴ0.MTH1573();
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2189(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD700;
        ʻˋ0.getClass();
        if(!TextUtils.isEmpty(CLS27.MTH897("CdnTransportServiceField1"))) {
            boolean z = CLS412.MTH6002();
            if(ʻˋ0.FLD1445.MTH938("sight_forward_large_video_enable", z) && ʻˋ0.FLD1447.FLD1438.MTH6895("sight_forward_large_video") || ʻˋ0.FLD1445.MTH938("moments_forward_enable", false) && ʻˋ0.FLD1447.FLD1438.MTH6897()) {
                Class class0 = CLS27.MTH894("SnsPathClass");
                Class class1 = CLS27.MTH894("SightCdnUploadClass2");
                Class class2 = CLS27.MTH894("SightCdnUploadClass3");
                Class class3 = CLS27.MTH894("SightCdnUploadClass4");
                if(class0 != null && class1 != null && class2 != null && class3 != null) {
                    CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                    int v = (int)(((Integer)ᵔʾ0.MTH3204()[0]));
                    Object object0 = CLS166.MTH3195(CLS166.MTH3192(class0, CLS27.MTH897("SnsCoreGetSnsMediaStorageMethod"), new Object[0]), CLS27.MTH897("SnsCoreGetSnsMediaStorageMethod2"), new Object[]{v});
                    Object object1 = CLS166.MTH3195(CLS166.MTH3188(class1, new Object[0]), CLS27.MTH897("blobDecodeMethod"), new Object[]{CLS182.MTH3492(4102083566752289589L, object0)});
                    String s = (String)CLS182.MTH3492(0x38ED875F2B3CD335L, object1);
                    String s1 = CLS31.MTH1017(CLS31.MTH992(s));
                    if(!CLS502.MTH6934(s, new String[]{"/cache/temp/media/capture/", "/finder/", "/media/edit/"}) && !TextUtils.isEmpty(s1) && !ʻˋ0.FLD547.MTH1745(s1)) {
                        Class class4 = CLS27.MTH894("SightUtilClass");
                        if(CLS27.MTH890("SightUtilMethod1")) {
                            CLS166.MTH3192(class4, CLS27.MTH897("SightUtilMethod1"), new Object[]{s});
                        }
                        else if(CLS27.MTH890("SightUtilMethod1_b")) {
                            CLS166.MTH3192(class4, CLS27.MTH897("SightUtilMethod1_b"), new Object[]{s, Boolean.TRUE});
                        }
                        if(ʻˋ0.FLD546.MTH1745(s1)) {
                            Object object2 = CLS166.MTH3188(class3, new Object[]{v, object0, ᵔʾ0, ((String)CLS182.MTH3492(4102083833040261941L, object1)), CLS166.MTH3188(class2, new Object[0])});
                            Object object3 = CLS182.MTH3492(4102084043493659445L, CLS182.MTH3492(0x38ED879F2B3CD335L, object2));
                            CLS166.MTH3195(object2, CLS27.MTH897("SightCdnUploadUploadMethod1"), new Object[]{object3, v});
                            ᵔʾ0.MTH3207(Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    private final void MTH2190(Object[] arr_object) {
        CLS629 ʻˋ0 = this.FLD700;
        ʻˋ0.getClass();
        if(!TextUtils.isEmpty(CLS27.MTH897("CdnTransportServiceField1"))) {
            boolean z = CLS412.MTH6002();
            if(ʻˋ0.FLD1445.MTH938("sight_forward_large_video_enable", z) && ʻˋ0.FLD1447.FLD1438.MTH6895("sight_forward_large_video") || ʻˋ0.FLD1445.MTH938("moments_forward_enable", false) && ʻˋ0.FLD1447.FLD1438.MTH6897()) {
                CLS167 ᵔʾ0 = new CLS167(arr_object[0]);
                String s = (String)CLS292.MTH4772(4102080959707140917L, "SightCdnUploadField3", ᵔʾ0.MTH3205());
                String s1 = CLS31.MTH1017(CLS31.MTH992(s));
                if(!CLS502.MTH6934(s, new String[]{"/cache/temp/media/capture/", "/finder/", "/media/edit/"}) && !TextUtils.isEmpty(s1) && !ʻˋ0.FLD547.MTH1745(s1)) {
                    Class class0 = CLS27.MTH894("SightUtilClass");
                    if(CLS27.MTH890("SightUtilMethod1")) {
                        CLS166.MTH3192(class0, CLS27.MTH897("SightUtilMethod1"), new Object[]{s});
                    }
                    else if(CLS27.MTH890("SightUtilMethod1_b")) {
                        CLS166.MTH3192(class0, CLS27.MTH897("SightUtilMethod1_b"), new Object[]{s, Boolean.TRUE});
                    }
                    if(ʻˋ0.FLD546.MTH1745(s1)) {
                        Object object0 = CLS182.MTH3492(4102081110030996277L, CLS182.MTH3492(4102081569592496949L, ᵔʾ0.MTH3205()));
                        CLS166.MTH3195(ᵔʾ0.MTH3205(), CLS27.MTH897("SightCdnUploadUploadMethod1"), new Object[]{object0, ᵔʾ0.MTH3204()[0]});
                        ᵔʾ0.MTH3207(Boolean.TRUE);
                    }
                }
            }
        }
    }
}

