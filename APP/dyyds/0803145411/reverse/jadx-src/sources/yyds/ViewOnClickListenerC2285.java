package yyds;

import android.content.Context;
import android.view.View;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᲁᛷᲈᲇ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2285 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Context f11244;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f11245;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ String[] f11246;

    static {
        NativeUtil.classesInit0(238);
    }

    public /* synthetic */ ViewOnClickListenerC2285(String[] strArr, Context context, int i) {
        this.f11245 = i;
        this.f11246 = strArr;
        this.f11244 = context;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);
}
