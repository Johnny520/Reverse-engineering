package p024M;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.C0435m;
import androidx.lifecycle.C0475j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import p004C.C0064h;
import p006D.AbstractC0075d;
import p006D.AbstractC0076e;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p069i.AbstractC0705p0;
import p069i.C0713s;
import p073k.C0736b;
import p073k.C0737c;
import p073k.C0740f;
import p087s.AbstractC0962a;
import p099y.AbstractC1048L;

/* JADX INFO: renamed from: M.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0190d {

    /* JADX INFO: renamed from: a */
    public boolean f538a;

    /* JADX INFO: renamed from: b */
    public boolean f539b;

    /* JADX INFO: renamed from: c */
    public boolean f540c;

    /* JADX INFO: renamed from: d */
    public final Object f541d;

    /* JADX INFO: renamed from: e */
    public Parcelable f542e;

    /* JADX INFO: renamed from: f */
    public Object f543f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0190d(TextView textView) {
        this.f542e = null;
        this.f543f = null;
        this.f538a = false;
        this.f539b = false;
        this.f541d = textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m393a() {
        CompoundButton compoundButton = (CompoundButton) this.f541d;
        Drawable drawableM159a = AbstractC0076e.m159a(compoundButton);
        if (drawableM159a != null) {
            if (this.f538a || this.f539b) {
                Drawable drawableMutate = drawableM159a.mutate();
                if (this.f538a) {
                    AbstractC0962a.m2143h(drawableMutate, (ColorStateList) this.f542e);
                }
                if (this.f539b) {
                    AbstractC0962a.m2144i(drawableMutate, (PorterDuff.Mode) this.f543f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m394b() {
        C0713s c0713s = (C0713s) this.f541d;
        Drawable checkMarkDrawable = c0713s.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f538a || this.f539b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f538a) {
                    AbstractC0962a.m2143h(drawableMutate, (ColorStateList) this.f542e);
                }
                if (this.f539b) {
                    AbstractC0962a.m2144i(drawableMutate, (PorterDuff.Mode) this.f543f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c0713s.getDrawableState());
                }
                c0713s.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public Bundle m395c(String str) {
        if (!this.f539b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f542e;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f542e;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f542e;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.f542e = null;
        return bundle2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public InterfaceC0189c m396d() {
        String str;
        InterfaceC0189c interfaceC0189c;
        Iterator it = ((C0740f) this.f541d).iterator();
        do {
            C0736b c0736b = (C0736b) it;
            if (!c0736b.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c0736b.next();
            AbstractC0223g.m417d(entry, "components");
            str = (String) entry.getKey();
            interfaceC0189c = (InterfaceC0189c) entry.getValue();
        } while (!AbstractC0223g.m414a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0189c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m397e(AttributeSet attributeSet, int i2) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f541d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC0515a.f1649m;
        C0064h c0064hM114t = C0064h.m114t(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) c0064hM114t.f309c;
        AbstractC1048L.m2289h(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) c0064hM114t.f309c, i2);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(AbstractC0503h.m992y(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(AbstractC0503h.m992y(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(AbstractC0503h.m992y(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                AbstractC0075d.m157c(compoundButton, c0064hM114t.m122l(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0075d.m158d(compoundButton, AbstractC0705p0.m1337b(typedArray.getInt(3, -1), null));
            }
            c0064hM114t.m130v();
        } catch (Throwable th) {
            c0064hM114t.m130v();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m398f(String str, InterfaceC0189c interfaceC0189c) {
        Object obj;
        AbstractC0223g.m418e(interfaceC0189c, "provider");
        C0740f c0740f = (C0740f) this.f541d;
        C0737c c0737cMo1389a = c0740f.mo1389a(str);
        if (c0737cMo1389a != null) {
            obj = c0737cMo1389a.f2495b;
        } else {
            C0737c c0737c = new C0737c(str, interfaceC0189c);
            c0740f.f2504d++;
            C0737c c0737c2 = c0740f.f2502b;
            if (c0737c2 == null) {
                c0740f.f2501a = c0737c;
                c0740f.f2502b = c0737c;
            } else {
                c0737c2.f2496c = c0737c;
                c0737c.f2497d = c0737c2;
                c0740f.f2502b = c0737c;
            }
            obj = null;
        }
        if (((InterfaceC0189c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void m399g() {
        if (!this.f540c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        C0435m c0435m = (C0435m) this.f543f;
        if (c0435m == null) {
            c0435m = new C0435m(this);
        }
        this.f543f = c0435m;
        try {
            C0475j.class.getDeclaredConstructor(null);
            C0435m c0435m2 = (C0435m) this.f543f;
            if (c0435m2 != null) {
                ((LinkedHashSet) c0435m2.f1391b).add(C0475j.class.getName());
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0475j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0190d() {
        this.f541d = new C0740f();
        this.f540c = true;
    }
}
