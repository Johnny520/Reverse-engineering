.class public abstract LYue/ۥۣۢ۠۠;
.super LYue/ۥ۠ۡ۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۢ۠۠$ۥ۟۟۟;,
        LYue/ۥۣۢ۠۠$ۥ۟۟۟ۢ;,
        LYue/ۥۣۢ۠۠$ۥ۟۟;,
        LYue/ۥۣۢ۠۠$ۥ۟;,
        LYue/ۥۣۢ۠۠$ۥ۟۟۟ۡ;,
        LYue/ۥۣۢ۠۠$ۥ۟۟۟۠;,
        LYue/ۥۣۢ۠۠$ۥ۟۟۟۟;,
        LYue/ۥۣۢ۠۠$ۥ;,
        LYue/ۥۣۢ۠۠$ۥۣ۟۟۟;
    }
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۠ۡ۠ۤ;

.field public final ۥ۟:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/IdentityHashMap<",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e5;",
            "Ljava/util/IdentityHashMap<",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e5;",
            "Ljava/lang/Boolean;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡ۠ۤ;)V
    .locals 1

    invoke-direct {p0}, LYue/ۥ۠ۡ۠ۤ;-><init>()V

    new-instance v0, LYue/ۥۣۢ۠;

    invoke-direct {v0}, LYue/ۥۣۢ۠;-><init>()V

    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۣۢ۠۠;->ۥ۟:Ljava/lang/ThreadLocal;

    iput-object p1, p0, LYue/ۥۣۢ۠۠;->ۥ:LYue/ۥ۠ۡ۠ۤ;

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢ۠۠;->ۥ۟:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/IdentityHashMap;

    invoke-virtual {v0}, Ljava/util/IdentityHashMap;->clear()V

    invoke-super {p0}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟۟۠()V

    return-void
.end method

.method public ۥ۟۟۟ۡ(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢ۠۠;->ۥ۟:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/IdentityHashMap;

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/IdentityHashMap;

    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-virtual {v0, p1, v1}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v1, p2}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-nez v0, :cond_1

    iget-object v0, p0, LYue/ۥۣۢ۠۠;->ۥ:LYue/ۥ۠ۡ۠ۤ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, p2, v0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method
