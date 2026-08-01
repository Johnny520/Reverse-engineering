.class public final Lpj1;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Lqj1;


# direct methods
.method public synthetic constructor <init>(Lqj1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpj1;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lpj1;->β:Lqj1;

    .line 4
    .line 5
    invoke-direct {p0}, Lm01;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 5

    .line 1
    iget v0, p0, Lpj1;->α:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Lpj1;->β:Lqj1;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object v0, p1, Lk01;->γ:[Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v3, v0}, Lg7;->д(I[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v3, v0, Landroid/view/View;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    move-object v2, v0

    .line 29
    check-cast v2, Landroid/view/View;

    .line 30
    .line 31
    :cond_0
    if-nez v2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0, v2}, Lqj1;->β(Lqj1;Ljava/lang/Object;Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Loj1;

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-direct {v0, p0, p1, v2, v3}, Loj1;-><init>(Lqj1;Lk01;Landroid/view/View;I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    new-instance v1, Leo1;

    .line 54
    .line 55
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    sget-object p1, Lqj1;->α:Lqj1;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance p1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    const-string v0, "ultra_comment_after \u56de\u8c03\u5df2\u964d\u7ea7: "

    .line 73
    .line 74
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string p1, "callback_ultra_comment_after"

    .line 85
    .line 86
    invoke-static {p1, p0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    return-void

    .line 90
    :pswitch_0
    :try_start_1
    iget-object v0, p1, Lk01;->ε:Ljava/lang/Object;

    .line 91
    .line 92
    instance-of v4, v0, Landroid/view/View;

    .line 93
    .line 94
    if-eqz v4, :cond_3

    .line 95
    .line 96
    move-object v2, v0

    .line 97
    check-cast v2, Landroid/view/View;

    .line 98
    .line 99
    :cond_3
    if-nez v2, :cond_4

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    iget-object v0, p1, Lk01;->β:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-static {p0, v0, v2}, Lqj1;->α(Lqj1;Ljava/lang/Object;Landroid/view/View;)V

    .line 108
    .line 109
    .line 110
    new-instance v0, Loj1;

    .line 111
    .line 112
    invoke-direct {v0, p0, p1, v2, v3}, Loj1;-><init>(Lqj1;Lk01;Landroid/view/View;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :catchall_1
    move-exception p0

    .line 120
    new-instance v1, Leo1;

    .line 121
    .line 122
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    :goto_1
    invoke-static {v1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    if-eqz p0, :cond_5

    .line 130
    .line 131
    sget-object p1, Lqj1;->α:Lqj1;

    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    new-instance p1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v0, "comment_create_after \u56de\u8c03\u5df2\u964d\u7ea7: "

    .line 140
    .line 141
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    const-string p1, "callback_comment_create_after"

    .line 152
    .line 153
    invoke-static {p1, p0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    :cond_5
    return-void

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
