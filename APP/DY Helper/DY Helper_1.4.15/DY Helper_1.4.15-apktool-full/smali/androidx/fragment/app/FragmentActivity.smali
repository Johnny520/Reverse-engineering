.class public Landroidx/fragment/app/FragmentActivity;
.super Landroidx/activity/ComponentActivity;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final synthetic Δ:I


# instance fields
.field public Α:Z

.field public Β:Z

.field public Γ:Z

.field public final ψ:Ln;

.field public final ω:Ljr0;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp60;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lp60;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ln;

    .line 10
    .line 11
    const/16 v2, 0x13

    .line 12
    .line 13
    invoke-direct {v1, v2, v0}, Ln;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 17
    .line 18
    new-instance v0, Ljr0;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Ljr0;-><init>(Lhr0;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ω:Ljr0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->Γ:Z

    .line 27
    .line 28
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->ι:Ln5;

    .line 29
    .line 30
    iget-object v0, v0, Ln5;->η:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ln5;

    .line 33
    .line 34
    new-instance v1, Lqm;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-direct {v1, v2, p0}, Lqm;-><init>(ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    const-string v2, "android:support:lifecycle"

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1}, Ln5;->Σ(Ljava/lang/String;Lhq1;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lo60;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, v1}, Lo60;-><init>(Landroidx/fragment/app/FragmentActivity;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->ζ(Lap;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Lo60;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-direct {v0, p0, v1}, Lo60;-><init>(Landroidx/fragment/app/FragmentActivity;I)V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Landroidx/activity/ComponentActivity;->ρ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    new-instance v0, Lrm;

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-direct {v0, p0, v1}, Lrm;-><init>(Landroidx/activity/ComponentActivity;I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->η(Le51;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public static κ(Lb70;)Z
    .locals 4

    .line 1
    iget-object p0, p0, Lb70;->γ:Li0;

    .line 2
    .line 3
    invoke-virtual {p0}, Li0;->χ()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_4

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ln60;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object v2, v1, Ln60;->ψ:Lp60;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object v2, v2, Lp60;->Α:Landroidx/fragment/app/FragmentActivity;

    .line 34
    .line 35
    :goto_1
    if-eqz v2, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Ln60;->ζ()Lb70;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, Landroidx/fragment/app/FragmentActivity;->κ(Lb70;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    or-int/2addr v0, v2

    .line 46
    :cond_3
    iget-object v2, v1, Ln60;->Σ:Ljr0;

    .line 47
    .line 48
    iget-object v2, v2, Ljr0;->γ:Lcr0;

    .line 49
    .line 50
    sget-object v3, Lcr0;->θ:Lcr0;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-ltz v2, :cond_0

    .line 57
    .line 58
    iget-object v0, v1, Ln60;->Σ:Ljr0;

    .line 59
    .line 60
    const-string v1, "setCurrentState"

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljr0;->γ(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Lcr0;->η:Lcr0;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljr0;->ε(Lcr0;)V

    .line 68
    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    goto :goto_0

    .line 72
    :cond_4
    return v0
.end method


# virtual methods
.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p4, :cond_4

    .line 6
    .line 7
    array-length v1, p4

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    aget-object v1, p4, v0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sparse-switch v2, :sswitch_data_0

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :sswitch_0
    const-string v2, "--autofill"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :sswitch_1
    const-string v2, "--contentcapture"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :sswitch_2
    const-string v2, "--list-dumpables"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :sswitch_3
    const-string v2, "--dump-dumpable"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 58
    .line 59
    const/16 v2, 0x21

    .line 60
    .line 61
    if-lt v1, v2, :cond_4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :sswitch_4
    const-string v2, "--translation"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 74
    .line 75
    const/16 v2, 0x1f

    .line 76
    .line 77
    if-lt v1, v2, :cond_4

    .line 78
    .line 79
    :cond_3
    :goto_0
    return-void

    .line 80
    :cond_4
    :goto_1
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-string v1, "Local FragmentActivity "

    .line 84
    .line 85
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    const-string v1, " State:"

    .line 100
    .line 101
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v2, "  "

    .line 113
    .line 114
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const-string v2, "mCreated="

    .line 125
    .line 126
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-boolean v2, p0, Landroidx/fragment/app/FragmentActivity;->Α:Z

    .line 130
    .line 131
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 132
    .line 133
    .line 134
    const-string v2, " mResumed="

    .line 135
    .line 136
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-boolean v2, p0, Landroidx/fragment/app/FragmentActivity;->Β:Z

    .line 140
    .line 141
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 142
    .line 143
    .line 144
    const-string v2, " mStopped="

    .line 145
    .line 146
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-boolean v2, p0, Landroidx/fragment/app/FragmentActivity;->Γ:Z

    .line 150
    .line 151
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    if-eqz v2, :cond_8

    .line 159
    .line 160
    invoke-interface {p0}, Lr92;->γ()Lq92;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    sget-object v3, Lgq;->β:Lgq;

    .line 168
    .line 169
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    new-instance v4, Li0;

    .line 173
    .line 174
    sget-object v5, Lvu0;->γ:Ld70;

    .line 175
    .line 176
    invoke-direct {v4, v2, v5, v3}, Li0;-><init>(Lq92;Lp92;Lhq;)V

    .line 177
    .line 178
    .line 179
    const-class v2, Lvu0;

    .line 180
    .line 181
    invoke-static {v2}, Lvm1;->α(Ljava/lang/Class;)Lwf;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v2}, Lwf;->β()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    if-eqz v3, :cond_7

    .line 190
    .line 191
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 192
    .line 193
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-virtual {v4, v2, v3}, Li0;->ψ(Lwf;Ljava/lang/String;)Lm92;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    check-cast v2, Lvu0;

    .line 202
    .line 203
    iget-object v2, v2, Lvu0;->β:Lkz1;

    .line 204
    .line 205
    iget v3, v2, Lkz1;->η:I

    .line 206
    .line 207
    if-lez v3, :cond_8

    .line 208
    .line 209
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    const-string v3, "Loaders:"

    .line 213
    .line 214
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    iget v3, v2, Lkz1;->η:I

    .line 218
    .line 219
    if-gtz v3, :cond_5

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_5
    invoke-virtual {v2, v0}, Lkz1;->δ(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    if-eqz p0, :cond_6

    .line 227
    .line 228
    invoke-static {}, Lγ;->β()V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :cond_6
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    const-string p0, "  #"

    .line 236
    .line 237
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    iget-object p0, v2, Lkz1;->ε:[I

    .line 241
    .line 242
    aget p0, p0, v0

    .line 243
    .line 244
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(I)V

    .line 245
    .line 246
    .line 247
    const-string p0, ": "

    .line 248
    .line 249
    invoke-virtual {p3, p0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    const/4 p0, 0x0

    .line 253
    throw p0

    .line 254
    :cond_7
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 255
    .line 256
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :cond_8
    :goto_2
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 261
    .line 262
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast p0, Lp60;

    .line 265
    .line 266
    iget-object p0, p0, Lp60;->ω:Lb70;

    .line 267
    .line 268
    invoke-virtual {p0, p1, p2, p3, p4}, Lb70;->φ(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    nop

    .line 273
    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln;->ψ()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/FragmentActivity;->ω:Ljr0;

    .line 5
    .line 6
    sget-object v0, Lbr0;->ON_CREATE:Lbr0;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljr0;->δ(Lbr0;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 12
    .line 13
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lp60;

    .line 16
    .line 17
    iget-object p0, p0, Lp60;->ω:Lb70;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput-boolean p1, p0, Lb70;->Η:Z

    .line 21
    .line 22
    iput-boolean p1, p0, Lb70;->Θ:Z

    .line 23
    .line 24
    iget-object v0, p0, Lb70;->Ξ:Le70;

    .line 25
    .line 26
    iput-boolean p1, v0, Le70;->η:Z

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, p1}, Lb70;->υ(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 26
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 27
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    check-cast v0, Lp60;

    .line 28
    iget-object v0, v0, Lp60;->ω:Lb70;

    .line 29
    iget-object v0, v0, Lb70;->ζ:Lr60;

    .line 30
    invoke-virtual {v0, p1, p2, p3, p4}, Lr60;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    .line 31
    check-cast v0, Landroidx/fragment/app/FragmentContainerView;

    if-nez v0, :cond_0

    .line 32
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 2
    .line 3
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lp60;

    .line 6
    .line 7
    iget-object v0, v0, Lp60;->ω:Lb70;

    .line 8
    .line 9
    iget-object v0, v0, Lb70;->ζ:Lr60;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1, p1, p2, p3}, Lr60;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroidx/fragment/app/FragmentContainerView;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 5
    .line 6
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp60;

    .line 9
    .line 10
    iget-object v0, v0, Lp60;->ω:Lb70;

    .line 11
    .line 12
    invoke-virtual {v0}, Lb70;->λ()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ω:Ljr0;

    .line 16
    .line 17
    sget-object v0, Lbr0;->ON_DESTROY:Lbr0;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljr0;->δ(Lbr0;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/activity/ComponentActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p2, 0x6

    .line 10
    if-ne p1, p2, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 13
    .line 14
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lp60;

    .line 17
    .line 18
    iget-object p0, p0, Lp60;->ω:Lb70;

    .line 19
    .line 20
    invoke-virtual {p0}, Lb70;->ι()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->Β:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 8
    .line 9
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lp60;

    .line 12
    .line 13
    iget-object v0, v0, Lp60;->ω:Lb70;

    .line 14
    .line 15
    const/4 v1, 0x5

    .line 16
    invoke-virtual {v0, v1}, Lb70;->υ(I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ω:Ljr0;

    .line 20
    .line 21
    sget-object v0, Lbr0;->ON_PAUSE:Lbr0;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljr0;->δ(Lbr0;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public onPostResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ω:Ljr0;

    .line 5
    .line 6
    sget-object v1, Lbr0;->ON_RESUME:Lbr0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljr0;->δ(Lbr0;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 12
    .line 13
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lp60;

    .line 16
    .line 17
    iget-object p0, p0, Lp60;->ω:Lb70;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lb70;->Η:Z

    .line 21
    .line 22
    iput-boolean v0, p0, Lb70;->Θ:Z

    .line 23
    .line 24
    iget-object v1, p0, Lb70;->Ξ:Le70;

    .line 25
    .line 26
    iput-boolean v0, v1, Le70;->η:Z

    .line 27
    .line 28
    const/4 v0, 0x7

    .line 29
    invoke-virtual {p0, v0}, Lb70;->υ(I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln;->ψ()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onResume()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln;->ψ()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->Β:Z

    .line 11
    .line 12
    iget-object p0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lp60;

    .line 15
    .line 16
    iget-object p0, p0, Lp60;->ω:Lb70;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lb70;->ω(Z)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onStart()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln;->ψ()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lp60;

    .line 9
    .line 10
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Landroidx/fragment/app/FragmentActivity;->Γ:Z

    .line 15
    .line 16
    iget-boolean v2, p0, Landroidx/fragment/app/FragmentActivity;->Α:Z

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iput-boolean v3, p0, Landroidx/fragment/app/FragmentActivity;->Α:Z

    .line 22
    .line 23
    iget-object v2, v0, Lp60;->ω:Lb70;

    .line 24
    .line 25
    iput-boolean v1, v2, Lb70;->Η:Z

    .line 26
    .line 27
    iput-boolean v1, v2, Lb70;->Θ:Z

    .line 28
    .line 29
    iget-object v4, v2, Lb70;->Ξ:Le70;

    .line 30
    .line 31
    iput-boolean v1, v4, Le70;->η:Z

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    invoke-virtual {v2, v4}, Lb70;->υ(I)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v2, v0, Lp60;->ω:Lb70;

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Lb70;->ω(Z)Z

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ω:Ljr0;

    .line 43
    .line 44
    sget-object v2, Lbr0;->ON_START:Lbr0;

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Ljr0;->δ(Lbr0;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v0, Lp60;->ω:Lb70;

    .line 50
    .line 51
    iput-boolean v1, p0, Lb70;->Η:Z

    .line 52
    .line 53
    iput-boolean v1, p0, Lb70;->Θ:Z

    .line 54
    .line 55
    iget-object v0, p0, Lb70;->Ξ:Le70;

    .line 56
    .line 57
    iput-boolean v1, v0, Le70;->η:Z

    .line 58
    .line 59
    const/4 v0, 0x5

    .line 60
    invoke-virtual {p0, v0}, Lb70;->υ(I)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final onStateNotSaved()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 2
    .line 3
    invoke-virtual {p0}, Ln;->ψ()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/fragment/app/FragmentActivity;->Γ:Z

    .line 6
    .line 7
    :cond_0
    iget-object v1, p0, Landroidx/fragment/app/FragmentActivity;->ψ:Ln;

    .line 8
    .line 9
    iget-object v2, v1, Ln;->ζ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lp60;

    .line 12
    .line 13
    iget-object v2, v2, Lp60;->ω:Lb70;

    .line 14
    .line 15
    invoke-static {v2}, Landroidx/fragment/app/FragmentActivity;->κ(Lb70;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    iget-object v1, v1, Ln;->ζ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Lp60;

    .line 24
    .line 25
    iget-object v1, v1, Lp60;->ω:Lb70;

    .line 26
    .line 27
    iput-boolean v0, v1, Lb70;->Θ:Z

    .line 28
    .line 29
    iget-object v2, v1, Lb70;->Ξ:Le70;

    .line 30
    .line 31
    iput-boolean v0, v2, Le70;->η:Z

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    invoke-virtual {v1, v0}, Lb70;->υ(I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Landroidx/fragment/app/FragmentActivity;->ω:Ljr0;

    .line 38
    .line 39
    sget-object v0, Lbr0;->ON_STOP:Lbr0;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljr0;->δ(Lbr0;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
