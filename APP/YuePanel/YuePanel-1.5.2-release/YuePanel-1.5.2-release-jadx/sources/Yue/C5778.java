package Yue;

import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5778 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C5779 f1675;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String[] f1676;

    static {
        NativeUtil.classesInit0(1042);
    }

    public /* synthetic */ C5778(C5779 c5779, String[] strArr) {
        this.f1675 = c5779;
        this.f1676 = strArr;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
