.class public final La/jg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/jg;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/jg;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, La/jg;->a:La/jg;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)La/kg;
    .locals 7

    invoke-static {p0}, La/jg;->b(Ljava/lang/String;)La/lb;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, La/lb;->b()La/f5;

    move-result-object v0

    iget-object v0, v0, La/f5;->b:Ljava/lang/String;

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-static {p0}, La/jg;->h(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    if-eqz p1, :cond_1

    sget-object v0, La/jg;->a:La/jg;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, La/jg;->h(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    :goto_2
    move-object v6, v0

    goto :goto_3

    :cond_1
    sget-object v0, La/Y5;->a:La/Y5;

    goto :goto_2

    :goto_3
    new-instance v1, La/kg;

    move-object v2, p0

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, La/kg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;)V

    return-object v1
.end method

.method public static b(Ljava/lang/String;)La/lb;
    .locals 7

    const-string v0, "java.lang.String"

    const/4 v1, 0x0

    const-string v2, "[b.ver]"

    const/4 v3, 0x4

    invoke-static {p0, v0, v1, v2, v3}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, La/lb;

    iget-object v6, v5, La/lb;->f:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-nez v6, :cond_0

    iget v5, v5, La/lb;->c:I

    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_0
    check-cast v4, La/lb;

    if-eqz v4, :cond_2

    return-object v4

    :cond_2
    const/16 v3, 0xe

    invoke-static {p0, v1, v1, v1, v3}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, La/lb;

    iget v6, v5, La/lb;->c:I

    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v6, v5, La/lb;->f:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-nez v6, :cond_3

    invoke-virtual {v5}, La/lb;->b()La/f5;

    move-result-object v6

    iget-object v6, v6, La/f5;->d:Ljava/lang/String;

    invoke-static {v6, v0}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v5, v5, La/lb;->h:La/Me;

    invoke-virtual {v5}, La/Me;->a()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_4
    move-object v4, v1

    :goto_1
    check-cast v4, La/lb;

    if-eqz v4, :cond_5

    return-object v4

    :cond_5
    const-string v0, "[VersionLocator] V2 FAILED: format method not located in "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, La/x1;->e([Ljava/lang/Object;)V

    return-object v1
.end method

.method public static c(Ljava/lang/String;)Z
    .locals 3

    const-string v0, "java.lang.String"

    const/4 v1, 0x0

    const/16 v2, 0xc

    invoke-static {p0, v0, v1, v1, v2}, La/w1;->x(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/lb;

    iget-object v1, v0, La/lb;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    iget v0, v0, La/lb;->c:I

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static d()La/kg;
    .locals 5

    sget-object v0, La/a5;->a:Ljava/lang/Object;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v2, "version_info_v1"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    :cond_1
    :goto_0
    move-object v2, v1

    :goto_1
    if-nez v2, :cond_2

    :goto_2
    move-object v3, v1

    goto :goto_3

    :cond_2
    const-string v0, "versionFormatClass"

    const-string v3, ""

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "baselineInfoClass"

    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v0}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v2}, La/i9;->b(Ljava/lang/Object;)V

    invoke-static {v2}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_2

    :cond_3
    new-instance v3, La/a5$k;

    invoke-static {v2}, La/i9;->b(Ljava/lang/Object;)V

    invoke-direct {v3, v0, v2}, La/a5$k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    if-nez v3, :cond_4

    :goto_4
    move-object v0, v1

    goto :goto_6

    :cond_4
    iget-object v0, v3, La/a5$k;->a:Ljava/lang/String;

    invoke-static {v0}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_5
    iget-object v2, v3, La/a5$k;->b:Ljava/lang/String;

    invoke-static {v2}, La/Be;->P(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_5

    :cond_6
    move-object v2, v1

    :goto_5
    invoke-static {v0, v2}, La/jg;->a(Ljava/lang/String;Ljava/lang/String;)La/kg;

    move-result-object v0

    :goto_6
    if-eqz v0, :cond_7

    return-object v0

    :cond_7
    sget-object v0, La/w1;->l:Lorg/luckypray/dexkit/DexKitBridge;

    if-eqz v0, :cond_8

    invoke-static {}, La/jg;->e()La/kg;

    move-result-object v0

    return-object v0

    :cond_8
    return-object v1
.end method

.method public static e()La/kg;
    .locals 2

    :try_start_0
    invoke-static {}, La/jg;->f()La/kg;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    move-result-object v0

    :goto_0
    invoke-static {v0}, La/wd;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "[VersionLocator] locateNow failed"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_1
    check-cast v0, La/kg;

    if-nez v0, :cond_1

    const-string v1, "[VersionLocator] locate FAILED (no fallback)"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->e([Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method

.method public static f()La/kg;
    .locals 10

    const-string v0, "[b.ver]"

    const-string v1, "[p.rev]"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, La/w1;->s([Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    sget-object v4, La/jg;->a:La/jg;

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, La/jg;->c(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v5

    :goto_0
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-static {v0, v5}, La/w1;->r(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v5}, La/w1;->r(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    invoke-interface {v1, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, La/jg;->c(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    :cond_4
    move-object v3, v5

    :goto_1
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v0, v5}, La/w1;->r(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3}, La/jg;->h(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x5

    if-lt v6, v7, :cond_6

    invoke-static {v3}, La/jg;->c(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    invoke-static {v1}, La/t3;->n0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v0, "[VersionLocator] V1 FAILED: z class not located"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    move-object v3, v5

    :goto_3
    if-nez v3, :cond_9

    goto :goto_4

    :cond_9
    invoke-static {v3}, La/jg;->b(Ljava/lang/String;)La/lb;

    move-result-object v0

    if-nez v0, :cond_a

    :goto_4
    return-object v5

    :cond_a
    iget-object v1, v0, La/lb;->i:La/Me;

    invoke-virtual {v1}, La/Me;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/Yf;

    iget-object v6, v6, La/Yf;->a:La/r6;

    invoke-virtual {v6}, La/r6;->b()La/Y4;

    move-result-object v6

    iget-object v6, v6, La/Y4;->a:Ljava/lang/String;

    const/16 v7, 0x24

    invoke-static {v6, v7}, La/Be;->J(Ljava/lang/String;C)Z

    move-result v7

    if-nez v7, :cond_c

    goto :goto_6

    :cond_c
    move-object v6, v5

    :goto_6
    if-eqz v6, :cond_b

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_d
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v1}, La/t3;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0}, La/lb;->b()La/f5;

    move-result-object v8

    iget-object v8, v8, La/f5;->a:Ljava/lang/String;

    invoke-static {v7, v8}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_f
    new-instance v1, La/Z4;

    const/4 v6, 0x3

    invoke-direct {v1, v6}, La/Z4;-><init>(I)V

    invoke-static {v2, v1}, La/t3;->r0(Ljava/util/ArrayList;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v6, 0x6

    if-eqz v2, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, La/jg;->g(Ljava/lang/String;)I

    move-result v7

    if-lt v7, v6, :cond_10

    const-string v0, "[VersionLocator] V3: mp0 class located via usingFields: "

    invoke-static {v0, v2}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    move-object v5, v2

    goto/16 :goto_a

    :cond_11
    invoke-virtual {v0}, La/lb;->b()La/f5;

    move-result-object v1

    iget-object v1, v1, La/f5;->a:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v1, v2}, La/Be;->U(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, La/w1;->q(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_12
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v0}, La/lb;->b()La/f5;

    move-result-object v9

    iget-object v9, v9, La/f5;->a:Ljava/lang/String;

    invoke-static {v8, v9}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, La/jg;->g(Ljava/lang/String;)I

    move-result v8

    if-lt v8, v6, :cond_12

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_13
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_14

    move-object v1, v5

    goto :goto_9

    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_9

    :cond_15
    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/jg;->g(Ljava/lang/String;)I

    move-result v2

    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, La/jg;->g(Ljava/lang/String;)I

    move-result v6

    if-ge v2, v6, :cond_17

    move-object v1, v4

    move v2, v6

    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_16

    :goto_9
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_18

    const-string v0, "[VersionLocator] V3\': mp0 class located via package structure scan: "

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    move-object v5, v1

    goto :goto_a

    :cond_18
    const-string v0, "[VersionLocator] V3 FAILED: mp0 class not located (baseline falls back to composite parsing)"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->e([Ljava/lang/Object;)V

    :goto_a
    invoke-static {v3, v5}, La/jg;->a(Ljava/lang/String;Ljava/lang/String;)La/kg;

    move-result-object v0

    return-object v0
.end method

.method public static g(Ljava/lang/String;)I
    .locals 0

    invoke-static {p0}, La/jg;->h(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method

.method public static h(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v2, "java.lang.String"

    invoke-static {p0, v2, v0, v1}, La/w1;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, La/p3;->g0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/r6;

    invoke-virtual {v1}, La/r6;->b()La/Y4;

    move-result-object v1

    iget-object v1, v1, La/Y4;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
