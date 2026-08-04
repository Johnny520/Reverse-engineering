package yyds;

import android.database.Observable;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᛴᛲᲇᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0812 extends Observable {
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m1866(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C2273 c2273 = (C2273) ((Observable) this).mObservers.get(size);
            C1213 c1213 = c2273.f11203;
            c1213.m2457(null);
            C1231 c1231 = c1213.f5553;
            ArrayList arrayList = (ArrayList) c1231.f5647;
            if (i2 >= 1) {
                arrayList.add(c1231.m2519(null, 2, i, i2));
                c1231.f5645 |= 2;
                if (arrayList.size() == 1) {
                    c2273.m4283();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1867() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1213 c1213 = ((C2273) ((Observable) this).mObservers.get(size)).f11203;
            c1213.m2457(null);
            c1213.f5568.f12982 = true;
            c1213.m2430(true);
            if (!c1213.f5553.m2520()) {
                c1213.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1868(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C2273 c2273 = (C2273) ((Observable) this).mObservers.get(size);
            C1213 c1213 = c2273.f11203;
            c1213.m2457(null);
            C1231 c1231 = c1213.f5553;
            ArrayList arrayList = (ArrayList) c1231.f5647;
            if (i != i2) {
                arrayList.add(c1231.m2519(null, 8, i, i2));
                c1231.f5645 |= 8;
                if (arrayList.size() == 1) {
                    c2273.m4283();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m1869(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C2273 c2273 = (C2273) ((Observable) this).mObservers.get(size);
            C1213 c1213 = c2273.f11203;
            c1213.m2457(null);
            C1231 c1231 = c1213.f5553;
            ArrayList arrayList = (ArrayList) c1231.f5647;
            if (i2 >= 1) {
                arrayList.add(c1231.m2519(null, 4, i, i2));
                c1231.f5645 |= 4;
                if (arrayList.size() == 1) {
                    c2273.m4283();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m1870(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C2273 c2273 = (C2273) ((Observable) this).mObservers.get(size);
            C1213 c1213 = c2273.f11203;
            c1213.m2457(null);
            C1231 c1231 = c1213.f5553;
            ArrayList arrayList = (ArrayList) c1231.f5647;
            if (i2 >= 1) {
                arrayList.add(c1231.m2519(null, 1, i, i2));
                c1231.f5645 |= 1;
                if (arrayList.size() == 1) {
                    c2273.m4283();
                }
            }
        }
    }
}
