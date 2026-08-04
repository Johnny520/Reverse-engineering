package yyds;

import android.app.Activity;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛴᲁᛳᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0950 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ long f4416;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Activity f4417;

    static {
        NativeUtil.classesInit0(71);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950(Activity activity, long j, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f4417 = activity;
        this.f4416 = j;
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
