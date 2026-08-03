package p000a;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.fragment.app.C1103e;
import androidx.fragment.app.ComponentCallbacksC1100b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: a.A2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0003A2 {

    /* JADX INFO: renamed from: a */
    public Object f23a;

    /* JADX INFO: renamed from: b */
    public Object f24b;

    /* JADX INFO: renamed from: c */
    public Object f25c;

    /* JADX INFO: renamed from: d */
    public Object f26d;

    public C0003A2(int i) {
        switch (i) {
            case 2:
                this.f23a = new ArrayList();
                this.f24b = new HashMap();
                this.f25c = new HashMap();
                break;
            case 3:
                this.f23a = new C0166J1();
                this.f24b = new SparseArray();
                this.f25c = new C0371U9();
                this.f26d = new C0166J1();
                break;
            default:
                this.f23a = new C0051Cc(10);
                this.f24b = new C0598ge();
                this.f25c = new ArrayList();
                this.f26d = new HashSet();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m21a(ComponentCallbacksC1100b componentCallbacksC1100b) {
        if (((ArrayList) this.f23a).contains(componentCallbacksC1100b)) {
            throw new IllegalStateException("Fragment already added: " + componentCallbacksC1100b);
        }
        synchronized (((ArrayList) this.f23a)) {
            ((ArrayList) this.f23a).add(componentCallbacksC1100b);
        }
        componentCallbacksC1100b.f4567k = true;
    }

    /* JADX INFO: renamed from: b */
    public void m22b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0598ge) this.f24b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m22b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: c */
    public ComponentCallbacksC1100b m23c(String str) {
        C1103e c1103e = (C1103e) ((HashMap) this.f24b).get(str);
        if (c1103e != null) {
            return c1103e.f4607c;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public ComponentCallbacksC1100b m24d(String str) {
        for (C1103e c1103e : ((HashMap) this.f24b).values()) {
            if (c1103e != null) {
                ComponentCallbacksC1100b componentCallbacksC1100bM24d = c1103e.f4607c;
                if (!str.equals(componentCallbacksC1100bM24d.f4561e)) {
                    componentCallbacksC1100bM24d = componentCallbacksC1100bM24d.f4578v.f2060c.m24d(str);
                }
                if (componentCallbacksC1100bM24d != null) {
                    return componentCallbacksC1100bM24d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public ArrayList m25e() {
        ArrayList arrayList = new ArrayList();
        for (C1103e c1103e : ((HashMap) this.f24b).values()) {
            if (c1103e != null) {
                arrayList.add(c1103e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public ArrayList m26f() {
        ArrayList arrayList = new ArrayList();
        for (C1103e c1103e : ((HashMap) this.f24b).values()) {
            if (c1103e != null) {
                arrayList.add(c1103e.f4607c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public List m27g() {
        ArrayList arrayList;
        if (((ArrayList) this.f23a).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f23a)) {
            arrayList = new ArrayList((ArrayList) this.f23a);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public void m28h(C1103e c1103e) {
        ComponentCallbacksC1100b componentCallbacksC1100b = c1103e.f4607c;
        String str = componentCallbacksC1100b.f4561e;
        HashMap map = (HashMap) this.f24b;
        if (map.get(str) != null) {
            return;
        }
        map.put(componentCallbacksC1100b.f4561e, c1103e);
        if (AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + componentCallbacksC1100b);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m29i(C1103e c1103e) {
        ComponentCallbacksC1100b componentCallbacksC1100b = c1103e.f4607c;
        if (componentCallbacksC1100b.f4539C) {
            ((C0667k7) this.f26d).m1541f(componentCallbacksC1100b);
        }
        HashMap map = (HashMap) this.f24b;
        if (map.get(componentCallbacksC1100b.f4561e) == c1103e && ((C1103e) map.put(componentCallbacksC1100b.f4561e, null)) != null && AbstractC0553e7.m1330J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + componentCallbacksC1100b);
        }
    }

    /* JADX INFO: renamed from: j */
    public Bundle m30j(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f25c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
