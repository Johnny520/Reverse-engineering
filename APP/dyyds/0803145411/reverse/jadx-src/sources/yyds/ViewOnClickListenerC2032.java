package yyds;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲀᛷᛲᲈ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2032 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Context f10133;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10134;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ TextView f10135;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ View f10136;

    static {
        NativeUtil.classesInit0(172);
    }

    public /* synthetic */ ViewOnClickListenerC2032(View view, Context context, TextView textView, int i) {
        this.f10134 = i;
        this.f10136 = view;
        this.f10133 = context;
        this.f10135 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
