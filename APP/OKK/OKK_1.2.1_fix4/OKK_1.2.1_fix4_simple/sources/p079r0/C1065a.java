package p079r0;

import android.content.Context;
import android.util.TypedValue;
import org.luckypray.dexkit.C1031R;
import p056f0.AbstractC0805P;

/* JADX INFO: renamed from: r0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1065a {

    /* JADX INFO: renamed from: f */
    public static final int f4084f = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f4085a;

    /* JADX INFO: renamed from: b */
    public final int f4086b;

    /* JADX INFO: renamed from: c */
    public final int f4087c;

    /* JADX INFO: renamed from: d */
    public final int f4088d;

    /* JADX INFO: renamed from: e */
    public final float f4089e;

    static {
        f4084f = (int) Math.round(5.1000000000000005d);
    }

    public C1065a(Context r6) {
        TypedValue r02 = AbstractC0805P.m2037Q(r6, C1031R.attr.elevationOverlayEnabled);
        if (r02 != null) goto L5;
    L9:
        boolean r03 = false;
    L10:
        int r2 = AbstractC0805P.m2047n(r6, C1031R.attr.elevationOverlayColor, 0);
        int r3 = AbstractC0805P.m2047n(r6, C1031R.attr.elevationOverlayAccentColor, 0);
        int r1 = AbstractC0805P.m2047n(r6, C1031R.attr.colorSurface, 0);
        float r62 = r6.getResources().getDisplayMetrics().density;
        this.f4085a = r03;
        this.f4086b = r2;
        this.f4087c = r3;
        this.f4088d = r1;
        this.f4089e = r62;
        return;
    L5:
        if (r02.type != 18) goto L9;
        if (r02.data == 0) goto L9;
        r03 = true;
        goto L10
    }
}
