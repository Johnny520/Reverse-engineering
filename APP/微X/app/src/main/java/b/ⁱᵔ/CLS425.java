// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.animation.Animator.AnimatorListener;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar.LayoutParams;
import android.widget.Toolbar;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS21;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS30;
import b.ʾᵢ.CLS40.CLS39;
import b.ʾᵢ.CLS40;
import b.ˆʿ.CLS43;
import b.ˈˈ.CLS581;
import b.ˈˈ.CLS79;
import b.ˑٴ.CLS651;
import b.ˑٴ.CLS720;
import b.יﹳ.CLS164;
import b.יﹳ.CLS166;
import b.ᐧˉ.CLS182;
import b.ᐧˉ.CLS220;
import b.ᐧˉ.CLS249;
import b.ⁱʾ.CLS1265;
import b.ⁱʾ.CLS323;
import b.ﾞˎ.CLS525;
import b.ﾞᐧ.CLS559;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS425 extends Dialog {
    public final String FLD4088;
    public final String FLD4089;
    public final CLS29 FLD4090;
    public final CLS79 FLD4091;
    public final HashSet FLD4092;
    public boolean FLD4093;
    public static final int FLD4094;
    public final String FLD4095;
    public CLS323 FLD4096;
    public String FLD4097;
    public boolean FLD4098;
    public final ArrayList FLD4099;
    public final CLS43 FLD4100;
    public boolean FLD4101;
    public CLS559 FLD4102;
    public final HashSet FLD4103;
    public final CLS500 FLD4104;
    public boolean FLD4105;
    public final String FLD4106;
    public Toolbar FLD4107;
    public boolean FLD4108;
    public LinearLayout FLD4109;
    public final CLS371 FLD4110;
    public final WeakReference FLD4111;

    public CLS425(String s, Activity activity0, ArrayList arrayList0, String s1, HashSet hashSet0, HashSet hashSet1) {
        super(activity0, 0x1030011);
        this.FLD4095 = s;
        this.FLD4111 = new WeakReference(activity0);
        this.FLD4088 = s1;
        this.FLD4092 = hashSet0;
        this.FLD4103 = hashSet1;
        this.FLD4099 = arrayList0;
        this.FLD4110 = CLS371.FLD3470;
        this.FLD4089 = CLS27.MTH904();
        this.FLD4090 = (CLS29)CLS40.FLD157.MTH1118(CLS29.class);
        this.FLD4091 = CLS79.FLD292;
        this.FLD4104 = CLS500.FLD4928;
        this.FLD4100 = (CLS43)CLS40.FLD157.MTH1118(CLS43.class);
        this.FLD4106 = s1.substring(3);
    }

    @Override  // android.app.Dialog
    public final void dismiss() {
        if(this.FLD4093) {
            return;
        }
        this.MTH6092(0.0f);
    }

    @Override  // android.app.Dialog
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        float f = motionEvent0.getX();
        int v = CLS523.MTH7132(this.MTH6097());
        if(motionEvent0.getAction() == 0) {
            this.FLD4101 = f < ((float)(v / 10));
        }
        if(this.FLD4101) {
            switch(motionEvent0.getAction()) {
                case 1: {
                    this.FLD4101 = false;
                    if(f > ((float)(v / 3))) {
                        this.MTH6092(f);
                        return true;
                    }
                    this.MTH6094(f, 0.0f, new CLS416(this));
                    return true;
                }
                case 2: {
                    this.FLD4109.setTranslationX(Math.max(f, 0.0f));
                    return true;
                }
                default: {
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent0);
    }

    @Override  // android.app.Dialog
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        Window window0 = this.getWindow();
        window0.getDecorView().setPadding(0, 0, 0, 0);
        int v = Build.VERSION.SDK_INT;
        if(v >= 16) {
            CLS30.MTH957(window0.getDecorView());
        }
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        windowManager$LayoutParams0.flags &= 0xFFFFFBFF;
        window0.setAttributes(windowManager$LayoutParams0);
        if(v >= 21) {
            window0.clearFlags(0x4000000);
            window0.addFlags(0x80000000);
            window0.setStatusBarColor(CLS425.MTH6096());
        }
    }

    @Override  // android.app.Dialog
    public final void show() {
        try {
            this.MTH6093();
            if(this.FLD4093) {
                return;
            }
            CLS79 ˎᵢ0 = this.FLD4091;
            String s = this.FLD4088;
            ˎᵢ0.getClass();
            try {
                ˎᵢ0.FLD282.add(s);
                ˎᵢ0.FLD281.add(this);
                HashMap hashMap0 = ˎᵢ0.FLD294;
                if(!hashMap0.containsKey(s)) {
                    hashMap0.put(s, this);
                    ˎᵢ0.FLD290.add(s);
                }
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
            }
            this.MTH6094(((float)CLS523.MTH7132(this.MTH6097())), 0.0f, new CLS416(this));
            if(this.FLD4108) {
                this.FLD4108 = false;
                if(TextUtils.isEmpty(this.FLD4097)) {
                    this.FLD4096.MTH5044();
                }
                else {
                    CLS323 ˈˈ0 = this.FLD4096;
                    String s1 = this.FLD4097;
                    boolean z = ˈˈ0.FLD3297.containsKey(s1);
                    boolean z1 = ˈˈ0.FLD3301.isEmpty();
                    if(!z1 || z) {
                        CLS1265 ʻˑ0 = new CLS1265(ˈˈ0, z, z1, s1);
                        CLS40.FLD157.MTH1124(((CLS39)ʻˑ0));
                    }
                }
            }
            if(!this.FLD4098) {
                this.FLD4098 = true;
                CLS581 ˉᐧ0 = new CLS581(this, 2);
                CLS40.FLD157.MTH1123(((CLS39)ˉᐧ0), 2000L);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 去混淆评级： 中等(60)
    // 此方法包含解密的字符串
    public static int MTH6089() {
        return CLS522.MTH7114() ? CLS522.MTH7109() : CLS522.MTH7115("chatroom_container_toolbar_text_color", "000000");
    }

    public final void MTH6090(String s) {
        try {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            boolean z = CLS404.MTH5909(s);
            CLS79 ˎᵢ0 = this.FLD4091;
            if(z) {
                ˎᵢ0.MTH1640(this.MTH6097(), s);
                return;
            }
            Activity activity0 = this.MTH6097();
            ˎᵢ0.getClass();
            CLS79.MTH1632(activity0, s);
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }

    // 此方法包含解密的字符串
    public final void MTH6092(float f) {
        public final class CLS424 implements Animator.AnimatorListener {
            public final CLS425 FLD4087;

            @Override  // android.animation.Animator$AnimatorListener
            public final void onAnimationCancel(Animator animator0) {
                CLS425.this.FLD4093 = false;
                CLS425.this.FLD4101 = false;
            }

            @Override  // android.animation.Animator$AnimatorListener
            public final void onAnimationEnd(Animator animator0) {
                CLS425.this.FLD4101 = false;
                CLS425.this.FLD4093 = false;
                CLS425.this.super.dismiss();
            }

            @Override  // android.animation.Animator$AnimatorListener
            public final void onAnimationRepeat(Animator animator0) {
            }

            @Override  // android.animation.Animator$AnimatorListener
            public final void onAnimationStart(Animator animator0) {
                CLS425.this.FLD4093 = true;
            }
        }

        try {
            String s = this.FLD4088;
            CLS79 ˎᵢ0 = this.FLD4091;
            HashSet hashSet0 = ˎᵢ0.FLD281;
            hashSet0.remove(this);
            ˎᵢ0.FLD282.remove(s);
            new String("");
            new String("");
            HashMap hashMap0 = ˎᵢ0.FLD294;
            if(hashMap0.containsKey(s)) {
                hashMap0.remove(s);
                ˎᵢ0.FLD290.pollLast();
            }
            if(!s.equals("wx__MAIN_") && hashMap0.containsKey("wx__MAIN_")) {
                CLS425 ˊﹳ0 = (CLS425)hashMap0.get("wx__MAIN_");
                if(ˊﹳ0 != null) {
                    CLS581 ˉᐧ0 = new CLS581(ˊﹳ0, 0);
                    CLS40.FLD157.MTH1116(((CLS39)ˉᐧ0));
                }
            }
            ˎᵢ0.MTH1654(s);
            if(hashSet0.isEmpty()) {
                CLS21.FLD76.MTH819("onclosing_wxdialogs", new Object[0]);
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
        if(!CLS182.MTH3470(4101334125023908661L)) {
            this.FLD4101 = false;
            this.FLD4093 = false;
            super.dismiss();
            this.hide();
            return;
        }
        this.MTH6094(f, ((float)CLS523.MTH7132(this.MTH6097())), new CLS424(this));
    }

    // 此方法包含解密的字符串
    public final void MTH6093() {
        Menu menu0;
        if(this.FLD4109 == null) {
            Activity activity0 = this.MTH6097();
            LinearLayout linearLayout0 = new LinearLayout(activity0);
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, -2);
            linearLayout0.setGravity(0x30);
            boolean z = true;
            linearLayout0.setOrientation(1);
            linearLayout0.setFocusableInTouchMode(true);
            linearLayout0.setLayoutParams(linearLayout$LayoutParams0);
            String s = this.FLD4095;
            if(Build.VERSION.SDK_INT >= 21) {
                try {
                    this.FLD4107 = new Toolbar(this.MTH6097());
                    Toolbar.LayoutParams toolbar$LayoutParams0 = new Toolbar.LayoutParams(-1, -2);
                    this.FLD4107.setLayoutParams(toolbar$LayoutParams0);
                    if(CLS522.MTH7114()) {
                        this.FLD4107.setPopupTheme(0x103024B);
                    }
                    else {
                        this.FLD4107.setPopupTheme(0x103024A);
                    }
                    this.FLD4107.setBackgroundColor(CLS425.MTH6096());
                    if(!TextUtils.isEmpty(s)) {
                        this.FLD4107.setTitle(s);
                        this.FLD4107.setTitleTextColor(CLS425.MTH6089());
                    }
                    CLS523.MTH7168(this.FLD4107, CLS522.MTH7107());
                    CLS523.MTH7139(linearLayout0, this.FLD4107, 0);
                    menu0 = this.FLD4107.getMenu();
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                    goto label_28;
                }
            }
            else {
            label_28:
                if(CLS27.MTH894("CompatToolbarClass") != null) {
                    try {
                        CLS559 ᵔʾ0 = new CLS559(this.MTH6097());
                        this.FLD4102 = ᵔʾ0;
                        int v = CLS425.MTH6096();
                        Object object0 = ᵔʾ0.FLD5459;
                        if(object0 != null) {
                            CLS166.MTH3195(object0, "setBackgroundColor", new Object[]{v});
                        }
                        if(!TextUtils.isEmpty(s)) {
                            this.FLD4102.MTH7484(s);
                            CLS559 ᵔʾ1 = this.FLD4102;
                            int v1 = CLS425.MTH6089();
                            Object object1 = ᵔʾ1.FLD5459;
                            if(object1 != null) {
                                try {
                                    TextView textView0 = (TextView)CLS164.MTH3175(object1, TextView.class);
                                    if(textView0 != null) {
                                        textView0.setTextColor(v1);
                                    }
                                }
                                catch(Throwable throwable2) {
                                    CLS27.MTH893(throwable2);
                                }
                            }
                        }
                        Object object2 = this.FLD4102.FLD5459;
                        if(object2 != null) {
                            CLS523.MTH7139(linearLayout0, ((View)object2), 0);
                        }
                        Object object3 = this.FLD4102.FLD5459;
                        if(object3 == null) {
                            goto label_58;
                        }
                        else {
                            menu0 = (Menu)CLS166.MTH3195(object3, "getMenu", new Object[0]);
                        }
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                        menu0 = null;
                    }
                    goto label_61;
                }
            label_58:
                menu0 = null;
            }
        label_61:
            CLS525 ʻˑ0 = new CLS525(activity0, linearLayout0, menu0);
            CLS581 ˉᐧ0 = new CLS581(this, 1);
            this.FLD4096 = new CLS323(activity0, this.FLD4099, this.FLD4092, this.FLD4103, this.FLD4088, ˉᐧ0);
            CLS21 ʾᵢ0 = CLS21.FLD76;
            if(!ʾᵢ0.MTH830("isHideWxMenu", new Object[0])) {
                ʻˑ0.MTH7187("appname", ((CLS3)new CLS720(3)));
            }
            String s1 = this.FLD4088;
            CLS500 ᵢﹶ0 = this.FLD4104;
            if(!s1.startsWith("wx__c_") && ᵢﹶ0.MTH6895("chatroom_container_tags") && this.FLD4090.MTH938("chatroom_tags", false)) {
                ʻˑ0.MTH7187("chatroom_tags", ((CLS3)new CLS651(activity0, 11)));
            }
            ʻˑ0.MTH7187("mark_read", ((CLS3)new CLS1467(this, 0)));
            ʻˑ0.MTH7187("mass_delete_msg", ((CLS3)new CLS1607(this, activity0, 4)));
            ʻˑ0.MTH7187("mute", ((CLS3)new CLS1607(this, activity0, 5)));
            ʻˑ0.MTH7187("unmute", ((CLS3)new CLS1607(this, activity0, 6)));
            if(ᵢﹶ0.MTH6895("chatroom_container_tags")) {
                ʻˑ0.MTH7187("send", ((CLS3)new CLS1607(this, activity0, 7)));
            }
            if(s1.startsWith("wx__c_") && ᵢﹶ0.MTH6895("chatroom_send_multi_invites")) {
                ʻˑ0.MTH7187("invite_member", ((CLS3)new CLS1607(this, activity0, 8)));
            }
            if(s1.startsWith("wx__c_")) {
                ʻˑ0.MTH7187("add", ((CLS3)new CLS1607(this, activity0, 9)));
                ʻˑ0.MTH7187("move_out", ((CLS3)new CLS1607(this, activity0, 0)));
            }
            if(s1.startsWith("wx__c_") || !s1.startsWith("wx__c_") && ᵢﹶ0.MTH6895("chatroom_container_tags")) {
                ʻˑ0.MTH7187("move_to", ((CLS3)new CLS1607(this, activity0, 1)));
            }
            ʻˑ0.MTH7187("search", ((CLS3)new CLS1607(this, activity0, 2)));
            ʻˑ0.MTH7187("settings", ((CLS3)new CLS1607(this, activity0, 3)));
            ʻˑ0.MTH7188();
            LinearLayout linearLayout1 = new LinearLayout(activity0);
            linearLayout1.setGravity(0x30);
            linearLayout1.setOrientation(1);
            linearLayout1.setFocusableInTouchMode(true);
            linearLayout1.setLayoutParams(linearLayout$LayoutParams0);
            if(CLS523.MTH7140()) {
                linearLayout0.addView(linearLayout1);
            }
            ListView listView0 = new ListView(activity0);
            listView0.setAdapter(this.FLD4096);
            listView0.setSelector(new ColorDrawable(0));
            listView0.setPadding(0, 0, 0, 0);
            linearLayout1.addView(listView0, new LinearLayout.LayoutParams(-1, -1));
            listView0.setOnItemClickListener(new CLS249(8, this));
            listView0.setOnItemLongClickListener(new CLS220(7, activity0, this));
            listView0.setOnScrollListener(new CLS511(this));
            boolean z1 = ʾᵢ0.MTH830("isThemeEnable", new Object[]{"MainFragmentBackgroundColorEnable"});
            boolean z2 = ʾᵢ0.MTH830("isThemeEnable", new Object[]{"MainFragmentBackgroundEnable"});
            if(!z1 && !z2) {
                z = false;
            }
            else {
                int v2 = linearLayout0.getWidth();
                if(v2 == 0) {
                    v2 = Resources.getSystem().getDisplayMetrics().widthPixels;
                }
                int v3 = linearLayout0.getHeight();
                if(v3 == 0) {
                    v3 = Resources.getSystem().getDisplayMetrics().heightPixels - CLS523.MTH7137(0x30);
                }
                if(z2) {
                    Bitmap bitmap0 = (Bitmap)ʾᵢ0.MTH836("getThemeImage", new Object[]{"MainFragmentBackground", v2, v3, Boolean.TRUE});
                    if(bitmap0 == null) {
                        z = false;
                    }
                    else {
                        CLS523.MTH7152(linearLayout0, new BitmapDrawable(null, bitmap0));
                    }
                }
                else {
                    String s2 = ʾᵢ0.MTH826("getThemeString", new Object[]{"MainFragmentBackgroundColor"});
                    if(TextUtils.isEmpty(s2)) {
                        z = false;
                    }
                    else {
                        CLS523.MTH7152(linearLayout0, new ColorDrawable(CLS522.MTH7110(s2)));
                    }
                }
            }
            if(!z) {
                CLS523.MTH7152(linearLayout0, new ColorDrawable(CLS522.MTH7108()));
            }
            if(!CLS523.MTH7140()) {
                this.setTitle(s);
                linearLayout0 = linearLayout1;
            }
            this.FLD4109 = linearLayout0;
            this.setContentView(linearLayout0);
        }
        super.show();
    }

    public final void MTH6094(float f, float f1, Animator.AnimatorListener animator$AnimatorListener0) {
        ValueAnimator valueAnimator0 = ValueAnimator.ofFloat(new float[]{f, f1});
        valueAnimator0.addUpdateListener(new CLS401(this));
        valueAnimator0.addListener(animator$AnimatorListener0);
        valueAnimator0.setDuration(300L);
        valueAnimator0.setRepeatMode(2);
        valueAnimator0.setTarget(this.FLD4109);
        valueAnimator0.start();
    }

    public final void MTH6095() {
        if(!this.isShowing()) {
            return;
        }
        super.dismiss();
    }

    // 去混淆评级： 低(32)
    // 此方法包含解密的字符串
    public static int MTH6096() {
        String s = CLS21.FLD76.MTH826("getThemeString", new Object[]{"ActionBarColor"});
        if(!TextUtils.isEmpty(s)) {
            return CLS522.MTH7110(s);
        }
        return CLS522.MTH7114() ? Color.parseColor("#232323") : CLS522.MTH7115("chatroom_container_toolbar_color", "EDEDED");
    }

    public final Activity MTH6097() {
        return (Activity)this.FLD4111.get();
    }
}

