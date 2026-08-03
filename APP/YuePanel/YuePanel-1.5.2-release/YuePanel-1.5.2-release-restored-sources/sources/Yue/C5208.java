package Yue;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"SetTextI18n"})
public class C5208 {

    /* JADX INFO: renamed from: ۥ */
    public static Integer f1339;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Integer f1340;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Integer f12331;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Integer f12332;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Integer f12333;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Integer f12334;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Integer f12335;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Integer f12336;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Integer f12337;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static Integer f12338;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static Integer f12339;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static Integer f12340;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static Integer f12341;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static Integer f12342;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static Integer f12343;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static Integer f12344;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static Integer f12345;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static Integer f12346;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean f12347;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final List<String> f12348;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12349;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12350;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12351;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12352;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12353;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12354;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12355;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12356;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12357;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12358;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12359;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12360;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12361;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12362;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12363;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12364;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12365;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12366;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12367;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12368;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12369;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12370;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12371;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12372;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12373;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12374;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12375;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12376;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12377;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12378;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12379;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12380;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12381;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12382;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12383;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12384;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12385;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12386;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12387;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12388;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12389;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12390;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12391;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12392;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12393;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12394;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12395;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12396;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12397;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12398;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12399;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12400;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12401;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12402;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12403;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨۦ$ۥ */
    public class C0666 implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12404;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12405;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12406;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Spinner f12407;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ TextView f12408;

