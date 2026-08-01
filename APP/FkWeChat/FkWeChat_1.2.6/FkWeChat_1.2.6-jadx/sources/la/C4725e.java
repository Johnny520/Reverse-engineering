package la;

import java.util.LinkedList;
import java.util.List;
import p143ja.C3783p;
import p143ja.C3784q;
import p172l8.C4716w;
import p185m8.AbstractC5081g0;
import p215oc.C5729x;

/* JADX INFO: renamed from: la.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4725e implements InterfaceC4724d {

    /* JADX INFO: renamed from: a */
    public final C3784q f14007a;

    /* JADX INFO: renamed from: b */
    public final C3783p f14008b;

    /* JADX INFO: renamed from: la.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f14009a;

        static {
            int[] iArr = new int[C3783p.c.EnumC10125c.values().length];
            try {
                iArr[C3783p.c.EnumC10125c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3783p.c.EnumC10125c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3783p.c.EnumC10125c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14009a = iArr;
        }
    }

    public C4725e(C3784q c3784q, C3783p c3783p) {
        c3784q.getClass();
        c3783p.getClass();
        this.f14007a = c3784q;
        this.f14008b = c3783p;
    }

    @Override // la.InterfaceC4724d
    /* JADX INFO: renamed from: a */
    public String mo18869a(int i10) {
        C4716w c4716wM18871c = m18871c(i10);
        List list = (List) c4716wM18871c.m18809a();
        String strM20585s0 = AbstractC5081g0.m20585s0((List) c4716wM18871c.m18810b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return strM20585s0;
        }
        return AbstractC5081g0.m20585s0(list, "/", null, null, 0, null, null, 62, null) + '/' + strM20585s0;
    }

    @Override // la.InterfaceC4724d
    /* JADX INFO: renamed from: b */
    public boolean mo18870b(int i10) {
        return ((Boolean) m18871c(i10).m18814f()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final C4716w m18871c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            C3783p.c cVarM14704v = this.f14008b.m14704v(i10);
            String strM14756v = this.f14007a.m14756v(cVarM14704v.m14732z());
            C3783p.c.EnumC10125c enumC10125cM14730x = cVarM14704v.m14730x();
            enumC10125cM14730x.getClass();
            int i11 = a.f14009a[enumC10125cM14730x.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(strM14756v);
            } else if (i11 == 2) {
                linkedList.addFirst(strM14756v);
            } else {
                if (i11 != 3) {
                    C5729x.m23182a();
                    return null;
                }
                linkedList2.addFirst(strM14756v);
                z10 = true;
            }
            i10 = cVarM14704v.m14731y();
        }
        return new C4716w(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // la.InterfaceC4724d
    public String getString(int i10) {
        String strM14756v = this.f14007a.m14756v(i10);
        strM14756v.getClass();
        return strM14756v;
    }
}
