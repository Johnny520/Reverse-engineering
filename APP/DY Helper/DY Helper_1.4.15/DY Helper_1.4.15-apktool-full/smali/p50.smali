.class public final Lp50;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final δ:Li2;


# instance fields
.field public final α:Liy;

.field public β:I

.field public final γ:Lcr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li2;

    .line 2
    .line 3
    const/16 v1, 0x18

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lp50;->δ:Li2;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Liy;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lp50;->β:I

    .line 6
    .line 7
    new-instance v0, Lcr;

    .line 8
    .line 9
    invoke-direct {v0}, Lcr;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lp50;->γ:Lcr;

    .line 13
    .line 14
    iput-object p1, p0, Lp50;->α:Liy;

    .line 15
    .line 16
    return-void
.end method
