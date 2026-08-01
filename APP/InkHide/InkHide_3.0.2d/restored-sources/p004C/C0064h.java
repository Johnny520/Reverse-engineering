package p004C;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC0434l;
import androidx.fragment.app.C0411B;
import androidx.fragment.app.C0415F;
import androidx.fragment.app.C0428f;
import androidx.fragment.app.C0448z;
import androidx.lifecycle.AbstractC0455G;
import androidx.lifecycle.AbstractC0460L;
import androidx.lifecycle.C0458J;
import androidx.lifecycle.C0461M;
import androidx.lifecycle.C0464P;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.InterfaceC0463O;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.RunnableC0040m;
import p018J.AbstractC0157b;
import p018J.C0156a;
import p018J.C0158c;
import p024M.C0190d;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p069i.C0651W;
import p069i.C0719u;
import p075l.C0748f;
import p083q.AbstractC0788b;
import p083q.AbstractC0799m;
import p083q.InterfaceC0791e;
import p085r.AbstractC0814f;
import p091u.InterfaceC1012b;

/* JADX INFO: renamed from: C.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0064h implements InterfaceC0065i, InterfaceC1012b {

    /* JADX INFO: renamed from: e */
    public static C0064h f307e;

    /* JADX INFO: renamed from: b */
    public Object f308b;

    /* JADX INFO: renamed from: c */
    public Object f309c;

    /* JADX INFO: renamed from: d */
    public Object f310d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0064h(Object obj, Object obj2, Object obj3) {
        this.f308b = obj;
        this.f309c = obj2;
        this.f310d = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static C0064h m114t(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new C0064h(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m115u() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: a */
    public ClipDescription mo109a() {
        return (ClipDescription) this.f310d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: c */
    public Uri mo111c() {
        return (Uri) this.f309c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: d */
    public Object mo112d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: e */
    public Uri mo113e() {
        return (Uri) this.f308b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m116f(AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l) {
        if (((ArrayList) this.f308b).contains(abstractComponentCallbacksC0434l)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0434l);
        }
        synchronized (((ArrayList) this.f308b)) {
            ((ArrayList) this.f308b).add(abstractComponentCallbacksC0434l);
        }
        abstractComponentCallbacksC0434l.f1375l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public AbstractComponentCallbacksC0434l m117g(String str) {
        C0415F c0415f = (C0415F) ((HashMap) this.f309c).get(str);
        if (c0415f != null) {
            return c0415f.f1254c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public AbstractComponentCallbacksC0434l m118h(String str) {
        for (C0415F c0415f : ((HashMap) this.f309c).values()) {
            if (c0415f != null) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM118h = c0415f.f1254c;
                if (!str.equals(abstractComponentCallbacksC0434lM118h.f1369f)) {
                    abstractComponentCallbacksC0434lM118h = abstractComponentCallbacksC0434lM118h.f1384u.f1432c.m118h(str);
                }
                if (abstractComponentCallbacksC0434lM118h != null) {
                    return abstractComponentCallbacksC0434lM118h;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public AbstractC0460L m119i(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return m120j(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public AbstractC0460L m120j(Class cls, String str) {
        AbstractC0460L abstractC0460LMo313e;
        AbstractC0223g.m418e(str, "key");
        C0464P c0464p = (C0464P) this.f308b;
        c0464p.getClass();
        LinkedHashMap linkedHashMap = c0464p.f1501a;
        AbstractC0460L abstractC0460L = (AbstractC0460L) linkedHashMap.get(str);
        boolean zIsInstance = cls.isInstance(abstractC0460L);
        InterfaceC0463O interfaceC0463O = (InterfaceC0463O) this.f309c;
        if (!zIsInstance) {
            C0158c c0158c = new C0158c((AbstractC0157b) this.f310d);
            ((LinkedHashMap) c0158c.f470a).put(C0461M.f1497c, str);
            try {
                abstractC0460LMo313e = interfaceC0463O.mo137h(cls, c0158c);
            } catch (AbstractMethodError unused) {
                abstractC0460LMo313e = interfaceC0463O.mo313e(cls);
            }
            AbstractC0223g.m418e(abstractC0460LMo313e, "viewModel");
            AbstractC0460L abstractC0460L2 = (AbstractC0460L) linkedHashMap.put(str, abstractC0460LMo313e);
            if (abstractC0460L2 != null) {
                abstractC0460L2.mo339b();
            }
            return abstractC0460LMo313e;
        }
        C0458J c0458j = interfaceC0463O instanceof C0458J ? (C0458J) interfaceC0463O : null;
        if (c0458j != null) {
            AbstractC0223g.m415b(abstractC0460L);
            C0486u c0486u = c0458j.f1487e;
            if (c0486u != null) {
                C0190d c0190d = c0458j.f1488f;
                AbstractC0223g.m415b(c0190d);
                AbstractC0455G.m909a(abstractC0460L, c0190d, c0486u);
            }
        }
        AbstractC0223g.m416c(abstractC0460L, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return abstractC0460L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public ArrayList m121k() {
        ArrayList arrayList = new ArrayList();
        for (C0415F c0415f : ((HashMap) this.f309c).values()) {
            if (c0415f != null) {
                arrayList.add(c0415f);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public ColorStateList m122l(int i2) {
        int resourceId;
        ColorStateList colorStateListM990w;
        TypedArray typedArray = (TypedArray) this.f309c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM990w = AbstractC0503h.m990w((Context) this.f308b, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM990w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public Drawable m123m(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f309c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) ? typedArray.getDrawable(i2) : AbstractC0503h.m992y((Context) this.f308b, resourceId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public Drawable m124n(int i2) {
        int resourceId;
        Drawable drawableM1255d;
        if (!((TypedArray) this.f309c).hasValue(i2) || (resourceId = ((TypedArray) this.f309c).getResourceId(i2, 0)) == 0) {
            return null;
        }
        C0719u c0719uM1367a = C0719u.m1367a();
        Context context = (Context) this.f308b;
        synchronized (c0719uM1367a) {
            drawableM1255d = c0719uM1367a.f2439a.m1255d(context, resourceId, true);
        }
        return drawableM1255d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p091u.InterfaceC1012b
    /* JADX INFO: renamed from: o */
    public void mo125o() {
        View view = (View) this.f308b;
        view.clearAnimation();
        ((ViewGroup) this.f309c).endViewTransition(view);
        ((C0428f) this.f310d).m826d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public Typeface m126p(int i2, int i3, C0651W c0651w) {
        C0651W c0651w2;
        XmlPullParserException xmlPullParserException;
        IOException iOException;
        int resourceId = ((TypedArray) this.f309c).getResourceId(i2, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.f310d) == null) {
                this.f310d = new TypedValue();
            }
            TypedValue typedValue = (TypedValue) this.f310d;
            ThreadLocal threadLocal = AbstractC0799m.f2654a;
            Context context = (Context) this.f308b;
            if (!context.isRestricted()) {
                Resources resources = context.getResources();
                resources.getValue(resourceId, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence == null) {
                    throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(resourceId) + "\" (" + Integer.toHexString(resourceId) + ") is not a Font: " + typedValue);
                }
                String string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    c0651w.m1266a();
                    return null;
                }
                int i4 = typedValue.assetCookie;
                C0748f c0748f = AbstractC0814f.f2718b;
                Typeface typeface = (Typeface) c0748f.m1410a(AbstractC0814f.m1483b(resources, resourceId, string, i4, i3));
                if (typeface != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0040m(c0651w, typeface, 3));
                    return typeface;
                }
                try {
                } catch (IOException e2) {
                    e = e2;
                    c0651w2 = c0651w;
                } catch (XmlPullParserException e3) {
                    e = e3;
                    c0651w2 = c0651w;
                }
                try {
                    if (!string.toLowerCase().endsWith(".xml")) {
                        int i5 = typedValue.assetCookie;
                        Typeface typefaceMo1004o = AbstractC0814f.f2717a.mo1004o(context, resources, resourceId, string, i3);
                        if (typefaceMo1004o != null) {
                            c0748f.m1411b(AbstractC0814f.m1483b(resources, resourceId, string, i5, i3), typefaceMo1004o);
                        }
                        if (typefaceMo1004o != null) {
                            new Handler(Looper.getMainLooper()).post(new RunnableC0040m(c0651w, typefaceMo1004o, 3));
                        } else {
                            c0651w.m1266a();
                        }
                        return typefaceMo1004o;
                    }
                    InterfaceC0791e interfaceC0791eM1459c = AbstractC0788b.m1459c(resources.getXml(resourceId), resources);
                    if (interfaceC0791eM1459c != null) {
                        return AbstractC0814f.m1482a(context, interfaceC0791eM1459c, resources, resourceId, string, typedValue.assetCookie, i3, c0651w);
                    }
                    try {
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        c0651w.m1266a();
                        return null;
                    } catch (IOException e4) {
                        iOException = e4;
                        c0651w2 = c0651w;
                    } catch (XmlPullParserException e5) {
                        xmlPullParserException = e5;
                        c0651w2 = c0651w;
                        Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                        c0651w2.m1266a();
                        return null;
                    }
                } catch (IOException e6) {
                    e = e6;
                    iOException = e;
                } catch (XmlPullParserException e7) {
                    e = e7;
                    xmlPullParserException = e;
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), xmlPullParserException);
                    c0651w2.m1266a();
                    return null;
                }
                iOException = e;
                Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), iOException);
                c0651w2.m1266a();
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public List m127q() {
        ArrayList arrayList;
        if (((ArrayList) this.f308b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f308b)) {
            arrayList = new ArrayList((ArrayList) this.f308b);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void m128r(C0415F c0415f) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0415f.f1254c;
        String str = abstractComponentCallbacksC0434l.f1369f;
        HashMap map = (HashMap) this.f309c;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0434l.f1369f, c0415f);
        if (C0448z.m856E(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0434l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void m129s(C0415F c0415f) {
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = c0415f.f1254c;
        if (abstractComponentCallbacksC0434l.f1349B) {
            ((C0411B) this.f310d).m784c(abstractComponentCallbacksC0434l);
        }
        if (((C0415F) ((HashMap) this.f309c).put(abstractComponentCallbacksC0434l.f1369f, null)) != null && C0448z.m856E(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0434l);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public void m130v() {
        ((TypedArray) this.f309c).recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0064h(C0464P c0464p, InterfaceC0463O interfaceC0463O, AbstractC0157b abstractC0157b) {
        AbstractC0223g.m418e(c0464p, "store");
        AbstractC0223g.m418e(interfaceC0463O, "factory");
        AbstractC0223g.m418e(abstractC0157b, "defaultCreationExtras");
        this.f308b = c0464p;
        this.f309c = interfaceC0463O;
        this.f310d = abstractC0157b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0064h(C0464P c0464p, InterfaceC0463O interfaceC0463O) {
        this(c0464p, interfaceC0463O, (AbstractC0157b) C0156a.f469b);
        AbstractC0223g.m418e(c0464p, "store");
    }

    public C0064h(Context context, TypedArray typedArray) {
        this.f308b = context;
        this.f309c = typedArray;
    }

    @Override // p004C.InterfaceC0065i
    /* JADX INFO: renamed from: b */
    public void mo110b() {
    }
}
