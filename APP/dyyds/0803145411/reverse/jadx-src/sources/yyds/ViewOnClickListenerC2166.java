package yyds;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲁᛱᲀᛸ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2166 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10633;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10634;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Context f10635;

    static {
        NativeUtil.classesInit0(110);
    }

    public /* synthetic */ ViewOnClickListenerC2166(Context context, TextView textView, int i) {
        this.f10634 = i;
        this.f10635 = context;
        this.f10633 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
