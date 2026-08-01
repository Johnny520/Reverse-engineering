package p059e3;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.emoji2.text.C0644c;
import java.util.List;
import p010a9.InterfaceC0190r;
import p024b9.AbstractC1061t;
import p074f3.AbstractC2282b;
import p074f3.AbstractC2284d;
import p104h3.C2855h;
import p104h3.C2858k;
import p104h3.C2866s;
import p121i3.C3193w;
import p121i3.InterfaceC3175e;
import p319w2.C9064f0;
import p319w2.C9074h0;
import p319w2.C9078i;
import p319w2.C9147v3;

/* JADX INFO: renamed from: e3.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2008c {

    /* JADX INFO: renamed from: a */
    public static final a f5581a = new a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.c] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: a */
    public static final CharSequence m7255a(String str, float f10, C9147v3 c9147v3, List list, List list2, InterfaceC3175e interfaceC3175e, InterfaceC0190r interfaceC0190r, boolean z10) {
        String str2;
        CharSequence charSequenceM2529p;
        float f11;
        InterfaceC3175e interfaceC3175e2;
        C9064f0 c9064f0M35273a;
        if (z10 && C0644c.m2518i()) {
            C9074h0 c9074h0M35573w = c9147v3.m35573w();
            C9078i c9078iM35286d = (c9074h0M35573w == null || (c9064f0M35273a = c9074h0M35573w.m35273a()) == null) ? null : C9078i.m35286d(c9064f0M35273a.m35229b());
            str2 = str;
            charSequenceM2529p = C0644c.m2516c().m2529p(str2, 0, str.length(), Integer.MAX_VALUE, c9078iM35286d == null ? 0 : C9078i.m35289g(c9078iM35286d.m35292j(), C9078i.f31130b.m35293a()));
            charSequenceM2529p.getClass();
        } else {
            str2 = str;
            charSequenceM2529p = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && AbstractC1061t.m3842c(c9147v3.m35542D(), C2866s.f7502c.m10278a()) && C3193w.m12101f(c9147v3.m35569s()) == 0) {
            return charSequenceM2529p;
        }
        Spannable spannableString = charSequenceM2529p instanceof Spannable ? (Spannable) charSequenceM2529p : new SpannableString(charSequenceM2529p);
        if (AbstractC1061t.m3842c(c9147v3.m35539A(), C2858k.f7480b.m10240d())) {
            AbstractC2284d.m8326w(spannableString, f5581a, 0, str2.length());
        }
        if (m7256b(c9147v3) && c9147v3.m35570t() == null) {
            AbstractC2284d.m8323t(spannableString, c9147v3.m35569s(), f10, interfaceC3175e);
            f11 = f10;
            interfaceC3175e2 = interfaceC3175e;
        } else {
            C2855h c2855hM35570t = c9147v3.m35570t();
            if (c2855hM35570t == null) {
                c2855hM35570t = C2855h.f7445d.m10183a();
            }
            f11 = f10;
            interfaceC3175e2 = interfaceC3175e;
            AbstractC2284d.m8322s(spannableString, c9147v3.m35569s(), f11, interfaceC3175e2, c2855hM35570t);
        }
        AbstractC2284d.m8303A(spannableString, c9147v3.m35542D(), f11, interfaceC3175e2);
        AbstractC2284d.m8328y(spannableString, c9147v3, list, interfaceC3175e2, interfaceC0190r);
        AbstractC2284d.m8315l(spannableString, list, f11, interfaceC3175e2, c9147v3.m35542D());
        AbstractC2282b.m8302d(spannableString, list2, interfaceC3175e2);
        return spannableString;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m7256b(C9147v3 c9147v3) {
        C9064f0 c9064f0M35273a;
        C9074h0 c9074h0M35573w = c9147v3.m35573w();
        if (c9074h0M35573w == null || (c9064f0M35273a = c9074h0M35573w.m35273a()) == null) {
            return false;
        }
        return c9064f0M35273a.m35230c();
    }

    /* JADX INFO: renamed from: e3.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends CharacterStyle {
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
        }
    }
}
