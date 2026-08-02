.class public final Lw52;
.super Lu92;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final j:Ljava/lang/String;

.field public final k:J

.field public final l:Lo52;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLo52;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw52;->j:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lw52;->k:J

    .line 7
    .line 8
    iput-object p4, p0, Lw52;->l:Lo52;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lw52;->k:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final e()Lvf1;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lw52;->j:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    sget-object v1, Lvf1;->d:Lo72;

    .line 7
    .line 8
    :try_start_0
    invoke-static {p0}, Lte;->C(Ljava/lang/String;)Lvf1;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    :cond_0
    return-object v0
.end method

.method public final g()Lon;
    .locals 0

    .line 1
    iget-object p0, p0, Lw52;->l:Lo52;

    .line 2
    .line 3
    return-object p0
.end method
