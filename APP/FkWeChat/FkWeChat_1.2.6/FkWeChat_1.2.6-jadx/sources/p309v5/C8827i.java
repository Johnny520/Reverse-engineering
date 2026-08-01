package p309v5;

import bsh.C1259t2;
import java.io.FilterWriter;
import java.io.Writer;
import okhttp3.internal.url._UrlKt;
import p376zd.C9987e;

/* JADX INFO: renamed from: v5.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8827i extends FilterWriter {

    /* JADX INFO: renamed from: q */
    public final String f29355q;

    /* JADX INFO: renamed from: r */
    public final int f29356r;

    /* JADX INFO: renamed from: s */
    public final int f29357s;

    /* JADX INFO: renamed from: t */
    public int f29358t;

    /* JADX INFO: renamed from: u */
    public boolean f29359u;

    /* JADX INFO: renamed from: v */
    public int f29360v;

    public C8827i(Writer writer, int i10, String str) {
        super(writer);
        if (writer == null) {
            C1259t2.m5095a("out == null");
            throw null;
        }
        if (i10 < 0) {
            C9987e.m38645a("width < 0");
            throw null;
        }
        if (str == null) {
            C1259t2.m5095a("prefix == null");
            throw null;
        }
        this.f29356r = i10 != 0 ? i10 : Integer.MAX_VALUE;
        this.f29357s = i10 >> 1;
        this.f29355q = str.length() == 0 ? null : str;
        m33904c();
    }

    /* JADX INFO: renamed from: c */
    public final void m33904c() {
        this.f29358t = 0;
        this.f29359u = this.f29357s != 0;
        this.f29360v = 0;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i10) {
        int i11;
        synchronized (((FilterWriter) this).lock) {
            try {
                int i12 = 0;
                if (this.f29359u) {
                    if (i10 == 32) {
                        int i13 = this.f29360v + 1;
                        this.f29360v = i13;
                        int i14 = this.f29357s;
                        if (i13 >= i14) {
                            this.f29360v = i14;
                            this.f29359u = false;
                        }
                    } else {
                        this.f29359u = false;
                    }
                }
                if (this.f29358t == this.f29356r && i10 != 10) {
                    ((FilterWriter) this).out.write(10);
                    this.f29358t = 0;
                }
                if (this.f29358t == 0) {
                    String str = this.f29355q;
                    if (str != null) {
                        ((FilterWriter) this).out.write(str);
                    }
                    if (!this.f29359u) {
                        while (true) {
                            i11 = this.f29360v;
                            if (i12 >= i11) {
                                break;
                            }
                            ((FilterWriter) this).out.write(32);
                            i12++;
                        }
                        this.f29358t = i11;
                    }
                }
                ((FilterWriter) this).out.write(i10);
                if (i10 == 10) {
                    m33904c();
                } else {
                    this.f29358t++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C8827i(Writer writer, int i10) {
        this(writer, i10, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        synchronized (((FilterWriter) this).lock) {
            while (i11 > 0) {
                try {
                    write(cArr[i10]);
                    i10++;
                    i11--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i10, int i11) {
        synchronized (((FilterWriter) this).lock) {
            while (i11 > 0) {
                try {
                    write(str.charAt(i10));
                    i10++;
                    i11--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
