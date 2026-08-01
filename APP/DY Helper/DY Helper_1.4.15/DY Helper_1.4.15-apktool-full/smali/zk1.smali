.class public final Lzk1;
.super Lbo1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ζ:Ljava/lang/String;

.field public final η:J

.field public final θ:Lrk1;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLrk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzk1;->ζ:Ljava/lang/String;

    .line 5
    .line 6
    iput-wide p2, p0, Lzk1;->η:J

    .line 7
    .line 8
    iput-object p4, p0, Lzk1;->θ:Lrk1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final η()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lzk1;->η:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final θ()Lez0;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lzk1;->ζ:Ljava/lang/String;

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    sget-object v1, Lez0;->γ:Lym1;

    .line 7
    .line 8
    :try_start_0
    invoke-static {p0}, Lkn0;->φ(Ljava/lang/String;)Lez0;

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

.method public final κ()Lad;
    .locals 0

    .line 1
    iget-object p0, p0, Lzk1;->θ:Lrk1;

    .line 2
    .line 3
    return-object p0
.end method
