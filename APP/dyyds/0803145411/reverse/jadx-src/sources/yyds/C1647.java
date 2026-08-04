package yyds;

import android.content.Context;
import com.android.NativeUtil;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: yyds.ᛷᲁᛸᛶ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1647 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f8380;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public Object f8381;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8382;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public Object f8383;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Object f8384;

    static {
        NativeUtil.classesInit0(26);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647(Context context, int i, AtomicBoolean atomicBoolean, AtomicReference atomicReference, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8382 = 5;
        this.f8384 = context;
        this.f8380 = i;
        this.f8381 = atomicBoolean;
        this.f8383 = atomicReference;
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    private final native Object m3358(Object obj);

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    private final native Object m3359(Object obj);

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
    public C1647(Context context, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8382 = 16;
        this.f8384 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647(Comment comment, Context context, String str, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8382 = 1;
        this.f8381 = comment;
        this.f8384 = context;
        this.f8383 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647(Emoji emoji, Context context, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8382 = 8;
        this.f8383 = emoji;
        this.f8384 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1647(Object obj, Object obj2, Object obj3, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f8382 = i;
        this.f8384 = obj;
        this.f8381 = obj2;
        this.f8383 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1647(Object obj, Object obj2, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f8382 = i;
        this.f8381 = obj;
        this.f8383 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647(C0682 c0682, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f8382 = 9;
        this.f8383 = c0682;
    }
}
