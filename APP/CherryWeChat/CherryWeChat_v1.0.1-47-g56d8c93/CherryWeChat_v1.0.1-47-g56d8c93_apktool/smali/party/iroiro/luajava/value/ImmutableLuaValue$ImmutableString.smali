.class final Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;
.super Lparty/iroiro/luajava/value/ImmutableLuaValue;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/value/ImmutableLuaValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ImmutableString"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lparty/iroiro/luajava/value/ImmutableLuaValue<",
        "Ljava/nio/ByteBuffer;",
        ">;"
    }
.end annotation


# instance fields
.field private javaString:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)V
    .locals 2

    .line 5
    sget-object v0, Lparty/iroiro/luajava/Lua$LuaType;->STRING:Lparty/iroiro/luajava/Lua$LuaType;

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-static {v1}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lparty/iroiro/luajava/value/ImmutableLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;Ljava/lang/Object;)V

    .line 6
    iput-object p2, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;->javaString:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/lang/String;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;-><init>(Lparty/iroiro/luajava/Lua;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 3
    sget-object v0, Lparty/iroiro/luajava/Lua$LuaType;->STRING:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-direct {p0, p1, v0, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 4
    iput-object p1, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;->javaString:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lparty/iroiro/luajava/Lua;Ljava/nio/ByteBuffer;Lparty/iroiro/luajava/value/ImmutableLuaValue$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;-><init>(Lparty/iroiro/luajava/Lua;Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method private static wrap([B)Ljava/nio/ByteBuffer;
    .locals 1

    array-length v0, p0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public length()I
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    return v0
.end method

.method public push(Lparty/iroiro/luajava/Lua;)V
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->push(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public toBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public toJavaObject()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;->javaString:Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    iget-object v1, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue;->value:Ljava/lang/Object;

    check-cast v1, Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;->javaString:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lparty/iroiro/luajava/value/ImmutableLuaValue$ImmutableString;->javaString:Ljava/lang/String;

    return-object v0
.end method
