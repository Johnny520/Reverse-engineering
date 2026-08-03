package Yue;

import Yue.C6517;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.panel.voice.items.base.MainItems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3201 extends MainItems {

    /* JADX INFO: renamed from: ۥ */
    public static HashMap<String, List> f125;

    /* JADX INFO: renamed from: ۥ۟ */
    public static String f126;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4836;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4837;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4838;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4839;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4840;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4841;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4842;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4843;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4844;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4845;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4846;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4847;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4848;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4849;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f4850;

    /* JADX INFO: renamed from: Yue.ۥ۟۠ۤۡ$ۥ */
    public class C0077 implements C6517.InterfaceC6521 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4851;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4852;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4853;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4854;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4855;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static volatile /* synthetic */ String f4856;

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ String f127;

        static {
            NativeUtil.classesInit0(43);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C0077(String str) {
            this.f127 = str;
        }

        private static native /* synthetic */ String yue_xin_awa(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m6556(String str, String str2);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static native /* synthetic */ void m6557(String str, String str2);

        @Override // Yue.C6517.InterfaceC6521
        /* JADX INFO: renamed from: ۥ */
        public native void mo273(int i);

        @Override // Yue.C6517.InterfaceC6521
        /* JADX INFO: renamed from: ۥ۟ */
        public native void mo274(String str);

        @Override // Yue.C6517.InterfaceC6521
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public native void mo6558(String str);
    }

    static {
        NativeUtil.classesInit0(867);
        f125 = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(8);
        f125.put(yue_xin_awa(14), arrayList);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m271(C3201 c3201, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m272(String str);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6551(EditText editText, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6552(String str);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m6553(EditText editText, View view);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native View buildView(Context context, int i, String str);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native HashMap<String, List> getInitMap();

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onBuild(View view, Context context, LinearLayout linearLayout);

    @Override // com.yuexin.panel.panel.voice.items.base.MainItems
    public native void onNextItem(Context context, LinearLayout linearLayout);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m6554(View view, Context context);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native /* synthetic */ void m6555(View view);
}
