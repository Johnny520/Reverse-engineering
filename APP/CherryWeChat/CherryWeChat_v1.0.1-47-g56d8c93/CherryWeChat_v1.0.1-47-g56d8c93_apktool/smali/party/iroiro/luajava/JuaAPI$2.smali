.class Lparty/iroiro/luajava/JuaAPI$2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/JuaAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lparty/iroiro/luajava/JuaAPI$ExecutableWrapper<",
        "Ljava/lang/reflect/Constructor<",
        "*>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic getParameterTypes(Ljava/lang/Object;)[Ljava/lang/Class;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/reflect/Constructor;

    invoke-virtual {p0, p1}, Lparty/iroiro/luajava/JuaAPI$2;->getParameterTypes(Ljava/lang/reflect/Constructor;)[Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method

.method public getParameterTypes(Ljava/lang/reflect/Constructor;)[Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    return-object p1
.end method
