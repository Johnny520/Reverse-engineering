package Yue;

import android.view.View;
import android.widget.Switch;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۨۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7405 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ Switch f2853;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f2854;

    static {
        NativeUtil.classesInit0(1051);
    }

    public /* synthetic */ C7405(Switch r1, String str) {
        this.f2853 = r1;
        this.f2854 = str;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
