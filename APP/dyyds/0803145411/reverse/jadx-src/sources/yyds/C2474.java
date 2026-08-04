package yyds;

import android.content.Context;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲇᛷᛱᲈ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2474 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f12229;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f12230;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f12231;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f12232;

    static {
        NativeUtil.classesInit0(119);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2474(Context context, String str, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f12231 = i;
        this.f12230 = context;
        this.f12232 = str;
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
