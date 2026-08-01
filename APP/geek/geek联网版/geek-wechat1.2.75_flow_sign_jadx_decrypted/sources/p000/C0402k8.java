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

/* JADX INFO: renamed from: k8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0402k8 {

    /* JADX INFO: renamed from: a */
    public Object f2794a;

    /* JADX INFO: renamed from: b */
    public Object f2795b;

    /* JADX INFO: renamed from: c */
    public Object f2796c;

    /* JADX INFO: renamed from: d */
    public Object f2797d;

    public C0402k8(int i) {
        switch (i) {
            case 4:
                this.f2794a = new C0511n6();
                this.f2795b = new SparseArray();
                this.f2796c = new C0235fs();
                this.f2797d = new C0511n6();
                break;
            default:
                this.f2794a = new C0048ay(10);
                this.f2795b = new b40();
                this.f2796c = new ArrayList();
                this.f2797d = new HashSet();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1661a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((b40) this.f2795b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m1661a(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b */
    public o50 m1662b(AbstractC0506n1 abstractC0506n1) {
        ArrayList arrayList = (ArrayList) this.f2796c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            o50 o50Var = (o50) arrayList.get(i);
            if (o50Var != null && o50Var.f3406b == abstractC0506n1) {
                return o50Var;
            }
        }
        o50 o50Var2 = new o50((Context) this.f2795b, abstractC0506n1);
        arrayList.add(o50Var2);
        return o50Var2;
    }

    /* JADX INFO: renamed from: c */
    public boolean m1663c(AbstractC0506n1 abstractC0506n1, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2794a).onActionItemClicked(m1662b(abstractC0506n1), new MenuItemC0045av((Context) this.f2795b, (s50) menuItem));
    }

    /* JADX INFO: renamed from: d */
    public boolean m1664d(AbstractC0506n1 abstractC0506n1, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f2794a;
        o50 o50VarM1662b = m1662b(abstractC0506n1);
        b40 b40Var = (b40) this.f2797d;
        Menu menuC0573ov = (Menu) b40Var.getOrDefault(menu, null);
        if (menuC0573ov == null) {
            menuC0573ov = new MenuC0573ov((Context) this.f2795b, (MenuC0646qu) menu);
            b40Var.put(menu, menuC0573ov);
        }
        return callback.onCreateActionMode(o50VarM1662b, menuC0573ov);
    }

    public C0402k8(Typeface typeface, C0165dw c0165dw) {
        int i;
        int i2;
        int i3;
        int i4;
        this.f2797d = typeface;
        this.f2794a = c0165dw;
        this.f2796c = new C0202ew(1024);
        int iM2795a = c0165dw.m2795a(6);
        if (iM2795a != 0) {
            int i5 = iM2795a + c0165dw.f5547a;
            i = ((ByteBuffer) c0165dw.f5550d).getInt(((ByteBuffer) c0165dw.f5550d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.f2795b = new char[i * 2];
        int iM2795a2 = c0165dw.m2795a(6);
        if (iM2795a2 != 0) {
            int i6 = iM2795a2 + c0165dw.f5547a;
            i2 = ((ByteBuffer) c0165dw.f5550d).getInt(((ByteBuffer) c0165dw.f5550d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            C0597pi c0597pi = new C0597pi(this, i7);
            C0129cw c0129cwM2091b = c0597pi.m2091b();
            int iM2795a3 = c0129cwM2091b.m2795a(4);
            Character.toChars(iM2795a3 != 0 ? ((ByteBuffer) c0129cwM2091b.f5550d).getInt(iM2795a3 + c0129cwM2091b.f5547a) : 0, (char[]) this.f2795b, i7 * 2);
            C0129cw c0129cwM2091b2 = c0597pi.m2091b();
            int iM2795a4 = c0129cwM2091b2.m2795a(16);
            if (iM2795a4 != 0) {
                int i8 = iM2795a4 + c0129cwM2091b2.f5547a;
                i3 = ((ByteBuffer) c0129cwM2091b2.f5550d).getInt(((ByteBuffer) c0129cwM2091b2.f5550d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            AbstractC0498mu.m1885b("invalid metadata codepoint length", i3 > 0);
            C0202ew c0202ew = (C0202ew) this.f2796c;
            C0129cw c0129cwM2091b3 = c0597pi.m2091b();
            int iM2795a5 = c0129cwM2091b3.m2795a(16);
            if (iM2795a5 != 0) {
                int i9 = iM2795a5 + c0129cwM2091b3.f5547a;
                i4 = ((ByteBuffer) c0129cwM2091b3.f5550d).getInt(((ByteBuffer) c0129cwM2091b3.f5550d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            c0202ew.m1032a(c0597pi, 0, i4 - 1);
        }
    }
}
