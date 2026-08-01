// Decompiled by JEB v5.42.0.202606242140

package t.ˊﾞ;

import android.app.Activity;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import t.ʻˑ.CLS3;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS34;
import t.ˆʿ.CLS43;
import t.ˆʿ.CLS46;
import t.ˆٴ.CLS67;
import t.ˑٴ.CLS114;
import t.ᵔʾ.CLS123;
import t.ᵔʾ.CLS133;
import t.ᵔʾ.CLS137.CLS136;
import t.ᵔʾ.CLS137;
import t.ᵔʾ.CLS139.CLS138;
import t.ⁱʾ.CLS143;
import t.ⁱʾ.CLS146;
import t.ﾞٴ.CLS315;
import t.ﾞᐧ.CLS180;

public final class CLS105 {
    public static final class CLS104 {
        public ImageView FLD774;
        public FrameLayout FLD775;
        public ImageView FLD776;

    }

    public CLS180 FLD777;
    public CLS146 FLD778;
    public CLS143 FLD779;
    public final CLS34 FLD780;
    public FrameLayout FLD781;
    public ImageView FLD782;
    public final CLS102 FLD783;
    public final WeakReference FLD784;
    public CLS67 FLD785;
    public TextView FLD786;
    public CLS111 FLD787;

    // 此方法包含解密的字符串
    public CLS105(Activity activity0, CLS102 יﹳ0) {
        this.FLD784 = new WeakReference(activity0);
        this.FLD783 = יﹳ0;
        this.FLD780 = CLS34.FLD463;
        CLS289 ˈˈ0 = new CLS289(this, יﹳ0, activity0);
        CLS123.FLD912.MTH2002("DrawerLayout_onDrawerSlide", ((CLS138)ˈˈ0));
        CLS293 ᐧⁱ0 = new CLS293(this, 0);
        CLS123.FLD912.MTH2002("DrawerLayout_onDrawerOpened", ((CLS138)ᐧⁱ0));
        CLS315 ˊˏ0 = new CLS315(this, יﹳ0, 3);
        CLS123.FLD912.MTH2002("DrawerLayout_onDrawerClosed", ((CLS138)ˊˏ0));
    }

