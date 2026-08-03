package Yue;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.LinDuo.LinMainItems;
import com.yuexin.panel.panel.voice.items.base.MainItems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۧۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7251 extends MainItems {

    /* JADX INFO: renamed from: ۥ */
    public static HashMap<String, List> f2768;

    /* JADX INFO: renamed from: ۥ۟ */
    public static C7255 f2769;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21906;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21907;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21908;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21909;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21910;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21911;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21912;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21913;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21914;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21915;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21916;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21917;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21918;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21919;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21920;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21921;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21922;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21923;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21924;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f21925;

    static {
        NativeUtil.classesInit0(592);
        f2768 = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(8);
        arrayList.add(8);
        f2768.put(yue_xin_awa(19), arrayList);
        C7255 c7255 = C4118.f8240;
        if (c7255 != null) {
            f2769 = c7255;
        }
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3533(LinMainItems linMainItems);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m3534(LinMainItems linMainItems, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m22712(List list);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m22713(BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m22714(List list);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m22715(LinMainItems linMainItems);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m22716(LinMainItems linMainItems, int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    private static native /* synthetic */ boolean m22717(BottomMenu bottomMenu, CharSequence charSequence, int i);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native View buildView(Context context, int i, String str);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native HashMap<String, List> getInitMap();

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onBuild(View view, Context context, LinearLayout linearLayout);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onLast(Context context, LinearLayout linearLayout, String str);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onMore(Context context, LinearLayout linearLayout, String str);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onNextItem(Context context, LinearLayout linearLayout);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onSearch(String str, Context context, LinearLayout linearLayout);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public native void m22718(LinearLayout linearLayout, Context context);
}
