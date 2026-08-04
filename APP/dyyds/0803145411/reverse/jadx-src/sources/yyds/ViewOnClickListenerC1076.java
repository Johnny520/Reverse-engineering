package yyds;

import android.app.Dialog;
import android.view.View;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛵᛴᛷ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1076 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1129 f4959;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f4960;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Dialog f4961;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1524 f4962;

    static {
        NativeUtil.classesInit0(72);
    }

    public /* synthetic */ ViewOnClickListenerC1076(C1524 c1524, C1129 c1129, Dialog dialog, int i) {
        this.f4960 = i;
        this.f4962 = c1524;
        this.f4959 = c1129;
        this.f4961 = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
