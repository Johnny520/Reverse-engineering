.class public final Lwz1;
.super Le30;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# direct methods
.method public constructor <init>(Lza2;Lkt2;Lr72;Ls72;Lk63;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Le30;-><init>(Lza2;Lkt2;Lr72;Ls72;Ldz;)V

    .line 2
    .line 3
    .line 4
    iget p0, p1, Lza2;->e:I

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    if-ne p0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string p1, "opcode with invalid branchingness: "

    .line 11
    .line 12
    invoke-static {p1, p0}, Lvi0;->g(Ljava/lang/String;I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    throw p0
.end method


# virtual methods
.method public final d(Lh01;)V
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lh01;->e(Lwz1;)V

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
