package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class af {

    public enum Gender extends java.lang.Enum<com.tendcloud.tenddata.af.Gender> {
        private static final /* synthetic */ com.tendcloud.tenddata.af.Gender[] $VALUES = null;
        public static final com.tendcloud.tenddata.af.Gender FEMALE = null;
        public static final com.tendcloud.tenddata.af.Gender MALE = null;
        public static final com.tendcloud.tenddata.af.Gender UNKNOW = null;
        private final int index;

        static {
                com.tendcloud.tenddata.af$Gender r0 = new com.tendcloud.tenddata.af$Gender
                java.lang.String r1 = "UNKNOW"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.tendcloud.tenddata.af.Gender.UNKNOW = r0
                com.tendcloud.tenddata.af$Gender r1 = new com.tendcloud.tenddata.af$Gender
                java.lang.String r3 = "MALE"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.tendcloud.tenddata.af.Gender.MALE = r1
                com.tendcloud.tenddata.af$Gender r3 = new com.tendcloud.tenddata.af$Gender
                java.lang.String r5 = "FEMALE"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.tendcloud.tenddata.af.Gender.FEMALE = r3
                r5 = 3
                com.tendcloud.tenddata.af$Gender[] r5 = new com.tendcloud.tenddata.af.Gender[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.tendcloud.tenddata.af.Gender.$VALUES = r5
                return
        }

        Gender(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.index = r3
                return
        }

        public static com.tendcloud.tenddata.af.Gender valueOf(java.lang.String r1) {
                java.lang.Class<com.tendcloud.tenddata.af$Gender> r0 = com.tendcloud.tenddata.af.Gender.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.tendcloud.tenddata.af$Gender r1 = (com.tendcloud.tenddata.af.Gender) r1
                return r1
        }

        public static com.tendcloud.tenddata.af.Gender[] values() {
                com.tendcloud.tenddata.af$Gender[] r0 = com.tendcloud.tenddata.af.Gender.$VALUES
                java.lang.Object r0 = r0.clone()
                com.tendcloud.tenddata.af$Gender[] r0 = (com.tendcloud.tenddata.af.Gender[]) r0
                return r0
        }

        public int index() {
                r1 = this;
                int r0 = r1.index
                return r0
        }
    }

    public enum ProfileType extends java.lang.Enum<com.tendcloud.tenddata.af.ProfileType> {
        private static final /* synthetic */ com.tendcloud.tenddata.af.ProfileType[] $VALUES = null;
        public static final com.tendcloud.tenddata.af.ProfileType ANONYMOUS = null;
        public static final com.tendcloud.tenddata.af.ProfileType ND91 = null;
        public static final com.tendcloud.tenddata.af.ProfileType QQ = null;
        public static final com.tendcloud.tenddata.af.ProfileType QQ_WEIBO = null;
        public static final com.tendcloud.tenddata.af.ProfileType REGISTERED = null;
        public static final com.tendcloud.tenddata.af.ProfileType SINA_WEIBO = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE1 = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE10 = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE2 = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE3 = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE4 = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE5 = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE6 = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE7 = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE8 = null;
        public static final com.tendcloud.tenddata.af.ProfileType TYPE9 = null;
        public static final com.tendcloud.tenddata.af.ProfileType WEIXIN = null;
        private final int index;

        static {
                com.tendcloud.tenddata.af$ProfileType r0 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r1 = "ANONYMOUS"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.tendcloud.tenddata.af.ProfileType.ANONYMOUS = r0
                com.tendcloud.tenddata.af$ProfileType r1 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r3 = "REGISTERED"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.tendcloud.tenddata.af.ProfileType.REGISTERED = r1
                com.tendcloud.tenddata.af$ProfileType r3 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r5 = "SINA_WEIBO"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.tendcloud.tenddata.af.ProfileType.SINA_WEIBO = r3
                com.tendcloud.tenddata.af$ProfileType r5 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r7 = "QQ"
                r8 = 3
                r5.<init>(r7, r8, r8)
                com.tendcloud.tenddata.af.ProfileType.QQ = r5
                com.tendcloud.tenddata.af$ProfileType r7 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r9 = "QQ_WEIBO"
                r10 = 4
                r7.<init>(r9, r10, r10)
                com.tendcloud.tenddata.af.ProfileType.QQ_WEIBO = r7
                com.tendcloud.tenddata.af$ProfileType r9 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r11 = "ND91"
                r12 = 5
                r9.<init>(r11, r12, r12)
                com.tendcloud.tenddata.af.ProfileType.ND91 = r9
                com.tendcloud.tenddata.af$ProfileType r11 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r13 = "WEIXIN"
                r14 = 6
                r11.<init>(r13, r14, r14)
                com.tendcloud.tenddata.af.ProfileType.WEIXIN = r11
                com.tendcloud.tenddata.af$ProfileType r13 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r15 = "TYPE1"
                r14 = 7
                r12 = 11
                r13.<init>(r15, r14, r12)
                com.tendcloud.tenddata.af.ProfileType.TYPE1 = r13
                com.tendcloud.tenddata.af$ProfileType r15 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r14 = "TYPE2"
                r10 = 8
                r8 = 12
                r15.<init>(r14, r10, r8)
                com.tendcloud.tenddata.af.ProfileType.TYPE2 = r15
                com.tendcloud.tenddata.af$ProfileType r14 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r10 = "TYPE3"
                r6 = 9
                r4 = 13
                r14.<init>(r10, r6, r4)
                com.tendcloud.tenddata.af.ProfileType.TYPE3 = r14
                com.tendcloud.tenddata.af$ProfileType r10 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r6 = "TYPE4"
                r2 = 10
                r4 = 14
                r10.<init>(r6, r2, r4)
                com.tendcloud.tenddata.af.ProfileType.TYPE4 = r10
                com.tendcloud.tenddata.af$ProfileType r6 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r2 = "TYPE5"
                r4 = 15
                r6.<init>(r2, r12, r4)
                com.tendcloud.tenddata.af.ProfileType.TYPE5 = r6
                com.tendcloud.tenddata.af$ProfileType r2 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r12 = "TYPE6"
                r4 = 16
                r2.<init>(r12, r8, r4)
                com.tendcloud.tenddata.af.ProfileType.TYPE6 = r2
                com.tendcloud.tenddata.af$ProfileType r12 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r8 = "TYPE7"
                r4 = 17
                r16 = r2
                r2 = 13
                r12.<init>(r8, r2, r4)
                com.tendcloud.tenddata.af.ProfileType.TYPE7 = r12
                com.tendcloud.tenddata.af$ProfileType r2 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r8 = "TYPE8"
                r4 = 18
                r17 = r12
                r12 = 14
                r2.<init>(r8, r12, r4)
                com.tendcloud.tenddata.af.ProfileType.TYPE8 = r2
                com.tendcloud.tenddata.af$ProfileType r4 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r8 = "TYPE9"
                r12 = 19
                r18 = r2
                r2 = 15
                r4.<init>(r8, r2, r12)
                com.tendcloud.tenddata.af.ProfileType.TYPE9 = r4
                com.tendcloud.tenddata.af$ProfileType r2 = new com.tendcloud.tenddata.af$ProfileType
                java.lang.String r8 = "TYPE10"
                r12 = 20
                r19 = r4
                r4 = 16
                r2.<init>(r8, r4, r12)
                com.tendcloud.tenddata.af.ProfileType.TYPE10 = r2
                r4 = 17
                com.tendcloud.tenddata.af$ProfileType[] r4 = new com.tendcloud.tenddata.af.ProfileType[r4]
                r8 = 0
                r4[r8] = r0
                r0 = 1
                r4[r0] = r1
                r0 = 2
                r4[r0] = r3
                r0 = 3
                r4[r0] = r5
                r0 = 4
                r4[r0] = r7
                r0 = 5
                r4[r0] = r9
                r0 = 6
                r4[r0] = r11
                r0 = 7
                r4[r0] = r13
                r0 = 8
                r4[r0] = r15
                r0 = 9
                r4[r0] = r14
                r0 = 10
                r4[r0] = r10
                r0 = 11
                r4[r0] = r6
                r0 = 12
                r4[r0] = r16
                r0 = 13
                r4[r0] = r17
                r0 = 14
                r4[r0] = r18
                r0 = 15
                r4[r0] = r19
                r0 = 16
                r4[r0] = r2
                com.tendcloud.tenddata.af.ProfileType.$VALUES = r4
                return
        }

        ProfileType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.index = r3
                return
        }

        public static com.tendcloud.tenddata.af.ProfileType valueOf(java.lang.String r1) {
                java.lang.Class<com.tendcloud.tenddata.af$ProfileType> r0 = com.tendcloud.tenddata.af.ProfileType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.tendcloud.tenddata.af$ProfileType r1 = (com.tendcloud.tenddata.af.ProfileType) r1
                return r1
        }

        public static com.tendcloud.tenddata.af.ProfileType[] values() {
                com.tendcloud.tenddata.af$ProfileType[] r0 = com.tendcloud.tenddata.af.ProfileType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.tendcloud.tenddata.af$ProfileType[] r0 = (com.tendcloud.tenddata.af.ProfileType[]) r0
                return r0
        }

        public int index() {
                r1 = this;
                int r0 = r1.index
                return r0
        }
    }

    public af() {
            r0 = this;
            r0.<init>()
            return
    }
}
