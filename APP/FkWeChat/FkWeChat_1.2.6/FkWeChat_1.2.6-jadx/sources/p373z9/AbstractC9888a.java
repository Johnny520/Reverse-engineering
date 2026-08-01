package p373z9;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p037cb.InterfaceC1504w;
import p172l8.C4700i0;
import p213oa.C5695f;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5992d;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6039s1;
import sa.AbstractC7263m;
import sa.C7265o;

/* JADX INFO: renamed from: z9.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9888a {

    /* JADX INFO: renamed from: z9.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends AbstractC7263m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC1504w f33350a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f33351b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f33352c;

        /* JADX INFO: renamed from: z9.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public class C10259a implements InterfaceC0184l {
            public C10259a() {
            }

            /* JADX INFO: renamed from: a */
            private static /* synthetic */ void m38377a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
            }

            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public C4700i0 mo27m(InterfaceC5986b interfaceC5986b) {
                if (interfaceC5986b == null) {
                    m38377a(0);
                }
                a.this.f33350a.mo5887a(interfaceC5986b);
                return C4700i0.f13910a;
            }
        }

        public a(InterfaceC1504w interfaceC1504w, Set set, boolean z10) {
            this.f33350a = interfaceC1504w;
            this.f33351b = set;
            this.f33352c = z10;
        }

        /* JADX INFO: renamed from: f */
        private static /* synthetic */ void m38376f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "fromSuper";
            } else if (i10 == 2) {
                objArr[0] = "fromCurrent";
            } else if (i10 == 3) {
                objArr[0] = "member";
            } else if (i10 != 4) {
                objArr[0] = "fakeOverride";
            } else {
                objArr[0] = "overridden";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "setOverriddenDescriptors";
            } else {
                objArr[2] = "addFakeOverride";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // sa.AbstractC7264n
        /* JADX INFO: renamed from: a */
        public void mo7475a(InterfaceC5986b interfaceC5986b) {
            if (interfaceC5986b == null) {
                m38376f(0);
            }
            C7265o.m28800K(interfaceC5986b, new C10259a());
            this.f33351b.add(interfaceC5986b);
        }

        @Override // sa.AbstractC7264n
        /* JADX INFO: renamed from: d */
        public void mo28792d(InterfaceC5986b interfaceC5986b, Collection collection) {
            if (interfaceC5986b == null) {
                m38376f(3);
            }
            if (collection == null) {
                m38376f(4);
            }
            if (!this.f33352c || interfaceC5986b.mo12678j() == InterfaceC5986b.a.FAKE_OVERRIDE) {
                super.mo28792d(interfaceC5986b, collection);
            }
        }

        @Override // sa.AbstractC7263m
        /* JADX INFO: renamed from: e */
        public void mo7476e(InterfaceC5986b interfaceC5986b, InterfaceC5986b interfaceC5986b2) {
            if (interfaceC5986b == null) {
                m38376f(1);
            }
            if (interfaceC5986b2 == null) {
                m38376f(2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m38371a(int i10) {
        String str = i10 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 18 ? 3 : 2];
        switch (i10) {
            case 1:
            case 7:
            case Opcodes.FCONST_2 /* 13 */:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case Opcodes.DCONST_0 /* 14 */:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.SIPUSH /* 17 */:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case Opcodes.FCONST_1 /* 12 */:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case Opcodes.LDC /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i10) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
                objArr[2] = "resolveOverrides";
                break;
            case Opcodes.LDC /* 18 */:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6039s1 m38372b(C5695f c5695f, InterfaceC5995e interfaceC5995e) {
        if (c5695f == null) {
            m38371a(19);
        }
        if (interfaceC5995e == null) {
            m38371a(20);
        }
        Collection collectionMo5590l = interfaceC5995e.mo5590l();
        if (collectionMo5590l.size() != 1) {
            return null;
        }
        for (InterfaceC6039s1 interfaceC6039s1 : ((InterfaceC5992d) collectionMo5590l.iterator().next()).mo12680m()) {
            if (interfaceC6039s1.getName().equals(c5695f)) {
                return interfaceC6039s1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Collection m38373c(C5695f c5695f, Collection collection, Collection collection2, InterfaceC5995e interfaceC5995e, InterfaceC1504w interfaceC1504w, C7265o c7265o, boolean z10) {
        if (c5695f == null) {
            m38371a(12);
        }
        if (collection == null) {
            m38371a(13);
        }
        if (collection2 == null) {
            m38371a(14);
        }
        if (interfaceC5995e == null) {
            m38371a(15);
        }
        if (interfaceC1504w == null) {
            m38371a(16);
        }
        if (c7265o == null) {
            m38371a(17);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c7265o.m28830v(c5695f, collection, collection2, interfaceC5995e, new a(interfaceC1504w, linkedHashSet, z10));
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: d */
    public static Collection m38374d(C5695f c5695f, Collection collection, Collection collection2, InterfaceC5995e interfaceC5995e, InterfaceC1504w interfaceC1504w, C7265o c7265o) {
        if (c5695f == null) {
            m38371a(0);
        }
        if (collection == null) {
            m38371a(1);
        }
        if (collection2 == null) {
            m38371a(2);
        }
        if (interfaceC5995e == null) {
            m38371a(3);
        }
        if (interfaceC1504w == null) {
            m38371a(4);
        }
        if (c7265o == null) {
            m38371a(5);
        }
        return m38373c(c5695f, collection, collection2, interfaceC5995e, interfaceC1504w, c7265o, false);
    }

    /* JADX INFO: renamed from: e */
    public static Collection m38375e(C5695f c5695f, Collection collection, Collection collection2, InterfaceC5995e interfaceC5995e, InterfaceC1504w interfaceC1504w, C7265o c7265o) {
        if (c5695f == null) {
            m38371a(6);
        }
        if (collection == null) {
            m38371a(7);
        }
        if (collection2 == null) {
            m38371a(8);
        }
        if (interfaceC5995e == null) {
            m38371a(9);
        }
        if (interfaceC1504w == null) {
            m38371a(10);
        }
        if (c7265o == null) {
            m38371a(11);
        }
        return m38373c(c5695f, collection, collection2, interfaceC5995e, interfaceC1504w, c7265o, true);
    }
}
