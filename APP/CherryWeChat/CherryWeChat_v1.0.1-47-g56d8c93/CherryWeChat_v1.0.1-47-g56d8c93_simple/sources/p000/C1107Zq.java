package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: Zq */
/* JADX INFO: loaded from: classes.dex */
public final class C1107Zq extends C2304o4 {
    /* JADX INFO: renamed from: g */
    public static int m2030g(Context r7, TypedArray r8, int... r9) {
        int r3 = -1;
        int r2 = 0;
    L4:
        if (r2 >= r9.length) goto L14;
        if (r3 >= 0) goto L14;
        int r32 = r9[r2];
        TypedValue r4 = new TypedValue();
        if (r8.getValue(r32, r4) == true) goto L9;
    L12:
        r3 = r8.getDimensionPixelSize(r32, -1);
    L13:
        r2 = r2 + 1;
        goto L4
    L9:
        if (r4.type != 2) goto L12;
        TypedArray r33 = r7.getTheme().obtainStyledAttributes(new int[]{r4.data});
        int r42 = r33.getDimensionPixelSize(0, -1);
        r33.recycle();
        r3 = r42;
    L14:
        return r3;
    }

    @Override // p000.C2304o4, android.widget.TextView
    public final void setTextAppearance(Context r3, int r4) {
        super.setTextAppearance(r3, r4);
        if (AbstractC1293cr.m2538Q(r3, R.attr.textAppearanceLineHeightEnabled, true) == false) goto L8;
        TypedArray r32 = r3.getTheme().obtainStyledAttributes(r4, AbstractC0939Vu.f2951t);
        int r42 = m2030g(getContext(), r32, new int[]{2, 4});
        r32.recycle();
        if (r42 < 0) goto L9;
        setLineHeight(r42);
        return;
    L9:
        return;
    }
}
