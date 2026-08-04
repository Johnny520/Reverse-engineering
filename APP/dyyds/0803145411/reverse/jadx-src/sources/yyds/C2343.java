package yyds;

import android.content.Context;
import android.view.ViewGroup;
import com.android.NativeUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᲁᲇᛱᛴ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C2343 extends AbstractC0359 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C1731 f11511;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ArrayList f11512;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0892 f11513;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Context f11514;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0485 f11515;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f11516;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final SimpleDateFormat f11517;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1584 f11518;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2732 f11519;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C1785 f11520;

    static {
        NativeUtil.classesInit0(123);
    }

    public C2343(Context context, C1584 c1584, C1785 c1785, C0892 c0892, C2732 c2732, C0485 c0485, C1731 c1731) {
        AbstractC2328.m4341(-1667705309135726L);
        AbstractC2328.m4341(-1667739668874094L);
        AbstractC2328.m4341(-1667791208481646L);
        AbstractC2328.m4341(-1667859927958382L);
        AbstractC2328.m4341(-1667911467565934L);
        AbstractC2328.m4341(-1667971597108078L);
        this.f11514 = context;
        this.f11518 = c1584;
        this.f11520 = c1785;
        this.f11513 = c0892;
        this.f11519 = c2732;
        this.f11515 = c0485;
        this.f11511 = c1731;
        this.f11512 = new ArrayList();
        this.f11517 = new SimpleDateFormat(AbstractC2328.m4341(-1668027431682926L), Locale.getDefault());
    }

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final native void mo472(AbstractC0185 abstractC0185, int i);

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final native int mo531();

    @Override // yyds.AbstractC0359
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final native AbstractC0185 mo473(ViewGroup viewGroup, int i);
}
