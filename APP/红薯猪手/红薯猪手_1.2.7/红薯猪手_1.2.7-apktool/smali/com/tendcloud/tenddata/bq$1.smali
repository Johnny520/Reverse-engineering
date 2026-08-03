.class Lcom/tendcloud/tenddata/bq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bq;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/tendcloud/tenddata/bq;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/bq;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bq$1;->this$0:Lcom/tendcloud/tenddata/bq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/bq$1;->this$0:Lcom/tendcloud/tenddata/bq;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tendcloud/tenddata/bq;->b:J

    iget-object v0, p0, Lcom/tendcloud/tenddata/bq$1;->this$0:Lcom/tendcloud/tenddata/bq;

    iget v1, v0, Lcom/tendcloud/tenddata/bq;->d:I

    iget v2, v0, Lcom/tendcloud/tenddata/bq;->e:I

    if-eq v1, v2, :cond_0

    const/4 v2, 0x1

    if-le v1, v2, :cond_0

    iget-wide v1, v0, Lcom/tendcloud/tenddata/bq;->b:J

    iget-wide v3, v0, Lcom/tendcloud/tenddata/bq;->c:J

    sub-long/2addr v1, v3

    const-wide/32 v3, 0x2bf20

    cmp-long v0, v1, v3

    if-lez v0, :cond_0

    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string v1, "env"

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    const-string v1, "cellUpdate"

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    sget-object v1, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/tendcloud/tenddata/bq$1;->this$0:Lcom/tendcloud/tenddata/bq;

    iget-wide v1, v0, Lcom/tendcloud/tenddata/bq;->b:J

    iput-wide v1, v0, Lcom/tendcloud/tenddata/bq;->c:J

    iget v1, v0, Lcom/tendcloud/tenddata/bq;->d:I

    iput v1, v0, Lcom/tendcloud/tenddata/bq;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method
