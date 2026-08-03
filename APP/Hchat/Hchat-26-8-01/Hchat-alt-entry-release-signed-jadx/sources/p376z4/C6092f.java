package p376z4;

import java.io.FilterWriter;
import java.io.StringWriter;
import p136j8.C2104o;

/* JADX INFO: renamed from: z4.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6092f extends FilterWriter {

    /* JADX INFO: renamed from: g */
    public final String f24602g;

    /* JADX INFO: renamed from: h */
    public final int f24603h;

    /* JADX INFO: renamed from: i */
    public final int f24604i;

    /* JADX INFO: renamed from: j */
    public int f24605j;

    /* JADX INFO: renamed from: k */
    public boolean f24606k;

    /* JADX INFO: renamed from: l */
    public int f24607l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6092f(StringWriter stringWriter, int i9, String str) {
        super(stringWriter);
        if (i9 < 0) {
            C2104o.m5294t("width < 0");
            throw null;
        }
        this.f24603h = i9 != 0 ? i9 : Integer.MAX_VALUE;
        int i10 = i9 >> 1;
        this.f24604i = i10;
        this.f24602g = str.length() == 0 ? null : str;
        this.f24605j = 0;
        this.f24606k = i10 != 0;
        this.f24607l = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int i9) {
        int i10;
        synchronized (((FilterWriter) this).lock) {
            try {
                boolean z9 = true;
                if (this.f24606k) {
                    if (i9 == 32) {
                        int i11 = this.f24607l + 1;
                        this.f24607l = i11;
                        int i12 = this.f24604i;
                        if (i11 >= i12) {
                            this.f24607l = i12;
                            this.f24606k = false;
                        }
                    } else {
                        this.f24606k = false;
                    }
                }
                if (this.f24605j == this.f24603h && i9 != 10) {
                    ((FilterWriter) this).out.write(10);
                    this.f24605j = 0;
                }
                if (this.f24605j == 0) {
                    String str = this.f24602g;
                    if (str != null) {
                        ((FilterWriter) this).out.write(str);
                    }
                    if (!this.f24606k) {
                        int i13 = 0;
                        while (true) {
                            i10 = this.f24607l;
                            if (i13 >= i10) {
                                break;
                            }
                            ((FilterWriter) this).out.write(32);
                            i13++;
                        }
                        this.f24605j = i10;
                    }
                }
                ((FilterWriter) this).out.write(i9);
                if (i9 == 10) {
                    this.f24605j = 0;
                    if (this.f24604i == 0) {
                        z9 = false;
                    }
                    this.f24606k = z9;
                    this.f24607l = 0;
                } else {
                    this.f24605j++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] cArr, int i9, int i10) {
        synchronized (((FilterWriter) this).lock) {
            while (i10 > 0) {
                try {
                    write(cArr[i9]);
                    i9++;
                    i10--;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(String str, int i9, int i10) {
        synchronized (((FilterWriter) this).lock) {
            while (i10 > 0) {
                try {
                    write(str.charAt(i9));
                    i9++;
                    i10--;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
