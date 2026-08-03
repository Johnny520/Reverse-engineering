package ya;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends r8.a {
    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "quick_mark_read"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "拖拽未读角标或加号菜单一键已读"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "quick_mark_read"
            java.lang.String r3 = "快捷已读"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r12) {
            r11 = this;
            r12.getClass()
            ya.i.a(r12)
            ya.g r1 = new ya.g
            java.lang.ClassLoader r12 = r12.f11622c
            y9.b r2 = new y9.b
            java.lang.Class<ya.h> r0 = ya.h.class
            java.lang.Class r5 = eh.a.i(r0)
            r9 = 0
            r10 = 1
            r3 = 2
            java.lang.String r6 = "logError"
            java.lang.String r7 = "logError(Ljava/lang/String;Ljava/lang/Throwable;)V"
            r8 = 0
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1.<init>(r12, r2)
            boolean r0 = r1.f22388b
            if (r0 == 0) goto L27
            goto Lbc
        L27:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.String r2 = "com.tencent.mm.ui.LauncherUI"
            java.lang.Class r12 = h.Hchat.utils.KavaReflector.loadClass(r2, r12)
        L32:
            java.lang.Class<android.view.MotionEvent> r2 = android.view.MotionEvent.class
            java.lang.String r3 = "dispatchTouchEvent"
            java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
            if (r12 == 0) goto L59
            boolean r5 = r4.isAssignableFrom(r12)
            if (r5 == 0) goto L59
            java.lang.Class[] r5 = new java.lang.Class[]{r2}
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r12, r3, r5)
            if (r5 == 0) goto L4d
            r0.add(r5)
        L4d:
            boolean r5 = r12.equals(r4)
            if (r5 == 0) goto L54
            goto L59
        L54:
            java.lang.Class r12 = r12.getSuperclass()
            goto L32
        L59:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L6c
            java.lang.Class[] r12 = new java.lang.Class[]{r2}
            java.lang.reflect.Method r12 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r4, r3, r12)
            if (r12 == 0) goto L6c
            r0.add(r12)
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L73
            goto Lbc
        L73:
            wb.yo r12 = new wb.yo
            r2 = 3
            r12.<init>(r1, r2)
            java.util.Iterator r2 = r0.iterator()
            r3 = 0
            r0 = 0
            r4 = r0
            r5 = r3
        L81:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r2.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r8.i r6 = r8.i.f11631b     // Catch: java.lang.Throwable -> L9d
            r6.b(r0, r12)     // Catch: java.lang.Throwable -> L9d
            int r6 = r5 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L9a
            r5 = r6
            goto La4
        L9a:
            r0 = move-exception
            r5 = r6
            goto L9e
        L9d:
            r0 = move-exception
        L9e:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        La4:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L81
            r4 = r0
            goto L81
        Lac:
            if (r5 <= 0) goto Laf
            r3 = 1
        Laf:
            r1.f22388b = r3
            boolean r12 = r1.f22388b
            if (r12 != 0) goto Lbc
            y9.b r12 = r1.f22387a
            java.lang.String r0 = "快捷已读拖拽Hook安装失败"
            r12.invoke(r0, r4)
        Lbc:
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "快捷已读"
            return r0
    }
}
