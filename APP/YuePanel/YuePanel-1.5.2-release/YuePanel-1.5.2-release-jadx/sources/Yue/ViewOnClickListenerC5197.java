package Yue;

import android.app.AlertDialog;
import android.view.View;
import android.widget.Spinner;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5197 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Spinner f12293;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ Spinner f12294;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ GridGestureConfig f12295;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ AlertDialog f12296;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f12297;

    static {
        NativeUtil.classesInit0(866);
    }

    public /* synthetic */ ViewOnClickListenerC5197(Spinner spinner, Spinner spinner2, GridGestureConfig gridGestureConfig, AlertDialog alertDialog, Runnable runnable) {
        this.f12293 = spinner;
        this.f12294 = spinner2;
        this.f12295 = gridGestureConfig;
        this.f12296 = alertDialog;
        this.f12297 = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
