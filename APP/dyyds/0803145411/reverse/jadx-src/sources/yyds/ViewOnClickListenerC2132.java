package yyds;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.bytedance.im.core.model.Message;

/* JADX INFO: renamed from: yyds.ᲀᲈᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2132 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Context f10536;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f10537;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Message f10538;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Dialog f10539;

    public native /* synthetic */ ViewOnClickListenerC2132(Dialog dialog, Context context, Message message);

    public native /* synthetic */ ViewOnClickListenerC2132(Dialog dialog, Message message, Context context);

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
