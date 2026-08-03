.class public final La/zc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Landroidx/customview/poolingcontainer/R$id;->pooling_container_listener_holder_tag:I

    sput v0, La/zc;->a:I

    sget v0, Landroidx/customview/poolingcontainer/R$id;->is_pooling_container_tag:I

    sput v0, La/zc;->b:I

    return-void
.end method

.method public static final a(Landroid/view/View;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La/Cg;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La/Cg;-><init>(Landroid/view/View;La/a4;)V

    new-instance p0, La/Qd;

    invoke-direct {p0}, La/Rd;-><init>()V

    invoke-static {p0, p0, v0}, La/w1;->j(La/a4;La/a4;La/H7;)La/a4;

    move-result-object v0

    iput-object v0, p0, La/Qd;->d:La/a4;

    :cond_0
    invoke-virtual {p0}, La/Qd;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, La/Qd;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    sget v1, La/zc;->a:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/Bc;

    if-nez v2, :cond_1

    new-instance v2, La/Bc;

    invoke-direct {v2}, La/Bc;-><init>()V

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_1
    iget-object v0, v2, La/Bc;->a:Ljava/util/ArrayList;

    invoke-static {v0}, La/o3;->c0(Ljava/util/List;)I

    move-result v1

    :goto_0
    const/4 v2, -0x1

    if-ge v2, v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/Ac;

    invoke-interface {v2}, La/Ac;->a()V

    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method
