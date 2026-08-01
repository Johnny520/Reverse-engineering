.class public final Li1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljs1;


# instance fields
.field public ε:Z

.field public final synthetic ζ:Liv1;


# direct methods
.method public constructor <init>(Liv1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li1;->ζ:Liv1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α(Lis1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p1, p0, Li1;->ζ:Liv1;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Li1;->ε:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method
