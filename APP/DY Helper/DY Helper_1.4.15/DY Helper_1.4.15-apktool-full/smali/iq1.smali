.class public final synthetic Liq1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lfr0;


# instance fields
.field public final synthetic ε:Ljq1;


# direct methods
.method public synthetic constructor <init>(Ljq1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Liq1;->ε:Ljq1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final κ(Lhr0;Lbr0;)V
    .locals 0

    .line 1
    sget-object p1, Lbr0;->ON_START:Lbr0;

    .line 2
    .line 3
    iget-object p0, p0, Liq1;->ε:Ljq1;

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Ljq1;->θ:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object p1, Lbr0;->ON_STOP:Lbr0;

    .line 12
    .line 13
    if-ne p2, p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Ljq1;->θ:Z

    .line 17
    .line 18
    :cond_1
    return-void
.end method
