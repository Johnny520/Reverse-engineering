package Yue;

import Yue.C8399;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.panel.voice.audiobuild.AudioRecord;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3463 extends RecyclerView.AbstractC8909<C0144> {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5611;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5612;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5613;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5614;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f5615;

    /* JADX INFO: renamed from: ۥ */
    public final Context f298;

    /* JADX INFO: renamed from: ۥ۟ */
    public final List<AudioRecord> f299;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String f5616;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f5617 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f5618 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final HashMap<Integer, AudioRecord> f5619 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public String f5620;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۡ$ۥ */
    public class C0143 implements C8399.InterfaceC1518 {

        /* JADX INFO: renamed from: ۥ۟ */
        public static volatile /* synthetic */ String f300;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5621;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5622;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5623;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f5624;

        static {
            NativeUtil.classesInit0(714);
        }

        public C0143() {
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        @Override // Yue.C8399.InterfaceC1518
        /* JADX INFO: renamed from: ۥ */
        public native void mo536(String str);

        @Override // Yue.C8399.InterfaceC1518
        /* JADX INFO: renamed from: ۥ۟ */
        public native void mo537(List<AudioRecord> list);
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۡ$ۥ۟ */
    public static class C0144 extends RecyclerView.AbstractC8938 {

        /* JADX INFO: renamed from: ۥ */
        public TextView f302;

        /* JADX INFO: renamed from: ۥ۟ */
        public TextView f303;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public TextView f5625;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public LinearLayout f5626;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Button f5627;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Button f5628;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Button f5629;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public ImageView f5630;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public LinearLayout f5631;

        public C0144(@InterfaceC6391 View view) {
            super(view);
            this.f302 = (TextView) view.findViewById(C2597R.C9030.f30518);
            this.f303 = (TextView) view.findViewById(C2597R.C9030.f30519);
            this.f5625 = (TextView) view.findViewById(C2597R.C9030.f30517);
            this.f5626 = (LinearLayout) view.findViewById(C2597R.C9030.f30515);
            this.f5629 = (Button) view.findViewById(C2597R.C9030.f30510);
            this.f5628 = (Button) view.findViewById(C2597R.C9030.f30509);
            this.f5630 = (ImageView) view.findViewById(C2597R.C9030.f30514);
            this.f5631 = (LinearLayout) view.findViewById(C2597R.C9030.f30511);
        }
    }

    static {
        NativeUtil.classesInit0(437);
    }

    public C3463(Context context, List<AudioRecord> list, String str, String str2) {
        this.f298 = context;
        this.f299 = list;
        this.f5616 = str;
        this.f5620 = str2;
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m535(String str, String str2, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m9218(String str, C0144 c0144, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m9219(C3463 c3463, View view, int i, AudioRecord audioRecord, View view2);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m9220(String str, String str2, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ List m9221(C3463 c3463);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9222(C3463 c3463, boolean z);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m9223(String str, C0144 c0144, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m9224(String str, String str2, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m9225(String str, String str2, View view);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public native int getItemCount();

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public native /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.AbstractC8938 abstractC8938, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    @InterfaceC6391
    public native /* bridge */ /* synthetic */ RecyclerView.AbstractC8938 onCreateViewHolder(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final native void m9226(Button button, Button button2, Button button3, String str, int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native void m9227();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final native /* synthetic */ void m9228(View view, int i, AudioRecord audioRecord, View view2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public native void m9229(C0144 c0144, int i);

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public native C0144 m9230(ViewGroup viewGroup, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final native void m9231(int i);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public native void m9232(List<AudioRecord> list, String str, String str2);
}
