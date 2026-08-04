package yyds;

import android.content.Context;
import android.view.View;
import com.android.NativeUtil;

/* JADX INFO: renamed from: yyds.ᛱᲈᛶᛷ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0257 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f1407;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f1408;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1409;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f1410;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f1411;

    static {
        NativeUtil.classesInit0(70);
    }

    public /* synthetic */ ViewOnClickListenerC0257(C0172 c0172, Context context, C2086 c2086, C0172 c01722) {
        this.f1409 = 7;
        this.f1410 = c0172;
        this.f1407 = context;
        this.f1411 = c2086;
        this.f1408 = c01722;
    }

    @Override // android.view.View.OnClickListener
    public final native void onClick(View view);

    public /* synthetic */ ViewOnClickListenerC0257(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1409 = i;
        this.f1411 = obj;
        this.f1407 = obj2;
        this.f1410 = obj3;
        this.f1408 = obj4;
    }

    public /* synthetic */ ViewOnClickListenerC0257(Object obj, C0172 c0172, Object obj2, InterfaceC1749 interfaceC1749, int i) {
        this.f1409 = i;
        this.f1411 = obj;
        this.f1410 = c0172;
        this.f1407 = obj2;
        this.f1408 = interfaceC1749;
    }

    public /* synthetic */ ViewOnClickListenerC0257(Context context, Object obj, Object obj2, Object obj3, int i) {
        this.f1409 = i;
        this.f1407 = context;
        this.f1411 = obj;
        this.f1410 = obj2;
        this.f1408 = obj3;
    }
}
