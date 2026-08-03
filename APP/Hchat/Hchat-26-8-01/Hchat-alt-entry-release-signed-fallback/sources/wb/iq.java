package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class iq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb.iq f16906a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f16907b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static fg.l f16908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static android.app.Activity f16909d;

    static {
            wb.iq r0 = new wb.iq
            r0.<init>()
            wb.iq.f16906a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            wb.iq.f16907b = r0
            return
    }

    public final synchronized void a(java.lang.Class r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.HashSet r0 = wb.iq.f16907b     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r0.contains(r5)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto Lb
            monitor-exit(r4)
            return
        Lb:
            java.lang.String r1 = "onActivityResult"
            wb.q0 r2 = new wb.q0     // Catch: java.lang.Throwable -> L19
            r3 = 1
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L19
            de.robv.android.xposed.XposedBridge.hookAllMethods(r5, r1, r2)     // Catch: java.lang.Throwable -> L19
            r0.add(r5)     // Catch: java.lang.Throwable -> L19
        L19:
            monitor-exit(r4)
            return
        L1b:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
            throw r5
    }

    public final synchronized void b(android.app.Activity r4, int r5, fg.l r6) {
            r3 = this;
            monitor-enter(r3)
            wb.iq.f16908c = r6     // Catch: java.lang.Throwable -> L60
            wb.iq.f16909d = r4     // Catch: java.lang.Throwable -> L60
            java.lang.Class r6 = r4.getClass()     // Catch: java.lang.Throwable -> L60
            r3.a(r6)     // Catch: java.lang.Throwable -> L60
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r3.a(r6)     // Catch: java.lang.Throwable -> L60
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r6.addCategory(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "*/*"
            r6.setType(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "android.intent.extra.ALLOW_MULTIPLE"
            r1 = 1
            r6.putExtra(r0, r1)     // Catch: java.lang.Throwable -> L60
            r6.addFlags(r1)     // Catch: java.lang.Throwable -> L60
            r0 = 64
            r6.addFlags(r0)     // Catch: java.lang.Throwable -> L60
            wb.ho.B4(r4, r6)     // Catch: java.lang.Throwable -> L60
            r0 = 1212371542(0x48435256, float:200009.34)
            r4.startActivityForResult(r6, r0)     // Catch: java.lang.Throwable -> L3a
            goto L5e
        L3a:
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "android.intent.action.GET_CONTENT"
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r6.addCategory(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "*/*"
            r6.setType(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = "android.intent.extra.ALLOW_MULTIPLE"
            r6.putExtra(r2, r1)     // Catch: java.lang.Throwable -> L60
            r6.addFlags(r1)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = wb.ho.J6(r5)     // Catch: java.lang.Throwable -> L60
            android.content.Intent r5 = android.content.Intent.createChooser(r6, r5)     // Catch: java.lang.Throwable -> L60
            r4.startActivityForResult(r5, r0)     // Catch: java.lang.Throwable -> L60
        L5e:
            monitor-exit(r3)
            return
        L60:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L60
            throw r4
    }
}
