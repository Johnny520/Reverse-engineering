package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۢۤۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8245 implements OnMenuButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f3359;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String[] f3360;

    static {
        NativeUtil.classesInit0(341);
    }

    public /* synthetic */ C8245(int i, String[] strArr) {
        this.f3359 = i;
        this.f3360 = strArr;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
