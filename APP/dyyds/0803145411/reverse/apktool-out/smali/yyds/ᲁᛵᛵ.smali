.class public final Lyyds/ᲁᛵᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Ljava/util/List;

.field public final ᛵᛸᛸᛷ:Z

.field public final ᲀᛲᛳᲀ:Z


# direct methods
.method public constructor <init>(Ljava/util/List;ZZ)V
    .locals 2

    .line 1
    const-wide v0, -0x3b6bfe68a836eL

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
    iput-object p1, p0, Lyyds/ᲁᛵᛵ;->ᛲᲈᲁ:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p2, p0, Lyyds/ᲁᛵᛵ;->ᛵᛸᛸᛷ:Z

    .line 15
    .line 16
    iput-boolean p3, p0, Lyyds/ᲁᛵᛵ;->ᲀᛲᛳᲀ:Z

    .line 17
    .line 18
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
    instance-of v1, p1, Lyyds/ᲁᛵᛵ;

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
    check-cast p1, Lyyds/ᲁᛵᛵ;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᲁᛵᛵ;->ᛲᲈᲁ:Ljava/util/List;

    .line 14
    .line 15
    iget-object v3, p1, Lyyds/ᲁᛵᛵ;->ᛲᲈᲁ:Ljava/util/List;

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
    iget-boolean v1, p0, Lyyds/ᲁᛵᛵ;->ᛵᛸᛸᛷ:Z

    .line 25
    .line 26
    iget-boolean v3, p1, Lyyds/ᲁᛵᛵ;->ᛵᛸᛸᛷ:Z

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-boolean p0, p0, Lyyds/ᲁᛵᛵ;->ᲀᛲᛳᲀ:Z

    .line 32
    .line 33
    iget-boolean p1, p1, Lyyds/ᲁᛵᛵ;->ᲀᛲᛳᲀ:Z

    .line 34
    .line 35
    if-eq p0, p1, :cond_4

    .line 36
    .line 37
    return v2

    .line 38
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᲁᛵᛵ;->ᛲᲈᲁ:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-boolean v2, p0, Lyyds/ᲁᛵᛵ;->ᛵᛸᛸᛷ:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lyyds/ᲀᲁᲈᲇ;->ᲇᲈᛵᛷ(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean p0, p0, Lyyds/ᲁᛵᛵ;->ᲀᛲᛳᲀ:Z

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    const-wide v1, -0x3b6cbe68a836eL

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
    iget-object v1, p0, Lyyds/ᲁᛵᛵ;->ᛲᲈᲁ:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-wide v1, -0x3b6e0e68a836eL

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-boolean v1, p0, Lyyds/ᲁᛵᛵ;->ᛵᛸᛸᛷ:Z

    .line 33
    .line 34
    const-wide v2, -0x3b6ebe68a836eL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 40
    .line 41
    .line 42
    iget-boolean p0, p0, Lyyds/ᲁᛵᛵ;->ᲀᛲᛳᲀ:Z

    .line 43
    .line 44
    const/16 v1, 0x29

    .line 45
    .line 46
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛱᛳᲇ(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
