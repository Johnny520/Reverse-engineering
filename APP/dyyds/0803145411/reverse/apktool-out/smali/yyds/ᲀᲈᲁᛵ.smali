.class public final Lyyds/ᲀᲈᲁᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:J

.field public final ᛵᛸᛸᛷ:Lyyds/ᛱᛷᛱᛳ;

.field public final ᲀᛲᛳᲀ:Lyyds/ᛴᲀᲀᛷ;

.field public final ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method public constructor <init>(Lyyds/ᛱᛴᛳᛱ;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, 0x45d964b800L

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lyyds/ᲀᲈᲁᛵ;->ᛲᲈᲁ:J

    .line 10
    .line 11
    invoke-virtual {p1}, Lyyds/ᛱᛴᛳᛱ;->ᲇᲈᛵᛷ()Lyyds/ᛱᛷᛱᛳ;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lyyds/ᲀᲈᲁᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛱᛷᛱᛳ;

    .line 16
    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛵᛸᛸᛷ:Ljava/lang/String;

    .line 23
    .line 24
    const-string v1, " ConnectionPool connection closer"

    .line 25
    .line 26
    invoke-static {p1, v0, v1}, Lyyds/ᲀᲁᲈᲇ;->ᛷᛵᲇᲀ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Lyyds/ᛴᲀᲀᛷ;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1}, Lyyds/ᛴᲀᲀᛷ;-><init>(Lyyds/ᲀᲈᲁᛵ;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lyyds/ᲀᲈᲁᛵ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲀᲀᛷ;

    .line 36
    .line 37
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lyyds/ᲀᲈᲁᛵ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Lyyds/ᲈᛸᲀᛸ;J)I
    .locals 5

    .line 1
    sget-object v0, Lyyds/ᛴᛲᛲᲇ;->ᛲᲈᲁ:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p1, Lyyds/ᲈᛸᲀᛸ;->ᲇᛱᛲ:Ljava/util/ArrayList;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-ge v2, v3, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/ref/Reference;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    check-cast v3, Lyyds/ᛶᛷᛶᲈ;

    .line 29
    .line 30
    iget-object v4, p1, Lyyds/ᲈᛸᲀᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᛶᲈᛷ;

    .line 31
    .line 32
    iget-object v4, v4, Lyyds/ᛶᛶᲈᛷ;->ᛲᲈᲁ:Lyyds/ᛷᛸᲇᛴ;

    .line 33
    .line 34
    sget-object v4, Lyyds/ᛶᛴᲈᲀ;->ᛲᲈᲁ:Lyyds/ᲀᛳᛶᛸ;

    .line 35
    .line 36
    sget-object v4, Lyyds/ᛶᛴᲈᲀ;->ᛲᲈᲁ:Lyyds/ᲀᛳᛶᛸ;

    .line 37
    .line 38
    iget-object v3, v3, Lyyds/ᛶᛷᛶᲈ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    check-cast v3, Landroid/util/CloseGuard;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/util/CloseGuard;->warnIfOpen()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    iget-wide v2, p0, Lyyds/ᲀᲈᲁᛵ;->ᛲᲈᲁ:J

    .line 58
    .line 59
    sub-long/2addr p2, v2

    .line 60
    iput-wide p2, p1, Lyyds/ᲈᛸᲀᛸ;->ᛶᛳᛶᛵ:J

    .line 61
    .line 62
    return v1

    .line 63
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0
.end method
