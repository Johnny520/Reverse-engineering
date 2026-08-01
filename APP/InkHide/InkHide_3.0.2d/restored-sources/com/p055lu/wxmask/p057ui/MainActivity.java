package com.p055lu.wxmask.p057ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractComponentCallbacksC0434l;
import androidx.fragment.app.C0437o;
import androidx.fragment.app.C0448z;
import androidx.lifecycle.C0458J;
import androidx.lifecycle.C0464P;
import androidx.lifecycle.InterfaceC0463O;
import com.p055lu.magic.p056ui.FragmentNavigation;
import com.p055lu.wxmask272.R;
import java.io.File;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import p001A0.RunnableC0040m;
import p004C.C0060d;
import p004C.C0064h;
import p006D.AbstractC0079h;
import p014H.C0142a;
import p027N0.AbstractC0223g;
import p037T.C0261l;
import p040U0.AbstractC0291a;
import p041V.AbstractC0311d;
import p041V.C0309b;
import p049a0.C0367a;
import p052b1.AbstractC0503h;
import p061e.AbstractActivityC0533i;
import p067g0.AbstractC0575a;
import p070i0.AbstractC0731a;
import p081o0.C0781b;
import p086r0.MenuItemOnMenuItemClickListenerC0933q0;
import p094v0.AbstractC1027b;
import p094v0.C1028c;
import p098x0.C1036b;
import p102z0.AbstractC1121d;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC0533i {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f1628x = 0;

    /* JADX INFO: renamed from: v */
    public FragmentNavigation f1629v;

    /* JADX INFO: renamed from: w */
    public C0142a f1630w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.activity.AbstractActivityC0376g, android.app.Activity
    public final void onBackPressed() {
        FragmentNavigation fragmentNavigation = this.f1629v;
        if (fragmentNavigation == null) {
            AbstractC0223g.m420g("fragmentNavigation");
            throw null;
        }
        int i2 = fragmentNavigation.f1626d - 1;
        if (i2 >= 0) {
            Stack stack = fragmentNavigation.f1625c;
            if (i2 < stack.size()) {
                AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434l = (AbstractComponentCallbacksC0434l) stack.get(i2);
                AbstractC0223g.m417d(abstractComponentCallbacksC0434l, "frag");
                fragmentNavigation.m1028d(abstractComponentCallbacksC0434l);
                return;
            }
        }
        super.onBackPressed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractActivityC0533i, androidx.activity.AbstractActivityC0376g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.layout_main, (ViewGroup) null, false);
        FrameLayout frameLayout = (FrameLayout) AbstractC0079h.m188l(viewInflate, R.id.mainContainer);
        if (frameLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.mainContainer)));
        }
        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
        this.f1630w = new C0142a(frameLayout2, frameLayout, false);
        setContentView(frameLayout2);
        C0142a c0142a = this.f1630w;
        if (c0142a == null) {
            AbstractC0223g.m420g("binding");
            throw null;
        }
        FrameLayout frameLayout3 = (FrameLayout) c0142a.f444c;
        FragmentNavigation fragmentNavigation = new FragmentNavigation();
        fragmentNavigation.f1625c = new Stack();
        fragmentNavigation.f1626d = -1;
        C0448z c0448z = ((C0437o) this.f1749p.f312c).f1397g;
        AbstractC0223g.m417d(c0448z, "activity.supportFragmentManager");
        fragmentNavigation.f1624b = c0448z;
        fragmentNavigation.f1623a = frameLayout3;
        this.f894e.m927a(fragmentNavigation);
        this.f1629v = fragmentNavigation;
        String string = C1028c.class.toString();
        AbstractC0223g.m417d(string, "fragClass.toString()");
        C0448z c0448z2 = fragmentNavigation.f1624b;
        if (c0448z2 == null) {
            AbstractC0223g.m420g("supportFragmentManager");
            throw null;
        }
        AbstractComponentCallbacksC0434l abstractComponentCallbacksC0434lM903z = c0448z2.m903z(string);
        if (abstractComponentCallbacksC0434lM903z == null) {
            abstractComponentCallbacksC0434lM903z = (AbstractComponentCallbacksC0434l) C1028c.class.newInstance();
        }
        AbstractC0223g.m415b(abstractComponentCallbacksC0434lM903z);
        fragmentNavigation.m1028d(abstractComponentCallbacksC0434lM903z);
        C0464P viewModelStore = getViewModelStore();
        if (this.f897h == null) {
            this.f897h = new C0458J(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        C1036b c1036b = (C1036b) new C0064h(viewModelStore, (InterfaceC0463O) this.f897h, mo635a()).m119i(C1036b.class);
        if (!c1036b.f3652d) {
            c1036b.f3652d = true;
            AbstractC1121d.f3779a.m2409h(true, new C0060d(14, new C0781b(c1036b, this, 9)));
        }
        m1037t(getIntent());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        ArrayList arrayList;
        int i2;
        AbstractC0223g.m418e(menu, "menu");
        super.onCreateOptionsMenu(menu);
        File file = new File(getFilesDir(), "res/raw/menu_ui.json");
        Type[] typeArr = {JsonMenuManager$MenuBean.class};
        C0261l c0261l = AbstractC0575a.f1940a;
        TypeVariable[] typeParameters = ArrayList.class.getTypeParameters();
        int length = typeParameters.length;
        if (1 != length) {
            throw new IllegalArgumentException(ArrayList.class.getName() + " requires " + length + " type arguments, but got 1");
        }
        for (int i3 = 0; i3 < length; i3++) {
            Type type = typeArr[i3];
            Class<?> clsM545g = AbstractC0311d.m545g(type);
            TypeVariable typeVariable = typeParameters[i3];
            for (Type type2 : typeVariable.getBounds()) {
                if (!AbstractC0311d.m545g(type2).isAssignableFrom(clsM545g)) {
                    throw new IllegalArgumentException("Type argument " + type + " does not satisfy bounds for type variable " + typeVariable + " declared by " + ArrayList.class);
                }
            }
        }
        Type typeM539a = AbstractC0311d.m539a(new C0309b(null, ArrayList.class, typeArr));
        AbstractC0311d.m545g(typeM539a);
        typeM539a.hashCode();
        try {
            if (file.exists()) {
                String strM172O = AbstractC0079h.m172O(file, AbstractC0291a.f663a);
                C0261l c0261l2 = AbstractC0575a.f1940a;
                c0261l2.getClass();
                arrayList = (ArrayList) c0261l2.m480c(strM172O, new C0367a(typeM539a));
            } else {
                file.getParentFile().mkdirs();
                String strM2221a = AbstractC1027b.m2221a(this);
                AbstractC0079h.m179X(file, strM2221a);
                C0261l c0261l3 = AbstractC0575a.f1940a;
                c0261l3.getClass();
                arrayList = (ArrayList) c0261l3.m480c(strM2221a, new C0367a(typeM539a));
            }
        } catch (Exception unused) {
            String strM2221a2 = AbstractC1027b.m2221a(this);
            C0261l c0261l4 = AbstractC0575a.f1940a;
            c0261l4.getClass();
            arrayList = (ArrayList) c0261l4.m480c(strM2221a2, new C0367a(typeM539a));
        }
        Iterator it = arrayList.iterator();
        AbstractC0223g.m417d(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC0223g.m417d(next, "next(...)");
            JsonMenuManager$MenuBean jsonMenuManager$MenuBean = (JsonMenuManager$MenuBean) next;
            try {
                i2 = AbstractC0503h.m991x().getPackageManager().getPackageInfo(AbstractC0503h.m991x().getPackageName(), 0).versionCode;
            } catch (Exception e2) {
                AbstractC0731a.m1385b(e2);
                i2 = -1;
            }
            if (i2 >= jsonMenuManager$MenuBean.getSince()) {
                MenuItem menuItemAdd = menu.add(jsonMenuManager$MenuBean.getGroupId(), jsonMenuManager$MenuBean.getItemId(), jsonMenuManager$MenuBean.getOrder(), jsonMenuManager$MenuBean.getTitle());
                menuItemAdd.setShowAsAction(8);
                menuItemAdd.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC0933q0(jsonMenuManager$MenuBean, this));
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractActivityC0533i, androidx.activity.AbstractActivityC0376g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m1037t(intent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractActivityC0533i, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (AbstractC0503h.f1601j || System.currentTimeMillis() - AbstractC0503h.f1602k <= 7200000) {
            return;
        }
        AbstractC1027b.m2222b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m1037t(Intent intent) {
        Uri data;
        if (intent == null) {
            return;
        }
        if (DeepLinkActivity.class.getName().equals(intent.getStringExtra("from")) && (data = intent.getData()) != null) {
            C0142a c0142a = this.f1630w;
            if (c0142a != null) {
                ((FrameLayout) c0142a.f443b).post(new RunnableC0040m(this, data, 14));
            } else {
                AbstractC0223g.m420g("binding");
                throw null;
            }
        }
    }
}
