.class Lparty/iroiro/luajava/JuaAPI$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/JFunction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lparty/iroiro/luajava/JuaAPI;->loadLib(ILjava/lang/String;Ljava/lang/String;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic val$method:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lparty/iroiro/luajava/JuaAPI$1;->val$method:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public __call(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lparty/iroiro/luajava/JuaAPI$1;->val$method:Ljava/lang/reflect/Method;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p1

    return p1

    :goto_1
    invoke-interface {p1, v0}, Lparty/iroiro/luajava/Lua;->error(Ljava/lang/Throwable;)I

    move-result p1

    return p1
.end method
