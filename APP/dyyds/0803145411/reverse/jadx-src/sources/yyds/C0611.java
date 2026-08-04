package yyds;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.android.NativeUtil;
import com.kongzue.dialogx.interfaces.AbstractC0041;

/* JADX INFO: renamed from: yyds.ᛳᛶᛴᛵ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0611 extends AbstractC1865 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Activity f2967;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ Context f2968;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1779 f2969;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f2970;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ String f2971;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ String f2972;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f2973;

    static {
        NativeUtil.classesInit0(260);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0611(Context context, Activity activity, C1779 c1779, String str, String str2, String str3, Context context2, LinearLayout linearLayout) {
        super(linearLayout);
        this.f2970 = context;
        this.f2967 = activity;
        this.f2969 = c1779;
        this.f2973 = str;
        this.f2971 = str2;
        this.f2972 = str3;
        this.f2968 = context2;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final native void m1499(TextView textView, String[] strArr, View view, Switch r3);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final native void m1500(TextView textView);

    @Override // yyds.AbstractC1865
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final native void mo890(AbstractC0041 abstractC0041, View view);
}
