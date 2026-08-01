.class public abstract Lxhss/ᲁᛵᛷᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public ᛷᛵᛵᲈ:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Lxhss/ᲁᛵᛷᛷ;->ᛷᛵᛵᲈ:I

    .line 7
    .line 8
    iput p3, p0, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ:I

    .line 9
    .line 10
    return-void
.end method

.method public static ᛳᲁᲇᛸ(II)J
    .locals 2

    .line 1
    int-to-long v0, p0

    .line 2
    const/16 p0, 0x20

    .line 3
    .line 4
    shl-long/2addr v0, p0

    .line 5
    int-to-long p0, p1

    .line 6
    or-long/2addr p0, v0

    .line 7
    return-wide p0
.end method


# virtual methods
.method public ᛱᛱᛲᲇ()Landroid/view/View;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lxhss/ᲁᛷᛸᛳ;->ᛷᛵᛵᲈ(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Landroid/widget/RelativeLayout;

    .line 16
    .line 17
    invoke-static {}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛴᲈᛱᛴ()Landroid/app/Activity;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-virtual {v0, v2, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 30
    .line 31
    :cond_0
    return-object v0
.end method

.method public ᛷᛵᛵᲈ(Landroid/view/ViewGroup;Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

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
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

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
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

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
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

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
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

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
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

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
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

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
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {p1, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p2, p1}, Lxhss/ᲁᛵᛷᛷ;->ᲇᛴᲇᛵ(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

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
    iget v1, p0, Lxhss/ᲁᛵᛷᛷ;->ᛷᛵᛵᲈ:I

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
    iget v1, p0, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ:I

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
    iput p2, p0, Lxhss/ᲁᛵᛷᛷ;->ᛷᛵᛵᲈ:I

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    iput p1, p0, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ:I

    .line 125
    .line 126
    invoke-virtual {p0}, Lxhss/ᲁᛵᛷᛷ;->ᛱᛱᛲᲇ()Landroid/view/View;

    .line 127
    .line 128
    .line 129
    :cond_5
    :goto_0
    return-void
.end method

.method public abstract ᲇᛴᲇᛵ(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;Landroid/view/View;)V
.end method
