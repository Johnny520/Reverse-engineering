.class public final Lyyds/ᛵᛷᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final ᛲᛴᛳᛲ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "previewUrl"
    .end annotation
.end field

.field private final ᛶᛷᛲᲁ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "ownerUserId"
    .end annotation
.end field

.field private final ᲀᛲᛳᲀ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "key"
    .end annotation
.end field

.field private final ᲇᲇᲇᛱ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "emojiJson"
    .end annotation
.end field

.field private final ᲇᲈᛵᛷ:Ljava/lang/String;
    .annotation runtime Lyyds/ᛴᛱᛷᛳ;
        value = "displayName"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    const-wide v0, -0x540fee68a836eL

    .line 47
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    move-result-object v3

    const-wide v0, -0x540ffe68a836eL

    .line 48
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    move-result-object v4

    const-wide v0, -0x54100e68a836eL

    .line 49
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    move-result-object v5

    const-wide v0, -0x54101e68a836eL

    .line 50
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    move-object v2, p0

    .line 51
    invoke-direct/range {v2 .. v7}, Lyyds/ᛵᛷᛱᛵ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-wide v0, -0x540d9e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x540dde68a836eL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-wide v0, -0x540e9e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    const-wide v0, -0x540f4e68a836eL

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lyyds/ᛵᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p2, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p3, p0, Lyyds/ᛵᛷᛱᛵ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 41
    .line 42
    iput-object p4, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 43
    .line 44
    iput-object p5, p0, Lyyds/ᛵᛷᛱᛵ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
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
    instance-of v1, p1, Lyyds/ᛵᛷᛱᛵ;

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
    check-cast p1, Lyyds/ᛵᛷᛱᛵ;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᛵᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lyyds/ᛵᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lyyds/ᛵᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lyyds/ᛵᛷᛱᛵ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lyyds/ᛵᛷᛱᛵ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v1, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v3, p1, Lyyds/ᛵᛷᛱᛵ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛵ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 58
    .line 59
    iget-object p1, p1, Lyyds/ᛵᛷᛱᛵ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-nez p0, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛵᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/lang/String;

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
    iget-object v2, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lyyds/ᛵᛷᛱᛵ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛶᛷᛲᲁ(Ljava/lang/String;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛵ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    :goto_0
    add-int/2addr v0, p0

    .line 39
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x54127e68a836eL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lyyds/ᛵᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 16
    .line 17
    const-wide v2, -0x5413de68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 26
    .line 27
    const-wide v2, -0x5414ce68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lyyds/ᛵᛷᛱᛵ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 36
    .line 37
    const-wide v2, -0x5415ae68a836eL

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 46
    .line 47
    const-wide v2, -0x54167e68a836eL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛵ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 56
    .line 57
    const/16 v1, 0x29

    .line 58
    .line 59
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛵ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᲈᲁ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛵ;->ᲇᲇᲇᛱ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᛷᛱᛵ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
