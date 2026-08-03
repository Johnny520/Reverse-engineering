.class public abstract Lr9/e0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lke/e;


# static fields
.field public static g:Lf1/g;

.field public static h:Lf1/b;

.field public static i:Lh1/b;


# direct methods
.method public static A(Ljava/util/List;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, Lo9/r;

    .line 30
    .line 31
    iget-object v4, v3, Lo9/r;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    iget-object v3, v3, Lo9/r;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const/4 v3, 0x0

    .line 50
    :goto_1
    if-eqz v3, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    new-instance p0, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance v2, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    move-object v4, v3

    .line 81
    check-cast v4, Lo9/r;

    .line 82
    .line 83
    iget-object v4, v4, Lo9/r;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {p0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lo9/r;

    .line 118
    .line 119
    new-instance v2, Lorg/json/JSONObject;

    .line 120
    .line 121
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 122
    .line 123
    .line 124
    iget-object v3, v1, Lo9/r;->a:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    const-string v4, "groupId"

    .line 135
    .line 136
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    const-string v3, "label"

    .line 140
    .line 141
    iget-object v4, v1, Lo9/r;->b:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    iget-object v1, v1, Lo9/r;->c:Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    const-string v3, "templateId"

    .line 157
    .line 158
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    return-object p0
.end method

.method public static B(Ljava/util/List;)Ljava/lang/String;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lx8/s;

    .line 24
    .line 25
    new-instance v2, Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v3, "id"

    .line 31
    .line 32
    iget-object v4, v1, Lx8/s;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    const-string v3, "mode"

    .line 38
    .line 39
    iget v4, v1, Lx8/s;->b:I

    .line 40
    .line 41
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    const-string v3, "content"

    .line 45
    .line 46
    iget-object v4, v1, Lx8/s;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    iget-wide v5, v1, Lx8/s;->d:J

    .line 52
    .line 53
    const-wide/16 v7, 0x0

    .line 54
    .line 55
    const-wide/32 v9, 0x927c0

    .line 56
    .line 57
    .line 58
    invoke-static/range {v5 .. v10}, Lr9/e0;->s(JJJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide v3

    .line 62
    const-string v5, "delayMs"

    .line 63
    .line 64
    invoke-virtual {v2, v5, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    const-string v3, "randomDelay"

    .line 68
    .line 69
    iget-boolean v1, v1, Lx8/s;->e:Z

    .line 70
    .line 71
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    return-object p0
.end method

.method public static C(Ljava/util/Set;)Lorg/json/JSONArray;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    check-cast p0, Ljava/lang/Iterable;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v2, v1}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    move-object v3, v2

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-lez v3, :cond_2

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const/4 v3, 0x0

    .line 71
    :goto_2
    if-eqz v3, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-static {p0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_4
    return-object v0
.end method

.method public static D(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_9

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lo9/q;

    .line 21
    .line 22
    new-instance v2, Lorg/json/JSONObject;

    .line 23
    .line 24
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "id"

    .line 28
    .line 29
    iget-object v4, v1, Lo9/q;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    const-string v3, "name"

    .line 35
    .line 36
    iget-object v4, v1, Lo9/q;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    const-string v3, "enabled"

    .line 42
    .line 43
    iget-boolean v4, v1, Lo9/q;->c:Z

    .line 44
    .line 45
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    const-string v3, "joinEnabled"

    .line 49
    .line 50
    iget-boolean v4, v1, Lo9/q;->d:Z

    .line 51
    .line 52
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    const-string v3, "leftEnabled"

    .line 56
    .line 57
    iget-boolean v4, v1, Lo9/q;->e:Z

    .line 58
    .line 59
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 60
    .line 61
    .line 62
    iget-object v3, v1, Lo9/q;->f:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v3}, Lr9/e0;->P(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    const-string v4, "promptType"

    .line 69
    .line 70
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    iget-object v3, v1, Lo9/q;->g:Ljava/lang/String;

    .line 74
    .line 75
    const-string v4, "card_first"

    .line 76
    .line 77
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_0

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_0
    const-string v4, "text_first"

    .line 85
    .line 86
    :goto_1
    const-string v3, "bothOrder"

    .line 87
    .line 88
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    const-string v3, "joinText"

    .line 92
    .line 93
    iget-object v4, v1, Lo9/q;->h:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    const-string v3, "leftText"

    .line 99
    .line 100
    iget-object v4, v1, Lo9/q;->i:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    const-string v3, "joinCardTitle"

    .line 106
    .line 107
    iget-object v4, v1, Lo9/q;->j:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 110
    .line 111
    .line 112
    const-string v3, "joinCardDesc"

    .line 113
    .line 114
    iget-object v4, v1, Lo9/q;->k:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    const-string v3, "leftCardTitle"

    .line 120
    .line 121
    iget-object v4, v1, Lo9/q;->l:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    const-string v3, "leftCardDesc"

    .line 127
    .line 128
    iget-object v4, v1, Lo9/q;->m:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    iget-object v3, v1, Lo9/q;->n:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v3}, Lr9/e0;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    const-string v4, "mediaMode"

    .line 140
    .line 141
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    .line 143
    .line 144
    iget-object v3, v1, Lo9/q;->o:Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v3}, Lr9/e0;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    const-string v4, "mediaOrder"

    .line 151
    .line 152
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 153
    .line 154
    .line 155
    const-string v3, "mediaSequence"

    .line 156
    .line 157
    iget-object v4, v1, Lo9/q;->p:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    const-string v3, "joinImages"

    .line 163
    .line 164
    iget-object v4, v1, Lo9/q;->q:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    const-string v3, "leftImages"

    .line 170
    .line 171
    iget-object v4, v1, Lo9/q;->r:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 174
    .line 175
    .line 176
    const-string v3, "joinVoices"

    .line 177
    .line 178
    iget-object v4, v1, Lo9/q;->s:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 181
    .line 182
    .line 183
    const-string v3, "leftVoices"

    .line 184
    .line 185
    iget-object v4, v1, Lo9/q;->t:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 188
    .line 189
    .line 190
    const-string v3, "joinEmojis"

    .line 191
    .line 192
    iget-object v4, v1, Lo9/q;->u:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    .line 196
    .line 197
    const-string v3, "leftEmojis"

    .line 198
    .line 199
    iget-object v4, v1, Lo9/q;->v:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    const-string v3, "joinVideos"

    .line 205
    .line 206
    iget-object v4, v1, Lo9/q;->w:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 209
    .line 210
    .line 211
    const-string v3, "leftVideos"

    .line 212
    .line 213
    iget-object v4, v1, Lo9/q;->x:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    .line 217
    .line 218
    const-string v3, "joinFiles"

    .line 219
    .line 220
    iget-object v4, v1, Lo9/q;->y:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 223
    .line 224
    .line 225
    const-string v3, "leftFiles"

    .line 226
    .line 227
    iget-object v4, v1, Lo9/q;->z:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 230
    .line 231
    .line 232
    const-string v3, "joinFavorites"

    .line 233
    .line 234
    iget-object v4, v1, Lo9/q;->A:Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 237
    .line 238
    .line 239
    const-string v3, "leftFavorites"

    .line 240
    .line 241
    iget-object v4, v1, Lo9/q;->B:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 244
    .line 245
    .line 246
    iget-object v3, v1, Lo9/q;->C:Ljava/lang/String;

    .line 247
    .line 248
    const-string v4, "custom"

    .line 249
    .line 250
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_1

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_1
    const-string v4, "global"

    .line 258
    .line 259
    :goto_2
    const-string v3, "delayMode"

    .line 260
    .line 261
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 262
    .line 263
    .line 264
    iget v3, v1, Lo9/q;->D:I

    .line 265
    .line 266
    const/4 v4, 0x0

    .line 267
    if-gez v3, :cond_2

    .line 268
    .line 269
    move v3, v4

    .line 270
    :cond_2
    const-string v5, "promptDelayMs"

    .line 271
    .line 272
    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 273
    .line 274
    .line 275
    iget v3, v1, Lo9/q;->E:I

    .line 276
    .line 277
    if-gez v3, :cond_3

    .line 278
    .line 279
    move v3, v4

    .line 280
    :cond_3
    const-string v5, "imageDelayMs"

    .line 281
    .line 282
    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 283
    .line 284
    .line 285
    iget v3, v1, Lo9/q;->F:I

    .line 286
    .line 287
    if-gez v3, :cond_4

    .line 288
    .line 289
    move v3, v4

    .line 290
    :cond_4
    const-string v5, "voiceDelayMs"

    .line 291
    .line 292
    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 293
    .line 294
    .line 295
    iget v3, v1, Lo9/q;->G:I

    .line 296
    .line 297
    if-gez v3, :cond_5

    .line 298
    .line 299
    move v3, v4

    .line 300
    :cond_5
    const-string v5, "emojiDelayMs"

    .line 301
    .line 302
    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 303
    .line 304
    .line 305
    iget v3, v1, Lo9/q;->H:I

    .line 306
    .line 307
    if-gez v3, :cond_6

    .line 308
    .line 309
    move v3, v4

    .line 310
    :cond_6
    const-string v5, "videoDelayMs"

    .line 311
    .line 312
    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 313
    .line 314
    .line 315
    iget v3, v1, Lo9/q;->I:I

    .line 316
    .line 317
    if-gez v3, :cond_7

    .line 318
    .line 319
    move v3, v4

    .line 320
    :cond_7
    const-string v5, "fileDelayMs"

    .line 321
    .line 322
    invoke-virtual {v2, v5, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 323
    .line 324
    .line 325
    iget v1, v1, Lo9/q;->J:I

    .line 326
    .line 327
    if-gez v1, :cond_8

    .line 328
    .line 329
    goto :goto_3

    .line 330
    :cond_8
    move v4, v1

    .line 331
    :goto_3
    const-string v1, "favoriteDelayMs"

    .line 332
    .line 333
    invoke-virtual {v2, v1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 337
    .line 338
    .line 339
    goto/16 :goto_0

    .line 340
    .line 341
    :cond_9
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    return-object p0
.end method

.method public static E(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "isError"

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 10
    .line 11
    .line 12
    const-string v1, "message"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public static F(II)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-static {p0, v1}, Lr9/e0;->G(II)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const-string v2, "public "

    .line 14
    .line 15
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v2, 0x2

    .line 19
    invoke-static {p0, v2}, Lr9/e0;->G(II)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    const-string v3, "private "

    .line 26
    .line 27
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    :cond_1
    const/4 v3, 0x4

    .line 31
    invoke-static {p0, v3}, Lr9/e0;->G(II)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    const-string v3, "protected "

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    :cond_2
    const/16 v3, 0x8

    .line 43
    .line 44
    invoke-static {p0, v3}, Lr9/e0;->G(II)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    const-string v3, "static "

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :cond_3
    const/16 v3, 0x10

    .line 56
    .line 57
    invoke-static {p0, v3}, Lr9/e0;->G(II)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_4

    .line 62
    .line 63
    const-string v3, "final "

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    :cond_4
    const/16 v3, 0x400

    .line 69
    .line 70
    invoke-static {p0, v3}, Lr9/e0;->G(II)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_5

    .line 75
    .line 76
    const-string v3, "abstract "

    .line 77
    .line 78
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_5
    const/16 v3, 0x100

    .line 82
    .line 83
    invoke-static {p0, v3}, Lr9/e0;->G(II)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_6

    .line 88
    .line 89
    const-string v3, "native "

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-static {p1}, Lt3/c;->b(I)I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    const/16 v3, 0x20

    .line 99
    .line 100
    if-eqz p1, :cond_c

    .line 101
    .line 102
    const/16 v4, 0x80

    .line 103
    .line 104
    const/16 v5, 0x40

    .line 105
    .line 106
    if-eq p1, v1, :cond_a

    .line 107
    .line 108
    if-eq p1, v2, :cond_7

    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :cond_7
    invoke-static {p0, v3}, Lr9/e0;->G(II)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_8

    .line 117
    .line 118
    const-string p1, "synchronized "

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    :cond_8
    invoke-static {p0, v5}, Lr9/e0;->G(II)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_9

    .line 128
    .line 129
    const-string p1, "bridge "

    .line 130
    .line 131
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    :cond_9
    invoke-static {p0, v4}, Lr9/e0;->G(II)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_11

    .line 139
    .line 140
    const-string p1, "varargs "

    .line 141
    .line 142
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_a
    invoke-static {p0, v5}, Lr9/e0;->G(II)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_b

    .line 151
    .line 152
    const-string p1, "volatile "

    .line 153
    .line 154
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    :cond_b
    invoke-static {p0, v4}, Lr9/e0;->G(II)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_11

    .line 162
    .line 163
    const-string p1, "transient "

    .line 164
    .line 165
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_c
    const p1, 0x8000

    .line 170
    .line 171
    .line 172
    invoke-static {p0, p1}, Lr9/e0;->G(II)Z

    .line 173
    .line 174
    .line 175
    move-result p1

    .line 176
    if-eqz p1, :cond_d

    .line 177
    .line 178
    const-string p1, "module "

    .line 179
    .line 180
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    :cond_d
    const/16 p1, 0x800

    .line 184
    .line 185
    invoke-static {p0, p1}, Lr9/e0;->G(II)Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    if-eqz p1, :cond_e

    .line 190
    .line 191
    const-string p1, "strict "

    .line 192
    .line 193
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    :cond_e
    invoke-static {p0, v3}, Lr9/e0;->G(II)Z

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-eqz p1, :cond_f

    .line 201
    .line 202
    const-string p1, "super "

    .line 203
    .line 204
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    :cond_f
    const/16 p1, 0x4000

    .line 208
    .line 209
    invoke-static {p0, p1}, Lr9/e0;->G(II)Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_10

    .line 214
    .line 215
    const-string p1, "enum "

    .line 216
    .line 217
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    :cond_10
    const/high16 p1, 0x40000

    .line 221
    .line 222
    invoke-static {p0, p1}, Lr9/e0;->G(II)Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-eqz p1, :cond_11

    .line 227
    .line 228
    const-string p1, "data "

    .line 229
    .line 230
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    :cond_11
    :goto_0
    const/16 p1, 0x1000

    .line 234
    .line 235
    invoke-static {p0, p1}, Lr9/e0;->G(II)Z

    .line 236
    .line 237
    .line 238
    move-result p0

    .line 239
    if-eqz p0, :cond_12

    .line 240
    .line 241
    const-string p0, "synthetic "

    .line 242
    .line 243
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    :cond_12
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    return-object p0
.end method

.method public static G(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method

.method public static H(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p0}, Lr9/e0;->U(Ljava/lang/String;)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p1}, Lr9/e0;->U(Ljava/lang/String;)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-ne p0, p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 33
    .line 34
    .line 35
    const/16 v0, 0xb

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    mul-int/lit16 v0, v0, 0xe10

    .line 42
    .line 43
    const/16 v1, 0xc

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Ljava/util/Calendar;->get(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    mul-int/lit8 v1, v1, 0x3c

    .line 50
    .line 51
    add-int/2addr v1, v0

    .line 52
    const/16 v0, 0xd

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v0, v1

    .line 59
    if-ge p0, p1, :cond_1

    .line 60
    .line 61
    if-gt p0, v0, :cond_2

    .line 62
    .line 63
    if-ge v0, p1, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    if-ge v0, p0, :cond_3

    .line 67
    .line 68
    if-ge v0, p1, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 p0, 0x0

    .line 72
    return p0

    .line 73
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 74
    return p0
.end method

.method public static varargs I(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    array-length v2, p1

    .line 8
    mul-int/lit8 v2, v2, 0x10

    .line 9
    .line 10
    add-int/2addr v2, v1

    .line 11
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    :goto_0
    array-length v3, p1

    .line 17
    if-ge v1, v3, :cond_1

    .line 18
    .line 19
    const-string v3, "%s"

    .line 20
    .line 21
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v4, -0x1

    .line 26
    if-ne v3, v4, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v0, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    add-int/lit8 v2, v1, 0x1

    .line 33
    .line 34
    aget-object v1, p1, v1

    .line 35
    .line 36
    invoke-static {v1}, Lr9/e0;->J(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    add-int/lit8 v1, v3, 0x2

    .line 44
    .line 45
    move v5, v2

    .line 46
    move v2, v1

    .line 47
    move v1, v5

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-virtual {v0, p0, v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    array-length p0, p1

    .line 57
    if-ge v1, p0, :cond_3

    .line 58
    .line 59
    const-string p0, " ["

    .line 60
    .line 61
    :goto_2
    array-length v2, p1

    .line 62
    if-ge v1, v2, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    aget-object p0, p1, v1

    .line 68
    .line 69
    invoke-static {p0}, Lr9/e0;->J(Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    const-string p0, ", "

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    const/16 p0, 0x5d

    .line 82
    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0
.end method

.method public static J(Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p0

    .line 11
    :catch_0
    move-exception v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const/16 v2, 0x40

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v1, "com.google.common.base.Strings"

    .line 49
    .line 50
    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 55
    .line 56
    const-string v3, "Exception during lenientFormat for "

    .line 57
    .line 58
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    const-string v1, "<"

    .line 66
    .line 67
    const-string v2, " threw "

    .line 68
    .line 69
    invoke-static {v1, p0, v2}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, ">"

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method

.method public static K(Landroid/content/Context;Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 7
    .line 8
    move-object/from16 v2, p0

    .line 9
    .line 10
    move-object/from16 v3, p2

    .line 11
    .line 12
    invoke-static {v2, v3}, Lr9/e0;->f0(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v0, v2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    new-instance v2, Lsf/f;

    .line 22
    .line 23
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object v0, v2

    .line 27
    :goto_0
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-nez v2, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance v0, Lorg/json/JSONArray;

    .line 35
    .line 36
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 37
    .line 38
    .line 39
    :goto_1
    move-object v2, v0

    .line 40
    check-cast v2, Lorg/json/JSONArray;

    .line 41
    .line 42
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    const-string v3, ""

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x1

    .line 50
    const/4 v6, 0x0

    .line 51
    if-nez v0, :cond_6

    .line 52
    .line 53
    :try_start_1
    new-instance v0, Lorg/json/JSONArray;

    .line 54
    .line 55
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception v0

    .line 60
    new-instance v1, Lsf/f;

    .line 61
    .line 62
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    move-object v0, v1

    .line 66
    :goto_2
    nop

    .line 67
    instance-of v1, v0, Lsf/f;

    .line 68
    .line 69
    if-eqz v1, :cond_1

    .line 70
    .line 71
    move-object v0, v4

    .line 72
    :cond_1
    check-cast v0, Lorg/json/JSONArray;

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-lez v1, :cond_2

    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_2
    move v5, v6

    .line 84
    :goto_3
    if-eqz v5, :cond_3

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_3
    move-object v0, v4

    .line 88
    :goto_4
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    :cond_4
    if-nez v4, :cond_5

    .line 95
    .line 96
    goto :goto_5

    .line 97
    :cond_5
    move-object v3, v4

    .line 98
    :goto_5
    return-object v3

    .line 99
    :cond_6
    new-instance v0, Luf/i;

    .line 100
    .line 101
    invoke-direct {v0}, Luf/i;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    move v8, v6

    .line 109
    :goto_6
    const-string v9, "id"

    .line 110
    .line 111
    const-string v10, "tool_calls"

    .line 112
    .line 113
    if-lt v8, v7, :cond_21

    .line 114
    .line 115
    invoke-static {v0}, Lac/p;->h(Luf/i;)Luf/i;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    new-instance v11, Lorg/json/JSONArray;

    .line 120
    .line 121
    invoke-direct {v11}, Lorg/json/JSONArray;-><init>()V

    .line 122
    .line 123
    .line 124
    :try_start_2
    new-instance v0, Lorg/json/JSONArray;

    .line 125
    .line 126
    invoke-direct {v0, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 127
    .line 128
    .line 129
    goto :goto_7

    .line 130
    :catchall_2
    move-exception v0

    .line 131
    new-instance v1, Lsf/f;

    .line 132
    .line 133
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object v0, v1

    .line 137
    :goto_7
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    if-nez v1, :cond_7

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_7
    new-instance v0, Lorg/json/JSONArray;

    .line 145
    .line 146
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 147
    .line 148
    .line 149
    :goto_8
    check-cast v0, Lorg/json/JSONArray;

    .line 150
    .line 151
    move v1, v6

    .line 152
    :goto_9
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    const-string v12, "assistant"

    .line 157
    .line 158
    const-string v13, "role"

    .line 159
    .line 160
    if-ge v1, v8, :cond_15

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    if-eqz v8, :cond_9

    .line 167
    .line 168
    invoke-virtual {v8, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    invoke-static {v13, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    if-eqz v12, :cond_8

    .line 177
    .line 178
    move-object v12, v8

    .line 179
    goto :goto_a

    .line 180
    :cond_8
    move-object v12, v4

    .line 181
    :goto_a
    if-eqz v12, :cond_9

    .line 182
    .line 183
    invoke-virtual {v12, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    move-object v14, v12

    .line 188
    goto :goto_b

    .line 189
    :cond_9
    move-object v14, v4

    .line 190
    :goto_b
    if-nez v14, :cond_b

    .line 191
    .line 192
    if-eqz v8, :cond_a

    .line 193
    .line 194
    invoke-virtual {v11, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 195
    .line 196
    .line 197
    :cond_a
    add-int/lit8 v1, v1, 0x1

    .line 198
    .line 199
    goto :goto_9

    .line 200
    :cond_b
    new-instance v8, Luf/i;

    .line 201
    .line 202
    invoke-direct {v8}, Luf/i;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v14}, Lorg/json/JSONArray;->length()I

    .line 206
    .line 207
    .line 208
    move-result v15

    .line 209
    move v12, v6

    .line 210
    :goto_c
    if-lt v12, v15, :cond_12

    .line 211
    .line 212
    invoke-static {v8}, Lac/p;->h(Luf/i;)Luf/i;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    invoke-virtual {v14}, Lorg/json/JSONArray;->length()I

    .line 217
    .line 218
    .line 219
    move-result v12

    .line 220
    add-int/2addr v12, v5

    .line 221
    if-eqz v8, :cond_c

    .line 222
    .line 223
    iget-object v13, v8, Luf/i;->g:Luf/g;

    .line 224
    .line 225
    invoke-virtual {v13}, Luf/g;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v13

    .line 229
    if-eqz v13, :cond_c

    .line 230
    .line 231
    goto :goto_d

    .line 232
    :cond_c
    invoke-virtual {v8}, Luf/i;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    :cond_d
    move-object v13, v8

    .line 237
    check-cast v13, Lm3/c;

    .line 238
    .line 239
    invoke-virtual {v13}, Lm3/c;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    if-eqz v13, :cond_e

    .line 244
    .line 245
    move-object v13, v8

    .line 246
    check-cast v13, Luf/e;

    .line 247
    .line 248
    invoke-virtual {v13}, Luf/e;->next()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    check-cast v13, Ljava/lang/String;

    .line 253
    .line 254
    iget-object v14, v7, Luf/i;->g:Luf/g;

    .line 255
    .line 256
    invoke-virtual {v14, v13}, Luf/g;->containsKey(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    if-eqz v13, :cond_d

    .line 261
    .line 262
    goto :goto_10

    .line 263
    :cond_e
    :goto_d
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 264
    .line 265
    .line 266
    move-result v8

    .line 267
    sub-int/2addr v8, v1

    .line 268
    if-le v12, v8, :cond_f

    .line 269
    .line 270
    goto :goto_e

    .line 271
    :cond_f
    move v8, v12

    .line 272
    :goto_e
    move v13, v6

    .line 273
    :goto_f
    if-ge v13, v8, :cond_11

    .line 274
    .line 275
    add-int v14, v13, v1

    .line 276
    .line 277
    invoke-virtual {v0, v14}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 278
    .line 279
    .line 280
    move-result-object v14

    .line 281
    if-eqz v14, :cond_10

    .line 282
    .line 283
    invoke-virtual {v11, v14}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 284
    .line 285
    .line 286
    :cond_10
    add-int/lit8 v13, v13, 0x1

    .line 287
    .line 288
    goto :goto_f

    .line 289
    :cond_11
    :goto_10
    add-int/2addr v1, v12

    .line 290
    goto/16 :goto_9

    .line 291
    .line 292
    :cond_12
    invoke-virtual {v14, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 293
    .line 294
    .line 295
    move-result-object v13

    .line 296
    if-eqz v13, :cond_14

    .line 297
    .line 298
    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v13

    .line 302
    if-eqz v13, :cond_14

    .line 303
    .line 304
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 305
    .line 306
    .line 307
    move-result v16

    .line 308
    if-nez v16, :cond_13

    .line 309
    .line 310
    goto :goto_11

    .line 311
    :cond_13
    move-object v13, v4

    .line 312
    :goto_11
    if-eqz v13, :cond_14

    .line 313
    .line 314
    invoke-virtual {v8, v13}, Luf/i;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    :cond_14
    add-int/lit8 v12, v12, 0x1

    .line 318
    .line 319
    goto :goto_c

    .line 320
    :cond_15
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 321
    .line 322
    .line 323
    move-result v14

    .line 324
    move v0, v6

    .line 325
    :goto_12
    if-lt v0, v14, :cond_1f

    .line 326
    .line 327
    :cond_16
    invoke-static {v11}, Lr9/e0;->M(Lorg/json/JSONArray;)I

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-le v0, v5, :cond_1a

    .line 332
    .line 333
    invoke-virtual {v11}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    const v1, 0x1d4c0

    .line 342
    .line 343
    .line 344
    if-le v0, v1, :cond_1a

    .line 345
    .line 346
    invoke-virtual {v11, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    if-eqz v0, :cond_17

    .line 351
    .line 352
    invoke-virtual {v0, v13}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    goto :goto_13

    .line 357
    :cond_17
    move-object v1, v4

    .line 358
    :goto_13
    invoke-static {v1, v12}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v1

    .line 362
    if-eqz v1, :cond_18

    .line 363
    .line 364
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    if-eqz v0, :cond_18

    .line 369
    .line 370
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    goto :goto_14

    .line 375
    :cond_18
    move v0, v6

    .line 376
    :goto_14
    invoke-virtual {v11, v6}, Lorg/json/JSONArray;->remove(I)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    if-le v0, v1, :cond_19

    .line 384
    .line 385
    move v0, v1

    .line 386
    :cond_19
    move v1, v6

    .line 387
    :goto_15
    if-ge v1, v0, :cond_16

    .line 388
    .line 389
    invoke-virtual {v11, v6}, Lorg/json/JSONArray;->remove(I)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    add-int/lit8 v1, v1, 0x1

    .line 393
    .line 394
    goto :goto_15

    .line 395
    :cond_1a
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    if-lez v0, :cond_1b

    .line 400
    .line 401
    goto :goto_16

    .line 402
    :cond_1b
    move v5, v6

    .line 403
    :goto_16
    if-eqz v5, :cond_1c

    .line 404
    .line 405
    goto :goto_17

    .line 406
    :cond_1c
    move-object v11, v4

    .line 407
    :goto_17
    if-eqz v11, :cond_1d

    .line 408
    .line 409
    invoke-virtual {v11}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    :cond_1d
    if-nez v4, :cond_1e

    .line 414
    .line 415
    goto :goto_18

    .line 416
    :cond_1e
    move-object v3, v4

    .line 417
    :goto_18
    return-object v3

    .line 418
    :cond_1f
    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    if-eqz v1, :cond_20

    .line 423
    .line 424
    invoke-virtual {v11, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 425
    .line 426
    .line 427
    :cond_20
    add-int/lit8 v0, v0, 0x1

    .line 428
    .line 429
    goto :goto_12

    .line 430
    :cond_21
    invoke-virtual {v2, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 431
    .line 432
    .line 433
    move-result-object v11

    .line 434
    if-eqz v11, :cond_25

    .line 435
    .line 436
    invoke-virtual {v11, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 437
    .line 438
    .line 439
    move-result-object v10

    .line 440
    if-eqz v10, :cond_25

    .line 441
    .line 442
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    .line 443
    .line 444
    .line 445
    move-result v11

    .line 446
    move v12, v6

    .line 447
    :goto_19
    if-lt v12, v11, :cond_22

    .line 448
    .line 449
    goto :goto_1b

    .line 450
    :cond_22
    invoke-virtual {v10, v12}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 451
    .line 452
    .line 453
    move-result-object v13

    .line 454
    if-eqz v13, :cond_24

    .line 455
    .line 456
    invoke-virtual {v13, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v13

    .line 460
    if-eqz v13, :cond_24

    .line 461
    .line 462
    invoke-static {v13}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 463
    .line 464
    .line 465
    move-result v14

    .line 466
    if-nez v14, :cond_23

    .line 467
    .line 468
    goto :goto_1a

    .line 469
    :cond_23
    move-object v13, v4

    .line 470
    :goto_1a
    if-eqz v13, :cond_24

    .line 471
    .line 472
    invoke-virtual {v0, v13}, Luf/i;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    :cond_24
    add-int/lit8 v12, v12, 0x1

    .line 476
    .line 477
    goto :goto_19

    .line 478
    :cond_25
    :goto_1b
    add-int/lit8 v8, v8, 0x1

    .line 479
    .line 480
    goto/16 :goto_6
.end method

.method public static final L(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Ljava/lang/Object;

    .line 6
    .line 7
    const-string v2, "getTimeLine"

    .line 8
    .line 9
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, ""

    .line 14
    .line 15
    if-eqz p0, :cond_4

    .line 16
    .line 17
    const-string v2, "desc"

    .line 18
    .line 19
    const-string v3, "description"

    .line 20
    .line 21
    const-string v4, "ContentDesc"

    .line 22
    .line 23
    const-string v5, "contentDesc"

    .line 24
    .line 25
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    const/4 v3, 0x4

    .line 30
    if-lt v0, v3, :cond_0

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_0
    aget-object v3, v2, v0

    .line 34
    .line 35
    invoke-static {p0, v3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    const/4 v3, 0x0

    .line 47
    :goto_1
    if-nez v3, :cond_2

    .line 48
    .line 49
    move-object v3, v1

    .line 50
    :cond_2
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-nez v4, :cond_3

    .line 55
    .line 56
    return-object v3

    .line 57
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_4
    return-object v1
.end method

.method public static M(Lorg/json/JSONArray;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-lt v1, v0, :cond_0

    .line 8
    .line 9
    return v2

    .line 10
    :cond_0
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    const-string v4, "role"

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v3, 0x0

    .line 24
    :goto_1
    const-string v4, "assistant"

    .line 25
    .line 26
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0
.end method

.method public static N(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "custom"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const-string v0, "none"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    const-string p0, "global"

    .line 23
    .line 24
    return-object p0
.end method

.method public static O(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const v1, -0x5305c081

    .line 9
    .line 10
    .line 11
    const-string v2, "none"

    .line 12
    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const v1, 0x33af38

    .line 16
    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const v1, 0x58705dc

    .line 21
    .line 22
    .line 23
    if-eq v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "after"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string v0, "before"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    :goto_0
    return-object v2

    .line 51
    :cond_3
    return-object p0
.end method

.method public static P(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const-string v1, "text"

    .line 9
    .line 10
    sparse-switch v0, :sswitch_data_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :sswitch_0
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :sswitch_1
    const-string v0, "card"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :sswitch_2
    const-string v0, "both"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :sswitch_3
    const-string v0, "global"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_0

    .line 46
    .line 47
    :goto_0
    return-object v1

    .line 48
    :cond_0
    return-object p0

    .line 49
    :sswitch_data_0
    .sparse-switch
        -0x4a16fc5d -> :sswitch_3
        0x2e3b81 -> :sswitch_2
        0x2e7b10 -> :sswitch_1
        0x36452d -> :sswitch_0
    .end sparse-switch
.end method

.method public static Q(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 1
    add-int/2addr p1, p0

    .line 2
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-le p1, v0, :cond_0

    .line 7
    .line 8
    move p1, v0

    .line 9
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 10
    .line 11
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "handle"

    .line 15
    .line 16
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    const-string p2, "offset"

    .line 20
    .line 21
    invoke-virtual {v0, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    const-string p2, "totalChars"

    .line 25
    .line 26
    invoke-virtual {v0, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    const-string p2, "content"

    .line 30
    .line 31
    invoke-virtual {p3, p0, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {v0, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    if-ge p1, p4, :cond_1

    .line 39
    .line 40
    const/4 p0, 0x1

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p0, 0x0

    .line 43
    :goto_0
    const-string p2, "truncated"

    .line 44
    .line 45
    invoke-virtual {v0, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    if-ge p1, p4, :cond_2

    .line 49
    .line 50
    const-string p0, "nextOffset"

    .line 51
    .line 52
    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    return-object p0
.end method

.method public static R(Ljava/lang/String;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    :goto_0
    if-lt v2, v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast p0, Ljava/lang/Iterable;

    .line 33
    .line 34
    invoke-static {p0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    if-eqz v3, :cond_5

    .line 44
    .line 45
    const-string v4, "groupId"

    .line 46
    .line 47
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v5, "templateId"

    .line 63
    .line 64
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-nez v6, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const-string v6, "label"

    .line 94
    .line 95
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_4

    .line 104
    .line 105
    move-object v3, v4

    .line 106
    :cond_4
    new-instance v6, Lo9/r;

    .line 107
    .line 108
    invoke-direct {v6, v4, v3, v5}, Lo9/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    .line 114
    :cond_5
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catchall_0
    :goto_2
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 118
    .line 119
    return-object p0
.end method

.method public static final S(Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x6

    .line 6
    new-array v1, v0, [C

    .line 7
    .line 8
    fill-array-data v1, :array_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1, v0}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    move-object v2, v1

    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-lez v2, :cond_3

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/4 v2, 0x0

    .line 75
    :goto_2
    if-eqz v2, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-static {p0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :array_0
    .array-data 2
        0x2cs
        0x7cs
        0x3bs
        0xas
        -0xf4s
        -0xe5s
    .end array-data
.end method

.method public static final T(Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x6

    .line 6
    new-array v1, v0, [C

    .line 7
    .line 8
    fill-array-data v1, :array_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1, v0}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    move-object v2, v1

    .line 84
    check-cast v2, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-lez v2, :cond_3

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const/4 v2, 0x0

    .line 95
    :goto_2
    if-eqz v2, :cond_2

    .line 96
    .line 97
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-static {p0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    nop

    .line 107
    :array_0
    .array-data 2
        0x2cs
        0x7cs
        0x3bs
        0xas
        -0xf4s
        -0xe5s
    .end array-data
.end method

.method public static final U(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 5

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    new-array v1, v0, [C

    .line 11
    .line 12
    const/16 v2, 0x3a

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    aput-char v2, v1, v3

    .line 16
    .line 17
    const/4 v2, 0x6

    .line 18
    invoke-static {p0, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/4 v2, 0x2

    .line 27
    if-gt v2, v1, :cond_1

    .line 28
    .line 29
    const/4 v4, 0x4

    .line 30
    if-ge v1, v4, :cond_1

    .line 31
    .line 32
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {v2, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Ljava/lang/String;

    .line 69
    .line 70
    if-eqz p0, :cond_0

    .line 71
    .line 72
    const/16 v2, 0xa

    .line 73
    .line 74
    invoke-static {v2, p0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_0

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    :cond_0
    if-ltz v1, :cond_1

    .line 85
    .line 86
    const/16 p0, 0x18

    .line 87
    .line 88
    if-ge v1, p0, :cond_1

    .line 89
    .line 90
    if-ltz v0, :cond_1

    .line 91
    .line 92
    const/16 p0, 0x3c

    .line 93
    .line 94
    if-ge v0, p0, :cond_1

    .line 95
    .line 96
    if-ltz v3, :cond_1

    .line 97
    .line 98
    if-ge v3, p0, :cond_1

    .line 99
    .line 100
    mul-int/lit16 v1, v1, 0xe10

    .line 101
    .line 102
    mul-int/2addr v0, p0

    .line 103
    add-int/2addr v0, v1

    .line 104
    add-int/2addr v0, v3

    .line 105
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_1
    const/4 p0, 0x0

    .line 111
    return-object p0
.end method

.method public static V(Ljava/lang/String;)Ljava/util/List;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    .line 16
    .line 17
    invoke-direct {v2, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, La/a;->E()Luf/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/4 v4, 0x0

    .line 29
    move v5, v4

    .line 30
    :goto_0
    if-lt v5, v3, :cond_1

    .line 31
    .line 32
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :catchall_0
    move-exception v0

    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_1
    invoke-virtual {v2, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    if-eqz v6, :cond_6

    .line 46
    .line 47
    const-string v7, "mode"

    .line 48
    .line 49
    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    const-string v7, "content"

    .line 54
    .line 55
    const-string v8, ""

    .line 56
    .line 57
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-eqz v7, :cond_4

    .line 69
    .line 70
    const/16 v7, 0xa

    .line 71
    .line 72
    if-eq v10, v7, :cond_3

    .line 73
    .line 74
    const/16 v7, 0xb

    .line 75
    .line 76
    if-eq v10, v7, :cond_3

    .line 77
    .line 78
    const/16 v7, 0xc

    .line 79
    .line 80
    if-ne v10, v7, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move v7, v4

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    :goto_1
    const/4 v7, 0x1

    .line 86
    :goto_2
    if-nez v7, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_4
    const-string v7, "id"

    .line 90
    .line 91
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_5

    .line 100
    .line 101
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 102
    .line 103
    .line 104
    move-result-wide v7

    .line 105
    new-instance v9, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    const-string v7, "_"

    .line 114
    .line 115
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    :cond_5
    move-object v9, v7

    .line 126
    const-string v7, "delayMs"

    .line 127
    .line 128
    const-wide/16 v12, 0x0

    .line 129
    .line 130
    invoke-virtual {v6, v7, v12, v13}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v14

    .line 134
    const-wide/16 v16, 0x0

    .line 135
    .line 136
    const-wide/32 v18, 0x927c0

    .line 137
    .line 138
    .line 139
    invoke-static/range {v14 .. v19}, Lr9/e0;->s(JJJ)J

    .line 140
    .line 141
    .line 142
    move-result-wide v12

    .line 143
    const-string v7, "randomDelay"

    .line 144
    .line 145
    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    new-instance v8, Lx8/s;

    .line 150
    .line 151
    invoke-direct/range {v8 .. v14}, Lx8/s;-><init>(Ljava/lang/String;ILjava/lang/String;JZ)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v8}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 155
    .line 156
    .line 157
    :cond_6
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 158
    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :goto_4
    new-instance v2, Lsf/f;

    .line 162
    .line 163
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    move-object v0, v2

    .line 167
    :goto_5
    nop

    .line 168
    instance-of v2, v0, Lsf/f;

    .line 169
    .line 170
    if-eqz v2, :cond_7

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_7
    move-object v1, v0

    .line 174
    :goto_6
    check-cast v1, Ljava/util/List;

    .line 175
    .line 176
    :cond_8
    :goto_7
    return-object v1
.end method

.method public static W(Lorg/json/JSONArray;)Ljava/util/Set;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ltf/v;->g:Ltf/v;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Luf/i;

    .line 7
    .line 8
    invoke-direct {v0}, Luf/i;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-lt v2, v1, :cond_1

    .line 17
    .line 18
    invoke-static {v0}, Lac/p;->h(Luf/i;)Luf/i;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-lez v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Luf/i;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0
.end method

.method public static X(Ljava/lang/String;)Ljava/util/List;
    .locals 47

    .line 1
    const-string v0, "text_first"

    .line 2
    .line 3
    const-string v1, "global"

    .line 4
    .line 5
    const-string v2, "ID\uff1a%userWxid%\n\u540d\u7247\uff1a%groupNickname%\n\u65f6\u95f4\uff1a%time%"

    .line 6
    .line 7
    invoke-static/range {p0 .. p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    goto/16 :goto_a

    .line 14
    .line 15
    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    .line 16
    .line 17
    move-object/from16 v4, p0

    .line 18
    .line 19
    invoke-direct {v3, v4}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    const/4 v6, 0x0

    .line 32
    move v7, v6

    .line 33
    :goto_0
    if-lt v7, v5, :cond_1

    .line 34
    .line 35
    return-object v4

    .line 36
    :cond_1
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    if-eqz v8, :cond_d

    .line 41
    .line 42
    const-string v9, "id"

    .line 43
    .line 44
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v9

    .line 48
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    if-eqz v10, :cond_2

    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    .line 56
    .line 57
    move-result-wide v9

    .line 58
    new-instance v11, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v9, "_"

    .line 67
    .line 68
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    :cond_2
    move-object v11, v9

    .line 79
    const-string v9, "name"

    .line 80
    .line 81
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-eqz v10, :cond_3

    .line 90
    .line 91
    add-int/lit8 v9, v7, 0x1

    .line 92
    .line 93
    new-instance v10, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v12, "\u6a21\u677f "

    .line 99
    .line 100
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    :cond_3
    move-object v12, v9

    .line 111
    const-string v9, "enabled"

    .line 112
    .line 113
    const/4 v10, 0x1

    .line 114
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    const-string v9, "joinEnabled"

    .line 119
    .line 120
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    const-string v9, "leftEnabled"

    .line 125
    .line 126
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 127
    .line 128
    .line 129
    move-result v15

    .line 130
    const-string v9, "promptType"

    .line 131
    .line 132
    const-string v10, "text"

    .line 133
    .line 134
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {v9}, Lr9/e0;->P(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v16

    .line 145
    const-string v9, "bothOrder"

    .line 146
    .line 147
    invoke-virtual {v8, v9, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const-string v10, "card_first"

    .line 155
    .line 156
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v9

    .line 160
    if-eqz v9, :cond_4

    .line 161
    .line 162
    move-object/from16 v17, v10

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    move-object/from16 v17, v0

    .line 166
    .line 167
    :goto_1
    const-string v9, "joinText"

    .line 168
    .line 169
    const-string v10, "[AtWx=%userWxid%]\n\u6b22\u8fce\u8fdb\u7fa4\n\u65f6\u95f4\uff1a%time%\n\u7fa4\u6635\u79f0\uff1a%groupName%\n\u8fdb\u7fa4\u8005\u5fae\u4fe1\u6635\u79f0\uff1a%userName%\n\u8fdb\u7fa4\u8005\u7fa4\u5185\u6635\u79f0\uff1a%groupNickname%\n\u8fdb\u7fa4\u8005ID\uff1a%userWxid%"

    .line 170
    .line 171
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v18

    .line 175
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    const-string v9, "leftText"

    .line 179
    .line 180
    const-string v10, "\u9000\u7fa4\u901a\u77e5\uff1a\n\u65f6\u95f4\uff1a%time%\n\u7fa4\u6635\u79f0\uff1a%groupName%\n\u9000\u7fa4\u8005\u5fae\u4fe1\u6635\u79f0\uff1a%userName%\n\u9000\u7fa4\u8005\u7fa4\u5185\u6635\u79f0\uff1a%groupNickname%\n\u9000\u7fa4\u8005ID\uff1a%userWxid%"

    .line 181
    .line 182
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v19

    .line 186
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    const-string v9, "joinCardTitle"

    .line 190
    .line 191
    const-string v10, "\u6b22\u8fce\uff1a%userName%"

    .line 192
    .line 193
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v20

    .line 197
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    const-string v9, "joinCardDesc"

    .line 201
    .line 202
    invoke-virtual {v8, v9, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v21

    .line 206
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    const-string v9, "leftCardTitle"

    .line 210
    .line 211
    const-string v10, "\u79bb\u7fa4\uff1a%userName%"

    .line 212
    .line 213
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v22

    .line 217
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    const-string v9, "leftCardDesc"

    .line 221
    .line 222
    invoke-virtual {v8, v9, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v23

    .line 226
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    const-string v9, "mediaMode"

    .line 230
    .line 231
    invoke-virtual {v8, v9, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {v9}, Lr9/e0;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v24

    .line 242
    const-string v9, "mediaOrder"

    .line 243
    .line 244
    const-string v10, "none"

    .line 245
    .line 246
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-static {v9}, Lr9/e0;->O(Ljava/lang/String;)Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v25

    .line 257
    const-string v9, "mediaSequence"

    .line 258
    .line 259
    const-string v10, "image,voice,emoji,video,file,favorite"

    .line 260
    .line 261
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v26

    .line 265
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    const-string v9, "joinImages"

    .line 269
    .line 270
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v27

    .line 274
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    const-string v9, "leftImages"

    .line 278
    .line 279
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v28

    .line 283
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    const-string v9, "joinVoices"

    .line 287
    .line 288
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v29

    .line 292
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    const-string v9, "leftVoices"

    .line 296
    .line 297
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v30

    .line 301
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    const-string v9, "joinEmojis"

    .line 305
    .line 306
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v31

    .line 310
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    const-string v9, "leftEmojis"

    .line 314
    .line 315
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v32

    .line 319
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    const-string v9, "joinVideos"

    .line 323
    .line 324
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v33

    .line 328
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    const-string v9, "leftVideos"

    .line 332
    .line 333
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v34

    .line 337
    invoke-virtual/range {v34 .. v34}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    const-string v9, "joinFiles"

    .line 341
    .line 342
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v35

    .line 346
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    const-string v9, "leftFiles"

    .line 350
    .line 351
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v36

    .line 355
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    const-string v9, "joinFavorites"

    .line 359
    .line 360
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v37

    .line 364
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    const-string v9, "leftFavorites"

    .line 368
    .line 369
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v38

    .line 373
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    const-string v9, "delayMode"

    .line 377
    .line 378
    invoke-virtual {v8, v9, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v9

    .line 382
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    const-string v10, "custom"

    .line 386
    .line 387
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v9

    .line 391
    if-eqz v9, :cond_5

    .line 392
    .line 393
    move-object/from16 v39, v10

    .line 394
    .line 395
    goto :goto_2

    .line 396
    :cond_5
    move-object/from16 v39, v1

    .line 397
    .line 398
    :goto_2
    const-string v9, "promptDelayMs"

    .line 399
    .line 400
    invoke-virtual {v8, v9, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    if-gez v9, :cond_6

    .line 405
    .line 406
    move/from16 v40, v6

    .line 407
    .line 408
    goto :goto_3

    .line 409
    :cond_6
    move/from16 v40, v9

    .line 410
    .line 411
    :goto_3
    const-string v9, "imageDelayMs"

    .line 412
    .line 413
    const/16 v10, 0x64

    .line 414
    .line 415
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    if-gez v9, :cond_7

    .line 420
    .line 421
    move/from16 v41, v6

    .line 422
    .line 423
    goto :goto_4

    .line 424
    :cond_7
    move/from16 v41, v9

    .line 425
    .line 426
    :goto_4
    const-string v9, "voiceDelayMs"

    .line 427
    .line 428
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 429
    .line 430
    .line 431
    move-result v9

    .line 432
    if-gez v9, :cond_8

    .line 433
    .line 434
    move/from16 v42, v6

    .line 435
    .line 436
    goto :goto_5

    .line 437
    :cond_8
    move/from16 v42, v9

    .line 438
    .line 439
    :goto_5
    const-string v9, "emojiDelayMs"

    .line 440
    .line 441
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    if-gez v9, :cond_9

    .line 446
    .line 447
    move/from16 v43, v6

    .line 448
    .line 449
    goto :goto_6

    .line 450
    :cond_9
    move/from16 v43, v9

    .line 451
    .line 452
    :goto_6
    const-string v9, "videoDelayMs"

    .line 453
    .line 454
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 455
    .line 456
    .line 457
    move-result v9

    .line 458
    if-gez v9, :cond_a

    .line 459
    .line 460
    move/from16 v44, v6

    .line 461
    .line 462
    goto :goto_7

    .line 463
    :cond_a
    move/from16 v44, v9

    .line 464
    .line 465
    :goto_7
    const-string v9, "fileDelayMs"

    .line 466
    .line 467
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 468
    .line 469
    .line 470
    move-result v9

    .line 471
    if-gez v9, :cond_b

    .line 472
    .line 473
    move/from16 v45, v6

    .line 474
    .line 475
    goto :goto_8

    .line 476
    :cond_b
    move/from16 v45, v9

    .line 477
    .line 478
    :goto_8
    const-string v9, "favoriteDelayMs"

    .line 479
    .line 480
    invoke-virtual {v8, v9, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 481
    .line 482
    .line 483
    move-result v8

    .line 484
    if-gez v8, :cond_c

    .line 485
    .line 486
    move/from16 v46, v6

    .line 487
    .line 488
    goto :goto_9

    .line 489
    :cond_c
    move/from16 v46, v8

    .line 490
    .line 491
    :goto_9
    new-instance v10, Lo9/q;

    .line 492
    .line 493
    invoke-direct/range {v10 .. v46}, Lo9/q;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIII)V

    .line 494
    .line 495
    .line 496
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 497
    .line 498
    .line 499
    :cond_d
    add-int/lit8 v7, v7, 0x1

    .line 500
    .line 501
    goto/16 :goto_0

    .line 502
    .line 503
    :catchall_0
    :goto_a
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 504
    .line 505
    return-object v0
.end method

.method public static Y(Ljava/lang/String;)Ljava/util/Set;
    .locals 3

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x6

    .line 6
    new-array v1, v0, [C

    .line 7
    .line 8
    fill-array-data v1, :array_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1, v0}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    move-object v2, v1

    .line 64
    check-cast v2, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-lez v2, :cond_3

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    const/4 v2, 0x0

    .line 75
    :goto_2
    if-eqz v2, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_4
    invoke-static {p0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    nop

    .line 87
    :array_0
    .array-data 2
        0x2cs
        -0xf4s
        0x3bs
        -0xe5s
        0xas
        0xds
    .end array-data
.end method

.method public static final Z(Lh/Hchat/hooks/api/model/WeChatContact;Z)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    return-object p1

    .line 20
    :cond_1
    iget-object p1, p0, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-lez v1, :cond_2

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-lez v1, :cond_2

    .line 51
    .line 52
    invoke-static {p1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_2

    .line 57
    .line 58
    const-string p0, "("

    .line 59
    .line 60
    const-string v1, ")"

    .line 61
    .line 62
    invoke-static {p1, p0, v0, v1}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-lez v1, :cond_3

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-lez p1, :cond_4

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_4
    iget-object p0, p0, Lh/Hchat/hooks/api/model/WeChatContact;->wxId:Ljava/lang/String;

    .line 82
    .line 83
    return-object p0
.end method

.method public static c0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/Serializable;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {p0, p1}, Lr9/e0;->h0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    sget-object p1, Log/a;->a:Ljava/nio/charset/Charset;

    .line 18
    .line 19
    invoke-static {p0, p1}, Ldg/l;->h0(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    const-string p0, "\u5de5\u5177\u7ed3\u679c\u5df2\u4e0d\u5b58\u5728"

    .line 25
    .line 26
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    new-instance p1, Lsf/f;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method

.method public static d0(Landroid/content/Context;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "handle"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lbc/e;->l(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string p0, "\u7ed3\u679c handle \u4e3a\u7a7a"

    .line 16
    .line 17
    invoke-static {p0}, Lr9/e0;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {p0, v0}, Lr9/e0;->c0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/Serializable;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    check-cast p0, Ljava/lang/String;

    .line 33
    .line 34
    const-string v1, "offset"

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-static {v1, v2, v3}, Lr9/e0;->r(III)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const-string v2, "max_chars"

    .line 50
    .line 51
    const/16 v3, 0x5dc0

    .line 52
    .line 53
    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    const/16 v2, 0x3e8

    .line 58
    .line 59
    const v3, 0xbb80

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v2, v3}, Lr9/e0;->r(III)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v1, p1, v0, p0, v2}, Lr9/e0;->Q(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    const-string p0, "\u5de5\u5177\u7ed3\u679c\u4e0d\u5b58\u5728"

    .line 83
    .line 84
    :goto_0
    invoke-static {p0}, Lr9/e0;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public static final e(Ly0/o;Li0/p1;Ls0/d;Li0/h0;I)V
    .locals 11

    .line 1
    const v1, -0x2a95dc91

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p4, 0x6

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p3, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    const/4 v3, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v3, 0x2

    .line 20
    :goto_0
    or-int/2addr v3, p4

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v3, p4

    .line 23
    :goto_1
    and-int/lit8 v5, p4, 0x30

    .line 24
    .line 25
    if-nez v5, :cond_3

    .line 26
    .line 27
    invoke-virtual {p3, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_2

    .line 32
    .line 33
    const/16 v5, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v5, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v3, v5

    .line 39
    :cond_3
    and-int/lit16 v5, p4, 0x180

    .line 40
    .line 41
    sget-object v6, Lb0/o;->a:Ls0/d;

    .line 42
    .line 43
    if-nez v5, :cond_5

    .line 44
    .line 45
    invoke-virtual {p3, v6}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    if-eqz v5, :cond_4

    .line 50
    .line 51
    const/16 v5, 0x100

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    const/16 v5, 0x80

    .line 55
    .line 56
    :goto_3
    or-int/2addr v3, v5

    .line 57
    :cond_5
    and-int/lit16 v5, p4, 0xc00

    .line 58
    .line 59
    if-nez v5, :cond_7

    .line 60
    .line 61
    invoke-virtual {p3, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_6

    .line 66
    .line 67
    const/16 v5, 0x800

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_6
    const/16 v5, 0x400

    .line 71
    .line 72
    :goto_4
    or-int/2addr v3, v5

    .line 73
    :cond_7
    and-int/lit16 v5, v3, 0x493

    .line 74
    .line 75
    const/16 v7, 0x492

    .line 76
    .line 77
    if-eq v5, v7, :cond_8

    .line 78
    .line 79
    const/4 v5, 0x1

    .line 80
    goto :goto_5

    .line 81
    :cond_8
    const/4 v5, 0x0

    .line 82
    :goto_5
    and-int/lit8 v7, v3, 0x1

    .line 83
    .line 84
    invoke-virtual {p3, v7, v5}, Li0/h0;->S(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_a

    .line 89
    .line 90
    invoke-virtual {p3}, Li0/h0;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    sget-object v7, Li0/l;->a:Li0/e;

    .line 95
    .line 96
    if-ne v5, v7, :cond_9

    .line 97
    .line 98
    sget-object v5, Li0/e;->j:Li0/e;

    .line 99
    .line 100
    new-instance v7, Li0/j1;

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    invoke-direct {v7, v9, v5}, Li0/j1;-><init>(Ljava/lang/Object;Li0/e;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v5, v7

    .line 110
    :cond_9
    move-object v7, v5

    .line 111
    check-cast v7, Li0/a1;

    .line 112
    .line 113
    shr-int/lit8 v3, v3, 0x6

    .line 114
    .line 115
    and-int/lit8 v3, v3, 0xe

    .line 116
    .line 117
    invoke-static {v6, p3, v3}, Lr9/e0;->j(Ls0/d;Li0/h0;I)Ld0/c;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-virtual {p1, v9}, Li0/p1;->a(Ljava/lang/Object;)Li0/q1;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    new-instance v5, Lc9/q0;

    .line 126
    .line 127
    const/4 v10, 0x1

    .line 128
    move-object v6, p0

    .line 129
    move-object v8, p2

    .line 130
    invoke-direct/range {v5 .. v10}, Lc9/q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    const v1, 0x1059082f

    .line 134
    .line 135
    .line 136
    invoke-static {v1, v5, p3}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    const/16 v5, 0x38

    .line 141
    .line 142
    invoke-static {v3, v1, p3, v5}, Li0/r;->a(Li0/q1;Ls0/d;Li0/h0;I)V

    .line 143
    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_a
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 147
    .line 148
    .line 149
    :goto_6
    invoke-virtual {p3}, Li0/h0;->t()Li0/r1;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    if-eqz v6, :cond_b

    .line 154
    .line 155
    new-instance v0, Lb0/r;

    .line 156
    .line 157
    const/4 v5, 0x2

    .line 158
    move-object v1, p0

    .line 159
    move-object v2, p1

    .line 160
    move-object v3, p2

    .line 161
    move v4, p4

    .line 162
    invoke-direct/range {v0 .. v5}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 163
    .line 164
    .line 165
    iput-object v0, v6, Li0/r1;->d:Lfg/p;

    .line 166
    .line 167
    :cond_b
    return-void
.end method

.method public static final e0(Ljava/io/Reader;)Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/io/StringWriter;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x2000

    .line 7
    .line 8
    new-array v1, v1, [C

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    :goto_0
    if-ltz v2, :cond_0

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/io/Reader;->read([C)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public static final f(Ljava/util/ArrayList;ILjava/lang/String;Ly0/o;Lsh/a;Ljava/lang/String;Lsh/a;Lsh/t;Lp/x0;ZLfg/l;Li0/h0;II)V
    .locals 35

    .line 1
    move/from16 v10, p9

    .line 2
    .line 3
    move-object/from16 v8, p11

    .line 4
    .line 5
    move/from16 v12, p12

    .line 6
    .line 7
    move/from16 v13, p13

    .line 8
    .line 9
    const v0, -0x36e16a70    # -649561.0f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v8, v0}, Li0/h0;->b0(I)Li0/h0;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v12, 0x6

    .line 16
    .line 17
    move-object/from16 v1, p0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v8, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x2

    .line 30
    :goto_0
    or-int/2addr v0, v12

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v0, v12

    .line 33
    :goto_1
    and-int/lit8 v2, v12, 0x30

    .line 34
    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    move/from16 v2, p1

    .line 38
    .line 39
    invoke-virtual {v8, v2}, Li0/h0;->d(I)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    const/16 v3, 0x20

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v3, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v3

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move/from16 v2, p1

    .line 53
    .line 54
    :goto_3
    and-int/lit16 v3, v12, 0x180

    .line 55
    .line 56
    const/16 v4, 0x100

    .line 57
    .line 58
    const/16 v5, 0x80

    .line 59
    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    move-object/from16 v3, p2

    .line 63
    .line 64
    invoke-virtual {v8, v3}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_4

    .line 69
    .line 70
    move v6, v4

    .line 71
    goto :goto_4

    .line 72
    :cond_4
    move v6, v5

    .line 73
    :goto_4
    or-int/2addr v0, v6

    .line 74
    goto :goto_5

    .line 75
    :cond_5
    move-object/from16 v3, p2

    .line 76
    .line 77
    :goto_5
    or-int/lit16 v6, v0, 0xc00

    .line 78
    .line 79
    and-int/lit16 v7, v12, 0x6000

    .line 80
    .line 81
    if-nez v7, :cond_6

    .line 82
    .line 83
    or-int/lit16 v6, v0, 0x2c00

    .line 84
    .line 85
    :cond_6
    const/high16 v0, 0x30000

    .line 86
    .line 87
    and-int/2addr v0, v12

    .line 88
    if-nez v0, :cond_8

    .line 89
    .line 90
    move-object/from16 v0, p5

    .line 91
    .line 92
    invoke-virtual {v8, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-eqz v7, :cond_7

    .line 97
    .line 98
    const/high16 v7, 0x20000

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_7
    const/high16 v7, 0x10000

    .line 102
    .line 103
    :goto_6
    or-int/2addr v6, v7

    .line 104
    goto :goto_7

    .line 105
    :cond_8
    move-object/from16 v0, p5

    .line 106
    .line 107
    :goto_7
    const/high16 v7, 0x180000

    .line 108
    .line 109
    and-int v9, v12, v7

    .line 110
    .line 111
    if-nez v9, :cond_9

    .line 112
    .line 113
    const/high16 v9, 0x80000

    .line 114
    .line 115
    or-int/2addr v6, v9

    .line 116
    :cond_9
    const/high16 v9, 0xc00000

    .line 117
    .line 118
    and-int/2addr v9, v12

    .line 119
    if-nez v9, :cond_a

    .line 120
    .line 121
    const/high16 v9, 0x400000

    .line 122
    .line 123
    or-int/2addr v6, v9

    .line 124
    :cond_a
    const/high16 v9, 0x36000000

    .line 125
    .line 126
    or-int/2addr v6, v9

    .line 127
    or-int/lit8 v9, v13, 0x36

    .line 128
    .line 129
    and-int/lit16 v11, v13, 0x180

    .line 130
    .line 131
    if-nez v11, :cond_c

    .line 132
    .line 133
    invoke-virtual {v8, v10}, Li0/h0;->g(Z)Z

    .line 134
    .line 135
    .line 136
    move-result v11

    .line 137
    if-eqz v11, :cond_b

    .line 138
    .line 139
    goto :goto_8

    .line 140
    :cond_b
    move v4, v5

    .line 141
    :goto_8
    or-int/2addr v9, v4

    .line 142
    :cond_c
    and-int/lit16 v4, v13, 0xc00

    .line 143
    .line 144
    const/4 v5, 0x1

    .line 145
    if-nez v4, :cond_e

    .line 146
    .line 147
    invoke-virtual {v8, v5}, Li0/h0;->g(Z)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_d

    .line 152
    .line 153
    const/16 v4, 0x800

    .line 154
    .line 155
    goto :goto_9

    .line 156
    :cond_d
    const/16 v4, 0x400

    .line 157
    .line 158
    :goto_9
    or-int/2addr v9, v4

    .line 159
    :cond_e
    and-int/lit16 v4, v13, 0x6000

    .line 160
    .line 161
    move-object/from16 v11, p10

    .line 162
    .line 163
    if-nez v4, :cond_10

    .line 164
    .line 165
    invoke-virtual {v8, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_f

    .line 170
    .line 171
    const/16 v4, 0x4000

    .line 172
    .line 173
    goto :goto_a

    .line 174
    :cond_f
    const/16 v4, 0x2000

    .line 175
    .line 176
    :goto_a
    or-int/2addr v9, v4

    .line 177
    :cond_10
    const v4, 0x12492493

    .line 178
    .line 179
    .line 180
    and-int/2addr v4, v6

    .line 181
    const v14, 0x12492492

    .line 182
    .line 183
    .line 184
    if-ne v4, v14, :cond_12

    .line 185
    .line 186
    and-int/lit16 v4, v9, 0x2493

    .line 187
    .line 188
    const/16 v14, 0x2492

    .line 189
    .line 190
    if-eq v4, v14, :cond_11

    .line 191
    .line 192
    goto :goto_b

    .line 193
    :cond_11
    const/4 v4, 0x0

    .line 194
    goto :goto_c

    .line 195
    :cond_12
    :goto_b
    move v4, v5

    .line 196
    :goto_c
    and-int/lit8 v14, v6, 0x1

    .line 197
    .line 198
    invoke-virtual {v8, v14, v4}, Li0/h0;->S(IZ)Z

    .line 199
    .line 200
    .line 201
    move-result v4

    .line 202
    if-eqz v4, :cond_22

    .line 203
    .line 204
    invoke-virtual {v8}, Li0/h0;->X()V

    .line 205
    .line 206
    .line 207
    and-int/lit8 v4, v12, 0x1

    .line 208
    .line 209
    const v14, -0x1f8e001

    .line 210
    .line 211
    .line 212
    sget-object v5, Li0/l;->a:Li0/e;

    .line 213
    .line 214
    if-eqz v4, :cond_14

    .line 215
    .line 216
    invoke-virtual {v8}, Li0/h0;->B()Z

    .line 217
    .line 218
    .line 219
    move-result v4

    .line 220
    if-eqz v4, :cond_13

    .line 221
    .line 222
    goto :goto_d

    .line 223
    :cond_13
    invoke-virtual {v8}, Li0/h0;->V()V

    .line 224
    .line 225
    .line 226
    and-int v4, v6, v14

    .line 227
    .line 228
    move-object/from16 v0, p3

    .line 229
    .line 230
    move-object/from16 v1, p4

    .line 231
    .line 232
    move-object/from16 v2, p6

    .line 233
    .line 234
    move-object/from16 v21, p7

    .line 235
    .line 236
    move-object/from16 v3, p8

    .line 237
    .line 238
    move/from16 v25, v7

    .line 239
    .line 240
    goto/16 :goto_e

    .line 241
    .line 242
    :cond_14
    :goto_d
    sget-object v4, Lsh/b;->a:Lp/z0;

    .line 243
    .line 244
    sget-object v4, Lbi/d;->a:Li0/m2;

    .line 245
    .line 246
    invoke-virtual {v8, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v17

    .line 250
    check-cast v17, Lbi/b;

    .line 251
    .line 252
    move/from16 v19, v14

    .line 253
    .line 254
    invoke-virtual/range {v17 .. v17}, Lbi/b;->d()J

    .line 255
    .line 256
    .line 257
    move-result-wide v14

    .line 258
    invoke-virtual {v8, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v17

    .line 262
    check-cast v17, Lbi/b;

    .line 263
    .line 264
    invoke-virtual/range {v17 .. v17}, Lbi/b;->c()J

    .line 265
    .line 266
    .line 267
    move-result-wide v0

    .line 268
    invoke-virtual {v8, v14, v15}, Li0/h0;->e(J)Z

    .line 269
    .line 270
    .line 271
    move-result v17

    .line 272
    invoke-virtual {v8, v0, v1}, Li0/h0;->e(J)Z

    .line 273
    .line 274
    .line 275
    move-result v20

    .line 276
    or-int v17, v17, v20

    .line 277
    .line 278
    move/from16 v25, v7

    .line 279
    .line 280
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v7

    .line 284
    if-nez v17, :cond_15

    .line 285
    .line 286
    if-ne v7, v5, :cond_16

    .line 287
    .line 288
    :cond_15
    new-instance v7, Lsh/a;

    .line 289
    .line 290
    invoke-direct {v7, v14, v15, v0, v1}, Lsh/a;-><init>(JJ)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v8, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_16
    move-object v0, v7

    .line 297
    check-cast v0, Lsh/a;

    .line 298
    .line 299
    invoke-virtual {v8, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Lbi/b;

    .line 304
    .line 305
    invoke-virtual {v1}, Lbi/b;->h()J

    .line 306
    .line 307
    .line 308
    move-result-wide v14

    .line 309
    invoke-virtual {v8, v4}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    check-cast v1, Lbi/b;

    .line 314
    .line 315
    move-object/from16 p3, v0

    .line 316
    .line 317
    invoke-virtual {v1}, Lbi/b;->c()J

    .line 318
    .line 319
    .line 320
    move-result-wide v0

    .line 321
    invoke-virtual {v8, v14, v15}, Li0/h0;->e(J)Z

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    invoke-virtual {v8, v0, v1}, Li0/h0;->e(J)Z

    .line 326
    .line 327
    .line 328
    move-result v7

    .line 329
    or-int/2addr v4, v7

    .line 330
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    if-nez v4, :cond_17

    .line 335
    .line 336
    if-ne v7, v5, :cond_18

    .line 337
    .line 338
    :cond_17
    new-instance v7, Lsh/a;

    .line 339
    .line 340
    invoke-direct {v7, v14, v15, v0, v1}, Lsh/a;-><init>(JJ)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v8, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    :cond_18
    move-object v0, v7

    .line 347
    check-cast v0, Lsh/a;

    .line 348
    .line 349
    sget-object v1, Lbi/d;->a:Li0/m2;

    .line 350
    .line 351
    invoke-virtual {v8, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    check-cast v4, Lbi/b;

    .line 356
    .line 357
    iget-object v4, v4, Lbi/b;->P:Li0/j1;

    .line 358
    .line 359
    invoke-virtual {v4}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    check-cast v4, Lf1/w;

    .line 364
    .line 365
    iget-wide v14, v4, Lf1/w;->a:J

    .line 366
    .line 367
    invoke-virtual {v8, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    check-cast v4, Lbi/b;

    .line 372
    .line 373
    invoke-virtual {v4}, Lbi/b;->m()J

    .line 374
    .line 375
    .line 376
    move-result-wide v2

    .line 377
    invoke-virtual {v8, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    check-cast v4, Lbi/b;

    .line 382
    .line 383
    move/from16 v17, v6

    .line 384
    .line 385
    invoke-virtual {v4}, Lbi/b;->j()J

    .line 386
    .line 387
    .line 388
    move-result-wide v6

    .line 389
    invoke-virtual {v8, v1}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    check-cast v1, Lbi/b;

    .line 394
    .line 395
    move-object/from16 p4, v0

    .line 396
    .line 397
    invoke-virtual {v1}, Lbi/b;->m()J

    .line 398
    .line 399
    .line 400
    move-result-wide v0

    .line 401
    invoke-virtual {v8, v14, v15}, Li0/h0;->e(J)Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    invoke-virtual {v8, v2, v3}, Li0/h0;->e(J)Z

    .line 406
    .line 407
    .line 408
    move-result v20

    .line 409
    or-int v4, v4, v20

    .line 410
    .line 411
    invoke-virtual {v8, v6, v7}, Li0/h0;->e(J)Z

    .line 412
    .line 413
    .line 414
    move-result v20

    .line 415
    or-int v4, v4, v20

    .line 416
    .line 417
    invoke-virtual {v8, v0, v1}, Li0/h0;->e(J)Z

    .line 418
    .line 419
    .line 420
    move-result v20

    .line 421
    or-int v4, v4, v20

    .line 422
    .line 423
    move-wide/from16 v33, v0

    .line 424
    .line 425
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-nez v4, :cond_19

    .line 430
    .line 431
    if-ne v0, v5, :cond_1a

    .line 432
    .line 433
    :cond_19
    new-instance v26, Lsh/t;

    .line 434
    .line 435
    move-wide/from16 v29, v2

    .line 436
    .line 437
    move-wide/from16 v31, v6

    .line 438
    .line 439
    move-wide/from16 v27, v14

    .line 440
    .line 441
    invoke-direct/range {v26 .. v34}, Lsh/t;-><init>(JJJJ)V

    .line 442
    .line 443
    .line 444
    move-object/from16 v0, v26

    .line 445
    .line 446
    invoke-virtual {v8, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    :cond_1a
    check-cast v0, Lsh/t;

    .line 450
    .line 451
    and-int v4, v17, v19

    .line 452
    .line 453
    sget-object v1, Lsh/b;->a:Lp/z0;

    .line 454
    .line 455
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 456
    .line 457
    move-object/from16 v21, v0

    .line 458
    .line 459
    move-object v3, v1

    .line 460
    move-object v0, v2

    .line 461
    move-object/from16 v1, p3

    .line 462
    .line 463
    move-object/from16 v2, p4

    .line 464
    .line 465
    :goto_e
    invoke-virtual {v8}, Li0/h0;->q()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v6

    .line 472
    if-ne v6, v5, :cond_1b

    .line 473
    .line 474
    new-instance v6, Ln/k;

    .line 475
    .line 476
    invoke-direct {v6}, Ln/k;-><init>()V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v8, v6}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    :cond_1b
    check-cast v6, Ln/k;

    .line 483
    .line 484
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v7

    .line 488
    if-ne v7, v5, :cond_1c

    .line 489
    .line 490
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 491
    .line 492
    invoke-static {v7}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 493
    .line 494
    .line 495
    move-result-object v7

    .line 496
    invoke-virtual {v8, v7}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    :cond_1c
    check-cast v7, Li0/a1;

    .line 500
    .line 501
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v14

    .line 505
    if-ne v14, v5, :cond_1d

    .line 506
    .line 507
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 508
    .line 509
    invoke-static {v14}, Li0/r;->u(Ljava/lang/Object;)Li0/j1;

    .line 510
    .line 511
    .line 512
    move-result-object v14

    .line 513
    invoke-virtual {v8, v14}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 514
    .line 515
    .line 516
    :cond_1d
    check-cast v14, Li0/a1;

    .line 517
    .line 518
    sget-object v15, Ly1/h1;->l:Li0/m2;

    .line 519
    .line 520
    invoke-virtual {v8, v15}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v15

    .line 524
    check-cast v15, Ln1/a;

    .line 525
    .line 526
    move-object/from16 p3, v0

    .line 527
    .line 528
    invoke-static {v15, v8}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 533
    .line 534
    .line 535
    move-result v17

    .line 536
    move-object/from16 v22, v15

    .line 537
    .line 538
    xor-int/lit8 v15, v17, 0x1

    .line 539
    .line 540
    if-eqz v10, :cond_1e

    .line 541
    .line 542
    if-nez v17, :cond_1e

    .line 543
    .line 544
    move-object/from16 p4, v1

    .line 545
    .line 546
    const/4 v1, 0x1

    .line 547
    goto :goto_f

    .line 548
    :cond_1e
    move-object/from16 p4, v1

    .line 549
    .line 550
    const/4 v1, 0x0

    .line 551
    :goto_f
    if-eqz v1, :cond_1f

    .line 552
    .line 553
    move-object/from16 p6, v2

    .line 554
    .line 555
    const v2, 0x7e301514

    .line 556
    .line 557
    .line 558
    invoke-virtual {v8, v2}, Li0/h0;->a0(I)V

    .line 559
    .line 560
    .line 561
    sget-object v2, Lbi/d;->a:Li0/m2;

    .line 562
    .line 563
    invoke-virtual {v8, v2}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v2

    .line 567
    check-cast v2, Lbi/b;

    .line 568
    .line 569
    iget-object v2, v2, Lbi/b;->M:Li0/j1;

    .line 570
    .line 571
    invoke-virtual {v2}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    check-cast v2, Lf1/w;

    .line 576
    .line 577
    move-object/from16 p7, v3

    .line 578
    .line 579
    iget-wide v2, v2, Lf1/w;->a:J

    .line 580
    .line 581
    move-wide/from16 v16, v2

    .line 582
    .line 583
    const/4 v2, 0x0

    .line 584
    invoke-virtual {v8, v2}, Li0/h0;->p(Z)V

    .line 585
    .line 586
    .line 587
    :goto_10
    move-wide/from16 v18, v16

    .line 588
    .line 589
    goto :goto_11

    .line 590
    :cond_1f
    move-object/from16 p6, v2

    .line 591
    .line 592
    move-object/from16 p7, v3

    .line 593
    .line 594
    const/4 v2, 0x0

    .line 595
    const v3, 0x7e311cf1

    .line 596
    .line 597
    .line 598
    invoke-virtual {v8, v3}, Li0/h0;->a0(I)V

    .line 599
    .line 600
    .line 601
    sget-object v3, Lbi/d;->a:Li0/m2;

    .line 602
    .line 603
    invoke-virtual {v8, v3}, Li0/h0;->j(Li0/p1;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    check-cast v3, Lbi/b;

    .line 608
    .line 609
    invoke-virtual {v3}, Lbi/b;->c()J

    .line 610
    .line 611
    .line 612
    move-result-wide v16

    .line 613
    invoke-virtual {v8, v2}, Li0/h0;->p(Z)V

    .line 614
    .line 615
    .line 616
    goto :goto_10

    .line 617
    :goto_11
    invoke-virtual {v8, v1}, Li0/h0;->g(Z)Z

    .line 618
    .line 619
    .line 620
    move-result v2

    .line 621
    invoke-virtual {v8}, Li0/h0;->P()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    if-nez v2, :cond_20

    .line 626
    .line 627
    if-ne v3, v5, :cond_21

    .line 628
    .line 629
    :cond_20
    new-instance v3, Lwb/gf;

    .line 630
    .line 631
    invoke-direct {v3, v1, v7, v14, v0}, Lwb/gf;-><init>(ZLi0/a1;Li0/a1;Li0/a1;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v8, v3}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 635
    .line 636
    .line 637
    :cond_21
    check-cast v3, Lfg/a;

    .line 638
    .line 639
    invoke-interface {v14}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    check-cast v0, Ljava/lang/Boolean;

    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 646
    .line 647
    .line 648
    move-result v0

    .line 649
    move-object/from16 v24, v14

    .line 650
    .line 651
    new-instance v14, Lxh/s;

    .line 652
    .line 653
    move-object/from16 v16, p0

    .line 654
    .line 655
    move/from16 v17, p1

    .line 656
    .line 657
    move-object/from16 v20, v7

    .line 658
    .line 659
    move-object/from16 v23, v11

    .line 660
    .line 661
    invoke-direct/range {v14 .. v24}, Lxh/s;-><init>(ZLjava/util/ArrayList;IJLi0/a1;Lsh/t;Ln1/a;Lfg/l;Li0/a1;)V

    .line 662
    .line 663
    .line 664
    const v2, -0x3e4d785a

    .line 665
    .line 666
    .line 667
    invoke-static {v2, v14, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    shr-int/lit8 v5, v4, 0x9

    .line 672
    .line 673
    and-int/lit8 v7, v5, 0xe

    .line 674
    .line 675
    or-int v7, v7, v25

    .line 676
    .line 677
    shr-int/lit8 v11, v4, 0x3

    .line 678
    .line 679
    and-int/lit8 v11, v11, 0x70

    .line 680
    .line 681
    or-int/2addr v7, v11

    .line 682
    shr-int/lit8 v4, v4, 0x6

    .line 683
    .line 684
    and-int/lit16 v11, v4, 0x1c00

    .line 685
    .line 686
    or-int/2addr v7, v11

    .line 687
    const/high16 v11, 0x70000

    .line 688
    .line 689
    and-int/2addr v5, v11

    .line 690
    or-int/2addr v5, v7

    .line 691
    const/high16 v7, 0x1c00000

    .line 692
    .line 693
    and-int/2addr v4, v7

    .line 694
    or-int/2addr v4, v5

    .line 695
    shl-int/lit8 v5, v9, 0x18

    .line 696
    .line 697
    const/high16 v7, 0xe000000

    .line 698
    .line 699
    and-int/2addr v5, v7

    .line 700
    or-int/2addr v4, v5

    .line 701
    new-instance v14, Lsh/m;

    .line 702
    .line 703
    move-object/from16 v15, p2

    .line 704
    .line 705
    move-object/from16 v16, p4

    .line 706
    .line 707
    move-object/from16 v18, p5

    .line 708
    .line 709
    move-object/from16 v19, p6

    .line 710
    .line 711
    move/from16 v17, v1

    .line 712
    .line 713
    invoke-direct/range {v14 .. v19}, Lsh/m;-><init>(Ljava/lang/String;Lsh/a;ZLjava/lang/String;Lsh/a;)V

    .line 714
    .line 715
    .line 716
    move/from16 v5, v17

    .line 717
    .line 718
    const v1, -0x28b0ecf5

    .line 719
    .line 720
    .line 721
    invoke-static {v1, v14, v8}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 722
    .line 723
    .line 724
    move-result-object v7

    .line 725
    and-int/lit8 v1, v4, 0xe

    .line 726
    .line 727
    const/high16 v9, 0x30000000

    .line 728
    .line 729
    or-int/2addr v1, v9

    .line 730
    shr-int/lit8 v4, v4, 0xc

    .line 731
    .line 732
    and-int/lit8 v9, v4, 0x70

    .line 733
    .line 734
    or-int/2addr v1, v9

    .line 735
    or-int/lit16 v1, v1, 0x180

    .line 736
    .line 737
    and-int/lit16 v9, v4, 0x1c00

    .line 738
    .line 739
    or-int/2addr v1, v9

    .line 740
    const v9, 0xe000

    .line 741
    .line 742
    .line 743
    and-int/2addr v4, v9

    .line 744
    or-int/2addr v1, v4

    .line 745
    const/high16 v4, 0x6000000

    .line 746
    .line 747
    or-int v9, v1, v4

    .line 748
    .line 749
    move v4, v0

    .line 750
    move-object v1, v2

    .line 751
    move-object/from16 v0, p3

    .line 752
    .line 753
    move-object/from16 v2, p7

    .line 754
    .line 755
    invoke-static/range {v0 .. v9}, Lsh/s;->b(Ly0/o;Lfg/q;Lp/x0;Lfg/a;ZZLn/k;Ls0/d;Li0/h0;I)V

    .line 756
    .line 757
    .line 758
    move-object v4, v0

    .line 759
    move-object v9, v2

    .line 760
    move-object/from16 v5, v16

    .line 761
    .line 762
    move-object/from16 v7, v19

    .line 763
    .line 764
    move-object/from16 v8, v21

    .line 765
    .line 766
    goto :goto_12

    .line 767
    :cond_22
    invoke-virtual/range {p11 .. p11}, Li0/h0;->V()V

    .line 768
    .line 769
    .line 770
    move-object/from16 v4, p3

    .line 771
    .line 772
    move-object/from16 v5, p4

    .line 773
    .line 774
    move-object/from16 v7, p6

    .line 775
    .line 776
    move-object/from16 v8, p7

    .line 777
    .line 778
    move-object/from16 v9, p8

    .line 779
    .line 780
    :goto_12
    invoke-virtual/range {p11 .. p11}, Li0/h0;->t()Li0/r1;

    .line 781
    .line 782
    .line 783
    move-result-object v14

    .line 784
    if-eqz v14, :cond_23

    .line 785
    .line 786
    new-instance v0, Lxh/t;

    .line 787
    .line 788
    move-object/from16 v1, p0

    .line 789
    .line 790
    move/from16 v2, p1

    .line 791
    .line 792
    move-object/from16 v3, p2

    .line 793
    .line 794
    move-object/from16 v6, p5

    .line 795
    .line 796
    move-object/from16 v11, p10

    .line 797
    .line 798
    invoke-direct/range {v0 .. v13}, Lxh/t;-><init>(Ljava/util/ArrayList;ILjava/lang/String;Ly0/o;Lsh/a;Ljava/lang/String;Lsh/a;Lsh/t;Lp/x0;ZLfg/l;II)V

    .line 799
    .line 800
    .line 801
    iput-object v0, v14, Li0/r1;->d:Lfg/p;

    .line 802
    .line 803
    :cond_23
    return-void
.end method

.method public static f0(Landroid/content/Context;Ljava/util/List;)Ljava/lang/String;
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v1, Lorg/json/JSONArray;

    .line 5
    .line 6
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v2, Ljava/util/HashSet;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    move-object v5, v4

    .line 34
    check-cast v5, Lfb/c;

    .line 35
    .line 36
    iget-object v5, v5, Lfb/c;->j:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-nez v5, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v5, 0x0

    .line 57
    if-eqz v0, :cond_17

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lfb/c;

    .line 64
    .line 65
    iget-object v0, v0, Lfb/c;->j:Ljava/util/List;

    .line 66
    .line 67
    new-instance v7, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v8

    .line 80
    if-eqz v8, :cond_5

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    move-object v9, v8

    .line 87
    check-cast v9, Lfb/q1;

    .line 88
    .line 89
    iget-object v10, v9, Lfb/q1;->g:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v11, v9, Lfb/q1;->l:Ljava/lang/String;

    .line 92
    .line 93
    const-string v12, "running"

    .line 94
    .line 95
    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    if-nez v12, :cond_4

    .line 100
    .line 101
    const-string v12, "queued"

    .line 102
    .line 103
    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v12

    .line 107
    if-nez v12, :cond_4

    .line 108
    .line 109
    const-string v12, "interrupted"

    .line 110
    .line 111
    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v10

    .line 115
    if-nez v10, :cond_4

    .line 116
    .line 117
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-nez v10, :cond_4

    .line 122
    .line 123
    iget-object v9, v9, Lfb/q1;->m:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-nez v9, :cond_4

    .line 130
    .line 131
    invoke-virtual {v2, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-eqz v9, :cond_4

    .line 136
    .line 137
    const/4 v9, 0x1

    .line 138
    goto :goto_3

    .line 139
    :cond_4
    move v9, v5

    .line 140
    :goto_3
    if-eqz v9, :cond_3

    .line 141
    .line 142
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    move-object/from16 v12, p0

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_6
    const-string v8, "role"

    .line 156
    .line 157
    const-string v9, "assistant"

    .line 158
    .line 159
    invoke-static {v8, v9}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    new-instance v10, Lorg/json/JSONArray;

    .line 164
    .line 165
    invoke-direct {v10}, Lorg/json/JSONArray;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v12

    .line 176
    if-eqz v12, :cond_9

    .line 177
    .line 178
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    check-cast v12, Lfb/q1;

    .line 183
    .line 184
    new-instance v13, Lorg/json/JSONObject;

    .line 185
    .line 186
    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    .line 187
    .line 188
    .line 189
    iget-object v14, v12, Lfb/q1;->l:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v15, v12, Lfb/q1;->n:Ljava/lang/String;

    .line 192
    .line 193
    const-string v4, "id"

    .line 194
    .line 195
    invoke-virtual {v13, v4, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 196
    .line 197
    .line 198
    const-string v4, "type"

    .line 199
    .line 200
    const-string v14, "function"

    .line 201
    .line 202
    invoke-virtual {v13, v4, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 203
    .line 204
    .line 205
    invoke-static {v15}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v4

    .line 209
    if-nez v4, :cond_7

    .line 210
    .line 211
    const-string v4, "provider_metadata"

    .line 212
    .line 213
    invoke-virtual {v13, v4, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 214
    .line 215
    .line 216
    :cond_7
    new-instance v4, Lorg/json/JSONObject;

    .line 217
    .line 218
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 219
    .line 220
    .line 221
    const-string v15, "name"

    .line 222
    .line 223
    const/16 v16, 0x1

    .line 224
    .line 225
    iget-object v6, v12, Lfb/q1;->m:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v4, v15, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 228
    .line 229
    .line 230
    iget-object v6, v12, Lfb/q1;->d:Ljava/lang/String;

    .line 231
    .line 232
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 233
    .line 234
    .line 235
    move-result v12

    .line 236
    if-eqz v12, :cond_8

    .line 237
    .line 238
    const-string v6, "{}"

    .line 239
    .line 240
    :cond_8
    const-string v12, "arguments"

    .line 241
    .line 242
    invoke-virtual {v4, v12, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v13, v14, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v10, v13}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 249
    .line 250
    .line 251
    goto :goto_4

    .line 252
    :cond_9
    const/16 v16, 0x1

    .line 253
    .line 254
    const-string v4, "tool_calls"

    .line 255
    .line 256
    invoke-virtual {v0, v4, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_12

    .line 271
    .line 272
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    move-object v7, v0

    .line 277
    check-cast v7, Lfb/q1;

    .line 278
    .line 279
    iget-object v0, v7, Lfb/q1;->p:Ljava/lang/String;

    .line 280
    .line 281
    iget-object v10, v7, Lfb/q1;->p:Ljava/lang/String;

    .line 282
    .line 283
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-nez v0, :cond_10

    .line 288
    .line 289
    const/16 v11, 0x5dc0

    .line 290
    .line 291
    move-object/from16 v12, p0

    .line 292
    .line 293
    :try_start_0
    invoke-static {v12, v10}, Lr9/e0;->h0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 298
    .line 299
    .line 300
    move-result v13

    .line 301
    if-eqz v13, :cond_d

    .line 302
    .line 303
    sget-object v13, Log/a;->a:Ljava/nio/charset/Charset;

    .line 304
    .line 305
    new-instance v14, Ljava/io/InputStreamReader;

    .line 306
    .line 307
    new-instance v15, Ljava/io/FileInputStream;

    .line 308
    .line 309
    invoke-direct {v15, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 310
    .line 311
    .line 312
    invoke-direct {v14, v15, v13}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 313
    .line 314
    .line 315
    new-instance v13, Ljava/io/BufferedReader;

    .line 316
    .line 317
    const/16 v0, 0x2000

    .line 318
    .line 319
    invoke-direct {v13, v14, v0}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 320
    .line 321
    .line 322
    :try_start_1
    new-array v0, v11, [C

    .line 323
    .line 324
    move v14, v5

    .line 325
    :goto_6
    if-ge v14, v11, :cond_b

    .line 326
    .line 327
    rsub-int v15, v14, 0x5dc0

    .line 328
    .line 329
    invoke-virtual {v13, v0, v14, v15}, Ljava/io/BufferedReader;->read([CII)I

    .line 330
    .line 331
    .line 332
    move-result v15

    .line 333
    if-gtz v15, :cond_a

    .line 334
    .line 335
    goto :goto_7

    .line 336
    :cond_a
    add-int/2addr v14, v15

    .line 337
    goto :goto_6

    .line 338
    :catchall_0
    move-exception v0

    .line 339
    move-object v11, v0

    .line 340
    goto :goto_9

    .line 341
    :cond_b
    :goto_7
    new-instance v15, Lfb/r1;

    .line 342
    .line 343
    new-instance v11, Ljava/lang/String;

    .line 344
    .line 345
    invoke-direct {v11, v0, v5, v14}, Ljava/lang/String;-><init>([CII)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v13}, Ljava/io/BufferedReader;->read()I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-ltz v0, :cond_c

    .line 353
    .line 354
    move/from16 v0, v16

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_c
    move v0, v5

    .line 358
    :goto_8
    invoke-direct {v15, v11, v0}, Lfb/r1;-><init>(Ljava/lang/String;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 359
    .line 360
    .line 361
    :try_start_2
    invoke-interface {v13}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 362
    .line 363
    .line 364
    goto :goto_b

    .line 365
    :catchall_1
    move-exception v0

    .line 366
    goto :goto_a

    .line 367
    :goto_9
    :try_start_3
    throw v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 368
    :catchall_2
    move-exception v0

    .line 369
    :try_start_4
    invoke-static {v13, v11}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 370
    .line 371
    .line 372
    throw v0

    .line 373
    :cond_d
    const-string v0, "\u5de5\u5177\u7ed3\u679c\u5df2\u4e0d\u5b58\u5728"

    .line 374
    .line 375
    new-instance v11, Ljava/lang/IllegalArgumentException;

    .line 376
    .line 377
    invoke-direct {v11, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    throw v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 381
    :goto_a
    new-instance v15, Lsf/f;

    .line 382
    .line 383
    invoke-direct {v15, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 384
    .line 385
    .line 386
    :goto_b
    invoke-static {v15}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    if-nez v0, :cond_f

    .line 391
    .line 392
    check-cast v15, Lfb/r1;

    .line 393
    .line 394
    iget-boolean v0, v15, Lfb/r1;->b:Z

    .line 395
    .line 396
    iget-object v11, v15, Lfb/r1;->a:Ljava/lang/String;

    .line 397
    .line 398
    if-eqz v0, :cond_11

    .line 399
    .line 400
    iget v0, v7, Lfb/q1;->q:I

    .line 401
    .line 402
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 403
    .line 404
    .line 405
    move-result v13

    .line 406
    add-int/lit8 v13, v13, 0x1

    .line 407
    .line 408
    if-ge v0, v13, :cond_e

    .line 409
    .line 410
    move v0, v13

    .line 411
    :cond_e
    const/16 v13, 0x5dc0

    .line 412
    .line 413
    invoke-static {v5, v13, v10, v11, v0}, Lr9/e0;->Q(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v11

    .line 417
    goto :goto_c

    .line 418
    :cond_f
    const-string v0, "\u5b8c\u6574\u5de5\u5177\u7ed3\u679c\u5df2\u4e0d\u5b58\u5728"

    .line 419
    .line 420
    invoke-static {v0}, Lr9/e0;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v11

    .line 424
    goto :goto_c

    .line 425
    :cond_10
    move-object/from16 v12, p0

    .line 426
    .line 427
    iget-object v11, v7, Lfb/q1;->e:Ljava/lang/String;

    .line 428
    .line 429
    :cond_11
    :goto_c
    const-string v0, "tool"

    .line 430
    .line 431
    invoke-static {v8, v0}, Lwb/en;->k(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    const-string v10, "tool_call_id"

    .line 436
    .line 437
    iget-object v7, v7, Lfb/q1;->l:Ljava/lang/String;

    .line 438
    .line 439
    invoke-virtual {v0, v10, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 440
    .line 441
    .line 442
    const-string v7, "content"

    .line 443
    .line 444
    invoke-virtual {v0, v7, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 448
    .line 449
    .line 450
    goto/16 :goto_5

    .line 451
    .line 452
    :cond_12
    move-object/from16 v12, p0

    .line 453
    .line 454
    :goto_d
    invoke-static {v1}, Lr9/e0;->M(Lorg/json/JSONArray;)I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    move/from16 v6, v16

    .line 459
    .line 460
    if-le v0, v6, :cond_2

    .line 461
    .line 462
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 467
    .line 468
    .line 469
    move-result v0

    .line 470
    const v7, 0x1d4c0

    .line 471
    .line 472
    .line 473
    if-le v0, v7, :cond_2

    .line 474
    .line 475
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    if-eqz v0, :cond_13

    .line 480
    .line 481
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    goto :goto_e

    .line 486
    :cond_13
    const/4 v7, 0x0

    .line 487
    :goto_e
    invoke-static {v7, v9}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 488
    .line 489
    .line 490
    move-result v7

    .line 491
    if-eqz v7, :cond_14

    .line 492
    .line 493
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    if-eqz v0, :cond_14

    .line 498
    .line 499
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    goto :goto_f

    .line 504
    :cond_14
    move v0, v5

    .line 505
    :goto_f
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->remove(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 509
    .line 510
    .line 511
    move-result v7

    .line 512
    if-le v0, v7, :cond_15

    .line 513
    .line 514
    move v0, v7

    .line 515
    :cond_15
    move v7, v5

    .line 516
    :goto_10
    if-ge v7, v0, :cond_16

    .line 517
    .line 518
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->remove(I)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    add-int/lit8 v7, v7, 0x1

    .line 522
    .line 523
    goto :goto_10

    .line 524
    :cond_16
    move/from16 v16, v6

    .line 525
    .line 526
    goto :goto_d

    .line 527
    :cond_17
    const/4 v6, 0x1

    .line 528
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-lez v0, :cond_18

    .line 533
    .line 534
    move v5, v6

    .line 535
    :cond_18
    if-eqz v5, :cond_19

    .line 536
    .line 537
    goto :goto_11

    .line 538
    :cond_19
    const/4 v1, 0x0

    .line 539
    :goto_11
    if-eqz v1, :cond_1a

    .line 540
    .line 541
    invoke-virtual {v1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v4

    .line 545
    goto :goto_12

    .line 546
    :cond_1a
    const/4 v4, 0x0

    .line 547
    :goto_12
    if-nez v4, :cond_1b

    .line 548
    .line 549
    const-string v4, ""

    .line 550
    .line 551
    :cond_1b
    return-object v4
.end method

.method public static final g(Ljava/util/ArrayList;IZLfg/a;Lfg/a;Lsh/t;Ln1/a;Lfg/l;Li0/h0;I)V
    .locals 19

    .line 1
    move-object/from16 v7, p6

    .line 2
    .line 3
    move-object/from16 v0, p8

    .line 4
    .line 5
    const v1, -0xc1541d4

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Li0/h0;->b0(I)Li0/h0;

    .line 9
    .line 10
    .line 11
    move-object/from16 v11, p0

    .line 12
    .line 13
    invoke-virtual {v0, v11}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x2

    .line 22
    :goto_0
    or-int v1, p9, v1

    .line 23
    .line 24
    move/from16 v12, p1

    .line 25
    .line 26
    invoke-virtual {v0, v12}, Li0/h0;->d(I)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    const/16 v2, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v2, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v1, v2

    .line 38
    move/from16 v3, p2

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Li0/h0;->g(Z)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    const/16 v2, 0x100

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v2, 0x80

    .line 50
    .line 51
    :goto_2
    or-int/2addr v1, v2

    .line 52
    const/4 v2, 0x0

    .line 53
    invoke-virtual {v0, v2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    const/high16 v2, 0x20000

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    const/high16 v2, 0x10000

    .line 63
    .line 64
    :goto_3
    or-int/2addr v1, v2

    .line 65
    move-object/from16 v6, p5

    .line 66
    .line 67
    invoke-virtual {v0, v6}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    const/high16 v2, 0x100000

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_4
    const/high16 v2, 0x80000

    .line 77
    .line 78
    :goto_4
    or-int/2addr v1, v2

    .line 79
    invoke-virtual {v0, v7}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-eqz v2, :cond_5

    .line 84
    .line 85
    const/high16 v2, 0x800000

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_5
    const/high16 v2, 0x400000

    .line 89
    .line 90
    :goto_5
    or-int/2addr v1, v2

    .line 91
    move-object/from16 v2, p7

    .line 92
    .line 93
    invoke-virtual {v0, v2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_6

    .line 98
    .line 99
    const/high16 v4, 0x4000000

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_6
    const/high16 v4, 0x2000000

    .line 103
    .line 104
    :goto_6
    or-int/2addr v1, v4

    .line 105
    const v4, 0x2492493

    .line 106
    .line 107
    .line 108
    and-int/2addr v4, v1

    .line 109
    const v5, 0x2492492

    .line 110
    .line 111
    .line 112
    if-eq v4, v5, :cond_7

    .line 113
    .line 114
    const/4 v4, 0x1

    .line 115
    goto :goto_7

    .line 116
    :cond_7
    const/4 v4, 0x0

    .line 117
    :goto_7
    and-int/lit8 v5, v1, 0x1

    .line 118
    .line 119
    invoke-virtual {v0, v5, v4}, Li0/h0;->S(IZ)Z

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    if-eqz v4, :cond_8

    .line 124
    .line 125
    invoke-static/range {p7 .. p8}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    invoke-static {v7, v0}, Li0/r;->y(Ljava/lang/Object;Li0/h0;)Li0/a1;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    new-instance v8, Ls0/c;

    .line 134
    .line 135
    const/16 v14, 0xd

    .line 136
    .line 137
    move-object v13, v6

    .line 138
    invoke-direct/range {v8 .. v14}, Ls0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 139
    .line 140
    .line 141
    const v4, 0x598de36

    .line 142
    .line 143
    .line 144
    invoke-static {v4, v8, v0}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 145
    .line 146
    .line 147
    move-result-object v16

    .line 148
    shr-int/lit8 v4, v1, 0x6

    .line 149
    .line 150
    and-int/lit8 v4, v4, 0xe

    .line 151
    .line 152
    shl-int/lit8 v1, v1, 0x6

    .line 153
    .line 154
    const v5, 0x301b0c00

    .line 155
    .line 156
    .line 157
    or-int/2addr v4, v5

    .line 158
    const/high16 v5, 0x1c00000

    .line 159
    .line 160
    and-int/2addr v1, v5

    .line 161
    or-int v18, v4, v1

    .line 162
    .line 163
    const/4 v9, 0x0

    .line 164
    const/4 v10, 0x0

    .line 165
    sget-object v11, Lsh/g0;->h:Lsh/g0;

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    const/4 v15, 0x0

    .line 169
    move-object/from16 v13, p3

    .line 170
    .line 171
    move-object/from16 v14, p4

    .line 172
    .line 173
    move-object/from16 v17, v0

    .line 174
    .line 175
    move v8, v3

    .line 176
    invoke-static/range {v8 .. v18}, Lxh/v;->a(ZLy0/o;Lsh/y;Lsh/g0;ZLfg/a;Lfg/a;FLs0/d;Li0/h0;I)V

    .line 177
    .line 178
    .line 179
    goto :goto_8

    .line 180
    :cond_8
    invoke-virtual/range {p8 .. p8}, Li0/h0;->V()V

    .line 181
    .line 182
    .line 183
    :goto_8
    invoke-virtual/range {p8 .. p8}, Li0/h0;->t()Li0/r1;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    if-eqz v10, :cond_9

    .line 188
    .line 189
    new-instance v0, Lw/u;

    .line 190
    .line 191
    move-object/from16 v1, p0

    .line 192
    .line 193
    move/from16 v3, p2

    .line 194
    .line 195
    move-object/from16 v4, p3

    .line 196
    .line 197
    move-object/from16 v5, p4

    .line 198
    .line 199
    move-object/from16 v6, p5

    .line 200
    .line 201
    move/from16 v9, p9

    .line 202
    .line 203
    move-object v8, v2

    .line 204
    move/from16 v2, p1

    .line 205
    .line 206
    invoke-direct/range {v0 .. v9}, Lw/u;-><init>(Ljava/util/ArrayList;IZLfg/a;Lfg/a;Lsh/t;Ln1/a;Lfg/l;I)V

    .line 207
    .line 208
    .line 209
    iput-object v0, v10, Li0/r1;->d:Lfg/p;

    .line 210
    .line 211
    :cond_9
    return-void
.end method

.method public static final g0([Ljava/lang/Object;II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    if-ge p1, p2, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aput-object v0, p0, p1

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void
.end method

.method public static final h(Lb1/h;J)Z
    .locals 10

    .line 1
    iget-object v0, p0, Ly0/n;->g:Ly0/n;

    .line 2
    .line 3
    iget-boolean v0, v0, Ly0/n;->t:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p0}, Lx1/k;->w(Lx1/i;)Lx1/f0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Lx1/f0;->L:Lx1/b1;

    .line 13
    .line 14
    iget-object v0, v0, Lx1/b1;->c:Lx1/r;

    .line 15
    .line 16
    iget-object v1, v0, Lx1/r;->Y:Lx1/b2;

    .line 17
    .line 18
    iget-boolean v1, v1, Ly0/n;->t:Z

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-wide/16 v1, 0x0

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Lx1/i1;->m0(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const/16 v2, 0x20

    .line 30
    .line 31
    shr-long v3, v0, v2

    .line 32
    .line 33
    long-to-int v3, v3

    .line 34
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const-wide v4, 0xffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    and-long/2addr v0, v4

    .line 44
    long-to-int v0, v0

    .line 45
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-wide v6, p0, Lb1/h;->w:J

    .line 50
    .line 51
    shr-long v8, v6, v2

    .line 52
    .line 53
    long-to-int p0, v8

    .line 54
    int-to-float p0, p0

    .line 55
    add-float/2addr p0, v3

    .line 56
    and-long/2addr v6, v4

    .line 57
    long-to-int v1, v6

    .line 58
    int-to-float v1, v1

    .line 59
    add-float/2addr v1, v0

    .line 60
    shr-long v6, p1, v2

    .line 61
    .line 62
    long-to-int v2, v6

    .line 63
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    cmpg-float v3, v3, v2

    .line 68
    .line 69
    if-gtz v3, :cond_2

    .line 70
    .line 71
    cmpg-float p0, v2, p0

    .line 72
    .line 73
    if-gtz p0, :cond_2

    .line 74
    .line 75
    and-long p0, p1, v4

    .line 76
    .line 77
    long-to-int p0, p0

    .line 78
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    cmpg-float p1, v0, p0

    .line 83
    .line 84
    if-gtz p1, :cond_2

    .line 85
    .line 86
    cmpg-float p0, p0, v1

    .line 87
    .line 88
    if-gtz p0, :cond_2

    .line 89
    .line 90
    const/4 p0, 0x1

    .line 91
    return p0

    .line 92
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 93
    return p0
.end method

.method public static h0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/16 v2, 0x3a

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    aput-char v2, v1, v3

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-static {p1, v1, v2}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v4, 0x0

    .line 19
    const-string v5, "\u7ed3\u679c handle \u65e0\u6548"

    .line 20
    .line 21
    if-ne v1, v2, :cond_1

    .line 22
    .line 23
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1}, Lr9/e0;->j0(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v2}, Lr9/e0;->j0(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_0

    .line 62
    .line 63
    new-instance p1, Ljava/io/File;

    .line 64
    .line 65
    new-instance v0, Ljava/io/File;

    .line 66
    .line 67
    invoke-static {p0}, Lr9/e0;->i0(Landroid/content/Context;)Ljava/io/File;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const-string p0, ".txt"

    .line 75
    .line 76
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {p1, v0, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_0
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v4

    .line 88
    :cond_1
    invoke-static {v5}, Lj8/o;->t(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object v4
.end method

.method public static final i([Ljava/lang/Object;IILtf/g;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    mul-int/lit8 v1, p2, 0x3

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x2

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const-string v1, "["

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, p2, :cond_2

    .line 17
    .line 18
    if-lez v1, :cond_0

    .line 19
    .line 20
    const-string v2, ", "

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int v2, p1, v1

    .line 26
    .line 27
    aget-object v2, p0, v2

    .line 28
    .line 29
    if-ne v2, p3, :cond_1

    .line 30
    .line 31
    const-string v2, "(this Collection)"

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const-string p0, "]"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static i0(Landroid/content/Context;)Ljava/io/File;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    sget-object v1, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->INSTANCE:Lh/Hchat/hooks/items/script/ScriptPluginRuntime;

    .line 4
    .line 5
    invoke-virtual {v1, p0}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->scriptDir(Landroid/content/Context;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, "Agent/tool-results"

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public static final j(Ls0/d;Li0/h0;I)Ld0/c;
    .locals 2

    .line 1
    and-int/lit8 v0, p2, 0xe

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x6

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    if-le v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    and-int/lit8 p2, p2, 0x6

    .line 15
    .line 16
    if-ne p2, v1, :cond_2

    .line 17
    .line 18
    :cond_1
    const/4 p2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_2
    const/4 p2, 0x0

    .line 21
    :goto_0
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, Li0/l;->a:Li0/e;

    .line 26
    .line 27
    if-nez p2, :cond_3

    .line 28
    .line 29
    if-ne v0, v1, :cond_4

    .line 30
    .line 31
    :cond_3
    new-instance v0, Ld0/c;

    .line 32
    .line 33
    invoke-direct {v0, p0}, Ld0/c;-><init>(Ls0/d;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_4
    check-cast v0, Ld0/c;

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {p1}, Li0/h0;->P()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    if-nez p0, :cond_5

    .line 50
    .line 51
    if-ne p2, v1, :cond_6

    .line 52
    .line 53
    :cond_5
    new-instance p2, Lb0/d0;

    .line 54
    .line 55
    const/16 p0, 0x9

    .line 56
    .line 57
    invoke-direct {p2, v0, p0}, Lb0/d0;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_6
    check-cast p2, Lfg/l;

    .line 64
    .line 65
    invoke-static {v0, p2, p1}, Li0/r;->c(Ljava/lang/Object;Lfg/l;Li0/h0;)V

    .line 66
    .line 67
    .line 68
    return-object v0
.end method

.method public static j0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "[^A-Za-z0-9_-]"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v0, "_"

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/16 v0, 0x60

    .line 27
    .line 28
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const-string p0, "item"

    .line 39
    .line 40
    :cond_0
    return-object p0
.end method

.method public static k0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V
    .locals 11

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Lb2/b;->f(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    if-lt v0, v1, :cond_1

    .line 15
    .line 16
    invoke-static {p0, p1}, Lb2/b;->f(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    iget v0, p0, Landroid/view/inputmethod/EditorInfo;->initialSelStart:I

    .line 21
    .line 22
    iget v1, p0, Landroid/view/inputmethod/EditorInfo;->initialSelEnd:I

    .line 23
    .line 24
    if-le v0, v1, :cond_2

    .line 25
    .line 26
    move v2, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_2
    move v2, v0

    .line 29
    :goto_0
    if-le v0, v1, :cond_3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_3
    move v0, v1

    .line 33
    :goto_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    if-ltz v2, :cond_c

    .line 40
    .line 41
    if-le v0, v1, :cond_4

    .line 42
    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_4
    iget v5, p0, Landroid/view/inputmethod/EditorInfo;->inputType:I

    .line 46
    .line 47
    and-int/lit16 v5, v5, 0xfff

    .line 48
    .line 49
    const/16 v6, 0x81

    .line 50
    .line 51
    if-eq v5, v6, :cond_b

    .line 52
    .line 53
    const/16 v6, 0xe1

    .line 54
    .line 55
    if-eq v5, v6, :cond_b

    .line 56
    .line 57
    const/16 v6, 0x12

    .line 58
    .line 59
    if-ne v5, v6, :cond_5

    .line 60
    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_5
    const/16 v4, 0x800

    .line 64
    .line 65
    if-gt v1, v4, :cond_6

    .line 66
    .line 67
    invoke-static {p0, p1, v2, v0}, Lr9/e0;->m0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_6
    sub-int v1, v0, v2

    .line 72
    .line 73
    const/16 v4, 0x400

    .line 74
    .line 75
    if-le v1, v4, :cond_7

    .line 76
    .line 77
    move v4, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_7
    move v4, v1

    .line 80
    :goto_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    sub-int/2addr v5, v0

    .line 85
    rsub-int v6, v4, 0x800

    .line 86
    .line 87
    const-wide v7, 0x3fe999999999999aL    # 0.8

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    int-to-double v9, v6

    .line 93
    mul-double/2addr v9, v7

    .line 94
    double-to-int v7, v9

    .line 95
    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    sub-int v7, v6, v7

    .line 100
    .line 101
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    sub-int/2addr v6, v5

    .line 106
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    sub-int/2addr v2, v6

    .line 111
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-eqz v7, :cond_8

    .line 120
    .line 121
    add-int/lit8 v2, v2, 0x1

    .line 122
    .line 123
    add-int/lit8 v6, v6, -0x1

    .line 124
    .line 125
    :cond_8
    add-int v7, v0, v5

    .line 126
    .line 127
    const/4 v8, 0x1

    .line 128
    sub-int/2addr v7, v8

    .line 129
    invoke-interface {p1, v7}, Ljava/lang/CharSequence;->charAt(I)C

    .line 130
    .line 131
    .line 132
    move-result v7

    .line 133
    invoke-static {v7}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_9

    .line 138
    .line 139
    add-int/lit8 v5, v5, -0x1

    .line 140
    .line 141
    :cond_9
    add-int v7, v6, v4

    .line 142
    .line 143
    add-int v9, v7, v5

    .line 144
    .line 145
    if-eq v4, v1, :cond_a

    .line 146
    .line 147
    add-int v1, v2, v6

    .line 148
    .line 149
    invoke-interface {p1, v2, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    add-int/2addr v5, v0

    .line 154
    invoke-interface {p1, v0, v5}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    const/4 v0, 0x2

    .line 159
    new-array v0, v0, [Ljava/lang/CharSequence;

    .line 160
    .line 161
    aput-object v1, v0, v3

    .line 162
    .line 163
    aput-object p1, v0, v8

    .line 164
    .line 165
    invoke-static {v0}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    goto :goto_3

    .line 170
    :cond_a
    add-int/2addr v9, v2

    .line 171
    invoke-interface {p1, v2, v9}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    :goto_3
    invoke-static {p0, p1, v6, v7}, Lr9/e0;->m0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_b
    :goto_4
    invoke-static {p0, v4, v3, v3}, Lr9/e0;->m0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :cond_c
    :goto_5
    invoke-static {p0, v4, v3, v3}, Lr9/e0;->m0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V

    .line 184
    .line 185
    .line 186
    return-void
.end method

.method public static l0(Landroid/view/inputmethod/EditorInfo;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x23

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Li3/a;->b(Landroid/view/inputmethod/EditorInfo;Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    new-instance v0, Landroid/os/Bundle;

    .line 15
    .line 16
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 20
    .line 21
    :cond_1
    iget-object p0, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 22
    .line 23
    const-string v0, "androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED"

    .line 24
    .line 25
    invoke-virtual {p0, v0, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static m0(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 11
    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget-object p1, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 22
    .line 23
    const-string v1, "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT"

    .line 24
    .line 25
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 29
    .line 30
    const-string v0, "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD"

    .line 31
    .line 32
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Landroid/view/inputmethod/EditorInfo;->extras:Landroid/os/Bundle;

    .line 36
    .line 37
    const-string p1, "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END"

    .line 38
    .line 39
    invoke-virtual {p0, p1, p3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static n(II)I
    .locals 0

    .line 1
    if-ge p0, p1, :cond_0

    .line 2
    .line 3
    return p1

    .line 4
    :cond_0
    return p0
.end method

.method public static n0(Llg/d;I)Llg/b;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-lez p1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget v0, p0, Llg/b;->g:I

    .line 16
    .line 17
    iget v1, p0, Llg/b;->h:I

    .line 18
    .line 19
    iget p0, p0, Llg/b;->i:I

    .line 20
    .line 21
    if-lez p0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    neg-int p1, p1

    .line 25
    :goto_1
    new-instance p0, Llg/b;

    .line 26
    .line 27
    invoke-direct {p0, v0, v1, p1}, Llg/b;-><init>(III)V

    .line 28
    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v0, "Step must be positive, was: "

    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 v0, 0x2e

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0
.end method

.method public static o(Lu2/f;Lu2/f;)Ljava/lang/Comparable;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lu2/f;->compareTo(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    return-object p0
.end method

.method public static o0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Lfb/s1;
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    new-instance v0, Lfb/s1;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const-string v3, ""

    .line 18
    .line 19
    move-object v2, p2

    .line 20
    move-object v1, p2

    .line 21
    invoke-direct/range {v0 .. v6}, Lfb/s1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZI)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    move-object v1, p2

    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/16 p3, 0x5dc0

    .line 31
    .line 32
    if-gt p2, p3, :cond_1

    .line 33
    .line 34
    move-object v2, v1

    .line 35
    new-instance v1, Lfb/s1;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x0

    .line 43
    const-string v4, ""

    .line 44
    .line 45
    move-object v3, v2

    .line 46
    invoke-direct/range {v1 .. v7}, Lfb/s1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZI)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-eqz p2, :cond_2

    .line 55
    .line 56
    const-string p1, "session"

    .line 57
    .line 58
    :cond_2
    invoke-static {p1}, Lr9/e0;->j0(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const-string v0, "-"

    .line 74
    .line 75
    const-string v2, ""

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-static {p2, v0, v2, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    new-instance v0, Ljava/io/File;

    .line 83
    .line 84
    invoke-static {p0}, Lr9/e0;->i0(Landroid/content/Context;)Ljava/io/File;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 92
    .line 93
    .line 94
    new-instance p0, Ljava/io/File;

    .line 95
    .line 96
    const-string v2, ".txt"

    .line 97
    .line 98
    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-direct {p0, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v2, Ljava/io/File;

    .line 106
    .line 107
    const-string v4, ".tmp"

    .line 108
    .line 109
    invoke-virtual {p2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-direct {v2, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance v4, Ljava/io/FileOutputStream;

    .line 117
    .line 118
    invoke-direct {v4, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 119
    .line 120
    .line 121
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 144
    .line 145
    .line 146
    :try_start_1
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-static {v0, v4}, Landroid/system/Os;->rename(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    .line 156
    .line 157
    goto :goto_0

    .line 158
    :catchall_0
    move-exception v0

    .line 159
    invoke-virtual {v2, p0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    if-eqz p0, :cond_3

    .line 164
    .line 165
    :goto_0
    const-string p0, ":"

    .line 166
    .line 167
    invoke-static {p1, p0, p2}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    new-instance v4, Lfb/s1;

    .line 172
    .line 173
    const/16 p0, 0x2ee0

    .line 174
    .line 175
    invoke-static {p0, v1}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    const-string p1, "\n\n[\u7ed3\u679c\u8f83\u957f\uff0c\u5b8c\u6574\u5185\u5bb9\u53ef\u5206\u9875\u8bfb\u53d6]"

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    invoke-static {v3, p3, v7, v1, p0}, Lr9/e0;->Q(IILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    const/4 v9, 0x1

    .line 198
    const/16 v10, 0x5dc0

    .line 199
    .line 200
    invoke-direct/range {v4 .. v10}, Lfb/s1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZI)V

    .line 201
    .line 202
    .line 203
    return-object v4

    .line 204
    :cond_3
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 205
    .line 206
    .line 207
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 208
    .line 209
    const-string p1, "\u4fdd\u5b58\u5b8c\u6574\u5de5\u5177\u7ed3\u679c\u5931\u8d25"

    .line 210
    .line 211
    invoke-direct {p0, p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 212
    .line 213
    .line 214
    throw p0

    .line 215
    :catchall_1
    move-exception v0

    .line 216
    move-object p0, v0

    .line 217
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 218
    :catchall_2
    move-exception v0

    .line 219
    move-object p1, v0

    .line 220
    invoke-static {v4, p0}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    throw p1
.end method

.method public static p(DDD)D
    .locals 1

    .line 1
    cmpl-double v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-double v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmpl-double p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance p1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p4, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p2, 0x2e

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static final p0(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    float-to-int v1, v1

    .line 11
    const-wide v2, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    and-long/2addr p0, v2

    .line 17
    long-to-int p0, p0

    .line 18
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    float-to-int p0, p0

    .line 23
    int-to-long v4, v1

    .line 24
    shl-long v0, v4, v0

    .line 25
    .line 26
    int-to-long p0, p0

    .line 27
    and-long/2addr p0, v2

    .line 28
    or-long/2addr p0, v0

    .line 29
    return-wide p0
.end method

.method public static q(FFF)F
    .locals 2

    .line 1
    cmpl-float v0, p1, p2

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmpg-float v0, p0, p1

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return p1

    .line 10
    :cond_0
    cmpl-float p1, p0, p2

    .line 11
    .line 12
    if-lez p1, :cond_1

    .line 13
    .line 14
    return p2

    .line 15
    :cond_1
    return p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string p2, " is less than minimum "

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const/16 p1, 0x2e

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0
.end method

.method public static final q0(J)J
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    int-to-float v1, v1

    .line 7
    const-wide v2, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr p0, v2

    .line 13
    long-to-int p0, p0

    .line 14
    int-to-float p0, p0

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-long v4, p1

    .line 20
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    int-to-long p0, p0

    .line 25
    shl-long v0, v4, v0

    .line 26
    .line 27
    and-long/2addr p0, v2

    .line 28
    or-long/2addr p0, v0

    .line 29
    return-wide p0
.end method

.method public static r(III)I
    .locals 2

    .line 1
    if-gt p1, p2, :cond_2

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    if-le p0, p2, :cond_1

    .line 7
    .line 8
    return p2

    .line 9
    :cond_1
    return p0

    .line 10
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p2, " is less than minimum "

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p1, 0x2e

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method

.method public static r0(II)Llg/d;
    .locals 2

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    if-gt p1, v0, :cond_0

    .line 4
    .line 5
    sget-object p0, Llg/d;->j:Llg/d;

    .line 6
    .line 7
    sget-object p0, Llg/d;->j:Llg/d;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, Llg/d;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    sub-int/2addr p1, v1

    .line 14
    invoke-direct {v0, p0, p1, v1}, Llg/b;-><init>(III)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static s(JJJ)J
    .locals 1

    .line 1
    cmp-long v0, p2, p4

    .line 2
    .line 3
    if-gtz v0, :cond_2

    .line 4
    .line 5
    cmp-long v0, p0, p2

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    return-wide p2

    .line 10
    :cond_0
    cmp-long p2, p0, p4

    .line 11
    .line 12
    if-lez p2, :cond_1

    .line 13
    .line 14
    return-wide p4

    .line 15
    :cond_1
    return-wide p0

    .line 16
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    const-string p1, "Cannot coerce value to an empty range: maximum "

    .line 19
    .line 20
    const-string v0, " is less than minimum "

    .line 21
    .line 22
    invoke-static {p4, p5, p1, v0}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const/16 p2, 0x2e

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0
.end method

.method public static s0(Le5/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lq5/a;->m(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lb6/h;->g:Lb6/h;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Le5/a;->g(Lw5/a;)V

    .line 10
    .line 11
    .line 12
    :goto_0
    const/16 p1, 0x3a

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lq5/a;->write(I)V

    .line 15
    .line 16
    .line 17
    if-eqz p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, p2}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string p1, "V"

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lq5/a;->t(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    :goto_1
    if-eqz p3, :cond_2

    .line 29
    .line 30
    const-string p1, ", "

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lq5/a;->write(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p3}, Lq5/a;->m(Ljava/lang/CharSequence;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    return-void
.end method

.method public static t(Ljava/lang/Float;Llg/a;)Ljava/lang/Comparable;
    .locals 3

    .line 1
    iget v0, p1, Llg/a;->b:F

    .line 2
    .line 3
    iget v1, p1, Llg/a;->a:F

    .line 4
    .line 5
    invoke-virtual {p1}, Llg/a;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_2

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p1}, Llg/a;->d(Ljava/lang/Float;Ljava/lang/Float;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1, p0}, Llg/a;->d(Ljava/lang/Float;Ljava/lang/Float;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1, p0}, Llg/a;->d(Ljava/lang/Float;Ljava/lang/Float;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p0, p1}, Llg/a;->d(Ljava/lang/Float;Ljava/lang/Float;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    :cond_1
    return-object p0

    .line 61
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v1, "Cannot coerce value to an empty range: "

    .line 66
    .line 67
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 p1, 0x2e

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p0
.end method

.method public static u(Lu2/f;Lu2/f;Lu2/f;)Ljava/lang/Comparable;
    .locals 2

    .line 1
    invoke-virtual {p1, p2}, Lu2/f;->compareTo(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lu2/f;->compareTo(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0, p2}, Lu2/f;->compareTo(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-lez p1, :cond_1

    .line 19
    .line 20
    return-object p2

    .line 21
    :cond_1
    return-object p0

    .line 22
    :cond_2
    const-string p0, " is less than minimum "

    .line 23
    .line 24
    const/16 v0, 0x2e

    .line 25
    .line 26
    const-string v1, "Cannot coerce value to an empty range: maximum "

    .line 27
    .line 28
    invoke-static {p2, v1, p0, p1, v0}, Lah/a;->j(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static v(Lf1/h;Landroid/graphics/BlurMaskFilter;I)V
    .locals 2

    .line 1
    sget-wide v0, Lf1/w;->b:J

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x8

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p2, 0x1

    .line 10
    :goto_0
    invoke-virtual {p0, v0, v1}, Lf1/h;->w(J)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    invoke-virtual {p0, v0}, Lf1/h;->v(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lf1/h;->D(I)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lf1/h;->i:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Landroid/graphics/Paint;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setMaskFilter(Landroid/graphics/MaskFilter;)Landroid/graphics/MaskFilter;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static w(I)I
    .locals 1

    .line 1
    invoke-static {p0}, Lt3/c;->b(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lj8/b;->v(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "Unsupported method handle type: "

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lah/a;->k(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :pswitch_0
    const/4 p0, 0x4

    .line 24
    return p0

    .line 25
    :pswitch_1
    const/4 p0, 0x2

    .line 26
    return p0

    .line 27
    :pswitch_2
    const/4 p0, 0x3

    .line 28
    return p0

    .line 29
    :pswitch_3
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static x(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 25

    .line 1
    const-string v0, ".txt"

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static/range {p1 .. p1}, Lr9/e0;->j0(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static/range {p2 .. p2}, Lr9/e0;->j0(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, Ljava/io/File;

    .line 15
    .line 16
    invoke-static/range {p0 .. p0}, Lr9/e0;->i0(Landroid/content/Context;)Ljava/io/File;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-direct {v3, v4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Ljava/io/File;

    .line 24
    .line 25
    invoke-static/range {p0 .. p0}, Lr9/e0;->i0(Landroid/content/Context;)Ljava/io/File;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-direct {v4, v5, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 33
    .line 34
    .line 35
    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static/range {p3 .. p3}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface/range {p3 .. p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_6

    .line 53
    .line 54
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    move-object v8, v7

    .line 59
    check-cast v8, Lfb/c;

    .line 60
    .line 61
    iget-object v7, v8, Lfb/c;->j:Ljava/util/List;

    .line 62
    .line 63
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    if-eqz v7, :cond_0

    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :cond_0
    iget-object v7, v8, Lfb/c;->j:Ljava/util/List;

    .line 72
    .line 73
    new-instance v9, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-static {v7}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_5

    .line 91
    .line 92
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    move-object v11, v10

    .line 97
    check-cast v11, Lfb/q1;

    .line 98
    .line 99
    iget-object v10, v11, Lfb/q1;->p:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    if-eqz v10, :cond_1

    .line 106
    .line 107
    goto/16 :goto_2

    .line 108
    .line 109
    :cond_1
    iget-object v10, v11, Lfb/q1;->p:Ljava/lang/String;

    .line 110
    .line 111
    const/4 v12, 0x1

    .line 112
    new-array v13, v12, [C

    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    const/16 v15, 0x3a

    .line 116
    .line 117
    aput-char v15, v13, v14

    .line 118
    .line 119
    const/4 v15, 0x2

    .line 120
    invoke-static {v10, v13, v15}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    if-ne v13, v15, :cond_4

    .line 129
    .line 130
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    invoke-static {v13, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v13

    .line 138
    if-eqz v13, :cond_4

    .line 139
    .line 140
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    check-cast v13, Ljava/lang/String;

    .line 145
    .line 146
    invoke-static {v13}, Lr9/e0;->j0(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v13, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-eqz v10, :cond_3

    .line 159
    .line 160
    new-instance v10, Ljava/io/File;

    .line 161
    .line 162
    new-instance v12, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    invoke-direct {v10, v3, v12}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    new-instance v12, Ljava/io/File;

    .line 181
    .line 182
    new-instance v14, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    invoke-direct {v12, v4, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v10}, Ljava/io/File;->isFile()Z

    .line 201
    .line 202
    .line 203
    move-result v14

    .line 204
    if-eqz v14, :cond_2

    .line 205
    .line 206
    invoke-static {v10, v12}, Ldg/l;->a0(Ljava/io/File;Ljava/io/File;)V

    .line 207
    .line 208
    .line 209
    new-instance v10, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    .line 217
    const-string v12, ":"

    .line 218
    .line 219
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v20

    .line 229
    const/16 v23, 0x0

    .line 230
    .line 231
    const v24, 0x77fff

    .line 232
    .line 233
    .line 234
    const/4 v12, 0x0

    .line 235
    const/4 v13, 0x0

    .line 236
    const/4 v14, 0x0

    .line 237
    const-wide/16 v15, 0x0

    .line 238
    .line 239
    const-wide/16 v17, 0x0

    .line 240
    .line 241
    const/16 v19, 0x0

    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    const/16 v22, 0x0

    .line 246
    .line 247
    invoke-static/range {v11 .. v24}, Lfb/q1;->a(Lfb/q1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;IZII)Lfb/q1;

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    :goto_2
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    goto/16 :goto_1

    .line 255
    .line 256
    :catchall_0
    move-exception v0

    .line 257
    goto :goto_4

    .line 258
    :cond_2
    const-string v0, "\u5206\u652f\u6240\u9700\u7684\u5b8c\u6574\u5de5\u5177\u7ed3\u679c\u5df2\u4e0d\u5b58\u5728"

    .line 259
    .line 260
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 261
    .line 262
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    throw v1

    .line 266
    :cond_3
    const-string v0, "\u5de5\u5177\u7ed3\u679c handle \u65e0\u6548"

    .line 267
    .line 268
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 269
    .line 270
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw v1

    .line 274
    :cond_4
    const-string v0, "\u5206\u652f\u5de5\u5177\u7ed3\u679c\u4e0d\u5c5e\u4e8e\u5f53\u524d\u4f1a\u8bdd"

    .line 275
    .line 276
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 277
    .line 278
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v1

    .line 282
    :cond_5
    const-wide/16 v22, 0x0

    .line 283
    .line 284
    const v24, 0x3fdff

    .line 285
    .line 286
    .line 287
    move-object/from16 v17, v9

    .line 288
    .line 289
    const/4 v9, 0x0

    .line 290
    const/4 v10, 0x0

    .line 291
    const/4 v11, 0x0

    .line 292
    const/4 v12, 0x0

    .line 293
    const/4 v13, 0x0

    .line 294
    const/4 v14, 0x0

    .line 295
    const/4 v15, 0x0

    .line 296
    const/16 v16, 0x0

    .line 297
    .line 298
    const/16 v18, 0x0

    .line 299
    .line 300
    const/16 v19, 0x0

    .line 301
    .line 302
    const/16 v20, 0x0

    .line 303
    .line 304
    const/16 v21, 0x0

    .line 305
    .line 306
    invoke-static/range {v8 .. v24}, Lfb/c;->a(Lfb/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfb/y;ZLjava/lang/String;JI)Lfb/c;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    :goto_3
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    .line 312
    .line 313
    goto/16 :goto_0

    .line 314
    .line 315
    :goto_4
    new-instance v5, Lsf/f;

    .line 316
    .line 317
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    :cond_6
    invoke-static {v5}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    if-nez v0, :cond_7

    .line 325
    .line 326
    check-cast v5, Ljava/util/List;

    .line 327
    .line 328
    return-object v5

    .line 329
    :cond_7
    invoke-static {v4}, Ldg/l;->b0(Ljava/io/File;)V

    .line 330
    .line 331
    .line 332
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 333
    .line 334
    const-string v2, "\u590d\u5236\u5206\u652f\u5de5\u5177\u7ed3\u679c\u5931\u8d25"

    .line 335
    .line 336
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 337
    .line 338
    .line 339
    throw v1
.end method

.method public static y(Ljava/lang/Class;)Ly1/y1;
    .locals 4

    .line 1
    const-string v0, "Cannot create an instance of "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    .line 7
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2

    .line 8
    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v1, Ly1/y1;
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 26
    .line 27
    return-object v1

    .line 28
    :catch_0
    move-exception v1

    .line 29
    goto :goto_0

    .line 30
    :catch_1
    move-exception v1

    .line 31
    goto :goto_2

    .line 32
    :goto_0
    invoke-static {p0, v0}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-static {p0, v1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    :goto_1
    const/4 p0, 0x0

    .line 40
    return-object p0

    .line 41
    :goto_2
    invoke-static {p0, v0}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0, v1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-static {p0, v0}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catch_2
    move-exception v1

    .line 58
    invoke-static {p0, v0}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0, v1}, Lah/a;->p(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1
.end method

.method public static z(IZ)Ljava/lang/String;
    .locals 10

    .line 1
    shr-int/lit8 v0, p0, 0x4

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    and-int/2addr v0, v1

    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move v1, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    if-ne v0, v3, :cond_1

    .line 12
    .line 13
    move v1, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    if-ne v0, v2, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    if-ne v0, v1, :cond_11

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    :goto_0
    and-int/lit16 v0, p0, -0x100

    .line 22
    .line 23
    int-to-float v0, v0

    .line 24
    const/4 v4, 0x1

    .line 25
    if-eq v1, v4, :cond_6

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    if-eq v1, v4, :cond_5

    .line 29
    .line 30
    const/4 v4, 0x3

    .line 31
    if-eq v1, v4, :cond_4

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    if-ne v1, v4, :cond_3

    .line 35
    .line 36
    const/high16 v4, 0x30000000

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    const/4 p0, 0x0

    .line 40
    throw p0

    .line 41
    :cond_4
    const/high16 v4, 0x34000000

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_5
    const/high16 v4, 0x38000000

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_6
    const/high16 v4, 0x3b800000    # 0.00390625f

    .line 48
    .line 49
    :goto_1
    mul-float/2addr v4, v0

    .line 50
    and-int/lit8 p0, p0, 0xf

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    if-eqz p1, :cond_8

    .line 55
    .line 56
    sget-object v6, Ln7/f;->k:[Ln7/f;

    .line 57
    .line 58
    move v7, v5

    .line 59
    :goto_2
    if-ge v7, v2, :cond_a

    .line 60
    .line 61
    aget-object v8, v6, v7

    .line 62
    .line 63
    iget v9, v8, Lg3/s;->h:I

    .line 64
    .line 65
    if-ne p0, v9, :cond_7

    .line 66
    .line 67
    :goto_3
    move-object v0, v8

    .line 68
    goto :goto_5

    .line 69
    :cond_7
    add-int/lit8 v7, v7, 0x1

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_8
    sget-object v6, Ln7/f;->j:[Ln7/f;

    .line 73
    .line 74
    move v7, v5

    .line 75
    :goto_4
    const/4 v8, 0x7

    .line 76
    if-ge v7, v8, :cond_a

    .line 77
    .line 78
    aget-object v8, v6, v7

    .line 79
    .line 80
    iget v9, v8, Lg3/s;->h:I

    .line 81
    .line 82
    if-ne p0, v9, :cond_9

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_9
    add-int/lit8 v7, v7, 0x1

    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_a
    :goto_5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    cmpg-float v6, v4, v6

    .line 95
    .line 96
    if-gez v6, :cond_b

    .line 97
    .line 98
    move v6, v3

    .line 99
    goto :goto_6

    .line 100
    :cond_b
    move v6, v5

    .line 101
    :goto_6
    if-eqz v6, :cond_c

    .line 102
    .line 103
    neg-float v4, v4

    .line 104
    :cond_c
    invoke-static {v1}, Lt3/c;->b(I)I

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    mul-int/2addr v1, v2

    .line 109
    :goto_7
    if-ge v5, v1, :cond_d

    .line 110
    .line 111
    mul-int/lit8 v3, v3, 0xa

    .line 112
    .line 113
    add-int/lit8 v5, v5, 0x1

    .line 114
    .line 115
    goto :goto_7

    .line 116
    :cond_d
    int-to-float v1, v3

    .line 117
    mul-float/2addr v4, v1

    .line 118
    float-to-int v2, v4

    .line 119
    int-to-float v3, v2

    .line 120
    sub-float/2addr v4, v3

    .line 121
    const/high16 v3, 0x3f000000    # 0.5f

    .line 122
    .line 123
    cmpl-float v3, v4, v3

    .line 124
    .line 125
    if-ltz v3, :cond_e

    .line 126
    .line 127
    add-int/lit8 v2, v2, 0x1

    .line 128
    .line 129
    :cond_e
    int-to-float v2, v2

    .line 130
    div-float/2addr v2, v1

    .line 131
    if-eqz v6, :cond_f

    .line 132
    .line 133
    neg-float v2, v2

    .line 134
    :cond_f
    if-eqz p1, :cond_10

    .line 135
    .line 136
    const/high16 p1, 0x42c80000    # 100.0f

    .line 137
    .line 138
    mul-float/2addr v2, p1

    .line 139
    :cond_10
    invoke-static {v2}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_11
    new-instance p0, Ljava/lang/NumberFormatException;

    .line 155
    .line 156
    const-string p1, "Unknown radix flag = "

    .line 157
    .line 158
    invoke-static {v0, p1}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-direct {p0, p1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p0
.end method


# virtual methods
.method public a(Lud/r;Lud/n;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public abstract a0(Lz2/f;Lz2/f;)V
.end method

.method public b(Lud/r;Lud/n;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract b0(Lz2/f;Ljava/lang/Thread;)V
.end method

.method public d(Lud/r;Lud/h;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract k(Lz2/g;Lz2/c;)Z
.end method

.method public abstract l(Lz2/g;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract m(Lz2/g;Lz2/f;Lz2/f;)Z
.end method
