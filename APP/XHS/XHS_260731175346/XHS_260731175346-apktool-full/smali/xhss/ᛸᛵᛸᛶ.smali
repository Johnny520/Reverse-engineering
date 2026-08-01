.class public final Lxhss/ᛸᛵᛸᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛴᛱᛱ;

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;


# direct methods
.method public constructor <init>(Lxhss/ᲁᛲᛵ;Lxhss/ᛴᛱᛱ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛸᛵᛸᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛱᛱ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lxhss/ᛸᛵᛸᛶ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛲᛵ;

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛸᛵᛸᛶ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛱᛱ;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    :try_start_0
    invoke-virtual {v1, v2, p0}, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ(ZLxhss/ᛸᛵᛸᛶ;)Z

    .line 8
    .line 9
    .line 10
    move-result v4

    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    :cond_0
    const/4 v4, 0x0

    .line 14
    invoke-virtual {v1, v4, p0}, Lxhss/ᛴᛱᛱ;->ᛱᛱᛲᲇ(ZLxhss/ᛸᛵᛸᛶ;)Z

    .line 15
    .line 16
    .line 17
    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    const/16 p0, 0x9

    .line 21
    .line 22
    invoke-virtual {v0, v2, p0, v3}, Lxhss/ᲁᛲᛵ;->ᛱᛱᛲᲇ(IILjava/io/IOException;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {v1}, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ(Ljava/io/Closeable;)V

    .line 26
    .line 27
    .line 28
    goto :goto_3

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :catch_0
    move-exception p0

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    :try_start_1
    new-instance p0, Ljava/io/IOException;

    .line 34
    .line 35
    const-string v2, "Required SETTINGS preface not received"

    .line 36
    .line 37
    invoke-direct {p0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    :goto_1
    const/4 v2, 0x3

    .line 42
    invoke-virtual {v0, v2, v2, v3}, Lxhss/ᲁᛲᛵ;->ᛱᛱᛲᲇ(IILjava/io/IOException;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Lxhss/ᛶᛸᛲ;->ᛷᛵᛵᲈ(Ljava/io/Closeable;)V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :goto_2
    const/4 v2, 0x2

    .line 50
    invoke-virtual {v0, v2, v2, p0}, Lxhss/ᲁᛲᛵ;->ᛱᛱᛲᲇ(IILjava/io/IOException;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :goto_3
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;

    .line 55
    .line 56
    return-object p0
.end method
