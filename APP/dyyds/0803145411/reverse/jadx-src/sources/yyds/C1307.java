package yyds;

import android.content.Context;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛶᛳᲁᲀ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1307 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f5974;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f5975;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5976;

    static {
        NativeUtil.classesInit0(108);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1307(Context context, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f5976 = i;
        this.f5975 = context;
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
