.class public final Ly51;
.super Lo61;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final γ:Ly51;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ly51;

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
    sput-object v0, Ly51;->γ:Ly51;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final α(Lf81;Lp6;Lrw1;Len1;Lr71;)V
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    check-cast p0, Low1;

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    invoke-virtual {p1, p2}, Lf81;->β(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lq80;

    .line 14
    .line 15
    invoke-virtual {p3}, Lrw1;->δ()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Low1;->α(Lq80;)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-virtual {p3, p0, p1}, Lrw1;->Γ(Low1;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p3}, Lrw1;->λ()V

    .line 29
    .line 30
    .line 31
    return-void
.end method
