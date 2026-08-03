package com.tendcloud.tenddata;

import android.os.Process;
import java.util.Properties;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: com.tendcloud.tenddata.cq */
/* JADX INFO: loaded from: classes.dex */
public class C0089cq extends Properties implements Comparable<C0089cq> {

    /* JADX INFO: renamed from: a */
    private String f409a;

    /* JADX INFO: renamed from: b */
    private byte[] f410b;

    /* JADX INFO: renamed from: c */
    private int f411c;

    /* JADX INFO: renamed from: d */
    private int f412d;

    /* JADX INFO: renamed from: e */
    private CRC32 f413e;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.cq$a */
    public static final class a {
        public static final String DATA = "data";
        public static final String LENGTH = "length";
        public static final String RCS32 = "rcs32";
    }

    public C0089cq(String str) {
        this.f409a = str;
    }

    private C0089cq(String str, byte[] bArr) {
        this(str);
        this.f413e = new CRC32();
        writeData(bArr);
    }

    public C0089cq(byte[] bArr) {
        this(m442a(), bArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m442a() {
        return System.currentTimeMillis() + "_" + Long.toString(Process.myPid());
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0089cq c0089cq) {
        return m448b().compareTo(c0089cq.m448b());
    }

    /* JADX INFO: renamed from: a */
    public int m444a(String str) {
        return Integer.parseInt(super.getProperty(str));
    }

    /* JADX INFO: renamed from: a */
    public int m445a(String str, int i) {
        String str2 = (String) setProperty(str, String.valueOf(i));
        if (str2 == null) {
            return 0;
        }
        return Integer.parseInt(str2);
    }

    /* JADX INFO: renamed from: a */
    public String m446a(byte[] bArr) {
        return new String(bArr);
    }

    /* JADX INFO: renamed from: a */
    public byte[] m447a(String str, byte[] bArr) {
        String str2 = (String) setProperty(str, m446a(bArr));
        if (str2 == null) {
            return null;
        }
        return m451c(str2);
    }

    /* JADX INFO: renamed from: b */
    public String m448b() {
        return this.f409a;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m449b(String str) {
        return m451c(super.getProperty(str));
    }

    /* JADX INFO: renamed from: c */
    public byte[] m450c() {
        return this.f410b;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m451c(String str) {
        if (str != null) {
            return str.getBytes();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public int m452d() {
        return this.f411c;
    }

    /* JADX INFO: renamed from: e */
    public int m453e() {
        return this.f412d;
    }

    public final void writeData(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (this.f413e == null) {
            this.f413e = new CRC32();
        }
        byte[] bArr2 = new byte[bArr.length];
        this.f410b = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        this.f412d = this.f410b.length;
        this.f413e.reset();
        this.f413e.update(this.f410b);
        this.f411c = (int) this.f413e.getValue();
    }
}
