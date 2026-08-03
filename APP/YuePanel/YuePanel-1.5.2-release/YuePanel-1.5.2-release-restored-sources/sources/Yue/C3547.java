package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.bookmark.VideoMarkData;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3547 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C3549 f373;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ VideoMarkData f374;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ int f6047;

    static {
        NativeUtil.classesInit0(871);
    }

    public /* synthetic */ C3547(C3549 c3549, VideoMarkData videoMarkData, int i) {
        this.f373 = c3549;
        this.f374 = videoMarkData;
        this.f6047 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
