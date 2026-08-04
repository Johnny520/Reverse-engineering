package yyds;

import android.content.DialogInterface;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛶᛴᛷᛴ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnDismissListenerC1319 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f6067;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2266 f6068;

    static {
        NativeUtil.classesInit0(162);
    }

    public /* synthetic */ DialogInterfaceOnDismissListenerC1319(int i, InterfaceC2266 interfaceC2266) {
        this.f6067 = i;
        this.f6068 = interfaceC2266;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final native void onDismiss(DialogInterface dialogInterface);
}
