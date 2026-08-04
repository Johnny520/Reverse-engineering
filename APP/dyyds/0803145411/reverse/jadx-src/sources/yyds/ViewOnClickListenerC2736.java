package yyds;

import android.view.View;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲈᲀᛳᛵ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2736 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ View f13439;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13440;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1186 f13441;

    static {
        NativeUtil.classesInit0(46);
    }

    public /* synthetic */ ViewOnClickListenerC2736(C1186 c1186, View view, int i) {
        this.f13440 = i;
        this.f13441 = c1186;
        this.f13439 = view;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
