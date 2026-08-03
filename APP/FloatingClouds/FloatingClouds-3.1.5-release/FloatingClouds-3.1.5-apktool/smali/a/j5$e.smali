.class public final La/j5$e;
.super La/a2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/j5;->a()La/a2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/fragment/app/b$c;

.field public final synthetic b:La/j5;


# direct methods
.method public constructor <init>(La/j5;Landroidx/fragment/app/b$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j5$e;->b:La/j5;

    iput-object p2, p0, La/j5$e;->a:Landroidx/fragment/app/b$c;

    return-void
.end method


# virtual methods
.method public final c(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, La/j5$e;->a:Landroidx/fragment/app/b$c;

    invoke-virtual {v0}, Landroidx/fragment/app/b$c;->f()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Landroidx/fragment/app/b$c;->c(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, La/j5$e;->b:La/j5;

    iget-object v0, v0, La/j5;->g0:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, La/j5$e;->a:Landroidx/fragment/app/b$c;

    invoke-virtual {v0}, Landroidx/fragment/app/b$c;->f()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La/j5$e;->b:La/j5;

    iget-boolean v0, v0, La/j5;->j0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
