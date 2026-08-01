package defpackage;

import android.util.Base64;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Serializable c;
    public final Serializable d;
    public final Object e;
    public final Object f;

    public y1(String r2, String r3, String r4, List r5) {
        this.a = 1;
        r2.getClass();
        this.b = r2;
        r3.getClass();
        this.c = r3;
        this.d = r4;
        r5.getClass();
        this.e = r5;
        this.f = r2 + "-" + r3 + "-" + r4;
    }

    public boolean a(int r9) {
        ArrayList r0 = (ArrayList) this.d;
        int r1 = r0.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L17;
        x1 r4 = (x1) r0.get(r3);
        int r5 = r4.a;
        if (r5 == 8) goto L7;
        if (r5 != 1) goto L16;
        int r52 = r4.b;
        int r42 = r4.c + r52;
    L11:
        if (r52 >= r42) goto L16;
        if (e(r52, r3 + 1) == r9) goto L14;
        r52 = r52 + 1;
    L14:
        return true;
    L16:
        r3 = r3 + 1;
        goto L3
    L7:
        if (e(r4.c, r3 + 1) != r9) goto L16;
    L17:
        return false;
    }

    public void b() {
        ez r0 = (ez) this.e;
        ArrayList r1 = (ArrayList) this.d;
        int r2 = r1.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L5;
        ((ez) this.e).a((x1) r1.get(r3));
        r3 = r3 + 1;
        goto L3
    L5:
        i(r1);
        ArrayList r12 = (ArrayList) this.c;
        int r22 = r12.size();
        int r32 = 0;
    L6:
        if (r32 >= r22) goto L21;
        x1 r4 = (x1) r12.get(r32);
        int r5 = r4.a;
        if (r5 != 1) goto L10;
        r0.a(r4);
        r0.d(r4.b, r4.c);
    L20:
        r32 = r32 + 1;
        goto L6
    L10:
        if (r5 != 2) goto L12;
        r0.a(r4);
        int r52 = r4.b;
        int r42 = r4.c;
        RecyclerView r7 = r0.a;
        r7.O(r52, r42, true);
        r7.f0 = true;
        r7.c0.c += r42;
        goto L20
    L12:
        if (r5 != 4) goto L14;
        r0.a(r4);
        r0.c(r4.b, r4.c);
        goto L20
    L14:
        if (r5 != 8) goto L20;
        r0.a(r4);
        r0.e(r4.b, r4.c);
        goto L20
    L21:
        i(r12);
    }

    public void c(x1 r13) {
        sx r0 = (sx) this.b;
        int r1 = r13.a;
        if (r1 == 1) goto L35;
        if (r1 == 8) goto L35;
        int r12 = j(r13.b, r1);
        int r3 = r13.b;
        int r4 = r13.a;
        if (r4 == 2) goto L12;
        if (r4 != 4) goto L11;
        int r42 = 1;
    L13:
        int r7 = 1;
        int r8 = 1;
    L15:
        if (r7 >= r13.c) goto L30;
        int r9 = j((r42 * r7) + r13.b, r13.a);
        int r10 = r13.a;
        if (r10 == 2) goto L23;
        if (r10 == 4) goto L21;
    L25:
        x1 r14 = g(r10, r12, r8);
        d(r14, r3);
        r0.c(r14);
        if (r13.a != 4) goto L28;
        r3 = r3 + r8;
    L28:
        r8 = 1;
        r12 = r9;
    L29:
        r7 = r7 + 1;
        goto L15
    L21:
        if (r9 != (r12 + 1)) goto L25;
    L24:
        r8 = r8 + 1;
        goto L29
    L23:
        if (r9 != r12) goto L25;
    L30:
        r0.c(r13);
        if (r8 <= 0) goto L39;
        x1 r132 = g(r13.a, r12, r8);
        d(r132, r3);
        r0.c(r132);
        return;
    L39:
        return;
    L11:
        throw new IllegalArgumentException("op should be remove or update." + r13);
    L12:
        r42 = 0;
    L35:
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void d(x1 r4, int r5) {
        ez r0 = (ez) this.e;
        r0.a(r4);
        int r1 = r4.a;
        if (r1 != 2) goto L5;
        int r42 = r4.c;
        RecyclerView r02 = r0.a;
        r02.O(r5, r42, true);
        r02.f0 = true;
        r02.c0.c += r42;
        return;
    L5:
        if (r1 != 4) goto L9;
        r0.c(r5, r4.c);
        return;
    L9:
        throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    }

    public int e(int r7, int r8) {
        ArrayList r0 = (ArrayList) this.d;
        int r1 = r0.size();
    L3:
        if (r8 >= r1) goto L27;
        x1 r2 = (x1) r0.get(r8);
        int r3 = r2.a;
        if (r3 != 8) goto L14;
        int r32 = r2.b;
        if (r32 != r7) goto L9;
        r7 = r2.c;
    L26:
        r8 = r8 + 1;
        goto L3
    L9:
        if (r32 >= r7) goto L12;
        r7 = r7 - 1;
    L12:
        if (r2.c > r7) goto L26;
        r7 = r7 + 1;
        goto L26
    L14:
        int r4 = r2.b;
        if (r4 > r7) goto L26;
        if (r3 != 2) goto L24;
        int r22 = r2.c;
        if (r7 < (r4 + r22)) goto L20;
        r7 = r7 - r22;
        goto L26
    L20:
        return -1;
    L24:
        if (r3 != 1) goto L26;
        r7 = r7 + r2.c;
        goto L26
    L27:
        return r7;
    }

    public boolean f() {
        if (((ArrayList) this.c).size() <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public x1 g(int r2, int r3, int r4) {
        x1 r0 = (x1) ((sx) this.b).a();
        if (r0 != null) goto L6;
        x1 r02 = new x1();
        r02.a = r2;
        r02.b = r3;
        r02.c = r4;
        return r02;
    L6:
        r0.a = r2;
        r0.b = r3;
        r0.c = r4;
        return r0;
    }

    public void h(x1 r5) {
        ez r0 = (ez) this.e;
        ((ArrayList) this.d).add(r5);
        int r1 = r5.a;
        if (r1 != 1) goto L5;
        r0.d(r5.b, r5.c);
        return;
    L5:
        if (r1 != 2) goto L7;
        int r12 = r5.b;
        int r52 = r5.c;
        RecyclerView r02 = r0.a;
        r02.O(r12, r52, false);
        r02.f0 = true;
        return;
    L7:
        if (r1 != 4) goto L9;
        r0.c(r5.b, r5.c);
        return;
    L9:
        if (r1 != 8) goto L13;
        r0.e(r5.b, r5.c);
        return;
    L13:
        throw new IllegalArgumentException("Unknown update op type for " + r5);
    }

    public void i(ArrayList r5) {
        int r0 = r5.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        x1 r2 = (x1) r5.get(r1);
        r2.getClass();
        ((sx) this.b).c(r2);
        r1 = r1 + 1;
        goto L3
    L5:
        r5.clear();
    }

    public int j(int r11, int r12) {
        sx r0 = (sx) this.b;
        ArrayList r1 = (ArrayList) this.d;
        int r2 = r1.size() - 1;
    L4:
        if (r2 < 0) goto L40;
        x1 r5 = (x1) r1.get(r2);
        int r6 = r5.a;
        if (r6 != 8) goto L29;
        int r4 = r5.b;
        int r62 = r5.c;
        if (r4 >= r62) goto L10;
        int r8 = r4;
        int r9 = r62;
    L11:
        if (r11 < r8) goto L24;
        if (r11 > r9) goto L24;
        if (r8 != r4) goto L19;
        if (r12 != 1) goto L16;
        r5.c = r62 + 1;
    L18:
        r11 = r11 + 1;
    L39:
        r2 = r2 - 1;
        goto L4
    L16:
        if (r12 != 2) goto L18;
        r5.c = r62 - 1;
        goto L18
    L19:
        if (r12 != 1) goto L21;
        r5.b = r4 + 1;
    L23:
        r11 = r11 - 1;
        goto L39
    L21:
        if (r12 != 2) goto L23;
        r5.b = r4 - 1;
    L24:
        if (r11 >= r4) goto L39;
        if (r12 != 1) goto L27;
        r5.b = r4 + 1;
        r5.c = r62 + 1;
        goto L39
    L27:
        if (r12 != 2) goto L39;
        r5.b = r4 - 1;
        r5.c = r62 - 1;
        goto L39
    L10:
        r9 = r4;
        r8 = r62;
        goto L11
    L29:
        int r42 = r5.b;
        if (r42 > r11) goto L35;
        if (r6 != 1) goto L33;
        r11 = r11 - r5.c;
        goto L39
    L33:
        if (r6 != 2) goto L39;
        r11 = r11 + r5.c;
        goto L39
    L35:
        if (r12 != 1) goto L37;
        r5.b = r42 + 1;
        goto L39
    L37:
        if (r12 != 2) goto L39;
        r5.b = r42 - 1;
        goto L39
    L40:
        int r122 = r1.size() - 1;
    L41:
        if (r122 < 0) goto L52;
        x1 r22 = (x1) r1.get(r122);
        if (r22.a != 8) goto L49;
        int r3 = r22.c;
        if (r3 == r22.b) goto L47;
        if (r3 < 0) goto L47;
    L51:
        r122 = r122 - 1;
    L47:
        r1.remove(r122);
        r0.c(r22);
        goto L51
    L49:
        if (r22.c > 0) goto L51;
        r1.remove(r122);
        r0.c(r22);
        goto L51
    L52:
        return r11;
    }

    public String toString() {
        switch(this.a) {
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        List r0 = (List) this.e;
        StringBuilder r1 = new StringBuilder();
        r1.append("FontRequest {mProviderAuthority: " + ((String) this.b) + ", mProviderPackage: " + ((String) this.c) + ", mQuery: " + ((String) this.d) + ", mCertificates:");
        int r3 = 0;
    L8:
        if (r3 >= r0.size()) goto L14;
        r1.append(" [");
        List r4 = (List) r0.get(r3);
        int r5 = 0;
    L11:
        if (r5 >= r4.size()) goto L13;
        r1.append(" \"");
        r1.append(Base64.encodeToString((byte[]) r4.get(r5), 0));
        r1.append("\"");
        r5 = r5 + 1;
        goto L11
    L13:
        r1.append(" ]");
        r3 = r3 + 1;
        goto L8
    L14:
        r1.append("}mCertificatesArray: 0");
        return r1.toString();
    L5:
        return super.toString();
    }

    public y1(ez r3) {
        this.a = 0;
        this.b = new sx(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = r3;
        this.f = new l0(22, this);
    }
}
