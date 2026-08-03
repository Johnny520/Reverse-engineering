package Yue;

import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkData;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3546 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C3549 f6044;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ VideoMarkData f6045;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f6046;

    static {
        NativeUtil.classesInit0(876);
    }

    public /* synthetic */ ViewOnClickListenerC3546(C3549 c3549, VideoMarkData videoMarkData, int i) {
        this.f6044 = c3549;
        this.f6045 = videoMarkData;
        this.f6046 = i;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
