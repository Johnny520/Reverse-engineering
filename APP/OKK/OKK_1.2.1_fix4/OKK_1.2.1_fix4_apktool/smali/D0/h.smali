.class public final LD0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/b;
.implements Ljava/io/Serializable;


# instance fields
.field public a:LP0/a;

.field public volatile b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LP0/a;)V
    .locals 1

    const-string v0, "initializer"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/h;->a:LP0/a;

    sget-object p1, LD0/k;->a:LD0/k;

    iput-object p1, p0, LD0/h;->b:Ljava/lang/Object;

    iput-object p0, p0, LD0/h;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LD0/h;->b:Ljava/lang/Object;

    sget-object v1, LD0/k;->a:LD0/k;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LD0/h;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, LD0/h;->b:Ljava/lang/Object;

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LD0/h;->a:LP0/a;

    invoke-static {v1}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-interface {v1}, LP0/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, LD0/h;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, LD0/h;->a:LP0/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LD0/h;->b:Ljava/lang/Object;

    sget-object v1, LD0/k;->a:LD0/k;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, LD0/h;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
