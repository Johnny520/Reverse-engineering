package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class vq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wb.vq f19807a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f19808b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static fg.l f19809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static android.app.Activity f19810d;

    static {
            wb.vq r0 = new wb.vq
            r0.<init>()
            wb.vq.f19807a = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            wb.vq.f19808b = r0
            return
    }

    public static android.net.Uri a(android.os.Bundle r4) {
            r0 = 0
            if (r4 != 0) goto L4
            goto L51
        L4:
            java.util.Set r1 = r4.keySet()     // Catch: java.lang.Throwable -> L51
            r1.getClass()     // Catch: java.lang.Throwable -> L51
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L51
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L51
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> L51
            boolean r3 = r2 instanceof android.net.Uri     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L28
            android.net.Uri r2 = (android.net.Uri) r2     // Catch: java.lang.Throwable -> L51
            goto L4e
        L28:
            boolean r3 = r2 instanceof android.content.Intent     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L42
            r3 = r2
            android.content.Intent r3 = (android.content.Intent) r3     // Catch: java.lang.Throwable -> L51
            android.net.Uri r3 = r3.getData()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L37
            r2 = r3
            goto L4e
        L37:
            android.content.Intent r2 = (android.content.Intent) r2     // Catch: java.lang.Throwable -> L51
            android.os.Bundle r2 = r2.getExtras()     // Catch: java.lang.Throwable -> L51
            android.net.Uri r2 = a(r2)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L42:
            boolean r3 = r2 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L4d
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Throwable -> L51
            android.net.Uri r2 = a(r2)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L4d:
            r2 = r0
        L4e:
            if (r2 == 0) goto L11
            return r2
        L51:
            return r0
    }

    public final synchronized void b(java.lang.Class r5) {
            r4 = this;
            monitor-enter(r4)
            java.util.HashSet r0 = wb.vq.f19808b     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r0.contains(r5)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto Lb
            monitor-exit(r4)
            return
        Lb:
            java.lang.String r1 = "onActivityResult"
            wb.q0 r2 = new wb.q0     // Catch: java.lang.Throwable -> L19
            r3 = 2
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

    public final synchronized void c(android.app.Activity r4, fg.l r5) {
            r3 = this;
            monitor-enter(r3)
            wb.vq.f19809c = r5     // Catch: java.lang.Throwable -> L54
            wb.vq.f19810d = r4     // Catch: java.lang.Throwable -> L54
            java.lang.Class r5 = r4.getClass()     // Catch: java.lang.Throwable -> L54
            r3.b(r5)     // Catch: java.lang.Throwable -> L54
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r3.b(r5)     // Catch: java.lang.Throwable -> L54
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "android.intent.category.OPENABLE"
            r5.addCategory(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "*/*"
            r5.setType(r0)     // Catch: java.lang.Throwable -> L54
            r0 = 1
            r5.addFlags(r0)     // Catch: java.lang.Throwable -> L54
            r1 = 64
            r5.addFlags(r1)     // Catch: java.lang.Throwable -> L54
            wb.ho.B4(r4, r5)     // Catch: java.lang.Throwable -> L54
            r1 = 1212371541(0x48435255, float:200009.33)
            r4.startActivityForResult(r5, r1)     // Catch: java.lang.Throwable -> L35
            goto L52
        L35:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "android.intent.action.GET_CONTENT"
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r5.addCategory(r2)     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "*/*"
            r5.setType(r2)     // Catch: java.lang.Throwable -> L54
            r5.addFlags(r0)     // Catch: java.lang.Throwable -> L54
            java.lang.String r0 = "选择铃声文件"
            android.content.Intent r5 = android.content.Intent.createChooser(r5, r0)     // Catch: java.lang.Throwable -> L54
            r4.startActivityForResult(r5, r1)     // Catch: java.lang.Throwable -> L54
        L52:
            monitor-exit(r3)
            return
        L54:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
            throw r4
    }

    public final synchronized void d(android.app.Activity r3, java.lang.String r4, fg.l r5) {
            r2 = this;
            monitor-enter(r2)
            r4.getClass()     // Catch: java.lang.Throwable -> L46
            wb.vq.f19809c = r5     // Catch: java.lang.Throwable -> L46
            wb.vq.f19810d = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L46
            r2.b(r5)     // Catch: java.lang.Throwable -> L46
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r2.b(r5)     // Catch: java.lang.Throwable -> L46
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "android.intent.action.RINGTONE_PICKER"
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "android.intent.extra.ringtone.TYPE"
            r1 = 2
            r5.putExtra(r0, r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "android.intent.extra.ringtone.TITLE"
            java.lang.String r1 = "选择通知铃声"
            r5.putExtra(r0, r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_DEFAULT"
            r1 = 1
            r5.putExtra(r0, r1)     // Catch: java.lang.Throwable -> L46
            java.lang.String r0 = "android.intent.extra.ringtone.SHOW_SILENT"
            r5.putExtra(r0, r1)     // Catch: java.lang.Throwable -> L46
            r5.addFlags(r1)     // Catch: java.lang.Throwable -> L46
            boolean r0 = og.m.t0(r4)     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L48
            java.lang.String r0 = "android.intent.extra.ringtone.EXISTING_URI"
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L46
            r5.putExtra(r0, r4)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r3 = move-exception
            goto L50
        L48:
            r4 = 1212371540(0x48435254, float:200009.31)
            r3.startActivityForResult(r5, r4)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r2)
            return
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L46
            throw r3
    }
}
