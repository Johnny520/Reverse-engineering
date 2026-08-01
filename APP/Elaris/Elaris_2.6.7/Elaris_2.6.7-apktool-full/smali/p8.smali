.class public final synthetic Lp8;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Landroid/app/Dialog;

.field public final synthetic d:Landroid/widget/TextView;

.field public final synthetic e:Landroid/widget/ListView;

.field public final synthetic f:Lz8;

.field public final synthetic g:Lx8;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ListView;Lz8;Lx8;I)V
    .locals 0

    .line 1
    iput p7, p0, Lp8;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lp8;->b:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lp8;->c:Landroid/app/Dialog;

    .line 6
    .line 7
    iput-object p3, p0, Lp8;->d:Landroid/widget/TextView;

    .line 8
    .line 9
    iput-object p4, p0, Lp8;->e:Landroid/widget/ListView;

    .line 10
    .line 11
    iput-object p5, p0, Lp8;->f:Lz8;

    .line 12
    .line 13
    iput-object p6, p0, Lp8;->g:Lx8;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    .line 1
    iget p1, p0, Lp8;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v4, p0, Lp8;->f:Lz8;

    .line 7
    .line 8
    iget-object v5, p0, Lp8;->g:Lx8;

    .line 9
    .line 10
    iget-object v0, p0, Lp8;->b:Landroid/app/Activity;

    .line 11
    .line 12
    iget-object v1, p0, Lp8;->c:Landroid/app/Dialog;

    .line 13
    .line 14
    iget-object v2, p0, Lp8;->d:Landroid/widget/TextView;

    .line 15
    .line 16
    iget-object v3, p0, Lp8;->e:Landroid/widget/ListView;

    .line 17
    .line 18
    invoke-static/range {v0 .. v5}, Li5;->T0(Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ListView;Lz8;Lx8;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v10, p0, Lp8;->f:Lz8;

    .line 23
    .line 24
    iget-object v11, p0, Lp8;->g:Lx8;

    .line 25
    .line 26
    iget-object v6, p0, Lp8;->b:Landroid/app/Activity;

    .line 27
    .line 28
    iget-object v7, p0, Lp8;->c:Landroid/app/Dialog;

    .line 29
    .line 30
    iget-object v8, p0, Lp8;->d:Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v9, p0, Lp8;->e:Landroid/widget/ListView;

    .line 33
    .line 34
    invoke-static/range {v6 .. v11}, Li5;->T0(Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/ListView;Lz8;Lx8;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
