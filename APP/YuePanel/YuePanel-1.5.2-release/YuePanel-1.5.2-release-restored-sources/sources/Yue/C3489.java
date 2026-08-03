package Yue;

import android.view.View;
import android.widget.Switch;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3489 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ Switch f327;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f328;

    static {
        NativeUtil.classesInit0(771);
    }

    public /* synthetic */ C3489(Switch r1, String str) {
        this.f327 = r1;
        this.f328 = str;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
