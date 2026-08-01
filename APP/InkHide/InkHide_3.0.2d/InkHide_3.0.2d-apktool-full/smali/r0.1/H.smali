.class public final synthetic Lr0/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/d0;

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/H;->a:I

    iput-object p1, p0, Lr0/H;->b:Lr0/d0;

    iput-object p2, p0, Lr0/H;->c:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lr0/H;->b:Lr0/d0;

    .line 3
    .line 4
    iget-object v2, p0, Lr0/H;->c:Landroid/view/View;

    .line 5
    .line 6
    iget v3, p0, Lr0/H;->a:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v3, Lr0/d0;->U:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {v1, v0, v0, v2}, Lr0/d0;->o(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    invoke-static {v1, v2, v0}, Lr0/d0;->f(Lr0/d0;Landroid/view/View;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_1
    invoke-static {v1, v2, v0}, Lr0/d0;->f(Lr0/d0;Landroid/view/View;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    invoke-virtual {v1, v2}, Lr0/d0;->T0(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_3
    invoke-virtual {v1, v2}, Lr0/d0;->T0(Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
