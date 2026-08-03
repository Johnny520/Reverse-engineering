package Yue;

import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۤۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8237 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f3348;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ C6320 f3349;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ List f24542;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ int f24543;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ C4464 f24544;

    static {
        NativeUtil.classesInit0(265);
    }

    public /* synthetic */ C8237(int i, C6320 c6320, List list, int i2, C4464 c4464) {
        this.f3348 = i;
        this.f3349 = c6320;
        this.f24542 = list;
        this.f24543 = i2;
        this.f24544 = c4464;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
