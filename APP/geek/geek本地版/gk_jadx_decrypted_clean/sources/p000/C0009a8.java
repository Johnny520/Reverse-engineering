package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: a8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0009a8 {

    /* JADX INFO: renamed from: a */
    public Object f64a;

    /* JADX INFO: renamed from: b */
    public Object f65b;

    /* JADX INFO: renamed from: c */
    public Object f66c;

    /* JADX INFO: renamed from: d */
    public Object f67d;

    public C0009a8(int i) {
        switch (i) {
            case 4:
                this.f64a = new C0511n6();
                this.f65b = new SparseArray();
                this.f66c = new C0079bs();
                this.f67d = new C0511n6();
                break;
            default:
                this.f64a = new C0724sx(10);
                this.f65b = new u30();
                this.f66c = new ArrayList();
                this.f67d = new HashSet();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((u30) this.f65b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m25a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public h50 m26b(AbstractC0506n1 abstractC0506n1) {
        ArrayList arrayList = (ArrayList) this.f66c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h50 h50Var = (h50) arrayList.get(i);
            if (h50Var != null && h50Var.f2237b == abstractC0506n1) {
                return h50Var;
            }
        }
        h50 h50Var2 = new h50((Context) this.f65b, abstractC0506n1);
        arrayList.add(h50Var2);
        return h50Var2;
    }

    /* JADX INFO: renamed from: c */
    public boolean m27c(AbstractC0506n1 abstractC0506n1, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f64a).onActionItemClicked(m26b(abstractC0506n1), new MenuItemC0721su((Context) this.f65b, (l50) menuItem));
    }

    /* JADX INFO: renamed from: d */
    public boolean m28d(AbstractC0506n1 abstractC0506n1, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f64a;
        h50 h50VarM26b = m26b(abstractC0506n1);
        u30 u30Var = (u30) this.f67d;
        Menu menuC0275gv = (Menu) u30Var.getOrDefault(menu, null);
        if (menuC0275gv == null) {
            menuC0275gv = new MenuC0275gv((Context) this.f65b, (MenuC0424ku) menu);
            u30Var.put(menu, menuC0275gv);
        }
        return callback.onCreateActionMode(h50VarM26b, menuC0275gv);
    }

    public C0009a8(Typeface typeface, C0870wv c0870wv) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f67d = typeface;
        this.f64a = c0870wv;
        this.f66c = new C0907xv(1024);
        int iM2359a = c0870wv.m2359a(6);
        if (iM2359a != 0) {
            int i5 = iM2359a + c0870wv.f4510a;
            i = ((ByteBuffer) c0870wv.f4513d).getInt(((ByteBuffer) c0870wv.f4513d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f65b = new char[i * 2];
        int iM2359a2 = c0870wv.m2359a(6);
        if (iM2359a2 != 0) {
            int i6 = iM2359a2 + c0870wv.f4510a;
            i2 = ((ByteBuffer) c0870wv.f4513d).getInt(((ByteBuffer) c0870wv.f4513d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C0523ni c0523ni = new C0523ni(this, i7);
            C0833vv c0833vvM1946b = c0523ni.m1946b();
            int iM2359a3 = c0833vvM1946b.m2359a(4);
            Character.toChars(iM2359a3 != 0 ? ((ByteBuffer) c0833vvM1946b.f4513d).getInt(iM2359a3 + c0833vvM1946b.f4510a) : 0, (char[]) this.f65b, i7 * 2);
            C0833vv c0833vvM1946b2 = c0523ni.m1946b();
            int iM2359a4 = c0833vvM1946b2.m2359a(16);
            if (iM2359a4 != 0) {
                int i8 = iM2359a4 + c0833vvM1946b2.f4510a;
                i3 = ((ByteBuffer) c0833vvM1946b2.f4513d).getInt(((ByteBuffer) c0833vvM1946b2.f4513d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC0979zt.m2823d("invalid metadata codepoint length", i3 > 0);
            C0907xv c0907xv = (C0907xv) this.f66c;
            C0833vv c0833vvM1946b3 = c0523ni.m1946b();
            int iM2359a5 = c0833vvM1946b3.m2359a(16);
            if (iM2359a5 != 0) {
                int i9 = iM2359a5 + c0833vvM1946b3.f4510a;
                i4 = ((ByteBuffer) c0833vvM1946b3.f4513d).getInt(((ByteBuffer) c0833vvM1946b3.f4513d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c0907xv.m2637a(c0523ni, 0, i4 - 1);
        }
    }
}
