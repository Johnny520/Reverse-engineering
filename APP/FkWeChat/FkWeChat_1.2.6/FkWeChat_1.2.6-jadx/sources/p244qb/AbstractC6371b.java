package p244qb;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: qb.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6371b {

    /* JADX INFO: renamed from: qb.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0184l f20104a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean[] f20105b;

        public a(InterfaceC0184l interfaceC0184l, boolean[] zArr) {
            this.f20104a = interfaceC0184l;
            this.f20105b = zArr;
        }

        @Override // p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: c */
        public boolean mo5739c(Object obj) {
            if (((Boolean) this.f20104a.mo27m(obj)).booleanValue()) {
                this.f20105b[0] = true;
            }
            return !this.f20105b[0];
        }

        @Override // p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean mo5738a() {
            return Boolean.valueOf(this.f20105b[0]);
        }
    }

    /* JADX INFO: renamed from: qb.b$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface c {
        /* JADX INFO: renamed from: a */
        Iterable mo5655a(Object obj);
    }

    /* JADX INFO: renamed from: qb.b$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface d {
        /* JADX INFO: renamed from: a */
        Object mo5738a();

        /* JADX INFO: renamed from: b */
        void mo25352b(Object obj);

        /* JADX INFO: renamed from: c */
        boolean mo5739c(Object obj);
    }

    /* JADX INFO: renamed from: qb.b$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo25353a(Object obj);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m25346a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case Opcodes.FCONST_0 /* 11 */:
            case 15:
            case Opcodes.LDC /* 18 */:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.FLOAD /* 23 */:
                objArr[0] = "neighbors";
                break;
            case 2:
            case Opcodes.FCONST_1 /* 12 */:
            case 16:
            case 19:
            case Opcodes.DLOAD /* 24 */:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.ALOAD /* 25 */:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case Opcodes.SIPUSH /* 17 */:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case Opcodes.DCONST_0 /* 14 */:
                objArr[0] = "node";
                break;
            case Opcodes.LLOAD /* 22 */:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LDC /* 18 */:
            case 19:
            case 20:
            case Opcodes.ILOAD /* 21 */:
                objArr[2] = "topologicalOrder";
                break;
            case Opcodes.LLOAD /* 22 */:
            case Opcodes.FLOAD /* 23 */:
            case Opcodes.DLOAD /* 24 */:
            case Opcodes.ALOAD /* 25 */:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX INFO: renamed from: b */
    public static Object m25347b(Collection collection, c cVar, d dVar) {
        if (collection == null) {
            m25346a(4);
        }
        if (cVar == null) {
            m25346a(5);
        }
        if (dVar == null) {
            m25346a(6);
        }
        return m25348c(collection, cVar, new f(), dVar);
    }

    /* JADX INFO: renamed from: c */
    public static Object m25348c(Collection collection, c cVar, e eVar, d dVar) {
        if (collection == null) {
            m25346a(0);
        }
        if (cVar == null) {
            m25346a(1);
        }
        if (eVar == null) {
            m25346a(2);
        }
        if (dVar == null) {
            m25346a(3);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m25349d(it.next(), cVar, eVar, dVar);
        }
        return dVar.mo5738a();
    }

    /* JADX INFO: renamed from: d */
    public static void m25349d(Object obj, c cVar, e eVar, d dVar) {
        if (obj == null) {
            m25346a(22);
        }
        if (cVar == null) {
            m25346a(23);
        }
        if (eVar == null) {
            m25346a(24);
        }
        if (dVar == null) {
            m25346a(25);
        }
        if (eVar.mo25353a(obj) && dVar.mo5739c(obj)) {
            Iterator it = cVar.mo5655a(obj).iterator();
            while (it.hasNext()) {
                m25349d(it.next(), cVar, eVar, dVar);
            }
            dVar.mo25352b(obj);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m25350e(Collection collection, c cVar, InterfaceC0184l interfaceC0184l) {
        if (collection == null) {
            m25346a(7);
        }
        if (cVar == null) {
            m25346a(8);
        }
        if (interfaceC0184l == null) {
            m25346a(9);
        }
        return (Boolean) m25347b(collection, cVar, new a(interfaceC0184l, new boolean[1]));
    }

    /* JADX INFO: renamed from: qb.b$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class f implements e {

        /* JADX INFO: renamed from: a */
        public final Set f20106a;

        public f(Set set) {
            if (set == null) {
                m25354b(0);
            }
            this.f20106a = set;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m25354b(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // p244qb.AbstractC6371b.e
        /* JADX INFO: renamed from: a */
        public boolean mo25353a(Object obj) {
            return this.f20106a.add(obj);
        }

        public f() {
            this(new HashSet());
        }
    }

    /* JADX INFO: renamed from: qb.b$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class b implements d {
        @Override // p244qb.AbstractC6371b.d
        /* JADX INFO: renamed from: b */
        public void mo25352b(Object obj) {
        }
    }
}
