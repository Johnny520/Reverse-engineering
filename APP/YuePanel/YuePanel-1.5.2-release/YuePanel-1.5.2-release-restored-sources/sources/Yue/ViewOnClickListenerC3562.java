package Yue;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkList;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3562 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ TextView f6081;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ Context f6082;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ VideoMarkList f6083;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final /* synthetic */ C3549 f6084;

    static {
        NativeUtil.classesInit0(442);
    }

    public /* synthetic */ ViewOnClickListenerC3562(TextView textView, Context context, VideoMarkList videoMarkList, C3549 c3549) {
        this.f6081 = textView;
        this.f6082 = context;
        this.f6083 = videoMarkList;
        this.f6084 = c3549;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
