.class public final Lh/Hchat/hooks/api/model/WeChatVideoMsg;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final $stable:I


# instance fields
.field public final aesKey:Ljava/lang/String;

.field public final cdnVideoUrl:Ljava/lang/String;

.field public final length:J

.field public final md5:Ljava/lang/String;

.field public final newMd5:Ljava/lang/String;

.field public final playLength:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->md5:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p2, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->newMd5:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p3, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->cdnVideoUrl:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->aesKey:Ljava/lang/String;

    .line 23
    .line 24
    iput-wide p5, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 25
    .line 26
    iput p7, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->playLength:I

    .line 27
    .line 28
    return-void
.end method

.method public static synthetic copy$default(Lh/Hchat/hooks/api/model/WeChatVideoMsg;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/Object;)Lh/Hchat/hooks/api/model/WeChatVideoMsg;
    .locals 0

    .line 1
    and-int/lit8 p9, p8, 0x1

    .line 2
    .line 3
    if-eqz p9, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->md5:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p9, p8, 0x2

    .line 8
    .line 9
    if-eqz p9, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->newMd5:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p9, p8, 0x4

    .line 14
    .line 15
    if-eqz p9, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->cdnVideoUrl:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p9, p8, 0x8

    .line 20
    .line 21
    if-eqz p9, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->aesKey:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p9, p8, 0x10

    .line 26
    .line 27
    if-eqz p9, :cond_4

    .line 28
    .line 29
    iget-wide p5, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p8, p8, 0x20

    .line 32
    .line 33
    if-eqz p8, :cond_5

    .line 34
    .line 35
    iget p7, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->playLength:I

    .line 36
    .line 37
    :cond_5
    move p9, p7

    .line 38
    move-wide p7, p5

    .line 39
    move-object p5, p3

    .line 40
    move-object p6, p4

    .line 41
    move-object p3, p1

    .line 42
    move-object p4, p2

    .line 43
    move-object p2, p0

    .line 44
    invoke-virtual/range {p2 .. p9}, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lh/Hchat/hooks/api/model/WeChatVideoMsg;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->newMd5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->cdnVideoUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->aesKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component5()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component6()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->playLength:I

    .line 2
    .line 3
    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lh/Hchat/hooks/api/model/WeChatVideoMsg;
    .locals 8

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
    new-instance v0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    move-object v2, p2

    .line 17
    move-object v3, p3

    .line 18
    move-object v4, p4

    .line 19
    move-wide v5, p5

    .line 20
    move v7, p7

    .line 21
    invoke-direct/range {v0 .. v7}, Lh/Hchat/hooks/api/model/WeChatVideoMsg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V

    .line 22
    .line 23
    .line 24
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
    instance-of v1, p1, Lh/Hchat/hooks/api/model/WeChatVideoMsg;

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
    check-cast p1, Lh/Hchat/hooks/api/model/WeChatVideoMsg;

    .line 12
    .line 13
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->md5:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->md5:Ljava/lang/String;

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
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->newMd5:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->newMd5:Ljava/lang/String;

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
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->cdnVideoUrl:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->cdnVideoUrl:Ljava/lang/String;

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
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->aesKey:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->aesKey:Ljava/lang/String;

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
    iget-wide v3, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 58
    .line 59
    iget-wide v5, p1, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 60
    .line 61
    cmp-long v1, v3, v5

    .line 62
    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    return v2

    .line 66
    :cond_6
    iget v1, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->playLength:I

    .line 67
    .line 68
    iget p1, p1, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->playLength:I

    .line 69
    .line 70
    if-eq v1, p1, :cond_7

    .line 71
    .line 72
    return v2

    .line 73
    :cond_7
    return v0
.end method

.method public final getAesKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->aesKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCdnVideoUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->cdnVideoUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getMd5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNewMd5()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->newMd5:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlayLength()I
    .locals 1

    .line 1
    iget v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->playLength:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->md5:Ljava/lang/String;

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
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->newMd5:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->cdnVideoUrl:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->aesKey:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, Leh/a;->g(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-wide v2, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 29
    .line 30
    invoke-static {v0, v1, v2, v3}, Leh/a;->f(IIJ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v1, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->playLength:I

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->md5:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->newMd5:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->cdnVideoUrl:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->aesKey:Ljava/lang/String;

    .line 8
    .line 9
    iget-wide v4, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->length:J

    .line 10
    .line 11
    iget v6, p0, Lh/Hchat/hooks/api/model/WeChatVideoMsg;->playLength:I

    .line 12
    .line 13
    const-string v7, ", newMd5="

    .line 14
    .line 15
    const-string v8, ", cdnVideoUrl="

    .line 16
    .line 17
    const-string v9, "WeChatVideoMsg(md5="

    .line 18
    .line 19
    invoke-static {v9, v0, v7, v1, v8}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, ", aesKey="

    .line 24
    .line 25
    const-string v7, ", length="

    .line 26
    .line 27
    invoke-static {v0, v2, v1, v3, v7}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", playLength="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ")"

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    return-object v0
.end method
