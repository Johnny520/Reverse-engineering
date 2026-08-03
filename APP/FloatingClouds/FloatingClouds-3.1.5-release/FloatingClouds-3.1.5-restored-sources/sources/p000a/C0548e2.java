package p000a;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p000a.C0240N3;

/* JADX INFO: renamed from: a.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0548e2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList<C0240N3> f2022a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final a f2023b = new a();

    /* JADX INFO: renamed from: c */
    public final C0258O3 f2024c;

    /* JADX INFO: renamed from: a.e2$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public C0240N3.a f2025a;

        /* JADX INFO: renamed from: b */
        public C0240N3.a f2026b;

        /* JADX INFO: renamed from: c */
        public int f2027c;

        /* JADX INFO: renamed from: d */
        public int f2028d;

        /* JADX INFO: renamed from: e */
        public int f2029e;

        /* JADX INFO: renamed from: f */
        public int f2030f;

        /* JADX INFO: renamed from: g */
        public int f2031g;

        /* JADX INFO: renamed from: h */
        public boolean f2032h;

        /* JADX INFO: renamed from: i */
        public boolean f2033i;

        /* JADX INFO: renamed from: j */
        public boolean f2034j;
    }

    /* JADX INFO: renamed from: a.e2$b */
    public interface b {
    }

    public C0548e2(C0258O3 c0258o3) {
        this.f2024c = c0258o3;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1320a(b bVar, C0240N3 c0240n3, boolean z) {
        C0240N3.a[] aVarArr = c0240n3.f792J;
        C0240N3.a aVar = aVarArr[0];
        a aVar2 = this.f2023b;
        aVar2.f2025a = aVar;
        aVar2.f2026b = aVarArr[1];
        aVar2.f2027c = c0240n3.m648l();
        aVar2.f2028d = c0240n3.m645i();
        aVar2.f2033i = false;
        aVar2.f2034j = z;
        C0240N3.a aVar3 = aVar2.f2025a;
        C0240N3.a aVar4 = C0240N3.a.f841c;
        boolean z2 = aVar3 == aVar4;
        boolean z3 = aVar2.f2026b == aVar4;
        boolean z4 = z2 && c0240n3.f796N > 0.0f;
        boolean z5 = z3 && c0240n3.f796N > 0.0f;
        C0240N3.a aVar5 = C0240N3.a.f839a;
        int[] iArr = c0240n3.f824l;
        if (z4 && iArr[0] == 4) {
            aVar2.f2025a = aVar5;
        }
        if (z5 && iArr[1] == 4) {
            aVar2.f2026b = aVar5;
        }
        ((ConstraintLayout.C1045b) bVar).m2414a(c0240n3, aVar2);
        c0240n3.m661y(aVar2.f2029e);
        c0240n3.m658v(aVar2.f2030f);
        c0240n3.f835w = aVar2.f2032h;
        int i = aVar2.f2031g;
        c0240n3.f800R = i;
        c0240n3.f835w = i > 0;
        aVar2.f2034j = false;
        return aVar2.f2033i;
    }

    /* JADX INFO: renamed from: b */
    public final void m1321b(C0258O3 c0258o3, int i, int i2) {
        int i3 = c0258o3.f801S;
        int i4 = c0258o3.f802T;
        c0258o3.f801S = 0;
        c0258o3.f802T = 0;
        c0258o3.m661y(i);
        c0258o3.m658v(i2);
        if (i3 < 0) {
            c0258o3.f801S = 0;
        } else {
            c0258o3.f801S = i3;
        }
        if (i4 < 0) {
            c0258o3.f802T = 0;
        } else {
            c0258o3.f802T = i4;
        }
        this.f2024c.mo742B();
    }
}
