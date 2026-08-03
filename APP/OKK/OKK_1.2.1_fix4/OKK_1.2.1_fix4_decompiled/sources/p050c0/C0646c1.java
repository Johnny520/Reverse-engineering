package p050c0;

import de.robv.android.xposed.AbstractC0761c;
import de.robv.android.xposed.C0760b;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Locale;
import p001A0.AbstractC0040p;
import p009E0.C0172c;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p042W0.AbstractC0425j;

/* JADX INFO: renamed from: c0.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0646c1 extends AbstractC0761c {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0649d1 f2009c;

    public C0646c1(int i2) {
        this.f2008b = i2;
        switch (i2) {
            case 1:
                this.f2009c = C0649d1.f2016a;
                break;
            default:
                this.f2009c = C0649d1.f2016a;
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: a */
    public void mo1385a(C0760b c0760b) {
        Object obj;
        switch (this.f2008b) {
            case 0:
                this.f2009c.getClass();
                if (C0649d1.m1630a() && (obj = c0760b.f2669b) != null) {
                    try {
                        C0172c c0172cM714c = AbstractC0317q.m714c(obj.getClass().getDeclaredFields());
                        while (c0172cM714c.hasNext()) {
                            Field field = (Field) c0172cM714c.next();
                            if (!Modifier.isStatic(field.getModifiers())) {
                                field.setAccessible(true);
                                if (AbstractC0307g.m699a(field.getType(), String.class)) {
                                    String name = field.getName();
                                    AbstractC0307g.m702d(name, "getName(...)");
                                    String lowerCase = name.toLowerCase(Locale.ROOT);
                                    AbstractC0307g.m702d(lowerCase, "toLowerCase(...)");
                                    if (AbstractC0425j.m1005J0(lowerCase, "ad", false) || AbstractC0425j.m1005J0(lowerCase, "uxinfo", false) || AbstractC0425j.m1005J0(lowerCase, "aid", false)) {
                                        try {
                                            field.set(obj, "");
                                        } catch (Throwable th) {
                                            AbstractC0040p.m116u(th);
                                        }
                                    }
                                } else if (AbstractC0307g.m699a(field.getType(), Integer.TYPE) || AbstractC0307g.m699a(field.getType(), Integer.class)) {
                                    String name2 = field.getName();
                                    AbstractC0307g.m702d(name2, "getName(...)");
                                    String lowerCase2 = name2.toLowerCase(Locale.ROOT);
                                    AbstractC0307g.m702d(lowerCase2, "toLowerCase(...)");
                                    if (AbstractC0425j.m1005J0(lowerCase2, "ad", false) || (AbstractC0425j.m1005J0(lowerCase2, "type", false) && AbstractC0425j.m1005J0(lowerCase2, "action", false))) {
                                        try {
                                            field.set(obj, 0);
                                        } catch (Throwable th2) {
                                            AbstractC0040p.m116u(th2);
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        AbstractC0040p.m116u(th3);
                    }
                    int iIncrementAndGet = C0649d1.f2018c.incrementAndGet();
                    if (iIncrementAndGet <= 5 || iIncrementAndGet % 50 == 0) {
                        C0649d1.m1631b("neutralized ADInfo #" + iIncrementAndGet);
                    }
                }
                break;
        }
    }

    @Override // de.robv.android.xposed.AbstractC0761c
    /* JADX INFO: renamed from: b */
    public void mo1386b(C0760b c0760b) {
        switch (this.f2008b) {
            case 1:
                this.f2009c.getClass();
                if (C0649d1.m1630a()) {
                    c0760b.m1946c(Boolean.TRUE);
                    break;
                }
                break;
        }
    }
}
