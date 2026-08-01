// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import t.ʻˑ.CLS1;
import t.ʻˑ.CLS3;
import t.ʾᵢ.CLS15;
import t.ˆʿ.CLS29;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS34;
import t.ˆʿ.CLS41;
import t.ˆʿ.CLS42;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆʿ.CLS56;
import t.ˈˈ.CLS74.CLS284;
import t.ˈˈ.CLS74;
import t.ˈˈ.CLS75;
import t.ˈˊ.CLS86;
import t.ˈˊ.CLS88;
import t.ˊﾞ.CLS102;
import t.ˊﾞ.CLS105;
import t.ˊﾞ.CLS295;
import t.ˑٴ.CLS114;
import t.ٴـ.CLS117;
import t.ᐧⁱ.CLS121;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS127.CLS126;
import t.ᵔʾ.CLS132;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS139.CLS138;
import t.ⁱʾ.CLS147;
import t.ﾞᐧ.CLS157;
import t.ﾞᐧ.CLS165;

public final class CLS309 extends CLS155 {
    public boolean FLD1000;
    public ViewGroup FLD1001;
    public CLS88 FLD1002;
    public StateListDrawable FLD1003;
    public CLS88 FLD1004;
    public Object FLD1005;
    public ViewGroup FLD1006;
    public ViewGroup FLD1007;
    public View FLD1008;
    public Drawable FLD1009;
    public String FLD1010;
    public Object FLD1011;
    public CLS121 FLD1012;
    public Method FLD1013;
    public Method FLD1014;
    public ListAdapter FLD1015;
    public int FLD1016;
    public final float FLD1017;
    public CLS105 FLD1018;
    public Drawable FLD1019;
    public ColorDrawable FLD1020;
    public Object FLD1021;
    public final HashMap FLD1022;
    public Object FLD1023;
    public Object FLD1024;
    public int FLD1025;
    public ListAdapter FLD1026;
    public ViewGroup FLD1027;
    public String FLD1028;
    public StateListDrawable FLD1029;

    public CLS309(CLS150 ʻˑ0) {
        super(ʻˑ0);
        this.FLD1016 = -1;
        this.FLD1000 = false;
        this.FLD1025 = -1;
        this.FLD1022 = new HashMap();
        this.FLD1017 = Resources.getSystem().getDisplayMetrics().density / 3.0f;
    }

    // 此方法包含解密的字符串
    public final Object MTH2221() {
        try {
            Object object0 = this.FLD1021;
            if(object0 == null) {
                return null;
            }
            if(this.FLD1014 == null) {
                Object[] arr_object = {Integer.TYPE};
                this.FLD1014 = CLS1.MTH985((object0 instanceof Class ? ((Class)object0) : object0.getClass()), "", "Fragment", arr_object);
            }
            return this.FLD1014 == null ? null : CLS1.MTH984(this.FLD1014, this.FLD1021, new Object[]{2});
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return null;
        }
    }

