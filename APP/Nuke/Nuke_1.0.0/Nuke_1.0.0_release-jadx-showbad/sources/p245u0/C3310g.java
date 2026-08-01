package p245u0;

import android.graphics.PathMeasure;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1666k;
import p211o0.C2751j;

/* JADX INFO: renamed from: u0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3310g extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: f */
    public static final C3310g f10287f;

    /* JADX INFO: renamed from: g */
    public static final C3310g f10288g;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f10289e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 0;
        f10287f = new C3310g(i5, 0);
        f10288g = new C3310g(i5, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3310g(int i5, int i6) {
        super(i5);
        this.f10289e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f10289e) {
            case 0:
                return new C2751j(new PathMeasure());
            default:
                return C0891q.f2780a;
        }
    }
}
