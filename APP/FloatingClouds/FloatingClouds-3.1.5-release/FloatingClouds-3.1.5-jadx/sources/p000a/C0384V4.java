package p000a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: a.V4 */
/* JADX INFO: loaded from: classes.dex */
public class C0384V4 implements InterfaceC0348T4 {

    /* JADX INFO: renamed from: d */
    public final AbstractC0639ih f1446d;

    /* JADX INFO: renamed from: f */
    public int f1448f;

    /* JADX INFO: renamed from: g */
    public int f1449g;

    /* JADX INFO: renamed from: a */
    public AbstractC0639ih f1443a = null;

    /* JADX INFO: renamed from: b */
    public boolean f1444b = false;

    /* JADX INFO: renamed from: c */
    public boolean f1445c = false;

    /* JADX INFO: renamed from: e */
    public a f1447e = a.f1455a;

    /* JADX INFO: renamed from: h */
    public int f1450h = 1;

    /* JADX INFO: renamed from: i */
    public C0684l5 f1451i = null;

    /* JADX INFO: renamed from: j */
    public boolean f1452j = false;

    /* JADX INFO: renamed from: k */
    public final ArrayList f1453k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final ArrayList f1454l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: a.V4$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f1455a;

        /* JADX INFO: renamed from: b */
        public static final a f1456b;

        /* JADX INFO: renamed from: c */
        public static final a f1457c;

        /* JADX INFO: renamed from: d */
        public static final a f1458d;

        /* JADX INFO: renamed from: e */
        public static final a f1459e;

        /* JADX INFO: renamed from: f */
        public static final a f1460f;

        /* JADX INFO: renamed from: g */
        public static final a f1461g;

        /* JADX INFO: renamed from: h */
        public static final a f1462h;

        /* JADX INFO: renamed from: i */
        public static final /* synthetic */ a[] f1463i;

        static {
            a aVar = new a("UNKNOWN", 0);
            f1455a = aVar;
            a aVar2 = new a("HORIZONTAL_DIMENSION", 1);
            f1456b = aVar2;
            a aVar3 = new a("VERTICAL_DIMENSION", 2);
            f1457c = aVar3;
            a aVar4 = new a("LEFT", 3);
            f1458d = aVar4;
            a aVar5 = new a("RIGHT", 4);
            f1459e = aVar5;
            a aVar6 = new a("TOP", 5);
            f1460f = aVar6;
            a aVar7 = new a("BOTTOM", 6);
            f1461g = aVar7;
            a aVar8 = new a("BASELINE", 7);
            f1462h = aVar8;
            f1463i = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f1463i.clone();
        }
    }

    public C0384V4(AbstractC0639ih abstractC0639ih) {
        this.f1446d = abstractC0639ih;
    }

    @Override // p000a.InterfaceC0348T4
    /* JADX INFO: renamed from: a */
    public final void mo521a(InterfaceC0348T4 interfaceC0348T4) {
        ArrayList<C0384V4> arrayList = this.f1454l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C0384V4) it.next()).f1452j) {
                return;
            }
        }
        this.f1445c = true;
        AbstractC0639ih abstractC0639ih = this.f1443a;
        if (abstractC0639ih != null) {
            abstractC0639ih.mo521a(this);
        }
        if (this.f1444b) {
            this.f1446d.mo521a(this);
            return;
        }
        C0384V4 c0384v4 = null;
        int i = 0;
        for (C0384V4 c0384v42 : arrayList) {
            if (!(c0384v42 instanceof C0684l5)) {
                i++;
                c0384v4 = c0384v42;
            }
        }
        if (c0384v4 != null && i == 1 && c0384v4.f1452j) {
            C0684l5 c0684l5 = this.f1451i;
            if (c0684l5 != null) {
                if (!c0684l5.f1452j) {
                    return;
                } else {
                    this.f1448f = this.f1450h * c0684l5.f1449g;
                }
            }
            mo1014d(c0384v4.f1449g + this.f1448f);
        }
        AbstractC0639ih abstractC0639ih2 = this.f1443a;
        if (abstractC0639ih2 != null) {
            abstractC0639ih2.mo521a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1012b(AbstractC0639ih abstractC0639ih) {
        this.f1453k.add(abstractC0639ih);
        if (this.f1452j) {
            abstractC0639ih.mo521a(abstractC0639ih);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1013c() {
        this.f1454l.clear();
        this.f1453k.clear();
        this.f1452j = false;
        this.f1449g = 0;
        this.f1445c = false;
        this.f1444b = false;
    }

    /* JADX INFO: renamed from: d */
    public void mo1014d(int i) {
        if (this.f1452j) {
            return;
        }
        this.f1452j = true;
        this.f1449g = i;
        for (InterfaceC0348T4 interfaceC0348T4 : this.f1453k) {
            interfaceC0348T4.mo521a(interfaceC0348T4);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1446d.f2343b.f807Y);
        sb.append(":");
        sb.append(this.f1447e);
        sb.append("(");
        sb.append(this.f1452j ? Integer.valueOf(this.f1449g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f1454l.size());
        sb.append(":d=");
        sb.append(this.f1453k.size());
        sb.append(">");
        return sb.toString();
    }
}
