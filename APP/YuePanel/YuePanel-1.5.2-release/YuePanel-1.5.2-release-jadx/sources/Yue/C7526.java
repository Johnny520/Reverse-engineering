package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.utils.entity.GroupBean;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7526 implements OnInputDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ GroupBean f2929;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ int f2930;

    static {
        NativeUtil.classesInit0(11);
    }

    public /* synthetic */ C7526(GroupBean groupBean, int i) {
        this.f2929 = groupBean;
        this.f2930 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view, String str);
}
