package yyds;

import android.app.AlertDialog;
import android.view.View;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛴᛵᛴᲈ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0852 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3917;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ AlertDialog f3918;

    static {
        NativeUtil.classesInit0(271);
    }

    public /* synthetic */ ViewOnClickListenerC0852(AlertDialog alertDialog, int i) {
        this.f3917 = i;
        this.f3918 = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
