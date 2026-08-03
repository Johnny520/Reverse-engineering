package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q8.m f10710a;

    public /* synthetic */ j(q8.m r1) {
            r0 = this;
            r0.<init>()
            r0.f10710a = r1
            return
    }

    public final void a(android.content.Intent r5, java.lang.reflect.Method r6) {
            r4 = this;
            q8.m r0 = r4.f10710a
            r0.getClass()
            android.content.ComponentName r1 = r5.getComponent()
            if (r1 == 0) goto L14
            android.content.ComponentName r1 = r5.getComponent()
            java.lang.String r1 = r1.getClassName()
            goto L16
        L14:
            java.lang.String r1 = ""
        L16:
            java.lang.String r2 = q8.m.g(r5)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L21
            goto L51
        L21:
            r0.f10725k = r2
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3a
            java.lang.String r3 = "com.tencent.mm.ui.chatting.ChattingUI"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L44
            java.lang.String r3 = ".ui.chatting."
            boolean r3 = r1.contains(r3)
            if (r3 == 0) goto L3a
            goto L44
        L3a:
            java.lang.String r5 = q8.m.g(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L51
        L44:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L4b
            goto L4e
        L4b:
            r6.getName()
        L4e:
            r0.c(r2)
        L51:
            return
    }
}
