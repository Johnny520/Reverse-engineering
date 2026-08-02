.class public final Lxz1;
.super Li01;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method public constructor <init>(Lza2;Lkt2;Lr72;Ls72;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Li01;-><init>(Lza2;Lkt2;Lr72;Ls72;)V

    .line 2
    .line 3
    .line 4
    iget p0, p1, Lza2;->e:I

    .line 5
    .line 6
    const/4 p1, 0x5

    .line 7
    const/4 p2, 0x0

    .line 8
    if-eq p0, p1, :cond_2

    .line 9
    .line 10
    const/4 p1, 0x6

    .line 11
    if-eq p0, p1, :cond_2

    .line 12
    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    if-ne p0, p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string p0, "can\'t mix branchingness with result"

    .line 20
    .line 21
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p2

    .line 25
    :cond_1
    :goto_0
    return-void

    .line 26
    :cond_2
    const-string p1, "opcode with invalid branchingness: "

    .line 27
    .line 28
    invoke-static {p1, p0}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p2
.end method


# virtual methods
.method public final d(Lh01;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lh01;->d(Lxz1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e()Ld63;
    .locals 0

    .line 1
    sget-object p0, Lwu2;->j:Lwu2;

    .line 2
    .line 3
    return-object p0
.end method
