.class public final Lx6;
.super Ljava/util/AbstractSet;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ε:Lc7;


# direct methods
.method public constructor <init>(Lc7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx6;->ε:Lc7;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, La7;

    .line 2
    .line 3
    iget-object p0, p0, Lx6;->ε:Lc7;

    .line 4
    .line 5
    invoke-direct {v0, p0}, La7;-><init>(Lc7;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lx6;->ε:Lc7;

    .line 2
    .line 3
    iget p0, p0, Lfw1;->η:I

    .line 4
    .line 5
    return p0
.end method
