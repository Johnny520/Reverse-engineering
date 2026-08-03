package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class cq extends java.util.Properties implements java.lang.Comparable<com.tendcloud.tenddata.cq> {
    private java.lang.String a;
    private byte[] b;
    private int c;
    private int d;
    private java.util.zip.CRC32 e;

    public static final class a {
        public static final java.lang.String DATA = "data";
        public static final java.lang.String LENGTH = "length";
        public static final java.lang.String RCS32 = "rcs32";

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public cq(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private cq(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            r0.e = r1
            r0.writeData(r2)
            return
    }

    public cq(byte[] r2) {
            r1 = this;
            java.lang.String r0 = a()
            r1.<init>(r0, r2)
            return
    }

    public static java.lang.String a() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            int r1 = android.os.Process.myPid()
            long r1 = (long) r1
            java.lang.String r1 = java.lang.Long.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int a(com.tendcloud.tenddata.cq r2) {
            r1 = this;
            java.lang.String r0 = r1.b()
            java.lang.String r2 = r2.b()
            int r2 = r0.compareTo(r2)
            return r2
    }

    public int a(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = super.getProperty(r1)
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
    }

    public int a(java.lang.String r1, int r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r1 = r0.setProperty(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = java.lang.Integer.parseInt(r1)
        L12:
            return r1
    }

    public java.lang.String a(byte[] r2) {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
    }

    public byte[] a(java.lang.String r1, byte[] r2) {
            r0 = this;
            java.lang.String r2 = r0.a(r2)
            java.lang.Object r1 = r0.setProperty(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            byte[] r1 = r0.c(r1)
        L12:
            return r1
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public byte[] b(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = super.getProperty(r1)
            byte[] r1 = r0.c(r1)
            return r1
    }

    public byte[] c() {
            r1 = this;
            byte[] r0 = r1.b
            return r0
    }

    public byte[] c(java.lang.String r1) {
            r0 = this;
            if (r1 == 0) goto L7
            byte[] r1 = r1.getBytes()
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(com.tendcloud.tenddata.cq r1) {
            r0 = this;
            com.tendcloud.tenddata.cq r1 = (com.tendcloud.tenddata.cq) r1
            int r1 = r0.a(r1)
            return r1
    }

    public int d() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public final void writeData(byte[] r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.util.zip.CRC32 r0 = r3.e
            if (r0 != 0) goto Le
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r3.e = r0
        Le:
            int r0 = r4.length
            byte[] r0 = new byte[r0]
            r3.b = r0
            int r1 = r4.length
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r0, r2, r1)
            byte[] r4 = r3.b
            int r4 = r4.length
            r3.d = r4
            java.util.zip.CRC32 r4 = r3.e
            r4.reset()
            java.util.zip.CRC32 r4 = r3.e
            byte[] r0 = r3.b
            r4.update(r0)
            java.util.zip.CRC32 r4 = r3.e
            long r0 = r4.getValue()
            int r4 = (int) r0
            r3.c = r4
            return
    }
}
