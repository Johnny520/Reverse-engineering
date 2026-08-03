package Yue;

import android.view.View;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkList;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3557 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ VideoMarkList f380;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ TextView f381;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ C3549 f6073;

    static {
        NativeUtil.classesInit0(447);
    }

    public /* synthetic */ C3557(VideoMarkList videoMarkList, TextView textView, C3549 c3549) {
        this.f380 = videoMarkList;
        this.f381 = textView;
        this.f6073 = c3549;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
