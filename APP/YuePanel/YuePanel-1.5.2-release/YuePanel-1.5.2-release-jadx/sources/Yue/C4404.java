package Yue;

import Yue.C6702;
import Yue.InterfaceC7144;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public final class C4404<T> {

    /* JADX INFO: renamed from: ۥ */
    public final C6702.InterfaceC1067<ArrayList<T>> f870 = new C6702.C1068(10);

    /* JADX INFO: renamed from: ۥ۟ */
    public final C7467<T, ArrayList<T>> f871 = new C7467<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ArrayList<T> f9078 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final HashSet<T> f9079 = new HashSet<>();

    /* JADX INFO: renamed from: ۥ */
    public void m1352(@InterfaceC6391 T t, @InterfaceC6391 T t2) {
        if (!this.f871.containsKey(t) || !this.f871.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListM12749 = this.f871.get(t);
        if (arrayListM12749 == null) {
            arrayListM12749 = m12749();
            this.f871.put(t, arrayListM12749);
        }
        arrayListM12749.add(t2);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1353(@InterfaceC6391 T t) {
        if (this.f871.containsKey(t)) {
            return;
        }
        this.f871.put(t, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m12746() {
        int size = this.f871.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListValueAt = this.f871.valueAt(i);
            if (arrayListValueAt != null) {
                m12754(arrayListValueAt);
            }
        }
        this.f871.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m12747(@InterfaceC6391 T t) {
        return this.f871.containsKey(t);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m12748(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f871.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m12748(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final ArrayList<T> m12749() {
        ArrayList<T> arrayListAcquire = this.f870.acquire();
        return arrayListAcquire == null ? new ArrayList<>() : arrayListAcquire;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public List m12750(@InterfaceC6391 T t) {
        return this.f871.get(t);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public List<T> m12751(@InterfaceC6391 T t) {
        int size = this.f871.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListValueAt = this.f871.valueAt(i);
            if (arrayListValueAt != null && arrayListValueAt.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f871.keyAt(i));
            }
        }
        return arrayList;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public ArrayList<T> m12752() {
        this.f9078.clear();
        this.f9079.clear();
        int size = this.f871.size();
        for (int i = 0; i < size; i++) {
            m12748(this.f871.keyAt(i), this.f9078, this.f9079);
        }
        return this.f9078;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m12753(@InterfaceC6391 T t) {
        int size = this.f871.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> arrayListValueAt = this.f871.valueAt(i);
            if (arrayListValueAt != null && arrayListValueAt.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m12754(@InterfaceC6391 ArrayList<T> arrayList) {
        arrayList.clear();
        this.f870.release(arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m12755() {
        return this.f871.size();
    }
}
