package yyds;

import android.view.ViewGroup;
import com.android.NativeUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: renamed from: yyds.ᛲᲀᛲᲈ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0433 extends AbstractC0359 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2716 f2191;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ArrayList f2192;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final SimpleDateFormat f2193;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1565 f2194;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f2195;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2716 f2196;

    static {
        NativeUtil.classesInit0(269);
    }

    public C0433(ArrayList arrayList, C1565 c1565, C2716 c2716, C2716 c27162) {
        AbstractC2328.m4341(-166730203300718L);
        AbstractC2328.m4341(-166755973104494L);
        AbstractC2328.m4341(-166807512712046L);
        AbstractC2328.m4341(-166867642254190L);
        this.f2192 = arrayList;
        this.f2194 = c1565;
        this.f2196 = c2716;
        this.f2191 = c27162;
        this.f2195 = -1;
        this.f2193 = new SimpleDateFormat(AbstractC2328.m4341(-166927771796334L), Locale.getDefault());
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final native void m1207(int i);

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
