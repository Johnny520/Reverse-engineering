.class public final Lyp;
.super Lv5;
.source ""


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lyp;->b:I

    invoke-direct {p0}, Lv5;-><init>()V

    return-void
.end method


# virtual methods
.method public final g()LVt;
    .locals 1

    iget v0, p0, Lyp;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lyy;

    invoke-direct {v0, p0}, Lyy;-><init>(Lyp;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lxp;

    invoke-direct {v0, p0}, Lxp;-><init>(Lyp;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
