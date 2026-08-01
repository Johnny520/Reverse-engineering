.class public final Ll51;
.super Lo61;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final γ:Ll51;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ll51;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Lo61;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ll51;->γ:Ll51;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final α(Lf81;Lp6;Lrw1;Len1;Lr71;)V
    .locals 2

    .line 1
    const/4 p0, 0x1

    .line 2
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Lzm0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget p0, p0, Lzm0;->α:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p0, v0

    .line 15
    :goto_0
    invoke-virtual {p1, v0}, Lf81;->β(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lke;

    .line 20
    .line 21
    if-lez p0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lpg0;

    .line 24
    .line 25
    invoke-direct {v0, p2, p0}, Lpg0;-><init>(Lp6;I)V

    .line 26
    .line 27
    .line 28
    move-object p2, v0

    .line 29
    :cond_1
    if-eqz p5, :cond_2

    .line 30
    .line 31
    new-instance p0, Ln5;

    .line 32
    .line 33
    const/16 v0, 0x19

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {p0, v0, p5, p3, v1}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 p0, 0x0

    .line 41
    :goto_1
    invoke-virtual {p1, p2, p3, p4, p0}, Lke;->Χ(Lp6;Lrw1;Len1;Lr71;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method
