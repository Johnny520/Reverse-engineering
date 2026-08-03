.class public final Lh/Hchat/hooks/api/model/WeChatImageMsg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I


# instance fields
.field public final bigImgUrl:Ljava/lang/String;

.field public final bigLength:I

.field public final key:Ljava/lang/String;

.field public final md5:Ljava/lang/String;

.field public final midImgUrl:Ljava/lang/String;

.field public final midLength:I

.field public final thumbLength:I

.field public final thumbUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V
    .locals 0

    .line 32
    invoke-static {p1, p2, p3, p4, p5}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 35
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 36
    iput-object p3, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midImgUrl:Ljava/lang/String;

    .line 37
    iput-object p4, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbUrl:Ljava/lang/String;

    .line 38
    iput-object p5, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->key:Ljava/lang/String;

    .line 39
    iput p6, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 40
    iput p7, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 41
    iput p8, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbLength:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILgg/g;)V
    .locals 1

    .line 1
    and-int/lit8 p10, p9, 0x20

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p10, :cond_0

    .line 5
    .line 6
    move p6, v0

    .line 7
    :cond_0
    and-int/lit8 p10, p9, 0x40

    .line 8
    .line 9
    if-eqz p10, :cond_1

    .line 10
    .line 11
    move p7, v0

    .line 12
    :cond_1
    and-int/lit16 p9, p9, 0x80

    .line 13
    .line 14
    if-eqz p9, :cond_2

    .line 15
    .line 16
    move p9, v0

    .line 17
    :goto_0
    move p8, p7

    .line 18
    move p7, p6

    .line 19
    move-object p6, p5

    .line 20
    move-object p5, p4

    .line 21
    move-object p4, p3

    .line 22
    move-object p3, p2

    .line 23
    move-object p2, p1

    .line 24
    move-object p1, p0

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    move p9, p8

    .line 27
    goto :goto_0

    .line 28
    :goto_1
    invoke-direct/range {p1 .. p9}, Lh/Hchat/hooks/api/model/WeChatImageMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static synthetic copy$default(Lh/Hchat/hooks/api/model/WeChatImageMsg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/Object;)Lh/Hchat/hooks/api/model/WeChatImageMsg;
    .locals 0

    .line 1
    and-int/lit8 p10, p9, 0x1

    .line 2
    .line 3
    if-eqz p10, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p10, p9, 0x2

    .line 8
    .line 9
    if-eqz p10, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p10, p9, 0x4

    .line 14
    .line 15
    if-eqz p10, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midImgUrl:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p10, p9, 0x8

    .line 20
    .line 21
    if-eqz p10, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbUrl:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p10, p9, 0x10

    .line 26
    .line 27
    if-eqz p10, :cond_4

    .line 28
    .line 29
    iget-object p5, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->key:Ljava/lang/String;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p10, p9, 0x20

    .line 32
    .line 33
    if-eqz p10, :cond_5

    .line 34
    .line 35
    iget p6, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p10, p9, 0x40

    .line 38
    .line 39
    if-eqz p10, :cond_6

    .line 40
    .line 41
    iget p7, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p9, p9, 0x80

    .line 44
    .line 45
    if-eqz p9, :cond_7

    .line 46
    .line 47
    iget p8, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbLength:I

    .line 48
    .line 49
    :cond_7
    move p9, p7

    .line 50
    move p10, p8

    .line 51
    move-object p7, p5

    .line 52
    move p8, p6

    .line 53
    move-object p5, p3

    .line 54
    move-object p6, p4

    .line 55
    move-object p3, p1

    .line 56
    move-object p4, p2

    .line 57
    move-object p2, p0

    .line 58
    invoke-virtual/range {p2 .. p10}, Lh/Hchat/hooks/api/model/WeChatImageMsg;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lh/Hchat/hooks/api/model/WeChatImageMsg;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midImgUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component6()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 2
    .line 3
    return v0
.end method

.method public final component7()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 2
    .line 3
    return v0
.end method

.method public final component8()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbLength:I

    .line 2
    .line 3
    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lh/Hchat/hooks/api/model/WeChatImageMsg;
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, Lh/Hchat/hooks/api/model/WeChatImageMsg;

    .line 17
    .line 18
    move-object v1, p1

    .line 19
    move-object v2, p2

    .line 20
    move-object v3, p3

    .line 21
    move-object v4, p4

    .line 22
    move-object v5, p5

    .line 23
    move v6, p6

    .line 24
    move/from16 v7, p7

    .line 25
    .line 26
    move/from16 v8, p8

    .line 27
    .line 28
    invoke-direct/range {v0 .. v8}, Lh/Hchat/hooks/api/model/WeChatImageMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;

    .line 12
    .line 13
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midImgUrl:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midImgUrl:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbUrl:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbUrl:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->key:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;->key:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 69
    .line 70
    iget v3, p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 71
    .line 72
    if-eq v1, v3, :cond_7

    .line 73
    .line 74
    return v2

    .line 75
    :cond_7
    iget v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 76
    .line 77
    iget v3, p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 78
    .line 79
    if-eq v1, v3, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbLength:I

    .line 83
    .line 84
    iget p1, p1, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbLength:I

    .line 85
    .line 86
    if-eq v1, p1, :cond_9

    .line 87
    .line 88
    return v2

    .line 89
    :cond_9
    return v0
.end method

.method public final getBigImgUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBigLength()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 2
    .line 3
    return v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMd5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMidImgUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midImgUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMidLength()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 2
    .line 3
    return v0
.end method

.method public final getThumbLength()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbLength:I

    .line 2
    .line 3
    return v0
.end method

.method public final getThumbUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midImgUrl:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbUrl:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->key:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, Leh/a;->e(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbLength:I

    .line 47
    .line 48
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    add-int/2addr v1, v0

    .line 53
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigImgUrl:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midImgUrl:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbUrl:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->key:Ljava/lang/String;

    .line 10
    .line 11
    iget v5, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->bigLength:I

    .line 12
    .line 13
    iget v6, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->midLength:I

    .line 14
    .line 15
    iget v7, p0, Lh/Hchat/hooks/api/model/WeChatImageMsg;->thumbLength:I

    .line 16
    .line 17
    const-string v8, ", bigImgUrl="

    .line 18
    .line 19
    const-string v9, ", midImgUrl="

    .line 20
    .line 21
    const-string v10, "WeChatImageMsg(md5="

    .line 22
    .line 23
    invoke-static {v10, v0, v8, v1, v9}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, ", thumbUrl="

    .line 28
    .line 29
    const-string v8, ", key="

    .line 30
    .line 31
    invoke-static {v0, v2, v1, v3, v8}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v1, ", bigLength="

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v1, ", midLength="

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", thumbLength="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ")"

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    return-object v0
.end method
