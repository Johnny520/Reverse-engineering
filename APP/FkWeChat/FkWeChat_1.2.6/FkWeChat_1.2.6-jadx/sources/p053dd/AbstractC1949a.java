package p053dd;

import md.AbstractC5161p;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: renamed from: dd.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1949a {

    /* JADX INFO: renamed from: dd.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {
        public final String aeskey;
        public final boolean allow_mobile_net_download;
        public final int apptype;
        public final String argInfo;
        public final String bakup_url;
        public final String bigfileSignature;
        public final byte[] bizReqPayLoad;
        public final int bizid;
        public final int certificateVerifyPolicy;
        public final int chatType;
        public final String clientTag;
        public final int concurrentCount;
        public final int connectionCount;
        public final String customHeader;
        public final String debugIP;
        public final int downloadBehavior;
        public final int downloadMode;
        public final String expectFileMD5;
        public final long expectFileSize;
        public final String fakeBigfileSignature;
        public final String fakeBigfileSignatureAeskey;
        public final String feedId;
        public final String fileKey;
        public final int fileType;
        public final String fileid;
        public final String finderByPass;
        public final byte[] finderMediaCdnInfo;
        public final String hlsVideoFlag;
        public final String host;
        public final String httpMethod;
        public final String initialIV;
        public final boolean isAutoStart;
        public final boolean isColdSnsData;
        public final boolean isHLSVideo;
        public final boolean isHotSnsVideo;
        public final boolean isLargeSVideo;
        public final boolean isSilentTask;
        public final boolean isSmallVideo;
        public final boolean isStorageMode;
        public final boolean is_resume_task;
        public final long maxFileSize;
        public final int maxHttpRedirectCount;
        public final int maxPCDNConnections;
        public final String methodName;
        public final String msgExtra;
        public final int msgType;
        public final String netflowTag;
        public final int pcdnAppID;
        public final boolean preAllocStorage;
        public final long preloadMinSize;
        public final int preloadRatio;
        public final int queueTimeoutSeconds;
        public final String referer;
        public final boolean reportDetailPacketTransInfo;
        public final String requestVideoFlag;
        public final int requestVideoFormat;
        public final int resolveHostFlags;
        public final int resolveHostPriority;
        public final String savePath;
        public final String serialized_verify_headers;
        public final String signalQuality;
        public final String snsCipherKey;
        public final String snsScene;
        public final String snsVideoStragegy;
        public final String statePath;
        public final int statefileKeepHours;
        public final int[] supportFormats;
        public final int taskGroupCapacity;
        public final String taskGroupKey;
        public final long taskStartTime;
        public final int transforTimeoutSeconds;
        public final boolean treatAsVideoFile;
        public final boolean tryRealtimeTransportProtocol;
        public final String url;
        public final boolean useNewdns;
        public final int videoDownloadMode;
        public final int videoflagPolicy;
        public final boolean wifiAutoStart;

        public a(Object obj, String str) {
            this.methodName = str;
            this.fileKey = AbstractC1949a.m7070l(obj, "fileKey");
            this.argInfo = AbstractC1949a.m7070l(obj, "argInfo");
            this.debugIP = AbstractC1949a.m7070l(obj, "debugIP");
            this.url = AbstractC1949a.m7070l(obj, "url");
            this.host = AbstractC1949a.m7070l(obj, "host");
            this.referer = AbstractC1949a.m7070l(obj, "referer");
            this.savePath = AbstractC1949a.m7070l(obj, "savePath");
            this.statePath = AbstractC1949a.m7070l(obj, "statePath");
            this.aeskey = AbstractC1949a.m7070l(obj, "aeskey");
            this.initialIV = AbstractC1949a.m7070l(obj, "initialIV");
            this.fileid = AbstractC1949a.m7070l(obj, "fileid");
            this.netflowTag = AbstractC1949a.m7070l(obj, "netflowTag");
            this.expectFileMD5 = AbstractC1949a.m7070l(obj, "expectFileMD5");
            this.msgExtra = AbstractC1949a.m7070l(obj, "msgExtra");
            this.bigfileSignature = AbstractC1949a.m7070l(obj, "bigfileSignature");
            this.requestVideoFlag = AbstractC1949a.m7070l(obj, "requestVideoFlag");
            this.hlsVideoFlag = AbstractC1949a.m7070l(obj, "hlsVideoFlag");
            this.finderByPass = AbstractC1949a.m7070l(obj, "finderByPass");
            this.snsCipherKey = AbstractC1949a.m7070l(obj, "snsCipherKey");
            this.signalQuality = AbstractC1949a.m7070l(obj, "signalQuality");
            this.snsScene = AbstractC1949a.m7070l(obj, "snsScene");
            this.customHeader = AbstractC1949a.m7070l(obj, "customHeader");
            this.fakeBigfileSignature = AbstractC1949a.m7070l(obj, "fakeBigfileSignature");
            this.fakeBigfileSignatureAeskey = AbstractC1949a.m7070l(obj, "fakeBigfileSignatureAeskey");
            this.bakup_url = AbstractC1949a.m7070l(obj, "bakup_url");
            this.serialized_verify_headers = AbstractC1949a.m7070l(obj, "serialized_verify_headers");
            this.feedId = AbstractC1949a.m7070l(obj, "feedId");
            this.httpMethod = AbstractC1949a.m7070l(obj, "httpMethod");
            this.snsVideoStragegy = AbstractC1949a.m7070l(obj, "snsVideoStragegy");
            this.clientTag = AbstractC1949a.m7070l(obj, "clientTag");
            this.taskGroupKey = AbstractC1949a.m7070l(obj, "taskGroupKey");
            this.fileType = AbstractC1949a.m7068j(obj, "fileType");
            this.bizid = AbstractC1949a.m7068j(obj, "bizid");
            this.apptype = AbstractC1949a.m7068j(obj, "apptype");
            this.queueTimeoutSeconds = AbstractC1949a.m7068j(obj, "queueTimeoutSeconds");
            this.transforTimeoutSeconds = AbstractC1949a.m7068j(obj, "transforTimeoutSeconds");
            this.downloadMode = AbstractC1949a.m7068j(obj, "downloadMode");
            this.chatType = AbstractC1949a.m7068j(obj, "chatType");
            this.downloadBehavior = AbstractC1949a.m7068j(obj, "downloadBehavior");
            this.requestVideoFormat = AbstractC1949a.m7068j(obj, "requestVideoFormat");
            this.videoflagPolicy = AbstractC1949a.m7068j(obj, "videoflagPolicy");
            this.preloadRatio = AbstractC1949a.m7068j(obj, "preloadRatio");
            this.msgType = AbstractC1949a.m7068j(obj, "msgType");
            this.concurrentCount = AbstractC1949a.m7068j(obj, "concurrentCount");
            this.maxHttpRedirectCount = AbstractC1949a.m7068j(obj, "maxHttpRedirectCount");
            this.connectionCount = AbstractC1949a.m7068j(obj, "connectionCount");
            this.certificateVerifyPolicy = AbstractC1949a.m7068j(obj, "certificateVerifyPolicy");
            this.pcdnAppID = AbstractC1949a.m7068j(obj, "pcdnAppID");
            this.videoDownloadMode = AbstractC1949a.m7068j(obj, "videoDownloadMode");
            this.statefileKeepHours = AbstractC1949a.m7068j(obj, "statefileKeepHours");
            this.taskGroupCapacity = AbstractC1949a.m7068j(obj, "taskGroupCapacity");
            this.resolveHostPriority = AbstractC1949a.m7068j(obj, "resolveHostPriority");
            this.resolveHostFlags = AbstractC1949a.m7068j(obj, "resolveHostFlags");
            this.maxPCDNConnections = AbstractC1949a.m7068j(obj, "maxPCDNConnections");
            this.expectFileSize = AbstractC1949a.m7069k(obj, "expectFileSize");
            this.preloadMinSize = AbstractC1949a.m7069k(obj, "preloadMinSize");
            this.taskStartTime = AbstractC1949a.m7069k(obj, "taskStartTime");
            this.maxFileSize = AbstractC1949a.m7069k(obj, "maxFileSize");
            this.isSilentTask = AbstractC1949a.m7065g(obj, "isSilentTask");
            this.isStorageMode = AbstractC1949a.m7065g(obj, "isStorageMode");
            this.isSmallVideo = AbstractC1949a.m7065g(obj, "isSmallVideo");
            this.isLargeSVideo = AbstractC1949a.m7065g(obj, "isLargeSVideo");
            this.isAutoStart = AbstractC1949a.m7065g(obj, "isAutoStart");
            this.isColdSnsData = AbstractC1949a.m7065g(obj, "isColdSnsData");
            this.isHotSnsVideo = AbstractC1949a.m7065g(obj, "isHotSnsVideo");
            this.isHLSVideo = AbstractC1949a.m7065g(obj, "isHLSVideo");
            this.treatAsVideoFile = AbstractC1949a.m7065g(obj, "treatAsVideoFile");
            this.preAllocStorage = AbstractC1949a.m7065g(obj, "preAllocStorage");
            this.allow_mobile_net_download = AbstractC1949a.m7065g(obj, "allow_mobile_net_download");
            this.is_resume_task = AbstractC1949a.m7065g(obj, "is_resume_task");
            this.wifiAutoStart = AbstractC1949a.m7065g(obj, "wifiAutoStart");
            this.useNewdns = AbstractC1949a.m7065g(obj, "useNewdns");
            this.tryRealtimeTransportProtocol = AbstractC1949a.m7065g(obj, "tryRealtimeTransportProtocol");
            this.reportDetailPacketTransInfo = AbstractC1949a.m7065g(obj, "reportDetailPacketTransInfo");
            this.bizReqPayLoad = AbstractC1949a.m7066h(obj, "bizReqPayLoad");
            this.finderMediaCdnInfo = AbstractC1949a.m7066h(obj, "finderMediaCdnInfo");
            this.supportFormats = AbstractC1949a.m7067i(obj, "supportFormats");
        }
    }

    /* JADX INFO: renamed from: dd.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class b {
        public final int apptype;
        public final String bigfileSignature;
        public final byte[] bizReqPayLoad;
        public final boolean bizSnsPreUpload;
        public final int bizid;
        public final int chatType;
        public final boolean checkExistOnly;
        public final String clientTag;
        public final int concurrentCount;
        public final String customHeader;
        public final String debugIP;
        public final String emojiExtinfo;
        public final boolean enableHitCheck;
        public final String fakeBigfileSignature;
        public final String fakeBigfileSignatureAeskey;
        public final byte[] fileBuffer;
        public final int fileFormat;
        public final String fileKey;
        public final String filePath;
        public final int fileType;
        public final String filemd5;
        public final boolean forceNoSafeCdn;
        public final String forwardAeskey;
        public final String forwardFileid;
        public final String host;
        public final int isLargeSVideo;
        public final boolean isSmallVideo;
        public final boolean isSnsAdVideo;
        public final boolean isStorageMode;
        public final String methodName;
        public final int midFormat;
        public final String midimgPath;
        public final String netflowTag;
        public final int queueTimeoutSeconds;
        public final boolean sendmsgFromCDN;
        public final String serverGroupKey;
        public final String statePath;
        public final int thumbFileType;
        public final String thumbfilePath;
        public final byte[] thumbnailBuffer;
        public final String toUser;
        public final int transforTimeoutSeconds;
        public final boolean tryRealtimeTransportProtocol;
        public final boolean trySafeCdn;
        public final int uploadFrom;
        public final String uri;
        public final int videoSource;

        public b(Object obj, String str) {
            this.methodName = str;
            this.fileKey = AbstractC1949a.m7070l(obj, "fileKey");
            this.toUser = AbstractC1949a.m7070l(obj, "toUser");
            this.debugIP = AbstractC1949a.m7070l(obj, "debugIP");
            this.netflowTag = AbstractC1949a.m7070l(obj, "netflowTag");
            this.forwardFileid = AbstractC1949a.m7070l(obj, "forwardFileid");
            this.forwardAeskey = AbstractC1949a.m7070l(obj, "forwardAeskey");
            this.bigfileSignature = AbstractC1949a.m7070l(obj, "bigfileSignature");
            this.host = AbstractC1949a.m7070l(obj, "host");
            this.filemd5 = AbstractC1949a.m7070l(obj, "filemd5");
            this.filePath = AbstractC1949a.m7070l(obj, "filePath");
            this.midimgPath = AbstractC1949a.m7070l(obj, "midimgPath");
            this.thumbfilePath = AbstractC1949a.m7070l(obj, "thumbfilePath");
            this.fakeBigfileSignature = AbstractC1949a.m7070l(obj, "fakeBigfileSignature");
            this.fakeBigfileSignatureAeskey = AbstractC1949a.m7070l(obj, "fakeBigfileSignatureAeskey");
            this.statePath = AbstractC1949a.m7070l(obj, "statePath");
            this.uri = AbstractC1949a.m7070l(obj, "uri");
            this.emojiExtinfo = AbstractC1949a.m7070l(obj, "emojiExtinfo");
            this.customHeader = AbstractC1949a.m7070l(obj, "customHeader");
            this.clientTag = AbstractC1949a.m7070l(obj, "clientTag");
            this.serverGroupKey = AbstractC1949a.m7070l(obj, "serverGroupKey");
            this.queueTimeoutSeconds = AbstractC1949a.m7068j(obj, "queueTimeoutSeconds");
            this.transforTimeoutSeconds = AbstractC1949a.m7068j(obj, "transforTimeoutSeconds");
            this.isLargeSVideo = AbstractC1949a.m7068j(obj, "isLargeSVideo");
            this.videoSource = AbstractC1949a.m7068j(obj, "videoSource");
            this.chatType = AbstractC1949a.m7068j(obj, "chatType");
            this.fileType = AbstractC1949a.m7068j(obj, "fileType");
            this.fileFormat = AbstractC1949a.m7068j(obj, "fileFormat");
            this.midFormat = AbstractC1949a.m7068j(obj, "midFormat");
            this.thumbFileType = AbstractC1949a.m7068j(obj, "thumbFileType");
            this.concurrentCount = AbstractC1949a.m7068j(obj, "concurrentCount");
            this.bizid = AbstractC1949a.m7068j(obj, "bizid");
            this.apptype = AbstractC1949a.m7068j(obj, "apptype");
            this.uploadFrom = AbstractC1949a.m7068j(obj, "uploadFrom");
            this.sendmsgFromCDN = AbstractC1949a.m7065g(obj, "sendmsgFromCDN");
            this.checkExistOnly = AbstractC1949a.m7065g(obj, "checkExistOnly");
            this.isSmallVideo = AbstractC1949a.m7065g(obj, "isSmallVideo");
            this.isSnsAdVideo = AbstractC1949a.m7065g(obj, "isSnsAdVideo");
            this.isStorageMode = AbstractC1949a.m7065g(obj, "isStorageMode");
            this.forceNoSafeCdn = AbstractC1949a.m7065g(obj, "forceNoSafeCdn");
            this.trySafeCdn = AbstractC1949a.m7065g(obj, "trySafeCdn");
            this.enableHitCheck = AbstractC1949a.m7065g(obj, "enableHitCheck");
            this.tryRealtimeTransportProtocol = AbstractC1949a.m7065g(obj, "tryRealtimeTransportProtocol");
            this.bizSnsPreUpload = AbstractC1949a.m7065g(obj, "bizSnsPreUpload");
            this.bizReqPayLoad = AbstractC1949a.m7066h(obj, "bizReqPayLoad");
            this.fileBuffer = AbstractC1949a.m7066h(obj, "fileBuffer");
            this.thumbnailBuffer = AbstractC1949a.m7066h(obj, "thumbnailBuffer");
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7065g(Object obj, String str) {
        try {
            return AbstractC5161p.getBooleanField(obj, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m7066h(Object obj, String str) {
        try {
            return (byte[]) AbstractC5161p.getObjectField(obj, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int[] m7067i(Object obj, String str) {
        try {
            return (int[]) AbstractC5161p.getObjectField(obj, str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m7068j(Object obj, String str) {
        try {
            return AbstractC5161p.getIntField(obj, str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: k */
    public static long m7069k(Object obj, String str) {
        try {
            return AbstractC5161p.getLongField(obj, str);
        } catch (Throwable unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m7070l(Object obj, String str) {
        try {
            Object objectField = AbstractC5161p.getObjectField(obj, str);
            return objectField == null ? _UrlKt.FRAGMENT_ENCODE_SET : objectField.toString();
        } catch (Throwable unused) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
    }
}
