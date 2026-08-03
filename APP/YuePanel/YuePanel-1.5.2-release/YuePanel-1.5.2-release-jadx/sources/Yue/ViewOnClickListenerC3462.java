package Yue;

import android.view.View;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.panel.voice.audiobuild.AudioRecord;

/* JADX INFO: renamed from: Yue.ۥ۟ۢ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3462 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ C3463 f5607;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ View f5608;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f5609;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ AudioRecord f5610;

    static {
        NativeUtil.classesInit0(1057);
    }

    public /* synthetic */ ViewOnClickListenerC3462(C3463 c3463, View view, int i, AudioRecord audioRecord) {
        this.f5607 = c3463;
        this.f5608 = view;
        this.f5609 = i;
        this.f5610 = audioRecord;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
