package p340x2;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import gg.AbstractC1417m;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.C1828f0;
import p307v0.InterfaceC4366f;
import p339x1.InterfaceC5641r1;

/* JADX INFO: renamed from: x2.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5677l extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Context f23119g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f23120h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1828f0 f23121i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC4366f f23122j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f23123k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ View f23124l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5677l(Context context, InterfaceC1231l interfaceC1231l, C1828f0 c1828f0, InterfaceC4366f interfaceC4366f, int i9, View view) {
        super(0);
        this.f23119g = context;
        this.f23120h = interfaceC1231l;
        this.f23121i = c1828f0;
        this.f23122j = interfaceC4366f;
        this.f23123k = i9;
        this.f23124l = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f23124l;
        callback.getClass();
        return new C5687v(this.f23119g, this.f23120h, this.f23121i, this.f23122j, this.f23123k, (InterfaceC5641r1) callback).getLayoutNode();
    }
}
