package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnMenuButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۢۤۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8241 implements OnMenuButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C6320 f3354;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ C4464 f3355;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ int f24547;

    static {
        NativeUtil.classesInit0(275);
    }

    public /* synthetic */ C8241(C6320 c6320, C4464 c4464, int i) {
        this.f3354 = c6320;
        this.f3355 = c4464;
        this.f24547 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
