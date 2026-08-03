package Yue;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.panel.VoicePanel;
import com.yuexin.panel.panel.voice.items.base.MainItems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۨۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7391 extends MainItems {

    /* JADX INFO: renamed from: ۥ */
    public static HashMap<String, List> f2836;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2837;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22290;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22291;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22292;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22293;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22294;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22295;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22296;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22297;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22298;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22299;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22300;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22301;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22302;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22303;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22304;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22305;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22306;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22307;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22308;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22309;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22310;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22311;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22312;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22313;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22314;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22315;

    static {
        NativeUtil.classesInit0(986);
        f2836 = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        f2836.put(yue_xin_awa(4), arrayList);
        ArrayList arrayList2 = new ArrayList();
        if (C3270.m6702().equals(EnumC3367.f5340.m6900())) {
            arrayList2.add(new C1249(yue_xin_awa(5), true, yue_xin_awa(6), yue_xin_awa(7)));
        } else {
            arrayList2.add(new C1249(yue_xin_awa(8), true, yue_xin_awa(9), yue_xin_awa(7)));
        }
        arrayList2.add(new C1249(yue_xin_awa(10), false, yue_xin_awa(11), yue_xin_awa(12)));
        arrayList2.add(new C1249(yue_xin_awa(13), false, yue_xin_awa(14), yue_xin_awa(15)));
        arrayList2.add(new C1249(yue_xin_awa(16), false, yue_xin_awa(17), yue_xin_awa(18)));
        arrayList2.add(new C1249(yue_xin_awa(19), false, yue_xin_awa(20), yue_xin_awa(21), false, VoicePanel.class, yue_xin_awa(22)));
        arrayList2.add(new C1249(yue_xin_awa(23), false, yue_xin_awa(24), yue_xin_awa(25), true, VoicePanel.class, yue_xin_awa(26)));
        f2836.put(yue_xin_awa(1), arrayList2);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m3595(Class cls, String str, Switch r2, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m3596(String str, CompoundButton compoundButton, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m23148(String str, CompoundButton compoundButton, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m23149(Class cls, String str, Switch r2, View view);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native View buildView(Context context, int i, String str);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native HashMap<String, List> getInitMap();

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onBuild(View view, Context context, LinearLayout linearLayout);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onNextItem(Context context, LinearLayout linearLayout);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native void m23150(LinearLayout linearLayout, Context context);

    /* JADX INFO: renamed from: Yue.ۥۡۨۤۥ$ۥ */
    public static class C1249 {

        /* JADX INFO: renamed from: ۥ */
        public String f2838;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f2839;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f22316;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public String f22317;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Class<?> f22318;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f22319;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public String f22320;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public String f22321;

        static {
            NativeUtil.classesInit0(30);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1249(String str, boolean z, String str2, String str3) {
            this.f22316 = false;
            this.f22319 = false;
            this.f2838 = str;
            this.f2839 = z;
            this.f22320 = str2;
            this.f22321 = str3;
        }

        /* JADX INFO: renamed from: ۥ */
        public static native /* synthetic */ boolean m3597(C1249 c1249);

        /* JADX INFO: renamed from: ۥ۟ */
        public native Class<?> m3598();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public native String m23151();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public native String m23152();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public native String m23153();

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public native String m23154();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public native boolean m23155();

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public native boolean m23156();

        public C1249(String str, boolean z, String str2, String str3, boolean z2, Class<?> cls, String str4) {
            this.f22317 = str4;
            this.f22318 = cls;
            this.f2838 = str;
            this.f2839 = z;
            this.f22320 = str2;
            this.f22321 = str3;
            this.f22319 = z2;
            this.f22316 = true;
        }
    }
}
