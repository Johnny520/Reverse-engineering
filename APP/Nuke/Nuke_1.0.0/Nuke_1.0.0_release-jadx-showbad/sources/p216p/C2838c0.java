package p216p;

import android.view.View;
import android.widget.Magnifier;
import p153e1.InterfaceC2007c;

/* JADX INFO: renamed from: p.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2838c0 implements InterfaceC2834a0 {

    /* JADX INFO: renamed from: b */
    public static final C2838c0 f8918b = new C2838c0(0);

    /* JADX INFO: renamed from: c */
    public static final C2838c0 f8919c = new C2838c0(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8920a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [p.c0.<clinit>():void] */
    public /* synthetic */ C2838c0(int i5) {
        this.f8920a = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p216p.InterfaceC2834a0
    /* JADX INFO: renamed from: a */
    public final boolean mo5027a() {
        switch (this.f8920a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p216p.InterfaceC2834a0
    /* JADX INFO: renamed from: b */
    public final InterfaceC2832Z mo5028b(View view, InterfaceC2007c interfaceC2007c) {
        switch (this.f8920a) {
            case 0:
                return new C2836b0(new Magnifier(view));
            default:
                return new C2840d0(new Magnifier(view));
        }
    }
}
