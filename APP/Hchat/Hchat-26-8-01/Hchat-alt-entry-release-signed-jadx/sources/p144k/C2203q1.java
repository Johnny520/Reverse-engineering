package p144k;

import android.view.View;
import android.widget.Magnifier;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: k.q1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2203q1 implements InterfaceC2197o1 {

    /* JADX INFO: renamed from: b */
    public static final C2203q1 f7301b = new C2203q1(0);

    /* JADX INFO: renamed from: c */
    public static final C2203q1 f7302c = new C2203q1(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7303a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [k.q1.<clinit>():void] */
    public /* synthetic */ C2203q1(int i9) {
        this.f7303a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2197o1
    /* JADX INFO: renamed from: a */
    public final boolean mo5448a() {
        switch (this.f7303a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.InterfaceC2197o1
    /* JADX INFO: renamed from: b */
    public final InterfaceC2194n1 mo5449b(View view, InterfaceC4233c interfaceC4233c) {
        switch (this.f7303a) {
            case 0:
                return new C2200p1(new Magnifier(view));
            default:
                return new C2206r1(new Magnifier(view));
        }
    }
}
