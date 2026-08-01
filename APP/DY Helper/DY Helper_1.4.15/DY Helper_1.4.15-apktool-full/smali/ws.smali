.class public Lws;
.super Ln60;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final Ω:Lts;

.field public final а:Lus;

.field public б:I

.field public в:I

.field public г:Z

.field public д:Z

.field public е:I

.field public ж:Z

.field public final з:Ln;

.field public и:Lxm;

.field public й:Z

.field public к:Z

.field public л:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ln60;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lss;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lss;-><init>(Lws;I)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lts;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lws;->Ω:Lts;

    .line 16
    .line 17
    new-instance v0, Lus;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lus;-><init>(Lws;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lws;->а:Lus;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput v0, p0, Lws;->б:I

    .line 26
    .line 27
    iput v0, p0, Lws;->в:I

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    iput-boolean v1, p0, Lws;->г:Z

    .line 31
    .line 32
    iput-boolean v1, p0, Lws;->д:Z

    .line 33
    .line 34
    const/4 v1, -0x1

    .line 35
    iput v1, p0, Lws;->е:I

    .line 36
    .line 37
    new-instance v1, Ln;

    .line 38
    .line 39
    const/16 v2, 0xc

    .line 40
    .line 41
    invoke-direct {v1, v2, p0}, Ln;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lws;->з:Ln;

    .line 45
    .line 46
    iput-boolean v0, p0, Lws;->л:Z

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 4

    .line 1
    iget-boolean p1, p0, Lws;->й:Z

    .line 2
    .line 3
    if-nez p1, :cond_a

    .line 4
    .line 5
    const/4 p1, 0x3

    .line 6
    invoke-static {p1}, Lb70;->Η(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "onDismiss called for DialogFragment "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "FragmentManager"

    .line 27
    .line 28
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-boolean v0, p0, Lws;->к:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_1
    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Lws;->к:Z

    .line 39
    .line 40
    iget-object v1, p0, Lws;->и:Lxm;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lws;->и:Lxm;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 51
    .line 52
    .line 53
    :cond_2
    iput-boolean v0, p0, Lws;->й:Z

    .line 54
    .line 55
    iget v1, p0, Lws;->е:I

    .line 56
    .line 57
    if-ltz v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0}, Ln60;->θ()Lb70;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget v1, p0, Lws;->е:I

    .line 64
    .line 65
    if-ltz v1, :cond_3

    .line 66
    .line 67
    new-instance v2, La70;

    .line 68
    .line 69
    invoke-direct {v2, p1, v1}, La70;-><init>(Lb70;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2, v0}, Lb70;->χ(Lz60;Z)V

    .line 73
    .line 74
    .line 75
    const/4 p1, -0x1

    .line 76
    iput p1, p0, Lws;->е:I

    .line 77
    .line 78
    return-void

    .line 79
    :cond_3
    const-string p0, "Bad id: "

    .line 80
    .line 81
    invoke-static {p0, v1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_4
    invoke-virtual {p0}, Ln60;->θ()Lb70;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    new-instance v2, Lk8;

    .line 94
    .line 95
    invoke-direct {v2, v1}, Lk8;-><init>(Lb70;)V

    .line 96
    .line 97
    .line 98
    iput-boolean v0, v2, Lk8;->ο:Z

    .line 99
    .line 100
    iget-object v1, p0, Ln60;->χ:Lb70;

    .line 101
    .line 102
    if-eqz v1, :cond_6

    .line 103
    .line 104
    iget-object v3, v2, Lk8;->π:Lb70;

    .line 105
    .line 106
    if-ne v1, v3, :cond_5

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v1, "Cannot remove Fragment attached to a different FragmentManager. Fragment "

    .line 114
    .line 115
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Ln60;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    const-string p0, " is already attached to a FragmentManager."

    .line 126
    .line 127
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_6
    :goto_0
    new-instance v1, Lm70;

    .line 139
    .line 140
    invoke-direct {v1, p1, p0}, Lm70;-><init>(ILn60;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v1}, Lk8;->β(Lm70;)V

    .line 144
    .line 145
    .line 146
    iget-boolean p0, v2, Lk8;->ρ:Z

    .line 147
    .line 148
    if-nez p0, :cond_9

    .line 149
    .line 150
    const/4 p0, 0x2

    .line 151
    invoke-static {p0}, Lb70;->Η(I)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    const/4 p1, 0x1

    .line 156
    if-eqz p0, :cond_7

    .line 157
    .line 158
    new-instance p0, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    const-string v1, "Commit: "

    .line 161
    .line 162
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    const-string v1, "FragmentManager"

    .line 173
    .line 174
    invoke-static {v1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 175
    .line 176
    .line 177
    new-instance p0, Ljv0;

    .line 178
    .line 179
    invoke-direct {p0}, Ljv0;-><init>()V

    .line 180
    .line 181
    .line 182
    new-instance v1, Ljava/io/PrintWriter;

    .line 183
    .line 184
    invoke-direct {v1, p0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 185
    .line 186
    .line 187
    const-string p0, "  "

    .line 188
    .line 189
    invoke-virtual {v2, p0, v1, p1}, Lk8;->δ(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/io/PrintWriter;->close()V

    .line 193
    .line 194
    .line 195
    :cond_7
    iput-boolean p1, v2, Lk8;->ρ:Z

    .line 196
    .line 197
    iget-boolean p0, v2, Lk8;->η:Z

    .line 198
    .line 199
    iget-object p1, v2, Lk8;->π:Lb70;

    .line 200
    .line 201
    if-eqz p0, :cond_8

    .line 202
    .line 203
    iget-object p0, p1, Lb70;->ι:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 204
    .line 205
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    iput p0, v2, Lk8;->σ:I

    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_8
    const/4 p0, -0x1

    .line 213
    iput p0, v2, Lk8;->σ:I

    .line 214
    .line 215
    :goto_1
    invoke-virtual {p1, v2, v0}, Lb70;->χ(Lz60;Z)V

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :cond_9
    const-string p0, "commit already called"

    .line 220
    .line 221
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :cond_a
    :goto_2
    return-void
.end method

.method public final ξ(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln60;->ω:Lb70;

    .line 2
    .line 3
    invoke-virtual {v0}, Lb70;->Ν()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ln60;->υ:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Ln60;->γ()Lq92;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lws;->и:Lxm;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const-string v0, "android:savedDialogState"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p0, p0, Lws;->и:Lxm;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method
