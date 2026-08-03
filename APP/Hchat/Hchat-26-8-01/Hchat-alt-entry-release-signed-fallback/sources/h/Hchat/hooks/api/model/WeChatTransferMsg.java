package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatTransferMsg {
    public static final int $stable = 0;
    public final java.lang.String description;
    public final long fee;
    public final long invalidTime;
    public final java.lang.String payer;
    public final java.lang.String payerUsername;
    public final java.lang.String rawXml;
    public final java.lang.String receiver;
    public final java.lang.String transId;
    public final java.lang.String transactionId;
    public final java.lang.String transferId;

    public WeChatTransferMsg(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5, long r7, java.lang.String r9, java.lang.String r10) {
            r0 = this;
            j8.b.q(r1, r2, r3, r4, r9)
            r10.getClass()
            r0.<init>()
            r0.transactionId = r1
            r0.transId = r2
            r0.payer = r3
            r0.receiver = r4
            r0.invalidTime = r5
            r0.fee = r7
            r0.description = r9
            r0.rawXml = r10
            r0.transferId = r2
            r0.payerUsername = r3
            return
    }

    public static /* synthetic */ h.Hchat.hooks.api.model.WeChatTransferMsg copy$default(h.Hchat.hooks.api.model.WeChatTransferMsg r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5, long r7, java.lang.String r9, java.lang.String r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r1 = r0.transactionId
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            java.lang.String r2 = r0.transId
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L12
            java.lang.String r3 = r0.payer
        L12:
            r12 = r11 & 8
            if (r12 == 0) goto L18
            java.lang.String r4 = r0.receiver
        L18:
            r12 = r11 & 16
            if (r12 == 0) goto L1e
            long r5 = r0.invalidTime
        L1e:
            r12 = r11 & 32
            if (r12 == 0) goto L24
            long r7 = r0.fee
        L24:
            r12 = r11 & 64
            if (r12 == 0) goto L2a
            java.lang.String r9 = r0.description
        L2a:
            r11 = r11 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L30
            java.lang.String r10 = r0.rawXml
        L30:
            r11 = r9
            r12 = r10
            r9 = r7
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            h.Hchat.hooks.api.model.WeChatTransferMsg r0 = r2.copy(r3, r4, r5, r6, r7, r9, r11, r12)
            return r0
    }

    public final java.lang.String component1() {
            r1 = this;
            java.lang.String r0 = r1.transactionId
            return r0
    }

    public final java.lang.String component2() {
            r1 = this;
            java.lang.String r0 = r1.transId
            return r0
    }

    public final java.lang.String component3() {
            r1 = this;
            java.lang.String r0 = r1.payer
            return r0
    }

    public final java.lang.String component4() {
            r1 = this;
            java.lang.String r0 = r1.receiver
            return r0
    }

    public final long component5() {
            r2 = this;
            long r0 = r2.invalidTime
            return r0
    }

    public final long component6() {
            r2 = this;
            long r0 = r2.fee
            return r0
    }

    public final java.lang.String component7() {
            r1 = this;
            java.lang.String r0 = r1.description
            return r0
    }

    public final java.lang.String component8() {
            r1 = this;
            java.lang.String r0 = r1.rawXml
            return r0
    }

    public final h.Hchat.hooks.api.model.WeChatTransferMsg copy(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, long r16, long r18, java.lang.String r20, java.lang.String r21) {
            r11 = this;
            r9 = r20
            j8.b.q(r12, r13, r14, r15, r9)
            r21.getClass()
            h.Hchat.hooks.api.model.WeChatTransferMsg r0 = new h.Hchat.hooks.api.model.WeChatTransferMsg
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h.Hchat.hooks.api.model.WeChatTransferMsg
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h.Hchat.hooks.api.model.WeChatTransferMsg r8 = (h.Hchat.hooks.api.model.WeChatTransferMsg) r8
            java.lang.String r1 = r7.transactionId
            java.lang.String r3 = r8.transactionId
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.transId
            java.lang.String r3 = r8.transId
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.payer
            java.lang.String r3 = r8.payer
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.receiver
            java.lang.String r3 = r8.receiver
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.invalidTime
            long r5 = r8.invalidTime
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L41
            return r2
        L41:
            long r3 = r7.fee
            long r5 = r8.fee
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L4a
            return r2
        L4a:
            java.lang.String r1 = r7.description
            java.lang.String r3 = r8.description
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            java.lang.String r1 = r7.rawXml
            java.lang.String r8 = r8.rawXml
            boolean r8 = gg.l.a(r1, r8)
            if (r8 != 0) goto L60
            return r2
        L60:
            return r0
    }

    public final java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.description
            return r0
    }

    public final long getFee() {
            r2 = this;
            long r0 = r2.fee
            return r0
    }

    public final long getInvalidTime() {
            r2 = this;
            long r0 = r2.invalidTime
            return r0
    }

    public final java.lang.String getPayer() {
            r1 = this;
            java.lang.String r0 = r1.payer
            return r0
    }

    public final java.lang.String getPayerUsername() {
            r1 = this;
            java.lang.String r0 = r1.payerUsername
            return r0
    }

    public final java.lang.String getRawXml() {
            r1 = this;
            java.lang.String r0 = r1.rawXml
            return r0
    }

    public final java.lang.String getReceiver() {
            r1 = this;
            java.lang.String r0 = r1.receiver
            return r0
    }

    public final java.lang.String getTransId() {
            r1 = this;
            java.lang.String r0 = r1.transId
            return r0
    }

    public final java.lang.String getTransactionId() {
            r1 = this;
            java.lang.String r0 = r1.transactionId
            return r0
    }

    public final java.lang.String getTransferId() {
            r1 = this;
            java.lang.String r0 = r1.transferId
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.transactionId
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.transId
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.payer
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.receiver
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.invalidTime
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.fee
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.description
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r4.rawXml
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r13 = this;
            java.lang.String r0 = r13.transactionId
            java.lang.String r1 = r13.transId
            java.lang.String r2 = r13.payer
            java.lang.String r3 = r13.receiver
            long r4 = r13.invalidTime
            long r6 = r13.fee
            java.lang.String r8 = r13.description
            java.lang.String r9 = r13.rawXml
            java.lang.String r10 = ", transId="
            java.lang.String r11 = ", payer="
            java.lang.String r12 = "WeChatTransferMsg(transactionId="
            java.lang.StringBuilder r0 = bc.e.p(r12, r0, r10, r1, r11)
            java.lang.String r1 = ", receiver="
            java.lang.String r10 = ", invalidTime="
            j8.b.t(r0, r2, r1, r3, r10)
            r0.append(r4)
            java.lang.String r1 = ", fee="
            java.lang.String r2 = ", description="
            j8.b.s(r0, r1, r6, r2)
            java.lang.String r1 = ", rawXml="
            java.lang.String r2 = ")"
            java.lang.String r0 = j8.b.k(r0, r8, r1, r9, r2)
            return r0
    }
}
