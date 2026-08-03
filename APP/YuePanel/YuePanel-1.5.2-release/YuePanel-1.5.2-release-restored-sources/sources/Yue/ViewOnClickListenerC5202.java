package Yue;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5202 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Context f12309;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ GridGestureConfig f12310;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f12311;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12312;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f12313;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final /* synthetic */ int f12314;

    static {
        NativeUtil.classesInit0(886);
    }

    public /* synthetic */ ViewOnClickListenerC5202(Context context, GridGestureConfig gridGestureConfig, int i, int i2, LinearLayout linearLayout, int i3) {
        this.f12309 = context;
        this.f12310 = gridGestureConfig;
        this.f12311 = i;
        this.f12312 = i2;
        this.f12313 = linearLayout;
        this.f12314 = i3;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
