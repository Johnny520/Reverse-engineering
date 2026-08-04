package yyds;

import android.content.Context;
import android.view.View;
import com.android.NativeUtil;
import com.p000ss.android.ugc.awemes.WardDatabase;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.File;

/* JADX INFO: renamed from: yyds.ᛲᲁᲈ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0469 implements InterfaceC2289, InterfaceC2407, InterfaceC2656, InterfaceC1826, InterfaceC2504, InterfaceC1414, InterfaceC0723, InterfaceC0966, InterfaceC0535, InterfaceC1434, InterfaceC0396, InterfaceC2768 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static volatile C0469 f2327;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C0469 f2328;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C0469 f2329;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final /* synthetic */ C0469 f2330;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C0469 f2331;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f2332;

    static {
        NativeUtil.classesInit0(224);
        f2331 = new C0469(0);
        f2328 = new C0469(1);
        f2330 = new C0469(2);
        f2329 = new C0469(4);
    }

    public /* synthetic */ C0469(int i) {
        this.f2332 = i;
    }

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public static native void m1256(Context context);

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static native String m1257(int i, String str);

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public static native String m1258(String str, Aweme aweme, Comment comment);

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static native void m1259(C0469 c0469, Context context, String str, String str2, String str3, int i);

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static native WardDatabase m1260(Context context);

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public static native long m1261(String str);

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static /* synthetic */ String m1262(String str, Aweme aweme, Comment comment, int i) {
        if ((i & 2) != 0) {
            aweme = null;
        }
        if ((i & 4) != 0) {
            comment = null;
        }
        return m1264(str, aweme, comment, null);
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static native String m1264(String str, Aweme aweme, Comment comment, Integer num);

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static native File m1265(String str, Aweme aweme, Integer num);

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public static native String m1266(String str);

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public static native void m1267(Context context, C1223 c1223);

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public static native void m1268(Context context);

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public static native void m1269(Context context);

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static native void m1270(View view, int i, AbstractC0222 abstractC0222, InterfaceC1549 interfaceC1549);

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public static native String m1271();

    @Override // yyds.InterfaceC1081
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public native boolean mo443(Object obj, File file, C0822 c0822);

    @Override // yyds.InterfaceC2768
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public native InterfaceC0894 mo382(C0644 c0644);

    @Override // yyds.InterfaceC1434
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public native Object mo384();

    @Override // yyds.InterfaceC2504
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public native Object mo604(byte[] bArr);

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public native WardDatabase m1272(Context context);

    @Override // yyds.InterfaceC2504
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public native Class mo605();

    @Override // yyds.InterfaceC0723
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ */
    public native int mo444(C0822 c0822);

    @Override // yyds.InterfaceC2407
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public native void mo391(MenuC0836 menuC0836, boolean z);

    @Override // yyds.InterfaceC0966
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public native void mo1273(String str, StringBuilder sb);

    @Override // yyds.InterfaceC0535
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public native void mo1274(int i, Object obj);

    @Override // yyds.InterfaceC0396
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public native boolean mo561(Object obj);

    @Override // yyds.InterfaceC0535
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public native void mo1275();

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public native void m1276(Context context, String str, String str2);

    @Override // yyds.InterfaceC2407
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public native boolean mo404(MenuC0836 menuC0836);

    @Override // yyds.InterfaceC1826
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public native InterfaceC2162 mo1277(InterfaceC2162 interfaceC2162, C0822 c0822);

    @Override // yyds.InterfaceC2656
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public native C2098 mo1278(C1369 c1369, C0837 c0837);
}
