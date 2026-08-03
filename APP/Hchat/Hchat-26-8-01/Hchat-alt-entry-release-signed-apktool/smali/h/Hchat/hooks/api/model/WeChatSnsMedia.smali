.class public final Lh/Hchat/hooks/api/model/WeChatSnsMedia;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final id:Ljava/lang/String;

.field private final liveVideo:Lh/Hchat/hooks/api/model/WeChatSnsMedia;

.field private final thumbUrl:Ljava/lang/String;

.field private final type:I

.field private final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lh/Hchat/hooks/api/model/WeChatSnsMedia;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->id:Ljava/lang/String;

    .line 14
    .line 15
    iput p2, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->type:I

    .line 16
    .line 17
    iput-object p3, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->url:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p4, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->thumbUrl:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p5, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->liveVideo:Lh/Hchat/hooks/api/model/WeChatSnsMedia;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLiveVideo()Lh/Hchat/hooks/api/model/WeChatSnsMedia;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->liveVideo:Lh/Hchat/hooks/api/model/WeChatSnsMedia;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getThumbUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->thumbUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isLivePhoto()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatSnsMedia;->liveVideo:Lh/Hchat/hooks/api/model/WeChatSnsMedia;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
