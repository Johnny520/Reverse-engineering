.class public Lyyds/ᛵᲀᲀᛱ;
.super Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᛳᛶᛳ:I

.field public ᛱᛸᲁᲇ:Ljava/lang/String;

.field public ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

.field public ᛲᛱᲁᛳ:Ljava/lang/String;

.field public ᛲᛳᛴᛸ:Lyyds/ᛸᲀᛷᲀ;

.field public ᛲᲀᛲᛲ:Lyyds/ᛶᛷᛳᛷ;

.field public ᛲᲀᛵᛷ:Lyyds/ᲈᲇᛷᲈ;

.field public ᛵᲀᛵᛸ:Z

.field public ᛶᛴᛱᛲ:Lyyds/ᲁᲀᲀᲈ;

.field public ᛶᲀᲈᲇ:Lyyds/ᲇᲇᛱᲇ;

.field public ᛷᛴᛴᲁ:Lyyds/ᲁᛲᲇᛴ;

.field public ᛷᛶᛷᲀ:Ljava/lang/String;

.field public ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

.field public ᛷᲇᛲᛱ:Ljava/lang/String;

.field public ᛸᛴᛵᛶ:Ljava/lang/String;

.field public ᛸᛸᛷᛱ:I

.field public ᲀᛲᛱᛱ:Lyyds/ᲁᛳᲀᛸ;

.field public ᲀᛴᲁᲈ:Ljava/lang/String;

.field public ᲁᛵᲁᲁ:I

.field public ᲁᛶᛴᛸ:F

.field public ᲈᛷᲈᛶ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛵᲀᛵᛸ:Z

    .line 6
    .line 7
    iput-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 8
    .line 9
    sget v0, Lyyds/ᛷᲁᲇᲇ;->ᲇᲇᲇᛱ:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    iput v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᲁᛶᛴᛸ:F

    .line 13
    .line 14
    return-void
.end method

