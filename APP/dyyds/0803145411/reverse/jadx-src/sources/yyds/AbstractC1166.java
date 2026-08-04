package yyds;

import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᛵᛸᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1166 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f5366 = AbstractC2112.f10448.objectFieldOffset(AbstractC1166.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public AbstractRunnableC1665[] f5367;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2353(AbstractRunnableC1665 abstractRunnableC1665) {
        abstractRunnableC1665.m3407((C2092) this);
        AbstractRunnableC1665[] abstractRunnableC1665Arr = this.f5367;
        if (abstractRunnableC1665Arr == null) {
            abstractRunnableC1665Arr = new AbstractRunnableC1665[4];
            this.f5367 = abstractRunnableC1665Arr;
        } else if (m2354() >= abstractRunnableC1665Arr.length) {
            abstractRunnableC1665Arr = (AbstractRunnableC1665[]) Arrays.copyOf(abstractRunnableC1665Arr, m2354() * 2);
            this.f5367 = abstractRunnableC1665Arr;
        }
        int iM2354 = m2354();
        AbstractC2112.f10448.putIntVolatile(this, f5366, iM2354 + 1);
        abstractRunnableC1665Arr[iM2354] = abstractRunnableC1665;
        abstractRunnableC1665.f8519 = iM2354;
        while (iM2354 > 0) {
            Object[] objArr = this.f5367;
            int i = (iM2354 - 1) / 2;
            if (objArr[i].compareTo(objArr[iM2354]) <= 0) {
                return;
            }
            m2356(iM2354, i);
            iM2354 = i;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m2354() {
        return AbstractC2112.f10448.getIntVolatile(this, f5366);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final AbstractRunnableC1665 m2355(int i) {
        Object[] objArr = this.f5367;
        AbstractC2112.f10448.putIntVolatile(this, f5366, m2354() - 1);
        if (i < m2354()) {
            m2356(i, m2354());
            int i2 = (i - 1) / 2;
            if (i <= 0 || objArr[i].compareTo(objArr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= m2354()) {
                        break;
                    }
                    Object[] objArr2 = this.f5367;
                    int i5 = i3 + 2;
                    if (i5 >= m2354() || objArr2[i5].compareTo(objArr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (objArr2[i].compareTo(objArr2[i5]) <= 0) {
                        break;
                    }
                    m2356(i, i5);
                    i = i5;
                }
            } else {
                m2356(i, i2);
                while (i2 > 0) {
                    Object[] objArr3 = this.f5367;
                    int i6 = (i2 - 1) / 2;
                    if (objArr3[i6].compareTo(objArr3[i2]) <= 0) {
                        break;
                    }
                    m2356(i2, i6);
                    i2 = i6;
                }
            }
        }
        AbstractRunnableC1665 abstractRunnableC1665 = objArr[m2354()];
        abstractRunnableC1665.m3407(null);
        abstractRunnableC1665.f8519 = -1;
        objArr[m2354()] = null;
        return abstractRunnableC1665;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m2356(int i, int i2) {
        AbstractRunnableC1665[] abstractRunnableC1665Arr = this.f5367;
        AbstractRunnableC1665 abstractRunnableC1665 = abstractRunnableC1665Arr[i2];
        AbstractRunnableC1665 abstractRunnableC16652 = abstractRunnableC1665Arr[i];
        abstractRunnableC1665Arr[i] = abstractRunnableC1665;
        abstractRunnableC1665Arr[i2] = abstractRunnableC16652;
        abstractRunnableC1665.f8519 = i;
        abstractRunnableC16652.f8519 = i2;
    }
}
