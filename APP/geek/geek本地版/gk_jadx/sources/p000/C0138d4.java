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
public class C0138d4 implements InterfaceC0649qw {

    /* JADX INFO: renamed from: d */
    public static final int[] f1361d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1362a;

    /* JADX INFO: renamed from: b */
    public Object f1363b;

    /* JADX INFO: renamed from: c */
    public Object f1364c;

    public /* synthetic */ C0138d4(int i, boolean z) {
        this.f1362a = i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m868b(Editable editable, KeyEvent keyEvent, boolean z) {
        g80[] g80VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (g80VarArr = (g80[]) editable.getSpans(selectionStart, selectionEnd, g80.class)) != null && g80VarArr.length > 0) {
                for (g80 g80Var : g80VarArr) {
                    int spanStart = editable.getSpanStart(g80Var);
                    int spanEnd = editable.getSpanEnd(g80Var);
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
    public static int m869v(int i, int i2) {
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
    public void m870A(int i, int i2) {
        int[] iArr = (int[]) this.f1363b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m897r(i3);
        int[] iArr2 = (int[]) this.f1363b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.f1363b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.f1364c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l40 l40Var = (l40) ((ArrayList) this.f1364c).get(size);
            int i4 = l40Var.f3009a;
            if (i4 >= i) {
                l40Var.f3009a = i4 + i2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public void m871B(int i, int i2) {
        int[] iArr = (int[]) this.f1363b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m897r(i3);
        int[] iArr2 = (int[]) this.f1363b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.f1363b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f1364c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            l40 l40Var = (l40) ((ArrayList) this.f1364c).get(size);
            int i4 = l40Var.f3009a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.f1364c).remove(size);
                } else {
                    l40Var.f3009a = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public C0375ji m872C(InputConnection inputConnection, EditorInfo editorInfo) {
        C0431l0 c0431l0 = (C0431l0) this.f1364c;
        if (inputConnection == null) {
            c0431l0.getClass();
            inputConnection = null;
        } else {
            C0138d4 c0138d4 = (C0138d4) c0431l0.f2980b;
            c0138d4.getClass();
            if (!(inputConnection instanceof C0375ji)) {
                inputConnection = new C0375ji((EditText) c0138d4.f1363b, inputConnection, editorInfo);
            }
        }
        return (C0375ji) inputConnection;
    }

    /* JADX INFO: renamed from: D */
    public void m873D(AbstractC0506n1 abstractC0506n1) {
        C0009a8 c0009a8 = (C0009a8) this.f1363b;
        ((ActionMode.Callback) c0009a8.f64a).onDestroyActionMode(c0009a8.m26b(abstractC0506n1));
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = (LayoutInflaterFactory2C0657r3) this.f1364c;
        if (layoutInflaterFactory2C0657r3.f4189w != null) {
            layoutInflaterFactory2C0657r3.f4178l.getDecorView().removeCallbacks(layoutInflaterFactory2C0657r3.f4190x);
        }
        if (layoutInflaterFactory2C0657r3.f4188v != null) {
            wa0 wa0Var = layoutInflaterFactory2C0657r3.f4191y;
            if (wa0Var != null) {
                wa0Var.m2554b();
            }
            wa0 wa0VarM1564a = ja0.m1564a(layoutInflaterFactory2C0657r3.f4188v);
            wa0VarM1564a.m2553a(0.0f);
            layoutInflaterFactory2C0657r3.f4191y = wa0VarM1564a;
            wa0VarM1564a.m2556d(new C0284h3(2, this));
        }
        layoutInflaterFactory2C0657r3.f4187u = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0657r3.f4143A;
        WeakHashMap weakHashMap = ja0.f2600a;
        w90.m2552c(viewGroup);
        layoutInflaterFactory2C0657r3.m2201I();
    }

    /* JADX INFO: renamed from: E */
    public boolean m874E(AbstractC0506n1 abstractC0506n1, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0657r3) this.f1364c).f4143A;
        WeakHashMap weakHashMap = ja0.f2600a;
        w90.m2552c(viewGroup);
        C0009a8 c0009a8 = (C0009a8) this.f1363b;
        ActionMode.Callback callback = (ActionMode.Callback) c0009a8.f64a;
        h50 h50VarM26b = c0009a8.m26b(abstractC0506n1);
        u30 u30Var = (u30) c0009a8.f67d;
        Menu menuC0275gv = (Menu) u30Var.getOrDefault(menu, null);
        if (menuC0275gv == null) {
            menuC0275gv = new MenuC0275gv((Context) c0009a8.f65b, (MenuC0424ku) menu);
            u30Var.put(menu, menuC0275gv);
        }
        return callback.onPrepareActionMode(h50VarM26b, menuC0275gv);
    }

    /* JADX INFO: renamed from: F */
    public void m875F(C0970zk c0970zk) {
        Handler handler = (Handler) this.f1364c;
        C0431l0 c0431l0 = (C0431l0) this.f1363b;
        int i = c0970zk.f5563b;
        if (i == 0) {
            handler.post(new RunnableC0282h1(c0431l0, c0970zk.f5562a, 4, false));
        } else {
            handler.post(new RunnableC0178e8(c0431l0, i, 0));
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
    public void m876G(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0138d4.m876G(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* JADX INFO: renamed from: H */
    public C0463lw m877H(b00 b00Var, int i) {
        oa0 oa0Var;
        C0463lw c0463lw;
        u30 u30Var = (u30) this.f1363b;
        int iM2413e = u30Var.m2413e(b00Var);
        if (iM2413e >= 0 && (oa0Var = (oa0) u30Var.m2418j(iM2413e)) != null) {
            int i2 = oa0Var.f3519a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                oa0Var.f3519a = i3;
                if (i == 4) {
                    c0463lw = oa0Var.f3520b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0463lw = oa0Var.f3521c;
                }
                if ((i3 & 12) == 0) {
                    u30Var.m2417i(iM2413e);
                    oa0Var.f3519a = 0;
                    oa0Var.f3520b = null;
                    oa0Var.f3521c = null;
                    oa0.f3518d.mo2340c(oa0Var);
                }
                return c0463lw;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public void m878I(b00 b00Var) {
        oa0 oa0Var = (oa0) ((u30) this.f1363b).getOrDefault(b00Var, null);
        if (oa0Var == null) {
            return;
        }
        oa0Var.f3519a &= -2;
    }

    /* JADX INFO: renamed from: J */
    public void m879J(b00 b00Var) {
        C0079bs c0079bs = (C0079bs) this.f1364c;
        int iM568e = c0079bs.m568e() - 1;
        while (true) {
            if (iM568e < 0) {
                break;
            }
            if (b00Var == c0079bs.m569f(iM568e)) {
                Object[] objArr = c0079bs.f826c;
                Object obj = objArr[iM568e];
                Object obj2 = C0079bs.f823e;
                if (obj != obj2) {
                    objArr[iM568e] = obj2;
                    c0079bs.f824a = true;
                }
            } else {
                iM568e--;
            }
        }
        oa0 oa0Var = (oa0) ((u30) this.f1363b).remove(b00Var);
        if (oa0Var != null) {
            oa0Var.f3519a = 0;
            oa0Var.f3520b = null;
            oa0Var.f3521c = null;
            oa0.f3518d.mo2340c(oa0Var);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m880K(boolean z) {
        C0709si c0709si = (C0709si) ((C0138d4) ((C0431l0) this.f1364c).f2980b).f1364c;
        if (c0709si.f4439c != z) {
            if (c0709si.f4438b != null) {
                C0188ei c0188eiM1029a = C0188ei.m1029a();
                C0672ri c0672ri = c0709si.f4438b;
                c0188eiM1029a.getClass();
                AbstractC0979zt.m2825f("initCallback cannot be null", c0672ri);
                ReentrantReadWriteLock reentrantReadWriteLock = c0188eiM1029a.f1778a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    c0188eiM1029a.f1779b.remove(c0672ri);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0709si.f4439c = z;
            if (z) {
                C0709si.m2331a(c0709si.f4437a, C0188ei.m1029a().m1030b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public Drawable m881L(Drawable drawable, boolean z) {
        if (drawable instanceof ad0) {
            ((bd0) ((ad0) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m881L(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
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
                if (((Bitmap) this.f1364c) == null) {
                    this.f1364c = bitmap;
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
    public void m882a(b00 b00Var, C0463lw c0463lw) {
        u30 u30Var = (u30) this.f1363b;
        oa0 oa0VarM2004a = (oa0) u30Var.getOrDefault(b00Var, null);
        if (oa0VarM2004a == null) {
            oa0VarM2004a = oa0.m2004a();
            u30Var.put(b00Var, oa0VarM2004a);
        }
        oa0VarM2004a.f3521c = c0463lw;
        oa0VarM2004a.f3519a |= 8;
    }

    /* JADX INFO: renamed from: c */
    public void m883c(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m883c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    @Override // p000.InterfaceC0649qw
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p000.wc0 mo474d(android.view.View r17, p000.wc0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f1363b
            r7 r3 = (p000.C0661r7) r3
            java.lang.Object r4 = r0.f1364c
            ab0 r4 = (p000.ab0) r4
            int r5 = r4.f102a
            int r6 = r4.f103b
            int r4 = r4.f104c
            tc0 r7 = r2.f4955a
            r8 = 7
            ep r8 = r7.mo1932f(r8)
            r9 = 32
            ep r7 = r7.mo1932f(r9)
            java.lang.Object r9 = r3.f4221b
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            int r10 = r8.f1829b
            int r11 = r8.f1830c
            int r12 = r8.f1828a
            r9.f1065w = r10
            boolean r10 = p000.AbstractC0273gt.m1311n(r1)
            int r13 = r1.getPaddingBottom()
            int r14 = r1.getPaddingLeft()
            int r15 = r1.getPaddingRight()
            boolean r0 = r9.f1057o
            if (r0 == 0) goto L48
            int r13 = r2.m2564a()
            r9.f1064v = r13
            int r13 = r13 + r4
        L48:
            boolean r4 = r9.f1058p
            if (r4 == 0) goto L53
            if (r10 == 0) goto L50
            r4 = r6
            goto L51
        L50:
            r4 = r5
        L51:
            int r14 = r4 + r12
        L53:
            boolean r4 = r9.f1059q
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
            boolean r5 = r9.f1061s
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
            boolean r10 = r9.f1062t
            if (r10 == 0) goto L7c
            int r10 = r4.rightMargin
            if (r10 == r11) goto L7c
            r4.rightMargin = r11
            r5 = r6
        L7c:
            boolean r10 = r9.f1063u
            if (r10 == 0) goto L89
            int r10 = r4.topMargin
            int r8 = r8.f1829b
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
            boolean r1 = r3.f4220a
            if (r1 == 0) goto L9e
            int r3 = r7.f1831d
            r9.f1055m = r3
        L9e:
            if (r0 != 0) goto La4
            if (r1 == 0) goto La3
            goto La4
        La3:
            return r2
        La4:
            r9.m723I()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0138d4.mo474d(android.view.View, wc0):wc0");
    }

    /* JADX INFO: renamed from: e */
    public void m884e(boolean z) {
        C0934yl c0934yl = (C0934yl) this.f1364c;
        FragmentActivity fragmentActivity = c0934yl.f5365n.f3428D;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0934yl.f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m884e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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

    /* JADX INFO: renamed from: f */
    public void m885f(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m885f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m886g(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m886g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m887h(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m887h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m888i(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m888i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m889j(boolean z) {
        C0934yl c0934yl = (C0934yl) this.f1364c;
        FragmentActivity fragmentActivity = c0934yl.f5365n.f3428D;
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = c0934yl.f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m889j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m890k(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m890k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m891l(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m891l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m892m(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m892m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m893n(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m893n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m894o(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m894o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m895p(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m895p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m896q(boolean z) {
        AbstractComponentCallbacksC0489ml abstractComponentCallbacksC0489ml = ((C0934yl) this.f1364c).f5367p;
        if (abstractComponentCallbacksC0489ml != null) {
            abstractComponentCallbacksC0489ml.m1837j().f5362k.m896q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f1363b).iterator();
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
    public void m897r(int i) {
        int[] iArr = (int[]) this.f1363b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f1363b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f1363b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f1363b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: s */
    public View m898s(int i, int i2, int i3, int i4) {
        View viewM1978u;
        n90 n90Var = (n90) this.f1364c;
        C0466lz c0466lz = (C0466lz) this.f1363b;
        int iM1771d = c0466lz.m1771d();
        int iM1770c = c0466lz.m1770c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (c0466lz.f3119a) {
                case Base64.DEFAULT /* 0 */:
                    viewM1978u = c0466lz.f3120b.m1978u(i);
                    break;
                default:
                    viewM1978u = c0466lz.f3120b.m1978u(i);
                    break;
            }
            int iM1769b = c0466lz.m1769b(viewM1978u);
            int iM1768a = c0466lz.m1768a(viewM1978u);
            n90Var.f3359b = iM1771d;
            n90Var.f3360c = iM1770c;
            n90Var.f3361d = iM1769b;
            n90Var.f3362e = iM1768a;
            if (i3 != 0) {
                n90Var.f3358a = i3;
                if (n90Var.m1923a()) {
                    return viewM1978u;
                }
            }
            if (i4 != 0) {
                n90Var.f3358a = i4;
                if (n90Var.m1923a()) {
                    view = viewM1978u;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: renamed from: t */
    public List m899t() {
        if (((C0236ft) this.f1364c) == null) {
            this.f1364c = new C0236ft(this);
        }
        C0236ft c0236ft = (C0236ft) this.f1364c;
        AbstractC0346ip.m1500l(c0236ft);
        return c0236ft;
    }

    public String toString() {
        switch (this.f1362a) {
            case 21:
                return "Bounds{lower=" + ((C0195ep) this.f1363b) + " upper=" + ((C0195ep) this.f1364c) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public KeyListener m900u(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C0138d4) ((C0431l0) this.f1364c).f2980b).getClass();
        if (keyListener instanceof C0486mi) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new C0486mi(keyListener);
    }

    /* JADX INFO: renamed from: w */
    public boolean m901w(CharSequence charSequence, int i, int i2, C0523ni c0523ni) {
        if (c0523ni.f3417c == 0) {
            InterfaceC0069bi interfaceC0069bi = (InterfaceC0069bi) this.f1364c;
            C0833vv c0833vvM1946b = c0523ni.m1946b();
            int iM2359a = c0833vvM1946b.m2359a(8);
            if (iM2359a != 0) {
                ((ByteBuffer) c0833vvM1946b.f4513d).getShort(iM2359a + c0833vvM1946b.f4510a);
            }
            C0483mf c0483mf = (C0483mf) interfaceC0069bi;
            c0483mf.getClass();
            ThreadLocal threadLocal = C0483mf.f3205b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0483mf.f3206a;
            String string = sb.toString();
            int i3 = AbstractC0390jx.f2676a;
            c0523ni.f3417c = AbstractC0353ix.m1526a(textPaint, string) ? 2 : 1;
        }
        return c0523ni.f3417c == 2;
    }

    /* JADX INFO: renamed from: x */
    public void m902x() {
        ((SparseIntArray) this.f1363b).clear();
    }

    /* JADX INFO: renamed from: y */
    public boolean m903y(View view) {
        n90 n90Var = (n90) this.f1364c;
        C0466lz c0466lz = (C0466lz) this.f1363b;
        int iM1771d = c0466lz.m1771d();
        int iM1770c = c0466lz.m1770c();
        int iM1769b = c0466lz.m1769b(view);
        int iM1768a = c0466lz.m1768a(view);
        n90Var.f3359b = iM1771d;
        n90Var.f3360c = iM1770c;
        n90Var.f3361d = iM1769b;
        n90Var.f3362e = iM1768a;
        n90Var.f3358a = 24579;
        return n90Var.m1923a();
    }

    /* JADX INFO: renamed from: z */
    public void mo904z(AttributeSet attributeSet, int i) {
        switch (this.f1362a) {
            case Base64.DEFAULT /* 0 */:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f1363b;
                C0659r5 c0659r5M2219y = C0659r5.m2219y(absSeekBar.getContext(), attributeSet, f1361d, i);
                Drawable drawableM2235n = c0659r5M2219y.m2235n(0);
                if (drawableM2235n != null) {
                    if (drawableM2235n instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableM2235n;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable drawableM881L = m881L(animationDrawable.getFrame(i2), true);
                            drawableM881L.setLevel(10000);
                            animationDrawable2.addFrame(drawableM881L, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableM2235n = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableM2235n);
                }
                Drawable drawableM2235n2 = c0659r5M2219y.m2235n(1);
                if (drawableM2235n2 != null) {
                    absSeekBar.setProgressDrawable(m881L(drawableM2235n2, false));
                }
                c0659r5M2219y.m2245z();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f1363b).getContext().obtainStyledAttributes(attributeSet, AbstractC0910xy.f5225i, i, 0);
                try {
                    boolean z = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    m880K(z);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public /* synthetic */ C0138d4(Object obj, int i, Object obj2) {
        this.f1362a = i;
        this.f1364c = obj;
        this.f1363b = obj2;
    }

    public /* synthetic */ C0138d4(Object obj, Object obj2, int i, boolean z) {
        this.f1362a = i;
        this.f1363b = obj;
        this.f1364c = obj2;
    }

    public C0138d4(AbsSeekBar absSeekBar) {
        this.f1362a = 0;
        this.f1363b = absSeekBar;
    }

    public C0138d4(EditText editText, int i) {
        this.f1362a = i;
        switch (i) {
            case 8:
                this.f1363b = editText;
                C0709si c0709si = new C0709si(editText);
                this.f1364c = c0709si;
                editText.addTextChangedListener(c0709si);
                if (C0335ii.f2434b == null) {
                    synchronized (C0335ii.f2433a) {
                        try {
                            if (C0335ii.f2434b == null) {
                                C0335ii c0335ii = new C0335ii();
                                try {
                                    C0335ii.f2435c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0335ii.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                C0335ii.f2434b = c0335ii;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(C0335ii.f2434b);
                return;
            default:
                this.f1363b = editText;
                this.f1364c = new C0431l0(editText);
                return;
        }
    }

    public C0138d4(C0934yl c0934yl) {
        this.f1362a = 11;
        this.f1363b = new CopyOnWriteArrayList();
        this.f1364c = c0934yl;
    }

    public C0138d4(Runnable runnable) {
        this.f1362a = 16;
        this.f1364c = new CopyOnWriteArrayList();
        new HashMap();
        this.f1363b = runnable;
    }

    public C0138d4(Context context) {
        this.f1362a = 5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0273gt.m1297A(context, com.ljx.wechatmod.R.attr.materialCalendarStyle, C0794ut.class.getCanonicalName()).data, AbstractC0873wy.f5053l);
        C0819vh.m2513f(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        C0819vh.m2513f(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        C0819vh.m2513f(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        C0819vh.m2513f(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListM816n = AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 7);
        this.f1363b = C0819vh.m2513f(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        C0819vh.m2513f(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f1364c = C0819vh.m2513f(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListM816n.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0138d4(C0009a8 c0009a8, C0819vh c0819vh, C0483mf c0483mf) {
        this.f1362a = 9;
        this.f1363b = c0009a8;
        this.f1364c = c0483mf;
    }

    public C0138d4(C0466lz c0466lz) {
        this.f1362a = 18;
        this.f1363b = c0466lz;
        n90 n90Var = new n90();
        n90Var.f3358a = 0;
        this.f1364c = n90Var;
    }

    public C0138d4(ArrayList arrayList, ArrayList arrayList2) {
        this.f1362a = 12;
        int size = arrayList.size();
        this.f1363b = new int[size];
        this.f1364c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f1363b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f1364c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0138d4(int i, int i2) {
        this.f1362a = 12;
        this.f1363b = new int[]{i, i2};
        this.f1364c = new float[]{0.0f, 1.0f};
    }

    public C0138d4(int i, int i2, int i3) {
        this.f1362a = 12;
        this.f1363b = new int[]{i, i2, i3};
        this.f1364c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0138d4(Animation animation) {
        this.f1362a = 10;
        this.f1363b = animation;
        this.f1364c = null;
    }

    public C0138d4(Animator animator) {
        this.f1362a = 10;
        this.f1363b = null;
        this.f1364c = animator;
    }

    public C0138d4(Matcher matcher, CharSequence charSequence) {
        this.f1362a = 15;
        AbstractC0346ip.m1503o("input", charSequence);
        this.f1363b = matcher;
    }

    public C0138d4(int i) {
        this.f1362a = i;
        switch (i) {
            case 19:
                this.f1363b = new u30();
                this.f1364c = new C0079bs();
                break;
            default:
                this.f1363b = new SparseIntArray();
                this.f1364c = new SparseIntArray();
                break;
        }
    }
}
