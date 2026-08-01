package p042W;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import p022L.AbstractC0174d;
import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.C0265p;
import p041V.AbstractC0311d;
import p041V.AbstractC0316i;
import p041V.InterfaceC0323p;
import p044X.AbstractC0354a;
import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: W.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0330b extends AbstractC0274y {

    /* JADX INFO: renamed from: d */
    public static final C0329a f733d = new C0329a(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f734a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f735b;

    /* JADX INFO: renamed from: c */
    public final Object f736c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0330b(C0261l c0261l, AbstractC0274y abstractC0274y, Class cls) {
        this.f735b = new C0347s(c0261l, abstractC0274y, cls);
        this.f736c = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        Date dateM610b;
        switch (this.f734a) {
            case 0:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                c0493b.mo571a();
                while (c0493b.mo577k()) {
                    arrayList.add(((AbstractC0274y) ((C0347s) this.f735b).f789c).mo476a(c0493b));
                }
                c0493b.mo573e();
                int size = arrayList.size();
                Class cls = (Class) this.f736c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i2 = 0; i2 < size; i2++) {
                    Array.set(objNewInstance, i2, arrayList.get(i2));
                }
                return objNewInstance;
            case 1:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC0323p) this.f736c).mo143n();
                c0493b.mo571a();
                while (c0493b.mo577k()) {
                    collection.add(((AbstractC0274y) ((C0347s) this.f735b).f789c).mo476a(c0493b));
                }
                c0493b.mo573e();
                return collection;
            case 2:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v = c0493b.mo584v();
                synchronized (((ArrayList) this.f735b)) {
                    try {
                        Iterator it = ((ArrayList) this.f735b).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                try {
                                    dateM610b = AbstractC0354a.m610b(strMo584v, new ParsePosition(0));
                                } catch (ParseException e2) {
                                    StringBuilder sbM357m = AbstractC0174d.m357m("Failed parsing '", strMo584v, "' as Date; at path ");
                                    sbM357m.append(c0493b.mo576j());
                                    throw new C0265p(sbM357m.toString(), e2);
                                }
                                break;
                            } else {
                                try {
                                    dateM610b = ((DateFormat) it.next()).parse(strMo584v);
                                } catch (ParseException unused) {
                                }
                            }
                        }
                    } finally {
                    }
                }
                return ((AbstractC0334f) this.f736c).mo562a(dateM610b);
            default:
                Object objMo476a = ((C0348t) this.f735b).f793c.mo476a(c0493b);
                if (objMo476a != null) {
                    Class cls2 = (Class) this.f736c;
                    if (!cls2.isInstance(objMo476a)) {
                        throw new C0265p("Expected a " + cls2.getName() + " but was " + objMo476a.getClass().getName() + "; at path " + c0493b.mo576j());
                    }
                }
                return objMo476a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        String str;
        switch (this.f734a) {
            case 0:
                if (obj == null) {
                    c0494c.mo591i();
                    return;
                }
                c0494c.mo586b();
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    ((C0347s) this.f735b).mo477b(c0494c, Array.get(obj, i2));
                }
                c0494c.mo588e();
                return;
            case 1:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c0494c.mo591i();
                    return;
                }
                c0494c.mo586b();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((C0347s) this.f735b).mo477b(c0494c, it.next());
                }
                c0494c.mo588e();
                return;
            case 2:
                Date date = (Date) obj;
                if (date == null) {
                    c0494c.mo591i();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f735b).get(0);
                synchronized (((ArrayList) this.f735b)) {
                    str = dateFormat.format(date);
                    break;
                }
                c0494c.mo596p(str);
                return;
            default:
                ((C0348t) this.f735b).f793c.mo477b(c0494c, obj);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f734a) {
            case 2:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f735b).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public C0330b(C0261l c0261l, Type type, AbstractC0274y abstractC0274y, InterfaceC0323p interfaceC0323p) {
        this.f735b = new C0347s(c0261l, abstractC0274y, type);
        this.f736c = interfaceC0323p;
    }

    public C0330b(AbstractC0334f abstractC0334f, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        this.f735b = arrayList;
        Objects.requireNonNull(abstractC0334f);
        this.f736c = abstractC0334f;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i2, i3, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i2, i3));
        }
        if (AbstractC0316i.f698a >= 9) {
            arrayList.add(AbstractC0311d.m546h(i2, i3));
        }
    }

    public C0330b(C0348t c0348t, Class cls) {
        this.f735b = c0348t;
        this.f736c = cls;
    }
}
