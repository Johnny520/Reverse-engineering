package p373z9;

import gb.AbstractC2706r0;
import java.util.Collections;
import java.util.List;
import p081fa.InterfaceC2390r;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5995e;

/* JADX INFO: renamed from: z9.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9902o {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC9902o f33382a = new a();

    /* JADX INFO: renamed from: z9.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a implements InterfaceC9902o {
        /* JADX INFO: renamed from: c */
        public static /* synthetic */ void m38409c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p373z9.InterfaceC9902o
        /* JADX INFO: renamed from: a */
        public void mo38407a(InterfaceC5986b interfaceC5986b, List list) {
            if (interfaceC5986b == null) {
                m38409c(5);
            }
            if (list == null) {
                m38409c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // p373z9.InterfaceC9902o
        /* JADX INFO: renamed from: b */
        public b mo38408b(InterfaceC2390r interfaceC2390r, InterfaceC5995e interfaceC5995e, AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02, List list, List list2) {
            if (interfaceC2390r == null) {
                m38409c(0);
            }
            if (interfaceC5995e == null) {
                m38409c(1);
            }
            if (abstractC2706r0 == null) {
                m38409c(2);
            }
            if (list == null) {
                m38409c(3);
            }
            if (list2 == null) {
                m38409c(4);
            }
            return new b(abstractC2706r0, abstractC2706r02, list, list2, Collections.EMPTY_LIST, false);
        }
    }

    /* JADX INFO: renamed from: z9.o$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final AbstractC2706r0 f33383a;

        /* JADX INFO: renamed from: b */
        public final AbstractC2706r0 f33384b;

        /* JADX INFO: renamed from: c */
        public final List f33385c;

        /* JADX INFO: renamed from: d */
        public final List f33386d;

        /* JADX INFO: renamed from: e */
        public final List f33387e;

        /* JADX INFO: renamed from: f */
        public final boolean f33388f;

        public b(AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02, List list, List list2, List list3, boolean z10) {
            if (abstractC2706r0 == null) {
                m38410a(0);
            }
            if (list == null) {
                m38410a(1);
            }
            if (list2 == null) {
                m38410a(2);
            }
            if (list3 == null) {
                m38410a(3);
            }
            this.f33383a = abstractC2706r0;
            this.f33384b = abstractC2706r02;
            this.f33385c = list;
            this.f33386d = list2;
            this.f33387e = list3;
            this.f33388f = z10;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m38410a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: renamed from: b */
        public List m38411b() {
            List list = this.f33387e;
            if (list == null) {
                m38410a(7);
            }
            return list;
        }

        /* JADX INFO: renamed from: c */
        public AbstractC2706r0 m38412c() {
            return this.f33384b;
        }

        /* JADX INFO: renamed from: d */
        public AbstractC2706r0 m38413d() {
            AbstractC2706r0 abstractC2706r0 = this.f33383a;
            if (abstractC2706r0 == null) {
                m38410a(4);
            }
            return abstractC2706r0;
        }

        /* JADX INFO: renamed from: e */
        public List m38414e() {
            List list = this.f33386d;
            if (list == null) {
                m38410a(6);
            }
            return list;
        }

        /* JADX INFO: renamed from: f */
        public List m38415f() {
            List list = this.f33385c;
            if (list == null) {
                m38410a(5);
            }
            return list;
        }

        /* JADX INFO: renamed from: g */
        public boolean m38416g() {
            return this.f33388f;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo38407a(InterfaceC5986b interfaceC5986b, List list);

    /* JADX INFO: renamed from: b */
    b mo38408b(InterfaceC2390r interfaceC2390r, InterfaceC5995e interfaceC5995e, AbstractC2706r0 abstractC2706r0, AbstractC2706r0 abstractC2706r02, List list, List list2);
}
