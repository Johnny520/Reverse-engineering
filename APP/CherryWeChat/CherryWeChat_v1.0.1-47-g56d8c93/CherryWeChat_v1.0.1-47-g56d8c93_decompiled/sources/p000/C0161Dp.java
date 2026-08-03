package p000;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Dp */
/* JADX INFO: loaded from: classes.dex */
public class C0161Dp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f437a;

    /* JADX INFO: renamed from: b */
    public int f438b;

    /* JADX INFO: renamed from: c */
    public int f439c;

    /* JADX INFO: renamed from: d */
    public int f440d;

    /* JADX INFO: renamed from: e */
    public int f441e;

    /* JADX INFO: renamed from: f */
    public final Object f442f;

    /* JADX INFO: renamed from: g */
    public final Object f443g;

    public C0161Dp(int i) {
        this.f437a = 0;
        this.f438b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f442f = new C1017Xm(2);
        this.f443g = new C0668Pg(16);
    }

    /* JADX INFO: renamed from: a */
    public void m302a() {
        View view = (View) ((ArrayList) this.f442f).get(r0.size() - 1);
        C0771Ry c0771Ry = (C0771Ry) view.getLayoutParams();
        this.f439c = ((StaggeredGridLayoutManager) this.f443g).f3991c.mo5251b(view);
        c0771Ry.getClass();
    }

    /* JADX INFO: renamed from: b */
    public void m303b() {
        ((ArrayList) this.f442f).clear();
        this.f438b = Integer.MIN_VALUE;
        this.f439c = Integer.MIN_VALUE;
        this.f440d = 0;
    }

    /* JADX INFO: renamed from: c */
    public int m304c() {
        return ((StaggeredGridLayoutManager) this.f443g).f3996h ? m306e(r0.size() - 1, -1) : m306e(0, ((ArrayList) this.f442f).size());
    }

    /* JADX INFO: renamed from: d */
    public int m305d() {
        return ((StaggeredGridLayoutManager) this.f443g).f3996h ? m306e(0, ((ArrayList) this.f442f).size()) : m306e(r0.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public int m306e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f443g;
        int iMo5260k = staggeredGridLayoutManager.f3991c.mo5260k();
        int iMo5256g = staggeredGridLayoutManager.f3991c.mo5256g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f442f).get(i);
            int iMo5254e = staggeredGridLayoutManager.f3991c.mo5254e(view);
            int iMo5251b = staggeredGridLayoutManager.f3991c.mo5251b(view);
            boolean z = iMo5254e <= iMo5256g;
            boolean z2 = iMo5251b >= iMo5260k;
            if (z && z2 && (iMo5254e < iMo5260k || iMo5251b > iMo5256g)) {
                return staggeredGridLayoutManager.getPosition(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public Object m307f(Object obj) {
        synchronized (((C0668Pg) this.f443g)) {
            Object obj2 = ((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).get(obj);
            if (obj2 != null) {
                this.f440d++;
                return obj2;
            }
            this.f441e++;
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m308g(int i) {
        int i2 = this.f439c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f442f).size() == 0) {
            return i;
        }
        m302a();
        return this.f439c;
    }

    /* JADX INFO: renamed from: h */
    public View m309h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f443g;
        ArrayList arrayList = (ArrayList) this.f442f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f3996h && staggeredGridLayoutManager.getPosition(view2) >= i) || ((!staggeredGridLayoutManager.f3996h && staggeredGridLayoutManager.getPosition(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.f3996h && staggeredGridLayoutManager.getPosition(view3) <= i) || ((!staggeredGridLayoutManager.f3996h && staggeredGridLayoutManager.getPosition(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: i */
    public int m310i(int i) {
        ArrayList arrayList = (ArrayList) this.f442f;
        int i2 = this.f438b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C0771Ry c0771Ry = (C0771Ry) view.getLayoutParams();
        this.f438b = ((StaggeredGridLayoutManager) this.f443g).f3991c.mo5254e(view);
        c0771Ry.getClass();
        return this.f438b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a7, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m311j(Object obj, Object obj2) {
        Object objPut;
        synchronized (((C0668Pg) this.f443g)) {
            this.f439c++;
            objPut = ((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).put(obj, obj2);
            if (objPut != null) {
                this.f439c--;
            }
        }
        int i = this.f438b;
        while (true) {
            synchronized (((C0668Pg) this.f443g)) {
                try {
                    if (this.f439c < 0 || (((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).isEmpty() && this.f439c != 0)) {
                        break;
                    }
                    if (this.f439c <= i || ((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).isEmpty()) {
                        break;
                    }
                    Set setEntrySet = ((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).entrySet();
                    Object next = null;
                    if (setEntrySet instanceof List) {
                        List list = (List) setEntrySet;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = setEntrySet.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return objPut;
                    }
                    Object key = entry.getKey();
                    entry.getValue();
                    ((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).remove(key);
                    this.f439c--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public String toString() {
        String str;
        switch (this.f437a) {
            case 0:
                synchronized (((C0668Pg) this.f443g)) {
                    try {
                        int i = this.f440d;
                        int i2 = this.f441e + i;
                        str = "LruCache[maxSize=" + this.f438b + ",hits=" + this.f440d + ",misses=" + this.f441e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C0161Dp(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f437a = 1;
        this.f443g = staggeredGridLayoutManager;
        this.f442f = new ArrayList();
        this.f438b = Integer.MIN_VALUE;
        this.f439c = Integer.MIN_VALUE;
        this.f440d = 0;
        this.f441e = i;
    }
}
