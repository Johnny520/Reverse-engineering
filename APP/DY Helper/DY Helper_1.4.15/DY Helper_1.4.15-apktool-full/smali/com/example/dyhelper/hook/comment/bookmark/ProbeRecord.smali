.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord$Companion;


# instance fields
.field private final commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

.field private final createTime:J

.field private final group:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

.field private final type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->$stable:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;Ljava/lang/String;JLcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->id:Ljava/lang/String;

    .line 42
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 43
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->group:Ljava/lang/String;

    .line 44
    iput-wide p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->createTime:J

    .line 45
    iput-object p6, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 46
    iput-object p7, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;Ljava/lang/String;JLcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;ILzq;)V
    .locals 8

    .line 1
    and-int/lit8 v0, p8, 0x4

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p3, ""

    .line 6
    .line 7
    :cond_0
    move-object v3, p3

    .line 8
    and-int/lit8 p3, p8, 0x8

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide p4

    .line 16
    :cond_1
    move-wide v4, p4

    .line 17
    and-int/lit8 p3, p8, 0x10

    .line 18
    .line 19
    const/4 p4, 0x0

    .line 20
    if-eqz p3, :cond_2

    .line 21
    .line 22
    move-object v6, p4

    .line 23
    goto :goto_0

    .line 24
    :cond_2
    move-object v6, p6

    .line 25
    :goto_0
    and-int/lit8 p3, p8, 0x20

    .line 26
    .line 27
    if-eqz p3, :cond_3

    .line 28
    .line 29
    move-object v7, p4

    .line 30
    :goto_1
    move-object v0, p0

    .line 31
    move-object v1, p1

    .line 32
    move-object v2, p2

    .line 33
    goto :goto_2

    .line 34
    :cond_3
    move-object v7, p7

    .line 35
    goto :goto_1

    .line 36
    :goto_2
    invoke-direct/range {v0 .. v7}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;-><init>(Ljava/lang/String;Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;Ljava/lang/String;JLcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;Ljava/lang/String;Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;Ljava/lang/String;JLcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;ILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;
    .locals 0

    .line 1
    and-int/lit8 p9, p8, 0x1

    .line 2
    .line 3
    if-eqz p9, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->id:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p9, p8, 0x2

    .line 8
    .line 9
    if-eqz p9, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p9, p8, 0x4

    .line 14
    .line 15
    if-eqz p9, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->group:Ljava/lang/String;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p9, p8, 0x8

    .line 20
    .line 21
    if-eqz p9, :cond_3

    .line 22
    .line 23
    iget-wide p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->createTime:J

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p9, p8, 0x10

    .line 26
    .line 27
    if-eqz p9, :cond_4

    .line 28
    .line 29
    iget-object p6, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p8, p8, 0x20

    .line 32
    .line 33
    if-eqz p8, :cond_5

    .line 34
    .line 35
    iget-object p7, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 36
    .line 37
    :cond_5
    move-object p8, p6

    .line 38
    move-object p9, p7

    .line 39
    move-wide p6, p4

    .line 40
    move-object p4, p2

    .line 41
    move-object p5, p3

    .line 42
    move-object p2, p0

    .line 43
    move-object p3, p1

    .line 44
    invoke-virtual/range {p2 .. p9}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->copy(Ljava/lang/String;Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;Ljava/lang/String;JLcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->group:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component5()Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component6()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;Ljava/lang/String;JLcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;
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
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;

    .line 11
    .line 12
    invoke-direct/range {p0 .. p7}, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;-><init>(Ljava/lang/String;Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;Ljava/lang/String;JLcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;)V

    .line 13
    .line 14
    .line 15
    return-object p0
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
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->id:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->id:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->group:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->group:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->createTime:J

    .line 43
    .line 44
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->createTime:J

    .line 45
    .line 46
    cmp-long v1, v3, v5

    .line 47
    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 52
    .line 53
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 54
    .line 55
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 63
    .line 64
    iget-object p1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 65
    .line 66
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_7

    .line 71
    .line 72
    return v2

    .line 73
    :cond_7
    return v0
.end method

.method public final getCommentRecord()Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getGroup()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->group:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getProfileRecord()Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->id:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->group:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La12;->β(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->createTime:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    move v2, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v2}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    :goto_0
    add-int/2addr v0, v2

    .line 42
    mul-int/2addr v0, v1

    .line 43
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 44
    .line 45
    if-nez p0, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    :goto_1
    add-int/2addr v0, v3

    .line 53
    return v0
.end method

.method public final toJson()Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->id:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "type"

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "group"

    .line 27
    .line 28
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->group:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const-string v1, "createTime"

    .line 35
    .line 36
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->createTime:J

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 43
    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    const-string v2, "commentRecord"

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->toJson()Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    :cond_0
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 56
    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    const-string v1, "profileRecord"

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;->toJson()Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->id:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->type:Lcom/example/dyhelper/hook/comment/bookmark/ProbeType;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->group:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->createTime:J

    .line 8
    .line 9
    iget-object v5, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->commentRecord:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProbeRecord;->profileRecord:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkRecord;

    .line 12
    .line 13
    new-instance v6, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v7, "ProbeRecord(id="

    .line 16
    .line 17
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", type="

    .line 24
    .line 25
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, ", group="

    .line 32
    .line 33
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", createTime="

    .line 40
    .line 41
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ", commentRecord="

    .line 48
    .line 49
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", profileRecord="

    .line 56
    .line 57
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ")"

    .line 64
    .line 65
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
