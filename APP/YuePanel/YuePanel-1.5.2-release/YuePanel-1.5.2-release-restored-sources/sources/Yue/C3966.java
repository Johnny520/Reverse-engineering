package Yue;

import Yue.C3966;
import android.app.Activity;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3966 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static float f592;

    /* JADX INFO: renamed from: ۥ۟ */
    public static Class<?> f593;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final HashMap<Object, Object> f7635;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static String f7636;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static String f7637;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String[] f7638;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7639;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7640;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7641;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7642;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7643;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7644;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7645;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7646;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7647;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7648;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7649;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7650;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7651;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7652;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7653;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7654;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7655;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7656;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7657;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7658;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7659;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7660;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7661;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7662;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7663;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7664;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7665;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7666;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7667;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7668;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7669;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7670;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7671;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7672;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7673;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7674;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7675;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7676;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7677;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7678;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7679;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7680;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7681;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7682;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7683;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7684;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7685;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7686;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7687;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7688;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7689;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7690;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7691;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7692;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7693;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7694;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7695;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7696;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7697;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7698;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7699;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7700;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7701;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7702;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7703;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7704;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7705;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7706;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7707;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7708;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7709;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7710;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7711;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7712;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7713;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7714;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7715;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7716;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7717;

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7718;

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7719;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7720;

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7721;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7722;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7723;

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7724;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7725;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7726;

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7727;

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7728;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7729;

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7730;

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7731;

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7732;

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7733;

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7734;

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7735;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7736;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7737;

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7738;

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7739;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7740;

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7741;

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7742;

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7743;

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7744;

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7745;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7746;

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7747;

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7748;

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7749;

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7750;

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7751;

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7752;

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7753;

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7754;

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7755;

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7756;

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7757;

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7758;

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7759;

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7760;

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7761;

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7762;

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7763;

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7764;

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7765;

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7766;

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7767;

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7768;

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7769;

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7770;

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7771;

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7772;

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7773;

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7774;

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7775;

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7776;

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7777;

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7778;

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7779;

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7780;

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7781;

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7782;

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7783;

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7784;

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7785;

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7786;

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7787;

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7788;

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7789;

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7790;

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7791;

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7792;

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7793;

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7794;

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7795;

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7796;

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7797;

    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7798;

    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7799;

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7800;

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7801;

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7802;

    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7803;

    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7804;

    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7805;

    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7806;

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7807;

    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f7808;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ */
    public class C0298 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7809;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7810;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7811;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7812;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7813;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7814;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7815;

        public C0298() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f7809;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(5154626206310437615L);
                    f7809 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f7810;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(-6555914606474188877L);
                    f7810 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f7811;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(8580582881131672209L);
                    f7811 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f7812;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(7197741309084009347L);
                    f7812 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f7813;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(-3680297050255807706L);
                    f7813 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f7814;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(-3206719047881746419L);
                    f7814 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f7815;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(5698957129165822078L);
                    f7815 = strM22677;
                    return strM22677;
                default:
                    return null;
            }
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C4093.m11556(yue_xin_awa(0))) {
                try {
                    List<View> listM27916 = C8369.m27916((FrameLayout) C5898.m18284(methodHookParam.args[0], yue_xin_awa(1), FrameLayout.class));
                    C4018.m982(listM27916);
                    C3966.m11251(C3966.this, listM27916);
                    for (View view : listM27916) {
                        CharSequence contentDescription = view.getContentDescription();
                        String string = contentDescription != null ? contentDescription.toString() : null;
                        if (string != null) {
                            View view2 = (View) view.getParent();
                            if (!view2.getClass().getSimpleName().equals(yue_xin_awa(2))) {
                                if (string.contains(yue_xin_awa(3)) && (view instanceof FrameLayout) && C4093.m11556(yue_xin_awa(4))) {
                                    view2.setVisibility(8);
                                }
                                if (string.contains(yue_xin_awa(5)) && (view instanceof LinearLayout) && C4093.m11556(yue_xin_awa(6))) {
                                    view2.setVisibility(8);
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟ */
    public class C0299 extends XC_MethodHook {
        public C0299() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            C4116.m11754(methodHookParam.args[0]);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟, reason: contains not printable characters */
    public class C3967 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C3828 f7818;

        public C3967(C3828 c3828) {
            this.f7818 = c3828;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            C4116.m11754(methodHookParam.args[C6328.m2795(this.f7818.m10569(), C3966.m11252(C3966.this))]);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟, reason: contains not printable characters */
    public class C3968 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7820;

        public C3968() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7820;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(6041570525804040078L);
            f7820 = strM2267;
            return strM2267;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.afterHookedMethod(methodHookParam);
            if (C3966.m11257(yue_xin_awa(0))) {
                return;
            }
            C4017.m11326((View) methodHookParam.thisObject);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C3969 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7822;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7823;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7824;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7825;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f7826;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ String f7827;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Method f7828;

        public C3969(ClassLoader classLoader, String str, Method method) {
            this.f7826 = classLoader;
            this.f7827 = str;
            this.f7828 = method;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7822;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-9069094350177773554L);
                f7822 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f7823;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(4096142675771854715L);
                f7823 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f7824;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(9104877547680607959L);
                f7824 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f7825;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(-8170010263984402840L);
            f7825 = strM22674;
            return strM22674;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            try {
                if (C3966.m11257(yue_xin_awa(0))) {
                    return;
                }
                Object objCallMethod = XposedHelpers.callMethod(methodHookParam.args[0], yue_xin_awa(1), new Object[0]);
                Object result = methodHookParam.getResult();
                Class<?> clsLoadClass = this.f7826.loadClass(this.f7827);
                Object[] objArr = (Object[]) XposedHelpers.callMethod(result, this.f7828.getName(), new Object[0]);
                Integer num = (Integer) objArr[1];
                num.intValue();
                Integer num2 = (Integer) objArr[2];
                num2.intValue();
                Class cls = Integer.TYPE;
                methodHookParam.setResult(clsLoadClass.getConstructor(String.class, cls, cls).newInstance(C7817.m24801(((Long) XposedHelpers.callMethod(objCallMethod, yue_xin_awa(2), new Object[0])).longValue() * 1000), num, num2));
            } catch (Throwable th) {
                C5863.m2535(yue_xin_awa(3) + th);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C3970 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7830;

        public C3970() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7830;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-288628184062963504L);
            f7830 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C3966.m11253(C3966.this, (List) C5898.m18284(methodHookParam.args[0], yue_xin_awa(0), List.class));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C3971 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7832;

        public C3971() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7832;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-288628184062963504L);
            f7832 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            C3966.m11253(C3966.this, (List) C5898.m18284(methodHookParam.args[0], yue_xin_awa(0), List.class));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C3972 extends XC_MethodHook {
        public C3972() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object objM11254;
            Object result = methodHookParam.getResult();
            if (result == null || (objM11254 = C3966.m11254(C3966.this, result)) == null) {
                return;
            }
            methodHookParam.setResult(objM11254);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥۣ۟۟۟, reason: contains not printable characters */
    public class C3973 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7835;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7836;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7837;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7838;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7839;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7840;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Class f7841;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C3828 f7842;

        public C3973(Class cls, C3828 c3828) {
            this.f7841 = cls;
            this.f7842 = c3828;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7835;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-7991566222333628609L);
                f7835 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f7836;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-6298387628334864450L);
                f7836 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f7837;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(8330621410826985291L);
                f7837 = strM22673;
                return strM22673;
            }
            if (i == 3) {
                String str4 = f7838;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-3570646881431172606L);
                f7838 = strM22674;
                return strM22674;
            }
            if (i == 4) {
                String str5 = f7839;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(6106737580778973606L);
                f7839 = strM22675;
                return strM22675;
            }
            if (i != 5) {
                return null;
            }
            String str6 = f7840;
            if (str6 != null) {
                return str6;
            }
            String strM22676 = C5523.m2267(1735071518005498134L);
            f7840 = strM22676;
            return strM22676;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m11292(Class cls, C3828 c3828, XC_MethodHook.MethodHookParam methodHookParam, MessageDialog messageDialog, View view) {
            try {
                XposedHelpers.setAdditionalInstanceField(cls, yue_xin_awa(1), Boolean.TRUE);
                XposedHelpers.callStaticMethod(cls, c3828.m878(), methodHookParam.args);
                return false;
            } catch (Throwable unused) {
                C6334.m19809(yue_xin_awa(5));
                return false;
            }
        }

        public void beforeHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) {
            if (C3966.m11257(yue_xin_awa(0))) {
                return;
            }
            if (XposedHelpers.getAdditionalInstanceField(this.f7841, yue_xin_awa(1)) != null) {
                XposedHelpers.removeAdditionalInstanceField(this.f7841, yue_xin_awa(1));
                return;
            }
            MessageDialog messageDialogShow = MessageDialog.show(yue_xin_awa(2), yue_xin_awa(3));
            String strYue_xin_awa = yue_xin_awa(4);
            final Class cls = this.f7841;
            final C3828 c3828 = this.f7842;
            messageDialogShow.setOkButton(strYue_xin_awa, new OnDialogButtonClickListener() { // from class: Yue.ۥ۟ۥۧۦ
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C3966.C3973.m11292(cls, c3828, methodHookParam, (MessageDialog) baseDialog, view);
                }
            });
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public class C3974 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7844;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7845;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7846;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7847;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f7848;

        public C3974(ClassLoader classLoader) {
            this.f7848 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7844;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(6184829101954920959L);
                f7844 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f7845;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(5947868548342727851L);
                f7845 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f7846;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(5547806762515180962L);
                f7846 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f7847;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(-5209390075772627820L);
            f7847 = strM22674;
            return strM22674;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                if (C3966.m11257(yue_xin_awa(0))) {
                    return;
                }
                String strYue_xin_awa = yue_xin_awa(1);
                for (Object obj : (List) methodHookParam.getResult()) {
                    try {
                        Iterator<Field> it = C4806.m1710(C5896.m2564(this.f7848.loadClass(obj.getClass().getName())), SparseArray.class, 17).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            SparseArray sparseArray = (SparseArray) XposedHelpers.getObjectField(obj, it.next().getName());
                            if (sparseArray != null) {
                                try {
                                    int size = sparseArray.size();
                                    for (int i = 0; i < size; i++) {
                                        ArrayList arrayList = (ArrayList) sparseArray.valueAt(i);
                                        for (Object obj2 : new ArrayList(arrayList)) {
                                            try {
                                                if (C4093.m11556(strYue_xin_awa + ((String) XposedHelpers.callMethod(obj2, yue_xin_awa(2), new Object[0])))) {
                                                    arrayList.remove(obj2);
                                                }
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    }
                                } catch (Throwable unused2) {
                                    continue;
                                }
                            }
                        }
                    } catch (Throwable unused3) {
                    }
                }
            } catch (Throwable th) {
                C6334.m19809(yue_xin_awa(3) + th.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public class C3975 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7850;

        public C3975() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7850;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(2969322485702304611L);
            f7850 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (!C3966.m11257(yue_xin_awa(0)) && C3966.m11246(C3966.this, methodHookParam.args[0], 1)) {
                methodHookParam.setResult(Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public class C3976 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7852;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7853;

        public C3976() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f7852;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(2969322485702304611L);
                f7852 = strM2267;
                return strM2267;
            }
            if (i != 1) {
                return null;
            }
            String str2 = f7853;
            if (str2 != null) {
                return str2;
            }
            String strM22672 = C5523.m2267(-7067891925422833346L);
            f7853 = strM22672;
            return strM22672;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C3966.m11257(yue_xin_awa(0))) {
                return;
            }
            try {
                Object objectField = XposedHelpers.getObjectField(methodHookParam.thisObject, C3966.m11247());
                if (objectField != null) {
                    List list = (List) XposedHelpers.callMethod(XposedHelpers.getObjectField(objectField, C3966.m11248()), yue_xin_awa(1), new Object[0]);
                    for (Object obj : new ArrayList(list)) {
                        if (C3966.m11246(C3966.this, obj, 2)) {
                            list.remove(obj);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public class C3977 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7855;

        public C3977() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7855;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-6555914606474188877L);
            f7855 = strM2267;
            return strM2267;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m11293(FrameLayout frameLayout, View view) {
            int height = frameLayout.getHeight() + 30;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, height);
            layoutParams.setMargins(20, 10, 20, 0);
            view.setLayoutParams(layoutParams);
            view.setTag(Integer.valueOf(height));
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                Object result = methodHookParam.getResult();
                View view = (View) C5898.m18284(result, yue_xin_awa(0), View.class);
                if (view instanceof FrameLayout) {
                    final FrameLayout frameLayout = (FrameLayout) view;
                    final View viewInflate = LayoutInflater.from(C3270.m6705()).inflate(C2597R.C9031.f30740, (ViewGroup) frameLayout, false);
                    frameLayout.addView(viewInflate);
                    C3966.m11249().put(result, viewInflate);
                    if (viewInflate.getTag() == null) {
                        frameLayout.post(new Runnable() { // from class: Yue.ۥ۟ۥۧۨ
                            static {
                                NativeUtil.classesInit0(566);
                            }

                            @Override // java.lang.Runnable
                            public final native void run();
                        });
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public class C3978 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7857;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7858;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7859;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7860;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7861;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7862;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7863;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7864;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7865;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ ClassLoader f7866;

        public C3978(ClassLoader classLoader) {
            this.f7866 = classLoader;
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            switch (i) {
                case 0:
                    String str = f7857;
                    if (str != null) {
                        return str;
                    }
                    String strM2267 = C5523.m2267(-3341645347083844950L);
                    f7857 = strM2267;
                    return strM2267;
                case 1:
                    String str2 = f7858;
                    if (str2 != null) {
                        return str2;
                    }
                    String strM22672 = C5523.m2267(2732417862827360051L);
                    f7858 = strM22672;
                    return strM22672;
                case 2:
                    String str3 = f7859;
                    if (str3 != null) {
                        return str3;
                    }
                    String strM22673 = C5523.m2267(4628428628828769794L);
                    f7859 = strM22673;
                    return strM22673;
                case 3:
                    String str4 = f7860;
                    if (str4 != null) {
                        return str4;
                    }
                    String strM22674 = C5523.m2267(1847537194860979568L);
                    f7860 = strM22674;
                    return strM22674;
                case 4:
                    String str5 = f7861;
                    if (str5 != null) {
                        return str5;
                    }
                    String strM22675 = C5523.m2267(-1352202906016552310L);
                    f7861 = strM22675;
                    return strM22675;
                case 5:
                    String str6 = f7862;
                    if (str6 != null) {
                        return str6;
                    }
                    String strM22676 = C5523.m2267(6460691186431460189L);
                    f7862 = strM22676;
                    return strM22676;
                case 6:
                    String str7 = f7863;
                    if (str7 != null) {
                        return str7;
                    }
                    String strM22677 = C5523.m2267(-1438206535246301942L);
                    f7863 = strM22677;
                    return strM22677;
                case 7:
                    String str8 = f7864;
                    if (str8 != null) {
                        return str8;
                    }
                    String strM22678 = C5523.m2267(2574457375322254790L);
                    f7864 = strM22678;
                    return strM22678;
                case 8:
                    String str9 = f7865;
                    if (str9 != null) {
                        return str9;
                    }
                    String strM22679 = C5523.m2267(8641334200444901850L);
                    f7865 = strM22679;
                    return strM22679;
                default:
                    return null;
            }
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object[] objArr = methodHookParam.args;
            Object obj = objArr[0];
            Integer num = (Integer) objArr[1];
            int iIntValue = num.intValue();
            Object obj2 = methodHookParam.thisObject;
            if (((Integer) XposedHelpers.callMethod(obj2, yue_xin_awa(0), new Object[]{num})).intValue() == 3 && C3966.m11249().containsKey(obj)) {
                FrameLayout frameLayout = (FrameLayout) C3966.m11249().get(obj);
                TextView textView = (TextView) frameLayout.findViewById(C2597R.C9030.f30549);
                ((TextView) frameLayout.findViewById(C2597R.C9030.f30551)).setText(yue_xin_awa(1) + C6263.m19268());
                TextView textView2 = (TextView) frameLayout.findViewById(C2597R.C9030.f30548);
                Object obj3 = ((List) XposedHelpers.callMethod(obj2, yue_xin_awa(2), new Object[0])).get(iIntValue);
                Object objM1711 = C4806.m1711(obj3, this.f7866.loadClass(yue_xin_awa(3)));
                C4805 c4805M14538 = new C4805().m14538(C4806.m1711(obj3, this.f7866.loadClass(yue_xin_awa(4))));
                String str = (String) c4805M14538.m14540(String.class).m1709(yue_xin_awa(5));
                long jLongValue = ((Long) c4805M14538.m14540(null).m1709(yue_xin_awa(6))).longValue();
                String str2 = (String) new C4805().m14538(objM1711).m14540(String.class).m1709(yue_xin_awa(7));
                textView.setText(yue_xin_awa(8) + jLongValue);
                C3966.m11250(C3966.this, str2, str, textView2);
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۠, reason: contains not printable characters */
    public class C3979 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7868;

        public C3979() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7868;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-7992712305657084532L);
            f7868 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (C3966.m11257(yue_xin_awa(0))) {
                return;
            }
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۠۟, reason: contains not printable characters */
    public class C3980 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f7870;

        public C3980() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i != 0) {
                return null;
            }
            String str = f7870;
            if (str != null) {
                return str;
            }
            String strM2267 = C5523.m2267(-7992712305657084532L);
            f7870 = strM2267;
            return strM2267;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (C3966.m11257(yue_xin_awa(0))) {
                return;
            }
            methodHookParam.setResult((Object) null);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۧۧ$ۥ۟۟۠۠, reason: contains not printable characters */
    public class C3981 extends XC_MethodHook {
        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(Boolean.FALSE);
        }
    }

    static {
        NativeUtil.classesInit0(568);
        f7635 = new HashMap<>();
        f7638 = new String[]{yue_xin_awa(159), yue_xin_awa(160), yue_xin_awa(161), yue_xin_awa(162), yue_xin_awa(163), yue_xin_awa(164), yue_xin_awa(165), yue_xin_awa(166), yue_xin_awa(167), yue_xin_awa(168), yue_xin_awa(169)};
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m953(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m954(MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11237(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11238(String str, String str2, TextView textView);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11239(C3966 c3966, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11240(C3966 c3966, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m11241(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m11242(Activity activity);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11243(ViewGroup viewGroup);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11244(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11245(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11246(C3966 c3966, Object obj, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ String m11247();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ String m11248();

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ HashMap m11249();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native /* synthetic */ void m11250(C3966 c3966, String str, String str2, TextView textView);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ void m11251(C3966 c3966, List list);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ Class m11252(C3966 c3966);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m11253(C3966 c3966, List list);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ Object m11254(C3966 c3966, Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native void m11255();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native void m11256(ViewGroup viewGroup);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native boolean m11257(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static native void m11258(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    private void m11259(C3828 c3828, ClassLoader classLoader) {
        try {
            String strM879 = c3828.m879();
            Class<?> clsLoadClass = classLoader.loadClass(strM879);
            try {
                Class<?> clsLoadClass2 = classLoader.loadClass(yue_xin_awa(15));
                List<Method> listM4543 = C8573.m4543(clsLoadClass, Boolean.TYPE, 1, new Class[]{clsLoadClass2});
                if (listM4543.isEmpty()) {
                    throw new Throwable(yue_xin_awa(16));
                }
                C5309.m16280(strM879, classLoader, listM4543.get(0).getName(), clsLoadClass2, new C3975());
            } catch (Throwable unused) {
                m11286(clsLoadClass);
                C5309.m16286(clsLoadClass, new C3976());
            }
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(17), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m11260(Activity activity);

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m11261(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m11262(ViewGroup viewGroup);

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    private static native /* synthetic */ boolean m11263(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m11264(String str, String str2, TextView textView);

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11265(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11266(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11267(MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m11268(InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static native void m11269();

    @Override // Yue.AbstractC5391
    public native HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str);

    @Override // Yue.AbstractC5391
    public native String[] getClickStrings();

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3829 c3829, ClassLoader classLoader);

    @Override // Yue.AbstractC5391
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final native void m11270(List list);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final Object m11271(Object obj) {
        try {
            Object objCallMethod = XposedHelpers.callMethod(obj, yue_xin_awa(36), new Object[0]);
            return obj;
        } catch (Throwable th) {
            C5863.m2535(yue_xin_awa(39) + th);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final native Class<?> m11272();

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final native void m11273(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final native void m11274(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final native void m11275(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final native void m11276(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m11277(C3828 c3828, ClassLoader classLoader) {
        try {
            Class<?> clsLoadClass = classLoader.loadClass(c3828.m879());
            C5309.m16287(clsLoadClass, c3828.m878(), new C3973(clsLoadClass, c3828));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(13), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m11278(C3828 c3828, ClassLoader classLoader) {
        try {
            if (C4563.m1512() == 2) {
                C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C3979());
            } else {
                C5309.m16280(c3828.m879(), classLoader, c3828.m878(), ViewGroup.class, classLoader.loadClass(yue_xin_awa(26)), classLoader.loadClass(c3828.m10569().get(2)), new C3980());
            }
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(27), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final native void m11279(C3829 c3829, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final native void m11280(ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m11281(C3828 c3828, ClassLoader classLoader) {
        try {
            C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C3974(classLoader));
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(14), th.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m11282(C3829 c3829, ClassLoader classLoader) {
        try {
            C5309.m16278(c3829.m880().get(yue_xin_awa(30)).m879(), classLoader, m11272(), Integer.TYPE, classLoader.loadClass(yue_xin_awa(31)), new C0299());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(32), th.getMessage());
        }
        try {
            for (C3828 c3828 : c3829.m880().get(yue_xin_awa(33)).m10568()) {
                C5309.m16287(classLoader.loadClass(c3828.m879()), c3828.m878(), new C3967(c3828));
            }
        } catch (Throwable th2) {
            C4383.m12707(yue_xin_awa(34), th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final boolean m11283(Object obj, int i) {
        StringBuilder sb;
        try {
            String strYue_xin_awa = yue_xin_awa(19);
            int iIntValue = ((Integer) XposedHelpers.callMethod(obj, yue_xin_awa(20), new Object[0])).intValue();
            sb = new StringBuilder();
            sb.append(strYue_xin_awa);
            sb.append(iIntValue);
        } catch (Throwable unused) {
        }
        return C4093.m11556(sb.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final native /* synthetic */ boolean m11284(BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final native /* synthetic */ boolean m11285(MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final native void m11286(Class<?> cls);

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final native void m11287(List<View> list);

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final native void m11288(String str, String str2, TextView textView);

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final native void m11289();

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final native void m11290();

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final native void m11291();
}
