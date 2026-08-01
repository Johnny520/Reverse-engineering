package p213oa;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p024b9.AbstractC1061t;
import p215oc.C5729x;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: oa.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5694e {

    /* JADX INFO: renamed from: oa.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17909a;

        static {
            int[] iArr = new int[EnumC5700k.values().length];
            try {
                iArr[EnumC5700k.f18029q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5700k.f18031s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5700k.f18030r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17909a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m23018a(C5692c c5692c, Map map) {
        Object next;
        c5692c.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C5692c c5692c2 = (C5692c) entry.getKey();
            if (AbstractC1061t.m3842c(c5692c, c5692c2) || m23019b(c5692c, c5692c2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = m23024g((C5692c) ((Map.Entry) next).getKey(), c5692c).m22994a().length();
                do {
                    Object next2 = it.next();
                    int length2 = m23024g((C5692c) ((Map.Entry) next2).getKey(), c5692c).m22994a().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m23019b(C5692c c5692c, C5692c c5692c2) {
        c5692c.getClass();
        c5692c2.getClass();
        return AbstractC1061t.m3842c(m23023f(c5692c), c5692c2);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m23020c(String str, String str2) {
        return AbstractC8611a0.m33075T(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m23021d(C5692c c5692c, C5692c c5692c2) {
        c5692c.getClass();
        c5692c2.getClass();
        if (AbstractC1061t.m3842c(c5692c, c5692c2) || c5692c2.m22996c()) {
            return true;
        }
        return m23020c(c5692c.m22994a(), c5692c2.m22994a());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m23022e(String str) {
        if (str == null) {
            return false;
        }
        EnumC5700k enumC5700k = EnumC5700k.f18029q;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = a.f17909a[enumC5700k.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(cCharAt)) {
                    return false;
                }
                enumC5700k = EnumC5700k.f18030r;
            } else {
                if (i11 != 3) {
                    C5729x.m23182a();
                    return false;
                }
                if (cCharAt == '.') {
                    enumC5700k = EnumC5700k.f18031s;
                } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
            }
        }
        return enumC5700k != EnumC5700k.f18031s;
    }

    /* JADX INFO: renamed from: f */
    public static final C5692c m23023f(C5692c c5692c) {
        c5692c.getClass();
        if (c5692c.m22996c()) {
            return null;
        }
        return c5692c.m22997d();
    }

    /* JADX INFO: renamed from: g */
    public static final C5692c m23024g(C5692c c5692c, C5692c c5692c2) {
        c5692c.getClass();
        c5692c2.getClass();
        return (!m23021d(c5692c, c5692c2) || c5692c2.m22996c()) ? c5692c : AbstractC1061t.m3842c(c5692c, c5692c2) ? C5692c.f17899d : new C5692c(c5692c.m22994a().substring(c5692c2.m22994a().length() + 1));
    }
}
