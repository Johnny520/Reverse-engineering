.class public final synthetic Lf0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/ClassLoader;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lf0/e;

.field public final synthetic e:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Ljava/lang/String;Lf0/e;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lf0/d;->b:Ljava/lang/ClassLoader;

    iput-object p3, p0, Lf0/d;->c:Ljava/lang/String;

    iput-object p4, p0, Lf0/d;->d:Lf0/e;

    iput-object p5, p0, Lf0/d;->e:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    iget-object v1, p0, Lf0/d;->a:Landroid/content/Context;

    iget-object v2, p0, Lf0/d;->b:Ljava/lang/ClassLoader;

    iget-object v3, p0, Lf0/d;->c:Ljava/lang/String;

    sget-object v4, Lf0/i;->b:Landroid/os/Handler;

    sget-object v5, Lf0/i;->a:Lf0/i;

    iget-object v5, p0, Lf0/d;->d:Lf0/e;

    const-string v6, "$progress"

    invoke-static {v5, v6}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lf0/d;->e:Landroid/app/Activity;

    const-string v7, "$activity"

    invoke-static {v6, v7}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {v1}, LQ0/g;->b(Ljava/lang/Object;)V

    invoke-static {v2}, LQ0/g;->b(Ljava/lang/Object;)V

    new-instance v7, Lf0/b;

    invoke-direct {v7, v5, v0}, Lf0/b;-><init>(Lf0/e;I)V

    invoke-static {v1, v7, v2, v3}, LU/S;->e0(Landroid/content/Context;Lf0/b;Ljava/lang/ClassLoader;Ljava/lang/String;)Lb0/a;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v2, "after-interactive-probe"

    invoke-static {v2}, Lf0/Z;->a(Ljava/lang/String;)V

    invoke-static {v1}, Lf0/i;->e(Lb0/a;)Lb0/a;

    move-result-object v1

    new-instance v2, Lf0/c;

    invoke-direct {v2, v5, v1, v6, v0}, Lf0/c;-><init>(Lf0/e;Lb0/a;Landroid/app/Activity;I)V

    invoke-virtual {v4, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "probe crash: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lf0/i;->g(Ljava/lang/String;)V

    new-instance v1, Landroidx/emoji2/text/k;

    const/4 v2, 0x4

    invoke-direct {v1, v5, v6, v0, v2}, Landroidx/emoji2/text/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method
