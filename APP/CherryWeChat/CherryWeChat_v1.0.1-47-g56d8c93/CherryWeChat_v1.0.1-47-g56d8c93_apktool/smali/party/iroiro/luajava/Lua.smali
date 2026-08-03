.class public interface abstract Lparty/iroiro/luajava/Lua;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/AutoCloseable;
.implements Lparty/iroiro/luajava/value/LuaThread;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lparty/iroiro/luajava/Lua$LuaType;,
        Lparty/iroiro/luajava/Lua$Conversion;
    }
.end annotation


# static fields
.field public static final GLOBAL_THROWABLE:Ljava/lang/String; = "__jthrowable__"


# virtual methods
.method public abstract checkStack(I)V
.end method

.method public abstract close()V
.end method

.method public abstract concat(I)V
.end method

.method public abstract createProxy([Ljava/lang/Class;Lparty/iroiro/luajava/Lua$Conversion;)Ljava/lang/Object;
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
.end method

.method public abstract createTable(II)V
.end method

.method public abstract dump()Ljava/nio/ByteBuffer;
.end method

.method public abstract equal(II)Z
.end method

.method public abstract error(Ljava/lang/Throwable;)I
.end method

.method public abstract error(Ljava/lang/String;)V
.end method

.method public abstract gc()V
.end method

.method public abstract get()Lparty/iroiro/luajava/value/LuaValue;
.end method

.method public abstract getField(ILjava/lang/String;)V
.end method

.method public abstract getGlobal(Ljava/lang/String;)V
.end method

.method public abstract getId()I
.end method

.method public abstract getJavaError()Ljava/lang/Throwable;
.end method

.method public abstract getLuaNatives()Lparty/iroiro/luajava/LuaNatives;
.end method

.method public abstract getMainState()Lparty/iroiro/luajava/Lua;
.end method

.method public abstract getMetaField(ILjava/lang/String;)I
.end method

.method public abstract getMetatable(I)I
.end method

.method public abstract getPointer()J
.end method

.method public abstract getRegisteredMetatable(Ljava/lang/String;)V
.end method

.method public abstract getTable(I)V
.end method

.method public abstract getTop()I
.end method

.method public abstract insert(I)V
.end method

.method public abstract isBoolean(I)Z
.end method

.method public abstract isFunction(I)Z
.end method

.method public abstract isInteger(I)Z
.end method

.method public abstract isJavaObject(I)Z
.end method

.method public abstract isNil(I)Z
.end method

.method public abstract isNone(I)Z
.end method

.method public abstract isNoneOrNil(I)Z
.end method

.method public abstract isNumber(I)Z
.end method

.method public abstract isString(I)Z
.end method

.method public abstract isTable(I)Z
.end method

.method public abstract isThread(I)Z
.end method

.method public abstract isUserdata(I)Z
.end method

.method public abstract lessThan(II)Z
.end method

.method public abstract load(Ljava/lang/String;)V
.end method

.method public abstract load(Ljava/nio/Buffer;Ljava/lang/String;)V
.end method

.method public abstract loadExternal(Ljava/lang/String;)V
.end method

.method public abstract newRegisteredMetatable(Ljava/lang/String;)I
.end method

.method public abstract newTable()V
.end method

.method public abstract newThread()Lparty/iroiro/luajava/Lua;
.end method

.method public abstract next(I)I
.end method

.method public abstract openLibraries()V
.end method

.method public abstract openLibrary(Ljava/lang/String;)V
.end method

.method public abstract pCall(II)V
.end method

.method public abstract pop(I)V
.end method

.method public abstract push(J)V
.end method

.method public abstract push(Ljava/lang/Number;)V
.end method

.method public abstract push(Ljava/lang/Object;Lparty/iroiro/luajava/Lua$Conversion;)V
.end method

.method public abstract push(Ljava/lang/String;)V
.end method

.method public abstract push(Ljava/nio/ByteBuffer;)V
.end method

.method public abstract push(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract push(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)V"
        }
    .end annotation
.end method

.method public abstract push(Lparty/iroiro/luajava/JFunction;)V
.end method

.method public abstract push(Lparty/iroiro/luajava/value/LuaFunction;)V
.end method

.method public abstract push(Lparty/iroiro/luajava/value/LuaValue;)V
.end method

.method public abstract push(Z)V
.end method

.method public abstract pushArray(Ljava/lang/Object;)V
.end method

.method public abstract pushJavaArray(Ljava/lang/Object;)V
.end method

.method public abstract pushJavaClass(Ljava/lang/Class;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract pushJavaObject(Ljava/lang/Object;)V
.end method

.method public abstract pushNil()V
.end method

.method public abstract pushThread()V
.end method

.method public abstract pushValue(I)V
.end method

.method public abstract rawEqual(II)Z
.end method

.method public abstract rawGet(I)V
.end method

.method public abstract rawGetI(II)V
.end method

.method public abstract rawLength(I)I
.end method

.method public abstract rawSet(I)V
.end method

.method public abstract rawSetI(II)V
.end method

.method public abstract ref()I
.end method

.method public abstract ref(I)I
.end method

.method public abstract refGet(I)V
.end method

.method public abstract remove(I)V
.end method

.method public abstract replace(I)V
.end method

.method public abstract resume(I)Z
.end method

.method public abstract run(Ljava/lang/String;)V
.end method

.method public abstract run(Ljava/nio/Buffer;Ljava/lang/String;)V
.end method

.method public abstract setExternalLoader(Lparty/iroiro/luajava/ExternalLoader;)V
.end method

.method public abstract setField(ILjava/lang/String;)V
.end method

.method public abstract setGlobal(Ljava/lang/String;)V
.end method

.method public abstract setMetatable(I)V
.end method

.method public abstract setTable(I)V
.end method

.method public abstract setTop(I)V
.end method

.method public abstract status()Lparty/iroiro/luajava/LuaException$LuaError;
.end method

.method public abstract toBoolean(I)Z
.end method

.method public abstract toBuffer(I)Ljava/nio/ByteBuffer;
.end method

.method public abstract toDirectBuffer(I)Ljava/nio/ByteBuffer;
.end method

.method public abstract toInteger(I)J
.end method

.method public abstract toJavaObject(I)Ljava/lang/Object;
.end method

.method public abstract toList(I)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation
.end method

.method public abstract toMap(I)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "**>;"
        }
    .end annotation
.end method

.method public abstract toNumber(I)D
.end method

.method public abstract toObject(I)Ljava/lang/Object;
.end method

.method public abstract toObject(ILjava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract toString(I)Ljava/lang/String;
.end method

.method public abstract type(I)Lparty/iroiro/luajava/Lua$LuaType;
.end method

.method public abstract unRef(II)V
.end method

.method public abstract unref(I)V
.end method

.method public abstract xMove(Lparty/iroiro/luajava/Lua;I)V
.end method

.method public abstract yield(I)V
.end method
