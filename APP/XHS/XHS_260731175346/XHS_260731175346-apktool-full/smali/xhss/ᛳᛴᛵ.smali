.class public final Lxhss/ᛳᛴᛵ;
.super Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛳᲁᲈ:Lxhss/ᛶᲈᛴᛲ;

.field public ᛲᛴᲀᲈ:Ljava/lang/String;

.field public final ᛲᛴᲇᛲ:J

.field public ᛳᛸᛵᲀ:I

.field public ᛵᛲᲁᛶ:Ljava/lang/ref/WeakReference;

.field public ᛵᛷᛲᛸ:I

.field public final ᲀᛷᲁᲀ:F

.field public ᲁᛴᛴᛸ:Ljava/lang/ref/WeakReference;

.field public final ᲁᛴᲇᛲ:Z

.field public ᲁᲁᛴᲁ:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lxhss/ᛳᛴᛵ;->ᲁᛴᲇᛲ:Z

    .line 6
    .line 7
    sget v0, Lxhss/ᲇᛸᲀᛸ;->ᲇᛶᛴᲀ:I

    .line 8
    .line 9
    int-to-float v0, v0

    .line 10
    iput v0, p0, Lxhss/ᛳᛴᛵ;->ᲀᛷᲁᲀ:F

    .line 11
    .line 12
    const-wide/16 v0, 0x5dc

    .line 13
    .line 14
    iput-wide v0, p0, Lxhss/ᛳᛴᛵ;->ᛲᛴᲇᛲ:J

    .line 15
    .line 16
    const/high16 v0, -0x40800000    # -1.0f

    .line 17
    .line 18
    iput v0, p0, Lxhss/ᛳᛴᛵ;->ᲁᲁᛴᲁ:F

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    iput v0, p0, Lxhss/ᛳᛴᛵ;->ᛳᛸᛵᲀ:I

    .line 22
    .line 23
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ:Z

    .line 36
    .line 37
    return-void
.end method

.method public static ᛱᛱᛴᲀ()V
    .locals 1

    .line 1
    invoke-static {}, Lxhss/ᛳᛴᛵ;->ᛴᲈᲀᲀ()Lxhss/ᛳᛴᛵ;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lxhss/ᛳᛴᛵ;->ᛱᲁᛳᛲ()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static ᛴᲈᲀᲀ()Lxhss/ᛳᛴᛵ;
    .locals 4

    .line 1
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

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
    instance-of v1, v0, Lxhss/ᛴᛷᲀᲁ;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Lxhss/ᛴᛷᲀᲁ;

    .line 25
    .line 26
    invoke-interface {v1}, Lxhss/ᛴᛷᲀᲁ;->ᲇᛴᲇᛵ()Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v1, v1, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 31
    .line 32
    sget-object v2, Lxhss/ᛱᛷᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 33
    .line 34
    if-ne v1, v2, :cond_0

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_0
    sget-object v1, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    sget-object v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

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
    check-cast v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 69
    .line 70
    instance-of v3, v2, Lxhss/ᛳᛴᛵ;

    .line 71
    .line 72
    if-eqz v3, :cond_2

    .line 73
    .line 74
    iget-boolean v3, v2, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 75
    .line 76
    if-eqz v3, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-ne v3, v0, :cond_2

    .line 83
    .line 84
    check-cast v2, Lxhss/ᛳᛴᛵ;

    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_3
    new-instance v0, Lxhss/ᛳᛴᛵ;

    .line 88
    .line 89
    invoke-direct {v0}, Lxhss/ᛳᛴᛵ;-><init>()V

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

