.class public final synthetic Lio/sentry/i2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/util/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/sentry/v2;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/v2;I)V
    .locals 0

    iput p2, p0, Lio/sentry/i2;->a:I

    iput-object p1, p0, Lio/sentry/i2;->b:Lio/sentry/v2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lio/sentry/i2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/i2;->b:Lio/sentry/v2;

    invoke-static {v0}, Lio/sentry/v2;->b(Lio/sentry/v2;)Lio/sentry/A;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/i2;->b:Lio/sentry/v2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lio/sentry/D0;

    invoke-direct {v1, v0}, Lio/sentry/D0;-><init>(Lio/sentry/v2;)V

    return-object v1

    :pswitch_1
    iget-object v0, p0, Lio/sentry/i2;->b:Lio/sentry/v2;

    invoke-static {v0}, Lio/sentry/v2;->a(Lio/sentry/v2;)Lio/sentry/z;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
