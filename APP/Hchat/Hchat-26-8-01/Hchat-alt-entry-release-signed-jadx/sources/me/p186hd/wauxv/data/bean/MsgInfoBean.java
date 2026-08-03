package me.p186hd.wauxv.data.bean;

import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class MsgInfoBean {
    public String xml = HttpUrl.FRAGMENT_ENCODE_SET;
    public String sender = HttpUrl.FRAGMENT_ENCODE_SET;
    public String senderId = HttpUrl.FRAGMENT_ENCODE_SET;
    public String sendTalker = HttpUrl.FRAGMENT_ENCODE_SET;
    public String talker = HttpUrl.FRAGMENT_ENCODE_SET;
    public String talkerId = HttpUrl.FRAGMENT_ENCODE_SET;
    public String content = HttpUrl.FRAGMENT_ENCODE_SET;
    public String text = HttpUrl.FRAGMENT_ENCODE_SET;
    public long msgId = 0;
    public String msgType = HttpUrl.FRAGMENT_ENCODE_SET;
    public String type = HttpUrl.FRAGMENT_ENCODE_SET;
    public long createTime = 0;
    public long msgSvrId = 0;
    public String msgSource = HttpUrl.FRAGMENT_ENCODE_SET;
    public String selfWxId = HttpUrl.FRAGMENT_ENCODE_SET;
    public String source = HttpUrl.FRAGMENT_ENCODE_SET;
    public String kind = HttpUrl.FRAGMENT_ENCODE_SET;
    public String nativeUrl = HttpUrl.FRAGMENT_ENCODE_SET;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ImageMsg {
        public String bigImgUrl;
        public int bigLength;
        public String key;
        public String md5;
        public String midImgUrl;
        public int midLength;
        public int thumbLength;
        public String thumbUrl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ImageMsg(String str, String str2, String str3, String str4, String str5, int i9, int i10, int i11) {
            this.md5 = HttpUrl.FRAGMENT_ENCODE_SET;
            this.bigImgUrl = HttpUrl.FRAGMENT_ENCODE_SET;
            this.midImgUrl = HttpUrl.FRAGMENT_ENCODE_SET;
            this.thumbUrl = HttpUrl.FRAGMENT_ENCODE_SET;
            this.key = HttpUrl.FRAGMENT_ENCODE_SET;
            this.bigLength = 0;
            this.midLength = 0;
            this.thumbLength = 0;
            this.md5 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
            this.bigImgUrl = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
            this.midImgUrl = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
            this.thumbUrl = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
            this.key = str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
            this.bigLength = Math.max(0, i9);
            this.midLength = Math.max(0, i10);
            this.thumbLength = Math.max(0, i11);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String getAesKey() {
            return this.key;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String getBigImgUrl() {
            return this.bigImgUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int getBigLength() {
            return this.bigLength;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String getCdnUrl() {
            String str = this.thumbUrl;
            if (str != null && !str.isEmpty()) {
                return this.thumbUrl;
            }
            String str2 = this.midImgUrl;
            if (str2 != null && !str2.isEmpty()) {
                return this.midImgUrl;
            }
            String str3 = this.bigImgUrl;
            return str3 != null ? str3 : HttpUrl.FRAGMENT_ENCODE_SET;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String getKey() {
            return this.key;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String getMd5() {
            return this.md5;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String getMidImgUrl() {
            return this.midImgUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int getMidLength() {
            return this.midLength;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int getThumbLength() {
            return this.thumbLength;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String getThumbUrl() {
            return this.thumbUrl;
        }

        public ImageMsg(String str, String str2, String str3, String str4, String str5) {
            this(str, str2, str3, str4, str5, 0, 0, 0);
        }

        public ImageMsg() {
            this.md5 = HttpUrl.FRAGMENT_ENCODE_SET;
            this.bigImgUrl = HttpUrl.FRAGMENT_ENCODE_SET;
            this.midImgUrl = HttpUrl.FRAGMENT_ENCODE_SET;
            this.thumbUrl = HttpUrl.FRAGMENT_ENCODE_SET;
            this.key = HttpUrl.FRAGMENT_ENCODE_SET;
            this.bigLength = 0;
            this.midLength = 0;
            this.thumbLength = 0;
        }
    }
}
