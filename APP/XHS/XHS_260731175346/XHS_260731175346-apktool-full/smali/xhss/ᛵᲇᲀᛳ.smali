.class public final Lxhss/ᛵᲇᲀᛳ;
.super Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛴᲀ:Lxhss/ᛲᛵᛶᲁ;

.field public ᛱᛳᲁᲈ:Ljava/lang/String;

.field public ᛱᲈᛳᛴ:Lxhss/ᛶᛸᛸᛵ;

.field public ᛲᛴᲀᲈ:Ljava/lang/String;

.field public ᛲᛴᲇᛲ:Z

.field public ᛳᛸᛵᲀ:Z

.field public ᛴᲀᛸᛵ:Lxhss/ᛵᲇᲀᛳ;

.field public ᛵᛲᲁᛶ:Lxhss/ᛶᲈᛴᛲ;

.field public ᛵᛷᛲᛸ:Z

.field public ᛸᛴᛸᛲ:Lxhss/ᛶᛸᛸᛵ;

.field public ᲀᛷᲁᲀ:Ljava/lang/String;

.field public ᲁᛴᛴᛸ:F

.field public ᲁᛴᲇᛲ:Lxhss/ᲁᛵᛷᛷ;

.field public ᲁᛷᲇᲇ:Lxhss/ᛶᛸᛸᛵ;

.field public ᲁᲁᛴᲁ:Lxhss/ᛲᛱᛷᛲ;


# direct methods
.method public static ᛴᲀᛸᛵ(Landroid/content/Context;)Lxhss/ᛵᲇᲀᛳ;
    .locals 3

    .line 1
    new-instance v0, Lxhss/ᛵᲇᲀᛳ;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lxhss/ᛵᲇᲀᛳ;->ᛲᛴᲇᛲ:Z

    .line 8
    .line 9
    iput-boolean v1, v0, Lxhss/ᛵᲇᲀᛳ;->ᛳᛸᛵᲀ:Z

    .line 10
    .line 11
    sget v2, Lxhss/ᲇᛸᲀᛸ;->ᛷᛴᛷᛱ:I

    .line 12
    .line 13
    int-to-float v2, v2

    .line 14
    iput v2, v0, Lxhss/ᛵᲇᲀᛳ;->ᲁᛴᛴᛸ:F

    .line 15
    .line 16
    iput-boolean v1, v0, Lxhss/ᛵᲇᲀᛳ;->ᛵᛷᛲᛸ:Z

    .line 17
    .line 18
    new-instance v2, Lxhss/ᛶᛸᛸᛵ;

    .line 19
    .line 20
    invoke-direct {v2}, Lxhss/ᛶᛸᛸᛵ;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-boolean v1, v2, Lxhss/ᛶᛸᛸᛵ;->ᲇᛴᲇᛵ:Z

    .line 24
    .line 25
    iput-object v2, v0, Lxhss/ᛵᲇᲀᛳ;->ᛱᲈᛳᛴ:Lxhss/ᛶᛸᛸᛵ;

    .line 26
    .line 27
    new-instance v2, Lxhss/ᛶᛸᛸᛵ;

    .line 28
    .line 29
    invoke-direct {v2}, Lxhss/ᛶᛸᛸᛵ;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-boolean v1, v2, Lxhss/ᛶᛸᛸᛵ;->ᲇᛴᲇᛵ:Z

    .line 33
    .line 34
    iput-object v2, v0, Lxhss/ᛵᲇᲀᛳ;->ᛸᛴᛸᛲ:Lxhss/ᛶᛸᛸᛵ;

    .line 35
    .line 36
    new-instance v2, Lxhss/ᛶᛸᛸᛵ;

    .line 37
    .line 38
    invoke-direct {v2}, Lxhss/ᛶᛸᛸᛵ;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-boolean v1, v2, Lxhss/ᛶᛸᛸᛵ;->ᲇᛴᲇᛵ:Z

    .line 42
    .line 43
    iput-object v2, v0, Lxhss/ᛵᲇᲀᛳ;->ᲁᛷᲇᲇ:Lxhss/ᛶᛸᛸᛵ;

    .line 44
    .line 45
    iput-object v0, v0, Lxhss/ᛵᲇᲀᛳ;->ᛴᲀᛸᛵ:Lxhss/ᛵᲇᲀᛳ;

    .line 46
    .line 47
    iput-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 48
    .line 49
    return-object v0
.end method


# virtual methods
.method public final ᛱᛱᛴᲀ()V
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛲᛲᛶ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lxhss/ᛲᛲᛶ;-><init>(Lxhss/ᛵᲇᲀᛳ;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ᛱᛲᛸᲇ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ:Lxhss/ᛲᛵᛶᲁ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lxhss/ᛲᛲᛶ;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lxhss/ᛲᛲᛶ;-><init>(Lxhss/ᛵᲇᲀᛳ;I)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final ᛱᲁᛳᛲ()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Lxhss/ᛵᲇᲀᛳ;->ᛲᛴᲇᛲ:Z

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public final ᛳᛸᛵᲀ()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛷᲈᲈ:Z

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ:Lxhss/ᛲᛵᛶᲁ;

    .line 18
    .line 19
    iget-object v0, v0, Lxhss/ᛲᛵᛶᲁ;->ᲈᛳᲀ:Landroid/widget/RelativeLayout;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ:Lxhss/ᛲᛵᛶᲁ;

    .line 27
    .line 28
    iget-object v0, v0, Lxhss/ᛲᛵᛶᲁ;->ᛸᛷᲈᲈ:Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    const v0, 0x640b002f

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    const v0, 0x640b0030

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    :cond_4
    const-wide/16 v1, 0x0

    .line 78
    .line 79
    iput-wide v1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᲁᲁ:J

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-instance v1, Lxhss/ᛲᛵᛶᲁ;

    .line 86
    .line 87
    invoke-direct {v1, p0, v0}, Lxhss/ᛲᛵᛶᲁ;-><init>(Lxhss/ᛵᲇᲀᛳ;Landroid/view/View;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ:Lxhss/ᛲᛵᛶᲁ;

    .line 91
    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    iget-object p0, p0, Lxhss/ᛵᲇᲀᛳ;->ᛴᲀᛸᛵ:Lxhss/ᛵᲇᲀᛳ;

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_5
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᲈᛳᛴ(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final ᛴᲈᲀᲀ()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const v0, 0x640b002f

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const v0, 0x640b0030

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :cond_1
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, Lxhss/ᛲᛵᛶᲁ;

    .line 54
    .line 55
    invoke-direct {v1, p0, v0}, Lxhss/ᛲᛵᛶᲁ;-><init>(Lxhss/ᛵᲇᲀᛳ;Landroid/view/View;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ:Lxhss/ᛲᛵᛶᲁ;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    iget-object p0, p0, Lxhss/ᛵᲇᲀᛳ;->ᛴᲀᛸᛵ:Lxhss/ᛵᲇᲀᛳ;

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᲈᛳᛴ(Landroid/view/View;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᲈᛳᛴ(Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final ᛷᛴᛷᛱ()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-class v1, Lxhss/ᛵᲇᲀᛳ;

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
