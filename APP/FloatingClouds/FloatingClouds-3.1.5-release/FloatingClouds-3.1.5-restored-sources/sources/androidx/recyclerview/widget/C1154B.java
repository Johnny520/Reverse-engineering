package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: renamed from: androidx.recyclerview.widget.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1154B {

    /* JADX INFO: renamed from: a */
    public final b f4744a;

    /* JADX INFO: renamed from: b */
    public final a f4745b;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.B$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f4746a;

        /* JADX INFO: renamed from: b */
        public int f4747b;

        /* JADX INFO: renamed from: c */
        public int f4748c;

        /* JADX INFO: renamed from: d */
        public int f4749d;

        /* JADX INFO: renamed from: e */
        public int f4750e;

        /* JADX INFO: renamed from: a */
        public final boolean m2636a() {
            int i = this.f4746a;
            int i2 = 2;
            if ((i & 7) != 0) {
                int i3 = this.f4749d;
                int i4 = this.f4747b;
                if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 112) != 0) {
                int i5 = this.f4749d;
                int i6 = this.f4748c;
                if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                    return false;
                }
            }
            if ((i & 1792) != 0) {
                int i7 = this.f4750e;
                int i8 = this.f4747b;
                if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                    return false;
                }
            }
            if ((i & 28672) != 0) {
                int i9 = this.f4750e;
                int i10 = this.f4748c;
                if (i9 > i10) {
                    i2 = 1;
                } else if (i9 != i10) {
                    i2 = 4;
                }
                if ((i & (i2 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.B$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        View mo2637a(int i);

        /* JADX INFO: renamed from: b */
        int mo2638b();

        /* JADX INFO: renamed from: c */
        int mo2639c();

        /* JADX INFO: renamed from: d */
        int mo2640d(View view);

        /* JADX INFO: renamed from: e */
        int mo2641e(View view);
    }

    public C1154B(b bVar) {
        this.f4744a = bVar;
        a aVar = new a();
        aVar.f4746a = 0;
        this.f4745b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final View m2634a(int i, int i2, int i3, int i4) {
        b bVar = this.f4744a;
        int iMo2639c = bVar.mo2639c();
        int iMo2638b = bVar.mo2638b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewMo2637a = bVar.mo2637a(i);
            int iMo2641e = bVar.mo2641e(viewMo2637a);
            int iMo2640d = bVar.mo2640d(viewMo2637a);
            a aVar = this.f4745b;
            aVar.f4747b = iMo2639c;
            aVar.f4748c = iMo2638b;
            aVar.f4749d = iMo2641e;
            aVar.f4750e = iMo2640d;
            if (i3 != 0) {
                aVar.f4746a = i3;
                if (aVar.m2636a()) {
                    return viewMo2637a;
                }
            }
            if (i4 != 0) {
                aVar.f4746a = i4;
                if (aVar.m2636a()) {
                    view = viewMo2637a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2635b(View view) {
        b bVar = this.f4744a;
        int iMo2639c = bVar.mo2639c();
        int iMo2638b = bVar.mo2638b();
        int iMo2641e = bVar.mo2641e(view);
        int iMo2640d = bVar.mo2640d(view);
        a aVar = this.f4745b;
        aVar.f4747b = iMo2639c;
        aVar.f4748c = iMo2638b;
        aVar.f4749d = iMo2641e;
        aVar.f4750e = iMo2640d;
        aVar.f4746a = 24579;
        return aVar.m2636a();
    }
}
