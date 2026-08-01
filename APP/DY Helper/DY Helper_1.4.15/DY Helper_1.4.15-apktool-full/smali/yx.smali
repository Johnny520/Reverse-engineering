.class public final Lyx;
.super Lak1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final β:Lxn0;


# direct methods
.method public constructor <init>(Lp70;)V
    .locals 1

    .line 1
    sget-object v0, Lxn0;->Δ:Lxn0;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lak1;-><init>(Lp70;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lyx;->β:Lxn0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α(Ljava/lang/Object;)Lq4;
    .locals 6

    .line 1
    new-instance v0, Lq4;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    :goto_0
    move v3, v1

    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    goto :goto_0

    .line 10
    :goto_1
    iget-object v4, p0, Lyx;->β:Lxn0;

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    move-object v1, p0

    .line 14
    move-object v2, p1

    .line 15
    invoke-direct/range {v0 .. v5}, Lq4;-><init>(Lak1;Ljava/lang/Object;ZLxn0;Z)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
