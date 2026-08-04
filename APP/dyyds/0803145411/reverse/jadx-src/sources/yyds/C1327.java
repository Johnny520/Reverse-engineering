package yyds;

import android.content.Context;
import com.android.NativeUtil;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛶᛵᛲᛲ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C1327 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1327 f6093;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0078 f6094;

    static {
        NativeUtil.classesInit0(129);
        f6093 = new C1327();
        f6094 = new C0078(new C2307(26));
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static native void m2617(Context context, String str);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static native void m2618(Context context);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static native C1284 m2619();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static native Object m2620(Context context, String str, Aweme aweme, Comment comment, InterfaceC0274 interfaceC0274, int i);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static native String m2621(List list);

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static native String m2622(String str);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final native Serializable m2623(byte[] bArr, String str, Context context, InterfaceC0477 interfaceC0477, AbstractC1320 abstractC1320);

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final native Object m2624(String str, Aweme aweme, Comment comment, Integer num, Context context, boolean z, boolean z2, AbstractC1320 abstractC1320);

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final native Object m2625(Context context, String str, Aweme aweme, Comment comment, Integer num, boolean z, AbstractC1320 abstractC1320);
}
