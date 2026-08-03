package Yue;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.panel.voice.items.base.MainItems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣۣۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8129 extends MainItems {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3232 = 520;

    /* JADX INFO: renamed from: ۥ۟ */
    public static LinearLayout f3233;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final HashMap<String, List> f24066;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24067;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24068;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24069;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24070;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24071;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24072;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24073;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24074;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24075;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24076;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24077;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24078;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24079;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24080;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24081;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24082;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24083;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24084;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24085;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24086;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24087;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24088;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24089;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24090;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24091;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24092;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24093;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24094;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24095;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24096;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24097;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24098;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24099;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24100;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24101;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24102;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24103;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24104;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24105;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24106;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24107;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24108;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24109;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24110;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24111;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24112;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24113;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24114;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24115;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f24116;

    static {
        NativeUtil.classesInit0(936);
        HashMap<String, List> map = new HashMap<>();
        f24066 = map;
        ArrayList arrayList = new ArrayList();
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        map.put(yue_xin_awa(49), arrayList);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m4151(C8131 c8131, C8132 c8132, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m4152(List list, C8131 c8131, String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m26723(C8129 c8129, List list, String str, Activity activity, List list2);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m26724(C8131 c8131, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m26725(C8129 c8129, Button button, C8131 c8131, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m26726(Activity activity, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m26727(C8129 c8129, List list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m26728(C8129 c8129, C8131 c8131, Button button, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m26729(CheckBox checkBox, TextView textView);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m26730(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m26731(C8131 c8131, C8132 c8132, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m26732(C8131 c8131, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m26733(Activity activity, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m26734(View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m26735(CheckBox checkBox, TextView textView);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m26736(List list, C8131 c8131, String str);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native View buildView(Context context, int i, String str);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native HashMap<String, List> getInitMap();

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onActivityResult(Intent intent, List<Uri> list, boolean z);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onBuild(View view, Context context, LinearLayout linearLayout);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onNextItem(Context context, LinearLayout linearLayout);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final native void m26737(List<C8132> list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final native /* synthetic */ boolean m26738(C8131 c8131, Button button, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final native /* synthetic */ void m26739(Button button, C8131 c8131, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final native /* synthetic */ void m26740(List list);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final native /* synthetic */ void m26741(List list, String str, Activity activity, List list2);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final native void m26742(C8131 c8131);
}
