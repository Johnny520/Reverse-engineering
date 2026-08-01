package p042W;

import androidx.fragment.app.AbstractC0421L;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p022L.AbstractC0174d;
import p037T.AbstractC0274y;
import p037T.C0265p;
import p037T.EnumC0273x;
import p041V.AbstractC0311d;
import p041V.AbstractC0316i;
import p044X.AbstractC0354a;
import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: W.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0332d extends AbstractC0274y {

    /* JADX INFO: renamed from: c */
    public static final C0329a f739c = new C0329a(1);

    /* JADX INFO: renamed from: d */
    public static final C0340l f740d = new C0340l(0, new C0332d(EnumC0273x.f640b));

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f741a = 0;

    /* JADX INFO: renamed from: b */
    public final Serializable f742b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0332d() {
        ArrayList arrayList = new ArrayList();
        this.f742b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC0316i.f698a >= 9) {
            arrayList.add(AbstractC0311d.m546h(2, 2));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        Date dateM610b;
        switch (this.f741a) {
            case 0:
                if (c0493b.mo585x() == 9) {
                    c0493b.mo583t();
                    return null;
                }
                String strMo584v = c0493b.mo584v();
                synchronized (((ArrayList) this.f742b)) {
                    try {
                        Iterator it = ((ArrayList) this.f742b).iterator();
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
                return dateM610b;
            default:
                int iMo585x = c0493b.mo585x();
                int iM816d = AbstractC0421L.m816d(iMo585x);
                if (iM816d == 5 || iM816d == 6) {
                    return ((EnumC0273x) this.f742b).mo492a(c0493b);
                }
                if (iM816d == 8) {
                    c0493b.mo583t();
                    return null;
                }
                throw new C0265p("Expecting number, got: " + AbstractC0174d.m361q(iMo585x) + "; at path " + c0493b.mo575h());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        String str;
        switch (this.f741a) {
            case 0:
                Date date = (Date) obj;
                if (date == null) {
                    c0494c.mo591i();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f742b).get(0);
                synchronized (((ArrayList) this.f742b)) {
                    str = dateFormat.format(date);
                    break;
                }
                c0494c.mo596p(str);
                return;
            default:
                c0494c.mo595o((Number) obj);
                return;
        }
    }

    public C0332d(EnumC0273x enumC0273x) {
        this.f742b = enumC0273x;
    }
}