    // 此方法包含解密的字符串
    public final void MTH1832(ViewGroup viewGroup0) {
        int v1;
        TextView textView1;
        try {
            CLS102 יﹳ0 = this.FLD783;
            Object object0 = this.FLD784.get();
            CLS123 ʾᵢ0 = CLS123.FLD912;
            ʾᵢ0.MTH2004("core", "DrawerLayout_create", new Object[]{((Activity)object0)});
            int v = ʾᵢ0.MTH2007("getThemeVersion", new Object[0]);
            LinearLayout linearLayout0 = new LinearLayout(((Activity)object0));
            linearLayout0.setOrientation(1);
            boolean z = יﹳ0.MTH1818("HideActionBar", false);
            boolean z1 = יﹳ0.MTH1819();
            Object object1 = ʾᵢ0.MTH2003("DrawerLayout_getLayoutParams", new Object[]{CLS43.MTH1439(this.MTH1834()), Boolean.valueOf(יﹳ0.MTH1818("DrawerOpenRight", false))});
            if(v > 0) {
                if(יﹳ0.MTH1818("DrawerCustomTopMarginEnable", false)) {
                    ʾᵢ0.MTH2004("core", "DrawerLayout_setMargins", new Object[]{object1, 0, CLS43.MTH1439(יﹳ0.MTH1817(CLS43.MTH1415(((Activity)object0)), "DrawerCustomTopMargin")), 0, 0});
                }
                else if(z) {
                    ʾᵢ0.MTH2004("core", "DrawerLayout_setMargins", new Object[]{object1, 0, CLS43.MTH1415(((Activity)object0)), 0, 0});
                }
                else {
                    ʾᵢ0.MTH2004("core", "DrawerLayout_setMargins", new Object[]{object1, 0, ((int)(CLS43.MTH1415(((Activity)object0)) + CLS43.MTH1439(0x30))), 0, 0});
                }
            }
            linearLayout0.setLayoutParams(((ViewGroup.LayoutParams)object1));
            if(!z) {
                linearLayout0.setPadding(0, CLS43.MTH1439(0x30), 0, 0);
            }
            FrameLayout frameLayout0 = new FrameLayout(((Activity)object0));
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, CLS43.MTH1439(0xA0));
            ImageView imageView0 = new ImageView(((Activity)object0));
            imageView0.setScaleType(ImageView.ScaleType.FIT_XY);
            frameLayout0.addView(imageView0, frameLayout$LayoutParams0);
            imageView0.setOnClickListener(new CLS97());
            FrameLayout frameLayout1 = new FrameLayout(((Activity)object0));
            FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(CLS43.MTH1439(72), CLS43.MTH1439(72));
            frameLayout$LayoutParams1.leftMargin = CLS43.MTH1439(16);
            frameLayout$LayoutParams1.topMargin = CLS43.MTH1439(20);
            frameLayout0.addView(frameLayout1, frameLayout$LayoutParams1);
            this.FLD777 = new CLS180(((Activity)object0));
            if(יﹳ0.MTH1818("DrawerShowAvatar", false)) {
                frameLayout1.addView(this.FLD777, -1, -1);
            }
            this.FLD777.setOnClickListener(new CLS112(this, 1));
            if(יﹳ0.MTH1818("DrawerShowAvatar", false)) {
                CLS33.MTH1350(this.FLD777, CLS133.MTH2112());
            }
            LinearLayout linearLayout1 = new LinearLayout(((Activity)object0));
            linearLayout1.setOrientation(1);
            linearLayout1.setGravity(80);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -1);
            linearLayout$LayoutParams0.gravity = 80;
            TextView textView0 = new TextView(((Activity)object0));
            this.FLD786 = textView0;
            textView0.setGravity(16);
            if(z1) {
                textView1 = this.FLD786;
                v1 = CLS46.MTH1452();
            }
            else {
                textView1 = this.FLD786;
                v1 = CLS46.MTH1447(יﹳ0.MTH1804("DrawerAccountInfoColor", "#000000"));
            }
            textView1.setTextColor(v1);
            LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout$LayoutParams1.leftMargin = CLS43.MTH1439(16);
            linearLayout$LayoutParams1.bottomMargin = CLS43.MTH1439(20);
            if(יﹳ0.MTH1818("DrawerShowAccountInfo", false)) {
                linearLayout1.addView(this.FLD786, linearLayout$LayoutParams1);
                frameLayout0.addView(linearLayout1, linearLayout$LayoutParams0);
                this.MTH1833();
            }
            ListView listView0 = new ListView(((Activity)object0));
            listView0.setDivider((z1 ? new ColorDrawable(CLS46.MTH1456()) : new ColorDrawable(CLS46.MTH1447("#FFFFFF"))));
            listView0.setChoiceMode(1);
            listView0.setItemsCanFocus(true);
            LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -1);
            linearLayout0.addView(frameLayout0, frameLayout$LayoutParams0);
            this.FLD785 = new CLS67(((Activity)object0), יﹳ0);
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: יﹳ0.FLD770) {
                CLS290 ˊﾞ0 = (CLS290)object2;
                if(ˊﾞ0.FLD752) {
                    arrayList0.add(ˊﾞ0);
                }
            }
            this.FLD785.MTH1536(arrayList0);
            listView0.setOnItemClickListener(new CLS98(this, 0));
            listView0.setAdapter(this.FLD785);
            linearLayout0.addView(listView0, linearLayout$LayoutParams2);
            CLS288 ʻˑ0 = new CLS288(this, z1, ((Activity)object0), linearLayout0, listView0, imageView0, z);
            CLS137.FLD972.MTH2141(((CLS136)ʻˑ0));
            ((ViewGroup)viewGroup0.getParent()).removeView(viewGroup0);
            CLS123.FLD912.MTH2004("core", "DrawerLayout_addView", new Object[]{viewGroup0});
            CLS123.FLD912.MTH2004("core", "DrawerLayout_addView", new Object[]{linearLayout0});
            CLS123.FLD912.MTH2004("core", "DrawerLayout_addContentView", new Object[]{((Activity)object0)});
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1833() {
        String s1;
        if(this.FLD783.MTH1818("DrawerShowAccountInfo", false)) {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("<b>");
            if(TextUtils.isEmpty(CLS133.FLD944)) {
                try {
                    String s = CLS133.MTH2112();
                    s1 = CLS34.FLD463.MTH1367(s);
                    if(TextUtils.isEmpty(s1)) {
                        goto label_11;
                    }
                    else {
                        CLS133.FLD944 = s1;
                    }
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
            label_11:
                s1 = TextUtils.isEmpty(CLS133.FLD944) ? CLS133.MTH2101().getString("last_login_nick_name", "") : CLS133.FLD944;
            }
            else {
                s1 = CLS133.FLD944;
            }
        label_17:
            stringBuilder0.append(s1);
            stringBuilder0.append("</b><br>");
            String s2 = CLS133.MTH2101().getString("login_user_name", "");
            if(TextUtils.isEmpty(s2)) {
                CLS34 ˊⁱ0 = CLS34.FLD463;
                String s3 = CLS133.MTH2112();
                ˊⁱ0.getClass();
                String s4 = null;
                if(TextUtils.isEmpty(s3)) {
                    s2 = null;
                }
                else {
                    Cursor cursor0 = ˊⁱ0.MTH1365("SELECT alias FROM rcontact WHERE username = ?", new String[]{s3});
                    if(cursor0 == null) {
                        s2 = "";
                    }
                    else {
                        if(cursor0.moveToFirst()) {
                            s4 = cursor0.getString(cursor0.getColumnIndex("alias"));
                        }
                        cursor0.close();
                        s2 = s4;
                    }
                }
            }
            if(TextUtils.isEmpty(s2)) {
                s2 = CLS133.MTH2112();
            }
            stringBuilder0.append(s2);
            this.FLD786.setText(Html.fromHtml(stringBuilder0.toString()));
        }
    }

    // 此方法包含解密的字符串
    public final int MTH1834() {
        CLS102 יﹳ0 = this.FLD783;
        int v = Resources.getSystem().getDisplayMetrics().widthPixels > 480 ? 296 : 260;
        try {
            if(יﹳ0.MTH1818("DrawerWidthCustom", false)) {
                return יﹳ0.MTH1817(v, "DrawerWidth");
            }
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
        return v;
    }

    public final CLS104 MTH1835() {
        public final class CLS103 extends Shape {
            public CLS103() {
                super();
            }

            @Override  // android.graphics.drawable.shapes.Shape
            public final void draw(Canvas canvas0, Paint paint0) {
                int v = canvas0.getWidth();
                paint0.setAntiAlias(true);
                paint0.setColor(-1);
                paint0.setStyle(Paint.Style.FILL_AND_STROKE);
                float f = (float)(v / 2);
                canvas0.drawCircle(f, f, f, paint0);
            }
        }

        CLS104 ـˏ$ᵔʾ0 = new CLS104();
        Activity activity0 = (Activity)this.FLD784.get();
        this.FLD781 = new FrameLayout(activity0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(CLS43.MTH1439(56), -1);
        frameLayout$LayoutParams0.gravity = 0x800003;
        ImageView imageView0 = new ImageView(activity0);
        imageView0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.FLD781.addView(imageView0, frameLayout$LayoutParams0);
        ImageView imageView1 = new ImageView(activity0);
        CLS43.MTH1437(imageView1, new ShapeDrawable(new CLS103()));
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(CLS43.MTH1439(10), CLS43.MTH1439(10));
        frameLayout$LayoutParams1.gravity = 0x800033;
        frameLayout$LayoutParams1.leftMargin = CLS43.MTH1439(40);
        imageView1.setVisibility(4);
        this.FLD781.addView(imageView1, frameLayout$LayoutParams1);
        ـˏ$ᵔʾ0.FLD774 = imageView0;
        ـˏ$ᵔʾ0.FLD776 = imageView1;
        ـˏ$ᵔʾ0.FLD775 = this.FLD781;
        return ـˏ$ᵔʾ0;
    }

    // 此方法包含解密的字符串
    public final void MTH1836(Object object0) {
        try {
            View view0 = (View)CLS3.MTH991(object0, CLS133.MTH2100("ActionBar_getCustomViewMethod", "getCustomView"), new Object[0]);
            CLS104 ـˏ$ᵔʾ0 = this.MTH1835();
            ImageView imageView0 = ـˏ$ᵔʾ0.FLD774;
            WeakReference weakReference0 = this.FLD784;
            this.FLD787 = new CLS111(((Activity)weakReference0.get()).getResources());
            int v = Integer.parseInt(CLS133.MTH2100("wx_overflow_icon_color", "1"));
            if(CLS46.MTH1455()) {
                v = 1;
            }
            CLS111 ⁱʾ0 = this.FLD787;
            ⁱʾ0.FLD817.setColor((v == 1 ? -1 : 0xFF000000));
            ⁱʾ0.invalidateSelf();
            imageView0.setImageDrawable(this.FLD787);
            this.FLD782 = ـˏ$ᵔʾ0.FLD776;
            ((ViewGroup)view0.getParent()).removeView(view0);
            FrameLayout frameLayout0 = new FrameLayout(((Activity)weakReference0.get()));
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            frameLayout$LayoutParams0.gravity = 0x800003;
            frameLayout0.addView(view0);
            frameLayout0.addView(ـˏ$ᵔʾ0.FLD775, frameLayout$LayoutParams0);
            frameLayout0.setTag(ـˏ$ᵔʾ0);
            CLS3.MTH991(object0, CLS133.MTH2100("ActionBar_setCustomViewMethod", "setCustomView"), new Object[]{frameLayout0});
            imageView0.setOnClickListener(new CLS112(this, 0));
        }
        catch(Throwable throwable0) {
            CLS133.MTH2113(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH1837(int v, int v1) {
        String s1;
        String s;
        CLS290 ˊﾞ2;
        CLS67 ᵔʾ0 = this.FLD785;
        if(ᵔʾ0 == null) {
            return;
        }
        HashMap hashMap0 = ᵔʾ0.FLD548;
        switch(v) {
            case 0: {
                if(hashMap0.containsKey("tab_main")) {
                    CLS290 ˊﾞ0 = (CLS290)hashMap0.get("tab_main");
                    if(ˊﾞ0 != null) {
                        ˊﾞ0.FLD753 = v1 <= 0 ? "" : String.valueOf(v1);
                        ᵔʾ0.notifyDataSetChanged();
                        return;
                    }
                }
                break;
            }
            case 1: {
                if(hashMap0.containsKey("tab_contacts")) {
                    CLS290 ˊﾞ1 = (CLS290)hashMap0.get("tab_contacts");
                    if(ˊﾞ1 != null) {
                        ˊﾞ1.FLD753 = v1 <= 0 ? "" : String.valueOf(v1);
                        ᵔʾ0.notifyDataSetChanged();
                        return;
                    }
                }
                break;
            }
            case 2: {
                if(hashMap0.containsKey("timeline") || this.FLD785.FLD548.containsKey("tab_discover")) {
                    ImageView imageView0 = this.FLD782;
                    if(imageView0 != null) {
                        imageView0.setVisibility((v1 == 0 ? 4 : 0));
                    }
                }
                CLS67 ᵔʾ1 = this.FLD785;
                HashMap hashMap1 = ᵔʾ1.FLD548;
                if(hashMap1.containsKey("timeline")) {
                    ˊﾞ2 = (CLS290)hashMap1.get(CLS114.MTH1900(0xFFFFA16A2B3CF2B7L));
                }
                else {
                    ˊﾞ2 = hashMap1.containsKey("tab_discover") ? ((CLS290)hashMap1.get(CLS114.MTH1900(-104092101971273L))) : null;
                }
                if(ˊﾞ2 != null) {
                    if(v1 == 0) {
                        s = "";
                    }
                    else if(v1 > 0) {
                        s = String.valueOf(v1);
                    }
                    else {
                        s = CLS133.MTH2099("new");
                        if(TextUtils.isEmpty(s)) {
                            s = "NEW";
                        }
                    }
                    ˊﾞ2.FLD753 = s;
                    ᵔʾ1.notifyDataSetChanged();
                    return;
                }
                break;
            }
            case 3: {
                if(hashMap0.containsKey("tab_me")) {
                    CLS290 ˊﾞ3 = (CLS290)hashMap0.get("tab_me");
                    if(ˊﾞ3 != null) {
                        if(v1 == 0) {
                            s1 = "";
                        }
                        else if(v1 > 0) {
                            s1 = String.valueOf(v1);
                        }
                        else {
                            s1 = CLS133.MTH2099("new");
                            if(TextUtils.isEmpty(s1)) {
                                s1 = "NEW";
                            }
                        }
                        ˊﾞ3.FLD753 = s1;
                        ᵔʾ0.notifyDataSetChanged();
                        return;
                    }
                }
                break;
            }
        }
    }
}

