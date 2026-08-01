.class public final Luf0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lb00;


# static fields
.field public static final ζ:Lvc0;


# instance fields
.field public final α:Lt41;

.field public final β:La00;

.field public final γ:Lm6;

.field public δ:I

.field public final ε:Lrf;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, Lvc0;->ζ:Lvc0;

    .line 2
    .line 3
    const-string v0, "OkHttp-Response-Body"

    .line 4
    .line 5
    const-string v1, "Truncated"

    .line 6
    .line 7
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, [Ljava/lang/String;

    .line 17
    .line 18
    array-length v2, v0

    .line 19
    rem-int/2addr v2, v1

    .line 20
    if-nez v2, :cond_3

    .line 21
    .line 22
    array-length v2, v0

    .line 23
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, [Ljava/lang/String;

    .line 28
    .line 29
    array-length v3, v2

    .line 30
    const/4 v4, 0x0

    .line 31
    move v5, v4

    .line 32
    :goto_0
    if-ge v5, v3, :cond_1

    .line 33
    .line 34
    aget-object v6, v2, v5

    .line 35
    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    aget-object v6, v0, v5

    .line 39
    .line 40
    invoke-static {v6}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    aput-object v6, v2, v5

    .line 49
    .line 50
    add-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const-string v0, "Headers cannot be null"

    .line 54
    .line 55
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    array-length v0, v2

    .line 60
    add-int/lit8 v0, v0, -0x1

    .line 61
    .line 62
    invoke-static {v4, v0, v1}, Lg81;->θ(III)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-ltz v0, :cond_2

    .line 67
    .line 68
    :goto_1
    aget-object v1, v2, v4

    .line 69
    .line 70
    add-int/lit8 v3, v4, 0x1

    .line 71
    .line 72
    aget-object v3, v2, v3

    .line 73
    .line 74
    invoke-static {v1}, Lv81;->ζ(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v3, v1}, Lv81;->η(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    if-eq v4, v0, :cond_2

    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    new-instance v0, Lvc0;

    .line 86
    .line 87
    invoke-direct {v0, v2}, Lvc0;-><init>([Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Luf0;->ζ:Lvc0;

    .line 91
    .line 92
    return-void

    .line 93
    :cond_3
    const-string v0, "Expected alternating header names and values"

    .line 94
    .line 95
    invoke-static {v0}, Lγ;->ν(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public constructor <init>(Lt41;La00;Lm6;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Luf0;->α:Lt41;

    .line 8
    .line 9
    iput-object p2, p0, Luf0;->β:La00;

    .line 10
    .line 11
    iput-object p3, p0, Luf0;->γ:Lm6;

    .line 12
    .line 13
    new-instance p1, Lrf;

    .line 14
    .line 15
    iget-object p2, p3, Lm6;->η:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, Lrk1;

    .line 18
    .line 19
    invoke-direct {p1, p2}, Lrf;-><init>(Lrk1;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Luf0;->ε:Lrf;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Luf0;->β:La00;

    .line 2
    .line 3
    invoke-interface {p0}, La00;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final α(Li5;)V
    .locals 5

    .line 1
    iget-object v0, p0, Luf0;->β:La00;

    .line 2
    .line 3
    invoke-interface {v0}, La00;->ζ()Lzo1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, Lzo1;->β:Ljava/net/Proxy;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v2, p1, Li5;->γ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 v2, 0x20

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v2, p1, Li5;->β:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, Log0;

    .line 36
    .line 37
    iget-object v3, v2, Log0;->α:Ljava/lang/String;

    .line 38
    .line 39
    const-string v4, "https"

    .line 40
    .line 41
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_0

    .line 46
    .line 47
    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 48
    .line 49
    if-ne v0, v3, :cond_0

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v2}, Log0;->β()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v2}, Log0;->δ()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    new-instance v3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 v0, 0x3f

    .line 74
    .line 75
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    :goto_0
    const-string v0, " HTTP/1.1"

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iget-object p1, p1, Li5;->δ:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast p1, Lvc0;

    .line 100
    .line 101
    invoke-virtual {p0, p1, v0}, Luf0;->μ(Lvc0;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final β(Lzn1;)Lrx1;
    .locals 9

    .line 1
    iget-object v0, p1, Lzn1;->ε:Li5;

    .line 2
    .line 3
    invoke-static {p1}, Lmg0;->α(Lzn1;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object p1, v0, Li5;->β:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Log0;

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    invoke-virtual {p0, p1, v0, v1}, Luf0;->λ(Log0;J)Lrf0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    iget-object v1, p1, Lzn1;->κ:Lvc0;

    .line 21
    .line 22
    const-string v2, "Transfer-Encoding"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    :cond_1
    const-string v2, "chunked"

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const-string v2, "state: "

    .line 38
    .line 39
    const/4 v3, 0x5

    .line 40
    const/4 v4, 0x4

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-object p1, v0, Li5;->β:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Log0;

    .line 46
    .line 47
    iget v0, p0, Luf0;->δ:I

    .line 48
    .line 49
    if-ne v0, v4, :cond_2

    .line 50
    .line 51
    iput v3, p0, Luf0;->δ:I

    .line 52
    .line 53
    new-instance v0, Lqf0;

    .line 54
    .line 55
    invoke-direct {v0, p0, p1}, Lqf0;-><init>(Luf0;Log0;)V

    .line 56
    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_2
    iget p0, p0, Luf0;->δ:I

    .line 60
    .line 61
    invoke-static {v2, p0}, Lql1;->ε(Ljava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0

    .line 66
    :cond_3
    invoke-static {p1}, Lud2;->ε(Lzn1;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v5

    .line 70
    const-wide/16 v7, -0x1

    .line 71
    .line 72
    cmp-long p1, v5, v7

    .line 73
    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    iget-object p1, v0, Li5;->β:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p1, Log0;

    .line 79
    .line 80
    invoke-virtual {p0, p1, v5, v6}, Luf0;->λ(Log0;J)Lrf0;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_4
    iget-object p1, v0, Li5;->β:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Log0;

    .line 88
    .line 89
    iget v0, p0, Luf0;->δ:I

    .line 90
    .line 91
    if-ne v0, v4, :cond_5

    .line 92
    .line 93
    iput v3, p0, Luf0;->δ:I

    .line 94
    .line 95
    iget-object v0, p0, Luf0;->β:La00;

    .line 96
    .line 97
    invoke-interface {v0}, La00;->θ()V

    .line 98
    .line 99
    .line 100
    new-instance v0, Ltf0;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-direct {v0, p0, p1}, Lof0;-><init>(Luf0;Log0;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_5
    iget p0, p0, Luf0;->δ:I

    .line 110
    .line 111
    invoke-static {v2, p0}, Lql1;->ε(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    const/4 p0, 0x0

    .line 115
    return-object p0
.end method

.method public final γ()V
    .locals 0

    .line 1
    iget-object p0, p0, Luf0;->γ:Lm6;

    .line 2
    .line 3
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lqk1;

    .line 6
    .line 7
    invoke-virtual {p0}, Lqk1;->flush()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final δ()Z
    .locals 1

    .line 1
    iget p0, p0, Luf0;->δ:I

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

.method public final ε()V
    .locals 0

    .line 1
    iget-object p0, p0, Luf0;->γ:Lm6;

    .line 2
    .line 3
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lqk1;

    .line 6
    .line 7
    invoke-virtual {p0}, Lqk1;->flush()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ζ()Llx1;
    .locals 0

    .line 1
    iget-object p0, p0, Luf0;->γ:Lm6;

    .line 2
    .line 3
    return-object p0
.end method

.method public final η()La00;
    .locals 0

    .line 1
    iget-object p0, p0, Luf0;->β:La00;

    .line 2
    .line 3
    return-object p0
.end method

.method public final θ(Lzn1;)J
    .locals 1

    .line 1
    invoke-static {p1}, Lmg0;->α(Lzn1;)Z

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
    iget-object p0, p1, Lzn1;->κ:Lvc0;

    .line 11
    .line 12
    const-string v0, "Transfer-Encoding"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

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
    invoke-static {p1}, Lud2;->ε(Lzn1;)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    return-wide p0
.end method

.method public final ι(Li5;J)Liw1;
    .locals 5

    .line 1
    iget-object p1, p1, Li5;->δ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lvc0;

    .line 4
    .line 5
    const-string v0, "Transfer-Encoding"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lvc0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v0, "chunked"

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const-string v0, "state: "

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    const/4 v2, 0x1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget p1, p0, Luf0;->δ:I

    .line 24
    .line 25
    if-ne p1, v2, :cond_0

    .line 26
    .line 27
    iput v1, p0, Luf0;->δ:I

    .line 28
    .line 29
    new-instance p1, Lpf0;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lpf0;-><init>(Luf0;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    iget p0, p0, Luf0;->δ:I

    .line 36
    .line 37
    invoke-static {v0, p0}, Lql1;->ε(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    const/4 p0, 0x0

    .line 41
    return-object p0

    .line 42
    :cond_1
    const-wide/16 v3, -0x1

    .line 43
    .line 44
    cmp-long p1, p2, v3

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    iget p1, p0, Luf0;->δ:I

    .line 49
    .line 50
    if-ne p1, v2, :cond_2

    .line 51
    .line 52
    iput v1, p0, Luf0;->δ:I

    .line 53
    .line 54
    new-instance p1, Lsf0;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Lsf0;-><init>(Luf0;)V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_2
    iget p0, p0, Luf0;->δ:I

    .line 61
    .line 62
    invoke-static {v0, p0}, Lql1;->ε(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    const-string p0, "Cannot stream a request body without chunked encoding or a known content length!"

    .line 67
    .line 68
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0
.end method

.method public final κ(Z)Lyn1;
    .locals 7

    .line 1
    iget-object v0, p0, Luf0;->ε:Lrf;

    .line 2
    .line 3
    iget v1, p0, Luf0;->δ:I

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p1, "state: "

    .line 18
    .line 19
    iget p0, p0, Luf0;->δ:I

    .line 20
    .line 21
    invoke-static {p1, p0}, Lql1;->ε(Ljava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    :goto_0
    :try_start_0
    iget-object v1, v0, Lrf;->γ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lad;

    .line 29
    .line 30
    iget-wide v3, v0, Lrf;->β:J

    .line 31
    .line 32
    invoke-interface {v1, v3, v4}, Lad;->ι(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-wide v3, v0, Lrf;->β:J

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    int-to-long v5, v5

    .line 43
    sub-long/2addr v3, v5

    .line 44
    iput-wide v3, v0, Lrf;->β:J

    .line 45
    .line 46
    invoke-static {v1}, Lg81;->ξ(Ljava/lang/String;)Ln2;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget v3, v1, Ln2;->β:I

    .line 51
    .line 52
    new-instance v4, Lyn1;

    .line 53
    .line 54
    invoke-direct {v4}, Lyn1;-><init>()V

    .line 55
    .line 56
    .line 57
    iget-object v5, v1, Ln2;->γ:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, Lzj1;

    .line 60
    .line 61
    iput-object v5, v4, Lyn1;->β:Lzj1;

    .line 62
    .line 63
    iput v3, v4, Lyn1;->γ:I

    .line 64
    .line 65
    iget-object v1, v1, Ln2;->δ:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Ljava/lang/String;

    .line 68
    .line 69
    iput-object v1, v4, Lyn1;->δ:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0}, Lrf;->γ()Lvc0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lvc0;->γ()Luc0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, v4, Lyn1;->ζ:Luc0;

    .line 80
    .line 81
    const/16 v0, 0x64

    .line 82
    .line 83
    if-eqz p1, :cond_2

    .line 84
    .line 85
    if-ne v3, v0, :cond_2

    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0

    .line 89
    :cond_2
    if-ne v3, v0, :cond_3

    .line 90
    .line 91
    iput v2, p0, Luf0;->δ:I

    .line 92
    .line 93
    return-object v4

    .line 94
    :catch_0
    move-exception p1

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    const/16 p1, 0x66

    .line 97
    .line 98
    if-gt p1, v3, :cond_4

    .line 99
    .line 100
    const/16 p1, 0xc8

    .line 101
    .line 102
    if-ge v3, p1, :cond_4

    .line 103
    .line 104
    iput v2, p0, Luf0;->δ:I

    .line 105
    .line 106
    return-object v4

    .line 107
    :cond_4
    const/4 p1, 0x4

    .line 108
    iput p1, p0, Luf0;->δ:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .line 110
    return-object v4

    .line 111
    :goto_1
    iget-object p0, p0, Luf0;->β:La00;

    .line 112
    .line 113
    invoke-interface {p0}, La00;->ζ()Lzo1;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    iget-object p0, p0, Lzo1;->α:Lp;

    .line 118
    .line 119
    iget-object p0, p0, Lp;->θ:Log0;

    .line 120
    .line 121
    invoke-virtual {p0}, Log0;->ζ()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    new-instance v0, Ljava/io/IOException;

    .line 126
    .line 127
    const-string v1, "unexpected end of stream on "

    .line 128
    .line 129
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-direct {v0, p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    throw v0
.end method

.method public final λ(Log0;J)Lrf0;
    .locals 2

    .line 1
    iget v0, p0, Luf0;->δ:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x5

    .line 7
    iput v0, p0, Luf0;->δ:I

    .line 8
    .line 9
    new-instance v0, Lrf0;

    .line 10
    .line 11
    invoke-direct {v0, p0, p1, p2, p3}, Lrf0;-><init>(Luf0;Log0;J)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string p1, "state: "

    .line 16
    .line 17
    iget p0, p0, Luf0;->δ:I

    .line 18
    .line 19
    invoke-static {p1, p0}, Lql1;->ε(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final μ(Lvc0;Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Luf0;->δ:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Luf0;->γ:Lm6;

    .line 9
    .line 10
    iget-object v1, v0, Lm6;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lqk1;

    .line 13
    .line 14
    invoke-virtual {v1, p2}, Lqk1;->ν(Ljava/lang/String;)Lzc;

    .line 15
    .line 16
    .line 17
    const-string p2, "\r\n"

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Lqk1;->ν(Ljava/lang/String;)Lzc;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lvc0;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x0

    .line 27
    :goto_0
    iget-object v3, v0, Lm6;->θ:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Lqk1;

    .line 30
    .line 31
    if-ge v2, v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Lvc0;->β(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v3, v4}, Lqk1;->ν(Ljava/lang/String;)Lzc;

    .line 38
    .line 39
    .line 40
    const-string v4, ": "

    .line 41
    .line 42
    invoke-virtual {v3, v4}, Lqk1;->ν(Ljava/lang/String;)Lzc;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lvc0;->δ(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {v3, v4}, Lzc;->ν(Ljava/lang/String;)Lzc;

    .line 50
    .line 51
    .line 52
    invoke-interface {v3, p2}, Lzc;->ν(Ljava/lang/String;)Lzc;

    .line 53
    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v3, p2}, Lqk1;->ν(Ljava/lang/String;)Lzc;

    .line 59
    .line 60
    .line 61
    const/4 p1, 0x1

    .line 62
    iput p1, p0, Luf0;->δ:I

    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    const-string p1, "state: "

    .line 66
    .line 67
    iget p0, p0, Luf0;->δ:I

    .line 68
    .line 69
    invoke-static {p1, p0}, Lql1;->ε(Ljava/lang/String;I)V

    .line 70
    .line 71
    .line 72
    return-void
.end method
