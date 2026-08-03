.class public final LY6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LZ6;

.field public final synthetic b:Lqr;

.field public final synthetic c:Llr;

.field public final synthetic d:LD2;


# direct methods
.method public constructor <init>(LD2;LZ6;Lqr;Llr;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY6;->d:LD2;

    iput-object p2, p0, LY6;->a:LZ6;

    iput-object p3, p0, LY6;->b:Lqr;

    iput-object p4, p0, LY6;->c:Llr;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LY6;->d:LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, La7;

    iget-object v1, p0, LY6;->a:LZ6;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    iput-boolean v2, v0, La7;->z:Z

    iget-object v1, v1, LZ6;->b:Llr;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Llr;->c(Z)V

    iput-boolean v2, v0, La7;->z:Z

    :cond_0
    iget-object v0, p0, LY6;->b:Lqr;

    invoke-virtual {v0}, Lqr;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lqr;->hasSubMenu()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    const/4 v2, 0x0

    iget-object v3, p0, LY6;->c:Llr;

    invoke-virtual {v3, v0, v2, v1}, Llr;->q(Landroid/view/MenuItem;LDr;I)Z

    :cond_1
    return-void
.end method
