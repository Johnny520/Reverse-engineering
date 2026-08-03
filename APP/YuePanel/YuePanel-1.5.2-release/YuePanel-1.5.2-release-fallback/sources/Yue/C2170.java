package Yue;

import java.lang.Enum;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.8")
public final class C2170<T extends java.lang.Enum<T>> extends Yue.AbstractC0052<T> implements Yue.InterfaceC2168<T>, java.io.Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final T[] f6781;

    public C2170(@Yue.InterfaceC4418 T[] r2) {
            r1 = this;
            java.lang.String r0 = "entries"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f6781 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private final java.lang.Object m10154() {
            r2 = this;
            Yue.ۥ۠ۡ۠۟ r0 = new Yue.ۥ۠ۡ۠۟
            T extends java.lang.Enum<T>[] r1 = r2.f6781
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.AbstractC0041, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            java.lang.Enum r2 = (java.lang.Enum) r2
            boolean r2 = r1.m10155(r2)
            return r2
    }

    @Override // Yue.AbstractC0052, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.Enum r1 = r0.m10156(r1)
            return r1
    }

    @Override // Yue.AbstractC0052, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r2 = r1.m10157(r2)
            return r2
    }

    @Override // Yue.AbstractC0052, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r2 = -1
            return r2
        L6:
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r2 = r1.m10158(r2)
            return r2
    }

    @Override // Yue.AbstractC0052, Yue.AbstractC0041
    /* JADX INFO: renamed from: ۥ */
    public int mo368() {
            r1 = this;
            T extends java.lang.Enum<T>[] r0 = r1.f6781
            int r0 = r0.length
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m10155(@Yue.InterfaceC4418 T r3) {
            r2 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r3, r0)
            T extends java.lang.Enum<T>[] r0 = r2.f6781
            int r1 = r3.ordinal()
            java.lang.Object r0 = Yue.C0595.m2950(r0, r1)
            java.lang.Enum r0 = (java.lang.Enum) r0
            if (r0 != r3) goto L15
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public T m10156(int r3) {
            r2 = this;
            Yue.ۥ۟۟ۡۢ$ۥ r0 = Yue.AbstractC0052.f115
            T extends java.lang.Enum<T>[] r1 = r2.f6781
            int r1 = r1.length
            r0.m399(r3, r1)
            T extends java.lang.Enum<T>[] r0 = r2.f6781
            r3 = r0[r3]
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m10157(@Yue.InterfaceC4418 T r3) {
            r2 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.ordinal()
            T extends java.lang.Enum<T>[] r1 = r2.f6781
            java.lang.Object r1 = Yue.C0595.m2950(r1, r0)
            java.lang.Enum r1 = (java.lang.Enum) r1
            if (r1 != r3) goto L14
            goto L15
        L14:
            r0 = -1
        L15:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m10158(@Yue.InterfaceC4418 T r2) {
            r1 = this;
            java.lang.String r0 = "element"
            Yue.C3329.m13906(r2, r0)
            int r2 = r1.indexOf(r2)
            return r2
    }
}
