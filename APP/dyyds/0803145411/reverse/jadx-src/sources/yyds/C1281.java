package yyds;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛶᛲᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C1281 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f5883;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5884;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public int f5885;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Object f5886;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f5887;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Object f5888;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f5889;

    public C1281(int i) {
        this.f5884 = 0;
        this.f5885 = i;
        if (i <= 0) {
            AbstractC0024.m3301("maxSize <= 0");
            throw null;
        }
        this.f5888 = new C2225(0);
        this.f5886 = new C1586();
    }

    public String toString() {
        String str;
        switch (this.f5884) {
            case 0:
                synchronized (((C1586) this.f5886)) {
                    try {
                        int i = this.f5889;
                        int i2 = this.f5883 + i;
                        str = "LruCache[maxSize=" + this.f5885 + ",hits=" + this.f5889 + ",misses=" + this.f5883 + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Object m2548(Object obj) {
        Object objPut;
        synchronized (((C1586) this.f5886)) {
            Object obj2 = ((C2225) this.f5888).f10988.get(obj);
            if (obj2 != null) {
                this.f5889++;
                return obj2;
            }
            this.f5883++;
            Object objMo1617 = mo1617(obj);
            if (objMo1617 == null) {
                return null;
            }
            synchronized (((C1586) this.f5886)) {
                objPut = ((C2225) this.f5888).f10988.put(obj, objMo1617);
                if (objPut != null) {
                    ((C2225) this.f5888).f10988.put(obj, objPut);
                } else {
                    this.f5887++;
                }
            }
            if (objPut != null) {
                mo1618(obj, objMo1617, objPut);
                return objPut;
            }
            m2549(this.f5885);
            return objMo1617;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2549(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (((C1586) this.f5886)) {
                try {
                    if (this.f5887 < 0 || (((C2225) this.f5888).f10988.isEmpty() && this.f5887 != 0)) {
                        break;
                    }
                    if (this.f5887 <= i || ((C2225) this.f5888).f10988.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) AbstractC1595.m3282(((C2225) this.f5888).f10988.entrySet());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    ((C2225) this.f5888).f10988.remove(key);
                    this.f5887--;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mo1618(key, value, null);
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public int m2550(int i) {
        int i2 = this.f5887;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f5888).size() == 0) {
            return i;
        }
        m2552();
        return this.f5887;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int m2551() {
        return ((StaggeredGridLayoutManager) this.f5886).f353 ? m2554(r1.size() - 1, -1) : m2554(0, ((ArrayList) this.f5888).size());
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public void m2552() {
        View view = (View) ((ArrayList) this.f5888).get(r0.size() - 1);
        C1042 c1042 = (C1042) view.getLayoutParams();
        this.f5887 = ((StaggeredGridLayoutManager) this.f5886).f351.mo1056(view);
        c1042.getClass();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public void m2553() {
        ((ArrayList) this.f5888).clear();
        this.f5885 = Integer.MIN_VALUE;
        this.f5887 = Integer.MIN_VALUE;
        this.f5889 = 0;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int m2554(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5886;
        int iMo1038 = staggeredGridLayoutManager.f351.mo1038();
        int iMo1039 = staggeredGridLayoutManager.f351.mo1039();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f5888).get(i);
            int iMo1046 = staggeredGridLayoutManager.f351.mo1046(view);
            int iMo1056 = staggeredGridLayoutManager.f351.mo1056(view);
            boolean z = iMo1046 <= iMo1039;
            boolean z2 = iMo1056 >= iMo1038;
            if (z && z2 && (iMo1046 < iMo1038 || iMo1056 > iMo1039)) {
                return AbstractC2551.m4603(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int m2555(int i) {
        ArrayList arrayList = (ArrayList) this.f5888;
        int i2 = this.f5885;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        C1042 c1042 = (C1042) view.getLayoutParams();
        this.f5885 = ((StaggeredGridLayoutManager) this.f5886).f351.mo1046(view);
        c1042.getClass();
        return this.f5885;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public Object m2556(Object obj, Object obj2) {
        Object objPut;
        synchronized (((C1586) this.f5886)) {
            this.f5887++;
            objPut = ((C2225) this.f5888).f10988.put(obj, obj2);
            if (objPut != null) {
                this.f5887--;
            }
        }
        if (objPut != null) {
            mo1618(obj, objPut, obj2);
        }
        m2549(this.f5885);
        return objPut;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public View m2557(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f5886;
        ArrayList arrayList = (ArrayList) this.f5888;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f353 && AbstractC2551.m4603(view2) >= i) || ((!staggeredGridLayoutManager.f353 && AbstractC2551.m4603(view2) <= i) || !view2.hasFocusable())) {
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
            if ((staggeredGridLayoutManager.f353 && AbstractC2551.m4603(view3) <= i) || ((!staggeredGridLayoutManager.f353 && AbstractC2551.m4603(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public Object mo1617(Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int m2558() {
        return ((StaggeredGridLayoutManager) this.f5886).f353 ? m2554(0, ((ArrayList) this.f5888).size()) : m2554(r1.size() - 1, -1);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public void mo1618(Object obj, Object obj2, Object obj3) {
    }

    public C1281(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f5884 = 1;
        this.f5886 = staggeredGridLayoutManager;
        this.f5888 = new ArrayList();
        this.f5885 = Integer.MIN_VALUE;
        this.f5887 = Integer.MIN_VALUE;
        this.f5889 = 0;
        this.f5883 = i;
    }
}
