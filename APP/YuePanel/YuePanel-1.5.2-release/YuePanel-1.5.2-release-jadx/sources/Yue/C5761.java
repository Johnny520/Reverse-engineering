package Yue;

import android.view.View;
import android.widget.TextView;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5761 implements OnInputDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ String f1665;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ TextView f1666;

    static {
        NativeUtil.classesInit0(C6699.f17250);
    }

    public /* synthetic */ C5761(String str, TextView textView) {
        this.f1665 = str;
        this.f1666 = textView;
    }

    @Override // com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view, String str);
}
