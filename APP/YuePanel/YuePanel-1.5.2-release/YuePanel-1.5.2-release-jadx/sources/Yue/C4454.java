package Yue;

import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4454 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ String[] f904;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ float[] f905;

    static {
        NativeUtil.classesInit0(136);
    }

    public /* synthetic */ C4454(String[] strArr, float[] fArr) {
        this.f904 = strArr;
        this.f905 = fArr;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
