.class public final Lyyds/ᲀᛷᛱᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:Ljava/util/Map;

.field public final ᲀᛲᛳᲀ:Ljava/util/Set;

.field public final ᲇᲈᛵᛷ:Ljava/util/Set;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲀᛷᛱᛵ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲀᛷᛱᛵ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲀᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᲀᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 11
    .line 12
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
    instance-of v0, p1, Lyyds/ᲀᛷᛱᛵ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Lyyds/ᲀᛷᛱᛵ;

    .line 10
    .line 11
    iget-object v0, p1, Lyyds/ᲀᛷᛱᛵ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, Lyyds/ᲀᛷᛱᛵ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, Lyyds/ᲀᛷᛱᛵ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 23
    .line 24
    iget-object v1, p1, Lyyds/ᲀᛷᛱᛵ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, Lyyds/ᲀᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 34
    .line 35
    iget-object v1, p1, Lyyds/ᲀᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_4
    iget-object p0, p0, Lyyds/ᲀᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 46
    .line 47
    if-eqz p0, :cond_6

    .line 48
    .line 49
    iget-object p1, p1, Lyyds/ᲀᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 50
    .line 51
    if-nez p1, :cond_5

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_5
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    return p0

    .line 59
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 60
    return p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛷᛱᛵ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lyyds/ᲀᛷᛱᛵ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, Lyyds/ᲀᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\n            |TableInfo {\n            |    name = \'"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lyyds/ᲀᛷᛱᛵ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\',\n            |    columns = {"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lyyds/ᲀᛷᛱᛵ;->ᛵᛸᛸᛷ:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Lyyds/ᛶᛳᛶᛵ;

    .line 25
    .line 26
    const/16 v3, 0x15

    .line 27
    .line 28
    invoke-direct {v2, v3}, Lyyds/ᛶᛳᛶᛵ;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Lyyds/ᛷᛷᛶᲇ;->ᛶᛴᛱᛲ(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lyyds/ᛶᛶᲁᲇ;->ᛶᛷᛲᲁ(Ljava/util/Collection;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "\n            |    foreignKeys = {"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Lyyds/ᲀᛷᛱᛵ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 48
    .line 49
    invoke-static {v1}, Lyyds/ᛶᛶᲁᲇ;->ᛶᛷᛲᲁ(Ljava/util/Collection;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, "\n            |    indices = {"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object p0, p0, Lyyds/ᲀᛷᛱᛵ;->ᲇᲈᛵᛷ:Ljava/util/Set;

    .line 62
    .line 63
    if-eqz p0, :cond_0

    .line 64
    .line 65
    new-instance v1, Lyyds/ᛶᛳᛶᛵ;

    .line 66
    .line 67
    const/16 v2, 0x16

    .line 68
    .line 69
    invoke-direct {v1, v2}, Lyyds/ᛶᛳᛶᛵ;-><init>(I)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v1}, Lyyds/ᛷᛷᛶᲇ;->ᛶᛴᛱᛲ(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    goto :goto_0

    .line 77
    :cond_0
    sget-object p0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 78
    .line 79
    :goto_0
    invoke-static {p0}, Lyyds/ᛶᛶᲁᲇ;->ᛶᛷᛲᲁ(Ljava/util/Collection;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string p0, "\n            |}\n        "

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, Lyyds/ᛴᛱᲁᲈ;->ᛱᛳᲇ(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    return-object p0
.end method
