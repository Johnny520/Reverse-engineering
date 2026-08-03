package p000;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: L7 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0481L7 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1580a;

    public /* synthetic */ ViewOnClickListenerC0481L7(int i) {
        this.f1580a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1580a) {
            case 0:
                AbstractC0295Gu.m625r(-254167574640693L);
                Context context = view.getContext();
                AbstractC0295Gu.m625r(-254176164575285L);
                C1456gf.m2799Q(context, AbstractC0295Gu.m625r(-254244884052021L), null, AbstractC0295Gu.m625r(-254816114702389L), AbstractC0295Gu.m625r(-254927783852085L), new C0438K7(view, 0));
                break;
            default:
                AbstractC0295Gu.m625r(-14306536060981L);
                Context context2 = view.getContext();
                AbstractC0295Gu.m625r(-14315125995573L);
                C1456gf.m2799Q(context2, AbstractC0295Gu.m625r(-14383845472309L), null, AbstractC0295Gu.m625r(-14418205210677L), AbstractC0295Gu.m625r(-14508399523893L), new C0438K7(view, 3));
                break;
        }
    }
}
