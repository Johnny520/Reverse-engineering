.class Lcom/tendcloud/tenddata/bi$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bi;->a(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/tendcloud/tenddata/bi;

.field public final synthetic val$context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/bi;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bi$1;->this$0:Lcom/tendcloud/tenddata/bi;

    iput-object p2, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/cf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cf;->reflectMSA(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v0, Lcom/tendcloud/tenddata/bi;->a:Ljava/util/concurrent/CountDownLatch;

    const-wide/16 v1, 0x2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    invoke-static {}, Lcom/tendcloud/tenddata/df;->a()Lcom/tendcloud/tenddata/df;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tendcloud/tenddata/df;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/tendcloud/tenddata/y;->b(Ljava/lang/String;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_0

    return-void

    :catchall_0
    :cond_0
    :try_start_2
    invoke-static {}, Lcom/tendcloud/tenddata/cm;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cm;->reflectMiUi(Landroid/content/Context;)V

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cb;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cb;->bindHonorServiceGetOAID(Landroid/content/Context;)V

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->bindHWServiceGetOAID(Landroid/content/Context;)V

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/ck;->bindSECServiceGetOAID(Landroid/content/Context;)V

    goto/16 :goto_0

    :cond_4
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cj;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cj;->bindOPPOServiceGetOAID(Landroid/content/Context;)V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/ci;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/ci;->bindONEPLUSServiceGetOAID(Landroid/content/Context;)V

    goto :goto_0

    :cond_6
    invoke-static {}, Lcom/tendcloud/tenddata/cl;->a()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cl;->reflectVIVO(Landroid/content/Context;)V

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/bz;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/bz;->bindASUSServiceGetOAID(Landroid/content/Context;)V

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/ce;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/ce;->reflectMEiZU(Landroid/content/Context;)V

    goto :goto_0

    :cond_9
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cn;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cn;->bindZTEServiceGetOAID(Landroid/content/Context;)V

    goto :goto_0

    :cond_a
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cd;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cd;->bindLENOVOServiceGetOAID(Landroid/content/Context;)V

    goto :goto_0

    :cond_b
    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cg;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/tendcloud/tenddata/bi$1;->val$context:Landroid/content/Context;

    invoke-static {v0}, Lcom/tendcloud/tenddata/cg;->reflectNUBIA(Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :cond_c
    :goto_0
    return-void
.end method
