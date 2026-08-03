.class public final Lio/github/cherrywechat/lua/loader/LoadedScript;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final author:Ljava/lang/String;

.field private final autoRelease:Z

.field private final description:Ljava/lang/String;

.field private final filePath:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private lastError:Ljava/lang/String;

.field private lastResult:Ljava/lang/String;

.field private final loadTime:J

.field private final luaContext:Lio/github/cherrywechat/lua/LuaContext;

.field private final name:Ljava/lang/String;

.field private final scriptDir:Ljava/lang/String;

.field private state:Lio/github/cherrywechat/lua/loader/ScriptState;

.field private final version:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/cherrywechat/lua/LuaContext;ZLio/github/cherrywechat/lua/loader/ScriptState;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 2

    const-wide v0, -0x12ac1fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12ac4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12ac9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12ad0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12ad8fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12ae4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12aedfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12af7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12a82fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->name:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->author:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->version:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->description:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->filePath:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->scriptDir:Ljava/lang/String;

    .line 9
    iput-object p8, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->luaContext:Lio/github/cherrywechat/lua/LuaContext;

    .line 10
    iput-boolean p9, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->autoRelease:Z

    .line 11
    iput-object p10, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->state:Lio/github/cherrywechat/lua/loader/ScriptState;

    .line 12
    iput-object p11, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastResult:Ljava/lang/String;

    .line 13
    iput-object p12, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastError:Ljava/lang/String;

    move-wide p1, p13

    .line 14
    iput-wide p1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->loadTime:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/cherrywechat/lua/LuaContext;ZLio/github/cherrywechat/lua/loader/ScriptState;Ljava/lang/String;Ljava/lang/String;JILOc;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit16 v1, v0, 0x400

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v14, v2

    goto :goto_0

    :cond_0
    move-object/from16 v14, p11

    :goto_0
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_1

    move-object v15, v2

    goto :goto_1

    :cond_1
    move-object/from16 v15, p12

    :goto_1
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_2

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    move-wide/from16 v16, v0

    :goto_2
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    move/from16 v12, p9

    move-object/from16 v13, p10

    goto :goto_3

    :cond_2
    move-wide/from16 v16, p13

    goto :goto_2

    .line 16
    :goto_3
    invoke-direct/range {v3 .. v17}, Lio/github/cherrywechat/lua/loader/LoadedScript;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/cherrywechat/lua/LuaContext;ZLio/github/cherrywechat/lua/loader/ScriptState;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public static synthetic copy$default(Lio/github/cherrywechat/lua/loader/LoadedScript;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/cherrywechat/lua/LuaContext;ZLio/github/cherrywechat/lua/loader/ScriptState;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)Lio/github/cherrywechat/lua/loader/LoadedScript;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p15

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->name:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->author:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->version:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->description:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->filePath:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->scriptDir:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->luaContext:Lio/github/cherrywechat/lua/LuaContext;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->autoRelease:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->state:Lio/github/cherrywechat/lua/loader/ScriptState;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastResult:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastError:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v1, v1, 0x1000

    if-eqz v1, :cond_c

    iget-wide v14, v0, Lio/github/cherrywechat/lua/loader/LoadedScript;->loadTime:J

    move-wide/from16 p14, v14

    :goto_c
    move-object/from16 p1, v0

    move-object/from16 p2, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    goto :goto_d

    :cond_c
    move-wide/from16 p14, p13

    goto :goto_c

    :goto_d
    invoke-virtual/range {p1 .. p15}, Lio/github/cherrywechat/lua/loader/LoadedScript;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/cherrywechat/lua/LuaContext;ZLio/github/cherrywechat/lua/loader/ScriptState;Ljava/lang/String;Ljava/lang/String;J)Lio/github/cherrywechat/lua/loader/LoadedScript;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Lio/github/cherrywechat/lua/loader/ScriptState;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->state:Lio/github/cherrywechat/lua/loader/ScriptState;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastResult:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastError:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->loadTime:J

    return-wide v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->scriptDir:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lio/github/cherrywechat/lua/LuaContext;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->luaContext:Lio/github/cherrywechat/lua/LuaContext;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->autoRelease:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/cherrywechat/lua/LuaContext;ZLio/github/cherrywechat/lua/loader/ScriptState;Ljava/lang/String;Ljava/lang/String;J)Lio/github/cherrywechat/lua/loader/LoadedScript;
    .locals 17

    const-wide v0, -0x12a90fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12a93fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12a98fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12a9ffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12aa7fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12ab3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12abcfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12946fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x12951fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v2, Lio/github/cherrywechat/lua/loader/LoadedScript;

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-wide/from16 v15, p13

    invoke-direct/range {v2 .. v16}, Lio/github/cherrywechat/lua/loader/LoadedScript;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/github/cherrywechat/lua/LuaContext;ZLio/github/cherrywechat/lua/loader/ScriptState;Ljava/lang/String;Ljava/lang/String;J)V

    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/github/cherrywechat/lua/loader/LoadedScript;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->id:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->name:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->name:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->author:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->author:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->version:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->version:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->description:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->description:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->filePath:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->filePath:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->scriptDir:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->scriptDir:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->luaContext:Lio/github/cherrywechat/lua/LuaContext;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->luaContext:Lio/github/cherrywechat/lua/LuaContext;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->autoRelease:Z

    iget-boolean v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->autoRelease:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->state:Lio/github/cherrywechat/lua/loader/ScriptState;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->state:Lio/github/cherrywechat/lua/loader/ScriptState;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastResult:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastResult:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastError:Ljava/lang/String;

    iget-object v3, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastError:Ljava/lang/String;

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-wide v3, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->loadTime:J

    iget-wide v5, p1, Lio/github/cherrywechat/lua/loader/LoadedScript;->loadTime:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAuthor()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->author:Ljava/lang/String;

    return-object v0
