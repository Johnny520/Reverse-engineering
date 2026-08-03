.class public final synthetic LA0/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA0/H;
.implements LY/l;


# instance fields
.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LA0/C;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LY/k;LY/m;)V
    .locals 1

    iget v0, p0, LA0/C;->f:I

    packed-switch v0, :pswitch_data_0

    invoke-interface {p1}, LY/k;->e()V

    return-void

    :pswitch_0
    invoke-interface {p1}, LY/k;->a()V

    return-void

    :pswitch_1
    invoke-interface {p1, p2}, LY/k;->c(LY/m;)V

    return-void

    :pswitch_2
    invoke-interface {p1, p2}, LY/k;->d(LY/m;)V

    return-void

    :pswitch_3
    invoke-interface {p1, p2}, LY/k;->f(LY/m;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
