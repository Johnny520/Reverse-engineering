.class public abstract Lnb/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnb/f0;->a:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lfg/l;)Lm/a;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v8, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v8, p0

    .line 16
    :goto_0
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    invoke-direct {v1, p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    invoke-static {v8, p1}, Lnb/c;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v8}, Lnb/c;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v12

    .line 30
    new-instance v9, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v4, Lgg/u;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    move-object v6, v4

    .line 41
    new-instance v4, Lgg/s;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    new-instance v2, Lgg/t;

    .line 47
    .line 48
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v11, Lgg/u;

    .line 52
    .line 53
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v13, Lgg/u;

    .line 57
    .line 58
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    move-object v5, v2

    .line 62
    move-object v2, v1

    .line 63
    new-instance v1, Lnb/a0;

    .line 64
    .line 65
    move-object v7, p1

    .line 66
    move-object/from16 v10, p2

    .line 67
    .line 68
    invoke-direct/range {v1 .. v13}, Lnb/a0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/List;Lgg/s;Lgg/t;Lgg/u;Ljava/lang/String;Landroid/content/Context;Ljava/util/ArrayList;Lfg/l;Lgg/u;Ljava/lang/String;Lgg/u;)V

    .line 69
    .line 70
    .line 71
    move-object v3, v11

    .line 72
    iput-object v1, v13, Lgg/u;->g:Ljava/lang/Object;

    .line 73
    .line 74
    new-instance p0, Lnb/b0;

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    invoke-direct {p0, v13, p1}, Lnb/b0;-><init>(Lgg/u;I)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Lnb/f0;->a:Landroid/os/Handler;

    .line 81
    .line 82
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 83
    .line 84
    .line 85
    new-instance p0, Lm/a;

    .line 86
    .line 87
    new-instance v0, Lc9/n0;

    .line 88
    .line 89
    move-object v1, v2

    .line 90
    move-object v2, v5

    .line 91
    const/4 v5, 0x6

    .line 92
    move-object v4, v6

    .line 93
    invoke-direct/range {v0 .. v5}, Lc9/n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    const/4 p1, 0x6

    .line 97
    invoke-direct {p0, v0, p1}, Lm/a;-><init>(Ljava/lang/Object;I)V

    .line 98
    .line 99
    .line 100
    return-object p0
.end method

