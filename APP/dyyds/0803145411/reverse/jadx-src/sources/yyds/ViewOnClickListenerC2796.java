package yyds;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.android.NativeUtil;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* JADX INFO: renamed from: yyds.ᲈᲇᲈ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2796 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f13660;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f13661;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13662;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f13663;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ int f13664;

    static {
        NativeUtil.classesInit0(112);
    }

    public /* synthetic */ ViewOnClickListenerC2796(int i, Dialog dialog, Context context, Comment comment) {
        this.f13662 = 0;
        this.f13660 = dialog;
        this.f13663 = comment;
        this.f13664 = i;
        this.f13661 = context;
    }

    public native /* synthetic */ ViewOnClickListenerC2796(C1271 c1271, C1132 c1132, C2491 c2491, int i);

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);

    public /* synthetic */ ViewOnClickListenerC2796(C0103 c0103, C0172 c0172, C2531 c2531, Context context, int i) {
        this.f13662 = 2;
        this.f13660 = c0103;
        this.f13663 = c0172;
        this.f13661 = c2531;
        this.f13664 = i;
    }
}
