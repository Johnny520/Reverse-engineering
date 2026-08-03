package Yue;

import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7525 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ List f2927;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ int f2928;

    static {
        NativeUtil.classesInit0(10);
    }

    public /* synthetic */ C7525(List list, int i) {
        this.f2927 = list;
        this.f2928 = i;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
