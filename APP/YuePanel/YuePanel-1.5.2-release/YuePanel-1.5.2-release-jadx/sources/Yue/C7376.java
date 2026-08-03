package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۣۣۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7376 implements OnMenuButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C7377 f2827;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String[] f2828;

    static {
        NativeUtil.classesInit0(1001);
    }

    public /* synthetic */ C7376(C7377 c7377, String[] strArr) {
        this.f2827 = c7377;
        this.f2828 = strArr;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
