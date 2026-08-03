.class public abstract Lparty/iroiro/luajava/AbstractLua;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/Lua;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lparty/iroiro/luajava/AbstractLua$LuaFunctionWrapper;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final EMPTY:[Ljava/lang/Object;

.field protected static final instances:Lparty/iroiro/luajava/LuaInstances;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/LuaInstances<",
            "Lparty/iroiro/luajava/AbstractLua;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final C:Lparty/iroiro/luajava/LuaNatives;

.field protected final L:J

.field protected volatile id:I

.field protected volatile loader:Lparty/iroiro/luajava/ExternalLoader;

.field protected final mainThread:Lparty/iroiro/luajava/AbstractLua;

.field protected final recordedReferences:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/Integer;",
            "Lparty/iroiro/luajava/cleaner/LuaReference<",
            "*>;>;"
        }
    .end annotation
.end field

.field protected final recyclableReferences:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Lparty/iroiro/luajava/cleaner/LuaReferable;",
            ">;"
        }
    .end annotation
.end field

.field protected volatile requireFunction:Lparty/iroiro/luajava/value/LuaValue;

.field protected final subThreads:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lparty/iroiro/luajava/Lua;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    sput-object v0, Lparty/iroiro/luajava/AbstractLua;->EMPTY:[Ljava/lang/Object;

    new-instance v0, Lparty/iroiro/luajava/LuaInstances;

    invoke-direct {v0}, Lparty/iroiro/luajava/LuaInstances;-><init>()V

    sput-object v0, Lparty/iroiro/luajava/AbstractLua;->instances:Lparty/iroiro/luajava/LuaInstances;

    return-void
.end method

.method public constructor <init>(Lparty/iroiro/luajava/LuaNatives;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    .line 3
    sget-object v0, Lparty/iroiro/luajava/AbstractLua;->instances:Lparty/iroiro/luajava/LuaInstances;

    invoke-virtual {v0, p0}, Lparty/iroiro/luajava/LuaInstances;->add(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lparty/iroiro/luajava/AbstractLua;->id:I

    .line 4
    iget v0, p0, Lparty/iroiro/luajava/AbstractLua;->id:I

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/LuaNatives;->luaL_newstate(I)J

    move-result-wide v0

    iput-wide v0, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    .line 5
    iput-object p0, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    .line 6
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lparty/iroiro/luajava/AbstractLua;->subThreads:Ljava/util/List;

    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lparty/iroiro/luajava/AbstractLua;->loader:Lparty/iroiro/luajava/ExternalLoader;

    .line 8
    iput-object p1, p0, Lparty/iroiro/luajava/AbstractLua;->requireFunction:Lparty/iroiro/luajava/value/LuaValue;

    .line 9
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, Lparty/iroiro/luajava/AbstractLua;->recyclableReferences:Ljava/lang/ref/ReferenceQueue;

    .line 10
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lparty/iroiro/luajava/AbstractLua;->recordedReferences:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>(Lparty/iroiro/luajava/LuaNatives;JILparty/iroiro/luajava/AbstractLua;)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->loader:Lparty/iroiro/luajava/ExternalLoader;

    .line 13
    iput-object p1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    .line 14
    iput-wide p2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    .line 15
    iput-object p5, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    .line 16
    iput p4, p0, Lparty/iroiro/luajava/AbstractLua;->id:I

    .line 17
    iput-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->subThreads:Ljava/util/List;

    .line 18
    iput-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->recyclableReferences:Ljava/lang/ref/ReferenceQueue;

    .line 19
    iput-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->recordedReferences:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static adopt(IJ)I
    .locals 2

    invoke-static {p0}, Lparty/iroiro/luajava/AbstractLua;->getInstance(I)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p0

    sget-object v0, Lparty/iroiro/luajava/AbstractLua;->instances:Lparty/iroiro/luajava/LuaInstances;

    invoke-virtual {v0}, Lparty/iroiro/luajava/LuaInstances;->add()Lparty/iroiro/luajava/LuaInstances$Token;

    move-result-object v0

    iget v1, v0, Lparty/iroiro/luajava/LuaInstances$Token;->id:I

    invoke-virtual {p0, p1, p2, v1, p0}, Lparty/iroiro/luajava/AbstractLua;->newThread(JILparty/iroiro/luajava/AbstractLua;)Lparty/iroiro/luajava/AbstractLua;

    move-result-object p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->addSubThread(Lparty/iroiro/luajava/Lua;)V

    iget-object p0, v0, Lparty/iroiro/luajava/LuaInstances$Token;->setter:Lparty/iroiro/luajava/LuaInstances$Token$Consumer;

    invoke-interface {p0, p1}, Lparty/iroiro/luajava/LuaInstances$Token$Consumer;->accept(Ljava/lang/Object;)V

    iget p0, v0, Lparty/iroiro/luajava/LuaInstances$Token;->id:I

    return p0
.end method

.method private appendCustomDescriptor(Ljava/lang/Class;Ljava/lang/StringBuilder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/StringBuilder;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lparty/iroiro/luajava/util/Type;->getPrimitiveDescriptor(Ljava/lang/Class;)C

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    const-string p1, "_"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static getInstance(I)Lparty/iroiro/luajava/AbstractLua;
    .locals 1

    sget-object v0, Lparty/iroiro/luajava/AbstractLua;->instances:Lparty/iroiro/luajava/LuaInstances;

    invoke-virtual {v0, p0}, Lparty/iroiro/luajava/LuaInstances;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lparty/iroiro/luajava/AbstractLua;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method private recycleReferences()V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object v0, v0, Lparty/iroiro/luajava/AbstractLua;->recyclableReferences:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    check-cast v0, Lparty/iroiro/luajava/cleaner/LuaReference;

    :goto_0
    if-eqz v0, :cond_0

    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object v1, v1, Lparty/iroiro/luajava/AbstractLua;->recordedReferences:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lparty/iroiro/luajava/cleaner/LuaReference;->getReference()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lparty/iroiro/luajava/cleaner/LuaReference;->getReference()I

    move-result v0

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->unref(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object v0, v0, Lparty/iroiro/luajava/AbstractLua;->recyclableReferences:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    check-cast v0, Lparty/iroiro/luajava/cleaner/LuaReference;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public addSubThread(Lparty/iroiro/luajava/Lua;)V
    .locals 2

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->subThreads:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->subThreads:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public checkError(IZ)V
    .locals 2

    if-eqz p2, :cond_1

    if-nez p1, :cond_0

    sget-object p1, Lparty/iroiro/luajava/LuaException$LuaError;->OK:Lparty/iroiro/luajava/LuaException$LuaError;

    goto :goto_0

    :cond_0
    sget-object p1, Lparty/iroiro/luajava/LuaException$LuaError;->RUNTIME:Lparty/iroiro/luajava/LuaException$LuaError;

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->convertError(I)Lparty/iroiro/luajava/LuaException$LuaError;

    move-result-object p1

    :goto_0
    sget-object p2, Lparty/iroiro/luajava/LuaException$LuaError;->OK:Lparty/iroiro/luajava/LuaException$LuaError;

    if-ne p1, p2, :cond_2

    return-void

    :cond_2
    const/4 p2, -0x1

    invoke-virtual {p0, p2}, Lparty/iroiro/luajava/AbstractLua;->type(I)Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object v0

    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->STRING:Lparty/iroiro/luajava/Lua$LuaType;

    if-ne v0, v1, :cond_3

    invoke-virtual {p0, p2}, Lparty/iroiro/luajava/AbstractLua;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    goto :goto_1

    :cond_3
    const-string p2, "Lua-side error"

    :goto_1
    new-instance v0, Lparty/iroiro/luajava/LuaException;

    invoke-direct {v0, p1, p2}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->getJavaError()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->error(Ljava/lang/Throwable;)I

    :cond_4
    throw v0
.end method

.method public checkStack(I)V
    .locals 3

    invoke-direct {p0}, Lparty/iroiro/luajava/AbstractLua;->recycleReferences()V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_checkstack(JI)I

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "No more stack space available"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 5

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    if-ne v1, p0, :cond_2

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_5

    :cond_0
    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->subThreads:Ljava/util/List;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->subThreads:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lparty/iroiro/luajava/Lua;

    sget-object v4, Lparty/iroiro/luajava/AbstractLua;->instances:Lparty/iroiro/luajava/LuaInstances;

    invoke-interface {v3}, Lparty/iroiro/luajava/Lua;->getId()I

    move-result v3

    invoke-virtual {v4, v3}, Lparty/iroiro/luajava/LuaInstances;->remove(I)V

    goto :goto_0

    :catchall_1
    move-exception v2

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->subThreads:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    sget-object v2, Lparty/iroiro/luajava/AbstractLua;->instances:Lparty/iroiro/luajava/LuaInstances;

    iget v3, p0, Lparty/iroiro/luajava/AbstractLua;->id:I

    invoke-virtual {v2, v3}, Lparty/iroiro/luajava/LuaInstances;->remove(I)V

    const/4 v2, -0x1

    iput v2, p0, Lparty/iroiro/luajava/AbstractLua;->id:I

    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v3, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v2, v3, v4}, Lparty/iroiro/luajava/LuaNatives;->lua_close(J)V

    monitor-exit v1

    goto :goto_3

    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    throw v2

    :cond_2
    iget-object v1, v1, Lparty/iroiro/luajava/AbstractLua;->subThreads:Ljava/util/List;

    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v2}, Lparty/iroiro/luajava/AbstractLua;->isClosed()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object v2, v2, Lparty/iroiro/luajava/AbstractLua;->subThreads:Ljava/util/List;

    invoke-interface {v2, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v3, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v2, v3, v4}, Lparty/iroiro/luajava/LuaNatives;->luaJ_removestateindex(J)V

    sget-object v2, Lparty/iroiro/luajava/AbstractLua;->instances:Lparty/iroiro/luajava/LuaInstances;

    iget v3, p0, Lparty/iroiro/luajava/AbstractLua;->id:I

    invoke-virtual {v2, v3}, Lparty/iroiro/luajava/LuaInstances;->remove(I)V

    goto :goto_2

    :catchall_2
    move-exception v2

    goto :goto_4

    :cond_3
    :goto_2
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-void

    :goto_4
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    throw v2

    :goto_5
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw v1
.end method

.method public concat(I)V
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    :cond_0
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_concat(JI)V

    return-void
.end method

.method public abstract convertError(I)Lparty/iroiro/luajava/LuaException$LuaError;
.end method

.method public abstract convertType(I)Lparty/iroiro/luajava/Lua$LuaType;
.end method

.method public createProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;",
            "Lparty/iroiro/luajava/Lua$Conversion;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x1

    if-lt v0, v1, :cond_2

    sget-object v0, Lparty/iroiro/luajava/AbstractLua$1;->$SwitchMap$party$iroiro$luajava$Lua$LuaType:[I

    const/4 v2, -0x1

    invoke-virtual {p0, v2}, Lparty/iroiro/luajava/AbstractLua;->type(I)Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v0, v0, v2

    const/4 v2, 0x6

    if-eq v0, v2, :cond_1

    const/16 v2, 0x8

    if-ne v0, v2, :cond_2

    invoke-static {p1}, Lparty/iroiro/luajava/util/ClassUtils;->getLuaFunctionalDescriptor([Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1}, Lparty/iroiro/luajava/AbstractLua;->createTable(II)V

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->getTop()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {p0, v2}, Lparty/iroiro/luajava/AbstractLua;->insert(I)V

    const/4 v1, -0x2

    invoke-virtual {p0, v1, v0}, Lparty/iroiro/luajava/AbstractLua;->setField(ILjava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unable to merge interfaces into a functional one"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    :try_start_0
    new-instance v0, Lparty/iroiro/luajava/LuaProxy;

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->ref()I

    move-result v1

    invoke-direct {v0, v1, p0, p2, p1}, Lparty/iroiro/luajava/LuaProxy;-><init>(ILparty/iroiro/luajava/AbstractLua;Lparty/iroiro/luajava/Lua$Conversion;[Ljava/lang/Class;)V

    iget-object p2, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object p2, p2, Lparty/iroiro/luajava/AbstractLua;->recordedReferences:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lparty/iroiro/luajava/LuaProxy;->getReference()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, Lparty/iroiro/luajava/cleaner/LuaReference;

    iget-object v3, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object v3, v3, Lparty/iroiro/luajava/AbstractLua;->recyclableReferences:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v2, v0, v3}, Lparty/iroiro/luajava/cleaner/LuaReference;-><init>(Lparty/iroiro/luajava/cleaner/LuaReferable;Ljava/lang/ref/ReferenceQueue;)V

    invoke-virtual {p2, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lparty/iroiro/luajava/util/ClassUtils;->getDefaultClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    invoke-static {p2, p1, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    invoke-virtual {p0, v1}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Expecting a table / function and interfaces"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public createTable(II)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1, p2}, Lparty/iroiro/luajava/LuaNatives;->lua_createtable(JII)V

    return-void
.end method

.method public dump()Ljava/nio/ByteBuffer;
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2}, Lparty/iroiro/luajava/LuaNatives;->luaJ_dumptobuffer(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public equal(II)Z
    .locals 6

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    const/4 v5, 0x0

    move v3, p1

    move v4, p2

    invoke-interface/range {v0 .. v5}, Lparty/iroiro/luajava/LuaNatives;->luaJ_compare(JIII)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public error(Ljava/lang/Throwable;)I
    .locals 1

    .line 2
    const-string v0, "__jthrowable__"

    if-nez p1, :cond_0

    .line 3
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->pushNil()V

    .line 4
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->setGlobal(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->pushJavaObject(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->setGlobal(Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/String;)V

    const/4 p1, -0x1

    return p1
.end method

.method public error(Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public eval(Ljava/lang/String;)[Lparty/iroiro/luajava/value/LuaValue;
    .locals 1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->load(Ljava/lang/String;)V

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/value/LuaValue;->call([Ljava/lang/Object;)[Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public from(D)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 2
    invoke-static {p0, p1, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue;->NUMBER(Lparty/iroiro/luajava/Lua;D)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public from(J)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 3
    invoke-static {p0, p1, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue;->LONG(Lparty/iroiro/luajava/Lua;J)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public from(Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 4
    invoke-static {p0, p1}, Lparty/iroiro/luajava/value/ImmutableLuaValue;->STRING(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public from(Ljava/nio/ByteBuffer;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 5
    invoke-static {p0, p1}, Lparty/iroiro/luajava/value/ImmutableLuaValue;->BUFFER(Lparty/iroiro/luajava/Lua;Ljava/nio/ByteBuffer;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public from(Z)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    if-eqz p1, :cond_0

    .line 1
    invoke-static {p0}, Lparty/iroiro/luajava/value/ImmutableLuaValue;->TRUE(Lparty/iroiro/luajava/Lua;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p0}, Lparty/iroiro/luajava/value/ImmutableLuaValue;->FALSE(Lparty/iroiro/luajava/Lua;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public fromNull()Lparty/iroiro/luajava/value/LuaValue;
    .locals 1

    invoke-static {p0}, Lparty/iroiro/luajava/value/ImmutableLuaValue;->NIL(Lparty/iroiro/luajava/Lua;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v0

    return-object v0
.end method

.method public gc()V
    .locals 3

    invoke-direct {p0}, Lparty/iroiro/luajava/AbstractLua;->recycleReferences()V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2}, Lparty/iroiro/luajava/LuaNatives;->luaJ_gc(J)V

    return-void
.end method

.method public get()Lparty/iroiro/luajava/value/LuaValue;
    .locals 5

    const/4 v0, -0x1

    .line 3
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->type(I)Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object v1

    .line 4
    sget-object v2, Lparty/iroiro/luajava/AbstractLua$1;->$SwitchMap$party$iroiro$luajava$Lua$LuaType:[I

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_5

    const/4 v4, 0x2

    if-eq v2, v4, :cond_5

    const/4 v4, 0x3

    if-eq v2, v4, :cond_4

    const/4 v4, 0x4

    if-eq v2, v4, :cond_2

    const/4 v4, 0x5

    if-eq v2, v4, :cond_1

    .line 5
    sget-object v0, Lparty/iroiro/luajava/Lua$LuaType;->TABLE:Lparty/iroiro/luajava/Lua$LuaType;

    if-ne v1, v0, :cond_0

    .line 6
    new-instance v0, Lparty/iroiro/luajava/value/LuaTableValue;

    invoke-direct {v0, p0, v1}, Lparty/iroiro/luajava/value/LuaTableValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V

    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Lparty/iroiro/luajava/value/RefLuaValue;

    invoke-direct {v0, p0, v1}, Lparty/iroiro/luajava/value/RefLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V

    .line 8
    :goto_0
    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object v1, v1, Lparty/iroiro/luajava/AbstractLua;->recordedReferences:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->getReference()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v3, Lparty/iroiro/luajava/cleaner/LuaReference;

    iget-object v4, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object v4, v4, Lparty/iroiro/luajava/AbstractLua;->recyclableReferences:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v3, v0, v4}, Lparty/iroiro/luajava/cleaner/LuaReference;-><init>(Lparty/iroiro/luajava/cleaner/LuaReferable;Ljava/lang/ref/ReferenceQueue;)V

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    .line 9
    :cond_1
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->toBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 10
    invoke-virtual {p0, v3}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    .line 11
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->from(Ljava/nio/ByteBuffer;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v0

    return-object v0

    .line 12
    :cond_2
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->isInteger(I)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 13
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->toInteger(I)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lparty/iroiro/luajava/AbstractLua;->from(J)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v0

    goto :goto_1

    .line 14
    :cond_3
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->toNumber(I)D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lparty/iroiro/luajava/AbstractLua;->from(D)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v0

    .line 15
    :goto_1
    invoke-virtual {p0, v3}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    return-object v0

    .line 16
    :cond_4
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->toBoolean(I)Z

    move-result v0

    .line 17
    invoke-virtual {p0, v3}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    .line 18
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->from(Z)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v0

    return-object v0

    .line 19
    :cond_5
    invoke-virtual {p0, v3}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    .line 20
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->fromNull()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v0

    return-object v0
.end method

.method public get(Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->getGlobal(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1
.end method

.method public getField(ILjava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1, p2}, Lparty/iroiro/luajava/LuaNatives;->luaJ_getfield(JILjava/lang/String;)V

    return-void
.end method

.method public getGlobal(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_getglobal(JLjava/lang/String;)V

    return-void
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lparty/iroiro/luajava/AbstractLua;->id:I

    return v0
.end method

.method public getJavaError()Ljava/lang/Throwable;
    .locals 2

    const-string v0, "__jthrowable__"

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->getGlobal(Ljava/lang/String;)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->toJavaObject(I)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    instance-of v1, v0, Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Throwable;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getLuaNatives()Lparty/iroiro/luajava/LuaNatives;
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    return-object v0
.end method

.method public getMainState()Lparty/iroiro/luajava/AbstractLua;
    .locals 1

    .line 2
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    return-object v0
.end method

.method public bridge synthetic getMainState()Lparty/iroiro/luajava/Lua;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->getMainState()Lparty/iroiro/luajava/AbstractLua;

    move-result-object v0

    return-object v0
.end method

.method public getMetaField(ILjava/lang/String;)I
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1, p2}, Lparty/iroiro/luajava/LuaNatives;->luaL_getmetafield(JILjava/lang/String;)I

    move-result p1

    return p1
.end method

.method public getMetatable(I)I
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_getmetatable(JI)I

    move-result p1

    return p1
.end method

.method public getPointer()J
    .locals 2

    iget-wide v0, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    return-wide v0
.end method

.method public getRegisteredMetatable(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_getmetatable(JLjava/lang/String;)V

    return-void
.end method

.method public getTable(I)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_gettable(JI)V

    return-void
.end method

.method public getTop()I
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2}, Lparty/iroiro/luajava/LuaNatives;->lua_gettop(J)I

    move-result v0

    return v0
.end method

.method public insert(I)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_insert(JI)V

    return-void
.end method

.method public invokeSpecial(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {p2}, Lparty/iroiro/luajava/util/ClassUtils;->isDefault(Ljava/lang/reflect/Method;)Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez p3, :cond_0

    sget-object p3, Lparty/iroiro/luajava/AbstractLua;->EMPTY:[Ljava/lang/Object;

    :cond_0
    array-length v0, p3

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_2

    aget-object v2, p3, v0

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->pushNil()V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v2}, Lparty/iroiro/luajava/AbstractLua;->pushJavaObject(Ljava/lang/Object;)V

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    array-length p3, p3

    add-int/2addr p3, v1

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p3

    array-length v2, p3

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_3

    aget-object v4, p3, v3

    invoke-direct {p0, v4, v0}, Lparty/iroiro/luajava/AbstractLua;->appendCustomDescriptor(Ljava/lang/Class;Ljava/lang/StringBuilder;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p3

    invoke-direct {p0, p3, v0}, Lparty/iroiro/luajava/AbstractLua;->appendCustomDescriptor(Ljava/lang/Class;Ljava/lang/StringBuilder;)V

    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v3, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {p2}, Lparty/iroiro/luajava/util/Type;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    move-object v8, p1

    invoke-interface/range {v2 .. v9}, Lparty/iroiro/luajava/LuaNatives;->luaJ_invokespecial(JLjava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;)I

    move-result p1

    const/4 p3, -0x1

    if-eq p1, p3, :cond_5

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    sget-object p2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne p1, p2, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    invoke-virtual {p0, p3}, Lparty/iroiro/luajava/AbstractLua;->toJavaObject(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v1}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    return-object p1

    :cond_5
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->getJavaError()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p0, v1}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IncompatibleClassChangeError;

    const-string p2, "Unable to invoke non-default method"

    invoke-direct {p1, p2}, Ljava/lang/IncompatibleClassChangeError;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isBoolean(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_isboolean(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isClosed()Z
    .locals 2

    iget v0, p0, Lparty/iroiro/luajava/AbstractLua;->id:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isFunction(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_isfunction(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isInteger(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_isinteger(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isJavaObject(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_isobject(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isNil(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_isnil(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isNone(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_isnone(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isNoneOrNil(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_isnoneornil(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isNumber(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_isnumber(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isString(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_isstring(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isTable(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_istable(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isThread(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_isthread(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isUserdata(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_isuserdata(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public lessThan(II)Z
    .locals 6

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    const/4 v5, -0x1

    move v3, p1

    move v4, p2

    invoke-interface/range {v0 .. v5}, Lparty/iroiro/luajava/LuaNatives;->luaJ_compare(JIII)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public load(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 2
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaL_loadstring(JLjava/lang/String;)I

    move-result p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lparty/iroiro/luajava/AbstractLua;->checkError(IZ)V

    return-void
.end method

.method public load(Ljava/nio/Buffer;Ljava/lang/String;)V
    .locals 8

    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 5
    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v5

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    move-object v4, p1

    move-object v7, p2

    invoke-interface/range {v1 .. v7}, Lparty/iroiro/luajava/LuaNatives;->luaJ_loadbuffer(JLjava/nio/Buffer;IILjava/lang/String;)I

    move-result p1

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lparty/iroiro/luajava/AbstractLua;->checkError(IZ)V

    return-void

    .line 6
    :cond_0
    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object p2, Lparty/iroiro/luajava/LuaException$LuaError;->MEMORY:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v0, "Expecting a direct buffer"

    invoke-direct {p1, p2, v0}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1
.end method

.method public loadExternal(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object v0, v0, Lparty/iroiro/luajava/AbstractLua;->loader:Lparty/iroiro/luajava/ExternalLoader;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p0}, Lparty/iroiro/luajava/ExternalLoader;->load(Ljava/lang/String;Lparty/iroiro/luajava/Lua;)Ljava/nio/Buffer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, p1}, Lparty/iroiro/luajava/AbstractLua;->load(Ljava/nio/Buffer;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->FILE:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "Loader returned null"

    invoke-direct {p1, v0, v1}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->RUNTIME:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "External loader not set"

    invoke-direct {p1, v0, v1}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1
.end method

.method public newRegisteredMetatable(Ljava/lang/String;)I
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaL_newmetatable(JLjava/lang/String;)I

    move-result p1

    return p1
.end method

.method public newTable()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lparty/iroiro/luajava/AbstractLua;->createTable(II)V

    return-void
.end method

.method public newThread()Lparty/iroiro/luajava/AbstractLua;
    .locals 5

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 3
    sget-object v0, Lparty/iroiro/luajava/AbstractLua;->instances:Lparty/iroiro/luajava/LuaInstances;

    invoke-virtual {v0}, Lparty/iroiro/luajava/LuaInstances;->add()Lparty/iroiro/luajava/LuaInstances$Token;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    iget v4, v0, Lparty/iroiro/luajava/LuaInstances$Token;->id:I

    invoke-interface {v1, v2, v3, v4}, Lparty/iroiro/luajava/LuaNatives;->luaJ_newthread(JI)J

    move-result-wide v1

    .line 5
    iget v3, v0, Lparty/iroiro/luajava/LuaInstances$Token;->id:I

    iget-object v4, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {p0, v1, v2, v3, v4}, Lparty/iroiro/luajava/AbstractLua;->newThread(JILparty/iroiro/luajava/AbstractLua;)Lparty/iroiro/luajava/AbstractLua;

    move-result-object v1

    .line 6
    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v2, v1}, Lparty/iroiro/luajava/AbstractLua;->addSubThread(Lparty/iroiro/luajava/Lua;)V

    .line 7
    iget-object v0, v0, Lparty/iroiro/luajava/LuaInstances$Token;->setter:Lparty/iroiro/luajava/LuaInstances$Token$Consumer;

    invoke-interface {v0, v1}, Lparty/iroiro/luajava/LuaInstances$Token$Consumer;->accept(Ljava/lang/Object;)V

    return-object v1
.end method

.method public abstract newThread(JILparty/iroiro/luajava/AbstractLua;)Lparty/iroiro/luajava/AbstractLua;
.end method

.method public bridge synthetic newThread()Lparty/iroiro/luajava/Lua;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->newThread()Lparty/iroiro/luajava/AbstractLua;

    move-result-object v0

    return-object v0
.end method

.method public next(I)I
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_next(JI)I

    move-result p1

    return p1
.end method

.method public openLibraries()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2}, Lparty/iroiro/luajava/LuaNatives;->luaL_openlibs(J)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2}, Lparty/iroiro/luajava/LuaNatives;->luaJ_initloader(J)I

    return-void
.end method

.method public openLibrary(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_openlib(JLjava/lang/String;)V

    const-string v0, "package"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v0, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {p1, v0, v1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_initloader(J)I

    :cond_0
    return-void
.end method

.method public pCall(II)V
    .locals 8

    sub-int v0, p2, p1

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v3, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    const/4 v7, 0x0

    move v5, p1

    move v6, p2

    invoke-interface/range {v2 .. v7}, Lparty/iroiro/luajava/LuaNatives;->lua_pcall(JIII)I

    move-result p1

    invoke-virtual {p0, p1, v1}, Lparty/iroiro/luajava/AbstractLua;->checkError(IZ)V

    return-void
.end method

.method public pop(I)V
    .locals 3

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->getTop()I

    move-result v0

    if-lt v0, p1, :cond_0

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_pop(JI)V

    return-void

    :cond_0
    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object v0, Lparty/iroiro/luajava/LuaException$LuaError;->MEMORY:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v1, "invalid number of items to pop"

    invoke-direct {p1, v0, v1}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1
.end method

.method public push(J)V
    .locals 3

    const/4 v0, 0x1

    .line 42
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 43
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1, p2}, Lparty/iroiro/luajava/LuaNatives;->lua_pushinteger(JJ)V

    return-void
.end method

.method public push(Ljava/lang/Number;)V
    .locals 5

    const/4 v0, 0x1

    .line 40
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 41
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v3

    invoke-interface {v0, v1, v2, v3, v4}, Lparty/iroiro/luajava/LuaNatives;->lua_pushnumber(JD)V

    return-void
.end method

.method public push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    if-nez p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->pushNil()V

    return-void

    .line 3
    :cond_0
    instance-of v0, p1, Lparty/iroiro/luajava/value/LuaValue;

    if-eqz v0, :cond_1

    .line 4
    check-cast p1, Lparty/iroiro/luajava/value/LuaValue;

    .line 5
    invoke-interface {p1, p0}, Lparty/iroiro/luajava/value/LuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    return-void

    .line 6
    :cond_1
    instance-of v0, p1, Lparty/iroiro/luajava/value/LuaFunction;

    if-eqz v0, :cond_2

    .line 7
    check-cast p1, Lparty/iroiro/luajava/value/LuaFunction;

    .line 8
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Lparty/iroiro/luajava/value/LuaFunction;)V

    return-void

    .line 9
    :cond_2
    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->NONE:Lparty/iroiro/luajava/Lua$Conversion;

    if-ne p2, v0, :cond_3

    .line 10
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->pushJavaObjectOrArray(Ljava/lang/Object;)V

    return-void

    .line 11
    :cond_3
    instance-of v0, p1, Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    .line 12
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Z)V

    return-void

    .line 13
    :cond_4
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 14
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/String;)V

    return-void

    .line 15
    :cond_5
    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_12

    instance-of v0, p1, Ljava/lang/Byte;

    if-nez v0, :cond_12

    instance-of v0, p1, Ljava/lang/Short;

    if-eqz v0, :cond_6

    goto/16 :goto_1

    .line 16
    :cond_6
    instance-of v0, p1, Ljava/lang/Character;

    if-eqz v0, :cond_7

    .line 17
    check-cast p1, Ljava/lang/Character;

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    int-to-long p1, p1

    invoke-virtual {p0, p1, p2}, Lparty/iroiro/luajava/AbstractLua;->push(J)V

    return-void

    .line 18
    :cond_7
    instance-of v0, p1, Ljava/lang/Long;

    if-eqz v0, :cond_8

    .line 19
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lparty/iroiro/luajava/AbstractLua;->push(J)V

    return-void

    .line 20
    :cond_8
    instance-of v0, p1, Ljava/lang/Float;

    if-nez v0, :cond_11

    instance-of v0, p1, Ljava/lang/Double;

    if-eqz v0, :cond_9

    goto :goto_0

    .line 21
    :cond_9
    instance-of v0, p1, Lparty/iroiro/luajava/JFunction;

    if-eqz v0, :cond_a

    .line 22
    check-cast p1, Lparty/iroiro/luajava/JFunction;

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Lparty/iroiro/luajava/JFunction;)V

    return-void

    .line 23
    :cond_a
    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    if-ne p2, v0, :cond_b

    .line 24
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->pushJavaObjectOrArray(Ljava/lang/Object;)V

    return-void

    .line 25
    :cond_b
    instance-of p2, p1, Ljava/lang/Class;

    if-eqz p2, :cond_c

    .line 26
    check-cast p1, Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->pushJavaClass(Ljava/lang/Class;)V

    return-void

    .line 27
    :cond_c
    instance-of p2, p1, Ljava/util/Map;

    if-eqz p2, :cond_d

    .line 28
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/util/Map;)V

    return-void

    .line 29
    :cond_d
    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_e

    .line 30
    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/util/Collection;)V

    return-void

    .line 31
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->isArray()Z

    move-result p2

    if-eqz p2, :cond_f

    .line 32
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->pushArray(Ljava/lang/Object;)V

    return-void

    .line 33
    :cond_f
    instance-of p2, p1, Ljava/nio/ByteBuffer;

    if-eqz p2, :cond_10

    .line 34
    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/nio/ByteBuffer;)V

    return-void

    .line 35
    :cond_10
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->pushJavaObject(Ljava/lang/Object;)V

    return-void

    .line 36
    :cond_11
    :goto_0
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/Number;)V

    return-void

    .line 37
    :cond_12
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-long p1, p1

    invoke-virtual {p0, p1, p2}, Lparty/iroiro/luajava/AbstractLua;->push(J)V

    return-void
.end method

.method public push(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    .line 44
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 45
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_pushstring(JLjava/lang/String;)V

    return-void
.end method

.method public push(Ljava/nio/ByteBuffer;)V
    .locals 7

    const/4 v0, 0x1

    .line 46
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 47
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-nez v0, :cond_0

    .line 48
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 49
    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 50
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p1

    .line 51
    :goto_0
    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v5

    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    invoke-interface/range {v1 .. v6}, Lparty/iroiro/luajava/LuaNatives;->luaJ_pushlstring(JLjava/nio/Buffer;II)V

    return-void
.end method

.method public push(Ljava/util/Collection;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x2

    .line 58
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 59
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v4, 0x0

    invoke-interface {v0, v1, v2, v3, v4}, Lparty/iroiro/luajava/LuaNatives;->lua_createtable(JII)V

    .line 60
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 61
    sget-object v3, Lparty/iroiro/luajava/Lua$Conversion;->FULL:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-virtual {p0, v2, v3}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    .line 62
    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v3, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    const/4 v5, -0x2

    invoke-interface {v2, v3, v4, v5, v1}, Lparty/iroiro/luajava/LuaNatives;->lua_rawseti(JII)V

    add-int/2addr v1, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public push(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)V"
        }
    .end annotation

    const/4 v0, 0x3

    .line 52
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 53
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    const/4 v3, 0x0

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v4

    invoke-interface {v0, v1, v2, v3, v4}, Lparty/iroiro/luajava/LuaNatives;->lua_createtable(JII)V

    .line 54
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 55
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->FULL:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-virtual {p0, v1, v2}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    .line 56
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    .line 57
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    const/4 v3, -0x3

    invoke-interface {v0, v1, v2, v3}, Lparty/iroiro/luajava/LuaNatives;->lua_rawset(JI)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public push(Lparty/iroiro/luajava/JFunction;)V
    .locals 3

    const/4 v0, 0x1

    .line 63
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 64
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_pushfunction(JLjava/lang/Object;)V

    return-void
.end method

.method public push(Lparty/iroiro/luajava/value/LuaFunction;)V
    .locals 1

    const/4 v0, 0x1

    .line 67
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 68
    new-instance v0, Lparty/iroiro/luajava/AbstractLua$LuaFunctionWrapper;

    invoke-direct {v0, p1}, Lparty/iroiro/luajava/AbstractLua$LuaFunctionWrapper;-><init>(Lparty/iroiro/luajava/value/LuaFunction;)V

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->push(Lparty/iroiro/luajava/JFunction;)V

    return-void
.end method

.method public push(Lparty/iroiro/luajava/value/LuaValue;)V
    .locals 1

    const/4 v0, 0x1

    .line 65
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 66
    invoke-interface {p1, p0}, Lparty/iroiro/luajava/value/LuaValue;->push(Lparty/iroiro/luajava/Lua;)V

    return-void
.end method

.method public push(Z)V
    .locals 3

    const/4 v0, 0x1

    .line 38
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 39
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_pushboolean(JI)V

    return-void
.end method

.method public pushArray(Ljava/lang/Object;)V
    .locals 6

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    const/4 v4, 0x0

    invoke-interface {v1, v2, v3, v0, v4}, Lparty/iroiro/luajava/LuaNatives;->lua_createtable(JII)V

    :goto_0
    if-eq v4, v0, :cond_0

    invoke-static {p1, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lparty/iroiro/luajava/Lua$Conversion;->FULL:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-virtual {p0, v1, v2}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    add-int/lit8 v4, v4, 0x1

    const/4 v5, -0x2

    invoke-interface {v1, v2, v3, v5, v4}, Lparty/iroiro/luajava/LuaNatives;->lua_rawseti(JII)V

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Not an array"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public pushJavaArray(Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_pusharray(JLjava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expecting non-array argument"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public pushJavaClass(Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_pushclass(JLjava/lang/Object;)V

    return-void
.end method

.method public pushJavaObject(Ljava/lang/Object;)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_pushobject(JLjava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expecting non-array argument"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public pushJavaObjectOrArray(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->pushJavaArray(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->pushJavaObject(Ljava/lang/Object;)V

    return-void
.end method

.method public pushNil()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2}, Lparty/iroiro/luajava/LuaNatives;->lua_pushnil(J)V

    return-void
.end method

.method public pushThread()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2}, Lparty/iroiro/luajava/LuaNatives;->lua_pushthread(J)I

    return-void
.end method

.method public pushValue(I)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_pushvalue(JI)V

    return-void
.end method

.method public rawEqual(II)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1, p2}, Lparty/iroiro/luajava/LuaNatives;->lua_rawequal(JII)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public rawGet(I)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_rawget(JI)V

    return-void
.end method

.method public rawGetI(II)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1, p2}, Lparty/iroiro/luajava/LuaNatives;->luaJ_rawgeti(JII)V

    return-void
.end method

.method public rawLength(I)I
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_len(JI)I

    move-result p1

    return p1
.end method

.method public rawSet(I)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_rawset(JI)V

    return-void
.end method

.method public rawSetI(II)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1, p2}, Lparty/iroiro/luajava/LuaNatives;->lua_rawseti(JII)V

    return-void
.end method

.method public ref()I
    .locals 1

    .line 2
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    invoke-interface {v0}, Lparty/iroiro/luajava/LuaNatives;->getRegistryIndex()I

    move-result v0

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->ref(I)I

    move-result v0

    return v0
.end method

.method public ref(I)I
    .locals 3

    .line 1
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaL_ref(JI)I

    move-result p1

    return p1
.end method

.method public refGet(I)V
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    invoke-interface {v0}, Lparty/iroiro/luajava/LuaNatives;->getRegistryIndex()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lparty/iroiro/luajava/AbstractLua;->rawGetI(II)V

    return-void
.end method

.method public register(Ljava/lang/String;Lparty/iroiro/luajava/value/LuaFunction;)V
    .locals 0

    invoke-virtual {p0, p2}, Lparty/iroiro/luajava/AbstractLua;->push(Lparty/iroiro/luajava/value/LuaFunction;)V

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->setGlobal(Ljava/lang/String;)V

    return-void
.end method

.method public remove(I)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_remove(JI)V

    return-void
.end method

.method public replace(I)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_replace(JI)V

    return-void
.end method

.method public require(Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 4

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->requireFunction:Lparty/iroiro/luajava/value/LuaValue;

    if-nez v0, :cond_1

    const-string v0, "require"

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->get(Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v1

    invoke-interface {v1}, Lparty/iroiro/luajava/value/LuaValue;->type()Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object v2

    sget-object v3, Lparty/iroiro/luajava/Lua$LuaType;->FUNCTION:Lparty/iroiro/luajava/Lua$LuaType;

    if-eq v2, v3, :cond_0

    const-string v1, "package"

    invoke-virtual {p0, v1}, Lparty/iroiro/luajava/AbstractLua;->openLibrary(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->get(Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;

    move-result-object v0

    iput-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->requireFunction:Lparty/iroiro/luajava/value/LuaValue;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :cond_1
    :goto_0
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lparty/iroiro/luajava/value/LuaValue;->call([Ljava/lang/Object;)[Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    const/4 v0, 0x0

    aget-object p1, p1, v0

    return-object p1
.end method

.method public resume(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_resume(JI)I

    move-result p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->convertError(I)Lparty/iroiro/luajava/LuaException$LuaError;

    move-result-object v0

    sget-object v1, Lparty/iroiro/luajava/LuaException$LuaError;->YIELD:Lparty/iroiro/luajava/LuaException$LuaError;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lparty/iroiro/luajava/AbstractLua;->checkError(IZ)V

    return v0
.end method

.method public run(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 2
    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v1, v2, v3, p1}, Lparty/iroiro/luajava/LuaNatives;->luaL_dostring(JLjava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, v0}, Lparty/iroiro/luajava/AbstractLua;->checkError(IZ)V

    return-void
.end method

.method public run(Ljava/nio/Buffer;Ljava/lang/String;)V
    .locals 8

    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    .line 5
    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result v5

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v6

    move-object v4, p1

    move-object v7, p2

    invoke-interface/range {v1 .. v7}, Lparty/iroiro/luajava/LuaNatives;->luaJ_dobuffer(JLjava/nio/Buffer;IILjava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1, v0}, Lparty/iroiro/luajava/AbstractLua;->checkError(IZ)V

    return-void

    .line 6
    :cond_0
    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object p2, Lparty/iroiro/luajava/LuaException$LuaError;->MEMORY:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string v0, "Expecting a direct buffer"

    invoke-direct {p1, p2, v0}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1
.end method

.method public set(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lparty/iroiro/luajava/Lua$Conversion;->SEMI:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-virtual {p0, p2, v0}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->setGlobal(Ljava/lang/String;)V

    return-void
.end method

.method public setExternalLoader(Lparty/iroiro/luajava/ExternalLoader;)V
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iput-object p1, v0, Lparty/iroiro/luajava/AbstractLua;->loader:Lparty/iroiro/luajava/ExternalLoader;

    return-void
.end method

.method public setField(ILjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1, p2}, Lparty/iroiro/luajava/LuaNatives;->lua_setfield(JILjava/lang/String;)V

    return-void
.end method

.method public setGlobal(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_setglobal(JLjava/lang/String;)V

    return-void
.end method

.method public setMetatable(I)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_setmetatable(JI)V

    return-void
.end method

.method public setTable(I)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_settable(JI)V

    return-void
.end method

.method public setTop(I)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_settop(JI)V

    return-void
.end method

.method public shouldSynchronize()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public status()Lparty/iroiro/luajava/LuaException$LuaError;
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2}, Lparty/iroiro/luajava/LuaNatives;->lua_status(J)I

    move-result v0

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->convertError(I)Lparty/iroiro/luajava/LuaException$LuaError;

    move-result-object v0

    return-object v0
.end method

.method public toAbsoluteIndex(I)I
    .locals 1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    invoke-interface {v0}, Lparty/iroiro/luajava/LuaNatives;->getRegistryIndex()I

    move-result v0

    if-gt p1, v0, :cond_1

    :goto_0
    return p1

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->getTop()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, p1

    return v0

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Stack index should not be 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toBoolean(I)Z
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_toboolean(JI)I

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public toBuffer(I)Ljava/nio/ByteBuffer;
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_tobuffer(JI)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    return-object p1
.end method

.method public toDirectBuffer(I)Ljava/nio/ByteBuffer;
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_todirectbuffer(JI)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/nio/ByteBuffer;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public toInteger(I)J
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_tointeger(JI)J

    move-result-wide v0

    return-wide v0
.end method

.method public toJavaObject(I)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->luaJ_toobject(JI)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public toList(I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->toJavaObject(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/List;

    return-object v0

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v1, v2, v3, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_istable(JI)I

    move-result v1

    if-ne v1, v0, :cond_2

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->rawLength(I)I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    move v3, v0

    :goto_0
    if-gt v3, v1, :cond_1

    iget-object v4, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v5, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v4, v5, v6, p1, v3}, Lparty/iroiro/luajava/LuaNatives;->luaJ_rawgeti(JII)V

    const/4 v4, -0x1

    invoke-virtual {p0, v4}, Lparty/iroiro/luajava/AbstractLua;->toObject(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v2

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public toMap(I)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->toJavaObject(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/util/Map;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/Map;

    return-object v0

    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/AbstractLua;->checkStack(I)V

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->toAbsoluteIndex(I)I

    move-result p1

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_istable(JI)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v2, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v2, v3}, Lparty/iroiro/luajava/LuaNatives;->lua_pushnil(J)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :goto_0
    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v3, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v2, v3, v4, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_next(JI)I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, -0x2

    invoke-virtual {p0, v2}, Lparty/iroiro/luajava/AbstractLua;->toObject(I)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {p0, v3}, Lparty/iroiro/luajava/AbstractLua;->toObject(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v1}, Lparty/iroiro/luajava/AbstractLua;->pop(I)V

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public toNumber(I)D
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_tonumber(JI)D

    move-result-wide v0

    return-wide v0
.end method

.method public toObject(I)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->type(I)Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    sget-object v2, Lparty/iroiro/luajava/AbstractLua$1;->$SwitchMap$party$iroiro$luajava$Lua$LuaType:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    packed-switch v0, :pswitch_data_0

    .line 3
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->pushValue(I)V

    .line 4
    invoke-virtual {p0}, Lparty/iroiro/luajava/AbstractLua;->get()Lparty/iroiro/luajava/value/LuaValue;

    move-result-object p1

    return-object p1

    .line 5
    :pswitch_0
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->toJavaObject(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 6
    :pswitch_1
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->toMap(I)Ljava/util/Map;

    move-result-object p1

    return-object p1

    .line 7
    :pswitch_2
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->toString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 8
    :pswitch_3
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->toNumber(I)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    .line 9
    :pswitch_4
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->toBoolean(I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_5
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toObject(ILjava/lang/Class;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 10
    :try_start_0
    invoke-static {p0, p2, p1}, Lparty/iroiro/luajava/JuaAPI;->convertFromLua(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public toString(I)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_tostring(JI)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public type(I)Lparty/iroiro/luajava/Lua$LuaType;
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1}, Lparty/iroiro/luajava/LuaNatives;->lua_type(JI)I

    move-result p1

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/AbstractLua;->convertType(I)Lparty/iroiro/luajava/Lua$LuaType;

    move-result-object p1

    return-object p1
.end method

.method public unRef(II)V
    .locals 3

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v1, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {v0, v1, v2, p1, p2}, Lparty/iroiro/luajava/LuaNatives;->luaL_unref(JII)V

    return-void
.end method

.method public unref(I)V
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    invoke-interface {v0}, Lparty/iroiro/luajava/LuaNatives;->getRegistryIndex()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lparty/iroiro/luajava/AbstractLua;->unRef(II)V

    return-void
.end method

.method public xMove(Lparty/iroiro/luajava/Lua;I)V
    .locals 8

    instance-of v0, p1, Lparty/iroiro/luajava/AbstractLua;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lparty/iroiro/luajava/AbstractLua;

    iget-object v0, v0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    iget-object v1, p0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    if-ne v0, v1, :cond_0

    invoke-interface {p1, p2}, Lparty/iroiro/luajava/Lua;->checkStack(I)V

    iget-object v2, p0, Lparty/iroiro/luajava/AbstractLua;->C:Lparty/iroiro/luajava/LuaNatives;

    iget-wide v3, p0, Lparty/iroiro/luajava/AbstractLua;->L:J

    invoke-interface {p1}, Lparty/iroiro/luajava/Lua;->getPointer()J

    move-result-wide v5

    move v7, p2

    invoke-interface/range {v2 .. v7}, Lparty/iroiro/luajava/LuaNatives;->lua_xmove(JJI)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Not sharing same global state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public yield(I)V
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Not implemented"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
