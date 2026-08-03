package Yue;

import Yue.C8399;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.panel.voice.audiobuild.AudioRecord;
import com.yuexin.panel.panel.voice.items.base.MainItems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5291 extends MainItems {

    /* JADX INFO: renamed from: ۥ */
    public static HashMap<String, List> f1400;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f1401;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12597;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12598;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12599;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12600;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12601;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12602;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12603;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12604;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12605;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f12606;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۤۧ$ۥ */
    public class C0697 implements C8399.InterfaceC1518 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12607;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12608;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12609;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12610;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f12611;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Context f1402;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ LinearLayout f1403;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ C6326 f12612;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ String f12613;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ String f12614;

        static {
            NativeUtil.classesInit0(726);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0697(Context context, LinearLayout linearLayout, C6326 c6326, String str, String str2) {
            this.f1402 = context;
            this.f1403 = linearLayout;
            this.f12612 = c6326;
            this.f12613 = str;
            this.f12614 = str2;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        @Override // Yue.C8399.InterfaceC1518
        /* JADX INFO: renamed from: ۥ */
        public native void mo536(String str);

        @Override // Yue.C8399.InterfaceC1518
        /* JADX INFO: renamed from: ۥ۟ */
        public native void mo537(List<AudioRecord> list);
    }

    static {
        NativeUtil.classesInit0(241);
        f1400 = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(8);
        arrayList.add(8);
        f1400.put(yue_xin_awa(10), arrayList);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m2076(BottomMenu bottomMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m16258(BottomMenu bottomMenu, CharSequence charSequence, int i);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native View buildView(Context context, int i, String str);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native HashMap<String, List> getInitMap();

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onBuild(View view, Context context, LinearLayout linearLayout);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onMore(Context context, LinearLayout linearLayout, String str);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onNextItem(Context context, LinearLayout linearLayout);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onSearch(String str, Context context, LinearLayout linearLayout);

    /* JADX INFO: renamed from: ۥ۟ */
    public final native void m2077(LinearLayout linearLayout, Context context, String str);
}
