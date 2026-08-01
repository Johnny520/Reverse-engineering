package gd;

import cd.C1517b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import p068ed.AbstractC2212a;
import p084fd.AbstractC2424d;
import p201nd.C5580h;
import p315vd.AbstractC8924d;
import ye.C9797a;
import ye.C9807k;

/* JADX INFO: renamed from: gd.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2783x extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public Class f7245e;

    /* JADX INFO: renamed from: f */
    public Class f7246f;

    /* JADX INFO: renamed from: g */
    public Class f7247g;

    /* JADX INFO: renamed from: h */
    public Class f7248h;

    /* JADX INFO: renamed from: i */
    public Class f7249i;

    /* JADX INFO: renamed from: j */
    public Field f7250j;

    /* JADX INFO: renamed from: k */
    public Field f7251k;

    /* JADX INFO: renamed from: l */
    public Field f7252l;

    /* JADX INFO: renamed from: m */
    public Field f7253m;

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m9924m(C9797a c9797a) {
        c9797a.m38104d(C9807k.m38130c().m38137h("getUri"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getType"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getRespObj"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getReqObjImp"));
        c9797a.m38104d(C9807k.m38130c().m38137h("getTransHeader"));
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m9926o(C9797a c9797a) {
        c9797a.m38104d(C9807k.m38130c().m38137h("getString").m38141m("java.lang.String"));
        c9797a.m38104d(C9807k.m38130c().m38137h("compareContent").m38139k(1));
        c9797a.m38104d(C9807k.m38130c().m38137h("writeFields"));
        c9797a.m38104d(C9807k.m38130c().m38137h("populateBuilderWithField").m38139k(3));
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m9928q(C9797a c9797a) {
        c9797a.m38109k(1024);
        c9797a.m38104d(C9807k.m38130c().m38137h("getBaseResponse"));
        c9797a.m38104d(C9807k.m38130c().m38137h("setBaseResponse"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m9929t(InterfaceC5154i interfaceC5154i) {
        Object objectField;
        String str;
        try {
            if (interfaceC5154i.getArgs()[1].equals(0) && interfaceC5154i.getArgs()[2].equals(0) && (objectField = AbstractC5161p.getObjectField(AbstractC5161p.callMethod(this.f7250j.get(interfaceC5154i.getThisObject()), "getRespObj", new Object[0]), "a")) != null && (str = (String) this.f7251k.get(objectField)) != null && str.endsWith("@chatroom")) {
                List listM9930r = m9930r((List) this.f7252l.get(objectField));
                if (listM9930r.isEmpty()) {
                    return;
                }
                List listM8740m = AbstractC2424d.m8740m(str);
                ArrayList arrayList = new ArrayList(listM9930r);
                arrayList.removeAll(listM8740m);
                ArrayList arrayList2 = new ArrayList(listM8740m);
                arrayList2.removeAll(listM9930r);
                if (!arrayList.isEmpty()) {
                    AbstractC8924d.m34267g("RelationMonitor", "群 [" + str + "] 进群检测: " + arrayList);
                    C5580h.dispatchMemberJoined(str, arrayList);
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                AbstractC8924d.m34267g("RelationMonitor", "群 [" + str + "] 退群检测: " + arrayList2);
                C5580h.dispatchMemberLeft(str, arrayList2);
            }
        } catch (Throwable th) {
            AbstractC8924d.m34264d("RelationMonitor", "onGYNetEnd Error", th);
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        this.f7246f = C1517b.findClass().pkg("com.tencent.mm.modelbase").matcher(new Consumer() { // from class: gd.s
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C2783x.m9924m((C9797a) obj);
            }
        }).get();
        this.f7247g = C1517b.findClass().pkg("r45.").matcher(new Consumer() { // from class: gd.t
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C2783x.m9928q((C9797a) obj);
            }
        }).get();
        this.f7249i = C1517b.findClass().pkg("r45.").matcher(new Consumer() { // from class: gd.u
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C2783x.m9926o((C9797a) obj);
            }
        }).get();
        this.f7248h = C1517b.findClass().pkg("r45.").matcher(new Consumer() { // from class: gd.v
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f7243a.m9931s((C9797a) obj);
            }
        }).get();
        Class<?> cls = C1517b.findClass().notPkg("r45.").usingStrings("/cgi-bin/micromsg-bin/getchatroommemberdetail").get();
        this.f7245e = cls;
        if (this.f7246f == null || this.f7249i == null || this.f7248h == null || cls == null) {
            AbstractC8924d.m34263c("RelationMonitor", "核心类定位失败");
            return false;
        }
        this.f7250j = C1517b.findField().inClass(this.f7245e).type(this.f7246f.getName()).get();
        this.f7251k = C1517b.findField().inClass(this.f7248h).type("java.lang.String").get(0);
        ArrayList arrayList = new ArrayList();
        for (Field field : this.f7248h.getDeclaredFields()) {
            if (field.getType().equals(LinkedList.class)) {
                arrayList.add(field);
            }
        }
        if (!arrayList.isEmpty()) {
            Field field2 = (Field) arrayList.get(0);
            this.f7252l = field2;
            field2.setAccessible(true);
        }
        Field field3 = C1517b.findField().inClass(this.f7249i).type("java.lang.String").get(0);
        this.f7253m = field3;
        field3.setAccessible(true);
        return (this.f7250j == null || this.f7251k == null || this.f7252l == null || this.f7253m == null) ? false : true;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookAllMethodsAfter(this.f7245e, "onGYNetEnd", new InterfaceC5156k() { // from class: gd.w
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7244a.m9929t(interfaceC5154i);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final List m9930r(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) this.f7253m.get(it.next());
                if (str != null && !str.isEmpty()) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            AbstractC8924d.m34264d("RelationMonitor", "extractWxidList Error", th);
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m9931s(C9797a c9797a) {
        c9797a.m38111n(this.f7247g.getName());
    }
}
