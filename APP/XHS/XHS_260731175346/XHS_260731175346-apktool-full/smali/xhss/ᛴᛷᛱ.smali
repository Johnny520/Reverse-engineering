.class public final Lxhss/ᛴᛷᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛵᛷᲀᛵ;
.implements Ljava/io/Serializable;


# instance fields
.field public ᛱᛱᛲᲇ:Lxhss/ᛱᛳᲇᛶ;

.field public volatile ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public final ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lxhss/ᛱᛳᲇᛶ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛴᛷᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛳᲇᛶ;

    .line 5
    .line 6
    sget-object p1, Lxhss/ᛳᛴᲀᲁ;->ᛸᛶᲈᛶ:Lxhss/ᛳᛴᲀᲁ;

    .line 7
    .line 8
    iput-object p1, p0, Lxhss/ᛴᛷᛱ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p0, p0, Lxhss/ᛴᛷᛱ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛷᛱ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛳᛴᲀᲁ;->ᛸᛶᲈᛶ:Lxhss/ᛳᛴᲀᲁ;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    const-string p0, "Lazy value not initialized yet."

    .line 17
    .line 18
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛷᛱ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lxhss/ᛳᛴᲀᲁ;->ᛸᛶᲈᛶ:Lxhss/ᛳᛴᲀᲁ;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    iget-object v0, p0, Lxhss/ᛴᛷᛱ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v2, p0, Lxhss/ᛴᛷᛱ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 12
    .line 13
    if-eq v2, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object v1, p0, Lxhss/ᛴᛷᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛳᲇᛶ;

    .line 17
    .line 18
    invoke-interface {v1}, Lxhss/ᛱᛳᲇᛶ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iput-object v2, p0, Lxhss/ᛴᛷᛱ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    iput-object v1, p0, Lxhss/ᛴᛷᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛳᲇᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    :goto_0
    monitor-exit v0

    .line 28
    return-object v2

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    monitor-exit v0

    .line 31
    throw p0
.end method
