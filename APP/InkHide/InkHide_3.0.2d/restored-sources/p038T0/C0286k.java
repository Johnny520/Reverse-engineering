package p038T0;

import p025M0.InterfaceC0204l;
import p027N0.AbstractC0224h;

/* JADX INFO: renamed from: T0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0286k extends AbstractC0224h implements InterfaceC0204l {

    /* JADX INFO: renamed from: b */
    public static final C0286k f657b = new C0286k(0);

    /* JADX INFO: renamed from: c */
    public static final C0286k f658c = new C0286k(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f659a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [T0.k.<clinit>():void] */
    public /* synthetic */ C0286k(int i2) {
        this.f659a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p025M0.InterfaceC0204l
    /* JADX INFO: renamed from: c */
    public final Object mo8c(Object obj) {
        switch (this.f659a) {
            case 0:
                return obj;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
