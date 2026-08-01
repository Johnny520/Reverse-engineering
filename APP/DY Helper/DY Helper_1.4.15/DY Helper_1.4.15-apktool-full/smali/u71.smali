.class public final synthetic Lu71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Lcc;

.field public final synthetic ζ:I

.field public final synthetic η:I


# direct methods
.method public synthetic constructor <init>(Lcc;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu71;->ε:Lcc;

    .line 5
    .line 6
    iput p2, p0, Lu71;->ζ:I

    .line 7
    .line 8
    iput p3, p0, Lu71;->η:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lu71;->ζ:I

    .line 7
    .line 8
    iget v1, p0, Lu71;->η:I

    .line 9
    .line 10
    add-int/2addr v0, v1

    .line 11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object p0, p0, Lu71;->ε:Lcc;

    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Ls62;->α:Ls62;

    .line 21
    .line 22
    return-object p0
.end method
