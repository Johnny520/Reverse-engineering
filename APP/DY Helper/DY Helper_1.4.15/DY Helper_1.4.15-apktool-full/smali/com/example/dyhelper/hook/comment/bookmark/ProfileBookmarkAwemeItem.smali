.class public final Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem$Companion;


# instance fields
.field private final awemeId:Ljava/lang/String;

.field private final coverUrl:Ljava/lang/String;

.field private final createTime:J

.field private final desc:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem$Companion;-><init>(Lzq;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->Companion:Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
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
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->awemeId:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->desc:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->createTime:J

    .line 18
    .line 19
    iput-object p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->coverUrl:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILzq;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    .line 22
    const-string p5, ""

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object v5, p5

    .line 23
    invoke-direct/range {v0 .. v5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->awemeId:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->desc:Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    .line 17
    iget-wide p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->createTime:J

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p6, p6, 0x8

    .line 20
    .line 21
    if-eqz p6, :cond_3

    .line 22
    .line 23
    iget-object p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->coverUrl:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    move-object p7, p5

    .line 26
    move-wide p5, p3

    .line 27
    move-object p3, p1

    .line 28
    move-object p4, p2

    .line 29
    move-object p2, p0

    .line 30
    invoke-virtual/range {p2 .. p7}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->copy(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->awemeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->desc:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;
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
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 11
    .line 12
    invoke-direct/range {p0 .. p5}, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

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
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->awemeId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->awemeId:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->desc:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->desc:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->createTime:J

    .line 36
    .line 37
    iget-wide v5, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->createTime:J

    .line 38
    .line 39
    cmp-long v1, v3, v5

    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->coverUrl:Ljava/lang/String;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->coverUrl:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {p0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    return v0
.end method

.method public final getAwemeId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->awemeId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCoverUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->createTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getDesc()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->desc:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->awemeId:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->desc:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La12;->β(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->createTime:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, Llz1;->β(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->coverUrl:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
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
    const-string v1, "awemeId"

    .line 7
    .line 8
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->awemeId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "desc"

    .line 15
    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->desc:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "createTime"

    .line 23
    .line 24
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->createTime:J

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "coverUrl"

    .line 31
    .line 32
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->coverUrl:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->awemeId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->desc:Ljava/lang/String;

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->createTime:J

    .line 6
    .line 7
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/ProfileBookmarkAwemeItem;->coverUrl:Ljava/lang/String;

    .line 8
    .line 9
    const-string v4, ", desc="

    .line 10
    .line 11
    const-string v5, ", createTime="

    .line 12
    .line 13
    const-string v6, "ProfileBookmarkAwemeItem(awemeId="

    .line 14
    .line 15
    invoke-static {v6, v0, v4, v1, v5}, Llz1;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", coverUrl="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ")"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method
