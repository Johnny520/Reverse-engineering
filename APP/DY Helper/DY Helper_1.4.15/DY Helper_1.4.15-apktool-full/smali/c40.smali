.class public final Lc40;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lss1;


# instance fields
.field public final α:Lss1;

.field public final β:La80;

.field public final γ:La80;


# direct methods
.method public constructor <init>(Lss1;La80;La80;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc40;->α:Lss1;

    .line 8
    .line 9
    iput-object p2, p0, Lc40;->β:La80;

    .line 10
    .line 11
    iput-object p3, p0, Lc40;->γ:La80;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lx30;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lx30;-><init>(Lc40;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
