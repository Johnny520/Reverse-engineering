package yyds;

import android.content.DialogInterface;
import android.os.Handler;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛵᛵᛱ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC1088 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f5001;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C1417 f5002;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Handler f5003;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f5004;

    static {
        NativeUtil.classesInit0(47);
    }

    public /* synthetic */ DialogInterfaceOnDismissListenerC1088(C1417 c1417, C0947 c0947, C0947 c09472, Handler handler) {
        this.f5002 = c1417;
        this.f5004 = c0947;
        this.f5001 = c09472;
        this.f5003 = handler;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final native void onDismiss(DialogInterface dialogInterface);
}
