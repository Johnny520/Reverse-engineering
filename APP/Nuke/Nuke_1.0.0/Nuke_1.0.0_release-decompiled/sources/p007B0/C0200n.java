package p007B0;

import android.view.MotionEvent;
import p000A.C0038T0;
import p154e2.C2029h;

/* JADX INFO: renamed from: B0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0200n {

    /* JADX INFO: renamed from: a */
    public final Object f696a;

    /* JADX INFO: renamed from: b */
    public final C2029h f697b;

    /* JADX INFO: renamed from: c */
    public final int f698c;

    /* JADX INFO: renamed from: d */
    public final int f699d;

    /* JADX INFO: renamed from: e */
    public final int f700e;

    /* JADX INFO: renamed from: f */
    public int f701f;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0200n(java.util.List r7, p154e2.C2029h r8) {
        /*
            r6 = this;
            r6.<init>()
            r6.f696a = r7
            r6.f697b = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            r1 = 0
            if (r8 < r0) goto L19
            android.view.MotionEvent r8 = r6.m310a()
            if (r8 == 0) goto L19
            int r8 = p002A1.AbstractC0151x.m203d(r8)
            goto L1a
        L19:
            r8 = r1
        L1a:
            r6.f698c = r8
            android.view.MotionEvent r8 = r6.m310a()
            if (r8 == 0) goto L27
            int r8 = r8.getButtonState()
            goto L28
        L27:
            r8 = r1
        L28:
            r6.f699d = r8
            android.view.MotionEvent r8 = r6.m310a()
            if (r8 == 0) goto L35
            int r8 = r8.getMetaState()
            goto L36
        L35:
            r8 = r1
        L36:
            r6.f700e = r8
            android.view.MotionEvent r8 = r6.m310a()
            r0 = 3
            r2 = 2
            r3 = 1
            if (r8 == 0) goto L5b
            int r7 = r8.getActionMasked()
            if (r7 == 0) goto L59
            if (r7 == r3) goto L57
            if (r7 == r2) goto L55
            switch(r7) {
                case 5: goto L59;
                case 6: goto L57;
                case 7: goto L55;
                case 8: goto L53;
                case 9: goto L51;
                case 10: goto L4f;
                default: goto L4e;
            }
        L4e:
            goto L78
        L4f:
            r1 = 5
            goto L78
        L51:
            r1 = 4
            goto L78
        L53:
            r1 = 6
            goto L78
        L55:
            r1 = r0
            goto L78
        L57:
            r1 = r2
            goto L78
        L59:
            r1 = r3
            goto L78
        L5b:
            int r8 = r7.size()
        L5f:
            if (r1 >= r8) goto L55
            java.lang.Object r4 = r7.get(r1)
            B0.w r4 = (p007B0.C0209w) r4
            boolean r5 = p007B0.AbstractC0208v.m314d(r4)
            if (r5 == 0) goto L6e
            goto L57
        L6e:
            boolean r4 = p007B0.AbstractC0208v.m312b(r4)
            if (r4 == 0) goto L75
            goto L59
        L75:
            int r1 = r1 + 1
            goto L5f
        L78:
            r6.f701f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007B0.C0200n.<init>(java.util.List, e2.h):void");
    }

    /* JADX INFO: renamed from: a */
    public final MotionEvent m310a() {
        C2029h c2029h = this.f697b;
        if (c2029h != null) {
            return (MotionEvent) ((C0038T0) c2029h.f6764g).f170f;
        }
        return null;
    }
}
