package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh0 implements java.lang.reflect.InvocationHandler {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9373;

    public /* synthetic */ rh0(int r1) {
            r0 = this;
            r0.f9373 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ rh0(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f9373 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) {
            r3 = this;
            int r3 = r3.f9373
            switch(r3) {
                case 0: goto Lea;
                case 1: goto L9f;
                case 2: goto L9a;
                default: goto L5;
            }
        L5:
            r3 = 0
            if (r5 == 0) goto Ld
            java.lang.String r4 = r5.getName()
            goto Le
        Ld:
            r4 = r3
        Le:
            java.lang.String r5 = "onSuccess"
            boolean r5 = p000.ln0.m3626(r4, r5)
            r0 = 0
            if (r5 == 0) goto L78
            if (r6 == 0) goto L1e
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r0, r6)
            goto L1f
        L1e:
            r4 = r3
        L1f:
            if (r4 == 0) goto L2e
            java.lang.String r5 = "getConversationId"
            java.lang.Object r5 = p000.ry1.m5214(r4, r5)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L2e
            java.lang.String r5 = (java.lang.String) r5
            goto L2f
        L2e:
            r5 = r3
        L2f:
            java.lang.String r6 = ""
            if (r5 != 0) goto L34
            r5 = r6
        L34:
            if (r4 == 0) goto L43
            java.lang.String r1 = "getUuid"
            java.lang.Object r1 = p000.ry1.m5214(r4, r1)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L43
            java.lang.String r1 = (java.lang.String) r1
            goto L44
        L43:
            r1 = r3
        L44:
            if (r1 != 0) goto L47
            goto L48
        L47:
            r6 = r1
        L48:
            if (r4 == 0) goto L5a
            java.lang.String r1 = "getMsgStatus"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = p000.ry1.m5216(r1, r4, r0)
            java.lang.Number r4 = (java.lang.Number) r4
            int r0 = r4.intValue()
        L5a:
            java.lang.String r4 = " uuid="
            java.lang.String r1 = " status="
            java.lang.String r2 = "发送成功回调 conv="
            java.lang.StringBuilder r4 = p000.lz1.m3695(r2, r5, r4, r6, r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            p000.ry1.m5276(r4)
            boolean r4 = p000.q02.m4671(r5)
            if (r4 != 0) goto L99
            p000.ry1.m5250(r5)
            goto L99
        L78:
            java.lang.String r5 = "onFailure"
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L99
            if (r6 == 0) goto L87
            java.lang.Object r4 = p000.AbstractC0312g7.m2253(r0, r6)
            goto L88
        L87:
            r4 = r3
        L88:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "发送失败回调: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            p000.ry1.m5275(r4, r3)
        L99:
            return r3
        L9a:
            java.lang.Object r3 = com.example.dyhelper.hook.comment.bookmark.ProfileAwemeListClient.m1434(r4, r5, r6)
            return r3
        L9f:
            java.lang.String r3 = r5.getName()
            r5 = 0
            if (r3 == 0) goto Le9
            int r0 = r3.hashCode()
            switch(r0) {
                case -1776922004: goto Lde;
                case -1295482945: goto Lc6;
                case -1183693704: goto Lc0;
                case 147696667: goto Lae;
                default: goto Lad;
            }
        Lad:
            goto Le9
        Lae:
            java.lang.String r6 = "hashCode"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto Lb7
            goto Le9
        Lb7:
            int r3 = java.lang.System.identityHashCode(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            goto Le9
        Lc0:
            java.lang.String r4 = "invoke"
            r3.equals(r4)
            goto Le9
        Lc6:
            java.lang.String r0 = "equals"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto Lcf
            goto Le9
        Lcf:
            r3 = 0
            if (r6 == 0) goto Ld6
            java.lang.Object r5 = p000.AbstractC0312g7.m2253(r3, r6)
        Ld6:
            if (r4 != r5) goto Ld9
            r3 = 1
        Ld9:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            goto Le9
        Lde:
            java.lang.String r4 = "toString"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Le7
            goto Le9
        Le7:
            java.lang.String r5 = "DYHelperPetElfImReadyCallback"
        Le9:
            return r5
        Lea:
            java.lang.Class r3 = r5.getDeclaringClass()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r3 = p000.ln0.m3626(r3, r0)
            r0 = 0
            if (r3 == 0) goto L154
            java.lang.String r3 = r5.getName()
            if (r3 == 0) goto L148
            int r1 = r3.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L13d
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L124
            r6 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r6) goto L111
            goto L148
        L111:
            java.lang.String r6 = "hashCode"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L11a
            goto L148
        L11a:
            int r3 = java.lang.System.identityHashCode(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L1a3
        L124:
            java.lang.String r1 = "equals"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L12d
            goto L148
        L12d:
            if (r6 == 0) goto L134
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r0, r6)
            goto L135
        L134:
            r3 = 0
        L135:
            if (r4 != r3) goto L138
            r0 = 1
        L138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            goto L1a3
        L13d:
            java.lang.String r4 = "toString"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L148
            java.lang.String r3 = "IMConversationCatalogObserver"
            goto L1a3
        L148:
            java.lang.Class r3 = r5.getReturnType()
            r3.getClass()
            java.lang.Object r3 = p000.vh0.m6232(r3)
            goto L1a3
        L154:
            java.lang.String r3 = r5.getName()     // Catch: java.lang.Throwable -> L198
            r3.getClass()     // Catch: java.lang.Throwable -> L198
            if (r6 == 0) goto L198
            int r4 = r6.length     // Catch: java.lang.Throwable -> L198
            if (r4 != 0) goto L161
            goto L198
        L161:
            java.lang.String r4 = "onQueryConversationPage"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L198
            if (r3 == 0) goto L171
            java.lang.Object r3 = p000.AbstractC0312g7.m2253(r0, r6)     // Catch: java.lang.Throwable -> L198
            p000.vh0.m6218(r3)     // Catch: java.lang.Throwable -> L198
            goto L198
        L171:
            int r3 = r6.length     // Catch: java.lang.Throwable -> L198
        L172:
            if (r0 >= r3) goto L198
            r4 = r6[r0]     // Catch: java.lang.Throwable -> L198
            if (r4 == 0) goto L195
            boolean r1 = p000.vh0.m6237(r4)     // Catch: java.lang.Throwable -> L198
            if (r1 != 0) goto L195
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L198
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L198
            java.lang.String r2 = "~7924EBBB37EFAC6EEF193CFCBA9DD6232A50A25E0A4B21992CD70263C63D9042834AF1CA597362601B03C66D"
            java.lang.String r2 = p000.jf0.m2957(r2)     // Catch: java.lang.Throwable -> L198
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L198
            if (r1 != 0) goto L195
            p000.vh0.m6218(r4)     // Catch: java.lang.Throwable -> L198
        L195:
            int r0 = r0 + 1
            goto L172
        L198:
            java.lang.Class r3 = r5.getReturnType()
            r3.getClass()
            java.lang.Object r3 = p000.vh0.m6232(r3)
        L1a3:
            return r3
    }
}
