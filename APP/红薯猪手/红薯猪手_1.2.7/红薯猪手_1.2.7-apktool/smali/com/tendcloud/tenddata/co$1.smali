.class Lcom/tendcloud/tenddata/co$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/co;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/tendcloud/tenddata/co;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/co;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/co$1;->this$0:Lcom/tendcloud/tenddata/co;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    :try_start_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/tendcloud/tenddata/a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/tendcloud/tenddata/a;

    iget-object v0, p0, Lcom/tendcloud/tenddata/co$1;->this$0:Lcom/tendcloud/tenddata/co;

    invoke-static {v0, p1}, Lcom/tendcloud/tenddata/co;->a(Lcom/tendcloud/tenddata/co;Lcom/tendcloud/tenddata/a;)V

    :cond_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/co$1;->this$0:Lcom/tendcloud/tenddata/co;

    invoke-static {p1}, Lcom/tendcloud/tenddata/co;->a(Lcom/tendcloud/tenddata/co;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
