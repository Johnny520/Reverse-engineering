package Yue;

import android.widget.CompoundButton;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkList;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3550 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C3551 f376;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ VideoMarkList f377;

    static {
        NativeUtil.classesInit0(863);
    }

    public /* synthetic */ C3550(C3551 c3551, VideoMarkList videoMarkList) {
        this.f376 = c3551;
        this.f377 = videoMarkList;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final native void onCheckedChanged(CompoundButton compoundButton, boolean z);
}
