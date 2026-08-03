package Yue;

import android.app.AlertDialog;
import android.view.View;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5207 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ AlertDialog f12329;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f12330;

    static {
        NativeUtil.classesInit0(897);
    }

    public /* synthetic */ ViewOnClickListenerC5207(AlertDialog alertDialog, Runnable runnable) {
        this.f12329 = alertDialog;
        this.f12330 = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
