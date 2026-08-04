.class public final Lyyds/ᛳᲇᛷᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public final ᛲᲈᲁ:Ljava/lang/String;

.field public final ᛵᛸᛸᛷ:[J

.field public final synthetic ᛶᛷᛲᲁ:Lyyds/ᛳᛴ;

.field public final ᲀᛲᛳᲀ:[Ljava/io/File;

.field public ᲇᲇᲇᛱ:Lyyds/ᲀᲇᛶᲇ;

.field public final ᲇᲈᛵᛷ:[Ljava/io/File;


# direct methods
.method public constructor <init>(Lyyds/ᛳᛴ;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛳᲇᛷᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛴ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛳᲇᛷᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 7
    .line 8
    iget v0, p1, Lyyds/ᛳᛴ;->ᛲᛳᛶᲁ:I

    .line 9
    .line 10
    iget-object v1, p1, Lyyds/ᛳᛴ;->ᲀᛲᛳᲀ:Ljava/io/File;

    .line 11
    .line 12
    new-array v2, v0, [J

    .line 13
    .line 14
    iput-object v2, p0, Lyyds/ᛳᲇᛷᛷ;->ᛵᛸᛸᛷ:[J

    .line 15
    .line 16
    iget-boolean p1, p1, Lyyds/ᛳᛴ;->ᛷᲈᲈᲁ:Z

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-array p1, v0, [Ljava/io/File;

    .line 22
    .line 23
    iput-object p1, p0, Lyyds/ᛳᲇᛷᛷ;->ᲀᛲᛳᲀ:[Ljava/io/File;

    .line 24
    .line 25
    new-array p1, v0, [Ljava/io/File;

    .line 26
    .line 27
    iput-object p1, p0, Lyyds/ᛳᲇᛷᛷ;->ᲇᲈᛵᛷ:[Ljava/io/File;

    .line 28
    .line 29
    new-instance p1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/16 p2, 0x2e

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    const/4 v2, 0x0

    .line 44
    :goto_0
    if-ge v2, v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v3, p0, Lyyds/ᛳᲇᛷᛷ;->ᲀᛲᛳᲀ:[Ljava/io/File;

    .line 50
    .line 51
    new-instance v4, Ljava/io/File;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-direct {v4, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    aput-object v4, v3, v2

    .line 61
    .line 62
    const-string v3, ".tmp"

    .line 63
    .line 64
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v3, p0, Lyyds/ᛳᲇᛷᛷ;->ᲇᲈᛵᛷ:[Ljava/io/File;

    .line 68
    .line 69
    new-instance v4, Ljava/io/File;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-direct {v4, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    aput-object v4, v3, v2

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 81
    .line 82
    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(I)Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲇᛷᛷ;->ᲀᛲᛳᲀ:[Ljava/io/File;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    aget-object p0, v0, p1

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 9
    .line 10
    iget-object v1, p0, Lyyds/ᛳᲇᛷᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛴ;

    .line 11
    .line 12
    iget-object v1, v1, Lyyds/ᛳᛴ;->ᲀᛲᛳᲀ:Ljava/io/File;

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᛳᲇᛷᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p0, "."

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final ᛵᛸᛸᛷ(I)Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛳᲇᛷᛷ;->ᲇᲈᛵᛷ:[Ljava/io/File;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    aget-object p0, v0, p1

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 9
    .line 10
    iget-object v1, p0, Lyyds/ᛳᲇᛷᛷ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛴ;

    .line 11
    .line 12
    iget-object v1, v1, Lyyds/ᛳᛴ;->ᲀᛲᛳᲀ:Ljava/io/File;

    .line 13
    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᛳᲇᛷᛷ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p0, "."

    .line 22
    .line 23
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string p0, ".tmp"

    .line 30
    .line 31
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v0, v1, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public final ᲀᛲᛳᲀ()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᛳᲇᛷᛷ;->ᛵᛸᛸᛷ:[J

    .line 7
    .line 8
    array-length v1, p0

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-ge v2, v1, :cond_0

    .line 11
    .line 12
    aget-wide v3, p0, v2

    .line 13
    .line 14
    const/16 v5, 0x20

    .line 15
    .line 16
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
