package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6077 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f21989;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C5909 f21990;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.util.Map f21991;

    public C6077() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f21989 = r0
            Yue.ۥۣۢ۟ۧ r0 = new Yue.ۥۣۢ۟ۧ
            r0.<init>()
            r1.f21990 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f21991 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m22813(java.lang.String[] r9) throws java.lang.Exception {
            Yue.ۥۢ۠ۦۤ r9 = new Yue.ۥۢ۠ۦۤ
            r9.<init>()
            r9.m22819()
            java.lang.String r0 = "x"
            java.lang.String r1 = "foo"
            r9.m22820(r0, r1)
            java.lang.String r2 = "y"
            java.lang.String r3 = "bar"
            r9.m22820(r2, r3)
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.lang.String r6 = "1 x:"
            r5.append(r6)
            java.lang.String r7 = r9.m22816(r0)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.println(r5)
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.lang.String r7 = "1 y:"
            r5.append(r7)
            java.lang.String r8 = r9.m22816(r2)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r4.println(r5)
            r9.m22819()
            r9.m22820(r0, r3)
            r9.m22820(r2, r1)
            r9.m22819()
            java.lang.String r1 = "barbie"
            r9.m22820(r0, r1)
            r9.m22819()
            r9.m22815()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r3 = "3 x:"
            r1.append(r3)
            java.lang.String r3 = r9.m22816(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r4.println(r1)
            r9.m22815()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r3 = "2 x:"
            r1.append(r3)
            java.lang.String r3 = r9.m22816(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r4.println(r1)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r3 = "2 y:"
            r1.append(r3)
            java.lang.String r3 = r9.m22816(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r4.println(r1)
            r4.print(r9)
            r9.m22815()
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = r9.m22816(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.println(r0)
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r0.append(r7)
            java.lang.String r1 = r9.m22816(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.println(r0)
            r9.m22815()
            r4.print(r9)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            Yue.ۥۣۢ۟ۧ r0 = r4.f21990
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = ""
        L8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            Yue.ۥۢ۠ۦۣ r2 = (Yue.C6076) r2
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = "\n"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L8
        L29:
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m22814() {
            r1 = this;
            r0 = 0
            r1.f21989 = r0
            Yue.ۥۣۢ۟ۧ r0 = r1.f21990
            r0.clear()
            java.util.Map r0 = r1.f21991
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m22815() {
            r2 = this;
            Yue.ۥۣۢ۟ۧ r0 = r2.f21990
            java.lang.Object r0 = r0.peek()
            Yue.ۥۢ۠ۦۣ r0 = (Yue.C6076) r0
            int r0 = r0.f21988
        La:
            int r1 = r2.f21989
            if (r0 != r1) goto L3e
            Yue.ۥۣۢ۟ۧ r0 = r2.f21990
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
            Yue.ۥۣۢ۟ۧ r0 = r2.f21990
            java.lang.Object r0 = r0.pop()
            Yue.ۥۢ۠ۦۣ r0 = (Yue.C6076) r0
            java.util.Map r1 = r2.f21991
            java.lang.String r0 = r0.f21986
            java.lang.Object r0 = r1.get(r0)
            Yue.ۥۣۢ۟ۧ r0 = (Yue.C5909) r0
            r0.pop()
            Yue.ۥۣۢ۟ۧ r0 = r2.f21990
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
            Yue.ۥۣۢ۟ۧ r0 = r2.f21990
            java.lang.Object r0 = r0.peek()
            Yue.ۥۢ۠ۦۣ r0 = (Yue.C6076) r0
            int r0 = r0.f21988
            goto La
        L3e:
            int r0 = r2.f21989
            int r0 = r0 + (-1)
            r2.f21989 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.String m22816(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.f21991
            java.lang.Object r2 = r0.get(r2)
            Yue.ۥۣۢ۟ۧ r2 = (Yue.C5909) r2
            if (r2 == 0) goto L18
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L11
            goto L18
        L11:
            java.lang.Object r2 = r2.peek()
            java.lang.String r2 = (java.lang.String) r2
            return r2
        L18:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Set m22817(java.lang.String r5) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            Yue.ۥۣۢ۟ۧ r1 = r4.f21990
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            Yue.ۥۢ۠ۦۣ r2 = (Yue.C6076) r2
            java.lang.String r3 = r2.m22811()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto Lb
            java.lang.String r2 = r2.m22812()
            r0.add(r2)
            goto Lb
        L29:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m22818() {
            r1 = this;
            int r0 = r1.f21989
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m22819() {
            r1 = this;
            int r0 = r1.f21989
            int r0 = r0 + 1
            r1.f21989 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m22820(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            Yue.ۥۣۢ۟ۧ r0 = r3.f21990
            Yue.ۥۢ۠ۦۣ r1 = new Yue.ۥۢ۠ۦۣ
            int r2 = r3.f21989
            r1.<init>(r4, r5, r2)
            r0.push(r1)
            java.util.Map r0 = r3.f21991
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L22
            Yue.ۥۣۢ۟ۧ r0 = new Yue.ۥۣۢ۟ۧ
            r0.<init>()
            r0.push(r5)
            java.util.Map r5 = r3.f21991
            r5.put(r4, r0)
            goto L2d
        L22:
            java.util.Map r0 = r3.f21991
            java.lang.Object r4 = r0.get(r4)
            Yue.ۥۣۢ۟ۧ r4 = (Yue.C5909) r4
            r4.push(r5)
        L2d:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m22821() {
            r1 = this;
            int r0 = r1.f21989
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
