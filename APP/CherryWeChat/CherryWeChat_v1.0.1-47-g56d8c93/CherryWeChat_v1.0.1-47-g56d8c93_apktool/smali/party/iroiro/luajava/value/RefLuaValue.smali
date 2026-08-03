.class public Lparty/iroiro/luajava/value/RefLuaValue;
.super Lparty/iroiro/luajava/value/AbstractRefLuaValue;
.source ""


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;-><init>(Lparty/iroiro/luajava/Lua;Lparty/iroiro/luajava/Lua$LuaType;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "$"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->type:Lparty/iroiro/luajava/Lua$LuaType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lparty/iroiro/luajava/value/AbstractLuaValue;->L:Lparty/iroiro/luajava/Lua;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lparty/iroiro/luajava/value/AbstractRefLuaValue;->getReference()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
