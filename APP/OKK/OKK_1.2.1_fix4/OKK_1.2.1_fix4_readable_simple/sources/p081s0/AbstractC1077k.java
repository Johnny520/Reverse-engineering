package p081s0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.lang.reflect.Field;
import java.util.ArrayList;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p034S.AbstractC0324d;
import p037U.C0375k;
import p058g0.AbstractC0942a;

/* JADX INFO: renamed from: s0.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1077k {

    /* JADX INFO: renamed from: a */
    public static final int[] f4178a = null;

    /* JADX INFO: renamed from: b */
    public static final int[] f4179b = null;

    /* JADX INFO: renamed from: c */
    public static final C0375k f4180c = null;

    static {
        f4178a = new int[]{C1031R.attr.colorPrimary};
        f4179b = new int[]{C1031R.attr.colorPrimaryVariant};
        f4180c = new C0375k(4);
    }

    /* JADX INFO: renamed from: a */
    public static void m2553a(Context r1, AttributeSet r2, int r3, int r4) {
        TypedArray r22 = r1.obtainStyledAttributes(r2, AbstractC0942a.f3350v, r3, r4);
        boolean r42 = r22.getBoolean(1, false);
        r22.recycle();
        if (r42 == false) goto L11;
        TypedValue r23 = new TypedValue();
        if (r1.getTheme().resolveAttribute(C1031R.attr.isMaterialTheme, r23, true) == true) goto L7;
    L10:
        m2555c(r1, f4179b, "Theme.MaterialComponents");
        goto L11
    L7:
        if (r23.type != 18) goto L11;
        if (r23.data == 0) goto L10;
    L11:
        m2555c(r1, f4178a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    public static void m2554b(Context r5, AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
        TypedArray r02 = r5.obtainStyledAttributes(r6, AbstractC0942a.f3350v, r8, r9);
        boolean r2 = false;
        if (r02.getBoolean(2, false) == true) goto L7;
        r02.recycle();
        return;
    L7:
        if (r10.length == 0) goto L9;
        TypedArray r52 = r5.obtainStyledAttributes(r6, r7, r8, r9);
        int r62 = r10.length;
        int r72 = 0;
    L12:
        if (r72 >= r62) goto L17;
        if (r52.getResourceId(r10[r72], -1) == (-1)) goto L15;
        r72 = r72 + 1;
        goto L12
    L15:
        r52.recycle();
    L18:
        r02.recycle();
        if (r2 == false) goto L22;
        return;
    L22:
        throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    L17:
        r52.recycle();
    L10:
        r2 = true;
        goto L18
    L9:
        if (r02.getResourceId(0, -1) == (-1)) goto L18;
        goto L10
    }

    /* JADX INFO: renamed from: c */
    public static void m2555c(Context r2, int[] r3, String r4) {
        TypedArray r22 = r2.obtainStyledAttributes(r3);
        int r02 = 0;
    L4:
        if (r02 >= r3.length) goto L10;
        if (r22.hasValue(r02) == false) goto L8;
        r02 = r02 + 1;
        goto L4
    L8:
        r22.recycle();
        throw new IllegalArgumentException(AbstractC0324d.m723f("The style on this component requires your app theme to be ", r4, " (or a descendant)."));
    L10:
        r22.recycle();
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m2556d(Toolbar r4, CharSequence r5) {
        ArrayList r02 = new ArrayList();
        int r1 = 0;
    L4:
        if (r1 >= r4.getChildCount()) goto L11;
        View r2 = r4.getChildAt(r1);
        if ((r2 instanceof TextView) == false) goto L10;
        TextView r22 = (TextView) r2;
        if (TextUtils.equals(r22.getText(), r5) == false) goto L10;
        r02.add(r22);
    L10:
        r1 = r1 + 1;
        goto L4
    L11:
        return r02;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2557e(View r1) {
        Field r02 = AbstractC0080Q.f219a;
        if (r1.getLayoutDirection() == 1) goto L7;
        return false;
    L7:
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static PorterDuff.Mode m2558f(int r1, PorterDuff.Mode r2) {
        if (r1 == 3) goto L21;
        if (r1 == 5) goto L19;
        if (r1 == 9) goto L17;
        switch(r1) {
            case 14: goto L15;
            case 15: goto L13;
            case 16: goto L11;
            default: goto L9;
        };
    L9:
        return r2;
    L11:
        return PorterDuff.Mode.ADD;
    L13:
        return PorterDuff.Mode.SCREEN;
    L15:
        return PorterDuff.Mode.MULTIPLY;
    L17:
        return PorterDuff.Mode.SRC_ATOP;
    L19:
        return PorterDuff.Mode.SRC_IN;
    L21:
        return PorterDuff.Mode.SRC_OVER;
    }
}
