.class public final Lp/f;
.super Lfun/box001/shared/hook/XHooker;
.source "SourceFile"


# static fields
.field private static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field private static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field private static final c:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lp/f;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lp/f;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lp/f;->c:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method static a(Lo/a;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const/4 v0, 0x1

    new-array v10, v0, [Ljava/lang/Object;

    new-array v11, v0, [Z

    new-array v12, v0, [Ljava/lang/Throwable;

    sget-object v0, Lp/f;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v4, v1, Lo/a;->a:Ljava/lang/reflect/Member;

    invoke-virtual {v0, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    const-string v13, "[FunBox]"

    iget-object v14, v1, Lo/a;->a:Ljava/lang/reflect/Member;

    if-eqz v4, :cond_0

    invoke-virtual {v0, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/util/ArrayList;

    if-eqz v15, :cond_0

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfun/box001/shared/hook/XHooker$HookCallback;

    new-instance v9, Lp/d;

    move-object v4, v9

    move-object v5, v11

    move-object v6, v10

    move-object v7, v15

    move-object v8, v0

    move-object/from16 v17, v15

    move-object v15, v9

    move-object v9, v12

    invoke-direct/range {v4 .. v9}, Lp/d;-><init>([Z[Ljava/lang/Object;Ljava/util/ArrayList;Lfun/box001/shared/hook/XHooker$HookCallback;[Ljava/lang/Throwable;)V

    iput-object v3, v15, Lfun/box001/shared/hook/XHooker$HookParam;->args:[Ljava/lang/Object;

    iput-object v14, v15, Lfun/box001/shared/hook/XHooker$HookParam;->method:Ljava/lang/reflect/Member;

    iput-object v2, v15, Lfun/box001/shared/hook/XHooker$HookParam;->obj:Ljava/lang/Object;

    :try_start_0
    invoke-interface {v0, v15}, Lfun/box001/shared/hook/XHooker$HookCallback;->onInvoke(Lfun/box001/shared/hook/XHooker$HookParam;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v4, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfun/box001/shared/hook/XHooker;->log(Ljava/lang/Object;)V

    :goto_1
    move-object/from16 v15, v17

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    aget-boolean v0, v11, v4

    if-nez v0, :cond_1

    :try_start_1
    sget-object v0, Lcom/shooker/SHooker;->a:Ljava/util/HashMap;

    iget-object v0, v1, Lo/a;->b:Ljava/lang/reflect/Method;

    invoke-virtual {v0, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, v10, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    aput-object v0, v12, v4

    :cond_1
    :goto_2
    sget-object v0, Lp/f;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, v14}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfun/box001/shared/hook/XHooker$HookCallback;

    new-instance v6, Lp/e;

    invoke-direct {v6, v10, v1, v0, v12}, Lp/e;-><init>([Ljava/lang/Object;Ljava/util/ArrayList;Lfun/box001/shared/hook/XHooker$HookCallback;[Ljava/lang/Throwable;)V

    iput-object v3, v6, Lfun/box001/shared/hook/XHooker$HookParam;->args:[Ljava/lang/Object;

    iput-object v14, v6, Lfun/box001/shared/hook/XHooker$HookParam;->method:Ljava/lang/reflect/Member;

    iput-object v2, v6, Lfun/box001/shared/hook/XHooker$HookParam;->obj:Ljava/lang/Object;

    :try_start_2
    invoke-interface {v0, v6}, Lfun/box001/shared/hook/XHooker$HookCallback;->onInvoke(Lfun/box001/shared/hook/XHooker$HookParam;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v6, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lfun/box001/shared/hook/XHooker;->log(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    aget-object v0, v12, v4

    if-nez v0, :cond_3

    aget-object v0, v10, v4

    return-object v0

    :cond_3
    throw v0
.end method


# virtual methods
.method protected final decompile0(Ljava/lang/reflect/Member;)V
    .locals 3

    sget-object v0, Lcom/shooker/SHooker;->a:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/lang/reflect/Member;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/shooker/SHooker;->_deoptimize(Ljava/lang/reflect/Member;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot deoptimize abstract methods: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final hookAfterImpl(Ljava/lang/reflect/Member;Lfun/box001/shared/hook/XHooker$HookCallback;)V
    .locals 3

    sget-object v0, Lp/f;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lp/c;

    invoke-direct {v2}, Lp/c;-><init>()V

    invoke-static {p1, v2}, Lcom/shooker/SHooker;->a(Ljava/lang/reflect/Member;La/b;)Lo/a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v0, Lp/f;->b:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Lp/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lp/a;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final hookBeforeImpl(Ljava/lang/reflect/Member;Lfun/box001/shared/hook/XHooker$HookCallback;)V
    .locals 3

    sget-object v0, Lp/f;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lp/b;

    invoke-direct {v2}, Lp/b;-><init>()V

    invoke-static {p1, v2}, Lcom/shooker/SHooker;->a(Ljava/lang/reflect/Member;La/b;)Lo/a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v0, Lp/f;->a:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Lp/a;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Lp/a;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final invokeImpl(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lp/f;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/a;

    sget-object v0, Lcom/shooker/SHooker;->a:Ljava/util/HashMap;

    iget-object p1, p1, Lo/a;->b:Ljava/lang/reflect/Method;

    invoke-virtual {p1, p2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/reflect/Method;

    invoke-virtual {p1, p2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method protected final logImpl(Ljava/lang/String;)V
    .locals 1

    const-string v0, "[FunBox]"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
