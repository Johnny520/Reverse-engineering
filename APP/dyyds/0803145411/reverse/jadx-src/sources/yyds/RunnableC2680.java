package yyds;

import android.widget.EditText;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲈᛶᛵᛱ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2680 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ String f13135;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13136;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ EditText f13137;

    static {
        NativeUtil.classesInit0(167);
    }

    public /* synthetic */ RunnableC2680(EditText editText, String str, int i) {
        this.f13136 = i;
        this.f13137 = editText;
        this.f13135 = str;
    }

    @Override // java.lang.Runnable
    public final native void run();
}
