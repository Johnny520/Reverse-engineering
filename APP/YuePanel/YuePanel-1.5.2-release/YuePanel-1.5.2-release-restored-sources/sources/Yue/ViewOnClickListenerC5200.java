package Yue;

import Yue.C5208;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Spinner;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5200 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ GridGestureConfig.C2603 f12300;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ C5208.C5213 f12301;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ Spinner f12302;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ Spinner f12303;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ AlertDialog f12304;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f12305;

    static {
        NativeUtil.classesInit0(987);
    }

    public /* synthetic */ ViewOnClickListenerC5200(GridGestureConfig.C2603 c2603, C5208.C5213 c5213, Spinner spinner, Spinner spinner2, AlertDialog alertDialog, Runnable runnable) {
        this.f12300 = c2603;
        this.f12301 = c5213;
        this.f12302 = spinner;
        this.f12303 = spinner2;
        this.f12304 = alertDialog;
        this.f12305 = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
