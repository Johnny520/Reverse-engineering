.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CapturedProfile"
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final args:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final methodKey:Ljava/lang/String;

.field private final paramNames:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final timestamp:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J)V"
        }
    .end annotation

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->methodKey:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->args:Ljava/util/List;

    .line 16
    .line 17
    iput-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->paramNames:Ljava/util/List;

    .line 18
    .line 19
    iput-wide p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->timestamp:J

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILzq;)V
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    .line 23
    invoke-direct/range {v0 .. v5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->methodKey:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->args:Ljava/util/List;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->paramNames:Ljava/util/List;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p6, p6, 0x8

    .line 20
    .line 21
    if-eqz p6, :cond_3

    .line 22
    .line 23
    iget-wide p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->timestamp:J

    .line 24
    .line 25
    :cond_3
    move-wide p6, p4

    .line 26
    move-object p4, p2

    .line 27
    move-object p5, p3

    .line 28
    move-object p2, p0

    .line 29
    move-object p3, p1

    .line 30
    invoke-virtual/range {p2 .. p7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;

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
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->methodKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->args:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->paramNames:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->timestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;J)",
            "Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;"
        }
    .end annotation

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
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;

    .line 11
    .line 12
    invoke-direct/range {p0 .. p5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;J)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->methodKey:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->methodKey:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->args:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->args:Ljava/util/List;

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
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->paramNames:Ljava/util/List;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->paramNames:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->timestamp:J

    .line 47
    .line 48
    iget-wide p0, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->timestamp:J

    .line 49
    .line 50
    cmp-long p0, v3, p0

    .line 51
    .line 52
    if-eqz p0, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    return v0
.end method

.method public final getArgs()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->args:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMethodKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->methodKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getParamNames()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->paramNames:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTimestamp()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->timestamp:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->methodKey:Ljava/lang/String;

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
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->args:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La12;->γ(Ljava/util/List;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->paramNames:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La12;->γ(Ljava/util/List;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->timestamp:J

    .line 23
    .line 24
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, v0

    .line 29
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->methodKey:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->args:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->paramNames:Ljava/util/List;

    .line 6
    .line 7
    iget-wide v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNetCompat$CapturedProfile;->timestamp:J

    .line 8
    .line 9
    new-instance p0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v5, "CapturedProfile(methodKey="

    .line 12
    .line 13
    invoke-direct {p0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, ", args="

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", paramNames="

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v0, ", timestamp="

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ")"

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
