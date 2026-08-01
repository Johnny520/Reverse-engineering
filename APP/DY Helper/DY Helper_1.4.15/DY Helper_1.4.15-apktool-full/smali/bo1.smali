.class public abstract Lbo1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final ε:Lao1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Ldd;->θ:Ldd;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lsc;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, Lsc;->φ(Ldd;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Ldd;->ε:[B

    .line 15
    .line 16
    array-length v0, v0

    .line 17
    int-to-long v2, v0

    .line 18
    new-instance v0, Lao1;

    .line 19
    .line 20
    invoke-direct {v0, v2, v3, v1}, Lao1;-><init>(JLsc;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lbo1;->ε:Lao1;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbo1;->κ()Lad;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lsd2;->β(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final δ()[B
    .locals 6

    .line 1
    invoke-virtual {p0}, Lbo1;->η()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/32 v2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-gtz v2, :cond_4

    .line 11
    .line 12
    invoke-virtual {p0}, Lbo1;->κ()Lad;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v2, 0x0

    .line 17
    :try_start_0
    invoke-interface {p0}, Lad;->ε()[B

    .line 18
    .line 19
    .line 20
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    :try_start_1
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v2

    .line 26
    :goto_0
    move-object v5, v3

    .line 27
    move-object v3, v2

    .line 28
    move-object v2, v5

    .line 29
    goto :goto_1

    .line 30
    :catchall_1
    move-exception v3

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_2
    move-exception p0

    .line 38
    invoke-static {v3, p0}, Lln0;->η(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_1
    if-nez v3, :cond_3

    .line 42
    .line 43
    array-length p0, v2

    .line 44
    const-wide/16 v3, -0x1

    .line 45
    .line 46
    cmp-long v3, v0, v3

    .line 47
    .line 48
    if-eqz v3, :cond_2

    .line 49
    .line 50
    int-to-long v3, p0

    .line 51
    cmp-long v3, v0, v3

    .line 52
    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    new-instance v2, Ljava/io/IOException;

    .line 57
    .line 58
    new-instance v3, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v4, "Content-Length ("

    .line 61
    .line 62
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ") and stream length ("

    .line 69
    .line 70
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p0, ") disagree"

    .line 77
    .line 78
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-direct {v2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v2

    .line 89
    :cond_2
    :goto_2
    return-object v2

    .line 90
    :cond_3
    throw v3

    .line 91
    :cond_4
    const-string p0, "Cannot buffer entire body for content length: "

    .line 92
    .line 93
    invoke-static {v0, v1, p0}, Lnx;->ε(JLjava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lγ;->τ(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const/4 p0, 0x0

    .line 101
    return-object p0
.end method

.method public abstract η()J
.end method

.method public abstract θ()Lez0;
.end method

.method public abstract κ()Lad;
.end method
