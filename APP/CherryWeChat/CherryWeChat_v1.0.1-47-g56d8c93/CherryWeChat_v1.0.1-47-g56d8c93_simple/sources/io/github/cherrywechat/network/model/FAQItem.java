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
    public static final Companion Companion = null;
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

        public /* synthetic */ Companion(AbstractC0621Oc r1) {
            this();
        }
    }

    static {
        Companion = new Companion(null);
    }

    public FAQItem() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static /* synthetic */ FAQItem copy$default(FAQItem r0, int r1, String r2, String r3, int r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.f5568id;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.question;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.answer;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.itemOrder;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public static /* synthetic */ void getItemOrder$annotations() {
    }

    public static final /* synthetic */ void write$Self$app_release(FAQItem r1, InterfaceC0962Wa r2, InterfaceC0126Cx r3) {
        if (r2.m1845g() == false) goto L6;
    L7:
        int r32 = r1.f5568id;
        r2.m1843e();
    L9:
        if (r2.m1845g() == false) goto L12;
    L13:
        String r33 = r1.question;
        r2.m1842d();
    L15:
        if (r2.m1845g() == false) goto L18;
    L19:
        String r34 = r1.answer;
        r2.m1842d();
    L21:
        if (r2.m1845g() == false) goto L24;
    L25:
        int r12 = r1.itemOrder;
        r2.m1843e();
        return;
    L24:
        if (r1.itemOrder != 0) goto L25;
        return;
    L18:
        if (AbstractC0585Nj.m1134a(r1.answer, "") == true) goto L21;
    L12:
        if (AbstractC0585Nj.m1134a(r1.question, "") == true) goto L15;
    L6:
        if (r1.f5568id == 0) goto L9;
        goto L7
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

    public final FAQItem copy(int r2, String r3, String r4, int r5) {
        return new FAQItem(r2, r3, r4, r5);
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof FAQItem) == true) goto L8;
        return false;
    L8:
        FAQItem r52 = (FAQItem) r5;
        if (this.f5568id == r52.f5568id) goto L12;
        return false;
    L12:
        if (AbstractC0585Nj.m1134a(this.question, r52.question) == true) goto L15;
        return false;
    L15:
        if (AbstractC0585Nj.m1134a(this.answer, r52.answer) == true) goto L18;
        return false;
    L18:
        if (this.itemOrder == r52.itemOrder) goto L20;
        return false;
    L20:
        return true;
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
        int r0 = Integer.hashCode(this.f5568id) * 31;
        int r02 = AbstractC2374ph.m4810g(this.question, r0, 31);
        int r03 = AbstractC2374ph.m4810g(this.answer, r02, 31);
        return Integer.hashCode(this.itemOrder) + r03;
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("FAQItem(id=");
        r0.append(this.f5568id);
        r0.append(", question=");
        r0.append(this.question);
        r0.append(", answer=");
        r0.append(this.answer);
        r0.append(", itemOrder=");
        return AbstractC0213Ey.m408f(r0, this.itemOrder, ')');
    }

    public /* synthetic */ FAQItem(int r2, int r3, String r4, String r5, int r6, AbstractC0298Gx r7) {
        if ((r2 & 1) != 0) goto L5;
        this.f5568id = 0;
    L7:
        if ((r2 & 2) != 0) goto L9;
        this.question = "";
    L11:
        if ((r2 & 4) != 0) goto L13;
        this.answer = "";
    L15:
        if ((r2 & 8) != 0) goto L18;
        this.itemOrder = 0;
        return;
    L18:
        this.itemOrder = r6;
        return;
    L13:
        this.answer = r5;
        goto L15
    L9:
        this.question = r4;
        goto L11
    L5:
        this.f5568id = r3;
        goto L7
    }

    public FAQItem(int r1, String r2, String r3, int r4) {
        this.f5568id = r1;
        this.question = r2;
        this.answer = r3;
        this.itemOrder = r4;
    }

    public /* synthetic */ FAQItem(int r3, String r4, String r5, int r6, int r7, AbstractC0621Oc r8) {
        if ((r7 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r7 & 8) == 0) goto L14;
        r6 = 0;
    L14:
        this(r3, r4, r5, r6);
    }
}
