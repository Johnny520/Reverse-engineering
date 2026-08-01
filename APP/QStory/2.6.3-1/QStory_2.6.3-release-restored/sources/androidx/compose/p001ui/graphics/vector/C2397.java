package androidx.compose.p001ui.graphics.vector;

import androidx.profileinstaller.AbstractC3275;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.p009km.KmEffectType;
import p023.C6980;
import p191.AbstractC8568;
import p239.C8821;
import p249.C8905;
import p302.InterfaceC9230;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2397 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f4945;

    public C2397(int i, boolean z) {
        switch (i) {
            case 2:
                this.f4945 = new ArrayList();
                break;
            case 3:
                this.f4945 = new ArrayList();
                break;
            case 4:
            case 5:
            default:
                this.f4945 = new ArrayList(32);
                break;
            case 6:
                this.f4945 = new ArrayList(20);
                break;
            case 7:
                this.f4945 = new ArrayList();
                break;
            case 8:
                this.f4945 = new ArrayList();
                break;
            case 9:
                this.f4945 = new ArrayList();
                break;
            case 10:
                this.f4945 = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m3396(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4945.add(new C2398(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m3397() {
        this.f4945.add(C2401.f4960);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C6980 m3398() {
        return new C6980((String[]) this.f4945.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m3399(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.f4945;
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
                C6755.m11867(AbstractC3275.m5141(obj, new StringBuilder("Don't know how to spread ")));
                return;
            }
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m3400(String str, String str2) {
        str.getClass();
        str2.getClass();
        AbstractC8568.m13617(str);
        AbstractC8568.m13616(str2, str);
        AbstractC8568.m13641(this, str, str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m3401(Object obj) {
        this.f4945.add(obj);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void m3402(float f, float f2, float f3, float f4) {
        this.f4945.add(new C2395(f, f2, f3, f4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public void m3403(float f, float f2) {
        this.f4945.add(new C2390(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void m3404(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4945;
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
    public void m3405(Class cls) {
        if (cls.getSuperclass() != null) {
            m3405(cls.getSuperclass());
        }
        this.f4945.addAll(Arrays.asList(cls.getDeclaredMethods()));
        for (Class<?> cls2 : cls.getInterfaces()) {
            m3405(cls2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m3406(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4945.add(new C2385(f, f2, f3, f4, f5, f6));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void m3407(float f, float f2) {
        this.f4945.add(new C2391(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public void m3408(float f, float f2) {
        this.f4945.add(new C2388(f, f2));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public synchronized InterfaceC9230 m3409(Class cls) {
        int size = this.f4945.size();
        for (int i = 0; i < size; i++) {
            C8821 c8821 = (C8821) this.f4945.get(i);
            if (c8821.f22423.isAssignableFrom(cls)) {
                return c8821.f22422;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public synchronized ArrayList m3410(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C8905 c8905 : this.f4945) {
            if ((c8905.f22610.isAssignableFrom(cls) && cls2.isAssignableFrom(c8905.f22609)) && !arrayList.contains(c8905.f22609)) {
                arrayList.add(c8905.f22609);
            }
        }
        return arrayList;
    }

    public C2397(int i) {
        this.f4945 = new ArrayList(i);
    }

    public C2397(KmEffectType kmEffectType) {
        kmEffectType.getClass();
        this.f4945 = new ArrayList(1);
    }

    public C2397(ArrayList arrayList) {
        this.f4945 = arrayList;
    }
}
