package p000;

/* JADX INFO: renamed from: ev */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0262ev {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f3673 = null;

    static {
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.lang.String r1 = android.os.Environment.DIRECTORY_MOVIES
            java.lang.String r2 = android.os.Environment.DIRECTORY_PICTURES
            java.lang.String r3 = android.os.Environment.DIRECTORY_DCIM
            java.lang.String r4 = android.os.Environment.DIRECTORY_MUSIC
            java.lang.String r5 = android.os.Environment.DIRECTORY_DOCUMENTS
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.AbstractC0262ev.f3673 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m1963(java.lang.String r9) {
            if (r9 == 0) goto L7e
            java.lang.CharSequence r9 = p000.q02.m4660(r9)
            java.lang.String r9 = r9.toString()
            if (r9 == 0) goto L7e
            r0 = 92
            r1 = 47
            java.lang.String r9 = r9.replace(r0, r1)
            r9.getClass()
            r0 = 1
            char[] r0 = new char[r0]
            r2 = 0
            r0[r2] = r1
            java.lang.String r9 = p000.q02.m4661(r9, r0)
            if (r9 == 0) goto L7e
            java.lang.String r0 = "/"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = 6
            java.util.List r9 = p000.q02.m4683(r9, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r9, r1)
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        L3d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r9.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = p000.AbstractC0488ku.m3416(r1)
            r0.add(r1)
            goto L3d
        L51:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r0.iterator()
        L5a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r9.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L5a
            r2.add(r0)
            goto L5a
        L71:
            r7 = 0
            r8 = 62
            java.lang.String r3 = "/"
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r2, r3, r4, r5, r6, r7, r8)
            goto L7f
        L7e:
            r9 = 0
        L7f:
            if (r9 != 0) goto L83
            java.lang.String r9 = ""
        L83:
            return r9
    }

    /* JADX INFO: renamed from: β */
    public static p000.C0189cv m1964(java.lang.String r15) {
            if (r15 == 0) goto L17b
            java.lang.CharSequence r15 = p000.q02.m4660(r15)
            java.lang.String r15 = r15.toString()
            if (r15 == 0) goto L17b
            r0 = 92
            r1 = 47
            java.lang.String r15 = r15.replace(r0, r1)
            r15.getClass()
            java.lang.String r0 = "file:"
            java.lang.String r15 = p000.q02.m4678(r15, r0)
            boolean r0 = p000.q02.m4684(r15, r1)
            if (r0 != 0) goto L25
            goto L17b
        L25:
            r0 = 1
            char[] r2 = new char[r0]
            r3 = 0
            r2[r3] = r1
            r1 = 6
            java.util.List r15 = p000.q02.m4682(r15, r2, r3, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r15, r2)
            r1.<init>(r2)
            java.util.Iterator r15 = r15.iterator()
        L3f:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r15.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            goto L3f
        L57:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r1 = r1.iterator()
        L60:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7f
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = p000.q02.m4671(r4)
            if (r5 != 0) goto L60
            java.lang.String r5 = "."
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L60
            r15.add(r2)
            goto L60
        L7f:
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L87
            goto L17b
        L87:
            java.lang.Object r1 = p000.AbstractC0984xh.m6638(r15)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "sdcard"
            boolean r1 = p000.x02.m6480(r1, r2)
            java.lang.String r2 = "/sdcard"
            java.lang.String r4 = "primary"
            if (r1 == 0) goto Lb3
            cv r1 = new cv
            java.util.List r5 = p000.AbstractC0984xh.m6634(r15, r0)
            r10 = 0
            r11 = 62
            java.lang.String r6 = "/"
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r15 = p000.AbstractC0984xh.m6644(r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r15 = m1963(r15)
            r1.<init>(r4, r2, r15)
            return r1
        Lb3:
            int r1 = r15.size()
            java.lang.String r5 = "storage"
            r6 = 3
            r7 = 2
            if (r1 < r6) goto Lfd
            java.lang.Object r1 = r15.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.x02.m6480(r1, r5)
            if (r1 == 0) goto Lfd
            java.lang.Object r1 = r15.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r8 = "emulated"
            boolean r1 = p000.x02.m6480(r1, r8)
            if (r1 == 0) goto Lfd
            java.lang.Object r1 = r15.get(r7)
            java.lang.String r8 = "0"
            boolean r1 = p000.ln0.m3626(r1, r8)
            if (r1 == 0) goto Lfd
            cv r0 = new cv
            java.util.List r7 = p000.AbstractC0984xh.m6634(r15, r6)
            r12 = 0
            r13 = 62
            java.lang.String r8 = "/"
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r15 = p000.AbstractC0984xh.m6644(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r15 = m1963(r15)
            r0.<init>(r4, r2, r15)
            return r0
        Lfd:
            int r1 = r15.size()
            if (r1 < r6) goto L143
            java.lang.Object r1 = r15.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.x02.m6480(r1, r5)
            if (r1 == 0) goto L143
            java.lang.Object r1 = r15.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r8 = "self"
            boolean r1 = p000.x02.m6480(r1, r8)
            if (r1 == 0) goto L143
            java.lang.Object r1 = r15.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.x02.m6480(r1, r4)
            if (r1 == 0) goto L143
            cv r0 = new cv
            java.util.List r7 = p000.AbstractC0984xh.m6634(r15, r6)
            r12 = 0
            r13 = 62
            java.lang.String r8 = "/"
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r15 = p000.AbstractC0984xh.m6644(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r15 = m1963(r15)
            r0.<init>(r4, r2, r15)
            return r0
        L143:
            int r1 = r15.size()
            if (r1 < r7) goto L17b
            java.lang.Object r1 = r15.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = p000.x02.m6480(r1, r5)
            if (r1 == 0) goto L17b
            java.lang.Object r0 = r15.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            cv r1 = new cv
            java.lang.String r2 = "/storage/"
            java.lang.String r2 = p000.lz1.m3687(r2, r0)
            java.util.List r8 = p000.AbstractC0984xh.m6634(r15, r7)
            r13 = 0
            r14 = 62
            java.lang.String r9 = "/"
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r15 = p000.AbstractC0984xh.m6644(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r15 = m1963(r15)
            r1.<init>(r0, r2, r15)
            return r1
        L17b:
            r15 = 0
            return r15
    }

    /* JADX INFO: renamed from: γ */
    public static p000.C0225dv m1965(java.lang.String r10) {
            java.lang.String r10 = m1963(r10)
            boolean r0 = p000.q02.m4671(r10)
            r1 = 0
            if (r0 == 0) goto Ld
            goto L8b
        Ld:
            java.lang.String r0 = "/"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r2 = 6
            java.util.List r10 = p000.q02.m4683(r10, r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r10, r2)
            r0.<init>(r2)
            java.util.Iterator r10 = r10.iterator()
        L27:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            goto L27
        L3f:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L48
            r10.add(r2)
            goto L48
        L5f:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L66
            goto L8b
        L66:
            java.util.List r0 = p000.AbstractC0262ev.f3673
            java.util.Iterator r0 = r0.iterator()
        L6c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = p000.AbstractC0984xh.m6638(r10)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = p000.x02.m6480(r3, r4)
            if (r3 == 0) goto L6c
            goto L87
        L86:
            r2 = r1
        L87:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L8c
        L8b:
            return r1
        L8c:
            dv r0 = new dv
            r1 = 1
            java.util.List r3 = p000.AbstractC0984xh.m6634(r10, r1)
            r8 = 0
            r9 = 62
            java.lang.String r4 = "/"
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = p000.AbstractC0984xh.m6644(r3, r4, r5, r6, r7, r8, r9)
            r0.<init>(r2, r10)
            return r0
    }
}
