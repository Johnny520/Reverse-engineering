package p043Y;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.emoji2.text.C0494s;
import androidx.emoji2.text.C0497v;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import p001A0.AbstractC0040p;
import p004C.C0061b;
import p023M.C0247a;
import p023M.C0248b;
import p063j.C0957b;
import p063j.C0960e;
import p063j.C0966k;

/* JADX INFO: renamed from: Y.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0463v {

    /* JADX INFO: renamed from: a */
    public Object f1044a;

    /* JADX INFO: renamed from: b */
    public Object f1045b;

    /* JADX INFO: renamed from: c */
    public Object f1046c;

    /* JADX INFO: renamed from: d */
    public Object f1047d;

    public C0463v(int r2) {
        switch(r2) {
            case 3: goto L5;
            default: goto L3;
        };
    L3:
        this.f1044a = new C0957b();
        this.f1046c = new SparseArray();
        this.f1047d = new C0960e();
        this.f1045b = new C0957b();
        return;
    L5:
        this.f1044a = new C0061b(10);
        this.f1045b = new C0966k();
        this.f1046c = new ArrayList();
        this.f1047d = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public void m1092a(Object r5, ArrayList r6, HashSet r7) {
        if (r6.contains(r5) == false) goto L6;
        return;
    L6:
        if (r7.contains(r5) == true) goto L15;
        r7.add(r5);
        ArrayList r02 = (ArrayList) ((C0966k) this.f1045b).getOrDefault(r5, null);
        if (r02 == null) goto L12;
        int r1 = r02.size();
        int r2 = 0;
    L10:
        if (r2 >= r1) goto L12;
        m1092a(r02.get(r2), r6, r7);
        r2 = r2 + 1;
    L12:
        r7.remove(r5);
        r6.add(r5);
        return;
    L15:
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public C0463v(Typeface r6, C0248b r7) {
        this.f1047d = r6;
        this.f1044a = r7;
        this.f1046c = new C0494s(1024);
        int r02 = r7.m205a(6);
        if (r02 == 0) goto L5;
        int r03 = r02 + r7.f211a;
        int r04 = ((ByteBuffer) r7.f214d).getInt(((ByteBuffer) r7.f214d).getInt(r03) + r03);
    L6:
        this.f1045b = new char[r04 * 2];
        int r62 = r7.m205a(6);
        if (r62 == 0) goto L9;
        int r63 = r62 + r7.f211a;
        int r64 = ((ByteBuffer) r7.f214d).getInt(((ByteBuffer) r7.f214d).getInt(r63) + r63);
    L10:
        int r72 = 0;
    L11:
        if (r72 >= r64) goto L21;
        C0497v r05 = new C0497v(this, r72);
        C0247a r2 = r05.m1220c();
        int r3 = r2.m205a(4);
        if (r3 == 0) goto L15;
        int r22 = ((ByteBuffer) r2.f214d).getInt(r3 + r2.f211a);
    L16:
        Character.toChars(r22, (char[]) this.f1045b, r72 * 2);
        if (r05.m1219b() <= 0) goto L19;
        boolean r23 = true;
    L20:
        AbstractC0040p.m104g("invalid metadata codepoint length", r23);
        ((C0494s) this.f1046c).m1212a(r05, 0, r05.m1219b() - 1);
        r72 = r72 + 1;
        goto L11
    L19:
        r23 = false;
        goto L20
    L15:
        r22 = 0;
        goto L16
    L21:
        return;
    L9:
        r64 = 0;
        goto L10
    L5:
        r04 = 0;
        goto L6
    }
}
