package Yue;

import android.view.View;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnDialogButtonClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۟ۥ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3865 implements OnDialogButtonClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ String f552;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f553;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ int f7362;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ String f7363;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ long f7364;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ int f7365;

    static {
        NativeUtil.classesInit0(62);
    }

    public /* synthetic */ C3865(String str, String str2, int i, String str3, long j, int i2) {
        this.f552 = str;
        this.f553 = str2;
        this.f7362 = i;
        this.f7363 = str3;
        this.f7364 = j;
        this.f7365 = i2;
    }

    @Override // com.kongzue.dialogx.interfaces.OnDialogButtonClickListener
    public final native boolean onClick(BaseDialog baseDialog, View view);
}
