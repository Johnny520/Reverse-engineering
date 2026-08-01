.class public final Lcom/example/dyhelper/hook/β;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/example/dyhelper/hook/β;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/β;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget v0, Lh20;->δ:F

    .line 7
    .line 8
    const v1, 0x3d6147ae    # 0.055f

    .line 9
    .line 10
    .line 11
    add-float/2addr v0, v1

    .line 12
    const/high16 v1, 0x3f800000    # 1.0f

    .line 13
    .line 14
    rem-float/2addr v0, v1

    .line 15
    sput v0, Lh20;->δ:F

    .line 16
    .line 17
    sget-object v0, Lh20;->β:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    move v2, v1

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 40
    .line 41
    iget v4, v3, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/view/View;->isAttachedToWindow()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_0

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    invoke-virtual {v3}, Landroid/view/View;->isShown()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_1

    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-lez v2, :cond_1

    .line 69
    .line 70
    sget v2, Lh20;->δ:F

    .line 71
    .line 72
    invoke-static {v3, v2}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->β(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;F)V

    .line 73
    .line 74
    .line 75
    :cond_1
    const/4 v2, 0x1

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    :goto_1
    iput-boolean v1, v3, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    if-eqz v2, :cond_4

    .line 84
    .line 85
    sget-object v0, Lh20;->α:Landroid/os/Handler;

    .line 86
    .line 87
    const-wide/16 v1, 0x78

    .line 88
    .line 89
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    sput-boolean v1, Lh20;->γ:Z

    .line 94
    .line 95
    :goto_2
    return-void

    .line 96
    :pswitch_0
    sget-object v0, Lg20;->β:Ljava/util/WeakHashMap;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->keySet()Ljava/util/Set;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;

    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_5

    .line 123
    .line 124
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_5
    invoke-virtual {v1}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ()V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_6
    sget-object v0, Lg20;->β:Ljava/util/WeakHashMap;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_7

    .line 139
    .line 140
    const/4 p0, 0x0

    .line 141
    sput-boolean p0, Lg20;->γ:Z

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    sget-object v0, Lg20;->α:Landroid/os/Handler;

    .line 145
    .line 146
    const-wide/16 v1, 0x32

    .line 147
    .line 148
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 149
    .line 150
    .line 151
    :goto_4
    return-void

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
