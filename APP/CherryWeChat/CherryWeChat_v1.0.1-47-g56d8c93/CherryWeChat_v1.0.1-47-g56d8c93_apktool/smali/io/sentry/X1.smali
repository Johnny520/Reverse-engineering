.class public final Lio/sentry/X1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/I1;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/X1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lio/sentry/H1;
    .locals 1

    iget v0, p0, Lio/sentry/X1;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lio/sentry/g2;

    invoke-direct {v0}, Lio/sentry/g2;-><init>()V

    return-object v0

    :pswitch_0
    new-instance v0, Lio/sentry/W1;

    invoke-direct {v0}, Lio/sentry/W1;-><init>()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
