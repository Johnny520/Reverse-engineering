package na;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import la.InterfaceC4724d;
import ma.AbstractC5140a;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p185m8.C5095n0;

/* JADX INFO: renamed from: na.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5531f implements InterfaceC4724d {

    /* JADX INFO: renamed from: d */
    public static final a f17297d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final String f17298e;

    /* JADX INFO: renamed from: f */
    public static final List f17299f;

    /* JADX INFO: renamed from: g */
    public static final Map f17300g;

    /* JADX INFO: renamed from: a */
    public final String[] f17301a;

    /* JADX INFO: renamed from: b */
    public final Set f17302b;

    /* JADX INFO: renamed from: c */
    public final List f17303c;

    /* JADX INFO: renamed from: na.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17304a;

        static {
            int[] iArr = new int[AbstractC5140a.e.c.EnumC10157c.values().length];
            try {
                iArr[AbstractC5140a.e.c.EnumC10157c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5140a.e.c.EnumC10157c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC5140a.e.c.EnumC10157c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17304a = iArr;
        }
    }

    static {
        String strM20585s0 = AbstractC5081g0.m20585s0(AbstractC5114x.m20803r('k', 'o', 't', 'l', 'i', 'n'), _UrlKt.FRAGMENT_ENCODE_SET, null, null, 0, null, null, 62, null);
        f17298e = strM20585s0;
        List listM20803r = AbstractC5114x.m20803r(strM20585s0 + "/Any", strM20585s0 + "/Nothing", strM20585s0 + "/Unit", strM20585s0 + "/Throwable", strM20585s0 + "/Number", strM20585s0 + "/Byte", strM20585s0 + "/Double", strM20585s0 + "/Float", strM20585s0 + "/Int", strM20585s0 + "/Long", strM20585s0 + "/Short", strM20585s0 + "/Boolean", strM20585s0 + "/Char", strM20585s0 + "/CharSequence", strM20585s0 + "/String", strM20585s0 + "/Comparable", strM20585s0 + "/Enum", strM20585s0 + "/Array", strM20585s0 + "/ByteArray", strM20585s0 + "/DoubleArray", strM20585s0 + "/FloatArray", strM20585s0 + "/IntArray", strM20585s0 + "/LongArray", strM20585s0 + "/ShortArray", strM20585s0 + "/BooleanArray", strM20585s0 + "/CharArray", strM20585s0 + "/Cloneable", strM20585s0 + "/Annotation", strM20585s0 + "/collections/Iterable", strM20585s0 + "/collections/MutableIterable", strM20585s0 + "/collections/Collection", strM20585s0 + "/collections/MutableCollection", strM20585s0 + "/collections/List", strM20585s0 + "/collections/MutableList", strM20585s0 + "/collections/Set", strM20585s0 + "/collections/MutableSet", strM20585s0 + "/collections/Map", strM20585s0 + "/collections/MutableMap", strM20585s0 + "/collections/Map.Entry", strM20585s0 + "/collections/MutableMap.MutableEntry", strM20585s0 + "/collections/Iterator", strM20585s0 + "/collections/MutableIterator", strM20585s0 + "/collections/ListIterator", strM20585s0 + "/collections/MutableListIterator");
        f17299f = listM20803r;
        Iterable<C5095n0> iterableM20570f1 = AbstractC5081g0.m20570f1(listM20803r);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(iterableM20570f1, 10)), 16));
        for (C5095n0 c5095n0 : iterableM20570f1) {
            linkedHashMap.put((String) c5095n0.m20622d(), Integer.valueOf(c5095n0.m20621c()));
        }
        f17300g = linkedHashMap;
    }

    public AbstractC5531f(String[] strArr, Set set, List list) {
        strArr.getClass();
        set.getClass();
        list.getClass();
        this.f17301a = strArr;
        this.f17302b = set;
        this.f17303c = list;
    }

    @Override // la.InterfaceC4724d
    /* JADX INFO: renamed from: a */
    public String mo18869a(int i10) {
        return getString(i10);
    }

    @Override // la.InterfaceC4724d
    /* JADX INFO: renamed from: b */
    public boolean mo18870b(int i10) {
        return this.f17302b.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // la.InterfaceC4724d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(int r13) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: na.AbstractC5531f.getString(int):java.lang.String");
    }

    /* JADX INFO: renamed from: na.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
