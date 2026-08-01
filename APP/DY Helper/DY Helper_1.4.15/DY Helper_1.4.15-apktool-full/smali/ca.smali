.class public final Lca;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/app/Dialog;Lsm1;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lca;->ε:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lca;->ζ:Ljava/lang/Object;

    iput-object p2, p0, Lca;->η:Ljava/lang/Object;

    iput-object p3, p0, Lca;->θ:Ljava/lang/Object;

    iput-object p4, p0, Lca;->ι:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln;Lhe;Llz0;Liz0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lca;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lca;->ι:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lca;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lca;->η:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lca;->θ:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget v0, p0, Lca;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lca;->ι:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ln;

    .line 9
    .line 10
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lie;

    .line 13
    .line 14
    iget-object v1, p0, Lca;->η:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Llz0;

    .line 17
    .line 18
    iget-object v2, p0, Lca;->ζ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lhe;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    iput-boolean v3, v0, Lie;->Ζ:Z

    .line 26
    .line 27
    iget-object v2, v2, Lhe;->β:Liz0;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    invoke-virtual {v2, v3}, Liz0;->γ(Z)V

    .line 31
    .line 32
    .line 33
    iput-boolean v3, v0, Lie;->Ζ:Z

    .line 34
    .line 35
    :cond_0
    invoke-virtual {v1}, Llz0;->isEnabled()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Llz0;->hasSubMenu()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object p0, p0, Lca;->θ:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Liz0;

    .line 50
    .line 51
    const/4 v0, 0x4

    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {p0, v1, v2, v0}, Liz0;->ρ(Landroid/view/MenuItem;Luz0;I)Z

    .line 54
    .line 55
    .line 56
    :cond_1
    return-void

    .line 57
    :pswitch_0
    const-string v0, "r323590de2ec75a5c"

    .line 58
    .line 59
    iget-object v1, p0, Lca;->ζ:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, Landroid/app/Dialog;

    .line 62
    .line 63
    iget-object v2, p0, Lca;->η:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Lsm1;

    .line 66
    .line 67
    const-string v3, "countdown finished uid="

    .line 68
    .line 69
    const-string v4, "\u5e94\u7528\u5c06\u5728 "

    .line 70
    .line 71
    const/4 v5, 0x4

    .line 72
    const/4 v6, 0x0

    .line 73
    :try_start_0
    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_6

    .line 78
    .line 79
    iget v7, v2, Lsm1;->ε:I

    .line 80
    .line 81
    if-gtz v7, :cond_2

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    const-string v7, "countdown_text"

    .line 97
    .line 98
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    check-cast v1, Landroid/widget/TextView;

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :catchall_0
    move-exception p0

    .line 106
    goto :goto_1

    .line 107
    :cond_3
    move-object v1, v6

    .line 108
    :goto_0
    if-eqz v1, :cond_4

    .line 109
    .line 110
    iget v7, v2, Lsm1;->ε:I

    .line 111
    .line 112
    new-instance v8, Ljava/lang/StringBuilder;

    .line 113
    .line 114
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v4, " \u79d2\u540e\u9000\u51fa"

    .line 121
    .line 122
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    iget v1, v2, Lsm1;->ε:I

    .line 133
    .line 134
    add-int/lit8 v1, v1, -0x1

    .line 135
    .line 136
    iput v1, v2, Lsm1;->ε:I

    .line 137
    .line 138
    if-lez v1, :cond_5

    .line 139
    .line 140
    sget-object v1, Lda;->β:Landroid/os/Handler;

    .line 141
    .line 142
    const-wide/16 v2, 0x3e8

    .line 143
    .line 144
    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_5
    iget-object v1, p0, Lca;->θ:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, Ljava/lang/String;

    .line 151
    .line 152
    iget-object p0, p0, Lca;->ι:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Ljava/lang/String;

    .line 155
    .line 156
    new-instance v2, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, " reason="

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {v0, p0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    const-string v1, "countdown update failed: "

    .line 185
    .line 186
    invoke-static {v1, p0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {v0, p0, v6, v5, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_6
    :goto_2
    return-void

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
