package com.kongzue.dialogx.util;

import Yue.C6193;
import Yue.C8273;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;

/* JADX INFO: loaded from: classes2.dex */
public class ItemDivider {
    private int[] color;
    private int left;
    private int right;
    private int width;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ItemDivider() {
        this.width = 1;
        this.color = new int[]{-2104859, -12961222};
    }

    private int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public Drawable createDividerDrawable(Context context, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(getColor(z));
        return new InsetDrawable((Drawable) gradientDrawable, dip2px(context, this.left), 0, dip2px(context, this.right), 0);
    }

    public int getColor(boolean z) {
        return z ? this.color[0] : this.color[1];
    }

    public int getLeft() {
        return this.left;
    }

    public int getRight() {
        return this.right;
    }

    public int getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ItemDivider setColor(boolean z, int i) {
        if (z) {
            this.color[0] = i;
        } else {
            this.color[1] = i;
        }
        return this;
    }

    public ItemDivider setLeft(int i) {
        this.left = i;
        return this;
    }

    public ItemDivider setRight(int i) {
        this.right = i;
        return this;
    }

    public ItemDivider setWidth(int i) {
        this.width = i;
        return this;
    }

    public String toString() {
        return "ItemDivider{left(dp)=" + this.left + ", right(dp)=" + this.right + ", width(px)=" + this.width + ", color(light)=" + String.format("#%06X", Integer.valueOf(this.color[0] & C8273.f24691)) + ", color(night)=" + String.format("#%06X", Integer.valueOf(this.color[1] & C8273.f24691)) + C6193.f1885;
    }

    public ItemDivider setColor(int i) {
        this.color = new int[]{i, i};
        return this;
    }

    public ItemDivider(int i, int i2, int i3) {
        this.color = new int[]{-2104859, -12961222};
        this.left = i;
        this.right = i2;
        this.width = i3;
    }
}
