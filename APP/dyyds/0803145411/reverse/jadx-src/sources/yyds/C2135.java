package yyds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᲈᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2135 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final ArrayList f10556;

    public C2135(int i) {
        switch (i) {
            case 1:
                this.f10556 = new ArrayList();
                new HashMap();
                new HashMap();
                break;
            case 2:
                this.f10556 = new ArrayList(20);
                break;
            case 3:
                this.f10556 = new ArrayList();
                break;
            case 4:
                this.f10556 = new ArrayList();
                break;
            case 5:
                this.f10556 = new ArrayList();
                break;
            default:
                this.f10556 = new ArrayList();
                break;
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public void m4070(String str, String str2) {
        AbstractC0797.m1830(str);
        AbstractC0797.m1831(str2, str);
        m4074(str);
        ArrayList arrayList = this.f10556;
        arrayList.add(str);
        arrayList.add(AbstractC0473.m1314(str2).toString());
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public synchronized InterfaceC0723 m4071(Class cls) {
        int size = this.f10556.size();
        for (int i = 0; i < size; i++) {
            C0906 c0906 = (C0906) this.f10556.get(i);
            if (c0906.f4126.isAssignableFrom(cls)) {
                return c0906.f4127;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public List m4072() {
        ArrayList arrayList;
        if (this.f10556.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f10556) {
            arrayList = new ArrayList(this.f10556);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public synchronized ArrayList m4073(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1210 c1210 : this.f10556) {
            if ((c1210.f5505.isAssignableFrom(cls) && cls2.isAssignableFrom(c1210.f5506)) && !arrayList.contains(c1210.f5506)) {
                arrayList.add(c1210.f5506);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public void m4074(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f10556;
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
}
