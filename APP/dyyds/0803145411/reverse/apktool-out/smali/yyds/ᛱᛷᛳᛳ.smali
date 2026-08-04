.class public final Lyyds/ᛱᛷᛳᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲀᲇᲇᛵ;


# static fields
.field public static final ᲇᲇᲇᛱ:Lyyds/ᛷᛸᛱᛴ;


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛷᲁᛷᛵ;

.field public final ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

.field public ᲇᲈᛵᛷ:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const-string v0, "OkHttp-Response-Body"

    .line 2
    .line 3
    const-string v1, "Truncated"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, [Ljava/lang/String;

    .line 15
    .line 16
    array-length v2, v0

    .line 17
    rem-int/2addr v2, v1

    .line 18
    if-nez v2, :cond_3

    .line 19
    .line 20
    array-length v2, v0

    .line 21
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, [Ljava/lang/String;

    .line 26
    .line 27
    array-length v3, v2

    .line 28
    const/4 v4, 0x0

    .line 29
    move v5, v4

    .line 30
    :goto_0
    if-ge v5, v3, :cond_1

    .line 31
    .line 32
    aget-object v6, v2, v5

    .line 33
    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    aget-object v6, v0, v5

    .line 37
    .line 38
    invoke-static {v6}, Lyyds/ᛲᲇᛸᲇ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    aput-object v6, v2, v5

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const-string v0, "Headers cannot be null"

    .line 52
    .line 53
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    array-length v0, v2

    .line 58
    add-int/lit8 v0, v0, -0x1

    .line 59
    .line 60
    invoke-static {v4, v0, v1}, Lyyds/ᲀᛳᛳᛱ;->ᲇᲇᲇᛱ(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-ltz v0, :cond_2

    .line 65
    .line 66
    :goto_1
    aget-object v1, v2, v4

    .line 67
    .line 68
    add-int/lit8 v3, v4, 0x1

    .line 69
    .line 70
    aget-object v3, v2, v3

    .line 71
    .line 72
    invoke-static {v1}, Lyyds/ᛴᛲᛴᛲ;->ᛷᛲᲈᛱ(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v3, v1}, Lyyds/ᛴᛲᛴᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    if-eq v4, v0, :cond_2

    .line 79
    .line 80
    add-int/lit8 v4, v4, 0x2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    new-instance v0, Lyyds/ᛷᛸᛱᛴ;

    .line 84
    .line 85
    invoke-direct {v0, v2}, Lyyds/ᛷᛸᛱᛴ;-><init>([Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    sput-object v0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛸᛱᛴ;

    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    const-string v0, "Expected alternating header names and values"

    .line 92
    .line 93
    invoke-static {v0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public constructor <init>(Lyyds/ᛶᛲᛷ;Lyyds/ᛷᛷᲈᛸ;Lyyds/ᛳᛷᲀᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛱᛷᛳᛳ;->ᛲᲈᲁ:Lyyds/ᛶᛲᛷ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛱᛷᛳᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 9
    .line 10
    new-instance p1, Lyyds/ᛷᲁᛷᛵ;

    .line 11
    .line 12
    iget-object p2, p3, Lyyds/ᛳᛷᲀᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lyyds/ᲀᲀᛵᲈ;

    .line 15
    .line 16
    invoke-direct {p1, p2}, Lyyds/ᛷᲁᛷᛵ;-><init>(Lyyds/ᲀᲀᛵᲈ;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lyyds/ᛱᛷᛳᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲁᛷᛵ;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᛷᛷᲈᛸ;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛱᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)J
    .locals 1

    .line 1
    invoke-static {p1}, Lyyds/ᲁᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-wide/16 p0, 0x0

    .line 8
    .line 9
    return-wide p0

    .line 10
    :cond_0
    iget-object p0, p1, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 11
    .line 12
    const-string v0, "Transfer-Encoding"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    if-nez p0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    :cond_1
    const-string v0, "chunked"

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-wide/16 p0, -0x1

    .line 30
    .line 31
    return-wide p0

    .line 32
    :cond_2
    invoke-static {p1}, Lyyds/ᛴᛲᛲᲇ;->ᛲᛴᛳᛲ(Lyyds/ᛴᛴᛷᲁ;)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
.end method

.method public final ᛲᛳᛶᲁ(Lyyds/ᛴᛴᛷᲁ;)Lyyds/ᛷᛷᛳᛷ;
    .locals 10

    .line 1
    iget-object v0, p1, Lyyds/ᛴᛴᛷᲁ;->ᲀᛲᛳᲀ:Lyyds/ᲀᲁᲁ;

    .line 2
    .line 3
    invoke-static {p1}, Lyyds/ᲁᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛴᛴᛷᲁ;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object p1, v0, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 10
    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    invoke-virtual {p0, p1, v0, v1}, Lyyds/ᛱᛷᛳᛳ;->ᛷᛲᲈᛱ(Lyyds/ᛱᛲᲀᛶ;J)Lyyds/ᲁᲈᛱ;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const-string v1, "Transfer-Encoding"

    .line 19
    .line 20
    iget-object v2, p1, Lyyds/ᛴᛴᛷᲁ;->ᛱᲈᲁ:Lyyds/ᛷᛸᛱᛴ;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    move-object v1, v2

    .line 30
    :cond_1
    const-string v3, "chunked"

    .line 31
    .line 32
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const-string v3, "state: "

    .line 37
    .line 38
    const/4 v4, 0x5

    .line 39
    const/4 v5, 0x4

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    iget-object p1, v0, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 43
    .line 44
    iget v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 45
    .line 46
    if-ne v0, v5, :cond_2

    .line 47
    .line 48
    iput v4, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 49
    .line 50
    new-instance v0, Lyyds/ᛳᛸᛵᲀ;

    .line 51
    .line 52
    invoke-direct {v0, p0, p1}, Lyyds/ᛳᛸᛵᲀ;-><init>(Lyyds/ᛱᛷᛳᛳ;Lyyds/ᛱᛲᲀᛶ;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_2
    iget p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 57
    .line 58
    invoke-static {p0, v3}, Lyyds/ᛷᲈᲈᛶ;->ᛵᛸᛸᛷ(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v2

    .line 62
    :cond_3
    invoke-static {p1}, Lyyds/ᛴᛲᛲᲇ;->ᛲᛴᛳᛲ(Lyyds/ᛴᛴᛷᲁ;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v6

    .line 66
    const-wide/16 v8, -0x1

    .line 67
    .line 68
    cmp-long p1, v6, v8

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    iget-object p1, v0, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 73
    .line 74
    invoke-virtual {p0, p1, v6, v7}, Lyyds/ᛱᛷᛳᛳ;->ᛷᛲᲈᛱ(Lyyds/ᛱᛲᲀᛶ;J)Lyyds/ᲁᲈᛱ;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_4
    iget-object p1, v0, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 80
    .line 81
    iget v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 82
    .line 83
    if-ne v0, v5, :cond_5

    .line 84
    .line 85
    iput v4, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 86
    .line 87
    iget-object v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

    .line 88
    .line 89
    invoke-interface {v0}, Lyyds/ᛷᛷᲈᛸ;->ᛱᲈᲁ()V

    .line 90
    .line 91
    .line 92
    new-instance v0, Lyyds/ᲇᛱᛶᛵ;

    .line 93
    .line 94
    invoke-direct {v0, p0, p1}, Lyyds/ᛱᛶᲇ;-><init>(Lyyds/ᛱᛷᛳᛳ;Lyyds/ᛱᛲᲀᛶ;)V

    .line 95
    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_5
    iget p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 99
    .line 100
    invoke-static {p0, v3}, Lyyds/ᛷᲈᲈᛶ;->ᛵᛸᛸᛷ(ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v2
.end method

.method public final ᛲᛴᛳᛲ()Lyyds/ᲁᛸᛶᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᲀᲁᲁ;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

    .line 2
    .line 3
    invoke-interface {v0}, Lyyds/ᛷᛷᲈᛸ;->ᲇᲇᲇᛱ()Lyyds/ᛶᛶᲈᛷ;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lyyds/ᛶᛶᲈᛷ;->ᛵᛸᛸᛷ:Ljava/net/Proxy;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v2, p1, Lyyds/ᲀᲁᲁ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 v2, 0x20

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v2, p1, Lyyds/ᲀᲁᲁ;->ᛲᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 29
    .line 30
    iget-object v3, v2, Lyyds/ᛱᛲᲀᛶ;->ᛲᲈᲁ:Ljava/lang/String;

    .line 31
    .line 32
    const-string v4, "https"

    .line 33
    .line 34
    invoke-static {v3, v4}, Lyyds/ᛷᛴᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_0

    .line 39
    .line 40
    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 41
    .line 42
    if-ne v0, v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v2}, Lyyds/ᛱᛲᲀᛶ;->ᛵᛸᛸᛷ()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v2}, Lyyds/ᛱᛲᲀᛶ;->ᲇᲈᛵᛷ()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/16 v0, 0x3f

    .line 64
    .line 65
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    :goto_0
    const-string v0, " HTTP/1.1"

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object p1, p1, Lyyds/ᲀᲁᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛸᛱᛴ;

    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, Lyyds/ᛱᛷᛳᛳ;->ᛷᛵᲇᲀ(Lyyds/ᛷᛸᛱᛴ;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final ᛵᛸᛸᛷ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyyds/ᲈᲇᛲᛴ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->flush()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ᛶᛷᛲᲁ(Lyyds/ᲀᲁᲁ;J)Lyyds/ᲀᛳᲇᲁ;
    .locals 6

    .line 1
    const-string v0, "Transfer-Encoding"

    .line 2
    .line 3
    iget-object p1, p1, Lyyds/ᲀᲁᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛸᛱᛴ;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lyyds/ᛷᛸᛱᛴ;->ᛲᲈᲁ(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "chunked"

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x0

    .line 16
    const-string v1, "state: "

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, 0x1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget p1, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 23
    .line 24
    if-ne p1, v3, :cond_0

    .line 25
    .line 26
    iput v2, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 27
    .line 28
    new-instance p1, Lyyds/ᲀᛴᲈᲈ;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Lyyds/ᲀᛴᲈᲈ;-><init>(Lyyds/ᛱᛷᛳᛳ;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_0
    iget p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 35
    .line 36
    invoke-static {p0, v1}, Lyyds/ᛷᲈᲈᛶ;->ᛵᛸᛸᛷ(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_1
    const-wide/16 v4, -0x1

    .line 41
    .line 42
    cmp-long p1, p2, v4

    .line 43
    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    iget p1, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 47
    .line 48
    if-ne p1, v3, :cond_2

    .line 49
    .line 50
    iput v2, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 51
    .line 52
    new-instance p1, Lyyds/ᛱᛵᛷᛶ;

    .line 53
    .line 54
    invoke-direct {p1, p0}, Lyyds/ᛱᛵᛷᛶ;-><init>(Lyyds/ᛱᛷᛳᛳ;)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_2
    iget p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 59
    .line 60
    invoke-static {p0, v1}, Lyyds/ᛷᲈᲈᛶ;->ᛵᛸᛸᛷ(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v0

    .line 64
    :cond_3
    const-string p0, "Cannot stream a request body without chunked encoding or a known content length!"

    .line 65
    .line 66
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method

.method public final ᛷᛲᲈᛱ(Lyyds/ᛱᛲᲀᛶ;J)Lyyds/ᲁᲈᛱ;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    new-instance v0, Lyyds/ᲁᲈᛱ;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2, p3}, Lyyds/ᲁᲈᛱ;-><init>(Lyyds/ᛱᛷᛳᛳ;Lyyds/ᛱᛲᲀᛶ;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string p1, "state: "

    .line 16
    .line 17
    iget p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 18
    .line 19
    invoke-static {p0, p1}, Lyyds/ᛷᲈᲈᛶ;->ᛵᛸᛸᛷ(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final ᛷᛵᲇᲀ(Lyyds/ᛷᛸᛱᛴ;Ljava/lang/String;)V
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 6
    .line 7
    iget-object v1, v0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lyyds/ᲈᲇᛲᛴ;

    .line 10
    .line 11
    invoke-virtual {v1, p2}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 12
    .line 13
    .line 14
    const-string p2, "\r\n"

    .line 15
    .line 16
    invoke-virtual {v1, p2}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lyyds/ᛷᛸᛱᛴ;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    iget-object v3, v0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lyyds/ᲈᲇᛲᛴ;

    .line 27
    .line 28
    if-ge v2, v1, :cond_0

    .line 29
    .line 30
    invoke-static {p1, v2}, Lyyds/ᛴᛲᛴᛲ;->ᲀᛲᛳᲀ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v3, v4}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 35
    .line 36
    .line 37
    const-string v4, ": "

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v2}, Lyyds/ᛴᛲᛴᛲ;->ᛲᛴᛳᛲ(Lyyds/ᛷᛸᛱᛴ;I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3, v4}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, p2}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 50
    .line 51
    .line 52
    add-int/lit8 v2, v2, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v3, p2}, Lyyds/ᲈᲇᛲᛴ;->ᛳᲁᲁᲇ(Ljava/lang/String;)Lyyds/ᛴᛴᛱᛴ;

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    iput p1, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    const-string p1, "state: "

    .line 63
    .line 64
    iget p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 65
    .line 66
    invoke-static {p0, p1}, Lyyds/ᛷᲈᲈᛶ;->ᛵᛸᛸᛷ(ILjava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final ᛷᲈᲈᲁ(Z)Lyyds/ᲁᛸᛶᛲ;
    .locals 8

    .line 1
    iget-object v0, p0, Lyyds/ᛱᛷᛳᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲁᛷᛵ;

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    const/4 v4, 0x2

    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p1, "state: "

    .line 19
    .line 20
    iget p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 21
    .line 22
    invoke-static {p0, p1}, Lyyds/ᛷᲈᲈᛶ;->ᛵᛸᛸᛷ(ILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_1
    :goto_0
    :try_start_0
    iget-object v1, v0, Lyyds/ᛷᲁᛷᛵ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lyyds/ᲀᲀᛵᲈ;

    .line 29
    .line 30
    iget-wide v4, v0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 31
    .line 32
    invoke-virtual {v1, v4, v5}, Lyyds/ᲀᲀᛵᲈ;->ᛳᛸᛴᛶ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-wide v4, v0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    int-to-long v6, v6

    .line 43
    sub-long/2addr v4, v6

    .line 44
    iput-wide v4, v0, Lyyds/ᛷᲁᛷᛵ;->ᛵᛸᛸᛷ:J

    .line 45
    .line 46
    invoke-static {v1}, Lyyds/ᛴᛸᛲ;->ᛷᲈᲈᲁ(Ljava/lang/String;)Lyyds/ᛷᛸᛱᲈ;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget v4, v1, Lyyds/ᛷᛸᛱᲈ;->ᛵᛸᛸᛷ:I

    .line 51
    .line 52
    new-instance v5, Lyyds/ᲁᛸᛶᛲ;

    .line 53
    .line 54
    invoke-direct {v5}, Lyyds/ᲁᛸᛶᛲ;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v6, v1, Lyyds/ᛷᛸᛱᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Lyyds/ᛴᲀᲁᛲ;

    .line 60
    .line 61
    iput-object v6, v5, Lyyds/ᲁᛸᛶᛲ;->ᛵᛸᛸᛷ:Lyyds/ᛴᲀᲁᛲ;

    .line 62
    .line 63
    iput v4, v5, Lyyds/ᲁᛸᛶᛲ;->ᲀᛲᛳᲀ:I

    .line 64
    .line 65
    iget-object v1, v1, Lyyds/ᛷᛸᛱᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    iput-object v1, v5, Lyyds/ᲁᛸᛶᛲ;->ᲇᲈᛵᛷ:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0}, Lyyds/ᛷᲁᛷᛵ;->ᲇᲇᲇᛱ()Lyyds/ᛷᛸᛱᛴ;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lyyds/ᛴᛲᛴᛲ;->ᲇᲈᛵᛷ(Lyyds/ᛷᛸᛱᛴ;)Lyyds/ᲀᲈᛷᛷ;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, v5, Lyyds/ᲁᛸᛶᛲ;->ᲇᲇᲇᛱ:Lyyds/ᲀᲈᛷᛷ;

    .line 80
    .line 81
    const/16 v0, 0x64

    .line 82
    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    if-ne v4, v0, :cond_2

    .line 86
    .line 87
    return-object v2

    .line 88
    :cond_2
    if-ne v4, v0, :cond_3

    .line 89
    .line 90
    iput v3, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 91
    .line 92
    return-object v5

    .line 93
    :catch_0
    move-exception p1

    .line 94
    goto :goto_1

    .line 95
    :cond_3
    const/16 p1, 0x66

    .line 96
    .line 97
    if-gt p1, v4, :cond_4

    .line 98
    .line 99
    const/16 p1, 0xc8

    .line 100
    .line 101
    if-ge v4, p1, :cond_4

    .line 102
    .line 103
    iput v3, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 104
    .line 105
    return-object v5

    .line 106
    :cond_4
    const/4 p1, 0x4

    .line 107
    iput p1, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    return-object v5

    .line 110
    :goto_1
    iget-object p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

    .line 111
    .line 112
    invoke-interface {p0}, Lyyds/ᛷᛷᲈᛸ;->ᲇᲇᲇᛱ()Lyyds/ᛶᛶᲈᛷ;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    iget-object p0, p0, Lyyds/ᛶᛶᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 117
    .line 118
    iget-object p0, p0, Lyyds/ᛷᛸᲇᛴ;->ᛱᲈᲁ:Lyyds/ᛱᛲᲀᛶ;

    .line 119
    .line 120
    invoke-virtual {p0}, Lyyds/ᛱᛲᲀᛶ;->ᛶᛷᛲᲁ()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance v0, Ljava/io/IOException;

    .line 125
    .line 126
    const-string v1, "unexpected end of stream on "

    .line 127
    .line 128
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    throw v0
.end method

.method public final ᲀᛲᛳᲀ()Z
    .locals 1

    .line 1
    iget p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x1

    .line 7
    return p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public final ᲇᲇᲇᛱ()Lyyds/ᛷᛷᲈᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛷᲈᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛱᛷᛳᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛳᛷᲀᛴ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛳᛷᲀᛴ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyyds/ᲈᲇᛲᛴ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᲈᲇᛲᛴ;->flush()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
