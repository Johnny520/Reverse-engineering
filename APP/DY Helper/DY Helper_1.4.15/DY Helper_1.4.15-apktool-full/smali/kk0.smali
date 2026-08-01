.class public final synthetic Lkk0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Llk0;

.field public final synthetic ζ:I

.field public final synthetic η:I

.field public final synthetic θ:I

.field public final synthetic ι:I


# direct methods
.method public synthetic constructor <init>(Llk0;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkk0;->ε:Llk0;

    .line 5
    .line 6
    iput p2, p0, Lkk0;->ζ:I

    .line 7
    .line 8
    iput p3, p0, Lkk0;->η:I

    .line 9
    .line 10
    iput p4, p0, Lkk0;->θ:I

    .line 11
    .line 12
    iput p5, p0, Lkk0;->ι:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    check-cast p1, Lmk0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lkk0;->θ:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-gez v0, :cond_0

    .line 10
    .line 11
    move v0, v1

    .line 12
    :cond_0
    iget v2, p0, Lkk0;->ι:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-ge v2, v3, :cond_1

    .line 16
    .line 17
    move v2, v3

    .line 18
    :cond_1
    iget-object p1, p1, Lmk0;->α:Llk0;

    .line 19
    .line 20
    iget v4, p1, Llk0;->δ:I

    .line 21
    .line 22
    iget v5, p1, Llk0;->β:I

    .line 23
    .line 24
    sub-int v6, v4, v5

    .line 25
    .line 26
    iget v7, p1, Llk0;->γ:I

    .line 27
    .line 28
    iget p1, p1, Llk0;->α:I

    .line 29
    .line 30
    if-le v7, p1, :cond_3

    .line 31
    .line 32
    if-gt v3, v6, :cond_3

    .line 33
    .line 34
    if-gt v6, v2, :cond_3

    .line 35
    .line 36
    iget-object v2, p0, Lkk0;->ε:Llk0;

    .line 37
    .line 38
    iget v6, v2, Llk0;->δ:I

    .line 39
    .line 40
    iget v8, p0, Lkk0;->η:I

    .line 41
    .line 42
    sub-int v9, v6, v8

    .line 43
    .line 44
    if-lt v5, v9, :cond_3

    .line 45
    .line 46
    add-int/2addr v0, v6

    .line 47
    if-gt v5, v0, :cond_3

    .line 48
    .line 49
    if-gt v4, v6, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    iget v0, v2, Llk0;->α:I

    .line 53
    .line 54
    sub-int/2addr v0, v8

    .line 55
    if-lt v7, v0, :cond_3

    .line 56
    .line 57
    iget v0, v2, Llk0;->γ:I

    .line 58
    .line 59
    add-int/2addr v0, v8

    .line 60
    if-gt p1, v0, :cond_3

    .line 61
    .line 62
    iget p0, p0, Lkk0;->ζ:I

    .line 63
    .line 64
    div-int/lit8 p0, p0, 0x2

    .line 65
    .line 66
    if-le v7, p0, :cond_3

    .line 67
    .line 68
    move v1, v3

    .line 69
    :cond_3
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
