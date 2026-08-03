package Yue;

import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۤۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8240 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ List f3352;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ C6320 f3353;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ int f24545;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ C4464 f24546;

    static {
        NativeUtil.classesInit0(273);
    }

    public /* synthetic */ C8240(List list, C6320 c6320, int i, C4464 c4464) {
        this.f3352 = list;
        this.f3353 = c6320;
        this.f24545 = i;
        this.f24546 = c4464;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
