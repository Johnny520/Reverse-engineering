.class public final Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I

.field public static final Companion:Ll8/h;


# instance fields
.field private final content:Ljava/lang/String;

.field private final imagePathList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final livePhotoList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;",
            ">;"
        }
    .end annotation
.end field

.field private final message:Ljava/lang/String;

.field private final snsId:Ljava/lang/String;

.field private final success:Z

.field private final type:Ljava/lang/String;

.field private final videoPath:Ljava/lang/String;

.field private final videoThumbPath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ll8/h;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-boolean p1, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->success:Z

    .line 29
    .line 30
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->message:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p3, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->snsId:Ljava/lang/String;

    .line 33
    .line 34
    iput-object p4, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->content:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p5, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->type:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p6, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->imagePathList:Ljava/util/List;

    .line 39
    .line 40
    iput-object p7, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->videoPath:Ljava/lang/String;

    .line 41
    .line 42
    iput-object p8, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->videoThumbPath:Ljava/lang/String;

    .line 43
    .line 44
    iput-object p9, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->livePhotoList:Ljava/util/List;

    .line 45
    .line 46
    return-void
.end method

.method public static final failure$app(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;
    .locals 1

    .line 1
    sget-object v0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->Companion:Ll8/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Ll8/h;->a(Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final getContent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getImagePathList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->imagePathList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLivePhotoList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->livePhotoList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSnsId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->snsId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->content:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVideoPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->videoPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVideoThumbPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->videoThumbPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isImage()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->type:Ljava/lang/String;

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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->type:Ljava/lang/String;

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

.method public final isSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->success:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isText()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->type:Ljava/lang/String;

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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsPrepareResult;->type:Ljava/lang/String;

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
