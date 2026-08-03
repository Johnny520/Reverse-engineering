.class public final Landroidx/transition/a$f;
.super Landroidx/transition/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public a:Z

.field public final b:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/transition/a$f;->a:Z

    iput-object p1, p0, Landroidx/transition/a$f;->b:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Landroidx/transition/a$f;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/Ag;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public final e(Landroidx/transition/e;)V
    .locals 1

    iget-object p1, p0, Landroidx/transition/a$f;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/Ag;->a(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/transition/a$f;->a:Z

    return-void
.end method

.method public final f(Landroidx/transition/e;)V
    .locals 2

    iget-boolean v0, p0, Landroidx/transition/a$f;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/transition/a$f;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/Ag;->a(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, Landroidx/transition/e;->y(Landroidx/transition/e$f;)Landroidx/transition/e;

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Landroidx/transition/a$f;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-static {v0, v1}, La/Ag;->a(Landroid/view/ViewGroup;Z)V

    return-void
.end method
