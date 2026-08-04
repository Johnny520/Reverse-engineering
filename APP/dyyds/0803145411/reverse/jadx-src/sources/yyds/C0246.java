package yyds;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.android.NativeUtil;
import com.kongzue.dialogx.interfaces.AbstractC0041;

/* JADX INFO: renamed from: yyds.ᛱᲇᲇᛷ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0246 extends AbstractC1865 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f1353;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1354;

    static {
        NativeUtil.classesInit0(77);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0246(View view, Context context, int i) {
        super(view);
        this.f1354 = i;
        this.f1353 = context;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final native void m892(Context context, View view);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final native boolean m893(EditText editText, boolean z);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final native int m894(Context context);

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final native void m895(C1417 c1417, View view, TextView textView, View view2, View view3, boolean z);

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final native void m896(Switch r0, Switch r1, LinearLayout linearLayout, View view, LinearLayout linearLayout2);

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final native void m897(EditText editText, int i);

    @Override // yyds.AbstractC1865
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final native void mo890(AbstractC0041 abstractC0041, View view);
}
