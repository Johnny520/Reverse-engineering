package yyds;

import android.widget.TextView;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛸᛸᲁᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1847 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f9312;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ long f9313;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f9314;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9315;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1188 f9316;

    static {
        NativeUtil.classesInit0(132);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1847(long j, C1188 c1188, TextView textView, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f9313 = j;
        this.f9316 = c1188;
        this.f9315 = textView;
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
