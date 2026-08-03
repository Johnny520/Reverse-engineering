.class public final La/Ue$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/Ue;->a(Landroid/app/Activity;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/Ue;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/app/Activity;


# direct methods
.method public constructor <init>(La/Ue;Landroid/view/View;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/Ue$a;->a:La/Ue;

    iput-object p2, p0, La/Ue$a;->b:Landroid/view/View;

    iput-object p3, p0, La/Ue$a;->c:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    iget-object v0, p0, La/Ue$a;->a:La/Ue;

    iget v1, v0, La/Ue;->n:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, La/Ue;->n:I

    iget-object v1, p0, La/Ue$a;->b:Landroid/view/View;

    iget-object v2, p0, La/Ue$a;->c:Landroid/app/Activity;

    invoke-virtual {v0, v2, v1}, La/Ue;->d(Landroid/app/Activity;Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_0

    iget v2, v0, La/Ue;->n:I

    const/4 v3, 0x5

    if-lt v2, v3, :cond_2

    :cond_0
    invoke-virtual {v0, v1}, La/Ue;->e(Landroid/view/View;)V

    iget-object v1, v0, La/Ue;->a:Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v0}, La/Ue;->f()V

    :cond_2
    return-void
.end method
