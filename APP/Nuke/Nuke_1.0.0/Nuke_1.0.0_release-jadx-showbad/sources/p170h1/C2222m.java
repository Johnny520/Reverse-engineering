package p170h1;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import p041H0.InterfaceC0614q0;
import p095T.C1379p;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p152e0.InterfaceC1999f;

/* JADX INFO: renamed from: h1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2222m extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f7268e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC1601c f7269f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1379p f7270g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1999f f7271h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f7272i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ View f7273j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2222m(Context context, InterfaceC1601c interfaceC1601c, C1379p c1379p, InterfaceC1999f interfaceC1999f, int i5, View view) {
        super(0);
        this.f7268e = context;
        this.f7269f = interfaceC1601c;
        this.f7270g = c1379p;
        this.f7271h = interfaceC1999f;
        this.f7272i = i5;
        this.f7273j = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        KeyEvent.Callback callback = this.f7273j;
        AbstractC1665j.m2983c(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new C2233x(this.f7268e, this.f7269f, this.f7270g, this.f7271h, this.f7272i, (InterfaceC0614q0) callback).getLayoutNode();
    }
}
