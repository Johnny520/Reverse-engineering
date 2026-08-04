.class public final Lyyds/ᛳᛵᛶᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Z

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 9
    invoke-direct {p0, v0, v1}, Lyyds/ᛳᛵᛶᛴ;-><init>(Ljava/lang/Object;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 5
    .line 6
    iput-object p1, p0, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 7
    .line 8
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
    instance-of v0, p1, Lyyds/ᛳᛵᛶᛴ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᛳᛵᛶᛴ;

    .line 10
    .line 11
    iget-boolean v0, p0, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 12
    .line 13
    iget-boolean v1, p1, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-object p0, p0, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object p1, p1, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static {p0, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    :goto_0
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    :goto_0
    add-int/2addr v0, p0

    .line 20
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-wide v1, -0x201bce68a836eL

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
    iget-boolean v1, p0, Lyyds/ᛳᛵᛶᛴ;->ᛲᲈᲁ:Z

    .line 16
    .line 17
    const-wide v2, -0x201d6e68a836eL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, Lyyds/ᲀᲁᲈᲇ;->ᲀᛲᛲᲇ(Ljava/lang/StringBuilder;ZJ)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lyyds/ᛳᛵᛶᛴ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p0, 0x29

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

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
