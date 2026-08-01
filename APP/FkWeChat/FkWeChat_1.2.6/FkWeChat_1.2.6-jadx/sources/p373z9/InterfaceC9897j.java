package p373z9;

import p081fa.InterfaceC2379g;
import p081fa.InterfaceC2384l;
import p081fa.InterfaceC2386n;
import p081fa.InterfaceC2389q;
import p213oa.C5692c;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6000f1;
import p229p9.InterfaceC6016l;
import p229p9.InterfaceC6055y0;

/* JADX INFO: renamed from: z9.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9897j {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC9897j f33375a = new a();

    /* JADX INFO: renamed from: z9.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC9897j {
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ void m38402f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p373z9.InterfaceC9897j
        /* JADX INFO: renamed from: a */
        public void mo38397a(InterfaceC2384l interfaceC2384l, InterfaceC6016l interfaceC6016l) {
            if (interfaceC2384l == null) {
                m38402f(3);
            }
            if (interfaceC6016l == null) {
                m38402f(4);
            }
        }

        @Override // p373z9.InterfaceC9897j
        /* JADX INFO: renamed from: b */
        public void mo38398b(InterfaceC2379g interfaceC2379g, InterfaceC5995e interfaceC5995e) {
            if (interfaceC2379g == null) {
                m38402f(7);
            }
            if (interfaceC5995e == null) {
                m38402f(8);
            }
        }

        @Override // p373z9.InterfaceC9897j
        /* JADX INFO: renamed from: c */
        public void mo38399c(InterfaceC2389q interfaceC2389q, InterfaceC6000f1 interfaceC6000f1) {
            if (interfaceC2389q == null) {
                m38402f(1);
            }
            if (interfaceC6000f1 == null) {
                m38402f(2);
            }
        }

        @Override // p373z9.InterfaceC9897j
        /* JADX INFO: renamed from: d */
        public InterfaceC5995e mo38400d(C5692c c5692c) {
            if (c5692c != null) {
                return null;
            }
            m38402f(0);
            return null;
        }

        @Override // p373z9.InterfaceC9897j
        /* JADX INFO: renamed from: e */
        public void mo38401e(InterfaceC2386n interfaceC2386n, InterfaceC6055y0 interfaceC6055y0) {
            if (interfaceC2386n == null) {
                m38402f(5);
            }
            if (interfaceC6055y0 == null) {
                m38402f(6);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void mo38397a(InterfaceC2384l interfaceC2384l, InterfaceC6016l interfaceC6016l);

    /* JADX INFO: renamed from: b */
    void mo38398b(InterfaceC2379g interfaceC2379g, InterfaceC5995e interfaceC5995e);

    /* JADX INFO: renamed from: c */
    void mo38399c(InterfaceC2389q interfaceC2389q, InterfaceC6000f1 interfaceC6000f1);

    /* JADX INFO: renamed from: d */
    InterfaceC5995e mo38400d(C5692c c5692c);

    /* JADX INFO: renamed from: e */
    void mo38401e(InterfaceC2386n interfaceC2386n, InterfaceC6055y0 interfaceC6055y0);
}
