.class public final Lx8/r;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const-string v0, "Hchat_auto_reply_config"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput-object p1, p0, Lx8/r;->a:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()Lx8/u;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lx8/r;->d()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lx8/r;->p()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lx8/r;->b()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    move-object v4, v3

    .line 27
    check-cast v4, Lx8/u;

    .line 28
    .line 29
    iget-object v4, v4, Lx8/u;->a:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v4, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 v3, 0x0

    .line 39
    :goto_0
    check-cast v3, Lx8/u;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    return-object v3

    .line 44
    :cond_2
    invoke-static {v0}, Ltf/m;->v1(Ljava/util/List;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lx8/u;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_3
    invoke-virtual {p0}, Lx8/r;->j()Lx8/u;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lx8/r;->d()V

    .line 2
    .line 3
    .line 4
    const-string v0, "zhilia_active_config_name_v1"

    .line 5
    .line 6
    const-string v1, "\u9ed8\u8ba4\u914d\u7f6e"

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 4

    .line 1
    const-string v0, "auto_accept_steps_v1"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lr9/e0;->V(Ljava/lang/String;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance v0, Lx8/s;

    .line 20
    .line 21
    const-string v1, "\u4f60\u597d\uff0c%friendName%"

    .line 22
    .line 23
    const/16 v2, 0x19

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v0, v2, v3, v1}, Lx8/s;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_0
    return-object v0
.end method

.method public final d()V
    .locals 3

    .line 1
    const-string v0, "zhilia_multi_configs_v1"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Lx8/r;->j()Lx8/u;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "zhilia_active_config_name_v1"

    .line 25
    .line 26
    const-string v2, "\u9ed8\u8ba4\u914d\u7f6e"

    .line 27
    .line 28
    invoke-virtual {p0, v1, v2}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p0, v1, v0}, Lx8/r;->n(Ljava/lang/String;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lx8/r;->a:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_2

    .line 21
    :goto_1
    new-instance v0, Lsf/f;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    move-object p1, v0

    .line 27
    :goto_2
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    instance-of v1, p1, Lsf/f;

    .line 30
    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    move-object p1, v0

    .line 34
    :cond_1
    check-cast p1, Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
.end method

.method public final f(Ljava/lang/String;I)I
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lx8/r;->a:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto :goto_1

    .line 12
    :cond_0
    move p1, p2

    .line 13
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_2

    .line 18
    :goto_1
    new-instance v0, Lsf/f;

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p1, v0

    .line 24
    :goto_2
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    instance-of v0, p1, Lsf/f;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    move-object p1, p2

    .line 33
    :cond_1
    check-cast p1, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1
.end method

.method public final g(Ljava/lang/String;)J
    .locals 4

    .line 1
    const-wide/16 v0, 0x7d0

    .line 2
    .line 3
    :try_start_0
    iget-object v2, p0, Lx8/r;->a:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    invoke-interface {v2, p1, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    move-wide v2, v0

    .line 15
    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_2

    .line 20
    :goto_1
    new-instance v2, Lsf/f;

    .line 21
    .line 22
    invoke-direct {v2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v2

    .line 26
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    instance-of v1, p1, Lsf/f;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    move-object p1, v0

    .line 35
    :cond_1
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    return-wide v0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lx8/r;->a:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, p2

    .line 18
    goto :goto_1

    .line 19
    :goto_0
    new-instance v0, Lsf/f;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v0

    .line 25
    :goto_1
    nop

    .line 26
    instance-of v0, p1, Lsf/f;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    move-object p2, p1

    .line 32
    :goto_2
    check-cast p2, Ljava/lang/String;

    .line 33
    .line 34
    return-object p2
.end method

.method public final i()Ljava/util/List;
    .locals 4

    .line 1
    const-string v0, "greet_accepted_steps_v1"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lr9/e0;->V(Ljava/lang/String;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    new-instance v0, Lx8/s;

    .line 20
    .line 21
    const-string v1, "\u54c8\u55bd\uff0c%friendName%\uff01\u611f\u8c22\u901a\u8fc7\u597d\u53cb\u8bf7\u6c42\uff0c\u4ee5\u540e\u8bf7\u591a\u6307\u6559\u5566\uff01"

    .line 22
    .line 23
    const/16 v2, 0x19

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v0, v2, v3, v1}, Lx8/s;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_0
    return-object v0
.end method

.method public final j()Lx8/u;
    .locals 10

    .line 1
    const-string v0, "\u9ed8\u8ba4\u914d\u7f6e"

    .line 2
    .line 3
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    const-string v0, "ai_api_key"

    .line 7
    .line 8
    const-string v1, ""

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const-string v0, "ai_api_base"

    .line 15
    .line 16
    const-string v1, "https://api.siliconflow.cn/v1"

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const-string v0, "ai_api_path"

    .line 23
    .line 24
    const-string v1, "/chat/completions"

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const-string v0, "ai_model"

    .line 31
    .line 32
    const-string v1, "deepseek-ai/DeepSeek-V3"

    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    const-string v0, "ai_system_prompt"

    .line 39
    .line 40
    const-string v1, "\u4f60\u662f\u4e00\u4e2a\u7b80\u6d01\u3001\u6709\u5e2e\u52a9\u7684\u804a\u5929\u52a9\u624b"

    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v8

    .line 46
    const-string v0, "ai_context_limit"

    .line 47
    .line 48
    const/16 v1, 0xa

    .line 49
    .line 50
    invoke-virtual {p0, v0, v1}, Lx8/r;->f(Ljava/lang/String;I)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    const/16 v2, 0x32

    .line 56
    .line 57
    invoke-static {v0, v1, v2}, Lr9/e0;->r(III)I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    new-instance v2, Lx8/u;

    .line 62
    .line 63
    const-string v3, "\u9ed8\u8ba4\u914d\u7f6e"

    .line 64
    .line 65
    invoke-direct/range {v2 .. v9}, Lx8/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    return-object v2
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx8/r;->a:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final l()Ljava/util/List;
    .locals 30

    .line 1
    const-string v0, "auto_reply_rules_v1"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    sget-object v4, Ltf/t;->g:Ltf/t;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    return-object v4

    .line 20
    :cond_0
    :try_start_0
    new-instance v3, Lorg/json/JSONArray;

    .line 21
    .line 22
    invoke-direct {v3, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, La/a;->E()Luf/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, 0x0

    .line 34
    move v7, v6

    .line 35
    :goto_0
    if-lt v7, v5, :cond_1

    .line 36
    .line 37
    invoke-static {v0}, La/a;->t(Luf/c;)Luf/c;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    move-object v6, v4

    .line 42
    goto/16 :goto_4

    .line 43
    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object v6, v4

    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v3, v7}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    if-eqz v8, :cond_5

    .line 53
    .line 54
    const-string v9, "id"

    .line 55
    .line 56
    invoke-virtual {v8, v9}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-static {v9}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    if-eqz v10, :cond_2

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 67
    .line 68
    .line 69
    move-result-wide v9

    .line 70
    new-instance v11, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v11, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v9, "_"

    .line 79
    .line 80
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    :cond_2
    const-string v10, "name"

    .line 91
    .line 92
    add-int/lit8 v11, v7, 0x1

    .line 93
    .line 94
    new-instance v12, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v13, "\u89c4\u5219 "

    .line 100
    .line 101
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-virtual {v8, v10, v11}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    const-string v11, "enabled"

    .line 119
    .line 120
    const/4 v12, 0x1

    .line 121
    invoke-virtual {v8, v11, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    const-string v12, "keyword"

    .line 126
    .line 127
    invoke-virtual {v8, v12, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v12

    .line 131
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    const-string v13, "excludedKeywords"

    .line 135
    .line 136
    invoke-virtual {v8, v13, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v13

    .line 140
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    const-string v14, "matchType"

    .line 144
    .line 145
    invoke-virtual {v8, v14, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 146
    .line 147
    .line 148
    move-result v14

    .line 149
    const-string v15, "targetMode"

    .line 150
    .line 151
    invoke-virtual {v8, v15, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 152
    .line 153
    .line 154
    move-result v15

    .line 155
    const-string v6, "targetIds"

    .line 156
    .line 157
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-static {v6}, Lr9/e0;->W(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v16

    .line 165
    const-string v6, "excludedIds"

    .line 166
    .line 167
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {v6}, Lr9/e0;->W(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 172
    .line 173
    .line 174
    move-result-object v17

    .line 175
    const-string v6, "includedGroupMembers"

    .line 176
    .line 177
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-static {v6}, Lr9/e0;->W(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 182
    .line 183
    .line 184
    move-result-object v18

    .line 185
    const-string v6, "excludedGroupMembers"

    .line 186
    .line 187
    invoke-virtual {v8, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-static {v6}, Lr9/e0;->W(Lorg/json/JSONArray;)Ljava/util/Set;

    .line 192
    .line 193
    .line 194
    move-result-object v19

    .line 195
    const-string v6, "atTrigger"

    .line 196
    .line 197
    const/4 v2, 0x0

    .line 198
    invoke-virtual {v8, v6, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 199
    .line 200
    .line 201
    move-result v20

    .line 202
    const-string v6, "patTrigger"

    .line 203
    .line 204
    invoke-virtual {v8, v6, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 205
    .line 206
    .line 207
    move-result v21

    .line 208
    const-string v2, "startTime"

    .line 209
    .line 210
    invoke-virtual {v8, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v22

    .line 214
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    const-string v2, "endTime"

    .line 218
    .line 219
    invoke-virtual {v8, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v23

    .line 223
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    const-string v2, "maxReplyCount"

    .line 227
    .line 228
    const/4 v6, 0x0

    .line 229
    invoke-virtual {v8, v2, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-gez v2, :cond_3

    .line 234
    .line 235
    const/16 v24, 0x0

    .line 236
    .line 237
    goto :goto_1

    .line 238
    :cond_3
    move/from16 v24, v2

    .line 239
    .line 240
    :goto_1
    const-string v2, "cooldownSeconds"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    .line 242
    move-object/from16 v29, v3

    .line 243
    .line 244
    move-object v6, v4

    .line 245
    const-wide/16 v3, 0x0

    .line 246
    .line 247
    :try_start_1
    invoke-virtual {v8, v2, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 248
    .line 249
    .line 250
    move-result-wide v25

    .line 251
    cmp-long v2, v25, v3

    .line 252
    .line 253
    if-gez v2, :cond_4

    .line 254
    .line 255
    move-wide/from16 v25, v3

    .line 256
    .line 257
    :cond_4
    const-string v2, "replyAsQuote"

    .line 258
    .line 259
    const/4 v3, 0x0

    .line 260
    invoke-virtual {v8, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 261
    .line 262
    .line 263
    move-result v27

    .line 264
    const-string v2, "steps"

    .line 265
    .line 266
    invoke-virtual {v8, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {v2}, Lr9/e0;->V(Ljava/lang/String;)Ljava/util/List;

    .line 271
    .line 272
    .line 273
    move-result-object v28

    .line 274
    new-instance v8, Lx8/b;

    .line 275
    .line 276
    invoke-direct/range {v8 .. v28}, Lx8/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IILjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;IILjava/lang/String;Ljava/lang/String;IJZLjava/util/List;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0, v8}, Luf/c;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 280
    .line 281
    .line 282
    goto :goto_2

    .line 283
    :catchall_1
    move-exception v0

    .line 284
    goto :goto_3

    .line 285
    :cond_5
    move-object/from16 v29, v3

    .line 286
    .line 287
    move v3, v6

    .line 288
    move-object v6, v4

    .line 289
    :goto_2
    add-int/lit8 v7, v7, 0x1

    .line 290
    .line 291
    move-object/from16 v2, p0

    .line 292
    .line 293
    move-object v4, v6

    .line 294
    move v6, v3

    .line 295
    move-object/from16 v3, v29

    .line 296
    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :goto_3
    new-instance v1, Lsf/f;

    .line 300
    .line 301
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 302
    .line 303
    .line 304
    move-object v0, v1

    .line 305
    :goto_4
    nop

    .line 306
    instance-of v1, v0, Lsf/f;

    .line 307
    .line 308
    if-eqz v1, :cond_6

    .line 309
    .line 310
    move-object v4, v6

    .line 311
    goto :goto_5

    .line 312
    :cond_6
    move-object v4, v0

    .line 313
    :goto_5
    check-cast v4, Ljava/util/List;

    .line 314
    .line 315
    return-object v4
.end method

.method public final m(Lx8/t;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lx8/r;->a:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    iget-object v1, p1, Lx8/t;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const-string v1, "wss://api.tenclass.net/xiaozhi/v1/"

    .line 28
    .line 29
    :cond_0
    const-string v2, "xiaozhi_serve_url"

    .line 30
    .line 31
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    iget-object v1, p1, Lx8/t;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    const-string v1, "https://api.tenclass.net/xiaozhi/ota/"

    .line 54
    .line 55
    :cond_1
    const-string v2, "xiaozhi_ota_url"

    .line 56
    .line 57
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v1, p1, Lx8/t;->c:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    const-string v1, "https://xiaozhi.me/console/agents"

    .line 80
    .line 81
    :cond_2
    const-string v2, "xiaozhi_console_url"

    .line 82
    .line 83
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    iget-object v1, p1, Lx8/t;->d:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    const-string v2, "xiaozhi_console_phone"

    .line 100
    .line 101
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    iget-object v1, p1, Lx8/t;->e:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    const-string v2, "xiaozhi_console_token"

    .line 118
    .line 119
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-eqz v0, :cond_4

    .line 124
    .line 125
    iget-object v1, p1, Lx8/t;->f:Ljava/lang/String;

    .line 126
    .line 127
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v2, "xiaozhi_console_agent_id"

    .line 136
    .line 137
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-eqz v0, :cond_4

    .line 142
    .line 143
    iget-object v1, p1, Lx8/t;->g:Ljava/lang/String;

    .line 144
    .line 145
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    const-string v2, "xiaozhi_console_model"

    .line 154
    .line 155
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    iget-object v1, p1, Lx8/t;->h:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const-string v2, "xiaozhi_voice_role"

    .line 172
    .line 173
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    if-eqz v0, :cond_4

    .line 178
    .line 179
    const-string v1, "xiaozhi_music_mcp"

    .line 180
    .line 181
    iget-boolean v2, p1, Lx8/t;->i:Z

    .line 182
    .line 183
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    if-eqz v0, :cond_4

    .line 188
    .line 189
    const-string v1, "xiaozhi_mcp_bridge_enable"

    .line 190
    .line 191
    iget-boolean v2, p1, Lx8/t;->j:Z

    .line 192
    .line 193
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    if-eqz v0, :cond_4

    .line 198
    .line 199
    iget-object v1, p1, Lx8/t;->k:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    const-string v2, "xiaozhi_mcp_endpoint_url"

    .line 210
    .line 211
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v0, :cond_4

    .line 216
    .line 217
    const-string v1, "xiaozhi_mcp_kugou_enable"

    .line 218
    .line 219
    iget-boolean v2, p1, Lx8/t;->l:Z

    .line 220
    .line 221
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    if-eqz v0, :cond_4

    .line 226
    .line 227
    iget-object v1, p1, Lx8/t;->m:Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    const-string v2, "xiaozhi_mcp_kugou_plugin_id"

    .line 238
    .line 239
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    if-eqz v0, :cond_4

    .line 244
    .line 245
    iget-object v1, p1, Lx8/t;->n:Ljava/lang/String;

    .line 246
    .line 247
    invoke-static {v1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    if-eqz v2, :cond_3

    .line 260
    .line 261
    const-string v1, "queryKugouMusic"

    .line 262
    .line 263
    :cond_3
    const-string v2, "xiaozhi_mcp_kugou_function"

    .line 264
    .line 265
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    if-eqz v0, :cond_4

    .line 270
    .line 271
    iget v1, p1, Lx8/t;->o:I

    .line 272
    .line 273
    const/4 v2, 0x1

    .line 274
    const/16 v3, 0x1e

    .line 275
    .line 276
    invoke-static {v1, v2, v3}, Lr9/e0;->r(III)I

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    const-string v2, "xiaozhi_mcp_ready_seconds"

    .line 281
    .line 282
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    if-eqz v0, :cond_4

    .line 287
    .line 288
    iget p1, p1, Lx8/t;->p:I

    .line 289
    .line 290
    const/16 v1, 0xa

    .line 291
    .line 292
    const/16 v2, 0x258

    .line 293
    .line 294
    invoke-static {p1, v1, v2}, Lr9/e0;->r(III)I

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    const-string v1, "xiaozhi_mcp_idle_seconds"

    .line 299
    .line 300
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    if-eqz p1, :cond_4

    .line 305
    .line 306
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 307
    .line 308
    .line 309
    :cond_4
    return-void
.end method

.method public final n(Ljava/lang/String;Ljava/util/List;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-static {p2}, Ltf/n;->e1(Ljava/lang/Iterable;)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lx8/u;

    .line 28
    .line 29
    invoke-virtual {v1}, Lx8/u;->b()Lx8/u;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    move-object v2, v1

    .line 57
    check-cast v2, Lx8/u;

    .line 58
    .line 59
    iget-object v2, v2, Lx8/u;->a:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v1, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    move-object v3, v2

    .line 96
    check-cast v3, Lx8/u;

    .line 97
    .line 98
    iget-object v3, v3, Lx8/u;->a:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_3

    .line 105
    .line 106
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-eqz p2, :cond_5

    .line 115
    .line 116
    invoke-virtual {p0}, Lx8/r;->j()Lx8/u;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    invoke-static {p2}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :cond_5
    new-instance p2, Lorg/json/JSONObject;

    .line 125
    .line 126
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    const/16 v3, 0x32

    .line 138
    .line 139
    const/4 v4, 0x0

    .line 140
    if-eqz v2, :cond_6

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    check-cast v2, Lx8/u;

    .line 147
    .line 148
    iget-object v5, v2, Lx8/u;->a:Ljava/lang/String;

    .line 149
    .line 150
    new-instance v6, Lorg/json/JSONObject;

    .line 151
    .line 152
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v7, "apiKey"

    .line 156
    .line 157
    iget-object v8, v2, Lx8/u;->b:Ljava/lang/String;

    .line 158
    .line 159
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    const-string v7, "apiUrl"

    .line 163
    .line 164
    iget-object v8, v2, Lx8/u;->c:Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    const-string v7, "apiPath"

    .line 170
    .line 171
    iget-object v8, v2, Lx8/u;->d:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 174
    .line 175
    .line 176
    const-string v7, "modelName"

    .line 177
    .line 178
    iget-object v8, v2, Lx8/u;->e:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 181
    .line 182
    .line 183
    const-string v7, "systemPrompt"

    .line 184
    .line 185
    iget-object v8, v2, Lx8/u;->f:Ljava/lang/String;

    .line 186
    .line 187
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 188
    .line 189
    .line 190
    iget v2, v2, Lx8/u;->g:I

    .line 191
    .line 192
    invoke-static {v2, v4, v3}, Lr9/e0;->r(III)I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    const-string v3, "contextLimit"

    .line 197
    .line 198
    invoke-virtual {v6, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    const/4 v5, 0x0

    .line 214
    if-eqz v2, :cond_8

    .line 215
    .line 216
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    move-object v6, v2

    .line 221
    check-cast v6, Lx8/u;

    .line 222
    .line 223
    iget-object v6, v6, Lx8/u;->a:Ljava/lang/String;

    .line 224
    .line 225
    invoke-static {v6, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v6

    .line 229
    if-eqz v6, :cond_7

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_8
    move-object v2, v5

    .line 233
    :goto_4
    check-cast v2, Lx8/u;

    .line 234
    .line 235
    if-eqz v2, :cond_9

    .line 236
    .line 237
    iget-object p1, v2, Lx8/u;->a:Ljava/lang/String;

    .line 238
    .line 239
    if-eqz p1, :cond_9

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_9
    invoke-static {v1}, Ltf/m;->t1(Ljava/util/List;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    check-cast p1, Lx8/u;

    .line 247
    .line 248
    iget-object p1, p1, Lx8/u;->a:Ljava/lang/String;

    .line 249
    .line 250
    :goto_5
    iget-object v0, p0, Lx8/r;->a:Landroid/content/SharedPreferences;

    .line 251
    .line 252
    if-eqz v0, :cond_a

    .line 253
    .line 254
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    if-eqz v2, :cond_a

    .line 259
    .line 260
    const-string v6, "zhilia_multi_configs_v1"

    .line 261
    .line 262
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    invoke-interface {v2, v6, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    if-eqz p2, :cond_a

    .line 271
    .line 272
    const-string v2, "zhilia_active_config_name_v1"

    .line 273
    .line 274
    invoke-interface {p2, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    if-eqz p2, :cond_a

    .line 279
    .line 280
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 281
    .line 282
    .line 283
    :cond_a
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    :cond_b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    if-eqz v1, :cond_c

    .line 292
    .line 293
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    move-object v2, v1

    .line 298
    check-cast v2, Lx8/u;

    .line 299
    .line 300
    iget-object v2, v2, Lx8/u;->a:Ljava/lang/String;

    .line 301
    .line 302
    invoke-static {v2, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-eqz v2, :cond_b

    .line 307
    .line 308
    move-object v5, v1

    .line 309
    :cond_c
    check-cast v5, Lx8/u;

    .line 310
    .line 311
    if-eqz v5, :cond_d

    .line 312
    .line 313
    if-eqz v0, :cond_d

    .line 314
    .line 315
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    if-eqz p1, :cond_d

    .line 320
    .line 321
    const-string p2, "ai_api_key"

    .line 322
    .line 323
    iget-object v0, v5, Lx8/u;->b:Ljava/lang/String;

    .line 324
    .line 325
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    if-eqz p1, :cond_d

    .line 330
    .line 331
    const-string p2, "ai_api_base"

    .line 332
    .line 333
    iget-object v0, v5, Lx8/u;->c:Ljava/lang/String;

    .line 334
    .line 335
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    if-eqz p1, :cond_d

    .line 340
    .line 341
    const-string p2, "ai_api_path"

    .line 342
    .line 343
    iget-object v0, v5, Lx8/u;->d:Ljava/lang/String;

    .line 344
    .line 345
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    if-eqz p1, :cond_d

    .line 350
    .line 351
    const-string p2, "ai_model"

    .line 352
    .line 353
    iget-object v0, v5, Lx8/u;->e:Ljava/lang/String;

    .line 354
    .line 355
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    if-eqz p1, :cond_d

    .line 360
    .line 361
    const-string p2, "ai_system_prompt"

    .line 362
    .line 363
    iget-object v0, v5, Lx8/u;->f:Ljava/lang/String;

    .line 364
    .line 365
    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    if-eqz p1, :cond_d

    .line 370
    .line 371
    iget p2, v5, Lx8/u;->g:I

    .line 372
    .line 373
    invoke-static {p2, v4, v3}, Lr9/e0;->r(III)I

    .line 374
    .line 375
    .line 376
    move-result p2

    .line 377
    const-string v0, "ai_context_limit"

    .line 378
    .line 379
    invoke-interface {p1, v0, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    if-eqz p1, :cond_d

    .line 384
    .line 385
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 386
    .line 387
    .line 388
    :cond_d
    return-void
.end method

.method public final o()Lx8/t;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lx8/t;

    .line 4
    .line 5
    const-string v2, "xiaozhi_serve_url"

    .line 6
    .line 7
    const-string v3, "wss://api.tenclass.net/xiaozhi/v1/"

    .line 8
    .line 9
    invoke-virtual {v0, v2, v3}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "xiaozhi_ota_url"

    .line 14
    .line 15
    const-string v4, "https://api.tenclass.net/xiaozhi/ota/"

    .line 16
    .line 17
    invoke-virtual {v0, v3, v4}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "xiaozhi_console_url"

    .line 22
    .line 23
    const-string v5, "https://xiaozhi.me/console/agents"

    .line 24
    .line 25
    invoke-virtual {v0, v4, v5}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "xiaozhi_console_phone"

    .line 30
    .line 31
    const-string v6, ""

    .line 32
    .line 33
    invoke-virtual {v0, v5, v6}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v7, "xiaozhi_console_token"

    .line 38
    .line 39
    invoke-virtual {v0, v7, v6}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    const-string v8, "xiaozhi_console_agent_id"

    .line 44
    .line 45
    invoke-virtual {v0, v8, v6}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    const-string v9, "xiaozhi_console_model"

    .line 50
    .line 51
    invoke-virtual {v0, v9, v6}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    const-string v10, "xiaozhi_voice_role"

    .line 56
    .line 57
    invoke-virtual {v0, v10, v6}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    const-string v11, "xiaozhi_music_mcp"

    .line 62
    .line 63
    invoke-virtual {v0, v11}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    const-string v12, "xiaozhi_mcp_bridge_enable"

    .line 68
    .line 69
    invoke-virtual {v0, v12}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    const-string v13, "xiaozhi_mcp_endpoint_url"

    .line 74
    .line 75
    invoke-virtual {v0, v13, v6}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const-string v13, "xiaozhi_mcp_kugou_enable"

    .line 80
    .line 81
    invoke-virtual {v0, v13}, Lx8/r;->e(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    const-string v14, "xiaozhi_mcp_kugou_plugin_id"

    .line 86
    .line 87
    const-string v15, "QQ\u70b9\u6b4c"

    .line 88
    .line 89
    invoke-virtual {v0, v14, v15}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v14

    .line 93
    const-string v15, "xiaozhi_mcp_kugou_function"

    .line 94
    .line 95
    move-object/from16 v16, v1

    .line 96
    .line 97
    const-string v1, "queryKugouMusic"

    .line 98
    .line 99
    invoke-virtual {v0, v15, v1}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v15

    .line 103
    const-string v1, "xiaozhi_mcp_ready_seconds"

    .line 104
    .line 105
    move-object/from16 v17, v2

    .line 106
    .line 107
    const/4 v2, 0x5

    .line 108
    invoke-virtual {v0, v1, v2}, Lx8/r;->f(Ljava/lang/String;I)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    const-string v2, "xiaozhi_mcp_idle_seconds"

    .line 113
    .line 114
    move/from16 v18, v1

    .line 115
    .line 116
    const/16 v1, 0x5a

    .line 117
    .line 118
    invoke-virtual {v0, v2, v1}, Lx8/r;->f(Ljava/lang/String;I)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    move v2, v12

    .line 123
    move-object v12, v6

    .line 124
    move-object v6, v7

    .line 125
    move-object v7, v8

    .line 126
    move-object v8, v9

    .line 127
    move-object v9, v10

    .line 128
    move v10, v11

    .line 129
    move v11, v2

    .line 130
    move-object/from16 v2, v17

    .line 131
    .line 132
    move/from16 v17, v1

    .line 133
    .line 134
    move-object/from16 v1, v16

    .line 135
    .line 136
    move/from16 v16, v18

    .line 137
    .line 138
    invoke-direct/range {v1 .. v17}, Lx8/t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;II)V

    .line 139
    .line 140
    .line 141
    move-object/from16 v16, v1

    .line 142
    .line 143
    return-object v16
.end method

.method public final p()Ljava/util/List;
    .locals 19

    .line 1
    const-string v0, "deepseek-ai/DeepSeek-V3"

    .line 2
    .line 3
    const-string v1, "/chat/completions"

    .line 4
    .line 5
    const-string v2, "https://api.siliconflow.cn/v1"

    .line 6
    .line 7
    sget-object v3, Ltf/t;->g:Ltf/t;

    .line 8
    .line 9
    const-string v4, "zhilia_multi_configs_v1"

    .line 10
    .line 11
    const-string v5, ""

    .line 12
    .line 13
    move-object/from16 v6, p0

    .line 14
    .line 15
    invoke-virtual {v6, v4, v5}, Lx8/r;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    :try_start_0
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    if-eqz v7, :cond_0

    .line 24
    .line 25
    move-object v0, v3

    .line 26
    goto/16 :goto_6

    .line 27
    .line 28
    :cond_0
    new-instance v7, Lorg/json/JSONObject;

    .line 29
    .line 30
    invoke-direct {v7, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, La/a;->E()Luf/c;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v7}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    if-eqz v9, :cond_5

    .line 49
    .line 50
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    move-object v11, v9

    .line 55
    check-cast v11, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v7, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    if-eqz v9, :cond_4

    .line 62
    .line 63
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const-string v10, "apiKey"

    .line 67
    .line 68
    invoke-virtual {v9, v10, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const-string v10, "apiUrl"

    .line 76
    .line 77
    invoke-virtual {v9, v10, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    if-eqz v13, :cond_1

    .line 86
    .line 87
    move-object v13, v2

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    move-object v13, v10

    .line 90
    :goto_1
    const-string v10, "apiPath"

    .line 91
    .line 92
    invoke-virtual {v9, v10, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    if-eqz v14, :cond_2

    .line 101
    .line 102
    move-object v14, v1

    .line 103
    goto :goto_2

    .line 104
    :cond_2
    move-object v14, v10

    .line 105
    :goto_2
    const-string v10, "modelName"

    .line 106
    .line 107
    invoke-virtual {v9, v10, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    invoke-static {v10}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v15

    .line 115
    if-eqz v15, :cond_3

    .line 116
    .line 117
    move-object v15, v0

    .line 118
    goto :goto_3

    .line 119
    :cond_3
    move-object v15, v10

    .line 120
    :goto_3
    const-string v10, "systemPrompt"

    .line 121
    .line 122
    move-object/from16 v18, v0

    .line 123
    .line 124
    const-string v0, "\u4f60\u662f\u4e00\u4e2a\u7b80\u6d01\u3001\u6709\u5e2e\u52a9\u7684\u804a\u5929\u52a9\u624b"

    .line 125
    .line 126
    invoke-virtual {v9, v10, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v16

    .line 130
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    const-string v0, "contextLimit"

    .line 134
    .line 135
    const/16 v10, 0xa

    .line 136
    .line 137
    invoke-virtual {v9, v0, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    const/4 v9, 0x0

    .line 142
    const/16 v10, 0x32

    .line 143
    .line 144
    invoke-static {v0, v9, v10}, Lr9/e0;->r(III)I

    .line 145
    .line 146
    .line 147
    move-result v17

    .line 148
    new-instance v10, Lx8/u;

    .line 149
    .line 150
    invoke-direct/range {v10 .. v17}, Lx8/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v10}, Luf/c;->add(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    goto :goto_4

    .line 157
    :catchall_0
    move-exception v0

    .line 158
    goto :goto_5

    .line 159
    :cond_4
    move-object/from16 v18, v0

    .line 160
    .line 161
    :goto_4
    move-object/from16 v0, v18

    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_5
    invoke-static {v4}, La/a;->t(Luf/c;)Luf/c;

    .line 165
    .line 166
    .line 167
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    goto :goto_6

    .line 169
    :goto_5
    new-instance v1, Lsf/f;

    .line 170
    .line 171
    invoke-direct {v1, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    move-object v0, v1

    .line 175
    :goto_6
    nop

    .line 176
    instance-of v1, v0, Lsf/f;

    .line 177
    .line 178
    if-eqz v1, :cond_6

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_6
    move-object v3, v0

    .line 182
    :goto_7
    check-cast v3, Ljava/util/List;

    .line 183
    .line 184
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-eqz v0, :cond_7

    .line 189
    .line 190
    invoke-virtual {v6}, Lx8/r;->j()Lx8/u;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    :cond_7
    return-object v3
.end method
