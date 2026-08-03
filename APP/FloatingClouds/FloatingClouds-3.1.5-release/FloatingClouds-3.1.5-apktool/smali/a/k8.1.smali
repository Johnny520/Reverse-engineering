.class public final synthetic La/k8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/m8;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Ljava/util/Set;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/m8;Ljava/util/ArrayList;Ljava/util/Set;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/k8;->a:La/m8;

    iput-object p2, p0, La/k8;->b:Ljava/util/ArrayList;

    iput-object p3, p0, La/k8;->c:Ljava/util/Set;

    iput-object p4, p0, La/k8;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, La/k8;->b:Ljava/util/ArrayList;

    iget-object v1, p0, La/k8;->c:Ljava/util/Set;

    iget-object v2, p0, La/k8;->d:Ljava/lang/Object;

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v5, p0, La/k8;->a:La/m8;

    if-eqz v4, :cond_1

    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5, v4, v1}, La/m8;->v(Ljava/lang/Object;Ljava/util/Set;)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    const-string v0, "c"

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0, v3}, La/m8;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    :goto_1
    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    return-void
.end method
