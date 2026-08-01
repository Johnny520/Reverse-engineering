package p039;

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
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import p010.AbstractC6188;
import p018.AbstractC6253;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p033.AbstractC6333;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6408 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Bundle f17579;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f17580 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m11966(String str) {
        int length;
        if (!TextUtils.isEmpty(str) && (length = str.length()) >= 5 && length <= 10 && !str.startsWith(AbstractC8405.m13973("喵呜喵喵喵喵呜呜"))) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt >= '0' && cCharAt <= '9') {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        boolean zM6696 = AbstractC3056.m6696();
        final int i = 0;
        Class cls = Void.TYPE;
        if (zM6696) {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(Opcodes.ADD_INT_LIT8));
            m11830(AbstractC6333.m11843(clsM11866, cls, AbstractC8405.m13972(73), new Class[]{Bundle.class}), new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰苏哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6408 f17564;

                {
                    this.f17564 = this;
                }

                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i2;
                    RelativeLayout relativeLayout;
                    int i3;
                    int i4 = i;
                    String string = null;
                    final int i5 = 0;
                    final int i6 = 1;
                    C6408 c6408 = this.f17564;
                    switch (i4) {
                        case 0:
                            c6408.f17579 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                            break;
                        case 1:
                            Context context = (Context) methodHookParam.thisObject;
                            AbstractC3056.m6687(context);
                            Bundle bundle = c6408.f17579;
                            if (bundle != null && (i2 = bundle.getInt(AbstractC8405.m13972(231))) != 0) {
                                Iterator it = AbstractC3055.m6650(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
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
                                layoutParams.height = AbstractC6253.m11754(context, 80.0f) + layoutParams.height;
                                AbstractC3056.m6687(context);
                                final View viewInflate = LayoutInflater.from(context).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView = (TextView) viewInflate.findViewById(R.id.pic_send_uin);
                                TextView textView2 = (TextView) viewInflate.findViewById(R.id.type);
                                textView2.setOnClickListener(new ViewOnClickListenerC5533(15));
                                TextView textView3 = (TextView) viewInflate.findViewById(R.id.pic_group_uin);
                                if (i2 == 1) {
                                    c6408.f17579.getString(AbstractC8405.m13972(232));
                                    String string2 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.DIV_INT_LIT8));
                                    i3 = 232;
                                    String string3 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.REM_INT_LIT8));
                                    textView2.setText(AbstractC8405.m13972(Opcodes.AND_INT_LIT8));
                                    textView3.setText(AbstractC8405.m13972(Opcodes.OR_INT_LIT8) + string2 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + string3 + AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
                                    textView3.setOnClickListener(new ViewOnClickListenerC6398(context, string3, 0));
                                } else {
                                    i3 = 232;
                                    if (i2 == 0) {
                                        String string4 = c6408.f17579.getString(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"));
                                        textView3.setText(AbstractC8405.m13972(Opcodes.XOR_INT_LIT8) + string4 + AbstractC8405.m13972(Opcodes.SHL_INT_LIT8));
                                        textView3.setOnClickListener(new ViewOnClickListenerC6398(string4, context, 1));
                                    }
                                }
                                String string5 = c6408.f17579.getString(i2 == 1 ? AbstractC8405.m13972(i3) : AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"));
                                textView.setText(AbstractC8405.m13972(Opcodes.USHR_INT_LIT8) + string5);
                                textView.setOnClickListener(new ViewOnClickListenerC6398(string5, context, 2));
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
                            c6408.f17579 = ((Intent) AbstractC6333.m11846(Intent.class, AbstractC8405.m13972(230), methodHookParam.thisObject)).getExtras();
                            break;
                        default:
                            if (c6408.f17579 == null) {
                                String strM13972 = AbstractC8405.m13972(Opcodes.MUL_INT_LIT8);
                                String str = AbstractC6188.f17016;
                                AbstractC6188.m11604(strM13972, AbstractC8405.m13973("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
                            } else {
                                ArrayList arrayListM6650 = AbstractC3055.m6650(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                                Context context2 = (Context) methodHookParam.thisObject;
                                AbstractC3056.m6687(context2);
                                RelativeLayout relativeLayout2 = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayListM6650.size()) {
                                        View view2 = (View) arrayListM6650.get(i7);
                                        if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i7 >= 3) {
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
                                            i7++;
                                        }
                                    }
                                }
                                RelativeLayout relativeLayout3 = relativeLayout2;
                                final View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView4 = (TextView) viewInflate2.findViewById(R.id.pic_send_uin);
                                TextView textView5 = (TextView) viewInflate2.findViewById(R.id.type);
                                textView5.setOnClickListener(new ViewOnClickListenerC5533(14));
                                TextView textView6 = (TextView) viewInflate2.findViewById(R.id.pic_group_uin);
                                String string6 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.DIV_INT_LIT8));
                                int i8 = c6408.f17579.getInt(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵"));
                                if (i8 == 1) {
                                    string = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.REM_INT_LIT8));
                                    textView5.setText(AbstractC8405.m13972(Opcodes.AND_INT_LIT8));
                                    textView6.setText(AbstractC8405.m13972(Opcodes.OR_INT_LIT8) + string6 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + string + AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
                                    textView6.setOnClickListener(new ViewOnClickListenerC6398(context2, string, 3));
                                } else if (i8 == 0) {
                                    textView6.setText(AbstractC8405.m13972(Opcodes.XOR_INT_LIT8) + string6 + AbstractC8405.m13972(Opcodes.SHL_INT_LIT8));
                                    textView6.setOnClickListener(new ViewOnClickListenerC6398(string6, context2, 4));
                                }
                                Parcelable parcelable = c6408.f17579.getParcelable(AbstractC8405.m13972(Opcodes.SHR_INT_LIT8));
                                for (Field field : parcelable.getClass().getDeclaredFields()) {
                                    field.setAccessible(true);
                                    if (field.getType().equals(String.class)) {
                                        String str2 = (String) field.get(parcelable);
                                        if (string != null) {
                                            if (C6408.m11966(str2) && !str2.equals(string)) {
                                                c6408.f17580 = field.getName();
                                            }
                                        } else if (C6408.m11966(str2) && !str2.equals(string6)) {
                                            c6408.f17580 = field.getName();
                                        }
                                    }
                                }
                                try {
                                    String str3 = (String) AbstractC6336.m11859(String.class, c6408.f17580, parcelable);
                                    textView4.setText(AbstractC8405.m13972(Opcodes.USHR_INT_LIT8) + str3);
                                    textView4.setOnClickListener(new ViewOnClickListenerC6398(str3, context2, 5));
                                    int identifier = context2.getResources().getIdentifier(AbstractC8405.m13972(48), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
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
                                    viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC6253.m11754(context2, 10.0f));
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
            m11830(AbstractC6333.m11843(clsM11866, cls, AbstractC8405.m13972(62), new Class[0]), new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰苏哲

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ C6408 f17564;

                {
                    this.f17564 = this;
                }

                @Override // p026.InterfaceC6312
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                    int i22;
                    RelativeLayout relativeLayout;
                    int i3;
                    int i4 = i2;
                    String string = null;
                    final int i5 = 0;
                    final int i6 = 1;
                    C6408 c6408 = this.f17564;
                    switch (i4) {
                        case 0:
                            c6408.f17579 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                            break;
                        case 1:
                            Context context = (Context) methodHookParam.thisObject;
                            AbstractC3056.m6687(context);
                            Bundle bundle = c6408.f17579;
                            if (bundle != null && (i22 = bundle.getInt(AbstractC8405.m13972(231))) != 0) {
                                Iterator it = AbstractC3055.m6650(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
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
                                layoutParams.height = AbstractC6253.m11754(context, 80.0f) + layoutParams.height;
                                AbstractC3056.m6687(context);
                                final View viewInflate = LayoutInflater.from(context).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView = (TextView) viewInflate.findViewById(R.id.pic_send_uin);
                                TextView textView2 = (TextView) viewInflate.findViewById(R.id.type);
                                textView2.setOnClickListener(new ViewOnClickListenerC5533(15));
                                TextView textView3 = (TextView) viewInflate.findViewById(R.id.pic_group_uin);
                                if (i22 == 1) {
                                    c6408.f17579.getString(AbstractC8405.m13972(232));
                                    String string2 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.DIV_INT_LIT8));
                                    i3 = 232;
                                    String string3 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.REM_INT_LIT8));
                                    textView2.setText(AbstractC8405.m13972(Opcodes.AND_INT_LIT8));
                                    textView3.setText(AbstractC8405.m13972(Opcodes.OR_INT_LIT8) + string2 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + string3 + AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
                                    textView3.setOnClickListener(new ViewOnClickListenerC6398(context, string3, 0));
                                } else {
                                    i3 = 232;
                                    if (i22 == 0) {
                                        String string4 = c6408.f17579.getString(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"));
                                        textView3.setText(AbstractC8405.m13972(Opcodes.XOR_INT_LIT8) + string4 + AbstractC8405.m13972(Opcodes.SHL_INT_LIT8));
                                        textView3.setOnClickListener(new ViewOnClickListenerC6398(string4, context, 1));
                                    }
                                }
                                String string5 = c6408.f17579.getString(i22 == 1 ? AbstractC8405.m13972(i3) : AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"));
                                textView.setText(AbstractC8405.m13972(Opcodes.USHR_INT_LIT8) + string5);
                                textView.setOnClickListener(new ViewOnClickListenerC6398(string5, context, 2));
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
                            c6408.f17579 = ((Intent) AbstractC6333.m11846(Intent.class, AbstractC8405.m13972(230), methodHookParam.thisObject)).getExtras();
                            break;
                        default:
                            if (c6408.f17579 == null) {
                                String strM13972 = AbstractC8405.m13972(Opcodes.MUL_INT_LIT8);
                                String str = AbstractC6188.f17016;
                                AbstractC6188.m11604(strM13972, AbstractC8405.m13973("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
                            } else {
                                ArrayList arrayListM6650 = AbstractC3055.m6650(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                                Context context2 = (Context) methodHookParam.thisObject;
                                AbstractC3056.m6687(context2);
                                RelativeLayout relativeLayout2 = null;
                                int i7 = 0;
                                while (true) {
                                    if (i7 < arrayListM6650.size()) {
                                        View view2 = (View) arrayListM6650.get(i7);
                                        if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i7 >= 3) {
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
                                            i7++;
                                        }
                                    }
                                }
                                RelativeLayout relativeLayout3 = relativeLayout2;
                                final View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                                TextView textView4 = (TextView) viewInflate2.findViewById(R.id.pic_send_uin);
                                TextView textView5 = (TextView) viewInflate2.findViewById(R.id.type);
                                textView5.setOnClickListener(new ViewOnClickListenerC5533(14));
                                TextView textView6 = (TextView) viewInflate2.findViewById(R.id.pic_group_uin);
                                String string6 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.DIV_INT_LIT8));
                                int i8 = c6408.f17579.getInt(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵"));
                                if (i8 == 1) {
                                    string = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.REM_INT_LIT8));
                                    textView5.setText(AbstractC8405.m13972(Opcodes.AND_INT_LIT8));
                                    textView6.setText(AbstractC8405.m13972(Opcodes.OR_INT_LIT8) + string6 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + string + AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
                                    textView6.setOnClickListener(new ViewOnClickListenerC6398(context2, string, 3));
                                } else if (i8 == 0) {
                                    textView6.setText(AbstractC8405.m13972(Opcodes.XOR_INT_LIT8) + string6 + AbstractC8405.m13972(Opcodes.SHL_INT_LIT8));
                                    textView6.setOnClickListener(new ViewOnClickListenerC6398(string6, context2, 4));
                                }
                                Parcelable parcelable = c6408.f17579.getParcelable(AbstractC8405.m13972(Opcodes.SHR_INT_LIT8));
                                for (Field field : parcelable.getClass().getDeclaredFields()) {
                                    field.setAccessible(true);
                                    if (field.getType().equals(String.class)) {
                                        String str2 = (String) field.get(parcelable);
                                        if (string != null) {
                                            if (C6408.m11966(str2) && !str2.equals(string)) {
                                                c6408.f17580 = field.getName();
                                            }
                                        } else if (C6408.m11966(str2) && !str2.equals(string6)) {
                                            c6408.f17580 = field.getName();
                                        }
                                    }
                                }
                                try {
                                    String str3 = (String) AbstractC6336.m11859(String.class, c6408.f17580, parcelable);
                                    textView4.setText(AbstractC8405.m13972(Opcodes.USHR_INT_LIT8) + str3);
                                    textView4.setOnClickListener(new ViewOnClickListenerC6398(str3, context2, 5));
                                    int identifier = context2.getResources().getIdentifier(AbstractC8405.m13972(48), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
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
                                    viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC6253.m11754(context2, 10.0f));
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
        Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(Opcodes.RSUB_INT_LIT8));
        final int i3 = 2;
        m11830(AbstractC6333.m11843(clsM118662, cls, AbstractC8405.m13972(73), new Class[]{Bundle.class}), new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6408 f17564;

            {
                this.f17564 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22;
                RelativeLayout relativeLayout;
                int i32;
                int i4 = i3;
                String string = null;
                final int i5 = 0;
                final int i6 = 1;
                C6408 c6408 = this.f17564;
                switch (i4) {
                    case 0:
                        c6408.f17579 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                        break;
                    case 1:
                        Context context = (Context) methodHookParam.thisObject;
                        AbstractC3056.m6687(context);
                        Bundle bundle = c6408.f17579;
                        if (bundle != null && (i22 = bundle.getInt(AbstractC8405.m13972(231))) != 0) {
                            Iterator it = AbstractC3055.m6650(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
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
                            layoutParams.height = AbstractC6253.m11754(context, 80.0f) + layoutParams.height;
                            AbstractC3056.m6687(context);
                            final View viewInflate = LayoutInflater.from(context).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView = (TextView) viewInflate.findViewById(R.id.pic_send_uin);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.type);
                            textView2.setOnClickListener(new ViewOnClickListenerC5533(15));
                            TextView textView3 = (TextView) viewInflate.findViewById(R.id.pic_group_uin);
                            if (i22 == 1) {
                                c6408.f17579.getString(AbstractC8405.m13972(232));
                                String string2 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.DIV_INT_LIT8));
                                i32 = 232;
                                String string3 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.REM_INT_LIT8));
                                textView2.setText(AbstractC8405.m13972(Opcodes.AND_INT_LIT8));
                                textView3.setText(AbstractC8405.m13972(Opcodes.OR_INT_LIT8) + string2 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + string3 + AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
                                textView3.setOnClickListener(new ViewOnClickListenerC6398(context, string3, 0));
                            } else {
                                i32 = 232;
                                if (i22 == 0) {
                                    String string4 = c6408.f17579.getString(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"));
                                    textView3.setText(AbstractC8405.m13972(Opcodes.XOR_INT_LIT8) + string4 + AbstractC8405.m13972(Opcodes.SHL_INT_LIT8));
                                    textView3.setOnClickListener(new ViewOnClickListenerC6398(string4, context, 1));
                                }
                            }
                            String string5 = c6408.f17579.getString(i22 == 1 ? AbstractC8405.m13972(i32) : AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"));
                            textView.setText(AbstractC8405.m13972(Opcodes.USHR_INT_LIT8) + string5);
                            textView.setOnClickListener(new ViewOnClickListenerC6398(string5, context, 2));
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
                        c6408.f17579 = ((Intent) AbstractC6333.m11846(Intent.class, AbstractC8405.m13972(230), methodHookParam.thisObject)).getExtras();
                        break;
                    default:
                        if (c6408.f17579 == null) {
                            String strM13972 = AbstractC8405.m13972(Opcodes.MUL_INT_LIT8);
                            String str = AbstractC6188.f17016;
                            AbstractC6188.m11604(strM13972, AbstractC8405.m13973("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
                        } else {
                            ArrayList arrayListM6650 = AbstractC3055.m6650(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                            Context context2 = (Context) methodHookParam.thisObject;
                            AbstractC3056.m6687(context2);
                            RelativeLayout relativeLayout2 = null;
                            int i7 = 0;
                            while (true) {
                                if (i7 < arrayListM6650.size()) {
                                    View view2 = (View) arrayListM6650.get(i7);
                                    if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i7 >= 3) {
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
                                        i7++;
                                    }
                                }
                            }
                            RelativeLayout relativeLayout3 = relativeLayout2;
                            final View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView4 = (TextView) viewInflate2.findViewById(R.id.pic_send_uin);
                            TextView textView5 = (TextView) viewInflate2.findViewById(R.id.type);
                            textView5.setOnClickListener(new ViewOnClickListenerC5533(14));
                            TextView textView6 = (TextView) viewInflate2.findViewById(R.id.pic_group_uin);
                            String string6 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.DIV_INT_LIT8));
                            int i8 = c6408.f17579.getInt(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵"));
                            if (i8 == 1) {
                                string = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.REM_INT_LIT8));
                                textView5.setText(AbstractC8405.m13972(Opcodes.AND_INT_LIT8));
                                textView6.setText(AbstractC8405.m13972(Opcodes.OR_INT_LIT8) + string6 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + string + AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
                                textView6.setOnClickListener(new ViewOnClickListenerC6398(context2, string, 3));
                            } else if (i8 == 0) {
                                textView6.setText(AbstractC8405.m13972(Opcodes.XOR_INT_LIT8) + string6 + AbstractC8405.m13972(Opcodes.SHL_INT_LIT8));
                                textView6.setOnClickListener(new ViewOnClickListenerC6398(string6, context2, 4));
                            }
                            Parcelable parcelable = c6408.f17579.getParcelable(AbstractC8405.m13972(Opcodes.SHR_INT_LIT8));
                            for (Field field : parcelable.getClass().getDeclaredFields()) {
                                field.setAccessible(true);
                                if (field.getType().equals(String.class)) {
                                    String str2 = (String) field.get(parcelable);
                                    if (string != null) {
                                        if (C6408.m11966(str2) && !str2.equals(string)) {
                                            c6408.f17580 = field.getName();
                                        }
                                    } else if (C6408.m11966(str2) && !str2.equals(string6)) {
                                        c6408.f17580 = field.getName();
                                    }
                                }
                            }
                            try {
                                String str3 = (String) AbstractC6336.m11859(String.class, c6408.f17580, parcelable);
                                textView4.setText(AbstractC8405.m13972(Opcodes.USHR_INT_LIT8) + str3);
                                textView4.setOnClickListener(new ViewOnClickListenerC6398(str3, context2, 5));
                                int identifier = context2.getResources().getIdentifier(AbstractC8405.m13972(48), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
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
                                viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC6253.m11754(context2, 10.0f));
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
        m11830(AbstractC6333.m11843(clsM118662, cls, AbstractC8405.m13972(62), new Class[0]), new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪兰苏哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6408 f17564;

            {
                this.f17564 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22;
                RelativeLayout relativeLayout;
                int i32;
                int i42 = i4;
                String string = null;
                final int i5 = 0;
                final int i6 = 1;
                C6408 c6408 = this.f17564;
                switch (i42) {
                    case 0:
                        c6408.f17579 = ((Activity) methodHookParam.thisObject).getIntent().getExtras();
                        break;
                    case 1:
                        Context context = (Context) methodHookParam.thisObject;
                        AbstractC3056.m6687(context);
                        Bundle bundle = c6408.f17579;
                        if (bundle != null && (i22 = bundle.getInt(AbstractC8405.m13972(231))) != 0) {
                            Iterator it = AbstractC3055.m6650(((Activity) methodHookParam.thisObject).getWindow().getDecorView()).iterator();
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
                            layoutParams.height = AbstractC6253.m11754(context, 80.0f) + layoutParams.height;
                            AbstractC3056.m6687(context);
                            final View viewInflate = LayoutInflater.from(context).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView = (TextView) viewInflate.findViewById(R.id.pic_send_uin);
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.type);
                            textView2.setOnClickListener(new ViewOnClickListenerC5533(15));
                            TextView textView3 = (TextView) viewInflate.findViewById(R.id.pic_group_uin);
                            if (i22 == 1) {
                                c6408.f17579.getString(AbstractC8405.m13972(232));
                                String string2 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.DIV_INT_LIT8));
                                i32 = 232;
                                String string3 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.REM_INT_LIT8));
                                textView2.setText(AbstractC8405.m13972(Opcodes.AND_INT_LIT8));
                                textView3.setText(AbstractC8405.m13972(Opcodes.OR_INT_LIT8) + string2 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + string3 + AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
                                textView3.setOnClickListener(new ViewOnClickListenerC6398(context, string3, 0));
                            } else {
                                i32 = 232;
                                if (i22 == 0) {
                                    String string4 = c6408.f17579.getString(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"));
                                    textView3.setText(AbstractC8405.m13972(Opcodes.XOR_INT_LIT8) + string4 + AbstractC8405.m13972(Opcodes.SHL_INT_LIT8));
                                    textView3.setOnClickListener(new ViewOnClickListenerC6398(string4, context, 1));
                                }
                            }
                            String string5 = c6408.f17579.getString(i22 == 1 ? AbstractC8405.m13972(i32) : AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵"));
                            textView.setText(AbstractC8405.m13972(Opcodes.USHR_INT_LIT8) + string5);
                            textView.setOnClickListener(new ViewOnClickListenerC6398(string5, context, 2));
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
                        c6408.f17579 = ((Intent) AbstractC6333.m11846(Intent.class, AbstractC8405.m13972(230), methodHookParam.thisObject)).getExtras();
                        break;
                    default:
                        if (c6408.f17579 == null) {
                            String strM13972 = AbstractC8405.m13972(Opcodes.MUL_INT_LIT8);
                            String str = AbstractC6188.f17016;
                            AbstractC6188.m11604(strM13972, AbstractC8405.m13973("喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵呜喵喵呜喵喵喵~喵喵呜喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜呜喵"));
                        } else {
                            ArrayList arrayListM6650 = AbstractC3055.m6650(((Activity) methodHookParam.thisObject).getWindow().getDecorView());
                            Context context2 = (Context) methodHookParam.thisObject;
                            AbstractC3056.m6687(context2);
                            RelativeLayout relativeLayout2 = null;
                            int i7 = 0;
                            while (true) {
                                if (i7 < arrayListM6650.size()) {
                                    View view2 = (View) arrayListM6650.get(i7);
                                    if (relativeLayout2 == null && (view2 instanceof RelativeLayout) && i7 >= 3) {
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
                                        i7++;
                                    }
                                }
                            }
                            RelativeLayout relativeLayout3 = relativeLayout2;
                            final View viewInflate2 = LayoutInflater.from(context2).inflate(R.layout.pic_top_layout, (ViewGroup) null, false);
                            TextView textView4 = (TextView) viewInflate2.findViewById(R.id.pic_send_uin);
                            TextView textView5 = (TextView) viewInflate2.findViewById(R.id.type);
                            textView5.setOnClickListener(new ViewOnClickListenerC5533(14));
                            TextView textView6 = (TextView) viewInflate2.findViewById(R.id.pic_group_uin);
                            String string6 = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.DIV_INT_LIT8));
                            int i8 = c6408.f17579.getInt(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵喵"));
                            if (i8 == 1) {
                                string = c6408.f17579.getString(AbstractC8405.m13972(Opcodes.REM_INT_LIT8));
                                textView5.setText(AbstractC8405.m13972(Opcodes.AND_INT_LIT8));
                                textView6.setText(AbstractC8405.m13972(Opcodes.OR_INT_LIT8) + string6 + AbstractC8405.m13973("喵呜喵呜呜喵呜呜") + string + AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
                                textView6.setOnClickListener(new ViewOnClickListenerC6398(context2, string, 3));
                            } else if (i8 == 0) {
                                textView6.setText(AbstractC8405.m13972(Opcodes.XOR_INT_LIT8) + string6 + AbstractC8405.m13972(Opcodes.SHL_INT_LIT8));
                                textView6.setOnClickListener(new ViewOnClickListenerC6398(string6, context2, 4));
                            }
                            Parcelable parcelable = c6408.f17579.getParcelable(AbstractC8405.m13972(Opcodes.SHR_INT_LIT8));
                            for (Field field : parcelable.getClass().getDeclaredFields()) {
                                field.setAccessible(true);
                                if (field.getType().equals(String.class)) {
                                    String str2 = (String) field.get(parcelable);
                                    if (string != null) {
                                        if (C6408.m11966(str2) && !str2.equals(string)) {
                                            c6408.f17580 = field.getName();
                                        }
                                    } else if (C6408.m11966(str2) && !str2.equals(string6)) {
                                        c6408.f17580 = field.getName();
                                    }
                                }
                            }
                            try {
                                String str3 = (String) AbstractC6336.m11859(String.class, c6408.f17580, parcelable);
                                textView4.setText(AbstractC8405.m13972(Opcodes.USHR_INT_LIT8) + str3);
                                textView4.setOnClickListener(new ViewOnClickListenerC6398(str3, context2, 5));
                                int identifier = context2.getResources().getIdentifier(AbstractC8405.m13972(48), AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜"), AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"));
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
                                viewInflate2.setPadding(0, dimensionPixelSize, 0, AbstractC6253.m11754(context2, 10.0f));
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
