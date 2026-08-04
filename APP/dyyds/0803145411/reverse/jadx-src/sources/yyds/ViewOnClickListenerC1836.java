package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.android.NativeUtil;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: yyds.ᛸᛸᛴᛴ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1836 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Context f9205;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9206;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Aweme f9207;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ User f9208;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9209;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ AlertDialog f9210;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0172 f9211;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9212;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Comment f9213;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ EditText f9214;

    static {
        NativeUtil.classesInit0(111);
    }

    public /* synthetic */ ViewOnClickListenerC1836(TextView textView, EditText editText, Aweme aweme, Comment comment, User user, Context context, C0172 c0172, C0172 c01722, C0172 c01723, AlertDialog alertDialog) {
        this.f9212 = textView;
        this.f9214 = editText;
        this.f9207 = aweme;
        this.f9213 = comment;
        this.f9208 = user;
        this.f9205 = context;
        this.f9206 = c0172;
        this.f9211 = c01722;
        this.f9209 = c01723;
        this.f9210 = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
