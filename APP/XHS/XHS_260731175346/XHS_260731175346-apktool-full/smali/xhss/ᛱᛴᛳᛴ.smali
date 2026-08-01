.class public Lxhss/ᛱᛴᛳᛴ;
.super Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛳᲁᲈ:Lxhss/ᛱᛴᛳᛴ;

.field public ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

.field public ᛲᛴᲀᲈ:Lxhss/ᛶᲈᛴᛲ;

.field public ᛲᛴᲇᛲ:Ljava/lang/String;

.field public ᛳᛸᛵᲀ:Ljava/lang/String;

.field public ᛵᛲᲁᛶ:F

.field public ᛵᛷᛲᛸ:Lxhss/ᛷᲈᛸᛳ;

.field public ᲀᛷᲁᲀ:Lxhss/ᲁᛵᛷᛷ;

.field public ᲁᛴᛴᛸ:Ljava/lang/String;

.field public ᲁᛴᲇᛲ:Z

.field public ᲁᲁᛴᲁ:Ljava/lang/String;


# direct methods
.method public static ᛴᲀᛸᛵ(Landroid/content/Context;)Lxhss/ᛱᛴᛳᛴ;
    .locals 2

    .line 1
    new-instance v0, Lxhss/ᛱᛴᛳᛴ;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lxhss/ᛱᛴᛳᛴ;->ᲁᛴᲇᛲ:Z

    .line 8
    .line 9
    iput-object v0, v0, Lxhss/ᛱᛴᛳᛴ;->ᛱᛳᲁᲈ:Lxhss/ᛱᛴᛳᛴ;

    .line 10
    .line 11
    sget v1, Lxhss/ᲇᛸᲀᛸ;->ᲇᛴᲇᛵ:I

    .line 12
    .line 13
    int-to-float v1, v1

    .line 14
    iput v1, v0, Lxhss/ᛱᛴᛳᛴ;->ᛵᛲᲁᛶ:F

    .line 15
    .line 16
    iput-object p0, v0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 17
    .line 18
    return-object v0
.end method


# virtual methods
.method public ᛱᛱᛴᲀ()Lxhss/ᲁᛳᛵᛷ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 2
    .line 3
    return-object p0
.end method

.method public ᛱᛲᛸᲇ()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public ᛱᲁᛳᛲ()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ:Z

    .line 2
    .line 3
    return p0
.end method

