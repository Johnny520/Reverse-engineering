package p176i1;

import java.util.UUID;
import me.dartcv.nuke.BuildConfig;
import p112W2.InterfaceC1599a;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: i1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2288d extends AbstractC1666k implements InterfaceC1599a {

    /* JADX INFO: renamed from: f */
    public static final C2288d f7456f;

    /* JADX INFO: renamed from: g */
    public static final C2288d f7457g;

    /* JADX INFO: renamed from: h */
    public static final C2288d f7458h;

    /* JADX INFO: renamed from: i */
    public static final C2288d f7459i;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7460e;

    static {
        int i5 = 0;
        f7456f = new C2288d(i5, 0);
        f7457g = new C2288d(i5, 1);
        f7458h = new C2288d(i5, 2);
        f7459i = new C2288d(i5, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2288d(int i5, int i6) {
        super(i5);
        this.f7460e = i6;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        switch (this.f7460e) {
            case 0:
                return UUID.randomUUID();
            case BuildConfig.VERSION_CODE /* 1 */:
                return Boolean.FALSE;
            case 2:
                return "DEFAULT_TEST_TAG";
            default:
                return UUID.randomUUID();
        }
    }
}
