package Yue;

import com.android.p001dx.p004io.Opcodes;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.nmmedit.protect.NativeUtil;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Yue.ۥۢۤ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8219 implements OnMenuItemClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ AtomicReference f3332;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ List f3333;

    static {
        NativeUtil.classesInit0(Opcodes.USHR_INT_LIT8);
    }

    public /* synthetic */ C8219(AtomicReference atomicReference, List list) {
        this.f3332 = atomicReference;
        this.f3333 = list;
    }

    @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
    public final native boolean onClick(Object obj, CharSequence charSequence, int i);
}
