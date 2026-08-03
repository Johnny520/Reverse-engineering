.class public final L۟/v6;
.super L۟/y8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        L۟/v6$a;
    }
.end annotation


# instance fields
.field public final ۥ:L۟/x1;

.field public final ۥ۟:L۟/fa;


# direct methods
.method public constructor <init>(L۟/x1;L۟/fa;)V
    .locals 0

    invoke-direct {p0}, L۟/y8;-><init>()V

    iput-object p1, p0, L۟/v6;->ۥ:L۟/x1;

    iput-object p2, p0, L۟/v6;->ۥ۟:L۟/fa;

    return-void
.end method


# virtual methods
.method public final ۥ۟(L۟/w8;)Z
    .locals 1

    iget-object p1, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p1

    const-string v0, "http"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "https"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final ۥ۟۠()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final ۥ۟ۡ(L۟/w8;)L۟/y8$a;
    .locals 9

    .line 1
    sget-object v0, L۟/z7$e;->ۥ۟۟:L۟/z7$e;

    .line 2
    .line 3
    sget-object v1, L۟/z7$e;->ۥ۟۠:L۟/z7$e;

    .line 4
    .line 5
    iget-object v2, p0, L۟/v6;->ۥ:L۟/x1;

    .line 6
    .line 7
    iget-object v3, p1, L۟/w8;->ۥ۟۠:Landroid/net/Uri;

    .line 8
    .line 9
    iget p1, p1, L۟/w8;->ۥ۟۟:I

    .line 10
    .line 11
    invoke-interface {v2, v3, p1}, L۟/x1;->ۥ(Landroid/net/Uri;I)L۟/x1$a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return-object v2

    .line 19
    :cond_0
    iget-boolean v3, p1, L۟/x1$a;->ۥ۟:Z

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    move-object v3, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    move-object v3, v1

    .line 26
    :goto_0
    iget-object v4, p1, L۟/x1$a;->ۥ:Ljava/io/InputStream;

    .line 27
    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    return-object v2

    .line 31
    :cond_2
    const-wide/16 v5, 0x0

    .line 32
    .line 33
    if-ne v3, v0, :cond_4

    .line 34
    .line 35
    iget-wide v7, p1, L۟/x1$a;->ۥ۟۟:J

    .line 36
    .line 37
    cmp-long v0, v7, v5

    .line 38
    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_3
    sget-object p1, L۟/ic;->ۥ:Ljava/lang/StringBuilder;

    .line 43
    .line 44
    :try_start_0
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    .line 46
    .line 47
    :catch_0
    new-instance p1, L۟/v6$a;

    .line 48
    .line 49
    invoke-direct {p1}, L۟/v6$a;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_4
    :goto_1
    if-ne v3, v1, :cond_5

    .line 54
    .line 55
    iget-wide v0, p1, L۟/x1$a;->ۥ۟۟:J

    .line 56
    .line 57
    cmp-long p1, v0, v5

    .line 58
    .line 59
    if-lez p1, :cond_5

    .line 60
    .line 61
    iget-object p1, p0, L۟/v6;->ۥ۟:L۟/fa;

    .line 62
    .line 63
    iget-object p1, p1, L۟/fa;->ۥ۟:L۟/fa$a;

    .line 64
    .line 65
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v1, 0x4

    .line 70
    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 75
    .line 76
    .line 77
    :cond_5
    new-instance p1, L۟/y8$a;

    .line 78
    .line 79
    invoke-direct {p1, v4, v3}, L۟/y8$a;-><init>(Ljava/io/InputStream;L۟/z7$e;)V

    .line 80
    .line 81
    .line 82
    return-object p1
.end method

.method public final ۥ۟ۢ(Landroid/net/NetworkInfo;)Z
    .locals 0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
