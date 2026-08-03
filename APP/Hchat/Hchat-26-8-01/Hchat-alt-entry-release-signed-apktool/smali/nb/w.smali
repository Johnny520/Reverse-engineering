.class public final Lnb/w;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final A:Log/k;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/ArrayDeque;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final e:Lnb/e;

.field public f:Landroid/speech/tts/TextToSpeech;

.field public g:Z

.field public h:Z

.field public i:J

.field public j:Lca/r;

.field public k:I

.field public l:Ljava/lang/String;

.field public m:Ljava/util/List;

.field public n:I

.field public o:Lnb/l;

.field public p:Ljava/lang/String;

.field public q:I

.field public r:Z

.field public s:J

.field public t:I

.field public u:Landroid/media/session/MediaSession;

.field public v:Lnb/q;

.field public w:Lnb/u;

.field public x:Ljava/lang/Integer;

.field public y:Ljava/lang/Runnable;

.field public volatile z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Log/k;

    .line 2
    .line 3
    const-string v1, "^([A-Za-z0-9_@.\\-]+?):\\n"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lnb/w;->A:Log/k;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object p1, v0

    .line 11
    :cond_0
    iput-object p1, p0, Lnb/w;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-string v0, "Hchat_text_speech_config"

    .line 14
    .line 15
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Landroid/os/Handler;

    .line 20
    .line 21
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lnb/w;->b:Landroid/os/Handler;

    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayDeque;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 36
    .line 37
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lnb/w;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 42
    .line 43
    new-instance v0, Lnb/e;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, p0, v1}, Lnb/e;-><init>(Lnb/w;I)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Lnb/w;->e:Lnb/e;

    .line 50
    .line 51
    new-instance v0, Lb9/b;

    .line 52
    .line 53
    const/16 v1, 0x8

    .line 54
    .line 55
    invoke-direct {v0, p0, v1}, Lb9/b;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    const-string v1, ""

    .line 59
    .line 60
    iput-object v1, p0, Lnb/w;->l:Ljava/lang/String;

    .line 61
    .line 62
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 63
    .line 64
    iput-object v2, p0, Lnb/w;->m:Ljava/util/List;

    .line 65
    .line 66
    iput-object v1, p0, Lnb/w;->p:Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public static C(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/util/List;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lh/Hchat/hooks/api/model/WeChatMessage;->imagePath:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v3

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v1, 0x2

    .line 27
    new-array v1, v1, [C

    .line 28
    .line 29
    fill-array-data v1, :array_0

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v1}, Log/m;->U0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const/4 v2, 0x1

    .line 37
    new-array v4, v2, [C

    .line 38
    .line 39
    const/16 v5, 0x3a

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    aput-char v5, v4, v6

    .line 43
    .line 44
    const/4 v5, 0x6

    .line 45
    invoke-static {v1, v4, v5}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    const/4 v5, 0x3

    .line 54
    if-lt v4, v5, :cond_4

    .line 55
    .line 56
    const/16 v4, 0x3c

    .line 57
    .line 58
    invoke-static {p0, v4}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_4

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    const/4 v5, 0x4

    .line 69
    if-ne v4, v5, :cond_2

    .line 70
    .line 71
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    goto :goto_1

    .line 83
    :goto_2
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_3

    .line 96
    .line 97
    move-object v3, v1

    .line 98
    :cond_3
    if-eqz v3, :cond_4

    .line 99
    .line 100
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    :cond_4
    sget-object v1, Lh/Hchat/hooks/api/model/WeChatMessage;->Companion:Ll8/d;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    const-string v1, "filename"

    .line 109
    .line 110
    invoke-static {p0, v1}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    const-string v3, "voiceurl"

    .line 115
    .line 116
    invoke-static {p0, v3}, Ll8/d;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-static {p0, v1}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {p0, v3}, Ll8/d;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    filled-new-array {v2, v4, v1, p0}, [Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    :cond_5
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_6

    .line 145
    .line 146
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    move-object v2, v1

    .line 151
    check-cast v2, Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-nez v2, :cond_5

    .line 158
    .line 159
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_6
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0

    .line 168
    nop

    .line 169
    :array_0
    .array-data 2
        0xas
        0xds
    .end array-data
.end method

.method public static final a(Lnb/w;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lnb/w;->p:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    iget-boolean p1, p0, Lnb/w;->r:Z

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object p1, p0, Lnb/w;->o:Lnb/l;

    .line 22
    .line 23
    instance-of p1, p1, Lnb/n;

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const-string p1, ""

    .line 29
    .line 30
    iput-object p1, p0, Lnb/w;->p:Ljava/lang/String;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    iput p1, p0, Lnb/w;->q:I

    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Lnb/w;->o:Lnb/l;

    .line 37
    .line 38
    invoke-virtual {p0}, Lnb/w;->n()V

    .line 39
    .line 40
    .line 41
    :cond_3
    :goto_0
    return-void
.end method

.method public static final b(Lnb/w;Lnb/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lnb/w;->g()V

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const-string p1, "[Hchat:TextSpeech] \u539f\u8bed\u97f3\u64ad\u653e\u5931\u8d25: "

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1}, Lfb/v0;->m(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Lnb/w;->o:Lnb/l;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    iput-boolean p1, p0, Lnb/w;->r:Z

    .line 32
    .line 33
    invoke-virtual {p0}, Lnb/w;->n()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static d(Lnb/k;Ljava/lang/String;Lh/Hchat/hooks/api/model/WeChatMessage;)V
    .locals 5

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    invoke-static {p2}, Lnb/w;->C(Lh/Hchat/hooks/api/model/WeChatMessage;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lnb/k;->g:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v4, "initial"

    .line 37
    .line 38
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    :cond_2
    invoke-interface {v2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-virtual {p2}, Lh/Hchat/hooks/api/model/WeChatMessage;->bodyContent()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-nez p2, :cond_4

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_4
    const/4 p1, 0x0

    .line 60
    :goto_1
    if-eqz p1, :cond_5

    .line 61
    .line 62
    iget-object p0, p0, Lnb/k;->h:Ljava/util/LinkedHashSet;

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_5
    :goto_2
    return-void
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

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
    const-string p0, "empty"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/16 v0, 0xa

    .line 11
    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/16 v0, 0xd

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const/16 v0, 0xa0

    .line 31
    .line 32
    invoke-static {v0, p0}, Log/m;->P0(ILjava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static k(Lnb/z;)Z
    .locals 4

    .line 1
    const-string v0, "text_speech_quiet_enable"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-string v0, "text_speech_quiet_start"

    .line 11
    .line 12
    const-string v1, "23:00"

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Lnb/z;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lnb/w;->l(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const-string v1, "text_speech_quiet_end"

    .line 23
    .line 24
    const-string v2, "08:00"

    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Lnb/z;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Lnb/w;->l(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-ltz v0, :cond_5

    .line 35
    .line 36
    if-gez p0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    if-ne v0, p0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const/16 v2, 0xb

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    mul-int/lit8 v2, v2, 0x3c

    .line 53
    .line 54
    const/16 v3, 0xc

    .line 55
    .line 56
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v1, v2

    .line 61
    if-ge v0, p0, :cond_3

    .line 62
    .line 63
    if-gt v0, v1, :cond_5

    .line 64
    .line 65
    if-ge v1, p0, :cond_5

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    if-ge v1, v0, :cond_4

    .line 69
    .line 70
    if-ge v1, p0, :cond_5

    .line 71
    .line 72
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 73
    return p0

    .line 74
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 75
    return p0
.end method

.method public static l(Ljava/lang/String;)I
    .locals 3

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
    const-string v0, ":"

    .line 10
    .line 11
    filled-new-array {v0}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0, v0}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-static {v0, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/16 v1, 0xa

    .line 29
    .line 30
    invoke-static {v1, v0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-static {v2, p0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    invoke-static {v1, p0}, Log/t;->e0(ILjava/lang/String;)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-ltz v0, :cond_0

    .line 60
    .line 61
    const/16 v1, 0x18

    .line 62
    .line 63
    if-ge v0, v1, :cond_0

    .line 64
    .line 65
    if-ltz p0, :cond_0

    .line 66
    .line 67
    const/16 v1, 0x3c

    .line 68
    .line 69
    if-ge p0, v1, :cond_0

    .line 70
    .line 71
    mul-int/2addr v0, v1

    .line 72
    add-int/2addr v0, p0

    .line 73
    return v0

    .line 74
    :cond_0
    const/4 p0, -0x1

    .line 75
    return p0
.end method

.method public static q(Lnb/k;Lj8/y;)Lnb/j;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, v0, Lnb/k;->g:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v2, Ljava/lang/Iterable;

    .line 22
    .line 23
    new-instance v3, Lnb/v;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    const/4 v6, 0x0

    .line 41
    if-eqz v3, :cond_9

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    check-cast v3, Ljava/util/Map$Entry;

    .line 51
    .line 52
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    check-cast v4, Ljava/lang/String;

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    check-cast v3, Ljava/lang/String;

    .line 69
    .line 70
    new-instance v5, Ljava/io/File;

    .line 71
    .line 72
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    const-string v8, ""

    .line 80
    .line 81
    const-wide/16 v9, 0x0

    .line 82
    .line 83
    if-eqz v7, :cond_0

    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 86
    .line 87
    .line 88
    move-result-wide v11

    .line 89
    cmp-long v7, v11, v9

    .line 90
    .line 91
    if-lez v7, :cond_0

    .line 92
    .line 93
    new-instance v1, Lnb/j;

    .line 94
    .line 95
    invoke-static {v5, v4, v0}, Lnb/w;->s(Ljava/io/File;Ljava/lang/String;Lnb/k;)Lnb/m;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-direct {v1, v0, v8}, Lnb/j;-><init>(Lnb/m;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_0
    move-object/from16 v7, p1

    .line 104
    .line 105
    invoke-virtual {v7, v4}, Lj8/y;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v11

    .line 109
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {v11}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    if-nez v12, :cond_1

    .line 117
    .line 118
    move-object v12, v11

    .line 119
    goto :goto_1

    .line 120
    :cond_1
    move-object v12, v6

    .line 121
    :goto_1
    if-eqz v12, :cond_2

    .line 122
    .line 123
    new-instance v6, Ljava/io/File;

    .line 124
    .line 125
    invoke-direct {v6, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_2
    if-eqz v6, :cond_3

    .line 129
    .line 130
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    .line 131
    .line 132
    .line 133
    move-result v12

    .line 134
    if-eqz v12, :cond_3

    .line 135
    .line 136
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 137
    .line 138
    .line 139
    move-result-wide v12

    .line 140
    cmp-long v12, v12, v9

    .line 141
    .line 142
    if-lez v12, :cond_3

    .line 143
    .line 144
    new-instance v1, Lnb/j;

    .line 145
    .line 146
    invoke-static {v6, v4, v0}, Lnb/w;->s(Ljava/io/File;Ljava/lang/String;Lnb/k;)Lnb/m;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-direct {v1, v0, v8}, Lnb/j;-><init>(Lnb/m;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    return-object v1

    .line 154
    :cond_3
    invoke-static {v4}, Lnb/w;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    const-string v12, "ready"

    .line 163
    .line 164
    const-string v13, "missing"

    .line 165
    .line 166
    const-string v14, "empty"

    .line 167
    .line 168
    if-nez v8, :cond_4

    .line 169
    .line 170
    move-object v5, v13

    .line 171
    goto :goto_2

    .line 172
    :cond_4
    invoke-virtual {v5}, Ljava/io/File;->length()J

    .line 173
    .line 174
    .line 175
    move-result-wide v15

    .line 176
    cmp-long v5, v15, v9

    .line 177
    .line 178
    if-lez v5, :cond_5

    .line 179
    .line 180
    move-object v5, v12

    .line 181
    goto :goto_2

    .line 182
    :cond_5
    move-object v5, v14

    .line 183
    :goto_2
    invoke-static {v11}, Lnb/w;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    if-nez v6, :cond_6

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    invoke-virtual {v6}, Ljava/io/File;->isFile()Z

    .line 191
    .line 192
    .line 193
    move-result v11

    .line 194
    if-nez v11, :cond_7

    .line 195
    .line 196
    move-object v12, v13

    .line 197
    goto :goto_4

    .line 198
    :cond_7
    invoke-virtual {v6}, Ljava/io/File;->length()J

    .line 199
    .line 200
    .line 201
    move-result-wide v15

    .line 202
    cmp-long v6, v15, v9

    .line 203
    .line 204
    if-lez v6, :cond_8

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    :goto_3
    move-object v12, v14

    .line 208
    :goto_4
    new-instance v6, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v3, ":"

    .line 217
    .line 218
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    const-string v4, "(direct="

    .line 225
    .line 226
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string v4, ",resolved="

    .line 233
    .line 234
    invoke-static {v6, v4, v8, v3, v12}, Lj8/b;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const-string v3, ")"

    .line 238
    .line 239
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_9
    new-instance v7, Lnb/j;

    .line 252
    .line 253
    const/4 v4, 0x0

    .line 254
    const/16 v5, 0x3e

    .line 255
    .line 256
    move-object v0, v1

    .line 257
    const-string v1, ";"

    .line 258
    .line 259
    const/4 v2, 0x0

    .line 260
    const/4 v3, 0x0

    .line 261
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    const-string v1, "candidates=["

    .line 266
    .line 267
    const-string v2, "]"

    .line 268
    .line 269
    invoke-static {v1, v0, v2}, Leh/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-direct {v7, v6, v0}, Lnb/j;-><init>(Lnb/m;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v7
.end method

.method public static r(Lnb/k;I)Lnb/m;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_11

    .line 9
    .line 10
    iget-object v1, v1, Lj8/p;->b:Lj8/y;

    .line 11
    .line 12
    if-eqz v1, :cond_11

    .line 13
    .line 14
    invoke-static {v0, v1}, Lnb/w;->q(Lnb/k;Lj8/y;)Lnb/j;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    iget-object v4, v3, Lnb/j;->a:Lnb/m;

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    return-object v4

    .line 23
    :cond_0
    add-int/lit8 v4, p1, 0x1

    .line 24
    .line 25
    const/16 v5, 0x78

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    if-lt v4, v5, :cond_1

    .line 29
    .line 30
    move v4, v7

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v4, 0x0

    .line 33
    :goto_0
    if-eqz p1, :cond_3

    .line 34
    .line 35
    rem-int/lit8 v5, p1, 0x4

    .line 36
    .line 37
    if-eqz v5, :cond_3

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const/4 v5, 0x0

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    :goto_1
    move v5, v7

    .line 45
    :goto_2
    if-eqz v5, :cond_f

    .line 46
    .line 47
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messageStore()Lk8/s;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    iget-wide v9, v0, Lnb/k;->c:J

    .line 52
    .line 53
    const-wide/16 v11, 0x0

    .line 54
    .line 55
    cmp-long v13, v9, v11

    .line 56
    .line 57
    if-lez v13, :cond_4

    .line 58
    .line 59
    if-eqz v8, :cond_4

    .line 60
    .line 61
    invoke-virtual {v8, v9, v10}, Lk8/s;->c(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    move-object v9, v2

    .line 67
    :goto_3
    if-nez v9, :cond_5

    .line 68
    .line 69
    iget-wide v13, v0, Lnb/k;->d:J

    .line 70
    .line 71
    cmp-long v10, v13, v11

    .line 72
    .line 73
    if-lez v10, :cond_5

    .line 74
    .line 75
    if-eqz v8, :cond_5

    .line 76
    .line 77
    iget-object v10, v0, Lnb/k;->b:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v8, v13, v14, v10}, Lk8/s;->e(JLjava/lang/String;)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 80
    .line 81
    .line 82
    move-result-object v10

    .line 83
    goto :goto_4

    .line 84
    :cond_5
    move-object v10, v2

    .line 85
    :goto_4
    if-eqz v4, :cond_6

    .line 86
    .line 87
    iget-wide v13, v0, Lnb/k;->d:J

    .line 88
    .line 89
    cmp-long v15, v13, v11

    .line 90
    .line 91
    if-lez v15, :cond_6

    .line 92
    .line 93
    if-eqz v8, :cond_6

    .line 94
    .line 95
    invoke-virtual {v8, v13, v14}, Lk8/s;->d(J)Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :cond_6
    const-string v13, "msgId"

    .line 100
    .line 101
    invoke-static {v0, v13, v9}, Lnb/w;->d(Lnb/k;Ljava/lang/String;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 102
    .line 103
    .line 104
    const-string v13, "talkerSvrId"

    .line 105
    .line 106
    invoke-static {v0, v13, v10}, Lnb/w;->d(Lnb/k;Ljava/lang/String;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 107
    .line 108
    .line 109
    const-string v13, "globalSvrId"

    .line 110
    .line 111
    invoke-static {v0, v13, v2}, Lnb/w;->d(Lnb/k;Ljava/lang/String;Lh/Hchat/hooks/api/model/WeChatMessage;)V

    .line 112
    .line 113
    .line 114
    if-eqz v8, :cond_7

    .line 115
    .line 116
    invoke-virtual {v8}, Lk8/s;->h()Z

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    if-ne v8, v7, :cond_7

    .line 121
    .line 122
    move v8, v7

    .line 123
    goto :goto_5

    .line 124
    :cond_7
    const/4 v8, 0x0

    .line 125
    :goto_5
    iget-object v13, v0, Lnb/k;->e:Lh/Hchat/hooks/api/model/WeChatMessage;

    .line 126
    .line 127
    if-eqz v13, :cond_8

    .line 128
    .line 129
    move v13, v7

    .line 130
    goto :goto_6

    .line 131
    :cond_8
    const/4 v13, 0x0

    .line 132
    :goto_6
    iget-wide v14, v0, Lnb/k;->c:J

    .line 133
    .line 134
    cmp-long v14, v14, v11

    .line 135
    .line 136
    const-string v15, "skip"

    .line 137
    .line 138
    if-lez v14, :cond_a

    .line 139
    .line 140
    if-eqz v9, :cond_9

    .line 141
    .line 142
    move v14, v7

    .line 143
    goto :goto_7

    .line 144
    :cond_9
    const/4 v14, 0x0

    .line 145
    :goto_7
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    goto :goto_8

    .line 150
    :cond_a
    move-object v14, v15

    .line 151
    :goto_8
    if-nez v9, :cond_c

    .line 152
    .line 153
    iget-wide v6, v0, Lnb/k;->d:J

    .line 154
    .line 155
    cmp-long v6, v6, v11

    .line 156
    .line 157
    if-lez v6, :cond_c

    .line 158
    .line 159
    if-eqz v10, :cond_b

    .line 160
    .line 161
    const/4 v6, 0x1

    .line 162
    goto :goto_9

    .line 163
    :cond_b
    const/4 v6, 0x0

    .line 164
    :goto_9
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    goto :goto_a

    .line 169
    :cond_c
    move-object v6, v15

    .line 170
    :goto_a
    if-eqz v4, :cond_e

    .line 171
    .line 172
    iget-wide v9, v0, Lnb/k;->d:J

    .line 173
    .line 174
    cmp-long v4, v9, v11

    .line 175
    .line 176
    if-lez v4, :cond_e

    .line 177
    .line 178
    if-eqz v2, :cond_d

    .line 179
    .line 180
    const/16 v16, 0x1

    .line 181
    .line 182
    goto :goto_b

    .line 183
    :cond_d
    const/16 v16, 0x0

    .line 184
    .line 185
    :goto_b
    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    :cond_e
    new-instance v2, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v4, "lookups=[store="

    .line 192
    .line 193
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v4, ",initial="

    .line 200
    .line 201
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v4, ",msgId="

    .line 208
    .line 209
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    const-string v4, ",talkerSvrId="

    .line 216
    .line 217
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    const-string v4, ",globalSvrId="

    .line 224
    .line 225
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v4, "]"

    .line 232
    .line 233
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    iput-object v2, v0, Lnb/k;->i:Ljava/lang/String;

    .line 241
    .line 242
    :cond_f
    if-eqz v5, :cond_10

    .line 243
    .line 244
    invoke-static {v0, v1}, Lnb/w;->q(Lnb/k;Lj8/y;)Lnb/j;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    :cond_10
    iget-object v1, v0, Lnb/k;->i:Ljava/lang/String;

    .line 249
    .line 250
    iget-object v2, v3, Lnb/j;->b:Ljava/lang/String;

    .line 251
    .line 252
    const-string v4, "voiceApi=true "

    .line 253
    .line 254
    const-string v5, " "

    .line 255
    .line 256
    invoke-static {v4, v1, v5, v2}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    iput-object v1, v0, Lnb/k;->j:Ljava/lang/String;

    .line 261
    .line 262
    iget-object v0, v3, Lnb/j;->a:Lnb/m;

    .line 263
    .line 264
    return-object v0

    .line 265
    :cond_11
    const-string v1, "voiceApi=false"

    .line 266
    .line 267
    iput-object v1, v0, Lnb/k;->j:Ljava/lang/String;

    .line 268
    .line 269
    return-object v2
.end method

.method public static s(Ljava/io/File;Ljava/lang/String;Lnb/k;)Lnb/m;
    .locals 7

    .line 1
    sget-object v0, Lj8/e;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    iget-wide v3, p2, Lnb/k;->c:J

    .line 4
    .line 5
    iget-object p2, p2, Lnb/k;->h:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-static {p2}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    const v6, 0xea60

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    move-object v2, p1

    .line 16
    invoke-static/range {v1 .. v6}, Lj8/e;->d(Ljava/lang/Object;Ljava/lang/String;JLjava/util/List;I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/16 p2, 0x3e8

    .line 21
    .line 22
    if-ge p1, p2, :cond_0

    .line 23
    .line 24
    move p1, p2

    .line 25
    :cond_0
    new-instance p2, Lnb/m;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-direct {p2, p0, p1}, Lnb/m;-><init>(Ljava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    return-object p2
.end method


# virtual methods
.method public final A()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v2, p0, Lnb/w;->o:Lnb/l;

    .line 7
    .line 8
    instance-of v3, v2, Lnb/n;

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    check-cast v2, Lnb/n;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v2, 0x0

    .line 16
    :goto_0
    if-eqz v2, :cond_4

    .line 17
    .line 18
    iget-object v3, v2, Lnb/n;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Lnb/w;->c()V

    .line 21
    .line 22
    .line 23
    iget v2, v2, Lnb/n;->b:I

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-static {v2, v1, v4}, Lr9/e0;->r(III)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    iput v2, p0, Lnb/w;->q:I

    .line 45
    .line 46
    iget-wide v4, p0, Lnb/w;->s:J

    .line 47
    .line 48
    const-wide/16 v6, 0x1

    .line 49
    .line 50
    add-long/2addr v4, v6

    .line 51
    iput-wide v4, p0, Lnb/w;->s:J

    .line 52
    .line 53
    const-string v2, "hchat_text_speech_"

    .line 54
    .line 55
    invoke-static {v4, v5, v2}, Lbc/e;->g(JLjava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iput-object v2, p0, Lnb/w;->p:Ljava/lang/String;

    .line 60
    .line 61
    :try_start_0
    new-instance v4, Landroid/os/Bundle;

    .line 62
    .line 63
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 64
    .line 65
    .line 66
    const-string v5, "streamType"

    .line 67
    .line 68
    const-string v6, "3"

    .line 69
    .line 70
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v3, v1, v4, v2}, Landroid/speech/tts/TextToSpeech;->speak(Ljava/lang/CharSequence;ILandroid/os/Bundle;Ljava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    new-instance v2, Lsf/f;

    .line 84
    .line 85
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    move-object v0, v2

    .line 89
    :goto_1
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    const/4 v3, -0x1

    .line 94
    if-nez v2, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v4, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v5, "[Hchat:TextSpeech] \u64ad\u62a5\u5931\u8d25: "

    .line 104
    .line 105
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0, v2}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 116
    .line 117
    .line 118
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    :goto_2
    check-cast v0, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-ne v0, v3, :cond_3

    .line 129
    .line 130
    const-string v2, ""

    .line 131
    .line 132
    iput-object v2, p0, Lnb/w;->p:Ljava/lang/String;

    .line 133
    .line 134
    :cond_3
    if-eq v0, v3, :cond_4

    .line 135
    .line 136
    const/4 v1, 0x1

    .line 137
    :cond_4
    :goto_3
    return v1
.end method

.method public final B()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lnb/w;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x6

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x3

    .line 8
    :goto_0
    :try_start_0
    iget-object v1, p0, Lnb/w;->u:Landroid/media/session/MediaSession;

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    new-instance v2, Landroid/media/session/PlaybackState$Builder;

    .line 13
    .line 14
    invoke-direct {v2}, Landroid/media/session/PlaybackState$Builder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-wide/16 v3, 0x226

    .line 18
    .line 19
    invoke-virtual {v2, v3, v4}, Landroid/media/session/PlaybackState$Builder;->setActions(J)Landroid/media/session/PlaybackState$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-boolean v3, p0, Lnb/w;->r:Z

    .line 24
    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/high16 v3, 0x3f800000    # 1.0f

    .line 30
    .line 31
    :goto_1
    const-wide/16 v4, -0x1

    .line 32
    .line 33
    invoke-virtual {v2, v0, v4, v5, v3}, Landroid/media/session/PlaybackState$Builder;->setState(IJF)Landroid/media/session/PlaybackState$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/media/session/PlaybackState$Builder;->build()Landroid/media/session/PlaybackState;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v1, v0}, Landroid/media/session/MediaSession;->setPlaybackState(Landroid/media/session/PlaybackState;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    :catchall_0
    :cond_2
    return-void
.end method

.method public final c()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lnb/w;->y()Lnb/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "text_speech_volume_control"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lnb/w;->o()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v0, p0, Lnb/w;->w:Lnb/u;

    .line 18
    .line 19
    iget-object v1, p0, Lnb/w;->a:Landroid/content/Context;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    goto :goto_4

    .line 24
    :cond_1
    new-instance v0, Lnb/u;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v0, p0, v2}, Lnb/u;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    new-instance v2, Landroid/content/IntentFilter;

    .line 31
    .line 32
    const-string v3, "android.media.VOLUME_CHANGED_ACTION"

    .line 33
    .line 34
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v4, 0x21

    .line 40
    .line 41
    if-lt v3, v4, :cond_2

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v2

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 51
    .line 52
    .line 53
    :goto_0
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :goto_1
    new-instance v3, Lsf/f;

    .line 57
    .line 58
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    move-object v2, v3

    .line 62
    :goto_2
    invoke-static {v2}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-string v4, "[Hchat:TextSpeech] \u540e\u53f0\u97f3\u91cf\u53d8\u5316\u76d1\u542c\u521d\u59cb\u5316\u5931\u8d25: "

    .line 74
    .line 75
    invoke-static {v4, v2, v3}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 79
    .line 80
    :goto_3
    check-cast v2, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    iput-object v0, p0, Lnb/w;->w:Lnb/u;

    .line 89
    .line 90
    :cond_4
    :goto_4
    iget-object v0, p0, Lnb/w;->u:Landroid/media/session/MediaSession;

    .line 91
    .line 92
    const/4 v2, 0x1

    .line 93
    if-nez v0, :cond_8

    .line 94
    .line 95
    const-string v0, "audio"

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    instance-of v3, v0, Landroid/media/AudioManager;

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    check-cast v0, Landroid/media/AudioManager;

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_5
    move-object v0, v4

    .line 110
    :goto_5
    if-eqz v0, :cond_9

    .line 111
    .line 112
    const/4 v3, 0x3

    .line 113
    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-ge v5, v2, :cond_6

    .line 118
    .line 119
    move v5, v2

    .line 120
    :cond_6
    invoke-virtual {v0, v3}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    const/4 v6, 0x0

    .line 125
    invoke-static {v0, v6, v5}, Lr9/e0;->r(III)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    new-instance v6, Lnb/q;

    .line 130
    .line 131
    invoke-direct {v6, v5, v0, p0}, Lnb/q;-><init>(IILnb/w;)V

    .line 132
    .line 133
    .line 134
    iput-object v6, p0, Lnb/w;->v:Lnb/q;

    .line 135
    .line 136
    :try_start_1
    new-instance v0, Landroid/media/session/MediaSession;

    .line 137
    .line 138
    const-string v5, "HchatTextSpeech"

    .line 139
    .line 140
    invoke-direct {v0, v1, v5}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v3}, Landroid/media/session/MediaSession;->setFlags(I)V

    .line 144
    .line 145
    .line 146
    new-instance v1, Lnb/p;

    .line 147
    .line 148
    invoke-direct {v1}, Landroid/media/session/MediaSession$Callback;-><init>()V

    .line 149
    .line 150
    .line 151
    iget-object v3, p0, Lnb/w;->b:Landroid/os/Handler;

    .line 152
    .line 153
    invoke-virtual {v0, v1, v3}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;Landroid/os/Handler;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v6}, Landroid/media/session/MediaSession;->setPlaybackToRemote(Landroid/media/VolumeProvider;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    .line 158
    .line 159
    goto :goto_6

    .line 160
    :catchall_1
    move-exception v0

    .line 161
    new-instance v1, Lsf/f;

    .line 162
    .line 163
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    move-object v0, v1

    .line 167
    :goto_6
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    if-nez v1, :cond_7

    .line 172
    .line 173
    move-object v4, v0

    .line 174
    goto :goto_7

    .line 175
    :cond_7
    iput-object v4, p0, Lnb/w;->v:Lnb/q;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    const-string v3, "[Hchat:TextSpeech] \u540e\u53f0\u97f3\u91cf\u63a7\u5236\u521d\u59cb\u5316\u5931\u8d25: "

    .line 182
    .line 183
    invoke-static {v3, v0, v1}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 184
    .line 185
    .line 186
    :goto_7
    check-cast v4, Landroid/media/session/MediaSession;

    .line 187
    .line 188
    iput-object v4, p0, Lnb/w;->u:Landroid/media/session/MediaSession;

    .line 189
    .line 190
    :cond_8
    invoke-virtual {p0}, Lnb/w;->B()V

    .line 191
    .line 192
    .line 193
    iget-object v0, p0, Lnb/w;->u:Landroid/media/session/MediaSession;

    .line 194
    .line 195
    if-eqz v0, :cond_9

    .line 196
    .line 197
    invoke-virtual {v0, v2}, Landroid/media/session/MediaSession;->setActive(Z)V

    .line 198
    .line 199
    .line 200
    :cond_9
    return-void
.end method

.method public final e()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lnb/w;->l:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget v0, p0, Lnb/w;->n:I

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    add-int/2addr v0, v2

    .line 15
    iget-object v3, p0, Lnb/w;->m:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-lt v0, v3, :cond_1

    .line 22
    .line 23
    return v1

    .line 24
    :cond_1
    iget v0, p0, Lnb/w;->n:I

    .line 25
    .line 26
    add-int/2addr v0, v2

    .line 27
    iput v0, p0, Lnb/w;->n:I

    .line 28
    .line 29
    iput v1, p0, Lnb/w;->k:I

    .line 30
    .line 31
    return v2
.end method

.method public final f(Lnb/k;J)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lnb/w;->z:J

    .line 2
    .line 3
    cmp-long p2, p2, v0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    if-nez p2, :cond_2

    .line 7
    .line 8
    iget-object p2, p0, Lnb/w;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    iget-object v0, p1, Lnb/k;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-nez p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lnb/w;->y()Lnb/z;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string v0, "text_speech_enable"

    .line 24
    .line 25
    invoke-virtual {p2, v0}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const-string v0, "text_speech_play_voice_messages"

    .line 32
    .line 33
    invoke-virtual {p2, v0}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {p2}, Lnb/z;->a()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p1, Lnb/k;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-static {p2}, Lnb/w;->k(Lnb/z;)Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-nez p2, :cond_1

    .line 56
    .line 57
    const/4 p3, 0x1

    .line 58
    :cond_1
    if-nez p3, :cond_2

    .line 59
    .line 60
    iget-object p2, p0, Lnb/w;->d:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 61
    .line 62
    iget-object p1, p1, Lnb/k;->a:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    return p3
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lnb/w;->y:Ljava/lang/Runnable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lnb/w;->b:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lnb/w;->y:Ljava/lang/Runnable;

    .line 12
    .line 13
    return-void
.end method

.method public final i()V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    move-object v4, v3

    .line 23
    check-cast v4, Lnb/l;

    .line 24
    .line 25
    instance-of v4, v4, Lnb/n;

    .line 26
    .line 27
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-nez v4, :cond_0

    .line 36
    .line 37
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->clear()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 48
    .line 49
    instance-of v0, v0, Lnb/n;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    iput-boolean v0, p0, Lnb/w;->r:Z

    .line 58
    .line 59
    const-string v1, ""

    .line 60
    .line 61
    iput-object v1, p0, Lnb/w;->p:Ljava/lang/String;

    .line 62
    .line 63
    iput v0, p0, Lnb/w;->q:I

    .line 64
    .line 65
    :cond_2
    invoke-virtual {p0}, Lnb/w;->o()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lnb/w;->n()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final j()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lnb/w;->y()Lnb/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "text_speech_enable"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :cond_0
    :goto_0
    move-object v5, p0

    .line 14
    goto/16 :goto_4

    .line 15
    .line 16
    :cond_1
    iget-boolean v0, p0, Lnb/w;->g:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0}, Lnb/w;->n()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    iget-boolean v0, p0, Lnb/w;->h:Z

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p0, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, Lnb/w;->h:Z

    .line 35
    .line 36
    iget-wide v0, p0, Lnb/w;->i:J

    .line 37
    .line 38
    const-wide/16 v2, 0x1

    .line 39
    .line 40
    add-long v6, v0, v2

    .line 41
    .line 42
    iput-wide v6, p0, Lnb/w;->i:J

    .line 43
    .line 44
    invoke-virtual {p0}, Lnb/w;->y()Lnb/z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lnb/z;->c()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    iget-object v0, p0, Lnb/w;->l:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    const/4 v1, 0x0

    .line 59
    iget-object v2, p0, Lnb/w;->a:Landroid/content/Context;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v0, p0, Lnb/w;->m:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_5

    .line 70
    .line 71
    :cond_4
    iput-object v8, p0, Lnb/w;->l:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v2, v8}, Lnb/c;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, Lnb/w;->m:Ljava/util/List;

    .line 78
    .line 79
    iput v1, p0, Lnb/w;->n:I

    .line 80
    .line 81
    :cond_5
    iget-object v0, p0, Lnb/w;->m:Ljava/util/List;

    .line 82
    .line 83
    iget v3, p0, Lnb/w;->n:I

    .line 84
    .line 85
    invoke-static {v3, v0}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/lang/String;

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    move-object v9, v0

    .line 94
    goto :goto_1

    .line 95
    :cond_6
    move-object v9, v8

    .line 96
    :goto_1
    :try_start_0
    new-instance v4, Lnb/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 97
    .line 98
    move-object v5, p0

    .line 99
    :try_start_1
    invoke-direct/range {v4 .. v9}, Lnb/i;-><init>(Lnb/w;JLjava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_7

    .line 107
    .line 108
    new-instance v0, Landroid/speech/tts/TextToSpeech;

    .line 109
    .line 110
    invoke-direct {v0, v2, v4}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    goto :goto_3

    .line 116
    :cond_7
    new-instance v0, Landroid/speech/tts/TextToSpeech;

    .line 117
    .line 118
    invoke-direct {v0, v2, v4, v9}, Landroid/speech/tts/TextToSpeech;-><init>(Landroid/content/Context;Landroid/speech/tts/TextToSpeech$OnInitListener;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :goto_2
    iput-object v0, v5, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 122
    .line 123
    iget-object v0, v5, Lnb/w;->j:Lca/r;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 124
    .line 125
    iget-object v2, v5, Lnb/w;->b:Landroid/os/Handler;

    .line 126
    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    :try_start_2
    invoke-virtual {v2, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 130
    .line 131
    .line 132
    :cond_8
    new-instance v0, Lca/r;

    .line 133
    .line 134
    invoke-direct {v0, v6, v7, p0, v9}, Lca/r;-><init>(JLnb/w;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iput-object v0, v5, Lnb/w;->j:Lca/r;

    .line 138
    .line 139
    const-wide/16 v3, 0x1f40

    .line 140
    .line 141
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :catchall_1
    move-exception v0

    .line 146
    move-object v5, p0

    .line 147
    :goto_3
    iput-boolean v1, v5, Lnb/w;->h:Z

    .line 148
    .line 149
    invoke-virtual {p0, v0}, Lnb/w;->v(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :goto_4
    return-void
.end method

.method public final m()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lnb/w;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 7
    .line 8
    instance-of v1, v0, Lnb/n;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    iput-boolean v2, p0, Lnb/w;->r:Z

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    iput-object v0, p0, Lnb/w;->p:Ljava/lang/String;

    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    :catchall_0
    :cond_1
    invoke-virtual {p0}, Lnb/w;->B()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    instance-of v1, v0, Lnb/o;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    new-instance v1, Lj8/u;

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    invoke-direct {v1, v0, v3}, Lj8/u;-><init>(Lj8/y;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lj8/y;->r(Lj8/w;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-ne v0, v2, :cond_4

    .line 55
    .line 56
    iput-boolean v2, p0, Lnb/w;->r:Z

    .line 57
    .line 58
    invoke-virtual {p0}, Lnb/w;->g()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lnb/w;->B()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    if-nez v0, :cond_5

    .line 66
    .line 67
    :cond_4
    :goto_0
    return-void

    .line 68
    :cond_5
    invoke-static {}, Lokio/a;->k()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final n()V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lnb/w;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_9

    .line 4
    .line 5
    iget-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lnb/l;

    .line 18
    .line 19
    if-eqz v1, :cond_8

    .line 20
    .line 21
    instance-of v2, v1, Lnb/n;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    iget-boolean v2, p0, Lnb/w;->g:Z

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lnb/w;->j()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lnb/w;->o:Lnb/l;

    .line 38
    .line 39
    invoke-virtual {p0}, Lnb/w;->A()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_9

    .line 44
    .line 45
    iput-object v3, p0, Lnb/w;->o:Lnb/l;

    .line 46
    .line 47
    invoke-virtual {p0}, Lnb/w;->n()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    instance-of v2, v1, Lnb/o;

    .line 52
    .line 53
    if-eqz v2, :cond_7

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lnb/w;->o:Lnb/l;

    .line 59
    .line 60
    check-cast v1, Lnb/o;

    .line 61
    .line 62
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const/4 v2, 0x0

    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 70
    .line 71
    if-eqz v0, :cond_6

    .line 72
    .line 73
    invoke-virtual {p0}, Lnb/w;->c()V

    .line 74
    .line 75
    .line 76
    iget-object v4, v1, Lnb/o;->a:Ljava/lang/String;

    .line 77
    .line 78
    new-instance v5, Lb/e;

    .line 79
    .line 80
    const/16 v6, 0x1c

    .line 81
    .line 82
    invoke-direct {v5, p0, v6, v1}, Lb/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-nez v6, :cond_5

    .line 90
    .line 91
    invoke-static {v4}, Leh/a;->y(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-nez v6, :cond_3

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_3
    iget-object v6, v0, Lj8/y;->a:Lh/Hchat/dexkit/DexFinder;

    .line 99
    .line 100
    iget-object v7, v6, Lh/Hchat/dexkit/DexFinder;->voicePlaybackStartMethod:Ljava/lang/reflect/Method;

    .line 101
    .line 102
    if-eqz v7, :cond_4

    .line 103
    .line 104
    iget-object v6, v6, Lh/Hchat/dexkit/DexFinder;->voicePlaybackStopMethod:Ljava/lang/reflect/Method;

    .line 105
    .line 106
    if-eqz v6, :cond_4

    .line 107
    .line 108
    new-instance v2, Lj8/s;

    .line 109
    .line 110
    invoke-direct {v2, v0, v4, v5}, Lj8/s;-><init>(Lj8/y;Ljava/lang/String;Lb/e;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2}, Lj8/y;->r(Lj8/w;)Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    goto :goto_1

    .line 118
    :cond_4
    const-string v4, "\u64ad\u653e\u539f\u8bed\u97f3\u5931\u8d25: \u539f\u751f\u64ad\u653e\u5668\u672a\u5c31\u7eea"

    .line 119
    .line 120
    invoke-virtual {v0, v4}, Lj8/y;->m(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_5
    :goto_0
    const-string v5, "\u64ad\u653e\u539f\u8bed\u97f3\u5931\u8d25: \u6587\u4ef6\u4e0d\u5b58\u5728 "

    .line 125
    .line 126
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v0, v4}, Lj8/y;->m(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :goto_1
    if-eqz v2, :cond_6

    .line 134
    .line 135
    invoke-virtual {p0, v1}, Lnb/w;->x(Lnb/o;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    if-nez v2, :cond_9

    .line 139
    .line 140
    iput-object v3, p0, Lnb/w;->o:Lnb/l;

    .line 141
    .line 142
    invoke-virtual {p0}, Lnb/w;->n()V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_7
    invoke-static {}, Lokio/a;->k()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_8
    invoke-virtual {p0}, Lnb/w;->o()V

    .line 151
    .line 152
    .line 153
    :cond_9
    :goto_2
    return-void
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, Lnb/w;->u:Landroid/media/session/MediaSession;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lnb/w;->u:Landroid/media/session/MediaSession;

    .line 5
    .line 6
    iput-object v1, p0, Lnb/w;->v:Lnb/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :try_start_0
    invoke-virtual {v0, v2}, Landroid/media/session/MediaSession;->setActive(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :catchall_0
    :cond_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    :try_start_1
    invoke-virtual {v0}, Landroid/media/session/MediaSession;->release()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 17
    .line 18
    .line 19
    :catchall_1
    :cond_1
    iget-object v0, p0, Lnb/w;->w:Lnb/u;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iput-object v1, p0, Lnb/w;->w:Lnb/u;

    .line 24
    .line 25
    iput-object v1, p0, Lnb/w;->x:Ljava/lang/Integer;

    .line 26
    .line 27
    :try_start_2
    iget-object v1, p0, Lnb/w;->a:Landroid/content/Context;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    .line 31
    .line 32
    :catchall_2
    :cond_2
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iput-object v0, p0, Lnb/w;->l:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 6
    .line 7
    iput-object v0, p0, Lnb/w;->m:Ljava/util/List;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lnb/w;->n:I

    .line 11
    .line 12
    iput v0, p0, Lnb/w;->k:I

    .line 13
    .line 14
    return-void
.end method

.method public final t()V
    .locals 3

    .line 1
    iget-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 2
    .line 3
    instance-of v1, v0, Lnb/o;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    :catchall_0
    :cond_0
    invoke-virtual {p0}, Lnb/w;->w()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lnb/w;->p()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    instance-of v1, v0, Lnb/n;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    check-cast v0, Lnb/n;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    move-object v0, v2

    .line 30
    :goto_0
    iput-object v2, p0, Lnb/w;->o:Lnb/l;

    .line 31
    .line 32
    const-string v1, ""

    .line 33
    .line 34
    iput-object v1, p0, Lnb/w;->p:Ljava/lang/String;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput v1, p0, Lnb/w;->q:I

    .line 38
    .line 39
    iput-boolean v1, p0, Lnb/w;->r:Z

    .line 40
    .line 41
    iput v1, p0, Lnb/w;->t:I

    .line 42
    .line 43
    :try_start_1
    iget-object v1, p0, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/speech/tts/TextToSpeech;->stop()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    :catchall_1
    :cond_3
    invoke-virtual {p0}, Lnb/w;->o()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lnb/w;->w()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lnb/w;->p()V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lnb/w;->c:Ljava/util/ArrayDeque;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_5

    .line 71
    .line 72
    invoke-virtual {p0}, Lnb/w;->y()Lnb/z;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v1, "text_speech_enable"

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_5

    .line 83
    .line 84
    invoke-virtual {p0}, Lnb/w;->n()V

    .line 85
    .line 86
    .line 87
    :cond_5
    return-void
.end method

.method public final u()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lnb/w;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    instance-of v1, v0, Lnb/n;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iput-boolean v2, p0, Lnb/w;->r:Z

    .line 16
    .line 17
    invoke-virtual {p0}, Lnb/w;->A()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 25
    .line 26
    invoke-virtual {p0}, Lnb/w;->n()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    instance-of v1, v0, Lnb/o;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    iget-object v1, v1, Lj8/p;->b:Lj8/y;

    .line 41
    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    new-instance v3, Lj8/u;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-direct {v3, v1, v4}, Lj8/u;-><init>(Lj8/y;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v3}, Lj8/y;->r(Lj8/w;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    const/4 v3, 0x1

    .line 55
    if-ne v1, v3, :cond_3

    .line 56
    .line 57
    iput-boolean v2, p0, Lnb/w;->r:Z

    .line 58
    .line 59
    check-cast v0, Lnb/o;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Lnb/w;->x(Lnb/o;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lnb/w;->B()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_2
    invoke-static {}, Lokio/a;->k()V

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_0
    return-void
.end method

.method public final v(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lnb/w;->w()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lnb/w;->y()Lnb/z;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "text_speech_enable"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget v0, p0, Lnb/w;->k:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    add-int/2addr v0, v1

    .line 21
    iput v0, p0, Lnb/w;->k:I

    .line 22
    .line 23
    const-wide/16 v2, 0x320

    .line 24
    .line 25
    iget-object v4, p0, Lnb/w;->b:Landroid/os/Handler;

    .line 26
    .line 27
    if-gt v0, v1, :cond_1

    .line 28
    .line 29
    new-instance p1, Lnb/e;

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    invoke-direct {p1, p0, v0}, Lnb/e;-><init>(Lnb/w;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, p1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {p0}, Lnb/w;->e()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    new-instance p1, Lnb/e;

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    invoke-direct {p1, p0, v0}, Lnb/e;-><init>(Lnb/w;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, p1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    invoke-virtual {p0}, Lnb/w;->y()Lnb/z;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lnb/z;->c()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_3

    .line 68
    .line 69
    const-string v0, "\u7cfb\u7edf\u9ed8\u8ba4"

    .line 70
    .line 71
    :cond_3
    const-string v1, "[Hchat:TextSpeech] \u6587\u5b57\u8f6c\u8bed\u97f3\u5f15\u64ce\u521d\u59cb\u5316\u5931\u8d25: "

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0, p1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lnb/w;->p()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lnb/w;->i()V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final w()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lnb/w;->i:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lnb/w;->i:J

    .line 7
    .line 8
    iget-object v0, p0, Lnb/w;->j:Lca/r;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lnb/w;->b:Landroid/os/Handler;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lnb/w;->j:Lca/r;

    .line 19
    .line 20
    :try_start_0
    iget-object v1, p0, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    :catchall_0
    :cond_1
    iput-object v0, p0, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lnb/w;->g:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lnb/w;->h:Z

    .line 33
    .line 34
    const-string v1, ""

    .line 35
    .line 36
    iput-object v1, p0, Lnb/w;->p:Ljava/lang/String;

    .line 37
    .line 38
    iput v0, p0, Lnb/w;->q:I

    .line 39
    .line 40
    return-void
.end method

.method public final x(Lnb/o;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lnb/w;->g()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lnb/o;->b:I

    .line 5
    .line 6
    int-to-long v0, v0

    .line 7
    const-wide/16 v2, 0x3a98

    .line 8
    .line 9
    add-long v4, v0, v2

    .line 10
    .line 11
    const-wide/16 v6, 0x4e20

    .line 12
    .line 13
    const-wide/32 v8, 0x493e0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v4 .. v9}, Lr9/e0;->s(JJJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    new-instance v2, Lgg/u;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Lac/l;

    .line 26
    .line 27
    const/16 v4, 0x15

    .line 28
    .line 29
    invoke-direct {v3, p0, v2, p1, v4}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    iput-object v3, v2, Lgg/u;->g:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v3, p0, Lnb/w;->y:Ljava/lang/Runnable;

    .line 35
    .line 36
    iget-object p1, p0, Lnb/w;->b:Landroid/os/Handler;

    .line 37
    .line 38
    invoke-virtual {p1, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final y()Lnb/z;
    .locals 2

    .line 1
    new-instance v0, Lnb/z;

    .line 2
    .line 3
    iget-object v1, p0, Lnb/w;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lnb/z;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final z()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lnb/w;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lnb/w;->o:Lnb/l;

    .line 11
    .line 12
    const-string v1, ""

    .line 13
    .line 14
    iput-object v1, p0, Lnb/w;->p:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, p0, Lnb/w;->q:I

    .line 18
    .line 19
    iput-boolean v1, p0, Lnb/w;->r:Z

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-object v1, p0, Lnb/w;->o:Lnb/l;

    .line 23
    .line 24
    instance-of v1, v0, Lnb/n;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    :try_start_0
    iget-object v0, p0, Lnb/w;->f:Landroid/speech/tts/TextToSpeech;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/speech/tts/TextToSpeech;->stop()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    instance-of v1, v0, Lnb/o;

    .line 37
    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Lnb/w;->g()V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    iget-object v0, v0, Lj8/p;->b:Lj8/y;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    new-instance v1, Lj8/u;

    .line 54
    .line 55
    const/4 v2, 0x2

    .line 56
    invoke-direct {v1, v0, v2}, Lj8/u;-><init>(Lj8/y;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lj8/y;->r(Lj8/w;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    if-nez v0, :cond_4

    .line 64
    .line 65
    :catchall_0
    :cond_3
    :goto_0
    invoke-virtual {p0}, Lnb/w;->n()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    invoke-static {}, Lokio/a;->k()V

    .line 70
    .line 71
    .line 72
    return-void
.end method
