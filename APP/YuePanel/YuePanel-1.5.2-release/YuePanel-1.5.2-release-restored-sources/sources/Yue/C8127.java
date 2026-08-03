package Yue;

import android.view.View;
import android.widget.Button;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8127 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C8129 f3230;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ C8131 f3231;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ Button f24060;

    static {
        NativeUtil.classesInit0(898);
    }

    public /* synthetic */ C8127(C8129 c8129, C8131 c8131, Button button) {
        this.f3230 = c8129;
        this.f3231 = c8131;
        this.f24060 = button;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
