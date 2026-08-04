.class public final Lyyds/ᛶᲁᛲᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛵᲁᲁ;


# static fields
.field public static volatile ᛶᛷᛲᲁ:Lyyds/ᛶᲁᛲᲈ;


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲀᛲᛳᲀ:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 41
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 42
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v0, Lyyds/ᛷᛱᛷᲇ;

    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, Lyyds/ᛷᛱᛷᲇ;-><init>(Landroid/content/Context;I)V

    .line 19
    .line 20
    .line 21
    new-instance p1, Lyyds/ᛳᲇᛲᲁ;

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lyyds/ᛳᲇᛲᲁ;-><init>(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lyyds/ᲇᛷᲀᲀ;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lyyds/ᲇᛷᲀᲀ;-><init>(Lyyds/ᛶᲁᛲᲈ;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lyyds/ᲀᲇᛶᲇ;

    .line 32
    .line 33
    invoke-direct {v1, p1, v0}, Lyyds/ᲀᲇᛶᲇ;-><init>(Lyyds/ᛳᲇᛲᲁ;Lyyds/ᲇᛷᲀᲀ;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/ᛲᲈᲁ;Ljava/util/ArrayList;Lyyds/ᛷᛸ;)V
    .locals 0

    const/4 p3, 0x2

    iput p3, p0, Lyyds/ᛶᲁᛲᲈ;->ᲀᛲᛳᲀ:I

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    iput-object p2, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲀᛲᛳᲀ:I

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-boolean p3, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 47
    iput-object p2, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 48
    iput-object p1, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyyds/ᲁᛱᲀᛱ;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲀᛲᛳᲀ:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 44
    new-instance p1, Lyyds/ᛲᛴᛴᛱ;

    invoke-direct {p1}, Lyyds/ᛲᛴᛴᛱ;-><init>()V

    iput-object p1, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    return-void
.end method

.method public static ᛵᛸᛸᛷ(Ljava/lang/String;)Lyyds/ᛶᲁᛲᲈ;
    .locals 6

    .line 1
    new-instance v0, Lyyds/ᛶᲁᛲᲈ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    move v3, v1

    .line 11
    :goto_0
    if-ge v3, v2, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v3}, Ljava/lang/String;->codePointAt(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-static {v4}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    add-int/2addr v3, v4

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-wide v2, -0x62c72e68a836eL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    :goto_1
    const/4 v2, 0x0

    .line 40
    invoke-direct {v0, v2, p0, v1}, Lyyds/ᛶᲁᛲᲈ;-><init>(Ljava/lang/Object;Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public static ᲀᛲᛳᲀ(Landroid/content/Context;)Lyyds/ᛶᲁᛲᲈ;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛶᲁᛲᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lyyds/ᛶᲁᛲᲈ;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lyyds/ᛶᲁᛲᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lyyds/ᛶᲁᛲᲈ;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v1, p0}, Lyyds/ᛶᲁᛲᲈ;-><init>(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lyyds/ᛶᲁᛲᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit v0

    .line 27
    goto :goto_2

    .line 28
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_2
    sget-object p0, Lyyds/ᛶᲁᛲᲈ;->ᛶᛷᛲᲁ:Lyyds/ᛶᲁᛲᲈ;

    .line 31
    .line 32
    return-object p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Glide registry"

    .line 6
    .line 7
    invoke-static {v0}, Lyyds/ᛴᛶᲀᛲ;->ᲀᛲᛳᲀ(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :try_start_0
    iget-object v1, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lcom/bumptech/glide/ᛲᲈᲁ;

    .line 17
    .line 18
    iget-object v2, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-static {v1, v2}, Lyyds/ᲇᛲᲁᛱ;->ᲇᲈᛵᛷ(Lcom/bumptech/glide/ᛲᲈᲁ;Ljava/util/ArrayList;)Lyyds/ᛷᛶᛷ;

    .line 23
    .line 24
    .line 25
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    iput-boolean v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 27
    .line 28
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :catchall_0
    move-exception v1

    .line 33
    iput-boolean v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 34
    .line 35
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_0
    const-string p0, "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!"

    .line 40
    .line 41
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "{numRequests="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Set;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v1, ", isPaused="

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-boolean p0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string p0, "}"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public ᛲᛴᛳᛲ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᲁᛱᲀᛱ;

    .line 4
    .line 5
    invoke-interface {v0}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v1, Landroidx/lifecycle/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 10
    .line 11
    sget-object v3, Lyyds/ᛶᲈᛷᛸ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 12
    .line 13
    if-ne v2, v3, :cond_1

    .line 14
    .line 15
    new-instance v2, Landroidx/savedstate/Recreator;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Landroidx/savedstate/Recreator;-><init>(Lyyds/ᲁᛱᲀᛱ;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroidx/lifecycle/ᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lyyds/ᛲᛴᛴᛱ;

    .line 26
    .line 27
    iget-boolean v2, v0, Lyyds/ᛲᛴᛴᛱ;->ᲀᛲᛳᲀ:Z

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    new-instance v2, Lyyds/ᛴᛳᲁᛱ;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Lyyds/ᛴᛳᲁᛱ;-><init>(Lyyds/ᛲᛴᛴᛱ;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroidx/lifecycle/ᛲᲈᲁ;->ᛲᲈᲁ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    iput-boolean v1, v0, Lyyds/ᛲᛴᛴᛱ;->ᲀᛲᛳᲀ:Z

    .line 41
    .line 42
    iput-boolean v1, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    const-string p0, "SavedStateRegistry was already attached."

    .line 46
    .line 47
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    const-string p0, "Restarter must be created only during owner\'s initialization stage"

    .line 52
    .line 53
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public ᛲᲈᲁ(Lyyds/ᛸᛷᛷᛸ;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object p0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_2

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    .line 28
    .line 29
    invoke-interface {p1}, Lyyds/ᛸᛷᛷᛸ;->clear()V

    .line 30
    .line 31
    .line 32
    :cond_3
    return v0
.end method

.method public ᲇᲇᲇᛱ(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lyyds/ᲁᛱᲀᛱ;

    .line 11
    .line 12
    invoke-interface {v0}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, v0, Landroidx/lifecycle/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 17
    .line 18
    sget-object v2, Lyyds/ᛶᲈᛷᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛶᲈᛷᛸ;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lyyds/ᛶᲈᛷᛸ;->ᛲᲈᲁ(Lyyds/ᛶᲈᛷᛸ;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_4

    .line 25
    .line 26
    iget-object p0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Lyyds/ᛲᛴᛴᛱ;

    .line 29
    .line 30
    iget-boolean v0, p0, Lyyds/ᛲᛴᛴᛱ;->ᲀᛲᛳᲀ:Z

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget-boolean v0, p0, Lyyds/ᛲᛴᛴᛱ;->ᲇᲈᛵᛷ:Z

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    :goto_0
    iput-object p1, p0, Lyyds/ᛲᛴᛴᛱ;->ᛲᲈᲁ:Landroid/os/Parcelable;

    .line 49
    .line 50
    const/4 p1, 0x1

    .line 51
    iput-boolean p1, p0, Lyyds/ᛲᛴᛴᛱ;->ᲇᲈᛵᛷ:Z

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    const-string p0, "SavedStateRegistry was already restored."

    .line 55
    .line 56
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3
    const-string p0, "You must call performAttach() before calling performRestore(Bundle)."

    .line 61
    .line 62
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    const-string p0, "performRestore cannot be called when owner is "

    .line 67
    .line 68
    iget-object p1, v0, Landroidx/lifecycle/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 69
    .line 70
    invoke-static {p1, p0}, Lyyds/ᛱᛸᛶᛲ;->ᲀᛲᛲᲇ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public ᲇᲈᛵᛷ()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget-object v0, p0, Lyyds/ᛶᲁᛲᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lyyds/ᲀᲇᛶᲇ;

    .line 19
    .line 20
    iget-object v1, v0, Lyyds/ᲀᲇᛶᲇ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lyyds/ᛳᲇᛲᲁ;

    .line 23
    .line 24
    invoke-virtual {v1}, Lyyds/ᛳᲇᛲᲁ;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x0

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    move v2, v4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v2, v3

    .line 41
    :goto_0
    iput-boolean v2, v0, Lyyds/ᲀᲇᛶᲇ;->ᛲᲈᲁ:Z

    .line 42
    .line 43
    :try_start_0
    invoke-virtual {v1}, Lyyds/ᛳᲇᛲᲁ;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 48
    .line 49
    iget-object v0, v0, Lyyds/ᲀᲇᛶᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lyyds/ᛳᲈᛸᛸ;

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    .line 56
    move v3, v4

    .line 57
    goto :goto_1

    .line 58
    :catch_0
    move-exception v0

    .line 59
    const/4 v1, 0x5

    .line 60
    const-string v2, "ConnectivityMonitor"

    .line 61
    .line 62
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    const-string v1, "Failed to register callback"

    .line 69
    .line 70
    invoke-static {v2, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_1
    iput-boolean v3, p0, Lyyds/ᛶᲁᛲᲈ;->ᲇᲈᛵᛷ:Z

    .line 74
    .line 75
    :cond_3
    :goto_2
    return-void
.end method
