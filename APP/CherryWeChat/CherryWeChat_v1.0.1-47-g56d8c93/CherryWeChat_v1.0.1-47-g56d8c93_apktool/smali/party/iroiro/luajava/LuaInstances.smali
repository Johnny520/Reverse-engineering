.class public Lparty/iroiro/luajava/LuaInstances;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lparty/iroiro/luajava/LuaInstances$Token;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private freeEntries:I

.field private final instances:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private lastFreeId:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Lparty/iroiro/luajava/LuaInstances;->freeEntries:I

    const/4 v0, -0x1

    iput v0, p0, Lparty/iroiro/luajava/LuaInstances;->lastFreeId:I

    return-void
.end method

.method public static synthetic access$000(Lparty/iroiro/luajava/LuaInstances;ILjava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/LuaInstances;->set(ILjava/lang/Object;)V

    return-void
.end method

.method private declared-synchronized set(ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public declared-synchronized add(Ljava/lang/Object;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/LuaInstances;->addNullable(Ljava/lang/Object;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized add()Lparty/iroiro/luajava/LuaInstances$Token;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lparty/iroiro/luajava/LuaInstances$Token<",
            "TT;>;"
        }
    .end annotation

    monitor-enter p0

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, v0}, Lparty/iroiro/luajava/LuaInstances;->addNullable(Ljava/lang/Object;)I

    move-result v1

    .line 3
    new-instance v2, Lparty/iroiro/luajava/LuaInstances$Token;

    new-instance v3, Lparty/iroiro/luajava/LuaInstances$1;

    invoke-direct {v3, p0, v1}, Lparty/iroiro/luajava/LuaInstances$1;-><init>(Lparty/iroiro/luajava/LuaInstances;I)V

    invoke-direct {v2, v1, v3, v0}, Lparty/iroiro/luajava/LuaInstances$Token;-><init>(ILparty/iroiro/luajava/LuaInstances$Token$Consumer;Lparty/iroiro/luajava/LuaInstances$1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v2

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized addNullable(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lparty/iroiro/luajava/LuaInstances;->lastFreeId:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, p0, Lparty/iroiro/luajava/LuaInstances;->lastFreeId:I

    iget-object v1, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lparty/iroiro/luajava/LuaInstances;->freeEntries:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lparty/iroiro/luajava/LuaInstances;->freeEntries:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized remove(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    iget v1, p0, Lparty/iroiro/luajava/LuaInstances;->lastFreeId:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iput p1, p0, Lparty/iroiro/luajava/LuaInstances;->lastFreeId:I

    iget p1, p0, Lparty/iroiro/luajava/LuaInstances;->freeEntries:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lparty/iroiro/luajava/LuaInstances;->freeEntries:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized size()I
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lparty/iroiro/luajava/LuaInstances;->instances:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lparty/iroiro/luajava/LuaInstances;->freeEntries:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int/2addr v0, v1

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
