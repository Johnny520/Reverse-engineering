.class public final synthetic Lio/sentry/r0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/t0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/sentry/A0;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/A0;I)V
    .locals 0

    iput p2, p0, Lio/sentry/r0;->a:I

    iput-object p1, p0, Lio/sentry/r0;->b:Lio/sentry/A0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lio/sentry/r0;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/r0;->b:Lio/sentry/A0;

    iget-object v0, v0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->s()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/sentry/r0;->b:Lio/sentry/A0;

    iget-object v0, v0, Lio/sentry/A0;->b:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/a;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/a;->A()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
