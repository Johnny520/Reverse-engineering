package defpackage;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Matcher;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d4 implements qw {
    public static final int[] d = null;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    static {
        d = new int[]{R.attr.indeterminateDrawable, R.attr.progressDrawable};
    }

    public /* synthetic */ d4(int r1, boolean r2) {
        this.a = r1;
    }

    public static boolean b(Editable r6, KeyEvent r7, boolean r8) {
        if (KeyEvent.metaStateHasNoModifiers(r7.getMetaState()) == false) goto L26;
        int r72 = Selection.getSelectionStart(r6);
        int r1 = Selection.getSelectionEnd(r6);
        if (r72 == (-1)) goto L26;
        if (r1 == (-1)) goto L26;
        if (r72 != r1) goto L26;
        g80[] r12 = (g80[]) r6.getSpans(r72, r1, g80.class);
        if (r12 == null) goto L26;
        if (r12.length <= 0) goto L26;
        int r2 = r12.length;
        int r3 = 0;
    L15:
        if (r3 >= r2) goto L26;
        g80 r4 = r12[r3];
        int r5 = r6.getSpanStart(r4);
        int r42 = r6.getSpanEnd(r4);
        if (r8 == false) goto L19;
        if (r5 != r72) goto L19;
    L23:
        r6.delete(r5, r42);
        return true;
    L19:
        if (r8 == true) goto L21;
        if (r42 == r72) goto L23;
    L21:
        if (r72 <= r5) goto L25;
        if (r72 < r42) goto L23;
    L25:
        r3 = r3 + 1;
    L26:
        return false;
    }

    public static int v(int r5, int r6) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r1 >= r5) goto L12;
        r2 = r2 + 1;
        if (r2 != r6) goto L8;
        r3 = r3 + 1;
        r2 = 0;
    L10:
        r1 = r1 + 1;
        goto L4
    L8:
        if (r2 <= r6) goto L10;
        r3 = r3 + 1;
        r2 = 1;
        goto L10
    L12:
        if ((r2 + 1) > r6) goto L14;
        return r3;
    L14:
        return r3 + 1;
    }

    public void A(int r4, int r5) {
        int[] r0 = (int[]) this.b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r4 >= r0.length) goto L21;
        int r02 = r4 + r5;
        r(r02);
        int[] r1 = (int[]) this.b;
        System.arraycopy(r1, r4, r1, r02, (r1.length - r4) - r5);
        Arrays.fill((int[]) this.b, r4, r02, -1);
        ArrayList r03 = (ArrayList) this.c;
        if (r03 == null) goto L22;
        int r04 = r03.size() - 1;
    L11:
        if (r04 < 0) goto L23;
        l40 r12 = (l40) ((ArrayList) this.c).get(r04);
        int r2 = r12.a;
        if (r2 < r4) goto L16;
        r12.a = r2 + r5;
    L16:
        r04 = r04 - 1;
        goto L11
    L23:
        return;
    L22:
        return;
    }

    public void B(int r6, int r7) {
        int[] r0 = (int[]) this.b;
        if (r0 != null) goto L5;
        return;
    L5:
        if (r6 >= r0.length) goto L24;
        int r02 = r6 + r7;
        r(r02);
        int[] r1 = (int[]) this.b;
        System.arraycopy(r1, r02, r1, r6, (r1.length - r6) - r7);
        int[] r12 = (int[]) this.b;
        Arrays.fill(r12, r12.length - r7, r12.length, -1);
        ArrayList r13 = (ArrayList) this.c;
        if (r13 == null) goto L25;
        int r14 = r13.size() - 1;
    L11:
        if (r14 < 0) goto L26;
        l40 r2 = (l40) ((ArrayList) this.c).get(r14);
        int r3 = r2.a;
        if (r3 < r6) goto L18;
        if (r3 >= r02) goto L17;
        ((ArrayList) this.c).remove(r14);
        goto L18
    L17:
        r2.a = r3 - r7;
    L18:
        r14 = r14 - 1;
        goto L11
    L26:
        return;
    L25:
        return;
    }

    public ji C(InputConnection r3, EditorInfo r4) {
        l0 r0 = (l0) this.c;
        if (r3 != null) goto L5;
        r0.getClass();
        r3 = null;
    L10:
        return (ji) r3;
    L5:
        d4 r02 = (d4) r0.b;
        r02.getClass();
        if ((r3 instanceof ji) == true) goto L10;
        r3 = new ji((EditText) r02.b, r3, r4);
        goto L10
    }

    public void D(n1 r4) {
        a8 r0 = (a8) this.b;
        ((ActionMode.Callback) r0.a).onDestroyActionMode(r0.b(r4));
        r3 r42 = (r3) this.c;
        if (r42.w == null) goto L6;
        r42.l.getDecorView().removeCallbacks(r42.x);
    L6:
        if (r42.v == null) goto L11;
        wa0 r02 = r42.y;
        if (r02 == null) goto L10;
        r02.b();
    L10:
        wa0 r03 = ja0.a(r42.v);
        r03.a(0.0f);
        r42.y = r03;
        r03.d(new h3(2, this));
    L11:
        r42.u = null;
        ViewGroup r04 = r42.A;
        WeakHashMap r1 = ja0.a;
        w90.c(r04);
        r42.I();
    }

    public boolean E(n1 r6, Menu r7) {
        ViewGroup r0 = ((r3) this.c).A;
        WeakHashMap r1 = ja0.a;
        w90.c(r0);
        a8 r02 = (a8) this.b;
        ActionMode.Callback r12 = (ActionMode.Callback) r02.a;
        h50 r62 = r02.b(r6);
        u30 r2 = (u30) r02.d;
        Menu r3 = (Menu) r2.getOrDefault(r7, null);
        if (r3 != null) goto L6;
        r3 = new gv((Context) r02.b, (ku) r7);
        r2.put(r7, r3);
    L6:
        return r12.onPrepareActionMode(r62, r3);
    }

    public void F(zk r6) {
        Handler r0 = (Handler) this.c;
        l0 r1 = (l0) this.b;
        int r2 = r6.b;
        if (r2 != 0) goto L6;
        r0.post(new h1(r1, r6.a, 4, false));
        return;
    L6:
        r0.post(new e8(r1, r2, 0));
    }

    public void G(Context r10, XmlResourceParser r11) {
        oc r0 = new oc();
        int r1 = r11.getAttributeCount();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L85;
        if ("id".equals(r11.getAttributeName(r2)) == true) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        String r12 = r11.getAttributeValue(r2);
        if (r12.contains("/") == false) goto L9;
        int r22 = r10.getResources().getIdentifier(r12.substring(r12.indexOf(47) + 1), "id", r10.getPackageName());
    L10:
        if (r22 == (-1)) goto L12;
    L86:
        int r13 = r11.getEventType();     // Catch: IOException -> L30 XmlPullParserException -> L32
        jc r4 = null;
    L17:
        if (r13 == 1) goto L82;
        if (r13 != 0) goto L20;
        r11.getName();     // Catch: IOException -> L30 XmlPullParserException -> L32
    L78:
        r13 = r11.next();     // Catch: IOException -> L30 XmlPullParserException -> L32
        goto L17
    L20:
        if (r13 != 2) goto L22;
        String r14 = r11.getName();     // Catch: IOException -> L30 XmlPullParserException -> L32
        switch(r14.hashCode()) {
            case -2025855158: goto L72;
            case -1984451626: goto L66;
            case -1269513683: goto L60;
            case -1238332596: goto L54;
            case -71750448: goto L51;
            case 1331510167: goto L48;
            case 1791837707: goto L42;
            case 1803088381: goto L39;
            default: goto L78;
        };
    L39:
        if (r14.equals("Constraint") == false) goto L78;
        r4 = oc.d(r10, Xml.asAttributeSet(r11));     // Catch: IOException -> L30 XmlPullParserException -> L32
        goto L78
    L42:
        if (r14.equals("CustomAttribute") == false) goto L78;
        if (r4 == null) goto L46;
        dc.a(r10, r11, r4.f);     // Catch: IOException -> L30 XmlPullParserException -> L32
        goto L78
    L46:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: IOException -> L30 XmlPullParserException -> L32
    L48:
        if (r14.equals("Barrier") == false) goto L78;
        r4 = oc.d(r10, Xml.asAttributeSet(r11));     // Catch: IOException -> L30 XmlPullParserException -> L32
        r4.d.c0 = 1;     // Catch: IOException -> L30 XmlPullParserException -> L32
        goto L78
    L51:
        if (r14.equals("Guideline") == false) goto L78;
        r4 = oc.d(r10, Xml.asAttributeSet(r11));     // Catch: IOException -> L30 XmlPullParserException -> L32
        r4.d.a = true;     // Catch: IOException -> L30 XmlPullParserException -> L32
        goto L78
    L54:
        if (r14.equals("Transform") == false) goto L78;
        if (r4 == null) goto L58;
        r4.e.a(r10, Xml.asAttributeSet(r11));     // Catch: IOException -> L30 XmlPullParserException -> L32
        goto L78
    L58:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: IOException -> L30 XmlPullParserException -> L32
    L60:
        if (r14.equals("PropertySet") == false) goto L78;
        if (r4 == null) goto L64;
        r4.b.a(r10, Xml.asAttributeSet(r11));     // Catch: IOException -> L30 XmlPullParserException -> L32
        goto L78
    L64:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: IOException -> L30 XmlPullParserException -> L32
    L66:
        if (r14.equals("Motion") == false) goto L78;
        if (r4 == null) goto L70;
        r4.c.a(r10, Xml.asAttributeSet(r11));     // Catch: IOException -> L30 XmlPullParserException -> L32
        goto L78
    L70:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: IOException -> L30 XmlPullParserException -> L32
    L72:
        if (r14.equals("Layout") == false) goto L78;
        if (r4 == null) goto L76;
        r4.d.a(r10, Xml.asAttributeSet(r11));     // Catch: IOException -> L30 XmlPullParserException -> L32
        goto L78
    L76:
        throw new RuntimeException("XML parser error must be within a Constraint " + r11.getLineNumber());     // Catch: IOException -> L30 XmlPullParserException -> L32
    L22:
        if (r13 != 3) goto L78;
        String r15 = r11.getName();     // Catch: IOException -> L30 XmlPullParserException -> L32
        if ("ConstraintSet".equals(r15) == true) goto L82;
        if (r15.equalsIgnoreCase("Constraint") == false) goto L78;
        r0.c.put(Integer.valueOf(r4.a), r4);     // Catch: IOException -> L30 XmlPullParserException -> L32
        r4 = null;
    L82:
        ((SparseArray) this.c).put(r22, r0);
        return;
    L30:
        e = move-exception;
        e.printStackTrace();
    L32:
        e = move-exception;
        e.printStackTrace();
        goto L82
    L12:
        if (r12.length() <= 1) goto L14;
        r22 = Integer.parseInt(r12.substring(1));
        goto L86
    L14:
        Log.e("ConstraintLayoutStates", "error in parsing id");
        goto L86
    L9:
        r22 = -1;
        goto L10
    }

    public lw H(b00 r6, int r7) {
        u30 r0 = (u30) this.b;
        int r62 = r0.e(r6);
        if (r62 < 0) goto L21;
        oa0 r2 = (oa0) r0.j(r62);
        if (r2 == null) goto L21;
        int r3 = r2.a;
        if ((r3 & r7) == 0) goto L21;
        int r32 = r3 & (~r7);
        r2.a = r32;
        if (r7 != 4) goto L13;
        lw r72 = r2.b;
    L16:
        if ((r32 & 12) != 0) goto L18;
        r0.i(r62);
        r2.a = 0;
        r2.b = null;
        r2.c = null;
        oa0.d.c(r2);
    L18:
        return r72;
    L13:
        if (r7 != 8) goto L20;
        r72 = r2.c;
        goto L16
    L20:
        throw new IllegalArgumentException("Must provide flag PRE or POST");
    L21:
        return null;
    }

    public void I(b00 r3) {
        oa0 r32 = (oa0) ((u30) this.b).getOrDefault(r3, null);
        if (r32 != null) goto L5;
        return;
    L5:
        r32.a &= -2;
    }

    public void J(b00 r7) {
        bs r0 = (bs) this.c;
        int r1 = r0.e() - 1;
    L3:
        if (r1 < 0) goto L10;
        if (r7 == r0.f(r1)) goto L6;
        r1 = r1 - 1;
        goto L3
    L6:
        Object[] r3 = r0.c;
        Object r4 = r3[r1];
        Object r5 = bs.e;
        if (r4 == r5) goto L10;
        r3[r1] = r5;
        r0.a = true;
    L10:
        oa0 r72 = (oa0) ((u30) this.b).remove(r7);
        if (r72 == null) goto L16;
        r72.a = 0;
        r72.b = null;
        r72.c = null;
        oa0.d.c(r72);
        return;
    }

    public void K(boolean r6) {
        si r0 = (si) ((d4) ((l0) this.c).b).c;
        if (r0.c != r6) goto L5;
        return;
    L5:
        if (r0.b == null) goto L12;
        ei r1 = ei.a();
        ri r2 = r0.b;
        r1.getClass();
        zt.f("initCallback cannot be null", r2);
        ReentrantReadWriteLock r3 = r1.a;
        r3.writeLock().lock();
        r1.b.remove(r2);     // Catch: Throwable -> L9
        r3.writeLock().unlock();
    L9:
        th = move-exception;
        r3.writeLock().unlock();
        throw th;
    L12:
        r0.c = r6;
        if (r6 == false) goto L19;
        si.a(r0.a, ei.a().b());
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable L(Drawable r8, boolean r9) {
        if ((r8 instanceof ad0) == false) goto L6;
        ((bd0) ((ad0) r8)).getClass();
    L31:
        return r8;
    L6:
        if ((r8 instanceof LayerDrawable) == false) goto L22;
        LayerDrawable r82 = (LayerDrawable) r8;
        int r92 = r82.getNumberOfLayers();
        Drawable[] r0 = new Drawable[r92];
        int r2 = 0;
        int r3 = 0;
    L8:
        if (r3 >= r92) goto L17;
        int r4 = r82.getId(r3);
        Drawable r5 = r82.getDrawable(r3);
        if (r4 != 16908301) goto L12;
    L15:
        boolean r42 = true;
    L16:
        r0[r3] = L(r5, r42);
        r3 = r3 + 1;
        goto L8
    L12:
        if (r4 == 16908303) goto L15;
        r42 = false;
        goto L16
    L17:
        LayerDrawable r1 = new LayerDrawable(r0);
    L18:
        if (r2 >= r92) goto L20;
        r1.setId(r2, r82.getId(r2));
        r1.setLayerGravity(r2, r82.getLayerGravity(r2));
        r1.setLayerWidth(r2, r82.getLayerWidth(r2));
        r1.setLayerHeight(r2, r82.getLayerHeight(r2));
        r1.setLayerInsetLeft(r2, r82.getLayerInsetLeft(r2));
        r1.setLayerInsetRight(r2, r82.getLayerInsetRight(r2));
        r1.setLayerInsetTop(r2, r82.getLayerInsetTop(r2));
        r1.setLayerInsetBottom(r2, r82.getLayerInsetBottom(r2));
        r1.setLayerInsetStart(r2, r82.getLayerInsetStart(r2));
        r1.setLayerInsetEnd(r2, r82.getLayerInsetEnd(r2));
        r2 = r2 + 1;
        goto L18
    L20:
        return r1;
    L22:
        if ((r8 instanceof BitmapDrawable) == false) goto L31;
        BitmapDrawable r83 = (BitmapDrawable) r8;
        Bitmap r02 = r83.getBitmap();
        if (((Bitmap) this.c) != null) goto L26;
        this.c = r02;
    L26:
        ShapeDrawable r22 = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
        r22.getPaint().setShader(new BitmapShader(r02, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
        r22.getPaint().setColorFilter(r83.getPaint().getColorFilter());
        if (r9 == true) goto L29;
        return r22;
    L29:
        return new ClipDrawable(r22, 3, 1);
    }

    public void a(b00 r3, lw r4) {
        u30 r0 = (u30) this.b;
        oa0 r1 = (oa0) r0.getOrDefault(r3, null);
        if (r1 != null) goto L5;
        r1 = oa0.a();
        r0.put(r3, r1);
    L5:
        r1.c = r4;
        r1.a |= 8;
    }

    public void c(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.c(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    @Override // defpackage.qw
    public wc0 d(View r17, wc0 r18) {
        r7 r3 = (r7) this.b;
        ab0 r4 = (ab0) this.c;
        int r5 = r4.a;
        int r6 = r4.b;
        int r42 = r4.c;
        tc0 r7 = r18.a;
        ep r8 = r7.f(7);
        ep r72 = r7.f(32);
        BottomSheetBehavior r9 = (BottomSheetBehavior) r3.b;
        int r10 = r8.b;
        int r11 = r8.c;
        int r12 = r8.a;
        r9.w = r10;
        boolean r102 = gt.n(r17);
        int r13 = r17.getPaddingBottom();
        int r14 = r17.getPaddingLeft();
        int r15 = r17.getPaddingRight();
        boolean r0 = r9.o;
        if (r0 == false) goto L6;
        int r132 = r18.a();
        r9.v = r132;
        r13 = r132 + r42;
    L6:
        if (r9.p == false) goto L12;
        if (r102 == false) goto L9;
        int r43 = r6;
    L10:
        r14 = r43 + r12;
        goto L12
    L9:
        r43 = r5;
    L12:
        if (r9.q == false) goto L17;
        if (r102 == true) goto L16;
        r5 = r6;
    L16:
        r15 = r5 + r11;
    L17:
        ViewGroup.MarginLayoutParams r44 = (ViewGroup.MarginLayoutParams) r17.getLayoutParams();
        boolean r62 = true;
        if (r9.s == true) goto L20;
    L22:
        boolean r52 = false;
    L24:
        if (r9.t == false) goto L29;
        if (r44.rightMargin == r11) goto L29;
        r44.rightMargin = r11;
        r52 = true;
    L29:
        if (r9.u == false) goto L33;
        int r103 = r44.topMargin;
        int r82 = r8.b;
        if (r103 == r82) goto L33;
        r44.topMargin = r82;
    L34:
        if (r62 == false) goto L36;
        r17.setLayoutParams(r44);
    L36:
        r17.setPadding(r14, r17.getPaddingTop(), r15, r13);
        boolean r1 = r3.a;
        if (r1 == false) goto L39;
        r9.m = r72.d;
    L39:
        if (r0 == true) goto L43;
        if (r1 == true) goto L43;
        return r18;
    L43:
        r9.I();
        return r18;
    L33:
        r62 = r52;
        goto L34
    L20:
        if (r44.leftMargin == r12) goto L22;
        r44.leftMargin = r12;
        r52 = true;
        goto L24
    }

    public void e(boolean r3) {
        yl r0 = (yl) this.c;
        FragmentActivity r1 = r0.n.D;
        ml r02 = r0.p;
        if (r02 == null) goto L5;
        r02.j().k.e(true);
    L5:
        Iterator r03 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r03.hasNext() == true) goto L8;
        return;
    L8:
        if (r03.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void f(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.f(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void g(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.g(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void h(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.h(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void i(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.i(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void j(boolean r3) {
        yl r0 = (yl) this.c;
        FragmentActivity r1 = r0.n.D;
        ml r02 = r0.p;
        if (r02 == null) goto L5;
        r02.j().k.j(true);
    L5:
        Iterator r03 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r03.hasNext() == true) goto L8;
        return;
    L8:
        if (r03.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void k(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.k(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void l(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.l(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void m(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.m(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void n(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.n(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void o(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.o(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void p(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.p(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void q(boolean r3) {
        ml r0 = ((yl) this.c).p;
        if (r0 == null) goto L5;
        r0.j().k.q(true);
    L5:
        Iterator r02 = ((CopyOnWriteArrayList) this.b).iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        if (r02.next() != null) goto L14;
        if (r3 == false) goto L12;
        throw null;
    L12:
        throw null;
    L14:
        throw new ClassCastException();
    }

    public void r(int r5) {
        int[] r0 = (int[]) this.b;
        if (r0 != null) goto L7;
        int[] r52 = new int[Math.max(r5, 10) + 1];
        this.b = r52;
        Arrays.fill(r52, -1);
        return;
    L7:
        if (r5 < r0.length) goto L14;
        int r2 = r0.length;
    L9:
        if (r2 > r5) goto L11;
        r2 = r2 * 2;
        goto L9
    L11:
        int[] r53 = new int[r2];
        this.b = r53;
        System.arraycopy(r0, 0, r53, 0, r0.length);
        int[] r54 = (int[]) this.b;
        Arrays.fill(r54, r0.length, r54.length, -1);
        return;
    }

    public View s(int r10, int r11, int r12, int r13) {
        n90 r0 = (n90) this.c;
        lz r1 = (lz) this.b;
        int r2 = r1.d();
        int r3 = r1.c();
        if (r11 <= r10) goto L5;
        int r4 = 1;
    L6:
        View r5 = null;
    L7:
        if (r10 == r11) goto L22;
        switch(r1.a) {
            case 0: goto L11;
            default: goto L10;
        };
    L10:
        View r6 = r1.b.u(r10);
    L12:
        int r7 = r1.b(r6);
        int r8 = r1.a(r6);
        r0.b = r2;
        r0.c = r3;
        r0.d = r7;
        r0.e = r8;
        if (r12 == 0) goto L17;
        r0.a = r12;
        if (r0.a() == false) goto L17;
        return r6;
    L17:
        if (r13 == 0) goto L21;
        r0.a = r13;
        if (r0.a() == false) goto L21;
        r5 = r6;
    L21:
        r10 = r10 + r4;
        goto L7
    L11:
        r6 = r1.b.u(r10);
        goto L12
    L22:
        return r5;
    L5:
        r4 = -1;
        goto L6
    }

    public List t() {
        if (((ft) this.c) != null) goto L5;
        this.c = new ft(this);
    L5:
        ft r0 = (ft) this.c;
        ip.l(r0);
        return r0;
    }

    public String toString() {
        switch(this.a) {
            case 21: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "Bounds{lower=" + ((ep) this.b) + " upper=" + ((ep) this.c) + "}";
    }

    public KeyListener u(KeyListener r2) {
        if ((r2 instanceof NumberKeyListener) == true) goto L15;
        ((d4) ((l0) this.c).b).getClass();
        if ((r2 instanceof mi) == false) goto L7;
        return r2;
    L7:
        if (r2 != null) goto L11;
        return null;
    L11:
        if ((r2 instanceof NumberKeyListener) == false) goto L14;
        return r2;
    L14:
        return new mi(r2);
    L15:
        return r2;
    }

    public boolean w(CharSequence r8, int r9, int r10, ni r11) {
        if (r11.c != 0) goto L19;
        bi r0 = (bi) this.c;
        vv r4 = r11.b();
        int r5 = r4.a(8);
        if (r5 == 0) goto L7;
        ((ByteBuffer) r4.d).getShort(r5 + r4.a);
    L7:
        mf r02 = (mf) r0;
        r02.getClass();
        ThreadLocal r42 = mf.b;
        if (r42.get() != null) goto L10;
        r42.set(new StringBuilder());
    L10:
        StringBuilder r43 = (StringBuilder) r42.get();
        r43.setLength(0);
    L11:
        if (r9 >= r10) goto L13;
        r43.append(r8.charAt(r9));
        r9 = r9 + 1;
        goto L11
    L13:
        TextPaint r82 = r02.a;
        String r92 = r43.toString();
        int r102 = jx.a;
        if (ix.a(r82, r92) == false) goto L16;
        int r83 = 2;
    L17:
        r11.c = r83;
        goto L19
    L16:
        r83 = 1;
    L19:
        if (r11.c != 2) goto L21;
        return true;
    L21:
        return false;
    }

    public void x() {
        ((SparseIntArray) this.b).clear();
    }

    public boolean y(View r6) {
        n90 r0 = (n90) this.c;
        lz r1 = (lz) this.b;
        int r2 = r1.d();
        int r3 = r1.c();
        int r4 = r1.b(r6);
        int r62 = r1.a(r6);
        r0.b = r2;
        r0.c = r3;
        r0.d = r4;
        r0.e = r62;
        r0.a = 24579;
        return r0.a();
    }

    public void z(AttributeSet r9, int r10) {
        switch(this.a) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        TypedArray r92 = ((EditText) this.b).getContext().obtainStyledAttributes(r9, xy.i, r10, 0);
        boolean r1 = true;
        if (r92.hasValue(14) == false) goto L11;
        r1 = r92.getBoolean(14, true);     // Catch: Throwable -> L9
    L11:
        r92.recycle();
        K(r1);
        return;
    L9:
        th = move-exception;
        r92.recycle();
        throw th;
    L15:
        AbsSeekBar r0 = (AbsSeekBar) this.b;
        r5 r93 = r5.y(r0.getContext(), r9, d, r10);
        Drawable r12 = r93.n(0);
        if (r12 != null) goto L18;
    L25:
        Drawable r13 = r93.n(1);
        if (r13 == null) goto L28;
        r0.setProgressDrawable(L(r13, false));
    L28:
        r93.z();
        return;
    L18:
        if ((r12 instanceof AnimationDrawable) == false) goto L24;
        AnimationDrawable r14 = (AnimationDrawable) r12;
        int r3 = r14.getNumberOfFrames();
        AnimationDrawable r4 = new AnimationDrawable();
        r4.setOneShot(r14.isOneShot());
        int r5 = 0;
    L21:
        if (r5 >= r3) goto L23;
        Drawable r7 = L(r14.getFrame(r5), true);
        r7.setLevel(10000);
        r4.addFrame(r7, r14.getDuration(r5));
        r5 = r5 + 1;
        goto L21
    L23:
        r4.setLevel(10000);
        r12 = r4;
    L24:
        r0.setIndeterminateDrawable(r12);
        goto L25
    }

    public /* synthetic */ d4(Object r1, int r2, Object r3) {
        this.a = r2;
        this.c = r1;
        this.b = r3;
    }

    public /* synthetic */ d4(Object r1, Object r2, int r3, boolean r4) {
        this.a = r3;
        this.b = r1;
        this.c = r2;
    }

    public d4(AbsSeekBar r2) {
        this.a = 0;
        this.b = r2;
    }

    public d4(EditText r5, int r6) {
        this.a = r6;
        switch(r6) {
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        this.b = r5;
        this.c = new l0(r5);
        return;
    L6:
        this.b = r5;
        si r62 = new si(r5);
        this.c = r62;
        r5.addTextChangedListener(r62);
        if (ii.b != null) goto L21;
        Object r63 = ii.a;
        monitor-enter(r63);
    L15:
        th = move-exception;
        throw th;
    L11:
        if (ii.b != null) goto L17;
        ii r0 = new ii();     // Catch: Throwable -> L15
        ii.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, ii.class.getClassLoader());     // Catch: Throwable -> L23
    L14:
        ii.b = r0;     // Catch: Throwable -> L15
    L17:
        monitor-exit(r63);     // Catch: Throwable -> L15
    L21:
        r5.setEditableFactory(ii.b);
    }

    public d4(yl r2) {
        this.a = 11;
        this.b = new CopyOnWriteArrayList();
        this.c = r2;
    }

    public d4(Runnable r2) {
        this.a = 16;
        this.c = new CopyOnWriteArrayList();
        new HashMap();
        this.b = r2;
    }

    public d4(Context r5) {
        this.a = 5;
        TypedArray r0 = r5.obtainStyledAttributes(gt.A(r5, com.ljx.wechatmod.R.attr.materialCalendarStyle, ut.class.getCanonicalName()).data, wy.l);
        vh.f(r5, r0.getResourceId(4, 0));
        vh.f(r5, r0.getResourceId(2, 0));
        vh.f(r5, r0.getResourceId(3, 0));
        vh.f(r5, r0.getResourceId(5, 0));
        ColorStateList r1 = ct.n(r5, r0, 7);
        this.b = vh.f(r5, r0.getResourceId(9, 0));
        vh.f(r5, r0.getResourceId(8, 0));
        this.c = vh.f(r5, r0.getResourceId(10, 0));
        new Paint().setColor(r1.getDefaultColor());
        r0.recycle();
    }

    public d4(a8 r1, vh r2, mf r3) {
        this.a = 9;
        this.b = r1;
        this.c = r3;
    }

    public d4(lz r2) {
        this.a = 18;
        this.b = r2;
        n90 r22 = new n90();
        r22.a = 0;
        this.c = r22;
    }

    public d4(ArrayList r5, ArrayList r6) {
        this.a = 12;
        int r0 = r5.size();
        this.b = new int[r0];
        this.c = new float[r0];
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((int[]) this.b)[r1] = ((Integer) r5.get(r1)).intValue();
        ((float[]) this.c)[r1] = ((Float) r6.get(r1)).floatValue();
        r1 = r1 + 1;
        goto L3
    }

    public d4(int r2, int r3) {
        this.a = 12;
        this.b = new int[]{r2, r3};
        this.c = new float[]{0.0f, 1.0f};
    }

    public d4(int r2, int r3, int r4) {
        this.a = 12;
        this.b = new int[]{r2, r3, r4};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public d4(Animation r2) {
        this.a = 10;
        this.b = r2;
        this.c = null;
    }

    public d4(Animator r2) {
        this.a = 10;
        this.b = null;
        this.c = r2;
    }

    public d4(Matcher r2, CharSequence r3) {
        this.a = 15;
        ip.o("input", r3);
        this.b = r2;
    }

    public d4(int r1) {
        this.a = r1;
        switch(r1) {
            case 19: goto L6;
            default: goto L4;
        };
    L4:
        this.b = new SparseIntArray();
        this.c = new SparseIntArray();
        return;
    L6:
        this.b = new u30();
        this.c = new bs();
    }
}
