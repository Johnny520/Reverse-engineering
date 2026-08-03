.class public Lparty/iroiro/luajava/LuaInstances$Token;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lparty/iroiro/luajava/LuaInstances;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Token"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lparty/iroiro/luajava/LuaInstances$Token$Consumer;
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
.field public final id:I

.field public final setter:Lparty/iroiro/luajava/LuaInstances$Token$Consumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lparty/iroiro/luajava/LuaInstances$Token$Consumer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILparty/iroiro/luajava/LuaInstances$Token$Consumer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lparty/iroiro/luajava/LuaInstances$Token$Consumer<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lparty/iroiro/luajava/LuaInstances$Token;->id:I

    .line 4
    iput-object p2, p0, Lparty/iroiro/luajava/LuaInstances$Token;->setter:Lparty/iroiro/luajava/LuaInstances$Token$Consumer;

    return-void
.end method

.method public synthetic constructor <init>(ILparty/iroiro/luajava/LuaInstances$Token$Consumer;Lparty/iroiro/luajava/LuaInstances$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lparty/iroiro/luajava/LuaInstances$Token;-><init>(ILparty/iroiro/luajava/LuaInstances$Token$Consumer;)V

    return-void
.end method
