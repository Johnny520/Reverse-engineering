.class public abstract La9/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Ljava/util/Map;

.field public static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, La9/i;->a:Ljava/util/Map;

    .line 6
    .line 7
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La9/i;->b:Ljava/util/Map;

    .line 12
    .line 13
    return-void
.end method

.method public static a(La9/c;)V
    .locals 12

    .line 1
    iget-object v0, p0, La9/c;->a:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-static {p0}, La9/i;->e(La9/c;)La9/d;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v1, Landroid/text/SpannableStringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, La9/d;->c:La9/g;

    .line 13
    .line 14
    iget-object v3, v2, La9/g;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v4, v2, La9/g;->f:Lfg/a;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-string v5, " "

    .line 23
    .line 24
    const/16 v6, 0x21

    .line 25
    .line 26
    if-lez v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    iget-object v7, v2, La9/g;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v1, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    new-instance v8, La9/f;

    .line 42
    .line 43
    iget v9, v2, La9/g;->b:I

    .line 44
    .line 45
    iget v10, v2, La9/g;->c:I

    .line 46
    .line 47
    iget v11, v2, La9/g;->d:I

    .line 48
    .line 49
    iget v2, v2, La9/g;->e:I

    .line 50
    .line 51
    invoke-direct {v8, v9, v10, v11, v2}, La9/f;-><init>(IIII)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v8, v3, v7, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 55
    .line 56
    .line 57
    if-eqz v4, :cond_0

    .line 58
    .line 59
    new-instance v2, La9/b;

    .line 60
    .line 61
    invoke-direct {v2, v4}, La9/b;-><init>(Lfg/a;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2, v3, v7, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 65
    .line 66
    .line 67
    :cond_0
    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 68
    .line 69
    .line 70
    :cond_1
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    iget-object v3, p0, La9/d;->a:Ljava/lang/CharSequence;

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    iget-object v7, p0, La9/d;->b:La9/a;

    .line 84
    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    if-eqz v7, :cond_4

    .line 88
    .line 89
    if-le v3, v2, :cond_2

    .line 90
    .line 91
    const/4 v10, 0x1

    .line 92
    goto :goto_0

    .line 93
    :cond_2
    move v10, v9

    .line 94
    :goto_0
    if-eqz v10, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    move-object v7, v8

    .line 98
    :goto_1
    if-eqz v7, :cond_4

    .line 99
    .line 100
    new-instance v10, La9/e;

    .line 101
    .line 102
    iget-object v11, v7, La9/a;->a:Ly9/f;

    .line 103
    .line 104
    iget v7, v7, La9/a;->b:I

    .line 105
    .line 106
    invoke-direct {v10, v11, v7}, La9/e;-><init>(Ly9/f;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v10, v2, v3, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 110
    .line 111
    .line 112
    :cond_4
    iget-object v2, p0, La9/d;->d:Ljava/lang/CharSequence;

    .line 113
    .line 114
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-lez v2, :cond_5

    .line 119
    .line 120
    invoke-virtual {v1, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 121
    .line 122
    .line 123
    iget-object v2, p0, La9/d;->d:Ljava/lang/CharSequence;

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 126
    .line 127
    .line 128
    :cond_5
    if-eqz v4, :cond_6

    .line 129
    .line 130
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    goto :goto_2

    .line 135
    :cond_6
    move-object v2, v8

    .line 136
    :goto_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iput-object v1, p0, La9/d;->e:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 155
    .line 156
    .line 157
    const p0, 0x7fffffff

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public static b(Landroid/widget/TextView;)La9/c;
    .locals 1

    .line 1
    sget-object v0, La9/i;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La9/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    monitor-exit v0

    .line 14
    return-object p0

    .line 15
    :catchall_0
    move-exception p0

    .line 16
    monitor-exit v0

    .line 17
    throw p0
.end method

.method public static c(Landroid/widget/TextView;)Ljava/lang/CharSequence;
    .locals 4

    .line 1
    sget-object v0, La9/i;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La9/d;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v2, v1, La9/d;->e:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-lez v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const/4 v2, 0x0

    .line 37
    :goto_0
    iget-object v3, v1, La9/d;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    iget-object p0, v1, La9/d;->a:Ljava/lang/CharSequence;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    monitor-exit v0

    .line 48
    return-object p0

    .line 49
    :cond_1
    monitor-exit v0

    .line 50
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, La9/i;->g(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :goto_1
    monitor-exit v0

    .line 60
    throw p0
.end method

.method public static d(Landroid/widget/TextView;)La9/c;
    .locals 5

    .line 1
    sget-object v0, La9/i;->a:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La9/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v1

    .line 17
    :cond_0
    :try_start_1
    new-instance v1, La9/c;

    .line 18
    .line 19
    invoke-direct {v1, p0}, La9/c;-><init>(Landroid/widget/TextView;)V

    .line 20
    .line 21
    .line 22
    move-object v2, v0

    .line 23
    check-cast v2, Ljava/util/Map;

    .line 24
    .line 25
    invoke-interface {v2, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object v2, La9/i;->b:Ljava/util/Map;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v2, Ljava/util/Map;

    .line 34
    .line 35
    new-instance v3, La9/d;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-static {v4}, La9/i;->g(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-direct {v3, v4}, La9/d;-><init>(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, p0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const/4 v2, 0x0

    .line 52
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 53
    .line 54
    .line 55
    const v3, 0x7fffffff

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 59
    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setHighlightColor(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    monitor-exit v0

    .line 69
    return-object v1

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    monitor-exit v0

    .line 72
    throw p0
.end method

.method public static e(La9/c;)La9/d;
    .locals 4

    .line 1
    sget-object v0, La9/i;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    move-object v1, v0

    .line 8
    check-cast v1, Ljava/util/Map;

    .line 9
    .line 10
    iget-object v2, p0, La9/c;->a:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    new-instance v3, La9/d;

    .line 19
    .line 20
    iget-object p0, p0, La9/c;->a:Landroid/widget/TextView;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, La9/i;->g(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v3, p0}, La9/d;-><init>(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    check-cast v3, La9/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    monitor-exit v0

    .line 42
    return-object v3

    .line 43
    :goto_1
    monitor-exit v0

    .line 44
    throw p0
.end method

.method public static f(La9/c;)La9/d;
    .locals 3

    .line 1
    invoke-static {p0}, La9/i;->e(La9/c;)La9/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, La9/c;->a:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string v1, ""

    .line 22
    .line 23
    :cond_1
    iget-object v2, v0, La9/d;->e:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-static {p0}, La9/i;->g(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iput-object p0, v0, La9/d;->a:Ljava/lang/CharSequence;

    .line 36
    .line 37
    :cond_2
    return-object v0
.end method

.method public static g(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, Landroid/text/Spanned;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    move-object v0, p0

    .line 12
    check-cast v0, Landroid/text/Spanned;

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-class v2, La9/f;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-interface {v0, v3, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, [La9/f;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const-class v4, La9/e;

    .line 32
    .line 33
    invoke-interface {v0, v3, v2, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, [La9/e;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    array-length v2, v1

    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    array-length v2, v0

    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    :goto_0
    return-object p0

    .line 52
    :cond_2
    new-instance v2, Landroid/text/SpannableStringBuilder;

    .line 53
    .line 54
    invoke-direct {v2, p0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    array-length p0, v0

    .line 61
    move v4, v3

    .line 62
    :goto_1
    if-ge v4, p0, :cond_3

    .line 63
    .line 64
    aget-object v5, v0, v4

    .line 65
    .line 66
    invoke-virtual {v2, v5}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v4, v4, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    array-length v0, v1

    .line 78
    :goto_2
    if-ge v3, v0, :cond_6

    .line 79
    .line 80
    aget-object v4, v1, v3

    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroid/text/SpannableStringBuilder;->getSpanStart(Ljava/lang/Object;)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-virtual {v2, v4}, Landroid/text/SpannableStringBuilder;->getSpanEnd(Ljava/lang/Object;)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    if-ltz v5, :cond_4

    .line 91
    .line 92
    if-lt v4, v5, :cond_4

    .line 93
    .line 94
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    new-instance v6, Lsf/e;

    .line 103
    .line 104
    invoke-direct {v6, v5, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    const/4 v6, 0x0

    .line 109
    :goto_3
    if-eqz v6, :cond_5

    .line 110
    .line 111
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_6
    new-instance v0, La9/h;

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    invoke-direct {v0, v1}, La9/h;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-static {p0, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_8

    .line 136
    .line 137
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Lsf/e;

    .line 142
    .line 143
    iget-object v1, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v1, Ljava/lang/Number;

    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Ljava/lang/Number;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    add-int/lit8 v0, v0, 0x1

    .line 160
    .line 161
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-le v0, v3, :cond_7

    .line 166
    .line 167
    move v0, v3

    .line 168
    :cond_7
    invoke-virtual {v2, v1, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_8
    return-object v2
.end method
