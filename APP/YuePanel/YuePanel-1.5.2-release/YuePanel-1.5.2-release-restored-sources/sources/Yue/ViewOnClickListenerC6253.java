package Yue;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2604;

/* JADX INFO: renamed from: Yue.ۥۣۡۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6253 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C2604.C9038 f15438;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ Context f15439;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout.LayoutParams f15440;

    static {
        NativeUtil.classesInit0(698);
    }

    public /* synthetic */ ViewOnClickListenerC6253(C2604.C9038 c9038, Context context, LinearLayout.LayoutParams layoutParams) {
        this.f15438 = c9038;
        this.f15439 = context;
        this.f15440 = layoutParams;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
