.class public final Landroidx/transition/h$b;
.super Landroidx/transition/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/h;->x()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/transition/h;


# direct methods
.method public constructor <init>(Landroidx/transition/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/transition/h$b;->a:Landroidx/transition/h;

    return-void
.end method


# virtual methods
.method public final e(Landroidx/transition/e;)V
    .locals 2

    iget-object v0, p0, Landroidx/transition/h$b;->a:Landroidx/transition/h;

    iget-object v1, v0, Landroidx/transition/h;->C:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Landroidx/transition/h;->s()Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Landroidx/transition/e$g;->c:La/z;

    const/4 v1, 0x0

    invoke-virtual {v0, v0, p1, v1}, Landroidx/transition/e;->v(Landroidx/transition/e;Landroidx/transition/e$g;Z)V

    const/4 p1, 0x1

    iput-boolean p1, v0, Landroidx/transition/e;->r:Z

    sget-object p1, Landroidx/transition/e$g;->b:La/z;

    invoke-virtual {v0, v0, p1, v1}, Landroidx/transition/e;->v(Landroidx/transition/e;Landroidx/transition/e$g;Z)V

    :cond_0
    return-void
.end method
