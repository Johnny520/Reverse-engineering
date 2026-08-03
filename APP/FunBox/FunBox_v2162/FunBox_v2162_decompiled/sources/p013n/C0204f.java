package p013n;

import java.io.FilterWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: n.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0204f extends FilterWriter {

    /* JADX INFO: renamed from: a */
    private final String f800a;

    /* JADX INFO: renamed from: b */
    private final int f801b;

    /* JADX INFO: renamed from: c */
    private final int f802c;

    /* JADX INFO: renamed from: d */
    private int f803d;

    /* JADX INFO: renamed from: e */
    private boolean f804e;

    /* JADX INFO: renamed from: f */
    private int f805f;

    public C0204f(StringWriter stringWriter, int i2, String str) {
        super(stringWriter);
        if (i2 < 0) {
            throw new IllegalArgumentException("width < 0");
        }
        this.f801b = i2 != 0 ? i2 : Integer.MAX_VALUE;
        int i3 = i2 >> 1;
        this.f802c = i3;
        this.f800a = str.length() == 0 ? null : str;
        this.f803d = 0;
        this.f804e = i3 != 0;
        this.f805f = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i2) {
        int i3;
        synchronized (((FilterWriter) this).lock) {
            boolean z = true;
            if (this.f804e) {
                if (i2 == 32) {
                    int i4 = this.f805f + 1;
                    this.f805f = i4;
                    int i5 = this.f802c;
                    if (i4 >= i5) {
                        this.f805f = i5;
                        this.f804e = false;
                    }
                } else {
                    this.f804e = false;
                }
            }
            if (this.f803d == this.f801b && i2 != 10) {
                ((FilterWriter) this).out.write(10);
                this.f803d = 0;
            }
            if (this.f803d == 0) {
                String str = this.f800a;
                if (str != null) {
                    ((FilterWriter) this).out.write(str);
                }
                if (!this.f804e) {
                    int i6 = 0;
                    while (true) {
                        i3 = this.f805f;
                        if (i6 >= i3) {
                            break;
                        }
                        ((FilterWriter) this).out.write(32);
                        i6++;
                    }
                    this.f803d = i3;
                }
            }
            ((FilterWriter) this).out.write(i2);
            if (i2 == 10) {
                this.f803d = 0;
                if (this.f802c == 0) {
                    z = false;
                }
                this.f804e = z;
                this.f805f = 0;
            } else {
                this.f803d++;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i2, int i3) {
        synchronized (((FilterWriter) this).lock) {
            while (i3 > 0) {
                write(str.charAt(i2));
                i2++;
                i3--;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        synchronized (((FilterWriter) this).lock) {
            while (i3 > 0) {
                write(cArr[i2]);
                i2++;
                i3--;
            }
        }
    }
}
