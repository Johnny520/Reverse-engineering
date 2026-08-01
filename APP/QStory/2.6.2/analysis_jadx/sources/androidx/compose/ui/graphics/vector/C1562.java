package androidx.compose.ui.graphics.vector;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3065;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.km.KmEffectType;
import p015.C6224;
import p223.C7991;
import p233.C8075;
import p286.InterfaceC8400;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1562 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f4599;

    public C1562(int i, boolean z) {
        switch (i) {
            case 2:
                this.f4599 = new ArrayList();
                break;
            case 3:
                this.f4599 = new ArrayList();
                break;
            case 4:
            case 5:
            default:
                this.f4599 = new ArrayList(32);
                break;
            case 6:
                this.f4599 = new ArrayList(20);
                break;
            case 7:
                this.f4599 = new ArrayList();
                break;
            case 8:
                this.f4599 = new ArrayList();
                break;
            case 9:
                this.f4599 = new ArrayList();
                break;
            case 10:
                this.f4599 = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m2826(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4599.add(new C1563(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m2827() {
        this.f4599.add(C1566.f4614);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6224 m2828() {
        return new C6224((String[]) this.f4599.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m2829(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.f4599;
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
                C5919.m11247(AbstractC2442.m4571(obj, new StringBuilder("Don't know how to spread ")));
                return;
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m2830(String str, String str2) {
        str.getClass();
        str2.getClass();
        AbstractC3065.m6819(str);
        AbstractC3065.m6818(str2, str);
        AbstractC3065.m6839(this, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2831(Object obj) {
        this.f4599.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m2832(float f, float f2, float f3, float f4) {
        this.f4599.add(new C1560(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m2833(float f, float f2) {
        this.f4599.add(new C1555(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m2834(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4599;
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
    public void m2835(Class cls) {
        if (cls.getSuperclass() != null) {
            m2835(cls.getSuperclass());
        }
        this.f4599.addAll(Arrays.asList(cls.getDeclaredMethods()));
        for (Class<?> cls2 : cls.getInterfaces()) {
            m2835(cls2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2836(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4599.add(new C1550(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m2837(float f, float f2) {
        this.f4599.add(new C1556(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m2838(float f, float f2) {
        this.f4599.add(new C1553(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public synchronized InterfaceC8400 m2839(Class cls) {
        int size = this.f4599.size();
        for (int i = 0; i < size; i++) {
            C7991 c7991 = (C7991) this.f4599.get(i);
            if (c7991.f22081.isAssignableFrom(cls)) {
                return c7991.f22080;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public synchronized ArrayList m2840(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C8075 c8075 : this.f4599) {
            if ((c8075.f22267.isAssignableFrom(cls) && cls2.isAssignableFrom(c8075.f22266)) && !arrayList.contains(c8075.f22266)) {
                arrayList.add(c8075.f22266);
            }
        }
        return arrayList;
    }

    public C1562(int i) {
        this.f4599 = new ArrayList(i);
    }

    public C1562(KmEffectType kmEffectType) {
        kmEffectType.getClass();
        this.f4599 = new ArrayList(1);
    }

    public C1562(ArrayList arrayList) {
        this.f4599 = arrayList;
    }
}
