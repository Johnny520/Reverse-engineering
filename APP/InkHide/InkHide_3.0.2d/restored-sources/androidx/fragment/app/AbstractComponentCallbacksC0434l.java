package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0464P;
import androidx.lifecycle.C0486u;
import androidx.lifecycle.C0489x;
import androidx.lifecycle.EnumC0479n;
import androidx.lifecycle.InterfaceC0465Q;
import androidx.lifecycle.InterfaceC0474i;
import androidx.lifecycle.InterfaceC0484s;
import com.p055lu.wxmask272.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p024M.C0190d;
import p024M.C0191e;
import p024M.InterfaceC0192f;
import p027N0.AbstractC0223g;
import p061e.AbstractActivityC0533i;

/* JADX INFO: renamed from: androidx.fragment.app.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0434l implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0484s, InterfaceC0465Q, InterfaceC0474i, InterfaceC0192f {

    /* JADX INFO: renamed from: R */
    public static final Object f1347R = new Object();

    /* JADX INFO: renamed from: A */
    public boolean f1348A;

    /* JADX INFO: renamed from: B */
    public boolean f1349B;

    /* JADX INFO: renamed from: D */
    public boolean f1351D;

    /* JADX INFO: renamed from: E */
    public ViewGroup f1352E;

    /* JADX INFO: renamed from: F */
    public View f1353F;

    /* JADX INFO: renamed from: G */
    public boolean f1354G;

    /* JADX INFO: renamed from: I */
    public C0433k f1356I;

    /* JADX INFO: renamed from: J */
    public boolean f1357J;

    /* JADX INFO: renamed from: K */
    public boolean f1358K;

    /* JADX INFO: renamed from: M */
    public C0486u f1360M;

    /* JADX INFO: renamed from: N */
    public C0417H f1361N;

    /* JADX INFO: renamed from: P */
    public C0191e f1363P;

    /* JADX INFO: renamed from: Q */
    public final ArrayList f1364Q;

    /* JADX INFO: renamed from: c */
    public Bundle f1366c;

    /* JADX INFO: renamed from: d */
    public SparseArray f1367d;

    /* JADX INFO: renamed from: e */
    public Bundle f1368e;

    /* JADX INFO: renamed from: g */
    public Bundle f1370g;

    /* JADX INFO: renamed from: h */
    public AbstractComponentCallbacksC0434l f1371h;

    /* JADX INFO: renamed from: j */
    public int f1373j;

    /* JADX INFO: renamed from: l */
    public boolean f1375l;

    /* JADX INFO: renamed from: m */
    public boolean f1376m;

    /* JADX INFO: renamed from: n */
    public boolean f1377n;

    /* JADX INFO: renamed from: o */
    public boolean f1378o;

    /* JADX INFO: renamed from: p */
    public boolean f1379p;

    /* JADX INFO: renamed from: q */
    public boolean f1380q;

    /* JADX INFO: renamed from: r */
    public int f1381r;

    /* JADX INFO: renamed from: s */
    public C0448z f1382s;

    /* JADX INFO: renamed from: t */
    public C0437o f1383t;

    /* JADX INFO: renamed from: v */
    public AbstractComponentCallbacksC0434l f1385v;

    /* JADX INFO: renamed from: w */
    public int f1386w;

    /* JADX INFO: renamed from: x */
    public int f1387x;

    /* JADX INFO: renamed from: y */
    public String f1388y;

    /* JADX INFO: renamed from: z */
    public boolean f1389z;

    /* JADX INFO: renamed from: b */
    public int f1365b = -1;

    /* JADX INFO: renamed from: f */
    public String f1369f = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: i */
    public String f1372i = null;

    /* JADX INFO: renamed from: k */
    public Boolean f1374k = null;

    /* JADX INFO: renamed from: u */
    public C0448z f1384u = new C0448z();

    /* JADX INFO: renamed from: C */
    public final boolean f1350C = true;

    /* JADX INFO: renamed from: H */
    public boolean f1355H = true;

    /* JADX INFO: renamed from: L */
    public EnumC0479n f1359L = EnumC0479n.f1521e;

    /* JADX INFO: renamed from: O */
    public final C0489x f1362O = new C0489x();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractComponentCallbacksC0434l() {
        new AtomicInteger();
        this.f1364Q = new ArrayList();
        this.f1360M = new C0486u(this);
        this.f1363P = new C0191e(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p024M.InterfaceC0192f
    /* JADX INFO: renamed from: b */
    public final C0190d mo405b() {
        return (C0190d) this.f1363P.f547d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0484s
    /* JADX INFO: renamed from: c */
    public final C0486u mo636c() {
        return this.f1360M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final C0433k m839d() {
        if (this.f1356I == null) {
            C0433k c0433k = new C0433k();
            Object obj = f1347R;
            c0433k.f1342g = obj;
            c0433k.f1343h = obj;
            c0433k.f1344i = obj;
            c0433k.f1345j = 1.0f;
            c0433k.f1346k = null;
            this.f1356I = c0433k;
        }
        return this.f1356I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final C0448z m840e() {
        if (this.f1383t != null) {
            return this.f1384u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m841f() {
        EnumC0479n enumC0479n = this.f1359L;
        return (enumC0479n == EnumC0479n.f1518b || this.f1385v == null) ? enumC0479n.ordinal() : Math.min(enumC0479n.ordinal(), this.f1385v.m841f());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C0448z m842g() {
        C0448z c0448z = this.f1382s;
        if (c0448z != null) {
            return c0448z;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0465Q
    public final C0464P getViewModelStore() {
        if (this.f1382s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m841f() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f1382s.f1428F.f1233f;
        C0464P c0464p = (C0464P) map.get(this.f1369f);
        if (c0464p != null) {
            return c0464p;
        }
        C0464P c0464p2 = new C0464P();
        map.put(this.f1369f, c0464p2);
        return c0464p2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m843h(int i2, int i3, Intent intent) {
        if (C0448z.m856E(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public View mo844i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m846k(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1384u.m866J();
        this.f1380q = true;
        this.f1361N = new C0417H(this, getViewModelStore());
        View viewMo844i = mo844i(layoutInflater, viewGroup);
        this.f1353F = viewMo844i;
        if (viewMo844i == null) {
            if (this.f1361N.f1267c != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f1361N = null;
            return;
        }
        this.f1361N.m807e();
        View view = this.f1353F;
        C0417H c0417h = this.f1361N;
        AbstractC0223g.m418e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, c0417h);
        View view2 = this.f1353F;
        C0417H c0417h2 = this.f1361N;
        AbstractC0223g.m418e(view2, "<this>");
        view2.setTag(R.id.view_tree_view_model_store_owner, c0417h2);
        View view3 = this.f1353F;
        C0417H c0417h3 = this.f1361N;
        AbstractC0223g.m418e(view3, "<this>");
        view3.setTag(R.id.view_tree_saved_state_registry_owner, c0417h3);
        this.f1362O.m937a(this.f1361N);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final LayoutInflater m847l() {
        C0437o c0437o = this.f1383t;
        if (c0437o == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC0533i abstractActivityC0533i = c0437o.f1398h;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC0533i.getLayoutInflater().cloneInContext(abstractActivityC0533i);
        layoutInflaterCloneInContext.setFactory2(this.f1384u.f1435f);
        return layoutInflaterCloneInContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final AbstractActivityC0533i m848m() {
        C0437o c0437o = this.f1383t;
        AbstractActivityC0533i abstractActivityC0533i = c0437o == null ? null : c0437o.f1394d;
        if (abstractActivityC0533i != null) {
            return abstractActivityC0533i;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final View m849n() {
        View view = this.f1353F;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m850o(int i2, int i3, int i4, int i5) {
        if (this.f1356I == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        m839d().f1337b = i2;
        m839d().f1338c = i3;
        m839d().f1339d = i4;
        m839d().f1340e = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1351D = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m848m().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1351D = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1369f);
        if (this.f1386w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1386w));
        }
        if (this.f1388y != null) {
            sb.append(" tag=");
            sb.append(this.f1388y);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: j */
    public void mo845j(View view) {
    }
}
