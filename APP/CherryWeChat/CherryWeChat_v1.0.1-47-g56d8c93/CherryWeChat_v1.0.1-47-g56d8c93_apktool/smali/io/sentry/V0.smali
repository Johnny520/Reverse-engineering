.class public final Lio/sentry/V0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/h0;


# static fields
.field public static final b:Lio/sentry/V0;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/sentry/V0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lio/sentry/V0;-><init>(I)V

    sput-object v0, Lio/sentry/V0;->b:Lio/sentry/V0;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/V0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lio/sentry/P2;Lio/sentry/v1;Lio/sentry/Q2;Lio/sentry/m;)Lio/sentry/i0;
    .locals 1

    iget v0, p0, Lio/sentry/V0;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lio/sentry/D2;

    invoke-direct {v0, p1, p2, p3, p4}, Lio/sentry/D2;-><init>(Lio/sentry/P2;Lio/sentry/v1;Lio/sentry/Q2;Lio/sentry/m;)V

    return-object v0

    :pswitch_0
    sget-object p1, Lio/sentry/W0;->a:Lio/sentry/W0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
