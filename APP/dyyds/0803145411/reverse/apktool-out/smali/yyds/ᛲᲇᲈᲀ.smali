.class public final Lyyds/ᛲᲇᲈᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛴᛲ;
.implements Ljava/io/Serializable;


# instance fields
.field public final ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

.field public final ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛱᛴ;


# direct methods
.method public constructor <init>(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛶᛱᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᲇᲈᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛲᲇᲈᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛱᛴ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-eq p0, p1, :cond_7

    .line 2
    .line 3
    instance-of v0, p1, Lyyds/ᛲᲇᲈᲀ;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    check-cast p1, Lyyds/ᛲᲇᲈᲀ;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    move-object v2, p1

    .line 12
    move v3, v0

    .line 13
    :goto_0
    iget-object v2, v2, Lyyds/ᛲᲇᲈᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

    .line 14
    .line 15
    instance-of v4, v2, Lyyds/ᛲᲇᲈᲀ;

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    check-cast v2, Lyyds/ᛲᲇᲈᲀ;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move-object v2, v5

    .line 24
    :goto_1
    if-nez v2, :cond_5

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    :goto_2
    iget-object v2, v2, Lyyds/ᛲᲇᲈᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

    .line 28
    .line 29
    instance-of v4, v2, Lyyds/ᛲᲇᲈᲀ;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    check-cast v2, Lyyds/ᛲᲇᲈᲀ;

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_1
    move-object v2, v5

    .line 37
    :goto_3
    if-nez v2, :cond_4

    .line 38
    .line 39
    if-ne v3, v0, :cond_6

    .line 40
    .line 41
    :goto_4
    iget-object v0, p0, Lyyds/ᛲᲇᲈᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛱᛴ;

    .line 42
    .line 43
    invoke-interface {v0}, Lyyds/ᲁᛶᛱᛴ;->getKey()Lyyds/ᲁᛸᛲᲁ;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1, v2}, Lyyds/ᛲᲇᲈᲀ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2, v0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    move p0, v1

    .line 58
    goto :goto_5

    .line 59
    :cond_2
    iget-object p0, p0, Lyyds/ᛲᲇᲈᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

    .line 60
    .line 61
    instance-of v0, p0, Lyyds/ᛲᲇᲈᲀ;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    check-cast p0, Lyyds/ᛲᲇᲈᲀ;

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_3
    check-cast p0, Lyyds/ᲁᛶᛱᛴ;

    .line 69
    .line 70
    invoke-interface {p0}, Lyyds/ᲁᛶᛱᛴ;->getKey()Lyyds/ᲁᛸᛲᲁ;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Lyyds/ᛲᲇᲈᲀ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1, p0}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    :goto_5
    if-eqz p0, :cond_6

    .line 83
    .line 84
    goto :goto_6

    .line 85
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_6
    return v1

    .line 92
    :cond_7
    :goto_6
    const/4 p0, 0x1

    .line 93
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲇᲈᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object p0, p0, Lyyds/ᛲᲇᲈᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛱᛴ;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lyyds/ᲀᛲᛱᲈ;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-direct {v1, v2}, Lyyds/ᲀᛲᛱᲈ;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-string v2, ""

    .line 15
    .line 16
    invoke-virtual {p0, v2, v1}, Lyyds/ᛲᲇᲈᲀ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    const/16 v1, 0x5d

    .line 23
    .line 24
    invoke-static {v0, p0, v1}, Lyyds/ᛴᛷᛷᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public final ᛳᲁᲁᲇ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲇᲈᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛱᛴ;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lyyds/ᛲᲇᲈᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v2

    .line 12
    :cond_0
    invoke-interface {v2, p1}, Lyyds/ᲁᛴᛲ;->ᛳᲁᲁᲇ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-ne p1, v2, :cond_1

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    sget-object p0, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 20
    .line 21
    if-ne p1, p0, :cond_2

    .line 22
    .line 23
    return-object v0

    .line 24
    :cond_2
    new-instance p0, Lyyds/ᛲᲇᲈᲀ;

    .line 25
    .line 26
    invoke-direct {p0, p1, v0}, Lyyds/ᛲᲇᲈᲀ;-><init>(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛶᛱᛴ;)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public final bridge ᛷᛶᛷᲀ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p0, Lyyds/ᛲᲇᲈᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛱᛴ;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object p0, p0, Lyyds/ᛲᲇᲈᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

    .line 11
    .line 12
    instance-of v0, p0, Lyyds/ᛲᲇᲈᲀ;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p0, Lyyds/ᛲᲇᲈᲀ;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p0, p1}, Lyyds/ᲁᛴᛲ;->ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final ᲇᲇᲇᛱ(Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᲇᲈᲀ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛴᛲ;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lyyds/ᲁᛴᛲ;->ᲇᲇᲇᛱ(Ljava/lang/Object;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, Lyyds/ᛲᲇᲈᲀ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛱᛴ;

    .line 8
    .line 9
    invoke-interface {p2, p1, p0}, Lyyds/ᛲᲇᲁᛴ;->ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
