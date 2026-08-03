package Yue;

import Yue.AbstractC4021;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.MethodDataList;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4856 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static int f1175;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static List f10916;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final List<String> f10917 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final List<String> f10918 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final List<C4840> f10919 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String[] f10920 = {yue_xin_awa(177), yue_xin_awa(178), yue_xin_awa(179), yue_xin_awa(180), yue_xin_awa(181), yue_xin_awa(182), yue_xin_awa(183), yue_xin_awa(184), yue_xin_awa(185), yue_xin_awa(71), yue_xin_awa(186), yue_xin_awa(187), yue_xin_awa(188)};

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10921;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10922;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10923;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10924;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10925;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10926;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10927;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10928;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10929;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10930;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10931;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10932;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10933;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10934;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10935;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10936;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10937;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10938;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10939;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10940;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10941;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10942;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10943;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10944;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10945;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10946;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10947;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10948;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10949;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10950;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10951;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10952;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10953;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10954;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10955;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10956;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10957;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10958;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10959;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10960;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10961;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10962;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10963;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10964;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10965;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10966;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10967;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10968;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10969;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10970;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10971;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10972;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10973;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10974;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10975;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10976;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10977;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10978;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10979;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10980;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10981;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10982;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10983;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10984;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10985;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10986;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10987;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10988;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10989;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10990;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10991;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10992;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10993;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10994;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10995;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10996;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10997;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10998;

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f10999;

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11000;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11001;

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11002;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11003;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11004;

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11005;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11006;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11007;

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11008;

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11009;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11010;

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11011;

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11012;

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11013;

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11014;

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11015;

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11016;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11017;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11018;

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11019;

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11020;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11021;

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11022;

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11023;

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11024;

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11025;

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11026;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11027;

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11028;

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11029;

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11030;

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11031;

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11032;

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11033;

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11034;

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11035;

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11036;

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11037;

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11038;

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11039;

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11040;

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11041;

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11042;

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11043;

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11044;

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11045;

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11046;

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11047;

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11048;

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11049;

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11050;

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11051;

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11052;

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11053;

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11054;

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11055;

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11056;

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11057;

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11058;

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11059;

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11060;

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11061;

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11062;

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11063;

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11064;

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11065;

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11066;

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11067;

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11068;

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11069;

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11070;

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11071;

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11072;

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11073;

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11074;

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11075;

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11076;

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11077;

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11078;

    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11079;

    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11080;

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11081;

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11082;

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11083;

    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11084;

    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11085;

    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11086;

    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11087;

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11088;

    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11089;

    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11090;

    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11091;

    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11092;

    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11093;

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11094;

    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11095;

    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11096;

    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11097;

    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11098;

    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11099;

    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11100;

    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11101;

    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11102;

    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11103;

    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11104;

    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11105;

    /* JADX INFO: renamed from: ۥ۟۠ۦ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11106;

    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11107;

    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11108;

    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f11109;

    /* JADX INFO: renamed from: ۥ */
    public final String[] f1176 = {yue_xin_awa(0), yue_xin_awa(1), yue_xin_awa(2), yue_xin_awa(3), yue_xin_awa(4)};

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۢ$ۥ */
    public class C0508 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f11110;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f11111;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f11112;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f11113;

        public C0508() {
        }

        private static /* synthetic */ String yue_xin_awa(int i) {
            if (i == 0) {
                String str = f11110;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(-4814401210041417288L);
                f11110 = strM2267;
                return strM2267;
            }
            if (i == 1) {
                String str2 = f11111;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-4624228737603631252L);
                f11111 = strM22672;
                return strM22672;
            }
            if (i == 2) {
                String str3 = f11112;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(1532141779602012009L);
                f11112 = strM22673;
                return strM22673;
            }
            if (i != 3) {
                return null;
            }
            String str4 = f11113;
            if (str4 != null) {
                return str4;
            }
            String strM22674 = C5523.m2267(-6830949457064445007L);
            f11113 = strM22674;
            return strM22674;
        }

        private static /* synthetic */ void yue_xin_qaq() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            List list = (List) methodHookParam.args[0];
            C4856.f10916 = list;
            if (C4093.m11556(yue_xin_awa(0))) {
                if (C4856.f10919.size() >= 100) {
                    C4856.f10919.clear();
                }
                try {
                    if (C4093.m11556(yue_xin_awa(1) + C4116.f8218)) {
                        C6334.m19808(yue_xin_awa(3) + C4116.f8218, 3);
                        return;
                    }
                    if (list != null && list.size() != 1) {
                        C4856.this.m14824(list);
                        C4856.this.m14810(list);
                        C6334.m19808(yue_xin_awa(2) + C4116.f8218, 3);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۡۢ$ۥ۟ */
    public class C0509 extends OnBindView<BottomDialog> {
        public C0509(View view) {
            super(view);
        }

        private static /* synthetic */ void yue_xin_qaq() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBind(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public void onBind(BottomDialog bottomDialog, View view) {
        }
    }

    private static /* synthetic */ String yue_xin_awa(int i) {
        switch (i) {
            case 0:
                String str = f10921;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(9151872868019110673L);
                f10921 = strM2267;
                return strM2267;
            case 1:
                String str2 = f10922;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-2423385882481949208L);
                f10922 = strM22672;
                return strM22672;
            case 2:
                String str3 = f10923;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(-7240778120168829951L);
                f10923 = strM22673;
                return strM22673;
            case 3:
                String str4 = f10924;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-2591768767174763398L);
                f10924 = strM22674;
                return strM22674;
            case 4:
                String str5 = f10925;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(2819642631249865648L);
                f10925 = strM22675;
                return strM22675;
            case 5:
                String str6 = f10926;
                if (str6 != null) {
                    return str6;
                }
                String strM22676 = C5523.m2267(4936476049710346800L);
                f10926 = strM22676;
                return strM22676;
            case 6:
                String str7 = f10927;
                if (str7 != null) {
                    return str7;
                }
                String strM22677 = C5523.m2267(8859357117481038424L);
                f10927 = strM22677;
                return strM22677;
            case 7:
                String str8 = f10928;
                if (str8 != null) {
                    return str8;
                }
                String strM22678 = C5523.m2267(8458488990900335073L);
                f10928 = strM22678;
                return strM22678;
            case 8:
                String str9 = f10929;
                if (str9 != null) {
                    return str9;
                }
                String strM22679 = C5523.m2267(-5326567723498655500L);
                f10929 = strM22679;
                return strM22679;
            case 9:
                String str10 = f10930;
                if (str10 != null) {
                    return str10;
                }
                String strM226710 = C5523.m2267(-5833014991251415781L);
                f10930 = strM226710;
                return strM226710;
            case 10:
                String str11 = f10931;
                if (str11 != null) {
                    return str11;
                }
                String strM226711 = C5523.m2267(-2708129008228944809L);
                f10931 = strM226711;
                return strM226711;
            case 11:
                String str12 = f10932;
                if (str12 != null) {
                    return str12;
                }
                String strM226712 = C5523.m2267(-5122325771182894062L);
                f10932 = strM226712;
                return strM226712;
            case 12:
                String str13 = f10933;
                if (str13 != null) {
                    return str13;
                }
                String strM226713 = C5523.m2267(7202739909156847377L);
                f10933 = strM226713;
                return strM226713;
            case 13:
                String str14 = f10934;
                if (str14 != null) {
                    return str14;
                }
                String strM226714 = C5523.m2267(-4814401210041417288L);
                f10934 = strM226714;
                return strM226714;
            case 14:
                String str15 = f10935;
                if (str15 != null) {
                    return str15;
                }
                String strM226715 = C5523.m2267(63617143751980354L);
                f10935 = strM226715;
                return strM226715;
            case 15:
                String str16 = f10936;
                if (str16 != null) {
                    return str16;
                }
                String strM226716 = C5523.m2267(5729087270777219385L);
                f10936 = strM226716;
                return strM226716;
            case 16:
                String str17 = f10937;
                if (str17 != null) {
                    return str17;
                }
                String strM226717 = C5523.m2267(6161407757577353195L);
                f10937 = strM226717;
                return strM226717;
            case 17:
                String str18 = f10938;
                if (str18 != null) {
                    return str18;
                }
                String strM226718 = C5523.m2267(2035857845174150235L);
                f10938 = strM226718;
                return strM226718;
            case 18:
                String str19 = f10939;
                if (str19 != null) {
                    return str19;
                }
                String strM226719 = C5523.m2267(1206041815758468204L);
                f10939 = strM226719;
                return strM226719;
            case 19:
                String str20 = f10940;
                if (str20 != null) {
                    return str20;
                }
                String strM226720 = C5523.m2267(2574457375322254790L);
                f10940 = strM226720;
                return strM226720;
            case 20:
                String str21 = f10941;
                if (str21 != null) {
                    return str21;
                }
                String strM226721 = C5523.m2267(-5352181070142209719L);
                f10941 = strM226721;
                return strM226721;
            case 21:
                String str22 = f10942;
                if (str22 != null) {
                    return str22;
                }
                String strM226722 = C5523.m2267(-5606800512298733972L);
                f10942 = strM226722;
                return strM226722;
            case 22:
                String str23 = f10943;
                if (str23 != null) {
                    return str23;
                }
                String strM226723 = C5523.m2267(5983000211576815955L);
                f10943 = strM226723;
                return strM226723;
            case 23:
                String str24 = f10944;
                if (str24 != null) {
                    return str24;
                }
                String strM226724 = C5523.m2267(3127385453581199778L);
                f10944 = strM226724;
                return strM226724;
            case 24:
                String str25 = f10945;
                if (str25 != null) {
                    return str25;
                }
                String strM226725 = C5523.m2267(9142017448713793967L);
                f10945 = strM226725;
                return strM226725;
            case 25:
                String str26 = f10946;
                if (str26 != null) {
                    return str26;
                }
                String strM226726 = C5523.m2267(871439875833018897L);
                f10946 = strM226726;
                return strM226726;
            case 26:
                String str27 = f10947;
                if (str27 != null) {
                    return str27;
                }
                String strM226727 = C5523.m2267(2470905409175289817L);
                f10947 = strM226727;
                return strM226727;
            case 27:
                String str28 = f10948;
                if (str28 != null) {
                    return str28;
                }
                String strM226728 = C5523.m2267(4729868055963644175L);
                f10948 = strM226728;
                return strM226728;
            case 28:
                String str29 = f10949;
                if (str29 != null) {
                    return str29;
                }
                String strM226729 = C5523.m2267(3922955886787654792L);
                f10949 = strM226729;
                return strM226729;
            case 29:
                String str30 = f10950;
                if (str30 != null) {
                    return str30;
                }
                String strM226730 = C5523.m2267(8484429679539425485L);
                f10950 = strM226730;
                return strM226730;
            case 30:
                String str31 = f10951;
                if (str31 != null) {
                    return str31;
                }
                String strM226731 = C5523.m2267(-3044123431050823177L);
                f10951 = strM226731;
                return strM226731;
            case 31:
                String str32 = f10952;
                if (str32 != null) {
                    return str32;
                }
                String strM226732 = C5523.m2267(106795357656090967L);
                f10952 = strM226732;
                return strM226732;
            case 32:
                String str33 = f10953;
                if (str33 != null) {
                    return str33;
                }
                String strM226733 = C5523.m2267(-1755193697854878607L);
                f10953 = strM226733;
                return strM226733;
            case 33:
                String str34 = f10954;
                if (str34 != null) {
                    return str34;
                }
                String strM226734 = C5523.m2267(-6435393034379735295L);
                f10954 = strM226734;
                return strM226734;
            case 34:
                String str35 = f10955;
                if (str35 != null) {
                    return str35;
                }
                String strM226735 = C5523.m2267(5624579799794774347L);
                f10955 = strM226735;
                return strM226735;
            case 35:
                String str36 = f10956;
                if (str36 != null) {
                    return str36;
                }
                String strM226736 = C5523.m2267(-1217496876571054869L);
                f10956 = strM226736;
                return strM226736;
            case 36:
                String str37 = f10957;
                if (str37 != null) {
                    return str37;
                }
                String strM226737 = C5523.m2267(8549302403390107155L);
                f10957 = strM226737;
                return strM226737;
            case 37:
                String str38 = f10958;
                if (str38 != null) {
                    return str38;
                }
                String strM226738 = C5523.m2267(-5275734900493007949L);
                f10958 = strM226738;
                return strM226738;
            case 38:
                String str39 = f10959;
                if (str39 != null) {
                    return str39;
                }
                String strM226739 = C5523.m2267(1657152297564121903L);
                f10959 = strM226739;
                return strM226739;
            case 39:
                String str40 = f10960;
                if (str40 != null) {
                    return str40;
                }
                String strM226740 = C5523.m2267(8211994431723730288L);
                f10960 = strM226740;
                return strM226740;
            case 40:
                String str41 = f10961;
                if (str41 != null) {
                    return str41;
                }
                String strM226741 = C5523.m2267(-1036064063095848825L);
                f10961 = strM226741;
                return strM226741;
            case 41:
                String str42 = f10962;
                if (str42 != null) {
                    return str42;
                }
                String strM226742 = C5523.m2267(-1438206535246301942L);
                f10962 = strM226742;
                return strM226742;
            case 42:
                String str43 = f10963;
                if (str43 != null) {
                    return str43;
                }
                String strM226743 = C5523.m2267(1021466254439751448L);
                f10963 = strM226743;
                return strM226743;
            case 43:
                String str44 = f10964;
                if (str44 != null) {
                    return str44;
                }
                String strM226744 = C5523.m2267(3239712987760682145L);
                f10964 = strM226744;
                return strM226744;
            case 44:
                String str45 = f10965;
                if (str45 != null) {
                    return str45;
                }
                String strM226745 = C5523.m2267(-200096159782196802L);
                f10965 = strM226745;
                return strM226745;
            case 45:
                String str46 = f10966;
                if (str46 != null) {
                    return str46;
                }
                String strM226746 = C5523.m2267(-175740923703507937L);
                f10966 = strM226746;
                return strM226746;
            case 46:
                String str47 = f10967;
                if (str47 != null) {
                    return str47;
                }
                String strM226747 = C5523.m2267(-4126107780326893105L);
                f10967 = strM226747;
                return strM226747;
            case 47:
                String str48 = f10968;
                if (str48 != null) {
                    return str48;
                }
                String strM226748 = C5523.m2267(-7645341775714050305L);
                f10968 = strM226748;
                return strM226748;
            case 48:
                String str49 = f10969;
                if (str49 != null) {
                    return str49;
                }
                String strM226749 = C5523.m2267(8304834776611194930L);
                f10969 = strM226749;
                return strM226749;
            case 49:
                String str50 = f10970;
                if (str50 != null) {
                    return str50;
                }
                String strM226750 = C5523.m2267(-2359420819670694444L);
                f10970 = strM226750;
                return strM226750;
            case 50:
                String str51 = f10971;
                if (str51 != null) {
                    return str51;
                }
                String strM226751 = C5523.m2267(1919532168438064435L);
                f10971 = strM226751;
                return strM226751;
            case 51:
                String str52 = f10972;
                if (str52 != null) {
                    return str52;
                }
                String strM226752 = C5523.m2267(-5483320594205820345L);
                f10972 = strM226752;
                return strM226752;
            case 52:
                String str53 = f10973;
                if (str53 != null) {
                    return str53;
                }
                String strM226753 = C5523.m2267(-12348430951103027L);
                f10973 = strM226753;
                return strM226753;
            case 53:
                String str54 = f10974;
                if (str54 != null) {
                    return str54;
                }
                String strM226754 = C5523.m2267(7566573004270460141L);
                f10974 = strM226754;
                return strM226754;
            case 54:
                String str55 = f10975;
                if (str55 != null) {
                    return str55;
                }
                String strM226755 = C5523.m2267(899952120729369259L);
                f10975 = strM226755;
                return strM226755;
            case 55:
                String str56 = f10976;
                if (str56 != null) {
                    return str56;
                }
                String strM226756 = C5523.m2267(809958797714498676L);
                f10976 = strM226756;
                return strM226756;
            case 56:
                String str57 = f10977;
                if (str57 != null) {
                    return str57;
                }
                String strM226757 = C5523.m2267(-8565817829564994089L);
                f10977 = strM226757;
                return strM226757;
            case 57:
                String str58 = f10978;
                if (str58 != null) {
                    return str58;
                }
                String strM226758 = C5523.m2267(5210634960444820525L);
                f10978 = strM226758;
                return strM226758;
            case 58:
                String str59 = f10979;
                if (str59 != null) {
                    return str59;
                }
                String strM226759 = C5523.m2267(-3606403745617987792L);
                f10979 = strM226759;
                return strM226759;
            case 59:
                String str60 = f10980;
                if (str60 != null) {
                    return str60;
                }
                String strM226760 = C5523.m2267(694148460960393968L);
                f10980 = strM226760;
                return strM226760;
            case 60:
                String str61 = f10981;
                if (str61 != null) {
                    return str61;
                }
                String strM226761 = C5523.m2267(-2027585655092088703L);
                f10981 = strM226761;
                return strM226761;
            case 61:
                String str62 = f10982;
                if (str62 != null) {
                    return str62;
                }
                String strM226762 = C5523.m2267(4815530127462397154L);
                f10982 = strM226762;
                return strM226762;
            case 62:
                String str63 = f10983;
                if (str63 != null) {
                    return str63;
                }
                String strM226763 = C5523.m2267(-258764405935025299L);
                f10983 = strM226763;
                return strM226763;
            case 63:
                String str64 = f10984;
                if (str64 != null) {
                    return str64;
                }
                String strM226764 = C5523.m2267(-601569996902874208L);
                f10984 = strM226764;
                return strM226764;
            case 64:
                String str65 = f10985;
                if (str65 != null) {
                    return str65;
                }
                String strM226765 = C5523.m2267(-4799071396529447124L);
                f10985 = strM226765;
                return strM226765;
            case 65:
                String str66 = f10986;
                if (str66 != null) {
                    return str66;
                }
                String strM226766 = C5523.m2267(-669884984033843380L);
                f10986 = strM226766;
                return strM226766;
            case 66:
                String str67 = f10987;
                if (str67 != null) {
                    return str67;
                }
                String strM226767 = C5523.m2267(-463633681812251735L);
                f10987 = strM226767;
                return strM226767;
            case 67:
                String str68 = f10988;
                if (str68 != null) {
                    return str68;
                }
                String strM226768 = C5523.m2267(4011047400535531264L);
                f10988 = strM226768;
                return strM226768;
            case 68:
                String str69 = f10989;
                if (str69 != null) {
                    return str69;
                }
                String strM226769 = C5523.m2267(-5376543558186283444L);
                f10989 = strM226769;
                return strM226769;
            case 69:
                String str70 = f10990;
                if (str70 != null) {
                    return str70;
                }
                String strM226770 = C5523.m2267(-5302167345963526071L);
                f10990 = strM226770;
                return strM226770;
            case 70:
                String str71 = f10991;
                if (str71 != null) {
                    return str71;
                }
                String strM226771 = C5523.m2267(-8371618036014340896L);
                f10991 = strM226771;
                return strM226771;
            case 71:
                String str72 = f10992;
                if (str72 != null) {
                    return str72;
                }
                String strM226772 = C5523.m2267(-6375229795639401804L);
                f10992 = strM226772;
                return strM226772;
            case 72:
                String str73 = f10993;
                if (str73 != null) {
                    return str73;
                }
                String strM226773 = C5523.m2267(-8100561073242466453L);
                f10993 = strM226773;
                return strM226773;
            case 73:
                String str74 = f10994;
                if (str74 != null) {
                    return str74;
                }
                String strM226774 = C5523.m2267(7282860967422937727L);
                f10994 = strM226774;
                return strM226774;
            case 74:
                String str75 = f10995;
                if (str75 != null) {
                    return str75;
                }
                String strM226775 = C5523.m2267(8362408380412890485L);
                f10995 = strM226775;
                return strM226775;
            case 75:
                String str76 = f10996;
                if (str76 != null) {
                    return str76;
                }
                String strM226776 = C5523.m2267(-8861569628485836340L);
                f10996 = strM226776;
                return strM226776;
            case 76:
                String str77 = f10997;
                if (str77 != null) {
                    return str77;
                }
                String strM226777 = C5523.m2267(-90184046903909462L);
                f10997 = strM226777;
                return strM226777;
            case 77:
                String str78 = f10998;
                if (str78 != null) {
                    return str78;
                }
                String strM226778 = C5523.m2267(7139754222167825334L);
                f10998 = strM226778;
                return strM226778;
            case 78:
                String str79 = f10999;
                if (str79 != null) {
                    return str79;
                }
                String strM226779 = C5523.m2267(-3754427262846629422L);
                f10999 = strM226779;
                return strM226779;
            case 79:
                String str80 = f11000;
                if (str80 != null) {
                    return str80;
                }
                String strM226780 = C5523.m2267(-999199787216295540L);
                f11000 = strM226780;
                return strM226780;
            case 80:
                String str81 = f11001;
                if (str81 != null) {
                    return str81;
                }
                String strM226781 = C5523.m2267(-2112271584748975364L);
                f11001 = strM226781;
                return strM226781;
            case 81:
                String str82 = f11002;
                if (str82 != null) {
                    return str82;
                }
                String strM226782 = C5523.m2267(6238986293684361666L);
                f11002 = strM226782;
                return strM226782;
            case 82:
                String str83 = f11003;
                if (str83 != null) {
                    return str83;
                }
                String strM226783 = C5523.m2267(-8025131096594686032L);
                f11003 = strM226783;
                return strM226783;
            case 83:
                String str84 = f11004;
                if (str84 != null) {
                    return str84;
                }
                String strM226784 = C5523.m2267(-2116402489648239505L);
                f11004 = strM226784;
                return strM226784;
            case 84:
                String str85 = f11005;
                if (str85 != null) {
                    return str85;
                }
                String strM226785 = C5523.m2267(5848290300740974710L);
                f11005 = strM226785;
                return strM226785;
            case 85:
                String str86 = f11006;
                if (str86 != null) {
                    return str86;
                }
                String strM226786 = C5523.m2267(8481991496700870183L);
                f11006 = strM226786;
                return strM226786;
            case 86:
                String str87 = f11007;
                if (str87 != null) {
                    return str87;
                }
                String strM226787 = C5523.m2267(7300996531430583321L);
                f11007 = strM226787;
                return strM226787;
            case 87:
                String str88 = f11008;
                if (str88 != null) {
                    return str88;
                }
                String strM226788 = C5523.m2267(3023079544558052369L);
                f11008 = strM226788;
                return strM226788;
            case 88:
                String str89 = f11009;
                if (str89 != null) {
                    return str89;
                }
                String strM226789 = C5523.m2267(-5624635612269655307L);
                f11009 = strM226789;
                return strM226789;
            case 89:
                String str90 = f11010;
                if (str90 != null) {
                    return str90;
                }
                String strM226790 = C5523.m2267(7978534327329385107L);
                f11010 = strM226790;
                return strM226790;
            case 90:
                String str91 = f11011;
                if (str91 != null) {
                    return str91;
                }
                String strM226791 = C5523.m2267(7846489163231460196L);
                f11011 = strM226791;
                return strM226791;
            case 91:
                String str92 = f11012;
                if (str92 != null) {
                    return str92;
                }
                String strM226792 = C5523.m2267(4321818592534311496L);
                f11012 = strM226792;
                return strM226792;
            case 92:
                String str93 = f11013;
                if (str93 != null) {
                    return str93;
                }
                String strM226793 = C5523.m2267(4270385250189221049L);
                f11013 = strM226793;
                return strM226793;
            case 93:
                String str94 = f11014;
                if (str94 != null) {
                    return str94;
                }
                String strM226794 = C5523.m2267(-2984173185950593429L);
                f11014 = strM226794;
                return strM226794;
            case 94:
                String str95 = f11015;
                if (str95 != null) {
                    return str95;
                }
                String strM226795 = C5523.m2267(6732419456624014222L);
                f11015 = strM226795;
                return strM226795;
            case 95:
                String str96 = f11016;
                if (str96 != null) {
                    return str96;
                }
                String strM226796 = C5523.m2267(-2371927487109967267L);
                f11016 = strM226796;
                return strM226796;
            case 96:
                String str97 = f11017;
                if (str97 != null) {
                    return str97;
                }
                String strM226797 = C5523.m2267(276023697987170922L);
                f11017 = strM226797;
                return strM226797;
            case 97:
                String str98 = f11018;
                if (str98 != null) {
                    return str98;
                }
                String strM226798 = C5523.m2267(-5710085768325125386L);
                f11018 = strM226798;
                return strM226798;
            case 98:
                String str99 = f11019;
                if (str99 != null) {
                    return str99;
                }
                String strM226799 = C5523.m2267(-9062917535479634449L);
                f11019 = strM226799;
                return strM226799;
            case 99:
                String str100 = f11020;
                if (str100 != null) {
                    return str100;
                }
                String strM2267100 = C5523.m2267(4743525348507530894L);
                f11020 = strM2267100;
                return strM2267100;
            case 100:
                String str101 = f11021;
                if (str101 != null) {
                    return str101;
                }
                String strM2267101 = C5523.m2267(-337142296464085083L);
                f11021 = strM2267101;
                return strM2267101;
            case 101:
                String str102 = f11022;
                if (str102 != null) {
                    return str102;
                }
                String strM2267102 = C5523.m2267(-3006926734989050147L);
                f11022 = strM2267102;
                return strM2267102;
            case 102:
                String str103 = f11023;
                if (str103 != null) {
                    return str103;
                }
                String strM2267103 = C5523.m2267(-3428290750102095986L);
                f11023 = strM2267103;
                return strM2267103;
            case 103:
                String str104 = f11024;
                if (str104 != null) {
                    return str104;
                }
                String strM2267104 = C5523.m2267(-8096669913771002688L);
                f11024 = strM2267104;
                return strM2267104;
            case 104:
                String str105 = f11025;
                if (str105 != null) {
                    return str105;
                }
                String strM2267105 = C5523.m2267(-681060923810016520L);
                f11025 = strM2267105;
                return strM2267105;
            case 105:
                String str106 = f11026;
                if (str106 != null) {
                    return str106;
                }
                String strM2267106 = C5523.m2267(5013066502420834960L);
                f11026 = strM2267106;
                return strM2267106;
            case 106:
                String str107 = f11027;
                if (str107 != null) {
                    return str107;
                }
                String strM2267107 = C5523.m2267(6106737580778973606L);
                f11027 = strM2267107;
                return strM2267107;
            case 107:
                String str108 = f11028;
                if (str108 != null) {
                    return str108;
                }
                String strM2267108 = C5523.m2267(7589853189612897443L);
                f11028 = strM2267108;
                return strM2267108;
            case 108:
                String str109 = f11029;
                if (str109 != null) {
                    return str109;
                }
                String strM2267109 = C5523.m2267(-4544144604250045835L);
                f11029 = strM2267109;
                return strM2267109;
            case 109:
                String str110 = f11030;
                if (str110 != null) {
                    return str110;
                }
                String strM2267110 = C5523.m2267(3355296790346519705L);
                f11030 = strM2267110;
                return strM2267110;
            case 110:
                String str111 = f11031;
                if (str111 != null) {
                    return str111;
                }
                String strM2267111 = C5523.m2267(-3651077735587416120L);
                f11031 = strM2267111;
                return strM2267111;
            case 111:
                String str112 = f11032;
                if (str112 != null) {
                    return str112;
                }
                String strM2267112 = C5523.m2267(-6595194404271384990L);
                f11032 = strM2267112;
                return strM2267112;
            case 112:
                String str113 = f11033;
                if (str113 != null) {
                    return str113;
                }
                String strM2267113 = C5523.m2267(5981933606424215759L);
                f11033 = strM2267113;
                return strM2267113;
            case 113:
                String str114 = f11034;
                if (str114 != null) {
                    return str114;
                }
                String strM2267114 = C5523.m2267(5873541555377258995L);
                f11034 = strM2267114;
                return strM2267114;
            case 114:
                String str115 = f11035;
                if (str115 != null) {
                    return str115;
                }
                String strM2267115 = C5523.m2267(-7240678892018003875L);
                f11035 = strM2267115;
                return strM2267115;
            case 115:
                String str116 = f11036;
                if (str116 != null) {
                    return str116;
                }
                String strM2267116 = C5523.m2267(6057164690731429420L);
                f11036 = strM2267116;
                return strM2267116;
            case 116:
                String str117 = f11037;
                if (str117 != null) {
                    return str117;
                }
                String strM2267117 = C5523.m2267(8846942452307174137L);
                f11037 = strM2267117;
                return strM2267117;
            case 117:
                String str118 = f11038;
                if (str118 != null) {
                    return str118;
                }
                String strM2267118 = C5523.m2267(1003631358278986144L);
                f11038 = strM2267118;
                return strM2267118;
            case 118:
                String str119 = f11039;
                if (str119 != null) {
                    return str119;
                }
                String strM2267119 = C5523.m2267(1104553115340014706L);
                f11039 = strM2267119;
                return strM2267119;
            case 119:
                String str120 = f11040;
                if (str120 != null) {
                    return str120;
                }
                String strM2267120 = C5523.m2267(3339775335134348604L);
                f11040 = strM2267120;
                return strM2267120;
            case 120:
                String str121 = f11041;
                if (str121 != null) {
                    return str121;
                }
                String strM2267121 = C5523.m2267(3042196043628893909L);
                f11041 = strM2267121;
                return strM2267121;
            case 121:
                String str122 = f11042;
                if (str122 != null) {
                    return str122;
                }
                String strM2267122 = C5523.m2267(-6332500139068547803L);
                f11042 = strM2267122;
                return strM2267122;
            case 122:
                String str123 = f11043;
                if (str123 != null) {
                    return str123;
                }
                String strM2267123 = C5523.m2267(226560003188876834L);
                f11043 = strM2267123;
                return strM2267123;
            case 123:
                String str124 = f11044;
                if (str124 != null) {
                    return str124;
                }
                String strM2267124 = C5523.m2267(4911450400693816627L);
                f11044 = strM2267124;
                return strM2267124;
            case 124:
                String str125 = f11045;
                if (str125 != null) {
                    return str125;
                }
                String strM2267125 = C5523.m2267(8330621410826985291L);
                f11045 = strM2267125;
                return strM2267125;
            case 125:
                String str126 = f11046;
                if (str126 != null) {
                    return str126;
                }
                String strM2267126 = C5523.m2267(4173637586327397197L);
                f11046 = strM2267126;
                return strM2267126;
            case 126:
                String str127 = f11047;
                if (str127 != null) {
                    return str127;
                }
                String strM2267127 = C5523.m2267(-9155206362240736573L);
                f11047 = strM2267127;
                return strM2267127;
            case 127:
                String str128 = f11048;
                if (str128 != null) {
                    return str128;
                }
                String strM2267128 = C5523.m2267(1698943281395999614L);
                f11048 = strM2267128;
                return strM2267128;
            case 128:
                String str129 = f11049;
                if (str129 != null) {
                    return str129;
                }
                String strM2267129 = C5523.m2267(-2711961062254293882L);
                f11049 = strM2267129;
                return strM2267129;
            case 129:
                String str130 = f11050;
                if (str130 != null) {
                    return str130;
                }
                String strM2267130 = C5523.m2267(5024903293416675558L);
                f11050 = strM2267130;
                return strM2267130;
            case 130:
                String str131 = f11051;
                if (str131 != null) {
                    return str131;
                }
                String strM2267131 = C5523.m2267(4332702730260217741L);
                f11051 = strM2267131;
                return strM2267131;
            case 131:
                String str132 = f11052;
                if (str132 != null) {
                    return str132;
                }
                String strM2267132 = C5523.m2267(-6655145192039136184L);
                f11052 = strM2267132;
                return strM2267132;
            case 132:
                String str133 = f11053;
                if (str133 != null) {
                    return str133;
                }
                String strM2267133 = C5523.m2267(-1378342891286409134L);
                f11053 = strM2267133;
                return strM2267133;
            case 133:
                String str134 = f11054;
                if (str134 != null) {
                    return str134;
                }
                String strM2267134 = C5523.m2267(1296892903414777236L);
                f11054 = strM2267134;
                return strM2267134;
            case 134:
                String str135 = f11055;
                if (str135 != null) {
                    return str135;
                }
                String strM2267135 = C5523.m2267(-784769647705694343L);
                f11055 = strM2267135;
                return strM2267135;
            case 135:
                String str136 = f11056;
                if (str136 != null) {
                    return str136;
                }
                String strM2267136 = C5523.m2267(5106220065194720855L);
                f11056 = strM2267136;
                return strM2267136;
            case 136:
                String str137 = f11057;
                if (str137 != null) {
                    return str137;
                }
                String strM2267137 = C5523.m2267(-5169673996075955585L);
                f11057 = strM2267137;
                return strM2267137;
            case 137:
                String str138 = f11058;
                if (str138 != null) {
                    return str138;
                }
                String strM2267138 = C5523.m2267(-3686559470087433158L);
                f11058 = strM2267138;
                return strM2267138;
            case 138:
                String str139 = f11059;
                if (str139 != null) {
                    return str139;
                }
                String strM2267139 = C5523.m2267(610868683448936902L);
                f11059 = strM2267139;
                return strM2267139;
            case 139:
                String str140 = f11060;
                if (str140 != null) {
                    return str140;
                }
                String strM2267140 = C5523.m2267(412370518721604398L);
                f11060 = strM2267140;
                return strM2267140;
            case 140:
                String str141 = f11061;
                if (str141 != null) {
                    return str141;
                }
                String strM2267141 = C5523.m2267(-1822374883222641750L);
                f11061 = strM2267141;
                return strM2267141;
            case 141:
                String str142 = f11062;
                if (str142 != null) {
                    return str142;
                }
                String strM2267142 = C5523.m2267(-1827604732693193374L);
                f11062 = strM2267142;
                return strM2267142;
            case 142:
                String str143 = f11063;
                if (str143 != null) {
                    return str143;
                }
                String strM2267143 = C5523.m2267(-2360252292864630670L);
                f11063 = strM2267143;
                return strM2267143;
            case 143:
                String str144 = f11064;
                if (str144 != null) {
                    return str144;
                }
                String strM2267144 = C5523.m2267(-2348030634045006328L);
                f11064 = strM2267144;
                return strM2267144;
            case 144:
                String str145 = f11065;
                if (str145 != null) {
                    return str145;
                }
                String strM2267145 = C5523.m2267(6673820412015593963L);
                f11065 = strM2267145;
                return strM2267145;
            case 145:
                String str146 = f11066;
                if (str146 != null) {
                    return str146;
                }
                String strM2267146 = C5523.m2267(2489831656520268387L);
                f11066 = strM2267146;
                return strM2267146;
            case 146:
                String str147 = f11067;
                if (str147 != null) {
                    return str147;
                }
                String strM2267147 = C5523.m2267(5341581517345429082L);
                f11067 = strM2267147;
                return strM2267147;
            case 147:
                String str148 = f11068;
                if (str148 != null) {
                    return str148;
                }
                String strM2267148 = C5523.m2267(-3090984720507412411L);
                f11068 = strM2267148;
                return strM2267148;
            case 148:
                String str149 = f11069;
                if (str149 != null) {
                    return str149;
                }
                String strM2267149 = C5523.m2267(-7356767732452926729L);
                f11069 = strM2267149;
                return strM2267149;
            case 149:
                String str150 = f11070;
                if (str150 != null) {
                    return str150;
                }
                String strM2267150 = C5523.m2267(1820044860150730456L);
                f11070 = strM2267150;
                return strM2267150;
            case 150:
                String str151 = f11071;
                if (str151 != null) {
                    return str151;
                }
                String strM2267151 = C5523.m2267(8891036797115425455L);
                f11071 = strM2267151;
                return strM2267151;
            case 151:
                String str152 = f11072;
                if (str152 != null) {
                    return str152;
                }
                String strM2267152 = C5523.m2267(-3799450478822357785L);
                f11072 = strM2267152;
                return strM2267152;
            case 152:
                String str153 = f11073;
                if (str153 != null) {
                    return str153;
                }
                String strM2267153 = C5523.m2267(-4452487106022551597L);
                f11073 = strM2267153;
                return strM2267153;
            case 153:
                String str154 = f11074;
                if (str154 != null) {
                    return str154;
                }
                String strM2267154 = C5523.m2267(-8681095281205851008L);
                f11074 = strM2267154;
                return strM2267154;
            case 154:
                String str155 = f11075;
                if (str155 != null) {
                    return str155;
                }
                String strM2267155 = C5523.m2267(7163714149843298178L);
                f11075 = strM2267155;
                return strM2267155;
            case 155:
                String str156 = f11076;
                if (str156 != null) {
                    return str156;
                }
                String strM2267156 = C5523.m2267(-4267542531844562510L);
                f11076 = strM2267156;
                return strM2267156;
            case 156:
                String str157 = f11077;
                if (str157 != null) {
                    return str157;
                }
                String strM2267157 = C5523.m2267(-732218728465082477L);
                f11077 = strM2267157;
                return strM2267157;
            case 157:
                String str158 = f11078;
                if (str158 != null) {
                    return str158;
                }
                String strM2267158 = C5523.m2267(4813521670300768143L);
                f11078 = strM2267158;
                return strM2267158;
            case 158:
                String str159 = f11079;
                if (str159 != null) {
                    return str159;
                }
                String strM2267159 = C5523.m2267(1996508075829924495L);
                f11079 = strM2267159;
                return strM2267159;
            case 159:
                String str160 = f11080;
                if (str160 != null) {
                    return str160;
                }
                String strM2267160 = C5523.m2267(-5204696370969756284L);
                f11080 = strM2267160;
                return strM2267160;
            case 160:
                String str161 = f11081;
                if (str161 != null) {
                    return str161;
                }
                String strM2267161 = C5523.m2267(-8988826920876317444L);
                f11081 = strM2267161;
                return strM2267161;
            case 161:
                String str162 = f11082;
                if (str162 != null) {
                    return str162;
                }
                String strM2267162 = C5523.m2267(6170991761373123755L);
                f11082 = strM2267162;
                return strM2267162;
            case 162:
                String str163 = f11083;
                if (str163 != null) {
                    return str163;
                }
                String strM2267163 = C5523.m2267(7777651692817363778L);
                f11083 = strM2267163;
                return strM2267163;
            case 163:
                String str164 = f11084;
                if (str164 != null) {
                    return str164;
                }
                String strM2267164 = C5523.m2267(3514571124968557724L);
                f11084 = strM2267164;
                return strM2267164;
            case 164:
                String str165 = f11085;
                if (str165 != null) {
                    return str165;
                }
                String strM2267165 = C5523.m2267(7673711780626973709L);
                f11085 = strM2267165;
                return strM2267165;
            case 165:
                String str166 = f11086;
                if (str166 != null) {
                    return str166;
                }
                String strM2267166 = C5523.m2267(-4440477195350833792L);
                f11086 = strM2267166;
                return strM2267166;
            case 166:
                String str167 = f11087;
                if (str167 != null) {
                    return str167;
                }
                String strM2267167 = C5523.m2267(8766283670757383371L);
                f11087 = strM2267167;
                return strM2267167;
            case 167:
                String str168 = f11088;
                if (str168 != null) {
                    return str168;
                }
                String strM2267168 = C5523.m2267(5773497634619150802L);
                f11088 = strM2267168;
                return strM2267168;
            case 168:
                String str169 = f11089;
                if (str169 != null) {
                    return str169;
                }
                String strM2267169 = C5523.m2267(-2413617890645783678L);
                f11089 = strM2267169;
                return strM2267169;
            case 169:
                String str170 = f11090;
                if (str170 != null) {
                    return str170;
                }
                String strM2267170 = C5523.m2267(-1639083670691306398L);
                f11090 = strM2267170;
                return strM2267170;
            case 170:
                String str171 = f11091;
                if (str171 != null) {
                    return str171;
                }
                String strM2267171 = C5523.m2267(8987949419891372110L);
                f11091 = strM2267171;
                return strM2267171;
            case 171:
                String str172 = f11092;
                if (str172 != null) {
                    return str172;
                }
                String strM2267172 = C5523.m2267(-1507289435363211261L);
                f11092 = strM2267172;
                return strM2267172;
            case 172:
                String str173 = f11093;
                if (str173 != null) {
                    return str173;
                }
                String strM2267173 = C5523.m2267(-9182205474787118906L);
                f11093 = strM2267173;
                return strM2267173;
            case 173:
                String str174 = f11094;
                if (str174 != null) {
                    return str174;
                }
                String strM2267174 = C5523.m2267(9024952233187507377L);
                f11094 = strM2267174;
                return strM2267174;
            case 174:
                String str175 = f11095;
                if (str175 != null) {
                    return str175;
                }
                String strM2267175 = C5523.m2267(-7043523220266968980L);
                f11095 = strM2267175;
                return strM2267175;
            case 175:
                String str176 = f11096;
                if (str176 != null) {
                    return str176;
                }
                String strM2267176 = C5523.m2267(8718136347942384192L);
                f11096 = strM2267176;
                return strM2267176;
            case 176:
                String str177 = f11097;
                if (str177 != null) {
                    return str177;
                }
                String strM2267177 = C5523.m2267(-2412751436139704553L);
                f11097 = strM2267177;
                return strM2267177;
            case 177:
                String str178 = f11098;
                if (str178 != null) {
                    return str178;
                }
                String strM2267178 = C5523.m2267(2551103200458461254L);
                f11098 = strM2267178;
                return strM2267178;
            case 178:
                String str179 = f11099;
                if (str179 != null) {
                    return str179;
                }
                String strM2267179 = C5523.m2267(-7677740409357915548L);
                f11099 = strM2267179;
                return strM2267179;
            case 179:
                String str180 = f11100;
                if (str180 != null) {
                    return str180;
                }
                String strM2267180 = C5523.m2267(-2978252191612619444L);
                f11100 = strM2267180;
                return strM2267180;
            case 180:
                String str181 = f11101;
                if (str181 != null) {
                    return str181;
                }
                String strM2267181 = C5523.m2267(340278554679450051L);
                f11101 = strM2267181;
                return strM2267181;
            case 181:
                String str182 = f11102;
                if (str182 != null) {
                    return str182;
                }
                String strM2267182 = C5523.m2267(-8275279051692110658L);
                f11102 = strM2267182;
                return strM2267182;
            case 182:
                String str183 = f11103;
                if (str183 != null) {
                    return str183;
                }
                String strM2267183 = C5523.m2267(7511536701897656707L);
                f11103 = strM2267183;
                return strM2267183;
            case 183:
                String str184 = f11104;
                if (str184 != null) {
                    return str184;
                }
                String strM2267184 = C5523.m2267(-8843307688612966622L);
                f11104 = strM2267184;
                return strM2267184;
            case 184:
                String str185 = f11105;
                if (str185 != null) {
                    return str185;
                }
                String strM2267185 = C5523.m2267(-3823844387629927484L);
                f11105 = strM2267185;
                return strM2267185;
            case 185:
                String str186 = f11106;
                if (str186 != null) {
                    return str186;
                }
                String strM2267186 = C5523.m2267(3867866583534784285L);
                f11106 = strM2267186;
                return strM2267186;
            case 186:
                String str187 = f11107;
                if (str187 != null) {
                    return str187;
                }
                String strM2267187 = C5523.m2267(2996037681628716026L);
                f11107 = strM2267187;
                return strM2267187;
            case 187:
                String str188 = f11108;
                if (str188 != null) {
                    return str188;
                }
                String strM2267188 = C5523.m2267(-8690631437430273730L);
                f11108 = strM2267188;
                return strM2267188;
            case 188:
                String str189 = f11109;
                if (str189 != null) {
                    return str189;
                }
                String strM2267189 = C5523.m2267(4087171689423088764L);
                f11109 = strM2267189;
                return strM2267189;
            default:
                return null;
        }
    }

    private static /* synthetic */ void yue_xin_qaq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m14810(List list) {
        try {
            for (Object obj : new ArrayList(list)) {
                if (obj != null) {
                    String str = (String) new C4805().m14538(obj).m14540(String.class).m1709(yue_xin_awa(19));
                    if (str != null) {
                        if (f10918.contains(str)) {
                            m14839(obj, yue_xin_awa(20)).m14783(yue_xin_awa(21) + str);
                            list.remove(obj);
                        } else {
                            List<String> list2 = f10917;
                            if (!list2.contains(str)) {
                                list2.add(str);
                            }
                        }
                    }
                    if (list.size() == 1) {
                        m14848();
                        return;
                    }
                    if (m14820(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14822(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14836(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14849(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14828(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14837(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14838(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14841(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14826(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14819(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14827(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    } else if (m14840(obj)) {
                        list.remove(obj);
                        f10918.add(str);
                    }
                }
            }
        } catch (Throwable th) {
            m14839(null, yue_xin_awa(22)).m14783(C7817.m24801(System.currentTimeMillis()) + yue_xin_awa(23) + th);
            StringBuilder sb = new StringBuilder();
            sb.append(yue_xin_awa(24));
            sb.append(th);
            C6334.m19808(sb.toString(), 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m14811(String[] strArr, BottomMenu bottomMenu, View view) {
        C6337.m19832(bottomMenu.getSelectionIndexArray(), strArr);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ boolean m14812(String[] strArr, BottomMenu bottomMenu, View view) {
        C6337.m19832(bottomMenu.getSelectionIndexArray(), strArr);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m14813(C4840 c4840, MessageDialog messageDialog, View view) {
        C6338.m19834(c4840.m14780(), c4840.m14780());
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ void m14814(final C4840 c4840, int i) {
        final String str = yue_xin_awa(169) + c4840.m1748() + yue_xin_awa(170) + c4840.m14780() + yue_xin_awa(171) + c4840.m14779() + yue_xin_awa(172) + c4840.m14778() + yue_xin_awa(78) + c4840.m14776();
        MessageDialog.show(yue_xin_awa(124), str).setOkButton(yue_xin_awa(173), new OnDialogButtonClickListener() { // from class: Yue.ۥ۠ۢ۠ۥ
            @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
            public final boolean onClick(BaseDialog baseDialog, View view) {
                return C4856.m14816(str, (MessageDialog) baseDialog, view);
            }
        }).setCancelButton(yue_xin_awa(174), new OnDialogButtonClickListener() { // from class: Yue.ۥ۠ۢ۠ۦ
            @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
            public final boolean onClick(BaseDialog baseDialog, View view) {
                return C4856.m14813(c4840, (MessageDialog) baseDialog, view);
            }
        });
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static /* synthetic */ boolean m14815(C4564 c4564, BottomDialog bottomDialog, View view) {
        f10919.clear();
        c4564.m11363();
        C6334.m19807(yue_xin_awa(168), 2);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static /* synthetic */ boolean m14816(String str, MessageDialog messageDialog, View view) {
        C3845.m900(str);
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m14817(String str, JSONObject jSONObject, MessageDialog messageDialog, View view) {
        try {
            String inputText = messageDialog.getInputText();
            if (inputText.isEmpty()) {
                C6334.m19807(yue_xin_awa(148), 2);
                C4093.m11566(str, null);
            } else {
                jSONObject.put(yue_xin_awa(80), inputText);
                jSONObject.put(yue_xin_awa(79), 1);
                C4093.m11566(str, jSONObject);
                C6334.m19807(yue_xin_awa(175), 2);
            }
            return false;
        } catch (Exception e) {
            C6334.m19807(yue_xin_awa(176) + e, 1);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static /* synthetic */ boolean m14818(String str, JSONObject jSONObject, MessageDialog messageDialog, View view) {
        try {
            String inputText = messageDialog.getInputText();
            if (inputText.isEmpty()) {
                C6334.m19807(yue_xin_awa(148), 2);
                C4093.m11566(str, null);
            } else {
                jSONObject.put(yue_xin_awa(80), inputText);
                jSONObject.put(yue_xin_awa(79), 2);
                C4093.m11566(str, jSONObject);
                C6334.m19807(yue_xin_awa(175), 2);
            }
            return false;
        } catch (Exception e) {
            C6334.m19807(yue_xin_awa(176) + e, 1);
            return false;
        }
    }

    @Override // Yue.AbstractC5391
    public MethodDataList dexKit(DexKitBridge dexKitBridge) {
        return dexKitBridge.findMethod(FindMethod.create().matcher(MethodMatcher.create().usingStrings(yue_xin_awa(165), yue_xin_awa(166), yue_xin_awa(167))));
    }

    @Override // Yue.AbstractC5391
    public String[] getClickStrings() {
        return f10920;
    }

    @Override // Yue.AbstractC5391
    public itemInfo info() {
        itemInfo iteminfo = new itemInfo();
        iteminfo.name = yue_xin_awa(5);
        iteminfo.desc = yue_xin_awa(6);
        iteminfo.add = true;
        iteminfo.click = true;
        iteminfo.longClick = true;
        iteminfo.isCheck = true;
        iteminfo.open = new String[]{yue_xin_awa(7), yue_xin_awa(8), yue_xin_awa(9), yue_xin_awa(10), yue_xin_awa(11), yue_xin_awa(12)};
        iteminfo.checkID = yue_xin_awa(13);
        iteminfo.f4200id = yue_xin_awa(14);
        return iteminfo;
    }

    @Override // Yue.AbstractC5391
    public void load(C3828 c3828, ClassLoader classLoader) {
        try {
            m14823();
            C5309.m16280(c3828.m879(), classLoader, C8573.m4543(classLoader.loadClass(c3828.m879()), Void.TYPE, 1, new Class[]{List.class}).get(0).getName(), List.class, new C0508());
        } catch (Throwable th) {
            C4383.m12707(yue_xin_awa(15), th.getMessage());
        }
    }

    @Override // Yue.AbstractC5391
    public void onClick() {
        final String[] strArr = {yue_xin_awa(7), yue_xin_awa(17), yue_xin_awa(18), yue_xin_awa(54), yue_xin_awa(30), yue_xin_awa(57), yue_xin_awa(60), yue_xin_awa(123), yue_xin_awa(99), yue_xin_awa(69), yue_xin_awa(75), yue_xin_awa(86), yue_xin_awa(94)};
        BottomMenu.show(f10920).setTitle((CharSequence) yue_xin_awa(124)).setMessage((CharSequence) yue_xin_awa(125)).setOkButton(yue_xin_awa(126), new OnMenuButtonClickListener() { // from class: Yue.ۥ۠ۢۡ۟
            @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
            public final boolean onClick(BaseDialog baseDialog, View view) {
                return C4856.m14811(strArr, (BottomMenu) baseDialog, view);
            }
        }).setCancelButton(yue_xin_awa(127), new OnMenuButtonClickListener() { // from class: Yue.ۥ۠ۢۡ۠
            @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
            public final boolean onClick(BaseDialog baseDialog, View view) {
                return this.f1173.m14830((BottomMenu) baseDialog, view);
            }
        }).setOtherButton(yue_xin_awa(128), new OnMenuButtonClickListener() { // from class: Yue.ۥ۠ۢۡۡ
            @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
            public final boolean onClick(BaseDialog baseDialog, View view) {
                return this.f1174.m14831((BottomMenu) baseDialog, view);
            }
        }).setSelection(C6337.m19821(strArr));
    }

    @Override // Yue.AbstractC5391
    public void onLongClick() {
        String[] strArr = {yue_xin_awa(153), yue_xin_awa(154), yue_xin_awa(155), yue_xin_awa(156), yue_xin_awa(157), yue_xin_awa(158)};
        final String[] strArr2 = {yue_xin_awa(8), yue_xin_awa(9), yue_xin_awa(10), yue_xin_awa(11), yue_xin_awa(159), yue_xin_awa(12)};
        BottomMenu.show(strArr).setTitle((CharSequence) yue_xin_awa(124)).setMessage((CharSequence) yue_xin_awa(160)).setOkButton(yue_xin_awa(126), new OnMenuButtonClickListener() { // from class: Yue.ۥ۠ۢ۠ۡ
            @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
            public final boolean onClick(BaseDialog baseDialog, View view) {
                return C4856.m14812(strArr2, (BottomMenu) baseDialog, view);
            }
        }).setSelection(C6337.m19821(strArr2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m14819(Object obj) {
        if (!C4093.m11556(yue_xin_awa(69))) {
            return false;
        }
        try {
            String str = (String) new C4805().m14538(obj).m14540(String.class).m1709(yue_xin_awa(70));
            if (str != null) {
                if (!str.equals(yue_xin_awa(71))) {
                    if (str.equals(yue_xin_awa(72))) {
                    }
                }
                m14839(obj, yue_xin_awa(73)).m14783(str);
                return true;
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(74)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final boolean m14820(Object obj) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        if (!C4093.m11556(yue_xin_awa(7))) {
            return false;
        }
        if (m14829(obj) || m14825(obj)) {
            return true;
        }
        try {
            C4805 c4805M14538 = new C4805().m14538(obj);
            C4805 c4805 = new C4805();
            int iIntValue = ((Integer) c4805M14538.m14540(Integer.TYPE).m1709(yue_xin_awa(25))).intValue();
            Class<?> cls = Boolean.TYPE;
            boolean zBooleanValue3 = ((Boolean) c4805M14538.m14540(cls).m1709(yue_xin_awa(45))).booleanValue();
            Object objCallMethod = null;
            Object objM1709 = c4805M14538.m14540(null).m1709(yue_xin_awa(46));
            if (objM1709 != null) {
                c4805.m14538(objM1709);
                zBooleanValue2 = ((Boolean) c4805.m14540(cls).m1709(yue_xin_awa(47))).booleanValue();
                zBooleanValue = ((Boolean) c4805.m14540(Boolean.class).m1709(yue_xin_awa(48))).booleanValue();
            } else {
                zBooleanValue = false;
                zBooleanValue2 = false;
            }
            try {
                objCallMethod = XposedHelpers.callMethod(obj, yue_xin_awa(49), new Object[0]);
            } catch (Throwable unused) {
            }
            if (iIntValue == 9001 || zBooleanValue3 || objCallMethod != null || zBooleanValue2 || zBooleanValue) {
                m14839(obj, yue_xin_awa(50)).m14783(yue_xin_awa(51) + zBooleanValue3 + yue_xin_awa(52) + objM1709);
                return true;
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(53)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m14821(List list) {
        Object obj = list.get(0);
        for (int i = 0; i < 400; i++) {
            list.add(obj);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m14822(Object obj) {
        if (!C4093.m11556(yue_xin_awa(86))) {
            return false;
        }
        try {
            Object objM1709 = new C4805().m14538(obj).m14540(null).m1709(yue_xin_awa(87));
            if (objM1709 != null) {
                String str = (String) new C4805().m14538(objM1709).m14540(String.class).m1709(yue_xin_awa(88));
                if (str != null) {
                    if (!str.equals(yue_xin_awa(89))) {
                        if (!str.equals(yue_xin_awa(90))) {
                            if (str.equals(yue_xin_awa(91))) {
                            }
                        }
                    }
                    m14839(obj, yue_xin_awa(92)).m14783(str);
                    return true;
                }
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(93)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m14823() {
        if (C4093.m11556(yue_xin_awa(16))) {
            String strYue_xin_awa = yue_xin_awa(17);
            Boolean bool = Boolean.TRUE;
            C4093.m11566(strYue_xin_awa, bool);
            C4093.m11566(yue_xin_awa(18), bool);
            C4093.m11566(yue_xin_awa(16), Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m14824(List list) {
        int size = list.size();
        List<String> list2 = f10917;
        int size2 = list2.size();
        if (size > 600) {
            list.subList(0, 200).clear();
        }
        if (size2 > 600) {
            list2.subList(0, 200).clear();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final boolean m14825(Object obj) {
        try {
            Object objM1709 = new C4805().m14538(obj).m14540(null).m1709(yue_xin_awa(33));
            if (objM1709 != null && ((Boolean) new C4805().m14538(objM1709).m14540(Boolean.TYPE).m1709(yue_xin_awa(34))).booleanValue()) {
                m14839(obj, yue_xin_awa(35)).m14783(yue_xin_awa(36));
                return true;
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(37)).m14783(yue_xin_awa(38) + th);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m14826(Object obj) {
        int i;
        long j;
        long j2;
        long j3;
        if (!C4093.m11556(yue_xin_awa(99))) {
            return false;
        }
        try {
            Object objCallMethod = XposedHelpers.callMethod(obj, yue_xin_awa(61), new Object[0]);
            if (objCallMethod == null) {
                return false;
            }
            int iIntValue = ((Integer) new C4805().m14538(objCallMethod).m14540(Integer.TYPE).m1709(yue_xin_awa(100))).intValue();
            Object objCallMethod2 = XposedHelpers.callMethod(obj, yue_xin_awa(101), new Object[0]);
            if (objCallMethod2 == null) {
                return false;
            }
            C4805 c4805M14538 = new C4805().m14538(objCallMethod2);
            Class<?> cls = Long.TYPE;
            long jLongValue = ((Long) c4805M14538.m14540(cls).m1709(yue_xin_awa(102))).longValue();
            long jLongValue2 = ((Long) c4805M14538.m14540(cls).m1709(yue_xin_awa(103))).longValue();
            long jLongValue3 = ((Long) c4805M14538.m14540(cls).m1709(yue_xin_awa(104))).longValue();
            long jLongValue4 = ((Long) c4805M14538.m14540(cls).m1709(yue_xin_awa(105))).longValue();
            long j4 = iIntValue;
            long[] jArr = {jLongValue, jLongValue2, jLongValue4, jLongValue3, j4};
            long j5 = jLongValue3;
            String[] strArr = {yue_xin_awa(106), yue_xin_awa(107), yue_xin_awa(108), yue_xin_awa(109), yue_xin_awa(110)};
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f1176;
                if (i2 >= strArr2.length) {
                    return false;
                }
                JSONObject jSONObject = (JSONObject) C4093.m11560(strArr2[i2]);
                if (jSONObject != null) {
                    int i3 = jSONObject.getInt(yue_xin_awa(79));
                    i = jSONObject.getInt(yue_xin_awa(111));
                    if (i3 == 1) {
                        j = jLongValue4;
                        if (jArr[i2] > i) {
                            break;
                        }
                    } else {
                        j = jLongValue4;
                    }
                    if (i3 == 2 && jArr[i2] < i) {
                        break;
                    }
                    j2 = j5;
                    j3 = j;
                } else {
                    j3 = jLongValue4;
                    j2 = j5;
                }
                i2++;
                j5 = j2;
                jLongValue4 = j3;
            }
            m14839(obj, yue_xin_awa(112)).m14783(yue_xin_awa(113) + strArr[i2] + yue_xin_awa(114) + jArr[i2] + yue_xin_awa(115) + i + yue_xin_awa(116) + jLongValue + yue_xin_awa(117) + jLongValue2 + yue_xin_awa(118) + C7817.m24800(j4) + yue_xin_awa(119) + j + yue_xin_awa(120) + j5 + yue_xin_awa(121));
            return true;
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(122)).m14783(th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m14827(Object obj) {
        if (!C4093.m11556(yue_xin_awa(75))) {
            return false;
        }
        JSONObject jSONObject = (JSONObject) C4093.m11560(yue_xin_awa(76));
        try {
            String strYue_xin_awa = (String) new C4805().m14538(obj).m14540(String.class).m1709(yue_xin_awa(39));
            if (strYue_xin_awa == null) {
                strYue_xin_awa = yue_xin_awa(77);
            }
            String strReplaceAll = strYue_xin_awa.replaceAll(yue_xin_awa(78), yue_xin_awa(77));
            if (jSONObject != null) {
                int i = jSONObject.getInt(yue_xin_awa(79));
                for (String str : jSONObject.getString(yue_xin_awa(80)).split(yue_xin_awa(81))) {
                    if ((i == 1 && strReplaceAll.contains(str)) || (i == 2 && !strReplaceAll.contains(str))) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(yue_xin_awa(82));
                        sb.append(i == 1 ? yue_xin_awa(83) : yue_xin_awa(84));
                        sb.append(str);
                        m14839(obj, sb.toString()).m14783(strReplaceAll);
                        return true;
                    }
                }
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(85)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final boolean m14828(Object obj) {
        boolean zM11556 = C4093.m11556(yue_xin_awa(18));
        boolean zM115562 = C4093.m11556(yue_xin_awa(17));
        if (!zM11556 && !zM115562) {
            return false;
        }
        try {
            C4805 c4805M14538 = new C4805().m14538(obj);
            Class<?> cls = Integer.TYPE;
            int iIntValue = ((Integer) c4805M14538.m14540(cls).m1709(yue_xin_awa(25))).intValue();
            int iIntValue2 = ((Integer) c4805M14538.m14540(cls).m1709(yue_xin_awa(26))).intValue();
            if (zM11556 && iIntValue2 == 1) {
                m14839(obj, yue_xin_awa(27));
                return true;
            }
            if ((iIntValue != 2 && iIntValue != 68) || !zM115562 || iIntValue2 == 1) {
                return false;
            }
            m14839(obj, yue_xin_awa(28));
            return true;
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(29)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final boolean m14829(Object obj) {
        try {
            C4805 c4805M14538 = new C4805().m14538(obj);
            String str = (String) c4805M14538.m14540(String.class).m1709(yue_xin_awa(39));
            Object objM1709 = c4805M14538.m14540(null).m1709(yue_xin_awa(40));
            long jLongValue = ((Long) c4805M14538.m14540(Long.TYPE).m1709(yue_xin_awa(41))).longValue();
            int iIntValue = ((Integer) c4805M14538.m14540(Integer.TYPE).m1709(yue_xin_awa(25))).intValue();
            if (str != null || objM1709 != null || jLongValue != 0 || iIntValue == 101) {
                return false;
            }
            m14839(obj, yue_xin_awa(42)).m14783(yue_xin_awa(43));
            return true;
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(44)).m14783(yue_xin_awa(38) + th);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ boolean m14830(BottomMenu bottomMenu, View view) {
        m14846();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final /* synthetic */ boolean m14831(BottomMenu bottomMenu, View view) {
        m14845();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final /* synthetic */ boolean m14832(MessageMenu messageMenu, CharSequence charSequence, int i) {
        m14844(i);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final /* synthetic */ boolean m14833(int i, JSONObject jSONObject, InputDialog inputDialog, View view, String str) {
        return m14842(str, this.f1176[i], 1, jSONObject);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final /* synthetic */ boolean m14834(int i, JSONObject jSONObject, InputDialog inputDialog, View view, String str) {
        return m14842(str, this.f1176[i], 2, jSONObject);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final /* synthetic */ boolean m14835(MessageMenu messageMenu, CharSequence charSequence, int i) {
        if (i == 0) {
            m14843();
            return false;
        }
        m14847();
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final boolean m14836(Object obj) {
        if (!C4093.m11556(yue_xin_awa(54))) {
            return false;
        }
        try {
            if (((Integer) new C4805().m14538(obj).m14540(Integer.TYPE).m1709(yue_xin_awa(25))).intValue() == 101) {
                m14839(obj, yue_xin_awa(55));
                return true;
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(56)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final boolean m14837(Object obj) {
        if (!C4093.m11556(yue_xin_awa(57))) {
            return false;
        }
        try {
            int iIntValue = ((Integer) new C4805().m14538(obj).m14540(Integer.TYPE).m1709(yue_xin_awa(25))).intValue();
            if (iIntValue == 117 || iIntValue == 155) {
                m14839(obj, yue_xin_awa(58));
                return true;
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(59)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final boolean m14838(Object obj) {
        if (!C4093.m11556(yue_xin_awa(60))) {
            return false;
        }
        try {
            int iIntValue = ((Integer) new C4805().m14538(obj).m14540(Integer.TYPE).m1709(yue_xin_awa(25))).intValue();
            Object objCallMethod = XposedHelpers.callMethod(obj, yue_xin_awa(61), new Object[0]);
            if (objCallMethod != null) {
                String str = (String) new C4805().m14538(objCallMethod).m14540(null).m1709(yue_xin_awa(62));
                if (iIntValue == 135 && yue_xin_awa(63).equals(str)) {
                    m14839(obj, yue_xin_awa(64));
                    return true;
                }
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(65)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final C4840 m14839(Object obj, String str) {
        C4840 c4840 = new C4840();
        try {
            C4805 c4805M14538 = new C4805().m14538(obj);
            String str2 = (String) c4805M14538.m14540(String.class).m1709(yue_xin_awa(19));
            c4840.m14782((String) c4805M14538.m14540(String.class).m1709(yue_xin_awa(39)));
            c4840.m14785(C7817.m24801(System.currentTimeMillis()));
            c4840.m14786(str);
            c4840.m14784(str);
            c4840.m14787(str2);
            f10919.add(c4840);
        } catch (Throwable unused) {
        }
        return c4840;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final boolean m14840(Object obj) {
        if (!C4093.m11556(yue_xin_awa(94))) {
            return false;
        }
        try {
            Object objM1709 = new C4805().m14538(obj).m14540(null).m1709(yue_xin_awa(95));
            if (objM1709 != null) {
                m14839(obj, yue_xin_awa(97)).m14783((String) new C4805().m14538(objM1709).m14540(String.class).m1709(yue_xin_awa(96)));
                return true;
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(98)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m14841(Object obj) {
        if (!C4093.m11556(yue_xin_awa(60))) {
            return false;
        }
        try {
            C4805 c4805M14538 = new C4805().m14538(obj);
            Class<?> cls = Integer.TYPE;
            int iIntValue = ((Integer) c4805M14538.m14540(cls).m1709(yue_xin_awa(66))).intValue();
            int iIntValue2 = ((Integer) c4805M14538.m14540(cls).m1709(yue_xin_awa(25))).intValue();
            if (iIntValue == 1 || iIntValue2 == 107) {
                m14839(obj, yue_xin_awa(67));
                return true;
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(68)).m14783(th.getMessage());
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m14842(String str, String str2, int i, JSONObject jSONObject) {
        if (str.isEmpty()) {
            C4093.m11566(str2, null);
            C6334.m19807(yue_xin_awa(148), 2);
            return false;
        }
        try {
            jSONObject.put(yue_xin_awa(111), Integer.parseInt(str));
            jSONObject.put(yue_xin_awa(79), i);
            C4093.m11566(str2, jSONObject);
            C6334.m19807(yue_xin_awa(149), 2);
        } catch (Exception unused) {
            C6334.m19807(yue_xin_awa(150), 3);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m14843() {
        MessageMenu.show(yue_xin_awa(136), yue_xin_awa(137), yue_xin_awa(138), yue_xin_awa(139), yue_xin_awa(140)).setTitle((CharSequence) yue_xin_awa(124)).setMessage((CharSequence) yue_xin_awa(141)).setOnMenuItemClickListener(new OnMenuItemClickListener() { // from class: Yue.ۥ۠ۢ۠۠
            @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
            public final boolean onClick(Object obj, CharSequence charSequence, int i) {
                return this.f1160.m14832((MessageMenu) obj, charSequence, i);
            }
        });
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m14844(final int i) {
        String strYue_xin_awa;
        final JSONObject jSONObject = (JSONObject) C4093.m11560(this.f1176[i]);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            String strYue_xin_awa2 = yue_xin_awa(124);
            StringBuilder sb = new StringBuilder();
            sb.append(yue_xin_awa(142));
            sb.append(i == 4 ? yue_xin_awa(143) : yue_xin_awa(144));
            sb.append(yue_xin_awa(145));
            InputDialog cancelable = new InputDialog(strYue_xin_awa2, sb.toString(), yue_xin_awa(146), yue_xin_awa(147)).setCancelable(true);
            if (jSONObject.isNull(yue_xin_awa(111))) {
                strYue_xin_awa = yue_xin_awa(77);
            } else {
                strYue_xin_awa = jSONObject.getInt(yue_xin_awa(111)) + yue_xin_awa(77);
            }
            cancelable.setInputText(strYue_xin_awa).setOkButton(new OnInputDialogButtonClickListener() { // from class: Yue.ۥ۠ۢ۠۟
                @Override // com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view, String str) {
                    return this.f1158.m14833(i, jSONObject, (InputDialog) baseDialog, view, str);
                }
            }).setCancelButton(new OnInputDialogButtonClickListener() { // from class: Yue.ۥ۠ۢ۠ۤ
                @Override // com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view, String str) {
                    return this.f1166.m14834(i, jSONObject, (InputDialog) baseDialog, view, str);
                }
            }).show();
        } catch (Exception unused) {
            C6334.m19807(yue_xin_awa(135), 1);
        }
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final void m14845() {
        Context contextM6705 = C3270.m6705();
        RecyclerView recyclerView = new RecyclerView(contextM6705);
        recyclerView.setLayoutManager(new LinearLayoutManager(contextM6705, 1, false));
        final C4564 c4564 = new C4564();
        recyclerView.setAdapter(c4564);
        c4564.m11373(f10919);
        c4564.m11374(new AbstractC4021.InterfaceC0308() { // from class: Yue.ۥ۠ۢ۠ۨ
            @Override // Yue.AbstractC4021.InterfaceC0308
            /* JADX INFO: renamed from: ۥ */
            public final void mo239(Object obj, int i) {
                C4856.m14814((C4840) obj, i);
            }
        });
        BottomDialog.show(yue_xin_awa(124), new C0509(recyclerView)).setMessage(yue_xin_awa(151)).setOkButton(yue_xin_awa(152), new OnDialogButtonClickListener() { // from class: Yue.ۥ۠ۢۡ
            @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
            public final boolean onClick(BaseDialog baseDialog, View view) {
                return C4856.m14815(c4564, (BottomDialog) baseDialog, view);
            }
        }).setAllowInterceptTouch(false);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final void m14846() {
        MessageMenu.show(yue_xin_awa(129), yue_xin_awa(130)).setTitle((CharSequence) yue_xin_awa(124)).setMessage((CharSequence) yue_xin_awa(131)).setOnMenuItemClickListener(new OnMenuItemClickListener() { // from class: Yue.ۥ۠ۢ۠ۧ
            @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
            public final boolean onClick(Object obj, CharSequence charSequence, int i) {
                return this.f1170.m14835((MessageMenu) obj, charSequence, i);
            }
        });
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public final void m14847() {
        final String strYue_xin_awa = yue_xin_awa(76);
        final JSONObject jSONObject = (JSONObject) C4093.m11560(strYue_xin_awa);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            new InputDialog(yue_xin_awa(124), yue_xin_awa(132)).setInputText(jSONObject.isNull(yue_xin_awa(80)) ? yue_xin_awa(77) : jSONObject.getString(yue_xin_awa(80))).setOkButton(yue_xin_awa(133), new OnDialogButtonClickListener() { // from class: Yue.ۥ۠ۢ۠ۢ
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C4856.m14817(strYue_xin_awa, jSONObject, (MessageDialog) baseDialog, view);
                }
            }).setCancelButton(yue_xin_awa(134), new OnDialogButtonClickListener() { // from class: Yue.ۥۣ۠ۢ۠
                @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
                public final boolean onClick(BaseDialog baseDialog, View view) {
                    return C4856.m14818(strYue_xin_awa, jSONObject, (MessageDialog) baseDialog, view);
                }
            }).show();
        } catch (Exception unused) {
            C6334.m19807(yue_xin_awa(135), 1);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public final void m14848() {
        if (f1175 < 10) {
            C6334.m19811(yue_xin_awa(163));
            if (C7073.m22044()) {
                C6334.m19811(yue_xin_awa(164));
                f1175++;
                return;
            }
            return;
        }
        C6334.m19811(yue_xin_awa(161) + f1175 + yue_xin_awa(162));
        f1175 = 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final boolean m14849(Object obj) {
        if (!C4093.m11556(yue_xin_awa(30))) {
            return false;
        }
        try {
            int iIntValue = ((Integer) new C4805().m14538(obj).m14540(Integer.TYPE).m1709(yue_xin_awa(25))).intValue();
            if (iIntValue == 0 || iIntValue == 4) {
                m14839(obj, yue_xin_awa(31));
                return true;
            }
        } catch (Throwable th) {
            m14839(obj, yue_xin_awa(32)).m14783(th.getMessage());
        }
        return false;
    }
}
