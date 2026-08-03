.class public final Landroidx/lifecycle/h$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroidx/lifecycle/e$b;

.field public b:Landroidx/lifecycle/g;


# virtual methods
.method public final a(La/y9;Landroidx/lifecycle/e$a;)V
    .locals 3

    invoke-virtual {p2}, Landroidx/lifecycle/e$a;->a()Landroidx/lifecycle/e$b;

    move-result-object v0

    iget-object v1, p0, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    const-string v2, "state1"

    invoke-static {v1, v2}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_0

    move-object v1, v0

    :cond_0
    iput-object v1, p0, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    iget-object v1, p0, Landroidx/lifecycle/h$a;->b:Landroidx/lifecycle/g;

    invoke-interface {v1, p1, p2}, Landroidx/lifecycle/g;->a(La/y9;Landroidx/lifecycle/e$a;)V

    iput-object v0, p0, Landroidx/lifecycle/h$a;->a:Landroidx/lifecycle/e$b;

    return-void
.end method
