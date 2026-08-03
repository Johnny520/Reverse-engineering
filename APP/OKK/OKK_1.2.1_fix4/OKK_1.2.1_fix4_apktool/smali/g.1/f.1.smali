.class public final Lg/f;
.super Lf/n;
.source "SourceFile"


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Lg/i;


# direct methods
.method public constructor <init>(Lg/i;Landroid/content/Context;Lf/j;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lg/f;->m:I

    .line 1
    iput-object p1, p0, Lg/f;->n:Lg/i;

    const/4 v3, 0x0

    const v2, 0x7f040020

    const/4 v7, 0x1

    move-object v1, p0

    move-object v4, p2

    move-object v5, p4

    move-object v6, p3

    .line 2
    invoke-direct/range {v1 .. v7}, Lf/n;-><init>(IILandroid/content/Context;Landroid/view/View;Lf/j;Z)V

    const p2, 0x800005

    .line 3
    iput p2, p0, Lf/n;->g:I

    .line 4
    iget-object p1, p1, Lg/i;->v:LD/d;

    .line 5
    iput-object p1, p0, Lf/n;->i:Lf/o;

    .line 6
    iget-object p2, p0, Lf/n;->j:Lf/l;

    if-eqz p2, :cond_0

    .line 7
    invoke-interface {p2, p1}, Lf/p;->j(Lf/o;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lg/i;Landroid/content/Context;Lf/t;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lg/f;->m:I

    .line 8
    iput-object p1, p0, Lg/f;->n:Lg/i;

    const/4 v7, 0x0

    const v2, 0x7f040020

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p2

    move-object v5, p4

    move-object v6, p3

    .line 9
    invoke-direct/range {v1 .. v7}, Lf/n;-><init>(IILandroid/content/Context;Landroid/view/View;Lf/j;Z)V

    .line 10
    iget-object p2, p3, Lf/t;->w:Lf/k;

    .line 11
    invoke-virtual {p2}, Lf/k;->d()Z

    move-result p2

    if-nez p2, :cond_1

    .line 12
    iget-object p2, p1, Lg/i;->h:Lg/h;

    if-nez p2, :cond_0

    .line 13
    iget-object p2, p1, Lg/i;->g:Landroidx/appcompat/widget/ActionMenuView;

    .line 14
    :cond_0
    iput-object p2, p0, Lf/n;->f:Landroid/view/View;

    .line 15
    :cond_1
    iget-object p1, p1, Lg/i;->v:LD/d;

    .line 16
    iput-object p1, p0, Lf/n;->i:Lf/o;

    .line 17
    iget-object p2, p0, Lf/n;->j:Lf/l;

    if-eqz p2, :cond_2

    .line 18
    invoke-interface {p2, p1}, Lf/p;->j(Lf/o;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget v0, p0, Lg/f;->m:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg/f;->n:Lg/i;

    iget-object v1, v0, Lg/i;->c:Lf/j;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lf/j;->c(Z)V

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, Lg/i;->r:Lg/f;

    invoke-super {p0}, Lf/n;->c()V

    return-void

    :pswitch_0
    const/4 v0, 0x0

    iget-object v1, p0, Lg/f;->n:Lg/i;

    iput-object v0, v1, Lg/i;->s:Lg/f;

    invoke-super {p0}, Lf/n;->c()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