        static {
            NativeUtil.classesInit0(280);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0666(Spinner spinner, TextView textView) {
            this.f12407 = spinner;
            this.f12408 = textView;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public native void onItemSelected(AdapterView<?> adapterView, View view, int i, long j);

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public native void onNothingSelected(AdapterView<?> adapterView);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨۦ$ۥ۟ */
    public class C0667 implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12409;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12410;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12411;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Spinner f12412;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ TextView f12413;

        static {
            NativeUtil.classesInit0(187);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0667(Spinner spinner, TextView textView) {
            this.f12412 = spinner;
            this.f12413 = textView;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public native void onItemSelected(AdapterView<?> adapterView, View view, int i, long j);

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public native void onNothingSelected(AdapterView<?> adapterView);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨۦ$ۥ۟۟, reason: contains not printable characters */
    public class C5209 extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Context f12414;

        static {
            NativeUtil.classesInit0(725);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5209(Context context, int i, List list, Context context2) {
            super(context, i, list);
            this.f12414 = context2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public native View getDropDownView(int i, View view, ViewGroup viewGroup);

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public native View getView(int i, View view, ViewGroup viewGroup);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨۦ$ۥ۟۟۟, reason: contains not printable characters */
    public class C5210 extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Context f12415;

        static {
            NativeUtil.classesInit0(4);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5210(Context context, int i, String[] strArr, Context context2) {
            super(context, i, strArr);
            this.f12415 = context2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public native View getDropDownView(int i, View view, ViewGroup viewGroup);

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public native View getView(int i, View view, ViewGroup viewGroup);
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ class C5211 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f1341;

        static {
            int[] iArr = new int[EnumC4453.values().length];
            f1341 = iArr;
            try {
                iArr[EnumC4453.f9217.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1341[EnumC4453.f9219.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1341[EnumC4453.f9220.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1341[EnumC4453.f9222.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1341[EnumC4453.f9223.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1341[EnumC4453.f9224.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1341[EnumC4453.f9225.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1341[EnumC4453.f9226.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1341[EnumC4453.f9218.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f1341[EnumC4453.f9227.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f1341[EnumC4453.f9229.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f1341[EnumC4453.f9228.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f1341[EnumC4453.f9221.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f1341[EnumC4453.f9230.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f1341[EnumC4453.f9231.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public interface InterfaceC5212 {
        /* JADX INFO: renamed from: ۥ */
        void mo1977(GridGestureConfig gridGestureConfig);
    }

    static {
        NativeUtil.classesInit0(933);
        ArrayList arrayList = new ArrayList();
        f12348 = arrayList;
        arrayList.add(EnumC4453.f9214.m12928());
        arrayList.add(EnumC4453.f9215.m12928());
        arrayList.add(EnumC4453.f9216.m12928());
        arrayList.add(EnumC4453.f9232.m12928());
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m1975(AlertDialog alertDialog, InterfaceC5212 interfaceC5212, GridGestureConfig gridGestureConfig, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m1976(AlertDialog alertDialog, Runnable runnable, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15902(Context context, GridGestureConfig gridGestureConfig, int i, int i2, LinearLayout linearLayout, int i3, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15903(AlertDialog alertDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15904(AlertDialog alertDialog, Context context, GridGestureConfig gridGestureConfig, InterfaceC5212 interfaceC5212, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m15905(GridGestureConfig.C2603 c2603, C5213 c5213, Spinner spinner, Spinner spinner2, AlertDialog alertDialog, Runnable runnable, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m15906(AlertDialog alertDialog, Runnable runnable, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m15907(Context context, GridGestureConfig gridGestureConfig, InterfaceC5212 interfaceC5212);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m15908(GridGestureConfig gridGestureConfig, int i, int i2, Context context, LinearLayout linearLayout, int i3, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m15909(Spinner spinner, Spinner spinner2, GridGestureConfig gridGestureConfig, AlertDialog alertDialog, Runnable runnable, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m15910(MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m15911(Context context, GridGestureConfig gridGestureConfig, LinearLayout linearLayout, int i, int i2, int i3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native int m15912();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native int m15913();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native int m15914();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native int m15915();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native int m15916();

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native int m15917();

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native int m15918();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native int m15919();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native int m15920();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native int m15921();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native int m15922();

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static native int m15923();

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native int m15924();

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native int m15925();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native int m15926();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static native int m15927();

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static native int m15928();

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static native int m15929();

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ int m15930();

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static native /* synthetic */ int m15931();

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static native /* synthetic */ int m15932(Context context, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static native /* synthetic */ int m15933();

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static native /* synthetic */ int m15934();

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static native C5213 m15935();

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static native TextView m15936(Context context, String str, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static native GradientDrawable m15937(int i, float f);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static native int m15938(Context context, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static native String m15939(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static native void m15940(Context context, GridGestureConfig gridGestureConfig, LinearLayout linearLayout, int i, int i2, int i3);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static native List<EnumC4453> m15941();

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static native View m15942(Context context);

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static native void m15943(Context context);

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m15944(AlertDialog alertDialog, Runnable runnable, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m15945(GridGestureConfig.C2603 c2603, C5213 c5213, Spinner spinner, Spinner spinner2, AlertDialog alertDialog, Runnable runnable, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m15946(AlertDialog alertDialog, Runnable runnable, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15947(Spinner spinner, Spinner spinner2, GridGestureConfig gridGestureConfig, AlertDialog alertDialog, Runnable runnable, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15948(Context context, GridGestureConfig gridGestureConfig, LinearLayout linearLayout, int i, int i2, int i3);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m15949(Context context, GridGestureConfig gridGestureConfig, int i, int i2, LinearLayout linearLayout, int i3, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m15950(GridGestureConfig gridGestureConfig, int i, int i2, Context context, LinearLayout linearLayout, int i3, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m15951(Context context, GridGestureConfig gridGestureConfig, InterfaceC5212 interfaceC5212);

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15952(AlertDialog alertDialog, Context context, GridGestureConfig gridGestureConfig, InterfaceC5212 interfaceC5212, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m15953(AlertDialog alertDialog, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m15954(MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m15955(AlertDialog alertDialog, InterfaceC5212 interfaceC5212, GridGestureConfig gridGestureConfig, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static native View m15956(Context context, int i, int i2, String str);

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static native Button m15957(Context context, String str, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static native View m15958(Context context, int i, int i2);

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static native Spinner m15959(Context context, int i, int i2, int i3);

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static native Spinner m15960(Context context, C5213 c5213);

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static native Button m15961(Context context, String str, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static native TextView m15962(Context context, String str, String str2, int i, int i2);

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static native String m15963(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static native LinearLayout m15964(Context context, String str, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static native TextView m15965(Context context, String str);

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static native void m15966(Spinner spinner, C5213 c5213, String str);

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static native void m15967(Context context, GridGestureConfig gridGestureConfig, InterfaceC5212 interfaceC5212);

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static native void m15968(Context context, GridGestureConfig gridGestureConfig, int i, int i2, Runnable runnable);

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static native void m15969(Context context, GridGestureConfig gridGestureConfig, Runnable runnable);

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static native void m15970(Context context, GridGestureConfig gridGestureConfig, InterfaceC5212 interfaceC5212);

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۨۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C5213 {

        /* JADX INFO: renamed from: ۥ */
        public final List<String> f1342;

        /* JADX INFO: renamed from: ۥ۟ */
        public final List<String> f1343;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C5213() {
            this.f1342 = new ArrayList();
            this.f1343 = new ArrayList();
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:4) call: Yue.ۥۣ۠ۨۦ.ۥ۟۟۟ۡ.<init>():void type: THIS */
        public /* synthetic */ C5213(C0666 c0666) {
            this();
        }
    }
}
