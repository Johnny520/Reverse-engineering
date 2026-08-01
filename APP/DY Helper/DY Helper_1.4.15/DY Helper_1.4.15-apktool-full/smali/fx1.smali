.class public final Lfx1;
.super Lk02;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public γ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lk02;-><init>(J)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lfx1;->γ:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α(Lk02;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lfx1;

    .line 5
    .line 6
    iget-object p1, p1, Lfx1;->γ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p1, p0, Lfx1;->γ:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public final β(J)Lk02;
    .locals 2

    .line 1
    new-instance p1, Lfx1;

    .line 2
    .line 3
    invoke-static {}, Lax1;->κ()Ltw1;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ltw1;->η()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iget-object p0, p0, Lfx1;->γ:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {p1, v0, v1, p0}, Lfx1;-><init>(JLjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-object p1
.end method
