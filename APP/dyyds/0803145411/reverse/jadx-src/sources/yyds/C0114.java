package yyds;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: yyds.ᛱᛴᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0114 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final List f793;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ThreadLocal f794;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final ConcurrentHashMap f795;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0738 f796;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C2133 f797;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean f798;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2556 f799;

    public C0114(C0436 c0436) {
        this.f794 = new ThreadLocal();
        this.f795 = new ConcurrentHashMap();
        C2175 c2175 = c0436.f2221;
        HashMap map = new HashMap(c0436.f2222);
        this.f798 = true;
        this.f796 = c0436.f2220;
        C0436.m1225(c0436.f2224);
        C0436.m1225(c0436.f2226);
        List listM1225 = C0436.m1225(c0436.f2225);
        if (c0436 == C0436.f2211) {
            this.f797 = C0436.f2214;
            this.f799 = C0436.f2215;
            this.f793 = C0436.f2210;
        } else {
            C2133 c2133 = new C2133(map, 17, listM1225);
            this.f797 = c2133;
            C2556 c2556 = new C2556(c2133);
            this.f799 = c2556;
            this.f793 = c0436.m1226(c2133, c2556);
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f793 + ",instanceCreators:" + this.f797 + "}";
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String m515(Object obj) {
        boolean z = this.f798;
        C0738 c0738 = this.f796;
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            try {
                C1405 c1405 = new C1405(new C1811(sb));
                c1405.m2864(c0738);
                c1405.f6651 = z;
                c1405.f6653 = 2;
                c1405.f6647 = false;
                m518(c1405);
                return sb.toString();
            } catch (IOException e) {
                throw new C1600(e);
            }
        }
        Class<?> cls = obj.getClass();
        StringBuilder sb2 = new StringBuilder();
        try {
            C1405 c14052 = new C1405(new C1811(sb2));
            c14052.m2864(c0738);
            c14052.f6651 = z;
            c14052.f6653 = 2;
            c14052.f6647 = false;
            m520(obj, cls, c14052);
            return sb2.toString();
        } catch (IOException e2) {
            throw new C1600(e2);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object m516(String str, Type type) {
        return m517(str, new C2805(type));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object m517(String str, C2805 c2805) {
        Object obj = null;
        if (str == null) {
            return null;
        }
        C1942 c1942 = new C1942(new StringReader(str));
        boolean z = true;
        c1942.f9769 = 1;
        try {
            try {
                try {
                    c1942.m3744();
                    z = false;
                    AbstractC2720 abstractC2720M521 = m521(c2805);
                    Class cls = c2805.f13682;
                    Object objMo484 = abstractC2720M521.mo484(c1942);
                    Class clsM3953 = AbstractC2071.m3953(cls);
                    if (objMo484 != null && !clsM3953.isInstance(objMo484)) {
                        throw new ClassCastException("Type adapter '" + abstractC2720M521 + "' returned wrong type; requested " + cls + " but got instance of " + objMo484.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    c1942.f9769 = 2;
                    obj = objMo484;
                } catch (EOFException e) {
                    if (!z) {
                        throw new C1600(e);
                    }
                    c1942.f9769 = 2;
                } catch (IllegalStateException e2) {
                    throw new C1600(e2);
                }
                if (obj != null) {
                    try {
                        if (c1942.m3744() != 10) {
                            throw new C1600("JSON document was not fully consumed.");
                        }
                    } catch (C0838 e3) {
                        throw new C1600(e3);
                    } catch (IOException e4) {
                        throw new C1600(e4);
                    }
                }
                return obj;
            } catch (IOException e5) {
                throw new C1600(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e6.getMessage(), e6);
            }
        } catch (Throwable th) {
            c1942.f9769 = 2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m518(C1405 c1405) {
        C0232 c0232 = C0232.f1286;
        int i = c1405.f6653;
        boolean z = c1405.f6651;
        boolean z2 = c1405.f6647;
        c1405.f6651 = this.f798;
        c1405.f6647 = false;
        if (i == 2) {
            c1405.f6653 = 1;
        }
        try {
            try {
                C0369.f1893.getClass();
                C0369.m1069(c1405, c0232);
                c1405.f6653 = i;
                c1405.f6651 = z;
                c1405.f6647 = z2;
            } catch (IOException e) {
                throw new C1600(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            c1405.f6653 = i;
            c1405.f6651 = z;
            c1405.f6647 = z2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AbstractC2720 m519(Class cls) {
        return m521(new C2805(cls));
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m520(Object obj, Class cls, C1405 c1405) {
        AbstractC2720 abstractC2720M521 = m521(new C2805(cls));
        int i = c1405.f6653;
        if (i == 2) {
            c1405.f6653 = 1;
        }
        boolean z = c1405.f6651;
        boolean z2 = c1405.f6647;
        c1405.f6651 = this.f798;
        c1405.f6647 = false;
        try {
            try {
                abstractC2720M521.mo485(c1405, obj);
            } catch (IOException e) {
                throw new C1600(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.14.0): " + e2.getMessage(), e2);
            }
        } finally {
            c1405.f6653 = i;
            c1405.f6651 = z;
            c1405.f6647 = z2;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final AbstractC2720 m521(C2805 c2805) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f795;
        AbstractC2720 abstractC2720 = (AbstractC2720) concurrentHashMap.get(c2805);
        if (abstractC2720 != null) {
            return abstractC2720;
        }
        ThreadLocal threadLocal = this.f794;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            AbstractC2720 abstractC27202 = (AbstractC2720) map.get(c2805);
            if (abstractC27202 != null) {
                return abstractC27202;
            }
            z = false;
        }
        try {
            C1574 c1574 = new C1574();
            map.put(c2805, c1574);
            Iterator it = this.f793.iterator();
            AbstractC2720 abstractC2720Mo976 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                abstractC2720Mo976 = ((InterfaceC0652) it.next()).mo976(this, c2805);
                if (abstractC2720Mo976 != null) {
                    if (c1574.f7978 != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    c1574.f7978 = abstractC2720Mo976;
                    map.put(c2805, abstractC2720Mo976);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (abstractC2720Mo976 == null) {
                C0188.m795(c2805, "GSON (2.14.0) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return abstractC2720Mo976;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public C0114() {
        this(C0436.f2211);
    }
}
