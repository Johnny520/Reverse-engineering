package p358y2;

import gg.AbstractC1417m;
import java.util.UUID;
import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: y2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5968d extends AbstractC1417m implements InterfaceC1220a {

    /* JADX INFO: renamed from: h */
    public static final C5968d f24256h;

    /* JADX INFO: renamed from: i */
    public static final C5968d f24257i;

    /* JADX INFO: renamed from: j */
    public static final C5968d f24258j;

    /* JADX INFO: renamed from: k */
    public static final C5968d f24259k;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24260g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9 = 0;
        f24256h = new C5968d(i9, 0);
        f24257i = new C5968d(i9, 1);
        f24258j = new C5968d(i9, 2);
        f24259k = new C5968d(i9, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5968d(int i9, int i10) {
        super(i9);
        this.f24260g = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f24260g) {
            case 0:
                return UUID.randomUUID();
            case 1:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
