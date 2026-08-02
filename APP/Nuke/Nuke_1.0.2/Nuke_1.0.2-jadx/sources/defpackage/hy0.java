package defpackage;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hy0 extends FilterWriter {
    public final String h;
    public final int i;
    public final int j;
    public int k;
    public boolean l;
    public int m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hy0(StringWriter stringWriter, int i, String str) {
        super(stringWriter);
        if (i < 0) {
            s.j("width < 0");
            throw null;
        }
        this.i = i != 0 ? i : Integer.MAX_VALUE;
        int i2 = i >> 1;
        this.j = i2;
        this.h = str.length() == 0 ? null : str;
        this.k = 0;
        this.l = i2 != 0;
        this.m = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i) {
        int i2;
        synchronized (((FilterWriter) this).lock) {
            try {
                boolean z = true;
                if (this.l) {
                    if (i == 32) {
                        int i3 = this.m + 1;
                        this.m = i3;
                        int i4 = this.j;
                        if (i3 >= i4) {
                            this.m = i4;
                            this.l = false;
                        }
                    } else {
                        this.l = false;
                    }
                }
                if (this.k == this.i && i != 10) {
                    ((FilterWriter) this).out.write(10);
                    this.k = 0;
                }
                if (this.k == 0) {
                    String str = this.h;
                    if (str != null) {
                        ((FilterWriter) this).out.write(str);
                    }
                    if (!this.l) {
                        int i5 = 0;
                        while (true) {
                            i2 = this.m;
                            if (i5 >= i2) {
                                break;
                            }
                            ((FilterWriter) this).out.write(32);
                            i5++;
                        }
                        this.k = i2;
                    }
                }
                ((FilterWriter) this).out.write(i);
                if (i == 10) {
                    this.k = 0;
                    if (this.j == 0) {
                        z = false;
                    }
                    this.l = z;
                    this.m = 0;
                } else {
                    this.k++;
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
