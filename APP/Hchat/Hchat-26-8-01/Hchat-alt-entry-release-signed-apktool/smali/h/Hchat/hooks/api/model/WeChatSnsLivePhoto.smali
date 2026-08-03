.class public final Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I


# instance fields
.field private final coverTimeMillis:J

.field private final imagePath:Ljava/lang/String;

.field private final videoDurationMillis:I

.field private final videoPath:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->imagePath:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->videoPath:Ljava/lang/String;

    .line 13
    .line 14
    iput p3, p0, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->videoDurationMillis:I

    .line 15
    .line 16
    iput-wide p4, p0, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->coverTimeMillis:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final getCoverTimeMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->coverTimeMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getImagePath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->imagePath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getVideoDurationMillis()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->videoDurationMillis:I

    .line 2
    .line 3
    return v0
.end method

.method public final getVideoPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsLivePhoto;->videoPath:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
