.class public final Lo9/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final k:Ljava/util/List;

.field public static final l:Ljava/util/List;

.field public static final m:Ljava/util/List;

.field public static final n:Log/k;

.field public static final o:Log/k;


# instance fields
.field public final a:Lia/t;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Lbb/l;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/lang/Object;

.field public final j:Log/k;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "\u9080\u8bf7"

    .line 2
    .line 3
    const-string v1, "invited"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lo9/p;->k:Ljava/util/List;

    .line 14
    .line 15
    const-string v0, "joined the group chat"

    .line 16
    .line 17
    const-string v1, "join the group chat"

    .line 18
    .line 19
    const-string v2, "\u52a0\u5165\u4e86\u7fa4\u804a"

    .line 20
    .line 21
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lo9/p;->l:Ljava/util/List;

    .line 30
    .line 31
    const-string v0, "left the group chat"

    .line 32
    .line 33
    const-string v1, "removed from the group chat"

    .line 34
    .line 35
    const-string v2, "\u79fb\u51fa\u4e86\u7fa4\u804a"

    .line 36
    .line 37
    const-string v3, "\u9000\u51fa\u4e86\u7fa4\u804a"

    .line 38
    .line 39
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lo9/p;->m:Ljava/util/List;

    .line 48
    .line 49
    new-instance v0, Log/k;

    .line 50
    .line 51
    const-string v1, "<(?:link|member)\\b[^>]*>"

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lo9/p;->n:Log/k;

    .line 58
    .line 59
    new-instance v0, Log/k;

    .line 60
    .line 61
    const-string v1, "([A-Za-z0-9_:-]+)\\s*=\\s*\"([^\"]*)\""

    .line 62
    .line 63
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lo9/p;->o:Log/k;

    .line 67
    .line 68
    return-void
.end method

