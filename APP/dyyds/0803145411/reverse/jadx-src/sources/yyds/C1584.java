package yyds;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.NativeUtil;
import com.android.app.CustomRecyclerView;

/* JADX INFO: renamed from: yyds.ᛷᛶᲁᲈ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1584 implements InterfaceC1549 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f8028;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f8029;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8030;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f8031;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f8032;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f8033;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f8034;

    static {
        NativeUtil.classesInit0(146);
    }

    public /* synthetic */ C1584(Context context, C0172 c0172, C0947 c0947, C0172 c01722, C0947 c09472, C2133 c2133) {
        this.f8032 = 4;
        this.f8031 = context;
        this.f8034 = c0172;
        this.f8030 = c0947;
        this.f8033 = c01722;
        this.f8028 = c09472;
        this.f8029 = c2133;
    }

    @Override // yyds.InterfaceC1549
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final native Object mo371(Object obj);

    public /* synthetic */ C1584(TextView textView, C2133 c2133, Context context, CustomRecyclerView customRecyclerView, CustomRecyclerView customRecyclerView2, LinearLayout linearLayout) {
        this.f8032 = 5;
        this.f8028 = textView;
        this.f8030 = c2133;
        this.f8031 = context;
        this.f8033 = customRecyclerView;
        this.f8034 = customRecyclerView2;
        this.f8029 = linearLayout;
    }

    public /* synthetic */ C1584(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.f8032 = i;
        this.f8030 = obj;
        this.f8033 = obj2;
        this.f8031 = obj3;
        this.f8034 = obj4;
        this.f8028 = obj5;
        this.f8029 = obj6;
    }

    public /* synthetic */ C1584(C0172 c0172, C0172 c01722, C0172 c01723, C0172 c01724, C0172 c01725, C2531 c2531) {
        this.f8032 = 1;
        this.f8034 = c0172;
        this.f8030 = c01722;
        this.f8033 = c01723;
        this.f8031 = c01724;
        this.f8028 = c01725;
        this.f8029 = c2531;
    }
}
