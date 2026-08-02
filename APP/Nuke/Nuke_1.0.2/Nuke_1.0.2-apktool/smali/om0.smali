.class public final Lom0;
.super Lsp0;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final m:Lom0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lom0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lom0;->m:Lom0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final H(Lij0;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Lsp0;->s(Lij0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final I(Lij0;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Lsp0;->q(Lij0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final J(La40;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Ldy2;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object p0, p1, La40;->d:Ls72;

    .line 6
    .line 7
    iget-object p0, p0, Lkj0;->i:[Ljava/lang/Object;

    .line 8
    .line 9
    array-length p0, p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final q0(Lyn;Lij0;)V
    .locals 1

    .line 1
    move-object p0, p2

    .line 2
    check-cast p0, Ldy2;

    .line 3
    .line 4
    invoke-virtual {p0}, Ldy2;->m()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p2, v0}, Lsp0;->Q(La40;I)S

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    int-to-short v0, p0

    .line 14
    shr-int/lit8 p0, p0, 0x10

    .line 15
    .line 16
    int-to-short p0, p0

    .line 17
    invoke-virtual {p1, p2}, Lyn;->k(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lyn;->k(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p0}, Lyn;->k(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final v()I
    .locals 0

    .line 1
    const/4 p0, 0x3

    .line 2
    return p0
.end method
