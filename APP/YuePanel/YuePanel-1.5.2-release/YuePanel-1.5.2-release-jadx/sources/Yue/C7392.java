package Yue;

import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥۡۨۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7392 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C7396 f2840;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String[] f2841;

    static {
        NativeUtil.classesInit0(989);
    }

    public /* synthetic */ C7392(C7396 c7396, String[] strArr) {
        this.f2840 = c7396;
        this.f2841 = strArr;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
