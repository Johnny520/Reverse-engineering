.class public final Lsx1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Iterator;
.implements Llo0;


# instance fields
.field public final ε:Low1;

.field public final ζ:I

.field public final η:Li91;

.field public final θ:I

.field public ι:I


# direct methods
.method public constructor <init>(Low1;ILx80;Li91;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsx1;->ε:Low1;

    .line 5
    .line 6
    iput p2, p0, Lsx1;->ζ:I

    .line 7
    .line 8
    iput-object p4, p0, Lsx1;->η:Li91;

    .line 9
    .line 10
    iget p1, p1, Low1;->μ:I

    .line 11
    .line 12
    iput p1, p0, Lsx1;->θ:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final next()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Operation is not supported for read-only collection"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
