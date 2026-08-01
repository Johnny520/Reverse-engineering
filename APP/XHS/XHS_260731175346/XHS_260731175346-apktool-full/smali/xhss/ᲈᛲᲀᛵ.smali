.class public final Lxhss/ᲈᛲᲀᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲀᛷ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛷᲀᲁᲇ;

.field public final ᛷᛵᛵᲈ:J

.field public final ᲇᛴᲇᛵ:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method public constructor <init>(Lxhss/ᛸᛱᛴᛳ;)V
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
    iput-wide v0, p0, Lxhss/ᲈᛲᲀᛵ;->ᛷᛵᛵᲈ:J

    .line 10
    .line 11
    invoke-virtual {p1}, Lxhss/ᛸᛱᛴᛳ;->ᲇᛴᲇᛵ()Lxhss/ᲇᲀᲀᛷ;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lxhss/ᲈᛲᲀᛵ;->ᛱᛱᛲᲇ:Lxhss/ᲇᲀᲀᛷ;

    .line 16
    .line 17
    new-instance p1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lxhss/ᛶᛴᲀᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, " ConnectionPool connection closer"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Lxhss/ᛷᲀᲁᲇ;

    .line 37
    .line 38
    invoke-direct {v0, p0, p1}, Lxhss/ᛷᲀᲁᲇ;-><init>(Lxhss/ᲈᛲᲀᛵ;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lxhss/ᲈᛲᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛷᲀᲁᲇ;

    .line 42
    .line 43
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 44
    .line 45
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lxhss/ᲈᛲᲀᛵ;->ᲇᛴᲇᛵ:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᲈᲁᛲᲇ;J)I
    .locals 5

    .line 1
    sget-object v0, Lxhss/ᛶᛴᲀᛲ;->ᛷᛵᛵᲈ:Ljava/util/TimeZone;

    .line 2
    .line 3
    iget-object v0, p1, Lxhss/ᲈᲁᛲᲇ;->ᛶᲇᲈᛸ:Ljava/util/ArrayList;

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
    check-cast v3, Lxhss/ᛱᛵᲁᲇ;

    .line 29
    .line 30
    iget-object v4, p1, Lxhss/ᲈᲁᛲᲇ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᲁᛶ;

    .line 31
    .line 32
    iget-object v4, v4, Lxhss/ᛱᛷᲁᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᲈᛱᛳ;

    .line 33
    .line 34
    sget-object v4, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 35
    .line 36
    sget-object v4, Lxhss/ᲀᛱᛷᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛳᛸᲇ;

    .line 37
    .line 38
    iget-object v3, v3, Lxhss/ᛱᛵᲁᲇ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

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
    iget-wide v2, p0, Lxhss/ᲈᛲᲀᛵ;->ᛷᛵᛵᲈ:J

    .line 58
    .line 59
    sub-long/2addr p2, v2

    .line 60
    iput-wide p2, p1, Lxhss/ᲈᲁᛲᲇ;->ᛸᛶᛴᲈ:J

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
