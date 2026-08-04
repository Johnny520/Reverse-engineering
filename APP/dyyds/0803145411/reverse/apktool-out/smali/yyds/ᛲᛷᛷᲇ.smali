.class public final Lyyds/ᛲᛷᛷᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᲈᲁ:Lyyds/ᛱᛸᛱᛳ;


# instance fields
.field public ᛲᛴᛳᛲ:Ljava/util/List;

.field public final ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

.field public final ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛶᲈ;

.field public ᛶᛷᛲᲁ:I

.field public final ᲀᛲᛳᲀ:Lyyds/ᛱᛸᛱᛳ;

.field public ᲇᲇᲇᛱ:Ljava/util/List;

.field public final ᲇᲈᛵᛷ:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyyds/ᛱᛸᛱᛳ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛱᛸᛱᛳ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᛲᛷᛷᲇ;->ᛱᲈᲁ:Lyyds/ᛱᛸᛱᛳ;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lyyds/ᛱᛱᛴ;Lyyds/ᲀᲈᛶᲈ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛲᛷᛷᲇ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 10
    .line 11
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    iput-object v0, p0, Lyyds/ᛲᛷᛷᲇ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 14
    .line 15
    iput-object p1, p0, Lyyds/ᛲᛷᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 16
    .line 17
    iput-object p2, p0, Lyyds/ᛲᛷᛷᲇ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 18
    .line 19
    sget-object p1, Lyyds/ᛲᛷᛷᲇ;->ᛱᲈᲁ:Lyyds/ᛱᛸᛱᛳ;

    .line 20
    .line 21
    iput-object p1, p0, Lyyds/ᛲᛷᛷᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛸᛱᛳ;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᛲᛷᛷᲇ;->ᲇᲈᛵᛷ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lyyds/ᲈᲈᲀᛴ;

    .line 18
    .line 19
    iget-object v0, v0, Lyyds/ᲈᲈᲀᛴ;->ᛲᲈᲁ:Lyyds/ᛲᛷᛱᲀ;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final ᛵᛸᛸᛷ(Ljava/util/List;Lyyds/ᛸᲁᛳᲁ;)V
    .locals 7

    .line 1
    iget v0, p0, Lyyds/ᛲᛷᛷᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    add-int/lit8 v5, v0, 0x1

    .line 4
    .line 5
    iput v5, p0, Lyyds/ᛲᛷᛷᲇ;->ᛶᛷᛲᲁ:I

    .line 6
    .line 7
    iget-object v3, p0, Lyyds/ᛲᛷᛷᲇ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 8
    .line 9
    if-ne p1, v3, :cond_1

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Lyyds/ᛸᲁᛳᲁ;->run()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    const/4 v0, 0x0

    .line 18
    iget-object v1, p0, Lyyds/ᛲᛷᛷᲇ;->ᛲᲈᲁ:Lyyds/ᛱᛱᛴ;

    .line 19
    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v2, 0x0

    .line 27
    iput-object v2, p0, Lyyds/ᛲᛷᛷᲇ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 28
    .line 29
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 30
    .line 31
    iput-object v2, p0, Lyyds/ᛲᛷᛷᲇ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 32
    .line 33
    invoke-virtual {v1, v0, p1}, Lyyds/ᛱᛱᛴ;->ᛲᛳᛴᛸ(II)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Lyyds/ᛲᛷᛷᲇ;->ᛲᲈᲁ(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    if-nez v3, :cond_3

    .line 41
    .line 42
    iput-object p1, p0, Lyyds/ᛲᛷᛷᲇ;->ᛲᛴᛳᛲ:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iput-object v2, p0, Lyyds/ᛲᛷᛷᲇ;->ᲇᲇᲇᛱ:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {v1, v0, p1}, Lyyds/ᛱᛱᛴ;->ᛵᲀᛵᛸ(II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p2}, Lyyds/ᛲᛷᛷᲇ;->ᛲᲈᲁ(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    iget-object v0, p0, Lyyds/ᛲᛷᛷᲇ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲈᛶᲈ;

    .line 62
    .line 63
    iget-object v0, v0, Lyyds/ᲀᲈᛶᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 66
    .line 67
    new-instance v1, Lyyds/ᛴᛸᛴᛶ;

    .line 68
    .line 69
    move-object v2, p0

    .line 70
    move-object v4, p1

    .line 71
    move-object v6, p2

    .line 72
    invoke-direct/range {v1 .. v6}, Lyyds/ᛴᛸᛴᛶ;-><init>(Lyyds/ᛲᛷᛷᲇ;Ljava/util/List;Ljava/util/List;ILjava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
