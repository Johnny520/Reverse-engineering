package Yue;

import android.view.View;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkList;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC3563 implements View.OnLongClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ VideoMarkList f6085;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ TextView f6086;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ C3549 f6087;

    static {
        NativeUtil.classesInit0(440);
    }

    public /* synthetic */ ViewOnLongClickListenerC3563(VideoMarkList videoMarkList, TextView textView, C3549 c3549) {
        this.f6085 = videoMarkList;
        this.f6086 = textView;
        this.f6087 = c3549;
    }

    @Override // android.view.View.OnLongClickListener
    public final native boolean onLongClick(View view);
}
