package top.suzhelan.sticker.sdk.entity;

import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.jar.asm.Opcodes;
import p007.AbstractC6136;
import p267.InterfaceC8264;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\fHÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010D\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010,J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016HÆ\u0003J\u000f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016HÆ\u0003J\t\u0010I\u001a\u00020\fHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003Jø\u0001\u0010K\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010LJ\u0014\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010P\u001a\u00020\fHÖ\u0081\u0004J\n\u0010Q\u001a\u00020\u0003HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b.\u0010,R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0016\u0010\u0018\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001d¨\u0006R"}, d2 = {"Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;", "", "id", "", "title", "description", "uin", "nickname", "author", "archiveFileName", "archiveFileFormat", "archiveFileSize", "", "stickerCount", "coverFileName", "coverFileFormat", "coverFileSize", "coverWidth", "coverHeight", "archiveUrl", "coverUrl", "thumbnails", "", "tags", "downloadCount", "createdAt", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getDescription", "getUin", "getNickname", "getAuthor", "getArchiveFileName", "getArchiveFileFormat", "getArchiveFileSize", "()I", "getStickerCount", "getCoverFileName", "getCoverFileFormat", "getCoverFileSize", "getCoverWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCoverHeight", "getArchiveUrl", "getCoverUrl", "getThumbnails", "()Ljava/util/List;", "getTags", "getDownloadCount", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/String;)Ltop/suzhelan/sticker/sdk/entity/OnlineStickerInfo;", "equals", "", "other", "hashCode", "toString", "online-sticker-sdk_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class OnlineStickerInfo {

    @InterfaceC8264("archiveFileFormat")
    private final String archiveFileFormat;

    @InterfaceC8264("archiveFileName")
    private final String archiveFileName;

    @InterfaceC8264("archiveFileSize")
    private final int archiveFileSize;

    @InterfaceC8264("archiveUrl")
    private final String archiveUrl;

    @InterfaceC8264("author")
    private final String author;

    @InterfaceC8264("coverFileFormat")
    private final String coverFileFormat;

    @InterfaceC8264("coverFileName")
    private final String coverFileName;

    @InterfaceC8264("coverFileSize")
    private final int coverFileSize;

    @InterfaceC8264("coverHeight")
    private final Integer coverHeight;

    @InterfaceC8264("coverUrl")
    private final String coverUrl;

    @InterfaceC8264("coverWidth")
    private final Integer coverWidth;

    @InterfaceC8264("createdAt")
    private final String createdAt;

    @InterfaceC8264("description")
    private final String description;

    @InterfaceC8264("downloadCount")
    private final int downloadCount;

    @InterfaceC8264("id")
    private final String id;

    @InterfaceC8264("nickname")
    private final String nickname;

    @InterfaceC8264("stickerCount")
    private final int stickerCount;

    @InterfaceC8264("tags")
    private final List<String> tags;

    @InterfaceC8264("thumbnails")
    private final List<String> thumbnails;

    @InterfaceC8264("title")
    private final String title;

    @InterfaceC8264("uin")
    private final String uin;

    public OnlineStickerInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, int i3, Integer num, Integer num2, String str11, String str12, List<String> list, List<String> list2, int i4, String str13) {
        str.getClass();
        str2.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        str11.getClass();
        str12.getClass();
        list.getClass();
        list2.getClass();
        str13.getClass();
        this.id = str;
        this.title = str2;
        this.description = str3;
        this.uin = str4;
        this.nickname = str5;
        this.author = str6;
        this.archiveFileName = str7;
        this.archiveFileFormat = str8;
        this.archiveFileSize = i;
        this.stickerCount = i2;
        this.coverFileName = str9;
        this.coverFileFormat = str10;
        this.coverFileSize = i3;
        this.coverWidth = num;
        this.coverHeight = num2;
        this.archiveUrl = str11;
        this.coverUrl = str12;
        this.thumbnails = list;
        this.tags = list2;
        this.downloadCount = i4;
        this.createdAt = str13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnlineStickerInfo copy$default(OnlineStickerInfo onlineStickerInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, int i3, Integer num, Integer num2, String str11, String str12, List list, List list2, int i4, String str13, int i5, Object obj) {
        String str14;
        int i6;
        String str15 = (i5 & 1) != 0 ? onlineStickerInfo.id : str;
        String str16 = (i5 & 2) != 0 ? onlineStickerInfo.title : str2;
        String str17 = (i5 & 4) != 0 ? onlineStickerInfo.description : str3;
        String str18 = (i5 & 8) != 0 ? onlineStickerInfo.uin : str4;
        String str19 = (i5 & 16) != 0 ? onlineStickerInfo.nickname : str5;
        String str20 = (i5 & 32) != 0 ? onlineStickerInfo.author : str6;
        String str21 = (i5 & 64) != 0 ? onlineStickerInfo.archiveFileName : str7;
        String str22 = (i5 & 128) != 0 ? onlineStickerInfo.archiveFileFormat : str8;
        int i7 = (i5 & 256) != 0 ? onlineStickerInfo.archiveFileSize : i;
        int i8 = (i5 & 512) != 0 ? onlineStickerInfo.stickerCount : i2;
        String str23 = (i5 & 1024) != 0 ? onlineStickerInfo.coverFileName : str9;
        String str24 = (i5 & 2048) != 0 ? onlineStickerInfo.coverFileFormat : str10;
        int i9 = (i5 & 4096) != 0 ? onlineStickerInfo.coverFileSize : i3;
        Integer num3 = (i5 & 8192) != 0 ? onlineStickerInfo.coverWidth : num;
        String str25 = str15;
        Integer num4 = (i5 & 16384) != 0 ? onlineStickerInfo.coverHeight : num2;
        String str26 = (i5 & 32768) != 0 ? onlineStickerInfo.archiveUrl : str11;
        String str27 = (i5 & 65536) != 0 ? onlineStickerInfo.coverUrl : str12;
        List list3 = (i5 & 131072) != 0 ? onlineStickerInfo.thumbnails : list;
        List list4 = (i5 & 262144) != 0 ? onlineStickerInfo.tags : list2;
        int i10 = (i5 & Opcodes.ASM8) != 0 ? onlineStickerInfo.downloadCount : i4;
        if ((i5 & 1048576) != 0) {
            i6 = i10;
            str14 = onlineStickerInfo.createdAt;
        } else {
            str14 = str13;
            i6 = i10;
        }
        return onlineStickerInfo.copy(str25, str16, str17, str18, str19, str20, str21, str22, i7, i8, str23, str24, i9, num3, num4, str26, str27, list3, list4, i6, str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getStickerCount() {
        return this.stickerCount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCoverFileName() {
        return this.coverFileName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCoverFileFormat() {
        return this.coverFileFormat;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getCoverFileSize() {
        return this.coverFileSize;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getCoverWidth() {
        return this.coverWidth;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getCoverHeight() {
        return this.coverHeight;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getArchiveUrl() {
        return this.archiveUrl;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final List<String> component18() {
        return this.thumbnails;
    }

    public final List<String> component19() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getDownloadCount() {
        return this.downloadCount;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUin() {
        return this.uin;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getArchiveFileName() {
        return this.archiveFileName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getArchiveFileFormat() {
        return this.archiveFileFormat;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getArchiveFileSize() {
        return this.archiveFileSize;
    }

    public final OnlineStickerInfo copy(String id, String title, String description, String uin, String nickname, String author, String archiveFileName, String archiveFileFormat, int archiveFileSize, int stickerCount, String coverFileName, String coverFileFormat, int coverFileSize, Integer coverWidth, Integer coverHeight, String archiveUrl, String coverUrl, List<String> thumbnails, List<String> tags, int downloadCount, String createdAt) {
        id.getClass();
        title.getClass();
        archiveFileName.getClass();
        archiveFileFormat.getClass();
        coverFileName.getClass();
        coverFileFormat.getClass();
        archiveUrl.getClass();
        coverUrl.getClass();
        thumbnails.getClass();
        tags.getClass();
        createdAt.getClass();
        return new OnlineStickerInfo(id, title, description, uin, nickname, author, archiveFileName, archiveFileFormat, archiveFileSize, stickerCount, coverFileName, coverFileFormat, coverFileSize, coverWidth, coverHeight, archiveUrl, coverUrl, thumbnails, tags, downloadCount, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnlineStickerInfo)) {
            return false;
        }
        OnlineStickerInfo onlineStickerInfo = (OnlineStickerInfo) other;
        return AbstractC4394.m8917(this.id, onlineStickerInfo.id) && AbstractC4394.m8917(this.title, onlineStickerInfo.title) && AbstractC4394.m8917(this.description, onlineStickerInfo.description) && AbstractC4394.m8917(this.uin, onlineStickerInfo.uin) && AbstractC4394.m8917(this.nickname, onlineStickerInfo.nickname) && AbstractC4394.m8917(this.author, onlineStickerInfo.author) && AbstractC4394.m8917(this.archiveFileName, onlineStickerInfo.archiveFileName) && AbstractC4394.m8917(this.archiveFileFormat, onlineStickerInfo.archiveFileFormat) && this.archiveFileSize == onlineStickerInfo.archiveFileSize && this.stickerCount == onlineStickerInfo.stickerCount && AbstractC4394.m8917(this.coverFileName, onlineStickerInfo.coverFileName) && AbstractC4394.m8917(this.coverFileFormat, onlineStickerInfo.coverFileFormat) && this.coverFileSize == onlineStickerInfo.coverFileSize && AbstractC4394.m8917(this.coverWidth, onlineStickerInfo.coverWidth) && AbstractC4394.m8917(this.coverHeight, onlineStickerInfo.coverHeight) && AbstractC4394.m8917(this.archiveUrl, onlineStickerInfo.archiveUrl) && AbstractC4394.m8917(this.coverUrl, onlineStickerInfo.coverUrl) && AbstractC4394.m8917(this.thumbnails, onlineStickerInfo.thumbnails) && AbstractC4394.m8917(this.tags, onlineStickerInfo.tags) && this.downloadCount == onlineStickerInfo.downloadCount && AbstractC4394.m8917(this.createdAt, onlineStickerInfo.createdAt);
    }

    public final String getArchiveFileFormat() {
        return this.archiveFileFormat;
    }

    public final String getArchiveFileName() {
        return this.archiveFileName;
    }

    public final int getArchiveFileSize() {
        return this.archiveFileSize;
    }

    public final String getArchiveUrl() {
        return this.archiveUrl;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getCoverFileFormat() {
        return this.coverFileFormat;
    }

    public final String getCoverFileName() {
        return this.coverFileName;
    }

    public final int getCoverFileSize() {
        return this.coverFileSize;
    }

    public final Integer getCoverHeight() {
        return this.coverHeight;
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final Integer getCoverWidth() {
        return this.coverWidth;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDownloadCount() {
        return this.downloadCount;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final int getStickerCount() {
        return this.stickerCount;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final List<String> getThumbnails() {
        return this.thumbnails;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUin() {
        return this.uin;
    }

    public int hashCode() {
        int iM11539 = AbstractC6136.m11539(this.id.hashCode() * 31, 31, this.title);
        String str = this.description;
        int iHashCode = (iM11539 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uin;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.author;
        int iM143 = AbstractC0053.m143(this.coverFileSize, AbstractC6136.m11539(AbstractC6136.m11539(AbstractC0053.m143(this.stickerCount, AbstractC0053.m143(this.archiveFileSize, AbstractC6136.m11539(AbstractC6136.m11539((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.archiveFileName), 31, this.archiveFileFormat), 31), 31), 31, this.coverFileName), 31, this.coverFileFormat), 31);
        Integer num = this.coverWidth;
        int iHashCode4 = (iM143 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.coverHeight;
        return this.createdAt.hashCode() + AbstractC0053.m143(this.downloadCount, AbstractC0053.m159(this.tags, AbstractC0053.m159(this.thumbnails, AbstractC6136.m11539(AbstractC6136.m11539((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.archiveUrl), 31, this.coverUrl), 31), 31), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.uin;
        String str5 = this.nickname;
        String str6 = this.author;
        String str7 = this.archiveFileName;
        String str8 = this.archiveFileFormat;
        int i = this.archiveFileSize;
        int i2 = this.stickerCount;
        String str9 = this.coverFileName;
        String str10 = this.coverFileFormat;
        int i3 = this.coverFileSize;
        Integer num = this.coverWidth;
        Integer num2 = this.coverHeight;
        String str11 = this.archiveUrl;
        String str12 = this.coverUrl;
        List<String> list = this.thumbnails;
        List<String> list2 = this.tags;
        int i4 = this.downloadCount;
        String str13 = this.createdAt;
        StringBuilder sbM11551 = AbstractC6136.m11551("OnlineStickerInfo(id=", str, ", title=", str2, ", description=");
        AbstractC6136.m11530(sbM11551, str3, ", uin=", str4, ", nickname=");
        AbstractC6136.m11530(sbM11551, str5, ", author=", str6, ", archiveFileName=");
        AbstractC6136.m11530(sbM11551, str7, ", archiveFileFormat=", str8, ", archiveFileSize=");
        sbM11551.append(i);
        sbM11551.append(", stickerCount=");
        sbM11551.append(i2);
        sbM11551.append(", coverFileName=");
        AbstractC6136.m11530(sbM11551, str9, ", coverFileFormat=", str10, ", coverFileSize=");
        sbM11551.append(i3);
        sbM11551.append(", coverWidth=");
        sbM11551.append(num);
        sbM11551.append(", coverHeight=");
        sbM11551.append(num2);
        sbM11551.append(", archiveUrl=");
        sbM11551.append(str11);
        sbM11551.append(", coverUrl=");
        sbM11551.append(str12);
        sbM11551.append(", thumbnails=");
        sbM11551.append(list);
        sbM11551.append(", tags=");
        sbM11551.append(list2);
        sbM11551.append(", downloadCount=");
        sbM11551.append(i4);
        sbM11551.append(", createdAt=");
        return AbstractC0053.m146(sbM11551, str13, ")");
    }
}
