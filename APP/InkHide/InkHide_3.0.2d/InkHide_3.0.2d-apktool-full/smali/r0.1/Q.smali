.class public final synthetic Lr0/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/d0;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Landroid/widget/ListView;

.field public final synthetic e:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Lr0/d0;Ljava/lang/Object;Landroid/widget/ListView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lr0/Q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/Q;->e:Landroid/view/View;

    iput-object p2, p0, Lr0/Q;->b:Lr0/d0;

    iput-object p3, p0, Lr0/Q;->c:Ljava/lang/Object;

    iput-object p4, p0, Lr0/Q;->d:Landroid/widget/ListView;

    return-void
.end method

.method public synthetic constructor <init>(Lr0/d0;Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lr0/Q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/Q;->b:Lr0/d0;

    iput-object p2, p0, Lr0/Q;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr0/Q;->d:Landroid/widget/ListView;

    iput-object p4, p0, Lr0/Q;->e:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lr0/Q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/Q;->b:Lr0/d0;

    .line 7
    .line 8
    iget-object v1, p0, Lr0/Q;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v2, p0, Lr0/Q;->d:Landroid/widget/ListView;

    .line 11
    .line 12
    iget-object v3, p0, Lr0/Q;->e:Landroid/view/View;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2, v3}, Lr0/d0;->o(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lr0/Q;->b:Lr0/d0;

    .line 19
    .line 20
    iget-object v1, p0, Lr0/Q;->e:Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lr0/d0;->Z0(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Lr0/Q;->c:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v3, p0, Lr0/Q;->d:Landroid/widget/ListView;

    .line 28
    .line 29
    invoke-virtual {v0, v2, v3, v1}, Lr0/d0;->o(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
