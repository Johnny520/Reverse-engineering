package Yue;

import android.view.View;
import android.widget.Switch;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4306 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ Switch f807;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f808;

    static {
        NativeUtil.classesInit0(639);
    }

    public /* synthetic */ C4306(Switch r1, String str) {
        this.f807 = r1;
        this.f808 = str;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
