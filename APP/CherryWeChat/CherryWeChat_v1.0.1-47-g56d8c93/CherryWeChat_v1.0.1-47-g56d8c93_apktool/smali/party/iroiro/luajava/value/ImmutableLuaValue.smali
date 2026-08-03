.class public abstract Lparty/iroiro/luajava/value/ImmutableLuaValue;
.super Lparty/iroiro/luajava/value/AbstractLuaValue;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableBoolean;,
        Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableNumber;,
        Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableLong;,
        Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lparty/iroiro/luajava/value/AbstractLuaValue<",
        "Lparty/iroiro/luajava/Lua;",
        ">;"
    }
.end annotation


# instance fields
.field protected final value:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lparty/iroiro/luajava/Lua;",
            "Lparty/iroiro/luajava/Lua$LuaType;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/AbstractLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V

    iput-object p3, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    return-void
.end method

.method public static BUFFER(Lparty/iroiro/luajava/Lua;Ljava/nio/ByteBuffer;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 2

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    new-instance p1, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, p0, v0, v1}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;-><init>(Lparty/iroiro/luajava/Lua;Ljava/nio/ByteBuffer;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V

    return-object p1
.end method

.method public static FALSE(Lparty/iroiro/luajava/Lua;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 3

    new-instance v0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableBoolean;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableBoolean;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Boolean;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V

    return-object v0
.end method

.method public static LONG(Lparty/iroiro/luajava/Lua;J)Lparty/iroiro/luajava/value/LuaValue;
    .locals 1

    new-instance v0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableLong;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {v0, p0, p1, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableLong;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Long;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V

    return-object v0
.end method

.method public static NIL(Lparty/iroiro/luajava/Lua;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 3

    new-instance v0, Lparty/iroiro/luajava/value/ImmutableLuaValue$1;

    sget-object v1, Lparty/iroiro/luajava/Lua$LuaType;->NIL:Lparty/iroiro/luajava/Lua$LuaType;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lparty/iroiro/luajava/value/ImmutableLuaValue$1;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;Ljava/lang/Void;)V

    return-object v0
.end method

.method public static NUMBER(Lparty/iroiro/luajava/Lua;D)Lparty/iroiro/luajava/value/LuaValue;
    .locals 1

    new-instance v0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableNumber;

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {v0, p0, p1, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableNumber;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Double;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V

    return-object v0
.end method

.method public static STRING(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 2

    new-instance v0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/String;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V

    return-object v0
.end method

.method public static TRUE(Lparty/iroiro/luajava/Lua;)Lparty/iroiro/luajava/value/LuaValue;
    .locals 3

    new-instance v0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableBoolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableBoolean;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/Boolean;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V

    return-object v0
.end method


# virtual methods
.method public toJavaObject()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    if-nez v0, :cond_0

    const-string v0, "nil"

    return-object v0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
