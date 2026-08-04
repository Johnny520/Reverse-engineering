package yyds;

import com.android.NativeUtil;
import java.io.File;

/* JADX INFO: renamed from: yyds.ᛲᛱᛷᛶ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0275 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ File f1478;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1479;

    static {
        NativeUtil.classesInit0(140);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0275(File file, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f1479 = i;
        this.f1478 = file;
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
