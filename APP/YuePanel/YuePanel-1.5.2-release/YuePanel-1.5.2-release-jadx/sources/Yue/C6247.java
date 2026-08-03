package Yue;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;
import com.yuexin.panel.C2604;

/* JADX INFO: renamed from: Yue.ۥۣۡۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6247 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C2604.C9038 f1946;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Context f1947;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout.LayoutParams f15436;

    static {
        NativeUtil.classesInit0(374);
    }

    public /* synthetic */ C6247(C2604.C9038 c9038, Context context, LinearLayout.LayoutParams layoutParams) {
        this.f1946 = c9038;
        this.f1947 = context;
        this.f15436 = layoutParams;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
