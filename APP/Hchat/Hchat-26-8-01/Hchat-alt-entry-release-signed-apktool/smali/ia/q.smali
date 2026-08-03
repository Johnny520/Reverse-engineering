.class public final Lia/q;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final f:[Ljava/lang/String;

.field public static final g:[Ljava/lang/String;


# instance fields
.field public final a:Lb5/c;

.field public final b:Lia/a0;

.field public final c:Lab/b;

.field public final d:Landroid/content/SharedPreferences;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    const-string v19, "\u6e29"

    .line 2
    .line 3
    const-string v20, "\u65b9"

    .line 4
    .line 5
    const-string v1, "\u6797"

    .line 6
    .line 7
    const-string v2, "\u9648"

    .line 8
    .line 9
    const-string v3, "\u5468"

    .line 10
    .line 11
    const-string v4, "\u5434"

    .line 12
    .line 13
    const-string v5, "\u8bb8"

    .line 14
    .line 15
    const-string v6, "\u6c88"

    .line 16
    .line 17
    const-string v7, "\u987e"

    .line 18
    .line 19
    const-string v8, "\u6c5f"

    .line 20
    .line 21
    const-string v9, "\u82cf"

    .line 22
    .line 23
    const-string v10, "\u53f6"

    .line 24
    .line 25
    const-string v11, "\u9646"

    .line 26
    .line 27
    const-string v12, "\u590f"

    .line 28
    .line 29
    const-string v13, "\u5b8b"

    .line 30
    .line 31
    const-string v14, "\u5510"

    .line 32
    .line 33
    const-string v15, "\u7a0b"

    .line 34
    .line 35
    const-string v16, "\u97e9"

    .line 36
    .line 37
    const-string v17, "\u4e54"

    .line 38
    .line 39
    const-string v18, "\u4f59"

    .line 40
    .line 41
    filled-new-array/range {v1 .. v20}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lia/q;->f:[Ljava/lang/String;

    .line 46
    .line 47
    const-string v19, "\u53ef"

    .line 48
    .line 49
    const-string v20, "\u79be"

    .line 50
    .line 51
    const-string v1, "\u5b89"

    .line 52
    .line 53
    const-string v2, "\u5b81"

    .line 54
    .line 55
    const-string v3, "\u7136"

    .line 56
    .line 57
    const-string v4, "\u8fb0"

    .line 58
    .line 59
    const-string v5, "\u5e0c"

    .line 60
    .line 61
    const-string v6, "\u8a00"

    .line 62
    .line 63
    const-string v7, "\u6e05"

    .line 64
    .line 65
    const-string v8, "\u4e88"

    .line 66
    .line 67
    const-string v9, "\u666f"

    .line 68
    .line 69
    const-string v10, "\u77e5"

    .line 70
    .line 71
    const-string v11, "\u4e00"

    .line 72
    .line 73
    const-string v12, "\u82e5"

    .line 74
    .line 75
    const-string v13, "\u96e8"

    .line 76
    .line 77
    const-string v14, "\u661f"

    .line 78
    .line 79
    const-string v15, "\u6708"

    .line 80
    .line 81
    const-string v16, "\u6668"

    .line 82
    .line 83
    const-string v17, "\u4e50"

    .line 84
    .line 85
    const-string v18, "\u5ff5"

    .line 86
    .line 87
    filled-new-array/range {v1 .. v20}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sput-object v0, Lia/q;->g:[Ljava/lang/String;

    .line 92
    .line 93
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lb5/c;Lia/a0;Lab/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lia/q;->a:Lb5/c;

    .line 5
    .line 6
    iput-object p3, p0, Lia/q;->b:Lia/a0;

    .line 7
    .line 8
    iput-object p4, p0, Lia/q;->c:Lab/b;

    .line 9
    .line 10
    const-string p2, "Hchat_moments_fake_interaction_config"

    .line 11
    .line 12
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lia/q;->d:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lia/q;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    return-void
.end method

.method public static c(J)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/Date;

    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    new-instance p1, Lsf/f;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object p0, p1

    .line 27
    :goto_0
    nop

    .line 28
    instance-of p1, p0, Lsf/f;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    const-string p0, ""

    .line 33
    .line 34
    :cond_0
    check-cast p0, Ljava/lang/String;

    .line 35
    .line 36
    return-object p0
.end method

.method public static f()Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Ljg/d;->g:Ljg/a;

    .line 2
    .line 3
    sget-object v0, Lia/q;->f:[Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Ltf/l;->G0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    sget-object v1, Lia/q;->g:[Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1}, Ltf/l;->G0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/String;

    .line 18
    .line 19
    sget-object v3, Ljg/d;->g:Ljg/a;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljg/a;->f()Ljava/util/Random;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v3}, Ljava/util/Random;->nextBoolean()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    invoke-static {v1}, Ltf/l;->G0([Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string v1, ""

    .line 39
    .line 40
    :goto_0
    invoke-static {v0, v2, v1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0
.end method

.method public static j(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lia/b;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p1, Lia/b;->c:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p1, Lia/b;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    invoke-static {v0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_0
    iget-object v0, p0, Lia/q;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_6

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contacts()Lg8/i;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v2, p1}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v2

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move-object v2, v1

    .line 49
    goto :goto_1

    .line 50
    :goto_0
    new-instance v3, Lsf/f;

    .line 51
    .line 52
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    move-object v2, v3

    .line 56
    :goto_1
    nop

    .line 57
    instance-of v3, v2, Lsf/f;

    .line 58
    .line 59
    if-eqz v3, :cond_2

    .line 60
    .line 61
    move-object v2, v1

    .line 62
    :cond_2
    check-cast v2, Ljava/lang/String;

    .line 63
    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    xor-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    move-object v1, v2

    .line 83
    :cond_3
    if-eqz v1, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    move-object v1, p1

    .line 87
    :goto_2
    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-nez p1, :cond_5

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    move-object v1, p1

    .line 95
    :cond_6
    :goto_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    check-cast v1, Ljava/lang/String;

    .line 99
    .line 100
    return-object v1
.end method

.method public final b(Ljava/util/List;)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lia/q;->d:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "fake_like_excluded_ids"

    .line 4
    .line 5
    sget-object v2, Ltf/v;->g:Ltf/v;

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v2, v0

    .line 15
    :goto_0
    invoke-static {p1}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Lia/p;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v2, v1}, Lia/p;-><init>(Ljava/util/Set;I)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lng/i;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-direct {v1, p1, v2, v0}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Li2/z;

    .line 32
    .line 33
    const/4 v0, 0x7

    .line 34
    invoke-direct {p1, v0}, Li2/z;-><init>(I)V

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
    invoke-direct {v0, v1, p1}, Lng/b;-><init>(Ljava/util/Iterator;Lfg/l;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

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
    invoke-static {p1}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    move-object p1, v1

    .line 93
    :goto_2
    return-object p1
.end method

.method public final d(Ljava/util/List;IZZ)Ljava/util/List;
    .locals 21

    .line 1
    const/4 v0, 0x1

    .line 2
    move/from16 v1, p2

    .line 3
    .line 4
    if-ge v1, v0, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    :cond_0
    if-eqz p4, :cond_1

    .line 8
    .line 9
    sget-object v2, Ltf/t;->g:Ltf/t;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual/range {p0 .. p1}, Lia/q;->b(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Ltf/m;->S1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2}, Ltf/m;->L1(ILjava/lang/Iterable;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_0
    const/4 v3, 0x0

    .line 28
    if-nez p4, :cond_3

    .line 29
    .line 30
    if-eqz p3, :cond_2

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    :goto_1
    move v1, v3

    .line 34
    goto :goto_3

    .line 35
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    sub-int/2addr v1, v4

    .line 40
    if-gez v1, :cond_4

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_4
    :goto_3
    new-instance v4, Ljava/util/HashSet;

    .line 44
    .line 45
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_5

    .line 57
    .line 58
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, Lwb/jv;

    .line 63
    .line 64
    iget-object v6, v6, Lwb/jv;->b:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v4, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_5
    invoke-static {}, La/a;->E()Luf/c;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    move v6, v3

    .line 75
    :goto_5
    if-ge v6, v1, :cond_9

    .line 76
    .line 77
    invoke-static {}, Lia/q;->f()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    move v8, v3

    .line 82
    :goto_6
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_6

    .line 87
    .line 88
    const/16 v9, 0x14

    .line 89
    .line 90
    if-ge v8, v9, :cond_6

    .line 91
    .line 92
    invoke-static {}, Lia/q;->f()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    add-int/lit8 v8, v8, 0x1

    .line 97
    .line 98
    goto :goto_6

    .line 99
    :cond_6
    invoke-virtual {v4, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_8

    .line 104
    .line 105
    move v8, v0

    .line 106
    :cond_7
    new-instance v9, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    add-int/2addr v8, v0

    .line 122
    invoke-virtual {v4, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v10

    .line 126
    if-nez v10, :cond_7

    .line 127
    .line 128
    move-object v13, v9

    .line 129
    goto :goto_7

    .line 130
    :cond_8
    move-object v13, v7

    .line 131
    :goto_7
    invoke-virtual {v4, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    new-instance v11, Lwb/jv;

    .line 135
    .line 136
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-virtual {v7}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    const-string v8, "-"

    .line 148
    .line 149
    const-string v9, ""

    .line 150
    .line 151
    invoke-static {v7, v8, v9, v3}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    const-string v8, "wxid_hchat_fake_like_"

    .line 156
    .line 157
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    const-string v7, "\u865a\u62df\u70b9\u8d5e\u4eba"

    .line 162
    .line 163
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v19

    .line 167
    const/16 v20, 0x78

    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const/4 v15, 0x0

    .line 171
    const/16 v16, 0x0

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    const/16 v18, 0x0

    .line 176
    .line 177
    invoke-direct/range {v11 .. v20}, Lwb/jv;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5, v11}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    add-int/lit8 v6, v6, 0x1

    .line 184
    .line 185
    goto :goto_5

    .line 186
    :cond_9
    invoke-static {v5}, La/a;->t(Luf/c;)Luf/c;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v2, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    move-object/from16 v1, p0

    .line 195
    .line 196
    iget-object v2, v1, Lia/q;->d:Landroid/content/SharedPreferences;

    .line 197
    .line 198
    const-string v4, "fake_like_random_order"

    .line 199
    .line 200
    invoke-interface {v2, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    invoke-static {v0}, Ltf/m;->S1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 211
    .line 212
    .line 213
    :cond_a
    return-object v0
.end method

.method public final e(Landroid/app/Activity;Lp8/l;II)V
    .locals 5

    .line 1
    iget-object v0, p2, Lp8/l;->a:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lia/q;->a:Lb5/c;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v3, v2, Lia/c;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v3}, Ltf/m;->R1(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-ltz p3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-ge p3, v4, :cond_0

    .line 24
    .line 25
    if-ltz p4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-ge p4, v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    check-cast p3, Lia/b;

    .line 38
    .line 39
    invoke-virtual {v3, p4, p3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0, v3}, Lb5/c;->Q(Ljava/lang/String;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    iget-object p3, p0, Lia/q;->b:Lia/a0;

    .line 46
    .line 47
    invoke-virtual {p3, p1, p2, v2}, Lia/a0;->a(Landroid/app/Activity;Lp8/l;Lia/c;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1, p2}, Lia/q;->g(Landroid/app/Activity;Lp8/l;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method

.method public final g(Landroid/app/Activity;Lp8/l;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p2, Lp8/l;->a:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    iget-object v1, p0, Lia/q;->a:Lb5/c;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Lb5/c;->l(Ljava/lang/String;)Lia/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v6, v0, Lia/c;->b:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {}, La/a;->E()Luf/c;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lsf/e;

    .line 24
    .line 25
    const-string v2, "\u65b0\u589e\u4f2a\u8bc4\u8bba"

    .line 26
    .line 27
    const-string v3, "\u9009\u62e9\u597d\u53cb\u3001\u586b\u5199\u8bc4\u8bba\u5e76\u8bbe\u7f6e\u8bc4\u8bba\u65f6\u95f4"

    .line 28
    .line 29
    invoke-direct {v1, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Lia/b;

    .line 50
    .line 51
    invoke-virtual {p0, v2}, Lia/q;->a(Lia/b;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-wide v4, v2, Lia/b;->e:J

    .line 56
    .line 57
    invoke-static {v4, v5}, Lia/q;->c(J)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v5, " \u00b7 "

    .line 62
    .line 63
    invoke-static {v3, v5, v4}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    iget-object v2, v2, Lia/b;->d:Ljava/lang/String;

    .line 68
    .line 69
    new-instance v4, Lsf/e;

    .line 70
    .line 71
    invoke-direct {v4, v3, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v4}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_1

    .line 83
    .line 84
    new-instance v1, Lsf/e;

    .line 85
    .line 86
    const-string v2, "\u6e05\u7a7a\u4f2a\u8bc4\u8bba"

    .line 87
    .line 88
    const-string v3, "\u79fb\u9664\u8be5\u670b\u53cb\u5708\u7684\u5168\u90e8\u4f2a\u8bc4\u8bba\uff0c\u6062\u590d\u771f\u5b9e\u8bc4\u8bba\u663e\u793a"

    .line 89
    .line 90
    invoke-direct {v1, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    :cond_1
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    const-string v0, "\u6682\u65e0\u4f2a\u8bc4\u8bba"

    .line 107
    .line 108
    :goto_1
    move-object v9, v0

    .line 109
    goto :goto_2

    .line 110
    :cond_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const-string v1, "\u5171 "

    .line 115
    .line 116
    const-string v2, " \u6761\uff0c\u5217\u8868\u987a\u5e8f\u5373\u663e\u793a\u987a\u5e8f"

    .line 117
    .line 118
    invoke-static {v0, v1, v2}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    goto :goto_1

    .line 123
    :goto_2
    new-instance v1, Lc9/k;

    .line 124
    .line 125
    const/4 v7, 0x7

    .line 126
    const/4 v4, 0x0

    .line 127
    move-object v2, p0

    .line 128
    move-object v3, p1

    .line 129
    move-object v5, p2

    .line 130
    invoke-direct/range {v1 .. v7}, Lc9/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;I)V

    .line 131
    .line 132
    .line 133
    new-instance v12, Lk/s1;

    .line 134
    .line 135
    const/4 p1, 0x7

    .line 136
    invoke-direct {v12, p1}, Lk/s1;-><init>(I)V

    .line 137
    .line 138
    .line 139
    const-string v8, "\u670b\u53cb\u5708\u4f2a\u8bc4\u8bba"

    .line 140
    .line 141
    move-object v11, v1

    .line 142
    move-object v7, v3

    .line 143
    invoke-static/range {v7 .. v12}, Lwb/y2;->W1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lfg/l;Lfg/a;)V

    .line 144
    .line 145
    .line 146
    :cond_3
    return-void
.end method

.method public final h(Landroid/app/Activity;Lp8/l;Ljava/util/ArrayList;Ljava/util/LinkedHashSet;Ljava/lang/String;)V
    .locals 15

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    iget-object v1, v0, Lp8/l;->a:Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    new-instance v2, Lc9/a0;

    .line 8
    .line 9
    const/16 v3, 0x14

    .line 10
    .line 11
    move-object/from16 v12, p4

    .line 12
    .line 13
    invoke-direct {v2, v12, v3}, Lc9/a0;-><init>(Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    move-object/from16 v3, p3

    .line 17
    .line 18
    invoke-static {v3, v2}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    new-instance v6, Lia/j;

    .line 23
    .line 24
    move-object/from16 v4, p1

    .line 25
    .line 26
    invoke-direct {v6, p0, v1, v4, v0}, Lia/j;-><init>(Lia/q;Ljava/lang/String;Landroid/app/Activity;Lp8/l;)V

    .line 27
    .line 28
    .line 29
    new-instance v7, Lk/s1;

    .line 30
    .line 31
    const/4 v0, 0x7

    .line 32
    invoke-direct {v7, v0}, Lk/s1;-><init>(I)V

    .line 33
    .line 34
    .line 35
    const/4 v13, 0x0

    .line 36
    const/16 v14, 0x480

    .line 37
    .line 38
    const-string v9, "\u4fdd\u5b58"

    .line 39
    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v11, 0x0

    .line 42
    move-object/from16 v8, p5

    .line 43
    .line 44
    invoke-static/range {v4 .. v14}, Lwb/y2;->U1(Landroid/app/Activity;Ljava/util/List;Lfg/l;Lfg/a;Ljava/lang/String;Ljava/lang/String;ZLc9/v;Ljava/util/Set;ZI)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-void
.end method

.method public final i(Landroid/app/Activity;Lp8/l;Ljava/util/List;IZZ)V
    .locals 10

    .line 1
    invoke-virtual {p0, p3}, Lia/q;->b(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    if-nez p5, :cond_0

    .line 12
    .line 13
    const-string p2, "\u6ca1\u6709\u53ef\u9009\u62e9\u7684\u597d\u53cb"

    .line 14
    .line 15
    invoke-static {p1, p2}, Lia/q;->j(Landroid/app/Activity;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const/4 p3, 0x1

    .line 20
    const/4 v0, 0x0

    .line 21
    if-eqz p5, :cond_1

    .line 22
    .line 23
    move-object v7, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-ge v1, p3, :cond_2

    .line 30
    .line 31
    move v1, p3

    .line 32
    :cond_2
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    move-object v7, v1

    .line 37
    :goto_0
    if-eqz p6, :cond_3

    .line 38
    .line 39
    const-string v1, "\u51ed\u7a7a\u751f\u6210\u70b9\u8d5e\u6570\u91cf"

    .line 40
    .line 41
    :goto_1
    move-object v8, v1

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    const-string v1, "\u8bbe\u7f6e\u4f2a\u9020\u70b9\u8d5e\u6570\u91cf"

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :goto_2
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    if-lez p4, :cond_4

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/4 p3, 0x0

    .line 54
    :goto_3
    if-eqz p3, :cond_5

    .line 55
    .line 56
    move-object v0, v1

    .line 57
    :cond_5
    if-eqz v0, :cond_6

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result p3

    .line 63
    if-eqz v7, :cond_7

    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result p4

    .line 69
    if-le p3, p4, :cond_7

    .line 70
    .line 71
    move p3, p4

    .line 72
    goto :goto_4

    .line 73
    :cond_6
    const/16 p3, 0x32

    .line 74
    .line 75
    if-eqz v7, :cond_7

    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result p4

    .line 81
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    :cond_7
    :goto_4
    new-instance v0, Lia/k;

    .line 86
    .line 87
    move-object v1, p0

    .line 88
    move-object v5, p1

    .line 89
    move-object v6, p2

    .line 90
    move v3, p5

    .line 91
    move/from16 v4, p6

    .line 92
    .line 93
    invoke-direct/range {v0 .. v6}, Lia/k;-><init>(Lia/q;Ljava/util/List;ZZLandroid/app/Activity;Lp8/l;)V

    .line 94
    .line 95
    .line 96
    new-instance v9, Lk/s1;

    .line 97
    .line 98
    const/4 p2, 0x7

    .line 99
    invoke-direct {v9, p2}, Lk/s1;-><init>(I)V

    .line 100
    .line 101
    .line 102
    const/4 v6, 0x1

    .line 103
    move-object v3, p1

    .line 104
    move v5, p3

    .line 105
    move-object v4, v8

    .line 106
    move-object v8, v0

    .line 107
    invoke-static/range {v3 .. v9}, Lwb/y2;->a2(Landroid/app/Activity;Ljava/lang/String;IILjava/lang/Integer;Lfg/l;Lfg/a;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method
