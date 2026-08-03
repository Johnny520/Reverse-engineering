.class final Lcom/tendcloud/tenddata/bo$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bo;->a(Ljava/lang/String;ZLjava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic val$data:Ljava/util/Map;

.field public final synthetic val$host:Ljava/lang/String;

.field public final synthetic val$sendStatusSuccess:Z


# direct methods
.method public constructor <init>(Ljava/util/Map;ZLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    iput-boolean p2, p0, Lcom/tendcloud/tenddata/bo$1;->val$sendStatusSuccess:Z

    iput-object p3, p0, Lcom/tendcloud/tenddata/bo$1;->val$host:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/tendcloud/tenddata/bo$1;->val$sendStatusSuccess:Z

    iget-object v1, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    const-string v2, "targetUrl"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/tendcloud/tenddata/bo$1;->val$host:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/tendcloud/tenddata/bo;->a(ZLjava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " host: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tendcloud/tenddata/bo$1;->val$host:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/tendcloud/tenddata/h;->dForInternal([Ljava/lang/String;)V

    new-instance v0, Lcom/tendcloud/tenddata/bv;

    invoke-direct {v0}, Lcom/tendcloud/tenddata/bv;-><init>()V

    const-string v1, "sdk"

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->b:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/tendcloud/tenddata/bo$1;->val$sendStatusSuccess:Z

    if-eqz v1, :cond_1

    const-string v1, "send_ok"

    goto :goto_0

    :cond_1
    const-string v1, "send_fail"

    :goto_0
    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/tendcloud/tenddata/bo$1;->val$data:Ljava/util/Map;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->d:Ljava/util/Map;

    sget-object v1, Lcom/tendcloud/tenddata/a;->ENV:Lcom/tendcloud/tenddata/a;

    iput-object v1, v0, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-static {}, Lcom/tendcloud/tenddata/z;->a()Lcom/tendcloud/tenddata/z;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tendcloud/tenddata/z;->post(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    return-void
.end method
