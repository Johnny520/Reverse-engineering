package Yue;

import Yue.C5208;
import android.app.AlertDialog;
import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5206 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ AlertDialog f12326;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ C5208.InterfaceC5212 f12327;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ GridGestureConfig f12328;

    static {
        NativeUtil.classesInit0(895);
    }

    public /* synthetic */ ViewOnClickListenerC5206(AlertDialog alertDialog, C5208.InterfaceC5212 interfaceC5212, GridGestureConfig gridGestureConfig) {
        this.f12326 = alertDialog;
        this.f12327 = interfaceC5212;
        this.f12328 = gridGestureConfig;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
