package p182m5;

import bsh.C1193i2;
import bsh.C1259t2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import p020b5.C0996b;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: m5.l0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5002l0 extends AbstractC5012q0 {

    /* JADX INFO: renamed from: j */
    public static final Comparator f15207j = new a();

    /* JADX INFO: renamed from: f */
    public final ArrayList f15208f;

    /* JADX INFO: renamed from: g */
    public final HashMap f15209g;

    /* JADX INFO: renamed from: h */
    public final c f15210h;

    /* JADX INFO: renamed from: i */
    public int f15211i;

    /* JADX INFO: renamed from: m5.l0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC5004m0 abstractC5004m0, AbstractC5004m0 abstractC5004m02) {
            return abstractC5004m0.mo20091c().compareTo(abstractC5004m02.mo20091c());
        }
    }

    /* JADX INFO: renamed from: m5.l0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15212a;

        static {
            int[] iArr = new int[c.values().length];
            f15212a = iArr;
            try {
                iArr[c.INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15212a[c.TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: m5.l0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum c {
        NONE,
        TYPE,
        INSTANCE
    }

    public C5002l0(String str, C5009p c5009p, int i10, c cVar) {
        super(str, c5009p, i10);
        this.f15208f = new ArrayList(100);
        this.f15209g = new HashMap(100);
        this.f15210h = cVar;
        this.f15211i = -1;
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: b */
    public int mo20186b(AbstractC4982b0 abstractC4982b0) {
        return ((AbstractC5004m0) abstractC4982b0).m20201l();
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: g */
    public Collection mo20137g() {
        return this.f15208f;
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: i */
    public void mo20187i() {
        C5009p c5009pM20274e = m20274e();
        int i10 = 0;
        while (true) {
            int size = this.f15208f.size();
            if (i10 >= size) {
                return;
            }
            while (i10 < size) {
                ((AbstractC5004m0) this.f15208f.get(i10)).mo20090a(c5009pM20274e);
                i10++;
            }
        }
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: n */
    public int mo20188n() {
        m20278k();
        return this.f15211i;
    }

    @Override // p182m5.AbstractC5012q0
    /* JADX INFO: renamed from: p */
    public void mo20189p(InterfaceC8819a interfaceC8819a) {
        boolean zMo33828k = interfaceC8819a.mo33828k();
        C5009p c5009pM20274e = m20274e();
        boolean z10 = true;
        int iMo20111h = 0;
        for (AbstractC5004m0 abstractC5004m0 : this.f15208f) {
            if (zMo33828k) {
                if (z10) {
                    z10 = false;
                } else {
                    interfaceC8819a.mo33825d(0, "\n");
                }
            }
            int iM20202n = abstractC5004m0.m20202n() - 1;
            int i10 = (~iM20202n) & (iMo20111h + iM20202n);
            if (iMo20111h != i10) {
                interfaceC8819a.mo33865e(i10 - iMo20111h);
                iMo20111h = i10;
            }
            abstractC5004m0.mo20112i(c5009pM20274e, interfaceC8819a);
            iMo20111h += abstractC5004m0.mo20111h();
        }
        if (iMo20111h == this.f15211i) {
            return;
        }
        C1193i2.m4438a("output size mismatch");
    }

    /* JADX INFO: renamed from: q */
    public void m20190q(AbstractC5004m0 abstractC5004m0) {
        m20279l();
        try {
            if (abstractC5004m0.m20202n() > m20273d()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f15208f.add(abstractC5004m0);
        } catch (NullPointerException unused) {
            C1259t2.m5095a("item == null");
        }
    }

    /* JADX INFO: renamed from: r */
    public synchronized AbstractC5004m0 m20191r(AbstractC5004m0 abstractC5004m0) {
        m20279l();
        AbstractC5004m0 abstractC5004m02 = (AbstractC5004m0) this.f15209g.get(abstractC5004m0);
        if (abstractC5004m02 != null) {
            return abstractC5004m02;
        }
        m20190q(abstractC5004m0);
        this.f15209g.put(abstractC5004m0, abstractC5004m0);
        return abstractC5004m0;
    }

    /* JADX INFO: renamed from: s */
    public void m20192s() {
        m20278k();
        int i10 = b.f15212a[this.f15210h.ordinal()];
        if (i10 == 1) {
            Collections.sort(this.f15208f);
        } else if (i10 == 2) {
            Collections.sort(this.f15208f, f15207j);
        }
        int size = this.f15208f.size();
        int iMo20111h = 0;
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC5004m0 abstractC5004m0 = (AbstractC5004m0) this.f15208f.get(i11);
            try {
                int iM20204r = abstractC5004m0.m20204r(this, iMo20111h);
                if (iM20204r < iMo20111h) {
                    throw new RuntimeException("bogus place() result for " + abstractC5004m0);
                }
                iMo20111h = abstractC5004m0.mo20111h() + iM20204r;
            } catch (RuntimeException e10) {
                throw C0996b.m3684b(e10, "...while placing " + abstractC5004m0);
            }
        }
        this.f15211i = iMo20111h;
    }

    /* JADX INFO: renamed from: t */
    public void m20193t(InterfaceC8819a interfaceC8819a, EnumC4984c0 enumC4984c0, String str) {
        m20278k();
        TreeMap treeMap = new TreeMap();
        for (AbstractC5004m0 abstractC5004m0 : this.f15208f) {
            if (abstractC5004m0.mo20091c() == enumC4984c0) {
                treeMap.put(abstractC5004m0.mo20094u(), abstractC5004m0);
            }
        }
        if (treeMap.size() == 0) {
            return;
        }
        interfaceC8819a.mo33825d(0, str);
        for (Map.Entry entry : treeMap.entrySet()) {
            interfaceC8819a.mo33825d(0, ((AbstractC5004m0) entry.getValue()).m20203p() + ' ' + ((String) entry.getKey()) + '\n');
        }
    }
}
