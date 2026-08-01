package p000;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import android.util.SparseIntArray;
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
import com.github.megatronking.stringfog.Base64;
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

/* JADX INFO: renamed from: d4 */
/* JADX INFO: loaded from: classes.dex */
public class C0138d4 implements InterfaceC0945yw {

    /* JADX INFO: renamed from: d */
    public static final int[] f1295d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1296a;

    /* JADX INFO: renamed from: b */
    public Object f1297b;

    /* JADX INFO: renamed from: c */
    public Object f1298c;

    public /* synthetic */ C0138d4(int i, boolean z) {
        this.f1296a = i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m827b(Editable editable, KeyEvent keyEvent, boolean z) {
        m80[] m80VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (m80VarArr = (m80[]) editable.getSpans(selectionStart, selectionEnd, m80.class)) != null && m80VarArr.length > 0) {
                for (m80 m80Var : m80VarArr) {
                    int spanStart = editable.getSpanStart(m80Var);
                    int spanEnd = editable.getSpanEnd(m80Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public static int m828v(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        return i3 + 1 > i2 ? i4 + 1 : i4;
    }

    /* JADX INFO: renamed from: A */
    public void m829A(int i, int i2) {
        int[] iArr = (int[]) this.f1297b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m857r(i3);
        int[] iArr2 = (int[]) this.f1297b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f1297b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f1298c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s40 s40Var = (s40) ((ArrayList) this.f1298c).get(size);
            int i4 = s40Var.f4207a;
            if (i4 >= i) {
                s40Var.f4207a = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m830B(int i, int i2) {
        int[] iArr = (int[]) this.f1297b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m857r(i3);
        int[] iArr2 = (int[]) this.f1297b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f1297b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f1298c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s40 s40Var = (s40) ((ArrayList) this.f1298c).get(size);
            int i4 = s40Var.f4207a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f1298c).remove(size);
                } else {
                    s40Var.f4207a = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public C0449li m831C(InputConnection inputConnection, EditorInfo editorInfo) {
        C0431l0 c0431l0 = (C0431l0) this.f1298c;
        if (inputConnection == null) {
            c0431l0.getClass();
            inputConnection = null;
        } else {
            C0138d4 c0138d4 = (C0138d4) c0431l0.f2886b;
            c0138d4.getClass();
            if (!(inputConnection instanceof C0449li)) {
                inputConnection = new C0449li((EditText) c0138d4.f1297b, inputConnection, editorInfo);
            }
        }
        return (C0449li) inputConnection;
    }

    /* JADX INFO: renamed from: D */
    public void m832D(AbstractC0506n1 abstractC0506n1) {
        C0402k8 c0402k8 = (C0402k8) this.f1297b;
        ((ActionMode.Callback) c0402k8.f2794a).onDestroyActionMode(c0402k8.m1662b(abstractC0506n1));
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = (LayoutInflaterFactory2C0656r3) this.f1298c;
        if (layoutInflaterFactory2C0656r3.f4050w != null) {
            layoutInflaterFactory2C0656r3.f4039l.getDecorView().removeCallbacks(layoutInflaterFactory2C0656r3.f4051x);
        }
        if (layoutInflaterFactory2C0656r3.f4049v != null) {
            bb0 bb0Var = layoutInflaterFactory2C0656r3.f4052y;
            if (bb0Var != null) {
                bb0Var.m508b();
            }
            bb0 bb0VarM2001a = oa0.m2001a(layoutInflaterFactory2C0656r3.f4049v);
            bb0VarM2001a.m507a(0.0f);
            layoutInflaterFactory2C0656r3.f4052y = bb0VarM2001a;
            bb0VarM2001a.m510d(new C0284h3(2, this));
        }
        layoutInflaterFactory2C0656r3.f4048u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0656r3.f4004A;
        WeakHashMap weakHashMap = oa0.f3426a;
        ba0.m506c(viewGroup);
        layoutInflaterFactory2C0656r3.m2212I();
    }

    /* JADX INFO: renamed from: E */
    public boolean m833E(AbstractC0506n1 abstractC0506n1, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0656r3) this.f1298c).f4004A;
        WeakHashMap weakHashMap = oa0.f3426a;
        ba0.m506c(viewGroup);
        C0402k8 c0402k8 = (C0402k8) this.f1297b;
        ActionMode.Callback callback = (ActionMode.Callback) c0402k8.f2794a;
        o50 o50VarM1662b = c0402k8.m1662b(abstractC0506n1);
        b40 b40Var = (b40) c0402k8.f2797d;
        Menu menuC0573ov = (Menu) b40Var.getOrDefault(menu, null);
        if (menuC0573ov == null) {
            menuC0573ov = new MenuC0573ov((Context) c0402k8.f2795b, (MenuC0646qu) menu);
            b40Var.put(menu, menuC0573ov);
        }
        return callback.onPrepareActionMode(o50VarM1662b, menuC0573ov);
    }

    /* JADX INFO: renamed from: F */
    public void m834F(C0072bl c0072bl) {
        Handler handler = (Handler) this.f1298c;
        C0431l0 c0431l0 = (C0431l0) this.f1297b;
        int i = c0072bl.f736b;
        if (i == 0) {
            handler.post(new RunnableC0282h1(c0431l0, c0072bl.f735a, 4, false));
        } else {
            handler.post(new RunnableC0550o8(c0431l0, i, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c1, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m835G(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0138d4.m835G(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* JADX INFO: renamed from: H */
    public C0759tw m836H(i00 i00Var, int i) {
        ta0 ta0Var;
        C0759tw c0759tw;
        b40 b40Var = (b40) this.f1297b;
        int iM482e = b40Var.m482e(i00Var);
        if (iM482e >= 0 && (ta0Var = (ta0) b40Var.m487j(iM482e)) != null) {
            int i2 = ta0Var.f4434a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                ta0Var.f4434a = i3;
                if (i == 4) {
                    c0759tw = ta0Var.f4435b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0759tw = ta0Var.f4436c;
                }
                if ((i3 & 12) == 0) {
                    b40Var.m486i(iM482e);
                    ta0Var.f4434a = 0;
                    ta0Var.f4435b = null;
                    ta0Var.f4436c = null;
                    ta0.f4433d.mo477c(ta0Var);
                }
                return c0759tw;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public void m837I(i00 i00Var) {
        ta0 ta0Var = (ta0) ((b40) this.f1297b).getOrDefault(i00Var, null);
        if (ta0Var == null) {
            return;
        }
        ta0Var.f4434a &= -2;
    }

    /* JADX INFO: renamed from: J */
    public void m838J(i00 i00Var) {
        C0235fs c0235fs = (C0235fs) this.f1298c;
        int iM1111e = c0235fs.m1111e() - 1;
        while (true) {
            if (iM1111e < 0) {
                break;
            }
            if (i00Var == c0235fs.m1112f(iM1111e)) {
                Object[] objArr = c0235fs.f1826c;
                Object obj = objArr[iM1111e];
                Object obj2 = C0235fs.f1823e;
                if (obj != obj2) {
                    objArr[iM1111e] = obj2;
                    c0235fs.f1824a = true;
                }
            } else {
                iM1111e--;
            }
        }
        ta0 ta0Var = (ta0) ((b40) this.f1297b).remove(i00Var);
        if (ta0Var != null) {
            ta0Var.f4434a = 0;
            ta0Var.f4435b = null;
            ta0Var.f4436c = null;
            ta0.f4433d.mo477c(ta0Var);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m839K(boolean z) {
        C0782ui c0782ui = (C0782ui) ((C0138d4) ((C0431l0) this.f1298c).f2886b).f1298c;
        if (c0782ui.f4829c != z) {
            if (c0782ui.f4828b != null) {
                C0262gi c0262giM1277a = C0262gi.m1277a();
                C0745ti c0745ti = c0782ui.f4828b;
                c0262giM1277a.getClass();
                AbstractC0498mu.m1887d("initCallback cannot be null", c0745ti);
                ReentrantReadWriteLock reentrantReadWriteLock = c0262giM1277a.f1989a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0262giM1277a.f1990b.remove(c0745ti);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0782ui.f4829c = z;
            if (z) {
                C0782ui.m2476a(c0782ui.f4827a, C0262gi.m1277a().m1278b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public Drawable m840L(Drawable drawable, boolean z) {
        if (drawable instanceof fd0) {
            ((gd0) ((fd0) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m840L(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f1298c) == null) {
                    this.f1298c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* JADX INFO: renamed from: a */
    public void m841a(i00 i00Var, C0759tw c0759tw) {
        b40 b40Var = (b40) this.f1297b;
        ta0 ta0VarM2405a = (ta0) b40Var.getOrDefault(i00Var, null);
        if (ta0VarM2405a == null) {
            ta0VarM2405a = ta0.m2405a();
            b40Var.put(i00Var, ta0VarM2405a);
        }
        ta0VarM2405a.f4436c = c0759tw;
        ta0VarM2405a.f4434a |= 8;
    }

    /* JADX INFO: renamed from: c */
    public void m842c(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m842c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m843d(boolean z) {
        C0023am c0023am = (C0023am) this.f1298c;
        FragmentActivity fragmentActivity = c0023am.f107n.f3728z;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0023am.f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m843d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    @Override // p000.InterfaceC0945yw
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000.bd0 mo844e(android.view.View r17, p000.bd0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f1297b
            b8 r3 = (p000.C0059b8) r3
            java.lang.Object r4 = r0.f1298c
            fb0 r4 = (p000.fb0) r4
            int r5 = r4.f1786a
            int r6 = r4.f1787b
            int r4 = r4.f1788c
            yc0 r7 = r2.f724a
            r8 = 7
            ip r8 = r7.mo2368f(r8)
            r9 = 32
            ip r7 = r7.mo2368f(r9)
            java.lang.Object r9 = r3.f693b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.f2572b
            int r11 = r8.f2573c
            int r12 = r8.f2571a
            r9.f990w = r10
            boolean r10 = p000.AbstractC0498mu.m1899t(r1)
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            boolean r0 = r9.f982o
            if (r0 == 0) goto L48
            int r13 = r2.m516a()
            r9.f989v = r13
            int r13 = r13 + r4
        L48:
            boolean r4 = r9.f983p
            if (r4 == 0) goto L53
            if (r10 == 0) goto L50
            r4 = r6
            goto L51
        L50:
            r4 = r5
        L51:
            int r14 = r4 + r12
        L53:
            boolean r4 = r9.f984q
            if (r4 == 0) goto L5d
            if (r10 == 0) goto L5a
            goto L5b
        L5a:
            r5 = r6
        L5b:
            int r15 = r5 + r11
        L5d:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r9.f986s
            r6 = 1
            if (r5 == 0) goto L70
            int r5 = r4.leftMargin
            if (r5 == r12) goto L70
            r4.leftMargin = r12
            r5 = r6
            goto L71
        L70:
            r5 = 0
        L71:
            boolean r10 = r9.f987t
            if (r10 == 0) goto L7c
            int r10 = r4.rightMargin
            if (r10 == r11) goto L7c
            r4.rightMargin = r11
            r5 = r6
        L7c:
            boolean r10 = r9.f988u
            if (r10 == 0) goto L89
            int r10 = r4.topMargin
            int r8 = r8.f2572b
            if (r10 == r8) goto L89
            r4.topMargin = r8
            goto L8a
        L89:
            r6 = r5
        L8a:
            if (r6 == 0) goto L8f
            r1.setLayoutParams(r4)
        L8f:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r14, r4, r15, r13)
            boolean r1 = r3.f692a
            if (r1 == 0) goto L9e
            int r3 = r7.f2574d
            r9.f980m = r3
        L9e:
            if (r0 != 0) goto La4
            if (r1 == 0) goto La3
            goto La4
        La3:
            return r2
        La4:
            r9.m681I()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0138d4.mo844e(android.view.View, bd0):bd0");
    }

    /* JADX INFO: renamed from: f */
    public void m845f(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m845f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m846g(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m846g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m847h(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m847h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m848i(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m848i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m849j(boolean z) {
        C0023am c0023am = (C0023am) this.f1298c;
        FragmentActivity fragmentActivity = c0023am.f107n.f3728z;
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = c0023am.f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m849j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m850k(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m850k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m851l(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m851l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m852m(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m852m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m853n(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m853n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m854o(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m854o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m855p(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m855p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m856q(boolean z) {
        AbstractComponentCallbacksC0563ol abstractComponentCallbacksC0563ol = ((C0023am) this.f1298c).f109p;
        if (abstractComponentCallbacksC0563ol != null) {
            abstractComponentCallbacksC0563ol.m2039j().f104k.m856q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1297b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m857r(int i) {
        int[] iArr = (int[]) this.f1297b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f1297b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f1297b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f1297b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: s */
    public View m858s(int i, int i2, int i3, int i4) {
        View viewM2526u;
        s90 s90Var = (s90) this.f1298c;
        C0725sz c0725sz = (C0725sz) this.f1297b;
        int iM2388d = c0725sz.m2388d();
        int iM2387c = c0725sz.m2387c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c0725sz.f4375a) {
                case Base64.DEFAULT /* 0 */:
                    viewM2526u = c0725sz.f4376b.m2526u(i);
                    break;
                default:
                    viewM2526u = c0725sz.f4376b.m2526u(i);
                    break;
            }
            int iM2386b = c0725sz.m2386b(viewM2526u);
            int iM2385a = c0725sz.m2385a(viewM2526u);
            s90Var.f4221b = iM2388d;
            s90Var.f4222c = iM2387c;
            s90Var.f4223d = iM2386b;
            s90Var.f4224e = iM2385a;
            if (i3 != 0) {
                s90Var.f4220a = i3;
                if (s90Var.m2326a()) {
                    return viewM2526u;
                }
            }
            if (i4 != 0) {
                s90Var.f4220a = i4;
                if (s90Var.m2326a()) {
                    view = viewM2526u;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: t */
    public List m859t() {
        if (((C0460lt) this.f1298c) == null) {
            this.f1298c = new C0460lt(this);
        }
        C0460lt c0460lt = (C0460lt) this.f1298c;
        AbstractC0493mp.m1854d(c0460lt);
        return c0460lt;
    }

    public String toString() {
        switch (this.f1296a) {
            case 21:
                return "Bounds{lower=" + ((C0346ip) this.f1297b) + " upper=" + ((C0346ip) this.f1298c) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public KeyListener m860u(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0138d4) ((C0431l0) this.f1298c).f2886b).getClass();
        if (keyListener instanceof C0560oi) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0560oi(keyListener);
    }

    /* JADX INFO: renamed from: w */
    public boolean m861w(CharSequence charSequence, int i, int i2, C0597pi c0597pi) {
        if (c0597pi.f3714c == 0) {
            InterfaceC0152di interfaceC0152di = (InterfaceC0152di) this.f1298c;
            C0129cw c0129cwM2091b = c0597pi.m2091b();
            int iM2795a = c0129cwM2091b.m2795a(8);
            if (iM2795a != 0) {
                ((ByteBuffer) c0129cwM2091b.f5550d).getShort(iM2795a + c0129cwM2091b.f5547a);
            }
            C0520nf c0520nf = (C0520nf) interfaceC0152di;
            c0520nf.getClass();
            ThreadLocal threadLocal = C0520nf.f3286b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0520nf.f3287a;
            String string = sb.toString();
            int i3 = AbstractC0686rx.f4174a;
            c0597pi.f3714c = AbstractC0649qx.m2188a(textPaint, string) ? 2 : 1;
        }
        return c0597pi.f3714c == 2;
    }

    /* JADX INFO: renamed from: x */
    public void m862x() {
        ((SparseIntArray) this.f1297b).clear();
    }

    /* JADX INFO: renamed from: y */
    public boolean m863y(View view) {
        s90 s90Var = (s90) this.f1298c;
        C0725sz c0725sz = (C0725sz) this.f1297b;
        int iM2388d = c0725sz.m2388d();
        int iM2387c = c0725sz.m2387c();
        int iM2386b = c0725sz.m2386b(view);
        int iM2385a = c0725sz.m2385a(view);
        s90Var.f4221b = iM2388d;
        s90Var.f4222c = iM2387c;
        s90Var.f4223d = iM2386b;
        s90Var.f4224e = iM2385a;
        s90Var.f4220a = 24579;
        return s90Var.m2326a();
    }

    /* JADX INFO: renamed from: z */
    public void mo864z(AttributeSet attributeSet, int i) {
        switch (this.f1296a) {
            case Base64.DEFAULT /* 0 */:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f1297b;
                C0658r5 c0658r5M2226y = C0658r5.m2226y(absSeekBar.getContext(), attributeSet, f1295d, i);
                Drawable drawableM2242n = c0658r5M2226y.m2242n(0);
                if (drawableM2242n != null) {
                    if (drawableM2242n instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM2242n;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM840L = m840L(animationDrawable.getFrame(i2), true);
                            drawableM840L.setLevel(10000);
                            animationDrawable2.addFrame(drawableM840L, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM2242n = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM2242n);
                }
                Drawable drawableM2242n2 = c0658r5M2226y.m2242n(1);
                if (drawableM2242n2 != null) {
                    absSeekBar.setProgressDrawable(m840L(drawableM2242n2, false));
                }
                c0658r5M2226y.m2252z();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f1297b).getContext().obtainStyledAttributes(attributeSet, AbstractC0205ez.f1685i, i, 0);
                try {
                    boolean z = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m839K(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public /* synthetic */ C0138d4(Object obj, int i, Object obj2) {
        this.f1296a = i;
        this.f1298c = obj;
        this.f1297b = obj2;
    }

    public /* synthetic */ C0138d4(Object obj, Object obj2, int i, boolean z) {
        this.f1296a = i;
        this.f1297b = obj;
        this.f1298c = obj2;
    }

    public C0138d4(AbsSeekBar absSeekBar) {
        this.f1296a = 0;
        this.f1297b = absSeekBar;
    }

    public C0138d4(EditText editText, int i) {
        this.f1296a = i;
        switch (i) {
            case 8:
                this.f1297b = editText;
                C0782ui c0782ui = new C0782ui(editText);
                this.f1298c = c0782ui;
                editText.addTextChangedListener(c0782ui);
                if (C0412ki.f2842b == null) {
                    synchronized (C0412ki.f2841a) {
                        try {
                            if (C0412ki.f2842b == null) {
                                C0412ki c0412ki = new C0412ki();
                                try {
                                    C0412ki.f2843c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0412ki.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C0412ki.f2842b = c0412ki;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C0412ki.f2842b);
                return;
            default:
                this.f1297b = editText;
                this.f1298c = new C0431l0(editText);
                return;
        }
    }

    public C0138d4(C0023am c0023am) {
        this.f1296a = 11;
        this.f1297b = new CopyOnWriteArrayList();
        this.f1298c = c0023am;
    }

    public C0138d4(Runnable runnable) {
        this.f1296a = 16;
        this.f1298c = new CopyOnWriteArrayList();
        new HashMap();
        this.f1297b = runnable;
    }

    public C0138d4(Context context) {
        this.f1296a = 5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0493mp.m1838L(context, com.ljx.wechatmod.R.attr.materialCalendarStyle, C0942yt.class.getCanonicalName()).data, AbstractC0168dz.f1449l);
        C0893xh.m2688h(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        C0893xh.m2688h(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C0893xh.m2688h(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C0893xh.m2688h(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM1315i = AbstractC0274gu.m1315i(context, typedArrayObtainStyledAttributes, 7);
        this.f1297b = C0893xh.m2688h(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        C0893xh.m2688h(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f1298c = C0893xh.m2688h(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListM1315i.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0138d4(C0402k8 c0402k8, C0893xh c0893xh, C0520nf c0520nf) {
        this.f1296a = 9;
        this.f1297b = c0402k8;
        this.f1298c = c0520nf;
    }

    public C0138d4(C0725sz c0725sz) {
        this.f1296a = 18;
        this.f1297b = c0725sz;
        s90 s90Var = new s90();
        s90Var.f4220a = 0;
        this.f1298c = s90Var;
    }

    public C0138d4(ArrayList arrayList, ArrayList arrayList2) {
        this.f1296a = 12;
        int size = arrayList.size();
        this.f1297b = new int[size];
        this.f1298c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f1297b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f1298c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0138d4(int i, int i2) {
        this.f1296a = 12;
        this.f1297b = new int[]{i, i2};
        this.f1298c = new float[]{0.0f, 1.0f};
    }

    public C0138d4(int i, int i2, int i3) {
        this.f1296a = 12;
        this.f1297b = new int[]{i, i2, i3};
        this.f1298c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0138d4(Animation animation) {
        this.f1296a = 10;
        this.f1297b = animation;
        this.f1298c = null;
    }

    public C0138d4(Animator animator) {
        this.f1296a = 10;
        this.f1297b = null;
        this.f1298c = animator;
    }

    public C0138d4(Matcher matcher, CharSequence charSequence) {
        this.f1296a = 15;
        AbstractC0493mp.m1857g("input", charSequence);
        this.f1297b = matcher;
    }

    public C0138d4(int i) {
        this.f1296a = i;
        switch (i) {
            case 19:
                this.f1297b = new b40();
                this.f1298c = new C0235fs();
                break;
            default:
                this.f1297b = new SparseIntArray();
                this.f1298c = new SparseIntArray();
                break;
        }
    }
}
