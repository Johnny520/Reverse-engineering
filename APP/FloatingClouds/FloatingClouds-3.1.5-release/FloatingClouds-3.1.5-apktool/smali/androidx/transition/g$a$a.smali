.class public final Landroidx/transition/g$a$a;
.super Landroidx/transition/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/g$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/J1;

.field public final synthetic b:Landroidx/transition/g$a;


# direct methods
.method public constructor <init>(Landroidx/transition/g$a;La/J1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/transition/g$a$a;->b:Landroidx/transition/g$a;

    iput-object p2, p0, Landroidx/transition/g$a$a;->a:La/J1;

    return-void
.end method


# virtual methods
.method public final f(Landroidx/transition/e;)V
    .locals 3

    iget-object v0, p0, Landroidx/transition/g$a$a;->b:Landroidx/transition/g$a;

    iget-object v0, v0, Landroidx/transition/g$a;->b:Landroid/widget/FrameLayout;

    iget-object v1, p0, Landroidx/transition/g$a$a;->a:La/J1;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, La/ge;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Landroidx/transition/e;->y(Landroidx/transition/e$f;)Landroidx/transition/e;

    return-void
.end method
