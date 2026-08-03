.class public final synthetic Lt8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lt8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lt8;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lio/sentry/android/ndk/SentryNdk;->a()V

    return-void

    :pswitch_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Lio/sentry/android/core/internal/util/d;->b:J

    :pswitch_1
    return-void

    :pswitch_2
    invoke-static {}, Lio/github/cherrywechat/lua/dev/CherryDevServer;->g()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
