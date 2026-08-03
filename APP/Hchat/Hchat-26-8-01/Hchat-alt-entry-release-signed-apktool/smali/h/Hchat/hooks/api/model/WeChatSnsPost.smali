.class public final Lh/Hchat/hooks/api/model/WeChatSnsPost;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x8

.field public static final Companion:Ll8/g;

.field public static final TYPE_CARD:Ljava/lang/String; = "card"

.field public static final TYPE_IMAGE:Ljava/lang/String; = "image"

.field public static final TYPE_LIVE_PHOTO:Ljava/lang/String; = "live_photo"

.field public static final TYPE_TEXT:Ljava/lang/String; = "text"

.field public static final TYPE_UNKNOWN:Ljava/lang/String; = "unknown"

.field public static final TYPE_VIDEO:Ljava/lang/String; = "video"


# instance fields
.field private final content:Ljava/lang/String;

.field private final contentType:I

.field private final createTimeSeconds:J

.field private final displayName:Ljava/lang/String;

.field private final localId:J

.field private final mediaList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatSnsMedia;",
            ">;"
        }
    .end annotation
.end field

.field private final self:Z

.field private final snsId:Ljava/lang/String;

.field private final storageType:I

.field private final type:Ljava/lang/String;

.field private final userName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll8/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->Companion:Ll8/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JII",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatSnsMedia;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    invoke-static {p1, p4, p5, p10, p11}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->snsId:Ljava/lang/String;

    .line 11
    .line 12
    iput-wide p2, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->localId:J

    .line 13
    .line 14
    iput-object p4, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->userName:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p5, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->displayName:Ljava/lang/String;

    .line 17
    .line 18
    iput-wide p6, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->createTimeSeconds:J

    .line 19
    .line 20
    iput p8, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->storageType:I

    .line 21
    .line 22
    iput p9, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->contentType:I

    .line 23
    .line 24
    iput-object p10, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->type:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p11, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->content:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p12, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->mediaList:Ljava/util/List;

    .line 29
    .line 30
    iput-boolean p13, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->self:Z

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final getContent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContentType()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->contentType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCreateTimeMillis()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->createTimeSeconds:J

    .line 2
    .line 3
    const-wide/16 v2, 0x3e8

    .line 4
    .line 5
    mul-long/2addr v0, v2

    .line 6
    return-wide v0
.end method

.method public final getCreateTimeSeconds()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->createTimeSeconds:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getDisplayName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->displayName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLocalId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->localId:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMediaList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatSnsMedia;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->mediaList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSnsId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->snsId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStorageType()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->storageType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->userName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isCard()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->type:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "card"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final isImage()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->type:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "image"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final isLivePhoto()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->type:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "live_photo"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final isSelf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->self:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isText()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->type:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "text"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public final isVideo()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPost;->type:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "video"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
