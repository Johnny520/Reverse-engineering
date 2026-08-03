package p347xa;

import java.util.Comparator;
import java.util.Locale;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: xa.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5751l implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ContactLabelBean contactLabelBean = (ContactLabelBean) obj;
        String str = contactLabelBean.labelName;
        if (AbstractC3149m.m6721t0(str)) {
            str = contactLabelBean.labelId;
        }
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, str, locale);
        ContactLabelBean contactLabelBean2 = (ContactLabelBean) obj2;
        String str2 = contactLabelBean2.labelName;
        if (AbstractC3149m.m6721t0(str2)) {
            str2 = contactLabelBean2.labelId;
        }
        locale.getClass();
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        return strM5165l.compareTo(lowerCase);
    }
}
