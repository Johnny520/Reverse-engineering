.class public final Lyyds/ᛴᛸᛶᲈ;
.super Lyyds/ᲀᛶᛵᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final ᲀᛲᛳᲀ:Ljava/lang/String;

.field public final ᲇᲈᛵᛷ:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/16 v0, 0x2f

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iput-object v1, p0, Lyyds/ᛴᛸᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-le v2, v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string p1, ""

    .line 40
    .line 41
    :goto_0
    iput-object p1, p0, Lyyds/ᛴᛸᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lyyds/ᛴᛷᛷᲇ;->ᲀᛲᛳᲀ([C)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-static {v1, p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lyyds/ᛴᛸᛶᲈ;->ᲇᲈᛵᛷ:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Pattern;)V
    .locals 7

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    invoke-virtual {p1}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lyyds/ᛴᛸᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 60
    iput-object p1, p0, Lyyds/ᛴᛸᛶᲈ;->ᲇᲈᛵᛷ:Ljava/util/regex/Pattern;

    .line 61
    invoke-virtual {p1}, Ljava/util/regex/Pattern;->flags()I

    move-result p1

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x7

    .line 63
    invoke-static {v1}, Lyyds/ᲀᲁᲈᲇ;->ᛲᛶᛱᲈ(I)[I

    move-result-object v1

    .line 64
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget v4, v1, v3

    .line 65
    invoke-static {v4}, Lyyds/ᛴᛷᛷᲇ;->ᲇᲈᛵᛷ(I)I

    move-result v5

    and-int v6, v5, p1

    if-ne v6, v5, :cond_0

    .line 66
    invoke-static {v4}, Lyyds/ᛴᛷᛷᲇ;->ᛲᛴᛳᛲ(I)C

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 68
    iput-object p1, p0, Lyyds/ᛴᛸᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lyyds/ᛴᛸᛶᲈ;

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
    check-cast p1, Lyyds/ᛴᛸᛶᲈ;

    .line 12
    .line 13
    iget-object p1, p1, Lyyds/ᛴᛸᛶᲈ;->ᲇᲈᛵᛷ:Ljava/util/regex/Pattern;

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛴᛸᛶᲈ;->ᲇᲈᛵᛷ:Ljava/util/regex/Pattern;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    if-nez p1, :cond_4

    .line 27
    .line 28
    :cond_3
    return v0

    .line 29
    :cond_4
    :goto_0
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛴᛸᛶᲈ;->ᲀᛲᛳᲀ:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "/"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Lyyds/ᛴᛸᛶᲈ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_0
    return-object v0
.end method

.method public final ᛶᛷᛲᲁ()Lyyds/ᛴᛸᛶᲈ;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final ᛷᲈᲈᲁ(Lyyds/ᛴᛵᲀᛴ;)Ljava/lang/Class;
    .locals 0

    .line 1
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method
