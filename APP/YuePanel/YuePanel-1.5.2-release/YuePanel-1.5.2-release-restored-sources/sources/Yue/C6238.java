package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۡۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6238 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ boolean f1937;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f1938;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ String f15418;

    static {
        NativeUtil.classesInit0(390);
    }

    public /* synthetic */ C6238(boolean z, String str, String str2) {
        this.f1937 = z;
        this.f1938 = str;
        this.f15418 = str2;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
