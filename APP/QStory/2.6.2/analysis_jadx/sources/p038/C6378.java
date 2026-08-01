package p038;

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
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.AbstractC3065;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import p007.AbstractC6136;
import p010.AbstractC6157;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p053.AbstractC6560;
import p175.AbstractC7738;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6378 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Bundle f17516;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f17517 = AbstractC3056.m6668(-3937561979095614887L);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m11915(String str) {
        int length;
        if (!TextUtils.isEmpty(str) && (length = str.length()) >= 5 && length <= 10 && !str.startsWith(AbstractC3056.m6668(-3937561652678100391L))) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        boolean zM12011 = AbstractC6560.m12011();
        final int i = 0;
        Class cls = Void.TYPE;
        if (zM12011) {
            Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937588320130041255L));
            m11802(AbstractC6314.m11815(clsM11838, cls, AbstractC3056.m6668(-3937554080650757543L), new Class[]{Bundle.class}), new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲兰楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6378 f17537;

                {
                    this.f17537 = this;
                }

                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i2;
                    RelativeLayout relativeLayout;
                    long j;
                    int i3 = i;
                    String string = null;
                    final int i4 = 0;
                    final int i5 = 1;
                    C6378 c6378 = this.f17537;
                    switch (i3) {
                        case 0:
                            c6378.f17516 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                            break;
                        case 1:
                            Context context = (Context) methodHookParam.thisObject;
                            AbstractC3065.m6858(context);
                            Bundle bundle = c6378.f17516;
                            if (bundle != null && (i2 = bundle.getInt(AbstractC3056.m6668(-3937586808301553063L))) != 0) {
                                Iterator it = AbstractC7738.m13052(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
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
                                layoutParams.height = AbstractC2904.m6267(context, 80.0f) + layoutParams.height;
                                AbstractC3065.m6858(context);
                                final View viewInflate = LayoutInflater.from(context).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView = (TextView) viewInflate.findViewById(R.id.pic_send_uin);
                                TextView textView2 = (TextView) viewInflate.findViewById(R.id.type);
                                textView2.setOnClickListener(new ViewOnClickListenerC5532(14));
                                TextView textView3 = (TextView) viewInflate.findViewById(R.id.pic_group_uin);
                                if (i2 == 1) {
                                    c6378.f17516.getString(AbstractC3056.m6668(-3937586773941814695L));
                                    String string2 = c6378.f17516.getString(AbstractC3056.m6668(-3937587770374227367L));
                                    j = -3937586675157566887L;
                                    String string3 = c6378.f17516.getString(AbstractC3056.m6668(-3937587620050372007L));
                                    textView2.setText(AbstractC3056.m6668(-3937587551330895271L));
                                    StringBuilder sb = new StringBuilder();
                                    AbstractC6136.m11544(-3937587542740960679L, sb, string2);
                                    AbstractC6136.m11544(-3937587577100699047L, sb, string3);
                                    sb.append(AbstractC3056.m6668(-3937587482611418535L));
                                    textView3.setText(sb.toString());
                                    textView3.setOnClickListener(new ViewOnClickListenerC6388(context, string3, 0));
                                } else {
                                    j = -3937586675157566887L;
                                    if (i2 == 0) {
                                        String string4 = c6378.f17516.getString(AbstractC3056.m6668(-3937586675157566887L));
                                        StringBuilder sb2 = new StringBuilder();
                                        AbstractC6136.m11544(-3937587491201353127L, sb2, string4);
                                        sb2.append(AbstractC3056.m6668(-3937587521266124199L));
                                        textView3.setText(sb2.toString());
                                        textView3.setOnClickListener(new ViewOnClickListenerC6388(string4, context, 1));
                                    }
                                }
                                String string5 = c6378.f17516.getString(i2 == 1 ? AbstractC3056.m6668(-3937586773941814695L) : AbstractC3056.m6668(j));
                                textView.setText(AbstractC3056.m6668(-3937587379532203431L) + string5);
                                textView.setOnClickListener(new ViewOnClickListenerC6388(string5, context, 2));
                                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i6 = i4;
                                        View view3 = viewInflate;
                                        switch (i6) {
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
                            c6378.f17516 = ((Intent) AbstractC6314.m11818(Intent.class, AbstractC3056.m6668(-3937586902790833575L), methodHookParam.thisObject)).getExtras();
                            break;
                        default:
                            if (c6378.f17516 == null) {
                                String strM6668 = AbstractC3056.m6668(-3937587826208802215L);
                                String str = AbstractC6157.f16779;
                                AbstractC6157.m11573(strM6668, AbstractC3056.m6668(-3937633150998676903L));
                            } else {
                                ArrayList arrayListM13052 = AbstractC7738.m13052(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                                Context context2 = (Context) methodHookParam.thisObject;
                                AbstractC3065.m6858(context2);
                                int i6 = 0;
                                RelativeLayout relativeLayout2 = null;
                                while (true) {
                                    if (i6 < arrayListM13052.size()) {
                                        View view2 = (View) arrayListM13052.get(i6);
                                        if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i6 >= 3) {
                                            relativeLayout2 = (RelativeLayout) view2;
                                        }
                                        if (view2.getClass().equals(View.class)) {
                                            int color = context2.getColor(R.color.____res_0x24060487);
                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                            gradientDrawable.setShape(0);
                                            gradientDrawable.setColor(color);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                gradientDrawable.setCornerRadius(0.0f);
                                            }
                                            view2.setBackground(gradientDrawable);
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                                final View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView4 = (TextView) viewInflate2.findViewById(R.id.pic_send_uin);
                                TextView textView5 = (TextView) viewInflate2.findViewById(R.id.type);
                                textView5.setOnClickListener(new ViewOnClickListenerC5532(13));
                                TextView textView6 = (TextView) viewInflate2.findViewById(R.id.pic_group_uin);
                                String string6 = c6378.f17516.getString(AbstractC3056.m6668(-3937587770374227367L));
                                int i7 = c6378.f17516.getInt(AbstractC3056.m6668(-3937587723129587111L));
                                if (i7 == 1) {
                                    string = c6378.f17516.getString(AbstractC3056.m6668(-3937587620050372007L));
                                    textView5.setText(AbstractC3056.m6668(-3937587551330895271L));
                                    StringBuilder sb3 = new StringBuilder();
                                    AbstractC6136.m11544(-3937587542740960679L, sb3, string6);
                                    AbstractC6136.m11544(-3937587577100699047L, sb3, string);
                                    sb3.append(AbstractC3056.m6668(-3937587482611418535L));
                                    textView6.setText(sb3.toString());
                                    textView6.setOnClickListener(new ViewOnClickListenerC6388(context2, string, 3));
                                } else if (i7 == 0) {
                                    StringBuilder sb4 = new StringBuilder();
                                    AbstractC6136.m11544(-3937587491201353127L, sb4, string6);
                                    sb4.append(AbstractC3056.m6668(-3937587521266124199L));
                                    textView6.setText(sb4.toString());
                                    textView6.setOnClickListener(new ViewOnClickListenerC6388(string6, context2, 4));
                                }
                                Parcelable parcelable = c6378.f17516.getParcelable(AbstractC3056.m6668(-3937587508381222311L));
                                for (Field field : parcelable.getClass().getDeclaredFields()) {
                                    field.setAccessible(true);
                                    if (field.getType().equals(String.class)) {
                                        String str2 = (String) field.get(parcelable);
                                        if (string != null) {
                                            if (C6378.m11915(str2) && !str2.equals(string)) {
                                                c6378.f17517 = field.getName();
                                            }
                                        } else if (C6378.m11915(str2) && !str2.equals(string6)) {
                                            c6378.f17517 = field.getName();
                                        }
                                    }
                                }
                                try {
                                    String str3 = (String) AbstractC6317.m11831(String.class, c6378.f17517, parcelable);
                                    textView4.setText(AbstractC3056.m6668(-3937587379532203431L) + str3);
                                    textView4.setOnClickListener(new ViewOnClickListenerC6388(str3, context2, 5));
                                    int identifier = context2.getResources().getIdentifier(AbstractC3056.m6668(-3937556271084078503L), AbstractC3056.m6668(-3937556348393489831L), AbstractC3056.m6668(-3937556374163293607L));
                                    int dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : -1;
                                    viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view22) {
                                            int i62 = i5;
                                            View view3 = viewInflate2;
                                            switch (i62) {
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
                                    viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC2904.m6267(context2, 10.0f));
                                    relativeLayout2.addView(viewInflate2.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            m11802(AbstractC6314.m11815(clsM11838, cls, AbstractC3056.m6668(-3937555107147941287L), new Class[0]), new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲兰楪

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6378 f17537;

                {
                    this.f17537 = this;
                }

                @Override // p026.InterfaceC6294
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i22;
                    RelativeLayout relativeLayout;
                    long j;
                    int i3 = i2;
                    String string = null;
                    final int i4 = 0;
                    final int i5 = 1;
                    C6378 c6378 = this.f17537;
                    switch (i3) {
                        case 0:
                            c6378.f17516 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                            break;
                        case 1:
                            Context context = (Context) methodHookParam.thisObject;
                            AbstractC3065.m6858(context);
                            Bundle bundle = c6378.f17516;
                            if (bundle != null && (i22 = bundle.getInt(AbstractC3056.m6668(-3937586808301553063L))) != 0) {
                                Iterator it = AbstractC7738.m13052(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
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
                                layoutParams.height = AbstractC2904.m6267(context, 80.0f) + layoutParams.height;
                                AbstractC3065.m6858(context);
                                final View viewInflate = LayoutInflater.from(context).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView = (TextView) viewInflate.findViewById(R.id.pic_send_uin);
                                TextView textView2 = (TextView) viewInflate.findViewById(R.id.type);
                                textView2.setOnClickListener(new ViewOnClickListenerC5532(14));
                                TextView textView3 = (TextView) viewInflate.findViewById(R.id.pic_group_uin);
                                if (i22 == 1) {
                                    c6378.f17516.getString(AbstractC3056.m6668(-3937586773941814695L));
                                    String string2 = c6378.f17516.getString(AbstractC3056.m6668(-3937587770374227367L));
                                    j = -3937586675157566887L;
                                    String string3 = c6378.f17516.getString(AbstractC3056.m6668(-3937587620050372007L));
                                    textView2.setText(AbstractC3056.m6668(-3937587551330895271L));
                                    StringBuilder sb = new StringBuilder();
                                    AbstractC6136.m11544(-3937587542740960679L, sb, string2);
                                    AbstractC6136.m11544(-3937587577100699047L, sb, string3);
                                    sb.append(AbstractC3056.m6668(-3937587482611418535L));
                                    textView3.setText(sb.toString());
                                    textView3.setOnClickListener(new ViewOnClickListenerC6388(context, string3, 0));
                                } else {
                                    j = -3937586675157566887L;
                                    if (i22 == 0) {
                                        String string4 = c6378.f17516.getString(AbstractC3056.m6668(-3937586675157566887L));
                                        StringBuilder sb2 = new StringBuilder();
                                        AbstractC6136.m11544(-3937587491201353127L, sb2, string4);
                                        sb2.append(AbstractC3056.m6668(-3937587521266124199L));
                                        textView3.setText(sb2.toString());
                                        textView3.setOnClickListener(new ViewOnClickListenerC6388(string4, context, 1));
                                    }
                                }
                                String string5 = c6378.f17516.getString(i22 == 1 ? AbstractC3056.m6668(-3937586773941814695L) : AbstractC3056.m6668(j));
                                textView.setText(AbstractC3056.m6668(-3937587379532203431L) + string5);
                                textView.setOnClickListener(new ViewOnClickListenerC6388(string5, context, 2));
                                viewInflate.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i62 = i4;
                                        View view3 = viewInflate;
                                        switch (i62) {
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
                            c6378.f17516 = ((Intent) AbstractC6314.m11818(Intent.class, AbstractC3056.m6668(-3937586902790833575L), methodHookParam.thisObject)).getExtras();
                            break;
                        default:
                            if (c6378.f17516 == null) {
                                String strM6668 = AbstractC3056.m6668(-3937587826208802215L);
                                String str = AbstractC6157.f16779;
                                AbstractC6157.m11573(strM6668, AbstractC3056.m6668(-3937633150998676903L));
                            } else {
                                ArrayList arrayListM13052 = AbstractC7738.m13052(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                                Context context2 = (Context) methodHookParam.thisObject;
                                AbstractC3065.m6858(context2);
                                int i6 = 0;
                                RelativeLayout relativeLayout2 = null;
                                while (true) {
                                    if (i6 < arrayListM13052.size()) {
                                        View view2 = (View) arrayListM13052.get(i6);
                                        if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i6 >= 3) {
                                            relativeLayout2 = (RelativeLayout) view2;
                                        }
                                        if (view2.getClass().equals(View.class)) {
                                            int color = context2.getColor(R.color.____res_0x24060487);
                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                            gradientDrawable.setShape(0);
                                            gradientDrawable.setColor(color);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                gradientDrawable.setCornerRadius(0.0f);
                                            }
                                            view2.setBackground(gradientDrawable);
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                                final View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView4 = (TextView) viewInflate2.findViewById(R.id.pic_send_uin);
                                TextView textView5 = (TextView) viewInflate2.findViewById(R.id.type);
                                textView5.setOnClickListener(new ViewOnClickListenerC5532(13));
                                TextView textView6 = (TextView) viewInflate2.findViewById(R.id.pic_group_uin);
                                String string6 = c6378.f17516.getString(AbstractC3056.m6668(-3937587770374227367L));
                                int i7 = c6378.f17516.getInt(AbstractC3056.m6668(-3937587723129587111L));
                                if (i7 == 1) {
                                    string = c6378.f17516.getString(AbstractC3056.m6668(-3937587620050372007L));
                                    textView5.setText(AbstractC3056.m6668(-3937587551330895271L));
                                    StringBuilder sb3 = new StringBuilder();
                                    AbstractC6136.m11544(-3937587542740960679L, sb3, string6);
                                    AbstractC6136.m11544(-3937587577100699047L, sb3, string);
                                    sb3.append(AbstractC3056.m6668(-3937587482611418535L));
                                    textView6.setText(sb3.toString());
                                    textView6.setOnClickListener(new ViewOnClickListenerC6388(context2, string, 3));
                                } else if (i7 == 0) {
                                    StringBuilder sb4 = new StringBuilder();
                                    AbstractC6136.m11544(-3937587491201353127L, sb4, string6);
                                    sb4.append(AbstractC3056.m6668(-3937587521266124199L));
                                    textView6.setText(sb4.toString());
                                    textView6.setOnClickListener(new ViewOnClickListenerC6388(string6, context2, 4));
                                }
                                Parcelable parcelable = c6378.f17516.getParcelable(AbstractC3056.m6668(-3937587508381222311L));
                                for (Field field : parcelable.getClass().getDeclaredFields()) {
                                    field.setAccessible(true);
                                    if (field.getType().equals(String.class)) {
                                        String str2 = (String) field.get(parcelable);
                                        if (string != null) {
                                            if (C6378.m11915(str2) && !str2.equals(string)) {
                                                c6378.f17517 = field.getName();
                                            }
                                        } else if (C6378.m11915(str2) && !str2.equals(string6)) {
                                            c6378.f17517 = field.getName();
                                        }
                                    }
                                }
                                try {
                                    String str3 = (String) AbstractC6317.m11831(String.class, c6378.f17517, parcelable);
                                    textView4.setText(AbstractC3056.m6668(-3937587379532203431L) + str3);
                                    textView4.setOnClickListener(new ViewOnClickListenerC6388(str3, context2, 5));
                                    int identifier = context2.getResources().getIdentifier(AbstractC3056.m6668(-3937556271084078503L), AbstractC3056.m6668(-3937556348393489831L), AbstractC3056.m6668(-3937556374163293607L));
                                    int dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : -1;
                                    viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view22) {
                                            int i62 = i5;
                                            View view3 = viewInflate2;
                                            switch (i62) {
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
                                    viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC2904.m6267(context2, 10.0f));
                                    relativeLayout2.addView(viewInflate2.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
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
        Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937588096791741863L));
        final int i3 = 2;
        m11802(AbstractC6314.m11815(clsM118382, cls, AbstractC3056.m6668(-3937554080650757543L), new Class[]{Bundle.class}), new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲兰楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6378 f17537;

            {
                this.f17537 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22;
                RelativeLayout relativeLayout;
                long j;
                int i32 = i3;
                String string = null;
                final int i4 = 0;
                final int i5 = 1;
                C6378 c6378 = this.f17537;
                switch (i32) {
                    case 0:
                        c6378.f17516 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                        break;
                    case 1:
                        Context context = (Context) methodHookParam.thisObject;
                        AbstractC3065.m6858(context);
                        Bundle bundle = c6378.f17516;
                        if (bundle != null && (i22 = bundle.getInt(AbstractC3056.m6668(-3937586808301553063L))) != 0) {
                            Iterator it = AbstractC7738.m13052(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
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
                            layoutParams.height = AbstractC2904.m6267(context, 80.0f) + layoutParams.height;
                            AbstractC3065.m6858(context);
                            final View viewInflate = LayoutInflater.from(context).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView = (TextView) viewInflate.findViewById(R.id.pic_send_uin);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.type);
                            textView2.setOnClickListener(new ViewOnClickListenerC5532(14));
                            TextView textView3 = (TextView) viewInflate.findViewById(R.id.pic_group_uin);
                            if (i22 == 1) {
                                c6378.f17516.getString(AbstractC3056.m6668(-3937586773941814695L));
                                String string2 = c6378.f17516.getString(AbstractC3056.m6668(-3937587770374227367L));
                                j = -3937586675157566887L;
                                String string3 = c6378.f17516.getString(AbstractC3056.m6668(-3937587620050372007L));
                                textView2.setText(AbstractC3056.m6668(-3937587551330895271L));
                                StringBuilder sb = new StringBuilder();
                                AbstractC6136.m11544(-3937587542740960679L, sb, string2);
                                AbstractC6136.m11544(-3937587577100699047L, sb, string3);
                                sb.append(AbstractC3056.m6668(-3937587482611418535L));
                                textView3.setText(sb.toString());
                                textView3.setOnClickListener(new ViewOnClickListenerC6388(context, string3, 0));
                            } else {
                                j = -3937586675157566887L;
                                if (i22 == 0) {
                                    String string4 = c6378.f17516.getString(AbstractC3056.m6668(-3937586675157566887L));
                                    StringBuilder sb2 = new StringBuilder();
                                    AbstractC6136.m11544(-3937587491201353127L, sb2, string4);
                                    sb2.append(AbstractC3056.m6668(-3937587521266124199L));
                                    textView3.setText(sb2.toString());
                                    textView3.setOnClickListener(new ViewOnClickListenerC6388(string4, context, 1));
                                }
                            }
                            String string5 = c6378.f17516.getString(i22 == 1 ? AbstractC3056.m6668(-3937586773941814695L) : AbstractC3056.m6668(j));
                            textView.setText(AbstractC3056.m6668(-3937587379532203431L) + string5);
                            textView.setOnClickListener(new ViewOnClickListenerC6388(string5, context, 2));
                            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view22) {
                                    int i62 = i4;
                                    View view3 = viewInflate;
                                    switch (i62) {
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
                        c6378.f17516 = ((Intent) AbstractC6314.m11818(Intent.class, AbstractC3056.m6668(-3937586902790833575L), methodHookParam.thisObject)).getExtras();
                        break;
                    default:
                        if (c6378.f17516 == null) {
                            String strM6668 = AbstractC3056.m6668(-3937587826208802215L);
                            String str = AbstractC6157.f16779;
                            AbstractC6157.m11573(strM6668, AbstractC3056.m6668(-3937633150998676903L));
                        } else {
                            ArrayList arrayListM13052 = AbstractC7738.m13052(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                            Context context2 = (Context) methodHookParam.thisObject;
                            AbstractC3065.m6858(context2);
                            int i6 = 0;
                            RelativeLayout relativeLayout2 = null;
                            while (true) {
                                if (i6 < arrayListM13052.size()) {
                                    View view2 = (View) arrayListM13052.get(i6);
                                    if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i6 >= 3) {
                                        relativeLayout2 = (RelativeLayout) view2;
                                    }
                                    if (view2.getClass().equals(View.class)) {
                                        int color = context2.getColor(R.color.____res_0x24060487);
                                        GradientDrawable gradientDrawable = new GradientDrawable();
                                        gradientDrawable.setShape(0);
                                        gradientDrawable.setColor(color);
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            gradientDrawable.setCornerRadius(0.0f);
                                        }
                                        view2.setBackground(gradientDrawable);
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            final View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView4 = (TextView) viewInflate2.findViewById(R.id.pic_send_uin);
                            TextView textView5 = (TextView) viewInflate2.findViewById(R.id.type);
                            textView5.setOnClickListener(new ViewOnClickListenerC5532(13));
                            TextView textView6 = (TextView) viewInflate2.findViewById(R.id.pic_group_uin);
                            String string6 = c6378.f17516.getString(AbstractC3056.m6668(-3937587770374227367L));
                            int i7 = c6378.f17516.getInt(AbstractC3056.m6668(-3937587723129587111L));
                            if (i7 == 1) {
                                string = c6378.f17516.getString(AbstractC3056.m6668(-3937587620050372007L));
                                textView5.setText(AbstractC3056.m6668(-3937587551330895271L));
                                StringBuilder sb3 = new StringBuilder();
                                AbstractC6136.m11544(-3937587542740960679L, sb3, string6);
                                AbstractC6136.m11544(-3937587577100699047L, sb3, string);
                                sb3.append(AbstractC3056.m6668(-3937587482611418535L));
                                textView6.setText(sb3.toString());
                                textView6.setOnClickListener(new ViewOnClickListenerC6388(context2, string, 3));
                            } else if (i7 == 0) {
                                StringBuilder sb4 = new StringBuilder();
                                AbstractC6136.m11544(-3937587491201353127L, sb4, string6);
                                sb4.append(AbstractC3056.m6668(-3937587521266124199L));
                                textView6.setText(sb4.toString());
                                textView6.setOnClickListener(new ViewOnClickListenerC6388(string6, context2, 4));
                            }
                            Parcelable parcelable = c6378.f17516.getParcelable(AbstractC3056.m6668(-3937587508381222311L));
                            for (Field field : parcelable.getClass().getDeclaredFields()) {
                                field.setAccessible(true);
                                if (field.getType().equals(String.class)) {
                                    String str2 = (String) field.get(parcelable);
                                    if (string != null) {
                                        if (C6378.m11915(str2) && !str2.equals(string)) {
                                            c6378.f17517 = field.getName();
                                        }
                                    } else if (C6378.m11915(str2) && !str2.equals(string6)) {
                                        c6378.f17517 = field.getName();
                                    }
                                }
                            }
                            try {
                                String str3 = (String) AbstractC6317.m11831(String.class, c6378.f17517, parcelable);
                                textView4.setText(AbstractC3056.m6668(-3937587379532203431L) + str3);
                                textView4.setOnClickListener(new ViewOnClickListenerC6388(str3, context2, 5));
                                int identifier = context2.getResources().getIdentifier(AbstractC3056.m6668(-3937556271084078503L), AbstractC3056.m6668(-3937556348393489831L), AbstractC3056.m6668(-3937556374163293607L));
                                int dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : -1;
                                viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i62 = i5;
                                        View view3 = viewInflate2;
                                        switch (i62) {
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
                                viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC2904.m6267(context2, 10.0f));
                                relativeLayout2.addView(viewInflate2.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        break;
                }
            }
        });
        final int i4 = 3;
        m11802(AbstractC6314.m11815(clsM118382, cls, AbstractC3056.m6668(-3937555107147941287L), new Class[0]), new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏哲兰楪

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6378 f17537;

            {
                this.f17537 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22;
                RelativeLayout relativeLayout;
                long j;
                int i32 = i4;
                String string = null;
                final int i42 = 0;
                final int i5 = 1;
                C6378 c6378 = this.f17537;
                switch (i32) {
                    case 0:
                        c6378.f17516 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                        break;
                    case 1:
                        Context context = (Context) methodHookParam.thisObject;
                        AbstractC3065.m6858(context);
                        Bundle bundle = c6378.f17516;
                        if (bundle != null && (i22 = bundle.getInt(AbstractC3056.m6668(-3937586808301553063L))) != 0) {
                            Iterator it = AbstractC7738.m13052(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
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
                            layoutParams.height = AbstractC2904.m6267(context, 80.0f) + layoutParams.height;
                            AbstractC3065.m6858(context);
                            final View viewInflate = LayoutInflater.from(context).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView = (TextView) viewInflate.findViewById(R.id.pic_send_uin);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.type);
                            textView2.setOnClickListener(new ViewOnClickListenerC5532(14));
                            TextView textView3 = (TextView) viewInflate.findViewById(R.id.pic_group_uin);
                            if (i22 == 1) {
                                c6378.f17516.getString(AbstractC3056.m6668(-3937586773941814695L));
                                String string2 = c6378.f17516.getString(AbstractC3056.m6668(-3937587770374227367L));
                                j = -3937586675157566887L;
                                String string3 = c6378.f17516.getString(AbstractC3056.m6668(-3937587620050372007L));
                                textView2.setText(AbstractC3056.m6668(-3937587551330895271L));
                                StringBuilder sb = new StringBuilder();
                                AbstractC6136.m11544(-3937587542740960679L, sb, string2);
                                AbstractC6136.m11544(-3937587577100699047L, sb, string3);
                                sb.append(AbstractC3056.m6668(-3937587482611418535L));
                                textView3.setText(sb.toString());
                                textView3.setOnClickListener(new ViewOnClickListenerC6388(context, string3, 0));
                            } else {
                                j = -3937586675157566887L;
                                if (i22 == 0) {
                                    String string4 = c6378.f17516.getString(AbstractC3056.m6668(-3937586675157566887L));
                                    StringBuilder sb2 = new StringBuilder();
                                    AbstractC6136.m11544(-3937587491201353127L, sb2, string4);
                                    sb2.append(AbstractC3056.m6668(-3937587521266124199L));
                                    textView3.setText(sb2.toString());
                                    textView3.setOnClickListener(new ViewOnClickListenerC6388(string4, context, 1));
                                }
                            }
                            String string5 = c6378.f17516.getString(i22 == 1 ? AbstractC3056.m6668(-3937586773941814695L) : AbstractC3056.m6668(j));
                            textView.setText(AbstractC3056.m6668(-3937587379532203431L) + string5);
                            textView.setOnClickListener(new ViewOnClickListenerC6388(string5, context, 2));
                            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view22) {
                                    int i62 = i42;
                                    View view3 = viewInflate;
                                    switch (i62) {
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
                        c6378.f17516 = ((Intent) AbstractC6314.m11818(Intent.class, AbstractC3056.m6668(-3937586902790833575L), methodHookParam.thisObject)).getExtras();
                        break;
                    default:
                        if (c6378.f17516 == null) {
                            String strM6668 = AbstractC3056.m6668(-3937587826208802215L);
                            String str = AbstractC6157.f16779;
                            AbstractC6157.m11573(strM6668, AbstractC3056.m6668(-3937633150998676903L));
                        } else {
                            ArrayList arrayListM13052 = AbstractC7738.m13052(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                            Context context2 = (Context) methodHookParam.thisObject;
                            AbstractC3065.m6858(context2);
                            int i6 = 0;
                            RelativeLayout relativeLayout2 = null;
                            while (true) {
                                if (i6 < arrayListM13052.size()) {
                                    View view2 = (View) arrayListM13052.get(i6);
                                    if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i6 >= 3) {
                                        relativeLayout2 = (RelativeLayout) view2;
                                    }
                                    if (view2.getClass().equals(View.class)) {
                                        int color = context2.getColor(R.color.____res_0x24060487);
                                        GradientDrawable gradientDrawable = new GradientDrawable();
                                        gradientDrawable.setShape(0);
                                        gradientDrawable.setColor(color);
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            gradientDrawable.setCornerRadius(0.0f);
                                        }
                                        view2.setBackground(gradientDrawable);
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            final View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView4 = (TextView) viewInflate2.findViewById(R.id.pic_send_uin);
                            TextView textView5 = (TextView) viewInflate2.findViewById(R.id.type);
                            textView5.setOnClickListener(new ViewOnClickListenerC5532(13));
                            TextView textView6 = (TextView) viewInflate2.findViewById(R.id.pic_group_uin);
                            String string6 = c6378.f17516.getString(AbstractC3056.m6668(-3937587770374227367L));
                            int i7 = c6378.f17516.getInt(AbstractC3056.m6668(-3937587723129587111L));
                            if (i7 == 1) {
                                string = c6378.f17516.getString(AbstractC3056.m6668(-3937587620050372007L));
                                textView5.setText(AbstractC3056.m6668(-3937587551330895271L));
                                StringBuilder sb3 = new StringBuilder();
                                AbstractC6136.m11544(-3937587542740960679L, sb3, string6);
                                AbstractC6136.m11544(-3937587577100699047L, sb3, string);
                                sb3.append(AbstractC3056.m6668(-3937587482611418535L));
                                textView6.setText(sb3.toString());
                                textView6.setOnClickListener(new ViewOnClickListenerC6388(context2, string, 3));
                            } else if (i7 == 0) {
                                StringBuilder sb4 = new StringBuilder();
                                AbstractC6136.m11544(-3937587491201353127L, sb4, string6);
                                sb4.append(AbstractC3056.m6668(-3937587521266124199L));
                                textView6.setText(sb4.toString());
                                textView6.setOnClickListener(new ViewOnClickListenerC6388(string6, context2, 4));
                            }
                            Parcelable parcelable = c6378.f17516.getParcelable(AbstractC3056.m6668(-3937587508381222311L));
                            for (Field field : parcelable.getClass().getDeclaredFields()) {
                                field.setAccessible(true);
                                if (field.getType().equals(String.class)) {
                                    String str2 = (String) field.get(parcelable);
                                    if (string != null) {
                                        if (C6378.m11915(str2) && !str2.equals(string)) {
                                            c6378.f17517 = field.getName();
                                        }
                                    } else if (C6378.m11915(str2) && !str2.equals(string6)) {
                                        c6378.f17517 = field.getName();
                                    }
                                }
                            }
                            try {
                                String str3 = (String) AbstractC6317.m11831(String.class, c6378.f17517, parcelable);
                                textView4.setText(AbstractC3056.m6668(-3937587379532203431L) + str3);
                                textView4.setOnClickListener(new ViewOnClickListenerC6388(str3, context2, 5));
                                int identifier = context2.getResources().getIdentifier(AbstractC3056.m6668(-3937556271084078503L), AbstractC3056.m6668(-3937556348393489831L), AbstractC3056.m6668(-3937556374163293607L));
                                int dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : -1;
                                viewInflate2.setOnClickListener(new View.OnClickListener() { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏兰哲楪
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view22) {
                                        int i62 = i5;
                                        View view3 = viewInflate2;
                                        switch (i62) {
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
                                viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC2904.m6267(context2, 10.0f));
                                relativeLayout2.addView(viewInflate2.getRootView(), new RelativeLayout.LayoutParams(-1, -2));
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
