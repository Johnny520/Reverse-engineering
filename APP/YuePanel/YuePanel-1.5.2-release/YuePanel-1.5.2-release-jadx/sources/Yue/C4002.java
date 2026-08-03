package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۟ۦ۟ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4002 implements OnMenuButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f617;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String[] f618;

    static {
        NativeUtil.classesInit0(629);
    }

    public /* synthetic */ C4002(int i, String[] strArr) {
        this.f617 = i;
        this.f618 = strArr;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
