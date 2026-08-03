.class public final La/o2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/o2;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/o2;


# direct methods
.method public constructor <init>(La/o2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/o2$a;->a:La/o2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, La/o2$a;->a:La/o2;

    iget-object v0, v0, La/o2;->f:Ljava/lang/Runnable;

    if-eq p0, v0, :cond_0

    return-void

    :cond_0
    sget-object v0, La/x8;->a:La/x8;

    invoke-static {}, La/x8;->a()Z

    move-result v0

    const-wide/16 v1, 0x1388

    if-eqz v0, :cond_1

    iget-object v0, p0, La/o2$a;->a:La/o2;

    iget-object v0, v0, La/o2;->e:Landroid/os/Handler;

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    iget-object v0, p0, La/o2$a;->a:La/o2;

    iget v0, v0, La/o2;->g:I

    iget-object v3, p0, La/o2$a;->a:La/o2;

    const/4 v4, 0x1

    add-int/2addr v0, v4

    iput v0, v3, La/o2;->g:I

    iget-object v0, p0, La/o2$a;->a:La/o2;

    iget v0, v0, La/o2;->g:I

    const/16 v3, 0x3c

    if-gt v0, v3, :cond_2

    const-wide/16 v1, 0x3e8

    :cond_2
    iget-object v0, p0, La/o2$a;->a:La/o2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/o2;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, La/o2$a;->a:La/o2;

    iget-boolean v0, v0, La/o2;->a:Z

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, La/o2$a;->a:La/o2;

    invoke-virtual {v0}, La/o2;->l()V

    iget-object v0, p0, La/o2$a;->a:La/o2;

    iget-object v0, v0, La/o2;->c:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, La/o2$a;->a:La/o2;

    invoke-virtual {v0}, La/o2;->k()V

    iget-object v0, p0, La/o2$a;->a:La/o2;

    invoke-virtual {v0}, La/o2;->j()V

    iget-object v0, p0, La/o2$a;->a:La/o2;

    iget v0, v0, La/o2;->g:I

    if-gt v0, v3, :cond_4

    const-string v0, "fast"

    goto :goto_0

    :cond_4
    const-string v0, "slow"

    :goto_0
    iget-object v1, p0, La/o2$a;->a:La/o2;

    iget v1, v1, La/o2;->g:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "BoldBottomTab: DB checker: all read, bold reset (after "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " checks, "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/x1;->b([Ljava/lang/Object;)V

    return-void

    :cond_5
    iget-object v0, p0, La/o2$a;->a:La/o2;

    invoke-virtual {v0}, La/o2;->k()V

    iget-object v0, p0, La/o2$a;->a:La/o2;

    iget-object v0, v0, La/o2;->e:Landroid/os/Handler;

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_6
    :goto_1
    iget-object v0, p0, La/o2$a;->a:La/o2;

    invoke-virtual {v0}, La/o2;->j()V

    return-void
.end method
