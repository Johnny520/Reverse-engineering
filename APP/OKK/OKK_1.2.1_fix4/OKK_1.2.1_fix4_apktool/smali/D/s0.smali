.class public final LD/s0;
.super LA0/p;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/WindowInsetsController;

.field public final b:LD/d;


# direct methods
.method public constructor <init>(Landroid/view/WindowInsetsController;LD/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/s0;->a:Landroid/view/WindowInsetsController;

    iput-object p2, p0, LD/s0;->b:LD/d;

    return-void
.end method


# virtual methods
.method public final Y()V
    .locals 2

    iget-object v0, p0, LD/s0;->b:LD/d;

    iget-object v0, v0, LD/d;->b:Ljava/lang/Object;

    check-cast v0, LD/d;

    invoke-virtual {v0}, LD/d;->A()V

    iget-object v0, p0, LD/s0;->a:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LD/v;->s(Landroid/view/WindowInsetsController;I)V

    return-void
.end method
