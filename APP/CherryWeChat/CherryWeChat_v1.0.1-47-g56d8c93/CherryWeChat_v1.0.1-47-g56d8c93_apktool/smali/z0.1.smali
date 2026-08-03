.class public final Lz0;
.super Lxr;
.source ""


# instance fields
.field public final synthetic l:I

.field public final synthetic m:LD0;


# direct methods
.method public constructor <init>(LD0;Landroid/content/Context;LEz;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lz0;->l:I

    .line 8
    iput-object p1, p0, Lz0;->m:LD0;

    const v6, 0x55040022

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 9
    invoke-direct/range {v1 .. v7}, Lxr;-><init>(Landroid/content/Context;Llr;Landroid/view/View;ZII)V

    .line 10
    iget-object p2, v3, LEz;->A:Lqr;

    .line 11
    iget p2, p2, Lqr;->x:I

    const/16 p3, 0x20

    and-int/2addr p2, p3

    if-ne p2, p3, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    iget-object p2, p1, LD0;->i:LC0;

    if-nez p2, :cond_1

    .line 13
    iget-object p2, p1, LD0;->h:LGr;

    .line 14
    check-cast p2, Landroid/view/View;

    .line 15
    :cond_1
    iput-object p2, v1, Lxr;->e:Landroid/view/View;

    .line 16
    :goto_0
    iget-object p1, p1, LD0;->w:LD2;

    .line 17
    iput-object p1, v1, Lxr;->h:LCr;

    .line 18
    iget-object p2, v1, Lxr;->i:Lvr;

    if-eqz p2, :cond_2

    .line 19
    invoke-interface {p2, p1}, LDr;->e(LCr;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(LD0;Landroid/content/Context;Llr;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lz0;->l:I

    .line 1
    iput-object p1, p0, Lz0;->m:LD0;

    const v6, 0x55040022

    const/4 v7, 0x0

    const/4 v5, 0x1

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 2
    invoke-direct/range {v1 .. v7}, Lxr;-><init>(Landroid/content/Context;Llr;Landroid/view/View;ZII)V

    const p2, 0x800005

    .line 3
    iput p2, v1, Lxr;->f:I

    .line 4
    iget-object p1, p1, LD0;->w:LD2;

    .line 5
    iput-object p1, v1, Lxr;->h:LCr;

    .line 6
    iget-object p2, v1, Lxr;->i:Lvr;

    if-eqz p2, :cond_0

    .line 7
    invoke-interface {p2, p1}, LDr;->e(LCr;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget v0, p0, Lz0;->l:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lz0;->m:LD0;

    iget-object v1, v0, LD0;->c:Llr;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Llr;->c(Z)V

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, LD0;->s:Lz0;

    invoke-super {p0}, Lxr;->c()V

    return-void

    :pswitch_0
    const/4 v0, 0x0

    iget-object v1, p0, Lz0;->m:LD0;

    iput-object v0, v1, LD0;->t:Lz0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-super {p0}, Lxr;->c()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
