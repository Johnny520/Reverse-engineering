package Yue;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;

/* JADX INFO: renamed from: Yue.ۥۡۡ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6198 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f1887;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1888;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15219;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f15220;

    /* JADX INFO: renamed from: Yue.ۥۡۡ۟ۦ$ۥ */
    public class C0931 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15221;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15222;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15223;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15224;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15225;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15226;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f15227;

        public C0931() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f15221;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-1047253908049051107L);
                    f15221 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f15222;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(-7336377955711303647L);
                    f15222 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f15223;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(7000342148478431932L);
                    f15223 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f15224;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(8330621410826985291L);
                    f15224 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f15225;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(-3000240226739912645L);
                    f15225 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f15226;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(-9155206362240736573L);
                    f15226 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f15227;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-1427366544525735100L);
                    f15227 = strM22677;
                    return strM22677;
                default:
                    return null;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m19100(InputDialog inputDialog, View view, String str) {
            return false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m19101(View view) {
            new InputDialog(yue_xin_awa(3), yue_xin_awa(4), yue_xin_awa(5), yue_xin_awa(6)).setCancelable(false).setOkButton(new OnInputDialogButtonClickListener() { // from class: Yue.ۥۡۡ۟ۥ
                static {
                    NativeUtil.classesInit0(349);
                }

                @Override // com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener
                public final native boolean onClick(BaseDialog baseDialog, View view2, String str);
            }).show();
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.afterHookedMethod(methodHookParam);
            ViewGroup viewGroup = (ViewGroup) methodHookParam.thisObject;
            boolean z = false;
            for (View view : C8369.m27916(viewGroup)) {
                if ((view instanceof TextView) && ((TextView) view).getText().toString().equals(yue_xin_awa(0))) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            Context context = viewGroup.getContext();
            Class clsFindClass = XposedHelpers.findClass(yue_xin_awa(1), context.getClassLoader());
            if (!ViewGroup.MarginLayoutParams.class.isAssignableFrom(clsFindClass)) {
                throw new ClassCastException(yue_xin_awa(2));
            }
            Class cls = Integer.TYPE;
            ViewGroup.LayoutParams layoutParams = (ViewGroup.MarginLayoutParams) clsFindClass.getConstructor(cls, cls).newInstance(-2, -2);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(100, 100);
            ImageView imageView = new ImageView(context);
            imageView.setBackgroundResource(C2597R.C9029.f30499);
            imageView.setLayoutParams(layoutParams2);
            TextView textView = new TextView(context);
            textView.setText(yue_xin_awa(0));
            textView.setTextSize(10.0f);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: Yue.ۥۡۡ۟ۤ
                static {
                    NativeUtil.classesInit0(347);
                }

                @Override // android.view.View.OnClickListener
                public final native void onClick(View view2);
            });
            viewGroup.addView(linearLayout, layoutParams);
        }
    }

    static {
        NativeUtil.classesInit0(351);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);
}
