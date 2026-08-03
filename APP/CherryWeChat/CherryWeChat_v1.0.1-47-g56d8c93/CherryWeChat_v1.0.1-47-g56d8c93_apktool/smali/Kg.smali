.class public final synthetic LKg;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LOg;

.field public final synthetic c:LEC;


# direct methods
.method public synthetic constructor <init>(LOg;LEC;I)V
    .locals 0

    iput p3, p0, LKg;->a:I

    iput-object p1, p0, LKg;->b:LOg;

    iput-object p2, p0, LKg;->c:LEC;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, LKg;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LKg;->c:LEC;

    iget-object p1, p1, LEC;->a:Ljava/lang/String;

    iget-object v0, p0, LKg;->b:LOg;

    invoke-virtual {v0, p1}, LOg;->a(Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object p1, p0, LKg;->c:LEC;

    iget-object p1, p1, LEC;->a:Ljava/lang/String;

    iget-object v0, p0, LKg;->b:LOg;

    invoke-virtual {v0, p1}, LOg;->a(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
