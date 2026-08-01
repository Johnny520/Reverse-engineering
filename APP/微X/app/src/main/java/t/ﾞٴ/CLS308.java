// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView.FixedViewInfo;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import t.ʻˑ.CLS1;
import t.ʻˑ.CLS3;
import t.ʻˑ.CLS4;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆʿ.CLS61;
import t.ˆٴ.CLS67;
import t.ˈˊ.CLS88.CLS87;
import t.ˈˊ.CLS88;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS105;
import t.ˊﾞ.CLS294;
import t.ˑٴ.CLS114;
import t.ـˏ.CLS116;
import t.ٴـ.CLS117;
import t.ᐧⁱ.CLS121;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS139.CLS138;
import t.ᵔʾ.CLS297;
import t.ᵔʾ.CLS303;
import t.ⁱʾ.CLS146;
import t.ﾞᐧ.CLS343;

public final class CLS308 implements CLS138 {
    public final int FLD998;
    public final CLS309 FLD999;

    public CLS308(CLS309 ʽﹶ0, int v) {
        this.FLD998 = v;
        this.FLD999 = ʽﹶ0;
        super();
    }

    // 此方法包含解密的字符串
    private final void MTH2210(Object[] arr_object) {
        CharSequence charSequence0;
        CLS309 ʽﹶ0 = this.FLD999;
        ʽﹶ0.getClass();
        CLS4 ᵔʾ0 = new CLS4(arr_object[0]);
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 == null || !יﹳ0.MTH1819()) {
                goto label_8;
            }
        }
        else {
            try {
            label_8:
                charSequence0 = null;
                if(!TextUtils.isEmpty(CLS133.MTH2115("ChattingComponentManagerField1"))) {
                    charSequence0 = (String)CLS3.MTH991(CLS3.MTH989(ᵔʾ0.MTH1002(), CLS133.MTH2115((CLS133.MTH2110("ChattingComponentManagerField1_b") ? "ChattingComponentManagerField1_b" : "ChattingComponentManagerField1"))), CLS133.MTH2115("getTalkerUsernameMethod"), new Object[0]);
                }
                if(TextUtils.isEmpty(charSequence0) && !TextUtils.isEmpty(CLS133.MTH2115("ChattingBgIdField1"))) {
                    charSequence0 = (String)CLS3.MTH991(CLS3.MTH989(ᵔʾ0.MTH1002(), CLS133.MTH2115("ChattingBgIdField1")), CLS133.MTH2115("getTalkerUsernameMethod"), new Object[0]);
                }
                if(TextUtils.isEmpty(charSequence0) && !TextUtils.isEmpty(CLS133.MTH2115("ChattingBgId_b"))) {
                    charSequence0 = (String)CLS3.MTH991(ᵔʾ0.MTH1002(), CLS133.MTH2115("getTalkerUsernameMethod"), new Object[0]);
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
            if(!TextUtils.isEmpty(charSequence0)) {
                CLS303 ﾞˎ0 = new CLS303(ʽﹶ0, charSequence0, ᵔʾ0, 3);
                CLS137.FLD972.MTH2141(((CLS136)ﾞˎ0));
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2211(Object[] arr_object) {
        Object object1;
        CLS309 ʽﹶ0 = this.FLD999;
        ʽﹶ0.getClass();
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                boolean z = יﹳ0.MTH1818("ContactFragmentBackgroundEnable", false);
                boolean z1 = יﹳ0.MTH1818("FragmentItemViewTitleColorEnable", false);
                boolean z2 = יﹳ0.MTH1818("ContactFragmentBackgroundColorEnable", false);
                if(z || z1 || z2) {
                    Object object0 = arr_object[0];
                    try {
                        Method method0 = object0.getClass().getDeclaredMethod("getResult");
                        method0.setAccessible(true);
                        object1 = null;
                        object1 = method0.invoke(object0);
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(z1) {
                        TextView textView0 = (TextView)((ViewGroup)object1).getChildAt(0);
                        String s = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                        if(!TextUtils.isEmpty(s)) {
                            textView0.setTextColor(CLS46.MTH1447(s));
                        }
                    }
                    ViewGroup viewGroup0 = (ViewGroup)((ViewGroup)object1).getChildAt(1);
                    if(viewGroup0 != null) {
                        if(z || z2) {
                            CLS43.MTH1437(viewGroup0, ʽﹶ0.MTH2225(יﹳ0));
                        }
                        View view0 = viewGroup0.getChildAt(0);
                        if(view0 != null) {
                            if(z) {
                                CLS43.MTH1437(view0, ʽﹶ0.MTH2232());
                            }
                            if(z1) {
                                String s1 = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                                if(!TextUtils.isEmpty(s1) && view0 instanceof ViewGroup && ((ViewGroup)view0).getChildCount() >= 4) {
                                    View view1 = ((ViewGroup)view0).getChildAt(3);
                                    if(view1 != null && view1.getClass().getName().endsWith("AddressView")) {
                                        CLS3.MTH991(view1, "setNickNameTextColor", new Object[]{ColorStateList.valueOf(CLS46.MTH1447(s1))});
                                    }
                                }
                            }
                        }
                    }
                    if(z || z2) {
                        CLS43.MTH1437(((ViewGroup)object1), ʽﹶ0.MTH2232());
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2212(Object[] arr_object) {
        Object object1;
        CLS309 ʽﹶ0 = this.FLD999;
        ʽﹶ0.getClass();
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                boolean z = יﹳ0.MTH1818("ContactFragmentBackgroundEnable", false);
                boolean z1 = יﹳ0.MTH1818("FragmentItemViewTitleColorEnable", false);
                boolean z2 = יﹳ0.MTH1818("ContactFragmentBackgroundColorEnable", false);
                if(z || z1 || z2) {
                    Object object0 = arr_object[0];
                    try {
                        Method method0 = object0.getClass().getDeclaredMethod("getResult");
                        method0.setAccessible(true);
                        object1 = null;
                        object1 = method0.invoke(object0);
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(z1) {
                        TextView textView0 = (TextView)((ViewGroup)((ViewGroup)object1).getChildAt(0)).getChildAt(0);
                        String s = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                        if(!TextUtils.isEmpty(s)) {
                            textView0.setTextColor(CLS46.MTH1447(s));
                        }
                    }
                    ViewGroup viewGroup0 = (ViewGroup)((ViewGroup)object1).getChildAt(1);
                    ViewGroup viewGroup1 = (ViewGroup)viewGroup0.getChildAt(0);
                    if(viewGroup1 != null) {
                        if(z || z2) {
                            CLS43.MTH1437(viewGroup0, ʽﹶ0.MTH2225(יﹳ0));
                        }
                        View view0 = viewGroup1.getChildAt(3);
                        if(view0 != null) {
                            if(z) {
                                CLS43.MTH1437(view0, ʽﹶ0.MTH2232());
                            }
                            if(z1) {
                                String s1 = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                                if(!TextUtils.isEmpty(s1) && view0 instanceof ViewGroup) {
                                    View view1 = ((ViewGroup)view0).getChildAt(1);
                                    if(view1 != null && view1.getClass().getName().endsWith("AddressView")) {
                                        CLS3.MTH991(view1, "setNickNameTextColor", new Object[]{ColorStateList.valueOf(CLS46.MTH1447(s1))});
                                    }
                                }
                            }
                        }
                    }
                    if(z || z2) {
                        CLS43.MTH1437(((ViewGroup)object1), ʽﹶ0.MTH2232());
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // t.ᵔʾ.CLS139$CLS138
    public final void MTH2153(Object[] arr_object) {
        ColorDrawable colorDrawable1;
        int v16;
        Object object14;
        Object object12;
        int v9;
        int v8;
        long v;
        Object object2;
        ColorDrawable colorDrawable0 = null;
        CLS309 ʽﹶ0 = this.FLD999;
        switch(this.FLD998) {
            case 0: {
                ʽﹶ0.getClass();
                Object object0 = arr_object[0];
                if(!(object0 instanceof Activity)) {
                    try {
                        Field field0 = object0.getClass().getDeclaredField("thisObject");
                        if(field0 == null) {
                            object0 = null;
                        }
                        else {
                            field0.setAccessible(true);
                            object0 = field0.get(object0);
                        }
                    }
                    catch(Throwable unused_ex) {
                        object0 = null;
                    }
                }
                CLS117 ˆٴ0 = CLS117.FLD842;
                ˆٴ0.getClass();
                if(CLS117.MTH1906()) {
                    ʽﹶ0.MTH2235();
                    if(CLS3.MTH999(object0, "wx_init") == null) {
                        CLS102 יﹳ0 = ˆٴ0.MTH1905();
                        if(יﹳ0 != null) {
                            יﹳ0.MTH1806();
                        }
                        Object object1 = CLS1.MTH980(object0, "HomeUI");
                        ʽﹶ0.FLD1005 = object1;
                        if(object1 != null) {
                            if(CLS15.MTH1077(0xFFFF8B2A2B3CF2B7L)) {
                                object2 = ʽﹶ0.FLD1005;
                                v = 0xFFFF8B1B2B3CF2B7L;
                                goto label_32;
                            }
                            else {
                                object2 = CLS15.MTH1072(0xFFFF8B0B2B3CF2B7L, ʽﹶ0.FLD1005);
                                if(object2 != null) {
                                    v = 0xFFFF8AFC2B3CF2B7L;
                                label_32:
                                    ViewGroup viewGroup0 = (ViewGroup)CLS1.MTH980(object2, CLS114.MTH1900(v));
                                    ʽﹶ0.FLD1007 = viewGroup0;
                                    if(viewGroup0 != null) {
                                        CLS3.MTH992(object0, "wx_init", Boolean.TRUE);
                                        ʽﹶ0.FLD1010 = CLS46.MTH1451(CLS46.MTH1454(-1));
                                        ʽﹶ0.FLD1028 = CLS46.MTH1451(CLS46.MTH1454(CLS46.MTH1447("#F7F3F7")));
                                        ViewGroup viewGroup1 = (ViewGroup)ʽﹶ0.FLD1007.getParent();
                                        ʽﹶ0.FLD1001 = viewGroup1;
                                        ʽﹶ0.FLD1027 = (ViewGroup)viewGroup1.getParent();
                                        for(int v1 = 0; v1 < ʽﹶ0.FLD1001.getChildCount(); ++v1) {
                                            View view0 = ʽﹶ0.FLD1001.getChildAt(v1);
                                            if(view0.toString().contains("LauncherUIBottomTabView")) {
                                                ʽﹶ0.FLD1006 = (ViewGroup)view0;
                                                break;
                                            }
                                        }
                                        ʽﹶ0.FLD1023 = CLS3.MTH989(ʽﹶ0.FLD1005, CLS133.MTH2100("HomeUIActionBarField", "mActionBar"));
                                        if(ʽﹶ0.FLD1001 != null && ʽﹶ0.FLD1006 != null) {
                                            try {
                                                CLS117 ˆٴ1 = CLS117.FLD842;
                                                ˆٴ1.getClass();
                                                if(CLS117.MTH1906()) {
                                                    CLS102 יﹳ1 = ˆٴ1.MTH1905();
                                                    if(יﹳ1 != null) {
                                                        if(יﹳ1.MTH1818("HideBottomTab", false) || יﹳ1.MTH1821()) {
                                                            ʽﹶ0.FLD1006.setVisibility(8);
                                                            ʽﹶ0.FLD1006.getLayoutParams().height = 0;
                                                        }
                                                        else {
                                                            if(TextUtils.isEmpty(CLS133.MTH2115("NoMoveUpBottomTab")) && יﹳ1.MTH1818("MoveUpBottomTab", false)) {
                                                                ʽﹶ0.FLD1001.removeView(ʽﹶ0.FLD1006);
                                                                ʽﹶ0.FLD1001.addView(ʽﹶ0.FLD1006, 0);
                                                            }
                                                            boolean z = יﹳ1.MTH1818("ChangeBottomTabColor", false) && !יﹳ1.MTH1819();
                                                            boolean z1 = יﹳ1.MTH1818("HideBottomTabLabel", false);
                                                            if(z || z1) {
                                                                String s = יﹳ1.MTH1804("BottomTabColor", "");
                                                                if(TextUtils.isEmpty(s)) {
                                                                    z = false;
                                                                }
                                                                else {
                                                                    colorDrawable0 = new ColorDrawable(CLS46.MTH1447(s));
                                                                }
                                                                ViewGroup viewGroup2 = (ViewGroup)CLS1.MTH981(0, ʽﹶ0.FLD1006);
                                                                if(viewGroup2 != null) {
                                                                    for(int v2 = 0; v2 < viewGroup2.getChildCount(); ++v2) {
                                                                        View view1 = viewGroup2.getChildAt(v2);
                                                                        if(z) {
                                                                            CLS43.MTH1437(view1, colorDrawable0);
                                                                        }
                                                                        View view2 = CLS1.MTH983(view1, new int[]{0, 1});
                                                                        if(z1) {
                                                                            view2.setVisibility(8);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            catch(Throwable throwable0) {
                                                CLS133.MTH2113(throwable0);
                                            }
                                        }
                                        ʽﹶ0.MTH2235();
                                        try {
                                            CLS117 ˆٴ2 = CLS117.FLD842;
                                            ˆٴ2.getClass();
                                            if(CLS117.MTH1906()) {
                                                boolean z2 = false;
                                                CLS102 יﹳ2 = ˆٴ2.MTH1905();
                                                if(יﹳ2 != null && יﹳ2.MTH1821()) {
                                                    if(ʽﹶ0.FLD1027 != null && ʽﹶ0.FLD1012 != null) {
                                                        for(int v3 = 0; v3 < ʽﹶ0.FLD1027.getChildCount(); ++v3) {
                                                            if(ʽﹶ0.FLD1027.getChildAt(v3) == ʽﹶ0.FLD1012) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    if(!z2) {
                                                        CLS121 ˆٴ3 = new CLS121(CLS133.MTH2108());
                                                        ʽﹶ0.FLD1012 = ˆٴ3;
                                                        ˆٴ3.setBackgroundColor(CLS46.MTH1447(יﹳ2.MTH1804("TabLayoutColor", "#000000")));
                                                        ʽﹶ0.FLD1012.setTextSelectColor(-1);
                                                        ʽﹶ0.FLD1012.setIndicatorHeight(((float)CLS43.MTH1439(1)));
                                                        ʽﹶ0.FLD1012.setIndicatorColor(-1);
                                                        ʽﹶ0.FLD1012.setIndicatorCornerRadius(((float)CLS43.MTH1439(1)));
                                                        ʽﹶ0.FLD1012.setIndicatorAnimDuration(200L);
                                                        int v4 = Build.VERSION.SDK_INT;
                                                        if(v4 >= 21) {
                                                            ʽﹶ0.FLD1012.setElevation(5.0f);
                                                        }
                                                        ʽﹶ0.FLD1012.setUnreadBackground(-1);
                                                        ʽﹶ0.FLD1012.setUnreadTextColor(CLS46.MTH1447(יﹳ2.MTH1804("TabLayoutColor", "#000000")));
                                                        ʽﹶ0.FLD1012.setSelectIconColor(CLS46.MTH1447(יﹳ2.MTH1804("TabLayoutIconColorFocus", "#FFFFFF")));
                                                        ʽﹶ0.FLD1012.setUnSelectIconColor(CLS46.MTH1447(יﹳ2.MTH1804("TabLayoutIconColorNormal", "#FFFFFF")));
                                                        ArrayList arrayList0 = new ArrayList();
                                                        arrayList0.add(new CLS321(ʽﹶ0, יﹳ2));
                                                        arrayList0.add(new CLS314(ʽﹶ0, יﹳ2));
                                                        arrayList0.add(new CLS307(ʽﹶ0, יﹳ2));
                                                        arrayList0.add(new CLS317(ʽﹶ0, יﹳ2));
                                                        ʽﹶ0.FLD1012.setTabData(arrayList0);
                                                        ʽﹶ0.FLD1012.setOnTabSelectListener(((CLS116)new CLS306(ʽﹶ0)));
                                                        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
                                                        linearLayout$LayoutParams0.height = CLS43.MTH1439(0x30);
                                                        int v5 = ʽﹶ0.MTH2237();
                                                        if(v5 == 1) {
                                                            if(יﹳ2.MTH1818("TabLayoutCustomTopMarginEnable", false)) {
                                                                linearLayout$LayoutParams0.setMargins(0, CLS43.MTH1439(יﹳ2.MTH1817(0, "TabLayoutCustomTopMargin")), 0, 0);
                                                            }
                                                            else if(יﹳ2.MTH1818("HideActionBar", false)) {
                                                                linearLayout$LayoutParams0.setMargins(0, CLS43.MTH1418(), 0, 0);
                                                            }
                                                            else {
                                                                linearLayout$LayoutParams0.setMargins(0, CLS43.MTH1418() + CLS43.MTH1439(0x30), 0, 0);
                                                            }
                                                            if(יﹳ2.MTH1818("ChangeActionBarColor", false)) {
                                                                String s1 = יﹳ2.MTH1804("ActionBarColor", "");
                                                                if(!TextUtils.isEmpty(s1)) {
                                                                    View view3 = new View(CLS133.MTH2108());
                                                                    ʽﹶ0.FLD1008 = view3;
                                                                    CLS43.MTH1437(view3, new ColorDrawable(CLS46.MTH1447(s1)));
                                                                    FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -2);
                                                                    frameLayout$LayoutParams0.topMargin = 0;
                                                                    frameLayout$LayoutParams0.height = CLS43.MTH1418();
                                                                    if(v4 >= 21) {
                                                                        CLS61.MTH1504(ʽﹶ0.FLD1008);
                                                                    }
                                                                    ʽﹶ0.FLD1001.addView(ʽﹶ0.FLD1008, 0, frameLayout$LayoutParams0);
                                                                    ʽﹶ0.FLD1001.addView(ʽﹶ0.FLD1012, 1, linearLayout$LayoutParams0);
                                                                }
                                                            }
                                                            else {
                                                                ʽﹶ0.FLD1001.addView(ʽﹶ0.FLD1012, 0, linearLayout$LayoutParams0);
                                                            }
                                                        }
                                                        else if(v5 == 2) {
                                                            if(יﹳ2.MTH1818("TabLayoutCustomTopMarginEnable", false)) {
                                                                linearLayout$LayoutParams0.setMargins(0, CLS43.MTH1439(יﹳ2.MTH1817(0, "TabLayoutCustomTopMargin")), 0, 0);
                                                            }
                                                            else if(יﹳ2.MTH1818("HideActionBar", false)) {
                                                                linearLayout$LayoutParams0.setMargins(0, CLS43.MTH1418(), 0, 0);
                                                            }
                                                            else {
                                                                linearLayout$LayoutParams0.setMargins(0, CLS43.MTH1418() + CLS43.MTH1439(0x30), 0, 0);
                                                            }
                                                            if(יﹳ2.MTH1818("ChangeActionBarColor", false)) {
                                                                String s2 = יﹳ2.MTH1804("ActionBarColor", "");
                                                                if(!TextUtils.isEmpty(s2)) {
                                                                    if(ʽﹶ0.FLD1008 == null) {
                                                                        View view4 = new View(CLS133.MTH2108());
                                                                        ʽﹶ0.FLD1008 = view4;
                                                                        CLS43.MTH1437(view4, new ColorDrawable(CLS46.MTH1447(s2)));
                                                                        int v6 = CLS43.MTH1418();
                                                                        ʽﹶ0.FLD1008.setLayoutParams(new LinearLayout.LayoutParams(-1, v6));
                                                                        if(v4 >= 21) {
                                                                            CLS61.MTH1504(ʽﹶ0.FLD1008);
                                                                        }
                                                                        ʽﹶ0.FLD1001.addView(ʽﹶ0.FLD1008, 0);
                                                                        ʽﹶ0.FLD1001.addView(ʽﹶ0.FLD1012, 1, linearLayout$LayoutParams0);
                                                                        goto label_184;
                                                                    }
                                                                    ʽﹶ0.FLD1001.addView(ʽﹶ0.FLD1012, 0, linearLayout$LayoutParams0);
                                                                }
                                                            }
                                                            else {
                                                                ʽﹶ0.FLD1001.addView(ʽﹶ0.FLD1012, 0, linearLayout$LayoutParams0);
                                                            }
                                                        }
                                                        else if(TextUtils.isEmpty(CLS133.MTH2115("NoMoveUpBottomTab"))) {
                                                            ʽﹶ0.FLD1001.addView(ʽﹶ0.FLD1012, 0, linearLayout$LayoutParams0);
                                                        }
                                                        else {
                                                            FrameLayout frameLayout0 = new FrameLayout(CLS133.MTH2108());
                                                            if(!יﹳ2.MTH1818("HideActionBar", false)) {
                                                                frameLayout0.setPadding(0, CLS43.MTH1439(0x30), 0, 0);
                                                            }
                                                            ʽﹶ0.FLD1001.removeViewAt(0);
                                                            frameLayout0.addView(ʽﹶ0.FLD1012, linearLayout$LayoutParams0);
                                                            frameLayout0.addView(ʽﹶ0.FLD1007);
                                                            ʽﹶ0.FLD1001.addView(frameLayout0, 0);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        catch(Throwable throwable1) {
                                            CLS133.MTH2113(throwable1);
                                        }
                                        try {
                                        label_184:
                                            CLS117 ˆٴ4 = CLS117.FLD842;
                                            ˆٴ4.getClass();
                                            if(CLS117.MTH1906()) {
                                                boolean z3 = false;
                                                CLS102 יﹳ3 = ˆٴ4.MTH1905();
                                                if(יﹳ3 != null && יﹳ3.MTH1811()) {
                                                    if(ʽﹶ0.FLD1027 != null && ʽﹶ0.FLD1004 != null) {
                                                        for(int v7 = 0; v7 < ʽﹶ0.FLD1027.getChildCount(); ++v7) {
                                                            if(ʽﹶ0.FLD1027.getChildAt(v7) == ʽﹶ0.FLD1004) {
                                                                z3 = true;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    if(!z3) {
                                                        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, -2);
                                                        if(יﹳ3.MTH1818("FloatingActionButtonStartLeft", false)) {
                                                            v8 = CLS43.MTH1439(20);
                                                            v9 = 0;
                                                        }
                                                        else {
                                                            v9 = CLS43.MTH1439(20);
                                                            v8 = 0;
                                                        }
                                                        frameLayout$LayoutParams1.setMargins(v8, 0, v9, (יﹳ3.MTH1818("HideBottomTab", false) || TextUtils.isEmpty(CLS133.MTH2115("NoMoveUpBottomTab")) && יﹳ3.MTH1818("MoveUpBottomTab", false) || יﹳ3.MTH1821() ? CLS43.MTH1439(12) : CLS43.MTH1439(50)));
                                                        frameLayout$LayoutParams1.gravity = (יﹳ3.MTH1818("FloatingActionButtonStartLeft", false) ? 0x800003 : 0x800005) | 80;
                                                        CLS88 ˊﾞ0 = ʽﹶ0.MTH2223();
                                                        ʽﹶ0.FLD1004 = ˊﾞ0;
                                                        if(ˊﾞ0 != null) {
                                                            View view5 = new View(((CLS155)ʽﹶ0).MTH2306());
                                                            FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                                                            view5.setVisibility(8);
                                                            view5.setOnClickListener(new CLS153(ʽﹶ0, 0));
                                                            ʽﹶ0.FLD1004.setOnMenuToggleListener(((CLS87)new CLS297(view5, 5)));
                                                            if(יﹳ3.MTH1818("FloatingActionMenuMoveEnable", false)) {
                                                                ʽﹶ0.FLD1004.getMenuButton().setOnTouchListener(new CLS154(ʽﹶ0));
                                                            }
                                                            ʽﹶ0.FLD1027.addView(view5, frameLayout$LayoutParams2);
                                                            ʽﹶ0.FLD1027.addView(ʽﹶ0.FLD1004, frameLayout$LayoutParams1);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        catch(Throwable throwable2) {
                                            CLS133.MTH2113(throwable2);
                                        }
                                        try {
                                            CLS117 ˆٴ5 = CLS117.FLD842;
                                            ˆٴ5.getClass();
                                            if(CLS117.MTH1906()) {
                                                CLS102 יﹳ4 = ˆٴ5.MTH1905();
                                                if(יﹳ4 != null) {
                                                    if(ʽﹶ0.FLD1007 != null && יﹳ4.MTH1818("DrawerDisableSlide", false)) {
                                                        CLS3.MTH991(ʽﹶ0.FLD1007, "setCanSlide", new Object[]{Boolean.FALSE});
                                                    }
                                                    if(יﹳ4.MTH1818("DrawerEnable", false) && ʽﹶ0.FLD1005 != null && ʽﹶ0.FLD1023 != null) {
                                                        ʽﹶ0.FLD1018 = new CLS105(((CLS155)ʽﹶ0).MTH2306(), יﹳ4);
                                                        if(!יﹳ4.MTH1818("DrawerArrowDisable", false)) {
                                                            ʽﹶ0.FLD1018.MTH1836(ʽﹶ0.FLD1023);
                                                        }
                                                        ʽﹶ0.FLD1018.MTH1832(ʽﹶ0.FLD1027);
                                                        CLS105 ـˏ0 = ʽﹶ0.FLD1018;
                                                        ـˏ0.FLD778 = new CLS294(ʽﹶ0, 2);
                                                        ـˏ0.FLD779 = new CLS343(ʽﹶ0, 2);
                                                        CLS67 ᵔʾ0 = ـˏ0.FLD785;
                                                        if(ᵔʾ0 != null) {
                                                            ᵔʾ0.FLD547 = "tab_main";
                                                            ᵔʾ0.notifyDataSetChanged();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        catch(Throwable throwable3) {
                                            CLS133.MTH2113(throwable3);
                                        }
                                        if(Build.VERSION.SDK_INT >= 21 && ʽﹶ0.FLD1005 != null && יﹳ0 != null && !יﹳ0.MTH1818("HideActionBar", false) && (יﹳ0.MTH1821() || CLS15.MTH1077(0xFFFF8A962B3CF2B7L) && יﹳ0.MTH1818("MoveUpBottomTab", false))) {
                                            Object object3 = CLS3.MTH989(ʽﹶ0.FLD1005, CLS133.MTH2100("HomeUIActionBarField", "mActionBar"));
                                            if(object3 != null) {
                                                CLS61.MTH1501(((ViewGroup)((View)CLS3.MTH991(object3, CLS133.MTH2100("ActionBar_getCustomViewMethod", "getCustomView"), new Object[0])).getParent().getParent()));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 1: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ6 = CLS117.FLD842;
                ˆٴ6.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ5 = ˆٴ6.MTH1905();
                    if(יﹳ5 != null && יﹳ5.MTH1818("RecentChatFloatingActionButtonEnable", false)) {
                        ʽﹶ0.MTH2233(((String)arr_object[2]), ((ContentValues)arr_object[3]), null);
                    }
                }
                return;
            }
            case 2: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ7 = CLS117.FLD842;
                ˆٴ7.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ6 = ˆٴ7.MTH1905();
                    if(יﹳ6 != null && יﹳ6.MTH1818("RecentChatFloatingActionButtonEnable", false)) {
                        Object object4 = arr_object[0];
                        String s3 = (String)arr_object[2];
                        ContentValues contentValues0 = (ContentValues)arr_object[3];
                        try {
                            Field field1 = object4.getClass().getDeclaredField("args");
                            if(field1 != null) {
                                field1.setAccessible(true);
                                colorDrawable0 = field1.get(object4);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        ʽﹶ0.MTH2233(s3, contentValues0, ((String[])((Object[])colorDrawable0)[3]));
                    }
                }
                return;
            }
            case 3: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ8 = CLS117.FLD842;
                ˆٴ8.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ7 = ˆٴ8.MTH1905();
                    if(יﹳ7 != null && יﹳ7.MTH1818("UseRoundAvatar", false)) {
                        Object object5 = arr_object[0];
                        try {
                            Field field2 = object5.getClass().getDeclaredField("args");
                            if(field2 != null) {
                                field2.setAccessible(true);
                                colorDrawable0 = field2.get(object5);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        if(!((Boolean)((Object[])colorDrawable0)[2]).booleanValue()) {
                            ʽﹶ0.FLD1000 = true;
                        }
                    }
                }
                return;
            }
            case 4: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ9 = CLS117.FLD842;
                ˆٴ9.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ8 = ˆٴ9.MTH1905();
                    if(יﹳ8 != null && יﹳ8.MTH1818("UseRoundAvatar", false)) {
                        Object object6 = arr_object[0];
                        try {
                            Field field3 = object6.getClass().getDeclaredField("args");
                            if(field3 != null) {
                                field3.setAccessible(true);
                                colorDrawable0 = field3.get(object6);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        if(!((Boolean)((Object[])colorDrawable0)[3]).booleanValue()) {
                            ʽﹶ0.FLD1000 = true;
                        }
                    }
                }
                return;
            }
            case 5: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ10 = CLS117.FLD842;
                ˆٴ10.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ9 = ˆٴ10.MTH1905();
                    if(יﹳ9 != null && יﹳ9.MTH1818("UseRoundAvatar", false)) {
                        ʽﹶ0.FLD1000 = false;
                    }
                }
                return;
            }
            case 6: {
                ʽﹶ0.MTH2227(4);
                return;
            }
            case 7: {
                ʽﹶ0.MTH2227(0);
                return;
            }
            case 8: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ11 = CLS117.FLD842;
                ˆٴ11.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ10 = ˆٴ11.MTH1905();
                    if(יﹳ10 != null && יﹳ10.MTH1818("UseRoundAvatar", false) && (!ʽﹶ0.FLD1000 || !CLS133.MTH2110("VoipMgrOnFinishMethod"))) {
                        CLS4 ᵔʾ1 = new CLS4(arr_object[0]);
                        ᵔʾ1.MTH1004(CLS41.MTH1403(((Bitmap)ᵔʾ1.MTH1003())));
                    }
                }
                return;
            }
            case 9: {
                ʽﹶ0.getClass();
                Object object7 = arr_object[0];
                int v10 = (int)(((Integer)arr_object[1]));
                View view6 = (View)arr_object[2];
                if(view6 != null) {
                    CLS117 ˆٴ12 = CLS117.FLD842;
                    ˆٴ12.getClass();
                    if(CLS117.MTH1906()) {
                        CLS102 יﹳ11 = ˆٴ12.MTH1905();
                        if(יﹳ11 != null && !יﹳ11.MTH1819()) {
                            Object object8 = CLS3.MTH991(object7, "getItem", new Object[]{v10});
                            if(object8 != null) {
                                ʽﹶ0.MTH2230(יﹳ11, view6, ((String)CLS3.MTH989(object8, "field_username")), CLS133.MTH2115("convContenViewField"), CLS133.MTH2115("convNameViewField"), CLS133.MTH2115("convTimeViewField"));
                            }
                        }
                    }
                }
                return;
            }
            case 10: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ13 = CLS117.FLD842;
                ˆٴ13.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ12 = ˆٴ13.MTH1905();
                    if(יﹳ12 != null) {
                        Object object9 = arr_object[0];
                        try {
                            Field field4 = object9.getClass().getDeclaredField("args");
                            if(field4 != null) {
                                field4.setAccessible(true);
                                colorDrawable0 = field4.get(object9);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        int v11 = (int)(((Integer)((Object[])colorDrawable0)[0]));
                        if(יﹳ12.MTH1821()) {
                            CLS121 ˆٴ14 = ʽﹶ0.FLD1012;
                            if(ˆٴ14 != null) {
                                ˆٴ14.MTH1992(0, v11);
                            }
                        }
                        if(יﹳ12.MTH1818("DrawerEnable", false)) {
                            CLS105 ـˏ1 = ʽﹶ0.FLD1018;
                            if(ـˏ1 != null) {
                                ـˏ1.MTH1837(0, v11);
                            }
                        }
                    }
                }
                return;
            }
            case 11: {
                if(ʽﹶ0.FLD1018 != null) {
                    CLS117 ˆٴ15 = CLS117.FLD842;
                    ˆٴ15.getClass();
                    if(CLS117.MTH1906()) {
                        CLS102 יﹳ13 = ˆٴ15.MTH1905();
                        if(יﹳ13 != null && יﹳ13.MTH1818("DrawerEnable", false)) {
                            Object object10 = arr_object[0];
                            try {
                                Field field5 = object10.getClass().getDeclaredField("args");
                                if(field5 != null) {
                                    field5.setAccessible(true);
                                    colorDrawable0 = field5.get(object10);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            if(((KeyEvent)((Object[])colorDrawable0)[0]).getKeyCode() == 4) {
                                Object[] arr_object1 = {Boolean.valueOf(יﹳ13.MTH1818("DrawerOpenRight", false))};
                                CLS123.FLD912.MTH2004("core", "DrawerLayout_closeDrawer", arr_object1);
                            }
                        }
                    }
                }
                return;
            }
            case 12: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ16 = CLS117.FLD842;
                ˆٴ16.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ14 = ˆٴ16.MTH1905();
                    if(יﹳ14 != null) {
                        Object object11 = arr_object[0];
                        try {
                            Field field6 = object11.getClass().getDeclaredField("thisObject");
                            object12 = null;
                            if(field6 != null) {
                                field6.setAccessible(true);
                                object12 = field6.get(object11);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        if((((Activity)object12) == null ? "" : ((Activity)object12).getClass().getName()).equals(CLS133.MTH2115("LauncherUI"))) {
                            CLS309.MTH2229(ʽﹶ0.FLD1023, null, יﹳ14);
                            if(ʽﹶ0.MTH2237() >= 2 && יﹳ14.MTH1818("ChangeActionBarColor", false)) {
                                String s4 = יﹳ14.MTH1804("ActionBarColor", "");
                                if(!TextUtils.isEmpty(s4) && CLS3.MTH999(((Activity)object12), "status_view_init") == null && ʽﹶ0.FLD1008 == null) {
                                    View view7 = new View(((Activity)object12));
                                    ʽﹶ0.FLD1008 = view7;
                                    CLS43.MTH1437(view7, new ColorDrawable(CLS46.MTH1447(s4)));
                                    int v12 = Build.VERSION.SDK_INT;
                                    if(v12 >= 21) {
                                        CLS61.MTH1509(ʽﹶ0.FLD1008);
                                    }
                                    int v13 = CLS43.MTH1418();
                                    ʽﹶ0.FLD1008.setLayoutParams(new LinearLayout.LayoutParams(-1, v13));
                                    ((ViewGroup)((Activity)object12).getWindow().getDecorView()).addView(ʽﹶ0.FLD1008);
                                    if(v12 >= 21) {
                                        ((Activity)object12).getWindow().setStatusBarColor(CLS46.MTH1447(s4));
                                    }
                                    CLS3.MTH992(((Activity)object12), "status_view_init", Boolean.TRUE);
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 13: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ17 = CLS117.FLD842;
                ˆٴ17.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ15 = ˆٴ17.MTH1905();
                    if(יﹳ15 != null) {
                        if(!TextUtils.isEmpty(((String)arr_object[1]))) {
                            Object object13 = arr_object[0];
                            CLS102 יﹳ16 = ˆٴ17.MTH1905();
                            if(יﹳ16.MTH1818("RecentChatFloatingActionButtonEnable", false)) {
                                try {
                                    Field field7 = object13.getClass().getDeclaredField("thisObject");
                                    object14 = null;
                                    if(field7 != null) {
                                        field7.setAccessible(true);
                                        object14 = field7.get(object13);
                                    }
                                }
                                catch(Throwable unused_ex) {
                                }
                                ViewGroup viewGroup3 = (ViewGroup)((ViewGroup)CLS1.MTH980(object14, "MMChattingListView")).getParent();
                                View view8 = viewGroup3.getChildAt(viewGroup3.getChildCount() - 1);
                                if(view8.getClass().getName().equals("t.ˈˊ.ˊﾞ")) {
                                    if(((CLS88)view8).FLD658) {
                                        ((CLS88)view8).MTH1719(false);
                                    }
                                    ʽﹶ0.MTH2240(((CLS88)view8));
                                }
                                else {
                                    int v14 = CLS46.MTH1447(יﹳ16.MTH1804("RecentChatFloatingActionMenuColor", "#0000FF"));
                                    CLS88 ˊﾞ1 = new CLS88(CLS133.MTH2108());
                                    ˊﾞ1.setMenuButtonColorNormal(v14);
                                    ˊﾞ1.setMenuButtonColorPressed(v14);
                                    ˊﾞ1.setMenuIcon(יﹳ16.MTH1820(CLS133.MTH2108(), יﹳ16.MTH1804("RecentChatFloatingActionMenuIcon", ""), false));
                                    ˊﾞ1.MTH1720();
                                    ˊﾞ1.setClosedOnTouchOutside(true);
                                    ˊﾞ1.setOpenDirection(1);
                                    if(יﹳ16.MTH1818("RecentChatFloatingActionMenuShowLabelOnRight", false)) {
                                        ˊﾞ1.setLabelPosition(1);
                                    }
                                    FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                                    boolean z4 = יﹳ16.MTH1818("RecentChatFloatingActionButtonStartLeft", false);
                                    int v15 = CLS43.MTH1439(20);
                                    if(z4) {
                                        v16 = 0;
                                    }
                                    else {
                                        v16 = v15;
                                        v15 = 0;
                                    }
                                    if(יﹳ16.MTH1818("RecentChatFloatingActionMenuMoveEnable", false)) {
                                        ˊﾞ1.getMenuButton().setOnTouchListener(new CLS156(ˊﾞ1));
                                    }
                                    frameLayout$LayoutParams3.setMargins(v15, 0, v16, 0);
                                    frameLayout$LayoutParams3.gravity = (יﹳ16.MTH1818("RecentChatFloatingActionButtonStartLeft", false) ? 0x800003 : 0x800005) | 80;
                                    viewGroup3.addView(ˊﾞ1, frameLayout$LayoutParams3);
                                    ʽﹶ0.MTH2240(ˊﾞ1);
                                }
                            }
                        }
                        if(יﹳ15.MTH1818("ChangeActionBarColor", false) && !יﹳ15.MTH1819()) {
                            String s5 = יﹳ15.MTH1804("ActionBarColor", "");
                            if(!TextUtils.isEmpty(s5)) {
                                Object object15 = arr_object[0];
                                if(!CLS15.MTH1077(0xFFFF4B2F2B3CF2B7L)) {
                                    if(!TextUtils.isEmpty("actionbarField2")) {
                                        try {
                                            Field field8 = object15.getClass().getDeclaredField("thisObject");
                                            if(field8 != null) {
                                                field8.setAccessible(true);
                                                colorDrawable0 = field8.get(object15);
                                            }
                                        }
                                        catch(Throwable unused_ex) {
                                        }
                                        colorDrawable0 = CLS15.MTH1072(0xFFFF4AFF2B3CF2B7L, CLS15.MTH1072(0xFFFF4B0F2B3CF2B7L, colorDrawable0));
                                    }
                                    if(colorDrawable0 != null) {
                                        Object object16 = CLS1.MTH980(colorDrawable0, "ActionBarContainer");
                                        if(object16 == null) {
                                            CLS3.MTH991(colorDrawable0, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(CLS46.MTH1447(s5))});
                                            return;
                                        }
                                        Drawable drawable0 = (Drawable)CLS3.MTH991(object16, "getBackground", new Object[0]);
                                        if(drawable0 == null || !(drawable0 instanceof ColorDrawable)) {
                                            CLS3.MTH991(colorDrawable0, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(CLS46.MTH1447(s5))});
                                            return;
                                        }
                                        int v17 = ((ColorDrawable)drawable0).getColor();
                                        if(v17 != 0 && v17 != CLS46.MTH1447("#F2F2F2") && v17 != CLS46.MTH1447(s5)) {
                                            CLS3.MTH991(colorDrawable0, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(CLS46.MTH1447(s5))});
                                            return;
                                        }
                                    }
                                }
                                else if(!CLS15.MTH1077(0xFFFF4A8A2B3CF2B7L)) {
                                    try {
                                        Field field9 = object15.getClass().getDeclaredField("thisObject");
                                        if(field9 != null) {
                                            field9.setAccessible(true);
                                            colorDrawable0 = field9.get(object15);
                                        }
                                    }
                                    catch(Throwable unused_ex) {
                                    }
                                    Object object17 = CLS15.MTH1072(0xFFFF4A792B3CF2B7L, colorDrawable0);
                                    if(object17 != null) {
                                        Drawable drawable1 = (Drawable)CLS3.MTH989(object17, "mBackground");
                                        if(drawable1 == null || !(drawable1 instanceof ColorDrawable)) {
                                            CLS3.MTH991(object17, "setPrimaryBackground", new Object[]{new ColorDrawable(CLS46.MTH1447(s5))});
                                        }
                                        else {
                                            int v18 = ((ColorDrawable)drawable1).getColor();
                                            if(v18 != 0 && v18 != CLS46.MTH1447("#F2F2F2") && v18 != CLS46.MTH1447(s5)) {
                                                CLS3.MTH991(object17, "setPrimaryBackground", new Object[]{new ColorDrawable(CLS46.MTH1447(s5))});
                                                return;
                                            }
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
                CLS117 ˆٴ18 = CLS117.FLD842;
                ˆٴ18.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ17 = ˆٴ18.MTH1905();
                    if(יﹳ17 != null && !יﹳ17.MTH1819()) {
                        Object object18 = arr_object[0];
                        try {
                            Field field10 = object18.getClass().getDeclaredField("thisObject");
                            colorDrawable1 = null;
                            if(field10 != null) {
                                field10.setAccessible(true);
                                colorDrawable1 = field10.get(object18);
                            }
                        }
                        catch(Throwable unused_ex) {
                        }
                        ʽﹶ0.FLD1024 = colorDrawable1;
                        boolean z5 = יﹳ17.MTH1818("FragmentItemViewTitleColorEnable", false);
                        boolean z6 = יﹳ17.MTH1818("DiscoverFragmentBackgroundEnable", false);
                        boolean z7 = יﹳ17.MTH1818("DiscoverFragmentBackgroundColorEnable", false);
                        if(z6 || z5 || z7) {
                            if(colorDrawable1 == null) {
                                try {
                                    Field field11 = object18.getClass().getDeclaredField("thisObject");
                                    if(field11 != null) {
                                        field11.setAccessible(true);
                                        colorDrawable0 = field11.get(object18);
                                    }
                                }
                                catch(Throwable unused_ex) {
                                }
                                colorDrawable1 = colorDrawable0;
                            }
                            ListView listView0 = (ListView)CLS15.MTH1072(0xFFFF629B2B3CF2B7L, colorDrawable1);
                            if(listView0 != null) {
                                ʽﹶ0.FLD1015 = listView0.getAdapter();
                                try {
                                    if(z6) {
                                        Context context0 = CLS133.MTH2108();
                                        יﹳ17.MTH1816(CLS309.MTH2226(listView0), CLS309.MTH2242(listView0), context0, ((CLS146)new CLS319(listView0, 3)), "DiscoverFragmentBackground");
                                        return;
                                    }
                                    if(z7) {
                                        String s6 = יﹳ17.MTH1804("DiscoverFragmentBackgroundColor", "000000");
                                        if(!TextUtils.isEmpty(s6)) {
                                            CLS43.MTH1437(listView0, new ColorDrawable(CLS46.MTH1447(s6)));
                                            return;
                                        }
                                    }
                                    return;
                                }
                                catch(Throwable throwable4) {
                                }
                                CLS133.MTH2113(throwable4);
                            }
                        }
                    }
                }
                return;
            }
            case 15: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ19 = CLS117.FLD842;
                ˆٴ19.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ18 = ˆٴ19.MTH1905();
                    if(יﹳ18 != null && !יﹳ18.MTH1819()) {
                        boolean z8 = יﹳ18.MTH1818("FragmentItemViewTitleColorEnable", false);
                        boolean z9 = יﹳ18.MTH1818("MeFragmentBackgroundEnable", false);
                        boolean z10 = יﹳ18.MTH1818("MeFragmentBackgroundColorEnable", false);
                        if(z9 || z8 || z10) {
                            Object object19 = arr_object[0];
                            try {
                                Field field12 = object19.getClass().getDeclaredField("thisObject");
                                if(field12 != null) {
                                    field12.setAccessible(true);
                                    colorDrawable0 = field12.get(object19);
                                }
                            }
                            catch(Throwable unused_ex) {
                            }
                            ListView listView1 = (ListView)CLS15.MTH1072(0xFFFF63522B3CF2B7L, colorDrawable0);
                            if(listView1 != null) {
                                ʽﹶ0.FLD1026 = listView1.getAdapter();
                                try {
                                    if(z9) {
                                        Context context1 = CLS133.MTH2108();
                                        יﹳ18.MTH1816(CLS309.MTH2226(listView1), CLS309.MTH2242(listView1), context1, ((CLS146)new CLS319(listView1, 1)), "MeFragmentBackground");
                                        return;
                                    }
                                    if(z10) {
                                        String s7 = יﹳ18.MTH1804("MeFragmentBackgroundColor", "000000");
                                        if(!TextUtils.isEmpty(s7)) {
                                            CLS43.MTH1437(listView1, new ColorDrawable(CLS46.MTH1447(s7)));
                                            return;
                                        }
                                    }
                                    return;
                                }
                                catch(Throwable throwable5) {
                                }
                                CLS133.MTH2113(throwable5);
                            }
                        }
                    }
                }
                return;
            }
            case 16: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ20 = CLS117.FLD842;
                ˆٴ20.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ19 = ˆٴ20.MTH1905();
                    if(יﹳ19 != null && !יﹳ19.MTH1819()) {
                        CLS4 ᵔʾ2 = new CLS4(arr_object[0]);
                        if(ʽﹶ0.FLD1026 == ᵔʾ2.MTH1002() || ʽﹶ0.FLD1015 == ᵔʾ2.MTH1002()) {
                            View view9 = (View)ᵔʾ2.MTH1003();
                            if(view9 != null) {
                                boolean z11 = יﹳ19.MTH1818("MeFragmentBackgroundEnable", false) && ʽﹶ0.FLD1026 == ᵔʾ2.MTH1002();
                                boolean z12 = יﹳ19.MTH1818("DiscoverFragmentBackgroundEnable", false) && ʽﹶ0.FLD1015 == ᵔʾ2.MTH1002();
                                boolean z13 = יﹳ19.MTH1818("MeFragmentBackgroundColorEnable", false) && ʽﹶ0.FLD1026 == ᵔʾ2.MTH1002();
                                boolean z14 = יﹳ19.MTH1818("DiscoverFragmentBackgroundColorEnable", false) && ʽﹶ0.FLD1015 == ᵔʾ2.MTH1002();
                                if(!(view9 instanceof TextView)) {
                                    if(יﹳ19.MTH1818("FragmentItemViewTitleColorEnable", false)) {
                                        String s8 = יﹳ19.MTH1804("FragmentItemViewTitleColor", "");
                                        if(!TextUtils.isEmpty(s8)) {
                                            View view10 = CLS1.MTH983(view9, new int[]{0, 0, 0, 1, 0, 0});
                                            if(view10 != null && view10 instanceof TextView) {
                                                ((TextView)view10).setTextColor(CLS46.MTH1447(s8));
                                            }
                                        }
                                        if(ʽﹶ0.FLD1026 == ᵔʾ2.MTH1002()) {
                                            View view11 = CLS1.MTH983(view9, new int[]{0, 1});
                                            View view12 = CLS1.MTH981(0, view11);
                                            if(!TextUtils.isEmpty(s8) && view12 != null) {
                                                CLS3.MTH991(view12, "setTextColor", new Object[]{CLS46.MTH1447(s8)});
                                            }
                                            View view13 = CLS1.MTH981(1, view11);
                                            String s9 = יﹳ19.MTH1804("FragmentItemViewSubTitleColor", "");
                                            if(!TextUtils.isEmpty(s9) && view13 != null) {
                                                ((TextView)view13).setTextColor(CLS46.MTH1447(s9));
                                            }
                                        }
                                    }
                                    if(z11 || z12 || z14 || z13) {
                                        CLS43.MTH1436(view9, ʽﹶ0.MTH2232());
                                        CLS43.MTH1437(view9, ʽﹶ0.MTH2225(יﹳ19));
                                    }
                                }
                                else if((z11 || z12 || z13 || z14) && "分隔栏".equals("" + view9.getContentDescription())) {
                                    view9.setVisibility(8);
                                    return;
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 17: {
                ʽﹶ0.getClass();
                CLS117 ˆٴ21 = CLS117.FLD842;
                ˆٴ21.getClass();
                if(CLS117.MTH1906()) {
                    CLS102 יﹳ20 = ˆٴ21.MTH1905();
                    if(יﹳ20 != null && !יﹳ20.MTH1819()) {
                        CLS4 ᵔʾ3 = new CLS4(arr_object[0]);
                        if(ʽﹶ0.FLD1026 == ᵔʾ3.MTH1002() || ʽﹶ0.FLD1015 == ᵔʾ3.MTH1002()) {
                            View view14 = (View)ᵔʾ3.MTH1003();
                            if(view14 != null) {
                                boolean z15 = יﹳ20.MTH1818("MeFragmentBackgroundEnable", false) && ʽﹶ0.FLD1026 == ᵔʾ3.MTH1002();
                                boolean z16 = יﹳ20.MTH1818("DiscoverFragmentBackgroundEnable", false) && ʽﹶ0.FLD1015 == ᵔʾ3.MTH1002();
                                boolean z17 = יﹳ20.MTH1818("MeFragmentBackgroundColorEnable", false) && ʽﹶ0.FLD1026 == ᵔʾ3.MTH1002();
                                boolean z18 = יﹳ20.MTH1818("DiscoverFragmentBackgroundColorEnable", false) && ʽﹶ0.FLD1015 == ᵔʾ3.MTH1002();
                                if(!(view14 instanceof TextView)) {
                                    if(יﹳ20.MTH1818("FragmentItemViewTitleColorEnable", false)) {
                                        String s10 = יﹳ20.MTH1804("FragmentItemViewTitleColor", "");
                                        if(!TextUtils.isEmpty(s10)) {
                                            View view15 = CLS1.MTH983(view14, new int[]{0, 0, 0, 1, 0, 0, 0});
                                            if(view15 != null && view15 instanceof TextView) {
                                                ((TextView)view15).setTextColor(CLS46.MTH1447(s10));
                                            }
                                        }
                                        if(ʽﹶ0.FLD1026 == ᵔʾ3.MTH1002() && view14 instanceof RelativeLayout) {
                                            View view16 = CLS1.MTH983(view14, new int[]{1, 0, 1});
                                            View view17 = CLS1.MTH981(0, view16);
                                            if(!TextUtils.isEmpty(s10) && view17 != null) {
                                                CLS3.MTH991(view17, "setTextColor", new Object[]{CLS46.MTH1447(s10)});
                                            }
                                            View view18 = CLS1.MTH981(1, view16);
                                            String s11 = יﹳ20.MTH1804("FragmentItemViewSubTitleColor", "");
                                            if(!TextUtils.isEmpty(s11) && view18 != null) {
                                                ((TextView)view18).setTextColor(CLS46.MTH1447(s11));
                                            }
                                        }
                                    }
                                    if(z15 || z16 || z18 || z17) {
                                        CLS43.MTH1436(view14, ʽﹶ0.MTH2232());
                                        CLS43.MTH1437(view14, ʽﹶ0.MTH2225(יﹳ20));
                                    }
                                }
                                else if((z15 || z16 || z17 || z18) && "分隔栏".equals("" + view14.getContentDescription())) {
                                    view14.setVisibility(8);
                                    return;
                                }
                            }
                        }
                    }
                }
                return;
            }
            case 18: {
                this.MTH2215(arr_object);
                return;
            }
            case 19: {
                if(ʽﹶ0.MTH2237() >= 2) {
                    CLS117 ˆٴ22 = CLS117.FLD842;
                    ˆٴ22.getClass();
                    if(CLS117.MTH1906()) {
                        CLS102 יﹳ21 = ˆٴ22.MTH1905();
                        if(יﹳ21 != null && !יﹳ21.MTH1819() && (יﹳ21.MTH1818("MainFragmentBackgroundColorEnable", false) || יﹳ21.MTH1818("MainFragmentBackgroundEnable", false))) {
                            CLS4 ᵔʾ4 = new CLS4(arr_object[0]);
                            if(((View)ᵔʾ4.MTH1002()).getClass().getName().endsWith("ConversationListView")) {
                                ᵔʾ4.MTH1004(null);
                            }
                        }
                    }
                }
                return;
            }
            case 20: {
                this.MTH2216(arr_object);
                return;
            }
            case 21: {
                this.MTH2217(arr_object);
                return;
            }
            case 22: {
                this.MTH2214(arr_object);
                return;
            }
            case 23: {
                ʽﹶ0.getClass();
                Object object20 = arr_object[0];
                try {
                    Field field13 = object20.getClass().getDeclaredField("args");
                    if(field13 != null) {
                        field13.setAccessible(true);
                        colorDrawable0 = field13.get(object20);
                    }
                }
                catch(Throwable unused_ex) {
                }
                ViewGroup viewGroup4 = (ViewGroup)((Object[])colorDrawable0)[1];
                if(viewGroup4 != null) {
                    CLS117.FLD842.getClass();
                    if(CLS117.MTH1906() && CLS1.MTH978("MvvmAddressUIFragment")) {
                        ʽﹶ0.MTH2231(viewGroup4);
                    }
                }
                return;
            }
            case 24: {
                ʽﹶ0.getClass();
                Object object21 = arr_object[0];
                try {
                    Field field14 = object21.getClass().getDeclaredField("args");
                    if(field14 != null) {
                        field14.setAccessible(true);
                        colorDrawable0 = field14.get(object21);
                    }
                }
                catch(Throwable unused_ex) {
                }
                ViewGroup viewGroup5 = (ViewGroup)((Object[])colorDrawable0)[0];
                if(viewGroup5 != null) {
                    CLS117.FLD842.getClass();
                    if(CLS117.MTH1906() && CLS1.MTH978("MvvmAddressUIFragment")) {
                        ʽﹶ0.MTH2231(viewGroup5);
                    }
                }
                return;
            }
            case 25: {
                this.MTH2219(arr_object);
                return;
            }
            case 26: {
                this.MTH2218(arr_object);
                return;
            }
            case 27: {
                this.MTH2211(arr_object);
                return;
            }
            case 28: {
                this.MTH2212(arr_object);
                return;
            }
            default: {
                this.MTH2210(arr_object);
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2214(Object[] arr_object) {
        Object object1;
        String s;
        Object object0;
        CLS309 ʽﹶ0 = this.FLD999;
        ʽﹶ0.getClass();
        CLS4 ᵔʾ0 = new CLS4(arr_object[0]);
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                boolean z = יﹳ0.MTH1818("ContactFragmentBackgroundEnable", false);
                boolean z1 = יﹳ0.MTH1818("FragmentItemViewTitleColorEnable", false);
                boolean z2 = יﹳ0.MTH1818("ContactFragmentBackgroundColorEnable", false);
                if((z || z1 || z2) && ((int)(((Integer)ᵔʾ0.MTH1001()[0]))) > 0) {
                    try {
                        if(TextUtils.isEmpty(CLS133.MTH2115("MvvmAddressUIFragmentField3"))) {
                            object0 = ᵔʾ0.MTH1002();
                            s = "MvvmAddressUIFragmentField2";
                        }
                        else {
                            object0 = ᵔʾ0.MTH1002();
                            s = "MvvmAddressUIFragmentField3";
                        }
                        object1 = CLS3.MTH989(object0, CLS133.MTH2115(s));
                    }
                    catch(Throwable unused_ex) {
                        object1 = null;
                    }
                    if(object1 == null) {
                        object1 = CLS1.MTH980(ᵔʾ0.MTH1002(), CLS133.MTH2115("MvvmAddressUIFragment"));
                    }
                    if(object1 != null) {
                        Object object2 = CLS15.MTH1072(0xFFFF5D5F2B3CF2B7L, object1);
                        if(object2 != null) {
                            CLS43.MTH1427(((ViewGroup)object2), ʽﹶ0.MTH2232());
                            if(z || z2) {
                                CLS43.MTH1437(((ViewGroup)object2), ʽﹶ0.MTH2225(יﹳ0));
                            }
                            if(z1) {
                                String s1 = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                                if(!TextUtils.isEmpty(s1)) {
                                    int v = CLS46.MTH1447(s1);
                                    View view0 = CLS1.MTH983(((ViewGroup)object2), new int[]{0, 1, 0, 0, 0, 1, 0});
                                    if(view0 != null) {
                                        ((TextView)view0).setTextColor(v);
                                    }
                                }
                                String s2 = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                                if(!TextUtils.isEmpty(s2)) {
                                    int v1 = CLS46.MTH1447(s2);
                                    View view1 = CLS1.MTH983(((ViewGroup)object2), new int[]{0, 0});
                                    if(view1 instanceof TextView) {
                                        ((TextView)view1).setTextColor(v1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2215(Object[] arr_object) {
        CLS309 ʽﹶ0 = this.FLD999;
        ʽﹶ0.getClass();
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                CLS4 ᵔʾ0 = new CLS4(arr_object[0]);
                if(ʽﹶ0.FLD1026 == ᵔʾ0.MTH1002() || ʽﹶ0.FLD1015 == ᵔʾ0.MTH1002()) {
                    View view0 = (View)ᵔʾ0.MTH1003();
                    if(view0 != null) {
                        boolean z = יﹳ0.MTH1818("MeFragmentBackgroundEnable", false) && ʽﹶ0.FLD1026 == ᵔʾ0.MTH1002();
                        boolean z1 = יﹳ0.MTH1818("DiscoverFragmentBackgroundEnable", false) && ʽﹶ0.FLD1015 == ᵔʾ0.MTH1002();
                        boolean z2 = יﹳ0.MTH1818("MeFragmentBackgroundColorEnable", false) && ʽﹶ0.FLD1026 == ᵔʾ0.MTH1002();
                        boolean z3 = יﹳ0.MTH1818("DiscoverFragmentBackgroundColorEnable", false) && ʽﹶ0.FLD1015 == ᵔʾ0.MTH1002();
                        if(!(view0 instanceof TextView)) {
                            if(יﹳ0.MTH1818("FragmentItemViewTitleColorEnable", false)) {
                                String s = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                                if(!TextUtils.isEmpty(s) && view0 instanceof LinearLayout) {
                                    View view1 = CLS1.MTH979(((ViewGroup)view0), "TextView");
                                    if(view1 != null && view1 instanceof TextView) {
                                        ((TextView)view1).setTextColor(CLS46.MTH1447(s));
                                    }
                                }
                                if(ʽﹶ0.FLD1026 == ᵔʾ0.MTH1002() && view0 instanceof RelativeLayout) {
                                    View view2 = CLS1.MTH983(view0, new int[]{3, 0, 1});
                                    View view3 = CLS1.MTH983(view2, new int[]{0, 0});
                                    if(!TextUtils.isEmpty(s) && view3 != null) {
                                        CLS3.MTH991(view3, "setTextColor", new Object[]{CLS46.MTH1447(s)});
                                    }
                                    View view4 = CLS1.MTH983(view2, new int[]{1, 0});
                                    String s1 = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                                    if(!TextUtils.isEmpty(s1) && view4 != null) {
                                        ((TextView)view4).setTextColor(CLS46.MTH1447(s1));
                                    }
                                }
                            }
                            if(z || z1 || z3 || z2) {
                                CLS43.MTH1436(view0, ʽﹶ0.MTH2232());
                                CLS43.MTH1437(view0, ʽﹶ0.MTH2225(יﹳ0));
                            }
                        }
                        else if(z || z1 || z2 || z3) {
                            view0.setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2216(Object[] arr_object) {
        Object object1;
        CLS309 ʽﹶ0 = this.FLD999;
        ʽﹶ0.getClass();
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                Object object0 = arr_object[0];
                boolean z = true;
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
                ListView listView0 = (ListView)CLS1.MTH980(object1, "ListView");
                if(listView0 != null) {
                    if(listView0.getHeaderViewsCount() > 0 && יﹳ0.MTH1818("HidePullDownAppBrand", false)) {
                        String s = CLS133.MTH2115("AppBrandDesktopHalfContainer");
                        if(!TextUtils.isEmpty(s)) {
                            for(Object object2: ((ArrayList)CLS3.MTH989(listView0, "mHeaderViewInfos"))) {
                                View view0 = ((ListView.FixedViewInfo)object2).view;
                                if(view0 != null && view0.getClass().getName().equals(s)) {
                                    view0.setVisibility(8);
                                    if(view0 instanceof ViewGroup) {
                                        ViewGroup viewGroup0 = (ViewGroup)view0;
                                        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
                                            viewGroup0.getChildAt(v).setVisibility(8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    boolean z1 = יﹳ0.MTH1818("MainFragmentBackgroundColorEnable", false) && !יﹳ0.MTH1819();
                    if(!יﹳ0.MTH1818("MainFragmentBackgroundEnable", false) || יﹳ0.MTH1819()) {
                        z = false;
                    }
                    if(z1 || z) {
                        listView0.setSelector(ʽﹶ0.MTH2232());
                        if(z) {
                            Context context0 = CLS133.MTH2108();
                            יﹳ0.MTH1816(CLS309.MTH2226(listView0), CLS309.MTH2242(listView0), context0, ((CLS146)new CLS319(listView0, 2)), "MainFragmentBackground");
                        }
                        else {
                            String s1 = יﹳ0.MTH1804("MainFragmentBackgroundColor", "000000");
                            if(!TextUtils.isEmpty(s1)) {
                                CLS43.MTH1437(listView0, new ColorDrawable(CLS46.MTH1447(s1)));
                            }
                        }
                        if(listView0.getFooterViewsCount() > 0) {
                            for(Object object3: ((ArrayList)CLS3.MTH989(listView0, "mFooterViewInfos"))) {
                                View view1 = ((ListView.FixedViewInfo)object3).view;
                                if(view1 != null) {
                                    if(view1 instanceof ViewGroup) {
                                        ViewGroup viewGroup1 = (ViewGroup)view1;
                                        for(int v1 = 0; v1 < viewGroup1.getChildCount(); ++v1) {
                                            CLS43.MTH1437(viewGroup1.getChildAt(v1), ʽﹶ0.MTH2232());
                                        }
                                    }
                                    CLS43.MTH1437(view1, ʽﹶ0.MTH2232());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2217(Object[] arr_object) {
        Object object1;
        CLS309 ʽﹶ0 = this.FLD999;
        ʽﹶ0.getClass();
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                boolean z = יﹳ0.MTH1818("ContactFragmentBackgroundEnable", false);
                boolean z1 = יﹳ0.MTH1818("FragmentItemViewTitleColorEnable", false);
                boolean z2 = יﹳ0.MTH1818("ContactFragmentBackgroundColorEnable", false);
                if(z || z1 || z2) {
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
                    ListView listView0 = (ListView)CLS1.MTH980(object1, "ListView");
                    if(listView0 != null) {
                        try {
                            if(listView0.getHeaderViewsCount() > 0) {
                                for(Object object2: ((ArrayList)CLS3.MTH989(listView0, "mHeaderViewInfos"))) {
                                    View view0 = ((ListView.FixedViewInfo)object2).view;
                                    if(view0 != null && view0 instanceof ViewGroup) {
                                        ViewGroup viewGroup0 = (ViewGroup)view0;
                                        if(z || z2) {
                                            CLS43.MTH1427(viewGroup0, ʽﹶ0.MTH2232());
                                        }
                                        for(int v = 0; v < viewGroup0.getChildCount(); ++v) {
                                            ViewGroup viewGroup1 = (ViewGroup)viewGroup0.getChildAt(v);
                                            if(viewGroup1 != null && viewGroup1.getChildCount() != 0) {
                                                View view1 = viewGroup1.getChildAt(0);
                                                if(view1 != null && view1 instanceof ViewGroup) {
                                                    View view2 = ((ViewGroup)view1).getChildAt(0);
                                                    if(view2 == null) {
                                                        return;
                                                    }
                                                    if(view2 instanceof ViewGroup) {
                                                        if(z || z2) {
                                                            CLS43.MTH1437(view1, ʽﹶ0.MTH2225(יﹳ0));
                                                        }
                                                        if(z1) {
                                                            String s = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                                                            if(!TextUtils.isEmpty(s)) {
                                                                int v1 = CLS46.MTH1447(s);
                                                                View view3 = ((ViewGroup)view2).getChildAt(1);
                                                                if(view3 instanceof TextView) {
                                                                    ((TextView)view3).setTextColor(v1);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else if(view2 instanceof TextView) {
                                                        if(z1) {
                                                            String s1 = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                                                            if(!TextUtils.isEmpty(s1)) {
                                                                ((TextView)view2).setTextColor(CLS46.MTH1447(s1));
                                                            }
                                                        }
                                                        CLS43.MTH1437(view1, ʽﹶ0.MTH2232());
                                                        ViewGroup viewGroup2 = (ViewGroup)((ViewGroup)view1).getChildAt(1);
                                                        for(int v2 = 0; v2 < viewGroup2.getChildCount(); ++v2) {
                                                            ViewGroup viewGroup3 = (ViewGroup)viewGroup2.getChildAt(v2);
                                                            if(viewGroup3.getChildAt(0) instanceof ViewGroup) {
                                                                ViewGroup viewGroup4 = (ViewGroup)viewGroup3.getChildAt(0);
                                                                if(z || z2) {
                                                                    CLS43.MTH1437(viewGroup4, ʽﹶ0.MTH2225(יﹳ0));
                                                                }
                                                                if(z1) {
                                                                    String s2 = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                                                                    if(!TextUtils.isEmpty(s2)) {
                                                                        int v3 = CLS46.MTH1447(s2);
                                                                        View view4 = CLS1.MTH983(viewGroup4, new int[]{0, 1});
                                                                        if(view4 instanceof TextView) {
                                                                            ((TextView)view4).setTextColor(v3);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        catch(Throwable throwable0) {
                            CLS133.MTH2113(throwable0);
                        }
                        try {
                            if(z) {
                                Context context0 = CLS133.MTH2108();
                                יﹳ0.MTH1816(CLS309.MTH2226(listView0), CLS309.MTH2242(listView0), context0, ((CLS146)new CLS319(listView0, 4)), "ContactFragmentBackground");
                                return;
                            }
                            if(z2) {
                                String s3 = יﹳ0.MTH1804("ContactFragmentBackgroundColor", "000000");
                                if(!TextUtils.isEmpty(s3)) {
                                    CLS43.MTH1437(listView0, new ColorDrawable(CLS46.MTH1447(s3)));
                                    return;
                                }
                            }
                            return;
                        }
                        catch(Throwable throwable1) {
                        }
                        CLS133.MTH2113(throwable1);
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2218(Object[] arr_object) {
        Object object1;
        CLS309 ʽﹶ0 = this.FLD999;
        ʽﹶ0.getClass();
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(CLS117.MTH1906()) {
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                boolean z = יﹳ0.MTH1818("ContactFragmentBackgroundEnable", false);
                boolean z1 = יﹳ0.MTH1818("FragmentItemViewTitleColorEnable", false);
                boolean z2 = יﹳ0.MTH1818("ContactFragmentBackgroundColorEnable", false);
                if(z || z1 || z2) {
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
                    ViewGroup viewGroup0 = (ViewGroup)CLS1.MTH980(object1, "WxRecyclerView");
                    if(viewGroup0 != null) {
                        Object object2 = CLS3.MTH991(viewGroup0, "getAdapter", new Object[0]);
                        if(object2 != null) {
                            ʽﹶ0.FLD1011 = object2;
                        }
                        if(z || z2) {
                            CLS43.MTH1427(viewGroup0, ʽﹶ0.MTH2232());
                        }
                        int v = 0;
                        while(true) {
                            try {
                                if(v >= viewGroup0.getChildCount()) {
                                    break;
                                }
                                ViewGroup viewGroup1 = (ViewGroup)viewGroup0.getChildAt(v);
                                String s = viewGroup1.getClass().getName();
                                if(s.equals("android.widget.LinearLayout")) {
                                    int v3 = 0;
                                    while(v3 < viewGroup1.getChildCount()) {
                                        ViewGroup viewGroup3 = (ViewGroup)viewGroup1.getChildAt(v3);
                                        if(z || z2) {
                                            CLS43.MTH1437(viewGroup3, ʽﹶ0.MTH2225(יﹳ0));
                                        }
                                        if(z1) {
                                            String s3 = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                                            if(!TextUtils.isEmpty(s3)) {
                                                int v4 = CLS46.MTH1447(s3);
                                                View view2 = CLS1.MTH983(viewGroup3, new int[]{0, 0, 1, 0});
                                                if(view2 == null) {
                                                    String s4 = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                                                    if(TextUtils.isEmpty(s4)) {
                                                    label_66:
                                                        View view4 = CLS1.MTH983(viewGroup3, new int[]{0, 1, 0, 0, 0, 1, 0});
                                                        if(view4 != null) {
                                                            ((TextView)view4).setTextColor(v4);
                                                        }
                                                    }
                                                    else {
                                                        int v5 = CLS46.MTH1447(s4);
                                                        View view3 = CLS1.MTH983(viewGroup3, new int[]{0, 0});
                                                        if(view3 instanceof TextView) {
                                                            ((TextView)view3).setTextColor(v5);
                                                            goto label_66;
                                                        }
                                                    }
                                                }
                                                else if(view2 instanceof TextView) {
                                                    ((TextView)view2).setTextColor(v4);
                                                }
                                            }
                                        }
                                        ++v3;
                                    }
                                }
                                else if(s.endsWith("NoDrawingCacheLinearLayout")) {
                                    if(z || z2) {
                                        CLS43.MTH1437(viewGroup1, ʽﹶ0.MTH2225(יﹳ0));
                                    }
                                    if(z1) {
                                        ViewGroup viewGroup2 = (ViewGroup)viewGroup1.getChildAt(1);
                                        String s1 = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                                        if(!TextUtils.isEmpty(s1)) {
                                            int v1 = CLS46.MTH1447(s1);
                                            View view0 = CLS1.MTH979(viewGroup2, "NoMeasuredTextView");
                                            if(view0 == null) {
                                                view0 = CLS1.MTH982(viewGroup2);
                                            }
                                            if(view0 != null) {
                                                CLS3.MTH991(view0, "setTextColor", new Object[]{v1});
                                            }
                                        }
                                        String s2 = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                                        if(!TextUtils.isEmpty(s2)) {
                                            int v2 = CLS46.MTH1447(s2);
                                            View view1 = CLS1.MTH983(viewGroup1, new int[]{0, 0});
                                            if(view1 instanceof TextView) {
                                                ((TextView)view1).setTextColor(v2);
                                            }
                                        }
                                    }
                                }
                                ++v;
                            }
                            catch(Throwable throwable0) {
                                CLS133.MTH2113(throwable0);
                                break;
                            }
                        }
                        try {
                            if(z) {
                                Context context0 = CLS133.MTH2108();
                                יﹳ0.MTH1816(CLS309.MTH2226(viewGroup0), CLS309.MTH2242(viewGroup0), context0, ((CLS146)new CLS294(viewGroup0, 1)), "ContactFragmentBackground");
                                return;
                            }
                            if(z2) {
                                String s5 = יﹳ0.MTH1804("ContactFragmentBackgroundColor", "000000");
                                if(!TextUtils.isEmpty(s5)) {
                                    CLS43.MTH1437(viewGroup0, new ColorDrawable(CLS46.MTH1447(s5)));
                                    return;
                                }
                            }
                            return;
                        }
                        catch(Throwable throwable1) {
                        }
                        CLS133.MTH2113(throwable1);
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    private final void MTH2219(Object[] arr_object) {
        Object object2;
        CLS309 ʽﹶ0 = this.FLD999;
        ʽﹶ0.getClass();
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
        Object object3 = ((Object[])object2)[0];
        Object object4 = ʽﹶ0.FLD1011;
        try {
            Field field1 = object0.getClass().getDeclaredField("thisObject");
            if(field1 != null) {
                field1.setAccessible(true);
                object1 = field1.get(object0);
            }
        }
        catch(Throwable unused_ex) {
        }
        if(object4 == object1) {
            CLS117 ˆٴ0 = CLS117.FLD842;
            ˆٴ0.getClass();
            if(CLS117.MTH1906()) {
                CLS102 יﹳ0 = ˆٴ0.MTH1905();
                if(יﹳ0 != null && !יﹳ0.MTH1819()) {
                    boolean z = יﹳ0.MTH1818("ContactFragmentBackgroundEnable", false);
                    boolean z1 = יﹳ0.MTH1818("FragmentItemViewTitleColorEnable", false);
                    boolean z2 = יﹳ0.MTH1818("ContactFragmentBackgroundColorEnable", false);
                    if(z || z1 || z2) {
                        ViewGroup viewGroup0 = (ViewGroup)CLS15.MTH1072(0xFFFF5EC92B3CF2B7L, object3);
                        View view0 = viewGroup0.getChildAt(1);
                        if(view0 != null && view0 instanceof ViewGroup) {
                            CLS43.MTH1427(viewGroup0, ʽﹶ0.MTH2232());
                            if(z || z2) {
                                CLS43.MTH1437(viewGroup0, ʽﹶ0.MTH2225(יﹳ0));
                            }
                            if(z1) {
                                String s = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                                if(!TextUtils.isEmpty(s)) {
                                    int v = CLS46.MTH1447(s);
                                    View view1 = CLS1.MTH979(((ViewGroup)view0), "NoMeasuredTextView");
                                    if(view1 == null) {
                                        view1 = CLS1.MTH982(((ViewGroup)view0));
                                    }
                                    if(view1 != null) {
                                        CLS3.MTH991(view1, "setTextColor", new Object[]{v});
                                    }
                                }
                                String s1 = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                                if(!TextUtils.isEmpty(s1)) {
                                    int v1 = CLS46.MTH1447(s1);
                                    View view2 = CLS1.MTH983(viewGroup0, new int[]{0, 0});
                                    if(view2 instanceof TextView) {
                                        ((TextView)view2).setTextColor(v1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

