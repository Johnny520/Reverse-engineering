.class public final Lb5/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv0/e;
.implements Lj8/q;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    sparse-switch p1, :sswitch_data_0

    .line 133
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 134
    new-instance p1, Ll3/w;

    const/16 v0, 0x11

    .line 135
    invoke-direct {p1, v0}, Ll3/w;-><init>(I)V

    .line 136
    iput-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    return-void

    .line 137
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance p1, Lm/a;

    const/16 v0, 0x1c

    invoke-direct {p1, v0}, Lm/a;-><init>(I)V

    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 139
    new-instance p1, Lm/a;

    invoke-direct {p1, v0}, Lm/a;-><init>(I)V

    iput-object p1, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 140
    new-instance p1, Lm/a;

    invoke-direct {p1, v0}, Lm/a;-><init>(I)V

    iput-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    return-void

    .line 141
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Ls0/i;->b:Ls0/j;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 143
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 144
    iput-object p1, p0, Lb5/c;->b:Ljava/lang/Object;

    return-void

    .line 145
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 146
    sget-object p1, Lf/r0;->a:[J

    .line 147
    new-instance p1, Lf/k0;

    invoke-direct {p1}, Lf/k0;-><init>()V

    .line 148
    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    return-void

    .line 149
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 150
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 151
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 152
    new-instance p1, Ljava/util/WeakHashMap;

    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x12 -> :sswitch_3
        0x15 -> :sswitch_2
        0x16 -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La5/a;Lk5/o;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 5
    .line 6
    new-instance p1, La2/a;

    .line 7
    .line 8
    const/4 v0, 0x7

    .line 9
    invoke-direct {p1, v0}, La2/a;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance p1, Ljava/util/HashSet;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-virtual {p2, v0}, Lk5/o;->f1(Z)Ljava/lang/Iterable;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lk5/z;

    .line 39
    .line 40
    invoke-virtual {v1}, Lk5/z;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, "<clinit>"

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {v1}, Lk5/z;->i1()Lac/k;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    invoke-virtual {v1}, Lac/k;->p()Lk5/b0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1}, Lk5/b0;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :catch_0
    :cond_1
    :goto_0
    move-object v2, v1

    .line 67
    check-cast v2, Lo5/t;

    .line 68
    .line 69
    invoke-virtual {v2}, Lo5/t;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_0

    .line 74
    .line 75
    invoke-virtual {v2}, Lo5/t;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lt5/d;

    .line 80
    .line 81
    invoke-interface {v2}, Lt5/d;->i()Lf5/f;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    packed-switch v3, :pswitch_data_0

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :pswitch_0
    check-cast v2, Ll5/i;

    .line 94
    .line 95
    invoke-interface {v2}, Lt5/h;->a()Lv5/b;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Li5/a;

    .line 100
    .line 101
    :try_start_0
    invoke-interface {v2}, Lv5/b;->a()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Li5/a;->f1()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-virtual {p2}, Lk5/o;->getType()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-eqz v3, :cond_1

    .line 117
    .line 118
    iget-object v3, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v3, La2/a;

    .line 121
    .line 122
    invoke-virtual {v3, v2}, La2/a;->h(Li5/a;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lv5/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_2
    iput-object p1, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 131
    .line 132
    return-void

    .line 133
    :pswitch_data_0
    .packed-switch 0x61
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 2

    sparse-switch p2, :sswitch_data_0

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    const-string p2, "Hchat_moments_fake_interaction_config"

    .line 155
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 156
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    return-void

    .line 157
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    if-eqz p2, :cond_0

    move-object p1, p2

    :cond_0
    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 159
    new-instance p1, Ljava/text/SimpleDateFormat;

    sget-object p2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "yyyy-MM-dd HH:mm:ss.SSS"

    invoke-direct {p1, v0, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 160
    new-instance p1, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd_HH-mm"

    invoke-direct {p1, v0, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    return-void

    .line 161
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 162
    invoke-static {}, Lj8/b;->o()Ljava/util/Set;

    move-result-object p1

    .line 163
    iput-object p1, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 164
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v0, 0x0

    invoke-direct {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0xd -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Li4/s;Li4/n;Lz4/g;)V
    .locals 0

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 167
    invoke-virtual {p3}, Lz4/j;->k()V

    .line 168
    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 169
    iput-object p2, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 170
    iput-object p3, p0, Lb5/c;->c:Ljava/lang/Object;

    return-void

    .line 171
    :cond_0
    const-string p1, "stack == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    .line 172
    :cond_1
    const-string p1, "locals == null"

    invoke-static {p1}, Lbsh/j;->c(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    iput-object p2, p0, Lb5/c;->b:Ljava/lang/Object;

    iput-object p3, p0, Lb5/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm2/r;Lb5/c;)V
    .locals 0

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 174
    iput-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 175
    iput-object p2, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 176
    iget-object p1, p1, Lm2/r;->g:Ljava/lang/Object;

    .line 177
    iput-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    return-void
.end method

.method public static B(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v0, "@chatroom"

    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "@im.chatroom"

    .line 20
    .line 21
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    :cond_0
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_1
    return v1
.end method

.method public static I(Ljava/util/LinkedHashMap;Ljava/lang/String;Lia/c;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lia/c;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static W(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 12

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {}, La/a;->E()Luf/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-lt v2, v1, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_4

    .line 27
    .line 28
    const-string v4, "id"

    .line 29
    .line 30
    invoke-static {v4, v3}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_2

    .line 39
    .line 40
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    :cond_2
    move-object v6, v4

    .line 52
    const-string v4, "author"

    .line 53
    .line 54
    invoke-static {v4, v3}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    const-string v4, "authorName"

    .line 59
    .line 60
    invoke-static {v4, v3}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-nez v5, :cond_3

    .line 69
    .line 70
    move-object v8, v7

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move-object v8, v4

    .line 73
    :goto_1
    const-string v4, "content"

    .line 74
    .line 75
    invoke-static {v4, v3}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    const-string v4, "time"

    .line 80
    .line 81
    const-wide/16 v10, 0x0

    .line 82
    .line 83
    invoke-virtual {v3, v4, v10, v11}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 84
    .line 85
    .line 86
    move-result-wide v3

    .line 87
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-lez v5, :cond_4

    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-lez v5, :cond_4

    .line 98
    .line 99
    cmp-long v5, v3, v10

    .line 100
    .line 101
    if-lez v5, :cond_4

    .line 102
    .line 103
    new-instance v5, Lia/b;

    .line 104
    .line 105
    move-wide v10, v3

    .line 106
    invoke-direct/range {v5 .. v11}, Lia/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v5}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_0
.end method

.method public static X(Lia/b;)Lorg/json/JSONObject;
    .locals 4

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "id"

    .line 7
    .line 8
    iget-object v2, p0, Lia/b;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "author"

    .line 15
    .line 16
    iget-object v2, p0, Lia/b;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "authorName"

    .line 23
    .line 24
    iget-object v2, p0, Lia/b;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "content"

    .line 31
    .line 32
    iget-object v2, p0, Lia/b;->d:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "time"

    .line 39
    .line 40
    iget-wide v2, p0, Lia/b;->e:J

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method public static Y(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 9

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-static {}, La/a;->E()Luf/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-lt v2, v1, :cond_1

    .line 16
    .line 17
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    instance-of v4, v3, Lorg/json/JSONObject;

    .line 27
    .line 28
    const-string v5, ""

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    move-object v7, v3

    .line 34
    check-cast v7, Lorg/json/JSONObject;

    .line 35
    .line 36
    const-string v8, "wxId"

    .line 37
    .line 38
    invoke-static {v8, v7}, Lwb/en;->j(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    if-eqz v3, :cond_3

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object v7, v6

    .line 51
    :goto_1
    if-nez v7, :cond_4

    .line 52
    .line 53
    move-object v7, v5

    .line 54
    :cond_4
    invoke-static {v7}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    :goto_2
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-nez v8, :cond_5

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_5
    if-eqz v4, :cond_6

    .line 70
    .line 71
    check-cast v3, Lorg/json/JSONObject;

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_6
    move-object v3, v6

    .line 75
    :goto_3
    if-eqz v3, :cond_7

    .line 76
    .line 77
    const-string v4, "displayName"

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-eqz v3, :cond_7

    .line 84
    .line 85
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    :cond_7
    if-nez v6, :cond_8

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_8
    move-object v5, v6

    .line 97
    :goto_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-nez v3, :cond_9

    .line 102
    .line 103
    move-object v5, v7

    .line 104
    :cond_9
    new-instance v3, Lia/d;

    .line 105
    .line 106
    invoke-direct {v3, v7, v5}, Lia/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Lf8/i;->s0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const-string p0, "sendid_"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    const-string v0, "hb_amount_"

    .line 18
    .line 19
    invoke-static {v0, p0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static h(Lia/b;)Lsf/j;
    .locals 3

    .line 1
    new-instance v0, Lsf/j;

    .line 2
    .line 3
    iget-object v1, p0, Lia/b;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lia/b;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lia/b;->d:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p0}, Lsf/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static z(Lnd/t;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lnd/t;->b:Lud/a;

    .line 2
    .line 3
    iget-object v1, v0, Lud/a;->m:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x1

    .line 10
    if-gt v2, v3, :cond_0

    .line 11
    .line 12
    goto/16 :goto_1

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lnd/t;->b()Ljava/util/HashSet;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_8

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lud/a;

    .line 33
    .line 34
    sget-object v4, Lmd/a;->m:Lmd/a;

    .line 35
    .line 36
    iget-object v5, v3, Lmd/e;->g:Lmd/f;

    .line 37
    .line 38
    invoke-virtual {v5, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    sget-object v4, Lpd/k;->U:Lpd/k;

    .line 45
    .line 46
    invoke-static {v3, v4}, La/a;->v(Lud/h;Lpd/k;)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    iget-object v5, v3, Lud/a;->m:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    const/4 v6, 0x0

    .line 63
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lud/a;

    .line 68
    .line 69
    sget-object v7, Lmd/a;->z:Lmd/a;

    .line 70
    .line 71
    iget-object v8, v5, Lmd/e;->g:Lmd/f;

    .line 72
    .line 73
    invoke-virtual {v8, v7}, Lmd/f;->a(Lmd/a;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_4

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    iget-object v7, v0, Lud/a;->p:Ljava/util/BitSet;

    .line 81
    .line 82
    iget v8, v5, Lud/a;->j:I

    .line 83
    .line 84
    invoke-virtual {v7, v8}, Ljava/util/BitSet;->get(I)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-nez v7, :cond_1

    .line 89
    .line 90
    invoke-virtual {p0, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_5

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    :cond_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    if-eqz v8, :cond_1

    .line 106
    .line 107
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, Lud/a;

    .line 112
    .line 113
    iget-object v8, v8, Lud/a;->p:Ljava/util/BitSet;

    .line 114
    .line 115
    iget v9, v5, Lud/a;->j:I

    .line 116
    .line 117
    invoke-virtual {v8, v9}, Ljava/util/BitSet;->get(I)Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-nez v8, :cond_6

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    :cond_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-eqz v8, :cond_1

    .line 132
    .line 133
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    check-cast v8, Lud/a;

    .line 138
    .line 139
    invoke-static {v5, v8}, La/a;->s0(Lud/a;Lud/a;)Z

    .line 140
    .line 141
    .line 142
    move-result v8

    .line 143
    if-eqz v8, :cond_7

    .line 144
    .line 145
    new-instance v5, Lud/p;

    .line 146
    .line 147
    invoke-direct {v5, v4, v6}, Lud/p;-><init>(Lpd/k;I)V

    .line 148
    .line 149
    .line 150
    iget-object v3, v3, Lud/a;->l:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_8
    :goto_1
    return-void
.end method


# virtual methods
.method public A(Lle/c;Lnd/t;Lud/a;Lud/f;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v1, Lb5/c;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lud/r;

    .line 10
    .line 11
    iget-object v4, v2, Lud/f;->b:Lud/a;

    .line 12
    .line 13
    invoke-static {v4}, La/a;->K(Lud/a;)Lud/a;

    .line 14
    .line 15
    .line 16
    move-result-object v5

    .line 17
    iget-object v5, v5, Lmd/e;->g:Lmd/f;

    .line 18
    .line 19
    sget-object v6, Lmd/b;->z:Lmd/b;

    .line 20
    .line 21
    invoke-virtual {v5, v6}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v7

    .line 33
    const/4 v8, 0x1

    .line 34
    const/4 v9, 0x0

    .line 35
    const/4 v10, 0x0

    .line 36
    if-eqz v7, :cond_3

    .line 37
    .line 38
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, Lnd/t;

    .line 43
    .line 44
    if-eq v7, v0, :cond_0

    .line 45
    .line 46
    iget-object v11, v0, Lnd/t;->e:Lnd/t;

    .line 47
    .line 48
    :goto_1
    if-nez v11, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    if-ne v11, v7, :cond_2

    .line 52
    .line 53
    move-object v7, v2

    .line 54
    move v5, v8

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    iget-object v11, v11, Lnd/t;->e:Lnd/t;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v7, v9

    .line 60
    move v5, v10

    .line 61
    :goto_2
    if-nez v5, :cond_b

    .line 62
    .line 63
    new-instance v11, Ljava/util/BitSet;

    .line 64
    .line 65
    iget-object v12, v3, Lud/r;->z:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v12

    .line 71
    invoke-direct {v11, v12}, Ljava/util/BitSet;-><init>(I)V

    .line 72
    .line 73
    .line 74
    move-object v12, v4

    .line 75
    move-object v13, v9

    .line 76
    :goto_3
    if-eqz v12, :cond_c

    .line 77
    .line 78
    iget v14, v12, Lud/a;->j:I

    .line 79
    .line 80
    invoke-virtual {v11, v14}, Ljava/util/BitSet;->get(I)Z

    .line 81
    .line 82
    .line 83
    move-result v14

    .line 84
    if-eqz v14, :cond_4

    .line 85
    .line 86
    goto/16 :goto_5

    .line 87
    .line 88
    :cond_4
    iget v14, v12, Lud/a;->j:I

    .line 89
    .line 90
    invoke-virtual {v11, v14}, Ljava/util/BitSet;->set(I)V

    .line 91
    .line 92
    .line 93
    move-object/from16 v14, p3

    .line 94
    .line 95
    if-eqz v13, :cond_9

    .line 96
    .line 97
    invoke-static {v14, v12}, La/a;->s0(Lud/a;Lud/a;)Z

    .line 98
    .line 99
    .line 100
    move-result v15

    .line 101
    if-eqz v15, :cond_9

    .line 102
    .line 103
    invoke-static {v13}, La/a;->A(Lud/h;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    goto/16 :goto_6

    .line 110
    .line 111
    :cond_5
    invoke-static {v13}, La/a;->u(Lud/a;)Ljava/util/List;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-nez v7, :cond_6

    .line 120
    .line 121
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    sub-int/2addr v7, v8

    .line 126
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Lud/a;

    .line 131
    .line 132
    sget-object v7, Lmd/a;->h:Lmd/a;

    .line 133
    .line 134
    iget-object v11, v5, Lmd/e;->g:Lmd/f;

    .line 135
    .line 136
    invoke-virtual {v11, v7}, Lmd/f;->a(Lmd/a;)Z

    .line 137
    .line 138
    .line 139
    move-result v7

    .line 140
    if-nez v7, :cond_d

    .line 141
    .line 142
    sget-object v7, Lmd/a;->n:Lmd/a;

    .line 143
    .line 144
    iget-object v11, v5, Lmd/e;->g:Lmd/f;

    .line 145
    .line 146
    invoke-virtual {v11, v7}, Lmd/f;->a(Lmd/a;)Z

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    if-nez v7, :cond_d

    .line 151
    .line 152
    invoke-virtual {v3, v5}, Lud/r;->Y(Lud/a;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_6

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_6
    iget-object v5, v3, Lud/r;->B:Lud/a;

    .line 160
    .line 161
    invoke-static {v5, v13}, La/a;->P(Lud/a;Lud/a;)Ljava/util/HashSet;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    if-eqz v7, :cond_8

    .line 174
    .line 175
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    check-cast v7, Lud/a;

    .line 180
    .line 181
    sget-object v11, Lpd/k;->w:Lpd/k;

    .line 182
    .line 183
    invoke-static {v7, v11}, La/a;->v(Lud/h;Lpd/k;)Z

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    if-eqz v7, :cond_7

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_8
    new-instance v7, Lud/f;

    .line 191
    .line 192
    iget-object v5, v13, Lud/a;->n:Ljava/util/List;

    .line 193
    .line 194
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v5

    .line 198
    check-cast v5, Lud/a;

    .line 199
    .line 200
    invoke-direct {v7, v13, v5}, Lud/f;-><init>(Lud/a;Lud/a;)V

    .line 201
    .line 202
    .line 203
    move v5, v8

    .line 204
    goto :goto_5

    .line 205
    :cond_9
    iget-object v13, v12, Lud/a;->o:Ljava/util/List;

    .line 206
    .line 207
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 208
    .line 209
    .line 210
    move-result v15

    .line 211
    if-ne v15, v8, :cond_a

    .line 212
    .line 213
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    check-cast v13, Lud/a;

    .line 218
    .line 219
    goto :goto_4

    .line 220
    :cond_a
    move-object v13, v9

    .line 221
    :goto_4
    move-object/from16 v16, v13

    .line 222
    .line 223
    move-object v13, v12

    .line 224
    move-object/from16 v12, v16

    .line 225
    .line 226
    goto/16 :goto_3

    .line 227
    .line 228
    :cond_b
    move-object v12, v4

    .line 229
    :cond_c
    :goto_5
    if-nez v5, :cond_e

    .line 230
    .line 231
    :cond_d
    :goto_6
    return v10

    .line 232
    :cond_e
    new-instance v5, Lud/p;

    .line 233
    .line 234
    sget-object v11, Lpd/k;->T:Lpd/k;

    .line 235
    .line 236
    invoke-direct {v5, v11, v10}, Lud/p;-><init>(Lpd/k;I)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v6, v0}, Lmd/e;->x(Lmd/b;Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    iget-object v0, v7, Lud/f;->a:Lud/a;

    .line 243
    .line 244
    iget-object v6, v7, Lud/f;->b:Lud/a;

    .line 245
    .line 246
    new-instance v7, Lnd/f;

    .line 247
    .line 248
    invoke-direct {v7, v0, v6, v5}, Lnd/f;-><init>(Lud/a;Lud/a;Lud/p;)V

    .line 249
    .line 250
    .line 251
    iget-object v10, v0, Lmd/e;->g:Lmd/f;

    .line 252
    .line 253
    sget-object v11, Lmd/b;->A:Lmd/b;

    .line 254
    .line 255
    invoke-virtual {v10, v11}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v10

    .line 259
    invoke-interface {v10, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v10

    .line 263
    if-nez v10, :cond_f

    .line 264
    .line 265
    invoke-virtual {v0, v11, v7}, Lmd/e;->x(Lmd/b;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    :cond_f
    iget-object v0, v6, Lmd/e;->g:Lmd/f;

    .line 269
    .line 270
    invoke-virtual {v0, v11}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-nez v0, :cond_10

    .line 279
    .line 280
    invoke-virtual {v6, v11, v7}, Lmd/e;->x(Lmd/b;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_10
    move-object/from16 v0, p1

    .line 284
    .line 285
    invoke-virtual {v0, v12}, Lle/c;->a(Lud/a;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v4}, La/a;->d0(Lud/a;)Lud/a;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    if-nez v0, :cond_11

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_11
    invoke-virtual {v3, v0}, Lud/r;->R(Lud/a;)Ljava/util/List;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-nez v0, :cond_12

    .line 304
    .line 305
    goto :goto_7

    .line 306
    :cond_12
    iget-object v0, v2, Lud/f;->a:Lud/a;

    .line 307
    .line 308
    invoke-virtual {v3, v0}, Lud/r;->R(Lud/a;)Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 313
    .line 314
    .line 315
    move-result v2

    .line 316
    const/4 v3, 0x2

    .line 317
    if-ge v2, v3, :cond_13

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    if-eqz v2, :cond_15

    .line 329
    .line 330
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    check-cast v2, Lnd/t;

    .line 335
    .line 336
    iget-object v3, v2, Lnd/t;->e:Lnd/t;

    .line 337
    .line 338
    if-nez v3, :cond_14

    .line 339
    .line 340
    move-object v9, v2

    .line 341
    :cond_15
    if-nez v9, :cond_16

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_16
    iget-object v0, v9, Lnd/t;->b:Lud/a;

    .line 345
    .line 346
    if-eq v0, v12, :cond_17

    .line 347
    .line 348
    invoke-virtual {v9}, Lnd/t;->b()Ljava/util/HashSet;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {v0, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_17

    .line 357
    .line 358
    new-instance v0, Lnd/u;

    .line 359
    .line 360
    invoke-direct {v0, v9}, Lnd/u;-><init>(Lnd/t;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v5, v0}, Lmd/e;->y(Loc/b;)V

    .line 364
    .line 365
    .line 366
    iget-object v2, v9, Lnd/t;->a:Lud/a;

    .line 367
    .line 368
    invoke-virtual {v2, v0}, Lmd/e;->y(Loc/b;)V

    .line 369
    .line 370
    .line 371
    :cond_17
    :goto_7
    return v8
.end method

.method public C()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm/a;

    .line 4
    .line 5
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lx1/a2;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lm/a;

    .line 19
    .line 20
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lx1/a2;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lm/a;

    .line 33
    .line 34
    iget-object v0, v0, Lm/a;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lx1/a2;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    move v0, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v0, 0x0

    .line 47
    :goto_0
    xor-int/2addr v0, v1

    .line 48
    return v0
.end method

.method public D()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li0/l2;

    .line 4
    .line 5
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lb5/c;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lb5/c;->D()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    return v0

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 29
    return v0
.end method

.method public E()Ljava/io/File;
    .locals 8

    .line 1
    iget-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/Context;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Landroid/content/Context;->getExternalMediaDirs()[Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    array-length v3, v2

    .line 13
    const/4 v4, 0x0

    .line 14
    move v5, v4

    .line 15
    :goto_0
    if-ge v5, v3, :cond_2

    .line 16
    .line 17
    aget-object v6, v2, v5

    .line 18
    .line 19
    if-eqz v6, :cond_0

    .line 20
    .line 21
    const/4 v7, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move v7, v4

    .line 24
    :goto_1
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object v7

    .line 28
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    if-eqz v7, :cond_1

    .line 33
    .line 34
    move-object v1, v6

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    :cond_2
    :goto_2
    if-eqz v1, :cond_3

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    new-instance v1, Ljava/io/File;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v2, "/storage/emulated/0/Android/media/"

    .line 49
    .line 50
    invoke-static {v2, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_3
    new-instance v0, Ljava/io/File;

    .line 58
    .line 59
    const-string v2, "Hchat/\u6293\u5305\u65e5\u5fd7"

    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v0
.end method

.method public F(IILb5/c;)Lb5/c;
    .locals 7

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz4/g;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Li4/s;

    .line 8
    .line 9
    iget-object v2, p3, Lb5/c;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Li4/s;

    .line 12
    .line 13
    invoke-virtual {v1, v2, p2}, Li4/s;->r(Li4/s;I)Li4/t;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iget-object v2, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Li4/n;

    .line 20
    .line 21
    iget-object v3, p3, Lb5/c;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Li4/n;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-static {v2, v3}, Lx6/d;->N(Li4/n;Li4/n;)Li4/n;

    .line 29
    .line 30
    .line 31
    move-result-object v3
    :try_end_0
    .catch Li4/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    iget-object p3, p3, Lb5/c;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p3, Lz4/g;

    .line 35
    .line 36
    invoke-virtual {p3}, Lz4/g;->p()Lz4/g;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    invoke-virtual {p3, p1}, Lz4/g;->l(I)V

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-boolean p1, p3, Lz4/j;->g:Z

    .line 45
    .line 46
    if-ne p2, v1, :cond_0

    .line 47
    .line 48
    if-ne v3, v2, :cond_0

    .line 49
    .line 50
    invoke-virtual {v0, p3}, Lz4/g;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_0
    invoke-virtual {v0, p3}, Lz4/g;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_1

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    iget p1, v0, Lz4/g;->i:I

    .line 65
    .line 66
    iget v1, p3, Lz4/g;->i:I

    .line 67
    .line 68
    if-le p1, v1, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move-object v6, v0

    .line 72
    move-object v0, p3

    .line 73
    move-object p3, v6

    .line 74
    :goto_0
    iget p1, v0, Lz4/g;->i:I

    .line 75
    .line 76
    iget v1, p3, Lz4/g;->i:I

    .line 77
    .line 78
    add-int/lit8 v2, v1, -0x1

    .line 79
    .line 80
    :goto_1
    if-ltz v2, :cond_4

    .line 81
    .line 82
    invoke-virtual {p3, v2}, Lz4/g;->n(I)I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    sub-int v5, p1, v1

    .line 87
    .line 88
    add-int/2addr v5, v2

    .line 89
    invoke-virtual {v0, v5}, Lz4/g;->n(I)I

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-ne v4, v5, :cond_3

    .line 94
    .line 95
    add-int/lit8 v2, v2, -0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    const-string p1, "Incompatible merged subroutines"

    .line 99
    .line 100
    invoke-static {p1}, Lbsh/j;->g(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const/4 p1, 0x0

    .line 104
    return-object p1

    .line 105
    :cond_4
    :goto_2
    new-instance p1, Lb5/c;

    .line 106
    .line 107
    invoke-direct {p1, p2, v3, v0}, Lb5/c;-><init>(Li4/s;Li4/n;Lz4/g;)V

    .line 108
    .line 109
    .line 110
    return-object p1

    .line 111
    :catch_0
    move-exception p1

    .line 112
    const-string p2, "underlay stack:"

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, p1}, Li4/n;->l(Li4/b0;)V

    .line 118
    .line 119
    .line 120
    const-string p2, "overlay stack:"

    .line 121
    .line 122
    invoke-virtual {p1, p2}, Lf4/a;->a(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3, p1}, Li4/n;->l(Li4/b0;)V

    .line 126
    .line 127
    .line 128
    throw p1
.end method

.method public G(Ljava/lang/CharSequence;IIIZLl3/o;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    new-instance v5, Lk4/a;

    .line 12
    .line 13
    iget-object v6, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Lhb/c;

    .line 16
    .line 17
    iget-object v6, v6, Lhb/c;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Ll3/t;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Lk4/a;-><init>(Ll3/t;)V

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    move v11, v8

    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    :cond_0
    :goto_0
    move v7, v6

    .line 36
    :goto_1
    const/4 v12, 0x2

    .line 37
    if-ge v6, v2, :cond_f

    .line 38
    .line 39
    if-ge v10, v3, :cond_f

    .line 40
    .line 41
    if-eqz v11, :cond_f

    .line 42
    .line 43
    iget-object v13, v5, Lk4/a;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v13, Ll3/t;

    .line 46
    .line 47
    iget-object v13, v13, Ll3/t;->a:Landroid/util/SparseArray;

    .line 48
    .line 49
    if-nez v13, :cond_1

    .line 50
    .line 51
    const/4 v13, 0x0

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v13

    .line 57
    check-cast v13, Ll3/t;

    .line 58
    .line 59
    :goto_2
    iget v14, v5, Lk4/a;->a:I

    .line 60
    .line 61
    const/4 v15, 0x3

    .line 62
    if-eq v14, v12, :cond_3

    .line 63
    .line 64
    if-nez v13, :cond_2

    .line 65
    .line 66
    invoke-virtual {v5}, Lk4/a;->b()V

    .line 67
    .line 68
    .line 69
    :goto_3
    move v13, v8

    .line 70
    goto :goto_6

    .line 71
    :cond_2
    iput v12, v5, Lk4/a;->a:I

    .line 72
    .line 73
    iput-object v13, v5, Lk4/a;->e:Ljava/lang/Object;

    .line 74
    .line 75
    iput v8, v5, Lk4/a;->c:I

    .line 76
    .line 77
    :goto_4
    move v13, v12

    .line 78
    goto :goto_6

    .line 79
    :cond_3
    if-eqz v13, :cond_4

    .line 80
    .line 81
    iput-object v13, v5, Lk4/a;->e:Ljava/lang/Object;

    .line 82
    .line 83
    iget v13, v5, Lk4/a;->c:I

    .line 84
    .line 85
    add-int/2addr v13, v8

    .line 86
    iput v13, v5, Lk4/a;->c:I

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_4
    const v13, 0xfe0e

    .line 90
    .line 91
    .line 92
    if-ne v9, v13, :cond_5

    .line 93
    .line 94
    invoke-virtual {v5}, Lk4/a;->b()V

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    const v13, 0xfe0f

    .line 99
    .line 100
    .line 101
    if-ne v9, v13, :cond_6

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_6
    iget-object v13, v5, Lk4/a;->e:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v13, Ll3/t;

    .line 107
    .line 108
    iget-object v14, v13, Ll3/t;->b:Ll3/u;

    .line 109
    .line 110
    if-eqz v14, :cond_9

    .line 111
    .line 112
    iget v14, v5, Lk4/a;->c:I

    .line 113
    .line 114
    if-ne v14, v8, :cond_8

    .line 115
    .line 116
    invoke-virtual {v5}, Lk4/a;->c()Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    if-eqz v13, :cond_7

    .line 121
    .line 122
    iget-object v13, v5, Lk4/a;->e:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v13, Ll3/t;

    .line 125
    .line 126
    iput-object v13, v5, Lk4/a;->f:Ljava/lang/Object;

    .line 127
    .line 128
    invoke-virtual {v5}, Lk4/a;->b()V

    .line 129
    .line 130
    .line 131
    :goto_5
    move v13, v15

    .line 132
    goto :goto_6

    .line 133
    :cond_7
    invoke-virtual {v5}, Lk4/a;->b()V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    iput-object v13, v5, Lk4/a;->f:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-virtual {v5}, Lk4/a;->b()V

    .line 140
    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_9
    invoke-virtual {v5}, Lk4/a;->b()V

    .line 144
    .line 145
    .line 146
    goto :goto_3

    .line 147
    :goto_6
    iput v9, v5, Lk4/a;->b:I

    .line 148
    .line 149
    if-eq v13, v8, :cond_e

    .line 150
    .line 151
    if-eq v13, v12, :cond_c

    .line 152
    .line 153
    if-eq v13, v15, :cond_a

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_a
    if-nez p5, :cond_b

    .line 157
    .line 158
    iget-object v12, v5, Lk4/a;->f:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v12, Ll3/t;

    .line 161
    .line 162
    iget-object v12, v12, Ll3/t;->b:Ll3/u;

    .line 163
    .line 164
    invoke-virtual {v0, v1, v7, v6, v12}, Lb5/c;->w(Ljava/lang/CharSequence;IILl3/u;)Z

    .line 165
    .line 166
    .line 167
    move-result v12

    .line 168
    if-nez v12, :cond_0

    .line 169
    .line 170
    :cond_b
    iget-object v11, v5, Lk4/a;->f:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v11, Ll3/t;

    .line 173
    .line 174
    iget-object v11, v11, Ll3/t;->b:Ll3/u;

    .line 175
    .line 176
    invoke-interface {v4, v1, v7, v6, v11}, Ll3/o;->a(Ljava/lang/CharSequence;IILl3/u;)Z

    .line 177
    .line 178
    .line 179
    move-result v11

    .line 180
    add-int/lit8 v10, v10, 0x1

    .line 181
    .line 182
    goto/16 :goto_0

    .line 183
    .line 184
    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    add-int/2addr v12, v6

    .line 189
    if-ge v12, v2, :cond_d

    .line 190
    .line 191
    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    move v9, v6

    .line 196
    :cond_d
    move v6, v12

    .line 197
    goto/16 :goto_1

    .line 198
    .line 199
    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    add-int/2addr v6, v7

    .line 208
    if-ge v6, v2, :cond_0

    .line 209
    .line 210
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    move v9, v7

    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_f
    iget v2, v5, Lk4/a;->a:I

    .line 218
    .line 219
    if-ne v2, v12, :cond_12

    .line 220
    .line 221
    iget-object v2, v5, Lk4/a;->e:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v2, Ll3/t;

    .line 224
    .line 225
    iget-object v2, v2, Ll3/t;->b:Ll3/u;

    .line 226
    .line 227
    if-eqz v2, :cond_12

    .line 228
    .line 229
    iget v2, v5, Lk4/a;->c:I

    .line 230
    .line 231
    if-gt v2, v8, :cond_10

    .line 232
    .line 233
    invoke-virtual {v5}, Lk4/a;->c()Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_12

    .line 238
    .line 239
    :cond_10
    if-ge v10, v3, :cond_12

    .line 240
    .line 241
    if-eqz v11, :cond_12

    .line 242
    .line 243
    if-nez p5, :cond_11

    .line 244
    .line 245
    iget-object v2, v5, Lk4/a;->e:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v2, Ll3/t;

    .line 248
    .line 249
    iget-object v2, v2, Ll3/t;->b:Ll3/u;

    .line 250
    .line 251
    invoke-virtual {v0, v1, v7, v6, v2}, Lb5/c;->w(Ljava/lang/CharSequence;IILl3/u;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-nez v2, :cond_12

    .line 256
    .line 257
    :cond_11
    iget-object v2, v5, Lk4/a;->e:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v2, Ll3/t;

    .line 260
    .line 261
    iget-object v2, v2, Ll3/t;->b:Ll3/u;

    .line 262
    .line 263
    invoke-interface {v4, v1, v7, v6, v2}, Ll3/o;->a(Ljava/lang/CharSequence;IILl3/u;)Z

    .line 264
    .line 265
    .line 266
    :cond_12
    invoke-interface {v4}, Ll3/o;->e()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    return-object v1
.end method

.method public H(Lxd/b;Lnd/t;Lle/c;)Lud/a;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v1, Lxd/b;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v5, v0, Lb5/c;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v5, Lud/r;

    .line 14
    .line 15
    iget-object v6, v0, Lb5/c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v6, Li4/y;

    .line 18
    .line 19
    iget-object v7, v6, Li4/y;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v7, Lze/c;

    .line 22
    .line 23
    iget-object v8, v2, Lnd/t;->a:Lud/a;

    .line 24
    .line 25
    iget-object v9, v2, Lnd/t;->b:Lud/a;

    .line 26
    .line 27
    invoke-virtual {v2}, Lnd/t;->b()Ljava/util/HashSet;

    .line 28
    .line 29
    .line 30
    move-result-object v10

    .line 31
    new-instance v11, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v10}, Ljava/util/HashSet;->size()I

    .line 34
    .line 35
    .line 36
    move-result v12

    .line 37
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-static {v8}, La/a;->d0(Lud/a;)Lud/a;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    if-eqz v12, :cond_0

    .line 45
    .line 46
    invoke-virtual {v10, v12}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    if-eqz v13, :cond_0

    .line 51
    .line 52
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-virtual {v10, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    if-eqz v12, :cond_1

    .line 60
    .line 61
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v10, v9}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-eqz v12, :cond_2

    .line 69
    .line 70
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    sget-object v13, Lmd/b;->E:Lmd/b;

    .line 85
    .line 86
    sget-object v15, Lmd/b;->z:Lmd/b;

    .line 87
    .line 88
    if-eqz v12, :cond_26

    .line 89
    .line 90
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    check-cast v12, Lud/a;

    .line 95
    .line 96
    iget-object v14, v12, Lmd/e;->g:Lmd/f;

    .line 97
    .line 98
    invoke-virtual {v14, v13}, Lmd/f;->b(Loc/a;)Z

    .line 99
    .line 100
    .line 101
    move-result v14

    .line 102
    if-eqz v14, :cond_3

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    invoke-static {v12}, La/a;->c0(Lud/h;)Lud/p;

    .line 106
    .line 107
    .line 108
    move-result-object v14

    .line 109
    if-eqz v14, :cond_25

    .line 110
    .line 111
    iget-object v14, v14, Lud/p;->k:Lpd/k;

    .line 112
    .line 113
    move-object/from16 v17, v10

    .line 114
    .line 115
    sget-object v10, Lpd/k;->v:Lpd/k;

    .line 116
    .line 117
    if-eq v14, v10, :cond_4

    .line 118
    .line 119
    :goto_1
    move-object/from16 v10, v17

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    iget-object v10, v12, Lmd/e;->g:Lmd/f;

    .line 123
    .line 124
    invoke-virtual {v10, v15}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v10

    .line 128
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v14

    .line 132
    if-nez v14, :cond_5

    .line 133
    .line 134
    const/4 v14, 0x0

    .line 135
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    if-eq v10, v2, :cond_5

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_5
    iget-object v10, v2, Lnd/t;->a:Lud/a;

    .line 143
    .line 144
    if-ne v12, v9, :cond_6

    .line 145
    .line 146
    :goto_2
    move-object/from16 v18, v11

    .line 147
    .line 148
    const/4 v14, 0x1

    .line 149
    goto :goto_3

    .line 150
    :cond_6
    iget-object v14, v10, Lud/a;->l:Ljava/util/ArrayList;

    .line 151
    .line 152
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 153
    .line 154
    .line 155
    move-result v14

    .line 156
    if-eqz v14, :cond_8

    .line 157
    .line 158
    iget-object v14, v10, Lud/a;->n:Ljava/util/List;

    .line 159
    .line 160
    invoke-static {v14, v12}, Lbe/h;->E(Ljava/util/List;Ljava/lang/Comparable;)Z

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    if-eqz v14, :cond_8

    .line 165
    .line 166
    :cond_7
    move-object/from16 v18, v11

    .line 167
    .line 168
    const/4 v14, 0x0

    .line 169
    goto :goto_3

    .line 170
    :cond_8
    iget-object v14, v9, Lud/a;->l:Ljava/util/ArrayList;

    .line 171
    .line 172
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v14

    .line 176
    if-eqz v14, :cond_7

    .line 177
    .line 178
    iget-object v14, v9, Lud/a;->m:Ljava/util/List;

    .line 179
    .line 180
    invoke-static {v14, v12}, Lbe/h;->E(Ljava/util/List;Ljava/lang/Comparable;)Z

    .line 181
    .line 182
    .line 183
    move-result v14

    .line 184
    if-eqz v14, :cond_7

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :goto_3
    new-instance v11, Lzd/c;

    .line 188
    .line 189
    invoke-direct {v11, v1, v2, v12, v14}, Lzd/c;-><init>(Lxd/b;Lnd/t;Lud/a;Z)V

    .line 190
    .line 191
    .line 192
    move/from16 v19, v14

    .line 193
    .line 194
    if-eq v12, v10, :cond_1b

    .line 195
    .line 196
    if-nez v19, :cond_1b

    .line 197
    .line 198
    if-ne v10, v12, :cond_9

    .line 199
    .line 200
    iget-object v14, v10, Lud/a;->l:Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    if-eqz v14, :cond_9

    .line 207
    .line 208
    move-object/from16 v21, v9

    .line 209
    .line 210
    move-object/from16 v20, v13

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_9
    iget-object v14, v10, Lud/a;->l:Ljava/util/ArrayList;

    .line 214
    .line 215
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 216
    .line 217
    .line 218
    move-result v14

    .line 219
    if-eqz v14, :cond_d

    .line 220
    .line 221
    iget-object v14, v10, Lud/a;->o:Ljava/util/List;

    .line 222
    .line 223
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 224
    .line 225
    .line 226
    move-result v14

    .line 227
    move-object/from16 v20, v13

    .line 228
    .line 229
    const/4 v13, 0x1

    .line 230
    if-eq v14, v13, :cond_a

    .line 231
    .line 232
    :goto_4
    move-object/from16 v21, v9

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_a
    invoke-static {v10}, La/a;->d0(Lud/a;)Lud/a;

    .line 236
    .line 237
    .line 238
    move-result-object v14

    .line 239
    :goto_5
    if-eqz v14, :cond_b

    .line 240
    .line 241
    if-eq v14, v12, :cond_b

    .line 242
    .line 243
    iget-object v13, v14, Lud/a;->o:Ljava/util/List;

    .line 244
    .line 245
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 246
    .line 247
    .line 248
    move-result v13

    .line 249
    move-object/from16 v21, v9

    .line 250
    .line 251
    const/4 v9, 0x2

    .line 252
    if-ge v13, v9, :cond_c

    .line 253
    .line 254
    iget-object v9, v14, Lud/a;->m:Ljava/util/List;

    .line 255
    .line 256
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 257
    .line 258
    .line 259
    move-result v9

    .line 260
    const/4 v13, 0x1

    .line 261
    if-ne v9, v13, :cond_c

    .line 262
    .line 263
    iget-object v9, v14, Lud/a;->l:Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    if-eqz v9, :cond_c

    .line 270
    .line 271
    invoke-static {v14}, La/a;->d0(Lud/a;)Lud/a;

    .line 272
    .line 273
    .line 274
    move-result-object v14

    .line 275
    move-object/from16 v9, v21

    .line 276
    .line 277
    const/4 v13, 0x1

    .line 278
    goto :goto_5

    .line 279
    :cond_b
    move-object/from16 v21, v9

    .line 280
    .line 281
    :cond_c
    if-ne v14, v12, :cond_e

    .line 282
    .line 283
    :goto_6
    goto :goto_8

    .line 284
    :cond_d
    move-object/from16 v20, v13

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_e
    :goto_7
    iget-object v9, v12, Lud/a;->m:Ljava/util/List;

    .line 288
    .line 289
    invoke-interface {v9, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    if-eqz v9, :cond_1a

    .line 294
    .line 295
    iput-object v10, v11, Lzd/c;->p:Lud/a;

    .line 296
    .line 297
    iget-object v9, v10, Lud/a;->l:Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 300
    .line 301
    .line 302
    move-result v10

    .line 303
    if-eqz v10, :cond_10

    .line 304
    .line 305
    :cond_f
    :goto_8
    move-object/from16 v22, v6

    .line 306
    .line 307
    move-object/from16 v23, v11

    .line 308
    .line 309
    goto/16 :goto_f

    .line 310
    .line 311
    :cond_10
    iget-object v10, v11, Lyd/a;->k:Lyd/b;

    .line 312
    .line 313
    if-nez v10, :cond_11

    .line 314
    .line 315
    goto/16 :goto_d

    .line 316
    .line 317
    :cond_11
    invoke-virtual {v10}, Lyd/b;->J()Ljava/util/ArrayList;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 322
    .line 323
    .line 324
    move-result v13

    .line 325
    if-eqz v13, :cond_12

    .line 326
    .line 327
    goto/16 :goto_d

    .line 328
    .line 329
    :cond_12
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 330
    .line 331
    .line 332
    move-result v13

    .line 333
    const/4 v14, 0x0

    .line 334
    :goto_9
    if-ge v14, v13, :cond_f

    .line 335
    .line 336
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v22

    .line 340
    move-object/from16 v23, v11

    .line 341
    .line 342
    move-object/from16 v11, v22

    .line 343
    .line 344
    check-cast v11, Lud/p;

    .line 345
    .line 346
    iget-object v11, v11, Lud/p;->l:Lqd/r;

    .line 347
    .line 348
    if-nez v11, :cond_13

    .line 349
    .line 350
    move-object/from16 v22, v6

    .line 351
    .line 352
    goto :goto_e

    .line 353
    :cond_13
    move-object/from16 v22, v6

    .line 354
    .line 355
    iget-object v6, v11, Lqd/r;->m:Lqd/s;

    .line 356
    .line 357
    iget-object v6, v6, Lqd/s;->j:Ljava/util/ArrayList;

    .line 358
    .line 359
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    const/4 v0, 0x1

    .line 364
    if-le v6, v0, :cond_14

    .line 365
    .line 366
    :goto_a
    goto :goto_e

    .line 367
    :cond_14
    add-int/lit8 v0, v14, 0x1

    .line 368
    .line 369
    move/from16 v24, v0

    .line 370
    .line 371
    const/4 v6, 0x0

    .line 372
    :goto_b
    if-ge v0, v13, :cond_17

    .line 373
    .line 374
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v25

    .line 378
    move/from16 v26, v0

    .line 379
    .line 380
    move-object/from16 v0, v25

    .line 381
    .line 382
    check-cast v0, Lud/p;

    .line 383
    .line 384
    iget-object v0, v0, Lud/p;->m:Ljava/util/List;

    .line 385
    .line 386
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 387
    .line 388
    .line 389
    move-result v25

    .line 390
    if-nez v25, :cond_15

    .line 391
    .line 392
    const/4 v0, 0x0

    .line 393
    goto :goto_c

    .line 394
    :cond_15
    invoke-static {v0, v11}, Lxe/m;->b(Ljava/util/List;Lqd/r;)Z

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    :goto_c
    if-eqz v0, :cond_16

    .line 399
    .line 400
    const/4 v6, 0x1

    .line 401
    :cond_16
    add-int/lit8 v0, v26, 0x1

    .line 402
    .line 403
    goto :goto_b

    .line 404
    :cond_17
    if-nez v6, :cond_18

    .line 405
    .line 406
    invoke-static {v10, v11}, Lxe/m;->b(Ljava/util/List;Lqd/r;)Z

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    if-eqz v0, :cond_18

    .line 411
    .line 412
    const/4 v6, 0x1

    .line 413
    :cond_18
    if-nez v6, :cond_19

    .line 414
    .line 415
    goto :goto_a

    .line 416
    :cond_19
    move-object/from16 v0, p0

    .line 417
    .line 418
    move-object/from16 v6, v22

    .line 419
    .line 420
    move-object/from16 v11, v23

    .line 421
    .line 422
    move/from16 v14, v24

    .line 423
    .line 424
    goto :goto_9

    .line 425
    :cond_1a
    :goto_d
    move-object/from16 v22, v6

    .line 426
    .line 427
    move-object/from16 v23, v11

    .line 428
    .line 429
    :goto_e
    const/4 v14, 0x0

    .line 430
    goto :goto_10

    .line 431
    :cond_1b
    move-object/from16 v22, v6

    .line 432
    .line 433
    move-object/from16 v21, v9

    .line 434
    .line 435
    move-object/from16 v23, v11

    .line 436
    .line 437
    move-object/from16 v20, v13

    .line 438
    .line 439
    :goto_f
    const/4 v14, 0x1

    .line 440
    :goto_10
    if-eqz v14, :cond_1e

    .line 441
    .line 442
    invoke-virtual {v5, v12}, Lud/r;->R(Lud/a;)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 447
    .line 448
    .line 449
    move-result v0

    .line 450
    const/4 v9, 0x2

    .line 451
    if-lt v0, v9, :cond_1e

    .line 452
    .line 453
    iget-object v0, v12, Lud/a;->o:Ljava/util/List;

    .line 454
    .line 455
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    :cond_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    if-eqz v6, :cond_1d

    .line 464
    .line 465
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    check-cast v6, Lud/a;

    .line 470
    .line 471
    invoke-virtual {v5, v6}, Lud/r;->R(Lud/a;)Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    invoke-interface {v6, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 479
    .line 480
    .line 481
    move-result v6

    .line 482
    if-nez v6, :cond_1c

    .line 483
    .line 484
    const/4 v0, 0x0

    .line 485
    goto :goto_11

    .line 486
    :cond_1d
    const/4 v0, 0x1

    .line 487
    :goto_11
    if-eqz v0, :cond_1e

    .line 488
    .line 489
    const/4 v14, 0x0

    .line 490
    :cond_1e
    if-eqz v14, :cond_23

    .line 491
    .line 492
    invoke-virtual {v2}, Lnd/t;->a()Ljava/util/ArrayList;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    const/4 v9, 0x2

    .line 501
    if-ge v6, v9, :cond_20

    .line 502
    .line 503
    :cond_1f
    const/4 v0, 0x1

    .line 504
    goto :goto_12

    .line 505
    :cond_20
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    new-instance v9, Lce/o;

    .line 510
    .line 511
    const/4 v10, 0x3

    .line 512
    invoke-direct {v9, v12, v10}, Lce/o;-><init>(Lud/a;I)V

    .line 513
    .line 514
    .line 515
    invoke-interface {v6, v9}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 516
    .line 517
    .line 518
    move-result-object v6

    .line 519
    invoke-interface {v6}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    .line 520
    .line 521
    .line 522
    move-result-object v6

    .line 523
    invoke-virtual {v6}, Ljava/util/Optional;->isPresent()Z

    .line 524
    .line 525
    .line 526
    move-result v9

    .line 527
    if-eqz v9, :cond_22

    .line 528
    .line 529
    invoke-virtual {v6}, Ljava/util/Optional;->get()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v6

    .line 533
    check-cast v6, Lud/f;

    .line 534
    .line 535
    iget-object v9, v6, Lud/f;->b:Lud/a;

    .line 536
    .line 537
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    :cond_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    if-eqz v10, :cond_1f

    .line 546
    .line 547
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v10

    .line 551
    check-cast v10, Lud/f;

    .line 552
    .line 553
    if-eq v10, v6, :cond_21

    .line 554
    .line 555
    iget-object v10, v10, Lud/f;->b:Lud/a;

    .line 556
    .line 557
    invoke-static {v9, v10}, La/a;->o0(Lud/a;Lud/a;)Z

    .line 558
    .line 559
    .line 560
    move-result v11

    .line 561
    if-nez v11, :cond_21

    .line 562
    .line 563
    invoke-static {v5, v9, v10}, La/a;->h0(Lud/r;Lud/a;Lud/a;)Lud/a;

    .line 564
    .line 565
    .line 566
    move-result-object v10

    .line 567
    if-eqz v10, :cond_21

    .line 568
    .line 569
    const/4 v0, 0x0

    .line 570
    :goto_12
    if-nez v0, :cond_23

    .line 571
    .line 572
    const/4 v14, 0x0

    .line 573
    goto :goto_13

    .line 574
    :cond_22
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v0

    .line 578
    const-string v1, "Not found exit edge by exit block: "

    .line 579
    .line 580
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    invoke-static {v0}, Lah/a;->k(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    const/4 v0, 0x0

    .line 588
    return-object v0

    .line 589
    :cond_23
    :goto_13
    if-eqz v14, :cond_24

    .line 590
    .line 591
    move-object/from16 v11, v23

    .line 592
    .line 593
    goto :goto_14

    .line 594
    :cond_24
    move-object/from16 v0, p0

    .line 595
    .line 596
    move-object/from16 v10, v17

    .line 597
    .line 598
    move-object/from16 v11, v18

    .line 599
    .line 600
    move-object/from16 v9, v21

    .line 601
    .line 602
    move-object/from16 v6, v22

    .line 603
    .line 604
    goto/16 :goto_0

    .line 605
    .line 606
    :cond_25
    move-object/from16 v0, p0

    .line 607
    .line 608
    goto/16 :goto_0

    .line 609
    .line 610
    :cond_26
    move-object/from16 v22, v6

    .line 611
    .line 612
    move-object/from16 v21, v9

    .line 613
    .line 614
    move-object/from16 v18, v11

    .line 615
    .line 616
    move-object/from16 v20, v13

    .line 617
    .line 618
    const/4 v11, 0x0

    .line 619
    :goto_14
    if-nez v11, :cond_32

    .line 620
    .line 621
    new-instance v0, Lzd/c;

    .line 622
    .line 623
    const/4 v6, 0x0

    .line 624
    const/4 v14, 0x0

    .line 625
    invoke-direct {v0, v1, v2, v6, v14}, Lzd/c;-><init>(Lxd/b;Lnd/t;Lud/a;Z)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    invoke-virtual {v8, v15}, Lmd/e;->E(Loc/a;)V

    .line 632
    .line 633
    .line 634
    iget-object v1, v7, Lze/c;->h:Ljava/util/BitSet;

    .line 635
    .line 636
    iget v4, v8, Lud/a;->j:I

    .line 637
    .line 638
    invoke-virtual {v1, v4}, Ljava/util/BitSet;->clear(I)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v3, v0}, Lle/c;->c(Lxd/a;)V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2}, Lnd/t;->a()Ljava/util/ArrayList;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 649
    .line 650
    .line 651
    move-result v4

    .line 652
    const/4 v13, 0x1

    .line 653
    if-ne v4, v13, :cond_28

    .line 654
    .line 655
    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v1

    .line 659
    check-cast v1, Lud/f;

    .line 660
    .line 661
    iget-object v4, v1, Lud/f;->b:Lud/a;

    .line 662
    .line 663
    move-object/from16 v9, p0

    .line 664
    .line 665
    invoke-virtual {v9, v3, v2, v4, v1}, Lb5/c;->A(Lle/c;Lnd/t;Lud/a;Lud/f;)Z

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    if-eqz v1, :cond_27

    .line 670
    .line 671
    invoke-static {v4}, La/a;->d0(Lud/a;)Lud/a;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    if-eqz v1, :cond_27

    .line 676
    .line 677
    invoke-virtual {v3, v1}, Lle/c;->a(Lud/a;)V

    .line 678
    .line 679
    .line 680
    goto :goto_15

    .line 681
    :cond_27
    move-object v1, v6

    .line 682
    :goto_15
    move-object/from16 v10, v22

    .line 683
    .line 684
    goto :goto_17

    .line 685
    :cond_28
    move-object/from16 v9, p0

    .line 686
    .line 687
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    move-object v4, v6

    .line 692
    :cond_29
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result v7

    .line 696
    if-eqz v7, :cond_2b

    .line 697
    .line 698
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v7

    .line 702
    check-cast v7, Lud/f;

    .line 703
    .line 704
    iget-object v10, v7, Lud/f;->b:Lud/a;

    .line 705
    .line 706
    iget-object v11, v10, Lud/a;->r:Ljava/util/BitSet;

    .line 707
    .line 708
    invoke-static {v5, v11}, La/a;->q(Lud/r;Ljava/util/BitSet;)Ljava/util/List;

    .line 709
    .line 710
    .line 711
    move-result-object v11

    .line 712
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 713
    .line 714
    .line 715
    move-result-object v11

    .line 716
    :goto_16
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 717
    .line 718
    .line 719
    move-result v12

    .line 720
    if-eqz v12, :cond_29

    .line 721
    .line 722
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v12

    .line 726
    check-cast v12, Lud/a;

    .line 727
    .line 728
    invoke-static {v10, v12}, La/a;->s0(Lud/a;Lud/a;)Z

    .line 729
    .line 730
    .line 731
    move-result v13

    .line 732
    if-eqz v13, :cond_2a

    .line 733
    .line 734
    invoke-virtual {v3, v12}, Lle/c;->a(Lud/a;)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v9, v3, v2, v12, v7}, Lb5/c;->A(Lle/c;Lnd/t;Lud/a;Lud/f;)Z

    .line 738
    .line 739
    .line 740
    move-object v4, v12

    .line 741
    goto :goto_16

    .line 742
    :cond_2a
    invoke-virtual {v9, v3, v2, v10, v7}, Lb5/c;->A(Lle/c;Lnd/t;Lud/a;Lud/f;)Z

    .line 743
    .line 744
    .line 745
    goto :goto_16

    .line 746
    :cond_2b
    move-object v1, v4

    .line 747
    goto :goto_15

    .line 748
    :goto_17
    invoke-virtual {v10, v8}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    move-object/from16 v12, v21

    .line 753
    .line 754
    invoke-static {v12, v4}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 755
    .line 756
    .line 757
    move-result v7

    .line 758
    if-nez v7, :cond_2f

    .line 759
    .line 760
    iget-object v7, v12, Lmd/e;->g:Lmd/f;

    .line 761
    .line 762
    move-object/from16 v10, v20

    .line 763
    .line 764
    invoke-virtual {v7, v10}, Lmd/f;->b(Loc/a;)Z

    .line 765
    .line 766
    .line 767
    move-result v7

    .line 768
    if-nez v7, :cond_2f

    .line 769
    .line 770
    iget-object v7, v5, Lud/r;->E:Ljava/util/List;

    .line 771
    .line 772
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 773
    .line 774
    .line 775
    move-result v7

    .line 776
    if-nez v7, :cond_2c

    .line 777
    .line 778
    goto :goto_18

    .line 779
    :cond_2c
    iget-object v5, v5, Lud/r;->E:Ljava/util/List;

    .line 780
    .line 781
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 782
    .line 783
    .line 784
    move-result-object v5

    .line 785
    :cond_2d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 786
    .line 787
    .line 788
    move-result v7

    .line 789
    if-eqz v7, :cond_2e

    .line 790
    .line 791
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v7

    .line 795
    check-cast v7, Lae/f;

    .line 796
    .line 797
    iget-object v7, v7, Lae/f;->d:Ljava/util/ArrayList;

    .line 798
    .line 799
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v7

    .line 803
    if-eqz v7, :cond_2d

    .line 804
    .line 805
    goto :goto_19

    .line 806
    :cond_2e
    :goto_18
    iget-object v5, v4, Lxd/b;->k:Ljava/util/ArrayList;

    .line 807
    .line 808
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 809
    .line 810
    .line 811
    :cond_2f
    :goto_19
    iput-object v4, v0, Lzd/c;->q:Lxd/b;

    .line 812
    .line 813
    if-nez v1, :cond_31

    .line 814
    .line 815
    invoke-static {v12}, La/a;->d0(Lud/a;)Lud/a;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    invoke-static {v0, v4}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 820
    .line 821
    .line 822
    move-result v1

    .line 823
    if-eqz v1, :cond_30

    .line 824
    .line 825
    move-object v0, v6

    .line 826
    :cond_30
    move-object v1, v0

    .line 827
    :cond_31
    invoke-virtual {v3}, Lle/c;->b()V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v8, v15, v2}, Lmd/e;->x(Lmd/b;Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    invoke-static {v2}, Lb5/c;->z(Lnd/t;)V

    .line 834
    .line 835
    .line 836
    return-object v1

    .line 837
    :cond_32
    move-object/from16 v9, p0

    .line 838
    .line 839
    move-object/from16 v12, v21

    .line 840
    .line 841
    move-object/from16 v10, v22

    .line 842
    .line 843
    const/4 v6, 0x0

    .line 844
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    iget-object v0, v3, Lle/c;->b:Lle/b;

    .line 848
    .line 849
    iget-object v0, v0, Lle/b;->b:Lxd/a;

    .line 850
    .line 851
    invoke-virtual {v3, v11}, Lle/c;->c(Lxd/a;)V

    .line 852
    .line 853
    .line 854
    iget-object v1, v9, Lb5/c;->c:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v1, Lle/a;

    .line 857
    .line 858
    iget-object v1, v1, Lle/a;->a:Lud/r;

    .line 859
    .line 860
    iget-object v4, v11, Lzd/c;->o:Lud/a;

    .line 861
    .line 862
    invoke-static {v1, v4}, Lle/a;->g(Lud/r;Lud/a;)Lhb/r;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    invoke-static {v1}, Lle/a;->h(Lhb/r;)Lhb/r;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    if-eqz v4, :cond_33

    .line 871
    .line 872
    move-object v1, v4

    .line 873
    :cond_33
    invoke-static {v1}, Lle/a;->a(Lhb/r;)V

    .line 874
    .line 875
    .line 876
    iget-object v4, v2, Lnd/t;->c:Ljava/util/HashSet;

    .line 877
    .line 878
    iget-object v5, v1, Lhb/r;->e:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v5, Lud/a;

    .line 881
    .line 882
    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 883
    .line 884
    .line 885
    move-result v4

    .line 886
    if-nez v4, :cond_34

    .line 887
    .line 888
    invoke-static {v1}, Lhb/r;->l(Lhb/r;)Lhb/r;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    :cond_34
    iget-object v4, v1, Lhb/r;->e:Ljava/lang/Object;

    .line 893
    .line 894
    check-cast v4, Lud/a;

    .line 895
    .line 896
    iget-object v5, v1, Lhb/r;->d:Ljava/lang/Object;

    .line 897
    .line 898
    check-cast v5, Lze/c;

    .line 899
    .line 900
    iget-object v13, v1, Lhb/r;->f:Ljava/lang/Object;

    .line 901
    .line 902
    check-cast v13, Lud/a;

    .line 903
    .line 904
    iget-object v14, v1, Lhb/r;->c:Ljava/lang/Object;

    .line 905
    .line 906
    check-cast v14, Lyd/b;

    .line 907
    .line 908
    iput-object v14, v11, Lyd/a;->k:Lyd/b;

    .line 909
    .line 910
    invoke-virtual {v5}, Lze/c;->c()Ljava/util/List;

    .line 911
    .line 912
    .line 913
    move-result-object v14

    .line 914
    iput-object v14, v11, Lyd/a;->l:Ljava/util/List;

    .line 915
    .line 916
    new-instance v14, Lae/e;

    .line 917
    .line 918
    const/16 v6, 0x16

    .line 919
    .line 920
    invoke-direct {v14, v6}, Lae/e;-><init>(I)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v5, v14}, Lze/c;->forEach(Ljava/util/function/Consumer;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {v5}, Lze/c;->c()Ljava/util/List;

    .line 927
    .line 928
    .line 929
    move-result-object v5

    .line 930
    move-object/from16 v6, v18

    .line 931
    .line 932
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 933
    .line 934
    .line 935
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 936
    .line 937
    .line 938
    move-result v5

    .line 939
    if-nez v5, :cond_36

    .line 940
    .line 941
    if-eqz v13, :cond_36

    .line 942
    .line 943
    invoke-virtual {v2}, Lnd/t;->a()Ljava/util/ArrayList;

    .line 944
    .line 945
    .line 946
    move-result-object v5

    .line 947
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 948
    .line 949
    .line 950
    move-result-object v5

    .line 951
    :goto_1a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 952
    .line 953
    .line 954
    move-result v14

    .line 955
    if-eqz v14, :cond_36

    .line 956
    .line 957
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v14

    .line 961
    check-cast v14, Lud/f;

    .line 962
    .line 963
    move-object/from16 v16, v1

    .line 964
    .line 965
    iget-object v1, v14, Lud/f;->a:Lud/a;

    .line 966
    .line 967
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 968
    .line 969
    .line 970
    move-result v1

    .line 971
    if-eqz v1, :cond_35

    .line 972
    .line 973
    invoke-virtual {v9, v3, v2, v13, v14}, Lb5/c;->A(Lle/c;Lnd/t;Lud/a;Lud/f;)Z

    .line 974
    .line 975
    .line 976
    :cond_35
    move-object/from16 v1, v16

    .line 977
    .line 978
    goto :goto_1a

    .line 979
    :cond_36
    move-object/from16 v16, v1

    .line 980
    .line 981
    iget-boolean v1, v11, Lzd/c;->n:Z

    .line 982
    .line 983
    sget-object v5, Lmd/a;->z:Lmd/a;

    .line 984
    .line 985
    if-eqz v1, :cond_39

    .line 986
    .line 987
    if-eq v4, v12, :cond_37

    .line 988
    .line 989
    if-ne v4, v8, :cond_38

    .line 990
    .line 991
    :cond_37
    move-object v4, v13

    .line 992
    :cond_38
    invoke-static {v4}, La/a;->K(Lud/a;)Lud/a;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-virtual {v8, v15}, Lmd/e;->E(Loc/a;)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v12, v5}, Lmd/e;->w(Lmd/a;)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v3, v12}, Lle/c;->a(Lud/a;)V

    .line 1003
    .line 1004
    .line 1005
    iget-object v1, v7, Lze/c;->h:Ljava/util/BitSet;

    .line 1006
    .line 1007
    iget v4, v8, Lud/a;->j:I

    .line 1008
    .line 1009
    invoke-virtual {v1, v4}, Ljava/util/BitSet;->clear(I)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v10, v8}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v1

    .line 1016
    iput-object v1, v11, Lzd/c;->q:Lxd/b;

    .line 1017
    .line 1018
    invoke-virtual {v8, v15, v2}, Lmd/e;->x(Lmd/b;Ljava/lang/Object;)V

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {v12, v5}, Lmd/e;->D(Lmd/a;)V

    .line 1022
    .line 1023
    .line 1024
    goto/16 :goto_1e

    .line 1025
    .line 1026
    :cond_39
    if-eqz v0, :cond_3a

    .line 1027
    .line 1028
    if-eqz v13, :cond_3a

    .line 1029
    .line 1030
    sget-object v1, Lmd/a;->k:Lmd/a;

    .line 1031
    .line 1032
    iget-object v6, v13, Lmd/e;->g:Lmd/f;

    .line 1033
    .line 1034
    invoke-virtual {v6, v1}, Lmd/f;->a(Lmd/a;)Z

    .line 1035
    .line 1036
    .line 1037
    move-result v1

    .line 1038
    if-eqz v1, :cond_3a

    .line 1039
    .line 1040
    iget-object v1, v13, Lmd/e;->g:Lmd/f;

    .line 1041
    .line 1042
    invoke-virtual {v1, v15}, Lmd/f;->d(Lmd/b;)Ljava/util/List;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v1

    .line 1046
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v1

    .line 1050
    if-nez v1, :cond_3a

    .line 1051
    .line 1052
    invoke-static {v13, v0}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 1053
    .line 1054
    .line 1055
    move-result v0

    .line 1056
    if-eqz v0, :cond_3a

    .line 1057
    .line 1058
    const/4 v15, 0x0

    .line 1059
    goto :goto_1b

    .line 1060
    :cond_3a
    move-object v15, v13

    .line 1061
    :goto_1b
    invoke-virtual {v3, v15}, Lle/c;->a(Lud/a;)V

    .line 1062
    .line 1063
    .line 1064
    invoke-static {v4, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v0

    .line 1068
    if-eqz v0, :cond_3b

    .line 1069
    .line 1070
    new-instance v0, Lxd/b;

    .line 1071
    .line 1072
    invoke-direct {v0, v11}, Lxd/b;-><init>(Lud/n;)V

    .line 1073
    .line 1074
    .line 1075
    goto :goto_1c

    .line 1076
    :cond_3b
    invoke-virtual {v10, v4}, Li4/y;->b(Lud/a;)Lxd/b;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v0

    .line 1080
    :goto_1c
    invoke-virtual/range {v16 .. v16}, Lhb/r;->j()Lud/a;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v1

    .line 1084
    if-eq v8, v1, :cond_3d

    .line 1085
    .line 1086
    invoke-static {v8, v1}, La/a;->P(Lud/a;Lud/a;)Ljava/util/HashSet;

    .line 1087
    .line 1088
    .line 1089
    move-result-object v4

    .line 1090
    invoke-virtual {v4, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v1

    .line 1097
    :cond_3c
    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1098
    .line 1099
    .line 1100
    move-result v4

    .line 1101
    if-eqz v4, :cond_3d

    .line 1102
    .line 1103
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v4

    .line 1107
    check-cast v4, Lud/a;

    .line 1108
    .line 1109
    iget-object v6, v4, Lud/a;->l:Ljava/util/ArrayList;

    .line 1110
    .line 1111
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1112
    .line 1113
    .line 1114
    move-result v6

    .line 1115
    if-eqz v6, :cond_3c

    .line 1116
    .line 1117
    iget-object v6, v4, Lmd/e;->g:Lmd/f;

    .line 1118
    .line 1119
    invoke-virtual {v6, v5}, Lmd/f;->a(Lmd/a;)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v6

    .line 1123
    if-nez v6, :cond_3c

    .line 1124
    .line 1125
    invoke-static {v4, v0}, Lf8/i;->Z(Lud/a;Lud/j;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v6

    .line 1129
    if-nez v6, :cond_3c

    .line 1130
    .line 1131
    invoke-virtual {v0, v4}, Lxd/b;->H(Lud/j;)V

    .line 1132
    .line 1133
    .line 1134
    goto :goto_1d

    .line 1135
    :cond_3d
    iput-object v0, v11, Lzd/c;->q:Lxd/b;

    .line 1136
    .line 1137
    move-object v0, v15

    .line 1138
    :goto_1e
    invoke-virtual {v3}, Lle/c;->b()V

    .line 1139
    .line 1140
    .line 1141
    invoke-static {v2}, Lb5/c;->z(Lnd/t;)V

    .line 1142
    .line 1143
    .line 1144
    return-object v0
.end method

.method public J()Ljava/util/LinkedHashMap;
    .locals 13

    .line 1
    iget-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/SharedPreferences;

    .line 4
    .line 5
    const-string v1, "entries_v1"

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v2, v0

    .line 17
    :goto_0
    iget-object v0, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_b

    .line 42
    .line 43
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 44
    .line 45
    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

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
    move-result v4

    .line 56
    if-eqz v4, :cond_b

    .line 57
    .line 58
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    check-cast v4, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    if-eqz v5, :cond_2

    .line 80
    .line 81
    const-string v6, "likes"

    .line 82
    .line 83
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-static {v6}, Lb5/c;->Y(Lorg/json/JSONArray;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    const-string v7, "comments"

    .line 92
    .line 93
    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    invoke-static {v7}, Lb5/c;->W(Lorg/json/JSONArray;)Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    const-string v8, "pendingLikes"

    .line 102
    .line 103
    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-static {v8}, Lb5/c;->Y(Lorg/json/JSONArray;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    const-string v9, "pendingComments"

    .line 112
    .line 113
    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-static {v5}, Lb5/c;->W(Lorg/json/JSONArray;)Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    new-instance v9, Ljava/util/HashSet;

    .line 122
    .line 123
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 124
    .line 125
    .line 126
    new-instance v10, Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    :cond_3
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-eqz v11, :cond_4

    .line 140
    .line 141
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    move-object v12, v11

    .line 146
    check-cast v12, Lia/d;

    .line 147
    .line 148
    iget-object v12, v12, Lia/d;->a:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v9, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v12

    .line 154
    if-eqz v12, :cond_3

    .line 155
    .line 156
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_4
    new-instance v6, Ljava/util/HashSet;

    .line 161
    .line 162
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 163
    .line 164
    .line 165
    new-instance v9, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    :cond_5
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    if-eqz v11, :cond_6

    .line 179
    .line 180
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    move-object v12, v11

    .line 185
    check-cast v12, Lia/b;

    .line 186
    .line 187
    iget-object v12, v12, Lia/b;->a:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v6, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    if-eqz v12, :cond_5

    .line 194
    .line 195
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_6
    new-instance v6, Ljava/util/HashSet;

    .line 200
    .line 201
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 202
    .line 203
    .line 204
    new-instance v7, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    :cond_7
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-eqz v11, :cond_8

    .line 218
    .line 219
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    move-object v12, v11

    .line 224
    check-cast v12, Lia/d;

    .line 225
    .line 226
    iget-object v12, v12, Lia/d;->a:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v6, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    if-eqz v12, :cond_7

    .line 233
    .line 234
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto :goto_4

    .line 238
    :cond_8
    new-instance v6, Ljava/util/HashSet;

    .line 239
    .line 240
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 241
    .line 242
    .line 243
    new-instance v8, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    :cond_9
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    if-eqz v11, :cond_a

    .line 257
    .line 258
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v11

    .line 262
    move-object v12, v11

    .line 263
    check-cast v12, Lia/b;

    .line 264
    .line 265
    invoke-static {v12}, Lb5/c;->h(Lia/b;)Lsf/j;

    .line 266
    .line 267
    .line 268
    move-result-object v12

    .line 269
    invoke-virtual {v6, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v12

    .line 273
    if-eqz v12, :cond_9

    .line 274
    .line 275
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_a
    new-instance v5, Lia/c;

    .line 280
    .line 281
    invoke-direct {v5, v10, v9, v7, v8}, Lia/c;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    if-lez v6, :cond_2

    .line 289
    .line 290
    invoke-virtual {v5}, Lia/c;->c()Z

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    if-nez v6, :cond_2

    .line 295
    .line 296
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 297
    .line 298
    .line 299
    goto/16 :goto_1

    .line 300
    .line 301
    :catchall_0
    :cond_b
    iput-object v2, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 302
    .line 303
    iput-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 304
    .line 305
    return-object v0
.end method

.method public K(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lna/k;

    .line 10
    .line 11
    iget-object v0, v0, Lna/k;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p1, ""

    .line 21
    .line 22
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    invoke-static {p1}, Lb5/c;->B(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    :cond_1
    const-string v0, "fromusername"

    .line 35
    .line 36
    invoke-static {p2, v0}, Loa/b;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    invoke-static {p2}, Lb5/c;->B(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    move-object p1, p2

    .line 53
    :cond_2
    invoke-static {p1}, Loa/b;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    return-object p1
.end method

.method public L(Ljava/lang/Object;J)Lca/a;
    .locals 21

    .line 1
    move-wide/from16 v1, p2

    .line 2
    .line 3
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    :goto_0
    const/4 v4, 0x1

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    const-class v5, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-nez v5, :cond_1

    .line 22
    .line 23
    invoke-static {v3}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-static {v5}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    new-instance v6, Lb4/b;

    .line 32
    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    invoke-direct {v6, v7}, Lb4/b;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v7, Lng/i;

    .line 39
    .line 40
    invoke-direct {v7, v5, v4, v6}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 41
    .line 42
    .line 43
    new-instance v5, Lc9/k1;

    .line 44
    .line 45
    const/4 v6, 0x3

    .line 46
    move-object/from16 v8, p1

    .line 47
    .line 48
    invoke-direct {v5, v8, v6}, Lc9/k1;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-static {v7, v5}, Lng/m;->X(Lng/j;Lfg/l;)Lng/i;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    new-instance v6, Lb4/b;

    .line 56
    .line 57
    const/16 v7, 0x9

    .line 58
    .line 59
    invoke-direct {v6, v7}, Lb4/b;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v5, v6}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    new-instance v6, Lca/c;

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    invoke-direct {v6, v1, v2, v7}, Lca/c;-><init>(JI)V

    .line 70
    .line 71
    .line 72
    new-instance v7, Lng/i;

    .line 73
    .line 74
    invoke-direct {v7, v5, v4, v6}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 75
    .line 76
    .line 77
    new-instance v4, Lng/h;

    .line 78
    .line 79
    invoke-direct {v4, v7}, Lng/h;-><init>(Lng/i;)V

    .line 80
    .line 81
    .line 82
    :goto_1
    invoke-virtual {v4}, Lng/h;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_0

    .line 87
    .line 88
    invoke-virtual {v4}, Lng/h;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_1e

    .line 115
    .line 116
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    check-cast v0, Ljava/lang/String;

    .line 124
    .line 125
    move-object/from16 v6, p0

    .line 126
    .line 127
    iget-object v7, v6, Lb5/c;->a:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v7, Lr8/g;

    .line 130
    .line 131
    new-instance v8, Ljava/io/File;

    .line 132
    .line 133
    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    const-wide/16 v11, 0x0

    .line 141
    .line 142
    if-eqz v9, :cond_2

    .line 143
    .line 144
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 145
    .line 146
    .line 147
    move-result-wide v13

    .line 148
    cmp-long v9, v13, v11

    .line 149
    .line 150
    if-lez v9, :cond_2

    .line 151
    .line 152
    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    :goto_3
    move-object v10, v0

    .line 157
    move-wide/from16 v16, v11

    .line 158
    .line 159
    const/4 v5, 0x0

    .line 160
    goto/16 :goto_f

    .line 161
    .line 162
    :cond_2
    new-instance v8, Ljava/io/File;

    .line 163
    .line 164
    iget-object v9, v7, Lr8/g;->a:Landroid/content/Context;

    .line 165
    .line 166
    invoke-virtual {v9}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    const-string v13, "Hchat_live_photo"

    .line 171
    .line 172
    invoke-direct {v8, v9, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    if-nez v9, :cond_3

    .line 180
    .line 181
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    if-nez v9, :cond_3

    .line 186
    .line 187
    move-wide/from16 v16, v11

    .line 188
    .line 189
    const/4 v5, 0x0

    .line 190
    :goto_4
    const/4 v10, 0x0

    .line 191
    goto/16 :goto_f

    .line 192
    .line 193
    :cond_3
    new-instance v9, Ljava/io/File;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    invoke-static {v13}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    new-instance v14, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    const-string v15, "live_"

    .line 206
    .line 207
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v14, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v15, "_"

    .line 214
    .line 215
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    const-string v13, ".mp4"

    .line 222
    .line 223
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v13

    .line 230
    invoke-direct {v9, v8, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    if-eqz v8, :cond_4

    .line 238
    .line 239
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 240
    .line 241
    .line 242
    move-result-wide v13

    .line 243
    cmp-long v8, v13, v11

    .line 244
    .line 245
    if-lez v8, :cond_4

    .line 246
    .line 247
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    goto :goto_3

    .line 252
    :cond_4
    const-string v8, "com.tencent.mm.vfs.w6"

    .line 253
    .line 254
    const-string v13, "com.tencent.mm.vfs.p6"

    .line 255
    .line 256
    filled-new-array {v8, v13}, [Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    const/4 v13, 0x0

    .line 261
    :goto_5
    const/4 v14, 0x2

    .line 262
    if-lt v13, v14, :cond_5

    .line 263
    .line 264
    move-wide/from16 v16, v11

    .line 265
    .line 266
    const/16 p1, 0x0

    .line 267
    .line 268
    const/4 v10, 0x0

    .line 269
    goto/16 :goto_a

    .line 270
    .line 271
    :cond_5
    aget-object v15, v8, v13

    .line 272
    .line 273
    move-wide/from16 v16, v11

    .line 274
    .line 275
    iget-object v11, v7, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 276
    .line 277
    invoke-static {v15, v11}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    move-result-object v11

    .line 281
    if-eqz v11, :cond_1d

    .line 282
    .line 283
    const-string v12, "E"

    .line 284
    .line 285
    const-string v15, "F"

    .line 286
    .line 287
    filled-new-array {v12, v15}, [Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v12

    .line 291
    const/16 p1, 0x0

    .line 292
    .line 293
    const/4 v15, 0x0

    .line 294
    :goto_6
    const-class v10, Ljava/lang/String;

    .line 295
    .line 296
    if-lt v15, v14, :cond_a

    .line 297
    .line 298
    invoke-static {v11}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    :cond_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v12

    .line 310
    if-eqz v12, :cond_7

    .line 311
    .line 312
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    move-object v14, v12

    .line 317
    check-cast v14, Ljava/lang/reflect/Method;

    .line 318
    .line 319
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    move-result-object v15

    .line 323
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 324
    .line 325
    .line 326
    move-result v18

    .line 327
    invoke-static/range {v18 .. v18}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 328
    .line 329
    .line 330
    move-result v18

    .line 331
    if-eqz v18, :cond_6

    .line 332
    .line 333
    invoke-virtual {v14}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    move-result-object v14

    .line 337
    const-class v5, Ljava/io/InputStream;

    .line 338
    .line 339
    invoke-static {v14, v5}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    if-eqz v5, :cond_6

    .line 344
    .line 345
    array-length v5, v15

    .line 346
    if-ne v5, v4, :cond_6

    .line 347
    .line 348
    aget-object v5, v15, p1

    .line 349
    .line 350
    invoke-static {v5, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    if-eqz v5, :cond_6

    .line 355
    .line 356
    goto :goto_7

    .line 357
    :cond_7
    const/4 v12, 0x0

    .line 358
    :goto_7
    check-cast v12, Ljava/lang/reflect/Method;

    .line 359
    .line 360
    if-eqz v12, :cond_9

    .line 361
    .line 362
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v5

    .line 366
    const/4 v10, 0x0

    .line 367
    invoke-static {v12, v10, v5}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v5

    .line 371
    instance-of v10, v5, Ljava/io/InputStream;

    .line 372
    .line 373
    if-eqz v10, :cond_8

    .line 374
    .line 375
    check-cast v5, Ljava/io/InputStream;

    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_8
    const/4 v5, 0x0

    .line 379
    :goto_8
    if-eqz v5, :cond_9

    .line 380
    .line 381
    move-object v10, v5

    .line 382
    goto :goto_a

    .line 383
    :cond_9
    move/from16 v5, p1

    .line 384
    .line 385
    move-wide/from16 v19, v16

    .line 386
    .line 387
    goto/16 :goto_19

    .line 388
    .line 389
    :cond_a
    aget-object v5, v12, v15

    .line 390
    .line 391
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 392
    .line 393
    .line 394
    move-result-object v10

    .line 395
    invoke-static {v11, v5, v10}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    if-eqz v5, :cond_b

    .line 400
    .line 401
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 406
    .line 407
    .line 408
    move-result v10

    .line 409
    if-nez v10, :cond_c

    .line 410
    .line 411
    :cond_b
    move/from16 v5, p1

    .line 412
    .line 413
    move-wide/from16 v19, v16

    .line 414
    .line 415
    goto/16 :goto_18

    .line 416
    .line 417
    :cond_c
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v10

    .line 421
    const/4 v4, 0x0

    .line 422
    invoke-static {v5, v4, v10}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    instance-of v4, v5, Ljava/io/InputStream;

    .line 427
    .line 428
    if-eqz v4, :cond_d

    .line 429
    .line 430
    move-object v10, v5

    .line 431
    check-cast v10, Ljava/io/InputStream;

    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_d
    const/4 v10, 0x0

    .line 435
    :goto_9
    if-eqz v10, :cond_b

    .line 436
    .line 437
    :goto_a
    if-eqz v10, :cond_11

    .line 438
    .line 439
    :try_start_0
    new-instance v4, Ljava/io/FileOutputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 440
    .line 441
    move/from16 v5, p1

    .line 442
    .line 443
    :try_start_1
    invoke-direct {v4, v9, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 444
    .line 445
    .line 446
    :try_start_2
    invoke-static {v10, v4}, Lg4/a;->j(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 447
    .line 448
    .line 449
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 450
    .line 451
    .line 452
    :try_start_4
    invoke-interface {v10}, Ljava/io/Closeable;->close()V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v10

    .line 459
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    if-eqz v0, :cond_e

    .line 464
    .line 465
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 466
    .line 467
    .line 468
    move-result-wide v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 469
    cmp-long v0, v7, v16

    .line 470
    .line 471
    if-lez v0, :cond_e

    .line 472
    .line 473
    goto :goto_e

    .line 474
    :catchall_0
    move-exception v0

    .line 475
    goto :goto_d

    .line 476
    :cond_e
    const/4 v10, 0x0

    .line 477
    goto :goto_e

    .line 478
    :catchall_1
    move-exception v0

    .line 479
    :goto_b
    move-object v4, v0

    .line 480
    goto :goto_c

    .line 481
    :catchall_2
    move-exception v0

    .line 482
    move-object v7, v0

    .line 483
    :try_start_5
    throw v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 484
    :catchall_3
    move-exception v0

    .line 485
    :try_start_6
    invoke-static {v4, v7}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 486
    .line 487
    .line 488
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 489
    :catchall_4
    move-exception v0

    .line 490
    move/from16 v5, p1

    .line 491
    .line 492
    goto :goto_b

    .line 493
    :goto_c
    :try_start_7
    throw v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 494
    :catchall_5
    move-exception v0

    .line 495
    :try_start_8
    invoke-static {v10, v4}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 496
    .line 497
    .line 498
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 499
    :goto_d
    new-instance v4, Lsf/f;

    .line 500
    .line 501
    invoke-direct {v4, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 502
    .line 503
    .line 504
    move-object v10, v4

    .line 505
    :goto_e
    invoke-static {v10}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    if-eqz v0, :cond_f

    .line 510
    .line 511
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 512
    .line 513
    .line 514
    :cond_f
    instance-of v0, v10, Lsf/f;

    .line 515
    .line 516
    if-eqz v0, :cond_10

    .line 517
    .line 518
    const/4 v10, 0x0

    .line 519
    :cond_10
    move-object v0, v10

    .line 520
    check-cast v0, Ljava/lang/String;

    .line 521
    .line 522
    move-object v10, v0

    .line 523
    goto :goto_f

    .line 524
    :cond_11
    move/from16 v5, p1

    .line 525
    .line 526
    goto/16 :goto_4

    .line 527
    .line 528
    :goto_f
    if-eqz v10, :cond_1c

    .line 529
    .line 530
    new-instance v0, Ljava/io/File;

    .line 531
    .line 532
    invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    if-eqz v4, :cond_1b

    .line 540
    .line 541
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 542
    .line 543
    .line 544
    move-result-wide v7

    .line 545
    cmp-long v4, v7, v16

    .line 546
    .line 547
    if-gtz v4, :cond_12

    .line 548
    .line 549
    goto/16 :goto_16

    .line 550
    .line 551
    :cond_12
    new-instance v4, Landroid/media/MediaMetadataRetriever;

    .line 552
    .line 553
    invoke-direct {v4}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 554
    .line 555
    .line 556
    :try_start_9
    invoke-virtual {v4, v10}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 557
    .line 558
    .line 559
    const/16 v7, 0x9

    .line 560
    .line 561
    invoke-virtual {v4, v7}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v7

    .line 565
    if-eqz v7, :cond_14

    .line 566
    .line 567
    invoke-static {v7}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 568
    .line 569
    .line 570
    move-result-object v7

    .line 571
    if-eqz v7, :cond_14

    .line 572
    .line 573
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 574
    .line 575
    .line 576
    move-result-wide v8

    .line 577
    cmp-long v8, v8, v16

    .line 578
    .line 579
    if-lez v8, :cond_13

    .line 580
    .line 581
    goto :goto_10

    .line 582
    :cond_13
    const/4 v7, 0x0

    .line 583
    :goto_10
    if-eqz v7, :cond_14

    .line 584
    .line 585
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 586
    .line 587
    .line 588
    move-result-wide v7

    .line 589
    goto :goto_11

    .line 590
    :catchall_6
    move-exception v0

    .line 591
    goto :goto_13

    .line 592
    :cond_14
    move-wide/from16 v7, v16

    .line 593
    .line 594
    :goto_11
    const/16 v9, 0x12

    .line 595
    .line 596
    invoke-virtual {v4, v9}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v9

    .line 600
    const/16 v11, 0xa

    .line 601
    .line 602
    if-eqz v9, :cond_15

    .line 603
    .line 604
    invoke-static {v11, v9}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 605
    .line 606
    .line 607
    move-result-object v9

    .line 608
    if-eqz v9, :cond_15

    .line 609
    .line 610
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 611
    .line 612
    .line 613
    move-result v9

    .line 614
    move v13, v9

    .line 615
    goto :goto_12

    .line 616
    :cond_15
    move v13, v5

    .line 617
    :goto_12
    const/16 v9, 0x13

    .line 618
    .line 619
    invoke-virtual {v4, v9}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v9

    .line 623
    if-eqz v9, :cond_16

    .line 624
    .line 625
    invoke-static {v11, v9}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 626
    .line 627
    .line 628
    move-result-object v9

    .line 629
    if-eqz v9, :cond_16

    .line 630
    .line 631
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 632
    .line 633
    .line 634
    move-result v5

    .line 635
    :cond_16
    move-wide/from16 v19, v16

    .line 636
    .line 637
    move/from16 v16, v5

    .line 638
    .line 639
    cmp-long v5, v7, v19

    .line 640
    .line 641
    if-gtz v5, :cond_17

    .line 642
    .line 643
    if-gtz v13, :cond_17

    .line 644
    .line 645
    if-gtz v16, :cond_17

    .line 646
    .line 647
    const/4 v11, 0x0

    .line 648
    goto :goto_14

    .line 649
    :cond_17
    new-instance v11, Lca/d;

    .line 650
    .line 651
    const-wide/16 v14, 0x1

    .line 652
    .line 653
    cmp-long v5, v7, v14

    .line 654
    .line 655
    if-gez v5, :cond_18

    .line 656
    .line 657
    move-wide v7, v14

    .line 658
    :cond_18
    const-wide/32 v14, 0x7fffffff

    .line 659
    .line 660
    .line 661
    cmp-long v5, v7, v14

    .line 662
    .line 663
    if-lez v5, :cond_19

    .line 664
    .line 665
    move-wide v7, v14

    .line 666
    :cond_19
    long-to-int v12, v7

    .line 667
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 668
    .line 669
    .line 670
    move-result-wide v14

    .line 671
    invoke-direct/range {v11 .. v16}, Lca/d;-><init>(IIJI)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 672
    .line 673
    .line 674
    goto :goto_14

    .line 675
    :goto_13
    new-instance v11, Lsf/f;

    .line 676
    .line 677
    invoke-direct {v11, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 678
    .line 679
    .line 680
    :goto_14
    instance-of v0, v11, Lsf/f;

    .line 681
    .line 682
    if-eqz v0, :cond_1a

    .line 683
    .line 684
    const/4 v5, 0x0

    .line 685
    goto :goto_15

    .line 686
    :cond_1a
    move-object v5, v11

    .line 687
    :goto_15
    check-cast v5, Lca/d;

    .line 688
    .line 689
    :try_start_a
    invoke-virtual {v4}, Landroid/media/MediaMetadataRetriever;->release()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 690
    .line 691
    .line 692
    goto :goto_17

    .line 693
    :cond_1b
    :goto_16
    const/4 v5, 0x0

    .line 694
    :catchall_7
    :goto_17
    if-eqz v5, :cond_1c

    .line 695
    .line 696
    new-instance v7, Lca/a;

    .line 697
    .line 698
    iget v8, v5, Lca/d;->a:I

    .line 699
    .line 700
    iget v9, v5, Lca/d;->b:I

    .line 701
    .line 702
    iget v13, v5, Lca/d;->c:I

    .line 703
    .line 704
    iget-wide v11, v5, Lca/d;->d:J

    .line 705
    .line 706
    invoke-direct/range {v7 .. v13}, Lca/a;-><init>(IILjava/lang/String;JI)V

    .line 707
    .line 708
    .line 709
    return-object v7

    .line 710
    :cond_1c
    const/4 v4, 0x1

    .line 711
    goto/16 :goto_2

    .line 712
    .line 713
    :goto_18
    add-int/lit8 v15, v15, 0x1

    .line 714
    .line 715
    move/from16 p1, v5

    .line 716
    .line 717
    move-wide/from16 v16, v19

    .line 718
    .line 719
    const/4 v4, 0x1

    .line 720
    goto/16 :goto_6

    .line 721
    .line 722
    :cond_1d
    move-wide/from16 v19, v16

    .line 723
    .line 724
    const/4 v5, 0x0

    .line 725
    :goto_19
    add-int/lit8 v13, v13, 0x1

    .line 726
    .line 727
    move-wide/from16 v11, v19

    .line 728
    .line 729
    const/4 v4, 0x1

    .line 730
    goto/16 :goto_5

    .line 731
    .line 732
    :cond_1e
    move-object/from16 v6, p0

    .line 733
    .line 734
    const/16 v18, 0x0

    .line 735
    .line 736
    return-object v18
.end method

.method public M(I)Z
    .locals 7

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x6

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x7

    .line 6
    if-ne p1, v4, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lb5/c;->t()Lw/o0;

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-ne p1, v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lb5/c;->t()Lw/o0;

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    if-ne p1, v1, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lb5/c;->t()Lw/o0;

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    if-ne p1, v0, :cond_3

    .line 25
    .line 26
    invoke-virtual {p0}, Lb5/c;->t()Lw/o0;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    const/4 v5, 0x3

    .line 31
    if-ne p1, v5, :cond_4

    .line 32
    .line 33
    invoke-virtual {p0}, Lb5/c;->t()Lw/o0;

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    const/4 v5, 0x4

    .line 38
    if-ne p1, v5, :cond_5

    .line 39
    .line 40
    invoke-virtual {p0}, Lb5/c;->t()Lw/o0;

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_5
    if-ne p1, v3, :cond_6

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_6
    if-nez p1, :cond_c

    .line 48
    .line 49
    :goto_0
    const/4 v5, 0x0

    .line 50
    const-string v6, "focusManager"

    .line 51
    .line 52
    if-ne p1, v1, :cond_8

    .line 53
    .line 54
    iget-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ld1/l;

    .line 57
    .line 58
    if-eqz p1, :cond_7

    .line 59
    .line 60
    check-cast p1, Ld1/p;

    .line 61
    .line 62
    invoke-virtual {p1, v3, v3}, Ld1/p;->g(IZ)Z

    .line 63
    .line 64
    .line 65
    return v3

    .line 66
    :cond_7
    invoke-static {v6}, Lgg/l;->g(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v5

    .line 70
    :cond_8
    if-ne p1, v0, :cond_a

    .line 71
    .line 72
    iget-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Ld1/l;

    .line 75
    .line 76
    if-eqz p1, :cond_9

    .line 77
    .line 78
    check-cast p1, Ld1/p;

    .line 79
    .line 80
    invoke-virtual {p1, v2, v3}, Ld1/p;->g(IZ)Z

    .line 81
    .line 82
    .line 83
    return v3

    .line 84
    :cond_9
    invoke-static {v6}, Lgg/l;->g(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v5

    .line 88
    :cond_a
    if-ne p1, v4, :cond_b

    .line 89
    .line 90
    iget-object p1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Ly1/g2;

    .line 93
    .line 94
    if-eqz p1, :cond_b

    .line 95
    .line 96
    check-cast p1, Ly1/i1;

    .line 97
    .line 98
    invoke-virtual {p1}, Ly1/i1;->a()V

    .line 99
    .line 100
    .line 101
    return v3

    .line 102
    :cond_b
    const/4 p1, 0x0

    .line 103
    return p1

    .line 104
    :cond_c
    const-string p1, "invalid ImeAction"

    .line 105
    .line 106
    invoke-static {p1}, Lj8/o;->A(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 p1, 0x0

    .line 110
    return p1
.end method

.method public N(Ljava/util/LinkedHashMap;)V
    .locals 12

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_5

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/Map$Entry;

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lia/c;

    .line 37
    .line 38
    invoke-virtual {v2}, Lia/c;->c()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v4, Lorg/json/JSONObject;

    .line 46
    .line 47
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v5, Lorg/json/JSONArray;

    .line 51
    .line 52
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object v6, v2, Lia/c;->a:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    const-string v8, "displayName"

    .line 66
    .line 67
    const-string v9, "wxId"

    .line 68
    .line 69
    if-eqz v7, :cond_1

    .line 70
    .line 71
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    check-cast v7, Lia/d;

    .line 76
    .line 77
    new-instance v10, Lorg/json/JSONObject;

    .line 78
    .line 79
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 80
    .line 81
    .line 82
    iget-object v11, v7, Lia/d;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v10, v9, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    iget-object v7, v7, Lia/d;->b:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v9, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    const-string v6, "likes"

    .line 99
    .line 100
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    new-instance v5, Lorg/json/JSONArray;

    .line 104
    .line 105
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 106
    .line 107
    .line 108
    iget-object v6, v2, Lia/c;->b:Ljava/util/List;

    .line 109
    .line 110
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    if-eqz v7, :cond_2

    .line 119
    .line 120
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    check-cast v7, Lia/b;

    .line 125
    .line 126
    invoke-static {v7}, Lb5/c;->X(Lia/b;)Lorg/json/JSONObject;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_2
    const-string v6, "comments"

    .line 135
    .line 136
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    new-instance v5, Lorg/json/JSONArray;

    .line 140
    .line 141
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 142
    .line 143
    .line 144
    iget-object v6, v2, Lia/c;->c:Ljava/util/List;

    .line 145
    .line 146
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_3

    .line 155
    .line 156
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Lia/d;

    .line 161
    .line 162
    new-instance v10, Lorg/json/JSONObject;

    .line 163
    .line 164
    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 165
    .line 166
    .line 167
    iget-object v11, v7, Lia/d;->a:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {v10, v9, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    .line 171
    .line 172
    move-result-object v10

    .line 173
    iget-object v7, v7, Lia/d;->b:Ljava/lang/String;

    .line 174
    .line 175
    invoke-virtual {v10, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_3
    const-string v6, "pendingLikes"

    .line 184
    .line 185
    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 186
    .line 187
    .line 188
    new-instance v5, Lorg/json/JSONArray;

    .line 189
    .line 190
    invoke-direct {v5}, Lorg/json/JSONArray;-><init>()V

    .line 191
    .line 192
    .line 193
    iget-object v2, v2, Lia/c;->d:Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-eqz v6, :cond_4

    .line 204
    .line 205
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    check-cast v6, Lia/b;

    .line 210
    .line 211
    invoke-static {v6}, Lb5/c;->X(Lia/b;)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 216
    .line 217
    .line 218
    goto :goto_4

    .line 219
    :cond_4
    const-string v2, "pendingComments"

    .line 220
    .line 221
    invoke-virtual {v4, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 225
    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_5
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iget-object v1, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v1, Landroid/content/SharedPreferences;

    .line 239
    .line 240
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    const-string v2, "entries_v1"

    .line 245
    .line 246
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 251
    .line 252
    .line 253
    iput-object v0, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 254
    .line 255
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 256
    .line 257
    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 258
    .line 259
    .line 260
    iput-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 261
    .line 262
    return-void
.end method

.method public O(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-static {}, Ls0/i;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Ls0/k;->a:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v2, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-object v3, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ls0/j;

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, Ls0/j;->a(J)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-gez v4, :cond_1

    .line 32
    .line 33
    iget-object v4, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    invoke-virtual {v3, p1, v0, v1}, Ls0/j;->b(Ljava/lang/Object;J)Ls0/j;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit v2

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :try_start_1
    iget-object v0, v3, Ls0/j;->c:[Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p1, v0, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    monitor-exit v2

    .line 53
    return-void

    .line 54
    :goto_0
    monitor-exit v2

    .line 55
    throw p1
.end method

.method public P(Lf1/u;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/b;

    .line 4
    .line 5
    iget-object v0, v0, Lh1/b;->g:Lh1/a;

    .line 6
    .line 7
    iput-object p1, v0, Lh1/a;->c:Lf1/u;

    .line 8
    .line 9
    return-void
.end method

.method public declared-synchronized Q(Ljava/lang/String;Ljava/util/List;)V
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lb5/c;->J()Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lia/c;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    :goto_0
    move-object v4, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance v1, Lia/c;

    .line 21
    .line 22
    const/16 v3, 0xf

    .line 23
    .line 24
    invoke-direct {v1, v3, v2, v2}, Lia/c;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_6

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v5, v3

    .line 48
    check-cast v5, Lia/b;

    .line 49
    .line 50
    iget-object v3, v5, Lia/b;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iget-object v3, v5, Lia/b;->d:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-nez v3, :cond_2

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_2
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_3

    .line 82
    .line 83
    :goto_3
    move-object v3, v2

    .line 84
    goto :goto_5

    .line 85
    :cond_3
    iget-object v3, v5, Lia/b;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-nez v7, :cond_4

    .line 100
    .line 101
    move-object v7, v6

    .line 102
    goto :goto_4

    .line 103
    :cond_4
    move-object v7, v3

    .line 104
    :goto_4
    iget-wide v9, v5, Lia/b;->e:J

    .line 105
    .line 106
    const-wide/16 v11, 0x1

    .line 107
    .line 108
    cmp-long v3, v9, v11

    .line 109
    .line 110
    if-gez v3, :cond_5

    .line 111
    .line 112
    move-wide v9, v11

    .line 113
    :cond_5
    const/4 v11, 0x1

    .line 114
    invoke-static/range {v5 .. v11}, Lia/b;->a(Lia/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)Lia/b;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    :goto_5
    if-eqz v3, :cond_1

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :catchall_0
    move-exception v0

    .line 125
    move-object p1, v0

    .line 126
    goto/16 :goto_a

    .line 127
    .line 128
    :cond_6
    new-instance p2, Ljava/util/HashSet;

    .line 129
    .line 130
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 131
    .line 132
    .line 133
    new-instance v6, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    :cond_7
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_8

    .line 147
    .line 148
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    move-object v3, v2

    .line 153
    check-cast v3, Lia/b;

    .line 154
    .line 155
    iget-object v3, v3, Lia/b;->a:Ljava/lang/String;

    .line 156
    .line 157
    invoke-virtual {p2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_7

    .line 162
    .line 163
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_8
    new-instance p2, Ljava/util/HashSet;

    .line 168
    .line 169
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_9

    .line 181
    .line 182
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    check-cast v2, Lia/b;

    .line 187
    .line 188
    invoke-static {v2}, Lb5/c;->h(Lia/b;)Lsf/j;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {p2, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_9
    iget-object v1, v4, Lia/c;->d:Ljava/util/List;

    .line 197
    .line 198
    iget-object v2, v4, Lia/c;->b:Ljava/util/List;

    .line 199
    .line 200
    invoke-static {v1, v2}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    new-instance v2, Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    :cond_a
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_b

    .line 218
    .line 219
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    move-object v5, v3

    .line 224
    check-cast v5, Lia/b;

    .line 225
    .line 226
    invoke-static {v5}, Lb5/c;->h(Lia/b;)Lsf/j;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-virtual {p2, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-nez v5, :cond_a

    .line 235
    .line 236
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_b
    new-instance p2, Ljava/util/HashSet;

    .line 241
    .line 242
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 243
    .line 244
    .line 245
    new-instance v8, Ljava/util/ArrayList;

    .line 246
    .line 247
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    :cond_c
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eqz v2, :cond_d

    .line 259
    .line 260
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    move-object v3, v2

    .line 265
    check-cast v3, Lia/b;

    .line 266
    .line 267
    invoke-static {v3}, Lb5/c;->h(Lia/b;)Lsf/j;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {p2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_c

    .line 276
    .line 277
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_d
    const/4 v7, 0x0

    .line 282
    const/4 v9, 0x5

    .line 283
    const/4 v5, 0x0

    .line 284
    invoke-static/range {v4 .. v9}, Lia/c;->b(Lia/c;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;I)Lia/c;

    .line 285
    .line 286
    .line 287
    move-result-object p2

    .line 288
    invoke-static {v0, p1, p2}, Lb5/c;->I(Ljava/util/LinkedHashMap;Ljava/lang/String;Lia/c;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0, v0}, Lb5/c;->N(Ljava/util/LinkedHashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 292
    .line 293
    .line 294
    monitor-exit p0

    .line 295
    return-void

    .line 296
    :goto_a
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 297
    throw p1
.end method

.method public R(Lu2/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/b;

    .line 4
    .line 5
    iget-object v0, v0, Lh1/b;->g:Lh1/a;

    .line 6
    .line 7
    iput-object p1, v0, Lh1/a;->a:Lu2/c;

    .line 8
    .line 9
    return-void
.end method

.method public S(Lu2/m;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/b;

    .line 4
    .line 5
    iget-object v0, v0, Lh1/b;->g:Lh1/a;

    .line 6
    .line 7
    iput-object p1, v0, Lh1/a;->b:Lu2/m;

    .line 8
    .line 9
    return-void
.end method

.method public declared-synchronized T(Ljava/lang/String;Ljava/util/List;)V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lb5/c;->J()Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lia/c;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    :goto_0
    move-object v4, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance v1, Lia/c;

    .line 21
    .line 22
    const/16 v3, 0xf

    .line 23
    .line 24
    invoke-direct {v1, v3, v2, v2}, Lia/c;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :cond_1
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Lia/d;

    .line 48
    .line 49
    iget-object v5, v3, Lia/d;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v5}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    if-nez v6, :cond_2

    .line 64
    .line 65
    move-object v6, v2

    .line 66
    goto :goto_3

    .line 67
    :cond_2
    iget-object v3, v3, Lia/d;->b:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    if-nez v6, :cond_3

    .line 82
    .line 83
    move-object v3, v5

    .line 84
    :cond_3
    new-instance v6, Lia/d;

    .line 85
    .line 86
    invoke-direct {v6, v5, v3}, Lia/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    if-eqz v6, :cond_1

    .line 90
    .line 91
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    move-object p1, v0

    .line 97
    goto/16 :goto_8

    .line 98
    .line 99
    :cond_4
    new-instance p2, Ljava/util/HashSet;

    .line 100
    .line 101
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 102
    .line 103
    .line 104
    new-instance v5, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :cond_5
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_6

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    move-object v3, v2

    .line 124
    check-cast v3, Lia/d;

    .line 125
    .line 126
    iget-object v3, v3, Lia/d;->a:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {p2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_5

    .line 133
    .line 134
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_6
    new-instance p2, Ljava/util/HashSet;

    .line 139
    .line 140
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_7

    .line 152
    .line 153
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    check-cast v2, Lia/d;

    .line 158
    .line 159
    iget-object v2, v2, Lia/d;->a:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p2, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_7
    iget-object v1, v4, Lia/c;->c:Ljava/util/List;

    .line 166
    .line 167
    iget-object v2, v4, Lia/c;->a:Ljava/util/List;

    .line 168
    .line 169
    invoke-static {v1, v2}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    new-instance v2, Ljava/util/ArrayList;

    .line 174
    .line 175
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    :cond_8
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v3

    .line 186
    if-eqz v3, :cond_9

    .line 187
    .line 188
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    move-object v6, v3

    .line 193
    check-cast v6, Lia/d;

    .line 194
    .line 195
    iget-object v6, v6, Lia/d;->a:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {p2, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-nez v6, :cond_8

    .line 202
    .line 203
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_9
    new-instance p2, Ljava/util/HashSet;

    .line 208
    .line 209
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 210
    .line 211
    .line 212
    new-instance v7, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    :cond_a
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_b

    .line 226
    .line 227
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    move-object v3, v2

    .line 232
    check-cast v3, Lia/d;

    .line 233
    .line 234
    iget-object v3, v3, Lia/d;->a:Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {p2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    if-eqz v3, :cond_a

    .line 241
    .line 242
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_b
    const/4 v8, 0x0

    .line 247
    const/16 v9, 0xa

    .line 248
    .line 249
    const/4 v6, 0x0

    .line 250
    invoke-static/range {v4 .. v9}, Lia/c;->b(Lia/c;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;I)Lia/c;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-static {v0, p1, p2}, Lb5/c;->I(Ljava/util/LinkedHashMap;Ljava/lang/String;Lia/c;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0, v0}, Lb5/c;->N(Ljava/util/LinkedHashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 258
    .line 259
    .line 260
    monitor-exit p0

    .line 261
    return-void

    .line 262
    :goto_8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 263
    throw p1
.end method

.method public U(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/b;

    .line 4
    .line 5
    iget-object v0, v0, Lh1/b;->g:Lh1/a;

    .line 6
    .line 7
    iput-wide p1, v0, Lh1/a;->d:J

    .line 8
    .line 9
    return-void
.end method

.method public V(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FZLjava/io/File;J)V
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    move-object/from16 v1, p3

    .line 3
    .line 4
    move-wide/from16 v2, p8

    .line 5
    .line 6
    const-string v4, "\u7cfb\u7edf\u56de\u9000\u5230 "

    .line 7
    .line 8
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    iget-object v6, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v6, Ljava/util/Set;

    .line 13
    .line 14
    const-string v7, "\u72b6\u6001 "

    .line 15
    .line 16
    new-instance v8, Ljava/util/concurrent/CountDownLatch;

    .line 17
    .line 18
    const/4 v9, 0x1

    .line 19
    invoke-direct {v8, v9}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v10, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 23
    .line 24
    const/4 v11, -0x1

    .line 25
    invoke-direct {v10, v11}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance v12, Lob/a;

    .line 29
    .line 30
    const/4 v13, 0x0

    .line 31
    invoke-direct {v12, v10, v8, v13}, Lob/a;-><init>(Ljava/io/Serializable;Ljava/util/concurrent/CountDownLatch;I)V

    .line 32
    .line 33
    .line 34
    :try_start_0
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v13

    .line 38
    if-eqz v13, :cond_0

    .line 39
    .line 40
    new-instance v13, Landroid/speech/tts/TextToSpeech;

    .line 41
    .line 42
    invoke-direct {v13, p1, v12}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_7

    .line 48
    .line 49
    :cond_0
    new-instance v13, Landroid/speech/tts/TextToSpeech;

    .line 50
    .line 51
    invoke-direct {v13, p1, v12, v1}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast v6, Ljava/util/Collection;

    .line 58
    .line 59
    invoke-interface {v6, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :try_start_1
    invoke-virtual {p0, v2, v3}, Lb5/c;->k(J)V

    .line 63
    .line 64
    .line 65
    move-object v12, v10

    .line 66
    const-wide/16 v9, 0xf

    .line 67
    .line 68
    invoke-virtual {v8, v9, v10, v5}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    const/4 v9, 0x0

    .line 73
    if-eqz v8, :cond_14

    .line 74
    .line 75
    invoke-virtual {p0, v2, v3}, Lb5/c;->k(J)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_13

    .line 83
    .line 84
    const-string v2, "mCurrentEngine"

    .line 85
    .line 86
    invoke-static {v13, v2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    instance-of v3, v2, Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v3, :cond_1

    .line 93
    .line 94
    check-cast v2, Ljava/lang/String;

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_1
    move-exception v0

    .line 98
    move-object/from16 v8, p7

    .line 99
    .line 100
    goto/16 :goto_6

    .line 101
    .line 102
    :cond_1
    move-object v2, v9

    .line 103
    :goto_1
    if-nez v2, :cond_2

    .line 104
    .line 105
    const-string v2, ""

    .line 106
    .line 107
    :cond_2
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    if-nez v3, :cond_4

    .line 120
    .line 121
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    if-nez v3, :cond_4

    .line 126
    .line 127
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_3

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_3
    new-instance v0, Lob/b;

    .line 135
    .line 136
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-direct {v0, v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :cond_4
    :goto_2
    invoke-static/range {p4 .. p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-nez v1, :cond_9

    .line 149
    .line 150
    invoke-virtual {v13}, Landroid/speech/tts/TextToSpeech;->getVoices()Ljava/util/Set;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    if-eqz v1, :cond_8

    .line 155
    .line 156
    check-cast v1, Ljava/lang/Iterable;

    .line 157
    .line 158
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eqz v2, :cond_6

    .line 167
    .line 168
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    move-object v3, v2

    .line 173
    check-cast v3, Landroid/speech/tts/Voice;

    .line 174
    .line 175
    invoke-virtual {v3}, Landroid/speech/tts/Voice;->getName()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    move-object/from16 v4, p4

    .line 180
    .line 181
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-eqz v3, :cond_5

    .line 186
    .line 187
    move-object v9, v2

    .line 188
    :cond_6
    check-cast v9, Landroid/speech/tts/Voice;

    .line 189
    .line 190
    if-eqz v9, :cond_8

    .line 191
    .line 192
    invoke-virtual {v13, v9}, Landroid/speech/tts/TextToSpeech;->setVoice(Landroid/speech/tts/Voice;)I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-eq v1, v11, :cond_7

    .line 197
    .line 198
    goto :goto_4

    .line 199
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 200
    .line 201
    const-string v1, "TTS \u89d2\u8272\u8bbe\u7f6e\u5931\u8d25"

    .line 202
    .line 203
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v0

    .line 207
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 208
    .line 209
    const-string v1, "\u6240\u9009 TTS \u89d2\u8272\u5df2\u4e0d\u53ef\u7528"

    .line 210
    .line 211
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    throw v0

    .line 215
    :cond_9
    if-eqz p6, :cond_a

    .line 216
    .line 217
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_a
    sget-object v1, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;

    .line 221
    .line 222
    :goto_3
    invoke-virtual {v13, v1}, Landroid/speech/tts/TextToSpeech;->setLanguage(Ljava/util/Locale;)I

    .line 223
    .line 224
    .line 225
    :goto_4
    invoke-static/range {p5 .. p5}, Lob/p;->a(F)F

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    invoke-virtual {v13, v1}, Landroid/speech/tts/TextToSpeech;->setSpeechRate(F)I

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    if-eq v1, v11, :cond_12

    .line 234
    .line 235
    invoke-virtual/range {p7 .. p7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-eqz v1, :cond_c

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    if-nez v2, :cond_c

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    if-eqz v1, :cond_b

    .line 252
    .line 253
    goto :goto_5

    .line 254
    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 255
    .line 256
    const-string v1, "\u65e0\u6cd5\u521b\u5efa\u8bed\u97f3\u7f13\u5b58\u76ee\u5f55"

    .line 257
    .line 258
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_c
    :goto_5
    invoke-virtual/range {p7 .. p7}, Ljava/io/File;->delete()Z

    .line 263
    .line 264
    .line 265
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    new-instance v2, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 272
    .line 273
    .line 274
    const-string v3, "hchat_"

    .line 275
    .line 276
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    .line 287
    .line 288
    const/4 v0, 0x1

    .line 289
    invoke-direct {v2, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 290
    .line 291
    .line 292
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 293
    .line 294
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 295
    .line 296
    .line 297
    new-instance v3, Lob/c;

    .line 298
    .line 299
    invoke-direct {v3, v1, v2, v0}, Lob/c;-><init>(Ljava/lang/String;Ljava/util/concurrent/CountDownLatch;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v13, v3}, Landroid/speech/tts/TextToSpeech;->setOnUtteranceProgressListener(Landroid/speech/tts/UtteranceProgressListener;)I

    .line 303
    .line 304
    .line 305
    new-instance v3, Landroid/os/Bundle;

    .line 306
    .line 307
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 308
    .line 309
    .line 310
    move-object/from16 v4, p2

    .line 311
    .line 312
    move-object/from16 v8, p7

    .line 313
    .line 314
    :try_start_2
    invoke-virtual {v13, v4, v3, v8, v1}, Landroid/speech/tts/TextToSpeech;->synthesizeToFile(Ljava/lang/CharSequence;Landroid/os/Bundle;Ljava/io/File;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-eq v1, v11, :cond_11

    .line 319
    .line 320
    const-wide/16 v3, 0x3c

    .line 321
    .line 322
    invoke-virtual {v2, v3, v4, v5}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_10

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    check-cast v0, Ljava/lang/String;

    .line 333
    .line 334
    if-nez v0, :cond_f

    .line 335
    .line 336
    invoke-virtual {v8}, Ljava/io/File;->isFile()Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-eqz v0, :cond_e

    .line 341
    .line 342
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 343
    .line 344
    .line 345
    move-result-wide v1

    .line 346
    const-wide/16 v3, 0x0

    .line 347
    .line 348
    cmp-long v0, v1, v3

    .line 349
    .line 350
    if-lez v0, :cond_e

    .line 351
    .line 352
    invoke-virtual {v8}, Ljava/io/File;->length()J

    .line 353
    .line 354
    .line 355
    move-result-wide v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 356
    const-wide/32 v3, 0x1000000

    .line 357
    .line 358
    .line 359
    cmp-long v0, v1, v3

    .line 360
    .line 361
    if-gtz v0, :cond_d

    .line 362
    .line 363
    invoke-interface {v6, v13}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    :try_start_3
    invoke-virtual {v13}, Landroid/speech/tts/TextToSpeech;->stop()I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 367
    .line 368
    .line 369
    :catchall_2
    :try_start_4
    invoke-virtual {v13}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 370
    .line 371
    .line 372
    :catchall_3
    return-void

    .line 373
    :cond_d
    :try_start_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 374
    .line 375
    const-string v1, "\u8bed\u97f3\u6587\u4ef6\u8d85\u8fc7 16 MiB"

    .line 376
    .line 377
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    throw v0

    .line 381
    :catchall_4
    move-exception v0

    .line 382
    goto :goto_6

    .line 383
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 384
    .line 385
    const-string v1, "TTS \u672a\u751f\u6210\u8bed\u97f3\u6587\u4ef6"

    .line 386
    .line 387
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v0

    .line 391
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    throw v1

    .line 401
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 402
    .line 403
    const-string v1, "TTS \u5408\u6210\u8d85\u65f6"

    .line 404
    .line 405
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v0

    .line 409
    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 410
    .line 411
    const-string v1, "TTS \u5f15\u64ce\u62d2\u7edd\u5408\u6210"

    .line 412
    .line 413
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    throw v0

    .line 417
    :cond_12
    move-object/from16 v8, p7

    .line 418
    .line 419
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 420
    .line 421
    const-string v1, "TTS \u8bed\u901f\u8bbe\u7f6e\u5931\u8d25"

    .line 422
    .line 423
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    throw v0

    .line 427
    :cond_13
    move-object/from16 v8, p7

    .line 428
    .line 429
    new-instance v0, Lob/b;

    .line 430
    .line 431
    invoke-virtual {v12}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 432
    .line 433
    .line 434
    move-result v1

    .line 435
    new-instance v2, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    invoke-direct {v0, v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 448
    .line 449
    .line 450
    throw v0

    .line 451
    :cond_14
    move-object/from16 v8, p7

    .line 452
    .line 453
    new-instance v0, Lob/b;

    .line 454
    .line 455
    const-string v1, "\u8fde\u63a5\u8d85\u65f6"

    .line 456
    .line 457
    invoke-direct {v0, v1, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 458
    .line 459
    .line 460
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 461
    :goto_6
    :try_start_6
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    .line 462
    .line 463
    .line 464
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 465
    :catchall_5
    move-exception v0

    .line 466
    invoke-interface {v6, v13}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    :try_start_7
    invoke-virtual {v13}, Landroid/speech/tts/TextToSpeech;->stop()I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 470
    .line 471
    .line 472
    :catchall_6
    :try_start_8
    invoke-virtual {v13}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 473
    .line 474
    .line 475
    :catchall_7
    throw v0

    .line 476
    :goto_7
    new-instance v1, Lob/b;

    .line 477
    .line 478
    const-string v2, "\u521b\u5efa\u5931\u8d25"

    .line 479
    .line 480
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 481
    .line 482
    .line 483
    throw v1
.end method

.method public Z()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lf/k0;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lf/k0;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v3, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lfg/a;

    .line 20
    .line 21
    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0, v1, v2}, Lf/k0;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;Lia/c;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lb5/c;->J()Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    move-object v2, v1

    .line 14
    check-cast v2, Lia/c;

    .line 15
    .line 16
    if-eqz v2, :cond_6

    .line 17
    .line 18
    iget-object v1, p2, Lia/c;->c:Ljava/util/List;

    .line 19
    .line 20
    new-instance v3, Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lia/d;

    .line 40
    .line 41
    iget-object v4, v4, Lia/d;->a:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move-object p1, v0

    .line 49
    goto/16 :goto_4

    .line 50
    .line 51
    :cond_0
    iget-object p2, p2, Lia/c;->d:Ljava/util/List;

    .line 52
    .line 53
    new-instance v1, Ljava/util/HashSet;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_1

    .line 67
    .line 68
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    check-cast v4, Lia/b;

    .line 73
    .line 74
    invoke-static {v4}, Lb5/c;->h(Lia/b;)Lsf/j;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    iget-object p2, v2, Lia/c;->c:Ljava/util/List;

    .line 83
    .line 84
    new-instance v5, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    :cond_2
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_3

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    move-object v6, v4

    .line 104
    check-cast v6, Lia/d;

    .line 105
    .line 106
    iget-object v6, v6, Lia/d;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v3, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    if-nez v6, :cond_2

    .line 113
    .line 114
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_3
    iget-object p2, v2, Lia/c;->d:Ljava/util/List;

    .line 119
    .line 120
    new-instance v6, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    :cond_4
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_5

    .line 134
    .line 135
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    move-object v4, v3

    .line 140
    check-cast v4, Lia/b;

    .line 141
    .line 142
    invoke-static {v4}, Lb5/c;->h(Lia/b;)Lsf/j;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-nez v4, :cond_4

    .line 151
    .line 152
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_5
    const/4 v7, 0x3

    .line 157
    const/4 v3, 0x0

    .line 158
    const/4 v4, 0x0

    .line 159
    invoke-static/range {v2 .. v7}, Lia/c;->b(Lia/c;Ljava/util/List;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/ArrayList;I)Lia/c;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-static {v0, p1, p2}, Lb5/c;->I(Ljava/util/LinkedHashMap;Ljava/lang/String;Lia/c;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v0}, Lb5/c;->N(Ljava/util/LinkedHashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    .line 168
    .line 169
    monitor-exit p0

    .line 170
    return-void

    .line 171
    :cond_6
    monitor-exit p0

    .line 172
    return-void

    .line 173
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    throw p1
.end method

.method public b(Lx1/f0;Lx1/s;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lm/a;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lm/a;

    .line 8
    .line 9
    iget-object v2, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lm/a;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_5

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-eq p2, v3, :cond_4

    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    if-eq p2, v3, :cond_2

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-ne p2, v0, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Lx1/f0;->n:Lx1/f0;

    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Lm/a;->f(Lx1/f0;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {v1, p1}, Lm/a;->f(Lx1/f0;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {}, Lokio/a;->k()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object p2, p1, Lx1/f0;->n:Lx1/f0;

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    invoke-virtual {v2, p1}, Lm/a;->f(Lx1/f0;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    invoke-virtual {v0, p1}, Lm/a;->f(Lx1/f0;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    invoke-virtual {v1, p1}, Lm/a;->f(Lx1/f0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p1}, Lm/a;->f(Lx1/f0;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    invoke-virtual {v0, p1}, Lm/a;->f(Lx1/f0;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p1}, Lm/a;->f(Lx1/f0;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv8/q;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lv8/h;

    .line 8
    .line 9
    new-instance v2, Lab/e;

    .line 10
    .line 11
    const/16 v3, 0xe

    .line 12
    .line 13
    invoke-direct {v2, v1, p1, v0, v3}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {v0, v1, p1, v2}, Lv8/q;->b(Lv8/h;Lv8/c;Lfg/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public declared-synchronized d()Ljava/util/LinkedHashSet;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 3
    .line 4
    invoke-virtual {p0}, Lb5/c;->J()Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw v0
.end method

.method public f()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/Date;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    const-wide/32 v3, 0x493e0

    .line 20
    .line 21
    .line 22
    div-long/2addr v1, v3

    .line 23
    mul-long/2addr v1, v3

    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/text/SimpleDateFormat;

    .line 30
    .line 31
    monitor-enter v1

    .line 32
    :try_start_0
    iget-object v2, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Ljava/text/SimpleDateFormat;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    monitor-exit v1

    .line 45
    const-string v1, ".log"

    .line 46
    .line 47
    invoke-static {v0, v1}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    monitor-exit v1

    .line 54
    throw v0
.end method

.method public declared-synchronized g()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 3
    .line 4
    invoke-virtual {p0}, Lb5/c;->J()Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/util/Collection;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroid/content/SharedPreferences;

    .line 20
    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "entries_v1"

    .line 26
    .line 27
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 32
    .line 33
    .line 34
    const-string v0, ""

    .line 35
    .line 36
    iput-object v0, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 37
    .line 38
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lb5/c;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw v0
.end method

.method public i(Lx1/f0;)Z
    .locals 4

    .line 1
    iget-object v0, p1, Lx1/f0;->n:Lx1/f0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    iget-object v3, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, Lm/a;

    .line 13
    .line 14
    iget-object v3, v3, Lm/a;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Lx1/a2;

    .line 17
    .line 18
    invoke-virtual {v3, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_2

    .line 23
    .line 24
    iget-object v3, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lm/a;

    .line 27
    .line 28
    iget-object v3, v3, Lm/a;->h:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Lx1/a2;

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move p1, v1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    move p1, v2

    .line 42
    :goto_2
    if-nez v0, :cond_3

    .line 43
    .line 44
    if-eqz p1, :cond_3

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    return v1
.end method

.method public j(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb8/f;

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, Lb8/f;->l:Ljava/lang/String;

    .line 12
    .line 13
    if-nez v3, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    sget v3, Lb8/l;->a:I

    .line 18
    .line 19
    const/16 v3, 0x3a

    .line 20
    .line 21
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-lez v3, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move-object v3, v2

    .line 33
    :goto_0
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget-object v1, v0, Lb8/f;->l:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    .line 49
    .line 50
    invoke-virtual {v0}, Lb8/f;->r()Lb8/f;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object v2, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    new-instance v1, Ljava/io/IOException;

    .line 60
    .line 61
    const-string v2, "Mismatch end: "

    .line 62
    .line 63
    const-string v3, ", expect = "

    .line 64
    .line 65
    invoke-static {v2, p1, v3}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object v0, v0, Lb8/f;->l:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v1

    .line 82
    :cond_5
    const-string v0, "Invalid state endTag "

    .line 83
    .line 84
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-static {p1}, Lj8/o;->y(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public k(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    cmp-long p1, p1, v0

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Thread;->isInterrupted()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/InterruptedException;

    .line 25
    .line 26
    const-string p2, "TTS \u5408\u6210\u5df2\u53d6\u6d88"

    .line 27
    .line 28
    invoke-direct {p1, p2}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method public declared-synchronized l(Ljava/lang/String;)Lia/c;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lb5/c;->J()Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lia/c;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lia/c;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p1, Lia/c;->b:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v2, p1, Lia/c;->c:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object p1, p1, Lia/c;->d:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {p1}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {v0, v1, v2, p1}, Lia/c;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lia/c;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance p1, Lia/c;

    .line 49
    .line 50
    const/16 v0, 0xf

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-direct {p1, v0, v1, v1}, Lia/c;-><init>(ILjava/util/List;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    :goto_0
    monitor-exit p0

    .line 57
    return-object p1

    .line 58
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    throw p1
.end method

.method public m(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lj8/l;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    :try_start_0
    invoke-interface {v0, p1}, Lj8/l;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsa/d;

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object p1, v1

    .line 11
    :goto_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    const-string p2, "\u672a\u77e5"

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string v2, "\u5143"

    .line 25
    .line 26
    invoke-static {p2, v2, v1, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    :goto_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    :cond_2
    move-object v2, v1

    .line 37
    goto :goto_4

    .line 38
    :cond_3
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    if-eqz v2, :cond_4

    .line 50
    .line 51
    invoke-virtual {v2}, Lg8/i;->G()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_4

    .line 56
    .line 57
    invoke-virtual {v2, p3}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    goto :goto_2

    .line 62
    :catchall_0
    move-exception v2

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    if-eqz p3, :cond_5

    .line 65
    .line 66
    move-object v2, p3

    .line 67
    goto :goto_2

    .line 68
    :cond_5
    move-object v2, v1

    .line 69
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    goto :goto_4

    .line 73
    :goto_3
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v5, "\u89e3\u6790\u4f1a\u8bdd\u540d\u5931\u8d25: "

    .line 80
    .line 81
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {v0, v2}, Lsa/d;->a(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    if-eqz p3, :cond_2

    .line 95
    .line 96
    move-object v2, p3

    .line 97
    :goto_4
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    const-string v2, "\u672a\u77e5\u4f1a\u8bdd"

    .line 104
    .line 105
    :cond_6
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-nez v4, :cond_7

    .line 110
    .line 111
    iget-object v4, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v4, Lna/k;

    .line 114
    .line 115
    iget-object v4, v4, Lna/k;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 116
    .line 117
    invoke-virtual {v4, p4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    check-cast v4, Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_7
    move-object v4, v1

    .line 125
    :goto_5
    invoke-virtual {p0, p4, v4}, Lb5/c;->K(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p4

    .line 129
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_8

    .line 134
    .line 135
    goto :goto_9

    .line 136
    :cond_8
    :try_start_1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->e()Lg8/i;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-eqz v1, :cond_a

    .line 148
    .line 149
    invoke-virtual {v1}, Lg8/i;->G()Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    if-eqz v4, :cond_a

    .line 154
    .line 155
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    if-nez v4, :cond_9

    .line 160
    .line 161
    invoke-static {p3}, Lg8/i;->I(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_9

    .line 166
    .line 167
    invoke-virtual {v1, p3, p4}, Lg8/i;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p3

    .line 171
    goto :goto_6

    .line 172
    :catchall_1
    move-exception p3

    .line 173
    goto :goto_8

    .line 174
    :cond_9
    invoke-virtual {v1, p4}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    :goto_6
    move-object v1, p3

    .line 179
    goto :goto_7

    .line 180
    :cond_a
    move-object v1, p4

    .line 181
    :goto_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 182
    .line 183
    .line 184
    goto :goto_9

    .line 185
    :goto_8
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    new-instance v1, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v4, "\u89e3\u6790\u6210\u5458\u540d\u5931\u8d25: "

    .line 192
    .line 193
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p3

    .line 203
    invoke-interface {v0, p3}, Lsa/d;->a(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    move-object v1, p4

    .line 207
    :goto_9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 208
    .line 209
    .line 210
    move-result p3

    .line 211
    if-eqz p3, :cond_b

    .line 212
    .line 213
    const-string v1, "\u672a\u77e5\u6210\u5458"

    .line 214
    .line 215
    :cond_b
    const-string p3, "@"

    .line 216
    .line 217
    const-string p4, "\u2005"

    .line 218
    .line 219
    invoke-static {p3, v1, p4}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p3

    .line 223
    iget-object p4, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p4, Ll3/l;

    .line 226
    .line 227
    const-string v0, "hb_time_format"

    .line 228
    .line 229
    const-string v4, "yyyy-MM-dd HH:mm:ss"

    .line 230
    .line 231
    invoke-virtual {p4, v0, v4}, Ll3/l;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p4

    .line 235
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 236
    .line 237
    .line 238
    move-result-wide v4

    .line 239
    invoke-static {v4, v5, p4}, La/a;->M(JLjava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p4

    .line 243
    const-string v0, "{amount}"

    .line 244
    .line 245
    invoke-static {p1, v0, p2, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    const-string v0, "{\u91d1\u989d}"

    .line 250
    .line 251
    invoke-static {p1, v0, p2, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    const-string p2, "{talker}"

    .line 256
    .line 257
    invoke-static {p1, p2, v2, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    const-string p2, "{\u4f1a\u8bdd}"

    .line 262
    .line 263
    invoke-static {p1, p2, v2, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    const-string p2, "{@\u53d1\u7ea2\u5305\u7684\u4eba}"

    .line 268
    .line 269
    invoke-static {p1, p2, p3, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    const-string p2, "{@sender}"

    .line 274
    .line 275
    invoke-static {p1, p2, p3, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    const-string p2, "{@\u6210\u5458}"

    .line 280
    .line 281
    invoke-static {p1, p2, p3, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    const-string p2, "{sender}"

    .line 286
    .line 287
    invoke-static {p1, p2, v1, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    const-string p2, "{\u6210\u5458}"

    .line 292
    .line 293
    invoke-static {p1, p2, v1, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    const-string p2, "{time}"

    .line 298
    .line 299
    invoke-static {p1, p2, p4, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    return-object p1
.end method

.method public o()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ls0/i;->c()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Ls0/k;->a:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v2, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ls0/j;

    .line 23
    .line 24
    invoke-virtual {v2, v0, v1}, Ls0/j;->a(J)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ltz v0, :cond_1

    .line 29
    .line 30
    iget-object v1, v2, Ls0/j;->c:[Ljava/lang/Object;

    .line 31
    .line 32
    aget-object v0, v1, v0

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    return-object v0
.end method

.method public onSuccess(Ljava/io/File;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv8/h;

    .line 4
    .line 5
    iget-object v1, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lv8/q;

    .line 8
    .line 9
    iget-object v2, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lv8/e;

    .line 12
    .line 13
    iget-wide v2, v2, Lv8/e;->e:J

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    cmp-long v4, v2, v4

    .line 18
    .line 19
    if-lez v4, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    cmp-long v4, v4, v2

    .line 26
    .line 27
    if-gez v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    const-string p1, "\u89c6\u9891\u4e0b\u8f7d\u6587\u4ef6\u4e0d\u5b8c\u6574: "

    .line 34
    .line 35
    const-string v6, "/"

    .line 36
    .line 37
    invoke-static {v4, v5, p1, v6}, Lp/a;->o(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v2, Lab/e;

    .line 49
    .line 50
    const/16 v3, 0xe

    .line 51
    .line 52
    invoke-direct {v2, v0, p1, v1, v3}, Lab/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    const/4 p1, 0x0

    .line 56
    invoke-virtual {v1, v0, p1, v2}, Lv8/q;->b(Lv8/h;Lv8/c;Lfg/a;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    new-instance v2, Lv8/c;

    .line 61
    .line 62
    invoke-direct {v2, v1, v0, p1}, Lv8/c;-><init>(Lv8/q;Lv8/h;Ljava/io/File;)V

    .line 63
    .line 64
    .line 65
    new-instance v3, Lv8/c;

    .line 66
    .line 67
    invoke-direct {v3, v0, p1, v1}, Lv8/c;-><init>(Lv8/h;Ljava/io/File;Lv8/q;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v0, v2, v3}, Lv8/q;->b(Lv8/h;Lv8/c;Lfg/a;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public p()Lf1/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/b;

    .line 4
    .line 5
    iget-object v0, v0, Lh1/b;->g:Lh1/a;

    .line 6
    .line 7
    iget-object v0, v0, Lh1/a;->c:Lf1/u;

    .line 8
    .line 9
    return-object v0
.end method

.method public q(Le5/a;)Le5/a;
    .locals 2

    .line 1
    new-instance v0, Lb5/d;

    .line 2
    .line 3
    iget-object p1, p1, Lq5/a;->g:Ljava/io/Writer;

    .line 4
    .line 5
    check-cast p1, Ld6/g;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ld6/g;-><init>(Ljava/io/Writer;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Le5/a;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p1, v0, v1}, Le5/a;-><init>(Ljava/io/Writer;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method

.method public r()Lp2/b;
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ll3/w;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lp2/b;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v3, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Landroid/os/LocaleList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    monitor-exit v1

    .line 23
    return-object v2

    .line 24
    :cond_0
    :try_start_1
    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    new-instance v3, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    :goto_0
    if-ge v4, v2, :cond_1

    .line 35
    .line 36
    new-instance v5, Lp2/a;

    .line 37
    .line 38
    invoke-virtual {v0, v4}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-direct {v5, v6}, Lp2/a;-><init>(Ljava/util/Locale;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance v2, Lp2/b;

    .line 54
    .line 55
    invoke-direct {v2, v3}, Lp2/b;-><init>(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v2, p0, Lb5/c;->b:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    .line 62
    monitor-exit v1

    .line 63
    return-object v2

    .line 64
    :goto_1
    monitor-exit v1

    .line 65
    throw v0
.end method

.method public s()Lu2/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/b;

    .line 4
    .line 5
    iget-object v0, v0, Lh1/b;->g:Lh1/a;

    .line 6
    .line 7
    iget-object v0, v0, Lh1/a;->a:Lu2/c;

    .line 8
    .line 9
    return-object v0
.end method

.method public t()Lw/o0;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw/o0;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "keyboardActions"

    .line 9
    .line 10
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    throw v0
.end method

.method public u()Lu2/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/b;

    .line 4
    .line 5
    iget-object v0, v0, Lh1/b;->g:Lh1/a;

    .line 6
    .line 7
    iget-object v0, v0, Lh1/a;->b:Lu2/m;

    .line 8
    .line 9
    return-object v0
.end method

.method public v()J
    .locals 2

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh1/b;

    .line 4
    .line 5
    iget-object v0, v0, Lh1/b;->g:Lh1/a;

    .line 6
    .line 7
    iget-wide v0, v0, Lh1/a;->d:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public w(Ljava/lang/CharSequence;IILl3/u;)Z
    .locals 7

    .line 1
    iget v0, p4, Ll3/u;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ll3/d;

    .line 13
    .line 14
    invoke-virtual {p4}, Ll3/u;->b()Lm3/a;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/16 v5, 0x8

    .line 19
    .line 20
    invoke-virtual {v4, v5}, Lm3/c;->a(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    iget-object v6, v4, Lm3/c;->j:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v6, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v4, v4, Lm3/c;->g:I

    .line 31
    .line 32
    add-int/2addr v5, v4

    .line 33
    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v4, Ll3/d;->b:Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    check-cast v4, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    if-ge p2, p3, :cond_2

    .line 65
    .line 66
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    add-int/lit8 p2, p2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object p1, v0, Ll3/d;->a:Landroid/text/TextPaint;

    .line 77
    .line 78
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    sget p3, Lb3/b;->a:I

    .line 83
    .line 84
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    iget p2, p4, Ll3/u;->c:I

    .line 89
    .line 90
    and-int/lit8 p2, p2, 0x4

    .line 91
    .line 92
    if-eqz p1, :cond_3

    .line 93
    .line 94
    or-int/lit8 p1, p2, 0x2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    or-int/lit8 p1, p2, 0x1

    .line 98
    .line 99
    :goto_1
    iput p1, p4, Ll3/u;->c:I

    .line 100
    .line 101
    :cond_4
    iget p1, p4, Ll3/u;->c:I

    .line 102
    .line 103
    and-int/lit8 p1, p1, 0x3

    .line 104
    .line 105
    if-ne p1, v1, :cond_5

    .line 106
    .line 107
    return v3

    .line 108
    :cond_5
    return v2
.end method

.method public x(Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lb5/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    :try_start_0
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 27
    .line 28
    new-instance v2, Lb9/e;

    .line 29
    .line 30
    invoke-direct {v2, p0}, Lb9/e;-><init>(Lb5/c;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1, v2}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 34
    .line 35
    .line 36
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    new-instance v2, Lsf/f;

    .line 41
    .line 42
    invoke-direct {v2, v1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    move-object v1, v2

    .line 46
    :goto_0
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-nez v2, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toGenericString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string v0, "[Hchat:HideChatMenu] \u5b89\u88c5\u804a\u5929\u957f\u6309\u83dc\u5355 Hook \u5931\u8d25: "

    .line 61
    .line 62
    invoke-static {v0, p1, v2}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    return p1

    .line 74
    :cond_2
    :goto_2
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    const/4 p1, 0x0

    .line 78
    return p1
.end method

.method public y(Ljava/lang/String;)Z
    .locals 6

    .line 1
    const-string v0, "hb_stats_today"

    .line 2
    .line 3
    const-string v1, "hb_stats_count"

    .line 4
    .line 5
    iget-object v2, p0, Lb5/c;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lna/k;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    :cond_0
    :goto_0
    move p1, v4

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lf8/i;->s0(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_2

    .line 29
    .line 30
    iget-object v5, v2, Lna/k;->b:Ljava/util/Set;

    .line 31
    .line 32
    invoke-interface {v5, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iget-object v2, v2, Lna/k;->a:Ljava/util/Set;

    .line 40
    .line 41
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    :goto_1
    if-nez p1, :cond_3

    .line 46
    .line 47
    return v4

    .line 48
    :cond_3
    const/4 p1, 0x1

    .line 49
    :try_start_0
    iget-object v2, p0, Lb5/c;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Landroid/content/Context;

    .line 52
    .line 53
    const-string v3, "Hchat_redpacket_config"

    .line 54
    .line 55
    invoke-static {v2, v3}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v2, v1, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    add-int/2addr v5, p1

    .line 68
    invoke-interface {v3, v1, v5}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {v2, v0, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    add-int/2addr v2, p1

    .line 77
    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    .line 83
    .line 84
    :catchall_0
    return p1
.end method
