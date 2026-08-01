.class public final Lz51;
.super Lo61;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final γ:Lz51;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lz51;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Lo61;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lz51;->γ:Lz51;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final α(Lf81;Lp6;Lrw1;Len1;Lr71;)V
    .locals 7

    .line 1
    const/4 p0, 0x1

    .line 2
    invoke-virtual {p1, p0}, Lf81;->β(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Low1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Lf81;->β(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lq80;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    invoke-virtual {p1, v3}, Lf81;->β(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, La40;

    .line 21
    .line 22
    invoke-virtual {v0}, Low1;->δ()Lrw1;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz p5, :cond_0

    .line 27
    .line 28
    :try_start_0
    new-instance v4, Ln5;

    .line 29
    .line 30
    const/16 v5, 0x19

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-direct {v4, v5, p5, p3, v6}, Ln5;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const/4 v4, 0x0

    .line 40
    :goto_0
    iget-object p5, p1, La40;->γ:Lh81;

    .line 41
    .line 42
    invoke-virtual {p5}, Lh81;->Η()Z

    .line 43
    .line 44
    .line 45
    move-result p5

    .line 46
    if-nez p5, :cond_1

    .line 47
    .line 48
    const-string p5, "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"

    .line 49
    .line 50
    invoke-static {p5}, Lsn;->α(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object p1, p1, La40;->β:Lh81;

    .line 54
    .line 55
    invoke-virtual {p1, p2, v3, p4, v4}, Lh81;->Ζ(Lp6;Lrw1;Len1;Lr71;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, p0}, Lrw1;->ε(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p3}, Lrw1;->δ()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v2}, Low1;->α(Lq80;)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-virtual {p3, v0, p0}, Lrw1;->Γ(Low1;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p3}, Lrw1;->λ()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :goto_1
    invoke-virtual {v3, v1}, Lrw1;->ε(Z)V

    .line 79
    .line 80
    .line 81
    throw p0
.end method
