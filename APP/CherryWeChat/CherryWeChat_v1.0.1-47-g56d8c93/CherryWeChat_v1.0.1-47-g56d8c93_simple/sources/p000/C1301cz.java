package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import io.github.cherrywechat.R;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: cz */
/* JADX INFO: loaded from: classes.dex */
public final class C1301cz {

    /* JADX INFO: renamed from: a */
    public final int f4736a;

    /* JADX INFO: renamed from: b */
    public final C0728Qx f4737b;

    /* JADX INFO: renamed from: c */
    public final int[][] f4738c;

    /* JADX INFO: renamed from: d */
    public final C0728Qx[] f4739d;

    /* JADX INFO: renamed from: e */
    public final C1196az f4740e;

    /* JADX INFO: renamed from: f */
    public final C1196az f4741f;

    /* JADX INFO: renamed from: g */
    public final C1196az f4742g;

    /* JADX INFO: renamed from: h */
    public final C1196az f4743h;

    public C1301cz(C1239bz r2) {
        this.f4736a = r2.f4210a;
        this.f4737b = r2.f4211b;
        this.f4738c = r2.f4212c;
        this.f4739d = r2.f4213d;
        this.f4740e = r2.f4214e;
        this.f4741f = r2.f4215f;
        this.f4742g = r2.f4216g;
        this.f4743h = r2.f4217h;
    }

    /* JADX INFO: renamed from: a */
    public static void m2564a(C1239bz r11, Context r12, XmlResourceParser r13, AttributeSet r14, Resources.Theme r15) {
        int r0 = r13.getDepth() + 1;
    L3:
        int r2 = r13.next();
        if (r2 == 1) goto L32;
        int r3 = r13.getDepth();
        if (r3 >= r0) goto L10;
        if (r2 != 3) goto L10;
        return;
    L10:
        if (r2 != 2) goto L3;
        if (r3 > r0) goto L3;
        if (r13.getName().equals("item") == false) goto L3;
        Resources r22 = r12.getResources();
        int[] r32 = AbstractC0939Vu.f2949r;
        if (r15 != null) goto L18;
        TypedArray r23 = r22.obtainAttributes(r14, r32);
    L19:
        C0728Qx r33 = C0728Qx.m1511a(r12, r23.getResourceId(0, 0), r23.getResourceId(1, 0), new C2436r(0)).m1383a();
        r23.recycle();
        int r24 = r14.getAttributeCount();
        int[] r5 = new int[r24];
        int r6 = 0;
        int r7 = 0;
    L20:
        if (r6 >= r24) goto L31;
        int r8 = r14.getAttributeNameResource(r6);
        if (r8 == R.attr.shapeAppearance) goto L30;
        if (r8 == R.attr.shapeAppearanceOverlay) goto L30;
        int r9 = r7 + 1;
        if (r14.getAttributeBooleanValue(r6, false) == true) goto L29;
        r8 = -r8;
    L29:
        r5[r7] = r8;
        r7 = r9;
    L30:
        r6 = r6 + 1;
        goto L20
    L31:
        r11.m2361a(StateSet.trimStateSet(r5, r7), r33);
        goto L3
    L18:
        r23 = r15.obtainStyledAttributes(r14, r32, 0, 0);
        goto L19
    }

    /* JADX INFO: renamed from: b */
    public static C1301cz m2565b(Context r5, TypedArray r6, int r7) {
        int r62 = r6.getResourceId(r7, 0);
        if (r62 != 0) goto L6;
    L7:
        return null;
    L6:
        if (Objects.equals(r5.getResources().getResourceTypeName(r62), "xml") == false) goto L7;
        C1239bz r0 = new C1239bz();
        r0.m2362b();
        XmlResourceParser r63 = r5.getResources().getXml(r62);     // Catch: Throwable -> L33
        AttributeSet r1 = Xml.asAttributeSet(r63);     // Catch: Throwable -> L21
    L11:
        int r2 = r63.next();     // Catch: Throwable -> L21
        if (r2 == 2) goto L16;
        if (r2 != 1) goto L11;
    L16:
        if (r2 != 2) goto L26;
        if (r63.getName().equals("selector") == false) goto L23;
        m2564a(r0, r5, r63, r1, r5.getTheme());     // Catch: Throwable -> L21
    L23:
        r63.close();     // Catch: Throwable -> L33 Throwable -> L33 Throwable -> L33
    L35:
        if (r0.f4210a != 0) goto L38;
        return null;
    L38:
        return new C1301cz(r0);
    L26:
        throw new XmlPullParserException("No start tag found");     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        if (r63 != null) goto L39;
    L32:
        throw th;     // Catch: Throwable -> L33 Throwable -> L33 Throwable -> L33
    L39:
        r63.close();     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L33 Throwable -> L33 Throwable -> L33
    L33:
        r0.m2362b();
        goto L35
    }

    /* JADX INFO: renamed from: c */
    public final C0728Qx m2566c() {
        C0728Qx r0 = this.f4737b;
        C1196az r1 = this.f4743h;
        C1196az r2 = this.f4742g;
        C1196az r3 = this.f4741f;
        C1196az r4 = this.f4740e;
        if (r4 != null) goto L8;
        if (r3 != null) goto L8;
        if (r2 != null) goto L8;
        if (r1 != null) goto L8;
        return r0;
    L8:
        C0685Px r02 = r0.m1516f();
        if (r4 == null) goto L11;
        r02.f2196e = r4.f4105b;
    L11:
        if (r3 == null) goto L13;
        r02.f2197f = r3.f4105b;
    L13:
        if (r2 == null) goto L15;
        r02.f2199h = r2.f4105b;
    L15:
        if (r1 == null) goto L18;
        r02.f2198g = r1.f4105b;
    L18:
        return r02.m1383a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2567d() {
        if (this.f4736a > 1) goto L26;
        C1196az r0 = this.f4740e;
        if (r0 != null) goto L7;
    L9:
        C1196az r02 = this.f4741f;
        if (r02 != null) goto L12;
    L14:
        C1196az r03 = this.f4742g;
        if (r03 != null) goto L17;
    L19:
        C1196az r04 = this.f4743h;
        if (r04 != null) goto L22;
        return false;
    L22:
        if (r04.f4104a > 1) goto L26;
        return false;
    L17:
        if (r03.f4104a <= 1) goto L19;
    L12:
        if (r02.f4104a <= 1) goto L14;
    L7:
        if (r0.f4104a <= 1) goto L9;
    L26:
        return true;
    }
}