.method public static final b(JLandroid/content/Context;Lfg/l;Lgg/s;Lgg/t;Lgg/u;Lgg/u;Lgg/u;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 8

    .line 1
    iget-wide v0, p5, Lgg/t;->g:J

    .line 2
    .line 3
    cmp-long p0, p0, v0

    .line 4
    .line 5
    if-nez p0, :cond_3

    .line 6
    .line 7
    invoke-virtual/range {p14 .. p14}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-wide p0, p5, Lgg/t;->g:J

    .line 15
    .line 16
    const-wide/16 v0, 0x1

    .line 17
    .line 18
    add-long/2addr p0, v0

    .line 19
    iput-wide p0, p5, Lgg/t;->g:J

    .line 20
    .line 21
    invoke-static/range {p10 .. p10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    const-string p0, "\u7cfb\u7edf\u9ed8\u8ba4"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object/from16 p0, p10

    .line 31
    .line 32
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, "\uff1a"

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    move-object/from16 p0, p11

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    move-object/from16 v2, p12

    .line 55
    .line 56
    invoke-interface {v2, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    invoke-static/range {p6 .. p7}, Lnb/f0;->d(Lgg/u;Lgg/u;)V

    .line 60
    .line 61
    .line 62
    iget p0, p4, Lgg/s;->g:I

    .line 63
    .line 64
    invoke-interface/range {p13 .. p13}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-ge p0, p1, :cond_2

    .line 69
    .line 70
    new-instance p0, Lnb/b0;

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    move-object/from16 p2, p8

    .line 74
    .line 75
    invoke-direct {p0, p2, p1}, Lnb/b0;-><init>(Lgg/u;I)V

    .line 76
    .line 77
    .line 78
    const-wide/16 p1, 0x12c

    .line 79
    .line 80
    sget-object p3, Lnb/f0;->a:Landroid/os/Handler;

    .line 81
    .line 82
    invoke-virtual {p3, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    move-object v1, p2

    .line 87
    move-object v5, p3

    .line 88
    move-object v3, p5

    .line 89
    move-object v6, p6

    .line 90
    move-object v7, p7

    .line 91
    move-object/from16 v0, p9

    .line 92
    .line 93
    move-object/from16 v4, p14

    .line 94
    .line 95
    invoke-static/range {v0 .. v7}, Lnb/f0;->c(Ljava/lang/String;Landroid/content/Context;Ljava/util/ArrayList;Lgg/t;Ljava/util/concurrent/atomic/AtomicBoolean;Lfg/l;Lgg/u;Lgg/u;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    :goto_1
    return-void
.end method

.method public static final c(Ljava/lang/String;Landroid/content/Context;Ljava/util/ArrayList;Lgg/t;Ljava/util/concurrent/atomic/AtomicBoolean;Lfg/l;Lgg/u;Lgg/u;)V
    .locals 6

    .line 1
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string p1, "\u6240\u9009 TTS \u5f15\u64ce\u521d\u59cb\u5316\u5931\u8d25\uff1a"

    .line 8
    .line 9
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object p0, Lnb/c;->a:Lnb/c;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lnb/c;->b(Landroid/content/Context;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const-string p0, "\u7cfb\u7edf\u9ed8\u8ba4 TTS \u521d\u59cb\u5316\u5931\u8d25\uff0c\u672a\u53d1\u73b0\u5176\u5b83\u53ef\u7528\u5f15\u64ce"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string p0, "\u7cfb\u7edf\u9ed8\u8ba4\u53ca\u5176\u5b83\u53ef\u7528 TTS \u5f15\u64ce\u5747\u521d\u59cb\u5316\u5931\u8d25"

    .line 30
    .line 31
    :goto_0
    const/4 p1, 0x3

    .line 32
    invoke-static {p1, p2}, Ltf/m;->M1(ILjava/util/List;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/16 v5, 0x3e

    .line 38
    .line 39
    const-string v1, "\uff1b"

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Lnb/g0;

    .line 48
    .line 49
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    if-eqz p2, :cond_2

    .line 54
    .line 55
    :goto_1
    move-object v2, p0

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const-string p2, "\uff08"

    .line 58
    .line 59
    const-string v1, "\uff09"

    .line 60
    .line 61
    invoke-static {p0, p2, p1, v1}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    goto :goto_1

    .line 66
    :goto_2
    const/4 v4, 0x0

    .line 67
    const/16 v5, 0xc

    .line 68
    .line 69
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    invoke-direct/range {v0 .. v5}, Lnb/g0;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 73
    .line 74
    .line 75
    iget-wide p0, p3, Lgg/t;->g:J

    .line 76
    .line 77
    const-wide/16 v1, 0x1

    .line 78
    .line 79
    add-long/2addr p0, v1

    .line 80
    iput-wide p0, p3, Lgg/t;->g:J

    .line 81
    .line 82
    invoke-static {p6, p7}, Lnb/f0;->d(Lgg/u;Lgg/u;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-nez p0, :cond_3

    .line 90
    .line 91
    invoke-interface {p5, v0}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :cond_3
    return-void
.end method

.method public static final d(Lgg/u;Lgg/u;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgg/u;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Runnable;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v1, Lnb/f0;->a:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lgg/u;->g:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object p0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Landroid/speech/tts/TextToSpeech;

    .line 18
    .line 19
    iput-object v0, p1, Lgg/u;->g:Ljava/lang/Object;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    :try_start_0
    invoke-virtual {p0}, Landroid/speech/tts/TextToSpeech;->shutdown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    :catchall_0
    :cond_1
    return-void
.end method

.method public static e(Landroid/speech/tts/TextToSpeech;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/speech/tts/TextToSpeech;->getVoices()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    sget-object p0, Ltf/v;->g:Ltf/v;

    .line 8
    .line 9
    :cond_0
    check-cast p0, Ljava/lang/Iterable;

    .line 10
    .line 11
    new-instance v0, Ldg/n;

    .line 12
    .line 13
    const/4 v1, 0x6

    .line 14
    invoke-direct {v0, p0, v1}, Ldg/n;-><init>(Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    new-instance p0, Li2/z;

    .line 18
    .line 19
    const/16 v1, 0x1a

    .line 20
    .line 21
    invoke-direct {p0, v1}, Li2/z;-><init>(I)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lng/i;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-direct {v1, v0, v2, p0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Li2/z;

    .line 31
    .line 32
    const/16 v0, 0x1b

    .line 33
    .line 34
    invoke-direct {p0, v0}, Li2/z;-><init>(I)V

    .line 35
    .line 36
    .line 37
    new-instance v0, Lng/b;

    .line 38
    .line 39
    invoke-interface {v1}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-direct {v0, v1, p0}, Lng/b;-><init>(Ljava/util/Iterator;Lfg/l;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    sget-object p0, Ltf/t;->g:Ltf/t;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_2

    .line 64
    .line 65
    invoke-static {p0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_3

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    move-object p0, v1

    .line 93
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    const/4 v3, 0x0

    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    move-object v4, v2

    .line 114
    check-cast v4, Landroid/speech/tts/Voice;

    .line 115
    .line 116
    invoke-virtual {v4}, Landroid/speech/tts/Voice;->getLocale()Ljava/util/Locale;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    if-eqz v4, :cond_5

    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    :cond_5
    sget-object v4, Ljava/util/Locale;->CHINESE:Ljava/util/Locale;

    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-static {v3, v4}, Log/t;->X(Ljava/lang/String;Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-eqz v3, :cond_4

    .line 137
    .line 138
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_7

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_7
    move-object p0, v0

    .line 150
    :goto_3
    new-instance v0, Lb8/c;

    .line 151
    .line 152
    const/16 v1, 0x8

    .line 153
    .line 154
    invoke-direct {v0, v1}, Lb8/c;-><init>(I)V

    .line 155
    .line 156
    .line 157
    invoke-static {p0, v0}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    new-instance v0, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_11

    .line 179
    .line 180
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Landroid/speech/tts/Voice;

    .line 185
    .line 186
    invoke-virtual {v1}, Landroid/speech/tts/Voice;->getLocale()Ljava/util/Locale;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    if-eqz v2, :cond_8

    .line 191
    .line 192
    sget-object v4, Ljava/util/Locale;->SIMPLIFIED_CHINESE:Ljava/util/Locale;

    .line 193
    .line 194
    invoke-virtual {v2, v4}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    goto :goto_5

    .line 199
    :cond_8
    move-object v2, v3

    .line 200
    :goto_5
    const-string v4, ""

    .line 201
    .line 202
    if-nez v2, :cond_9

    .line 203
    .line 204
    move-object v2, v4

    .line 205
    :cond_9
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_c

    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/speech/tts/Voice;->getLocale()Ljava/util/Locale;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    if-eqz v2, :cond_a

    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    goto :goto_6

    .line 222
    :cond_a
    move-object v2, v3

    .line 223
    :goto_6
    if-nez v2, :cond_b

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :cond_b
    move-object v4, v2

    .line 227
    :goto_7
    move-object v2, v4

    .line 228
    :cond_c
    invoke-virtual {v1}, Landroid/speech/tts/Voice;->isNetworkConnectionRequired()Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-eqz v4, :cond_d

    .line 233
    .line 234
    const-string v4, "\u8054\u7f51"

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_d
    const-string v4, "\u672c\u5730"

    .line 238
    .line 239
    :goto_8
    filled-new-array {v2, v4}, [Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-static {v2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    new-instance v4, Ljava/util/ArrayList;

    .line 248
    .line 249
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 253
    .line 254
    .line 255
    move-result-object v2

    .line 256
    :cond_e
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    if-eqz v5, :cond_f

    .line 261
    .line 262
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    move-object v6, v5

    .line 267
    check-cast v6, Ljava/lang/String;

    .line 268
    .line 269
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 270
    .line 271
    .line 272
    move-result v6

    .line 273
    if-nez v6, :cond_e

    .line 274
    .line 275
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto :goto_9

    .line 279
    :cond_f
    const/4 v8, 0x0

    .line 280
    const/16 v9, 0x3e

    .line 281
    .line 282
    const-string v5, " \u00b7 "

    .line 283
    .line 284
    const/4 v6, 0x0

    .line 285
    const/4 v7, 0x0

    .line 286
    invoke-static/range {v4 .. v9}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    new-instance v4, Lnb/h0;

    .line 291
    .line 292
    invoke-virtual {v1}, Landroid/speech/tts/Voice;->getName()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    invoke-virtual {v1}, Landroid/speech/tts/Voice;->getName()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    if-nez v6, :cond_10

    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_10
    const-string v6, "\uff08"

    .line 311
    .line 312
    const-string v7, "\uff09"

    .line 313
    .line 314
    invoke-static {v1, v6, v2, v7}, Lwb/en;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    :goto_a
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-direct {v4, v5, v1}, Lnb/h0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    goto/16 :goto_4

    .line 328
    .line 329
    :cond_11
    return-object v0
.end method
