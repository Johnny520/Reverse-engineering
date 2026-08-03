package Yue;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC3515 extends Dialog {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final float f5927 = 0.7f;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f5928 = -2;

    static {
        NativeUtil.classesInit0(821);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractDialogC3515(@InterfaceC6391 Context context) {
        super(context);
        m580();
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract View mo579();

    /* JADX INFO: renamed from: ۥ۟ */
    public final native void m580();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public native void m9410(Integer num, Integer num2);

    public AbstractDialogC3515(@InterfaceC6391 Context context, int i) {
        super(context, i);
        m580();
    }

    public AbstractDialogC3515(@InterfaceC6391 Context context, boolean z, @InterfaceC6490 DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        m580();
    }
}
