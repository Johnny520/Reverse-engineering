.class public final LK6;
.super LGu;
.source ""


# instance fields
.field public final n:Landroid/graphics/Typeface;

.field public final o:LD2;

.field public p:Z


# direct methods
.method public constructor <init>(LD2;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LK6;->n:Landroid/graphics/Typeface;

    iput-object p1, p0, LK6;->o:LD2;

    return-void
.end method


# virtual methods
.method public final y(I)V
    .locals 1

    iget-boolean p1, p0, LK6;->p:Z

    if-nez p1, :cond_0

    iget-object p1, p0, LK6;->o:LD2;

    iget-object p1, p1, LD2;->b:Ljava/lang/Object;

    check-cast p1, Lpa;

    iget-object v0, p0, LK6;->n:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Lpa;->l(Landroid/graphics/Typeface;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lpa;->j(Z)V

    :cond_0
    return-void
.end method

.method public final z(Landroid/graphics/Typeface;Z)V
    .locals 0

    iget-boolean p2, p0, LK6;->p:Z

    if-nez p2, :cond_0

    iget-object p2, p0, LK6;->o:LD2;

    iget-object p2, p2, LD2;->b:Ljava/lang/Object;

    check-cast p2, Lpa;

    invoke-virtual {p2, p1}, Lpa;->l(Landroid/graphics/Typeface;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lpa;->j(Z)V

    :cond_0
    return-void
.end method
