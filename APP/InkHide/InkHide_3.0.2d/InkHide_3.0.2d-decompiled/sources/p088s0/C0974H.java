package p088s0;

import android.content.Context;
import android.text.style.URLSpan;
import android.view.View;
import p027N0.AbstractC0223g;
import p086r0.C0925n1;
import p092u0.AbstractC1015a;

/* JADX INFO: renamed from: s0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0974H extends URLSpan {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0976J f3486a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0974H(C0976J c0976j, String str) {
        super(str);
        this.f3486a = c0976j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC0223g.m418e(view, "widget");
        Context context = this.f3486a.getContext();
        AbstractC0223g.m417d(context, "getContext(...)");
        AbstractC1015a.m2216b(context, getURL(), new C0925n1(13));
    }
}
