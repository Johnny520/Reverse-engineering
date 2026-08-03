package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k1 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1242h;

    public /* synthetic */ k1(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f1241g = r2
            r0.f1242h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ k1(java.lang.Object r1, p8.o r2) {
            r0 = this;
            r2 = 19
            r0.f1241g = r2
            r0.<init>()
            r0.f1242h = r1
            return
    }

    public /* synthetic */ k1(p8.h r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f1241g = r3
            r0.f1242h = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f1241g
            r1 = 0
            java.lang.Object r2 = r3.f1242h
            switch(r0) {
                case 0: goto L216;
                case 1: goto L206;
                case 2: goto L1f5;
                case 3: goto L1e1;
                case 4: goto L1d7;
                case 5: goto L1c6;
                case 6: goto L1b5;
                case 7: goto L1a3;
                case 8: goto L18d;
                case 9: goto L175;
                case 10: goto L163;
                case 11: goto L151;
                case 12: goto L13f;
                case 13: goto L12d;
                case 14: goto L11b;
                case 15: goto L109;
                case 16: goto Lf7;
                case 17: goto Le5;
                case 18: goto Ld3;
                case 19: goto L7c;
                case 20: goto L66;
                case 21: goto L5c;
                case 22: goto L56;
                case 23: goto L45;
                case 24: goto L34;
                case 25: goto L23;
                case 26: goto L12;
                default: goto L8;
            }
        L8:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            return r4
        L12:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r0 = r4 instanceof android.widget.ImageView
            if (r0 == 0) goto L22
            r1 = r4
            android.widget.ImageView r1 = (android.widget.ImageView) r1
        L22:
            return r1
        L23:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L33
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
        L33:
            return r1
        L34:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L44
            r1 = r4
            android.app.Activity r1 = (android.app.Activity) r1
        L44:
            return r1
        L45:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L55
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L55:
            return r1
        L56:
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            return r2
        L5c:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            return r4
        L66:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Class r4 = r4.getType()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = gg.l.a(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L7c:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L8c
            java.util.Collection r4 = (java.util.Collection) r4
            goto L8d
        L8c:
            r4 = r1
        L8d:
            if (r4 == 0) goto Laa
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9a:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto Lab
            java.lang.Object r2 = r4.next()
            if (r2 == 0) goto L9a
            r0.add(r2)
            goto L9a
        Laa:
            r0 = r1
        Lab:
            if (r0 != 0) goto Laf
            tf.t r0 = tf.t.f13167g
        Laf:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto Ld2
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto Lbc
            goto Ld1
        Lbc:
            java.util.Iterator r4 = r0.iterator()
        Lc0:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto Ld1
            java.lang.Object r2 = r4.next()
            boolean r2 = p8.o.n(r2)
            if (r2 != 0) goto Lc0
            goto Ld2
        Ld1:
            r1 = r0
        Ld2:
            return r1
        Ld3:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = p8.h.c(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        Le5:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = p8.h.a(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        Lf7:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = p8.h.e(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L109:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = p8.h.a(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L11b:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = p8.h.b(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L12d:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = p8.h.c(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L13f:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = p8.h.b(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L151:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = p8.h.a(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L163:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            java.lang.Class r0 = r2.getClass()
            boolean r4 = p8.h.e(r0, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L175:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r4 = gg.l.a(r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L18d:
            og.f r4 = (og.f) r4
            r4.getClass()
            og.i r4 = (og.i) r4
            java.lang.String r4 = r4.c()
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L1a2
            java.lang.String r4 = ""
        L1a2:
            return r4
        L1a3:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            java.util.Set r0 = fb.u.f3810a
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.Object r4 = r2.opt(r4)
            java.lang.String r4 = fb.u.o0(r4)
            return r4
        L1b5:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L1c5
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
        L1c5:
            return r1
        L1c6:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L1d6
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
        L1d6:
            return r1
        L1d7:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            return r4
        L1e1:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r4.getClass()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r4, r2, r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L1f4
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
        L1f4:
            return r1
        L1f5:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L205
            r1 = r4
            java.lang.String r1 = (java.lang.String) r1
        L205:
            return r1
        L206:
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r2, r4)
            if (r4 == 0) goto L215
            java.lang.String r1 = r4.toString()
        L215:
            return r1
        L216:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            r4.getClass()
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            return r4
    }
}
