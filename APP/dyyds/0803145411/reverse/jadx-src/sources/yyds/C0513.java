package yyds;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ScrollView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: yyds.ᛳᛱᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0513 extends AbstractC1865 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1524 f2462;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2585 f2463;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ AtomicBoolean f2464;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f2465;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0947 f2466;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0513(AtomicBoolean atomicBoolean, C1524 c1524, C2585 c2585, C0947 c0947, C0947 c09472, ScrollView scrollView) {
        super(scrollView);
        this.f2464 = atomicBoolean;
        this.f2462 = c1524;
        this.f2463 = c2585;
        this.f2466 = c0947;
        this.f2465 = c09472;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final native void m1361(Context context, View view, String str);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final native void m1362(EditText editText, String str);

    @Override // yyds.AbstractC1865
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final native void mo890(AbstractC0041 abstractC0041, View view);
}
