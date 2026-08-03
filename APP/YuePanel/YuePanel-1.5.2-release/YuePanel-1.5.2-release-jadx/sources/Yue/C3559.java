package Yue;

import android.widget.TextView;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkList;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3559 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ VideoMarkList f384;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ TextView f385;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ C3549 f6074;

    static {
        NativeUtil.classesInit0(445);
    }

    public /* synthetic */ C3559(VideoMarkList videoMarkList, TextView textView, C3549 c3549) {
        this.f384 = videoMarkList;
        this.f385 = textView;
        this.f6074 = c3549;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
