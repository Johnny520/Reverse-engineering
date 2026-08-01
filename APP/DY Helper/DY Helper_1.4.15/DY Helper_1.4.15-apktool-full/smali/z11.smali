.class public final Lz11;
.super Lxj1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lro0;
.implements Lso0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    const/4 v1, 0x1

    .line 2
    sget-object v3, Lkotlin/jvm/internal/α;->NO_RECEIVER:Ljava/lang/Object;

    .line 3
    .line 4
    const-class v2, Lhs1;

    .line 5
    .line 6
    move-object v0, p0

    .line 7
    move-object v4, p1

    .line 8
    move-object v5, p2

    .line 9
    invoke-direct/range {v0 .. v5}, Lxj1;-><init>(ILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final computeReflected()Lio0;
    .locals 1

    .line 1
    sget-object v0, Lvm1;->α:Lwm1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lz11;->γ()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final γ()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lxj1;->β()Lso0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lz11;

    .line 6
    .line 7
    invoke-virtual {p0}, Lz11;->γ()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