.method public constructor <init>(Lr8/g;Lia/t;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lo9/p;->a:Lia/t;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string p2, "Hchat_group_leave_monitor_config"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iput-object p2, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    new-instance p2, Lbb/l;

    .line 20
    .line 21
    invoke-direct {p2, p1}, Lbb/l;-><init>(Landroid/content/Context;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lo9/p;->c:Lbb/l;

    .line 25
    .line 26
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lo9/p;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    .line 33
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lo9/p;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lo9/p;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 46
    .line 47
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lo9/p;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 53
    .line 54
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lo9/p;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    .line 61
    new-instance p1, Ljava/lang/Object;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lo9/p;->i:Ljava/lang/Object;

    .line 67
    .line 68
    new-instance p1, Log/k;

    .line 69
    .line 70
    const-string p2, "\\[AtWx=([^\\]]+)]"

    .line 71
    .line 72
    invoke-direct {p1, p2}, Log/k;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lo9/p;->j:Log/k;

    .line 76
    .line 77
    return-void
.end method

.method public static A(Ljava/lang/String;Lo9/q;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :sswitch_0
    const-string v0, "group_member_reply_left_text"

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object p0, p1, Lo9/q;->i:Ljava/lang/String;

    .line 19
    .line 20
    return-object p0

    .line 21
    :sswitch_1
    const-string v0, "group_member_reply_join_card_title"

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p0, p1, Lo9/q;->j:Ljava/lang/String;

    .line 31
    .line 32
    return-object p0

    .line 33
    :sswitch_2
    const-string v0, "group_member_reply_join_text"

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iget-object p0, p1, Lo9/q;->h:Ljava/lang/String;

    .line 43
    .line 44
    return-object p0

    .line 45
    :sswitch_3
    const-string v0, "group_member_reply_join_card_desc"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    iget-object p0, p1, Lo9/q;->k:Ljava/lang/String;

    .line 55
    .line 56
    return-object p0

    .line 57
    :sswitch_4
    const-string v0, "group_member_reply_left_card_desc"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_4

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iget-object p0, p1, Lo9/q;->m:Ljava/lang/String;

    .line 67
    .line 68
    return-object p0

    .line 69
    :sswitch_5
    const-string v0, "group_member_reply_left_card_title"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_5

    .line 76
    .line 77
    :goto_0
    const/4 p0, 0x0

    .line 78
    return-object p0

    .line 79
    :cond_5
    iget-object p0, p1, Lo9/q;->l:Ljava/lang/String;

    .line 80
    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :sswitch_data_0
    .sparse-switch
        -0x73fac5d9 -> :sswitch_5
        -0x5e9bcf1e -> :sswitch_4
        -0x378061bb -> :sswitch_3
        -0x2a47cdd8 -> :sswitch_2
        0x48577924 -> :sswitch_1
        0x5affb16b -> :sswitch_0
    .end sparse-switch
.end method

.method public static F(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static G(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [C

    .line 3
    .line 4
    fill-array-data v0, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-static {p0, v0, v1}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    move-object v2, v1

    .line 61
    check-cast v2, Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-lez v2, :cond_2

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/4 v2, 0x0

    .line 72
    :goto_2
    if-eqz v2, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    return-object p0

    .line 79
    :array_0
    .array-data 2
        0x7cs
        0x2cs
    .end array-data
.end method

.method public static b(Ljava/lang/String;Lo9/n;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p1, Lo9/n;->b:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "%userName%"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v1, v0, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "%groupNickname%"

    .line 11
    .line 12
    iget-object v1, p1, Lo9/n;->c:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "%userWxid%"

    .line 19
    .line 20
    iget-object v1, p1, Lo9/n;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "%realNameTail%"

    .line 27
    .line 28
    iget-object v1, p1, Lo9/n;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "%gender%"

    .line 35
    .line 36
    iget-object v1, p1, Lo9/n;->e:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v0, "%region%"

    .line 43
    .line 44
    iget-object v1, p1, Lo9/n;->f:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "%groupName%"

    .line 51
    .line 52
    iget-object v1, p1, Lo9/n;->g:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string v0, "%time%"

    .line 59
    .line 60
    iget-object p1, p1, Lo9/n;->h:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p0, v0, p1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "|"

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashMap;)V
    .locals 9

    .line 1
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_8

    .line 8
    .line 9
    :cond_0
    sget-object v0, Lo9/p;->n:Log/k;

    .line 10
    .line 11
    invoke-static {v0, p1}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lf/i0;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lf/i0;-><init>(Lng/c;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lf/i0;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_10

    .line 25
    .line 26
    invoke-virtual {v1}, Lf/i0;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Log/f;

    .line 31
    .line 32
    check-cast v0, Log/i;

    .line 33
    .line 34
    invoke-virtual {v0}, Log/i;->c()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    sget-object v4, Lo9/p;->o:Log/k;

    .line 44
    .line 45
    invoke-static {v4, v2}, Log/k;->c(Log/k;Ljava/lang/CharSequence;)Lng/c;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v4, Lf/i0;

    .line 50
    .line 51
    invoke-direct {v4, v2}, Lf/i0;-><init>(Lng/c;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    :goto_1
    invoke-virtual {v4}, Lf/i0;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v5, 0x1

    .line 59
    const-string v6, ""

    .line 60
    .line 61
    const/4 v7, 0x0

    .line 62
    if-eqz v2, :cond_6

    .line 63
    .line 64
    invoke-virtual {v4}, Lf/i0;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    check-cast v2, Log/f;

    .line 69
    .line 70
    check-cast v2, Log/i;

    .line 71
    .line 72
    invoke-virtual {v2}, Log/i;->a()Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    invoke-static {v5, v8}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    check-cast v5, Ljava/lang/String;

    .line 81
    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 85
    .line 86
    invoke-static {v7, v5, v7}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    :cond_3
    if-nez v7, :cond_4

    .line 91
    .line 92
    move-object v7, v6

    .line 93
    :cond_4
    invoke-virtual {v2}, Log/i;->a()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const/4 v5, 0x2

    .line 98
    invoke-static {v5, v2}, Ltf/m;->w1(ILjava/util/List;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    check-cast v2, Ljava/lang/String;

    .line 103
    .line 104
    if-nez v2, :cond_5

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    move-object v6, v2

    .line 108
    :goto_2
    invoke-static {v6}, Lo9/p;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    if-nez v5, :cond_2

    .line 117
    .line 118
    invoke-interface {v3, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_6
    const-string v2, "username"

    .line 123
    .line 124
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, Ljava/lang/String;

    .line 129
    .line 130
    if-eqz v2, :cond_7

    .line 131
    .line 132
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    :cond_7
    if-nez v7, :cond_8

    .line 141
    .line 142
    move-object v7, v6

    .line 143
    :cond_8
    invoke-static {p0, v7}, Lo9/p;->r(Ljava/lang/String;Ljava/lang/String;)Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_1

    .line 148
    .line 149
    invoke-virtual {p2, v7}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_9

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_9
    const-string v2, "name"

    .line 158
    .line 159
    invoke-virtual {v3, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Ljava/lang/String;

    .line 164
    .line 165
    const-string v4, "nickname"

    .line 166
    .line 167
    invoke-virtual {v3, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v0}, Log/i;->b()Llg/d;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iget v0, v0, Llg/b;->h:I

    .line 178
    .line 179
    add-int/2addr v0, v5

    .line 180
    if-lez v0, :cond_b

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-lt v0, v4, :cond_a

    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_a
    const-string v4, "</link>"

    .line 190
    .line 191
    invoke-static {p1, v4, v0, v5}, Log/m;->o0(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-gt v4, v0, :cond_c

    .line 196
    .line 197
    :cond_b
    :goto_3
    move-object v0, v6

    .line 198
    goto :goto_4

    .line 199
    :cond_c
    invoke-virtual {p1, v0, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, Lo9/p;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v4, "<[^>]+>"

    .line 208
    .line 209
    invoke-static {v4, v0, v6}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    :goto_4
    filled-new-array {v2, v3, v0}, [Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    const/4 v2, 0x0

    .line 218
    :goto_5
    const/4 v3, 0x3

    .line 219
    if-lt v2, v3, :cond_d

    .line 220
    .line 221
    goto :goto_6

    .line 222
    :cond_d
    aget-object v3, v0, v2

    .line 223
    .line 224
    if-eqz v3, :cond_f

    .line 225
    .line 226
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-eqz v4, :cond_e

    .line 231
    .line 232
    goto :goto_7

    .line 233
    :cond_e
    move-object v6, v3

    .line 234
    :goto_6
    invoke-static {v6}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    new-instance v2, Lo9/i;

    .line 243
    .line 244
    invoke-direct {v2, v7, v0}, Lo9/i;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-interface {p2, v7, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    goto/16 :goto_0

    .line 251
    .line 252
    :cond_f
    :goto_7
    add-int/lit8 v2, v2, 0x1

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_10
    :goto_8
    return-void
.end method

.method public static i(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "&lt;"

    .line 2
    .line 3
    const-string v1, "<"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "&gt;"

    .line 11
    .line 12
    const-string v1, ">"

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "&quot;"

    .line 19
    .line 20
    const-string v1, "\""

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "&apos;"

    .line 27
    .line 28
    const-string v1, "\'"

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "&amp;"

    .line 35
    .line 36
    const-string v1, "&"

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "&"

    .line 2
    .line 3
    const-string v1, "&amp;"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "<"

    .line 11
    .line 12
    const-string v1, "&lt;"

    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, ">"

    .line 19
    .line 20
    const-string v1, "&gt;"

    .line 21
    .line 22
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v0, "\""

    .line 27
    .line 28
    const-string v1, "&quot;"

    .line 29
    .line 30
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string v0, "\'"

    .line 35
    .line 36
    const-string v1, "&apos;"

    .line 37
    .line 38
    invoke-static {p0, v0, v1, v2}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_3

    .line 15
    .line 16
    invoke-virtual {v0}, Lh/Hchat/hooks/api/model/WeChatContact;->displayName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/4 v2, 0x0

    .line 37
    :goto_1
    if-eqz v2, :cond_2

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object v0, v1

    .line 41
    :goto_2
    if-eqz v0, :cond_3

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_3
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_4

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Lg8/d;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_4

    .line 55
    .line 56
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_4

    .line 61
    .line 62
    move-object v1, v0

    .line 63
    :cond_4
    if-eqz v1, :cond_5

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_5
    return-object p0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "_"

    .line 2
    .line 3
    invoke-static {p0, v0, p1}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static r(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_1

    .line 14
    .line 15
    const-string p1, ""

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-lez v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_2

    .line 29
    .line 30
    const-string p0, "notify@all"

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    const-string p0, "@chatroom"

    .line 39
    .line 40
    invoke-static {p1, p0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    const-string p0, "@im.chatroom"

    .line 47
    .line 48
    invoke-static {p1, p0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_2

    .line 53
    .line 54
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :cond_2
    return v1
.end method

.method public static v(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, -0x5305c081

    .line 6
    .line 7
    .line 8
    const-string v2, "none"

    .line 9
    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const v1, 0x33af38

    .line 13
    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const v1, 0x58705dc

    .line 18
    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string v0, "after"

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const-string v0, "before"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    :goto_0
    return-object v2

    .line 48
    :cond_3
    return-object p0
.end method

.method public static w(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x2e3b81

    .line 6
    .line 7
    .line 8
    const-string v2, "text"

    .line 9
    .line 10
    if-eq v0, v1, :cond_2

    .line 11
    .line 12
    const v1, 0x2e7b10

    .line 13
    .line 14
    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const v1, 0x36452d

    .line 18
    .line 19
    .line 20
    if-eq v0, v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const-string v0, "card"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const-string v0, "both"

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_3

    .line 46
    .line 47
    :goto_0
    return-object v2

    .line 48
    :cond_3
    return-object p0
.end method

.method public static y(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "||"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Log/m;->G0(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-static {p0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

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
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1, v0}, Lj8/b;->r(Ljava/lang/String;Ljava/util/ArrayList;)V

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
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_3

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    move-object v2, v1

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-lez v2, :cond_2

    .line 67
    .line 68
    const/4 v2, 0x1

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    const/4 v2, 0x0

    .line 71
    :goto_2
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    const-string p0, ""

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_4
    sget-object v0, Ljg/d;->g:Ljg/a;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    sget-object v1, Ljg/d;->g:Ljg/a;

    .line 93
    .line 94
    invoke-virtual {v1, v0}, Ljg/a;->g(I)I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, Ljava/lang/String;

    .line 103
    .line 104
    return-object p0
.end method


# virtual methods
.method public final B(Ljava/lang/String;Ljava/util/LinkedHashSet;)V
    .locals 6

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lg8/i;->w(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Ltf/u;->g:Ltf/u;

    .line 17
    .line 18
    :cond_1
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_5

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    if-eqz v3, :cond_3

    .line 41
    .line 42
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move-object v3, v1

    .line 52
    :goto_2
    if-nez v3, :cond_4

    .line 53
    .line 54
    const-string v3, ""

    .line 55
    .line 56
    :cond_4
    invoke-static {p1, v2}, Lo9/p;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    iget-object v5, p0, Lo9/p;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 61
    .line 62
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-lez v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_2

    .line 76
    .line 77
    invoke-static {p1, v2}, Lo9/p;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v5, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    return-void
.end method

.method public final C(Ljava/lang/String;Lo9/i;)V
    .locals 2

    .line 1
    iget-object v0, p2, Lo9/i;->b:Ljava/lang/String;

    .line 2
    .line 3
    iget-object p2, p2, Lo9/i;->a:Ljava/lang/String;

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
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, Lo9/p;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-static {p1, p2}, Lo9/p;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final D(Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;)V
    .locals 11

    .line 1
    const-string v0, "join"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v1, "group_member_reply_join_card_title"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v1, "group_member_reply_left_card_title"

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    const-string v2, "group_member_reply_join_card_desc"

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string v2, "group_member_reply_left_card_desc"

    .line 24
    .line 25
    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    const-string v3, "\u6b22\u8fce\uff1a%userName%"

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    const-string v3, "\u79bb\u7fa4\uff1a%userName%"

    .line 35
    .line 36
    :goto_2
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p2, v1, v3, p4}, Lo9/p;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lo9/p;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1, p3}, Lo9/p;->b(Ljava/lang/String;Lo9/n;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    const-string p1, "ID\uff1a%userWxid%\n\u540d\u7247\uff1a%groupNickname%\n\u65f6\u95f4\uff1a%time%"

    .line 52
    .line 53
    invoke-virtual {p0, p2, v2, p1, p4}, Lo9/p;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Lo9/p;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1, p3}, Lo9/p;->b(Ljava/lang/String;Lo9/n;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_3
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const/4 p4, 0x0

    .line 84
    const/4 v1, 0x1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    iget-object p3, p3, Lo9/n;->a:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {p1, p3, v1}, Lg8/i;->m(Ljava/lang/String;Z)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    move-object p1, p4

    .line 95
    :goto_3
    if-nez p1, :cond_5

    .line 96
    .line 97
    const-string p1, ""

    .line 98
    .line 99
    :cond_5
    move-object v7, p1

    .line 100
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_6

    .line 105
    .line 106
    :goto_4
    move-object v8, p4

    .line 107
    goto :goto_8

    .line 108
    :cond_6
    :try_start_0
    new-instance p1, Ljava/net/URL;

    .line 109
    .line 110
    invoke-direct {p1, v7}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 121
    .line 122
    const/16 p3, 0x4b0

    .line 123
    .line 124
    invoke-virtual {p1, p3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, p3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 128
    .line 129
    .line 130
    const-string p3, "GET"

    .line 131
    .line 132
    invoke-virtual {p1, p3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 136
    .line 137
    .line 138
    move-result-object p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    :try_start_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {p3}, Lg4/a;->G(Ljava/io/InputStream;)[B

    .line 143
    .line 144
    .line 145
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 146
    :try_start_2
    invoke-interface {p3}, Ljava/io/Closeable;->close()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :catchall_0
    move-exception v0

    .line 154
    move-object p1, v0

    .line 155
    goto :goto_5

    .line 156
    :catchall_1
    move-exception v0

    .line 157
    move-object p1, v0

    .line 158
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 159
    :catchall_2
    move-exception v0

    .line 160
    :try_start_4
    invoke-static {p3, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 164
    :goto_5
    new-instance v0, Lsf/f;

    .line 165
    .line 166
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 167
    .line 168
    .line 169
    :goto_6
    instance-of p1, v0, Lsf/f;

    .line 170
    .line 171
    if-eqz p1, :cond_7

    .line 172
    .line 173
    goto :goto_7

    .line 174
    :cond_7
    move-object p4, v0

    .line 175
    :goto_7
    check-cast p4, [B

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :goto_8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->media()Lj8/p;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    if-eqz v3, :cond_8

    .line 183
    .line 184
    const-string v9, ""

    .line 185
    .line 186
    move-object v4, p2

    .line 187
    invoke-virtual/range {v3 .. v9}, Lj8/p;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BLjava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-ne p1, v1, :cond_9

    .line 192
    .line 193
    goto :goto_a

    .line 194
    :cond_8
    move-object v4, p2

    .line 195
    :cond_9
    invoke-static {v5}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_a

    .line 200
    .line 201
    invoke-static {v6}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-nez p1, :cond_d

    .line 206
    .line 207
    :cond_a
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messages()Lk8/g;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    if-eqz p1, :cond_d

    .line 212
    .line 213
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-static {p2}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    new-instance v5, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    :cond_b
    :goto_9
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result p3

    .line 234
    if-eqz p3, :cond_c

    .line 235
    .line 236
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p3

    .line 240
    move-object p4, p3

    .line 241
    check-cast p4, Ljava/lang/String;

    .line 242
    .line 243
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 244
    .line 245
    .line 246
    move-result p4

    .line 247
    if-nez p4, :cond_b

    .line 248
    .line 249
    invoke-virtual {v5, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_9

    .line 253
    :cond_c
    const/4 v9, 0x0

    .line 254
    const/16 v10, 0x3e

    .line 255
    .line 256
    const-string v6, "\n"

    .line 257
    .line 258
    const/4 v7, 0x0

    .line 259
    const/4 v8, 0x0

    .line 260
    invoke-static/range {v5 .. v10}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    invoke-virtual {p1, v4, p2}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 265
    .line 266
    .line 267
    :cond_d
    :goto_a
    return-void
.end method

.method public final E(Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;)V
    .locals 4

    .line 1
    const-string v0, "join"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const-string v1, "group_member_reply_join_text"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v1, "group_member_reply_left_text"

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const-string p1, "[AtWx=%userWxid%]\n\u6b22\u8fce\u8fdb\u7fa4\n\u65f6\u95f4\uff1a%time%\n\u7fa4\u6635\u79f0\uff1a%groupName%\n\u8fdb\u7fa4\u8005\u5fae\u4fe1\u6635\u79f0\uff1a%userName%\n\u8fdb\u7fa4\u8005\u7fa4\u5185\u6635\u79f0\uff1a%groupNickname%\n\u8fdb\u7fa4\u8005ID\uff1a%userWxid%"

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const-string p1, "\u9000\u7fa4\u901a\u77e5\uff1a\n\u65f6\u95f4\uff1a%time%\n\u7fa4\u6635\u79f0\uff1a%groupName%\n\u9000\u7fa4\u8005\u5fae\u4fe1\u6635\u79f0\uff1a%userName%\n\u9000\u7fa4\u8005\u7fa4\u5185\u6635\u79f0\uff1a%groupNickname%\n\u9000\u7fa4\u8005ID\uff1a%userWxid%"

    .line 24
    .line 25
    :goto_1
    iget-object v0, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    if-eqz p4, :cond_3

    .line 28
    .line 29
    invoke-static {v1, p4}, Lo9/p;->A(Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget-object p4, p4, Lo9/q;->f:Ljava/lang/String;

    .line 34
    .line 35
    const-string v3, "global"

    .line 36
    .line 37
    invoke-virtual {p4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p4

    .line 41
    if-nez p4, :cond_2

    .line 42
    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    move-object p1, v2

    .line 46
    goto :goto_3

    .line 47
    :cond_2
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p4

    .line 51
    if-eqz p4, :cond_5

    .line 52
    .line 53
    :goto_2
    move-object p1, p4

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    invoke-virtual {p0, p2}, Lo9/p;->H(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result p4

    .line 59
    if-eqz p4, :cond_4

    .line 60
    .line 61
    invoke-static {v1, p2}, Lo9/p;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string p4, ""

    .line 66
    .line 67
    invoke-interface {v0, p1, p4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-nez p1, :cond_5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    if-eqz p4, :cond_5

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    :goto_3
    invoke-static {p1}, Lo9/p;->y(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result p4

    .line 89
    if-eqz p4, :cond_6

    .line 90
    .line 91
    goto :goto_7

    .line 92
    :cond_6
    invoke-static {p1, p3}, Lo9/p;->b(Ljava/lang/String;Lo9/n;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    if-eqz p3, :cond_7

    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_7
    invoke-static {}, Lp/a;->q()Lk8/g;

    .line 104
    .line 105
    .line 106
    move-result-object p3

    .line 107
    if-eqz p3, :cond_8

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->messages()Lk8/g;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    :goto_4
    const/4 p4, 0x0

    .line 115
    if-nez p3, :cond_9

    .line 116
    .line 117
    iget-object p1, p0, Lo9/p;->a:Lia/t;

    .line 118
    .line 119
    const-string p2, "\u8fdb\u9000\u7fa4\u81ea\u52a8\u56de\u590d\u53d1\u9001\u5931\u8d25: \u6d88\u606f\u53d1\u9001 API \u672a\u5c31\u7eea"

    .line 120
    .line 121
    invoke-virtual {p1, p2, p4}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    new-instance v1, Lb0/s;

    .line 131
    .line 132
    const/16 v2, 0xd

    .line 133
    .line 134
    invoke-direct {v1, v0, p0, p2, v2}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 135
    .line 136
    .line 137
    iget-object v2, p0, Lo9/p;->j:Log/k;

    .line 138
    .line 139
    invoke-virtual {v2, p1, v1}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    if-eqz v2, :cond_a

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_a
    new-instance p4, Lo9/k;

    .line 151
    .line 152
    invoke-static {v0}, Ltf/m;->T1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-static {v0}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-direct {p4, v1, v0}, Lo9/k;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 161
    .line 162
    .line 163
    :goto_5
    if-nez p4, :cond_b

    .line 164
    .line 165
    invoke-virtual {p3, p2, p1}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_b
    iget-object p1, p4, Lo9/k;->b:Ljava/util/List;

    .line 170
    .line 171
    iget-object p4, p4, Lo9/k;->a:Ljava/lang/String;

    .line 172
    .line 173
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_c

    .line 178
    .line 179
    invoke-virtual {p3, p2, p4}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    goto :goto_6

    .line 184
    :cond_c
    invoke-virtual {p3, p2, p4, p1}, Lk8/g;->y(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    :goto_6
    if-nez p1, :cond_d

    .line 189
    .line 190
    invoke-static {p4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-nez p1, :cond_d

    .line 195
    .line 196
    invoke-virtual {p3, p2, p4}, Lk8/g;->x(Ljava/lang/String;Ljava/lang/String;)Z

    .line 197
    .line 198
    .line 199
    :cond_d
    :goto_7
    return-void
.end method

.method public final H(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "group_member_reply_prompt_type"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lo9/p;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    const-string v1, "global"

    .line 10
    .line 11
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p1, v1

    .line 19
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    xor-int/lit8 p1, p1, 0x1

    .line 24
    .line 25
    return p1
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;
    .locals 9

    .line 1
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/lang/Iterable;

    .line 10
    .line 11
    invoke-static {v0, v1}, Ltf/d0;->U(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance v1, Log/k;

    .line 23
    .line 24
    new-instance v2, Lo9/o;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v2}, Ltf/m;->K1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    new-instance v7, Lo9/e;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {v7, v0}, Lo9/e;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const/16 v8, 0x1e

    .line 40
    .line 41
    const-string v4, "|"

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    invoke-static/range {v3 .. v8}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-direct {v1, v0}, Log/k;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lb0/s;

    .line 53
    .line 54
    const/16 v2, 0xc

    .line 55
    .line 56
    invoke-direct {v0, p3, p0, p2, v2}, Lb0/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1, v0}, Log/k;->e(Ljava/lang/CharSequence;Lfg/l;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1
.end method

.method public final c(Ljava/lang/String;Lo9/j;Lo9/j;I)Ljava/lang/String;
    .locals 10

    .line 1
    iget-object v0, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "group_invite_detail_notice_text"

    .line 4
    .line 5
    const-string v2, "\u9080\u8bf7\u8005\uff1a%inviterName% (%inviterWxid%)\n\u88ab\u9080\u8bf7\u8005\uff1a%inviteeName% (%inviteeWxid%)\n\u7d2f\u8ba1\u9080\u8bf7\uff1a%inviteCount%"

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v2, v0

    .line 14
    :cond_0
    invoke-virtual {p2}, Lo9/j;->a()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v3, Lsf/e;

    .line 19
    .line 20
    const-string v1, "%inviterName%"

    .line 21
    .line 22
    invoke-direct {v3, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p2, Lo9/j;->a:Ljava/lang/String;

    .line 26
    .line 27
    new-instance v4, Lsf/e;

    .line 28
    .line 29
    const-string v1, "%inviterGroupNickname%"

    .line 30
    .line 31
    invoke-direct {v4, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3}, Lo9/j;->a()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v5, Lsf/e;

    .line 39
    .line 40
    const-string v1, "%inviteeName%"

    .line 41
    .line 42
    invoke-direct {v5, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p3, Lo9/j;->a:Ljava/lang/String;

    .line 46
    .line 47
    new-instance v6, Lsf/e;

    .line 48
    .line 49
    const-string v1, "%inviteeGroupNickname%"

    .line 50
    .line 51
    invoke-direct {v6, v1, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    if-ge p4, v0, :cond_1

    .line 56
    .line 57
    move p4, v0

    .line 58
    :cond_1
    invoke-static {p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p4

    .line 62
    new-instance v7, Lsf/e;

    .line 63
    .line 64
    const-string v0, "%inviteCount%"

    .line 65
    .line 66
    invoke-direct {v7, v0, p4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lo9/p;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance v8, Lsf/e;

    .line 74
    .line 75
    const-string p4, "%groupName%"

    .line 76
    .line 77
    invoke-direct {v8, p4, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 81
    .line 82
    const-string p4, "yyyy-MM-dd HH:mm:ss"

    .line 83
    .line 84
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p1, p4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 89
    .line 90
    .line 91
    new-instance p4, Ljava/util/Date;

    .line 92
    .line 93
    invoke-direct {p4}, Ljava/util/Date;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, p4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance v9, Lsf/e;

    .line 101
    .line 102
    const-string p4, "%time%"

    .line 103
    .line 104
    invoke-direct {v9, p4, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    filled-new-array/range {v3 .. v9}, [Lsf/e;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object p2, p2, Lo9/j;->d:Ljava/lang/String;

    .line 116
    .line 117
    new-instance p4, Lsf/e;

    .line 118
    .line 119
    const-string v0, "%inviterWxid%"

    .line 120
    .line 121
    invoke-direct {p4, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object p2, p3, Lo9/j;->d:Ljava/lang/String;

    .line 125
    .line 126
    new-instance p3, Lsf/e;

    .line 127
    .line 128
    const-string v0, "%inviteeWxid%"

    .line 129
    .line 130
    invoke-direct {p3, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    filled-new-array {p4, p3}, [Lsf/e;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    invoke-static {p2}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p0, v2, p1, p2}, Lo9/p;->a(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    return-object p1
.end method

.method public final d(Ljava/lang/String;Lo9/j;)Ljava/lang/String;
    .locals 13

    .line 1
    invoke-virtual {p2}, Lo9/j;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p2, Lo9/j;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p2, Lo9/j;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v3, p2, Lo9/j;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-object p2, p2, Lo9/j;->b:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    move-object v4, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v4, p2

    .line 22
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-nez v6, :cond_1

    .line 38
    .line 39
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-nez v6, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_1

    .line 50
    .line 51
    const/16 v6, 0x28

    .line 52
    .line 53
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const/16 v6, 0x29

    .line 60
    .line 61
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-nez v6, :cond_2

    .line 72
    .line 73
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_2

    .line 84
    .line 85
    const/16 v0, 0x5b

    .line 86
    .line 87
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const/16 v0, 0x5d

    .line 94
    .line 95
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v4, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 103
    .line 104
    const-string v5, "group_leave_monitor_notice_text"

    .line 105
    .line 106
    const-string v6, "%displayName%(%userWxid%) \u9000\u51fa\u4e86\u7fa4\u804a"

    .line 107
    .line 108
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    if-eqz v4, :cond_3

    .line 113
    .line 114
    move-object v6, v4

    .line 115
    :cond_3
    new-instance v7, Lsf/e;

    .line 116
    .line 117
    const-string v4, "%displayName%"

    .line 118
    .line 119
    invoke-direct {v7, v4, v0}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance v8, Lsf/e;

    .line 123
    .line 124
    const-string v0, "%groupNickname%"

    .line 125
    .line 126
    invoke-direct {v8, v0, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    new-instance v9, Lsf/e;

    .line 130
    .line 131
    const-string v0, "%userName%"

    .line 132
    .line 133
    invoke-direct {v9, v0, p2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    new-instance v10, Lsf/e;

    .line 137
    .line 138
    const-string p2, "%remarkName%"

    .line 139
    .line 140
    invoke-direct {v10, p2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-static {p1}, Lo9/p;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    new-instance v11, Lsf/e;

    .line 148
    .line 149
    const-string p2, "%groupName%"

    .line 150
    .line 151
    invoke-direct {v11, p2, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 155
    .line 156
    const-string p2, "yyyy-MM-dd HH:mm:ss"

    .line 157
    .line 158
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-direct {p1, p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 163
    .line 164
    .line 165
    new-instance p2, Ljava/util/Date;

    .line 166
    .line 167
    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    new-instance v12, Lsf/e;

    .line 175
    .line 176
    const-string p2, "%time%"

    .line 177
    .line 178
    invoke-direct {v12, p2, p1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    filled-new-array/range {v7 .. v12}, [Lsf/e;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-static {p1}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const-string p2, "%userWxid%"

    .line 190
    .line 191
    invoke-static {p2, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v6, p1, p2}, Lo9/p;->a(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    return-object p1
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0, p2, p3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object p3, v1

    .line 10
    :cond_0
    if-eqz p4, :cond_2

    .line 11
    .line 12
    invoke-static {p2, p4}, Lo9/p;->A(Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object p2, p4, Lo9/q;->f:Ljava/lang/String;

    .line 17
    .line 18
    const-string p4, "global"

    .line 19
    .line 20
    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_5

    .line 25
    .line 26
    if-eqz p1, :cond_5

    .line 27
    .line 28
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    return-object p1

    .line 36
    :cond_2
    invoke-virtual {p0, p1}, Lo9/p;->H(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p4

    .line 40
    if-eqz p4, :cond_5

    .line 41
    .line 42
    invoke-static {p2, p1}, Lo9/p;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p2, ""

    .line 47
    .line 48
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    move-object p2, p1

    .line 56
    :goto_0
    invoke-static {p2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    return-object p2

    .line 64
    :cond_5
    :goto_1
    return-object p3
.end method

.method public final g(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "|"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lo9/p;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lca/s;

    .line 14
    .line 15
    const/16 v2, 0xf

    .line 16
    .line 17
    invoke-direct {v1, p1, v2}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lbe/i;

    .line 21
    .line 22
    const/16 v2, 0x15

    .line 23
    .line 24
    invoke-direct {p1, v1, v2}, Lbe/i;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, p1}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final j(Ljava/lang/String;Ljava/lang/String;ILo9/q;)J
    .locals 4

    .line 1
    iget-object v0, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-interface {v0, p2, p3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 4
    .line 5
    .line 6
    move-result p3

    .line 7
    const/4 v1, 0x0

    .line 8
    if-gez p3, :cond_0

    .line 9
    .line 10
    move p3, v1

    .line 11
    :cond_0
    const-string v2, "custom"

    .line 12
    .line 13
    if-eqz p4, :cond_8

    .line 14
    .line 15
    iget-object p1, p4, Lo9/q;->C:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_9

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    sparse-switch p1, :sswitch_data_0

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :sswitch_0
    const-string p1, "group_member_reply_emoji_delay_ms"

    .line 32
    .line 33
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    iget p1, p4, Lo9/q;->G:I

    .line 41
    .line 42
    :goto_0
    move p3, p1

    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :sswitch_1
    const-string p1, "group_member_reply_prompt_delay_ms"

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    iget p1, p4, Lo9/q;->D:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :sswitch_2
    const-string p1, "group_member_reply_favorite_delay_ms"

    .line 58
    .line 59
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-nez p1, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget p1, p4, Lo9/q;->J:I

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :sswitch_3
    const-string p1, "group_member_reply_voice_delay_ms"

    .line 70
    .line 71
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    iget p1, p4, Lo9/q;->F:I

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :sswitch_4
    const-string p1, "group_member_reply_video_delay_ms"

    .line 82
    .line 83
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-nez p1, :cond_5

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_5
    iget p1, p4, Lo9/q;->H:I

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :sswitch_5
    const-string p1, "group_member_reply_image_delay_ms"

    .line 94
    .line 95
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-nez p1, :cond_6

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    iget p1, p4, Lo9/q;->E:I

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :sswitch_6
    const-string p1, "group_member_reply_file_delay_ms"

    .line 106
    .line 107
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_7

    .line 112
    .line 113
    :goto_1
    const/16 p1, 0x64

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_7
    iget p1, p4, Lo9/q;->I:I

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_8
    new-instance p4, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v3, "group_member_reply_delay_mode_"

    .line 122
    .line 123
    invoke-direct {p4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p4

    .line 133
    const-string v3, "global"

    .line 134
    .line 135
    invoke-interface {v0, p4, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p4

    .line 139
    invoke-static {p4, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p4

    .line 143
    if-eqz p4, :cond_9

    .line 144
    .line 145
    invoke-static {p2, p1}, Lo9/p;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-interface {v0, p1, p3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    :cond_9
    :goto_2
    if-gez p3, :cond_a

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :cond_a
    move v1, p3

    .line 157
    :goto_3
    int-to-long p1, v1

    .line 158
    return-wide p1

    .line 159
    :sswitch_data_0
    .sparse-switch
        -0x56fa3eb5 -> :sswitch_6
        -0x47cc6f00 -> :sswitch_5
        -0x116b5620 -> :sswitch_4
        -0x888c4f7 -> :sswitch_3
        -0x274e1d5 -> :sswitch_2
        0x27bd58e3 -> :sswitch_1
        0x2c475275 -> :sswitch_0
    .end sparse-switch
.end method

.method public final l(Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v6, p4

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz v6, :cond_0

    .line 9
    .line 10
    iget-object v3, v6, Lo9/q;->f:Ljava/lang/String;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v3, v0

    .line 14
    :goto_0
    const-string v7, ""

    .line 15
    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    move-object v3, v7

    .line 19
    :cond_1
    const-string v4, "group_member_reply_prompt_type"

    .line 20
    .line 21
    iget-object v8, v1, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    const-string v9, "text"

    .line 24
    .line 25
    const-string v5, "global"

    .line 26
    .line 27
    if-eqz v6, :cond_4

    .line 28
    .line 29
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    if-nez v10, :cond_2

    .line 34
    .line 35
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    invoke-static {v3}, Lo9/p;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :goto_1
    move-object v10, v3

    .line 46
    goto :goto_5

    .line 47
    :cond_2
    invoke-interface {v8, v4, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move-object v3, v9

    .line 55
    :goto_2
    invoke-static {v3}, Lo9/p;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    goto :goto_1

    .line 60
    :cond_4
    invoke-static {v4, v2}, Lo9/p;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-interface {v8, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz v3, :cond_5

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    move-object v3, v5

    .line 72
    :goto_3
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-nez v5, :cond_6

    .line 77
    .line 78
    invoke-static {v3}, Lo9/p;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    goto :goto_1

    .line 83
    :cond_6
    invoke-interface {v8, v4, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-eqz v3, :cond_7

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_7
    move-object v3, v9

    .line 91
    :goto_4
    invoke-static {v3}, Lo9/p;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    goto :goto_1

    .line 96
    :goto_5
    const-string v3, "group_member_reply_media_order"

    .line 97
    .line 98
    const-string v4, "none"

    .line 99
    .line 100
    invoke-interface {v8, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    if-eqz v5, :cond_8

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_8
    move-object v5, v4

    .line 108
    :goto_6
    invoke-static {v5}, Lo9/p;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v11, "custom"

    .line 113
    .line 114
    if-eqz v6, :cond_b

    .line 115
    .line 116
    iget-object v3, v6, Lo9/q;->n:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    if-eqz v12, :cond_9

    .line 123
    .line 124
    :goto_7
    move-object v12, v4

    .line 125
    goto :goto_9

    .line 126
    :cond_9
    invoke-virtual {v3, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_a

    .line 131
    .line 132
    iget-object v3, v6, Lo9/q;->o:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v3}, Lo9/p;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    :cond_a
    :goto_8
    move-object v12, v5

    .line 139
    goto :goto_9

    .line 140
    :cond_b
    invoke-virtual {v1, v2, v0}, Lo9/p;->s(Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    invoke-virtual {v12, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    if-eqz v13, :cond_c

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_c
    invoke-virtual {v12, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    if-eqz v12, :cond_a

    .line 156
    .line 157
    invoke-static {v3, v2}, Lo9/p;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-interface {v8, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    if-eqz v3, :cond_d

    .line 166
    .line 167
    move-object v5, v3

    .line 168
    :cond_d
    invoke-static {v5}, Lo9/p;->v(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    goto :goto_8

    .line 173
    :goto_9
    invoke-virtual {v12, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    const/4 v13, 0x0

    .line 178
    if-eqz v3, :cond_f

    .line 179
    .line 180
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 181
    .line 182
    move-object v11, v2

    .line 183
    move-object v14, v6

    .line 184
    :cond_e
    move-object v15, v0

    .line 185
    goto/16 :goto_d

    .line 186
    .line 187
    :cond_f
    const-string v3, "group_member_reply_media_sequence"

    .line 188
    .line 189
    const-string v4, "image,voice,emoji,video,file,favorite"

    .line 190
    .line 191
    invoke-interface {v8, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    if-eqz v5, :cond_10

    .line 196
    .line 197
    move-object v4, v5

    .line 198
    :cond_10
    if-eqz v6, :cond_12

    .line 199
    .line 200
    iget-object v0, v6, Lo9/q;->n:Ljava/lang/String;

    .line 201
    .line 202
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_11

    .line 207
    .line 208
    iget-object v0, v6, Lo9/q;->p:Ljava/lang/String;

    .line 209
    .line 210
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_13

    .line 215
    .line 216
    :cond_11
    move-object v0, v4

    .line 217
    goto :goto_a

    .line 218
    :cond_12
    invoke-virtual {v1, v2, v0}, Lo9/p;->s(Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v0, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_11

    .line 227
    .line 228
    invoke-static {v3, v2}, Lo9/p;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-interface {v8, v0, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-eqz v0, :cond_11

    .line 237
    .line 238
    :cond_13
    :goto_a
    const-string v4, "group_member_reply_join_image_paths"

    .line 239
    .line 240
    const-string v5, "group_member_reply_left_image_paths"

    .line 241
    .line 242
    move-object/from16 v3, p1

    .line 243
    .line 244
    invoke-virtual/range {v1 .. v6}, Lo9/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    move-object v11, v2

    .line 249
    move-object v14, v6

    .line 250
    const-string v2, "group_member_reply_image_delay_ms"

    .line 251
    .line 252
    const/16 v15, 0x64

    .line 253
    .line 254
    invoke-virtual {v1, v11, v2, v15, v14}, Lo9/p;->j(Ljava/lang/String;Ljava/lang/String;ILo9/q;)J

    .line 255
    .line 256
    .line 257
    move-result-wide v2

    .line 258
    new-instance v6, Lca/s;

    .line 259
    .line 260
    const/16 v5, 0xa

    .line 261
    .line 262
    invoke-direct {v6, v11, v5}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 263
    .line 264
    .line 265
    move-wide/from16 v22, v2

    .line 266
    .line 267
    move-object v3, v4

    .line 268
    move-wide/from16 v4, v22

    .line 269
    .line 270
    const-string v2, "image"

    .line 271
    .line 272
    invoke-virtual/range {v1 .. v6}, Lo9/p;->x(Ljava/lang/String;Ljava/lang/String;JLfg/l;)Lo9/m;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    new-instance v1, Lsf/e;

    .line 277
    .line 278
    const-string v3, "image"

    .line 279
    .line 280
    invoke-direct {v1, v3, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    const-string v4, "group_member_reply_join_voice_paths"

    .line 284
    .line 285
    const-string v5, "group_member_reply_left_voice_paths"

    .line 286
    .line 287
    move-object/from16 v3, p1

    .line 288
    .line 289
    move-object/from16 v16, v1

    .line 290
    .line 291
    move-object v2, v11

    .line 292
    move-object v6, v14

    .line 293
    move-object/from16 v1, p0

    .line 294
    .line 295
    invoke-virtual/range {v1 .. v6}, Lo9/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    const-string v2, "group_member_reply_voice_delay_ms"

    .line 300
    .line 301
    invoke-virtual {v1, v11, v2, v15, v14}, Lo9/p;->j(Ljava/lang/String;Ljava/lang/String;ILo9/q;)J

    .line 302
    .line 303
    .line 304
    move-result-wide v2

    .line 305
    new-instance v6, Lm/b;

    .line 306
    .line 307
    const/4 v5, 0x4

    .line 308
    invoke-direct {v6, v1, v5, v11}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    move-wide/from16 v22, v2

    .line 312
    .line 313
    move-object v3, v4

    .line 314
    move-wide/from16 v4, v22

    .line 315
    .line 316
    const-string v2, "voice"

    .line 317
    .line 318
    invoke-virtual/range {v1 .. v6}, Lo9/p;->x(Ljava/lang/String;Ljava/lang/String;JLfg/l;)Lo9/m;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    new-instance v1, Lsf/e;

    .line 323
    .line 324
    const-string v3, "voice"

    .line 325
    .line 326
    invoke-direct {v1, v3, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    const-string v4, "group_member_reply_join_emoji_paths"

    .line 330
    .line 331
    const-string v5, "group_member_reply_left_emoji_paths"

    .line 332
    .line 333
    move-object/from16 v3, p1

    .line 334
    .line 335
    move-object/from16 v17, v1

    .line 336
    .line 337
    move-object v2, v11

    .line 338
    move-object v6, v14

    .line 339
    move-object/from16 v1, p0

    .line 340
    .line 341
    invoke-virtual/range {v1 .. v6}, Lo9/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v4

    .line 345
    const-string v2, "group_member_reply_emoji_delay_ms"

    .line 346
    .line 347
    invoke-virtual {v1, v11, v2, v15, v14}, Lo9/p;->j(Ljava/lang/String;Ljava/lang/String;ILo9/q;)J

    .line 348
    .line 349
    .line 350
    move-result-wide v2

    .line 351
    new-instance v6, Lca/s;

    .line 352
    .line 353
    const/16 v5, 0xb

    .line 354
    .line 355
    invoke-direct {v6, v11, v5}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 356
    .line 357
    .line 358
    move-wide/from16 v22, v2

    .line 359
    .line 360
    move-object v3, v4

    .line 361
    move-wide/from16 v4, v22

    .line 362
    .line 363
    const-string v2, "emoji"

    .line 364
    .line 365
    invoke-virtual/range {v1 .. v6}, Lo9/p;->x(Ljava/lang/String;Ljava/lang/String;JLfg/l;)Lo9/m;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    new-instance v1, Lsf/e;

    .line 370
    .line 371
    const-string v3, "emoji"

    .line 372
    .line 373
    invoke-direct {v1, v3, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    const-string v4, "group_member_reply_join_video_paths"

    .line 377
    .line 378
    const-string v5, "group_member_reply_left_video_paths"

    .line 379
    .line 380
    move-object/from16 v3, p1

    .line 381
    .line 382
    move-object/from16 v18, v1

    .line 383
    .line 384
    move-object v2, v11

    .line 385
    move-object v6, v14

    .line 386
    move-object/from16 v1, p0

    .line 387
    .line 388
    invoke-virtual/range {v1 .. v6}, Lo9/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    const-string v2, "group_member_reply_video_delay_ms"

    .line 393
    .line 394
    invoke-virtual {v1, v11, v2, v15, v14}, Lo9/p;->j(Ljava/lang/String;Ljava/lang/String;ILo9/q;)J

    .line 395
    .line 396
    .line 397
    move-result-wide v2

    .line 398
    new-instance v6, Lca/s;

    .line 399
    .line 400
    const/16 v5, 0xc

    .line 401
    .line 402
    invoke-direct {v6, v11, v5}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 403
    .line 404
    .line 405
    move-wide/from16 v22, v2

    .line 406
    .line 407
    move-object v3, v4

    .line 408
    move-wide/from16 v4, v22

    .line 409
    .line 410
    const-string v2, "video"

    .line 411
    .line 412
    invoke-virtual/range {v1 .. v6}, Lo9/p;->x(Ljava/lang/String;Ljava/lang/String;JLfg/l;)Lo9/m;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    new-instance v1, Lsf/e;

    .line 417
    .line 418
    const-string v3, "video"

    .line 419
    .line 420
    invoke-direct {v1, v3, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    const-string v4, "group_member_reply_join_file_paths"

    .line 424
    .line 425
    const-string v5, "group_member_reply_left_file_paths"

    .line 426
    .line 427
    move-object/from16 v3, p1

    .line 428
    .line 429
    move-object/from16 v19, v1

    .line 430
    .line 431
    move-object v2, v11

    .line 432
    move-object v6, v14

    .line 433
    move-object/from16 v1, p0

    .line 434
    .line 435
    invoke-virtual/range {v1 .. v6}, Lo9/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    const-string v2, "group_member_reply_file_delay_ms"

    .line 440
    .line 441
    invoke-virtual {v1, v11, v2, v15, v14}, Lo9/p;->j(Ljava/lang/String;Ljava/lang/String;ILo9/q;)J

    .line 442
    .line 443
    .line 444
    move-result-wide v2

    .line 445
    new-instance v6, Lca/s;

    .line 446
    .line 447
    const/16 v5, 0xd

    .line 448
    .line 449
    invoke-direct {v6, v11, v5}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 450
    .line 451
    .line 452
    move-wide/from16 v22, v2

    .line 453
    .line 454
    move-object v3, v4

    .line 455
    move-wide/from16 v4, v22

    .line 456
    .line 457
    const-string v2, "file"

    .line 458
    .line 459
    invoke-virtual/range {v1 .. v6}, Lo9/p;->x(Ljava/lang/String;Ljava/lang/String;JLfg/l;)Lo9/m;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    new-instance v1, Lsf/e;

    .line 464
    .line 465
    const-string v3, "file"

    .line 466
    .line 467
    invoke-direct {v1, v3, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    const-string v4, "group_member_reply_join_favorite_paths"

    .line 471
    .line 472
    const-string v5, "group_member_reply_left_favorite_paths"

    .line 473
    .line 474
    move-object/from16 v3, p1

    .line 475
    .line 476
    move-object/from16 v20, v1

    .line 477
    .line 478
    move-object v2, v11

    .line 479
    move-object v6, v14

    .line 480
    move-object/from16 v1, p0

    .line 481
    .line 482
    invoke-virtual/range {v1 .. v6}, Lo9/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    const-string v2, "group_member_reply_favorite_delay_ms"

    .line 487
    .line 488
    invoke-virtual {v1, v11, v2, v15, v14}, Lo9/p;->j(Ljava/lang/String;Ljava/lang/String;ILo9/q;)J

    .line 489
    .line 490
    .line 491
    move-result-wide v2

    .line 492
    new-instance v6, Lca/s;

    .line 493
    .line 494
    const/16 v5, 0xe

    .line 495
    .line 496
    invoke-direct {v6, v11, v5}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 497
    .line 498
    .line 499
    move-wide/from16 v22, v2

    .line 500
    .line 501
    move-object v3, v4

    .line 502
    move-wide/from16 v4, v22

    .line 503
    .line 504
    const-string v2, "favorite"

    .line 505
    .line 506
    invoke-virtual/range {v1 .. v6}, Lo9/p;->x(Ljava/lang/String;Ljava/lang/String;JLfg/l;)Lo9/m;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    new-instance v3, Lsf/e;

    .line 511
    .line 512
    const-string v4, "favorite"

    .line 513
    .line 514
    invoke-direct {v3, v4, v2}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    move-object/from16 v21, v3

    .line 518
    .line 519
    filled-new-array/range {v16 .. v21}, [Lsf/e;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    invoke-static {v2}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 524
    .line 525
    .line 526
    move-result-object v2

    .line 527
    const/4 v3, 0x1

    .line 528
    new-array v3, v3, [C

    .line 529
    .line 530
    const/16 v4, 0x2c

    .line 531
    .line 532
    aput-char v4, v3, v13

    .line 533
    .line 534
    const/4 v4, 0x6

    .line 535
    invoke-static {v0, v3, v4}, Log/m;->F0(Ljava/lang/CharSequence;[CI)Ljava/util/List;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    new-instance v3, Ljava/util/ArrayList;

    .line 540
    .line 541
    invoke-static {v0}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 542
    .line 543
    .line 544
    move-result v4

    .line 545
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 546
    .line 547
    .line 548
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 553
    .line 554
    .line 555
    move-result v4

    .line 556
    if-eqz v4, :cond_14

    .line 557
    .line 558
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v4

    .line 562
    check-cast v4, Ljava/lang/String;

    .line 563
    .line 564
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 569
    .line 570
    .line 571
    move-result-object v4

    .line 572
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 573
    .line 574
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v4

    .line 581
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    goto :goto_b

    .line 588
    :cond_14
    new-instance v0, Ljava/util/ArrayList;

    .line 589
    .line 590
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    :cond_15
    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 598
    .line 599
    .line 600
    move-result v4

    .line 601
    if-eqz v4, :cond_e

    .line 602
    .line 603
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v4

    .line 607
    check-cast v4, Ljava/lang/String;

    .line 608
    .line 609
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    check-cast v4, Lo9/m;

    .line 614
    .line 615
    if-eqz v4, :cond_15

    .line 616
    .line 617
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    goto :goto_c

    .line 621
    :goto_d
    const-string v0, "group_member_reply_prompt_delay_ms"

    .line 622
    .line 623
    invoke-virtual {v1, v11, v0, v13, v14}, Lo9/p;->j(Ljava/lang/String;Ljava/lang/String;ILo9/q;)J

    .line 624
    .line 625
    .line 626
    move-result-wide v2

    .line 627
    const-string v13, "card"

    .line 628
    .line 629
    invoke-virtual {v10, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    if-eqz v0, :cond_16

    .line 634
    .line 635
    new-instance v7, Lo9/m;

    .line 636
    .line 637
    new-instance v0, Lo9/f;

    .line 638
    .line 639
    const/4 v6, 0x0

    .line 640
    move-object/from16 v4, p3

    .line 641
    .line 642
    move-wide v8, v2

    .line 643
    move-object v3, v11

    .line 644
    move-object v5, v14

    .line 645
    move-object/from16 v2, p1

    .line 646
    .line 647
    invoke-direct/range {v0 .. v6}, Lo9/f;-><init>(Lo9/p;Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;I)V

    .line 648
    .line 649
    .line 650
    invoke-direct {v7, v13, v8, v9, v0}, Lo9/m;-><init>(Ljava/lang/String;JLfg/a;)V

    .line 651
    .line 652
    .line 653
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    move-object/from16 v1, p0

    .line 658
    .line 659
    move-object/from16 v2, p2

    .line 660
    .line 661
    move-object/from16 v16, v15

    .line 662
    .line 663
    goto/16 :goto_13

    .line 664
    .line 665
    :cond_16
    move-wide v0, v2

    .line 666
    const-string v11, "both"

    .line 667
    .line 668
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v2

    .line 672
    if-eqz v2, :cond_1f

    .line 673
    .line 674
    new-instance v10, Lo9/m;

    .line 675
    .line 676
    move-wide v1, v0

    .line 677
    new-instance v0, Lo9/f;

    .line 678
    .line 679
    const/4 v6, 0x1

    .line 680
    move-object/from16 v3, p2

    .line 681
    .line 682
    move-object/from16 v4, p3

    .line 683
    .line 684
    move-object/from16 v5, p4

    .line 685
    .line 686
    move-object/from16 v16, v15

    .line 687
    .line 688
    move-wide v14, v1

    .line 689
    move-object/from16 v1, p0

    .line 690
    .line 691
    move-object/from16 v2, p1

    .line 692
    .line 693
    invoke-direct/range {v0 .. v6}, Lo9/f;-><init>(Lo9/p;Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;I)V

    .line 694
    .line 695
    .line 696
    invoke-direct {v10, v9, v14, v15, v0}, Lo9/m;-><init>(Ljava/lang/String;JLfg/a;)V

    .line 697
    .line 698
    .line 699
    new-instance v9, Lo9/m;

    .line 700
    .line 701
    new-instance v0, Lo9/f;

    .line 702
    .line 703
    const/4 v6, 0x2

    .line 704
    invoke-direct/range {v0 .. v6}, Lo9/f;-><init>(Lo9/p;Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;I)V

    .line 705
    .line 706
    .line 707
    move-object v2, v3

    .line 708
    move-object v6, v5

    .line 709
    const-wide/16 v3, 0x78

    .line 710
    .line 711
    invoke-direct {v9, v13, v3, v4, v0}, Lo9/m;-><init>(Ljava/lang/String;JLfg/a;)V

    .line 712
    .line 713
    .line 714
    const-string v0, "card_first"

    .line 715
    .line 716
    const-string v1, "group_member_reply_both_order"

    .line 717
    .line 718
    const-string v3, "text_first"

    .line 719
    .line 720
    if-eqz v6, :cond_19

    .line 721
    .line 722
    iget-object v4, v6, Lo9/q;->f:Ljava/lang/String;

    .line 723
    .line 724
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 725
    .line 726
    .line 727
    move-result v4

    .line 728
    if-eqz v4, :cond_17

    .line 729
    .line 730
    iget-object v1, v6, Lo9/q;->g:Ljava/lang/String;

    .line 731
    .line 732
    goto :goto_e

    .line 733
    :cond_17
    invoke-interface {v8, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    if-eqz v1, :cond_18

    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_18
    move-object v1, v3

    .line 741
    :goto_e
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 742
    .line 743
    .line 744
    move-result v1

    .line 745
    if-eqz v1, :cond_1d

    .line 746
    .line 747
    goto :goto_11

    .line 748
    :cond_19
    invoke-static {v1, v2}, Lo9/p;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    invoke-interface {v8, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v4

    .line 756
    if-nez v4, :cond_1a

    .line 757
    .line 758
    goto :goto_f

    .line 759
    :cond_1a
    move-object v7, v4

    .line 760
    :goto_f
    invoke-static {v7}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 761
    .line 762
    .line 763
    move-result v4

    .line 764
    if-eqz v4, :cond_1c

    .line 765
    .line 766
    invoke-interface {v8, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    if-eqz v1, :cond_1b

    .line 771
    .line 772
    move-object v7, v1

    .line 773
    goto :goto_10

    .line 774
    :cond_1b
    move-object v7, v3

    .line 775
    :cond_1c
    :goto_10
    invoke-virtual {v7, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v1

    .line 779
    if-eqz v1, :cond_1d

    .line 780
    .line 781
    :goto_11
    move-object v3, v0

    .line 782
    :cond_1d
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 783
    .line 784
    .line 785
    move-result v0

    .line 786
    if-eqz v0, :cond_1e

    .line 787
    .line 788
    filled-new-array {v9, v10}, [Lo9/m;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    :goto_12
    move-object/from16 v1, p0

    .line 797
    .line 798
    goto :goto_13

    .line 799
    :cond_1e
    filled-new-array {v10, v9}, [Lo9/m;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    goto :goto_12

    .line 808
    :cond_1f
    move-object/from16 v2, p2

    .line 809
    .line 810
    move-object/from16 v6, p4

    .line 811
    .line 812
    move-object/from16 v16, v15

    .line 813
    .line 814
    move-wide v14, v0

    .line 815
    new-instance v7, Lo9/m;

    .line 816
    .line 817
    new-instance v0, Lo9/f;

    .line 818
    .line 819
    const/4 v6, 0x3

    .line 820
    move-object/from16 v1, p0

    .line 821
    .line 822
    move-object/from16 v4, p3

    .line 823
    .line 824
    move-object/from16 v5, p4

    .line 825
    .line 826
    move-object v3, v2

    .line 827
    move-object/from16 v2, p1

    .line 828
    .line 829
    invoke-direct/range {v0 .. v6}, Lo9/f;-><init>(Lo9/p;Ljava/lang/String;Ljava/lang/String;Lo9/n;Lo9/q;I)V

    .line 830
    .line 831
    .line 832
    move-object v2, v3

    .line 833
    invoke-direct {v7, v9, v14, v15, v0}, Lo9/m;-><init>(Ljava/lang/String;JLfg/a;)V

    .line 834
    .line 835
    .line 836
    invoke-static {v7}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    :goto_13
    const-string v3, "before"

    .line 841
    .line 842
    invoke-virtual {v12, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 843
    .line 844
    .line 845
    move-result v3

    .line 846
    if-eqz v3, :cond_20

    .line 847
    .line 848
    move-object/from16 v3, v16

    .line 849
    .line 850
    invoke-static {v3, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 851
    .line 852
    .line 853
    move-result-object v0

    .line 854
    goto :goto_14

    .line 855
    :cond_20
    move-object/from16 v3, v16

    .line 856
    .line 857
    const-string v4, "after"

    .line 858
    .line 859
    invoke-virtual {v12, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-result v4

    .line 863
    if-eqz v4, :cond_21

    .line 864
    .line 865
    invoke-static {v0, v3}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    :cond_21
    :goto_14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 870
    .line 871
    .line 872
    move-result-object v3

    .line 873
    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 874
    .line 875
    .line 876
    move-result v0

    .line 877
    if-eqz v0, :cond_23

    .line 878
    .line 879
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    move-object v4, v0

    .line 884
    check-cast v4, Lo9/m;

    .line 885
    .line 886
    iget-wide v5, v4, Lo9/m;->b:J

    .line 887
    .line 888
    invoke-static {v5, v6}, Lo9/p;->F(J)V

    .line 889
    .line 890
    .line 891
    :try_start_0
    iget-object v0, v4, Lo9/m;->c:Lfg/a;

    .line 892
    .line 893
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 897
    .line 898
    goto :goto_16

    .line 899
    :catchall_0
    move-exception v0

    .line 900
    new-instance v5, Lsf/f;

    .line 901
    .line 902
    invoke-direct {v5, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 903
    .line 904
    .line 905
    move-object v0, v5

    .line 906
    :goto_16
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    if-eqz v0, :cond_22

    .line 911
    .line 912
    iget-object v4, v4, Lo9/m;->a:Ljava/lang/String;

    .line 913
    .line 914
    const-string v5, "\u8fdb\u9000\u7fa4\u81ea\u52a8\u56de\u590d\u53d1\u9001\u5931\u8d25: "

    .line 915
    .line 916
    const-string v6, "/"

    .line 917
    .line 918
    invoke-static {v5, v2, v6, v4}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v4

    .line 922
    iget-object v5, v1, Lo9/p;->a:Lia/t;

    .line 923
    .line 924
    invoke-virtual {v5, v4, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 925
    .line 926
    .line 927
    :cond_22
    const-wide/16 v4, 0x12c

    .line 928
    .line 929
    invoke-static {v4, v5}, Lo9/p;->F(J)V

    .line 930
    .line 931
    .line 932
    goto :goto_15

    .line 933
    :cond_23
    return-void
.end method

.method public final o(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    invoke-static {}, Lj8/b;->f()Lg8/d;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const/4 v8, 0x0

    .line 12
    if-eqz v2, :cond_4

    .line 13
    .line 14
    const-string v4, ""

    .line 15
    .line 16
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    if-nez v5, :cond_3

    .line 21
    .line 22
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v2, v3}, Lg8/d;->k(Ljava/lang/String;)Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Lg8/c;

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    iget-object v5, v2, Lg8/c;->b:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object v2, v2, Lg8/c;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move-object v4, v2

    .line 64
    :cond_3
    :goto_0
    if-eqz v4, :cond_4

    .line 65
    .line 66
    invoke-static {v4}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move-object v2, v8

    .line 76
    :goto_1
    if-nez v2, :cond_5

    .line 77
    .line 78
    const-string v2, ""

    .line 79
    .line 80
    :cond_5
    move-object v9, v2

    .line 81
    invoke-static {v3, v9}, Lo9/p;->r(Ljava/lang/String;Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    const/4 v4, 0x0

    .line 86
    if-eqz v2, :cond_c

    .line 87
    .line 88
    invoke-virtual {v9, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    goto/16 :goto_6

    .line 95
    .line 96
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v2, v1, Lo9/p;->i:Ljava/lang/Object;

    .line 100
    .line 101
    monitor-enter v2

    .line 102
    :try_start_0
    new-instance v5, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v6, "group_invite_detail_count_"

    .line 105
    .line 106
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v6, "|"

    .line 113
    .line 114
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    iget-object v6, v1, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 125
    .line 126
    new-instance v7, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    const-string v10, "group_invite_detail_count_"

    .line 129
    .line 130
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string v10, "|"

    .line 137
    .line 138
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-interface {v6, v7, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-gez v6, :cond_7

    .line 153
    .line 154
    move v6, v4

    .line 155
    :cond_7
    const/4 v10, 0x1

    .line 156
    move/from16 v7, p1

    .line 157
    .line 158
    if-ge v7, v10, :cond_8

    .line 159
    .line 160
    move v7, v10

    .line 161
    :cond_8
    add-int/2addr v6, v7

    .line 162
    iget-object v7, v1, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 163
    .line 164
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-interface {v7, v5, v6}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 173
    .line 174
    .line 175
    monitor-exit v2

    .line 176
    iget-object v2, v1, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 177
    .line 178
    const-string v5, "group_invite_detail_enable"

    .line 179
    .line 180
    invoke-interface {v2, v5, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_b

    .line 185
    .line 186
    invoke-virtual {v1, v3}, Lo9/p;->q(Ljava/lang/String;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_b

    .line 191
    .line 192
    const-string v11, "/"

    .line 193
    .line 194
    iget-object v12, v1, Lo9/p;->a:Lia/t;

    .line 195
    .line 196
    const-string v13, "\u9080\u8bf7\u8be6\u60c5\u63d2\u5165\u5931\u8d25: "

    .line 197
    .line 198
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 199
    .line 200
    .line 201
    move-result-wide v4

    .line 202
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->message()Li8/c;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->h()Lk8/e;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    if-nez v2, :cond_9

    .line 214
    .line 215
    const-string v0, "\u9080\u8bf7\u8be6\u60c5\u63d2\u5165\u5931\u8d25: \u672c\u5730\u6d88\u606f API \u672a\u5c31\u7eea"

    .line 216
    .line 217
    invoke-virtual {v12, v0, v8}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_9
    :try_start_1
    invoke-virtual {v2}, Lk8/e;->c()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v3, v9}, Lo9/p;->u(Ljava/lang/String;Ljava/lang/String;)Lo9/j;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {v1, v3, v0}, Lo9/p;->u(Ljava/lang/String;Ljava/lang/String;)Lo9/j;

    .line 229
    .line 230
    .line 231
    move-result-object v14

    .line 232
    invoke-virtual {v1, v3, v7, v14, v6}, Lo9/p;->c(Ljava/lang/String;Lo9/j;Lo9/j;I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    const/4 v7, 0x1

    .line 237
    move-wide v15, v4

    .line 238
    move-object v4, v6

    .line 239
    move-wide v5, v15

    .line 240
    invoke-virtual/range {v2 .. v7}, Lk8/e;->e(Ljava/lang/String;Ljava/lang/String;JZ)J

    .line 241
    .line 242
    .line 243
    move-result-wide v4

    .line 244
    const-wide/16 v6, 0x0

    .line 245
    .line 246
    cmp-long v2, v4, v6

    .line 247
    .line 248
    if-gtz v2, :cond_a

    .line 249
    .line 250
    new-instance v2, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-virtual {v12, v0, v8}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :catchall_0
    move-exception v0

    .line 279
    goto :goto_3

    .line 280
    :cond_a
    :goto_2
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :goto_3
    new-instance v2, Lsf/f;

    .line 284
    .line 285
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    move-object v0, v2

    .line 289
    :goto_4
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    if-eqz v0, :cond_b

    .line 294
    .line 295
    const-string v2, "\u9080\u8bf7\u8be6\u60c5\u63d2\u5165\u5f02\u5e38"

    .line 296
    .line 297
    invoke-virtual {v12, v2, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    :cond_b
    :goto_5
    return v10

    .line 301
    :catchall_1
    move-exception v0

    .line 302
    monitor-exit v2

    .line 303
    throw v0

    .line 304
    :cond_c
    :goto_6
    return v4
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 12

    .line 1
    const-string v0, "group_member_reply_enable"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_0
    const-string v0, "group_member_reply_listen_groups"

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    move-object v0, v1

    .line 25
    :cond_1
    invoke-static {v0}, Lo9/p;->G(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ltf/m;->U1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto/16 :goto_2

    .line 40
    .line 41
    :cond_2
    const-string v0, "group_member_reply_template_bindings"

    .line 42
    .line 43
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_3

    .line 48
    .line 49
    move-object v0, v1

    .line 50
    :cond_3
    invoke-static {v0}, Lr9/e0;->R(Ljava/lang/String;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    const/4 v4, 0x0

    .line 63
    if-eqz v3, :cond_5

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    move-object v5, v3

    .line 70
    check-cast v5, Lo9/r;

    .line 71
    .line 72
    iget-object v5, v5, Lo9/r;->a:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v5, p2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_4

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    move-object v3, v4

    .line 82
    :goto_0
    check-cast v3, Lo9/r;

    .line 83
    .line 84
    if-eqz v3, :cond_9

    .line 85
    .line 86
    const-string v0, "group_member_reply_templates"

    .line 87
    .line 88
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    if-nez v0, :cond_6

    .line 93
    .line 94
    move-object v0, v1

    .line 95
    :cond_6
    invoke-static {v0}, Lr9/e0;->X(Ljava/lang/String;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_8

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    move-object v6, v5

    .line 114
    check-cast v6, Lo9/q;

    .line 115
    .line 116
    iget-object v6, v6, Lo9/q;->a:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v7, v3, Lo9/r;->c:Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-eqz v6, :cond_7

    .line 125
    .line 126
    move-object v4, v5

    .line 127
    :cond_8
    check-cast v4, Lo9/q;

    .line 128
    .line 129
    :cond_9
    move-object v10, v4

    .line 130
    const-string v0, "join"

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    const/4 v3, 0x1

    .line 137
    if-eqz v0, :cond_d

    .line 138
    .line 139
    if-eqz v10, :cond_a

    .line 140
    .line 141
    iget-boolean v0, v10, Lo9/q;->c:Z

    .line 142
    .line 143
    if-eqz v0, :cond_11

    .line 144
    .line 145
    iget-boolean v0, v10, Lo9/q;->d:Z

    .line 146
    .line 147
    if-nez v0, :cond_d

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_a
    const-string v0, "group_member_reply_join_enable"

    .line 151
    .line 152
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    if-nez v0, :cond_b

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_b
    const-string v0, "group_member_reply_join_disabled_groups"

    .line 160
    .line 161
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    if-nez v0, :cond_c

    .line 166
    .line 167
    move-object v0, v1

    .line 168
    :cond_c
    invoke-static {v0}, Lo9/p;->G(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_d

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :cond_d
    const-string v0, "left"

    .line 180
    .line 181
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v0

    .line 185
    if-eqz v0, :cond_12

    .line 186
    .line 187
    if-eqz v10, :cond_e

    .line 188
    .line 189
    iget-boolean v0, v10, Lo9/q;->c:Z

    .line 190
    .line 191
    if-eqz v0, :cond_11

    .line 192
    .line 193
    iget-boolean v0, v10, Lo9/q;->e:Z

    .line 194
    .line 195
    if-nez v0, :cond_12

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_e
    const-string v0, "group_member_reply_left_enable"

    .line 199
    .line 200
    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_f

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_f
    const-string v0, "group_member_reply_left_disabled_groups"

    .line 208
    .line 209
    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-nez v0, :cond_10

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_10
    move-object v1, v0

    .line 217
    :goto_1
    invoke-static {v1}, Lo9/p;->G(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_12

    .line 226
    .line 227
    :cond_11
    :goto_2
    return-void

    .line 228
    :cond_12
    new-instance v0, Ljava/lang/Thread;

    .line 229
    .line 230
    new-instance v5, Lca/x;

    .line 231
    .line 232
    const/16 v11, 0xa

    .line 233
    .line 234
    move-object v6, p0

    .line 235
    move-object v9, p1

    .line 236
    move-object v7, p2

    .line 237
    move-object v8, p3

    .line 238
    invoke-direct/range {v5 .. v11}, Lca/x;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 239
    .line 240
    .line 241
    const-string p1, "Hchat-GroupMemberReply"

    .line 242
    .line 243
    invoke-direct {v0, v5, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 247
    .line 248
    .line 249
    return-void
.end method

.method public final q(Ljava/lang/String;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    const-string v1, "group_monitor_notice_scope"

    .line 4
    .line 5
    const-string v2, "all"

    .line 6
    .line 7
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object v2, v1

    .line 14
    :cond_0
    const-string v1, "specific"

    .line 15
    .line 16
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    const-string v1, "group_monitor_notice_groups"

    .line 23
    .line 24
    const-string v2, ""

    .line 25
    .line 26
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v2, v0

    .line 34
    :goto_0
    invoke-static {v2}, Lo9/p;->G(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    const/4 p1, 0x0

    .line 46
    return p1

    .line 47
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 48
    return p1
.end method

.method public final s(Ljava/lang/String;Lo9/q;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "global"

    .line 2
    .line 3
    const-string v1, "custom"

    .line 4
    .line 5
    const-string v2, "none"

    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iget-object p1, p2, Lo9/q;->n:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_6

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v3, "group_member_reply_media_mode_"

    .line 28
    .line 29
    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object p2, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 40
    .line 41
    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_6

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    const v3, -0x5069748f

    .line 52
    .line 53
    .line 54
    if-eq p2, v3, :cond_4

    .line 55
    .line 56
    const v1, 0x33af38

    .line 57
    .line 58
    .line 59
    if-eq p2, v1, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_3

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_3
    :goto_0
    return-object v2

    .line 70
    :cond_4
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    :goto_1
    return-object v1

    .line 78
    :cond_6
    :goto_2
    return-object v0
.end method

.method public final t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo9/q;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "join"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object p3, p4

    .line 11
    :goto_0
    invoke-virtual {p0, p1, p5}, Lo9/p;->s(Ljava/lang/String;Lo9/q;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string p4, "custom"

    .line 16
    .line 17
    invoke-virtual {p2, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object p4, p0, Lo9/p;->b:Landroid/content/SharedPreferences;

    .line 22
    .line 23
    const-string v0, ""

    .line 24
    .line 25
    if-eqz p2, :cond_10

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    if-eqz p5, :cond_d

    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    sparse-switch v1, :sswitch_data_0

    .line 35
    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :sswitch_0
    const-string v1, "group_member_reply_left_favorite_paths"

    .line 40
    .line 41
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    goto/16 :goto_1

    .line 48
    .line 49
    :cond_1
    iget-object p2, p5, Lo9/q;->B:Ljava/lang/String;

    .line 50
    .line 51
    goto/16 :goto_1

    .line 52
    .line 53
    :sswitch_1
    const-string v1, "group_member_reply_left_image_paths"

    .line 54
    .line 55
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_2

    .line 60
    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :cond_2
    iget-object p2, p5, Lo9/q;->r:Ljava/lang/String;

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :sswitch_2
    const-string v1, "group_member_reply_left_emoji_paths"

    .line 68
    .line 69
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_3

    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :cond_3
    iget-object p2, p5, Lo9/q;->v:Ljava/lang/String;

    .line 78
    .line 79
    goto/16 :goto_1

    .line 80
    .line 81
    :sswitch_3
    const-string v1, "group_member_reply_join_image_paths"

    .line 82
    .line 83
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_4

    .line 88
    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :cond_4
    iget-object p2, p5, Lo9/q;->q:Ljava/lang/String;

    .line 92
    .line 93
    goto/16 :goto_1

    .line 94
    .line 95
    :sswitch_4
    const-string v1, "group_member_reply_join_favorite_paths"

    .line 96
    .line 97
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    iget-object p2, p5, Lo9/q;->A:Ljava/lang/String;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :sswitch_5
    const-string v1, "group_member_reply_left_video_paths"

    .line 108
    .line 109
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_6

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_6
    iget-object p2, p5, Lo9/q;->x:Ljava/lang/String;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :sswitch_6
    const-string v1, "group_member_reply_join_emoji_paths"

    .line 120
    .line 121
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-nez v1, :cond_7

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_7
    iget-object p2, p5, Lo9/q;->u:Ljava/lang/String;

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :sswitch_7
    const-string v1, "group_member_reply_join_video_paths"

    .line 132
    .line 133
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-nez v1, :cond_8

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_8
    iget-object p2, p5, Lo9/q;->w:Ljava/lang/String;

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :sswitch_8
    const-string v1, "group_member_reply_left_voice_paths"

    .line 144
    .line 145
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-nez v1, :cond_9

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_9
    iget-object p2, p5, Lo9/q;->t:Ljava/lang/String;

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :sswitch_9
    const-string v1, "group_member_reply_left_file_paths"

    .line 156
    .line 157
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_a

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_a
    iget-object p2, p5, Lo9/q;->z:Ljava/lang/String;

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :sswitch_a
    const-string v1, "group_member_reply_join_voice_paths"

    .line 168
    .line 169
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-nez v1, :cond_b

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_b
    iget-object p2, p5, Lo9/q;->s:Ljava/lang/String;

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :sswitch_b
    const-string v1, "group_member_reply_join_file_paths"

    .line 180
    .line 181
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_c

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_c
    iget-object p2, p5, Lo9/q;->y:Ljava/lang/String;

    .line 189
    .line 190
    :cond_d
    :goto_1
    if-eqz p2, :cond_e

    .line 191
    .line 192
    return-object p2

    .line 193
    :cond_e
    invoke-static {p3, p1}, Lo9/p;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-interface {p4, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    if-nez p1, :cond_f

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_f
    return-object p1

    .line 205
    :cond_10
    invoke-interface {p4, p3, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    if-nez p1, :cond_11

    .line 210
    .line 211
    :goto_2
    return-object v0

    .line 212
    :cond_11
    return-object p1

    .line 213
    :sswitch_data_0
    .sparse-switch
        -0x73458eda -> :sswitch_b
        -0x58ca35ba -> :sswitch_a
        -0x2f97cdd7 -> :sswitch_9
        -0x26bfd65d -> :sswitch_8
        -0x17185d31 -> :sswitch_7
        -0x3135a6 -> :sswitch_6
        0x1af2022c -> :sswitch_5
        0x246dd7c6 -> :sswitch_4
        0x2c670faf -> :sswitch_3
        0x31d929b7 -> :sswitch_2
        0x5e716f0c -> :sswitch_1
        0x697d5f49 -> :sswitch_0
    .end sparse-switch
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;)Lo9/j;
    .locals 7

    .line 1
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lo9/p;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lo9/p;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/String;

    .line 16
    .line 17
    const-string v2, ""

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    if-nez v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-nez v6, :cond_0

    .line 35
    .line 36
    move v6, v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v6, v3

    .line 39
    :goto_0
    if-eqz v6, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v1, v5

    .line 43
    :goto_1
    if-eqz v1, :cond_2

    .line 44
    .line 45
    goto :goto_5

    .line 46
    :cond_2
    if-eqz v0, :cond_5

    .line 47
    .line 48
    invoke-virtual {v0, p1, p2}, Lg8/i;->v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-nez v1, :cond_3

    .line 65
    .line 66
    move v1, v4

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    move v1, v3

    .line 69
    :goto_2
    if-eqz v1, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    move-object p1, v5

    .line 73
    :goto_3
    move-object v1, p1

    .line 74
    goto :goto_4

    .line 75
    :cond_5
    move-object v1, v5

    .line 76
    :goto_4
    if-eqz v1, :cond_6

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :cond_6
    move-object v1, v2

    .line 80
    :goto_5
    if-eqz v0, :cond_7

    .line 81
    .line 82
    invoke-virtual {v0, p2}, Lg8/i;->n(Ljava/lang/String;)Lh/Hchat/hooks/api/model/WeChatContact;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    goto :goto_6

    .line 87
    :cond_7
    move-object p1, v5

    .line 88
    :goto_6
    if-eqz p1, :cond_a

    .line 89
    .line 90
    iget-object v0, p1, Lh/Hchat/hooks/api/model/WeChatContact;->nickname:Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v0, :cond_a

    .line 93
    .line 94
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-nez v6, :cond_8

    .line 99
    .line 100
    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-nez v6, :cond_8

    .line 105
    .line 106
    move v6, v4

    .line 107
    goto :goto_7

    .line 108
    :cond_8
    move v6, v3

    .line 109
    :goto_7
    if-eqz v6, :cond_9

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_9
    move-object v0, v5

    .line 113
    :goto_8
    if-eqz v0, :cond_a

    .line 114
    .line 115
    goto :goto_9

    .line 116
    :cond_a
    move-object v0, v2

    .line 117
    :goto_9
    if-eqz p1, :cond_d

    .line 118
    .line 119
    iget-object p1, p1, Lh/Hchat/hooks/api/model/WeChatContact;->remarkName:Ljava/lang/String;

    .line 120
    .line 121
    if-eqz p1, :cond_d

    .line 122
    .line 123
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-nez v6, :cond_b

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-nez v6, :cond_b

    .line 134
    .line 135
    move v3, v4

    .line 136
    :cond_b
    if-eqz v3, :cond_c

    .line 137
    .line 138
    move-object v5, p1

    .line 139
    :cond_c
    if-eqz v5, :cond_d

    .line 140
    .line 141
    move-object v2, v5

    .line 142
    :cond_d
    new-instance p1, Lo9/j;

    .line 143
    .line 144
    invoke-direct {p1, v1, v0, v2, p2}, Lo9/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-object p1
.end method

.method public final x(Ljava/lang/String;Ljava/lang/String;JLfg/l;)Lo9/m;
    .locals 2

    .line 1
    invoke-static {p2}, Lo9/p;->G(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    new-instance v0, Lo9/m;

    .line 14
    .line 15
    new-instance v1, Lo9/g;

    .line 16
    .line 17
    invoke-direct {v1, p2, p0, p5}, Lo9/g;-><init>(Ljava/util/ArrayList;Lo9/p;Lfg/l;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, p1, p3, p4, v1}, Lo9/m;-><init>(Ljava/lang/String;JLfg/a;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final z()V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->c()Lg8/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    invoke-virtual {v0}, Lg8/d;->g()Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Lh/Hchat/hooks/api/model/WeChatChatroom;

    .line 33
    .line 34
    iget-object v2, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->chatroomId:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v2}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v1, v1, Lh/Hchat/hooks/api/model/WeChatChatroom;->memberIds:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v1}, Ltf/m;->m1(Ljava/lang/Iterable;)Ldg/n;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    new-instance v3, Lo9/e;

    .line 58
    .line 59
    const/4 v4, 0x1

    .line 60
    invoke-direct {v3, v4}, Lo9/e;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v3}, Lng/m;->W(Lng/j;Lfg/l;)Lng/t;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v3, Lo9/e;

    .line 68
    .line 69
    const/4 v4, 0x2

    .line 70
    invoke-direct {v3, v4}, Lo9/e;-><init>(I)V

    .line 71
    .line 72
    .line 73
    new-instance v4, Lng/i;

    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    invoke-direct {v4, v1, v5, v3}, Lng/i;-><init>(Lng/j;ZLfg/l;)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 80
    .line 81
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-static {v4, v1}, Lng/m;->a0(Lng/j;Ljava/util/AbstractCollection;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    iget-object v3, p0, Lo9/p;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 95
    .line 96
    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v2, v1}, Lo9/p;->B(Ljava/lang/String;Ljava/util/LinkedHashSet;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    goto :goto_1

    .line 105
    :cond_2
    sget-object v0, Lsf/n;->a:Lsf/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :goto_1
    new-instance v1, Lsf/f;

    .line 109
    .line 110
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    move-object v0, v1

    .line 114
    :goto_2
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    iget-object v1, p0, Lo9/p;->a:Lia/t;

    .line 121
    .line 122
    const-string v2, "\u9884\u52a0\u8f7d\u7fa4\u6210\u5458\u5feb\u7167\u5931\u8d25"

    .line 123
    .line 124
    invoke-virtual {v1, v2, v0}, Lia/t;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_3
    return-void
.end method
