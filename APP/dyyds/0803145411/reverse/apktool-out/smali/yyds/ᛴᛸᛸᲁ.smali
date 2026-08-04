.class public final Lyyds/ᛴᛸᛸᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Z

.field public final ᛵᛸᛸᛷ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛴᛶ;


# direct methods
.method public constructor <init>(ZZLyyds/ᛴᲈᛴᛶ;)V
    .locals 2

    .line 1
    const-wide v0, -0x3d919e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-boolean p1, p0, Lyyds/ᛴᛸᛸᲁ;->ᛲᲈᲁ:Z

    .line 13
    .line 14
    iput-boolean p2, p0, Lyyds/ᛴᛸᛸᲁ;->ᛵᛸᛸᛷ:Z

    .line 15
    .line 16
    iput-object p3, p0, Lyyds/ᛴᛸᛸᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛴᛶ;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Lyyds/ᛴᛸᛸᲁ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᛴᛸᛸᲁ;

    .line 10
    .line 11
    iget-boolean v0, p0, Lyyds/ᛴᛸᛸᲁ;->ᛲᲈᲁ:Z

    .line 12
    .line 13
    iget-boolean v1, p1, Lyyds/ᛴᛸᛸᲁ;->ᛲᲈᲁ:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, Lyyds/ᛴᛸᛸᲁ;->ᛵᛸᛸᛷ:Z

    .line 19
    .line 20
    iget-boolean v1, p1, Lyyds/ᛴᛸᛸᲁ;->ᛵᛸᛸᛷ:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-object p0, p0, Lyyds/ᛴᛸᛸᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛴᛶ;

    .line 26
    .line 27
    iget-object p1, p1, Lyyds/ᛴᛸᛸᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛴᛶ;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lyyds/ᛴᲈᛴᛶ;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_4

    .line 34
    .line 35
    :goto_0
    const/4 p0, 0x0

    .line 36
    return p0

    .line 37
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 38
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛴᛸᛸᲁ;->ᛲᲈᲁ:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, Lyyds/ᛴᛸᛸᲁ;->ᛵᛸᛸᛷ:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object p0, p0, Lyyds/ᛴᛸᛸᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛴᛶ;

    .line 17
    .line 18
    invoke-virtual {p0}, Lyyds/ᛴᲈᛴᛶ;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x3d935e68a836eL

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
    iget-boolean v1, p0, Lyyds/ᛴᛸᛸᲁ;->ᛲᲈᲁ:Z

    .line 16
    .line 17
    const-wide v2, -0x3d94de68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, Lyyds/ᛴᛸᛸᲁ;->ᛵᛸᛸᛷ:Z

    .line 26
    .line 27
    const-wide v2, -0x3d95ae68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lyyds/ᛴᛸᛸᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᛴᛶ;

    .line 36
    .line 37
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const/16 p0, 0x29

    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method
