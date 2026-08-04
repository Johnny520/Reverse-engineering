package yyds;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: renamed from: yyds.ᛲᛲᛶᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0293 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1558;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ EnumC0868 f1559;

    public /* synthetic */ ViewOnClickListenerC0293(EnumC0868 enumC0868, int i) {
        this.f1558 = i;
        this.f1559 = enumC0868;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean zM1313;
        int i = this.f1558;
        EnumC0868 enumC0868 = this.f1559;
        switch (i) {
            case 0:
                Activity topActivity = ActivityStack.getTopActivity();
                if (topActivity == null) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-155911180682094L));
                    return;
                }
                Intent intent = new Intent(AbstractC2328.m4341(-155945540420462L));
                intent.addCategory(AbstractC2328.m4341(-156100159243118L));
                intent.setType(AbstractC2328.m4341(-156241893163886L));
                intent.addFlags(1);
                try {
                    C0561 c0561 = C0561.f2672;
                    AbstractC2328.m4341(-544528411558766L);
                    synchronized (C0561.f2676[enumC0868.ordinal()]) {
                        long[] jArr = C0561.f2678;
                        int iOrdinal = enumC0868.ordinal();
                        jArr[iOrdinal] = jArr[iOrdinal] + 1;
                    }
                    topActivity.startActivityForResult(intent, enumC0868.f3985);
                    return;
                } catch (Exception e) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-156276252902254L));
                    C2336.f11496.m4358(AbstractC2328.m4341(-156319202575214L), e);
                    return;
                }
            default:
                C0561 c05612 = C0561.f2672;
                AbstractC2328.m4341(-544756044825454L);
                synchronized (C0561.f2676[enumC0868.ordinal()]) {
                    try {
                        long[] jArr2 = C0561.f2678;
                        int iOrdinal2 = enumC0868.ordinal();
                        jArr2[iOrdinal2] = jArr2[iOrdinal2] + 1;
                        zM1313 = AbstractC0473.m1313(C0561.m1407(enumC0868));
                        if (!zM1313) {
                            C0561.m1406(enumC0868, AbstractC2328.m4341(-544777519661934L));
                        }
                        C0561.m1404(enumC0868, C0561.m1405());
                        synchronized (C0561.f2673) {
                            C0561.f2671.remove(enumC0868);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!zM1313) {
                    C1223 c1223 = new C1223(8, enumC0868);
                    if (AbstractC1544.m3188(Looper.myLooper(), Looper.getMainLooper())) {
                        c1223.mo731();
                    } else {
                        C0561.f2670.post(new RunnableC0309(5, c1223));
                    }
                }
                String str = enumC0868.f3984;
                if (zM1313) {
                    AbstractC1960.m3789(str.concat(AbstractC2328.m4341(-156426576757614L)));
                    return;
                } else {
                    AbstractC1960.m3789(str.concat(AbstractC2328.m4341(-156400806953838L)));
                    return;
                }
        }
    }
}
