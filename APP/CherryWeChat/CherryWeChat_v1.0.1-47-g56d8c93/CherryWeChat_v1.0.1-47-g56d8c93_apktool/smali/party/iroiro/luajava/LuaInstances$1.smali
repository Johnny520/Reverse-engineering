.class Lparty/iroiro/luajava/LuaInstances$1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/LuaInstances$Token$Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lparty/iroiro/luajava/LuaInstances;->add()Lparty/iroiro/luajava/LuaInstances$Token;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lparty/iroiro/luajava/LuaInstances$Token$Consumer<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lparty/iroiro/luajava/LuaInstances;

.field final synthetic val$id:I


# direct methods
.method public constructor <init>(Lparty/iroiro/luajava/LuaInstances;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lparty/iroiro/luajava/LuaInstances$1;->this$0:Lparty/iroiro/luajava/LuaInstances;

    iput p2, p0, Lparty/iroiro/luajava/LuaInstances$1;->val$id:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lparty/iroiro/luajava/LuaInstances$1;->this$0:Lparty/iroiro/luajava/LuaInstances;

    iget v1, p0, Lparty/iroiro/luajava/LuaInstances$1;->val$id:I

    invoke-static {v0, v1, p1}, Lparty/iroiro/luajava/LuaInstances;->access$000(Lparty/iroiro/luajava/LuaInstances;ILjava/lang/Object;)V

    return-void
.end method
