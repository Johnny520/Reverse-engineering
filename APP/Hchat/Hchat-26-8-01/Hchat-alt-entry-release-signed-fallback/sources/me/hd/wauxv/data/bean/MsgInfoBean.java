package me.hd.wauxv.data.bean;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class MsgInfoBean {
    public java.lang.String content;
    public long createTime;
    public java.lang.String kind;
    public long msgId;
    public java.lang.String msgSource;
    public long msgSvrId;
    public java.lang.String msgType;
    public java.lang.String nativeUrl;
    public java.lang.String selfWxId;
    public java.lang.String sendTalker;
    public java.lang.String sender;
    public java.lang.String senderId;
    public java.lang.String source;
    public java.lang.String talker;
    public java.lang.String talkerId;
    public java.lang.String text;
    public java.lang.String type;
    public java.lang.String xml;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ImageMsg {
        public java.lang.String bigImgUrl;
        public int bigLength;
        public java.lang.String key;
        public java.lang.String md5;
        public java.lang.String midImgUrl;
        public int midLength;
        public int thumbLength;
        public java.lang.String thumbUrl;

        public ImageMsg() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.md5 = r0
                r1.bigImgUrl = r0
                r1.midImgUrl = r0
                r1.thumbUrl = r0
                r1.key = r0
                r0 = 0
                r1.bigLength = r0
                r1.midLength = r0
                r1.thumbLength = r0
                return
        }

        public ImageMsg(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
                r9 = this;
                r7 = 0
                r8 = 0
                r6 = 0
                r0 = r9
                r1 = r10
                r2 = r11
                r3 = r12
                r4 = r13
                r5 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        public ImageMsg(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, int r9, int r10) {
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.md5 = r0
                r2.bigImgUrl = r0
                r2.midImgUrl = r0
                r2.thumbUrl = r0
                r2.key = r0
                r1 = 0
                r2.bigLength = r1
                r2.midLength = r1
                r2.thumbLength = r1
                if (r3 == 0) goto L19
                goto L1a
            L19:
                r3 = r0
            L1a:
                r2.md5 = r3
                if (r4 == 0) goto L1f
                goto L20
            L1f:
                r4 = r0
            L20:
                r2.bigImgUrl = r4
                if (r5 == 0) goto L25
                goto L26
            L25:
                r5 = r0
            L26:
                r2.midImgUrl = r5
                if (r6 == 0) goto L2b
                goto L2c
            L2b:
                r6 = r0
            L2c:
                r2.thumbUrl = r6
                if (r7 == 0) goto L31
                goto L32
            L31:
                r7 = r0
            L32:
                r2.key = r7
                int r3 = java.lang.Math.max(r1, r8)
                r2.bigLength = r3
                int r3 = java.lang.Math.max(r1, r9)
                r2.midLength = r3
                int r3 = java.lang.Math.max(r1, r10)
                r2.thumbLength = r3
                return
        }

        public java.lang.String getAesKey() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public java.lang.String getBigImgUrl() {
                r1 = this;
                java.lang.String r0 = r1.bigImgUrl
                return r0
        }

        public int getBigLength() {
                r1 = this;
                int r0 = r1.bigLength
                return r0
        }

        public java.lang.String getCdnUrl() {
                r1 = this;
                java.lang.String r0 = r1.thumbUrl
                if (r0 == 0) goto Ld
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto Ld
                java.lang.String r0 = r1.thumbUrl
                return r0
            Ld:
                java.lang.String r0 = r1.midImgUrl
                if (r0 == 0) goto L1a
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L1a
                java.lang.String r0 = r1.midImgUrl
                return r0
            L1a:
                java.lang.String r0 = r1.bigImgUrl
                if (r0 == 0) goto L1f
                return r0
            L1f:
                java.lang.String r0 = ""
                return r0
        }

        public java.lang.String getKey() {
                r1 = this;
                java.lang.String r0 = r1.key
                return r0
        }

        public java.lang.String getMd5() {
                r1 = this;
                java.lang.String r0 = r1.md5
                return r0
        }

        public java.lang.String getMidImgUrl() {
                r1 = this;
                java.lang.String r0 = r1.midImgUrl
                return r0
        }

        public int getMidLength() {
                r1 = this;
                int r0 = r1.midLength
                return r0
        }

        public int getThumbLength() {
                r1 = this;
                int r0 = r1.thumbLength
                return r0
        }

        public java.lang.String getThumbUrl() {
                r1 = this;
                java.lang.String r0 = r1.thumbUrl
                return r0
        }
    }

    public MsgInfoBean() {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = ""
            r3.xml = r0
            r3.sender = r0
            r3.senderId = r0
            r3.sendTalker = r0
            r3.talker = r0
            r3.talkerId = r0
            r3.content = r0
            r3.text = r0
            r1 = 0
            r3.msgId = r1
            r3.msgType = r0
            r3.type = r0
            r3.createTime = r1
            r3.msgSvrId = r1
            r3.msgSource = r0
            r3.selfWxId = r0
            r3.source = r0
            r3.kind = r0
            r3.nativeUrl = r0
            return
    }
}
