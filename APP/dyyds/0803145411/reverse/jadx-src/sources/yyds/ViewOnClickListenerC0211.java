package yyds;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛱᲀᲇ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0211 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Context f1219;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1220;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ String f1221;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Dialog f1222;

    static {
        NativeUtil.classesInit0(275);
    }

    public /* synthetic */ ViewOnClickListenerC0211(Dialog dialog, Context context, String str, int i) {
        this.f1220 = i;
        this.f1222 = dialog;
        this.f1219 = context;
        this.f1221 = str;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);

    public /* synthetic */ ViewOnClickListenerC0211(Dialog dialog, String str, Context context, int i) {
        this.f1220 = i;
        this.f1222 = dialog;
        this.f1221 = str;
        this.f1219 = context;
    }
}
