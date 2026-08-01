package p086r0;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p009E0.C0104d;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.C0131s;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0509a;
import p054c0.AbstractC0514f;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0909i0 extends AbstractC0509a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3211a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0912j0 f3212b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0909i0(C0912j0 c0912j0, int i2) {
        this.f3211a = i2;
        this.f3212b = c0912j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p054c0.AbstractC0509a
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object c0104d;
        switch (this.f3211a) {
            case 0:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                AbstractC0223g.m417d(objArr, "args");
                if (AbstractC0223g.m414a(AbstractC0120h.m258f0(0, objArr), Boolean.TRUE)) {
                    Object obj = methodHookParam.thisObject;
                    Activity activity = obj instanceof Activity ? (Activity) obj : null;
                    if (activity != null) {
                        String name = activity.getClass().getName();
                        if (!name.equals("com.tencent.mm.ui.transmit.SelectConversationUI")) {
                            C0912j0 c0912j0 = this.f3212b;
                            if (c0912j0.m1993y(name) && !AbstractC0503h.m970F(activity)) {
                                c0912j0.m1976A("focus", name, AbstractC0174d.m355k("tag=", AbstractC0503h.m970F(activity)), "group=true");
                                Window window = activity.getWindow();
                                c0912j0.m1981F(window != null ? window.getDecorView() : null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr2 = methodHookParam.args;
                AbstractC0223g.m417d(objArr2, "args");
                Object objM258f0 = AbstractC0120h.m258f0(0, objArr2);
                if (objM258f0 != null) {
                    try {
                        c0104d = (View) AbstractC0514f.f1622b.mo1015f(objM258f0, "itemView");
                    } catch (Throwable th) {
                        c0104d = new C0104d(th);
                    }
                    if (c0104d instanceof C0104d) {
                        c0104d = null;
                    }
                    View view = (View) c0104d;
                    if (view != null) {
                        this.f3212b.m1980E(view);
                        break;
                    }
                    break;
                }
                break;
            case 3:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj2 = methodHookParam.thisObject;
                ListView listView = obj2 instanceof ListView ? (ListView) obj2 : null;
                if (listView != null) {
                    C0912j0 c0912j02 = this.f3212b;
                    if (c0912j02.m1990u(listView)) {
                        c0912j02.f3222d.add(listView);
                        c0912j02.m1977B(listView);
                        c0912j02.m1982G(listView);
                        break;
                    }
                }
                break;
            case 4:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj3 = methodHookParam.thisObject;
                Activity activity2 = obj3 instanceof Activity ? (Activity) obj3 : null;
                if (activity2 != null) {
                    this.f3212b.f3233o = new WeakReference(activity2);
                }
                break;
            case 6:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj4 = methodHookParam.thisObject;
                View view2 = obj4 instanceof View ? (View) obj4 : null;
                if (view2 != null) {
                    C0912j0 c0912j03 = this.f3212b;
                    if (c0912j03.m1991v(view2)) {
                        Object[] objArr3 = methodHookParam.args;
                        AbstractC0223g.m417d(objArr3, "args");
                        Object objM258f02 = AbstractC0120h.m258f0(0, objArr3);
                        if (objM258f02 == null) {
                            objM258f02 = C0912j0.m1971n(view2);
                        }
                        if (objM258f02 != null) {
                            c0912j03.m1987q(objM258f02.getClass());
                        }
                        c0912j03.m1983H(view2);
                        break;
                    }
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, r0.j0] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.WeakHashMap] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p054c0.AbstractC0509a
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Iterable<Intent> iterable;
        boolean zM1984d = false;
        ?? r5 = this.f3212b;
        switch (this.f3211a) {
            case 2:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object[] objArr = methodHookParam.args;
                r5.getClass();
                if (objArr == null) {
                    iterable = C0131s.f426a;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : objArr) {
                        if (obj instanceof Intent) {
                            arrayList.add(obj);
                        } else if (obj instanceof Object[]) {
                            for (Object obj2 : (Object[]) obj) {
                                if (obj2 instanceof Intent) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                    }
                    iterable = arrayList;
                }
                for (Intent intent : iterable) {
                    boolean z2 = AbstractC1126i.f3786a;
                    if (C1124g.m2448x()) {
                        ComponentName component = intent.getComponent();
                        String className = component != null ? component.getClassName() : null;
                        if (className == null) {
                            className = "";
                        }
                        if (!AbstractC0307q.m534d0(className) && !className.equals("com.tencent.mm.ui.transmit.SelectConversationUI") && !className.equals("com.tencent.mm.plugin.fts.ui.FTSMainUI") && !className.equals("com.tencent.mm.ui.LauncherUI") && !className.equals("com.tencent.mm.plugin.profile.ui.ContactInfoUI") && !className.equals("com.tencent.mm.ui.chatting.ChattingUI") && !AbstractC0307q.m538h0(className, false, "com.tencent.mm.plugin.sns.") && !AbstractC0307q.m538h0(className, false, "com.tencent.mm.plugin.appbrand.") && !AbstractC0307q.m538h0(className, false, "com.tencent.mm.plugin.setting.") && !AbstractC0307q.m538h0(className, false, "com.tencent.mm.plugin.brandservice.") && !AbstractC0307q.m538h0(className, false, "com.tencent.mm.ui.brandservice.") && !AbstractC0307q.m538h0(className, false, "com.tencent.mm.plugin.game.") && !className.equals("com.tencent.mm.plugin.label.ui.ContactLabelManagerUI")) {
                            Bundle extras = intent.getExtras();
                            ?? r11 = AbstractC0503h.m975M(intent, extras, "label_id") > 0;
                            String stringExtra = intent.getStringExtra("INTENT_KEY_SEARCH_LABEL_USERNAME_LIST");
                            ?? r13 = stringExtra == null || AbstractC0307q.m534d0(stringExtra);
                            String stringExtra2 = intent.getStringExtra("label_name");
                            ?? r14 = stringExtra2 == null || AbstractC0307q.m534d0(stringExtra2);
                            ?? r10 = AbstractC0503h.m975M(intent, extras, "scene") == 7;
                            if (r11 == false && r13 != false && (r14 != false || r10 == false)) {
                                if (!r5.m1993y(className)) {
                                    if (AbstractC0307q.m538h0(className, false, "com.tencent.mm.ui.contact.") || className.equals("com.tencent.mm.ui.mvvm.MvvmContactListUI")) {
                                        Bundle extras2 = intent.getExtras();
                                        if (extras2 != null && (extras2.containsKey("INTENT_KEY_SELECT_CONTACT_FROM_SCENE_SUB_TYPE") || extras2.containsKey("INTENT_KEY_SEARCH_LABEL_USERNAME_LIST") || extras2.containsKey("key_intent_action_uic_list"))) {
                                        }
                                    }
                                }
                                Set setM1965g = C0912j0.m1965g();
                                if (!setM1965g.isEmpty()) {
                                    String stringExtra3 = intent.getStringExtra("block_contact");
                                    if (stringExtra3 == null) {
                                        stringExtra3 = "";
                                    }
                                    List listM523u0 = AbstractC0299i.m523u0(stringExtra3, new char[]{','});
                                    ArrayList arrayList2 = new ArrayList(AbstractC0125m.m289c0(listM523u0));
                                    Iterator it = listM523u0.iterator();
                                    while (it.hasNext()) {
                                        arrayList2.add(AbstractC0299i.m507C0((String) it.next()).toString());
                                    }
                                    ArrayList arrayList3 = new ArrayList();
                                    for (Object obj3 : arrayList2) {
                                        if (!AbstractC0307q.m534d0((String) obj3)) {
                                            arrayList3.add(obj3);
                                        }
                                    }
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    linkedHashSet.addAll(arrayList3);
                                    linkedHashSet.addAll(setM1965g);
                                    intent.putExtra("block_contact", AbstractC0123k.m271m0(linkedHashSet, ",", null, null, null, 62));
                                    ComponentName component2 = intent.getComponent();
                                    String className2 = component2 != null ? component2.getClassName() : null;
                                    if (className2 == null) {
                                        className2 = "";
                                    }
                                    r5.m1976A("inject block_contact", className2, AbstractC0174d.m351g(setM1965g.size(), "add="), AbstractC0174d.m351g(linkedHashSet.size(), "total="));
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj4 = methodHookParam.thisObject;
                View view = obj4 instanceof View ? (View) obj4 : null;
                if (view != null && r5.m1991v(view)) {
                    Object objM1971n = C0912j0.m1971n(view);
                    if (objM1971n != null) {
                        r5.m1987q(objM1971n.getClass());
                    }
                    r5.m1983H(view);
                }
                break;
            case 7:
                AbstractC0223g.m418e(methodHookParam, "param");
                Object obj5 = methodHookParam.thisObject;
                ViewGroup viewGroup = obj5 instanceof ViewGroup ? (ViewGroup) obj5 : null;
                if (viewGroup != null) {
                    r5.getClass();
                    String strM1972o = C0912j0.m1972o(viewGroup);
                    boolean z3 = viewGroup instanceof ListView;
                    ?? r9 = r5.f3229k;
                    if (!z3) {
                        if (AbstractC0223g.m414a(strM1972o, "mim") || AbstractC0223g.m414a(strM1972o, "q0l")) {
                            Set set = r5.f3221c;
                            if (set.contains(viewGroup)) {
                                zM1984d = r5.m1984d(viewGroup);
                            } else if (r5.m1991v(viewGroup)) {
                                String name = viewGroup.getClass().getName();
                                String strM1972o2 = C0912j0.m1972o(viewGroup);
                                r5.m1976A("group recycler target", name, strM1972o2 != null ? strM1972o2 : "");
                                set.add(viewGroup);
                                zM1984d = r5.m1984d(viewGroup);
                            } else {
                                set.remove(viewGroup);
                                r9.remove(viewGroup);
                            }
                            if (zM1984d) {
                                Object objM1971n2 = C0912j0.m1971n(viewGroup);
                                if (objM1971n2 != null) {
                                    r5.m1987q(objM1971n2.getClass());
                                }
                                r5.m1983H(viewGroup);
                            }
                        }
                        break;
                    } else if (AbstractC0223g.m414a(strM1972o, "mil")) {
                        ListView listView = (ListView) viewGroup;
                        Activity activityM1968j = C0912j0.m1968j(listView.getContext());
                        if (!AbstractC0223g.m414a(activityM1968j != null ? activityM1968j.getClass().getName() : null, "com.tencent.mm.ui.transmit.SelectConversationUI")) {
                            Set set2 = r5.f3222d;
                            if (set2.contains(listView)) {
                                zM1984d = r5.m1984d(listView);
                            } else if (r5.m1990u(listView)) {
                                String name2 = listView.getClass().getName();
                                String strM1972o3 = C0912j0.m1972o(listView);
                                r5.m1976A("group list target", name2, strM1972o3 != null ? strM1972o3 : "");
                                set2.add(listView);
                                zM1984d = r5.m1984d(listView);
                            } else {
                                set2.remove(listView);
                                r9.remove(listView);
                            }
                            if (zM1984d) {
                                r5.m1982G(listView);
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
