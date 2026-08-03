.class public final synthetic La/W6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/Q3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/X6;


# direct methods
.method public synthetic constructor <init>(La/X6;I)V
    .locals 0

    iput p2, p0, La/W6;->a:I

    iput-object p1, p0, La/W6;->b:La/X6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, La/W6;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/W6;->b:La/X6;

    check-cast p1, Landroid/content/Intent;

    invoke-static {v0, p1}, La/X6;->g(La/X6;Landroid/content/Intent;)V

    return-void

    :pswitch_0
    iget-object v0, p0, La/W6;->b:La/X6;

    check-cast p1, Landroid/content/res/Configuration;

    invoke-static {v0, p1}, La/X6;->e(La/X6;Landroid/content/res/Configuration;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
