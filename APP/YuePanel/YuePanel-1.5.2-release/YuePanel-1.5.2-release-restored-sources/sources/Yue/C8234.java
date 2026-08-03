package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۢۤۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8234 implements OnMenuButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f3344;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String[] f3345;

    static {
        NativeUtil.classesInit0(259);
    }

    public /* synthetic */ C8234(int i, String[] strArr) {
        this.f3344 = i;
        this.f3345 = strArr;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
