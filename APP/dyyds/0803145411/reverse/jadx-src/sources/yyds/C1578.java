package yyds;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛷᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1578 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C2133 f8005 = new C2133(29);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C1740 f8006 = new C1740();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C2794 f8007;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2133 f8008;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2135 f8009;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2135 f8010;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final C0644 f8011;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0119 f8012;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2135 f8013;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2135 f8014;

    public C1578() {
        C0644 c0644 = new C0644(new C1964(20), new C1586(), new C0135(15), 14, false);
        this.f8011 = c0644;
        this.f8008 = new C2133(c0644);
        this.f8009 = new C2135(0);
        this.f8012 = new C0119(6);
        this.f8014 = new C2135(4);
        this.f8007 = new C2794(0);
        this.f8013 = new C2135(5);
        this.f8010 = new C2135(3);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C0119 c0119 = this.f8012;
        synchronized (c0119) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c0119.f812);
                ((ArrayList) c0119.f812).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) c0119.f812).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c0119.f812).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m3222(Class cls, InterfaceC0814 interfaceC0814) {
        C0119 c0119 = this.f8012;
        synchronized (c0119) {
            c0119.m559("legacy_prepend_all").add(0, new C2430(Uri.class, cls, interfaceC0814));
        }
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m3223(Class cls, Class cls2, InterfaceC1826 interfaceC1826) {
        C2135 c2135 = this.f8013;
        synchronized (c2135) {
            c2135.f10556.add(new C1210(cls, cls2, interfaceC1826));
        }
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final ArrayList m3224() {
        ArrayList arrayList;
        C2135 c2135 = this.f8010;
        synchronized (c2135) {
            arrayList = c2135.f10556;
        }
        if (arrayList.isEmpty()) {
            throw new C2566("Failed to find image header parser.");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3225(Class cls, Class cls2, InterfaceC2768 interfaceC2768) {
        C2133 c2133 = this.f8008;
        synchronized (c2133) {
            C0644 c0644 = (C0644) c2133.f10555;
            synchronized (c0644) {
                try {
                    C2081 c2081 = new C2081(cls, cls2, interfaceC2768);
                    ArrayList arrayList = (ArrayList) c0644.f3099;
                    arrayList.add(arrayList.size(), c2081);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((C2794) c2133.f10553).f13658.clear();
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m3226(Class cls, InterfaceC1081 interfaceC1081) {
        C2135 c2135 = this.f8009;
        synchronized (c2135) {
            c2135.f10556.add(new C0322(cls, interfaceC1081));
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC0740 m3227(Object obj) {
        InterfaceC0740 interfaceC0740Mo2805;
        C2794 c2794 = this.f8007;
        synchronized (c2794) {
            try {
                AbstractC0319.m990(obj);
                InterfaceC2649 interfaceC2649 = (InterfaceC2649) c2794.f13658.get(obj.getClass());
                if (interfaceC2649 == null) {
                    Iterator it = c2794.f13658.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC2649 interfaceC26492 = (InterfaceC2649) it.next();
                        if (interfaceC26492.mo2804().isAssignableFrom(obj.getClass())) {
                            interfaceC2649 = interfaceC26492;
                            break;
                        }
                    }
                }
                if (interfaceC2649 == null) {
                    interfaceC2649 = C2794.f13657;
                }
                interfaceC0740Mo2805 = interfaceC2649.mo2805(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC0740Mo2805;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m3228(InterfaceC2649 interfaceC2649) {
        C2794 c2794 = this.f8007;
        synchronized (c2794) {
            c2794.f13658.put(interfaceC2649.mo2804(), interfaceC2649);
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3229(Class cls, InterfaceC0723 interfaceC0723) {
        C2135 c2135 = this.f8014;
        synchronized (c2135) {
            c2135.f10556.add(new C0906(cls, interfaceC0723));
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final List m3230(Object obj) {
        List listUnmodifiableList;
        C2133 c2133 = this.f8008;
        c2133.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c2133) {
            C1879 c1879 = (C1879) ((C2794) c2133.f10553).f13658.get(cls);
            listUnmodifiableList = c1879 == null ? null : c1879.f9469;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((C0644) c2133.f10555).m1567(cls));
                if (((C1879) ((C2794) c2133.f10553).f13658.put(cls, new C1879(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new C2566("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            InterfaceC0894 interfaceC0894 = (InterfaceC0894) listUnmodifiableList.get(i);
            if (interfaceC0894.mo941(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(interfaceC0894);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new C2566("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m3231(String str, Class cls, Class cls2, InterfaceC0814 interfaceC0814) {
        C0119 c0119 = this.f8012;
        synchronized (c0119) {
            c0119.m559(str).add(new C2430(cls, cls2, interfaceC0814));
        }
    }
}
