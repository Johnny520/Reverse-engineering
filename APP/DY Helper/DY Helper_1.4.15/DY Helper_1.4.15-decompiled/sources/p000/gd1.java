package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gd1 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f4330;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ org.json.JSONObject f4331;

    public /* synthetic */ gd1(p000.ij0 r1, org.json.JSONObject r2) {
            r0 = this;
            r1 = 1
            r0.f4330 = r1
            r0.<init>()
            r0.f4331 = r2
            return
    }

    public /* synthetic */ gd1(org.json.JSONObject r1, int r2) {
            r0 = this;
            r0.f4330 = r2
            r0.f4331 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f4330
            java.lang.String r2 = (java.lang.String) r2
            switch(r0) {
                case 0: goto Lb3;
                case 1: goto L6d;
                case 2: goto L46;
                case 3: goto L1f;
                default: goto L7;
            }
        L7:
            r2.getClass()
            org.json.JSONObject r1 = r1.f4331
            java.lang.Object r1 = r1.opt(r2)
            r2 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r0 = org.json.JSONObject.NULL
            if (r1 != r0) goto L18
            r1 = r2
        L18:
            if (r1 == 0) goto L1e
            java.lang.String r2 = r1.toString()
        L1e:
            return r2
        L1f:
            r2.getClass()
            org.json.JSONObject r1 = r1.f4331
            java.lang.Object r1 = r1.opt(r2)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L37
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L45
        L37:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L44
            java.lang.String r1 = (java.lang.String) r1
            r2 = 10
            java.lang.Integer r1 = p000.x02.m6487(r1, r2)
            goto L45
        L44:
            r1 = 0
        L45:
            return r1
        L46:
            r2.getClass()
            org.json.JSONObject r1 = r1.f4331
            java.lang.Object r1 = r1.opt(r2)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L5e
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L6c
        L5e:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L6b
            java.lang.String r1 = (java.lang.String) r1
            r2 = 10
            java.lang.Integer r1 = p000.x02.m6487(r1, r2)
            goto L6c
        L6b:
            r1 = 0
        L6c:
            return r1
        L6d:
            org.json.JSONObject r1 = r1.f4331
            java.lang.Object r1 = r1.opt(r2)
            boolean r0 = r1 instanceof org.json.JSONObject
            if (r0 == 0) goto L7a
            java.lang.String r1 = "object"
            goto Lac
        L7a:
            boolean r0 = r1 instanceof org.json.JSONArray
            if (r0 == 0) goto L81
            java.lang.String r1 = "array"
            goto Lac
        L81:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L88
            java.lang.String r1 = "string"
            goto Lac
        L88:
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L8f
            java.lang.String r1 = "number"
            goto Lac
        L8f:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L96
            java.lang.String r1 = "boolean"
            goto Lac
        L96:
            if (r1 == 0) goto Laa
            java.lang.Object r0 = org.json.JSONObject.NULL
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto La1
            goto Laa
        La1:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto Lac
        Laa:
            java.lang.String r1 = "null"
        Lac:
            java.lang.String r0 = ":"
            java.lang.String r1 = p000.lz1.m3688(r2, r0, r1)
            return r1
        Lb3:
            r2.getClass()
            org.json.JSONObject r1 = r1.f4331
            java.lang.Object r1 = p000.kd1.m3191(r2, r1)
            r2 = 0
            kd1 r0 = p000.kd1.f5861
            java.lang.String r1 = r0.m3201(r2, r1)
            return r1
    }
}
