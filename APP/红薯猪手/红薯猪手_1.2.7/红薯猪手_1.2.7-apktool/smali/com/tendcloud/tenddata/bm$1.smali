.class Lcom/tendcloud/tenddata/bm$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bm;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic this$0:Lcom/tendcloud/tenddata/bm;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/bm;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bm$1;->this$0:Lcom/tendcloud/tenddata/bm;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    iget p1, p1, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/bm$1;->this$0:Lcom/tendcloud/tenddata/bm;

    invoke-static {p1}, Lcom/tendcloud/tenddata/bm;->a(Lcom/tendcloud/tenddata/bm;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/tendcloud/tenddata/bm$1;->this$0:Lcom/tendcloud/tenddata/bm;

    invoke-static {p1}, Lcom/tendcloud/tenddata/bm;->a(Lcom/tendcloud/tenddata/bm;)V

    goto :goto_1

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/tendcloud/tenddata/bm$1;->this$0:Lcom/tendcloud/tenddata/bm;

    invoke-static {p1}, Lcom/tendcloud/tenddata/bm;->b(Lcom/tendcloud/tenddata/bm;)V

    :goto_1
    return-void
.end method
