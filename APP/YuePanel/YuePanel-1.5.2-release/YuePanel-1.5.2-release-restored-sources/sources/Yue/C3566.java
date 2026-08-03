package Yue;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.BottomDialog;
import com.kongzue.dialogx.dialogs.BottomMenu;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.kongzue.dialogx.interfaces.OnBindView;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkData;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3566 {

    /* JADX INFO: renamed from: ۥ */
    public static final C8218 f387;

    /* JADX INFO: renamed from: ۥ۟ */
    public static TextView f388;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static String f6090;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6091;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6092;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6093;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6094;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6095;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6096;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6097;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6098;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6099;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6100;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6101;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6102;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6103;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6104;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6105;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6106;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6107;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6108;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6109;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6110;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6111;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6112;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6113;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6114;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6115;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6116;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6117;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6118;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6119;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6120;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f6121;

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠$ۥ */
    public class C0178 extends OnBindView<BottomDialog> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ View f389;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ C3549 f390;

        static {
            NativeUtil.classesInit0(371);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0178(View view, View view2, C3549 c3549) {
            super(view);
            this.f389 = view2;
            this.f390 = c3549;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, android.view.View] */
        @Override // com.kongzue.dialogx.interfaces.OnBindView
        public native /* bridge */ /* synthetic */ void onBind(BottomDialog bottomDialog, View view);

        /* JADX INFO: renamed from: ۥ */
        public native void m622(BottomDialog bottomDialog, View view);
    }

    static {
        NativeUtil.classesInit0(649);
        C8218 c8218M27187 = C8218.m27187();
        f387 = c8218M27187;
        c8218M27187.m27205();
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ void m620(C3549 c3549, VideoMarkData videoMarkData, int i);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ void m621(C3549 c3549, List list);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9524(C3549 c3549, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9525(VideoMarkList videoMarkList, TextView textView, C3549 c3549, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m9526(TextView textView, Context context, C3549 c3549, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9527(VideoMarkList videoMarkList, TextView textView, C3549 c3549, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m9528(View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9529(VideoMarkList videoMarkList, TextView textView, InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9530(EditText editText, C3549 c3549, TextView textView, int i, KeyEvent keyEvent);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9531(VideoMarkList videoMarkList, TextView textView, C3549 c3549, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9532(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m9533(C3549 c3549, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m9534(String str, String str2, C3549 c3549);

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static native /* synthetic */ void m9535(TextView textView, Context context, VideoMarkList videoMarkList, C3549 c3549, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m9536(LinearLayout linearLayout, C3549 c3549);

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static native void m9537(LinearLayout linearLayout, C3549 c3549);

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9538(VideoMarkList videoMarkList, TextView textView, C3549 c3549, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9539(VideoMarkList videoMarkList, TextView textView, C3549 c3549, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m9540(TextView textView, Context context, C3549 c3549, View view);

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m9541(TextView textView, Context context, VideoMarkList videoMarkList, C3549 c3549, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9542(VideoMarkList videoMarkList, TextView textView, C3549 c3549, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9543(VideoMarkList videoMarkList, TextView textView, InputDialog inputDialog, View view, String str);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static native /* synthetic */ void m9544(C3549 c3549, List list);

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static native /* synthetic */ void m9545(String str, String str2, C3549 c3549);

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9546(String[] strArr, BottomMenu bottomMenu, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m9547(View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9548(C3549 c3549, MessageMenu messageMenu, CharSequence charSequence, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static native /* synthetic */ void m9549(C3549 c3549, View view);

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m9550(C3549 c3549, VideoMarkData videoMarkData, int i);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m9551(EditText editText, C3549 c3549, TextView textView, int i, KeyEvent keyEvent);

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static native void m9552(String str, String str2);

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static native void m9553(HashMap<String, VideoMarkList> map, String str);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static native void m9554(String str, String str2, C3549 c3549);

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static native void m9555(TextView textView, Context context);

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static native void m9556(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static native void m9557(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static native void m9558();
}
