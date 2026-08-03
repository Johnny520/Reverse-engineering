.class public final Lparty/iroiro/luajava/LuaProxy;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/reflect/InvocationHandler;
.implements Lparty/iroiro/luajava/cleaner/LuaReferable;


# instance fields
.field final L:Lparty/iroiro/luajava/AbstractLua;

.field private final degree:Lparty/iroiro/luajava/Lua$Conversion;

.field private final interfaces:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field final ref:I


# direct methods
.method public constructor <init>(ILparty/iroiro/luajava/AbstractLua;Lparty/iroiro/luajava/Lua$Conversion;[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lparty/iroiro/luajava/AbstractLua;",
            "Lparty/iroiro/luajava/Lua$Conversion;",
            "[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lparty/iroiro/luajava/LuaProxy;->ref:I

    iput-object p2, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    iput-object p3, p0, Lparty/iroiro/luajava/LuaProxy;->degree:Lparty/iroiro/luajava/Lua$Conversion;

    iput-object p4, p0, Lparty/iroiro/luajava/LuaProxy;->interfaces:[Ljava/lang/Class;

    return-void
.end method

.method private callDefaultMethod(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {p2}, Lparty/iroiro/luajava/util/ClassUtils;->isDefault(Ljava/lang/reflect/Method;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v0, p1, p2, p3}, Lparty/iroiro/luajava/AbstractLua;->invokeSpecial(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lparty/iroiro/luajava/LuaProxy;->callObjectDefault(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private callObjectDefault(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v3, "hashCode"

    invoke-static {p2, v2, v3, v1}, Lparty/iroiro/luajava/LuaProxy;->methodEquals(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const-class v1, Ljava/lang/Object;

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v3, "equals"

    invoke-static {p2, v2, v3, v1}, Lparty/iroiro/luajava/LuaProxy;->methodEquals(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p3, [Ljava/lang/Object;

    aget-object p2, p3, v0

    if-ne p1, p2, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    const-string p1, "toString"

    new-array p3, v0, [Ljava/lang/Class;

    const-class v0, Ljava/lang/String;

    invoke-static {p2, v0, p1, p3}, Lparty/iroiro/luajava/LuaProxy;->methodEquals(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "LuaProxy"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p0, Lparty/iroiro/luajava/LuaProxy;->interfaces:[Ljava/lang/Class;

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "@"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object p3, Lparty/iroiro/luajava/LuaException$LuaError;->JAVA:Lparty/iroiro/luajava/LuaException$LuaError;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "method not implemented: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p3, p2}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1
.end method

.method public static varargs methodEquals(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, p3}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private syncFreeInvoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    iget-object v0, v0, Lparty/iroiro/luajava/AbstractLua;->mainThread:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v0}, Lparty/iroiro/luajava/AbstractLua;->isClosed()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v0}, Lparty/iroiro/luajava/AbstractLua;->getTop()I

    move-result v0

    iget-object v1, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    iget v2, p0, Lparty/iroiro/luajava/LuaProxy;->ref:I

    invoke-virtual {v1, v2}, Lparty/iroiro/luajava/AbstractLua;->refGet(I)V

    iget-object v1, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    invoke-virtual {v1, v3, v2}, Lparty/iroiro/luajava/AbstractLua;->getField(ILjava/lang/String;)V

    iget-object v1, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v1, v3}, Lparty/iroiro/luajava/AbstractLua;->isNil(I)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v1, v0}, Lparty/iroiro/luajava/AbstractLua;->setTop(I)V

    invoke-direct {p0, p1, p2, p3}, Lparty/iroiro/luajava/LuaProxy;->callDefaultMethod(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v1, p1}, Lparty/iroiro/luajava/AbstractLua;->pushJavaObject(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    const/4 v1, 0x0

    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x1

    if-ne p1, v2, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    move p1, v4

    :goto_0
    if-nez p3, :cond_2

    iget-object p3, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {p3, v4, p1}, Lparty/iroiro/luajava/AbstractLua;->pCall(II)V

    goto :goto_2

    :cond_2
    array-length v5, p3

    :goto_1
    if-ge v1, v5, :cond_3

    aget-object v6, p3, v1

    iget-object v7, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    iget-object v8, p0, Lparty/iroiro/luajava/LuaProxy;->degree:Lparty/iroiro/luajava/Lua$Conversion;

    invoke-virtual {v7, v6, v8}, Lparty/iroiro/luajava/AbstractLua;->push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    array-length p3, p3

    add-int/2addr p3, v4

    invoke-virtual {v1, p3, p1}, Lparty/iroiro/luajava/AbstractLua;->pCall(II)V

    :goto_2
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p1

    if-ne p1, v2, :cond_4

    iget-object p1, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {p1, v0}, Lparty/iroiro/luajava/AbstractLua;->setTop(I)V

    const/4 p1, 0x0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_4
    iget-object p1, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p1, p2, v3}, Lparty/iroiro/luajava/JuaAPI;->convertFromLua(Lparty/iroiro/luajava/Lua;Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {p2, v0}, Lparty/iroiro/luajava/AbstractLua;->setTop(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_3
    iget-object p2, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {p2, v0}, Lparty/iroiro/luajava/AbstractLua;->setTop(I)V

    throw p1

    :cond_5
    new-instance p1, Lparty/iroiro/luajava/LuaException;

    sget-object p2, Lparty/iroiro/luajava/LuaException$LuaError;->JAVA:Lparty/iroiro/luajava/LuaException$LuaError;

    const-string p3, "lua state closed"

    invoke-direct {p1, p2, p3}, Lparty/iroiro/luajava/LuaException;-><init>(Lparty/iroiro/luajava/LuaException$LuaError;Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public getReference()I
    .locals 1

    iget v0, p0, Lparty/iroiro/luajava/LuaProxy;->ref:I

    return v0
.end method

.method public invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v0}, Lparty/iroiro/luajava/AbstractLua;->shouldSynchronize()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lparty/iroiro/luajava/LuaProxy;->L:Lparty/iroiro/luajava/AbstractLua;

    invoke-virtual {v0}, Lparty/iroiro/luajava/AbstractLua;->getMainState()Lparty/iroiro/luajava/AbstractLua;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lparty/iroiro/luajava/LuaProxy;->syncFreeInvoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lparty/iroiro/luajava/LuaProxy;->syncFreeInvoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
