package p000;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hy0 extends FilterWriter {

    /* JADX INFO: renamed from: h */
    public final String f4173h;

    /* JADX INFO: renamed from: i */
    public final int f4174i;

    /* JADX INFO: renamed from: j */
    public final int f4175j;

    /* JADX INFO: renamed from: k */
    public int f4176k;

    /* JADX INFO: renamed from: l */
    public boolean f4177l;

    /* JADX INFO: renamed from: m */
    public int f4178m;

    public hy0(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            C0676s.m4651j("width < 0");
            throw null;
        }
        this.f4174i = i != 0 ? i : Integer.MAX_VALUE;
        int i2 = i >> 1;
        this.f4175j = i2;
        this.f4173h = str.length() == 0 ? null : str;
        this.f4176k = 0;
        this.f4177l = i2 != 0;
        this.f4178m = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            try {
                boolean z = true;
                if (this.f4177l) {
                    if (i == 32) {
                        int i3 = this.f4178m + 1;
                        this.f4178m = i3;
                        int i4 = this.f4175j;
                        if (i3 >= i4) {
                            this.f4178m = i4;
                            this.f4177l = false;
                        }
                    } else {
                        this.f4177l = false;
                    }
                }
                if (this.f4176k == this.f4174i && i != 10) {
                    ((FilterWriter) this).out.write(10);
                    this.f4176k = 0;
                }
                if (this.f4176k == 0) {
                    String str = this.f4173h;
                    if (str != null) {
                        ((FilterWriter) this).out.write(str);
                    }
                    if (!this.f4177l) {
                        int i5 = 0;
                        while (true) {
                            i2 = this.f4178m;
                            if (i5 >= i2) {
                                break;
                            }
                            ((FilterWriter) this).out.write(32);
                            i5++;
                        }
                        this.f4176k = i2;
                    }
                }
                ((FilterWriter) this).out.write(i);
                if (i == 10) {
                    this.f4176k = 0;
                    if (this.f4175j == 0) {
                        z = false;
                    }
                    this.f4177l = z;
                    this.f4178m = 0;
                } else {
                    this.f4176k++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                try {
                    write(cArr[i]);
                    i++;
                    i2--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i, int i2) {
        synchronized (((FilterWriter) this).lock) {
            while (i2 > 0) {
                try {
                    write(str.charAt(i));
                    i++;
                    i2--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
