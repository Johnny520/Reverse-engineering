.class public abstract Lcom/ss/android/ugc/awemes/WardDatabase;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛱᛳᲇ:Lyyds/ᛵᛱᲁᲁ;

.field public static volatile ᛲᛲᲈᲈ:Lcom/ss/android/ugc/awemes/WardDatabase;

.field public static final ᛳᲁᲁᲇ:Lyyds/ᛵᛱᲁᲁ;

.field public static final ᛷᛵᲇᲀ:Lyyds/ᛲᲁᲈ;

.field public static final ᲇᛱᛲ:Lyyds/ᛵᛱᲁᲁ;


# instance fields
.field public ᛱᲈᲁ:Z

.field public final ᛲᛳᛶᲁ:Ljava/lang/ThreadLocal;

.field public ᛲᛴᛳᛲ:Lyyds/ᛷᛲᛴᛸ;

.field public ᛲᲈᲁ:Lyyds/ᲇᛵᲁᛳ;

.field public ᛵᛸᛸᛷ:Lyyds/ᲁᛴᛲ;

.field public final ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

.field public ᛷᛲᲈᛱ:Z

.field public final ᛷᲈᲈᲁ:Ljava/util/LinkedHashMap;

.field public ᲀᛲᛳᲀ:Ljava/util/concurrent/Executor;

.field public ᲇᲇᲇᛱ:Lyyds/ᛳᛱᲀᛶ;

.field public ᲇᲈᛵᛷ:Lyyds/ᲁᛶᛱᲈ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-wide v0, -0x4c3aae68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Lyyds/ᛲᲁᲈ;

    .line 10
    .line 11
    const/16 v1, 0x1c

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lyyds/ᛲᲁᲈ;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛷᛵᲇᲀ:Lyyds/ᛲᲁᲈ;

    .line 17
    .line 18
    new-instance v0, Lyyds/ᛵᛱᲁᲁ;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-direct {v0, v2, v3, v1}, Lyyds/ᛵᛱᲁᲁ;-><init>(III)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛱᛳᲇ:Lyyds/ᛵᛱᲁᲁ;

    .line 27
    .line 28
    new-instance v0, Lyyds/ᛵᛱᲁᲁ;

    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    const/4 v2, 0x3

    .line 32
    invoke-direct {v0, v3, v2, v1}, Lyyds/ᛵᛱᲁᲁ;-><init>(III)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛳᲁᲁᲇ:Lyyds/ᛵᛱᲁᲁ;

    .line 36
    .line 37
    new-instance v0, Lyyds/ᛵᛱᲁᲁ;

    .line 38
    .line 39
    const/4 v1, 0x4

    .line 40
    invoke-direct {v0, v2, v1, v3}, Lyyds/ᛵᛱᲁᲁ;-><init>(III)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᲇᛱᛲ:Lyyds/ᛵᛱᲁᲁ;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᲀᲈᛶᲈ;

    .line 5
    .line 6
    const/16 v1, 0xf

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lyyds/ᲀᲈᛶᲈ;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛶᛷᛲᲁ:Lyyds/ᲀᲈᛶᲈ;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛳᛶᲁ:Ljava/lang/ThreadLocal;

    .line 19
    .line 20
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛷᲈᲈᲁ:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛷᛲᲈᛱ:Z

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public abstract ᛱᛳᲇ()Lyyds/ᛲᛶᲀᛱ;
.end method

