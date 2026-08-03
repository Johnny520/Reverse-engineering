package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C0485j;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p001A0.AbstractC0040p;
import p006D.AbstractC0080Q;
import p006D.C0065B;
import p017J.ActionModeCallbackC0229r;
import p018J0.C0234d;
import p025N.C0257h;
import p037U.AbstractC0358S;
import p043Y.C0443b;
import p048b.AbstractC0550a;
import p051d.C0739a;
import p057g.AbstractC0849A0;
import p057g.AbstractC0881Q0;
import p057g.AbstractC0886W;
import p057g.C0860G;
import p057g.C0932v;
import p087w.AbstractC1111a;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: R */
    public static final C0443b f1166R = null;

    /* JADX INFO: renamed from: S */
    public static final int[] f1167S = null;

    /* JADX INFO: renamed from: A */
    public int f1168A;

    /* JADX INFO: renamed from: B */
    public int f1169B;

    /* JADX INFO: renamed from: C */
    public int f1170C;

    /* JADX INFO: renamed from: D */
    public int f1171D;

    /* JADX INFO: renamed from: E */
    public int f1172E;

    /* JADX INFO: renamed from: F */
    public int f1173F;

    /* JADX INFO: renamed from: G */
    public int f1174G;

    /* JADX INFO: renamed from: H */
    public boolean f1175H;

    /* JADX INFO: renamed from: I */
    public final TextPaint f1176I;

    /* JADX INFO: renamed from: J */
    public final ColorStateList f1177J;

    /* JADX INFO: renamed from: K */
    public StaticLayout f1178K;

    /* JADX INFO: renamed from: L */
    public StaticLayout f1179L;

    /* JADX INFO: renamed from: M */
    public final C0739a f1180M;

    /* JADX INFO: renamed from: N */
    public ObjectAnimator f1181N;

    /* JADX INFO: renamed from: O */
    public C0932v f1182O;

    /* JADX INFO: renamed from: P */
    public C0257h f1183P;

    /* JADX INFO: renamed from: Q */
    public final Rect f1184Q;

    /* JADX INFO: renamed from: a */
    public Drawable f1185a;

    /* JADX INFO: renamed from: b */
    public ColorStateList f1186b;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f1187c;

    /* JADX INFO: renamed from: d */
    public boolean f1188d;

    /* JADX INFO: renamed from: e */
    public boolean f1189e;

    /* JADX INFO: renamed from: f */
    public Drawable f1190f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1191g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1192h;

    /* JADX INFO: renamed from: i */
    public boolean f1193i;

    /* JADX INFO: renamed from: j */
    public boolean f1194j;

    /* JADX INFO: renamed from: k */
    public int f1195k;

    /* JADX INFO: renamed from: l */
    public int f1196l;

    /* JADX INFO: renamed from: m */
    public int f1197m;

    /* JADX INFO: renamed from: n */
    public boolean f1198n;

    /* JADX INFO: renamed from: o */
    public CharSequence f1199o;

    /* JADX INFO: renamed from: p */
    public CharSequence f1200p;

    /* JADX INFO: renamed from: q */
    public CharSequence f1201q;

    /* JADX INFO: renamed from: r */
    public CharSequence f1202r;

    /* JADX INFO: renamed from: s */
    public boolean f1203s;

    /* JADX INFO: renamed from: t */
    public int f1204t;

    /* JADX INFO: renamed from: u */
    public final int f1205u;

    /* JADX INFO: renamed from: v */
    public float f1206v;

    /* JADX INFO: renamed from: w */
    public float f1207w;

    /* JADX INFO: renamed from: x */
    public final VelocityTracker f1208x;

    /* JADX INFO: renamed from: y */
    public final int f1209y;

    /* JADX INFO: renamed from: z */
    public float f1210z;

    static {
        f1166R = new C0443b(Float.class, "thumbPos", 7);
        f1167S = new int[]{R.attr.state_checked};
    }

    public SwitchCompat(Context r13, AttributeSet r14) {
        super(r13, r14, C1031R.attr.switchStyle);
        this.f1186b = null;
        this.f1187c = null;
        this.f1188d = false;
        this.f1189e = false;
        this.f1191g = null;
        this.f1192h = null;
        this.f1193i = false;
        this.f1194j = false;
        this.f1208x = VelocityTracker.obtain();
        boolean r9 = true;
        this.f1175H = true;
        this.f1184Q = new Rect();
        AbstractC0849A0.m2159a(this, getContext());
        TextPaint r10 = new TextPaint(1);
        this.f1176I = r10;
        r10.density = getResources().getDisplayMetrics().density;
        int[] r2 = AbstractC0550a.f1633r;
        C0234d r11 = C0234d.m638s(r13, r14, r2, C1031R.attr.switchStyle, 0);
        AbstractC0080Q.m290i(this, r13, r2, r14, (TypedArray) r11.f475c, C1031R.attr.switchStyle);
        Drawable r1 = r11.m646i(2);
        this.f1185a = r1;
        if (r1 == null) goto L5;
        r1.setCallback(this);
    L5:
        Drawable r12 = r11.m646i(11);
        this.f1190f = r12;
        if (r12 == null) goto L8;
        r12.setCallback(this);
    L8:
        TypedArray r15 = (TypedArray) r11.f475c;
        setTextOnInternal(r15.getText(0));
        setTextOffInternal(r15.getText(1));
        this.f1203s = r15.getBoolean(3, true);
        this.f1195k = r15.getDimensionPixelSize(8, 0);
        this.f1196l = r15.getDimensionPixelSize(5, 0);
        this.f1197m = r15.getDimensionPixelSize(6, 0);
        this.f1198n = r15.getBoolean(4, false);
        ColorStateList r3 = r11.m645h(9);
        if (r3 == null) goto L11;
        this.f1186b = r3;
        this.f1188d = true;
    L11:
        PorterDuff.Mode r32 = AbstractC0886W.m2221c(r15.getInt(10, -1), null);
        if (this.f1187c == r32) goto L15;
        this.f1187c = r32;
        this.f1189e = true;
    L15:
        if (this.f1188d == false) goto L17;
    L18:
        m1131a();
    L19:
        ColorStateList r33 = r11.m645h(12);
        if (r33 == null) goto L22;
        this.f1191g = r33;
        this.f1193i = true;
    L22:
        PorterDuff.Mode r34 = AbstractC0886W.m2221c(r15.getInt(13, -1), null);
        if (this.f1192h == r34) goto L26;
        this.f1192h = r34;
        this.f1194j = true;
    L26:
        if (this.f1193i == false) goto L28;
    L29:
        m1132b();
    L30:
        int r16 = r15.getResourceId(7, 0);
        if (r16 == 0) goto L79;
        TypedArray r17 = r13.obtainStyledAttributes(r16, AbstractC0550a.f1634s);
        if (r17.hasValue(3) == false) goto L39;
        int r35 = r17.getResourceId(3, 0);
        if (r35 == 0) goto L39;
        ColorStateList r36 = AbstractC0805P.m2049p(r13, r35);
        if (r36 == null) goto L39;
    L40:
        if (r36 == null) goto L42;
        this.f1177J = r36;
    L43:
        int r37 = r17.getDimensionPixelSize(0, 0);
        if (r37 == 0) goto L48;
        float r38 = r37;
        if (r38 == r10.getTextSize()) goto L48;
        r10.setTextSize(r38);
        requestLayout();
    L48:
        int r39 = r17.getInt(1, -1);
        int r4 = r17.getInt(2, -1);
        if (r39 == 1) goto L55;
        if (r39 == 2) goto L54;
        if (r39 == 3) goto L53;
        Typeface r22 = null;
    L56:
        float r310 = 0.0f;
        if (r4 <= 0) goto L73;
        if (r22 != null) goto L60;
        Typeface r23 = Typeface.defaultFromStyle(r4);
    L61:
        setSwitchTypeface(r23);
        if (r23 == null) goto L64;
        int r24 = r23.getStyle();
    L65:
        int r25 = (~r24) & r4;
        if ((r25 & 1) != 0) goto L69;
        r9 = false;
    L69:
        r10.setFakeBoldText(r9);
        if ((2 & r25) == 0) goto L72;
        r310 = -0.25f;
    L72:
        r10.setTextSkewX(r310);
    L75:
        if (r17.getBoolean(14, false) == false) goto L77;
        Context r26 = getContext();
        C0739a r02 = new C0739a();
        r02.f2575a = r26.getResources().getConfiguration().locale;
        this.f1180M = r02;
    L78:
        setTextOnInternal(this.f1199o);
        setTextOffInternal(this.f1201q);
        r17.recycle();
        goto L79
    L77:
        this.f1180M = null;
        goto L78
    L64:
        r24 = 0;
        goto L65
    L60:
        r23 = Typeface.create(r22, r4);
        goto L61
    L73:
        r10.setFakeBoldText(false);
        r10.setTextSkewX(0.0f);
        setSwitchTypeface(r22);
        goto L75
    L53:
        r22 = Typeface.MONOSPACE;
        goto L56
    L54:
        r22 = Typeface.SERIF;
        goto L56
    L55:
        r22 = Typeface.SANS_SERIF;
        goto L56
    L42:
        this.f1177J = getTextColors();
    L39:
        r36 = r17.getColorStateList(3);
    L79:
        new C0860G(this).m2177d(r14, C1031R.attr.switchStyle);
        r11.m657u();
        ViewConfiguration r132 = ViewConfiguration.get(r13);
        this.f1205u = r132.getScaledTouchSlop();
        this.f1209y = r132.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m2262a(r14, C1031R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
        return;
    L28:
        if (this.f1194j == false) goto L30;
    L17:
        if (this.f1189e == false) goto L19;
        goto L18
    }

    private C0932v getEmojiTextViewHelper() {
        if (this.f1182O != null) goto L6;
        this.f1182O = new C0932v(this);
    L6:
        return this.f1182O;
    }

    private boolean getTargetCheckedState() {
        if (this.f1210z <= 0.5f) goto L5;
        return true;
    L5:
        return false;
    }

    private int getThumbOffset() {
        boolean r02 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() != 1) goto L5;
        float r03 = 1.0f - this.f1210z;
    L7:
        return (int) ((r03 * getThumbScrollRange()) + 0.5f);
    L5:
        r03 = this.f1210z;
        goto L7
    }

    private int getThumbScrollRange() {
        Drawable r02 = this.f1190f;
        if (r02 == null) goto L10;
        Rect r1 = this.f1184Q;
        r02.getPadding(r1);
        Drawable r03 = this.f1185a;
        if (r03 == null) goto L7;
        Rect r04 = AbstractC0886W.m2220b(r03);
    L9:
        return ((((this.f1168A - this.f1170C) - r1.left) - r1.right) - r04.left) - r04.right;
    L7:
        r04 = AbstractC0886W.f3158c;
        goto L9
    L10:
        return 0;
    }

    private void setTextOffInternal(CharSequence r3) {
        this.f1201q = r3;
        C0932v r02 = getEmojiTextViewHelper();
        C0739a r1 = this.f1180M;
        TransformationMethod r03 = ((AbstractC0040p) r02.f3306b.f251b).mo132f0(r1);
        if (r03 == null) goto L5;
        r3 = r03.getTransformation(r3, this);
    L5:
        this.f1202r = r3;
        this.f1179L = null;
        if (this.f1203s == false) goto L9;
        m1134d();
        return;
    }

    private void setTextOnInternal(CharSequence r3) {
        this.f1199o = r3;
        C0932v r02 = getEmojiTextViewHelper();
        C0739a r1 = this.f1180M;
        TransformationMethod r03 = ((AbstractC0040p) r02.f3306b.f251b).mo132f0(r1);
        if (r03 == null) goto L5;
        r3 = r03.getTransformation(r3, this);
    L5:
        this.f1200p = r3;
        this.f1178K = null;
        if (this.f1203s == false) goto L9;
        m1134d();
        return;
    }

    /* JADX INFO: renamed from: a */
    public final void m1131a() {
        Drawable r02 = this.f1185a;
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f1188d == false) goto L7;
    L8:
        Drawable r03 = r02.mutate();
        this.f1185a = r03;
        if (this.f1188d == false) goto L12;
        AbstractC1111a.m2626h(r03, this.f1186b);
    L12:
        if (this.f1189e == false) goto L15;
        AbstractC1111a.m2627i(this.f1185a, this.f1187c);
    L15:
        if (this.f1185a.isStateful() == false) goto L20;
        this.f1185a.setState(getDrawableState());
        return;
    L20:
        return;
    L7:
        if (this.f1189e == true) goto L8;
    }

    /* JADX INFO: renamed from: b */
    public final void m1132b() {
        Drawable r02 = this.f1190f;
        if (r02 != null) goto L5;
        return;
    L5:
        if (this.f1193i == false) goto L7;
    L8:
        Drawable r03 = r02.mutate();
        this.f1190f = r03;
        if (this.f1193i == false) goto L12;
        AbstractC1111a.m2626h(r03, this.f1191g);
    L12:
        if (this.f1194j == false) goto L15;
        AbstractC1111a.m2627i(this.f1190f, this.f1192h);
    L15:
        if (this.f1190f.isStateful() == false) goto L20;
        this.f1190f.setState(getDrawableState());
        return;
    L20:
        return;
    L7:
        if (this.f1194j == true) goto L8;
    }

    /* JADX INFO: renamed from: c */
    public final void m1133c() {
        setTextOnInternal(this.f1199o);
        setTextOffInternal(this.f1201q);
        requestLayout();
    }

    /* JADX INFO: renamed from: d */
    public final void m1134d() {
        if (this.f1183P == null) goto L5;
        return;
    L5:
        if (((AbstractC0040p) this.f1182O.f3306b.f251b).mo121D() == true) goto L8;
        return;
    L8:
        if (C0485j.f1354k == null) goto L15;
        C0485j r02 = C0485j.m1199a();
        int r1 = r02.m1200b();
        if (r1 == 3) goto L12;
        if (r1 == 0) goto L12;
        return;
    L12:
        C0257h r12 = new C0257h(this);
        this.f1183P = r12;
        r02.m1205g(r12);
        return;
    }

    @Override // android.view.View
    public final void draw(Canvas r11) {
        int r02 = this.f1171D;
        int r1 = this.f1172E;
        int r2 = this.f1173F;
        int r3 = this.f1174G;
        int r4 = getThumbOffset() + r02;
        Drawable r5 = this.f1185a;
        if (r5 == null) goto L5;
        Rect r52 = AbstractC0886W.m2220b(r5);
    L6:
        Drawable r6 = this.f1190f;
        Rect r7 = this.f1184Q;
        if (r6 == null) goto L26;
        r6.getPadding(r7);
        int r62 = r7.left;
        r4 = r4 + r62;
        if (r52 == null) goto L24;
        int r8 = r52.left;
        if (r8 <= r62) goto L13;
        r02 = r02 + (r8 - r62);
    L13:
        int r63 = r52.top;
        int r82 = r7.top;
        if (r63 <= r82) goto L16;
        int r64 = (r63 - r82) + r1;
    L17:
        int r83 = r52.right;
        int r9 = r7.right;
        if (r83 <= r9) goto L20;
        r2 = r2 - (r83 - r9);
    L20:
        int r53 = r52.bottom;
        int r84 = r7.bottom;
        if (r53 <= r84) goto L23;
        int r54 = r3 - (r53 - r84);
    L25:
        this.f1190f.setBounds(r02, r64, r2, r54);
    L23:
        r54 = r3;
        goto L25
    L16:
        r64 = r1;
        goto L17
    L24:
        r64 = r1;
    L26:
        Drawable r03 = this.f1185a;
        if (r03 == null) goto L31;
        r03.getPadding(r7);
        int r04 = r4 - r7.left;
        int r42 = (r4 + this.f1170C) + r7.right;
        this.f1185a.setBounds(r04, r1, r42, r3);
        Drawable r22 = getBackground();
        if (r22 == null) goto L31;
        AbstractC1111a.m2624f(r22, r04, r1, r42, r3);
    L31:
        super.draw(r11);
        return;
    L5:
        r52 = AbstractC0886W.f3158c;
        goto L6
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float r2, float r3) {
        super.drawableHotspotChanged(r2, r3);
        Drawable r02 = this.f1185a;
        if (r02 == null) goto L5;
        AbstractC1111a.m2623e(r02, r2, r3);
    L5:
        Drawable r03 = this.f1190f;
        if (r03 == null) goto L9;
        AbstractC1111a.m2623e(r03, r2, r3);
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] r02 = getDrawableState();
        Drawable r1 = this.f1185a;
        if (r1 != null) goto L5;
    L7:
        boolean r12 = false;
    L8:
        Drawable r2 = this.f1190f;
        if (r2 != null) goto L11;
    L13:
        if (r12 == false) goto L16;
        invalidate();
        return;
    L16:
        return;
    L11:
        if (r2.isStateful() == false) goto L13;
        r12 = r12 | r2.setState(r02);
        goto L13
    L5:
        if (r1.isStateful() == false) goto L7;
        r12 = r1.setState(r02);
        goto L8
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean r02 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() != 1) goto L9;
        int r03 = super.getCompoundPaddingLeft() + this.f1168A;
        if (TextUtils.isEmpty(getText()) == false) goto L7;
        return r03;
    L7:
        return r03 + this.f1197m;
    L9:
        return super.getCompoundPaddingLeft();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean r02 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() == 1) goto L5;
        int r03 = super.getCompoundPaddingRight() + this.f1168A;
        if (TextUtils.isEmpty(getText()) == false) goto L9;
        return r03;
    L9:
        return r03 + this.f1197m;
    L5:
        return super.getCompoundPaddingRight();
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback r02 = super.getCustomSelectionActionModeCallback();
        if ((r02 instanceof ActionModeCallbackC0229r) == true) goto L5;
        return r02;
    L5:
        return ((ActionModeCallbackC0229r) r02).f465a;
    }

    public boolean getShowText() {
        return this.f1203s;
    }

    public boolean getSplitTrack() {
        return this.f1198n;
    }

    public int getSwitchMinWidth() {
        return this.f1196l;
    }

    public int getSwitchPadding() {
        return this.f1197m;
    }

    public CharSequence getTextOff() {
        return this.f1201q;
    }

    public CharSequence getTextOn() {
        return this.f1199o;
    }

    public Drawable getThumbDrawable() {
        return this.f1185a;
    }

    public final float getThumbPosition() {
        return this.f1210z;
    }

    public int getThumbTextPadding() {
        return this.f1195k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1186b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1187c;
    }

    public Drawable getTrackDrawable() {
        return this.f1190f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1191g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1192h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable r02 = this.f1185a;
        if (r02 == null) goto L5;
        r02.jumpToCurrentState();
    L5:
        Drawable r03 = this.f1190f;
        if (r03 == null) goto L8;
        r03.jumpToCurrentState();
    L8:
        ObjectAnimator r04 = this.f1181N;
        if (r04 != null) goto L11;
        return;
    L11:
        if (r04.isStarted() == false) goto L15;
        this.f1181N.end();
        this.f1181N = null;
        return;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 1);
        if (isChecked() == false) goto L5;
        View.mergeDrawableStates(r22, f1167S);
    L5:
        return r22;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas r10) {
        super.onDraw(r10);
        Drawable r02 = this.f1190f;
        Rect r1 = this.f1184Q;
        if (r02 == null) goto L5;
        r02.getPadding(r1);
    L6:
        int r2 = this.f1172E;
        int r3 = this.f1174G;
        int r22 = r2 + r1.top;
        int r32 = r3 - r1.bottom;
        Drawable r4 = this.f1185a;
        if (r02 != null) goto L9;
    L13:
        int r03 = r10.save();
        if (r4 == null) goto L17;
        r4.draw(r10);
    L17:
        if (getTargetCheckedState() == false) goto L19;
        StaticLayout r12 = this.f1178K;
    L20:
        if (r12 == null) goto L29;
        int[] r5 = getDrawableState();
        ColorStateList r6 = this.f1177J;
        TextPaint r7 = this.f1176I;
        if (r6 == null) goto L24;
        r7.setColor(r6.getColorForState(r5, 0));
    L24:
        r7.drawableState = r5;
        if (r4 == null) goto L27;
        Rect r42 = r4.getBounds();
        int r52 = r42.left + r42.right;
    L28:
        r10.translate((r52 / 2) - (r12.getWidth() / 2), ((r22 + r32) / 2) - (r12.getHeight() / 2));
        r12.draw(r10);
        goto L29
    L27:
        r52 = getWidth();
    L29:
        r10.restoreToCount(r03);
        return;
    L19:
        r12 = this.f1179L;
        goto L20
    L9:
        if (this.f1198n == false) goto L12;
        if (r4 == null) goto L12;
        Rect r53 = AbstractC0886W.m2220b(r4);
        r4.copyBounds(r1);
        r1.left += r53.left;
        r1.right -= r53.right;
        int r54 = r10.save();
        r10.clipRect(r1, Region.Op.DIFFERENCE);
        r02.draw(r10);
        r10.restoreToCount(r54);
    L12:
        r02.draw(r10);
        goto L13
    L5:
        r1.setEmpty();
        goto L6
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
        super.onInitializeAccessibilityEvent(r2);
        r2.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r4) {
        super.onInitializeAccessibilityNodeInfo(r4);
        r4.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) goto L5;
        return;
    L5:
        if (isChecked() == false) goto L7;
        CharSequence r02 = this.f1199o;
    L9:
        if (TextUtils.isEmpty(r02) == true) goto L16;
        CharSequence r1 = r4.getText();
        if (TextUtils.isEmpty(r1) == false) goto L13;
        r4.setText(r02);
        return;
    L13:
        StringBuilder r2 = new StringBuilder();
        r2.append(r1);
        r2.append(' ');
        r2.append(r02);
        r4.setText(r2);
        return;
    L16:
        return;
    L7:
        r02 = this.f1201q;
        goto L9
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        super.onLayout(r2, r3, r4, r5, r6);
        int r32 = 0;
        if (this.f1185a == null) goto L9;
        Drawable r22 = this.f1190f;
        Rect r42 = this.f1184Q;
        if (r22 == null) goto L7;
        r22.getPadding(r42);
    L8:
        Rect r23 = AbstractC0886W.m2220b(this.f1185a);
        int r52 = Math.max(0, r23.left - r42.left);
        r32 = Math.max(0, r23.right - r42.right);
    L10:
        boolean r24 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() != 1) goto L13;
        int r25 = getPaddingLeft() + r52;
        int r43 = ((this.f1168A + r25) - r52) - r32;
    L14:
        int r33 = getGravity() & 112;
        if (r33 != 16) goto L17;
        int r53 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
        int r34 = this.f1169B;
        int r54 = r53 - (r34 / 2);
        int r55 = r34 + r54;
        int r35 = r54;
    L21:
        this.f1171D = r25;
        this.f1172E = r35;
        this.f1174G = r55;
        this.f1173F = r43;
        return;
    L17:
        if (r33 == 80) goto L19;
        r35 = getPaddingTop();
        r55 = this.f1169B + r35;
        goto L21
    L19:
        r55 = getHeight() - getPaddingBottom();
        r35 = r55 - this.f1169B;
        goto L21
    L13:
        r43 = (getWidth() - getPaddingRight()) - r32;
        r25 = ((r43 - this.f1168A) + r52) + r32;
        goto L14
    L7:
        r42.setEmpty();
        goto L8
    L9:
        r52 = 0;
        goto L10
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r12, int r13) {
        int r1 = 0;
        if (this.f1203s == false) goto L18;
        StaticLayout r02 = this.f1178K;
        TextPaint r10 = this.f1176I;
        if (r02 != null) goto L12;
        CharSequence r3 = this.f1200p;
        if (r3 == null) goto L9;
        int r5 = (int) Math.ceil(Layout.getDesiredWidth(r3, r10));
    L10:
        this.f1178K = new StaticLayout(r3, r10, r5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        goto L12
    L9:
        r5 = 0;
    L12:
        if (this.f1179L != null) goto L18;
        CharSequence r32 = this.f1202r;
        if (r32 == null) goto L16;
        int r52 = (int) Math.ceil(Layout.getDesiredWidth(r32, r10));
    L17:
        this.f1179L = new StaticLayout(r32, r10, r52, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        goto L18
    L16:
        r52 = 0;
    L18:
        Drawable r03 = this.f1185a;
        Rect r2 = this.f1184Q;
        if (r03 == null) goto L21;
        r03.getPadding(r2);
        int r04 = (this.f1185a.getIntrinsicWidth() - r2.left) - r2.right;
        int r33 = this.f1185a.getIntrinsicHeight();
    L23:
        if (this.f1203s == false) goto L25;
        int r53 = (this.f1195k * 2) + Math.max(this.f1178K.getWidth(), this.f1179L.getWidth());
    L26:
        this.f1170C = Math.max(r53, r04);
        Drawable r05 = this.f1190f;
        if (r05 == null) goto L29;
        r05.getPadding(r2);
        r1 = this.f1190f.getIntrinsicHeight();
    L30:
        int r06 = r2.left;
        int r22 = r2.right;
        Drawable r4 = this.f1185a;
        if (r4 == null) goto L34;
        Rect r42 = AbstractC0886W.m2220b(r4);
        r06 = Math.max(r06, r42.left);
        r22 = Math.max(r22, r42.right);
    L34:
        if (this.f1175H == false) goto L36;
        int r07 = Math.max(this.f1196l, ((this.f1170C * 2) + r06) + r22);
    L37:
        int r14 = Math.max(r1, r33);
        this.f1168A = r07;
        this.f1169B = r14;
        super.onMeasure(r12, r13);
        if (getMeasuredHeight() >= r14) goto L41;
        setMeasuredDimension(getMeasuredWidthAndState(), r14);
        return;
    L41:
        return;
    L36:
        r07 = this.f1196l;
        goto L37
    L29:
        r2.setEmpty();
        goto L30
    L25:
        r53 = 0;
        goto L26
    L21:
        r04 = 0;
        r33 = 0;
        goto L23
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent r2) {
        super.onPopulateAccessibilityEvent(r2);
        if (isChecked() == false) goto L5;
        CharSequence r02 = this.f1199o;
    L6:
        if (r02 == null) goto L9;
        r2.getText().add(r02);
        return;
    L9:
        return;
    L5:
        r02 = this.f1201q;
        goto L6
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent r10) {
        VelocityTracker r02 = this.f1208x;
        r02.addMovement(r10);
        int r1 = r10.getActionMasked();
        int r2 = this.f1205u;
        if (r1 == 0) goto L68;
        float r5 = 0.0f;
        if (r1 == 1) goto L41;
        if (r1 == 2) goto L9;
        if (r1 == 3) goto L41;
    L83:
        return super.onTouchEvent(r10);
    L9:
        int r03 = this.f1204t;
        if (r03 == 1) goto L34;
        if (r03 != 2) goto L83;
        float r102 = r10.getX();
        int r04 = getThumbScrollRange();
        float r12 = r102 - this.f1206v;
        if (r04 == 0) goto L17;
        float r13 = r12 / r04;
    L20:
        boolean r05 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() != 1) goto L23;
        r13 = -r13;
    L23:
        float r06 = this.f1210z;
        float r14 = r13 + r06;
        if (r14 < 0.0f) goto L31;
        if (r14 <= 1.0f) goto L29;
        r5 = 1.0f;
        goto L31
    L29:
        r5 = r14;
    L31:
        if (r5 == r06) goto L33;
        this.f1206v = r102;
        setThumbPosition(r5);
    L33:
        return true;
    L17:
        if (r12 <= 0.0f) goto L19;
        r13 = 1.0f;
        goto L20
    L19:
        r13 = -1.0f;
        goto L20
    L34:
        float r07 = r10.getX();
        float r15 = r10.getY();
        if (Math.abs(r07 - this.f1206v) <= r2) goto L37;
    L38:
        this.f1204t = 2;
        getParent().requestDisallowInterceptTouchEvent(true);
        this.f1206v = r07;
        this.f1207w = r15;
        return true;
    L37:
        if (Math.abs(r15 - this.f1207w) <= r2) goto L83;
    L41:
        if (this.f1204t != 2) goto L67;
        this.f1204t = 0;
        if (r10.getAction() == 1) goto L45;
    L47:
        boolean r16 = false;
    L48:
        boolean r6 = isChecked();
        if (r16 == false) goto L62;
        r02.computeCurrentVelocity(1000);
        float r08 = r02.getXVelocity();
        if (Math.abs(r08) <= this.f1209y) goto L61;
        boolean r17 = AbstractC0881Q0.f3149a;
        if (getLayoutDirection() != 1) goto L59;
        if (r08 >= 0.0f) goto L57;
    L56:
        boolean r09 = true;
    L63:
        if (r09 == r6) goto L65;
        playSoundEffect(0);
    L65:
        setChecked(r09);
        MotionEvent r010 = MotionEvent.obtain(r10);
        r010.setAction(3);
        super.onTouchEvent(r010);
        r010.recycle();
        super.onTouchEvent(r10);
        return true;
    L57:
        r09 = false;
        goto L63
    L59:
        if (r08 <= 0.0f) goto L57;
    L61:
        r09 = getTargetCheckedState();
        goto L63
    L62:
        r09 = r6;
        goto L63
    L45:
        if (isEnabled() == false) goto L47;
        r16 = true;
        goto L48
    L67:
        this.f1204t = 0;
        r02.clear();
        goto L83
    L68:
        float r011 = r10.getX();
        float r18 = r10.getY();
        if (isEnabled() == false) goto L83;
        if (this.f1185a == null) goto L83;
        int r4 = getThumbOffset();
        Drawable r52 = this.f1185a;
        Rect r62 = this.f1184Q;
        r52.getPadding(r62);
        int r53 = this.f1172E - r2;
        int r7 = (this.f1171D + r4) - r2;
        int r42 = (((this.f1170C + r7) + r62.left) + r62.right) + r2;
        int r63 = this.f1174G + r2;
        if (r011 <= r7) goto L83;
        if (r011 >= r42) goto L83;
        if (r18 <= r53) goto L83;
        if (r18 >= r63) goto L83;
        this.f1204t = 1;
        this.f1206v = r011;
        this.f1207w = r18;
        goto L83
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
        super.setAllCaps(r2);
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo127Q(r2);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean r10) {
        super.setChecked(r10);
        boolean r102 = isChecked();
        if (r102 == false) goto L11;
        if (Build.VERSION.SDK_INT < 30) goto L16;
        Object r1 = this.f1199o;
        if (r1 != null) goto L9;
        r1 = getResources().getString(C1031R.string.abc_capital_on);
    L9:
        Object r7 = r1;
        Field r12 = AbstractC0080Q.f219a;
        new C0065B(C1031R.id.tag_state_description, CharSequence.class, 64, 30, 1).m207e(this, r7);
    L16:
        float r2 = 0.0f;
        if (getWindowToken() != null) goto L19;
    L23:
        ObjectAnimator r02 = this.f1181N;
        if (r02 == null) goto L26;
        r02.cancel();
    L26:
        if (r102 == false) goto L28;
        r2 = 1.0f;
    L28:
        setThumbPosition(r2);
        return;
    L19:
        if (isLaidOut() == false) goto L23;
        if (r102 == false) goto L22;
        r2 = 1.0f;
    L22:
        ObjectAnimator r103 = ObjectAnimator.ofFloat(this, f1166R, new float[]{r2});
        this.f1181N = r103;
        r103.setDuration(250);
        this.f1181N.setAutoCancel(true);
        this.f1181N.start();
        return;
    L11:
        if (Build.VERSION.SDK_INT < 30) goto L16;
        Object r13 = this.f1201q;
        if (r13 != null) goto L15;
        r13 = getResources().getString(C1031R.string.abc_capital_off);
    L15:
        Object r72 = r13;
        Field r14 = AbstractC0080Q.f219a;
        new C0065B(C1031R.id.tag_state_description, CharSequence.class, 64, 30, 1).m207e(this, r72);
        goto L16
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback r1) {
        super.setCustomSelectionActionModeCallback(AbstractC0040p.m102e0(r1, this));
    }

    public void setEmojiCompatEnabled(boolean r2) {
        ((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo128R(r2);
        setTextOnInternal(this.f1199o);
        setTextOffInternal(this.f1201q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean r1) {
        this.f1175H = r1;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] r2) {
        super.setFilters(((AbstractC0040p) getEmojiTextViewHelper().f3306b.f251b).mo135w(r2));
    }

    public void setShowText(boolean r2) {
        if (this.f1203s == r2) goto L8;
        this.f1203s = r2;
        requestLayout();
        if (r2 == false) goto L9;
        m1134d();
        return;
    L9:
        return;
    }

    public void setSplitTrack(boolean r1) {
        this.f1198n = r1;
        invalidate();
    }

    public void setSwitchMinWidth(int r1) {
        this.f1196l = r1;
        requestLayout();
    }

    public void setSwitchPadding(int r1) {
        this.f1197m = r1;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface r3) {
        TextPaint r02 = this.f1176I;
        if (r02.getTypeface() == null) goto L7;
        if (r02.getTypeface().equals(r3) == true) goto L7;
    L9:
        r02.setTypeface(r3);
        requestLayout();
        invalidate();
        return;
    L7:
        if (r02.getTypeface() != null) goto L11;
        if (r3 != null) goto L9;
        return;
    }

    public void setTextOff(CharSequence r8) {
        setTextOffInternal(r8);
        requestLayout();
        if (isChecked() == false) goto L5;
        return;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L12;
        Object r82 = this.f1201q;
        if (r82 != null) goto L9;
        r82 = getResources().getString(C1031R.string.abc_capital_off);
    L9:
        Field r02 = AbstractC0080Q.f219a;
        new C0065B(C1031R.id.tag_state_description, CharSequence.class, 64, 30, 1).m207e(this, r82);
        return;
    }

    public void setTextOn(CharSequence r8) {
        setTextOnInternal(r8);
        requestLayout();
        if (isChecked() == true) goto L5;
        return;
    L5:
        if (Build.VERSION.SDK_INT < 30) goto L12;
        Object r82 = this.f1199o;
        if (r82 != null) goto L9;
        r82 = getResources().getString(C1031R.string.abc_capital_on);
    L9:
        Field r02 = AbstractC0080Q.f219a;
        new C0065B(C1031R.id.tag_state_description, CharSequence.class, 64, 30, 1).m207e(this, r82);
        return;
    }

    public void setThumbDrawable(Drawable r3) {
        Drawable r02 = this.f1185a;
        if (r02 == null) goto L5;
        r02.setCallback(null);
    L5:
        this.f1185a = r3;
        if (r3 == null) goto L8;
        r3.setCallback(this);
    L8:
        requestLayout();
    }

    public void setThumbPosition(float r1) {
        this.f1210z = r1;
        invalidate();
    }

    public void setThumbResource(int r2) {
        setThumbDrawable(AbstractC0358S.m916w(getContext(), r2));
    }

    public void setThumbTextPadding(int r1) {
        this.f1195k = r1;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList r1) {
        this.f1186b = r1;
        this.f1188d = true;
        m1131a();
    }

    public void setThumbTintMode(PorterDuff.Mode r1) {
        this.f1187c = r1;
        this.f1189e = true;
        m1131a();
    }

    public void setTrackDrawable(Drawable r3) {
        Drawable r02 = this.f1190f;
        if (r02 == null) goto L5;
        r02.setCallback(null);
    L5:
        this.f1190f = r3;
        if (r3 == null) goto L8;
        r3.setCallback(this);
    L8:
        requestLayout();
    }

    public void setTrackResource(int r2) {
        setTrackDrawable(AbstractC0358S.m916w(getContext(), r2));
    }

    public void setTrackTintList(ColorStateList r1) {
        this.f1191g = r1;
        this.f1193i = true;
        m1132b();
    }

    public void setTrackTintMode(PorterDuff.Mode r1) {
        this.f1192h = r1;
        this.f1194j = true;
        m1132b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
    L10:
        return true;
    L5:
        if (r2 == this.f1185a) goto L10;
        if (r2 == this.f1190f) goto L10;
        return false;
    }
}
