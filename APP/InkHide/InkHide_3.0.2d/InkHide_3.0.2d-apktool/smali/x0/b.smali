.class public final Lx0/b;
.super Landroidx/lifecycle/L;
.source "SourceFile"


# instance fields
.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/L;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final c(Landroid/content/Context;Lz0/b;)V
    .locals 3

    .line 1
    instance-of v0, p1, Landroid/app/Activity;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_3

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    :goto_1
    iget-object p2, p2, Lz0/b;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    const-string p2, "\u670d\u52a1\u6682\u4e0d\u53ef\u7528"

    .line 35
    .line 36
    :cond_2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 37
    .line 38
    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    const-string p1, "\u670d\u52a1\u63d0\u793a"

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string p2, "\u786e\u5b9a"

    .line 52
    .line 53
    invoke-virtual {p1, p2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance p2, Lx0/a;

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    invoke-direct {p2, v0, p0}, Lx0/a;-><init>(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_3
    const/4 p1, 0x0

    .line 72
    iput-boolean p1, p0, Lx0/b;->d:Z

    .line 73
    .line 74
    return-void
.end method

.method public final d(Landroid/content/Context;Lz0/b;Z)V
    .locals 5

    .line 1
    instance-of v0, p1, Landroid/app/Activity;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Landroid/app/Activity;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_5

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_5

    .line 25
    .line 26
    :goto_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    const-string v2, "\u66f4\u65b0\u63d0\u793a"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v3, "\u68c0\u67e5\u5230\u65b0\u7248\u672c\uff1a"

    .line 40
    .line 41
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v3, p2, Lz0/b;->f:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    iget v3, p2, Lz0/b;->e:I

    .line 53
    .line 54
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :cond_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v3, "\uff0c\u662f\u5426\u66f4\u65b0\uff1f"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v3, p2, Lz0/b;->h:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_3

    .line 73
    .line 74
    const-string v4, "\n\n"

    .line 75
    .line 76
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    const-string v3, "toString(...)"

    .line 87
    .line 88
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v2, Ls0/h;

    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    invoke-direct {v2, p0, p1, p2, v3}, Ls0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 99
    .line 100
    .line 101
    const-string p1, "\u66f4\u65b0"

    .line 102
    .line 103
    invoke-virtual {v0, p1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance v0, Lx0/a;

    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    invoke-direct {v0, v2, p0}, Lx0/a;-><init>(ILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/app/AlertDialog$Builder;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-boolean p2, p2, Lz0/b;->g:Z

    .line 118
    .line 119
    xor-int/lit8 v0, p2, 0x1

    .line 120
    .line 121
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-nez p2, :cond_4

    .line 126
    .line 127
    const-string p2, "\u53d6\u6d88"

    .line 128
    .line 129
    invoke-virtual {p1, p2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 130
    .line 131
    .line 132
    if-eqz p3, :cond_4

    .line 133
    .line 134
    new-instance p2, LA0/s;

    .line 135
    .line 136
    const/4 p3, 0x3

    .line 137
    invoke-direct {p2, p3}, LA0/s;-><init>(I)V

    .line 138
    .line 139
    .line 140
    const-string p3, "\u4e0d\u518d\u63d0\u793a"

    .line 141
    .line 142
    invoke-virtual {p1, p3, p2}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 143
    .line 144
    .line 145
    :cond_4
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_5
    const/4 p1, 0x0

    .line 150
    iput-boolean p1, p0, Lx0/b;->d:Z

    .line 151
    .line 152
    return-void
.end method
