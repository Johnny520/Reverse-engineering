package p176i1;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p077P0.AbstractC1132s;
import p077P0.AbstractC1134u;
import p077P0.InterfaceC1136w;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p137b3.InterfaceC1855c;

/* JADX INFO: renamed from: i1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2287c extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: f */
    public static final C2287c f7449f;

    /* JADX INFO: renamed from: g */
    public static final C2287c f7450g;

    /* JADX INFO: renamed from: h */
    public static final C2287c f7451h;

    /* JADX INFO: renamed from: i */
    public static final C2287c f7452i;

    /* JADX INFO: renamed from: j */
    public static final C2287c f7453j;

    /* JADX INFO: renamed from: k */
    public static final C2287c f7454k;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7455e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5 = 1;
        f7449f = new C2287c(i5, 0);
        f7450g = new C2287c(i5, 1);
        f7451h = new C2287c(i5, 2);
        f7452i = new C2287c(i5, 3);
        f7453j = new C2287c(i5, 4);
        f7454k = new C2287c(i5, 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2287c(int i5, int i6) {
        super(i5);
        this.f7455e = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        int i5 = this.f7455e;
        C0891q c0891q = C0891q.f2780a;
        switch (i5) {
            case 0:
                InterfaceC1855c[] interfaceC1855cArr = AbstractC1134u.f3766a;
                ((InterfaceC1136w) obj).mo1128a(AbstractC1132s.f3761x, c0891q);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                InterfaceC1855c[] interfaceC1855cArr2 = AbstractC1134u.f3766a;
                ((InterfaceC1136w) obj).mo1128a(AbstractC1132s.f3760w, c0891q);
                break;
            case 4:
                break;
            default:
                C2310z c2310z = (C2310z) obj;
                if (c2310z.isAttachedToWindow()) {
                    c2310z.m4142n();
                }
                break;
        }
        return c0891q;
    }
}
