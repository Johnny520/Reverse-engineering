package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class CmtReplyDetailProbeHook {
    public static final int $stable = 0;
    private static final java.lang.String C11VB_CLASS = "X.C11VB";
    public static final com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook INSTANCE = null;
    private static final java.lang.String REPLY_DETAIL_ACTIVITY = null;
    private static final java.lang.String TAG = "r579615ec38cd04e";


    static {
            com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook r0 = new com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook.INSTANCE = r0
            java.lang.String r0 = "~797C580CA5DD249BE32348A6895C8D359F04FEB9EADB6AFF22B03AB5F20B434BE6F4417E1E2341E3A041D965C49ACBF66A8E406744D9C40A96E0"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook.REPLY_DETAIL_ACTIVITY = r0
            return
    }

    private CmtReplyDetailProbeHook() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ void access$dumpC11VB(com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook r0, java.lang.ClassLoader r1, java.lang.String r2) {
            r0.dumpC11VB(r1, r2)
            return
    }

    private final void dumpC11VB(java.lang.ClassLoader r14, java.lang.String r15) {
            r13 = this;
            java.lang.String r0 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406115C38D5B251584610F92B64D3CFD59C"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~790C6456CE8FE6EA6C3E741F78B36B289B8F7E92BC9E16B99E3CDE0BA5E566F8B83285495790"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r2 = "X.C11VB"
            java.lang.String r3 = "X.C11Vb"
            java.lang.String r4 = "X.C11vb"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            r2 = 4
            java.lang.String r3 = "r579615ec38cd04e"
            r4 = 0
            if (r1 == 0) goto Lf5
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r5 = p000.qe0.m4877(r14, r1)     // Catch: java.lang.Throwable -> L1e
            if (r5 != 0) goto L35
            goto L1e
        L35:
            java.lang.String r6 = "LIZ"
            java.lang.reflect.Field r6 = p000.qe0.m4878(r5, r6)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r7 = "LIZIZ"
            java.lang.reflect.Field r7 = p000.qe0.m4878(r5, r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r8 = "LIZJ"
            java.lang.reflect.Field r5 = p000.qe0.m4878(r5, r8)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = r5.get(r4)     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto L5e
            java.lang.Class r8 = r6.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L1e
            goto L5f
        L5e:
            r8 = r4
        L5f:
            if (r7 == 0) goto L6a
            java.lang.Class r9 = r7.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L1e
            goto L6b
        L6a:
            r9 = r4
        L6b:
            if (r5 == 0) goto L76
            java.lang.Class r10 = r5.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r10 = r10.getName()     // Catch: java.lang.Throwable -> L1e
            goto L77
        L76:
            r10 = r4
        L77:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r11.<init>()     // Catch: java.lang.Throwable -> L1e
            r11.append(r15)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r12 = " ("
            r11.append(r12)     // Catch: java.lang.Throwable -> L1e
            r11.append(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "), LIZ="
            r11.append(r1)     // Catch: java.lang.Throwable -> L1e
            r11.append(r8)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = ", LIZIZ="
            r11.append(r1)     // Catch: java.lang.Throwable -> L1e
            r11.append(r9)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = ", LIZJ="
            r11.append(r1)     // Catch: java.lang.Throwable -> L1e
            r11.append(r10)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r11.toString()     // Catch: java.lang.Throwable -> L1e
            p000.C0888ux.m5988(r3, r1, r4, r2, r4)     // Catch: java.lang.Throwable -> L1e
            if (r6 == 0) goto Lc0
            java.lang.String r1 = r13.dumpObjectShort(r6)     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r6.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r8 = "aweme short="
            r6.append(r8)     // Catch: java.lang.Throwable -> L1e
            r6.append(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L1e
            p000.C0888ux.m5988(r3, r1, r4, r2, r4)     // Catch: java.lang.Throwable -> L1e
        Lc0:
            if (r5 == 0) goto Lda
            java.lang.String r1 = r13.dumpObjectShort(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r5.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r6 = "comment short="
            r5.append(r6)     // Catch: java.lang.Throwable -> L1e
            r5.append(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L1e
            p000.C0888ux.m5988(r3, r1, r4, r2, r4)     // Catch: java.lang.Throwable -> L1e
        Lda:
            if (r7 == 0) goto Lf4
            java.lang.String r1 = r13.dumpObjectShort(r7)     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r5.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r6 = "pageParam short="
            r5.append(r6)     // Catch: java.lang.Throwable -> L1e
            r5.append(r1)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L1e
            p000.C0888ux.m5988(r3, r1, r4, r2, r4)     // Catch: java.lang.Throwable -> L1e
        Lf4:
            return
        Lf5:
            java.lang.String r13 = ", cannot find valid C11VB class"
            java.lang.String r13 = p000.AbstractC0602nx.m4129(r15, r13)
            p000.C0888ux.m5988(r3, r13, r4, r2, r4)
            return
    }

    private final java.lang.String dumpObjectShort(java.lang.Object r8) {
            r7 = this;
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r7.<init>()     // Catch: java.lang.Throwable -> L85
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L85
            r7.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = " {"
            r7.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> L85
            r1 = 0
        L1a:
            if (r0 == 0) goto L7b
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto L7b
            r2 = 25
            if (r1 >= r2) goto L7b
            java.lang.reflect.Field[] r3 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L85
            τ r3 = p000.h62.m2434(r3)     // Catch: java.lang.Throwable -> L85
        L30:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L76
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L85
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L85
            if (r1 >= r2) goto L76
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.Object r5 = r4.get(r8)     // Catch: java.lang.Throwable -> L47
            goto L4e
        L47:
            r5 = move-exception
            eo1 r6 = new eo1     // Catch: java.lang.Throwable -> L85
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L85
            r5 = r6
        L4e:
            boolean r6 = r5 instanceof p000.eo1     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L53
            r5 = 0
        L53:
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L85
            if (r6 != 0) goto L5f
            boolean r6 = r5 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L85
            if (r6 != 0) goto L5f
            boolean r6 = r5 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L30
        L5f:
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L85
            r7.append(r4)     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = "="
            r7.append(r4)     // Catch: java.lang.Throwable -> L85
            r7.append(r5)     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = ", "
            r7.append(r4)     // Catch: java.lang.Throwable -> L85
            int r1 = r1 + 1
            goto L30
        L76:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L85
            goto L1a
        L7b:
            java.lang.String r8 = "}"
            r7.append(r8)     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L85
            goto L8c
        L85:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L8c:
            java.lang.Throwable r8 = p000.fo1.m2190(r7)
            if (r8 != 0) goto L93
            goto L9d
        L93:
            java.lang.String r7 = r8.getMessage()
            java.lang.String r8 = "dump failed: "
            java.lang.String r7 = p000.lz1.m3687(r8, r7)
        L9d:
            java.lang.String r7 = (java.lang.String) r7
            return r7
    }

    public final void init(java.lang.ClassLoader r5) {
            r4 = this;
            java.lang.String r4 = "r579615ec38cd04e"
            r5.getClass()
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook.REPLY_DETAIL_ACTIVITY     // Catch: java.lang.Throwable -> L25
            java.lang.Class r0 = p000.qe0.m4876(r5, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "onCreate"
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook$init$1 r3 = new com.example.dyhelper.hook.comment.bookmark.CmtReplyDetailProbeHook$init$1     // Catch: java.lang.Throwable -> L25
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L25
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L25
            p000.qe0.m4873(r0, r1, r5)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = "hook success"
            r0 = 4
            r1 = 0
            p000.C0888ux.m5988(r4, r5, r1, r0, r1)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r5 = move-exception
            java.lang.String r0 = "hook failed"
            p000.C0888ux.m5977(r4, r0, r5)
            return
    }
}
