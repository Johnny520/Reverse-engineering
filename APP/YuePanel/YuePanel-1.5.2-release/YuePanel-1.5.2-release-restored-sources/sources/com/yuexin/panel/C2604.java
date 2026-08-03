package com.yuexin.panel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.nmmedit.protect.NativeUtil;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* JADX INFO: renamed from: com.yuexin.panel.ۥ */
/* JADX INFO: loaded from: classes2.dex */
public class C2604 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f4216;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f4217;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f30832 = 12;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f30833 = 128;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final SecureRandom f30834;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30835;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30836;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30837;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30838;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30839;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30840;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30841;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30842;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30843;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30844;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30845;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30846;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30847;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30848;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30849;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30850;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30851;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30852;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30853;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30854;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30855;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30856;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30857;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30858;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30859;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30860;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30861;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30862;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30863;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30864;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30865;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30866;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30867;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30868;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30869;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30870;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30871;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30872;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30873;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30874;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30875;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30876;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30877;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30878;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30879;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30880;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30881;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30882;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30883;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30884;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30885;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30886;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30887;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30888;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30889;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30890;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30891;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30892;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30893;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30894;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30895;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30896;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30897;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30898;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30899;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30900;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30901;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30902;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30903;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30904;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30905;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30906;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30907;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30908;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30909;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30910;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30911;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30912;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30913;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30914;

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30915;

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30916;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30917;

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30918;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30919;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30920;

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30921;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30922;

    /* JADX INFO: renamed from: com.yuexin.panel.ۥ$ۥ, reason: contains not printable characters */
    public class C9038 extends OnBindView<BottomDialog> {

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30923;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30924;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30925;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30926;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30927;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30928;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30929;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30930;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30931;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30932;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30933;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30934;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30935;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30936;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30937;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30938;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30939;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30940;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30941;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30942;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30943;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30944;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30945;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30946;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30947;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30948;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ String f4218;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ String f4219;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Context f30949;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ LinearLayout.LayoutParams f30950;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ String f30951;

        /* JADX INFO: renamed from: com.yuexin.panel.ۥ$ۥ$ۥ, reason: contains not printable characters */
        public class C9039 extends OnBindView<BottomDialog> {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ ProgressBar f4220;

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ ImageView f4221;

            static {
                NativeUtil.classesInit0(73);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9039(View view, ProgressBar progressBar, ImageView imageView) {
                super(view);
                this.f4220 = progressBar;
                this.f4221 = imageView;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
            @Override // com.kongzue.dialogx.interfaces.OnBindView
            public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

            /* JADX INFO: renamed from: ۥ */
            public native void m5112(BottomDialog bottomDialog, View view);
        }

        static {
            NativeUtil.classesInit0(710);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9038(int i, String str, String str2, Context context, LinearLayout.LayoutParams layoutParams, String str3) {
            super(i);
            this.f4218 = str;
            this.f4219 = str2;
            this.f30949 = context;
            this.f30950 = layoutParams;
            this.f30951 = str3;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ void m5110();

        /* JADX INFO: renamed from: ۥ۟ */
        public static native /* synthetic */ void m5111(C9038 c9038, Context context, LinearLayout.LayoutParams layoutParams, View view);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m31107(View view);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m31108();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31109(MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31110(MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31111(MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static native /* synthetic */ void m31112(String str, View view);

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m31113(View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31114(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31115(C9038 c9038, Context context, LinearLayout.LayoutParams layoutParams, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static native /* synthetic */ void m31116(View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static native /* synthetic */ void m31117(EditText editText, View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31118(MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static native /* synthetic */ void m31119(EditText editText, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31120(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31121(MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31122(MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31123(MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static native /* synthetic */ void m31124(String str, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static native /* synthetic */ void m31125(View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static native /* synthetic */ void m31126(View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static native /* synthetic */ boolean m31127(MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static native /* synthetic */ void m31128();

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static native /* synthetic */ void m31129();

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static native /* synthetic */ void m31130(View view);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final native /* synthetic */ boolean m31131(Context context, LinearLayout.LayoutParams layoutParams, MessageDialog messageDialog, View view);

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final native /* synthetic */ void m31132(Context context, LinearLayout.LayoutParams layoutParams, View view);

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public native void m31133(BottomDialog bottomDialog, View view);
    }

    /* JADX INFO: renamed from: com.yuexin.panel.ۥ$ۥ۟, reason: contains not printable characters */
    public class C9040 implements RequestListener<Drawable> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30953;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f30954;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ BottomDialog f30955;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ ProgressBar f30956;

        static {
            NativeUtil.classesInit0(276);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C9040(BottomDialog bottomDialog, ProgressBar progressBar) {
            this.f30955 = bottomDialog;
            this.f30956 = progressBar;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        @Override // com.bumptech.glide.request.RequestListener
        public native boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z);

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, com.bumptech.glide.request.target.Target, com.bumptech.glide.load.DataSource, boolean] */
        @Override // com.bumptech.glide.request.RequestListener
        public native /* bridge */ /* synthetic */ boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z);

        /* JADX INFO: renamed from: ۥ */
        public native boolean m5113(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z);
    }

    static {
        NativeUtil.classesInit0(739);
        f4216 = yue_xin_awa(0);
        f4217 = yue_xin_awa(1);
        f30834 = new SecureRandom();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m5108(boolean z, String str, String str2, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m5109(String str, String str2, boolean z, String str3, boolean z2, String str4, boolean z3, String str5, String str6);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m31077();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m31078(int i, String str, String str2, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m31079(String str, MessageDialog messageDialog, MessageDialog messageDialog2, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m31080(boolean z, String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m31081(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m31082(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m31083(String str, String str2, String str3, int i, String str4, String str5);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m31084(BottomDialog bottomDialog, ProgressBar progressBar, ImageView imageView);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native String m31085(byte[] bArr, byte[] bArr2, String str, String str2, String str3, String str4, long j) throws Exception;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native void m31086();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native void m31087();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native String m31088(byte[] bArr, String str) throws GeneralSecurityException;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native void m31089(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native void m31090();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m31091(int i, String str, String str2, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m31092(String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m31093(String str, String str2, String str3, int i, String str4, String str5);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m31094();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m31095(boolean z, String str, String str2, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m31096(String str, MessageDialog messageDialog, MessageDialog messageDialog2, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m31097(boolean z, String str, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m31098(String str, String str2, boolean z, String str3, boolean z2, String str4, boolean z3, String str5, String str6);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m31099(boolean z);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native void m31100(BottomDialog bottomDialog, ProgressBar progressBar, ImageView imageView);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native void m31101();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static native byte[] m31102(int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static native String m31103(byte[] bArr);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static native void m31104();

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native void m31105(byte[] bArr);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static native void m31106(byte[] bArr);
}
