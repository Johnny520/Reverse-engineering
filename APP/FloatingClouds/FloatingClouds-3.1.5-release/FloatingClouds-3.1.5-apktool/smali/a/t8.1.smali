.class public final synthetic La/t8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:La/u8;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(La/u8;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/t8;->a:La/u8;

    iput-object p2, p0, La/t8;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    iget-object v0, p0, La/t8;->a:La/u8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La/K3;->a:La/K3$a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, La/K3$a;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, La/K3$a;->i()La/jc;

    move-result-object v1

    iget-boolean v1, v1, La/jc;->m:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, La/t8;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, La/u8;->a(Landroid/view/View;)V

    :cond_0
    return-void
.end method
