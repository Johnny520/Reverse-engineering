package Yue;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2597R;
import com.yuexin.panel.myClass.itemInfo;
import de.robv.android.xposed.XC_MethodHook;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۡۨۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7402 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static volatile /* synthetic */ String f2849;

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile /* synthetic */ String f2850;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22345;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22346;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22347;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22348;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22349;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22350;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f22351;

    /* JADX INFO: renamed from: Yue.ۥۡۨۥۥ$ۥ */
    public class C1250 extends XC_MethodHook {
        public C1250() {
        }

        public void afterHookedMethod(final XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.afterHookedMethod(methodHookParam);
            C7139.m3427(C3270.m6705());
            new Thread(new Runnable() { // from class: Yue.ۥۡۨۥۢ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22341.m23173(methodHookParam);
                }
            }).start();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ void m23172(LinearLayout linearLayout) {
            View viewInflate = LayoutInflater.from(C3270.m6705()).inflate(C2597R.C9031.f30739, (ViewGroup) linearLayout, false);
            linearLayout.addView(viewInflate, 0);
            viewInflate.setOnClickListener(new View.OnClickListener() { // from class: Yue.ۥۡۨۥۤ
                static {
                    NativeUtil.classesInit0(1048);
                }

                @Override // android.view.View.OnClickListener
                public final native void onClick(View view);
            });
            C7402.m23165(C7402.this, viewInflate);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m23173(XC_MethodHook.MethodHookParam methodHookParam) {
            int i = 0;
            while (true) {
                try {
                    C7477.m3677(100L);
                    List<View> listM27916 = C8369.m27916((View) methodHookParam.thisObject);
                    if (listM27916.size() >= 2) {
                        final LinearLayout linearLayout = (LinearLayout) listM27916.get(1);
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Yue.ۥۡۨۥۣ
                            static {
                                NativeUtil.classesInit0(1047);
                            }

                            @Override // java.lang.Runnable
                            public final native void run();
                        });
                        return;
                    } else if (i >= C4116.f8228) {
                        return;
                    } else {
                        i++;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    static {
        NativeUtil.classesInit0(1050);
    }

    private static native /* synthetic */ String yue_xin_awa(int i);

    /* JADX INFO: renamed from: ۥ */
    public static native /* synthetic */ boolean m3601(Map map, StringBuilder sb, View view);

    /* JADX INFO: renamed from: ۥ۟ */
    public static native /* synthetic */ boolean m3602(StringBuilder sb, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m23165(C7402 c7402, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m23166(StringBuilder sb, MessageDialog messageDialog, View view);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m23167(Map map, StringBuilder sb, View view);

    @Override // Yue.AbstractC5391
    public native itemInfo info();

    @Override // Yue.AbstractC5391
    public native void load(C3828 c3828, ClassLoader classLoader);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m23168(View view);
}
