package p172l8;

import p010a9.InterfaceC0173a;
import p215oc.C5729x;

/* JADX INFO: renamed from: l8.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4706m {

    /* JADX INFO: renamed from: l8.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13920a;

        static {
            int[] iArr = new int[EnumC4708o.values().length];
            try {
                iArr[EnumC4708o.f13921q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4708o.f13922r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4708o.f13923s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13920a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC4705l m18787a(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        return new C4715v(interfaceC0173a, null, 2, null);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC4705l m18788b(EnumC4708o enumC4708o, InterfaceC0173a interfaceC0173a) {
        enumC4708o.getClass();
        interfaceC0173a.getClass();
        int i10 = a.f13920a[enumC4708o.ordinal()];
        if (i10 == 1) {
            return new C4715v(interfaceC0173a, null, 2, null);
        }
        if (i10 == 2) {
            return new C4714u(interfaceC0173a);
        }
        if (i10 == 3) {
            return new C4702j0(interfaceC0173a);
        }
        C5729x.m23182a();
        return null;
    }
}
