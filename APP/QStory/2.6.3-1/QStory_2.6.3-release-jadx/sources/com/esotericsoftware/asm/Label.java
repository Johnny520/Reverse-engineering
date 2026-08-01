package com.esotericsoftware.asm;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: loaded from: classes.dex */
public class Label {

    /* JADX INFO: renamed from: a */
    int f218a;

    /* JADX INFO: renamed from: b */
    int f219b;

    /* JADX INFO: renamed from: c */
    int f220c;

    /* JADX INFO: renamed from: d */
    private int f221d;

    /* JADX INFO: renamed from: e */
    private int[] f222e;

    /* JADX INFO: renamed from: f */
    int f223f;

    /* JADX INFO: renamed from: g */
    int f224g;

    /* JADX INFO: renamed from: h */
    Frame f225h;

    /* JADX INFO: renamed from: i */
    Label f226i;
    public Object info;

    /* JADX INFO: renamed from: j */
    Edge f227j;

    /* JADX INFO: renamed from: k */
    Label f228k;

    /* JADX INFO: renamed from: a */
    public boolean m113a(MethodWriter methodWriter, int i, byte[] bArr) {
        this.f218a |= 2;
        this.f220c = i;
        int i2 = 0;
        boolean z = false;
        while (i2 < this.f221d) {
            int[] iArr = this.f222e;
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            i2 += 2;
            int i5 = iArr[i3];
            if (i4 >= 0) {
                int i6 = i - i4;
                if (i6 < -32768 || i6 > 32767) {
                    int i7 = i5 - 1;
                    int i8 = bArr[i7] & DefaultClassResolver.NAME;
                    if (i8 <= 168) {
                        bArr[i7] = (byte) (i8 + 49);
                    } else {
                        bArr[i7] = (byte) (i8 + 20);
                    }
                    z = true;
                }
                bArr[i5] = (byte) (i6 >>> 8);
                bArr[i5 + 1] = (byte) i6;
            } else {
                int i9 = i4 + i + 1;
                bArr[i5] = (byte) (i9 >>> 24);
                bArr[i5 + 1] = (byte) (i9 >>> 16);
                bArr[i5 + 2] = (byte) (i9 >>> 8);
                bArr[i5 + 3] = (byte) i9;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m114b(Label label, long j, int i) {
        Edge edge;
        while (this != null) {
            Label label2 = this.f228k;
            this.f228k = null;
            if (label != null) {
                int i2 = this.f218a;
                if ((i2 & 2048) == 0) {
                    int i3 = i2 | 2048;
                    this.f218a = i3;
                    if ((i3 & 256) != 0 && !this.m112a(label)) {
                        Edge edge2 = new Edge();
                        edge2.f174a = this.f223f;
                        edge2.f175b = label.f227j.f175b;
                        edge2.f176c = this.f227j;
                        this.f227j = edge2;
                    }
                    for (edge = this.f227j; edge != null; edge = edge.f176c) {
                        if ((this.f218a & 128) == 0 || edge != this.f227j.f176c) {
                            Label label3 = edge.f175b;
                            if (label3.f228k == null) {
                                label3.f228k = label2;
                                label2 = label3;
                            }
                        }
                    }
                }
            } else if (!this.m111a(j)) {
                this.m109a(j, i);
                while (edge != null) {
                }
            }
            this = label2;
        }
    }

    public int getOffset() {
        if ((this.f218a & 2) != 0) {
            return this.f220c;
        }
        C6755.m11870("Label offset position has not been resolved yet");
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("L");
        stringBuffer.append(System.identityHashCode(this));
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    private void m107a(int i, int i2) {
        if (this.f222e == null) {
            this.f222e = new int[6];
        }
        int i3 = this.f221d;
        int[] iArr = this.f222e;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f222e = iArr2;
        }
        int[] iArr3 = this.f222e;
        int i4 = this.f221d;
        int i5 = i4 + 1;
        this.f221d = i5;
        iArr3[i4] = i;
        this.f221d = i4 + 2;
        iArr3[i5] = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m109a(long j, int i) {
        int i2 = this.f218a;
        if ((i2 & 1024) == 0) {
            this.f218a = i2 | 1024;
            this.f222e = new int[(i / 32) + 1];
        }
        int[] iArr = this.f222e;
        int i3 = (int) (j >>> 32);
        iArr[i3] = ((int) j) | iArr[i3];
    }

    /* JADX INFO: renamed from: a */
    public void m110a(MethodWriter methodWriter, ByteVector byteVector, int i, boolean z) {
        if ((this.f218a & 2) != 0) {
            int i2 = this.f220c - i;
            if (z) {
                byteVector.putInt(i2);
                return;
            } else {
                byteVector.putShort(i2);
                return;
            }
        }
        if (z) {
            m107a((-1) - i, byteVector.f108b);
            byteVector.putInt(-1);
        } else {
            m107a(i, byteVector.f108b);
            byteVector.putShort(-1);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m111a(long j) {
        return ((this.f218a & 1024) == 0 || (this.f222e[(int) (j >>> 32)] & ((int) j)) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m112a(Label label) {
        if ((this.f218a & 1024) != 0 && (label.f218a & 1024) != 0) {
            int i = 0;
            while (true) {
                int[] iArr = this.f222e;
                if (i >= iArr.length) {
                    break;
                }
                if ((iArr[i] & label.f222e[i]) != 0) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public Label m108a() {
        Frame frame = this.f225h;
        return frame == null ? this : frame.f190b;
    }
}
