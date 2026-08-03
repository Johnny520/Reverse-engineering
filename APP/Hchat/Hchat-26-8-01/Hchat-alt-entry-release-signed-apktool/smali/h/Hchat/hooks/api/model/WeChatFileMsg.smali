.class public final Lh/Hchat/hooks/api/model/WeChatFileMsg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I


# instance fields
.field public final attachId:Ljava/lang/String;

.field public final ext:Ljava/lang/String;

.field public final fileName:Ljava/lang/String;

.field public final key:Ljava/lang/String;

.field public final md5:Ljava/lang/String;

.field public final size:J

.field public final title:Ljava/lang/String;

.field public final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1, p4, p5, p6, p7}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

    .line 14
    .line 15
    iput-wide p2, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->size:J

    .line 16
    .line 17
    iput-object p4, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->ext:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p5, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->md5:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p6, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->url:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p7, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->key:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p8, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->attachId:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p9, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->fileName:Ljava/lang/String;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic copy$default(Lh/Hchat/hooks/api/model/WeChatFileMsg;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lh/Hchat/hooks/api/model/WeChatFileMsg;
    .locals 0

    .line 1
    and-int/lit8 p11, p10, 0x1

    .line 2
    .line 3
    if-eqz p11, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p11, p10, 0x2

    .line 8
    .line 9
    if-eqz p11, :cond_1

    .line 10
    .line 11
    iget-wide p2, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->size:J

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p11, p10, 0x4

    .line 14
    .line 15
    if-eqz p11, :cond_2

    .line 16
    .line 17
    iget-object p4, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->ext:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p11, p10, 0x8

    .line 20
    .line 21
    if-eqz p11, :cond_3

    .line 22
    .line 23
    iget-object p5, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->md5:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p11, p10, 0x10

    .line 26
    .line 27
    if-eqz p11, :cond_4

    .line 28
    .line 29
    iget-object p6, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->url:Ljava/lang/String;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p11, p10, 0x20

    .line 32
    .line 33
    if-eqz p11, :cond_5

    .line 34
    .line 35
    iget-object p7, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->key:Ljava/lang/String;

    .line 36
    .line 37
    :cond_5
    and-int/lit8 p11, p10, 0x40

    .line 38
    .line 39
    if-eqz p11, :cond_6

    .line 40
    .line 41
    iget-object p8, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->attachId:Ljava/lang/String;

    .line 42
    .line 43
    :cond_6
    and-int/lit16 p10, p10, 0x80

    .line 44
    .line 45
    if-eqz p10, :cond_7

    .line 46
    .line 47
    iget-object p9, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->fileName:Ljava/lang/String;

    .line 48
    .line 49
    :cond_7
    move-object p10, p8

    .line 50
    move-object p11, p9

    .line 51
    move-object p8, p6

    .line 52
    move-object p9, p7

    .line 53
    move-object p6, p4

    .line 54
    move-object p7, p5

    .line 55
    move-wide p4, p2

    .line 56
    move-object p2, p0

    .line 57
    move-object p3, p1

    .line 58
    invoke-virtual/range {p2 .. p11}, Lh/Hchat/hooks/api/model/WeChatFileMsg;->copy(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatFileMsg;

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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->size:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->ext:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->attachId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatFileMsg;
    .locals 10

    .line 1
    move-object/from16 v6, p6

    .line 2
    .line 3
    move-object/from16 v7, p7

    .line 4
    .line 5
    invoke-static {p1, p4, p5, v6, v7}, Lj8/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p8 .. p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, Lh/Hchat/hooks/api/model/WeChatFileMsg;

    .line 15
    .line 16
    move-object v1, p1

    .line 17
    move-wide v2, p2

    .line 18
    move-object v4, p4

    .line 19
    move-object v5, p5

    .line 20
    move-object/from16 v8, p8

    .line 21
    .line 22
    move-object/from16 v9, p9

    .line 23
    .line 24
    invoke-direct/range {v0 .. v9}, Lh/Hchat/hooks/api/model/WeChatFileMsg;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;

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
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;

    .line 12
    .line 13
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

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
    iget-wide v3, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->size:J

    .line 25
    .line 26
    iget-wide v5, p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;->size:J

    .line 27
    .line 28
    cmp-long v1, v3, v5

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->ext:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;->ext:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->md5:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;->md5:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->url:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;->url:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_6

    .line 64
    .line 65
    return v2

    .line 66
    :cond_6
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->key:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;->key:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_7

    .line 75
    .line 76
    return v2

    .line 77
    :cond_7
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->attachId:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;->attachId:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v1, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-nez v1, :cond_8

    .line 86
    .line 87
    return v2

    .line 88
    :cond_8
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->fileName:Ljava/lang/String;

    .line 89
    .line 90
    iget-object p1, p1, Lh/Hchat/hooks/api/model/WeChatFileMsg;->fileName:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v1, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_9

    .line 97
    .line 98
    return v2

    .line 99
    :cond_9
    return v0
.end method

.method public final getAttachId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->attachId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getExt()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->ext:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->key:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMd5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSize()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->size:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

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
    iget-wide v2, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->size:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->ext:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->md5:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->url:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->key:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->attachId:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->fileName:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

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
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->title:Ljava/lang/String;

    .line 2
    .line 3
    iget-wide v1, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->size:J

    .line 4
    .line 5
    iget-object v3, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->ext:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v4, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->md5:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v5, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->url:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v6, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->key:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v7, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->attachId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v8, p0, Lh/Hchat/hooks/api/model/WeChatFileMsg;->fileName:Ljava/lang/String;

    .line 16
    .line 17
    const-string v9, "WeChatFileMsg(title="

    .line 18
    .line 19
    const-string v10, ", size="

    .line 20
    .line 21
    invoke-static {v9, v0, v10, v1, v2}, Leh/a;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, ", ext="

    .line 26
    .line 27
    const-string v2, ", md5="

    .line 28
    .line 29
    invoke-static {v0, v1, v3, v2, v4}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, ", url="

    .line 33
    .line 34
    const-string v2, ", key="

    .line 35
    .line 36
    invoke-static {v0, v1, v5, v2, v6}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", attachId="

    .line 40
    .line 41
    const-string v2, ", fileName="

    .line 42
    .line 43
    invoke-static {v0, v1, v7, v2, v8}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v1, ")"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
