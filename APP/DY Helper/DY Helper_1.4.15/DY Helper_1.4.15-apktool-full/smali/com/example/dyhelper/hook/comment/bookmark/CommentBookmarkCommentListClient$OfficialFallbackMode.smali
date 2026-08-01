.class final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OfficialFallbackMode"
.end annotation


# instance fields
.field private final accessAsNull:Z

.field private final includeGroupId:Z

.field private final name:Ljava/lang/String;

.field private final unknownChannelAsMinusOne:Z

.field private final userAvatarShrink:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->name:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->accessAsNull:Z

    .line 10
    .line 11
    iput-boolean p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->unknownChannelAsMinusOne:Z

    .line 12
    .line 13
    iput-object p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->userAvatarShrink:Ljava/lang/String;

    .line 14
    .line 15
    iput-boolean p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->includeGroupId:Z

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic copy$default(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;Ljava/lang/String;ZZLjava/lang/String;ZILjava/lang/Object;)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;
    .locals 0

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->name:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    iget-boolean p2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->accessAsNull:Z

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 14
    .line 15
    if-eqz p7, :cond_2

    .line 16
    .line 17
    iget-boolean p3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->unknownChannelAsMinusOne:Z

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 20
    .line 21
    if-eqz p7, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->userAvatarShrink:Ljava/lang/String;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 26
    .line 27
    if-eqz p6, :cond_4

    .line 28
    .line 29
    iget-boolean p5, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->includeGroupId:Z

    .line 30
    .line 31
    :cond_4
    move-object p6, p4

    .line 32
    move p7, p5

    .line 33
    move p4, p2

    .line 34
    move p5, p3

    .line 35
    move-object p2, p0

    .line 36
    move-object p3, p1

    .line 37
    invoke-virtual/range {p2 .. p7}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->copy(Ljava/lang/String;ZZLjava/lang/String;Z)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->accessAsNull:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component3()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->unknownChannelAsMinusOne:Z

    .line 2
    .line 3
    return p0
.end method

.method public final component4()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->userAvatarShrink:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->includeGroupId:Z

    .line 2
    .line 3
    return p0
.end method

.method public final copy(Ljava/lang/String;ZZLjava/lang/String;Z)Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

    .line 5
    .line 6
    invoke-direct/range {p0 .. p5}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;-><init>(Ljava/lang/String;ZZLjava/lang/String;Z)V

    .line 7
    .line 8
    .line 9
    return-object p0
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
    instance-of v1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

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
    check-cast p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->name:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->name:Ljava/lang/String;

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
    iget-boolean v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->accessAsNull:Z

    .line 25
    .line 26
    iget-boolean v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->accessAsNull:Z

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-boolean v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->unknownChannelAsMinusOne:Z

    .line 32
    .line 33
    iget-boolean v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->unknownChannelAsMinusOne:Z

    .line 34
    .line 35
    if-eq v1, v3, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    iget-object v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->userAvatarShrink:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->userAvatarShrink:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v1, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_5

    .line 47
    .line 48
    return v2

    .line 49
    :cond_5
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->includeGroupId:Z

    .line 50
    .line 51
    iget-boolean p1, p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->includeGroupId:Z

    .line 52
    .line 53
    if-eq p0, p1, :cond_6

    .line 54
    .line 55
    return v2

    .line 56
    :cond_6
    return v0
.end method

.method public final getAccessAsNull()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->accessAsNull:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getIncludeGroupId()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->includeGroupId:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUnknownChannelAsMinusOne()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->unknownChannelAsMinusOne:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getUserAvatarShrink()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->userAvatarShrink:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->name:Ljava/lang/String;

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
    iget-boolean v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->accessAsNull:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->unknownChannelAsMinusOne:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Llz1;->γ(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->userAvatarShrink:Ljava/lang/String;

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :goto_0
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->includeGroupId:Z

    .line 35
    .line 36
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    add-int/2addr p0, v0

    .line 41
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->name:Ljava/lang/String;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->accessAsNull:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->unknownChannelAsMinusOne:Z

    .line 6
    .line 7
    iget-object v3, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->userAvatarShrink:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean p0, p0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkCommentListClient$OfficialFallbackMode;->includeGroupId:Z

    .line 10
    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v5, "OfficialFallbackMode(name="

    .line 14
    .line 15
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v0, ", accessAsNull="

    .line 22
    .line 23
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v0, ", unknownChannelAsMinusOne="

    .line 30
    .line 31
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", userAvatarShrink="

    .line 38
    .line 39
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", includeGroupId="

    .line 46
    .line 47
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v0, ")"

    .line 51
    .line 52
    invoke-static {v4, p0, v0}, Llz1;->σ(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method
