.class public final Lzs1;
.super Lsm0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic i:Lat1;


# direct methods
.method public constructor <init>(Lat1;Lon;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzs1;->i:Lat1;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lsm0;-><init>(Lht2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final n(Lfn;J)J
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lsm0;->h:Lht2;

    .line 5
    .line 6
    const-wide/16 v0, 0x2000

    .line 7
    .line 8
    invoke-interface {p2, p1, v0, v1}, Lht2;->n(Lfn;J)J

    .line 9
    .line 10
    .line 11
    move-result-wide p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-wide p0

    .line 13
    :catch_0
    move-exception p1

    .line 14
    iget-object p0, p0, Lzs1;->i:Lat1;

    .line 15
    .line 16
    iput-object p1, p0, Lat1;->l:Ljava/io/IOException;

    .line 17
    .line 18
    throw p1
.end method
