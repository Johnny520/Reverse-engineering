.class public Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/hd/wauxv/data/bean/MsgInfoBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ImageMsg"
.end annotation


# instance fields
.field public bigImgUrl:Ljava/lang/String;

.field public bigLength:I

.field public key:Ljava/lang/String;

.field public md5:Ljava/lang/String;

.field public midImgUrl:Ljava/lang/String;

.field public midLength:I

.field public thumbLength:I

.field public thumbUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    const-string v0, ""

    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->md5:Ljava/lang/String;

    .line 75
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 76
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midImgUrl:Ljava/lang/String;

    .line 77
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbUrl:Ljava/lang/String;

    .line 78
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->key:Ljava/lang/String;

    const/4 v0, 0x0

    .line 79
    iput v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->bigLength:I

    .line 80
    iput v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midLength:I

    .line 81
    iput v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbLength:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 72
    invoke-direct/range {v0 .. v8}, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->md5:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midImgUrl:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbUrl:Ljava/lang/String;

    .line 13
    .line 14
    iput-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->key:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->bigLength:I

    .line 18
    .line 19
    iput v1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midLength:I

    .line 20
    .line 21
    iput v1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbLength:I

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object p1, v0

    .line 27
    :goto_0
    iput-object p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->md5:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object p2, v0

    .line 33
    :goto_1
    iput-object p2, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move-object p3, v0

    .line 39
    :goto_2
    iput-object p3, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midImgUrl:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p4, :cond_3

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    move-object p4, v0

    .line 45
    :goto_3
    iput-object p4, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbUrl:Ljava/lang/String;

    .line 46
    .line 47
    if-eqz p5, :cond_4

    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_4
    move-object p5, v0

    .line 51
    :goto_4
    iput-object p5, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->key:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1, p6}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iput p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->bigLength:I

    .line 58
    .line 59
    invoke-static {v1, p7}, Ljava/lang/Math;->max(II)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midLength:I

    .line 64
    .line 65
    invoke-static {v1, p8}, Ljava/lang/Math;->max(II)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput p1, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbLength:I

    .line 70
    .line 71
    return-void
.end method


# virtual methods
.method public getAesKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBigImgUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBigLength()I
    .locals 1

    .line 1
    iget v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->bigLength:I

    .line 2
    .line 3
    return v0
.end method

.method public getCdnUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbUrl:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbUrl:Ljava/lang/String;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midImgUrl:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midImgUrl:Ljava/lang/String;

    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_2
    const-string v0, ""

    .line 33
    .line 34
    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMd5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMidImgUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midImgUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMidLength()I
    .locals 1

    .line 1
    iget v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->midLength:I

    .line 2
    .line 3
    return v0
.end method

.method public getThumbLength()I
    .locals 1

    .line 1
    iget v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbLength:I

    .line 2
    .line 3
    return v0
.end method

.method public getThumbUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lme/hd/wauxv/data/bean/MsgInfoBean$ImageMsg;->thumbUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
