package p265s1;

import android.graphics.ColorFilter;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: s1.r1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7133r1 {

    /* JADX INFO: renamed from: b */
    public static final a f23666b = new a(null);

    /* JADX INFO: renamed from: a */
    public final ColorFilter f23667a;

    public AbstractC7133r1(ColorFilter colorFilter) {
        this.f23667a = colorFilter;
    }

    /* JADX INFO: renamed from: a */
    public final ColorFilter m28190a() {
        return this.f23667a;
    }

    /* JADX INFO: renamed from: s1.r1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ AbstractC7133r1 m28191b(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = AbstractC7168z0.f23700a.m28333z();
            }
            return aVar.m28192a(j10, i10);
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC7133r1 m28192a(long j10, int i10) {
            return new C7048a1(j10, i10, (AbstractC1043k) null);
        }

        public a() {
        }
    }
}
