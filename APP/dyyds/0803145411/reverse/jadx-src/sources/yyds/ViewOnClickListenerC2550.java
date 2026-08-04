package yyds;

import android.content.Context;
import android.view.View;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲇᲇᛴᲇ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2550 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0763 f12590;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f12591;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Context f12592;

    static {
        NativeUtil.classesInit0(118);
    }

    public /* synthetic */ ViewOnClickListenerC2550(Context context, C0763 c0763) {
        this.f12591 = 1;
        this.f12592 = context;
        this.f12590 = c0763;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);

    public /* synthetic */ ViewOnClickListenerC2550(C0763 c0763, Context context, int i) {
        this.f12591 = i;
        this.f12590 = c0763;
        this.f12592 = context;
    }
}
