package p332wb;

import java.util.Comparator;
import java.util.Locale;
import p036c9.C0414a;
import p063e9.C0832c;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: wb.e2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4834e2 implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16748g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b9.c.run():void, wb.fr.c(android.view.View, android.view.ViewGroup, android.view.ViewGroup, int, android.view.ViewGroup$LayoutParams, android.graphics.drawable.Drawable, android.view.View, java.util.ArrayList, android.widget.FrameLayout, android.widget.FrameLayout):void, wb.ho.b0(android.content.Context, wb.v0, fg.a, fg.l, i0.h0, int):void, wb.ho.o0(android.content.Context, java.util.List, java.lang.String, fg.l, r.z, fg.a, fg.l, fg.l, fg.p, fg.a, fg.a, i0.h0, int):void] */
    public /* synthetic */ C4834e2(int i9) {
        this.f16748g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f16748g) {
            case 0:
                Locale locale = Locale.US;
                String strM5165l = AbstractC2091b.m5165l(locale, (String) obj, locale);
                locale.getClass();
                String lowerCase = ((String) obj2).toLowerCase(locale);
                lowerCase.getClass();
                return strM5165l.compareTo(lowerCase);
            case 1:
                return Integer.valueOf(((C0414a) obj).f1182d).compareTo(Integer.valueOf(((C0414a) obj2).f1182d));
            case 2:
                ContactLabelBean contactLabelBean = (ContactLabelBean) obj;
                String str = contactLabelBean.labelName;
                if (AbstractC3149m.m6721t0(str)) {
                    str = contactLabelBean.labelId;
                }
                Locale locale2 = Locale.US;
                String strM5165l2 = AbstractC2091b.m5165l(locale2, str, locale2);
                ContactLabelBean contactLabelBean2 = (ContactLabelBean) obj2;
                String str2 = contactLabelBean2.labelName;
                if (AbstractC3149m.m6721t0(str2)) {
                    str2 = contactLabelBean2.labelId;
                }
                locale2.getClass();
                String lowerCase2 = str2.toLowerCase(locale2);
                lowerCase2.getClass();
                return strM5165l2.compareTo(lowerCase2);
            case 3:
                Locale locale3 = Locale.US;
                String strM5165l3 = AbstractC2091b.m5165l(locale3, (String) obj, locale3);
                locale3.getClass();
                String lowerCase3 = ((String) obj2).toLowerCase(locale3);
                lowerCase3.getClass();
                return strM5165l3.compareTo(lowerCase3);
            case 4:
                return Boolean.valueOf(!((C0832c) obj).f2515f).compareTo(Boolean.valueOf(!((C0832c) obj2).f2515f));
            case 5:
                return Boolean.valueOf(!((C0832c) obj).f2515f).compareTo(Boolean.valueOf(!((C0832c) obj2).f2515f));
            case 6:
                String str3 = ((C5292s0) obj).f20551b;
                Locale locale4 = Locale.US;
                String strM5165l4 = AbstractC2091b.m5165l(locale4, str3, locale4);
                String str4 = ((C5292s0) obj2).f20551b;
                locale4.getClass();
                String lowerCase4 = str4.toLowerCase(locale4);
                lowerCase4.getClass();
                return strM5165l4.compareTo(lowerCase4);
            case 7:
                return Integer.valueOf(((C5099m5) obj).f18837b.ordinal()).compareTo(Integer.valueOf(((C5099m5) obj2).f18837b.ordinal()));
            case 8:
                String str5 = ((C5330t5) obj).f20752b;
                Locale locale5 = Locale.US;
                String strM5165l5 = AbstractC2091b.m5165l(locale5, str5, locale5);
                String str6 = ((C5330t5) obj2).f20752b;
                locale5.getClass();
                String lowerCase5 = str6.toLowerCase(locale5);
                lowerCase5.getClass();
                return strM5165l5.compareTo(lowerCase5);
            case 9:
                return Integer.valueOf(((C4761br) obj).f16123b).compareTo(Integer.valueOf(((C4761br) obj2).f16123b));
            default:
                Locale locale6 = Locale.US;
                String strM5165l6 = AbstractC2091b.m5165l(locale6, (String) obj, locale6);
                locale6.getClass();
                String lowerCase6 = ((String) obj2).toLowerCase(locale6);
                lowerCase6.getClass();
                return strM5165l6.compareTo(lowerCase6);
        }
    }
}
