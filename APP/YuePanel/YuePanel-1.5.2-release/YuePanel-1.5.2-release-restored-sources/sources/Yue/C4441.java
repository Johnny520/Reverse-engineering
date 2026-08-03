package Yue;

import android.view.View;
import android.widget.CheckBox;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4441 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ CheckBox f897;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ CheckBox f898;

    static {
        NativeUtil.classesInit0(74);
    }

    public /* synthetic */ C4441(CheckBox checkBox, CheckBox checkBox2) {
        this.f897 = checkBox;
        this.f898 = checkBox2;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
