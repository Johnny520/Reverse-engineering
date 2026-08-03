package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public enum TalkingDataSharingFilter extends java.lang.Enum<com.tendcloud.tenddata.TalkingDataSharingFilter> {
    public static final com.tendcloud.tenddata.TalkingDataSharingFilter ONLY_INSTALL = null;
    public static final com.tendcloud.tenddata.TalkingDataSharingFilter SHARE = null;
    public static final com.tendcloud.tenddata.TalkingDataSharingFilter UNSHARE = null;
    private static final /* synthetic */ com.tendcloud.tenddata.TalkingDataSharingFilter[] a = null;

    static {
            com.tendcloud.tenddata.TalkingDataSharingFilter r0 = new com.tendcloud.tenddata.TalkingDataSharingFilter
            java.lang.String r1 = "SHARE"
            r2 = 0
            r0.<init>(r1, r2)
            com.tendcloud.tenddata.TalkingDataSharingFilter.SHARE = r0
            com.tendcloud.tenddata.TalkingDataSharingFilter r1 = new com.tendcloud.tenddata.TalkingDataSharingFilter
            java.lang.String r3 = "ONLY_INSTALL"
            r4 = 1
            r1.<init>(r3, r4)
            com.tendcloud.tenddata.TalkingDataSharingFilter.ONLY_INSTALL = r1
            com.tendcloud.tenddata.TalkingDataSharingFilter r3 = new com.tendcloud.tenddata.TalkingDataSharingFilter
            java.lang.String r5 = "UNSHARE"
            r6 = 2
            r3.<init>(r5, r6)
            com.tendcloud.tenddata.TalkingDataSharingFilter.UNSHARE = r3
            r5 = 3
            com.tendcloud.tenddata.TalkingDataSharingFilter[] r5 = new com.tendcloud.tenddata.TalkingDataSharingFilter[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.tendcloud.tenddata.TalkingDataSharingFilter.a = r5
            return
    }

    TalkingDataSharingFilter(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.tendcloud.tenddata.TalkingDataSharingFilter valueOf(java.lang.String r1) {
            java.lang.Class<com.tendcloud.tenddata.TalkingDataSharingFilter> r0 = com.tendcloud.tenddata.TalkingDataSharingFilter.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.tendcloud.tenddata.TalkingDataSharingFilter r1 = (com.tendcloud.tenddata.TalkingDataSharingFilter) r1
            return r1
    }

    public static com.tendcloud.tenddata.TalkingDataSharingFilter[] values() {
            com.tendcloud.tenddata.TalkingDataSharingFilter[] r0 = com.tendcloud.tenddata.TalkingDataSharingFilter.a
            java.lang.Object r0 = r0.clone()
            com.tendcloud.tenddata.TalkingDataSharingFilter[] r0 = (com.tendcloud.tenddata.TalkingDataSharingFilter[]) r0
            return r0
    }
}
