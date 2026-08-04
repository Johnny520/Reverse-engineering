package yyds;

import android.app.Activity;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛲᲀᲁᲀ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0443 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ long f2261;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2262;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f2263;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ long f2264;

    static {
        NativeUtil.classesInit0(233);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0443(long j, Activity activity, long j2, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f2261 = j;
        this.f2262 = activity;
        this.f2264 = j2;
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
