.class public final Lyyds/ᛷᲀᛳᛱ;
.super Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᛶᛳ:Lyyds/ᛸᲈᛳᛱ;

.field public ᛲᛱᲁᛳ:I

.field public final ᛲᛳᛴᛸ:F

.field public final ᛵᲀᛵᛸ:Z

.field public ᛷᛶᛷᲀ:I

.field public ᛷᛸᲇᛶ:Lyyds/ᲁᛳᲀᛸ;

.field public ᛷᲇᛲᛱ:Ljava/lang/ref/WeakReference;

.field public ᛸᛸᛷᛱ:Ljava/lang/CharSequence;

.field public final ᲀᛲᛱᛱ:J

.field public ᲀᛴᲁᲈ:F

.field public ᲈᛷᲈᛶ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᛵᲀᛵᛸ:Z

    .line 6
    .line 7
    sget v0, Lyyds/ᛷᲁᲇᲇ;->ᛱᲈᲁ:I

    .line 8
    .line 9
    int-to-float v0, v0

    .line 10
    iput v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᛲᛳᛴᛸ:F

    .line 11
    .line 12
    const-wide/16 v0, 0x5dc

    .line 13
    .line 14
    iput-wide v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᲀᛲᛱᛱ:J

    .line 15
    .line 16
    const/high16 v0, -0x40800000    # -1.0f

    .line 17
    .line 18
    iput v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᲀᛴᲁᲈ:F

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    iput v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᛷᛶᛷᲀ:I

    .line 22
    .line 23
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛲᲈᛱ:Z

    .line 36
    .line 37
    return-void
.end method

