package yyds;

import android.app.Dialog;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲇᛴᛴᲇ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2435 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Dialog f11995;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11996;

    static {
        NativeUtil.classesInit0(190);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2435(Dialog dialog, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f11996 = i;
        this.f11995 = dialog;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final native Object mo474(Object obj);

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final native InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274);

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final native Object mo511(Object obj, Object obj2);
}