.method public final ᛳᛸᛵᲀ()V
    .locals 4

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
    invoke-virtual {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛱᛱᛴᲀ()Lxhss/ᲁᛳᛵᛷ;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v0, v0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛴᛶᛳ:Landroid/widget/RelativeLayout;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛱᛱᛴᲀ()Lxhss/ᲁᛳᛵᛷ;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v0, v0, Lxhss/ᲁᛳᛵᛷ;->ᛸᛴᛶᛳ:Landroid/widget/RelativeLayout;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛱᛱᛴᲀ()Lxhss/ᲁᛳᛵᛷ;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v0, v0, Lxhss/ᲁᛳᛵᛷ;->ᲀᲇᛳᲁ:Landroid/view/ViewGroup;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛱᛱᛴᲀ()Lxhss/ᲁᛳᛵᛷ;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-object v0, v0, Lxhss/ᲁᛳᛵᛷ;->ᲀᲇᛳᲁ:Landroid/view/ViewGroup;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    const v1, 0x640b0036

    .line 60
    .line 61
    .line 62
    const v2, 0x640b0035

    .line 63
    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    move v0, v2

    .line 88
    goto :goto_0

    .line 89
    :cond_4
    move v0, v1

    .line 90
    :goto_0
    if-nez v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    move v1, v2

    .line 99
    goto :goto_1

    .line 100
    :cond_5
    move v1, v0

    .line 101
    :cond_6
    :goto_1
    const-wide/16 v2, 0x0

    .line 102
    .line 103
    iput-wide v2, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛷᲁᲁ:J

    .line 104
    .line 105
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    new-instance v1, Lxhss/ᲁᛳᛵᛷ;

    .line 110
    .line 111
    invoke-direct {v1, p0, v0}, Lxhss/ᲁᛳᛵᛷ;-><init>(Lxhss/ᛱᛴᛳᛴ;Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    iput-object v1, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 115
    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    iget-object p0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᛳᲁᲈ:Lxhss/ᛱᛴᛳᛴ;

    .line 119
    .line 120
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    :cond_7
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᲈᛳᛴ(Landroid/view/View;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public ᛴᛷᛵᛴ(Ljava/lang/CharSequence;)Lxhss/ᛱᛴᛳᛴ;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛱᛴᛳᛴ;->ᲁᛴᛴᛸ:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛴᲈᲀᲀ()V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public ᛴᲈᲀᲀ()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛱᛱᛴᲀ()Lxhss/ᲁᛳᛵᛷ;

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
    new-instance v0, Lxhss/ᲇᛶᲈᛸ;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, v1}, Lxhss/ᲇᛶᲈᛸ;-><init>(Lxhss/ᛱᛴᛳᛴ;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final ᛶᲀᛵᲇ(Landroid/content/Context;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_9

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const v1, 0x640b0036

    .line 21
    .line 22
    .line 23
    const v2, 0x640b0035

    .line 24
    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

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
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

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
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲀᛷᲁᲀ()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v2, 0x0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    const-string p1, "DialogX \u672a\u521d\u59cb\u5316(E3)\u3002\n\u8bf7\u68c0\u67e5\u662f\u5426\u5728\u542f\u52a8\u5bf9\u8bdd\u6846\u524d\u8fdb\u884c\u521d\u59cb\u5316\u64cd\u4f5c\uff0c\u4f7f\u7528\u4ee5\u4e0b\u4ee3\u7801\u8fdb\u884c\u521d\u59cb\u5316\uff1a\nDialogX.init(context);\n\n\u53e6\u5916\u5efa\u8bae\u60a8\u524d\u5f80\u67e5\u770b DialogX \u7684\u6587\u6863\u8fdb\u884c\u4f7f\u7528\uff1ahttps://github.com/kongzue/DialogX"

    .line 76
    .line 77
    invoke-static {p1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    move-object p1, v0

    .line 86
    :cond_5
    invoke-static {p1}, Lxhss/ᲁᛷᛸᛳ;->ᛷᛵᛵᲈ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    goto :goto_2

    .line 95
    :cond_6
    iget-object v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛴᛶᛳ:Landroid/content/Context;

    .line 96
    .line 97
    if-eqz v0, :cond_7

    .line 98
    .line 99
    move-object p1, v0

    .line 100
    :cond_7
    invoke-static {p1}, Lxhss/ᲁᛷᛸᛳ;->ᛷᛵᛵᲈ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    :goto_2
    new-instance p1, Lxhss/ᲁᛳᛵᛷ;

    .line 109
    .line 110
    invoke-direct {p1, p0, v2}, Lxhss/ᲁᛳᛵᛷ;-><init>(Lxhss/ᛱᛴᛳᛴ;Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 114
    .line 115
    if-eqz v2, :cond_8

    .line 116
    .line 117
    iget-object p0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᛳᲁᲈ:Lxhss/ᛱᛴᛳᛴ;

    .line 118
    .line 119
    invoke-virtual {v2, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_8
    invoke-static {v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᲈᛳᛴ(Landroid/view/View;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_9
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᲈᛳᛴ(Landroid/view/View;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public ᛷᛴᛷᛱ()Ljava/lang/String;
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

.method public ᛷᛸᛷ(Ljava/lang/CharSequence;Lxhss/ᛸᲈᲁᲇ;)Lxhss/ᛱᛴᛳᛴ;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛱᛴᛳᛴ;->ᛳᛸᛵᲀ:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lxhss/ᛱᛴᛳᛴ;->ᛵᛷᛲᛸ:Lxhss/ᛷᲈᛸᛳ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛴᲈᲀᲀ()V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final ᲁᛲᲈᛵ()V
    .locals 4

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
    if-nez v0, :cond_5

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const v1, 0x640b0036

    .line 19
    .line 20
    .line 21
    const v2, 0x640b0035

    .line 22
    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {p0, v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ(Z)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v3, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲈᛳᲀ:Lxhss/ᛶᛵᲇᛸ;

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
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᛳᲁᲈ()Z

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
    invoke-virtual {p0, v1}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v1, Lxhss/ᲁᛳᛵᛷ;

    .line 65
    .line 66
    invoke-direct {v1, p0, v0}, Lxhss/ᲁᛳᛵᛷ;-><init>(Lxhss/ᛱᛴᛳᛴ;Landroid/view/View;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᲈᛳᛴ:Lxhss/ᲁᛳᛵᛷ;

    .line 70
    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    iget-object p0, p0, Lxhss/ᛱᛴᛳᛴ;->ᛱᛳᲁᲈ:Lxhss/ᛱᛴᛳᛴ;

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_4
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᲈᛳᛴ(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_5
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛶᲈᛶ()Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛱᲈᛳᛴ(Landroid/view/View;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method
