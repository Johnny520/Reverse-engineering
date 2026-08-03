package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۡۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6239 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ boolean f1939;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f1940;

    static {
        NativeUtil.classesInit0(394);
    }

    public /* synthetic */ C6239(boolean z, String str) {
        this.f1939 = z;
        this.f1940 = str;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
