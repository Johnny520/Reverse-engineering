package p024b9;

import p098g9.EnumC2563q;
import p098g9.InterfaceC2561o;
import p172l8.C4700i0;
import p215oc.C5729x;

/* JADX INFO: renamed from: b9.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1066v0 extends AbstractC1065v {

    /* JADX INFO: renamed from: q */
    public static final a f3216q = new a(null);

    /* JADX INFO: renamed from: b9.v0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: b9.v0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final /* synthetic */ class C10069a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f3217a;

            static {
                int[] iArr = new int[EnumC2563q.values().length];
                try {
                    iArr[EnumC2563q.f6823q.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC2563q.f6824r.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC2563q.f6825s.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f3217a = iArr;
            }
        }

        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m3873a(InterfaceC2561o interfaceC2561o) {
            interfaceC2561o.getClass();
            StringBuilder sb2 = new StringBuilder();
            int i10 = C10069a.f3217a[interfaceC2561o.mo9081s().ordinal()];
            if (i10 == 1) {
                C4700i0 c4700i0 = C4700i0.f13910a;
            } else if (i10 == 2) {
                sb2.append("in ");
            } else {
                if (i10 != 3) {
                    C5729x.m23182a();
                    return null;
                }
                sb2.append("out ");
            }
            sb2.append(interfaceC2561o.getName());
            return sb2.toString();
        }

        public a() {
        }
    }
}