.method public final ᛱᲈᲁ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛴᛳᛲ:Lyyds/ᛷᛲᛴᛸ;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    iget-object p0, p0, Lyyds/ᛷᛲᛴᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᲀᛴᲁᛷ;

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_1
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final ᛲᛲᲈᲈ(ZLyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛴᛳᛲ:Lyyds/ᛷᛲᛴᛸ;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    iget-object p0, p0, Lyyds/ᛷᛲᛴᛸ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᛳᛵᛳ;

    .line 9
    .line 10
    invoke-interface {p0, p1, p2, p3}, Lyyds/ᛳᛵᛳ;->ᛲᛶᛱᲈ(ZLyyds/ᛲᲇᲁᛴ;Lyyds/ᛶᛴᲀᛲ;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public final ᛲᛳᛶᲁ()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛷᛲᲈᛱ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛴᛳᛲ()Lyyds/ᲀᛴᲁᛷ;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Lyyds/ᲀᛴᲁᛷ;->ᛲᛳᛴᛸ()Lyyds/ᛳᛴᲀᛷ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->ᛶᛳᛶᛵ()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final ᛲᛴᛳᛲ()Lyyds/ᲀᛴᲁᛷ;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛴᛳᛲ:Lyyds/ᛷᛲᛴᛸ;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    move-object p0, v0

    .line 7
    :cond_0
    iget-object p0, p0, Lyyds/ᛷᛲᛴᛸ;->ᛶᛷᛲᲁ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Lyyds/ᲀᛴᲁᛷ;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    const-string p0, "Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room."

    .line 15
    .line 16
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public final ᛲᲈᲁ()V
    .locals 1

    .line 1
    iget-boolean p0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛱᲈᲁ:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-ne p0, v0, :cond_1

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    :goto_0
    if-nez p0, :cond_2

    .line 24
    .line 25
    :goto_1
    return-void

    .line 26
    :cond_2
    const-string p0, "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."

    .line 27
    .line 28
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public ᛵᛸᛸᛷ(Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 2

    .line 1
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lyyds/ᲁᲈᛶᛴ;->ᛳᛸᛴᛶ(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/util/Map$Entry;

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lyyds/ᲁᛵᛴᲀ;

    .line 39
    .line 40
    check-cast v1, Lyyds/ᲈᲇᛶᛷ;

    .line 41
    .line 42
    invoke-interface {v1}, Lyyds/ᲈᲇᛶᛷ;->ᛲᲈᲁ()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    sget-object p0, Lyyds/ᛸᲀᛶᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛸᲀᛶᲈ;

    .line 55
    .line 56
    return-object p0
.end method

.method public ᛶᛷᛲᲁ()Ljava/util/LinkedHashMap;
    .locals 1

    .line 1
    sget-object p0, Lyyds/ᛶᲁᛲᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲁᛲᛶ;

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    invoke-static {p0, v0}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0}, Lyyds/ᲁᲈᛶᛴ;->ᛳᛸᛴᛶ(I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/16 v0, 0x10

    .line 14
    .line 15
    if-ge p0, v0, :cond_0

    .line 16
    .line 17
    move p0, v0

    .line 18
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final ᛷᛲᲈᛱ()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛴᛳᛲ:Lyyds/ᛷᛲᛴᛸ;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    iget-object p0, p0, Lyyds/ᛷᛲᛴᛸ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lyyds/ᛳᛴᲀᛷ;

    .line 9
    .line 10
    if-eqz p0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lyyds/ᛳᛴᲀᛷ;->isOpen()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final ᛷᛵᲇᲀ(Ljava/lang/Runnable;)V
    .locals 5

    .line 1
    new-instance v0, Lyyds/ᛵᲇᛵᲇ;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lyyds/ᛵᲇᛵᲇ;-><init>(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛱᲈᲁ()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᲈᲁ()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᲈᲁ()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛴᛳᛲ()Lyyds/ᲀᛴᲁᛷ;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Lyyds/ᲀᛴᲁᛷ;->ᛲᛳᛴᛸ()Lyyds/ᛳᛴᲀᛷ;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lyyds/ᛳᛴᲀᛷ;->ᛶᛳᛶᛵ()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᲇᲇᲇᛱ:Lyyds/ᛳᛱᲀᛶ;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    move-object v1, v2

    .line 40
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v3, Lyyds/ᲈᲇᲇᛴ;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    invoke-direct {v3, v1, v2, v4}, Lyyds/ᲈᲇᲇᛴ;-><init>(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;I)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 50
    .line 51
    .line 52
    new-instance v1, Lyyds/ᲇᲈᲈᛶ;

    .line 53
    .line 54
    invoke-direct {v1, v3, v2}, Lyyds/ᲇᲈᲈᛶ;-><init>(Lyyds/ᛲᲇᲁᛴ;Lyyds/ᛲᛱᛶᛸ;)V

    .line 55
    .line 56
    .line 57
    sget-object v2, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 58
    .line 59
    invoke-static {v2, v1}, Lyyds/ᲁᛴᛵᛱ;->ᛱᲈᲁ(Lyyds/ᲁᛴᛲ;Lyyds/ᛲᲇᲁᛴ;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object v1, p1, Lyyds/ᛳᛴᲀᛷ;->ᲀᛲᛳᲀ:Landroid/database/sqlite/SQLiteDatabase;

    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteDatabase;->isWriteAheadLoggingEnabled()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    invoke-virtual {p1}, Lyyds/ᛳᛴᲀᛷ;->ᲇᲇᲇᛱ()V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-virtual {p1}, Lyyds/ᛳᛴᲀᛷ;->ᛲᲈᲁ()V

    .line 75
    .line 76
    .line 77
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Lyyds/ᛵᲇᛵᲇ;->ᛲᲈᲁ()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛴᛳᛲ()Lyyds/ᲀᛴᲁᛷ;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-interface {p1}, Lyyds/ᲀᛴᲁᛷ;->ᛲᛳᛴᛸ()Lyyds/ᛳᛴᲀᛷ;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Lyyds/ᛳᛴᲀᛷ;->ᛳᲁᲁᲇ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛷᲈᲈᲁ()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :catchall_0
    move-exception p1

    .line 96
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛷᲈᲈᲁ()V

    .line 97
    .line 98
    .line 99
    throw p1

    .line 100
    :cond_3
    new-instance p1, Lyyds/ᲈᛷᲈᛶ;

    .line 101
    .line 102
    const/16 v1, 0xe

    .line 103
    .line 104
    invoke-direct {p1, v1, v0}, Lyyds/ᲈᛷᲈᛶ;-><init>(ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p0, p1}, Lyyds/ᲀᛳᛳᛱ;->ᛲᛲᲈᲈ(Lcom/ss/android/ugc/awemes/WardDatabase;Lyyds/ᛷᛴᲈᲀ;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    return-void
.end method

.method public final ᛷᲈᲈᲁ()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛴᛳᛲ()Lyyds/ᲀᛴᲁᛷ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lyyds/ᲀᛴᲁᛷ;->ᛲᛳᛴᛸ()Lyyds/ᛳᛴᲀᛷ;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lyyds/ᛳᛴᲀᛷ;->ᛶᛷᛲᲁ()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/ss/android/ugc/awemes/WardDatabase;->ᛲᛳᛶᲁ()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object p0, p0, Lcom/ss/android/ugc/awemes/WardDatabase;->ᲇᲇᲇᛱ:Lyyds/ᛳᛱᲀᛶ;

    .line 19
    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    :cond_0
    iget-object v0, p0, Lyyds/ᛳᛱᲀᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛳᲀᛸᛸ;

    .line 24
    .line 25
    iget-object v1, p0, Lyyds/ᛳᛱᲀᛶ;->ᲇᲇᲇᛱ:Lyyds/ᲁᲀᛳ;

    .line 26
    .line 27
    iget-object p0, p0, Lyyds/ᛳᛱᲀᛶ;->ᛶᛷᛲᲁ:Lyyds/ᲁᲀᛳ;

    .line 28
    .line 29
    invoke-virtual {v0, v1, p0}, Lyyds/ᛳᲀᛸᛸ;->ᲀᛲᛳᲀ(Lyyds/ᲁᛶᲁᲀ;Lyyds/ᲁᛶᲁᲀ;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method public abstract ᲀᛲᛳᲀ()Lyyds/ᛳᛱᲀᛶ;
.end method

.method public ᲇᲇᲇᛱ()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance p0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v0, 0xa

    .line 4
    .line 5
    sget-object v1, Lyyds/ᛶᲁᛲᛶ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲁᛲᛶ;

    .line 6
    .line 7
    invoke-static {v1, v0}, Lyyds/ᛱᛱᛵᛲ;->ᛳᛸᛴᛶ(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lyyds/ᛷᛷᛶᲇ;->ᛳᛴᲇᛶ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public ᲇᲈᛵᛷ()Lyyds/ᛲᛵᲀᛳ;
    .locals 0

    .line 1
    new-instance p0, Lyyds/ᛴᛵᲈᛷ;

    .line 2
    .line 3
    invoke-direct {p0}, Lyyds/ᛴᛵᲈᛷ;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method
