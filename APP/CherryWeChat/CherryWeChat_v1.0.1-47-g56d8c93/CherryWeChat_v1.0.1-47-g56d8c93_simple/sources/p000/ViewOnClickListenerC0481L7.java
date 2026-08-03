package p000;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: L7 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0481L7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1580a;

    public /* synthetic */ ViewOnClickListenerC0481L7(int r1) {
        this.f1580a = r1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r9) {
        switch(this.f1580a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-14306536060981L);
        Context r2 = r9.getContext();
        AbstractC0295Gu.m625r(-14315125995573L);
        C1456gf.m2799Q(r2, AbstractC0295Gu.m625r(-14383845472309L), null, AbstractC0295Gu.m625r(-14418205210677L), AbstractC0295Gu.m625r(-14508399523893L), new C0438K7(r9, 3));
        return;
    L6:
        AbstractC0295Gu.m625r(-254167574640693L);
        Context r22 = r9.getContext();
        AbstractC0295Gu.m625r(-254176164575285L);
        C1456gf.m2799Q(r22, AbstractC0295Gu.m625r(-254244884052021L), null, AbstractC0295Gu.m625r(-254816114702389L), AbstractC0295Gu.m625r(-254927783852085L), new C0438K7(r9, 0));
    }
}
