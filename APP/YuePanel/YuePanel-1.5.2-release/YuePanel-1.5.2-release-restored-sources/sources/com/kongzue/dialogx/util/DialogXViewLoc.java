package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class DialogXViewLoc {
    public static boolean skipErrorLoc = true;

    /* JADX INFO: renamed from: h */
    private float f4171h;

    /* JADX INFO: renamed from: w */
    private float f4172w;

    /* JADX INFO: renamed from: x */
    private float f4173x;

    /* JADX INFO: renamed from: y */
    private float f4174y;

    public float getH() {
        return this.f4171h;
    }

    public float getW() {
        return this.f4172w;
    }

    public float getX() {
        return this.f4173x;
    }

    public float getY() {
        return this.f4174y;
    }

    public boolean isSameLoc(int[] iArr) {
        if (iArr.length == 2) {
            return this.f4173x == ((float) iArr[0]) && this.f4174y == ((float) iArr[1]);
        }
        if (iArr.length == 4) {
            return this.f4173x == ((float) iArr[0]) && this.f4174y == ((float) iArr[1]) && this.f4172w == ((float) iArr[2]) && this.f4171h == ((float) iArr[3]);
        }
        return false;
    }

    public void set(int[] iArr) {
        if (iArr.length == 2) {
            if (skipErrorLoc) {
                int i = iArr[0];
                if (i != 0) {
                    this.f4173x = i;
                }
                int i2 = iArr[1];
                if (i2 != 0) {
                    this.f4174y = i2;
                }
            } else {
                this.f4173x = iArr[0];
                this.f4174y = iArr[1];
            }
        }
        if (iArr.length == 4) {
            if (skipErrorLoc) {
                int i3 = iArr[0];
                if (i3 != 0) {
                    this.f4173x = i3;
                }
                int i4 = iArr[1];
                if (i4 != 0) {
                    this.f4174y = i4;
                }
            } else {
                this.f4173x = iArr[0];
                this.f4174y = iArr[1];
            }
            this.f4172w = iArr[2];
            this.f4171h = iArr[3];
        }
    }

    public DialogXViewLoc setH(float f) {
        this.f4171h = f;
        return this;
    }

    public DialogXViewLoc setW(float f) {
        this.f4172w = f;
        return this;
    }

    public DialogXViewLoc setX(float f) {
        this.f4173x = f;
        return this;
    }

    public DialogXViewLoc setY(float f) {
        this.f4174y = f;
        return this;
    }
}
