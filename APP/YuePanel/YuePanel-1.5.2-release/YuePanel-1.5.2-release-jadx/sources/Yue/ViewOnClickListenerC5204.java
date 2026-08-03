package Yue;

import Yue.C5208;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5204 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ AlertDialog f12321;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ Context f12322;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ GridGestureConfig f12323;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ C5208.InterfaceC5212 f12324;

    static {
        NativeUtil.classesInit0(890);
    }

    public /* synthetic */ ViewOnClickListenerC5204(AlertDialog alertDialog, Context context, GridGestureConfig gridGestureConfig, C5208.InterfaceC5212 interfaceC5212) {
        this.f12321 = alertDialog;
        this.f12322 = context;
        this.f12323 = gridGestureConfig;
        this.f12324 = interfaceC5212;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
