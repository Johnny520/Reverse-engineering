.class public final La/n1;
.super La/V6;
.source "SourceFile"


# instance fields
.field public final synthetic j:La/o1$e;

.field public final synthetic k:La/o1;


# direct methods
.method public constructor <init>(La/o1;La/o1;La/o1$e;)V
    .locals 0

    iput-object p1, p0, La/n1;->k:La/o1;

    iput-object p3, p0, La/n1;->j:La/o1$e;

    invoke-direct {p0, p2}, La/V6;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()La/de;
    .locals 1

    iget-object v0, p0, La/n1;->j:La/o1$e;

    return-object v0
.end method

.method public final c()Z
    .locals 3

    iget-object v0, p0, La/n1;->k:La/o1;

    invoke-virtual {v0}, La/o1;->getInternalPopup()La/o1$g;

    move-result-object v1

    invoke-interface {v1}, La/o1$g;->b()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getTextDirection()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getTextAlignment()I

    move-result v2

    iget-object v0, v0, La/o1;->f:La/o1$g;

    invoke-interface {v0, v1, v2}, La/o1$g;->e(II)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
