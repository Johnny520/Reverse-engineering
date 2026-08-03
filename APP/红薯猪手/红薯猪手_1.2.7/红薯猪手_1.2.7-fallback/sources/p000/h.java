package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, p000.vb> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final p000.h f423 = null;

    static {
            ۟.h r0 = new ۟.h
            r0.<init>()
            p000.h.f423 = r0
            return
    }

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final p000.vb mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
            r4 = this;
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r5 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r5
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0066: FILL_ARRAY_DATA , data: [49, -65} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x006c: FILL_ARRAY_DATA , data: [88, -53, -6, 122, -9, 102} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r5)
            ۟.n8 r0 = p000.n8.f823
            r0.getClass()
            android.view.View r5 = p000.n8.m298(r5)
            if (r5 == 0) goto L5a
            ۟.k r0 = p000.k8.f660
            java.lang.String r0 = r0.f535
            r2 = 19
            byte[] r2 = new byte[r2]
            r2 = {x0074: FILL_ARRAY_DATA , data: [-124, -51, 42, -72, -110, -94, -118, -61, 51, -89, -98, -76, -67, -2, 23, -82, -72, -74, -70} // fill-array
            byte[] r3 = new byte[r1]
            r3 = {x0082: FILL_ARRAY_DATA , data: [-55, -84, 94, -54, -5, -38} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            p000.h4.m188(r2, r0)
            r2 = 17
            byte[] r2 = new byte[r2]
            r2 = {x008a: FILL_ARRAY_DATA , data: [-118, -96, 68, -119, -22, 102, -97, -106, 84, -125, -19, 68, -118, -70, 72, -109, -21} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x0098: FILL_ARRAY_DATA , data: [-21, -61, 39, -26, -97, 8} // fill-array
            java.lang.String r1 = p000.oa.m332(r2, r1)
            java.lang.Integer r0 = p000.r3.m367(r0, r1)
            if (r0 == 0) goto L52
            int r0 = r0.intValue()
            goto L53
        L52:
            r0 = -1
        L53:
            android.view.View r5 = r5.findViewById(r0)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            goto L5b
        L5a:
            r5 = 0
        L5b:
            if (r5 == 0) goto L62
            r0 = 8
            r5.setVisibility(r0)
        L62:
            ۟.vb r5 = p000.vb.f1114
            return r5
    }
}
