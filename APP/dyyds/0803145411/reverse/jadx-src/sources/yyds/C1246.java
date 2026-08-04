package yyds;

import android.content.Context;
import com.android.NativeUtil;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* JADX INFO: renamed from: yyds.ᛵᲈᛷᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1246 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f5707;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5708;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5709 = 0;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f5710;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Object f5711;

    static {
        NativeUtil.classesInit0(259);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246(Comment comment, int i, Context context, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f5711 = comment;
        this.f5708 = i;
        this.f5710 = context;
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
    public C1246(C0488 c0488, int i, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f5710 = c0488;
        this.f5708 = i;
    }
}
