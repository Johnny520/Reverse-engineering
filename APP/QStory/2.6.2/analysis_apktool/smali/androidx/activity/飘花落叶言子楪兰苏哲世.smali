.class public abstract Landroidx/activity/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static 飘花落叶言子楪世哲苏兰:Landroidx/activity/飘花落叶言子楪兰哲世苏;

.field public static final 飘花落叶言子楪世苏兰哲:I

.field public static final 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0xe6

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    sput v0, Landroidx/activity/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:I

    .line 10
    .line 11
    const/16 v0, 0x80

    .line 12
    .line 13
    const/16 v1, 0x1b

    .line 14
    .line 15
    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sput v0, Landroidx/activity/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:I

    .line 20
    .line 21
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/activity/ComponentActivity;Landroidx/activity/飘花落叶言子世兰哲楪苏;Landroidx/activity/飘花落叶言子世兰哲楪苏;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v6

    .line 9
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v0, Landroidx/activity/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Landroidx/activity/飘花落叶言子楪兰哲世苏;

    .line 13
    .line 14
    if-nez v0, :cond_4

    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x23

    .line 19
    .line 20
    if-lt v0, v1, :cond_0

    .line 21
    .line 22
    new-instance v0, Landroidx/activity/飘花落叶言子世楪兰苏哲;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 v1, 0x1e

    .line 29
    .line 30
    if-lt v0, v1, :cond_1

    .line 31
    .line 32
    new-instance v0, Landroidx/activity/飘花落叶言子世楪哲兰苏;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/16 v1, 0x1d

    .line 39
    .line 40
    if-lt v0, v1, :cond_2

    .line 41
    .line 42
    new-instance v0, Landroidx/activity/飘花落叶言子世楪哲苏兰;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/16 v1, 0x1c

    .line 49
    .line 50
    if-lt v0, v1, :cond_3

    .line 51
    .line 52
    new-instance v0, Landroidx/activity/飘花落叶言子世楪苏哲兰;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    new-instance v0, Landroidx/activity/飘花落叶言子楪兰哲世苏;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    :goto_0
    sput-object v0, Landroidx/activity/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世哲苏兰:Landroidx/activity/飘花落叶言子楪兰哲世苏;

    .line 64
    .line 65
    :cond_4
    move-object v2, v0

    .line 66
    new-instance v1, Landroidx/activity/飘花落叶言子楪兰世哲苏;

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    move-object v5, p0

    .line 70
    move-object v3, p1

    .line 71
    move-object v4, p2

    .line 72
    invoke-direct/range {v1 .. v7}, Landroidx/activity/飘花落叶言子楪兰世哲苏;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 73
    .line 74
    .line 75
    check-cast v6, Landroid/view/ViewGroup;

    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    move p1, p0

    .line 79
    :goto_1
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    const/4 v0, 0x1

    .line 84
    if-ge p1, p2, :cond_5

    .line 85
    .line 86
    move p2, v0

    .line 87
    goto :goto_2

    .line 88
    :cond_5
    move p2, p0

    .line 89
    :goto_2
    if-eqz p2, :cond_8

    .line 90
    .line 91
    add-int/lit8 p2, p1, 0x1

    .line 92
    .line 93
    invoke-virtual {v6, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    if-eqz p1, :cond_7

    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    instance-of p1, p1, Landroidx/activity/飘花落叶言子楪兰哲世苏;

    .line 104
    .line 105
    if-eqz p1, :cond_6

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    move p1, p2

    .line 109
    goto :goto_1

    .line 110
    :cond_7
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 111
    .line 112
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    :cond_8
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    new-instance p1, Landroidx/activity/飘花落叶言子楪兰苏世哲;

    .line 121
    .line 122
    invoke-direct {p1, v1, p0}, Landroidx/activity/飘花落叶言子楪兰苏世哲;-><init>(Landroidx/activity/飘花落叶言子楪兰世哲苏;Landroid/content/Context;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    const/16 p0, 0x8

    .line 129
    .line 130
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    invoke-virtual {v1}, Landroidx/activity/飘花落叶言子楪兰世哲苏;->run()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, p0}, Landroidx/activity/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰(Landroid/view/Window;)V

    .line 150
    .line 151
    .line 152
    return-void
.end method
