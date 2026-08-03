package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public enum TalkingDataGender extends java.lang.Enum<com.tendcloud.tenddata.TalkingDataGender> {
    public static final com.tendcloud.tenddata.TalkingDataGender FEMALE = null;
    public static final com.tendcloud.tenddata.TalkingDataGender MALE = null;
    public static final com.tendcloud.tenddata.TalkingDataGender UNKNOWN = null;
    private static final /* synthetic */ com.tendcloud.tenddata.TalkingDataGender[] b = null;
    private final int a;

    static {
            com.tendcloud.tenddata.TalkingDataGender r0 = new com.tendcloud.tenddata.TalkingDataGender
            java.lang.String r1 = "UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.tendcloud.tenddata.TalkingDataGender.UNKNOWN = r0
            com.tendcloud.tenddata.TalkingDataGender r1 = new com.tendcloud.tenddata.TalkingDataGender
            java.lang.String r3 = "MALE"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.tendcloud.tenddata.TalkingDataGender.MALE = r1
            com.tendcloud.tenddata.TalkingDataGender r3 = new com.tendcloud.tenddata.TalkingDataGender
            java.lang.String r5 = "FEMALE"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.tendcloud.tenddata.TalkingDataGender.FEMALE = r3
            r5 = 3
            com.tendcloud.tenddata.TalkingDataGender[] r5 = new com.tendcloud.tenddata.TalkingDataGender[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.tendcloud.tenddata.TalkingDataGender.b = r5
            return
    }

    TalkingDataGender(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            return
    }

    public static com.tendcloud.tenddata.TalkingDataGender valueOf(java.lang.String r1) {
            java.lang.Class<com.tendcloud.tenddata.TalkingDataGender> r0 = com.tendcloud.tenddata.TalkingDataGender.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.tendcloud.tenddata.TalkingDataGender r1 = (com.tendcloud.tenddata.TalkingDataGender) r1
            return r1
    }

    public static com.tendcloud.tenddata.TalkingDataGender[] values() {
            com.tendcloud.tenddata.TalkingDataGender[] r0 = com.tendcloud.tenddata.TalkingDataGender.b
            java.lang.Object r0 = r0.clone()
            com.tendcloud.tenddata.TalkingDataGender[] r0 = (com.tendcloud.tenddata.TalkingDataGender[]) r0
            return r0
    }

    public int index() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
