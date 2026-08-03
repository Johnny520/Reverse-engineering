package Yue;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GridGestureConfig;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC5203 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ GridGestureConfig f12315;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ int f12316;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f12317;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ Context f12318;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f12319;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final /* synthetic */ int f12320;

    static {
        NativeUtil.classesInit0(888);
    }

    public /* synthetic */ ViewOnLongClickListenerC5203(GridGestureConfig gridGestureConfig, int i, int i2, Context context, LinearLayout linearLayout, int i3) {
        this.f12315 = gridGestureConfig;
        this.f12316 = i;
        this.f12317 = i2;
        this.f12318 = context;
        this.f12319 = linearLayout;
        this.f12320 = i3;
    }

    @Override // android.view.View.OnLongClickListener
    public final native boolean onLongClick(View view);
}
