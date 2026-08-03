.class public final Landroidx/transition/h$c;
.super Landroidx/transition/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Landroidx/transition/h;


# virtual methods
.method public final d(Landroidx/transition/e;)V
    .locals 1

    iget-object p1, p0, Landroidx/transition/h$c;->a:Landroidx/transition/h;

    iget-boolean v0, p1, Landroidx/transition/h;->F:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroidx/transition/e;->I()V

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/transition/h;->F:Z

    :cond_0
    return-void
.end method

.method public final f(Landroidx/transition/e;)V
    .locals 2

    iget-object v0, p0, Landroidx/transition/h$c;->a:Landroidx/transition/h;

    iget v1, v0, Landroidx/transition/h;->E:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Landroidx/transition/h;->E:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/transition/h;->F:Z

    invoke-virtual {v0}, Landroidx/transition/e;->m()V

    :cond_0
    invoke-virtual {p1, p0}, Landroidx/transition/e;->y(Landroidx/transition/e$f;)Landroidx/transition/e;

    return-void
.end method
