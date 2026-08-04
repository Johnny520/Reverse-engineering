.class public final Lyyds/ᛴᛷᲇᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:Z

.field public final ᲀᛲᛳᲀ:Ljava/util/List;

.field public final ᲇᲈᛵᛷ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᛷᲇᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lyyds/ᛴᛷᲇᲁ;->ᛵᛸᛸᛷ:Z

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛴᛷᲇᲁ;->ᲀᛲᛳᲀ:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛴᛷᲇᲁ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p4}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    new-instance p4, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p4, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    :goto_0
    if-ge p2, p1, :cond_0

    .line 29
    .line 30
    const-string p3, "ASC"

    .line 31
    .line 32
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    add-int/lit8 p2, p2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iput-object p4, p0, Lyyds/ᛴᛷᲇᲁ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p1, Lyyds/ᛴᛷᲇᲁ;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Lyyds/ᛴᛷᲇᲁ;

    .line 11
    .line 12
    iget-object v0, p1, Lyyds/ᛴᛷᲇᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 13
    .line 14
    iget-boolean v1, p1, Lyyds/ᛴᛷᲇᲁ;->ᛵᛸᛸᛷ:Z

    .line 15
    .line 16
    iget-boolean v2, p0, Lyyds/ᛴᛷᲇᲁ;->ᛵᛸᛸᛷ:Z

    .line 17
    .line 18
    if-eq v2, v1, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-object v1, p0, Lyyds/ᛴᛷᲇᲁ;->ᲀᛲᛳᲀ:Ljava/util/List;

    .line 22
    .line 23
    iget-object v2, p1, Lyyds/ᛴᛷᲇᲁ;->ᲀᛲᛳᲀ:Ljava/util/List;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-object v1, p0, Lyyds/ᛴᛷᲇᲁ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 33
    .line 34
    iget-object p1, p1, Lyyds/ᛴᛷᲇᲁ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v1, p1}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_4

    .line 41
    .line 42
    :goto_0
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_4
    iget-object p0, p0, Lyyds/ᛴᛷᲇᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 45
    .line 46
    const-string p1, "index_"

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_5

    .line 53
    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_5
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    const-string v0, "index_"

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛴᛷᲇᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const v0, -0x46960e33

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 20
    .line 21
    iget-boolean v1, p0, Lyyds/ᛴᛷᲇᲁ;->ᛵᛸᛸᛷ:Z

    .line 22
    .line 23
    add-int/2addr v0, v1

    .line 24
    mul-int/lit8 v0, v0, 0x1f

    .line 25
    .line 26
    iget-object v1, p0, Lyyds/ᛴᛷᲇᲁ;->ᲀᛲᛳᲀ:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    add-int/2addr v1, v0

    .line 33
    mul-int/lit8 v1, v1, 0x1f

    .line 34
    .line 35
    iget-object p0, p0, Lyyds/ᛴᛷᲇᲁ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/2addr p0, v1

    .line 42
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\n            |Index {\n            |   name = \'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᛴᛷᲇᲁ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\',\n            |   unique = \'"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lyyds/ᛴᛷᲇᲁ;->ᛵᛸᛸᛷ:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "\',\n            |   columns = {"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    const/16 v7, 0x3e

    .line 30
    .line 31
    iget-object v2, p0, Lyyds/ᛴᛷᲇᲁ;->ᲀᛲᛳᲀ:Ljava/util/List;

    .line 32
    .line 33
    const-string v3, ","

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-static/range {v2 .. v7}, Lyyds/ᛷᛷᛶᲇ;->ᲈᛷᲈᛶ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Lyyds/ᛴᛱᲁᲈ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "},"

    .line 46
    .line 47
    invoke-static {v2}, Lyyds/ᛴᛱᲁᲈ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v1, "\n            |   orders = {"

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v2, p0, Lyyds/ᛴᛷᲇᲁ;->ᲇᲈᛵᛷ:Ljava/util/List;

    .line 64
    .line 65
    const-string v3, ","

    .line 66
    .line 67
    invoke-static/range {v2 .. v7}, Lyyds/ᛷᛷᛶᲇ;->ᲈᛷᲈᛶ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, Lyyds/ᛴᛱᲁᲈ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-string v1, " }"

    .line 76
    .line 77
    invoke-static {v1}, Lyyds/ᛴᛱᲁᲈ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p0, "\n            |}\n        "

    .line 89
    .line 90
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lyyds/ᛴᛱᲁᲈ;->ᛱᛳᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, Lyyds/ᛴᛱᲁᲈ;->ᛲᛲᲈᲈ(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0
.end method
