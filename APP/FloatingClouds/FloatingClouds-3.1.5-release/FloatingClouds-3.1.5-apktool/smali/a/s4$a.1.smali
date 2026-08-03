.class public final La/s4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/s4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/s4$a$a;,
        La/s4$a$b;
    }
.end annotation


# direct methods
.method public static a()V
    .locals 7

    sget-object v0, La/s4;->I:La/s4;

    if-eqz v0, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-wide v3, La/s4;->L:J

    sub-long v3, v1, v3

    const-wide/16 v5, 0x1f4

    cmp-long v3, v3, v5

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-gez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    sput-wide v1, La/s4;->L:J

    if-nez v3, :cond_1

    sget-object v1, La/s4$a$a$a;->b:La/s4$a$a$a;

    new-instance v2, La/k4;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, La/k4;-><init>(La/s4;I)V

    invoke-virtual {v0, v5, v1, v2}, La/s4;->y(ZLa/s4$a$a$a;La/s7;)V

    invoke-virtual {v0, v5, v1}, La/s4;->z(ZLa/s4$a$a$a;)V

    :cond_1
    iget-object v1, v0, La/s4;->n:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v1, v0, La/s4;->w:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    iget-object v1, v0, La/s4;->i:Landroid/view/View;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    const-string v2, "HideMainUI: onStateUnhideUser immediate refresh rootView="

    invoke-static {v2, v1}, La/z;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, La/x1;->b([Ljava/lang/Object;)V

    iget-object v1, v0, La/s4;->i:Landroid/view/View;

    if-eqz v1, :cond_3

    :try_start_0
    invoke-virtual {v0, v1}, La/s4;->d(Landroid/view/View;)V

    sget-object v0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    invoke-static {v0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_3
    :goto_2
    invoke-static {}, La/s4;->x()V

    :cond_4
    return-void
.end method

.method public static b(La/s4;)V
    .locals 6

    const-string v0, "instance"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, La/x8;->a:La/x8;

    sget-object v1, La/ca$c;->d:La/ca$c;

    invoke-virtual {v0, v1}, La/x8;->b(La/ca$c;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, La/s4;->K:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1f4

    cmp-long v2, v2, v4

    const/4 v3, 0x1

    if-gez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    sput-wide v0, La/s4;->K:J

    if-nez v2, :cond_1

    sget-object v0, La/s4$a$a$a;->a:La/s4$a$a$a;

    invoke-virtual {p0, v3, v0}, La/s4;->z(ZLa/s4$a$a$a;)V

    new-instance v1, La/k4;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, La/k4;-><init>(La/s4;I)V

    invoke-virtual {p0, v3, v0, v1}, La/s4;->y(ZLa/s4$a$a$a;La/s7;)V

    :cond_1
    iput-boolean v3, p0, La/s4;->h:Z

    invoke-static {}, La/s4;->x()V

    invoke-virtual {p0}, La/s4;->k()V

    iget-object v0, p0, La/s4;->i:Landroid/view/View;

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p0, v0}, La/s4;->c(Landroid/view/View;)V

    sget-object p0, La/Wf;->a:La/Wf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0}, La/xd;->a(Ljava/lang/Throwable;)La/wd$a;

    :cond_2
    return-void
.end method
