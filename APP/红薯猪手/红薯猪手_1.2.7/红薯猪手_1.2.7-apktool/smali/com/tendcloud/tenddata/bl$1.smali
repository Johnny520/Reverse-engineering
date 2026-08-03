.class final Lcom/tendcloud/tenddata/bl$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tendcloud/tenddata/bl;->f(Lcom/tendcloud/tenddata/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic val$feature:Lcom/tendcloud/tenddata/a;


# direct methods
.method public constructor <init>(Lcom/tendcloud/tenddata/a;)V
    .locals 0

    iput-object p1, p0, Lcom/tendcloud/tenddata/bl$1;->val$feature:Lcom/tendcloud/tenddata/a;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    invoke-static {}, Lcom/tendcloud/tenddata/l;->a()V

    iget-object v0, p0, Lcom/tendcloud/tenddata/bl$1;->val$feature:Lcom/tendcloud/tenddata/a;

    invoke-static {v0}, Lcom/tendcloud/tenddata/bl;->a(Lcom/tendcloud/tenddata/a;)V

    invoke-static {}, Lcom/tendcloud/tenddata/bl;->b()V

    iget-object v0, p0, Lcom/tendcloud/tenddata/bl$1;->val$feature:Lcom/tendcloud/tenddata/a;

    invoke-static {v0}, Lcom/tendcloud/tenddata/bl;->b(Lcom/tendcloud/tenddata/a;)V

    return-void
.end method
