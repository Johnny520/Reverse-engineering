.class public abstract La62;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Iterator;
.implements Llo0;


# instance fields
.field public ε:[Ljava/lang/Object;

.field public ζ:I

.field public η:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lz52;->ε:Lz52;

    .line 5
    .line 6
    iget-object v0, v0, Lz52;->δ:[Ljava/lang/Object;

    .line 7
    .line 8
    iput-object v0, p0, La62;->ε:[Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, La62;->η:I

    .line 2
    .line 3
    iget p0, p0, La62;->ζ:I

    .line 4
    .line 5
    if-ge v0, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
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

.method public final α([Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput-object p1, p0, La62;->ε:[Ljava/lang/Object;

    .line 2
    .line 3
    iput p2, p0, La62;->ζ:I

    .line 4
    .line 5
    iput p3, p0, La62;->η:I

    .line 6
    .line 7
    return-void
.end method
