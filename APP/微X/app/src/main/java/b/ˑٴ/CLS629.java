// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import b.ʻˑ.CLS0;
import b.ʻˑ.CLS11;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS17;
import b.ʻˑ.CLS2;
import b.ʻˑ.CLS3;
import b.ʻˑ.CLS563;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS34;
import b.ʾᵢ.CLS36.CLS35;
import b.ʾᵢ.CLS38.CLS37;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ʾᵢ.CLS568;
import b.ʾᵢ.CLS571;
import b.ˆʿ.CLS59;
import b.ˆٴ.CLS66;
import b.ˈˈ.CLS69;
import b.ˈˈ.CLS78;
import b.ˈˈ.CLS80;
import b.ˈˈ.CLS87;
import b.ˈˈ.CLS92;
import b.ˈˈ.CLS94;
import b.ˈˊ.CLS603;
import b.ˈˊ.CLS610;
import b.יᐧ.CLS151.CLS149;
import b.יᐧ.CLS151;
import b.יᐧ.CLS158.CLS157;
import b.יᐧ.CLS158;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.יﹳ.CLS167;
import b.ـˏ.CLS169;
import b.ـˏ.CLS886;
import b.ـˏ.CLS887;
import b.ـˏ.CLS892;
import b.ـˏ.CLS893;
import b.ـˏ.CLS894;
import b.ٴـ.CLS896.CLS170;
import b.ᐧˉ.CLS182;
import b.ᵔʾ.CLS1225;
import b.ᵔʾ.CLS1255;
import b.ᵔʾ.CLS292;
import b.ᵔʾ.CLS309;
import b.ⁱʾ.CLS1274;
import b.ⁱˉ.CLS370;
import b.ⁱᵔ.CLS1392;
import b.ⁱᵔ.CLS1562;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS372;
import b.ⁱᵔ.CLS387;
import b.ⁱᵔ.CLS392;
import b.ⁱᵔ.CLS395;
import b.ⁱᵔ.CLS403;
import b.ⁱᵔ.CLS404;
import b.ⁱᵔ.CLS412;
import b.ⁱᵔ.CLS426;
import b.ⁱᵔ.CLS466;
import b.ⁱᵔ.CLS476;
import b.ⁱᵔ.CLS500;
import b.ⁱᵔ.CLS502;
import b.ⁱᵔ.CLS518;
import b.ⁱᵔ.CLS523;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class CLS629 extends CLS140 {
    public boolean FLD545;
    public final CLS92 FLD546;
    public final CLS92 FLD547;
    public Activity FLD548;
    public Object FLD549;
    public final CLS59 FLD550;
    public WeakReference FLD551;
    public int FLD552;
    public int FLD553;
    public final ArrayList FLD554;
    public final CLS158 FLD555;

    public CLS629(CLS139 ﹶʼ0) {
        public final class CLS624 implements CLS157 {
            public final CLS629 FLD538;

            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3145() {
            }

            // 此方法包含解密的字符串
            @Override  // b.יᐧ.CLS158$CLS157
            public final void MTH3146(CLS158 ⁱʾ0) {
                Object object1;
                CLS629.this.getClass();
                CLS80 ˑٴ0 = (CLS80)ⁱʾ0.MTH3152();
                if(ˑٴ0 != null) {
                    CLS87 ᐧˉ0 = ˑٴ0.FLD303;
                    int v = ᐧˉ0.FLD353;
                    int v1 = ˑٴ0.FLD304;
                    String s = ˑٴ0.FLD302;
                    switch(v) {
                        case 1: {
                            CLS66.MTH1484(s, ᐧˉ0.FLD355, v1, 0, 1);
                            return;
                        label_11:
                            int v2 = ᐧˉ0.FLD352;
                            switch(v) {
                                case 34: {
                                    goto label_16;
                                }
                                case 43: {
                                    CLS66.MTH1484(s, ᐧˉ0.FLD355, v1, v2, 43);
                                    return;
                                }
                            }
                            return;
                            try {
                            label_16:
                                String s1 = CLS466.MTH6510(CLS27.MTH904());
                                String s2 = CLS66.MTH1483(s1);
                                if(CLS31.MTH1025((CLS502.MTH6934(ᐧˉ0.FLD355, new String[]{"/"}) ? new File(ᐧˉ0.FLD355) : new File(CLS66.MTH1483(ᐧˉ0.FLD355))), new File(s2))) {
                                    CLS66.MTH1484(s, s1, v1, v2, ᐧˉ0.FLD353);
                                    return;
                                }
                                break;
                            }
                            catch(Throwable throwable0) {
                                CLS27.MTH893(throwable0);
                                return;
                            }
                        }
                        case 3: {
                            String s3 = ᐧˉ0.FLD355;
                            if(CLS31.MTH1024(s3)) {
                                Class class0 = CLS27.MTH894("massSendClass");
                                if(class0 != null) {
                                    try {
                                        if(CLS27.MTH890("massSendImgClass1")) {
                                            Object object0 = CLS166.MTH3192(CLS27.MTH894("massSendImgClass1"), CLS27.MTH897("massSendImgMethod2"), new Object[0]);
                                            if(CLS27.MTH890("massSendImgMethod")) {
                                                object1 = CLS166.MTH3195(object0, CLS27.MTH897("massSendImgMethod"), new Object[]{s3, s, v1, 1});
                                            }
                                            else if(CLS27.MTH890("massSendImgMethod_2")) {
                                                object1 = CLS166.MTH3195(object0, CLS27.MTH897("massSendImgMethod_2"), new Object[]{v1, 1, s3, s});
                                            }
                                            else {
                                                object1 = null;
                                            }
                                            goto label_42;
                                        }
                                        else {
                                            Class class1 = CLS27.MTH894("massSendClass3");
                                            if(class1 != null) {
                                                object1 = CLS166.MTH3192(class1, CLS27.MTH897("massSendImgMethod"), new Object[]{s3, s, v1, 1});
                                                goto label_42;
                                            }
                                        }
                                        break;
                                    }
                                    catch(Throwable throwable1) {
                                        CLS27.MTH893(throwable1);
                                        object1 = null;
                                    }
                                label_42:
                                    if(object1 != null) {
                                        try {
                                            CLS66.MTH1521(CLS166.MTH3188(class0, new Object[]{object1, Boolean.FALSE, 1}));
                                        }
                                        catch(Throwable throwable2) {
                                            CLS27.MTH893(throwable2);
                                        }
                                        return;
                                    }
                                }
                            }
                            break;
                        }
                        default: {
                            goto label_11;
                        }
                    }
                }
                try {
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
        }

        super(ﹶʼ0);
        this.FLD554 = new ArrayList();
        this.FLD550 = CLS59.FLD183;
        this.FLD555 = new CLS158(((CLS157)new CLS624(this)), 300000L);
        this.FLD546 = new CLS92(60000L);
        this.FLD547 = new CLS92(6000L);
    }

    // 此方法包含解密的字符串
    public static void MTH2036(Object object0) {
        Object object3;
        HashMap hashMap0;
        Class class0 = CLS27.MTH894("favClass2");
        int v = CLS166.MTH3181(object0, "field_type");
        Object object1 = CLS66.MTH1442(CLS166.MTH3185(object0, "field_localId"));
        Object object2 = CLS166.MTH3192(class0, CLS27.MTH897("favMethod3"), new Object[]{object1});
        switch(v) {
            case 1: {
                CLS466.MTH6504(((String)CLS166.MTH3194(CLS166.MTH3194(object0, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")))));
                return;
            }
            case 2: {
                String s = (String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2});
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(s);
                CLS466.MTH6536("", arrayList0);
                return;
            }
            case 5: {
                hashMap0 = new HashMap();
                hashMap0.put("title", ((String)CLS292.MTH4772(0x38EDC1AE2B3CD335L, "favItemTitleField", object2)));
                hashMap0.put("type", "1");
                hashMap0.put("url", ((String)CLS182.MTH3492(4102147862412710709L, object2)));
                object3 = CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object2});
                break;
            }
            case 7: {
                hashMap0 = new HashMap();
                hashMap0.put("title", ((String)CLS292.MTH4772(0x38EDCE772B3CD335L, "favItemTitleField", object2)));
                hashMap0.put("url", ((String)CLS182.MTH3492(4102161340020085557L, object2)));
                hashMap0.put("type", "3");
                hashMap0.put("des", ((String)CLS182.MTH3492(4102161460279169845L, object2)));
                object3 = CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object2});
                break;
            }
            case 4: 
            case 16: {
                CLS466.MTH6522(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2})), ((String)CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object2})), "");
                return;
            }
            default: {
                return;
            }
        }
        CLS466.MTH6519(((String)object3), hashMap0);
    }

    // 此方法包含解密的字符串
    public final String MTH2037(String s, boolean z) {
        Bitmap bitmap0;
        if(!z) {
            return s;
        }
        if(CLS502.MTH6934(s, new String[]{"WechatXposed_"})) {
            return s;
        }
        try {
            String s1 = this.FLD1445.MTH925("watermark_img", "");
            CLS94 ⁱˉ0 = this.FLD550.MTH1283(s1);
            if(ⁱˉ0 == null) {
                return s;
            }
            File file0 = CLS31.MTH1038(CLS27.MTH900());
            int v = this.FLD552;
            this.FLD552 = v + 1;
            String s2 = new File(file0, "WechatXposed_" + Long.toHexString(System.currentTimeMillis()) + "_" + v).getAbsolutePath();
            File file1 = new File(s);
            if(CLS31.MTH1001(file1)) {
                try {
                    bitmap0 = BitmapFactory.decodeStream(new FileInputStream(file1));
                }
                catch(Exception exception0) {
                    CLS27.MTH893(exception0);
                    bitmap0 = null;
                }
            }
            else {
                bitmap0 = null;
            }
            Bitmap bitmap1 = CLS518.MTH7057(bitmap0, ⁱˉ0);
            CLS518.MTH7058(new File(s2), bitmap1);
            return s2;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return s;
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2038() {
        public final class CLS627 implements CLS2 {
            public final CLS629 FLD543;

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS1255 ᵢﹶ0 = new CLS1255(this, s, 22);
                CLS40.FLD157.MTH1124(((CLS39)ᵢﹶ0));
            }
        }

        boolean z = CLS412.MTH6002();
        CLS29 ˎᵢ0 = this.FLD1445;
        if(z || !ˎᵢ0.MTH938("mass_send_user_sel_wx", false)) {
            ArrayList arrayList0 = new ArrayList();
            String s = ˎᵢ0.MTH925("mass_send_exclude", "");
            String s1 = CLS27.MTH904();
            for(Object object0: this.FLD1444.MTH5341(s1)) {
                String s2 = (String)object0;
                if(!CLS426.MTH6126(s2) && !CLS372.MTH5400(s2) && !CLS372.MTH5406(s2) && !CLS502.MTH6934(s, new String[]{s2})) {
                    arrayList0.add(new CLS78(s2, CLS371.FLD3470.MTH5311(s2)));
                }
            }
            CLS387.MTH5585(false, ((CLS140)this).MTH3042(), arrayList0, ((CLS2)new CLS627(this)), null, -1);
        }
        else {
            try {
                this.FLD545 = true;
                Intent intent0 = new Intent();
                if(!CLS66.MTH1502(intent0, CLS27.MTH897("MassSendSelectContactUI"))) {
                    Activity activity0 = ((CLS140)this).MTH3042();
                    intent0.setClassName(activity0, CLS27.MTH897("MassSendSelectContactUI"));
                    activity0.startActivity(intent0);
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                return;
            }
        }
        try {
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2039(Object object0) {
        public final class CLS615 implements CLS2 {
            public final CLS894 FLD516;
            public final CLS629 FLD517;

            public CLS615(CLS894 ﾞˎ0) {
                this.FLD516 = ﾞˎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0.isEmpty()) {
                    return;
                }
                CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)this.FLD516), 3, arrayList0);
                CLS629.this.FLD1447.MTH3029(ˆٴ$ˆٴ0);
            }
        }


        public final class CLS616 implements CLS2 {
            public final String FLD518;
            public final CLS629 FLD519;

            public CLS616(String s) {
                this.FLD518 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS887 ˈˈ0 = new CLS887(this.FLD518);
                CLS629.this.FLD1447.getClass();
                CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)ˈˈ0), 3, arrayList0);
                CLS629.this.FLD1447.MTH3029(ˆٴ$ˆٴ0);
            }
        }


        public final class CLS617 implements CLS2 {
            public final String FLD520;
            public final CLS629 FLD521;

            public CLS617(String s) {
                this.FLD520 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                CLS886 ʾᵢ0 = new CLS886(new File(this.FLD520));
                CLS629.this.FLD1447.getClass();
                CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)ʾᵢ0), 3, arrayList0);
                CLS629.this.FLD1447.MTH3029(ˆٴ$ˆٴ0);
            }
        }


        public final class CLS618 implements CLS2 {
            public final String FLD526;
            public final byte[] FLD527;
            public final String FLD528;

            public CLS618(String s, String s1, byte[] arr_b) {
                this.FLD528 = s1;
                this.FLD527 = arr_b;
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
                    String s2 = CLS27.MTH889("appname");
                    CLS466.MTH6520("", this.FLD526, "", this.FLD528, this.FLD527, s2);
                }
            }
        }


        public final class CLS621 implements CLS2 {
            public final long FLD533;

            public CLS621(long v) {
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
                    CLS66.MTH1496("", String.valueOf(this.FLD533));
                }
            }
        }


        public final class CLS623 implements CLS2 {
            public final Object FLD536;
            public final CLS629 FLD537;

            public CLS623(Object object0) {
                this.FLD536 = object0;
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
                    CLS629.this.getClass();
                    CLS66.MTH1361(CLS27.MTH900(), this.FLD536, "");
                }
            }
        }

        CLS623 ʻˋ$ᐧⁱ0;
        Activity activity0;
        Class class0 = CLS27.MTH894("favClass2");
        int v = CLS166.MTH3181(object0, "field_type");
        long v1 = CLS166.MTH3185(object0, "field_localId");
        Object object1 = CLS66.MTH1442(v1);
        Object object2 = CLS166.MTH3192(class0, CLS27.MTH897("favMethod3"), new Object[]{object1});
        switch(v) {
            case 1: {
                String s5 = (String)CLS166.MTH3194(CLS166.MTH3194(object0, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")));
                CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS616(this, s5)), -1);
                break;
            }
            case 2: {
                String s3 = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2})));
                CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS617(this, s3)), -1);
                return;
            }
            case 3: {
                CLS894 ﾞˎ0 = new CLS894();
                ﾞˎ0.FLD1623 = CLS166.MTH3181(object2, CLS27.MTH892("favVoiceField2", "duration"));
                String s4 = (String)CLS182.MTH3492(4102147389966308149L, object2);
                if(!CLS31.MTH1024(s4)) {
                    s4 = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2})));
                }
                if(CLS31.MTH1024(s4)) {
                    ﾞˎ0.FLD1620 = s4;
                    CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS615(this, ﾞˎ0)), CLS404.MTH5907());
                    return;
                }
                break;
            }
            case 5: {
                String s = (String)CLS166.MTH3192(class0, CLS27.MTH897("favThumbMethod"), new Object[]{object2});
                String s1 = (String)CLS182.MTH3492(0x38EDC17D2B3CD335L, object2);
                String s2 = (String)CLS292.MTH4772(0x38EDC1202B3CD335L, "favItemTitleField", object2);
                byte[] arr_b = CLS31.MTH1020(new CLS69(s).MTH1554());
                CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS618(s2, s1, arr_b)), -1);
                return;
            }
            case 4: 
            case 16: {
                activity0 = ((CLS140)this).MTH3042();
                ʻˋ$ᐧⁱ0 = new CLS623(this, object2);
                CLS387.MTH5601(false, activity0, ((CLS2)ʻˋ$ᐧⁱ0), -1);
                return;
            }
            case 8: 
            case 18: {
                activity0 = ((CLS140)this).MTH3042();
                ʻˋ$ᐧⁱ0 = new CLS621(v1);
                CLS387.MTH5601(false, activity0, ((CLS2)ʻˋ$ᐧⁱ0), -1);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2040(Object object0) {
        public final class CLS619 implements CLS2 {
            public final Object FLD529;
            public final CLS629 FLD530;

            public CLS619(Object object0) {
                this.FLD529 = object0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(!arrayList0.isEmpty()) {
                    CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS893(2, this.FLD529)), 2, arrayList0);
                    CLS629.this.FLD1447.MTH3029(ˆٴ$ˆٴ0);
                }
            }
        }


        public final class CLS626 implements CLS2 {
            public final String FLD541;
            public final CLS629 FLD542;

            public CLS626(String s) {
                this.FLD541 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(!arrayList0.isEmpty()) {
                    CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS887(this.FLD541)), 2, arrayList0);
                    CLS629.this.FLD1447.MTH3029(ˆٴ$ˆٴ0);
                }
            }
        }

        CLS87 ᐧˉ0;
        Class class0 = CLS27.MTH894("favClass2");
        int v = CLS166.MTH3181(object0, "field_type");
        Object object1 = CLS66.MTH1442(CLS166.MTH3185(object0, "field_localId"));
        Object object2 = CLS166.MTH3192(class0, CLS27.MTH897("favMethod3"), new Object[]{object1});
        ArrayList arrayList0 = this.FLD554;
        arrayList0.clear();
        if(v == 1) {
            String s1 = (String)CLS166.MTH3194(CLS166.MTH3194(object0, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")));
            if(this.FLD1445.MTH938("multi_broadcast_forward_native", true)) {
                ᐧˉ0 = new CLS87(1, s1);
                arrayList0.add(ᐧˉ0);
                this.MTH2038();
                return;
            }
            CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS626(this, s1)), -1);
        }
        else {
            switch(v) {
                case 2: {
                    ᐧˉ0 = new CLS87(3, CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2}))));
                    arrayList0.add(ᐧˉ0);
                    this.MTH2038();
                    return;
                }
                case 3: {
                    CLS894 ﾞˎ0 = new CLS894();
                    ﾞˎ0.FLD1623 = CLS166.MTH3181(object2, CLS27.MTH892("favVoiceField2", "duration"));
                    String s = (String)CLS182.MTH3492(0x38EDCF012B3CD335L, object2);
                    if(!CLS31.MTH1024(s)) {
                        s = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2})));
                    }
                    if(CLS31.MTH1024(s)) {
                        ﾞˎ0.FLD1620 = s;
                        ᐧˉ0 = new CLS87(ﾞˎ0);
                        arrayList0.add(ᐧˉ0);
                        this.MTH2038();
                        return;
                    }
                    break;
                }
                default: {
                    if((v == 4 || v == 16) && CLS31.MTH1024(CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2}))))) {
                        CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS619(this, object2)), -1);
                    }
                }
            }
        }
    }

    @Override  // b.ˑٴ.CLS140
    public final void MTH3039() {
        CLS412.MTH6001(this.FLD555.FLD1559);
    }

    public final void MTH2042(AbstractList abstractList0) {
        if(abstractList0 != null) {
            try {
                if(!abstractList0.isEmpty()) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: abstractList0) {
                        if(CLS166.MTH3181(object0, CLS370.MTH5289(4102154455187510069L)) == 34) {
                            arrayList0.add(Pair.create(((String)CLS166.MTH3194(object0, CLS370.MTH5289(4102150654141453109L))), Integer.parseInt(((String)CLS166.MTH3194(object0, CLS370.MTH5289(4102150714270995253L))).split(CLS370.MTH5289(4102150774400537397L))[1])));
                        }
                    }
                    if(arrayList0.isEmpty()) {
                        return;
                    }
                    CLS476.MTH6643(((CLS140)this).MTH3042(), arrayList0);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2043(CLS167 ᵔʾ0, String s) {
        public final class CLS1644 implements CLS563 {
            public final long FLD522;
            public final String FLD523;
            public final Class FLD524;
            public final CLS629 FLD525;

            public CLS1644(long v, Class class0, String s) {
                this.FLD522 = v;
                this.FLD524 = class0;
                this.FLD523 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS11
            public final void MTH789() {
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS11
            public final void MTH790() {
                Object object0 = CLS66.MTH1442(this.FLD522);
                String s = CLS27.MTH897("favMethod3");
                Class class0 = this.FLD524;
                Object object1 = CLS166.MTH3192(class0, s, new Object[]{object0});
                CLS894 ﾞˎ0 = new CLS894();
                ﾞˎ0.FLD1623 = CLS166.MTH3181(object1, CLS27.MTH892("favVoiceField2", "duration"));
                String s1 = (String)CLS182.MTH3492(4101784409395221301L, object1);
                if(!CLS31.MTH1024(s1)) {
                    s1 = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object1})));
                }
                if(!CLS31.MTH1024(s1)) {
                    return;
                }
                ﾞˎ0.FLD1620 = s1;
                CLS629 ʻˋ0 = CLS629.this;
                CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)ﾞˎ0), this.FLD523, 0);
                ʻˋ0.FLD1447.MTH3029(ˆٴ$ˆٴ0);
                ((CLS140)ʻˋ0).MTH3042().finish();
                WeakReference weakReference0 = ʻˋ0.FLD551;
                if(weakReference0 != null) {
                    ((Activity)weakReference0.get()).finish();
                    ʻˋ0.FLD551 = null;
                }
            }

            // 此方法包含解密的字符串
            @Override  // b.ʻˑ.CLS563
            public final void MTH775() {
                Intent intent0 = new Intent();
                intent0.putExtra("key_detail_create_time", 0);
                intent0.putExtra("key_detail_info_id", this.FLD522);
                Activity activity0 = ((CLS140)CLS629.this).MTH3042();
                if(!CLS66.MTH1515(activity0, ".ui.detail.FavoriteVoiceDetailUI", intent0)) {
                    intent0.setClassName(activity0, CLS27.MTH897("FavoriteVoiceDetailUI"));
                    activity0.startActivity(intent0);
                }
            }
        }

        try {
            if(!this.FLD1445.MTH938("favorite_forward_enable", true)) {
                return;
            }
            Class class0 = CLS27.MTH894("favClass2");
            if(class0 == null) {
                return;
            }
            View view0 = (View)ᵔʾ0.MTH3204()[1];
            if(view0 == null) {
                return;
            }
            Object object0 = view0.getTag();
            if(object0 == null) {
                return;
            }
            Object object1 = CLS166.MTH3194(object0, CLS27.MTH897("favFieldItem"));
            if(object1 == null) {
                return;
            }
            if(CLS166.MTH3181(object1, "field_type") != 3) {
                return;
            }
            long v = CLS166.MTH3185(object1, "field_localId");
            Activity activity0 = ((CLS140)this).MTH3042();
            String s1 = CLS27.MTH889("send_confirmation");
            Object[] arr_object = {this.FLD1444.MTH5316(s)};
            String s2 = CLS27.MTH889("preview");
            CLS1644 ʻˋ$ˆٴ0 = new CLS1644(this, v, class0, s);
            CLS523.MTH7151(activity0, null, ((CLS17)new CLS1392(activity0, String.format(s1, arr_object), 0)), ((CLS11)ʻˋ$ˆٴ0), s2);
            ᵔʾ0.MTH3207(null);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2044(int v, int v1, long v2, long v3, String s, String s1, String s2, String s3) {
        try {
            ContentValues contentValues0 = this.MTH2057(v, v1, v2, v3, s, s1, s2);
            if(contentValues0 != null && contentValues0.size() != 0) {
                ArrayList arrayList0 = new ArrayList();
                arrayList0.add(contentValues0);
                String s4 = CLS27.MTH895().MTH938("mass_send_user_priority", false) ? "mass_send_cv2" : "mass_send_cv";
                CLS21.FLD76.MTH818(s4, new Object[]{s3, arrayList0});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2045(AbstractList abstractList0) {
        if(abstractList0 != null) {
            try {
                if(!abstractList0.isEmpty()) {
                    ArrayList arrayList0 = new ArrayList();
                    ArrayList arrayList1 = new ArrayList();
                    CharSequence charSequence0 = null;
                    for(Object object0: abstractList0) {
                        if(CLS166.MTH3181(object0, "field_type") == 3 && arrayList0.size() < 9) {
                            long v = CLS166.MTH3185(object0, "field_msgSvrId");
                            if(TextUtils.isEmpty(charSequence0)) {
                                charSequence0 = (String)CLS166.MTH3194(object0, "field_talker");
                            }
                            String s = this.FLD1444.MTH5319(v);
                            if(CLS31.MTH1021(s)) {
                                arrayList0.add(CLS66.MTH1410(s));
                            }
                            else {
                                arrayList1.add(object0);
                            }
                        }
                    }
                    if(arrayList0.isEmpty()) {
                        return;
                    }
                    if(arrayList1.isEmpty()) {
                        CLS466.MTH6540(arrayList0);
                        return;
                    }
                    int v1 = arrayList1.size();
                label_25:
                    for(int v2 = 0; v2 < arrayList1.size(); ++v2) {
                        Object object1 = arrayList1.get(v2);
                        long v3 = CLS166.MTH3185(object1, "field_msgSvrId");
                        long v4 = CLS166.MTH3185(object1, "field_msgId");
                        Object object2 = CLS166.MTH3194(object1, "field_imgPath");
                        CLS466.MTH6539(CLS166.MTH3181(object1, "field_isSend"), v4, v3, ((CLS0)new CLS838(new int[]{0}, v1 - 1, arrayList0, 0)), ((String)object2));
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
                if(true) {
                    return;
                }
                goto label_25;
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ˑٴ.CLS140
    public final void MTH3040(CLS21 ʾᵢ0) {
        CLS34.MTH1084(this, 0, ʾᵢ0, "a.on_MMFragmentActivity_onResume,a.on_VASActivity_onResume");
        CLS34.MTH1084(this, 1, ʾᵢ0, "b.on_MMFragmentActivity_onCreate");
        CLS34.MTH1084(this, 2, ʾᵢ0, "a.on_MMActivity_onCreate,after_Activity_onCreate");
        CLS34.MTH1084(this, 3, ʾᵢ0, "b.snsuploadui.onactivityresult");
        CLS34.MTH1084(this, 4, ʾᵢ0, "mass_send_cv");
        ʾᵢ0.MTH828("mass_send_cv2", ((CLS35)new CLS712(((CLS140)this), ʾᵢ0, 1)));
        ʾᵢ0.MTH828("addProjectForwardScheduleTask", ((CLS35)new CLS571(27)));
        CLS21 ʾᵢ1 = CLS21.FLD76;
        CLS34.MTH1084(this, 6, ʾᵢ1, "on_forwardMenuClass2_onCreateContextMenu");
        CLS34.MTH1084(this, 7, ʾᵢ1, "on_forwardMenuClass2b_forwardMenuMethod1");
        CLS34.MTH1084(this, 8, ʾᵢ1, "on_forwardMenuClass2c_recordSightMethod3");
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS667(this, 8)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS667(this, 9)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS667(this, 10)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS667(this, 11)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS667(this, 12)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS667(this, 13)));
        ʾᵢ1.MTH833("sns.menu.options", ((CLS37)new CLS667(this, 14)));
        CLS34.MTH1088(this, 18, ʾᵢ1, "sns.menu.config");
        CLS34.MTH1088(this, 19, ʾᵢ1, "sns.menu.config");
        CLS34.MTH1088(this, 20, ʾᵢ1, "sns.menu.config");
        CLS34.MTH1088(this, 13, ʾᵢ1, "sns.menu.config");
        CLS34.MTH1088(this, 14, ʾᵢ1, "sns.menu.config");
        CLS34.MTH1088(this, 15, ʾᵢ1, "sns.menu.config");
        CLS34.MTH1088(this, 16, ʾᵢ1, "sns.menu.config");
        CLS34.MTH1088(this, 17, ʾᵢ1, "sns.menu.config");
        CLS34.MTH1088(this, 22, ʾᵢ1, CLS34.MTH1060(4, ʾᵢ1, CLS34.MTH1060(3, ʾᵢ1, CLS34.MTH1060(2, ʾᵢ1, CLS34.MTH1060(1, ʾᵢ1, "on_SnsUploadUI_onPause", 4102167614967305013L), 0x38EDD04E2B3CD335L), 0x38EDD0682B3CD335L), 4102169912774808373L));
        CLS34.MTH1088(this, 23, ʾᵢ1, "on_imgGalleryClass3_recordSightMethod1");
        CLS34.MTH1088(this, 11, ʾᵢ1, "on_flipviewClass2_flipviewMethod1");
        CLS34.MTH1088(this, 12, ʾᵢ1, "on_flipviewClass3_recordSightClass3");
        CLS34.MTH1088(this, 3, ʾᵢ1, "on_SnsOnlineVideoActivity_onCreateContextMenu");
        CLS34.MTH1088(this, 4, ʾᵢ1, "on_SnsDetailContextMenuClass_onCreateMMMenu");
        CLS34.MTH1088(this, 5, ʾᵢ1, "on_SnsDetailContextMenuClass2_chatmenuMethod1");
        CLS34.MTH1088(this, 6, ʾᵢ1, "on_SnsOnlineVideoActivityClass_a");
        CLS34.MTH1088(this, 7, ʾᵢ1, "on_SnsOnlineVideoActivityClass2_chatmenuMethod1");
        CLS34.MTH1084(this, 13, ʾᵢ1, "on_FavSelectUI_onCreate");
        CLS34.MTH1084(this, 22, ʾᵢ1, "on_FavSelectUI_onItemClick");
        CLS34.MTH1084(this, 25, ʾᵢ1, "on_favClass5_favMethod5");
        CLS34.MTH1084(this, 26, ʾᵢ1, "on_favSearchClick2_onItemClick");
        CLS34.MTH1084(this, 27, ʾᵢ1, "on_favFilterUIClick_onItemClick");
        CLS34.MTH1084(this, 28, ʾᵢ1, "on_FavTopSearchUIC_onItemClick");
        CLS34.MTH1084(this, 29, ʾᵢ1, "on_FavTopSearchUIC_onCreateContextMenu");
        CLS34.MTH1088(this, 0, ʾᵢ1, "on_FavTopSearchUIC_onCreateContextMenu2");
        CLS34.MTH1088(this, 1, ʾᵢ1, "on_FavTopSearchUIC_onMMMenuItemSelected");
        CLS34.MTH1088(this, 2, ʾᵢ1, "b.favsearch.menu.oncreate");
        CLS34.MTH1084(this, 14, ʾᵢ1, "b.favsearch.menu.oncreate");
        CLS34.MTH1084(this, 15, ʾᵢ1, "b.favsearch.menu.oncreate");
        CLS34.MTH1084(this, 16, ʾᵢ1, "b.favsearch.menu.oncreate2");
        CLS34.MTH1084(this, 17, ʾᵢ1, "b.favsearch.menu.oncreate2");
        CLS34.MTH1084(this, 18, ʾᵢ1, "b.favsearch.menu.oncreate2");
        CLS34.MTH1084(this, 19, ʾᵢ1, "on_FavSearchUI_onCreate");
        CLS34.MTH1084(this, 20, ʾᵢ1, CLS34.MTH1062(29, ʾᵢ1, CLS34.MTH1062(28, ʾᵢ1, "on_FavoriteVideoPlayUIClass_recordSightClass3", 4102179189904167733L), 0x38EDDEDF2B3CD335L));
        CLS34.MTH1084(this, 21, ʾᵢ1, "on_processFavDetailMenu");
        CLS34.MTH1084(this, 23, ʾᵢ1, "on_FavMediaGalleryUI_onCreateMMMenu_construct");
        CLS34.MTH1084(this, 24, ʾᵢ1, "on_addFavMediaGalleryUIMenu");
        CLS34.MTH1088(this, 29, ʾᵢ1, CLS34.MTH1060(0, ʾᵢ1, "on_processFavMediaGalleryUIMenu", 0x38EDDDA42B3CD335L));
        ʾᵢ1.MTH828("on_recordImgClass2", ((CLS35)new CLS669(this, 0)));
        ʾᵢ1.MTH828("on_recordSightClass1_recordSightMethod1", ((CLS35)new CLS669(this, 1)));
        ʾᵢ1.MTH828("on_RecordMsgFileUI_onResume", ((CLS35)new CLS669(this, 2)));
        ʾᵢ1.MTH828("on_recordSightClass2_recordSightMethod3", ((CLS35)new CLS669(this, 3)));
        ʾᵢ1.MTH828("on_RecordMsgDetailUI_menu", ((CLS35)new CLS669(this, 4)));
        ʾᵢ1.MTH828("on_RecordMsgDetailUIClass_menu_selected", ((CLS35)new CLS669(this, 5)));
        CLS34.MTH1088(this, 8, ʾᵢ1, "on_MassSendMsgUI_onCreate");
        CLS34.MTH1088(this, 9, ʾᵢ1, "sendMassMessage");
        CLS34.MTH1088(this, 10, ʾᵢ1, "on_mass_send");
        ʾᵢ1.MTH828("skip_large_video_check", ((CLS35)new CLS669(this, 6)));
        ʾᵢ1.MTH828("on_sightutil_getInfo", ((CLS35)new CLS669(this, 7)));
        ʾᵢ1.MTH828("on_sightutil_getInfo_json", ((CLS35)new CLS669(this, 8)));
        ʾᵢ1.MTH828("on_sightutil_addsendtask", ((CLS35)new CLS669(this, 9)));
        ʾᵢ1.MTH828("on_sightutil_cdnupload", ((CLS35)new CLS669(this, 10)));
        ʾᵢ1.MTH828("on_sightutil_cdnupload2", ((CLS35)new CLS669(this, 11)));
        CLS34.MTH1088(this, 24, ʾᵢ1, "on_LiveFeedMenuClass1_createMenu");
        CLS34.MTH1088(this, 25, ʾᵢ1, "on_LiveFeedMenuClass30_onMMMenuItemSelected");
        ʾᵢ1.MTH833("chattingui.optionsmenu.options", ((CLS37)new CLS667(this, 15)));
        CLS34.MTH1088(this, 21, ʾᵢ1, "chattingui.optionsmenu.config");
        CLS34.MTH1084(this, 10, ʾᵢ1, "b.fav.menu.oncreate");
        CLS34.MTH1084(this, 11, ʾᵢ1, "b.fav.menu.oncreate");
        CLS34.MTH1084(this, 12, ʾᵢ1, "b.fav.menu.oncreate");
        CLS34.MTH1088(this, 26, ʾᵢ1, "b.fav.menu.oncreate2");
        CLS34.MTH1088(this, 27, ʾᵢ1, "b.fav.menu.oncreate2");
        CLS34.MTH1088(this, 28, ʾᵢ1, "b.fav.menu.oncreate2");
        ʾᵢ1.MTH833("itemMenu.options", ((CLS37)new CLS667(this, 5)));
        ʾᵢ1.MTH833("itemMenu.options", ((CLS37)new CLS667(this, 6)));
        ʾᵢ1.MTH833("itemMenu.options", ((CLS37)new CLS667(this, 7)));
        CLS34.MTH1084(this, 9, ʾᵢ1, "itemMenu.config");
        ʾᵢ1.MTH833("plus.options", ((CLS37)new CLS667(this, 16)));
        ʾᵢ1.MTH828("plus.config", ((CLS35)new CLS669(this, 12)));
        CLS34.MTH1084(this, 5, ʾᵢ1, "chat.menu.config");
        ʾᵢ1.MTH833("chat.menu.options", ((CLS37)new CLS667(this, 0)));
        ʾᵢ1.MTH833("chat.menu.options", ((CLS37)new CLS667(this, 1)));
        ʾᵢ1.MTH833("chat.menu.options", ((CLS37)new CLS667(this, 2)));
        ʾᵢ1.MTH833("chat.menu.options", ((CLS37)new CLS667(this, 3)));
        ʾᵢ1.MTH833("chat.menu.options", ((CLS37)new CLS667(this, 4)));
        if(!CLS412.MTH6002()) {
            ʾᵢ1.MTH833("chat.menu.options", ((CLS37)new CLS787(5)));
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2047(Object object0) {
        public final class CLS620 implements CLS2 {
            public final Object FLD531;
            public final CLS629 FLD532;

            public CLS620(Object object0) {
                this.FLD531 = object0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0.isEmpty()) {
                    return;
                }
                CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS893(2, this.FLD531)), 2, arrayList0);
                CLS629.this.FLD1447.MTH3029(ˆٴ$ˆٴ0);
            }
        }


        public final class CLS622 implements CLS2 {
            public final String FLD534;
            public final CLS629 FLD535;

            public CLS622(String s) {
                this.FLD534 = s;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(!arrayList0.isEmpty()) {
                    CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)new CLS887(this.FLD534)), 2, arrayList0);
                    CLS629.this.FLD1447.MTH3029(ˆٴ$ˆٴ0);
                }
            }
        }


        public final class CLS625 implements CLS2 {
            public final CLS894 FLD539;
            public final CLS629 FLD540;

            public CLS625(CLS894 ﾞˎ0) {
                this.FLD539 = ﾞˎ0;
                super();
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH772() {
            }

            @Override  // b.ʻˑ.CLS2
            public final void MTH773(String s, String s1, ArrayList arrayList0) {
                if(arrayList0.isEmpty()) {
                    return;
                }
                CLS170 ˆٴ$ˆٴ0 = new CLS170(((CLS169)this.FLD539), 3, arrayList0);
                CLS629.this.FLD1447.MTH3029(ˆٴ$ˆٴ0);
            }
        }


        public final class CLS628 implements CLS2 {
            public final long FLD544;

            public CLS628(long v) {
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
                    CLS66.MTH1496("", String.valueOf(this.FLD544));
                }
            }
        }

        CLS628 ʻˋ$ﾞᐧ0;
        Activity activity0;
        CLS87 ᐧˉ0;
        if(object0 == null) {
            return;
        }
        Class class0 = CLS27.MTH894("favClass2");
        if(class0 == null) {
            return;
        }
        int v = CLS166.MTH3181(object0, "field_type");
        switch(v) {
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 16: {
                break;
            }
            case 8: 
            case 18: {
                if(!this.FLD1447.FLD1438.MTH6895("fav_wenote")) {
                    return;
                }
                break;
            }
            default: {
                return;
            }
        }
        long v1 = CLS166.MTH3185(object0, "field_localId");
        Object object1 = CLS66.MTH1442(v1);
        Object object2 = CLS166.MTH3192(class0, CLS27.MTH897("favMethod3"), new Object[]{object1});
        ArrayList arrayList0 = this.FLD554;
        try {
            arrayList0.clear();
            switch(v) {
                case 1: {
                    String s = (String)CLS166.MTH3194(CLS166.MTH3194(object0, "field_favProto"), CLS27.MTH892("favProto_descField", CLS27.MTH897("favArticleField1")));
                    if(this.FLD1445.MTH938("multi_broadcast_forward_native", true)) {
                        ᐧˉ0 = new CLS87(1, s);
                        arrayList0.add(ᐧˉ0);
                        this.MTH2038();
                        return;
                    }
                    CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS622(this, s)), -1);
                    return;
                }
                case 2: {
                    ᐧˉ0 = new CLS87(3, CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2}))));
                    arrayList0.add(ᐧˉ0);
                    this.MTH2038();
                    return;
                }
                case 3: {
                    CLS894 ﾞˎ0 = new CLS894();
                    ﾞˎ0.FLD1623 = CLS166.MTH3181(object2, CLS27.MTH892("favVoiceField2", "duration"));
                    String s1 = (String)CLS166.MTH3194(object2, CLS27.MTH897("favVoiceField1"));
                    if(!CLS31.MTH1024(s1)) {
                        s1 = CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2})));
                    }
                    if(CLS31.MTH1024(s1)) {
                        ﾞˎ0.FLD1620 = s1;
                        CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS625(this, ﾞˎ0)), CLS404.MTH5907());
                        return;
                    }
                    break;
                }
                case 4: 
                case 16: {
                    if(CLS31.MTH1024(CLS31.MTH992(((String)CLS166.MTH3192(class0, CLS27.MTH897("favPathMethod"), new Object[]{object2}))))) {
                        activity0 = ((CLS140)this).MTH3042();
                        ʻˋ$ﾞᐧ0 = new CLS620(this, object2);
                        CLS387.MTH5601(false, activity0, ((CLS2)ʻˋ$ﾞᐧ0), -1);
                        return;
                    }
                    break;
                }
                default: {
                    activity0 = ((CLS140)this).MTH3042();
                    ʻˋ$ﾞᐧ0 = new CLS628(v1);
                    CLS387.MTH5601(false, activity0, ((CLS2)ʻˋ$ﾞᐧ0), -1);
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2048(AbstractList abstractList0) {
        if(abstractList0 == null) {
            return;
        }
        else {
            try {
                if(!abstractList0.isEmpty()) {
                    CLS151 ˊﾞ0 = new CLS151();
                    ˊﾞ0.FLD1544 = new CLS679(this, 1);
                    CLS610 ﾞٴ0 = new CLS610(8);
                    CLS610 ﾞٴ1 = new CLS610(9);
                    ˊﾞ0.MTH3138(1, ((CLS149)new CLS610(10)));
                    ˊﾞ0.MTH3138(3, ((CLS149)new CLS610(11)));
                    ˊﾞ0.MTH3138(34, ((CLS149)new CLS610(12)));
                    ˊﾞ0.MTH3138(49, ((CLS149)new CLS610(13)));
                    ˊﾞ0.MTH3138(0x31000031, ((CLS149)ﾞٴ0));
                    ˊﾞ0.MTH3138(0x1000031, ((CLS149)ﾞٴ0));
                    ˊﾞ0.MTH3138(62, ((CLS149)ﾞٴ1));
                    ˊﾞ0.MTH3138(43, ((CLS149)ﾞٴ1));
                    ˊﾞ0.FLD1540 = new CLS1225(7);
                    for(int v = 0; v < abstractList0.size(); ++v) {
                        Object object0 = abstractList0.get(v);
                        int v1 = CLS166.MTH3181(object0, "field_type");
                        String s = (String)CLS166.MTH3194(object0, "field_content");
                        String s1 = (String)CLS166.MTH3194(object0, "field_talker");
                        int v2 = CLS166.MTH3181(object0, "field_isSend");
                        String s2 = (String)CLS166.MTH3194(object0, "field_imgPath");
                        String s3 = CLS426.MTH6106(v2, s, s1);
                        long v3 = CLS166.MTH3185(object0, "field_msgSvrId");
                        long v4 = CLS166.MTH3185(object0, "field_msgId");
                        Bundle bundle0 = new Bundle();
                        bundle0.putInt("type", v1);
                        bundle0.putInt("isSend", v2);
                        bundle0.putString("content", s);
                        bundle0.putString("stripContent", s3);
                        bundle0.putString("talker", s1);
                        bundle0.putString("imgPath", s2);
                        bundle0.putLong("msgSvrId", v3);
                        bundle0.putLong("msgId", v4);
                        ˊﾞ0.MTH3134(v1, bundle0);
                    }
                    ˊﾞ0.MTH3137();
                    return;
                }
                return;
            }
            catch(Throwable throwable0) {
            }
        }
        CLS27.MTH893(throwable0);
    }

    // 此方法包含解密的字符串
    public static void MTH2049(AbstractList abstractList0) {
        if(abstractList0 != null) {
            try {
                if(!abstractList0.isEmpty()) {
                    CLS309.FLD3190.getClass();
                    CLS603 ᐧⁱ0 = (CLS603)CLS309.MTH4946(16);
                    ᐧⁱ0.FLD497 = true;
                    for(int v = 0; v < abstractList0.size(); ++v) {
                        Long long0 = CLS166.MTH3185(abstractList0.get(v), "field_msgId");
                        ᐧⁱ0.FLD467.add(long0);
                    }
                    CLS21.FLD76.MTH818("showAddTaskScheduleDialog", new Object[]{ᐧⁱ0});
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2050(AbstractList abstractList0) {
        CLS29 ˎᵢ0 = this.FLD1445;
        if(abstractList0 != null) {
            try {
                if(!abstractList0.isEmpty()) {
                    CLS568 יᐧ0 = new CLS568(this, abstractList0, 5);
                    if(ˎᵢ0.MTH938("sns_img_add_img_watermark", false)) {
                        this.FLD552 = 0;
                        CLS466.MTH6509();
                        CLS395.MTH5733(((CLS140)this).MTH3042(), ˎᵢ0.MTH938("sns_img_add_img_watermark", false), ((CLS3)new CLS1274(this, יᐧ0, 13)));
                        return;
                    }
                    יᐧ0.MTH791(Boolean.FALSE);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    public final void MTH2051(int v, int v1, long v2, long v3, String s, String s1, String s2) {
        CLS403.MTH5863(((CLS140)this).MTH3042(), ((CLS12)new CLS750(this, v, s, s1, v1, s2, v2, v3, 0)), null);
    }

    // 此方法包含解密的字符串
    public static LinkedList MTH2052(CLS167 ᵔʾ0) {
        Object object1;
        Object object0;
        if(ᵔʾ0 == null) {
            return null;
        }
        Class class0 = CLS27.MTH894("ImgClass4");
        try {
            if(!TextUtils.isEmpty(CLS27.MTH897("forwardMultiImgField1"))) {
                object0 = CLS166.MTH3194(ᵔʾ0.MTH3205(), CLS27.MTH897("forwardMultiImgField1"));
                object1 = CLS166.MTH3194(object0, CLS27.MTH897("forwardMultiImgField2"));
            }
            else if(CLS27.MTH890("forwardMenuClass2d")) {
                object0 = CLS164.MTH3175(ᵔʾ0.MTH3205(), CLS27.MTH897("forwardMenuClass2d"));
                if(object0 == null) {
                    return null;
                }
                object1 = CLS164.MTH3175(object0, CLS27.MTH897("forwardMenuClass2e"));
            }
            else {
                object0 = CLS164.MTH3176(0, ᵔʾ0.MTH3205());
                if(object0 == null) {
                    return null;
                }
                object1 = CLS164.MTH3176(0, object0);
            }
            if(object1 == null) {
                return null;
            }
            if(!TextUtils.isEmpty(CLS27.MTH897("forwardMultiImgMethod2"))) {
                return CLS166.MTH3195(object0, CLS27.MTH897("forwardMultiImgMethod2"), new Object[0]);
            }
            if(TextUtils.isEmpty(CLS27.MTH897("ImgClass4"))) {
                if(!TextUtils.isEmpty(CLS27.MTH897("forwardMultiImgMethod1"))) {
                    return CLS166.MTH3195(object1, CLS27.MTH897("forwardMultiImgMethod1"), new Object[0]);
                }
                if(!TextUtils.isEmpty(CLS27.MTH897("forwardMultiImgMethod1b"))) {
                    return CLS166.MTH3195(object1, CLS27.MTH897("forwardMultiImgMethod1b"), new Object[]{object1});
                }
            }
            else if(class0 != null) {
                return CLS166.MTH3192(class0, CLS27.MTH897("forwardMultiImgMethod1"), new Object[]{object1});
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        return null;
    }

    // 此方法包含解密的字符串
    public final void MTH2053(String s) {
        if(this.FLD554.isEmpty()) {
            return;
        }
        try {
            ArrayList arrayList0 = new ArrayList(Arrays.asList(CLS502.MTH6941(s)));
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                if(((String)object0).contains("@")) {
                    iterator0.remove();
                }
            }
            int v1 = arrayList0.size();
            if(v1 <= 200) {
                this.MTH2056(v1, TextUtils.join(";", arrayList0));
                return;
            }
            if(this.FLD1445.MTH938("mass_send_by_one_hack", false) && this.FLD1447.FLD1438.MTH6895("mass_send_by_one_hack")) {
                this.MTH2056(1, TextUtils.join(";", arrayList0));
                return;
            }
            ArrayList arrayList1 = new ArrayList();
            for(int v = 0; v < v1; v += 200) {
                arrayList1.add(new ArrayList(arrayList0.subList(v, Math.min(v1, v + 200))));
            }
            for(Object object1: arrayList1) {
                this.MTH2056(((ArrayList)object1).size(), TextUtils.join(";", ((ArrayList)object1)));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    public final void MTH2054(AbstractList abstractList0) {
        if(abstractList0 != null) {
            try {
                if(!abstractList0.isEmpty()) {
                    CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS614(this, abstractList0)), -1);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2055(AbstractList abstractList0) {
        if(abstractList0 != null) {
            try {
                if(!abstractList0.isEmpty()) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: abstractList0) {
                        if(CLS166.MTH3181(object0, "field_type") == 34) {
                            arrayList0.add(CLS66.MTH1483(((String)CLS166.MTH3194(object0, "field_imgPath"))));
                        }
                    }
                    if(arrayList0.isEmpty()) {
                        return;
                    }
                    Activity activity0 = ((CLS140)this).MTH3042();
                    CLS523.MTH7145(activity0, CLS27.MTH889("merge_voices"), ((CLS17)new CLS1562(arrayList0, activity0, 1)), null);
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2056(int v, String s) {
        CLS80 ˑٴ0;
        CLS87 ᐧˉ0;
        CLS158 ⁱʾ0;
        CLS139 ﹶʼ0;
        try {
            ArrayList arrayList0 = this.FLD554;
            if(arrayList0.isEmpty()) {
                return;
            }
            Iterator iterator0 = arrayList0.iterator();
        alab1:
            while(true) {
            label_4:
                boolean z = iterator0.hasNext();
                CLS29 ˎᵢ0 = this.FLD1445;
                ﹶʼ0 = this.FLD1447;
                ⁱʾ0 = this.FLD555;
                int v1 = 0;
                if(!z) {
                    if(!ﹶʼ0.FLD1438.MTH6895("mass_send_by_one_hack") || !ˎᵢ0.MTH938("mass_send_by_one_hack", false)) {
                        if(!CLS412.MTH6002()) {
                            v1 = 300000;
                        }
                        v1 = CLS412.MTH6005(v1, "mass_send_delay");
                    }
                    ⁱʾ0.MTH3156(((long)v1));
                    ⁱʾ0.MTH3155();
                    return;
                }
                Object object0 = iterator0.next();
                ᐧˉ0 = (CLS87)object0;
                String s1 = ᐧˉ0.FLD356;
                switch(ᐧˉ0.FLD353) {
                    case 1: {
                        goto label_46;
                    }
                    case 3: {
                        goto label_35;
                    }
                    case 34: {
                        ˑٴ0 = new CLS80(s, v, ᐧˉ0);
                        goto label_48;
                    }
                    case 43: {
                        break alab1;
                    }
                    case 49: {
                        byte[] arr_b = TextUtils.isEmpty(s1) ? ᐧˉ0.FLD351 : CLS466.MTH6532(s1);
                        ﹶʼ0.MTH3029(new CLS170(((CLS169)new CLS892(ᐧˉ0.FLD355, arr_b, ᐧˉ0.FLD357)), s));
                    }
                }
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return;
        }
        try {
            if(!CLS502.MTH6934(ᐧˉ0.FLD355, new String[]{"/"})) {
                CLS466.MTH6507(ᐧˉ0.FLD355, ((CLS12)new CLS773(v, ᐧˉ0, this, s)), false, 0);
            }
            else if(CLS31.MTH1027(ᐧˉ0.FLD355)) {
                ⁱʾ0.MTH3150(new CLS80(s, v, ᐧˉ0));
            }
            else {
                CLS412.MTH6014(((CLS140)this).MTH3042(), String.format(CLS27.MTH889("file_not_found"), ᐧˉ0.FLD355));
            }
            goto label_4;
        }
        catch(Throwable throwable1) {
            goto label_44;
        }
        try {
            ˑٴ0 = new CLS80(s, v, ᐧˉ0);
            goto label_48;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return;
        }
        try {
        label_35:
            if(CLS31.MTH1021(ᐧˉ0.FLD355) || CLS502.MTH6934(ᐧˉ0.FLD355, new String[]{"WechatForwarder", "favorite"}) || ᐧˉ0.FLD355.startsWith("/") && CLS31.MTH1001(new File(ᐧˉ0.FLD355))) {
                ⁱʾ0.MTH3150(new CLS80(s, v, ᐧˉ0));
            }
            else {
                long v2 = ᐧˉ0.FLD357;
                if(v2 == 0L) {
                    goto label_4;
                }
                CLS737 ˑٴ1 = new CLS737(v, ᐧˉ0, this, s);
                CLS466.MTH6539(ᐧˉ0.FLD350, v2, ᐧˉ0.FLD354, ((CLS0)ˑٴ1), ᐧˉ0.FLD356);
            }
            goto label_4;
        }
        catch(Throwable throwable1) {
            try {
            label_44:
                CLS27.MTH893(throwable1);
                goto label_4;
            label_46:
                if(ˎᵢ0.MTH938("multi_broadcast_forward_native", true)) {
                    ˑٴ0 = new CLS80(s, v, ᐧˉ0);
                }
                else {
                    ﹶʼ0.MTH3029(new CLS170(((CLS169)new CLS887(ᐧˉ0.FLD355)), s));
                    goto label_4;
                }
            label_48:
                ⁱʾ0.MTH3150(ˑٴ0);
                goto label_4;
            }
            catch(Throwable throwable0) {
            }
        }
        CLS27.MTH893(throwable0);
    }

    // 此方法包含解密的字符串
    public final ContentValues MTH2057(int v, int v1, long v2, long v3, String s, String s1, String s2) {
        String s6;
        String s5;
        try {
            ContentValues contentValues0 = new ContentValues();
            switch(v) {
                case 1: {
                    contentValues0.put("type", 1);
                    s5 = "content";
                    s6 = CLS426.MTH6106(v1, s1, s);
                    break;
                }
                case 3: {
                    contentValues0.put("type", 2);
                    s5 = "img";
                    s6 = CLS66.MTH1410(this.FLD1444.MTH5319(v2));
                    break;
                }
                case 34: {
                    contentValues0.put("type", 3);
                    contentValues0.put("duration", Integer.parseInt(s1.split(":")[1]));
                    s5 = "voice";
                    s6 = CLS66.MTH1483(s2);
                    break;
                }
                case 42: {
                    contentValues0.put("type", 42);
                    s5 = "content";
                    s6 = CLS426.MTH6106(v1, s1, s);
                    break;
                }
                case 43: 
                case 62: {
                    contentValues0.put("type", 62);
                    contentValues0.put("imgPath", s2);
                    contentValues0.put("msgId", v3);
                    return contentValues0;
                }
                case 0x1000031: 
                case 0x31000031: {
                    String s4 = (String)CLS392.MTH5633(s1, "msg").get(".msg.appmsg.title");
                    contentValues0.put("type", 1);
                    contentValues0.put("content", s4);
                    return contentValues0;
                }
                case 49: 
                case 0x2D000031: 
                case 0x3A000031: 
                case 0x3E000031: 
                case 0x41000031: 
                case 0x54000031: 
                case 0x55000031: {
                    String s3 = CLS426.MTH6106(v1, s1, s);
                    byte[] arr_b = CLS466.MTH6532(s2);
                    contentValues0.put("type", 49);
                    contentValues0.put("content", s3);
                    contentValues0.put("imgBuf", arr_b);
                    return contentValues0;
                }
                default: {
                    return contentValues0;
                }
            }
            contentValues0.put(s5, s6);
            return contentValues0;
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
            return null;
        }
    }

    public final void MTH2058(AbstractList abstractList0) {
        if(abstractList0 != null) {
            try {
                if(!abstractList0.isEmpty()) {
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: abstractList0) {
                        if(CLS166.MTH3181(object0, CLS370.MTH5289(4102154730065417013L)) == 34) {
                            String s = (String)CLS166.MTH3194(object0, CLS370.MTH5289(0x38EDC7892B3CD335L));
                            arrayList0.add(new CLS894(((String)CLS166.MTH3194(object0, CLS370.MTH5289(0x38EDC7972B3CD335L))), s));
                        }
                    }
                    if(arrayList0.isEmpty()) {
                        return;
                    }
                    CLS387.MTH5601(false, ((CLS140)this).MTH3042(), ((CLS2)new CLS867(this, arrayList0)), CLS404.MTH5907());
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2059(AbstractList abstractList0) {
        CLS151 ˊﾞ1;
        String s5;
        boolean z1;
        File file1;
        File file0;
        CLS412.MTH6014(((CLS140)this).MTH3042(), String.format(CLS27.MTH889("export_to_folder1"), abstractList0.size()));
        boolean z = CLS21.FLD76.MTH830("hasWriteStoragePermission", new Object[0]);
        CLS29 ˎᵢ0 = this.FLD1445;
        if(z) {
            file0 = new File(ˎᵢ0.MTH925("export_chat_path", CLS31.MTH1008().getAbsolutePath()));
            CLS31.MTH1026(file0);
        }
        else {
            file0 = null;
        }
        if(file0 == null || !file0.canWrite()) {
            file1 = new File(CLS31.MTH1038(CLS27.MTH900()), "export_" + Long.toHexString(System.currentTimeMillis()));
            CLS31.MTH996(file1.getAbsolutePath());
            z1 = false;
        }
        else {
            file1 = new File(file0, "export " + this.FLD1447.FLD1434 + " (" + CLS371.FLD3470.MTH5316(this.FLD1447.FLD1434) + ")");
            z1 = true;
        }
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy_MM_dd_HH.mm.ss");
        CLS151 ˊﾞ0 = new CLS151();
        ˊﾞ0.MTH3138(1, ((CLS149)new CLS665(file1, simpleDateFormat0)));
        ˊﾞ0.MTH3138(3, ((CLS149)new CLS632(0, file1)));
        ˊﾞ0.MTH3135(((CLS149)new CLS632(1, file1)), new int[]{43, 62});
        ˊﾞ0.MTH3135(((CLS149)new CLS632(2, file1)), new int[]{49, 0x2D000031, 0x3A000031, 0x41000031, 0x3E000031, 0x55000031, 0x54000031});
        ˊﾞ0.MTH3138(34, ((CLS149)new CLS632(3, file1)));
        ˊﾞ0.FLD1540 = new CLS1225(8);
        ˊﾞ0.FLD1544 = new CLS783(this, z1, file1);
        if(ˎᵢ0.MTH938("export_emoji_as_gif", false) && !CLS182.MTH3470(0x38EDC32A2B3CD335L) && CLS500.FLD4928.MTH6895("export_emoji_gif")) {
            ˊﾞ0.MTH3138(0x2F, ((CLS149)new CLS632(4, file1)));
        }
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        int v = 0;
        while(v < abstractList0.size()) {
            Object object0 = abstractList0.get(v);
            int v1 = CLS166.MTH3181(object0, "field_type");
            String s = (String)CLS166.MTH3194(object0, "field_content");
            String s1 = (String)CLS166.MTH3194(object0, "field_talker");
            int v2 = CLS166.MTH3181(object0, "field_isSend");
            String s2 = (String)CLS166.MTH3194(object0, "field_imgPath");
            String s3 = CLS426.MTH6106(v2, s, s1);
            long v3 = CLS166.MTH3185(object0, "field_msgSvrId");
            long v4 = CLS166.MTH3185(object0, "field_msgId");
            long v5 = CLS166.MTH3185(object0, "field_createTime");
            if(CLS426.MTH6126(s1)) {
                String s4 = CLS426.MTH6109(s);
                s5 = TextUtils.isEmpty(s4) ? CLS372.MTH5407() : s4;
            }
            else {
                s5 = s1;
            }
            Bundle bundle0 = new Bundle();
            bundle0.putInt("type", v1);
            bundle0.putInt("isSend", v2);
            bundle0.putString("content", s);
            bundle0.putString("stripContent", s3);
            bundle0.putString("talker", s1);
            bundle0.putString("imgPath", s2);
            bundle0.putLong("msgSvrId", v3);
            bundle0.putLong("msgId", v4);
            bundle0.putLong("createTime", v5);
            bundle0.putString("username", s5);
            if(hashSet0.contains(v4)) {
                ˊﾞ1 = ˊﾞ0;
            }
            else {
                ˊﾞ1 = ˊﾞ0;
                if(ˊﾞ1.FLD1542.containsKey(v1)) {
                    hashSet0.add(v4);
                    arrayList0.add(bundle0);
                }
            }
            ++v;
            ˊﾞ0 = ˊﾞ1;
        }
        for(int v6 = 0; v6 < arrayList0.size(); ++v6) {
            Bundle bundle1 = (Bundle)arrayList0.get(v6);
            ˊﾞ0.MTH3134(bundle1.getInt("type"), bundle1);
        }
        ˊﾞ0.MTH3137();
    }

    // 此方法包含解密的字符串
    public static void MTH2060(AbstractList abstractList0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < abstractList0.size(); ++v) {
            Object object0 = abstractList0.get(v);
            if(CLS166.MTH3181(object0, "field_type") == 1) {
                String s = (String)CLS166.MTH3194(object0, "field_content");
                String s1 = (String)CLS166.MTH3194(object0, "field_talker");
                stringBuilder0.append(CLS426.MTH6106(CLS166.MTH3181(object0, "field_isSend"), s, s1));
                stringBuilder0.append("/n/n");
            }
        }
        String s2 = stringBuilder0.toString();
        if(TextUtils.isEmpty(s2)) {
            return;
        }
        CLS412.MTH6017(CLS27.MTH900(), s2);
    }

    // 此方法包含解密的字符串
    public final void MTH2061(String s, ArrayList arrayList0) {
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            ArrayList arrayList1 = this.FLD554;
            arrayList1.clear();
            String s1 = null;
            for(Object object0: arrayList0) {
                ContentValues contentValues0 = (ContentValues)object0;
                int v = CLS182.MTH3474(4102148407873557301L, contentValues0);
                if(v != -16) {
                    switch(v) {
                        case 1: {
                            arrayList1.add(new CLS87(1, contentValues0.getAsString("content")));
                            continue;
                        }
                        case -2: 
                        case 2: {
                            arrayList1.add(new CLS87(3, contentValues0.getAsString("img")));
                            continue;
                        }
                        case 3: {
                            String s2 = contentValues0.getAsString("voice");
                            arrayList1.add(new CLS87(34, CLS182.MTH3474(4102149056413618997L, contentValues0), s2));
                            continue;
                        }
                        case 4: {
                            s1 = contentValues0.getAsString("vid");
                            break;
                        }
                        case 49: {
                            arrayList1.add(new CLS87(contentValues0.getAsString("content"), contentValues0.getAsByteArray("imgBuf")));
                            continue;
                        }
                        case 43: 
                        case 62: {
                            arrayList1.add(new CLS87(43, 1, contentValues0.getAsString("imgPath")));
                            continue;
                        }
                        default: {
                            continue;
                        }
                    }
                }
                if(contentValues0.containsKey("path")) {
                    s1 = contentValues0.getAsString("path");
                }
                arrayList1.add(new CLS87(43, 1, s1));
            }
            if(TextUtils.isEmpty(s)) {
                this.MTH2038();
                return;
            }
            this.MTH2053(s);
        }
    }
}

