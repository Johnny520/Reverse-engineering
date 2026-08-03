.class public final synthetic Li;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lm;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lm;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Li;->a:I

    iput-object p1, p0, Li;->b:Lm;

    iput-object p2, p0, Li;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Li;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Li;->b:Lm;

    iget-object v0, p0, Li;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lm;->j(Ljava/lang/String;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Li;->b:Lm;

    iget-object v0, p0, Li;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lm;->j(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
