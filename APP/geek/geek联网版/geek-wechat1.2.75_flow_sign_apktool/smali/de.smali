.class public final Lde;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lde;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 1
    iget v0, p0, Lde;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lrb0;

    .line 10
    .line 11
    iget p1, p1, Lrb0;->b:I

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p2, Lrb0;

    .line 18
    .line 19
    iget p2, p2, Lrb0;->b:I

    .line 20
    .line 21
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    :goto_0
    return v3

    .line 33
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 34
    .line 35
    check-cast p2, Landroid/view/View;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    :goto_1
    sub-int/2addr p1, p2

    .line 46
    return p1

    .line 47
    :pswitch_1
    check-cast p1, Lh40;

    .line 48
    .line 49
    check-cast p2, Lh40;

    .line 50
    .line 51
    iget p1, p1, Lh40;->b:I

    .line 52
    .line 53
    iget p2, p2, Lh40;->b:I

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :pswitch_2
    check-cast p1, Len;

    .line 57
    .line 58
    check-cast p2, Len;

    .line 59
    .line 60
    iget-object v0, p1, Len;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    move v4, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    move v4, v3

    .line 67
    :goto_2
    iget-object v5, p2, Len;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    if-nez v5, :cond_2

    .line 70
    .line 71
    move v5, v1

    .line 72
    goto :goto_3

    .line 73
    :cond_2
    move v5, v3

    .line 74
    :goto_3
    if-eq v4, v5, :cond_3

    .line 75
    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    iget-boolean v0, p1, Len;->a:Z

    .line 80
    .line 81
    iget-boolean v4, p2, Len;->a:Z

    .line 82
    .line 83
    if-eq v0, v4, :cond_5

    .line 84
    .line 85
    if-eqz v0, :cond_8

    .line 86
    .line 87
    :cond_4
    move v1, v2

    .line 88
    goto :goto_4

    .line 89
    :cond_5
    iget v0, p2, Len;->b:I

    .line 90
    .line 91
    iget v1, p1, Len;->b:I

    .line 92
    .line 93
    sub-int v1, v0, v1

    .line 94
    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_6
    iget p1, p1, Len;->c:I

    .line 99
    .line 100
    iget p2, p2, Len;->c:I

    .line 101
    .line 102
    sub-int v1, p1, p2

    .line 103
    .line 104
    if-eqz v1, :cond_7

    .line 105
    .line 106
    goto :goto_4

    .line 107
    :cond_7
    move v1, v3

    .line 108
    :cond_8
    :goto_4
    return v1

    .line 109
    :pswitch_3
    check-cast p1, Landroid/view/View;

    .line 110
    .line 111
    check-cast p2, Landroid/view/View;

    .line 112
    .line 113
    sget-object v0, Loa0;->a:Ljava/util/WeakHashMap;

    .line 114
    .line 115
    invoke-static {p1}, Lda0;->m(Landroid/view/View;)F

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-static {p2}, Lda0;->m(Landroid/view/View;)F

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    cmpl-float v0, p1, p2

    .line 124
    .line 125
    if-lez v0, :cond_9

    .line 126
    .line 127
    move v1, v2

    .line 128
    goto :goto_5

    .line 129
    :cond_9
    cmpg-float p1, p1, p2

    .line 130
    .line 131
    if-gez p1, :cond_a

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_a
    move v1, v3

    .line 135
    :goto_5
    return v1

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
