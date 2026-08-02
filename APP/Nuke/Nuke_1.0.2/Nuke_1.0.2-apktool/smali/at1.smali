.class public final Lat1;
.super Lu92;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final j:Lu92;

.field public final k:Lo52;

.field public l:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Lu92;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lat1;->j:Lu92;

    .line 5
    .line 6
    new-instance v0, Lzs1;

    .line 7
    .line 8
    invoke-virtual {p1}, Lu92;->g()Lon;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p0, p1}, Lzs1;-><init>(Lat1;Lon;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lo52;

    .line 16
    .line 17
    invoke-direct {p1, v0}, Lo52;-><init>(Lht2;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lat1;->k:Lo52;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final c()J
    .locals 2

    .line 1
    iget-object p0, p0, Lat1;->j:Lu92;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu92;->c()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lat1;->j:Lu92;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu92;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e()Lvf1;
    .locals 0

    .line 1
    iget-object p0, p0, Lat1;->j:Lu92;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu92;->e()Lvf1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g()Lon;
    .locals 0

    .line 1
    iget-object p0, p0, Lat1;->k:Lo52;

    .line 2
    .line 3
    return-object p0
.end method
