package yyds;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.android.NativeUtil;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* JADX INFO: renamed from: yyds.ᛴᛳᛷᛴ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0819 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Context f3750;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f3751;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Dialog f3752;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Comment f3753;

    static {
        NativeUtil.classesInit0(106);
    }

    public /* synthetic */ ViewOnClickListenerC0819(Context context, Comment comment, Dialog dialog) {
        this.f3751 = 2;
        this.f3750 = context;
        this.f3753 = comment;
        this.f3752 = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);

    public /* synthetic */ ViewOnClickListenerC0819(int i, Dialog dialog, Context context, Comment comment) {
        this.f3751 = i;
        this.f3753 = comment;
        this.f3750 = context;
        this.f3752 = dialog;
    }
}
