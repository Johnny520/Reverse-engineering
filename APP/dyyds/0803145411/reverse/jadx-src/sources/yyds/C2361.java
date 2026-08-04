package yyds;

import android.content.Context;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲁᲈᛲᲇ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2361 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Comparable f11585;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public /* synthetic */ Object f11586;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f11587;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f11588;

    static {
        NativeUtil.classesInit0(205);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2361(Context context, String str, String str2, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f11587 = 2;
        this.f11585 = str;
        this.f11588 = str2;
        this.f11586 = context;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2361(Object obj, Comparable comparable, Object obj2, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f11587 = i;
        this.f11586 = obj;
        this.f11585 = comparable;
        this.f11588 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2361(String str, String str2, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f11587 = 0;
        this.f11585 = str;
        this.f11588 = str2;
    }
}
