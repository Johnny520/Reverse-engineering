.class public final LY/d;
.super LY/n;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LY/d;->a:Z

    iput-object p1, p0, LY/d;->b:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LY/d;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LU/S;->t0(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public final c(LY/m;)V
    .locals 1

    iget-object p1, p0, LY/d;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LU/S;->t0(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, LY/d;->a:Z

    return-void
.end method

.method public final d(LY/m;)V
    .locals 2

    iget-boolean v0, p0, LY/d;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LY/d;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LU/S;->t0(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, LY/m;->x(LY/k;)LY/m;

    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, LY/d;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LU/S;->t0(Landroid/view/ViewGroup;Z)V

    return-void
.end method
