package Yue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7559 {

    /* JADX INFO: renamed from: ۥ */
    public final ArrayList<Object> f2943;

    public C7559(int i) {
        this.f2943 = new ArrayList<>(i);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m3730(Object obj) {
        this.f2943.add(obj);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m3731(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f2943;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f2943, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f2943.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f2943.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f2943.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m23657() {
        return this.f2943.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Object[] m23658(Object[] objArr) {
        return this.f2943.toArray(objArr);
    }
}