.method public static ᛶᲀᛵᲇ(Ljava/lang/String;)Lxhss/ᛳᛴᛵ;
    .locals 2

    .line 1
    invoke-static {}, Lxhss/ᛳᛴᛵ;->ᛴᲈᲀᲀ()Lxhss/ᛳᛴᛵ;

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
    invoke-virtual {v0, p0, v1}, Lxhss/ᛳᛴᛵ;->ᛷᛸᛷ(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ()V

    .line 18
    .line 19
    .line 20
    new-instance p0, Lxhss/ᛷᛷᲈᛸ;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {p0, v0, v1}, Lxhss/ᛷᛷᲈᛸ;-><init>(Lxhss/ᛳᛴᛵ;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-object v0

    .line 30
    :cond_1
    new-instance p0, Lxhss/ᛳᛴᛵ;

    .line 31
    .line 32
    invoke-direct {p0}, Lxhss/ᛳᛴᛵ;-><init>()V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method

.method public static ᲁᛲᲈᛵ(Ljava/lang/String;)Lxhss/ᛳᛴᛵ;
    .locals 2

    .line 1
    invoke-static {}, Lxhss/ᛳᛴᛵ;->ᛴᲈᲀᲀ()Lxhss/ᛳᛴᛵ;

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
    invoke-virtual {v0, p0, v1}, Lxhss/ᛳᛴᛵ;->ᛷᛸᛷ(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    iput p0, v0, Lxhss/ᛳᛴᛵ;->ᲁᲁᛴᲁ:F

    .line 13
    .line 14
    invoke-virtual {v0}, Lxhss/ᛳᛴᛵ;->ᛴᛷᛵᛴ()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ()V

    .line 24
    .line 25
    .line 26
    new-instance p0, Lxhss/ᛷᛷᲈᛸ;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {p0, v0, v1}, Lxhss/ᛷᛷᲈᛸ;-><init>(Lxhss/ᛳᛴᛵ;I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-object v0

    .line 36
    :cond_1
    new-instance p0, Lxhss/ᛳᛴᛵ;

    .line 37
    .line 38
    invoke-direct {p0}, Lxhss/ᛳᛴᛵ;-><init>()V

    .line 39
    .line 40
    .line 41
    return-object p0
.end method


# virtual methods
.method public final ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᛴᛵ;->ᛵᛲᲁᛶ:Ljava/lang/ref/WeakReference;

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
    check-cast p0, Lxhss/ᲀᲀ;

    .line 12
    .line 13
    return-object p0
.end method

.method public final ᛱᛳᲁᲈ()Z
    .locals 1

    .line 1
    sget-object v0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    invoke-super {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᛱᲁᛳᛲ()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 3
    .line 4
    new-instance v0, Lxhss/ᛷᛷᲈᛸ;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, p0, v1}, Lxhss/ᛷᛷᲈᛸ;-><init>(Lxhss/ᛳᛴᛵ;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ᛳᛸᛵᲀ()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛴᛷᛵᛴ()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ᛴᛷᛵᛴ()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

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
    new-instance v0, Lxhss/ᛷᛷᲈᛸ;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, v1}, Lxhss/ᛷᛷᲈᛸ;-><init>(Lxhss/ᛳᛴᛵ;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final ᛴᲀᛸᛵ()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 3
    .line 4
    new-instance v0, Lxhss/ᲁᛲᛸᛴ;

    .line 5
    .line 6
    invoke-direct {v0}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lxhss/ᲁᛲᛸᛴ;->ᛱᛱᛲᲇ()V

    .line 10
    .line 11
    .line 12
    sget-object v0, Lxhss/ᛱᛷᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛷᛲᛸ(Lxhss/ᛱᛷᛸᲁ;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lxhss/ᛳᛴᛵ;->ᛵᛲᲁᛶ:Ljava/lang/ref/WeakReference;

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
    iput-object v0, p0, Lxhss/ᛳᛴᛵ;->ᛵᛲᲁᛶ:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    iget-object v1, p0, Lxhss/ᛳᛴᛵ;->ᲁᛴᛴᛸ:Ljava/lang/ref/WeakReference;

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
    iput-object v0, p0, Lxhss/ᛳᛴᛵ;->ᲁᛴᛴᛸ:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

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
    sget-object p0, Lxhss/ᲇᛸᲀᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛶᛵᲇᛸ;

    .line 44
    .line 45
    return-void
.end method

.method public final ᛷᛴᛷᛱ()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Lxhss/ᛳᛴᛵ;

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

.method public final ᛷᛸᛷ(Ljava/lang/String;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Lxhss/ᛳᛴᛵ;->ᛲᛴᲀᲈ:Ljava/lang/String;

    .line 2
    .line 3
    iget p1, p0, Lxhss/ᛳᛴᛵ;->ᛵᛷᛲᛸ:I

    .line 4
    .line 5
    if-ne p1, p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p2}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Lxhss/ᛳᛴᛵ;->ᛳᛸᛵᲀ:I

    .line 13
    .line 14
    iput p2, p0, Lxhss/ᛳᛴᛵ;->ᛵᛷᛲᛸ:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛱᛲᛸᲇ()Lxhss/ᲀᲀ;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v0, Lxhss/ᛵᛶᛲᛳ;

    .line 30
    .line 31
    invoke-direct {v0, p1, p2}, Lxhss/ᛵᛶᛲᛳ;-><init>(Lxhss/ᲀᲀ;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lxhss/ᛳᛴᛵ;->ᛴᛷᛵᛴ()V

    .line 38
    .line 39
    .line 40
    return-void
.end method
