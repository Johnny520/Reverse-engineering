package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.y0 f1161;

    public x0(p000.y0 r1) {
            r0 = this;
            r0.f1161 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final p000.vb mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
            r5 = this;
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r6 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r6
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0074: FILL_ARRAY_DATA , data: [-25, -48, 6, -62, -24} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x007c: FILL_ARRAY_DATA , data: [-105, -79, 116, -93, -123, -54} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r6)
            java.lang.Object[] r0 = r6.args
            r2 = 1
            r0 = r0[r2]
            if (r0 != 0) goto L1d
            goto L70
        L1d:
            ۟.n8 r2 = p000.n8.f823
            r2.getClass()
            android.view.View r6 = p000.n8.m298(r6)
            r2 = 0
            if (r6 == 0) goto L64
            ۟.k r2 = p000.k8.f660
            ۟.k r2 = ۟.k8.a.m235()
            java.lang.String r2 = r2.f540
            r3 = 22
            byte[] r3 = new byte[r3]
            r3 = {x0084: FILL_ARRAY_DATA , data: [111, 70, 107, 102, 29, 17, 102, 66, 107, 117, 29, 5, 100, 66, 122, 112, 38, 32, 70, 100, 115, 103} // fill-array
            byte[] r4 = new byte[r1]
            r4 = {x0094: FILL_ARRAY_DATA , data: [34, 39, 31, 20, 116, 105} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            p000.h4.m188(r3, r2)
            r3 = 15
            byte[] r3 = new byte[r3]
            r3 = {x009c: FILL_ARRAY_DATA , data: [-42, -109, -51, 77, -89, -26, -42, -120, -36, 70, -112, -35, -35, -124, -51} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x00a8: FILL_ARRAY_DATA , data: [-72, -4, -71, 40, -28, -119} // fill-array
            java.lang.String r1 = p000.oa.m332(r3, r1)
            java.lang.Integer r1 = p000.r3.m367(r2, r1)
            if (r1 == 0) goto L5f
            int r1 = r1.intValue()
            goto L60
        L5f:
            r1 = -1
        L60:
            android.view.View r2 = r6.findViewById(r1)
        L64:
            if (r2 == 0) goto L70
            ۟.y0 r6 = r5.f1161
            ۟.t0 r1 = new ۟.t0
            r1.<init>(r6, r0)
            r2.setOnLongClickListener(r1)
        L70:
            ۟.vb r6 = p000.vb.f1114
            return r6
    }
}
