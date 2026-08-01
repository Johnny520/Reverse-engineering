// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView.FixedViewInfo;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import t.ʻˑ.CLS1;
import t.ʻˑ.CLS3;
import t.ʻˑ.CLS4;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆٴ.CLS67;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS105;
import t.ˑٴ.CLS114;
import t.ٴـ.CLS117;
import t.ᐧⁱ.CLS121;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS139.CLS138;
import t.ⁱʾ.CLS146;

public final class CLS323 implements CLS138 {
    public final int FLD1061;
    public final CLS309 FLD1062;

    public CLS323(CLS309 ʽﹶ0, int v) {
        this.FLD1061 = v;
        this.FLD1062 = ʽﹶ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        String s4;
        Bitmap bitmap2;
        Drawable drawable1;
        Drawable drawable0;
        Object object16;
        Object object4;
        int v = -1;
        Object object0 = null;
        boolean z = true;
        CLS309 ʽﹶ0 = this.FLD1062;
        switch(this.FLD1061) {
            case 0: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ0 = CLS117.FLD842;
                ˆٴ0.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ0 = ˆٴ0.MTH1905();
                    if(יﹳ0 != null) {
                        Object object1 = arr_object[0];
                        try {
                            Field field0 = object1.getClass().getDeclaredField("args");
                            if(field0 != null) {
                                field0.setAccessible(true);
                                object0 = field0.get(object1);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        int v2 = (int)(((Integer)((Object[])object0)[0]));
                        if(יﹳ0.MTH1821()) {
                            CLS121 ˆٴ1 = ʽﹶ0.FLD1012;
                            if(ˆٴ1 != null) {
                                ˆٴ1.MTH1992(3, v2);
                            }
                        }
                        if(יﹳ0.MTH1818("DrawerEnable", false)) {
                            CLS105 ـˏ0 = ʽﹶ0.FLD1018;
                            if(ـˏ0 != null) {
                                ـˏ0.MTH1837(3, v2);
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ2 = CLS117.FLD842;
                ˆٴ2.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ1 = ˆٴ2.MTH1905();
                    if(יﹳ1 != null) {
                        Object object2 = arr_object[0];
                        try {
                            Field field1 = object2.getClass().getDeclaredField("args");
                            if(field1 != null) {
                                field1.setAccessible(true);
                                object0 = field1.get(object2);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        boolean z1 = ((Boolean)((Object[])object0)[0]).booleanValue();
                        if(יﹳ1.MTH1821()) {
                            CLS121 ˆٴ3 = ʽﹶ0.FLD1012;
                            if(ˆٴ3 != null) {
                                ˆٴ3.MTH1992(3, (z1 ? -1 : 0));
                            }
                        }
                        if(יﹳ1.MTH1818("DrawerEnable", false)) {
                            CLS105 ـˏ1 = ʽﹶ0.FLD1018;
                            if(ـˏ1 != null) {
                                if(!z1) {
                                    v = 0;
                                }
                                ـˏ1.MTH1837(3, v);
                            }
                        }
                    }
                }
                return;
            }
            case 2: {
                ʽﹶ0.getClass();
                CLS4 ᵔʾ0 = new CLS4(arr_object[0]);
                ʽﹶ0.FLD1021 = ᵔʾ0.MTH1002();
                CLS117 ˆٴ4 = CLS117.FLD842;
                ˆٴ4.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ2 = ˆٴ4.MTH1905();
                    if(יﹳ2 != null && יﹳ2.MTH1821() && ʽﹶ0.FLD1012 != null) {
                        try {
                            int v3 = (int)(((Integer)ᵔʾ0.MTH1001()[0]));
                            ʽﹶ0.FLD1012.setStartScrollPosition(v3);
                            ʽﹶ0.FLD1012.setIndicatorOffset(((float)(((Float)ᵔʾ0.MTH1001()[1]))));
                            return;
                        }
                        catch(Throwable throwable0) {
                            CLS133.MTH2113(throwable0);
                        }
                    }
                }
                return;
            }
            case 3: {
                ʽﹶ0.getClass();
                Object object3 = arr_object[0];
                try {
                    Field field2 = object3.getClass().getDeclaredField("thisObject");
                    object4 = null;
                    if(field2 != null) {
                        field2.setAccessible(true);
                        object4 = field2.get(object3);
                    }
                }
                catch(Throwable unused_ex) {
                }
                ʽﹶ0.FLD1021 = object4;
                CLS117 ˆٴ5 = CLS117.FLD842;
                ˆٴ5.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ3 = ˆٴ5.MTH1905();
                    if(יﹳ3 != null) {
                        try {
                            Field field3 = object3.getClass().getDeclaredField("args");
                            if(field3 != null) {
                                field3.setAccessible(true);
                                object0 = field3.get(object3);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        try {
                            int v4 = (int)(((Integer)((Object[])object0)[0]));
                            if(יﹳ3.MTH1821()) {
                                CLS121 ˆٴ6 = ʽﹶ0.FLD1012;
                                if(ˆٴ6 != null) {
                                    ˆٴ6.setCurrentTab(v4);
                                }
                            }
                            if(יﹳ3.MTH1818("DrawerEnable", false) && ʽﹶ0.FLD1018 != null) {
                                String s = "";
                                switch(v4) {
                                    case 0: {
                                        s = "tab_main";
                                        break;
                                    }
                                    case 1: {
                                        s = "tab_contacts";
                                        break;
                                    }
                                    case 2: {
                                        s = "tab_discover";
                                        break;
                                    }
                                    case 3: {
                                        s = "tab_me";
                                    }
                                }
                                CLS67 ᵔʾ1 = ʽﹶ0.FLD1018.FLD785;
                                if(ᵔʾ1 != null) {
                                    ᵔʾ1.FLD547 = s;
                                    ᵔʾ1.notifyDataSetChanged();
                                    return;
                                }
                            }
                        }
                        catch(Throwable throwable1) {
                            CLS133.MTH2113(throwable1);
                        }
                    }
                }
                return;
            }
            case 4: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ7 = CLS117.FLD842;
                ˆٴ7.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ4 = ˆٴ7.MTH1905();
                    if(יﹳ4 != null) {
                        Object object5 = arr_object[0];
                        try {
                            Field field4 = object5.getClass().getDeclaredField("args");
                            if(field4 != null) {
                                field4.setAccessible(true);
                                object0 = field4.get(object5);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        int v5 = (int)(((Integer)((Object[])object0)[0]));
                        if(יﹳ4.MTH1821()) {
                            CLS121 ˆٴ8 = ʽﹶ0.FLD1012;
                            if(ˆٴ8 != null) {
                                ˆٴ8.MTH1992(1, v5);
                            }
                        }
                        if(יﹳ4.MTH1818("DrawerEnable", false)) {
                            CLS105 ـˏ2 = ʽﹶ0.FLD1018;
                            if(ـˏ2 != null) {
                                ـˏ2.MTH1837(1, v5);
                            }
                        }
                    }
                }
                return;
            }
            case 5: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ9 = CLS117.FLD842;
                ˆٴ9.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ5 = ˆٴ9.MTH1905();
                    if(יﹳ5 != null) {
                        Object object6 = arr_object[0];
                        try {
                            Field field5 = object6.getClass().getDeclaredField("args");
                            if(field5 != null) {
                                field5.setAccessible(true);
                                object0 = field5.get(object6);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        int v6 = (int)(((Integer)((Object[])object0)[0]));
                        if(יﹳ5.MTH1821()) {
                            CLS121 ˆٴ10 = ʽﹶ0.FLD1012;
                            if(ˆٴ10 != null) {
                                ˆٴ10.MTH1992(2, v6);
                            }
                        }
                        if(יﹳ5.MTH1818("DrawerEnable", false)) {
                            CLS105 ـˏ3 = ʽﹶ0.FLD1018;
                            if(ـˏ3 != null) {
                                ـˏ3.MTH1837(2, v6);
                            }
                        }
                    }
                }
                return;
            }
            case 6: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ11 = CLS117.FLD842;
                ˆٴ11.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ6 = ˆٴ11.MTH1905();
                    if(יﹳ6 != null) {
                        Object object7 = arr_object[0];
                        try {
                            Field field6 = object7.getClass().getDeclaredField("args");
                            if(field6 != null) {
                                field6.setAccessible(true);
                                object0 = field6.get(object7);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        boolean z2 = ((Boolean)((Object[])object0)[0]).booleanValue();
                        if(יﹳ6.MTH1821()) {
                            CLS121 ˆٴ12 = ʽﹶ0.FLD1012;
                            if(ˆٴ12 != null) {
                                ˆٴ12.MTH1992(2, (z2 ? -1 : 0));
                            }
                        }
                        if(יﹳ6.MTH1818("DrawerEnable", false)) {
                            CLS105 ـˏ4 = ʽﹶ0.FLD1018;
                            if(ـˏ4 != null) {
                                if(!z2) {
                                    v = 0;
                                }
                                ـˏ4.MTH1837(2, v);
                            }
                        }
                    }
                }
                return;
            }
            case 7: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ13 = CLS117.FLD842;
                ˆٴ13.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ7 = ˆٴ13.MTH1905();
                    if(יﹳ7 != null) {
                        Object object8 = arr_object[0];
                        try {
                            Field field7 = object8.getClass().getDeclaredField("args");
                            if(field7 != null) {
                                field7.setAccessible(true);
                                object0 = field7.get(object8);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        Object object9 = ((Object[])object0)[0];
                        CLS309.MTH2229(CLS3.MTH989(object9, CLS133.MTH2100("HomeUIActionBarField", "mActionBar")), object9, יﹳ7);
                    }
                }
                return;
            }
            case 8: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ14 = CLS117.FLD842;
                ˆٴ14.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ8 = ˆٴ14.MTH1905();
                    if(יﹳ8 != null) {
                        Object object10 = arr_object[0];
                        if(CLS133.MTH2110("HomeUIOnPageScrolled_field1")) {
                            try {
                                Field field8 = object10.getClass().getDeclaredField("thisObject");
                                if(field8 != null) {
                                    field8.setAccessible(true);
                                    object0 = field8.get(object10);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            object0 = CLS15.MTH1072(0xFFFF4F2B2B3CF2B7L, CLS15.MTH1072(0xFFFF4F472B3CF2B7L, CLS1.MTH980(object0, CLS133.MTH2115("MainTabUI"))));
                        }
                        if(object0 != null) {
                            CLS309.MTH2229(CLS3.MTH989(object0, CLS133.MTH2100("HomeUIActionBarField", "mActionBar")), object0, יﹳ8);
                        }
                    }
                }
                return;
            }
            case 9: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ15 = CLS117.FLD842;
                ˆٴ15.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ9 = ˆٴ15.MTH1905();
                    if(יﹳ9 != null && ʽﹶ0.MTH2237() != 0 && !יﹳ9.MTH1818("HideActionBar", false) && יﹳ9.MTH1821()) {
                        CLS4 ᵔʾ2 = new CLS4(arr_object[0]);
                        int v7 = (int)(((Integer)ᵔʾ2.MTH1003()));
                        if(v7 != -1) {
                            ᵔʾ2.MTH1004(((int)(CLS43.MTH1439(0x30) + v7)));
                        }
                    }
                }
                return;
            }
            case 10: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ16 = CLS117.FLD842;
                ˆٴ16.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ10 = ˆٴ16.MTH1905();
                    if(יﹳ10 != null) {
                        Object object11 = arr_object[0];
                        try {
                            Field field9 = object11.getClass().getDeclaredField("thisObject");
                            Object object12 = null;
                            if(field9 != null) {
                                field9.setAccessible(true);
                                object12 = field9.get(object11);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        if(object12 == ʽﹶ0.FLD1027 && יﹳ10.MTH1818("HideActionBar", false)) {
                            try {
                                Field field10 = object11.getClass().getDeclaredField("args");
                                if(field10 != null) {
                                    field10.setAccessible(true);
                                    object0 = field10.get(object11);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            ((Object[])object0)[1] = 0;
                        }
                    }
                }
                return;
            }
            case 11: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ17 = CLS117.FLD842;
                ˆٴ17.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ11 = ˆٴ17.MTH1905();
                    if(יﹳ11 != null) {
                        if(יﹳ11.MTH1811()) {
                            ʽﹶ0.MTH2227(4);
                        }
                        if(יﹳ11.MTH1821()) {
                            ʽﹶ0.FLD1012.setVisibility(4);
                        }
                        View view0 = ʽﹶ0.FLD1008;
                        if(view0 != null) {
                            view0.setVisibility(4);
                        }
                    }
                }
                return;
            }
            case 12: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ18 = CLS117.FLD842;
                ˆٴ18.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ12 = ˆٴ18.MTH1905();
                    if(יﹳ12 != null) {
                        if(יﹳ12.MTH1811()) {
                            ʽﹶ0.MTH2227(0);
                        }
                        if(יﹳ12.MTH1821()) {
                            ʽﹶ0.FLD1012.setVisibility(0);
                        }
                        View view1 = ʽﹶ0.FLD1008;
                        if(view1 != null) {
                            view1.setVisibility(0);
                        }
                    }
                }
                return;
            }
            case 13: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ19 = CLS117.FLD842;
                ˆٴ19.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ13 = ˆٴ19.MTH1905();
                    if(יﹳ13 != null && !יﹳ13.MTH1819()) {
                        Object object13 = arr_object[0];
                        try {
                            Field field11 = object13.getClass().getDeclaredField("thisObject");
                            if(field11 != null) {
                                field11.setAccessible(true);
                                object0 = field11.get(object13);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        ListView listView0 = (ListView)CLS3.MTH989(object0, "appbrandMessageLV");
                        if(listView0 != null) {
                            boolean z3 = יﹳ13.MTH1818("MainFragmentBackgroundColorEnable", false) && !יﹳ13.MTH1819();
                            if(!יﹳ13.MTH1818("MainFragmentBackgroundEnable", false) || יﹳ13.MTH1819()) {
                                z = false;
                            }
                            if(z3 || z) {
                                listView0.setSelector(ʽﹶ0.MTH2232());
                                if(z) {
                                    Context context0 = CLS133.MTH2108();
                                    יﹳ13.MTH1816(CLS309.MTH2226(listView0), CLS309.MTH2242(listView0), context0, ((CLS146)new CLS319(listView0, 0)), "MainFragmentBackground");
                                }
                                else {
                                    String s1 = יﹳ13.MTH1804("MainFragmentBackgroundColor", "000000");
                                    if(!TextUtils.isEmpty(s1)) {
                                        CLS43.MTH1437(listView0, new ColorDrawable(CLS46.MTH1447(s1)));
                                    }
                                }
                                if(listView0.getFooterViewsCount() > 0) {
                                    for(Object object14: ((ArrayList)CLS3.MTH989(listView0, "mFooterViewInfos"))) {
                                        View view2 = ((ListView.FixedViewInfo)object14).view;
                                        if(view2 != null) {
                                            if(view2 instanceof ViewGroup) {
                                                ViewGroup viewGroup0 = (ViewGroup)view2;
                                                for(int v8 = 0; v8 < viewGroup0.getChildCount(); ++v8) {
                                                    CLS43.MTH1437(viewGroup0.getChildAt(v8), ʽﹶ0.MTH2232());
                                                }
                                            }
                                            CLS43.MTH1437(view2, ʽﹶ0.MTH2232());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 14: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ20 = CLS117.FLD842;
                ˆٴ20.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ14 = ˆٴ20.MTH1905();
                    if(יﹳ14 != null && !יﹳ14.MTH1819()) {
                        CLS4 ᵔʾ3 = new CLS4(arr_object[0]);
                        Context context1 = (Context)CLS3.MTH989(ᵔʾ3.MTH1002(), CLS133.MTH2100("ConvBoxClass3_context", "context"));
                        if(context1 == null || ((Activity)context1).getClass().getName().endsWith("ConvBoxServiceConversationUI")) {
                            int v9 = (int)(((Integer)ᵔʾ3.MTH1001()[0]));
                            ʽﹶ0.MTH2230(יﹳ14, ((View)ᵔʾ3.MTH1003()), ((String)CLS3.MTH989(CLS3.MTH991(ᵔʾ3.MTH1002(), "getItem", new Object[]{v9}), "field_username")), CLS133.MTH2100("convbox_ContenViewField", CLS133.MTH2115("convContenViewField")), CLS133.MTH2100("convbox_NameViewField", CLS133.MTH2115("convNameViewField")), CLS133.MTH2100("convbox_TimeViewField", CLS133.MTH2115("convTimeViewField")));
                        }
                    }
                }
                return;
            }
            case 15: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ21 = CLS117.FLD842;
                ˆٴ21.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ15 = ˆٴ21.MTH1905();
                    if(יﹳ15 != null && !יﹳ15.MTH1819() && (יﹳ15.MTH1818("ChangeChatTextColor", false) || יﹳ15.MTH1818("ChangeChatBubble", false))) {
                        Object object15 = arr_object[0];
                        try {
                            Field field12 = object15.getClass().getDeclaredField("args");
                            object16 = null;
                            if(field12 != null) {
                                field12.setAccessible(true);
                                object16 = field12.get(object15);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        boolean z4 = ((Boolean)((Object[])object16)[1]).booleanValue();
                        try {
                            Field field13 = object15.getClass().getDeclaredField("thisObject");
                            if(field13 != null) {
                                field13.setAccessible(true);
                                object0 = field13.get(object15);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        ʽﹶ0.MTH2228(יﹳ15, object0, z4);
                    }
                }
                return;
            }
            case 16: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ22 = CLS117.FLD842;
                ˆٴ22.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ16 = ˆٴ22.MTH1905();
                    if(יﹳ16 != null && !יﹳ16.MTH1819() && (יﹳ16.MTH1818("ChangeChatTextColor", false) || יﹳ16.MTH1818("ChangeChatBubble", false))) {
                        Object object17 = arr_object[0];
                        try {
                            Method method0 = object17.getClass().getDeclaredMethod("getResult");
                            method0.setAccessible(true);
                            object0 = method0.invoke(object17);
                        }
                        catch(Throwable unused_ex) {
                        }
                        Object object18 = ((View)object0).getTag();
                        if(object18 != null) {
                            ʽﹶ0.MTH2228(יﹳ16, object18, true);
                        }
                    }
                }
                return;
            }
            case 17: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ23 = CLS117.FLD842;
                ˆٴ23.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ17 = ˆٴ23.MTH1905();
                    if(יﹳ17 != null && !יﹳ17.MTH1819() && (יﹳ17.MTH1818("ChangeChatTextColor", false) || יﹳ17.MTH1818("ChangeChatBubble", false))) {
                        Object object19 = arr_object[0];
                        try {
                            Method method1 = object19.getClass().getDeclaredMethod("getResult");
                            method1.setAccessible(true);
                            object0 = method1.invoke(object19);
                        }
                        catch(Throwable unused_ex) {
                        }
                        Object object20 = ((View)object0).getTag();
                        if(object20 != null) {
                            ʽﹶ0.MTH2228(יﹳ17, object20, false);
                        }
                    }
                }
                return;
            }
            case 18: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ24 = CLS117.FLD842;
                ˆٴ24.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ18 = ˆٴ24.MTH1905();
                    if(יﹳ18 != null && !יﹳ18.MTH1819() && יﹳ18.MTH1818("ChangeChatBubble", false)) {
                        CLS4 ᵔʾ4 = new CLS4(arr_object[0]);
                        if(ᵔʾ4.MTH1002().getClass().getName().endsWith("AnimImageView")) {
                            View view3 = (View)ᵔʾ4.MTH1002();
                            Object object21 = view3.getTag(view3.getId());
                            if(object21 != null) {
                                boolean z5 = ((Boolean)object21).booleanValue();
                                if(יﹳ18.MTH1818("ChangeChatBubble", false)) {
                                    if(z5) {
                                        Bitmap bitmap0 = יﹳ18.MTH1800("left_bubble.9.png");
                                        String s2 = יﹳ18.MTH1818("LeftChatBubbleColorEnable", false) ? יﹳ18.MTH1804("LeftChatBubbleColor", "") : "";
                                        Object[] arr_object1 = ᵔʾ4.MTH1001();
                                        StateListDrawable stateListDrawable0 = ʽﹶ0.FLD1029;
                                        if(stateListDrawable0 == null) {
                                            drawable0 = ʽﹶ0.MTH2224(bitmap0, s2);
                                            ʽﹶ0.FLD1029 = drawable0;
                                        }
                                        else {
                                            Drawable.ConstantState drawable$ConstantState0 = stateListDrawable0.getConstantState();
                                            if(drawable$ConstantState0 == null) {
                                                drawable0 = ʽﹶ0.MTH2224(bitmap0, s2);
                                                ʽﹶ0.FLD1029 = drawable0;
                                            }
                                            else {
                                                drawable0 = drawable$ConstantState0.newDrawable().mutate();
                                            }
                                        }
                                        arr_object1[0] = drawable0;
                                        return;
                                    }
                                    Bitmap bitmap1 = יﹳ18.MTH1800("right_bubble.9.png");
                                    String s3 = יﹳ18.MTH1818("RightChatBubbleColorEnable", false) ? יﹳ18.MTH1804("RightChatBubbleColor", "") : "";
                                    Object[] arr_object2 = ᵔʾ4.MTH1001();
                                    StateListDrawable stateListDrawable1 = ʽﹶ0.FLD1003;
                                    if(stateListDrawable1 == null) {
                                        drawable1 = ʽﹶ0.MTH2224(bitmap1, s3);
                                        ʽﹶ0.FLD1003 = drawable1;
                                    }
                                    else {
                                        Drawable.ConstantState drawable$ConstantState1 = stateListDrawable1.getConstantState();
                                        if(drawable$ConstantState1 == null) {
                                            drawable1 = ʽﹶ0.MTH2224(bitmap1, s3);
                                            ʽﹶ0.FLD1003 = drawable1;
                                        }
                                        else {
                                            drawable1 = drawable$ConstantState1.newDrawable().mutate();
                                        }
                                    }
                                    arr_object2[0] = drawable1;
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 19: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ25 = CLS117.FLD842;
                ˆٴ25.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ19 = ˆٴ25.MTH1905();
                    if(יﹳ19 != null && !יﹳ19.MTH1819() && יﹳ19.MTH1818("ChangeChatBubble", false)) {
                        CLS4 ᵔʾ5 = new CLS4(arr_object[0]);
                        TextView textView0 = (TextView)CLS15.MTH1072(0xFFFF577A2B3CF2B7L, ᵔʾ5.MTH1002());
                        if(textView0 != null) {
                            boolean z6 = ((Boolean)ᵔʾ5.MTH1001()[1]).booleanValue();
                            if(יﹳ19.MTH1818("ChangeChatBubble", false)) {
                                if(z6) {
                                    bitmap2 = יﹳ19.MTH1800("left_bubble.9.png");
                                    s4 = יﹳ19.MTH1818("LeftChatBubbleColorEnable", false) ? יﹳ19.MTH1804("LeftChatBubbleColor", CLS114.MTH1900(0xFFFF57112B3CF2B7L)) : CLS114.MTH1900(0xFFFF57102B3CF2B7L);
                                }
                                else {
                                    bitmap2 = יﹳ19.MTH1800("right_bubble.9.png");
                                    s4 = יﹳ19.MTH1818("RightChatBubbleColorEnable", false) ? יﹳ19.MTH1804("RightChatBubbleColor", CLS114.MTH1900(-186040077978953L)) : CLS114.MTH1900(0xFFFF56CB2B3CF2B7L);
                                }
                                if(bitmap2 != null) {
                                    StateListDrawable stateListDrawable2 = ʽﹶ0.MTH2224(bitmap2, s4);
                                    if(stateListDrawable2 != null) {
                                        CLS43.MTH1437(textView0, stateListDrawable2);
                                        Object object22 = ᵔʾ5.MTH1002();
                                        String s5 = "AnimImageView";
                                        ArrayList arrayList0 = new ArrayList();
                                        if(object22 != null) {
                                            try {
                                                if("AnimImageView" instanceof Class) {
                                                    s5 = ((Class)"AnimImageView").getName();
                                                }
                                                if(!TextUtils.isEmpty(s5)) {
                                                    Field[] arr_field = object22.getClass().getDeclaredFields();
                                                label_439:
                                                    for(int v1 = 0; v1 < arr_field.length; ++v1) {
                                                        Field field14 = arr_field[v1];
                                                        field14.setAccessible(true);
                                                        if(field14.getType().getName().contains(s5)) {
                                                            Object object23 = field14.get(object22);
                                                            if(object23 != null) {
                                                                arrayList0.add(object23);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            catch(Exception exception0) {
                                                CLS133.MTH2113(exception0);
                                                if(true) {
                                                    goto label_451;
                                                }
                                                goto label_439;
                                            }
                                        }
                                    label_451:
                                        for(Object object24: arrayList0) {
                                            ((View)object24).setTag(((View)object24).getId(), Boolean.valueOf(z6));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 20: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ26 = CLS117.FLD842;
                ˆٴ26.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ20 = ˆٴ26.MTH1905();
                    if(יﹳ20 != null && !יﹳ20.MTH1819() && (יﹳ20.MTH1818("RightChatUserTVTextColorEnable", false) || יﹳ20.MTH1818("RightChatUserTVBackgroundColorEnable", false) || יﹳ20.MTH1818("LeftChatUserTVTextColorEnable", false) || יﹳ20.MTH1818("LeftChatUserTVBackgroundColorEnable", false))) {
                        CLS4 ᵔʾ6 = new CLS4(arr_object[0]);
                        int v10 = (int)(((Integer)ᵔʾ6.MTH1001()[2]));
                        View view4 = (View)CLS15.MTH1072(0xFFFF581C2B3CF2B7L, ᵔʾ6.MTH1001()[0]);
                        if(view4 != null) {
                            Object object25 = view4.getTag();
                            Object object26 = CLS3.MTH991(CLS15.MTH1072(0xFFFF57FF2B3CF2B7L, ᵔʾ6.MTH1002()), CLS133.MTH2100("ChattingDataAdapterV3_getItem", "getItem"), new Object[]{v10});
                            TextView textView1 = (TextView)CLS3.MTH989(object25, CLS133.MTH2100("ChattingDataAdapterV3_userTV", "userTV"));
                            if(textView1 != null && textView1.getVisibility() == 0) {
                                CLS309.MTH2241(יﹳ20, textView1, CLS3.MTH998(object26, "field_isSend"));
                            }
                        }
                    }
                }
                return;
            }
            case 21: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ27 = CLS117.FLD842;
                ˆٴ27.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ21 = ˆٴ27.MTH1905();
                    if(יﹳ21 != null && !יﹳ21.MTH1819() && (יﹳ21.MTH1818("RightChatUserTVTextColorEnable", false) || יﹳ21.MTH1818("RightChatUserTVBackgroundColorEnable", false) || יﹳ21.MTH1818("LeftChatUserTVTextColorEnable", false) || יﹳ21.MTH1818("LeftChatUserTVBackgroundColorEnable", false))) {
                        CLS4 ᵔʾ7 = new CLS4(arr_object[0]);
                        int v11 = (int)(((Integer)ᵔʾ7.MTH1001()[1]));
                        View view5 = (View)CLS15.MTH1072(0xFFFF59162B3CF2B7L, ᵔʾ7.MTH1001()[0]);
                        if(view5 != null) {
                            Object object27 = view5.getTag();
                            Object object28 = CLS3.MTH991(ᵔʾ7.MTH1002(), CLS133.MTH2100("ChattingDataAdapterV2_getItem", "getItem"), new Object[]{v11});
                            TextView textView2 = (TextView)CLS3.MTH989(object27, CLS133.MTH2100("ChattingDataAdapterV2_userTV", "userTV"));
                            if(textView2 != null && textView2.getVisibility() == 0) {
                                CLS309.MTH2241(יﹳ21, textView2, CLS3.MTH998(object28, "field_isSend"));
                            }
                        }
                    }
                }
                return;
            }
            case 22: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ28 = CLS117.FLD842;
                ˆٴ28.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ22 = ˆٴ28.MTH1905();
                    if(יﹳ22 != null && !יﹳ22.MTH1819() && (יﹳ22.MTH1818("RightChatUserTVTextColorEnable", false) || יﹳ22.MTH1818("RightChatUserTVBackgroundColorEnable", false) || יﹳ22.MTH1818("LeftChatUserTVTextColorEnable", false) || יﹳ22.MTH1818("LeftChatUserTVBackgroundColorEnable", false))) {
                        CLS4 ᵔʾ8 = new CLS4(arr_object[0]);
                        int v12 = (int)(((Integer)ᵔʾ8.MTH1001()[0]));
                        View view6 = (View)ᵔʾ8.MTH1001()[1];
                        Object object29 = CLS3.MTH991(ᵔʾ8.MTH1002(), CLS133.MTH2100("ChattingDataAdapter_getItem", "getItem"), new Object[]{v12});
                        if(view6 == null) {
                            Class class0 = CLS133.MTH2111("ChattingItemFactoryClass");
                            Object object30 = CLS15.MTH1072(0xFFFF5A332B3CF2B7L, ᵔʾ8.MTH1002());
                            view6 = (View)CLS3.MTH991(CLS3.MTH996(class0, CLS133.MTH2115("ChattingItemFactoryClass_method1"), new Object[]{object29}), CLS133.MTH2115("avatarClass3_inflateViewMethod"), new Object[]{object30, null});
                        }
                        if(view6 != null) {
                            TextView textView3 = (TextView)CLS3.MTH989(view6.getTag(), CLS133.MTH2100("ChattingDataAdapter_userTV", "userTV"));
                            if(textView3 != null && textView3.getVisibility() == 0) {
                                CLS309.MTH2241(יﹳ22, textView3, CLS3.MTH998(object29, "field_isSend"));
                            }
                        }
                    }
                }
                return;
            }
            case 23: {
                this.MTH2284(arr_object);
                return;
            }
            default: {
                this.MTH2283(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2283(Object[] arr_object) {
        Object object2;
        CLS309 ʽﹶ0 = this.FLD1062;
        ʽﹶ0.getClass();
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                Object object0 = arr_object[0];
                Object object1 = null;
                try {
                    Field field0 = object0.getClass().getDeclaredField("args");
                    object2 = null;
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object2 = field0.get(object0);
                    }
                }
                catch(Throwable unused_ex) {
                }
                boolean z = ((Boolean)((Object[])object2)[0]).booleanValue();
                int v = ʽﹶ0.FLD1025;
                if(z) {
                    if(v == 1) {
                        return;
                    }
                    try {
                        Field field1 = object0.getClass().getDeclaredField("thisObject");
                        goto label_23;
                    label_21:
                        if(v != 0) {
                            field1 = object0.getClass().getDeclaredField("thisObject");
                        label_23:
                            if(field1 != null) {
                                field1.setAccessible(true);
                                object1 = field1.get(object0);
                            }
                            goto label_26;
                        }
                    }
                    catch(Throwable unused_ex) {
                        goto label_26;
                    }
                }
                else {
                    goto label_21;
                label_26:
                    ImageButton imageButton0 = (ImageButton)CLS15.MTH1072(0xFFFF72322B3CF2B7L, object1);
                    if(imageButton0 != null) {
                        ʽﹶ0.FLD1025 = z;
                        Bitmap bitmap0 = יﹳ0.MTH1814(CLS114.MTH1900((z ? 0xFFFF72252B3CF2B7L : 0xFFFF720D2B3CF2B7L)), true);
                        if(bitmap0 != null) {
                            imageButton0.setImageBitmap(bitmap0);
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2284(Object[] arr_object) {
        Object object1;
        CLS309 ʽﹶ0 = this.FLD1062;
        ʽﹶ0.getClass();
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && יﹳ0.MTH1818("UseRoundAvatar", false) && (!ʽﹶ0.FLD1000 || !CLS133.MTH2110("VoipMgrOnFinishMethod"))) {
                Object object0 = arr_object[0];
                try {
                    Field field0 = object0.getClass().getDeclaredField("thisObject");
                    object1 = null;
                    if(field0 != null) {
                        field0.setAccessible(true);
                        object1 = field0.get(object0);
                    }
                }
                catch(Throwable unused_ex) {
                }
                ((ImageView)object1).setBackgroundColor(0);
            }
        }
    }
}