    public final void MTH2222(Intent intent0, String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        try {
            String s1 = s.trim();
            if(!CLS33.MTH1347(intent0, s1)) {
                Activity activity0 = ((CLS155)this).MTH2306();
                intent0.setClassName(CLS56.MTH1484(activity0), s1);
                activity0.startActivity(intent0);
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final CLS88 MTH2223() {
        CLS102 יﹳ0 = CLS117.FLD842.MTH1905();
        if(יﹳ0 != null && יﹳ0.MTH1811()) {
            int v = CLS46.MTH1447(יﹳ0.MTH1804("FloatingActionMenuColor", "#FF0000"));
            int v1 = CLS46.MTH1447(יﹳ0.MTH1804("FloatingActionMenuTextColor", "#FFFFFF"));
            CLS88 ˊﾞ0 = new CLS88(CLS133.MTH2108());
            ˊﾞ0.setMenuButtonColorNormal(v);
            ˊﾞ0.setMenuButtonColorPressed(v);
            ˊﾞ0.setMenuIcon(יﹳ0.MTH1820(CLS133.MTH2108(), יﹳ0.MTH1804("FloatingActionMenuIcon", ""), false));
            ˊﾞ0.MTH1720();
            if(יﹳ0.MTH1818("FloatingActionMenuShowLabelOnRight", false)) {
                ˊﾞ0.setLabelPosition(1);
            }
            for(Object object0: יﹳ0.FLD767) {
                CLS295 ﾞˎ0 = (CLS295)object0;
                try {
                    if(!ﾞˎ0.FLD825) {
                        continue;
                    }
                    CLS86 ˆٴ0 = CLS309.MTH2243(ﾞˎ0.FLD827, יﹳ0.MTH1807(CLS133.MTH2108(), ((CLS147)ﾞˎ0)), v, v1);
                    ˆٴ0.setOnClickListener(new CLS157(this, ˊﾞ0, ﾞˎ0, 3));
                    ˊﾞ0.addView(ˆٴ0, ˊﾞ0.FLD657 - 2);
                    ++ˊﾞ0.FLD657;
                    ˊﾞ0.MTH1717(ˆٴ0);
                    ˆٴ0.MTH1685(v, v, v);
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            }
            return ˊﾞ0;
        }
        return null;
    }

    public final StateListDrawable MTH2224(Bitmap bitmap0, String s) {
        int v;
        CLS284 ˆٴ$ˆٴ0;
        if(bitmap0 == null) {
            return null;
        }
        try {
            Resources resources0 = ((CLS155)this).MTH2306().getResources();
            byte[] arr_b = bitmap0.getNinePatchChunk();
            if(arr_b != null && NinePatch.isNinePatchChunk(arr_b)) {
                ˆٴ$ˆٴ0 = CLS74.FLD568;
            }
            else if(CLS75.MTH1595(bitmap0)) {
                ˆٴ$ˆٴ0 = CLS74.FLD570;
            }
            else {
                ˆٴ$ˆٴ0 = CLS74.FLD569;
            }
            NinePatchDrawable ninePatchDrawable0 = ((CLS74)ˆٴ$ˆٴ0).MTH1582(resources0, bitmap0);
            StateListDrawable stateListDrawable0 = new StateListDrawable();
            Drawable drawable0 = ninePatchDrawable0.getConstantState().newDrawable().mutate();
            if(TextUtils.isEmpty(s)) {
                v = CLS46.MTH1449(-1);
            }
            else {
                CLS41.MTH1401(ninePatchDrawable0, CLS46.MTH1447(s));
                HashMap hashMap0 = CLS46.FLD497;
                if(hashMap0.containsKey(s)) {
                    v = (int)(((Integer)hashMap0.get(s)));
                }
                else {
                    int v1 = CLS46.MTH1449(CLS46.MTH1447(s));
                    hashMap0.put(s, v1);
                    v = v1;
                }
            }
            CLS41.MTH1401(drawable0, v);
            stateListDrawable0.addState(new int[]{0x10100A7}, drawable0);
            stateListDrawable0.addState(new int[]{0x101009C}, drawable0);
            stateListDrawable0.addState(new int[0], ninePatchDrawable0);
            return stateListDrawable0;
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
            return null;
        }
    }

    // 此方法包含解密的字符串
    public final Drawable MTH2225(CLS102 יﹳ0) {
        Drawable drawable0 = this.FLD1009;
        if(drawable0 == null) {
            Drawable drawable1 = CLS41.MTH1400(CLS46.MTH1447(יﹳ0.MTH1804("FragmentItemViewBackgroundColor", this.FLD1010)));
            this.FLD1009 = drawable1;
            return drawable1;
        }
        Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
        return drawable$ConstantState0 == null ? CLS41.MTH1400(CLS46.MTH1447(יﹳ0.MTH1804("FragmentItemViewBackgroundColor", this.FLD1010))) : drawable$ConstantState0.newDrawable().mutate();
    }

    public static int MTH2226(ViewGroup viewGroup0) {
        int v = viewGroup0.getWidth();
        return v == 0 ? Resources.getSystem().getDisplayMetrics().widthPixels : v;
    }

    public final void MTH2227(int v) {
        CLS117 ˆٴ0 = CLS117.FLD842;
        ˆٴ0.getClass();
        if(!CLS117.MTH1906()) {
            return;
        }
        CLS102 יﹳ0 = ˆٴ0.MTH1905();
        if(יﹳ0 != null && יﹳ0.MTH1811()) {
            CLS88 ˊﾞ0 = this.FLD1004;
            if(ˊﾞ0 != null) {
                ˊﾞ0.setVisibility(v);
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2228(CLS102 יﹳ0, Object object0, boolean z) {
        Drawable drawable0;
        long v;
        String s;
        View view0 = (View)CLS1.MTH980(object0, CLS133.MTH2100("MMNeatTextView", "MMNeatTextView"));
        if(view0 == null) {
            return;
        }
        if(יﹳ0.MTH1818("ChangeChatTextColor", false)) {
            if(z) {
                s = "ChatTextColorLeft";
                v = 0xFFFF763E2B3CF2B7L;
            }
            else {
                s = "ChatTextColorRight";
                v = 0xFFFF762A2B3CF2B7L;
            }
            String s1 = יﹳ0.MTH1804(s, CLS114.MTH1900(v));
            if(!TextUtils.isEmpty(s1)) {
                CLS3.MTH991(view0, "setTextColor", new Object[]{CLS46.MTH1447(s1)});
            }
        }
        if(יﹳ0.MTH1818("ChangeChatBubble", false)) {
            if(z) {
                Bitmap bitmap0 = יﹳ0.MTH1800("left_bubble.9.png");
                String s2 = יﹳ0.MTH1818("LeftChatBubbleColorEnable", false) ? יﹳ0.MTH1804("LeftChatBubbleColor", "") : "";
                StateListDrawable stateListDrawable0 = this.FLD1029;
                if(stateListDrawable0 == null) {
                    drawable0 = this.MTH2224(bitmap0, s2);
                    this.FLD1029 = drawable0;
                }
                else {
                    Drawable.ConstantState drawable$ConstantState0 = stateListDrawable0.getConstantState();
                    if(drawable$ConstantState0 == null) {
                        drawable0 = this.MTH2224(bitmap0, s2);
                        this.FLD1029 = drawable0;
                    }
                    else {
                        drawable0 = drawable$ConstantState0.newDrawable().mutate();
                    }
                }
            }
            else {
                Bitmap bitmap1 = יﹳ0.MTH1800("right_bubble.9.png");
                String s3 = יﹳ0.MTH1818("RightChatBubbleColorEnable", false) ? יﹳ0.MTH1804("RightChatBubbleColor", "") : "";
                StateListDrawable stateListDrawable1 = this.FLD1003;
                if(stateListDrawable1 == null) {
                    drawable0 = this.MTH2224(bitmap1, s3);
                    this.FLD1003 = drawable0;
                }
                else {
                    Drawable.ConstantState drawable$ConstantState1 = stateListDrawable1.getConstantState();
                    if(drawable$ConstantState1 == null) {
                        drawable0 = this.MTH2224(bitmap1, s3);
                        this.FLD1003 = drawable0;
                    }
                    else {
                        drawable0 = drawable$ConstantState1.newDrawable().mutate();
                    }
                }
            }
            CLS43.MTH1437(view0, drawable0);
        }
    }

    // 此方法包含解密的字符串
    public static void MTH2229(Object object0, Object object1, CLS102 יﹳ0) {
        if(!יﹳ0.MTH1818("HideActionBar", false)) {
            if(!יﹳ0.MTH1818("ChangeActionBarColor", false) || יﹳ0.MTH1819()) {
                return;
            }
            if(object0 != null) {
                String s = יﹳ0.MTH1804("ActionBarColor", "");
                if(TextUtils.isEmpty(s)) {
                    return;
                }
                int v = CLS46.MTH1447(s);
                CLS3.MTH991(object0, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(v)});
                return;
            }
        }
        if(object0 != null) {
            CLS3.MTH991(object0, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(0)});
            ((View)CLS3.MTH991(object0, CLS133.MTH2100("ActionBar_getCustomViewMethod", "getCustomView"), new Object[0])).setVisibility(8);
            CLS3.MTH991(object0, CLS133.MTH2100("ActionBar_hideMethod", "hide"), new Object[0]);
        }
        if(object1 != null) {
            if(CLS133.MTH2110("HomeUIMenuField1")) {
                Menu menu0 = (Menu)CLS15.MTH1072(0xFFFF76E72B3CF2B7L, object1);
                if(menu0 != null) {
                    for(int v1 = 0; v1 < menu0.size(); ++v1) {
                        menu0.getItem(v1).setVisible(false);
                    }
                }
            }
            else {
                if(CLS133.MTH2110("HomeUIMenuItemField1")) {
                    MenuItem menuItem0 = (MenuItem)CLS15.MTH1072(-150902950530377L, object1);
                    if(menuItem0 != null) {
                        menuItem0.setVisible(false);
                    }
                }
                if(CLS133.MTH2110("HomeUIMenuItemField2")) {
                    MenuItem menuItem1 = (MenuItem)CLS15.MTH1072(0xFFFF76972B3CF2B7L, object1);
                    if(menuItem1 != null) {
                        menuItem1.setVisible(false);
                    }
                }
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2230(CLS102 יﹳ0, View view0, String s, String s1, String s2, String s3) {
        Drawable drawable1;
        boolean z = false;
        if(יﹳ0.MTH1818("FragmentItemViewTitleColorEnable", false)) {
            try {
                Object object0 = view0.getTag();
                if(object0 != null) {
                    Object object1 = CLS3.MTH989(object0, s1);
                    Object object2 = CLS3.MTH989(object0, s2);
                    Object object3 = CLS3.MTH989(object0, s3);
                    String s4 = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                    if(!TextUtils.isEmpty(s4)) {
                        CLS3.MTH991(object2, "setTextColor", new Object[]{CLS46.MTH1447(s4)});
                    }
                    String s5 = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                    if(!TextUtils.isEmpty(s5)) {
                        int v = CLS46.MTH1447(s5);
                        CLS3.MTH991(object1, "setTextColor", new Object[]{v});
                        CLS3.MTH991(object3, "setTextColor", new Object[]{v});
                    }
                }
            }
            catch(Throwable throwable0) {
                CLS133.MTH2113(throwable0);
            }
        }
        if(יﹳ0.MTH1818("MainFragmentBackgroundEnable", false) || יﹳ0.MTH1818("MainFragmentBackgroundColorEnable", false)) {
            if("message_fold".equals(s)) {
                CLS43.MTH1427(view0, this.MTH2232());
            }
            Class class0 = CLS133.MTH2111("dbClass1");
            if(class0 != null) {
                z = ((Boolean)CLS3.MTH991(CLS3.MTH991(CLS3.MTH996(class0, CLS133.MTH2115("dbMethod1"), new Object[0]), CLS133.MTH2115("delMethod8"), new Object[0]), CLS133.MTH2115("placeToTopMethod1"), new Object[]{s})).booleanValue();
            }
            if(z) {
                Drawable drawable0 = this.FLD1019;
                if(drawable0 == null) {
                    drawable1 = CLS41.MTH1400(CLS46.MTH1447(יﹳ0.MTH1804("FragmentItemViewStickyBackgroundColor", this.FLD1028)));
                    this.FLD1019 = drawable1;
                }
                else {
                    Drawable.ConstantState drawable$ConstantState0 = drawable0.getConstantState();
                    drawable1 = drawable$ConstantState0 == null ? CLS41.MTH1400(CLS46.MTH1447(יﹳ0.MTH1804("FragmentItemViewStickyBackgroundColor", this.FLD1028))) : drawable$ConstantState0.newDrawable().mutate();
                }
            }
            else {
                drawable1 = this.MTH2225(יﹳ0);
            }
            CLS43.MTH1437(view0, drawable1);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2231(ViewGroup viewGroup0) {
        CLS102 יﹳ0 = CLS117.FLD842.MTH1905();
        if(יﹳ0 != null && !יﹳ0.MTH1819()) {
            boolean z = יﹳ0.MTH1818("ContactFragmentBackgroundEnable", false);
            boolean z1 = יﹳ0.MTH1818("FragmentItemViewTitleColorEnable", false);
            boolean z2 = יﹳ0.MTH1818("ContactFragmentBackgroundColorEnable", false);
            if(!z && !z1 && !z2) {
                return;
            }
            CLS43.MTH1427(viewGroup0, this.MTH2232());
            int v = 0;
            while(true) {
                try {
                    if(v >= viewGroup0.getChildCount()) {
                        break;
                    }
                    ViewGroup viewGroup1 = (ViewGroup)viewGroup0.getChildAt(v);
                    if(z || z2) {
                        CLS43.MTH1437(viewGroup1, this.MTH2225(יﹳ0));
                    }
                    if(z1) {
                        String s = יﹳ0.MTH1804("FragmentItemViewTitleColor", "");
                        if(!TextUtils.isEmpty(s)) {
                            int v1 = CLS46.MTH1447(s);
                            View view0 = CLS1.MTH983(viewGroup1, new int[]{0, 0, 1, 0});
                            if(view0 == null) {
                                String s1 = יﹳ0.MTH1804("FragmentItemViewSubTitleColor", "");
                                if(TextUtils.isEmpty(s1)) {
                                label_25:
                                    View view2 = CLS1.MTH983(viewGroup1, new int[]{0, 1, 0, 0, 0, 1, 0});
                                    if(view2 != null) {
                                        ((TextView)view2).setTextColor(v1);
                                    }
                                }
                                else {
                                    int v2 = CLS46.MTH1447(s1);
                                    View view1 = CLS1.MTH983(viewGroup1, new int[]{0, 0});
                                    if(view1 instanceof TextView) {
                                        ((TextView)view1).setTextColor(v2);
                                        goto label_25;
                                    }
                                }
                            }
                            else {
                                ((TextView)view0).setTextColor(v1);
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
        }
    }

    public final ColorDrawable MTH2232() {
        if(this.FLD1020 == null) {
            this.FLD1020 = new ColorDrawable(0);
        }
        return this.FLD1020;
    }

    // 此方法包含解密的字符串
    public final void MTH2233(String s, ContentValues contentValues0, String[] arr_s) {
        boolean z1;
        boolean z;
        if("rconversation".equalsIgnoreCase(s)) {
            String s1 = "";
            CLS150 ʻˑ0 = this.FLD1085;
            if(!TextUtils.isEmpty(ʻˑ0.FLD994)) {
                if(arr_s != null) {
                    s1 = arr_s[0];
                }
                if(TextUtils.isEmpty(s1)) {
                    s1 = contentValues0.containsKey("username") ? contentValues0.getAsString("username") : "";
                }
                if(!TextUtils.isEmpty(s1) && !s1.equals(ʻˑ0.FLD994) && !CLS33.MTH1346(s1) && (TextUtils.isEmpty(s1) || !s1.startsWith("gh_") && !s1.equals("weixin"))) {
                    if(TextUtils.isEmpty(s1)) {
                        z1 = false;
                    }
                    else {
                        for(int v = 0; true; ++v) {
                            z = false;
                            if(v >= 16) {
                                break;
                            }
                            String s2 = new String[]{"filehelper", "qqmail", "floatbottle", "shakeapp", "medianote", "newsapp", "facebookapp", "qqfriend", "feedsapp", "voipapp", "officialaccounts", "voicevoipapp", "linkedinplugin", "notifymessage", "appbrandcustomerservicemsg", "fmessage"}[v];
                            if(!TextUtils.isEmpty(s2) && s1.equalsIgnoreCase(s2)) {
                                z = true;
                                break;
                            }
                        }
                        z1 = z;
                    }
                    if(!z1) {
                        CLS102 יﹳ0 = CLS117.FLD842.MTH1905();
                        if((!CLS29.MTH1326(s1) || !יﹳ0.MTH1818("RecentChatFloatingActionMenuExcludeChatrooms", false)) && (!CLS123.FLD912.MTH2000("isHidden", new Object[]{s1}) && (this.FLD1002 != null && !this.FLD1002.FLD658))) {
                            CLS327 ⁱʽ0 = new CLS327(this, 0);
                            CLS137.FLD972.MTH2145(((CLS136)ⁱʽ0));
                        }
                    }
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    // 此方法包含解密的字符串
    @Override  // t.ﾞٴ.CLS155
    public final void MTH2307(CLS123 ʾᵢ0) {
        ʾᵢ0.MTH2002("apply_theme", ((CLS138)new CLS315(this, ʾᵢ0, 0)));
        ʾᵢ0.MTH2002("apply_theme_no_settings", ((CLS138)new CLS315(this, ʾᵢ0, 2)));
        CLS15.MTH1078(this, 8, ʾᵢ0, "AfterGetAvatar");
        CLS15.MTH1078(this, 9, ʾᵢ0, "onGetViewConversationAdapter");
        CLS15.MTH1078(this, 10, ʾᵢ0, CLS15.MTH1075(7, ʾᵢ0, "a.on_LauncherUI_onCreateOptionsMenu", 0xFFFF90FF2B3CF2B7L));
        CLS15.MTH1078(this, 11, ʾᵢ0, "a.on_LauncherUI_dispatchKeyEvent");
        CLS15.MTH1078(this, 12, ʾᵢ0, "a.on_LauncherUI_onResume");
        CLS15.MTH1078(this, 13, ʾᵢ0, CLS15.MTH1075(8, ʾᵢ0, "a.on_MMActivity_onCreate", 0xFFFF90992B3CF2B7L));
        ʾᵢ0.MTH2002("onlauncheruienter", ((CLS138)new CLS315(this, ʾᵢ0, 1)));
        CLS15.MTH1078(this, 0, ʾᵢ0, "a.on_LauncherUI_onResume,onlauncherui_enter");
        ʾᵢ0.MTH2009("getThemeVersion", ((CLS126)new CLS325(((CLS155)this), 1)));
        ʾᵢ0.MTH2009("isThemeEnable", ((CLS126)new CLS320(1)));
        ʾᵢ0.MTH2009("getThemeString", ((CLS126)new CLS320(2)));
        ʾᵢ0.MTH2009("getThemeImage", ((CLS126)new CLS320(3)));
        CLS15.MTH1078(this, 1, ʾᵢ0, "a.async.sqldb.insert");
        CLS15.MTH1078(this, 2, ʾᵢ0, "a.async.sqldb.update");
        CLS15.MTH1078(this, 3, ʾᵢ0, "on_voipClass_call");
        CLS15.MTH1078(this, 4, ʾᵢ0, "on_voipClass_call2");
        CLS15.MTH1078(this, 5, ʾᵢ0, "on_VoipMgrOnFinishMethod");
        if(Build.FINGERPRINT.toLowerCase().contains("meizu") || Build.MANUFACTURER.equalsIgnoreCase("meizu")) {
            CLS15.MTH1078(this, 6, ʾᵢ0, "a.chattingui.oncreateoptionsmenu2");
            CLS15.MTH1078(this, 7, ʾᵢ0, "b.on_LauncherUI_onCreateOptionsMenu,onlauncheruienter,a.on_chattingUICloseClass_chattingUICloseMethod");
        }
        CLS123 ʾᵢ1 = CLS123.FLD912;
        CLS15.MTH1071(this, 23, ʾᵢ1, CLS15.MTH1075(16, ʾᵢ1, "on_ConversationWithAppBrandListViewClass_isAppBrandHeaderEnableMethod", 0xFFFF81B62B3CF2B7L));
        CLS15.MTH1071(this, 11, ʾᵢ1, "on_MoreTabUIDrawerClass_MoreTabUIOnDrawerOpen");
        CLS15.MTH1071(this, 12, ʾᵢ1, "on_MoreTabUIDrawerClass_MoreTabUIOnDrawerClose");
        ʾᵢ1.MTH2002("on_ChatFooterChangeInputModeMethod", ((CLS138)new CLS329(1)));
        CLS15.MTH1071(this, 24, ʾᵢ1, "on_ChatFooterChangeSmileyMethod");
        ʾᵢ1.MTH2002("on_ChatFooterSetSmileyButtonMethod", ((CLS138)new CLS329(2)));
        ʾᵢ1.MTH2002("on_ChatFooter", ((CLS138)new CLS329(3)));
        ʾᵢ1.MTH2002("a.chat.onresume", ((CLS138)new CLS329(4)));
        CLS15.MTH1071(this, 2, ʾᵢ1, CLS15.MTH1075(15, ʾᵢ1, CLS15.MTH1075(14, ʾᵢ1, CLS15.MTH1075(13, ʾᵢ1, CLS15.MTH1075(12, ʾᵢ1, CLS15.MTH1075(11, ʾᵢ1, "on_resources_getColor", 0xFFFF7A8E2B3CF2B7L), 0xFFFF7A7F2B3CF2B7L), 0xFFFF7A602B3CF2B7L), 0xFFFF7A382B3CF2B7L), 0xFFFF7A262B3CF2B7L));
        CLS15.MTH1071(this, 3, ʾᵢ1, "on_TabPageClass_TabPageSelectMethod");
        CLS15.MTH1071(this, 4, ʾᵢ1, "on_setUnreadClass_SetContactTabUnread");
        CLS15.MTH1071(this, 5, ʾᵢ1, "on_setUnreadClass_SetFriendTabUnread");
        CLS15.MTH1071(this, 6, ʾᵢ1, "on_setUnreadClass_SetShowFriendPoint");
        CLS15.MTH1071(this, 0, ʾᵢ1, "on_setUnreadClass_SetSettingsTabUnread");
        CLS15.MTH1071(this, 1, ʾᵢ1, "on_setUnreadClass_SetSettingsPoint");
        CLS15.MTH1078(this, 29, ʾᵢ1, "on_ChattingBackgroundClass1_ChattingBackgroundMethod1");
        CLS15.MTH1071(this, 15, ʾᵢ1, "on_ChatItemViewHolderClass_ChatItemViewMethod1");
        CLS15.MTH1071(this, 16, ʾᵢ1, "on_ChatQuoteItemViewHolderClass_1_ChatQuoteItemViewMethod1");
        CLS15.MTH1071(this, 17, ʾᵢ1, "on_ChatQuoteItemViewHolderClass_2_ChatQuoteItemViewMethod1");
        CLS15.MTH1071(this, 18, ʾᵢ1, "b.on_view_setBackgroundDrawable");
        CLS15.MTH1071(this, 19, ʾᵢ1, "on_ChatItemAudioViewHolderClass_ChatItemAudioViewMethod1");
        CLS15.MTH1071(this, 20, ʾᵢ1, "a.ChattingDataAdapterV3_onBindView");
        CLS15.MTH1071(this, 21, ʾᵢ1, "after_msgClass_MsgInfoIsShowTimeMethod3");
        CLS15.MTH1071(this, 22, ʾᵢ1, "after_msgClass_MsgInfoIsShowTimeMethod2");
        CLS15.MTH1071(this, 7, ʾᵢ1, CLS15.MTH1075(28, ʾᵢ1, CLS15.MTH1075(27, ʾᵢ1, CLS15.MTH1075(26, ʾᵢ1, CLS15.MTH1075(17, ʾᵢ1, "on_AddressUIFragmentSetPaddingClass_run", 0xFFFF81772B3CF2B7L), 0xFFFF815A2B3CF2B7L), 0xFFFF81322B3CF2B7L), 0xFFFF81172B3CF2B7L));
        CLS15.MTH1071(this, 8, ʾᵢ1, "on_TabPageClass_TabPageScrolledMethod");
        CLS15.MTH1071(this, 9, ʾᵢ1, "on_WeToolHelper_GetStatusBarHeightMethod");
        CLS15.MTH1071(this, 10, ʾᵢ1, CLS15.MTH1075(29, ʾᵢ1, "on_HomeUIUpdateStatusBar", 0xFFFF80902B3CF2B7L));
        ʾᵢ1.MTH2002("on_ActionBarContainerClass_setPrimaryBackgroundMethod", ((CLS138)new CLS329(0)));
        CLS15.MTH1078(this, 20, ʾᵢ1, CLS15.MTH1075(9, ʾᵢ1, CLS15.MTH1075(25, ʾᵢ1, CLS15.MTH1075(24, ʾᵢ1, CLS15.MTH1075(23, ʾᵢ1, CLS15.MTH1075(22, ʾᵢ1, CLS15.MTH1075(21, ʾᵢ1, CLS15.MTH1075(20, ʾᵢ1, CLS15.MTH1075(19, ʾᵢ1, CLS15.MTH1075(18, ʾᵢ1, "on_setStatusBarColorClass1_setStatusBarColorMethod2", 0xFFFF80132B3CF2B7L), 0xFFFF7FDF2B3CF2B7L), 0xFFFF7FAA2B3CF2B7L), 0xFFFF7F5A2B3CF2B7L), 0xFFFF7F252B3CF2B7L), 0xFFFF7EF82B3CF2B7L), 0xFFFF7EC52B3CF2B7L), -144000938085705L), 0xFFFF7CF52B3CF2B7L));
        CLS15.MTH1078(this, 21, ʾᵢ1, "on_TabAddressClass_TabResumeMethod");
        CLS15.MTH1078(this, 22, ʾᵢ1, "on_MvvmAddressUIFragmentClass3");
        CLS15.MTH1078(this, 23, ʾᵢ1, "on_wxrecycler_adapter_addheaderview");
        CLS15.MTH1078(this, 24, ʾᵢ1, "on_wxrecycler_adapter_addheaderview2");
        CLS15.MTH1078(this, 25, ʾᵢ1, "on_WxRecyclerAdapterClass_bindviewholder");
        CLS15.MTH1078(this, 26, ʾᵢ1, "on_MvvmAddressUIFragment_TabResumeMethod");
        CLS15.MTH1078(this, 27, ʾᵢ1, "on_AddressAdapterClass_getView");
        CLS15.MTH1078(this, 28, ʾᵢ1, "on_AddressAdapterClass2_getView");
        CLS15.MTH1078(this, 14, ʾᵢ1, "on_TabDiscoverClass_TabResumeMethod");
        CLS15.MTH1078(this, 15, ʾᵢ1, "on_TabMeClass_onResume");
        CLS15.MTH1078(this, 16, ʾᵢ1, "on_MMPreferenceAdapterClass_getView");
        CLS15.MTH1078(this, 17, ʾᵢ1, "on_MMPreferenceAdapterClass2_getView");
        CLS15.MTH1078(this, 18, ʾᵢ1, "on_MMPreferenceAdapterClass3_getView");
        CLS15.MTH1078(this, 19, ʾᵢ1, "on_View_setBackgroundColor");
        CLS15.MTH1071(this, 13, ʾᵢ1, CLS15.MTH1075(10, ʾᵢ1, "on_View_setBackground", 0xFFFF7AD72B3CF2B7L));
        CLS15.MTH1071(this, 14, ʾᵢ1, "on_ConvBoxClass3_getView");
    }

    // 此方法包含解密的字符串
    public final void MTH2235() {
        try {
            CLS117 ˆٴ0 = CLS117.FLD842;
            ˆٴ0.getClass();
            if(!CLS117.MTH1906()) {
                return;
            }
            CLS102 יﹳ0 = ˆٴ0.MTH1905();
            if(יﹳ0 == null) {
                return;
            }
            Activity activity0 = this.FLD1085.MTH2205();
            if(activity0 == null) {
                return;
            }
            Object object0 = CLS3.MTH991(activity0, "getSupportActionBar", new Object[0]);
            if(object0 == null) {
                return;
            }
            if(יﹳ0.MTH1818("HideActionBar", false)) {
                if(((Boolean)CLS3.MTH991(object0, CLS133.MTH2100("ActionBar_isShowingMethod", "isShowing"), new Object[0])).booleanValue()) {
                    CLS3.MTH991(object0, CLS133.MTH2100("ActionBar_hideMethod", "hide"), new Object[0]);
                }
                return;
            }
            if(יﹳ0.MTH1818("ChangeActionBarColor", false) && !יﹳ0.MTH1819()) {
                String s = יﹳ0.MTH1804("ActionBarColor", "");
                if(!TextUtils.isEmpty(s)) {
                    Object object1 = CLS1.MTH980(object0, "ActionBarContainer");
                    if(object1 != null) {
                        Drawable drawable0 = (Drawable)CLS3.MTH991(object1, "getBackground", new Object[0]);
                        if(drawable0 != null && drawable0 instanceof ColorDrawable) {
                            int v = ((ColorDrawable)drawable0).getColor();
                            if(v == 0 || v == CLS46.MTH1447("#F2F2F2") || v == CLS46.MTH1447(s)) {
                                return;
                            }
                        }
                    }
                    CLS3.MTH991(object0, CLS133.MTH2100("ActionBar_setBackgroundDrawableMethod", "setBackgroundDrawable"), new Object[]{new ColorDrawable(CLS46.MTH1447(s))});
                }
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    public final void MTH2236() {
        this.FLD1009 = null;
        this.FLD1019 = null;
        this.FLD1012 = null;
        this.FLD1003 = null;
        this.FLD1029 = null;
        CLS41.FLD488.clear();
        CLS41.FLD490.clear();
        CLS41.FLD489.clear();
        CLS132.FLD942.MTH1895();
        CLS132.FLD943.clear();
        CLS102 יﹳ0 = CLS117.FLD842.MTH1905();
        if(יﹳ0 != null) {
            יﹳ0.FLD771.clear();
            יﹳ0.MTH1806();
        }
    }

    // 此方法包含解密的字符串
    public final int MTH2237() {
        int v = this.FLD1016;
        if(v != -1) {
            return v;
        }
        int v1 = Integer.parseInt(CLS133.MTH2100("wx_theme_ver", "0"));
        this.FLD1016 = v1;
        return v1;
    }

    // 此方法包含解密的字符串
    public final void MTH2238(CLS147 ⁱʾ0) {
        long v;
        String s;
        CLS327 ⁱʽ0;
        CLS137 ⁱᵔ0;
        Object object0;
        long v1;
        Intent intent0;
        switch(ⁱʾ0.MTH2191()) {
            case "addfriend": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF85782B3CF2B7L)));
                return;
            }
            case "appbrand": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF853A2B3CF2B7L)));
                return;
            }
            case "drawer_toggle": {
                Object[] arr_object1 = {Boolean.valueOf(CLS117.FLD842.MTH1905().MTH1818("DrawerOpenRight", false))};
                CLS123.FLD912.MTH2004("core", "DrawerLayout_toggleDrawer", arr_object1);
                return;
            }
            case "emoji": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF84B92B3CF2B7L)));
                return;
            }
            case "favorite": {
                this.MTH2245(CLS133.MTH2100("FavoriteIndexUI2", CLS133.MTH2115("FavoriteIndexUI")));
                return;
            }
            case "ftssearch": {
                if(this.FLD1024 == null) {
                    this.FLD1024 = this.MTH2221();
                }
                object0 = this.FLD1024;
                if(object0 == null) {
                    this.MTH2244(2);
                    ⁱᵔ0 = CLS137.FLD972;
                    ⁱʽ0 = new CLS327(this, 2);
                    ⁱᵔ0.MTH2139(((CLS136)ⁱʽ0), 3000L);
                    return;
                }
                s = "find_friends_by_search";
                v = 0xFFFF845C2B3CF2B7L;
                this.MTH2239(object0, s, CLS133.MTH2115(CLS114.MTH1900(v)));
                return;
            }
            case "gamecenterui": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF84802B3CF2B7L)));
                return;
            }
            case "groupchat": {
                String s1 = CLS133.MTH2115("SelectContactUI");
                if(!TextUtils.isEmpty(s1)) {
                    try {
                        Intent intent1 = new Intent();
                        intent1.putExtra("list_attr", 4951);
                        intent1.putExtra("list_type", 0);
                        intent1.putExtra("titile", CLS133.MTH2099("start_groupchat"));
                        intent1.putExtra("scene", 7);
                        intent1.putExtra("max_limit_num", 6000);
                        this.MTH2222(intent1, s1);
                    }
                    catch(Throwable throwable0) {
                        CLS133.MTH2113(throwable0);
                    }
                    return;
                }
                break;
            }
            case "live_stream": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF83A22B3CF2B7L)));
                return;
            }
            case "nearbyfriends": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF84EE2B3CF2B7L)));
                break;
            }
            case "qrcode": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF84242B3CF2B7L)));
                return;
            }
            case "scan": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF85832B3CF2B7L)));
                return;
            }
            case "search": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF85B52B3CF2B7L)));
                return;
            }
            case "settings": {
                if(!CLS33.MTH1349("setting", ".ui.setting.SettingsUI", new Intent())) {
                    this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF848B2B3CF2B7L)));
                    return;
                }
                break;
            }
            case "shake": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF84DE2B3CF2B7L)));
                return;
            }
            case "snsuser": {
                intent0 = new Intent();
                intent0.putExtra("sns_userName", CLS133.MTH2112());
                v1 = 0xFFFF84C32B3CF2B7L;
                this.MTH2222(intent0, CLS133.MTH2115(CLS114.MTH1900(v1)));
                return;
            }
            case "switch_account": {
                intent0 = new Intent();
                intent0.putExtra("key_scene", 0);
                v1 = 0xFFFF840D2B3CF2B7L;
                this.MTH2222(intent0, CLS133.MTH2115(CLS114.MTH1900(v1)));
                return;
            }
            case "tab_contacts": {
                this.MTH2244(1);
                return;
            }
            case "tab_discover": {
                this.MTH2244(2);
                return;
            }
            case "tab_main": {
                this.MTH2244(0);
                return;
            }
            case "tab_me": {
                this.MTH2244(3);
                return;
            }
            case "timeline": {
                if(this.FLD1024 == null) {
                    this.FLD1024 = this.MTH2221();
                }
                object0 = this.FLD1024;
                if(object0 == null) {
                    this.MTH2244(2);
                    ⁱᵔ0 = CLS137.FLD972;
                    ⁱʽ0 = new CLS327(this, 1);
                    ⁱᵔ0.MTH2139(((CLS136)ⁱʽ0), 3000L);
                    return;
                }
                s = "album_dyna_photo_ui_title";
                v = 0xFFFF85912B3CF2B7L;
                this.MTH2239(object0, s, CLS133.MTH2115(CLS114.MTH1900(v)));
                return;
            }
            case "topstories": {
                if(this.FLD1024 == null) {
                    this.FLD1024 = this.MTH2221();
                }
                object0 = this.FLD1024;
                if(object0 == null) {
                    this.MTH2244(2);
                    ⁱᵔ0 = CLS137.FLD972;
                    ⁱʽ0 = new CLS327(this, 3);
                    ⁱᵔ0.MTH2139(((CLS136)ⁱʽ0), 3000L);
                    return;
                }
                s = "find_friends_by_look";
                v = 0xFFFF84332B3CF2B7L;
                this.MTH2239(object0, s, CLS133.MTH2115(CLS114.MTH1900(v)));
                return;
            }
            case "video_channels": {
                intent0 = new Intent();
                intent0.putExtra("FROM_SCENE_KEY", 2);
                v1 = 0xFFFF83B72B3CF2B7L;
                this.MTH2222(intent0, CLS133.MTH2115(CLS114.MTH1900(v1)));
                return;
            }
            case "wallet": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(0xFFFF85672B3CF2B7L)));
                return;
            }
            case "walletcoin": {
                this.MTH2245(CLS133.MTH2115(CLS114.MTH1900(-135071701077321L)));
                return;
            }
            case "wexposed": {
                CLS123.FLD912.MTH2004("core", "show_wexposed_main_options", new Object[0]);
                return;
            }
            default: {
                if(ⁱʾ0.MTH2191().startsWith("wx_")) {
                    Object[] arr_object = {ⁱʾ0.MTH2191().substring(3)};
                    CLS123.FLD912.MTH1997("plus.config", arr_object);
                    return;
                }
                this.MTH2245(ⁱʾ0.MTH2186());
            }
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2239(Object object0, String s, String s1) {
        try {
            if(object0 == null) {
                this.MTH2245(s1);
                return;
            }
            Class class0 = CLS133.MTH2111("preferenceClass");
            if(class0 == null) {
                return;
            }
            Object object1 = CLS3.MTH988(class0, new Object[]{CLS133.MTH2108()});
            CLS3.MTH991(object1, CLS133.MTH2100("PreferenceSetKeyMethod", "setKey"), new Object[]{s});
            if(this.FLD1013 == null) {
                Class class1 = Boolean.TYPE;
                this.FLD1013 = CLS1.MTH985((object0 instanceof Class ? ((Class)object0) : object0.getClass()), "", class1, new Object[]{"preference", "preference"});
            }
            Method method0 = this.FLD1013;
            if(method0 == null) {
                this.MTH2245(s1);
                return;
            }
            CLS1.MTH984(method0, object0, new Object[]{null, object1});
        }
        catch(Throwable throwable0) {
            this.MTH2245(s1);
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH2240(CLS88 ˊﾞ0) {
        BitmapDrawable bitmapDrawable0;
        this.FLD1002 = ˊﾞ0;
        ˊﾞ0.MTH1719(true);
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < ˊﾞ0.getChildCount(); ++v) {
            View view0 = ˊﾞ0.getChildAt(v);
            if(view0 != ˊﾞ0.FLD690 && view0 != ˊﾞ0.FLD670 && view0 instanceof CLS86) {
                arrayList0.add(((CLS86)view0));
            }
        }
        for(Object object0: arrayList0) {
            ˊﾞ0.removeView(((CLS86)object0).getLabelView());
            ˊﾞ0.removeView(((CLS86)object0));
            --ˊﾞ0.FLD657;
        }
        HashSet hashSet0 = new HashSet();
        hashSet0.add("filehelper");
        hashSet0.add("qqmail");
        hashSet0.add("floatbottle");
        hashSet0.add("shakeapp");
        hashSet0.add("medianote");
        hashSet0.add("newsapp");
        hashSet0.add("facebookapp");
        hashSet0.add("qqfriend");
        hashSet0.add("feedsapp");
        hashSet0.add("voipapp");
        hashSet0.add("officialaccounts");
        hashSet0.add("voicevoipapp");
        hashSet0.add("linkedinplugin");
        hashSet0.add("notifymessage");
        hashSet0.add("appbrandcustomerservicemsg");
        hashSet0.add("fmessage");
        CLS102 יﹳ0 = CLS117.FLD842.MTH1905();
        String s = יﹳ0.MTH1818("RecentChatFloatingActionMenuExcludeChatrooms", false) ? " and username not like \'%@%\' " : "";
        int v1 = יﹳ0.MTH1817(9, "RecentChatFloatingActionMenuMax");
        CLS34 ˊⁱ0 = CLS34.FLD463;
        Cursor cursor0 = ˊⁱ0.MTH1364("select username,unReadCount,conversationTime from rconversation where username not like \'gh^_%\' ESCAPE \'^\' and username not like \'wx^_%\' ESCAPE \'^\' " + s + "and username not in (\'" + TextUtils.join("\',\'", hashSet0) + "\') and parentRef is null order by conversationTime desc limit " + v1, null);
        if(cursor0 == null) {
            return;
        }
        SparseArray sparseArray0 = new SparseArray(cursor0.getCount());
        if(cursor0.moveToFirst()) {
            while(true) {
                String s1 = cursor0.getString(cursor0.getColumnIndex("username"));
                if(!CLS123.FLD912.MTH2000("isHidden", new Object[]{s1})) {
                    int v2 = cursor0.getInt(cursor0.getColumnIndex("unReadCount"));
                    int v3 = cursor0.getInt(cursor0.getColumnIndex("conversationTime"));
                    ContentValues contentValues0 = new ContentValues();
                    contentValues0.put("username", s1);
                    contentValues0.put("count", v2);
                    sparseArray0.put(v3, contentValues0);
                }
                if(!cursor0.moveToNext()) {
                    break;
                }
            }
        }
        if(!cursor0.isClosed()) {
            cursor0.close();
        }
        int v4 = CLS46.MTH1447(יﹳ0.MTH1804("RecentChatFloatingActionMenuTextColor", "#FFFFFF"));
        int v5 = 0;
        while(v5 < sparseArray0.size()) {
            ContentValues contentValues1 = (ContentValues)sparseArray0.get(sparseArray0.keyAt(v5));
            String s2 = contentValues1.getAsString("username");
            int v6 = (int)contentValues1.getAsInteger("count");
            int v7 = CLS46.MTH1447(יﹳ0.MTH1804("RecentChatFloatingActionMenuColor", "#0000FF"));
            String s3 = ˊⁱ0.MTH1367(s2);
            if(TextUtils.isEmpty(s3)) {
                if(CLS29.MTH1326(s2)) {
                    Cursor cursor1 = ˊⁱ0.MTH1364(CLS133.MTH2116("q_db18"), new String[]{s2});
                    if(cursor1 == null) {
                        s3 = null;
                        goto label_75;
                    }
                    else {
                        if(cursor1.moveToFirst()) {
                            s3 = cursor1.getString(cursor1.getColumnIndex("displayname"));
                        }
                        cursor1.close();
                        if(!TextUtils.isEmpty(s3)) {
                            s3 = CLS34.MTH1366(s3);
                            goto label_75;
                        }
                    }
                }
                s3 = s2;
            }
        label_75:
            if(v6 > 0) {
                s3 = s3 + " (" + v6 + ")";
                v7 = CLS46.MTH1449(v7);
            }
            Bitmap bitmap0 = CLS42.MTH1410(s2);
            if(bitmap0 == null) {
                bitmapDrawable0 = null;
            }
            else {
                Bitmap bitmap1 = CLS41.MTH1402(CLS41.MTH1403(bitmap0), this.FLD1017);
                bitmapDrawable0 = new BitmapDrawable(CLS133.MTH2108().getResources(), bitmap1);
            }
            CLS86 ˆٴ0 = CLS309.MTH2243(s3, bitmapDrawable0, v7, v4);
            ˆٴ0.setOnClickListener(new CLS165(this, s2, 1));
            ˆٴ0.setOnLongClickListener(new CLS152(this, s2));
            ˊﾞ0.addView(ˆٴ0, ˊﾞ0.FLD657 - 2);
            ++ˊﾞ0.FLD657;
            ˊﾞ0.MTH1717(ˆٴ0);
            ˆٴ0.MTH1685(v7, v7, v7);
            ++v5;
        }
    }

    // 此方法包含解密的字符串
    public static void MTH2241(CLS102 יﹳ0, TextView textView0, int v) {
        if(v == 1) {
            if(יﹳ0.MTH1818("RightChatUserTVTextColorEnable", false)) {
                String s = יﹳ0.MTH1804("RightChatUserTVTextColor", "");
                if(!TextUtils.isEmpty(s)) {
                    textView0.setTextColor(CLS46.MTH1447(s));
                }
            }
            if(יﹳ0.MTH1818("RightChatUserTVBackgroundColorEnable", false)) {
                String s1 = יﹳ0.MTH1804("RightChatUserTVBackgroundColor", "");
                if(!TextUtils.isEmpty(s1)) {
                    CLS43.MTH1437(textView0, new ColorDrawable(CLS46.MTH1447(s1)));
                }
            }
        }
        else {
            if(יﹳ0.MTH1818("LeftChatUserTVTextColorEnable", false)) {
                String s2 = יﹳ0.MTH1804("LeftChatUserTVTextColor", "");
                if(!TextUtils.isEmpty(s2)) {
                    textView0.setTextColor(CLS46.MTH1447(s2));
                }
            }
            if(יﹳ0.MTH1818("LeftChatUserTVBackgroundColorEnable", false)) {
                String s3 = יﹳ0.MTH1804("LeftChatUserTVBackgroundColor", "");
                if(!TextUtils.isEmpty(s3)) {
                    CLS43.MTH1437(textView0, new ColorDrawable(CLS46.MTH1447(s3)));
                }
            }
        }
    }

    public static int MTH2242(ViewGroup viewGroup0) {
        int v = viewGroup0.getHeight();
        return v == 0 ? Resources.getSystem().getDisplayMetrics().heightPixels : v;
    }

    public static CLS86 MTH2243(String s, BitmapDrawable bitmapDrawable0, int v, int v1) {
        CLS86 ˆٴ0 = new CLS86(CLS133.MTH2108());
        ˆٴ0.setColorNormal(v);
        ˆٴ0.setColorPressed(v);
        ˆٴ0.setButtonSize(1);
        ˆٴ0.setLabelText(s);
        ˆٴ0.setImageDrawable(bitmapDrawable0);
        ˆٴ0.setLabelTextColor(v1);
        return ˆٴ0;
    }

    public final void MTH2244(int v) {
        try {
            View view0 = CLS1.MTH983(this.FLD1006, new int[]{0, v});
            if(view0 != null) {
                view0.performClick();
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    public final void MTH2245(String s) {
        if(TextUtils.isEmpty(s)) {
            return;
        }
        this.MTH2222(new Intent(), s);
    }
}

