package androidx.compose.ui.graphics.vector;

import androidx.profileinstaller.AbstractC2442;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.km.KmEffectType;
import p007.C6151;
import p175.AbstractC7739;
import p223.C7992;
import p233.C8076;
import p286.InterfaceC8401;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f4600;

    public C1562(int i, boolean z) {
        switch (i) {
            case 2:
                this.f4600 = new ArrayList();
                break;
            case 3:
                this.f4600 = new ArrayList();
                break;
            case 4:
            case 5:
            default:
                this.f4600 = new ArrayList(32);
                break;
            case 6:
                this.f4600 = new ArrayList(20);
                break;
            case 7:
                this.f4600 = new ArrayList();
                break;
            case 8:
                this.f4600 = new ArrayList();
                break;
            case 9:
                this.f4600 = new ArrayList();
                break;
            case 10:
                this.f4600 = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m2836(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4600.add(new C1563(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m2837() {
        this.f4600.add(C1566.f4615);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6151 m2838() {
        return new C6151((String[]) this.f4600.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m2839(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.f4600;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            if (!(obj instanceof Iterator)) {
                C5925.m11308(AbstractC2442.m4581(obj, new StringBuilder("Don't know how to spread ")));
                return;
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m2840(String str, String str2) {
        str.getClass();
        str2.getClass();
        AbstractC7739.m13058(str);
        AbstractC7739.m13057(str2, str);
        AbstractC7739.m13082(this, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2841(Object obj) {
        this.f4600.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m2842(float f, float f2, float f3, float f4) {
        this.f4600.add(new C1560(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m2843(float f, float f2) {
        this.f4600.add(new C1555(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m2844(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4600;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m2845(Class cls) {
        if (cls.getSuperclass() != null) {
            m2845(cls.getSuperclass());
        }
        this.f4600.addAll(Arrays.asList(cls.getDeclaredMethods()));
        for (Class<?> cls2 : cls.getInterfaces()) {
            m2845(cls2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2846(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4600.add(new C1550(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m2847(float f, float f2) {
        this.f4600.add(new C1556(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2848(float f, float f2) {
        this.f4600.add(new C1553(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public synchronized InterfaceC8401 m2849(Class cls) {
        int size = this.f4600.size();
        for (int i = 0; i < size; i++) {
            C7992 c7992 = (C7992) this.f4600.get(i);
            if (c7992.f22078.isAssignableFrom(cls)) {
                return c7992.f22077;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public synchronized ArrayList m2850(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C8076 c8076 : this.f4600) {
            if ((c8076.f22265.isAssignableFrom(cls) && cls2.isAssignableFrom(c8076.f22264)) && !arrayList.contains(c8076.f22264)) {
                arrayList.add(c8076.f22264);
            }
        }
        return arrayList;
    }

    public C1562(int i) {
        this.f4600 = new ArrayList(i);
    }

    public C1562(KmEffectType kmEffectType) {
        kmEffectType.getClass();
        this.f4600 = new ArrayList(1);
    }

    public C1562(ArrayList arrayList) {
        this.f4600 = arrayList;
    }
}
