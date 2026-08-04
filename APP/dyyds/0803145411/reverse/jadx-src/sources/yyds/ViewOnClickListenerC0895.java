package yyds;

import android.view.View;
import android.widget.EditText;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛴᛷᛷᛴ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0895 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f4087;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ EditText f4088;

    static {
        NativeUtil.classesInit0(43);
    }

    public /* synthetic */ ViewOnClickListenerC0895(EditText editText, int i) {
        this.f4087 = i;
        this.f4088 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
