package yyds;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᲀᛱᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1929 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public ByteBuffer f9724;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C0069 f9725;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final byte[] f9723 = new byte[256];

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f9726 = 0;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int[] m3722(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f9724.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f9725.f612 = 1;
            return iArr;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean m3723() {
        return this.f9725.f612 != 0;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C0069 m3724() {
        byte[] bArr;
        if (this.f9724 == null) {
            C0188.m800("You must call setData() before parseHeader()");
            return null;
        }
        if (m3723()) {
            return this.f9725;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m3725());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        C0069 c0069 = this.f9725;
        if (zStartsWith) {
            c0069.f617 = this.f9724.getShort();
            this.f9725.f613 = this.f9724.getShort();
            int iM3725 = m3725();
            C0069 c00692 = this.f9725;
            c00692.f608 = (iM3725 & 128) != 0;
            c00692.f609 = (int) Math.pow(2.0d, (iM3725 & 7) + 1);
            this.f9725.f615 = m3725();
            C0069 c00693 = this.f9725;
            m3725();
            c00693.getClass();
            if (this.f9725.f608 && !m3723()) {
                C0069 c00694 = this.f9725;
                c00694.f611 = m3722(c00694.f609);
                C0069 c00695 = this.f9725;
                c00695.f614 = c00695.f611[c00695.f615];
            }
        } else {
            c0069.f612 = 1;
        }
        if (!m3723()) {
            boolean z = false;
            while (!z && !m3723() && this.f9725.f616 <= Integer.MAX_VALUE) {
                int iM37252 = m3725();
                if (iM37252 == 33) {
                    int iM37253 = m3725();
                    if (iM37253 == 1) {
                        m3726();
                    } else if (iM37253 == 249) {
                        this.f9725.f618 = new C0829();
                        m3725();
                        int iM37254 = m3725();
                        C0829 c0829 = this.f9725.f618;
                        int i2 = (iM37254 & 28) >> 2;
                        c0829.f3769 = i2;
                        if (i2 == 0) {
                            c0829.f3769 = 1;
                        }
                        c0829.f3773 = (iM37254 & 1) != 0;
                        short s = this.f9724.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C0829 c08292 = this.f9725.f618;
                        c08292.f3765 = s * 10;
                        c08292.f3764 = m3725();
                        m3725();
                    } else if (iM37253 == 254) {
                        m3726();
                    } else if (iM37253 != 255) {
                        m3726();
                    } else {
                        m3727();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.f9723;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                m3727();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.f9725.getClass();
                                }
                                if (this.f9726 > 0) {
                                }
                            } while (!m3723());
                        } else {
                            m3726();
                        }
                    }
                } else if (iM37252 == 44) {
                    C0069 c00696 = this.f9725;
                    C0829 c08293 = c00696.f618;
                    if (c08293 == null) {
                        c08293 = new C0829();
                        c00696.f618 = c08293;
                    }
                    c08293.f3767 = this.f9724.getShort();
                    this.f9725.f618.f3768 = this.f9724.getShort();
                    this.f9725.f618.f3772 = this.f9724.getShort();
                    this.f9725.f618.f3774 = this.f9724.getShort();
                    int iM37255 = m3725();
                    boolean z2 = (iM37255 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iM37255 & 7) + 1);
                    C0829 c08294 = this.f9725.f618;
                    c08294.f3766 = (iM37255 & 64) != 0;
                    if (z2) {
                        c08294.f3770 = m3722(iPow);
                    } else {
                        c08294.f3770 = null;
                    }
                    this.f9725.f618.f3771 = this.f9724.position();
                    m3725();
                    m3726();
                    if (!m3723()) {
                        C0069 c00697 = this.f9725;
                        c00697.f616++;
                        c00697.f610.add(c00697.f618);
                    }
                } else if (iM37252 != 59) {
                    this.f9725.f612 = 1;
                } else {
                    z = true;
                }
            }
            C0069 c00698 = this.f9725;
            if (c00698.f616 < 0) {
                c00698.f612 = 1;
            }
        }
        return this.f9725;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int m3725() {
        try {
            return this.f9724.get() & 255;
        } catch (Exception unused) {
            this.f9725.f612 = 1;
            return 0;
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m3726() {
        int iM3725;
        do {
            iM3725 = m3725();
            this.f9724.position(Math.min(this.f9724.position() + iM3725, this.f9724.limit()));
        } while (iM3725 > 0);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m3727() {
        int iM3725 = m3725();
        this.f9726 = iM3725;
        if (iM3725 <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.f9726;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.f9724.get(this.f9723, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f9726, e);
                }
                this.f9725.f612 = 1;
                return;
            }
        }
    }
}
