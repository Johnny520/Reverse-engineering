.class public abstract Lyyds/ᛸᲀᛷᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛲᛴᛳᛲ:I

.field public ᲀᛲᛳᲀ:I

.field public ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    sget-object p0, Lyyds/ᛷᛶᲇᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛶᲇᲁ;

    if-nez p0, :cond_0

    .line 49
    new-instance p0, Lyyds/ᛷᛶᲇᲁ;

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    sput-object p0, Lyyds/ᛷᛶᲇᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛶᲇᲁ;

    :cond_0
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lyyds/ᛷᲁᲇᲇ;->ᛲᲈᲁ:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    const-string p0, ">>>"

    .line 13
    .line 14
    const-string p1, "DialogX.init: \u521d\u59cb\u5316\u5f02\u5e38\uff0ccontext \u4e3a null \u6216\u672a\u521d\u59cb\u5316\uff0c\u8be6\u60c5\u8bf7\u67e5\u770b https://github.com/kongzue/DialogX/wiki"

    .line 15
    .line 16
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iput p1, p0, Lyyds/ᛸᲀᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 21
    .line 22
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Landroid/widget/RelativeLayout;

    .line 31
    .line 32
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyyds/ᛳᲇᛸᛵ;

    .line 6
    .line 7
    iget p0, p0, Lyyds/ᛳᲇᛸᛵ;->ᛱᲈᲁ:I

    .line 8
    .line 9
    if-ge v0, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛳᲇᛸᛵ;

    .line 4
    .line 5
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲀᛲᛳᲀ()V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lyyds/ᛳᲇᛸᛵ;->ᛵᛸᛸᛷ()V

    .line 14
    .line 15
    .line 16
    iget v1, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lyyds/ᛳᲇᛸᛵ;->ᛱᲈᲁ(I)V

    .line 19
    .line 20
    .line 21
    iput v2, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ:I

    .line 22
    .line 23
    iget v0, v0, Lyyds/ᛳᲇᛸᛵ;->ᛷᲈᲈᲁ:I

    .line 24
    .line 25
    iput v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᛲᛴᛳᛲ:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const-string p0, "Call next() before removing element from the iterator."

    .line 29
    .line 30
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛷᛵᲇᲀ(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public ᛲᛴᛳᛲ()V
    .locals 3

    .line 1
    :goto_0
    iget v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lyyds/ᛳᲇᛸᛵ;

    .line 6
    .line 7
    iget v2, v1, Lyyds/ᛳᲇᛸᛵ;->ᛱᲈᲁ:I

    .line 8
    .line 9
    if-ge v0, v2, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, Lyyds/ᛳᲇᛸᛵ;->ᛲᛴᛳᛲ:[I

    .line 12
    .line 13
    aget v1, v1, v0

    .line 14
    .line 15
    if-gez v1, :cond_0

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    iput v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public ᛲᲈᲁ(I)I
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    if-ge p1, v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    iget p0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ:I

    .line 10
    .line 11
    add-int/2addr p0, p1

    .line 12
    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public ᛵᛸᛸᛷ(Landroid/view/ViewGroup;Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_0

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eq v0, p1, :cond_5

    .line 18
    .line 19
    const/16 v0, -0x6d

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroid/view/View;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-ne v0, v1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroid/view/ViewGroup;

    .line 55
    .line 56
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    if-nez v0, :cond_3

    .line 72
    .line 73
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 74
    .line 75
    const/4 v1, -0x1

    .line 76
    const/4 v2, -0x2

    .line 77
    invoke-direct {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p2, p1}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget v1, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ:I

    .line 103
    .line 104
    if-ne v0, v1, :cond_4

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget v1, p0, Lyyds/ᛸᲀᛷᲀ;->ᛲᛴᛳᛲ:I

    .line 111
    .line 112
    if-eq v0, v1, :cond_5

    .line 113
    .line 114
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    iput p2, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ:I

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iput p1, p0, Lyyds/ᛸᲀᛷᲀ;->ᛲᛴᛳᛲ:I

    .line 125
    .line 126
    invoke-virtual {p0}, Lyyds/ᛸᲀᛷᲀ;->ᲇᲈᛵᛷ()Landroid/view/View;

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_0
    return-void
.end method

.method public ᲀᛲᛳᲀ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lyyds/ᛳᲇᛸᛵ;

    .line 4
    .line 5
    iget v0, v0, Lyyds/ᛳᲇᛸᛵ;->ᛷᲈᲈᲁ:I

    .line 6
    .line 7
    iget p0, p0, Lyyds/ᛸᲀᛷᲀ;->ᛲᛴᛳᛲ:I

    .line 8
    .line 9
    if-ne v0, p0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/util/ConcurrentModificationException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public abstract ᲇᲇᲇᛱ(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;Landroid/view/View;)V
.end method

.method public ᲇᲈᛵᛷ()Landroid/view/View;
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛳᛶᲁ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, Lyyds/ᛸᲀᛷᲀ;->ᲀᛲᛳᲀ:I

    .line 16
    .line 17
    new-instance v2, Landroid/widget/RelativeLayout;

    .line 18
    .line 19
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᲈᛴᲈ()Landroid/app/Activity;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v2, v3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lyyds/ᛸᲀᛷᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 32
    .line 33
    :cond_0
    return-object v0
.end method
