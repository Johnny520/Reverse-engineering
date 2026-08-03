package Yue;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC5914 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Context f14778;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ LinearLayout f14779;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final /* synthetic */ EditText f14780;

    static {
        NativeUtil.classesInit0(404);
    }

    public /* synthetic */ ViewOnClickListenerC5914(Context context, LinearLayout linearLayout, EditText editText) {
        this.f14778 = context;
        this.f14779 = linearLayout;
        this.f14780 = editText;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
