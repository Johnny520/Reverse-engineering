.class public final LV3;
.super Lci;
.source ""


# instance fields
.field public final synthetic j:Lc4;

.field public final synthetic k:Lf4;


# direct methods
.method public constructor <init>(Lf4;Lf4;Lc4;)V
    .locals 0

    iput-object p1, p0, LV3;->k:Lf4;

    iput-object p3, p0, LV3;->j:Lc4;

    invoke-direct {p0, p2}, Lci;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()Lky;
    .locals 1

    iget-object v0, p0, LV3;->j:Lc4;

    return-object v0
.end method

.method public final c()Z
    .locals 3

    iget-object v0, p0, LV3;->k:Lf4;

    invoke-virtual {v0}, Lf4;->getInternalPopup()Le4;

    move-result-object v1

    invoke-interface {v1}, Le4;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lf4;->f:Le4;

    invoke-virtual {v0}, Landroid/view/View;->getTextDirection()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getTextAlignment()I

    move-result v0

    invoke-interface {v1, v2, v0}, Le4;->m(II)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
