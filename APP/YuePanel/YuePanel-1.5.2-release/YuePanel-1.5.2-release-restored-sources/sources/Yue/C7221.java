package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7221 implements OnInputDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ String f2745;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f2746;

    static {
        NativeUtil.classesInit0(508);
    }

    public /* synthetic */ C7221(String str, String str2) {
        this.f2745 = str;
        this.f2746 = str2;
    }

    @Override // com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view, String str);
}
