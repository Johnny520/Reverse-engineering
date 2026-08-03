package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class ItemDivider {
    private int[] color;
    private int left;
    private int right;
    private int width;

    public ItemDivider() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.width = r0
            r0 = -2104859(0xffffffffffdfe1e5, float:NaN)
            r1 = -12961222(0xffffffffff3a3a3a, float:-2.4753874E38)
            int[] r0 = new int[]{r0, r1}
            r2.color = r0
            return
    }

    public ItemDivider(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r0 = -2104859(0xffffffffffdfe1e5, float:NaN)
            r1 = -12961222(0xffffffffff3a3a3a, float:-2.4753874E38)
            int[] r0 = new int[]{r0, r1}
            r2.color = r0
            r2.left = r3
            r2.right = r4
            r2.width = r5
            return
    }

    private int dip2px(android.content.Context r1, float r2) {
            r0 = this;
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r2 = r2 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r1 = (int) r2
            return r1
    }

    public android.graphics.drawable.Drawable createDividerDrawable(android.content.Context r7, boolean r8) {
            r6 = this;
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r0 = 0
            r1.setShape(r0)
            int r8 = r6.getColor(r8)
            r1.setColor(r8)
            android.graphics.drawable.InsetDrawable r8 = new android.graphics.drawable.InsetDrawable
            int r0 = r6.left
            float r0 = (float) r0
            int r2 = r6.dip2px(r7, r0)
            int r0 = r6.right
            float r0 = (float) r0
            int r4 = r6.dip2px(r7, r0)
            r5 = 0
            r3 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
    }

    public int getColor(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L8
            int[] r2 = r1.color
            r0 = 0
            r2 = r2[r0]
            goto Ld
        L8:
            int[] r2 = r1.color
            r0 = 1
            r2 = r2[r0]
        Ld:
            return r2
    }

    public int getLeft() {
            r1 = this;
            int r0 = r1.left
            return r0
    }

    public int getRight() {
            r1 = this;
            int r0 = r1.right
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.width
            return r0
    }

    public com.kongzue.dialogx.util.ItemDivider setColor(int r1) {
            r0 = this;
            int[] r1 = new int[]{r1, r1}
            r0.color = r1
            return r0
    }

    public com.kongzue.dialogx.util.ItemDivider setColor(boolean r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L8
            int[] r2 = r1.color
            r0 = 0
            r2[r0] = r3
            goto Ld
        L8:
            int[] r2 = r1.color
            r0 = 1
            r2[r0] = r3
        Ld:
            return r1
    }

    public com.kongzue.dialogx.util.ItemDivider setLeft(int r1) {
            r0 = this;
            r0.left = r1
            return r0
    }

    public com.kongzue.dialogx.util.ItemDivider setRight(int r1) {
            r0 = this;
            r0.right = r1
            return r0
    }

    public com.kongzue.dialogx.util.ItemDivider setWidth(int r1) {
            r0 = this;
            r0.width = r1
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ItemDivider{left(dp)="
            r0.append(r1)
            int r1 = r5.left
            r0.append(r1)
            java.lang.String r1 = ", right(dp)="
            r0.append(r1)
            int r1 = r5.right
            r0.append(r1)
            java.lang.String r1 = ", width(px)="
            r0.append(r1)
            int r1 = r5.width
            r0.append(r1)
            java.lang.String r1 = ", color(light)="
            r0.append(r1)
            int[] r1 = r5.color
            r2 = 0
            r1 = r1[r2]
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "#%06X"
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r0.append(r1)
            java.lang.String r1 = ", color(night)="
            r0.append(r1)
            int[] r1 = r5.color
            r4 = 1
            r1 = r1[r4]
            r1 = r1 & r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r3, r1)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
