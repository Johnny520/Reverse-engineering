package p014H;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.emoji2.text.C0390e;
import androidx.emoji2.text.C0399n;
import androidx.emoji2.text.C0404s;
import androidx.emoji2.text.C0407v;
import androidx.fragment.app.AbstractComponentCallbacksC0434l;
import androidx.fragment.app.C0448z;
import com.p055lu.wxmask.p057ui.WebViewActivity;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p004C.C0066j;
import p006D.RunnableC0073b;
import p012G.C0137a;
import p040U0.AbstractC0307q;
import p061e.AbstractActivityC0533i;
import p061e.C0538n;
import p061e.LayoutInflaterFactory2C0545u;
import p066g.AbstractC0561a;
import p066g.C0566f;
import p068h.MenuC0578C;
import p068h.MenuC0594m;
import p075l.C0753k;
import p080o.RunnableC0775a;
import p085r.AbstractC0812d;
import p085r.AbstractC0813e;
import p093v.C1021f;
import p099y.AbstractC1048L;
import p099y.AbstractC1094z;
import p099y.C1054S;
import p100y0.InterfaceC1099e;

/* JADX INFO: renamed from: H.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0142a implements InterfaceC1099e {

    /* JADX INFO: renamed from: b */
    public Object f443b;

    /* JADX INFO: renamed from: c */
    public Object f444c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0142a(Object obj, Object obj2) {
        this.f444c = obj;
        this.f443b = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m316a(Editable editable, KeyEvent keyEvent, boolean z2) {
        C0407v[] c0407vArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0407vArr = (C0407v[]) editable.getSpans(selectionStart, selectionEnd, C0407v.class)) != null && c0407vArr.length > 0) {
                for (C0407v c0407v : c0407vArr) {
                    int spanStart = editable.getSpanStart(c0407v);
                    int spanEnd = editable.getSpanEnd(c0407v);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m317b(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m317b(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m318c(boolean z2) {
        C0448z c0448z = (C0448z) this.f444c;
        AbstractActivityC0533i abstractActivityC0533i = c0448z.f1443n.f1395e;
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0448z.f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m318c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m319d(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m319d(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m320e(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m320e(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m321f(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m321f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m322g(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m322g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public void m323h(boolean z2) {
        C0448z c0448z = (C0448z) this.f444c;
        AbstractActivityC0533i abstractActivityC0533i = c0448z.f1443n.f1395e;
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0448z.f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m323h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m324i(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m324i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p100y0.InterfaceC1099e
    /* JADX INFO: renamed from: j */
    public void mo139j(String str) {
        String str2 = (String) this.f443b;
        if ((str2 != null && !AbstractC0307q.m534d0(str2)) || str == null || AbstractC0307q.m534d0(str)) {
            return;
        }
        ((WebViewActivity) this.f444c).setTitle(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void m325k(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m325k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public void m326l(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m326l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m327m(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m327m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m328n(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m328n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public void m329o(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m329o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void m330p(boolean z2) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = ((C0448z) this.f444c).f1445p;
        if (abstractComponentCallbacksC0434l != null) {
            abstractComponentCallbacksC0434l.m842g().f1440k.m330p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f443b).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public boolean m331q(CharSequence charSequence, int i2, int i3, C0399n c0399n) {
        if (c0399n.f1188c == 0) {
            C0390e c0390e = (C0390e) this.f444c;
            C0137a c0137aM768b = c0399n.m768b();
            int iM303a = c0137aM768b.m303a(8);
            if (iM303a != 0) {
                ((ByteBuffer) c0137aM768b.f437d).getShort(iM303a + c0137aM768b.f434a);
            }
            c0390e.getClass();
            ThreadLocal threadLocal = C0390e.f1165b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = c0390e.f1166a;
            String string = sb.toString();
            int i4 = AbstractC0813e.f2716a;
            c0399n.f1188c = AbstractC0812d.m1481a(textPaint, string) ? 2 : 1;
        }
        return c0399n.f1188c == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void m332r(AbstractC0561a abstractC0561a) {
        C0404s c0404s = (C0404s) this.f443b;
        ((ActionMode.Callback) c0404s.f1209a).onDestroyActionMode(c0404s.m775a(abstractC0561a));
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = (LayoutInflaterFactory2C0545u) this.f444c;
        if (layoutInflaterFactory2C0545u.f1832q != null) {
            layoutInflaterFactory2C0545u.f1821f.getDecorView().removeCallbacks(layoutInflaterFactory2C0545u.f1833r);
        }
        if (layoutInflaterFactory2C0545u.f1831p != null) {
            C1054S c1054s = layoutInflaterFactory2C0545u.f1834s;
            if (c1054s != null) {
                c1054s.m2304b();
            }
            C1054S c1054sM2282a = AbstractC1048L.m2282a(layoutInflaterFactory2C0545u.f1831p);
            c1054sM2282a.m2303a(0.0f);
            layoutInflaterFactory2C0545u.f1834s = c1054sM2282a;
            c1054sM2282a.m2306d(new C0538n(2, this));
        }
        layoutInflaterFactory2C0545u.f1830o = null;
        ViewGroup viewGroup = layoutInflaterFactory2C0545u.f1836u;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        AbstractC1094z.m2366c(viewGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public boolean m333s(AbstractC0561a abstractC0561a, MenuC0594m menuC0594m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C0545u) this.f444c).f1836u;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        AbstractC1094z.m2366c(viewGroup);
        C0404s c0404s = (C0404s) this.f443b;
        C0566f c0566fM775a = c0404s.m775a(abstractC0561a);
        C0753k c0753k = (C0753k) c0404s.f1212d;
        Menu menuC0578C = (Menu) c0753k.getOrDefault(menuC0594m, null);
        if (menuC0578C == null) {
            menuC0578C = new MenuC0578C((Context) c0404s.f1210b, menuC0594m);
            c0753k.put(menuC0594m, menuC0578C);
        }
        return ((ActionMode.Callback) c0404s.f1209a).onPrepareActionMode(c0566fM775a, menuC0578C);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public void m334t(C1021f c1021f) {
        int i2 = c1021f.f3627b;
        Handler handler = (Handler) this.f444c;
        C0066j c0066j = (C0066j) this.f443b;
        if (i2 == 0) {
            handler.post(new RunnableC0775a(c0066j, c1021f.f3626a, 3));
        } else {
            handler.post(new RunnableC0073b(c0066j, i2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0142a(Object obj, Object obj2, boolean z2) {
        this.f443b = obj;
        this.f444c = obj2;
    }

    public C0142a(Runnable runnable) {
        this.f444c = new CopyOnWriteArrayList();
        new HashMap();
        this.f443b = runnable;
    }

    public C0142a(Animation animation) {
        this.f443b = animation;
        this.f444c = null;
    }
}
