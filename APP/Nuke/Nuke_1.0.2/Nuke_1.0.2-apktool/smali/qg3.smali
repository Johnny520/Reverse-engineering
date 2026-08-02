.class public abstract Lqg3;
.super La40;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method public constructor <init>(Lkt2;)V
    .locals 2

    .line 1
    sget-object v0, Lpa0;->b:Loa0;

    .line 2
    .line 3
    sget-object v1, Ls72;->j:Ls72;

    .line 4
    .line 5
    invoke-direct {p0, v0, p1, v1}, La40;-><init>(Loa0;Lkt2;Ls72;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final i(Loa0;)La40;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/RuntimeException;

    .line 2
    .line 3
    const-string p1, "unsupported"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public j(I)La40;
    .locals 1

    .line 1
    iget-object v0, p0, La40;->d:Ls72;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ls72;->k(I)Ls72;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, La40;->k(Ls72;)La40;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final l(Lyn;)V
    .locals 0

    .line 1
    return-void
.end method
