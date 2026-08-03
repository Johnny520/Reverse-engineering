package p079r0;

import android.content.Context;
import android.util.TypedValue;
import org.luckypray.dexkit.C1031R;
import p056f0.AbstractC0805P;

/* JADX INFO: renamed from: r0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1065a {

    /* JADX INFO: renamed from: f */
    public static final int f4084f = (int) Math.round(5.1000000000000005d);

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

    public C1065a(Context context) {
        TypedValue typedValueM2037Q = AbstractC0805P.m2037Q(context, C1031R.attr.elevationOverlayEnabled);
        boolean z2 = (typedValueM2037Q == null || typedValueM2037Q.type != 18 || typedValueM2037Q.data == 0) ? false : true;
        int iM2047n = AbstractC0805P.m2047n(context, C1031R.attr.elevationOverlayColor, 0);
        int iM2047n2 = AbstractC0805P.m2047n(context, C1031R.attr.elevationOverlayAccentColor, 0);
        int iM2047n3 = AbstractC0805P.m2047n(context, C1031R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f4085a = z2;
        this.f4086b = iM2047n;
        this.f4087c = iM2047n2;
        this.f4088d = iM2047n3;
        this.f4089e = f2;
    }
}