.method public static ᛶᲀᲈᲇ(Landroid/content/Context;)Lyyds/ᛵᲀᲀᛱ;
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛵᲀᲀᛱ;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lyyds/ᛵᲀᲀᛱ;->ᛵᲀᛵᛸ:Z

    .line 8
    .line 9
    iput-object v0, v0, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 10
    .line 11
    sget v1, Lyyds/ᛷᲁᲇᲇ;->ᲇᲇᲇᛱ:I

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    iput v1, v0, Lyyds/ᛵᲀᲀᛱ;->ᲁᛶᛴᛸ:F

    .line 15
    .line 16
    iput-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public ᛱᲀᲈᛲ()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛷᛴᛴᲁ()Lyyds/ᲁᛷᲇᛸ;

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
    new-instance v0, Lyyds/ᲁᲈᲁᛸ;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, v1}, Lyyds/ᲁᲈᲁᛸ;-><init>(Lyyds/ᛵᲀᲀᛱ;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public ᛲᲀᛲᛲ()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᲁᛵᲁᲁ:I

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    if-ne v0, p0, :cond_0

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    iget-boolean p0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛲᲈᛱ:Z

    .line 12
    .line 13
    return p0
.end method

.method public final ᛲᲀᛵᛷ()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲁᲈᲁᛸ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, v1}, Lyyds/ᲁᲈᲁᛸ;-><init>(Lyyds/ᛵᲀᲀᛱ;I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final ᛳᛷᛶᛲ(Landroid/app/Activity;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_5

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const v1, 0x660c008b

    .line 19
    .line 20
    .line 21
    const v2, 0x660c008a

    .line 22
    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    move v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v0, v1

    .line 49
    :goto_0
    if-nez v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move v1, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v1, v0

    .line 60
    :cond_3
    :goto_1
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, Lyyds/ᲁᛷᲇᛸ;

    .line 65
    .line 66
    invoke-direct {v1, p0, v0}, Lyyds/ᲁᛷᲇᛸ;-><init>(Lyyds/ᛵᲀᲀᛱ;Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-static {p1, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛱᲁᛳ(Landroid/app/Activity;Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p1, p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛱᲁᛳ(Landroid/app/Activity;Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final ᛴᛸᛴᛸ(Landroid/content/Context;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲈᲈᲁ:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_5

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const v1, 0x660c008b

    .line 21
    .line 22
    .line 23
    const v2, 0x660c008a

    .line 24
    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    move v0, v2

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v0, v1

    .line 51
    :goto_0
    if-nez v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    move v1, v2

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move v1, v0

    .line 62
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲇᲇᛱ(Landroid/content/Context;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v0, Lyyds/ᲁᛷᲇᛸ;

    .line 67
    .line 68
    invoke-direct {v0, p0, p1}, Lyyds/ᲁᛷᲇᛸ;-><init>(Lyyds/ᛵᲀᲀᛱ;Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 72
    .line 73
    if-eqz p1, :cond_4

    .line 74
    .line 75
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 76
    .line 77
    invoke-virtual {p1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛸᲁᲇ(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛸᲁᲇ(Landroid/view/View;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final ᛵᲈᲇᛵ()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛳᲀ()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_5

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const v1, 0x660c008b

    .line 19
    .line 20
    .line 21
    const v2, 0x660c008a

    .line 22
    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    move v0, v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v0, v1

    .line 49
    :goto_0
    if-nez v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move v1, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    move v1, v0

    .line 60
    :cond_3
    :goto_1
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, Lyyds/ᲁᛷᲇᛸ;

    .line 65
    .line 66
    invoke-direct {v1, p0, v0}, Lyyds/ᲁᛷᲇᛸ;-><init>(Lyyds/ᛵᲀᲀᛱ;Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛸᲁᲇ(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛸᲁᲇ(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public ᛶᛴᛱᛲ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public ᛶᛷᛲᲁ()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "("

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p0, ")"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public ᛷᛴᛴᲁ()Lyyds/ᲁᛷᲇᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᲀᛴᲁᲈ()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛶᲁ(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛵᲇᲀ:Z

    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛷᛴᛴᲁ()Lyyds/ᲁᛷᲇᛸ;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᛷᛲᲈᛱ:Landroid/view/View;

    .line 22
    .line 23
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛷᛴᛴᲁ()Lyyds/ᲁᛷᲇᛸ;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᛷᛲᲈᛱ:Landroid/view/View;

    .line 32
    .line 33
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛷᛴᛴᲁ()Lyyds/ᲁᛷᲇᛸ;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 43
    .line 44
    check-cast v0, Landroid/view/ViewGroup;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛷᛴᛴᲁ()Lyyds/ᲁᛷᲇᛸ;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, Lyyds/ᲁᛷᲇᛸ;->ᛷᲈᲈᲁ:Landroid/view/View;

    .line 53
    .line 54
    check-cast v0, Landroid/view/ViewGroup;

    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 57
    .line 58
    .line 59
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const v1, 0x660c008b

    .line 68
    .line 69
    .line 70
    const v2, 0x660c008a

    .line 71
    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ(Z)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    goto :goto_0

    .line 84
    :cond_3
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛲᲈᲈ:Lyyds/ᛲᲁᲈ;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    move v0, v2

    .line 96
    goto :goto_0

    .line 97
    :cond_4
    move v0, v1

    .line 98
    :goto_0
    if-nez v0, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛲᛳᛴᛸ()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    move v1, v2

    .line 107
    goto :goto_1

    .line 108
    :cond_5
    move v1, v0

    .line 109
    :cond_6
    :goto_1
    const-wide/16 v2, 0x0

    .line 110
    .line 111
    iput-wide v2, p0, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛳᲁᲁᲇ:J

    .line 112
    .line 113
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲇᲈᛵᛷ(I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-instance v1, Lyyds/ᲁᛷᲇᛸ;

    .line 118
    .line 119
    invoke-direct {v1, p0, v0}, Lyyds/ᲁᛷᲇᛸ;-><init>(Lyyds/ᛵᲀᲀᛱ;Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    iput-object v1, p0, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ:Lyyds/ᲁᛷᲇᛸ;

    .line 123
    .line 124
    if-eqz v0, :cond_7

    .line 125
    .line 126
    iget-object p0, p0, Lyyds/ᛵᲀᲀᛱ;->ᛷᛸᲇᛶ:Lyyds/ᛵᲀᲀᛱ;

    .line 127
    .line 128
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_7
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛱᛸᲁᲇ(Landroid/view/View;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public ᲁᛵᲁᲁ(Ljava/lang/CharSequence;Lyyds/ᛶᛷᛳᛷ;)Lyyds/ᛵᲀᲀᛱ;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᲀᲀᛱ;->ᛷᲇᛲᛱ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛵᲀᲀᛱ;->ᛷᛴᛴᲁ:Lyyds/ᲁᛲᲇᛴ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyyds/ᛵᲀᲀᛱ;->ᛱᲀᲈᛲ()V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method
