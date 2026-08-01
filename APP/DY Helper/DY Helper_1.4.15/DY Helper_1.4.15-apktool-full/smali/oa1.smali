.class public final Loa1;
.super Lй;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/util/Collection;
.implements Llo0;


# static fields
.field public static final θ:Loa1;


# instance fields
.field public final ε:Ljava/lang/Object;

.field public final ζ:Ljava/lang/Object;

.field public final η:Lga1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Loa1;

    .line 2
    .line 3
    sget-object v1, Lx;->Π:Lx;

    .line 4
    .line 5
    sget-object v2, Lga1;->η:Lga1;

    .line 6
    .line 7
    invoke-direct {v0, v1, v1, v2}, Loa1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lga1;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Loa1;->θ:Loa1;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lga1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Loa1;->ε:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Loa1;->ζ:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Loa1;->η:Lga1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Loa1;->η:Lga1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lga1;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lf90;

    .line 2
    .line 3
    iget-object v1, p0, Loa1;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Loa1;->η:Lga1;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Lf90;-><init>(Ljava/lang/Object;Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final α()I
    .locals 0

    .line 1
    iget-object p0, p0, Loa1;->η:Lga1;

    .line 2
    .line 3
    iget p0, p0, Lga1;->ζ:I

    .line 4
    .line 5
    return p0
.end method
