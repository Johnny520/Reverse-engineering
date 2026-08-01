.class public final synthetic Lr0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/w;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lr0/w;Ljava/lang/Object;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p4, p0, Lr0/u;->a:I

    iput-object p1, p0, Lr0/u;->b:Lr0/w;

    iput-object p2, p0, Lr0/u;->c:Ljava/lang/Object;

    iput-object p3, p0, Lr0/u;->d:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lr0/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/u;->b:Lr0/w;

    .line 7
    .line 8
    iget-object v1, p0, Lr0/u;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v2, p0, Lr0/u;->d:Landroid/view/View;

    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Lr0/w;->m(Landroid/view/View;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lr0/u;->b:Lr0/w;

    .line 17
    .line 18
    iget-object v1, p0, Lr0/u;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v2, p0, Lr0/u;->d:Landroid/view/View;

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Lr0/w;->m(Landroid/view/View;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
