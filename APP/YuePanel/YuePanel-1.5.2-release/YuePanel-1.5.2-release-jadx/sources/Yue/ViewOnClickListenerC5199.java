package Yue;

import android.app.AlertDialog;
import android.view.View;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5199 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ AlertDialog f12298;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f12299;

    static {
        NativeUtil.classesInit0(872);
    }

    public /* synthetic */ ViewOnClickListenerC5199(AlertDialog alertDialog, Runnable runnable) {
        this.f12298 = alertDialog;
        this.f12299 = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
