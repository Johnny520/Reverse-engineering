.class Lcom/tendcloud/tenddata/br$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/br;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/tendcloud/tenddata/br;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/br;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tendcloud/tenddata/br;->f:J

    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    iget-wide v1, v0, Lcom/tendcloud/tenddata/br;->f:J

    iget-wide v3, v0, Lcom/tendcloud/tenddata/br;->g:J

    sub-long/2addr v1, v3

    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->a(Lcom/tendcloud/tenddata/br;)J

    move-result-wide v3

    cmp-long v0, v1, v3

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    iget-wide v1, v0, Lcom/tendcloud/tenddata/br;->f:J

    iput-wide v1, v0, Lcom/tendcloud/tenddata/br;->g:J

    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->b(Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/ba;

    move-result-object v1

    iput-object v1, v0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;

    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    iget-object v1, v0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->c(Lcom/tendcloud/tenddata/br;)V

    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->d(Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/ba;

    move-result-object v1

    iput-object v1, v0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;

    :cond_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->d(Lcom/tendcloud/tenddata/br;)Lcom/tendcloud/tenddata/ba;

    move-result-object v1

    iput-object v1, v0, Lcom/tendcloud/tenddata/br;->e:Lcom/tendcloud/tenddata/ba;

    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    iget-object v1, v0, Lcom/tendcloud/tenddata/br;->d:Lcom/tendcloud/tenddata/ba;

    if-eqz v1, :cond_2

    iget-object v2, v0, Lcom/tendcloud/tenddata/br;->e:Lcom/tendcloud/tenddata/ba;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lcom/tendcloud/tenddata/br;->a:Lcom/tendcloud/tenddata/bb;

    invoke-virtual {v0, v1, v2}, Lcom/tendcloud/tenddata/bb;->a(Lcom/tendcloud/tenddata/ba;Lcom/tendcloud/tenddata/ba;)D

    move-result-wide v0

    const-wide v2, 0x3fe999999999999aL    # 0.8

    cmpg-double v0, v0, v2

    if-gez v0, :cond_2

    iget-object v0, p0, Lcom/tendcloud/tenddata/br$1;->this$0:Lcom/tendcloud/tenddata/br;

    invoke-static {v0}, Lcom/tendcloud/tenddata/br;->c(Lcom/tendcloud/tenddata/br;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    nop

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method
