package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class DialogXViewLoc {
    public static boolean skipErrorLoc = true;
    private float h;
    private float w;
    private float x;
    private float y;

    static {
            return
    }

    public DialogXViewLoc() {
            r0 = this;
            r0.<init>()
            return
    }

    public float getH() {
            r1 = this;
            float r0 = r1.h
            return r0
    }

    public float getW() {
            r1 = this;
            float r0 = r1.w
            return r0
    }

    public float getX() {
            r1 = this;
            float r0 = r1.x
            return r0
    }

    public float getY() {
            r1 = this;
            float r0 = r1.y
            return r0
    }

    public boolean isSameLoc(int[] r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 != r3) goto L1b
            float r0 = r5.x
            r3 = r6[r2]
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L19
            float r0 = r5.y
            r6 = r6[r1]
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            return r1
        L1b:
            int r0 = r6.length
            r4 = 4
            if (r0 != r4) goto L47
            float r0 = r5.x
            r4 = r6[r2]
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L45
            float r0 = r5.y
            r4 = r6[r1]
            float r4 = (float) r4
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L45
            float r0 = r5.w
            r3 = r6[r3]
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L45
            float r0 = r5.h
            r3 = 3
            r6 = r6[r3]
            float r6 = (float) r6
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 != 0) goto L45
            goto L46
        L45:
            r1 = r2
        L46:
            return r1
        L47:
            return r2
    }

    public void set(int[] r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 != r3) goto L23
            boolean r0 = com.kongzue.dialogx.util.DialogXViewLoc.skipErrorLoc
            if (r0 == 0) goto L19
            r0 = r6[r2]
            if (r0 == 0) goto L11
            float r0 = (float) r0
            r5.x = r0
        L11:
            r0 = r6[r1]
            if (r0 == 0) goto L23
            float r0 = (float) r0
            r5.y = r0
            goto L23
        L19:
            r0 = r6[r2]
            float r0 = (float) r0
            r5.x = r0
            r0 = r6[r1]
            float r0 = (float) r0
            r5.y = r0
        L23:
            int r0 = r6.length
            r4 = 4
            if (r0 != r4) goto L4f
            boolean r0 = com.kongzue.dialogx.util.DialogXViewLoc.skipErrorLoc
            if (r0 == 0) goto L3a
            r0 = r6[r2]
            if (r0 == 0) goto L32
            float r0 = (float) r0
            r5.x = r0
        L32:
            r0 = r6[r1]
            if (r0 == 0) goto L44
            float r0 = (float) r0
            r5.y = r0
            goto L44
        L3a:
            r0 = r6[r2]
            float r0 = (float) r0
            r5.x = r0
            r0 = r6[r1]
            float r0 = (float) r0
            r5.y = r0
        L44:
            r0 = r6[r3]
            float r0 = (float) r0
            r5.w = r0
            r0 = 3
            r6 = r6[r0]
            float r6 = (float) r6
            r5.h = r6
        L4f:
            return
    }

    public com.kongzue.dialogx.util.DialogXViewLoc setH(float r1) {
            r0 = this;
            r0.h = r1
            return r0
    }

    public com.kongzue.dialogx.util.DialogXViewLoc setW(float r1) {
            r0 = this;
            r0.w = r1
            return r0
    }

    public com.kongzue.dialogx.util.DialogXViewLoc setX(float r1) {
            r0 = this;
            r0.x = r1
            return r0
    }

    public com.kongzue.dialogx.util.DialogXViewLoc setY(float r1) {
            r0 = this;
            r0.y = r1
            return r0
    }
}
