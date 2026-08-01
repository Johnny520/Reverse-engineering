.class public final Lxhss/ᲁᛷᛲᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲈᲀᛳᲇ;


# instance fields
.field public ᛱᛱᛲᲇ:Lxhss/ᲈᲀᛳᲇ;

.field public final ᛷᛵᛵᲈ:Lxhss/ᛲᛸᲇᛷ;


# direct methods
.method public constructor <init>(Lxhss/ᛲᛸᲇᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲁᛷᛲᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛸᲇᛷ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᲁᛷᛲᲁ;->ᛷᛴᛷᛱ(Ljavax/net/ssl/SSLSocket;)Lxhss/ᲈᲀᛳᲇ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lxhss/ᲈᲀᛳᲇ;->ᛱᛱᛲᲇ(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final ᛳᲁᲇᛸ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final declared-synchronized ᛷᛴᛷᛱ(Ljavax/net/ssl/SSLSocket;)Lxhss/ᲈᲀᛳᲇ;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lxhss/ᲁᛷᛲᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲈᲀᛳᲇ;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lxhss/ᲁᛷᛲᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛸᲇᛷ;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lxhss/ᛲᛸᲇᛷ;->ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lxhss/ᲁᛷᛲᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛸᲇᛷ;

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lxhss/ᛲᛸᲇᛷ;->ᛱᛱᛲᲇ(Ljavax/net/ssl/SSLSocket;)Lxhss/ᲈᲀᛳᲇ;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lxhss/ᲁᛷᛲᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲈᲀᛳᲇ;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    iget-object p1, p0, Lxhss/ᲁᛷᛲᲁ;->ᛱᛱᛲᲇ:Lxhss/ᲈᲀᛳᲇ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-object p1

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw p1
.end method

.method public final ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲁᛷᛲᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛸᲇᛷ;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lxhss/ᛲᛸᲇᛷ;->ᛷᛵᛵᲈ(Ljavax/net/ssl/SSLSocket;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᲇᛴᲇᛵ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lxhss/ᲁᛷᛲᲁ;->ᛷᛴᛷᛱ(Ljavax/net/ssl/SSLSocket;)Lxhss/ᲈᲀᛳᲇ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0, p1, p2, p3}, Lxhss/ᲈᲀᛳᲇ;->ᲇᛴᲇᛵ(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
