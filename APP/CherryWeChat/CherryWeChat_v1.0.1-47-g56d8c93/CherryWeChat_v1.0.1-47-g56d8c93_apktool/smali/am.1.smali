.class public final synthetic Lam;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lparty/iroiro/luajava/JFunction;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lam;->a:Ljava/util/List;

    iput-object p2, p0, Lam;->b:Ljava/lang/Object;

    iput-object p3, p0, Lam;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final __call(Lparty/iroiro/luajava/Lua;)I
    .locals 3

    iget-object v0, p0, Lam;->b:Ljava/lang/Object;

    iget-object v1, p0, Lam;->c:Ljava/lang/String;

    iget-object v2, p0, Lam;->a:Ljava/util/List;

    invoke-static {v2, v0, v1, p1}, Lio/github/cherrywechat/lua/bridge/JavaImporter;->d(Ljava/util/List;Ljava/lang/Object;Ljava/lang/String;Lparty/iroiro/luajava/Lua;)I

    move-result p1

    return p1
.end method
