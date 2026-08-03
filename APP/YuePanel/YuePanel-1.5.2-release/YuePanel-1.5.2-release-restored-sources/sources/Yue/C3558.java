package Yue;

import android.view.View;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkList;

/* JADX INFO: renamed from: Yue.ۥۣ۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3558 implements OnInputDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ VideoMarkList f382;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ TextView f383;

    static {
        NativeUtil.classesInit0(446);
    }

    public /* synthetic */ C3558(VideoMarkList videoMarkList, TextView textView) {
        this.f382 = videoMarkList;
        this.f383 = textView;
    }

    @Override // com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view, String str);
}
