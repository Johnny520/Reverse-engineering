package h.Hchat.hooks.api.model;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ContactLabelBean {
    public static final int $stable = 8;
    public final java.lang.String labelId;
    public final java.lang.String labelName;
    public final java.util.List<java.lang.String> userNameList;

    public ContactLabelBean(java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            if (r2 != 0) goto L8
            r2 = r0
        L8:
            r1.labelId = r2
            if (r3 != 0) goto Ld
            r3 = r0
        Ld:
            r1.labelName = r3
            if (r4 == 0) goto L16
            java.util.List r2 = tf.m.P1(r4)
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 != 0) goto L1b
            tf.t r2 = tf.t.f13167g
        L1b:
            r1.userNameList = r2
            return
    }

    public final java.util.List<java.lang.String> getContactList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.userNameList
            return r0
    }

    public final java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.labelId
            return r0
    }

    public final java.lang.String getLabelId() {
            r1 = this;
            java.lang.String r0 = r1.labelId
            return r0
    }

    public final java.lang.String getLabelName() {
            r1 = this;
            java.lang.String r0 = r1.labelName
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.labelName
            return r0
    }

    public final java.util.List<java.lang.String> getUserNameList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.userNameList
            return r0
    }

    public final java.util.List<java.lang.String> getUsernameList() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.userNameList
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.labelId
            java.lang.String r1 = r6.labelName
            java.util.List<java.lang.String> r2 = r6.userNameList
            java.lang.String r3 = ", labelName="
            java.lang.String r4 = ", userNameList="
            java.lang.String r5 = "ContactLabelBean(labelId="
            java.lang.StringBuilder r0 = bc.e.p(r5, r0, r3, r1, r4)
            r0.append(r2)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
