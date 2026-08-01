.class public final Lr0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# static fields
.field public static final b:Ljava/util/List;


# instance fields
.field public a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-string v8, "fromUser"

    .line 2
    .line 3
    const-string v9, "toUser"

    .line 4
    .line 5
    const-string v0, "Contact_User"

    .line 6
    .line 7
    const-string v1, "Contact_Username"

    .line 8
    .line 9
    const-string v2, "Contact_UserName"

    .line 10
    .line 11
    const-string v3, "username"

    .line 12
    .line 13
    const-string v4, "user_name"

    .line 14
    .line 15
    const-string v5, "talker"

    .line 16
    .line 17
    const-string v6, "talkerUsername"

    .line 18
    .line 19
    const-string v7, "Chat_User"

    .line 20
    .line 21
    const-string v10, "kintent_talker"

    .line 22
    .line 23
    const-string v11, "detail_username"

    .line 24
    .line 25
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 30
    .line 31
    const/16 v2, 0xc

    .line 32
    .line 33
    invoke-static {v2}, LF0/v;->Y(I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, LF0/h;->i0([Ljava/lang/Object;Ljava/util/HashSet;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lr0/k;->b:Ljava/util/List;

    .line 48
    .line 49
    return-void
.end method

.method public static final a(Lr0/k;Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-boolean p0, Lz0/i;->a:Z

    .line 5
    .line 6
    invoke-static {}, Lz0/g;->x()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string v0, "com.tencent.mm.plugin.profile.ui.ContactInfoUI"

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string v0, "com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI"

    .line 32
    .line 33
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    const-string v0, "ContactInfoUI"

    .line 40
    .line 41
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    const-string v0, "ContactMoreInfoUI"

    .line 48
    .line 49
    invoke-static {p0, v0, v1}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_7

    .line 54
    .line 55
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lr0/k;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-nez p0, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-static {p0}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    const-class v0, Lq0/h;

    .line 74
    .line 75
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Lq0/h;

    .line 80
    .line 81
    invoke-static {}, Lz0/g;->s()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    const/4 v2, 0x0

    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_4
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_5

    .line 94
    .line 95
    const-string v0, "chatUser is null or blank"

    .line 96
    .line 97
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_5
    iget-object v0, v0, Lq0/h;->b:Ljava/util/LinkedHashSet;

    .line 106
    .line 107
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    :goto_0
    if-nez v2, :cond_6

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_7

    .line 119
    .line 120
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    const-string v0, "block close friend profile"

    .line 132
    .line 133
    filled-new-array {v0, p2, p1, p0}, [Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {p0}, Li0/a;->a([Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_7
    :goto_1
    return-void
.end method

.method public static b(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "keySet(...)"

    .line 10
    .line 11
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_9

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29
    .line 30
    :try_start_1
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v3

    .line 36
    :try_start_2
    new-instance v4, LE0/d;

    .line 37
    .line 38
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object v3, v4

    .line 42
    :goto_0
    nop

    .line 43
    instance-of v4, v3, LE0/d;

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    move-object v3, v0

    .line 48
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, "="

    .line 57
    .line 58
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v2}, Lr0/k;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    return-object v2

    .line 75
    :cond_3
    instance-of v2, v3, Landroid/os/Bundle;

    .line 76
    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    check-cast v3, Landroid/os/Bundle;

    .line 80
    .line 81
    invoke-static {v3}, Lr0/k;->b(Landroid/os/Bundle;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_1

    .line 86
    .line 87
    return-object v2

    .line 88
    :catchall_1
    move-exception p0

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    instance-of v2, v3, Landroid/content/Intent;

    .line 91
    .line 92
    if-eqz v2, :cond_5

    .line 93
    .line 94
    check-cast v3, Landroid/content/Intent;

    .line 95
    .line 96
    invoke-static {v3}, Lr0/k;->d(Landroid/content/Intent;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    if-eqz v2, :cond_1

    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_5
    instance-of v2, v3, [Ljava/lang/Object;

    .line 104
    .line 105
    if-eqz v2, :cond_7

    .line 106
    .line 107
    check-cast v3, [Ljava/lang/Object;

    .line 108
    .line 109
    array-length v2, v3

    .line 110
    const/4 v4, 0x0

    .line 111
    :goto_1
    if-ge v4, v2, :cond_1

    .line 112
    .line 113
    aget-object v5, v3, v4

    .line 114
    .line 115
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-static {v5}, Lr0/k;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    if-eqz v5, :cond_6

    .line 124
    .line 125
    return-object v5

    .line 126
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_7
    instance-of v2, v3, Ljava/lang/Iterable;

    .line 130
    .line 131
    if-eqz v2, :cond_1

    .line 132
    .line 133
    check-cast v3, Ljava/lang/Iterable;

    .line 134
    .line 135
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_1

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-static {v3}, Lr0/k;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    if-eqz v3, :cond_8

    .line 158
    .line 159
    return-object v3

    .line 160
    :cond_9
    invoke-virtual {p0}, Landroid/os/Bundle;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    const-string v1, "toString(...)"

    .line 165
    .line 166
    invoke-static {p0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-static {p0}, Lr0/k;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 173
    goto :goto_3

    .line 174
    :goto_2
    new-instance v1, LE0/d;

    .line 175
    .line 176
    invoke-direct {v1, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 177
    .line 178
    .line 179
    move-object p0, v1

    .line 180
    :goto_3
    nop

    .line 181
    instance-of v1, p0, LE0/d;

    .line 182
    .line 183
    if-eqz v1, :cond_a

    .line 184
    .line 185
    goto :goto_4

    .line 186
    :cond_a
    move-object v0, p0

    .line 187
    :goto_4
    check-cast v0, Ljava/lang/String;

    .line 188
    .line 189
    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-static {p0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    sget-boolean v0, Lz0/i;->a:Z

    .line 10
    .line 11
    invoke-static {}, Lz0/g;->s()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    sget-object v0, LF0/s;->a:LF0/s;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const-class v0, Lq0/h;

    .line 21
    .line 22
    invoke-static {v0}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lq0/h;

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    iget-object v0, v0, Lq0/h;->a:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 33
    .line 34
    .line 35
    move-object v0, v2

    .line 36
    :goto_0
    invoke-static {v0}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v2, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    move-object v4, v3

    .line 60
    check-cast v4, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v4}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-nez v4, :cond_2

    .line 67
    .line 68
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-eqz v2, :cond_5

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move-object v3, v2

    .line 87
    check-cast v3, Ljava/lang/String;

    .line 88
    .line 89
    const/4 v4, 0x0

    .line 90
    invoke-static {p0, v3, v4}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    move-object v2, v1

    .line 98
    :goto_2
    check-cast v2, Ljava/lang/String;

    .line 99
    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    return-object v2

    .line 103
    :cond_6
    :goto_3
    return-object v1
.end method

.method public static d(Landroid/content/Intent;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    sget-object v1, Lr0/k;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_3

    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v2, v0

    .line 47
    :goto_0
    if-eqz v2, :cond_1

    .line 48
    .line 49
    return-object v2

    .line 50
    :cond_3
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lr0/k;->b(Landroid/os/Bundle;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    const-string v0, ""

    .line 67
    .line 68
    :cond_4
    invoke-static {v0}, Lr0/k;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/content/Intent;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string v0, "toString(...)"

    .line 79
    .line 80
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, Lr0/k;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :cond_5
    return-object v0
.end method


# virtual methods
.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 2

    .line 1
    iget-object v0, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->packageName:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p2, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->processName:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-boolean p2, p0, Lr0/k;->a:Z

    .line 13
    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    instance-of v0, p2, Landroid/app/Application;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    check-cast p2, Landroid/app/Application;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move-object p2, v1

    .line 30
    :goto_0
    if-nez p2, :cond_5

    .line 31
    .line 32
    instance-of p2, p1, Landroid/app/Application;

    .line 33
    .line 34
    if-eqz p2, :cond_3

    .line 35
    .line 36
    move-object v1, p1

    .line 37
    check-cast v1, Landroid/app/Application;

    .line 38
    .line 39
    :cond_3
    if-nez v1, :cond_4

    .line 40
    .line 41
    :goto_1
    return-void

    .line 42
    :cond_4
    move-object p2, v1

    .line 43
    :cond_5
    new-instance p1, Lr0/j;

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    invoke-direct {p1, p0, v0}, Lr0/j;-><init>(Le0/a;I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 50
    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    iput-boolean p1, p0, Lr0/k;->a:Z

    .line 54
    .line 55
    return-void
.end method
