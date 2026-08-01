package p000;

import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.MethodsMatcher;
import p000.C0695rn;

/* JADX INFO: renamed from: jn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0361jn implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2914d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0695rn.b f2915e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0695rn.b f2916f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0695rn.b f2917g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0361jn(C0695rn.b bVar, C0695rn.b bVar2, C0695rn.b bVar3, int i) {
        this.f2914d = i;
        this.f2915e = bVar;
        this.f2916f = bVar2;
        this.f2917g = bVar3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        switch (this.f2914d) {
            case 0:
                return C0695rn.m3565F6(this.f2915e, this.f2916f, this.f2917g, (MethodsMatcher) obj);
            case 1:
                return C0695rn.m3557E6(this.f2915e, this.f2916f, this.f2917g, (ClassMatcher) obj);
            default:
                return C0695rn.m3549D6(this.f2915e, this.f2916f, this.f2917g, (FindClass) obj);
        }
    }
}
