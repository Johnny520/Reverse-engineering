.class public final synthetic Lu20;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/ViewGroup;

.field public final synthetic η:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/view/ViewGroup;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lu20;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lu20;->ζ:Landroid/view/ViewGroup;

    .line 4
    .line 5
    iput-object p2, p0, Lu20;->η:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lu20;->ε:I

    .line 2
    .line 3
    const-string v1, "post:"

    .line 4
    .line 5
    iget-object v2, p0, Lu20;->η:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lu20;->ζ:Landroid/view/ViewGroup;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const v0, 0x7e340008

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 20
    .line 21
    :try_start_0
    const-string v0, "getAdapter"

    .line 22
    .line 23
    invoke-static {p0, v0}, Lah0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v4, 0x0

    .line 32
    :goto_0
    if-ge v4, v3, :cond_5

    .line 33
    .line 34
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    if-nez v5, :cond_0

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_0
    :try_start_1
    const-string v6, "getChildViewHolder"

    .line 42
    .line 43
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {p0, v6, v5}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception v5

    .line 53
    :try_start_2
    new-instance v6, Leo1;

    .line 54
    .line 55
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    move-object v5, v6

    .line 59
    :goto_1
    instance-of v6, v5, Leo1;

    .line 60
    .line 61
    if-eqz v6, :cond_1

    .line 62
    .line 63
    move-object v5, v1

    .line 64
    :cond_1
    if-nez v5, :cond_2

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    const-string v6, "getBindingAdapterPosition"

    .line 68
    .line 69
    invoke-static {v5, v6}, Lah0;->β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    if-nez v6, :cond_3

    .line 74
    .line 75
    const-string v6, "getAbsoluteAdapterPosition"

    .line 76
    .line 77
    invoke-static {v5, v6}, Lah0;->β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v6

    .line 81
    if-nez v6, :cond_3

    .line 82
    .line 83
    const-string v6, "getAdapterPosition"

    .line 84
    .line 85
    invoke-static {v5, v6}, Lah0;->β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    if-nez v6, :cond_3

    .line 90
    .line 91
    const-string v6, "getLayoutPosition"

    .line 92
    .line 93
    invoke-static {v5, v6}, Lah0;->β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    :cond_3
    if-eqz v6, :cond_4

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    const/4 v8, -0x1

    .line 104
    if-eq v7, v8, :cond_4

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    move-object v6, v1

    .line 108
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v8, "/visible"

    .line 117
    .line 118
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-static {v0, v5, v6, v7}, Lah0;->Β(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    sget-object p0, Ls62;->α:Ls62;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :catchall_1
    move-exception p0

    .line 135
    new-instance v0, Leo1;

    .line 136
    .line 137
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    move-object p0, v0

    .line 141
    :goto_4
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-eqz p0, :cond_6

    .line 146
    .line 147
    const-string v0, "visible-children"

    .line 148
    .line 149
    invoke-static {v0, p0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :cond_6
    return-void

    .line 153
    :pswitch_0
    sget-object v0, Lz20;->α:Lz20;

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {p0, v0}, Lz20;->ν(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :pswitch_1
    sget-object v0, Lz20;->α:Lz20;

    .line 164
    .line 165
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {p0, v0}, Lz20;->ν(Landroid/view/ViewGroup;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
