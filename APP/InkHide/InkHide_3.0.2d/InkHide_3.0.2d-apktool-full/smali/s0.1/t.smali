.class public final synthetic Ls0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LM0/a;


# direct methods
.method public synthetic constructor <init>(LM0/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Ls0/t;->b:I

    iput-object p1, p0, Ls0/t;->c:LM0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Ls0/t;->b:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ls0/t;->c:LM0/a;

    .line 7
    .line 8
    invoke-interface {p1}, LM0/a;->b()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p1, p0, Ls0/t;->c:LM0/a;

    .line 13
    .line 14
    invoke-interface {p1}, LM0/a;->b()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