.method public static ᛲᲀᛵᛷ()V
    .locals 1

    .line 1
    invoke-static {}, Lyyds/ᛷᲀᛳᛱ;->ᛶᛴᛱᛲ()Lyyds/ᛷᲀᛳᛱ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lyyds/ᛷᲀᛳᛱ;->ᛷᛴᛴᲁ()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static ᛳᛷᛶᛲ(Ljava/lang/CharSequence;)Lyyds/ᛷᲀᛳᛱ;
    .locals 2

    .line 1
    invoke-static {}, Lyyds/ᛷᲀᛳᛱ;->ᛶᛴᛱᛲ()Lyyds/ᛷᲀᛳᛱ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, p0, v1}, Lyyds/ᛷᲀᛳᛱ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ()V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lyyds/ᲀᛵᛵᛷ;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {p0, v0, v1}, Lyyds/ᲀᛵᛵᛷ;-><init>(Lyyds/ᛷᲀᛳᛱ;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object v0

    .line 30
    :cond_1
    new-instance p0, Lyyds/ᛷᲀᛳᛱ;

    .line 31
    .line 32
    invoke-direct {p0}, Lyyds/ᛷᲀᛳᛱ;-><init>()V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method

.method public static ᛴᛸᛴᛸ(Ljava/lang/String;F)Lyyds/ᛷᲀᛳᛱ;
    .locals 2

    .line 1
    invoke-static {}, Lyyds/ᛷᲀᛳᛱ;->ᛶᛴᛱᛲ()Lyyds/ᛷᲀᛳᛱ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x5

    .line 8
    invoke-virtual {v0, p0, v1}, Lyyds/ᛷᲀᛳᛱ;->ᲁᛵᲁᲁ(Ljava/lang/CharSequence;I)V

    .line 9
    .line 10
    .line 11
    iput p1, v0, Lyyds/ᛷᲀᛳᛱ;->ᲀᛴᲁᲈ:F

    .line 12
    .line 13
    invoke-virtual {v0}, Lyyds/ᛷᲀᛳᛱ;->ᛱᲀᲈᛲ()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-nez p0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ()V

    .line 23
    .line 24
    .line 25
    new-instance p0, Lyyds/ᲀᛵᛵᛷ;

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-direct {p0, v0, p1}, Lyyds/ᲀᛵᛵᛷ;-><init>(Lyyds/ᛷᲀᛳᛱ;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-object v0

    .line 35
    :cond_1
    new-instance p0, Lyyds/ᛷᲀᛳᛱ;

    .line 36
    .line 37
    invoke-direct {p0}, Lyyds/ᛷᲀᛳᛱ;-><init>()V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method

.method public static ᛶᛴᛱᛲ()Lyyds/ᛷᲀᛳᛱ;
    .locals 4

    .line 1
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_4

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_4

    .line 18
    .line 19
    instance-of v1, v0, Lyyds/ᲁᲇᛴᲀ;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lyyds/ᲁᲇᛴᲀ;

    .line 25
    .line 26
    invoke-interface {v1}, Lyyds/ᲁᲇᛴᲀ;->ᛲᛴᛳᛲ()Landroidx/lifecycle/ᛲᲈᲁ;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v1, v1, Landroidx/lifecycle/ᛲᲈᲁ;->ᛵᛸᛸᛷ:Lyyds/ᛶᲈᛷᛸ;

    .line 31
    .line 32
    sget-object v2, Lyyds/ᛶᲈᛷᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲈᛷᛸ;

    .line 33
    .line 34
    if-ne v1, v2, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    sget-object v1, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    new-instance v1, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 48
    .line 49
    sget-object v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛵᲀᲈᛴ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 50
    .line 51
    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 69
    .line 70
    instance-of v3, v2, Lyyds/ᛷᲀᛳᛱ;

    .line 71
    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    iget-boolean v3, v2, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-ne v3, v0, :cond_2

    .line 83
    .line 84
    check-cast v2, Lyyds/ᛷᲀᛳᛱ;

    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_3
    new-instance v0, Lyyds/ᛷᲀᛳᛱ;

    .line 88
    .line 89
    invoke-direct {v0}, Lyyds/ᛷᲀᛳᛱ;-><init>()V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 94
    return-object v0
.end method


# virtual methods
.method public final ᛱᲀᲈᛲ()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Lyyds/ᲀᛵᛵᛷ;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, v1}, Lyyds/ᲀᛵᛵᛷ;-><init>(Lyyds/ᛷᲀᛳᛱ;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final ᛲᛳᛴᛸ()Z
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-super {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛷᲀᛳᛱ;->ᲈᛷᲈᛶ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lyyds/ᲇᛵᲈᲈ;

    .line 12
    .line 13
    return-object p0
.end method

.method public final ᛶᛷᛲᲁ()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Lyyds/ᛷᲀᛳᛱ;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "("

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p0, ")"

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final ᛶᲀᲈᲇ()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 3
    .line 4
    new-instance v0, Lyyds/ᛶᛵᲁᛵ;

    .line 5
    .line 6
    invoke-direct {v0}, Lyyds/ᛶᛵᲁᛵ;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lyyds/ᛶᛵᲁᛵ;->ᲀᛲᛳᲀ()V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lyyds/ᛶᲈᛷᛸ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲈᛷᛸ;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲈᛷᲈᛶ(Lyyds/ᛶᲈᛷᛸ;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᲈᛷᲈᛶ:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    .line 22
    .line 23
    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᲈᛷᲈᛶ:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    iget-object v1, p0, Lyyds/ᛷᲀᛳᛱ;->ᛷᲇᛲᛱ:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 32
    .line 33
    .line 34
    :cond_1
    iput-object v0, p0, Lyyds/ᛷᲀᛳᛱ;->ᛷᲇᛲᛱ:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 41
    .line 42
    .line 43
    :cond_2
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 44
    .line 45
    return-void
.end method

.method public final ᛷᛴᛴᲁ()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 3
    .line 4
    new-instance v0, Lyyds/ᲀᛵᛵᛷ;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, Lyyds/ᲀᛵᛵᛷ;-><init>(Lyyds/ᛷᲀᛳᛱ;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ᲀᛴᲁᲈ()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛱᲀᲈᛲ()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ᲁᛵᲁᲁ(Ljava/lang/CharSequence;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Lyyds/ᛷᲀᛳᛱ;->ᛸᛸᛷᛱ:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᛷᲀᛳᛱ;->ᛲᛱᲁᛳ:I

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p2}, Lyyds/ᲀᲁᲈᲇ;->ᛶᛸᲀᲁ(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lyyds/ᛷᲀᛳᛱ;->ᛷᛶᛷᲀ:I

    .line 13
    .line 14
    iput p2, p0, Lyyds/ᛷᲀᛳᛱ;->ᛲᛱᲁᛳ:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛲᲀᛲᛲ()Lyyds/ᲇᛵᲈᲈ;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v0, Lyyds/ᛶᲁᛲᛳ;

    .line 30
    .line 31
    invoke-direct {v0, p1, p2}, Lyyds/ᛶᲁᛲᛳ;-><init>(Lyyds/ᲇᛵᲈᲈ;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lyyds/ᛷᲀᛳᛱ;->ᛱᲀᲈᛲ()V

    .line 38
    .line 39
    .line 40
    return-void
.end method
