package Yue;

import android.view.View;
import com.kongzue.dialogx.dialogs.MessageDialog;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6244 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ String f1944;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ MessageDialog f1945;

    static {
        NativeUtil.classesInit0(369);
    }

    public /* synthetic */ C6244(String str, MessageDialog messageDialog) {
        this.f1944 = str;
        this.f1945 = messageDialog;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
