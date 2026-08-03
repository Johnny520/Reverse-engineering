package p000;

/* JADX INFO: loaded from: classes.dex */
public final class d5 extends p000.o4 implements p000.g3<de.robv.android.xposed.XC_MethodHook.MethodHookParam, java.lang.Object> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.f5 f291;

    public d5(p000.f5 r1) {
            r0 = this;
            r0.f291 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final java.lang.Object mo12(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
            r3 = this;
            de.robv.android.xposed.XC_MethodHook$MethodHookParam r4 = (de.robv.android.xposed.XC_MethodHook.MethodHookParam) r4
            r0 = 2
            byte[] r1 = new byte[r0]
            r1 = {x0030: FILL_ARRAY_DATA , data: [-105, 109} // fill-array
            r2 = 6
            byte[] r2 = new byte[r2]
            r2 = {x0036: FILL_ARRAY_DATA , data: [-2, 25, 37, -12, -36, -24} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m189(r1, r4)
            boolean r1 = p000.f5.f341
            if (r1 == 0) goto L2b
            ۟.f5 r1 = r3.f291
            java.util.List r1 = p000.f5.m148(r1)
            int r2 = r1.size()
            if (r2 != r0) goto L2b
            r4 = 0
            java.lang.Object r4 = r1.get(r4)
            goto L2f
        L2b:
            java.lang.Object r4 = p000.r3.m375(r4)
        L2f:
            return r4
    }
}
