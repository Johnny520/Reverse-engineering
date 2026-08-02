.class public final Ls92;
.super Ljava/io/Reader;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final h:Lon;

.field public final i:Ljava/nio/charset/Charset;

.field public j:Z

.field public k:Ljava/io/InputStreamReader;


# direct methods
.method public constructor <init>(Lon;Ljava/nio/charset/Charset;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ls92;->h:Lon;

    .line 11
    .line 12
    iput-object p2, p0, Ls92;->i:Ljava/nio/charset/Charset;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ls92;->j:Z

    .line 3
    .line 4
    iget-object v0, p0, Ls92;->k:Ljava/io/InputStreamReader;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p0, p0, Ls92;->h:Lon;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final read([CII)I
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Ls92;->j:Z

    .line 5
    .line 6
    if-nez v0, :cond_7

    .line 7
    .line 8
    iget-object v0, p0, Ls92;->k:Ljava/io/InputStreamReader;

    .line 9
    .line 10
    if-nez v0, :cond_6

    .line 11
    .line 12
    new-instance v0, Ljava/io/InputStreamReader;

    .line 13
    .line 14
    iget-object v1, p0, Ls92;->h:Lon;

    .line 15
    .line 16
    invoke-interface {v1}, Lon;->C()Ljava/io/InputStream;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, Ls92;->h:Lon;

    .line 21
    .line 22
    iget-object v3, p0, Ls92;->i:Ljava/nio/charset/Charset;

    .line 23
    .line 24
    sget-object v4, Lwg3;->a:Ljava/util/TimeZone;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v4, Lug3;->b:Lnv1;

    .line 33
    .line 34
    invoke-interface {v2, v4}, Lon;->m(Lnv1;)I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    const/4 v4, -0x1

    .line 39
    if-eq v2, v4, :cond_5

    .line 40
    .line 41
    if-eqz v2, :cond_4

    .line 42
    .line 43
    const/4 v3, 0x1

    .line 44
    if-eq v2, v3, :cond_3

    .line 45
    .line 46
    const/4 v3, 0x2

    .line 47
    if-eq v2, v3, :cond_2

    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    if-eq v2, v3, :cond_1

    .line 51
    .line 52
    const/4 v3, 0x4

    .line 53
    if-ne v2, v3, :cond_0

    .line 54
    .line 55
    sget-object v2, Lwq;->a:Ljava/nio/charset/Charset;

    .line 56
    .line 57
    sget-object v3, Lwq;->e:Ljava/nio/charset/Charset;

    .line 58
    .line 59
    if-nez v3, :cond_5

    .line 60
    .line 61
    const-string v2, "UTF-32BE"

    .line 62
    .line 63
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    sput-object v3, Lwq;->e:Ljava/nio/charset/Charset;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 74
    .line 75
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 76
    .line 77
    .line 78
    throw p0

    .line 79
    :cond_1
    sget-object v3, Lwq;->c:Ljava/nio/charset/Charset;

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    sget-object v2, Lwq;->a:Ljava/nio/charset/Charset;

    .line 83
    .line 84
    sget-object v3, Lwq;->d:Ljava/nio/charset/Charset;

    .line 85
    .line 86
    if-nez v3, :cond_5

    .line 87
    .line 88
    const-string v2, "UTF-32LE"

    .line 89
    .line 90
    invoke-static {v2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sput-object v3, Lwq;->d:Ljava/nio/charset/Charset;

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    sget-object v3, Lwq;->b:Ljava/nio/charset/Charset;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    sget-object v3, Lwq;->a:Ljava/nio/charset/Charset;

    .line 104
    .line 105
    :cond_5
    :goto_0
    invoke-direct {v0, v1, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Ls92;->k:Ljava/io/InputStreamReader;

    .line 109
    .line 110
    :cond_6
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/Reader;->read([CII)I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    return p0

    .line 115
    :cond_7
    const-string p0, "Stream closed"

    .line 116
    .line 117
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 p0, 0x0

    .line 121
    return p0
.end method
