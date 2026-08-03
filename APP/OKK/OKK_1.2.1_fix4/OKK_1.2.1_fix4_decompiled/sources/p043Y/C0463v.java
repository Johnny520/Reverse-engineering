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

    public C0463v(int i2) {
        switch (i2) {
            case 3:
                this.f1044a = new C0061b(10);
                this.f1045b = new C0966k();
                this.f1046c = new ArrayList();
                this.f1047d = new HashSet();
                break;
            default:
                this.f1044a = new C0957b();
                this.f1046c = new SparseArray();
                this.f1047d = new C0960e();
                this.f1045b = new C0957b();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1092a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0966k) this.f1045b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                m1092a(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public C0463v(Typeface typeface, C0248b c0248b) {
        int i2;
        int i3;
        this.f1047d = typeface;
        this.f1044a = c0248b;
        this.f1046c = new C0494s(1024);
        int iM205a = c0248b.m205a(6);
        if (iM205a != 0) {
            int i4 = iM205a + c0248b.f211a;
            i2 = ((ByteBuffer) c0248b.f214d).getInt(((ByteBuffer) c0248b.f214d).getInt(i4) + i4);
        } else {
            i2 = 0;
        }
        this.f1045b = new char[i2 * 2];
        int iM205a2 = c0248b.m205a(6);
        if (iM205a2 != 0) {
            int i5 = iM205a2 + c0248b.f211a;
            i3 = ((ByteBuffer) c0248b.f214d).getInt(((ByteBuffer) c0248b.f214d).getInt(i5) + i5);
        } else {
            i3 = 0;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            C0497v c0497v = new C0497v(this, i6);
            C0247a c0247aM1220c = c0497v.m1220c();
            int iM205a3 = c0247aM1220c.m205a(4);
            Character.toChars(iM205a3 != 0 ? ((ByteBuffer) c0247aM1220c.f214d).getInt(iM205a3 + c0247aM1220c.f211a) : 0, (char[]) this.f1045b, i6 * 2);
            AbstractC0040p.m104g("invalid metadata codepoint length", c0497v.m1219b() > 0);
            ((C0494s) this.f1046c).m1212a(c0497v, 0, c0497v.m1219b() - 1);
        }
    }
}
