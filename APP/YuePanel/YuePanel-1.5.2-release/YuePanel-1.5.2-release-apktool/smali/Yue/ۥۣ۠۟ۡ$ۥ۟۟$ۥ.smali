.class public final LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠۟ۡ$ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Ljava/util/Set;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LYue/\u06e5\u06e0\u06e3\u06df\u06e1$\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟:LYue/ۥۣ۠۟ۡ$ۥ۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟:Ljava/util/Map;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "LYue/\u06e5\u06e2\u06e5\u06df\u06e1;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ۟۟:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final ۥ(Ljava/lang/Class;Ljava/lang/Class;)LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Landroidx/fragment/app/Fragment;",
            ">;",
            "Ljava/lang/Class<",
            "+",
            "LYue/\u06e5\u06e2\u06e5\u06df\u06e1;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e3\u06df\u06e1$\u06e5\u06df\u06df$\u06e5;"
        }
    .end annotation

    const-string v0, "fragmentClass"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "violationClass"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "fragmentClassString"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ۟(Ljava/lang/String;Ljava/lang/Class;)LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟(Ljava/lang/String;Ljava/lang/Class;)LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "+",
            "LYue/\u06e5\u06e2\u06e5\u06df\u06e1;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e3\u06df\u06e1$\u06e5\u06df\u06df$\u06e5;"
        }
    .end annotation

    const-string v0, "fragmentClass"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "violationClass"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ۟۟:Ljava/util/Map;

    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ۥ۟۟()LYue/ۥۣ۠۟ۡ$ۥ۟۟;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۣ۠۟ۡ$ۥ۟;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ۟۟۟ۧ()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;

    :cond_0
    new-instance v0, LYue/ۥۣ۠۟ۡ$ۥ۟۟;

    iget-object v1, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    iget-object v2, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۣ۠۟ۡ$ۥ۟;

    iget-object v3, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ۟۟:Ljava/util/Map;

    invoke-direct {v0, v1, v2, v3}, LYue/ۥۣ۠۟ۡ$ۥ۟۟;-><init>(Ljava/util/Set;LYue/ۥۣ۠۟ۡ$ۥ۟;Ljava/util/Map;)V

    return-object v0
.end method

.method public final ۥ۟۟۟()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ۥ۟۟۟۟()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ۥ۟۟۟۠()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۨ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ۥ۟۟۟ۡ()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟ۡ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟ۡ۟:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ۥۣ۟۟۟()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟ۡ۠:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ۥ۟۟۟ۤ()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ۥ۟۟۟ۥ()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥ۟۟۠ۤ:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final ۥ۟۟۟ۦ(LYue/ۥۣ۠۟ۡ$ۥ۟;)LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 1
    .param p1    # LYue/ۥۣ۠۟ۡ$ۥ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ۟:LYue/ۥۣ۠۟ۡ$ۥ۟;

    return-object p0
.end method

.method public final ۥ۟۟۟ۧ()LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BuilderSetStyle"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠۟ۡ$ۥ۟۟$ۥ;->ۥ:Ljava/util/Set;

    sget-object v1, LYue/ۥۣ۠۟ۡ$ۥ;->ۥۣ۟۟۠:LYue/ۥۣ۠۟ۡ$ۥ;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
