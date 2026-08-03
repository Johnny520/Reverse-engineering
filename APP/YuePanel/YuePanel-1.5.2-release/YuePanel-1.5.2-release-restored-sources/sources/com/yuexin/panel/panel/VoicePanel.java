package com.yuexin.panel.panel;

import Yue.AbstractC5391;
import Yue.InterfaceC5615;
import android.view.View;
import android.widget.Switch;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.kongzue.dialogx.interfaces.OnMenuItemSelectListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.myClass.itemInfo;

/* JADX INFO: loaded from: classes2.dex */
public class VoicePanel extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f4201;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30801;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30802;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30803;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30804;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30805;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30806;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30807;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30808;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30809;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30810;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30811;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30812;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30813;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30814;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30815;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30816;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f30817;

    /* JADX INFO: renamed from: ۥ */
    public String f4202 = yue_xin_awa(0);

    /* JADX INFO: renamed from: com.yuexin.panel.panel.VoicePanel$ۥ */
    public class C2599 implements OnMenuButtonClickListener<BottomMenu> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ String[] f4203;

        static {
            NativeUtil.classesInit0(31);
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public C2599(String[] strArr) {
            this.f4203 = strArr;
        }

        @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
        public native /* bridge */ /* synthetic */ boolean onClick(BaseDialog baseDialog, View view);

        /* JADX INFO: renamed from: ۥ */
        public native boolean m5103(BottomMenu bottomMenu, View view);
    }

    /* JADX INFO: renamed from: com.yuexin.panel.panel.VoicePanel$ۥ۟ */
    public class C2600 implements OnMenuButtonClickListener<BottomMenu> {
        static {
            NativeUtil.classesInit0(691);
        }

        public C2600() {
        }

        @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
        public native /* bridge */ /* synthetic */ boolean onClick(BaseDialog baseDialog, View view);

        /* JADX INFO: renamed from: ۥ */
        public native boolean m5104(BottomMenu bottomMenu, View view);
    }

    /* JADX INFO: renamed from: com.yuexin.panel.panel.VoicePanel$ۥ۟۟, reason: contains not printable characters */
    public class C9035 extends OnMenuItemSelectListener<BottomMenu> {
        static {
            NativeUtil.classesInit0(809);
        }

        public C9035() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.CharSequence[], int[]] */
        @Override // com.kongzue.dialogx.interfaces.OnMenuItemSelectListener
        public native /* bridge */ /* synthetic */ void onMultiItemSelect(BottomMenu bottomMenu, CharSequence[] charSequenceArr, int[] iArr);

        /* JADX INFO: renamed from: ۥ */
        public native void m5105(BottomMenu bottomMenu, CharSequence[] charSequenceArr, int[] iArr);
    }

    static {
        NativeUtil.classesInit0(28);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m5101(Switch r0, InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m5102(Switch r0, InputDialog inputDialog, View view, String str);

    @InterfaceC5615
    public native void configLeftMenu(Switch r1);

    @InterfaceC5615
    public native void diyVoiceTime(Switch r1);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void onClick();
}
