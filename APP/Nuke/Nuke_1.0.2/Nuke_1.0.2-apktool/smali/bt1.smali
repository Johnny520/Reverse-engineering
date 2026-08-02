.class public final Lbt1;
.super Lu92;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final j:Lvf1;

.field public final k:J


# direct methods
.method public constructor <init>(Lvf1;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbt1;->j:Lvf1;

    .line 5
    .line 6
    iput-wide p2, p0, Lbt1;->k:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lbt1;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()Lvf1;
    .locals 0

    .line 1
    iget-object p0, p0, Lbt1;->j:Lvf1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()Lon;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Cannot read raw response body of a converted body."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
