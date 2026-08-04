package yyds;

import android.content.Context;
import android.view.View;
import com.android.NativeUtil;
import com.p000ss.android.ugc.awemes.MainActivity;

/* JADX INFO: renamed from: yyds.ᛸᲁᛳᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1880 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f9470;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f9471;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f9472;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9473;

    static {
        NativeUtil.classesInit0(282);
    }

    public /* synthetic */ RunnableC1880(View view, boolean z, MainActivity mainActivity) {
        this.f9471 = 3;
        this.f9470 = view;
        this.f9473 = z;
        this.f9472 = mainActivity;
    }

    @Override // java.lang.Runnable
    public final native void run();

    public /* synthetic */ RunnableC1880(Context context, Object obj, boolean z, int i) {
        this.f9471 = i;
        this.f9470 = context;
        this.f9472 = obj;
        this.f9473 = z;
    }

    public /* synthetic */ RunnableC1880(int i, Object obj, Object obj2, boolean z) {
        this.f9471 = i;
        this.f9473 = z;
        this.f9470 = obj;
        this.f9472 = obj2;
    }
}
