.class public final LIc;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/util/List;

.field public final c:Lzw;

.field public final d:LXt;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;Lzw;LXt;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIc;->a:Ljava/lang/Class;

    iput-object p4, p0, LIc;->b:Ljava/util/List;

    iput-object p5, p0, LIc;->c:Lzw;

    iput-object p6, p0, LIc;->d:LXt;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "Failed DecodePath{"

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "->"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LIc;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(IILH5;Lxc;Lvt;)Lpw;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    iget-object v7, v1, LIc;->d:LXt;

    invoke-interface {v7}, LXt;->c()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/util/List;

    const-string v2, "Argument must not be null"

    invoke-static {v2, v6}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    move/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v2, p4

    move-object/from16 v5, p5

    :try_start_0
    invoke-virtual/range {v1 .. v6}, LIc;->b(Lxc;IILvt;Ljava/util/List;)Lpw;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v7, v6}, LXt;->a(Ljava/lang/Object;)Z

    iget-object v3, v0, LH5;->b:Ljava/lang/Object;

    check-cast v3, LHc;

    iget v0, v0, LH5;->a:I

    iget-object v4, v3, LHc;->a:LFc;

    invoke-interface {v2}, Lpw;->get()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    const/4 v5, 0x4

    const/4 v6, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v4, v13}, LFc;->e(Ljava/lang/Class;)LCB;

    move-result-object v5

    iget-object v7, v3, LHc;->h:LRj;

    iget v8, v3, LHc;->l:I

    iget v9, v3, LHc;->m:I

    invoke-interface {v5, v7, v2, v8, v9}, LCB;->a(Landroid/content/Context;Lpw;II)Lpw;

    move-result-object v7

    move-object v12, v5

    move-object v5, v7

    goto :goto_0

    :cond_0
    move-object v5, v2

    move-object v12, v6

    :goto_0
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-interface {v2}, Lpw;->e()V

    :cond_1
    iget-object v2, v4, LFc;->c:LRj;

    invoke-virtual {v2}, LRj;->a()LPv;

    move-result-object v2

    iget-object v2, v2, LPv;->d:LRf;

    invoke-interface {v5}, Lpw;->d()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v2, v7}, LRf;->a(Ljava/lang/Class;)Lvw;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, v4, LFc;->c:LRj;

    invoke-virtual {v2}, LRj;->a()LPv;

    move-result-object v2

    iget-object v2, v2, LPv;->d:LRf;

    invoke-interface {v5}, Lpw;->d()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v2, v6}, LRf;->a(Ljava/lang/Class;)Lvw;

    move-result-object v6

    if-eqz v6, :cond_2

    iget-object v2, v3, LHc;->o:Lvt;

    invoke-interface {v6, v2}, Lvw;->f(Lvt;)I

    move-result v2

    :goto_1
    move-object v15, v6

    goto :goto_2

    :cond_2
    new-instance v0, LNv;

    invoke-interface {v5}, Lpw;->d()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v2}, LNv;-><init>(Ljava/lang/Class;)V

    throw v0

    :cond_3
    const/4 v2, 0x3

    goto :goto_1

    :goto_2
    iget-object v6, v3, LHc;->v:LSm;

    invoke-virtual {v4}, LFc;->b()Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x0

    move v10, v9

    :goto_3
    const/4 v11, 0x1

    if-ge v10, v8, :cond_5

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LZr;

    iget-object v14, v14, LZr;->a:LSm;

    invoke-interface {v14, v6}, LSm;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    move v6, v11

    goto :goto_4

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_5
    move v6, v9

    :goto_4
    iget-object v7, v3, LHc;->n:LVd;

    iget v7, v7, LVd;->a:I

    packed-switch v7, :pswitch_data_0

    const/4 v7, 0x1

    if-nez v6, :cond_6

    const/4 v6, 0x3

    if-eq v0, v6, :cond_7

    :cond_6
    if-ne v0, v7, :cond_8

    :cond_7
    const/4 v0, 0x2

    if-ne v2, v0, :cond_8

    goto :goto_6

    :cond_8
    :pswitch_0
    const/4 v7, 0x0

    goto :goto_6

    :pswitch_1
    const/4 v6, 0x4

    if-eq v0, v6, :cond_9

    const/4 v6, 0x5

    if-eq v0, v6, :cond_9

    const/4 v0, 0x1

    :goto_5
    move v7, v0

    goto :goto_6

    :cond_9
    const/4 v0, 0x0

    goto :goto_5

    :goto_6
    if-eqz v7, :cond_10

    if-eqz v15, :cond_f

    invoke-static {v2}, LEy;->v(I)I

    move-result v0

    if-eqz v0, :cond_e

    if-ne v0, v11, :cond_a

    new-instance v6, Lrw;

    iget-object v0, v4, LFc;->c:LRj;

    iget-object v7, v0, LRj;->a:Lzp;

    iget-object v8, v3, LHc;->v:LSm;

    move v0, v9

    iget-object v9, v3, LHc;->i:LSm;

    iget v10, v3, LHc;->l:I

    move v2, v11

    iget v11, v3, LHc;->m:I

    iget-object v14, v3, LHc;->o:Lvt;

    move v4, v2

    invoke-direct/range {v6 .. v14}, Lrw;-><init>(Lzp;LSm;LSm;IILCB;Ljava/lang/Class;Lvt;)V

    goto :goto_8

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v3, 0x1

    if-eq v2, v3, :cond_d

    const/4 v3, 0x2

    if-eq v2, v3, :cond_c

    const/4 v3, 0x3

    if-eq v2, v3, :cond_b

    const-string v2, "null"

    goto :goto_7

    :cond_b
    const-string v2, "NONE"

    goto :goto_7

    :cond_c
    const-string v2, "TRANSFORMED"

    goto :goto_7

    :cond_d
    const-string v2, "SOURCE"

    :goto_7
    const-string v3, "Unknown strategy: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move v0, v9

    move v4, v11

    new-instance v6, Lrc;

    iget-object v2, v3, LHc;->v:LSm;

    iget-object v7, v3, LHc;->i:LSm;

    invoke-direct {v6, v2, v7}, Lrc;-><init>(LSm;LSm;)V

    :goto_8
    sget-object v2, Lgp;->e:Lw4;

    invoke-virtual {v2}, Lw4;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lgp;

    iput-boolean v0, v2, Lgp;->d:Z

    iput-boolean v4, v2, Lgp;->c:Z

    iput-object v5, v2, Lgp;->b:Lpw;

    iget-object v0, v3, LHc;->f:Lw4;

    iput-object v6, v0, Lw4;->b:Ljava/lang/Object;

    iput-object v15, v0, Lw4;->c:Ljava/lang/Object;

    iput-object v2, v0, Lw4;->d:Ljava/lang/Object;

    move-object v5, v2

    goto :goto_9

    :cond_f
    new-instance v0, LNv;

    invoke-interface {v5}, Lpw;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v2}, LNv;-><init>(Ljava/lang/Class;)V

    throw v0

    :cond_10
    :goto_9
    iget-object v0, v1, LIc;->c:Lzw;

    move-object/from16 v2, p5

    invoke-interface {v0, v5, v2}, Lzw;->i(Lpw;Lvt;)Lpw;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {v7, v6}, LXt;->a(Ljava/lang/Object;)Z

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lxc;IILvt;Ljava/util/List;)Lpw;
    .locals 8

    iget-object v0, p0, LIc;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lsw;

    :try_start_0
    invoke-interface {p1}, Lxc;->j()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5, p4}, Lsw;->b(Ljava/lang/Object;Lvt;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p1}, Lxc;->j()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5, p2, p3, p4}, Lsw;->a(Ljava/lang/Object;IILvt;)Lpw;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v5

    goto :goto_1

    :catch_1
    move-exception v5

    goto :goto_1

    :catch_2
    move-exception v5

    :goto_1
    const-string v6, "DecodePath"

    const/4 v7, 0x2

    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {v4}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_0
    invoke-interface {p5, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_3
    if-eqz v2, :cond_4

    return-object v2

    :cond_4
    new-instance p1, LTj;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object p3, p0, LIc;->e:Ljava/lang/String;

    invoke-direct {p1, p3, p2}, LTj;-><init>(Ljava/lang/String;Ljava/util/List;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DecodePath{ dataClass="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LIc;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", decoders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LIc;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcoder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LIc;->c:Lzw;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
