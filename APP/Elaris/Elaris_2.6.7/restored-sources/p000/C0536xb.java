package p000;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: renamed from: xb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0536xb {

    /* JADX INFO: renamed from: a */
    public final View f1048a;

    /* JADX INFO: renamed from: b */
    public final int f1049b;

    /* JADX INFO: renamed from: c */
    public final float f1050c;

    /* JADX INFO: renamed from: d */
    public final int f1051d;

    /* JADX INFO: renamed from: e */
    public final int f1052e;

    /* JADX INFO: renamed from: f */
    public final int f1053f;

    /* JADX INFO: renamed from: g */
    public final int f1054g;

    /* JADX INFO: renamed from: h */
    public final int f1055h;

    /* JADX INFO: renamed from: i */
    public final int f1056i;

    /* JADX INFO: renamed from: j */
    public final int f1057j;

    /* JADX INFO: renamed from: k */
    public final int f1058k;

    /* JADX INFO: renamed from: l */
    public final int f1059l;

    /* JADX INFO: renamed from: m */
    public final int f1060m;

    /* JADX INFO: renamed from: n */
    public final int f1061n;

    /* JADX INFO: renamed from: o */
    public final int f1062o;

    /* JADX INFO: renamed from: p */
    public final boolean f1063p;

    /* JADX INFO: renamed from: q */
    public final String f1064q;

    /* JADX INFO: renamed from: r */
    public final boolean f1065r;

    /* JADX INFO: renamed from: s */
    public final Drawable.ConstantState f1066s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(25:0|2|(2:84|3)|(2:88|6)|(2:96|9)|72|12|(2:78|15)|(2:82|18)|(2:86|21)|(2:92|24)|27|(2:90|28)|(14:30|80|31|(19:33|74|34|70|35|98|36|37|48|50|76|51|(1:59)(2:57|58)|60|94|62|(1:66)|67|68)(1:44)|49|50|76|51|(3:53|59|60)(0)|94|62|(2:64|66)|67|68)(1:47)|45|48|50|76|51|(0)(0)|94|62|(0)|67|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:0|2|84|3|88|6|(2:96|9)|72|12|78|15|82|18|86|21|92|24|27|90|28|(14:30|80|31|(19:33|74|34|70|35|98|36|37|48|50|76|51|(1:59)(2:57|58)|60|94|62|(1:66)|67|68)(1:44)|49|50|76|51|(3:53|59|60)(0)|94|62|(2:64|66)|67|68)(1:47)|45|48|50|76|51|(0)(0)|94|62|(0)|67|68) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a6, code lost:
    
        r17 = null;
        r16 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0089 A[Catch: all -> 0x00a6, TryCatch #3 {all -> 0x00a6, blocks: (B:51:0x0085, B:53:0x0089, B:55:0x0092, B:57:0x0098), top: B:76:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae A[Catch: all -> 0x00ba, TryCatch #12 {all -> 0x00ba, blocks: (B:62:0x00aa, B:64:0x00ae, B:66:0x00b6), top: B:94:0x00aa }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0536xb(View view) {
        int visibility;
        float alpha;
        int minimumWidth;
        int minimumHeight;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        Drawable.ConstantState constantState;
        boolean z2;
        Drawable drawable;
        String string;
        CharSequence text;
        ViewGroup.LayoutParams layoutParams;
        boolean z3;
        this.f1048a = view;
        try {
            visibility = view.getVisibility();
        } catch (Throwable unused) {
            visibility = 0;
        }
        try {
            alpha = view.getAlpha();
        } catch (Throwable unused2) {
            alpha = 1.0f;
        }
        try {
            minimumWidth = view.getMinimumWidth();
        } catch (Throwable unused3) {
            minimumWidth = 0;
        }
        try {
            minimumHeight = view.getMinimumHeight();
        } catch (Throwable unused4) {
            minimumHeight = 0;
        }
        try {
            paddingLeft = view.getPaddingLeft();
        } catch (Throwable unused5) {
            paddingLeft = 0;
        }
        try {
            paddingTop = view.getPaddingTop();
        } catch (Throwable unused6) {
            paddingTop = 0;
        }
        try {
            paddingRight = view.getPaddingRight();
        } catch (Throwable unused7) {
            paddingRight = 0;
        }
        try {
            paddingBottom = view.getPaddingBottom();
        } catch (Throwable unused8) {
            paddingBottom = 0;
        }
        int i6 = Integer.MIN_VALUE;
        try {
            layoutParams = view.getLayoutParams();
        } catch (Throwable unused9) {
            i = Integer.MIN_VALUE;
        }
        if (layoutParams != null) {
            int i7 = layoutParams.width;
            try {
                i6 = layoutParams.height;
            } catch (Throwable unused10) {
                i = i6;
                i6 = i7;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                i4 = marginLayoutParams.leftMargin;
                try {
                    i2 = marginLayoutParams.topMargin;
                    try {
                        i3 = marginLayoutParams.rightMargin;
                    } catch (Throwable unused11) {
                        i = i6;
                        i6 = i7;
                        i3 = 0;
                    }
                } catch (Throwable unused12) {
                    i = i6;
                    i6 = i7;
                    i2 = 0;
                }
                try {
                    int i8 = marginLayoutParams.bottomMargin;
                    i = i6;
                    i6 = i7;
                    i5 = i8;
                    z3 = true;
                    z = z3;
                } catch (Throwable unused13) {
                    i = i6;
                    i6 = i7;
                    i5 = 0;
                    z = false;
                }
                constantState = null;
                int i9 = i5;
                if (!(view instanceof TextView) || (text = ((TextView) view).getText()) == null || text.length() <= 0) {
                    string = null;
                    z2 = false;
                } else {
                    string = text.toString();
                    z2 = true;
                }
                String str = string;
                if ((view instanceof ImageView) && (drawable = ((ImageView) view).getDrawable()) != null) {
                    constantState = drawable.getConstantState();
                }
                this.f1049b = visibility;
                this.f1050c = alpha;
                this.f1051d = minimumWidth;
                this.f1052e = minimumHeight;
                this.f1053f = paddingLeft;
                this.f1054g = paddingTop;
                this.f1055h = paddingRight;
                this.f1056i = paddingBottom;
                this.f1057j = i6;
                this.f1058k = i;
                this.f1059l = i4;
                this.f1060m = i2;
                this.f1061n = i3;
                this.f1062o = i9;
                this.f1063p = z;
                this.f1064q = str;
                this.f1065r = z2;
                this.f1066s = constantState;
            }
            i = i6;
            i6 = i7;
            i5 = 0;
            z = false;
            constantState = null;
            int i92 = i5;
            if (view instanceof TextView) {
                string = null;
                z2 = false;
                String str2 = string;
            }
            if (view instanceof ImageView) {
                constantState = drawable.getConstantState();
            }
            this.f1049b = visibility;
            this.f1050c = alpha;
            this.f1051d = minimumWidth;
            this.f1052e = minimumHeight;
            this.f1053f = paddingLeft;
            this.f1054g = paddingTop;
            this.f1055h = paddingRight;
            this.f1056i = paddingBottom;
            this.f1057j = i6;
            this.f1058k = i;
            this.f1059l = i4;
            this.f1060m = i2;
            this.f1061n = i3;
            this.f1062o = i92;
            this.f1063p = z;
            this.f1064q = str2;
            this.f1065r = z2;
            this.f1066s = constantState;
        }
        i = Integer.MIN_VALUE;
        i2 = 0;
        i3 = 0;
        i5 = 0;
        i4 = 0;
        z3 = false;
        z = z3;
        constantState = null;
        int i922 = i5;
        if (view instanceof TextView) {
        }
        if (view instanceof ImageView) {
        }
        this.f1049b = visibility;
        this.f1050c = alpha;
        this.f1051d = minimumWidth;
        this.f1052e = minimumHeight;
        this.f1053f = paddingLeft;
        this.f1054g = paddingTop;
        this.f1055h = paddingRight;
        this.f1056i = paddingBottom;
        this.f1057j = i6;
        this.f1058k = i;
        this.f1059l = i4;
        this.f1060m = i2;
        this.f1061n = i3;
        this.f1062o = i922;
        this.f1063p = z;
        this.f1064q = str2;
        this.f1065r = z2;
        this.f1066s = constantState;
    }
}