.end method

.method public final getAutoRelease()Z
    .locals 1

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->autoRelease:Z

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastError()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastError:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastResult()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastResult:Ljava/lang/String;

    return-object v0
.end method

.method public final getLoadTime()J
    .locals 2

    iget-wide v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->loadTime:J

    return-wide v0
.end method

.method public final getLuaContext()Lio/github/cherrywechat/lua/LuaContext;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->luaContext:Lio/github/cherrywechat/lua/LuaContext;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getScriptDir()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->scriptDir:Ljava/lang/String;

    return-object v0
.end method

.method public final getState()Lio/github/cherrywechat/lua/loader/ScriptState;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->state:Lio/github/cherrywechat/lua/loader/ScriptState;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->name:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->author:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->version:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->description:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->filePath:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->scriptDir:Ljava/lang/String;

    invoke-static {v2, v0, v1}, Lph;->g(Ljava/lang/String;II)I

    move-result v0

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->luaContext:Lio/github/cherrywechat/lua/LuaContext;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->autoRelease:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->state:Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastResult:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastError:Ljava/lang/String;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-wide v0, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->loadTime:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final setLastError(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastError:Ljava/lang/String;

    return-void
.end method

.method public final setLastResult(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastResult:Ljava/lang/String;

    return-void
.end method

.method public final setState(Lio/github/cherrywechat/lua/loader/ScriptState;)V
    .locals 2

    const-wide v0, -0x12a88fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->state:Lio/github/cherrywechat/lua/loader/ScriptState;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v1, -0x12957fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->id:Ljava/lang/String;

    const-wide v2, -0x12968fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->name:Ljava/lang/String;

    const-wide v2, -0x12970fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->author:Ljava/lang/String;

    const-wide v2, -0x1297afffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->version:Ljava/lang/String;

    const-wide v2, -0x12905fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->description:Ljava/lang/String;

    const-wide v2, -0x12914fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->filePath:Ljava/lang/String;

    const-wide v2, -0x12920fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->scriptDir:Ljava/lang/String;

    const-wide v2, -0x1292dfffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->luaContext:Lio/github/cherrywechat/lua/LuaContext;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v1, -0x1293bfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->autoRelease:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-wide v1, -0x129cafffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->state:Lio/github/cherrywechat/lua/loader/ScriptState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-wide v1, -0x129d3fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastResult:Ljava/lang/String;

    const-wide v2, -0x129e1fffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-object v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->lastError:Ljava/lang/String;

    const-wide v2, -0x129eefffff835L

    invoke-static {v0, v1, v2, v3}, Lph;->n(Ljava/lang/StringBuilder;Ljava/lang/String;J)V

    iget-wide v1, p0, Lio/github/cherrywechat/lua/loader/LoadedScript;->loadTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
