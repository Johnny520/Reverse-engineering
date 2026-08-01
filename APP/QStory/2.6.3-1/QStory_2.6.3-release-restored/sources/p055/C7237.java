package p055;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import p026.AbstractC7017;
import p034.AbstractC7082;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p049.AbstractC7162;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p303.RestoredStrings;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7237 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Bundle f17924;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f17925 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m12525(String str) {
        int length;
        if (!TextUtils.isEmpty(str) && (length = str.length()) >= 5 && length <= 10 && !str.startsWith("0")) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        boolean zM7256 = AbstractC3888.m7256();
        final int i = 0;
        Class cls = Void.TYPE;
        if (zM7256) {
            Class clsM12425 = AbstractC7166.m12425("com.tencent.richframework.gallery.QQGalleryActivity");
            m12389(AbstractC7162.m12402(clsM12425, cls, "onCreate", new Class[]{Bundle.class}), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰苏哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C7237 f17909;

                {
                    this.f17909 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i2;
                    RelativeLayout relativeLayout;
                    int i3;
                    int i4 = i;
                    String string = null;
                    final int i5 = 0;
                    final int i6 = 1;
                    C7237 c7237 = this.f17909;
                    switch (i4) {
                        case 0:
                            c7237.f17924 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                            break;
                        case 1:
                            Context context = (Context) methodHookParam.thisObject;
                            AbstractC3888.m7247(context);
                            Bundle bundle = c7237.f17924;
                            if (bundle != null && (i2 = bundle.getInt("forward_source_uin_type")) != 0) {
                                Iterator it = AbstractC3887.m7210(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        View view = (View) it.next();
                                        if (view instanceof RelativeLayout) {
                                            relativeLayout = (RelativeLayout) view;
                                        }
                                    } else {
                                        relativeLayout = null;
                                    }
                                }
                                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                                layoutParams.height = AbstractC7082.m12313(context, 80.0f) + layoutParams.height;
                                AbstractC3888.m7247(context);
                                final View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView = (TextView) viewInflate.findViewById(C0328R.id.pic_send_uin);
                                TextView textView2 = (TextView) viewInflate.findViewById(C0328R.id.type);
                                textView2.setOnClickListener(new ViewOnClickListenerC6365(15));
                                TextView textView3 = (TextView) viewInflate.findViewById(C0328R.id.pic_group_uin);
                                if (i2 == 1) {
                                    c7237.f17924.getString("extra.GROUP_CODE");
                                    String string2 = c7237.f17924.getString("key_troop_group_name");
                                    i3 = 232;
                                    String string3 = c7237.f17924.getString("extra.GROUP_UIN");
                                    textView2.setText("群聊消息 ");
                                    textView3.setText("来自群组 : " + string2 + "(" + string3 + ")");
                                    textView3.setOnClickListener(new ViewOnClickListenerC7227(context, string3, 0));
                                } else {
                                    i3 = 232;
                                    if (i2 == 0) {
                                        String string4 = c7237.f17924.getString("uin");
                                        textView3.setText("来自私聊与 " + string4 + " 的对话");
                                        textView3.setOnClickListener(new ViewOnClickListenerC7227(string4, context, 1));
                                    }
                                }
                                String string5 = c7237.f17924.getString(i2 == 1 ? RestoredStrings.get(i3) : "uin");
                                textView.setText("发送者 : " + string5);
                                textView.setOnClickListener(new ViewOnClickListenerC7227(string5, context, 2));
                                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪哲兰
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i7 = i5;
                                        View view3 = viewInflate;
                                        switch (i7) {
                                            case 0:
                                                if (view3.getAlpha() < 50.0f) {
                                                    view3.setAlpha(1.0f);
                                                } else {
                                                    view3.setAlpha(0.0f);
                                                }
                                                break;
                                            default:
                                                if (view3.getAlpha() < 50.0f) {
                                                    view3.setAlpha(1.0f);
                                                } else {
                                                    view3.setAlpha(0.0f);
                                                }
                                                break;
                                        }
                                    }
                                });
                                relativeLayout.addView(viewInflate.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                            }
                            break;
                        case 2:
                            c7237.f17924 = ((Intent) AbstractC7162.m12405(Intent.class, "getIntent", methodHookParam.thisObject)).getExtras();
                            break;
                        default:
                            if (c7237.f17924 == null) {
                                String strM14531 = "PicUI bundle==null";
                                String str = AbstractC7017.f17361;
                                AbstractC7017.m12163(strM14531, "Run Log");
                            } else {
                                ArrayList arrayListM7210 = AbstractC3887.m7210(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                                Context context2 = (Context) methodHookParam.thisObject;
                                AbstractC3888.m7247(context2);
                                RelativeLayout relativeLayout2 = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayListM7210.size()) {
                                        View view2 = (View) arrayListM7210.get(i7);
                                        if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i7 >= 3) {
                                            relativeLayout2 = (RelativeLayout) view2;
                                        }
                                        if (view2.getClass().equals(View.class)) {
                                            int color = context2.getColor(C0328R.color.____res_0x24060487);
                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                            gradientDrawable.setShape(0);
                                            gradientDrawable.setColor(color);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                gradientDrawable.setCornerRadius(0.0f);
                                            }
                                            view2.setBackground(gradientDrawable);
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                                RelativeLayout relativeLayout3 = relativeLayout2;
                                final View viewInflate2 = LayoutInflater.from(context2).inflate(C0328R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView4 = (TextView) viewInflate2.findViewById(C0328R.id.pic_send_uin);
                                TextView textView5 = (TextView) viewInflate2.findViewById(C0328R.id.type);
                                textView5.setOnClickListener(new ViewOnClickListenerC6365(14));
                                TextView textView6 = (TextView) viewInflate2.findViewById(C0328R.id.pic_group_uin);
                                String string6 = c7237.f17924.getString("key_troop_group_name");
                                int i8 = c7237.f17924.getInt("uintype");
                                if (i8 == 1) {
                                    string = c7237.f17924.getString("extra.GROUP_UIN");
                                    textView5.setText("群聊消息 ");
                                    textView6.setText("来自群组 : " + string6 + "(" + string + ")");
                                    textView6.setOnClickListener(new ViewOnClickListenerC7227(context2, string, 3));
                                } else if (i8 == 0) {
                                    textView6.setText("来自私聊与 " + string6 + " 的对话");
                                    textView6.setOnClickListener(new ViewOnClickListenerC7227(string6, context2, 4));
                                }
                                Parcelable parcelable = c7237.f17924.getParcelable("extra.EXTRA_CURRENT_IMAGE");
                                for (Field field : parcelable.getClass().getDeclaredFields()) {
                                    field.setAccessible(true);
                                    if (field.getType().equals(String.class)) {
                                        String str2 = (String) field.get(parcelable);
                                        if (string != null) {
                                            if (C7237.m12525(str2) && !str2.equals(string)) {
                                                c7237.f17925 = field.getName();
                                            }
                                        } else if (C7237.m12525(str2) && !str2.equals(string6)) {
                                            c7237.f17925 = field.getName();
                                        }
                                    }
                                }
                                try {
                                    String str3 = (String) AbstractC7165.m12418(String.class, c7237.f17925, parcelable);
                                    textView4.setText("发送者 : " + str3);
                                    textView4.setOnClickListener(new ViewOnClickListenerC7227(str3, context2, 5));
                                    int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                                    int dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : -1;
                                    viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪哲兰
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view22) {
                                            int i72 = i6;
                                            View view3 = viewInflate2;
                                            switch (i72) {
                                                case 0:
                                                    if (view3.getAlpha() < 50.0f) {
                                                        view3.setAlpha(1.0f);
                                                    } else {
                                                        view3.setAlpha(0.0f);
                                                    }
                                                    break;
                                                default:
                                                    if (view3.getAlpha() < 50.0f) {
                                                        view3.setAlpha(1.0f);
                                                    } else {
                                                        view3.setAlpha(0.0f);
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC7082.m12313(context2, 10.0f));
                                    relativeLayout3.addView(viewInflate2.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            m12389(AbstractC7162.m12402(clsM12425, cls, "onResume", new Class[0]), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰苏哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C7237 f17909;

                {
                    this.f17909 = this;
                }

                @Override // p042.InterfaceC7141
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i22;
                    RelativeLayout relativeLayout;
                    int i3;
                    int i4 = i2;
                    String string = null;
                    final int i5 = 0;
                    final int i6 = 1;
                    C7237 c7237 = this.f17909;
                    switch (i4) {
                        case 0:
                            c7237.f17924 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                            break;
                        case 1:
                            Context context = (Context) methodHookParam.thisObject;
                            AbstractC3888.m7247(context);
                            Bundle bundle = c7237.f17924;
                            if (bundle != null && (i22 = bundle.getInt("forward_source_uin_type")) != 0) {
                                Iterator it = AbstractC3887.m7210(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        View view = (View) it.next();
                                        if (view instanceof RelativeLayout) {
                                            relativeLayout = (RelativeLayout) view;
                                        }
                                    } else {
                                        relativeLayout = null;
                                    }
                                }
                                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                                layoutParams.height = AbstractC7082.m12313(context, 80.0f) + layoutParams.height;
                                AbstractC3888.m7247(context);
                                final View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView = (TextView) viewInflate.findViewById(C0328R.id.pic_send_uin);
                                TextView textView2 = (TextView) viewInflate.findViewById(C0328R.id.type);
                                textView2.setOnClickListener(new ViewOnClickListenerC6365(15));
                                TextView textView3 = (TextView) viewInflate.findViewById(C0328R.id.pic_group_uin);
                                if (i22 == 1) {
                                    c7237.f17924.getString("extra.GROUP_CODE");
                                    String string2 = c7237.f17924.getString("key_troop_group_name");
                                    i3 = 232;
                                    String string3 = c7237.f17924.getString("extra.GROUP_UIN");
                                    textView2.setText("群聊消息 ");
                                    textView3.setText("来自群组 : " + string2 + "(" + string3 + ")");
                                    textView3.setOnClickListener(new ViewOnClickListenerC7227(context, string3, 0));
                                } else {
                                    i3 = 232;
                                    if (i22 == 0) {
                                        String string4 = c7237.f17924.getString("uin");
                                        textView3.setText("来自私聊与 " + string4 + " 的对话");
                                        textView3.setOnClickListener(new ViewOnClickListenerC7227(string4, context, 1));
                                    }
                                }
                                String string5 = c7237.f17924.getString(i22 == 1 ? RestoredStrings.get(i3) : "uin");
                                textView.setText("发送者 : " + string5);
                                textView.setOnClickListener(new ViewOnClickListenerC7227(string5, context, 2));
                                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪哲兰
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i72 = i5;
                                        View view3 = viewInflate;
                                        switch (i72) {
                                            case 0:
                                                if (view3.getAlpha() < 50.0f) {
                                                    view3.setAlpha(1.0f);
                                                } else {
                                                    view3.setAlpha(0.0f);
                                                }
                                                break;
                                            default:
                                                if (view3.getAlpha() < 50.0f) {
                                                    view3.setAlpha(1.0f);
                                                } else {
                                                    view3.setAlpha(0.0f);
                                                }
                                                break;
                                        }
                                    }
                                });
                                relativeLayout.addView(viewInflate.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                            }
                            break;
                        case 2:
                            c7237.f17924 = ((Intent) AbstractC7162.m12405(Intent.class, "getIntent", methodHookParam.thisObject)).getExtras();
                            break;
                        default:
                            if (c7237.f17924 == null) {
                                String strM14531 = "PicUI bundle==null";
                                String str = AbstractC7017.f17361;
                                AbstractC7017.m12163(strM14531, "Run Log");
                            } else {
                                ArrayList arrayListM7210 = AbstractC3887.m7210(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                                Context context2 = (Context) methodHookParam.thisObject;
                                AbstractC3888.m7247(context2);
                                RelativeLayout relativeLayout2 = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayListM7210.size()) {
                                        View view2 = (View) arrayListM7210.get(i7);
                                        if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i7 >= 3) {
                                            relativeLayout2 = (RelativeLayout) view2;
                                        }
                                        if (view2.getClass().equals(View.class)) {
                                            int color = context2.getColor(C0328R.color.____res_0x24060487);
                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                            gradientDrawable.setShape(0);
                                            gradientDrawable.setColor(color);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                gradientDrawable.setCornerRadius(0.0f);
                                            }
                                            view2.setBackground(gradientDrawable);
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                                RelativeLayout relativeLayout3 = relativeLayout2;
                                final View viewInflate2 = LayoutInflater.from(context2).inflate(C0328R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView4 = (TextView) viewInflate2.findViewById(C0328R.id.pic_send_uin);
                                TextView textView5 = (TextView) viewInflate2.findViewById(C0328R.id.type);
                                textView5.setOnClickListener(new ViewOnClickListenerC6365(14));
                                TextView textView6 = (TextView) viewInflate2.findViewById(C0328R.id.pic_group_uin);
                                String string6 = c7237.f17924.getString("key_troop_group_name");
                                int i8 = c7237.f17924.getInt("uintype");
                                if (i8 == 1) {
                                    string = c7237.f17924.getString("extra.GROUP_UIN");
                                    textView5.setText("群聊消息 ");
                                    textView6.setText("来自群组 : " + string6 + "(" + string + ")");
                                    textView6.setOnClickListener(new ViewOnClickListenerC7227(context2, string, 3));
                                } else if (i8 == 0) {
                                    textView6.setText("来自私聊与 " + string6 + " 的对话");
                                    textView6.setOnClickListener(new ViewOnClickListenerC7227(string6, context2, 4));
                                }
                                Parcelable parcelable = c7237.f17924.getParcelable("extra.EXTRA_CURRENT_IMAGE");
                                for (Field field : parcelable.getClass().getDeclaredFields()) {
                                    field.setAccessible(true);
                                    if (field.getType().equals(String.class)) {
                                        String str2 = (String) field.get(parcelable);
                                        if (string != null) {
                                            if (C7237.m12525(str2) && !str2.equals(string)) {
                                                c7237.f17925 = field.getName();
                                            }
                                        } else if (C7237.m12525(str2) && !str2.equals(string6)) {
                                            c7237.f17925 = field.getName();
                                        }
                                    }
                                }
                                try {
                                    String str3 = (String) AbstractC7165.m12418(String.class, c7237.f17925, parcelable);
                                    textView4.setText("发送者 : " + str3);
                                    textView4.setOnClickListener(new ViewOnClickListenerC7227(str3, context2, 5));
                                    int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                                    int dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : -1;
                                    viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪哲兰
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view22) {
                                            int i72 = i6;
                                            View view3 = viewInflate2;
                                            switch (i72) {
                                                case 0:
                                                    if (view3.getAlpha() < 50.0f) {
                                                        view3.setAlpha(1.0f);
                                                    } else {
                                                        view3.setAlpha(0.0f);
                                                    }
                                                    break;
                                                default:
                                                    if (view3.getAlpha() < 50.0f) {
                                                        view3.setAlpha(1.0f);
                                                    } else {
                                                        view3.setAlpha(0.0f);
                                                    }
                                                    break;
                                            }
                                        }
                                    });
                                    viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC7082.m12313(context2, 10.0f));
                                    relativeLayout3.addView(viewInflate2.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        Class clsM124252 = AbstractC7166.m12425("com.tencent.mobileqq.richmediabrowser.AIOGalleryActivity");
        final int i3 = 2;
        m12389(AbstractC7162.m12402(clsM124252, cls, "onCreate", new Class[]{Bundle.class}), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7237 f17909;

            {
                this.f17909 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22;
                RelativeLayout relativeLayout;
                int i32;
                int i4 = i3;
                String string = null;
                final int i5 = 0;
                final int i6 = 1;
                C7237 c7237 = this.f17909;
                switch (i4) {
                    case 0:
                        c7237.f17924 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                        break;
                    case 1:
                        Context context = (Context) methodHookParam.thisObject;
                        AbstractC3888.m7247(context);
                        Bundle bundle = c7237.f17924;
                        if (bundle != null && (i22 = bundle.getInt("forward_source_uin_type")) != 0) {
                            Iterator it = AbstractC3887.m7210(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (view instanceof RelativeLayout) {
                                        relativeLayout = (RelativeLayout) view;
                                    }
                                } else {
                                    relativeLayout = null;
                                }
                            }
                            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                            layoutParams.height = AbstractC7082.m12313(context, 80.0f) + layoutParams.height;
                            AbstractC3888.m7247(context);
                            final View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView = (TextView) viewInflate.findViewById(C0328R.id.pic_send_uin);
                            TextView textView2 = (TextView) viewInflate.findViewById(C0328R.id.type);
                            textView2.setOnClickListener(new ViewOnClickListenerC6365(15));
                            TextView textView3 = (TextView) viewInflate.findViewById(C0328R.id.pic_group_uin);
                            if (i22 == 1) {
                                c7237.f17924.getString("extra.GROUP_CODE");
                                String string2 = c7237.f17924.getString("key_troop_group_name");
                                i32 = 232;
                                String string3 = c7237.f17924.getString("extra.GROUP_UIN");
                                textView2.setText("群聊消息 ");
                                textView3.setText("来自群组 : " + string2 + "(" + string3 + ")");
                                textView3.setOnClickListener(new ViewOnClickListenerC7227(context, string3, 0));
                            } else {
                                i32 = 232;
                                if (i22 == 0) {
                                    String string4 = c7237.f17924.getString("uin");
                                    textView3.setText("来自私聊与 " + string4 + " 的对话");
                                    textView3.setOnClickListener(new ViewOnClickListenerC7227(string4, context, 1));
                                }
                            }
                            String string5 = c7237.f17924.getString(i22 == 1 ? RestoredStrings.get(i32) : "uin");
                            textView.setText("发送者 : " + string5);
                            textView.setOnClickListener(new ViewOnClickListenerC7227(string5, context, 2));
                            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪哲兰
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view22) {
                                    int i72 = i5;
                                    View view3 = viewInflate;
                                    switch (i72) {
                                        case 0:
                                            if (view3.getAlpha() < 50.0f) {
                                                view3.setAlpha(1.0f);
                                            } else {
                                                view3.setAlpha(0.0f);
                                            }
                                            break;
                                        default:
                                            if (view3.getAlpha() < 50.0f) {
                                                view3.setAlpha(1.0f);
                                            } else {
                                                view3.setAlpha(0.0f);
                                            }
                                            break;
                                    }
                                }
                            });
                            relativeLayout.addView(viewInflate.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                        }
                        break;
                    case 2:
                        c7237.f17924 = ((Intent) AbstractC7162.m12405(Intent.class, "getIntent", methodHookParam.thisObject)).getExtras();
                        break;
                    default:
                        if (c7237.f17924 == null) {
                            String strM14531 = "PicUI bundle==null";
                            String str = AbstractC7017.f17361;
                            AbstractC7017.m12163(strM14531, "Run Log");
                        } else {
                            ArrayList arrayListM7210 = AbstractC3887.m7210(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                            Context context2 = (Context) methodHookParam.thisObject;
                            AbstractC3888.m7247(context2);
                            RelativeLayout relativeLayout2 = null;
                            int i7 = 0;
                            while (true) {
                                if (i7 < arrayListM7210.size()) {
                                    View view2 = (View) arrayListM7210.get(i7);
                                    if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i7 >= 3) {
                                        relativeLayout2 = (RelativeLayout) view2;
                                    }
                                    if (view2.getClass().equals(View.class)) {
                                        int color = context2.getColor(C0328R.color.____res_0x24060487);
                                        GradientDrawable gradientDrawable = new GradientDrawable();
                                        gradientDrawable.setShape(0);
                                        gradientDrawable.setColor(color);
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            gradientDrawable.setCornerRadius(0.0f);
                                        }
                                        view2.setBackground(gradientDrawable);
                                    } else {
                                        i7++;
                                    }
                                }
                            }
                            RelativeLayout relativeLayout3 = relativeLayout2;
                            final View viewInflate2 = LayoutInflater.from(context2).inflate(C0328R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView4 = (TextView) viewInflate2.findViewById(C0328R.id.pic_send_uin);
                            TextView textView5 = (TextView) viewInflate2.findViewById(C0328R.id.type);
                            textView5.setOnClickListener(new ViewOnClickListenerC6365(14));
                            TextView textView6 = (TextView) viewInflate2.findViewById(C0328R.id.pic_group_uin);
                            String string6 = c7237.f17924.getString("key_troop_group_name");
                            int i8 = c7237.f17924.getInt("uintype");
                            if (i8 == 1) {
                                string = c7237.f17924.getString("extra.GROUP_UIN");
                                textView5.setText("群聊消息 ");
                                textView6.setText("来自群组 : " + string6 + "(" + string + ")");
                                textView6.setOnClickListener(new ViewOnClickListenerC7227(context2, string, 3));
                            } else if (i8 == 0) {
                                textView6.setText("来自私聊与 " + string6 + " 的对话");
                                textView6.setOnClickListener(new ViewOnClickListenerC7227(string6, context2, 4));
                            }
                            Parcelable parcelable = c7237.f17924.getParcelable("extra.EXTRA_CURRENT_IMAGE");
                            for (Field field : parcelable.getClass().getDeclaredFields()) {
                                field.setAccessible(true);
                                if (field.getType().equals(String.class)) {
                                    String str2 = (String) field.get(parcelable);
                                    if (string != null) {
                                        if (C7237.m12525(str2) && !str2.equals(string)) {
                                            c7237.f17925 = field.getName();
                                        }
                                    } else if (C7237.m12525(str2) && !str2.equals(string6)) {
                                        c7237.f17925 = field.getName();
                                    }
                                }
                            }
                            try {
                                String str3 = (String) AbstractC7165.m12418(String.class, c7237.f17925, parcelable);
                                textView4.setText("发送者 : " + str3);
                                textView4.setOnClickListener(new ViewOnClickListenerC7227(str3, context2, 5));
                                int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                                int dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : -1;
                                viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪哲兰
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i72 = i6;
                                        View view3 = viewInflate2;
                                        switch (i72) {
                                            case 0:
                                                if (view3.getAlpha() < 50.0f) {
                                                    view3.setAlpha(1.0f);
                                                } else {
                                                    view3.setAlpha(0.0f);
                                                }
                                                break;
                                            default:
                                                if (view3.getAlpha() < 50.0f) {
                                                    view3.setAlpha(1.0f);
                                                } else {
                                                    view3.setAlpha(0.0f);
                                                }
                                                break;
                                        }
                                    }
                                });
                                viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC7082.m12313(context2, 10.0f));
                                relativeLayout3.addView(viewInflate2.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        final int i4 = 3;
        m12389(AbstractC7162.m12402(clsM124252, cls, "onResume", new Class[0]), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7237 f17909;

            {
                this.f17909 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22;
                RelativeLayout relativeLayout;
                int i32;
                int i42 = i4;
                String string = null;
                final int i5 = 0;
                final int i6 = 1;
                C7237 c7237 = this.f17909;
                switch (i42) {
                    case 0:
                        c7237.f17924 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                        break;
                    case 1:
                        Context context = (Context) methodHookParam.thisObject;
                        AbstractC3888.m7247(context);
                        Bundle bundle = c7237.f17924;
                        if (bundle != null && (i22 = bundle.getInt("forward_source_uin_type")) != 0) {
                            Iterator it = AbstractC3887.m7210(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (view instanceof RelativeLayout) {
                                        relativeLayout = (RelativeLayout) view;
                                    }
                                } else {
                                    relativeLayout = null;
                                }
                            }
                            ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                            layoutParams.height = AbstractC7082.m12313(context, 80.0f) + layoutParams.height;
                            AbstractC3888.m7247(context);
                            final View viewInflate = LayoutInflater.from(context).inflate(C0328R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView = (TextView) viewInflate.findViewById(C0328R.id.pic_send_uin);
                            TextView textView2 = (TextView) viewInflate.findViewById(C0328R.id.type);
                            textView2.setOnClickListener(new ViewOnClickListenerC6365(15));
                            TextView textView3 = (TextView) viewInflate.findViewById(C0328R.id.pic_group_uin);
                            if (i22 == 1) {
                                c7237.f17924.getString("extra.GROUP_CODE");
                                String string2 = c7237.f17924.getString("key_troop_group_name");
                                i32 = 232;
                                String string3 = c7237.f17924.getString("extra.GROUP_UIN");
                                textView2.setText("群聊消息 ");
                                textView3.setText("来自群组 : " + string2 + "(" + string3 + ")");
                                textView3.setOnClickListener(new ViewOnClickListenerC7227(context, string3, 0));
                            } else {
                                i32 = 232;
                                if (i22 == 0) {
                                    String string4 = c7237.f17924.getString("uin");
                                    textView3.setText("来自私聊与 " + string4 + " 的对话");
                                    textView3.setOnClickListener(new ViewOnClickListenerC7227(string4, context, 1));
                                }
                            }
                            String string5 = c7237.f17924.getString(i22 == 1 ? RestoredStrings.get(i32) : "uin");
                            textView.setText("发送者 : " + string5);
                            textView.setOnClickListener(new ViewOnClickListenerC7227(string5, context, 2));
                            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪哲兰
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view22) {
                                    int i72 = i5;
                                    View view3 = viewInflate;
                                    switch (i72) {
                                        case 0:
                                            if (view3.getAlpha() < 50.0f) {
                                                view3.setAlpha(1.0f);
                                            } else {
                                                view3.setAlpha(0.0f);
                                            }
                                            break;
                                        default:
                                            if (view3.getAlpha() < 50.0f) {
                                                view3.setAlpha(1.0f);
                                            } else {
                                                view3.setAlpha(0.0f);
                                            }
                                            break;
                                    }
                                }
                            });
                            relativeLayout.addView(viewInflate.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                        }
                        break;
                    case 2:
                        c7237.f17924 = ((Intent) AbstractC7162.m12405(Intent.class, "getIntent", methodHookParam.thisObject)).getExtras();
                        break;
                    default:
                        if (c7237.f17924 == null) {
                            String strM14531 = "PicUI bundle==null";
                            String str = AbstractC7017.f17361;
                            AbstractC7017.m12163(strM14531, "Run Log");
                        } else {
                            ArrayList arrayListM7210 = AbstractC3887.m7210(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                            Context context2 = (Context) methodHookParam.thisObject;
                            AbstractC3888.m7247(context2);
                            RelativeLayout relativeLayout2 = null;
                            int i7 = 0;
                            while (true) {
                                if (i7 < arrayListM7210.size()) {
                                    View view2 = (View) arrayListM7210.get(i7);
                                    if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i7 >= 3) {
                                        relativeLayout2 = (RelativeLayout) view2;
                                    }
                                    if (view2.getClass().equals(View.class)) {
                                        int color = context2.getColor(C0328R.color.____res_0x24060487);
                                        GradientDrawable gradientDrawable = new GradientDrawable();
                                        gradientDrawable.setShape(0);
                                        gradientDrawable.setColor(color);
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            gradientDrawable.setCornerRadius(0.0f);
                                        }
                                        view2.setBackground(gradientDrawable);
                                    } else {
                                        i7++;
                                    }
                                }
                            }
                            RelativeLayout relativeLayout3 = relativeLayout2;
                            final View viewInflate2 = LayoutInflater.from(context2).inflate(C0328R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView4 = (TextView) viewInflate2.findViewById(C0328R.id.pic_send_uin);
                            TextView textView5 = (TextView) viewInflate2.findViewById(C0328R.id.type);
                            textView5.setOnClickListener(new ViewOnClickListenerC6365(14));
                            TextView textView6 = (TextView) viewInflate2.findViewById(C0328R.id.pic_group_uin);
                            String string6 = c7237.f17924.getString("key_troop_group_name");
                            int i8 = c7237.f17924.getInt("uintype");
                            if (i8 == 1) {
                                string = c7237.f17924.getString("extra.GROUP_UIN");
                                textView5.setText("群聊消息 ");
                                textView6.setText("来自群组 : " + string6 + "(" + string + ")");
                                textView6.setOnClickListener(new ViewOnClickListenerC7227(context2, string, 3));
                            } else if (i8 == 0) {
                                textView6.setText("来自私聊与 " + string6 + " 的对话");
                                textView6.setOnClickListener(new ViewOnClickListenerC7227(string6, context2, 4));
                            }
                            Parcelable parcelable = c7237.f17924.getParcelable("extra.EXTRA_CURRENT_IMAGE");
                            for (Field field : parcelable.getClass().getDeclaredFields()) {
                                field.setAccessible(true);
                                if (field.getType().equals(String.class)) {
                                    String str2 = (String) field.get(parcelable);
                                    if (string != null) {
                                        if (C7237.m12525(str2) && !str2.equals(string)) {
                                            c7237.f17925 = field.getName();
                                        }
                                    } else if (C7237.m12525(str2) && !str2.equals(string6)) {
                                        c7237.f17925 = field.getName();
                                    }
                                }
                            }
                            try {
                                String str3 = (String) AbstractC7165.m12418(String.class, c7237.f17925, parcelable);
                                textView4.setText("发送者 : " + str3);
                                textView4.setOnClickListener(new ViewOnClickListenerC7227(str3, context2, 5));
                                int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                                int dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : -1;
                                viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪哲兰
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i72 = i6;
                                        View view3 = viewInflate2;
                                        switch (i72) {
                                            case 0:
                                                if (view3.getAlpha() < 50.0f) {
                                                    view3.setAlpha(1.0f);
                                                } else {
                                                    view3.setAlpha(0.0f);
                                                }
                                                break;
                                            default:
                                                if (view3.getAlpha() < 50.0f) {
                                                    view3.setAlpha(1.0f);
                                                } else {
                                                    view3.setAlpha(0.0f);
                                                }
                                                break;
                                        }
                                    }
                                });
                                viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC7082.m12313(context2, 10.0f));
                                relativeLayout3.addView(viewInflate2.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
    }
}
