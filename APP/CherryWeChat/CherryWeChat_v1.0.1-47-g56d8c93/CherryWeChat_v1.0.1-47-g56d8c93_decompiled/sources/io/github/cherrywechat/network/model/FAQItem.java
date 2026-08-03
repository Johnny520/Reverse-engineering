package io.github.cherrywechat.network.model;

import p000.AbstractC0213Ey;
import p000.AbstractC0298Gx;
import p000.AbstractC0585Nj;
import p000.AbstractC0621Oc;
import p000.AbstractC2374ph;
import p000.InterfaceC0126Cx;
import p000.InterfaceC0717Qm;
import p000.InterfaceC0962Wa;

/* JADX INFO: loaded from: classes.dex */
public final class FAQItem {
    public static final Companion Companion = new Companion(null);
    private final String answer;

    /* JADX INFO: renamed from: id */
    private final int f5568id;
    private final int itemOrder;
    private final String question;

    public static final class Companion {
        private Companion() {
        }

        public final InterfaceC0717Qm serializer() {
            return FAQItem$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(AbstractC0621Oc abstractC0621Oc) {
            this();
        }
    }

    public FAQItem() {
        this(0, (String) null, (String) null, 0, 15, (AbstractC0621Oc) null);
    }

    public static /* synthetic */ FAQItem copy$default(FAQItem fAQItem, int i, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = fAQItem.f5568id;
        }
        if ((i3 & 2) != 0) {
            str = fAQItem.question;
        }
        if ((i3 & 4) != 0) {
            str2 = fAQItem.answer;
        }
        if ((i3 & 8) != 0) {
            i2 = fAQItem.itemOrder;
        }
        return fAQItem.copy(i, str, str2, i2);
    }

    public static /* synthetic */ void getItemOrder$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(FAQItem fAQItem, InterfaceC0962Wa interfaceC0962Wa, InterfaceC0126Cx interfaceC0126Cx) {
        if (interfaceC0962Wa.m1845g() || fAQItem.f5568id != 0) {
            int i = fAQItem.f5568id;
            interfaceC0962Wa.m1843e();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(fAQItem.question, "")) {
            String str = fAQItem.question;
            interfaceC0962Wa.m1842d();
        }
        if (interfaceC0962Wa.m1845g() || !AbstractC0585Nj.m1134a(fAQItem.answer, "")) {
            String str2 = fAQItem.answer;
            interfaceC0962Wa.m1842d();
        }
        if (!interfaceC0962Wa.m1845g() && fAQItem.itemOrder == 0) {
            return;
        }
        int i2 = fAQItem.itemOrder;
        interfaceC0962Wa.m1843e();
    }

    public final int component1() {
        return this.f5568id;
    }

    public final String component2() {
        return this.question;
    }

    public final String component3() {
        return this.answer;
    }

    public final int component4() {
        return this.itemOrder;
    }

    public final FAQItem copy(int i, String str, String str2, int i2) {
        return new FAQItem(i, str, str2, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FAQItem)) {
            return false;
        }
        FAQItem fAQItem = (FAQItem) obj;
        return this.f5568id == fAQItem.f5568id && AbstractC0585Nj.m1134a(this.question, fAQItem.question) && AbstractC0585Nj.m1134a(this.answer, fAQItem.answer) && this.itemOrder == fAQItem.itemOrder;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final int getId() {
        return this.f5568id;
    }

    public final int getItemOrder() {
        return this.itemOrder;
    }

    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return Integer.hashCode(this.itemOrder) + AbstractC2374ph.m4810g(this.answer, AbstractC2374ph.m4810g(this.question, Integer.hashCode(this.f5568id) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FAQItem(id=");
        sb.append(this.f5568id);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(", answer=");
        sb.append(this.answer);
        sb.append(", itemOrder=");
        return AbstractC0213Ey.m408f(sb, this.itemOrder, ')');
    }

    public /* synthetic */ FAQItem(int i, int i2, String str, String str2, int i3, AbstractC0298Gx abstractC0298Gx) {
        if ((i & 1) == 0) {
            this.f5568id = 0;
        } else {
            this.f5568id = i2;
        }
        if ((i & 2) == 0) {
            this.question = "";
        } else {
            this.question = str;
        }
        if ((i & 4) == 0) {
            this.answer = "";
        } else {
            this.answer = str2;
        }
        if ((i & 8) == 0) {
            this.itemOrder = 0;
        } else {
            this.itemOrder = i3;
        }
    }

    public FAQItem(int i, String str, String str2, int i2) {
        this.f5568id = i;
        this.question = str;
        this.answer = str2;
        this.itemOrder = i2;
    }

    public /* synthetic */ FAQItem(int i, String str, String str2, int i2, int i3, AbstractC0621Oc abstractC0621Oc) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? 0 : i2);
    }
}
