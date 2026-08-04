package yyds;

import android.content.Context;
import com.android.NativeUtil;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᛷᛳᛶᛳ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1513 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f7305;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f7306;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public Iterator f7307;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int f7308;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ List f7309;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final /* synthetic */ Context f7310;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final /* synthetic */ Aweme f7311;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f7312;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public AtomicBoolean f7313;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public C1624 f7314;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public int f7315;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final /* synthetic */ List f7316;

    static {
        NativeUtil.classesInit0(234);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513(List list, List list2, Aweme aweme, Context context, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f7309 = list;
        this.f7316 = list2;
        this.f7311 = aweme;
        this.f7310 = context;
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
