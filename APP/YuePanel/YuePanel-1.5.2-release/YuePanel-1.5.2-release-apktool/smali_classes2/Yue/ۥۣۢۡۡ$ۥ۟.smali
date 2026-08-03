.class public final LYue/ۥۣۢۡۡ$ۥ۟;
.super LYue/ۥ۟ۧۤۤ;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlinx.coroutines.channels.TickerChannelsKt"
    f = "TickerChannels.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3
    }
    l = {
        0x54,
        0x58,
        0x5e,
        0x60
    }
    m = "fixedPeriodTicker"
    n = {
        "channel",
        "delayMillis",
        "deadline",
        "channel",
        "deadline",
        "delayNs",
        "channel",
        "deadline",
        "delayNs",
        "channel",
        "deadline",
        "delayNs"
    }
    s = {
        "L$0",
        "J$0",
        "J$1",
        "L$0",
        "J$0",
        "J$1",
        "L$0",
        "J$0",
        "J$1",
        "L$0",
        "J$0",
        "J$1"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۢۡۡ;->ۥ۟۟۟(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public ۥۣ۟۟۠:J

.field public ۥ۟۟۠ۤ:J

.field public ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public synthetic ۥ۟۟۠ۦ:Ljava/lang/Object;

.field public ۥ۟۟۠ۧ:I


# direct methods
.method public constructor <init>(LYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e1$\u06e5\u06df;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, LYue/ۥ۟ۧۤۤ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iput-object p1, p0, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    iget p1, p0, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۧ:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, LYue/ۥۣۢۡۡ$ۥ۟;->ۥ۟۟۠ۧ:I

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v0, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, LYue/ۥۣۢۡۡ;->ۥ۟(JJLYue/ۥۡۨۡ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
