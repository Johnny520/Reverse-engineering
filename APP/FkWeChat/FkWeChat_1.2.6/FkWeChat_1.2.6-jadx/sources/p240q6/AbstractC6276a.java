package p240q6;

import gf.EnumC2795d;
import p086ff.AbstractC2441i;
import p086ff.InterfaceC2440h;
import p209o6.EnumC5647j;
import p209o6.InterfaceC5648k;
import p215oc.C5729x;
import p376zd.C9987e;

/* JADX INFO: renamed from: q6.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6276a {

    /* JADX INFO: renamed from: q6.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19677a;

        static {
            int[] iArr = new int[EnumC5647j.values().length];
            try {
                iArr[EnumC5647j.f17767s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5647j.f17768t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5647j.f17769u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5647j.f17770v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC5647j.f17771w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC5647j.f17772x.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f19677a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2440h m24862a(InterfaceC5648k interfaceC5648k) {
        interfaceC5648k.getClass();
        InterfaceC2440h interfaceC2440hM8855a = AbstractC2441i.m8855a(interfaceC5648k.getName());
        interfaceC2440hM8855a.getClass();
        return interfaceC2440hM8855a;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC2795d m24863b(EnumC5647j enumC5647j) {
        enumC5647j.getClass();
        switch (a.f19677a[enumC5647j.ordinal()]) {
            case 1:
                return EnumC2795d.TRACE;
            case 2:
                return EnumC2795d.DEBUG;
            case 3:
                return EnumC2795d.INFO;
            case 4:
                return EnumC2795d.WARN;
            case 5:
                return EnumC2795d.ERROR;
            case 6:
                C9987e.m38645a("OFF level is not supported");
                return null;
            default:
                C5729x.m23182a();
                return null;
        }
    }
}
