.class public final synthetic LHo;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LKo;

.field public final synthetic c:LEC;


# direct methods
.method public synthetic constructor <init>(ILKo;LEC;)V
    .locals 0

    iput p1, p0, LHo;->a:I

    iput-object p2, p0, LHo;->b:LKo;

    iput-object p3, p0, LHo;->c:LEC;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, LHo;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LHo;->b:LKo;

    iget-object v0, p0, LHo;->c:LEC;

    invoke-virtual {p1, v0}, LKo;->c(LEC;)V

    return-void

    :pswitch_0
    iget-object p1, p0, LHo;->b:LKo;

    iget-object v0, p0, LHo;->c:LEC;

    invoke-virtual {p1, v0}, LKo;->a(LEC;)V

    return-void

    :pswitch_1
    iget-object p1, p0, LHo;->b:LKo;

    iget-object v0, p0, LHo;->c:LEC;

    invoke-virtual {p1, v0}, LKo;->c(LEC;)V

    return-void

    :pswitch_2
    iget-object p1, p0, LHo;->b:LKo;

    iget-object v0, p0, LHo;->c:LEC;

    invoke-virtual {p1, v0}, LKo;->a(LEC;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
