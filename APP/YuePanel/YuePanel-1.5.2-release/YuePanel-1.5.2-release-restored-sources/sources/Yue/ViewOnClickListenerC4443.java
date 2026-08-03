package Yue;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.nmmedit.protect.NativeUtil;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC4443 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final /* synthetic */ Activity f9177;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final /* synthetic */ TextView f9178;

    static {
        NativeUtil.classesInit0(77);
    }

    public /* synthetic */ ViewOnClickListenerC4443(Activity activity, TextView textView) {
        this.f9177 = activity;
        this.f9178 = textView;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
