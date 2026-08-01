.class public final Lf81;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:I

.field public β:I

.field public γ:I

.field public final synthetic δ:Lh81;


# direct methods
.method public constructor <init>(Lh81;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf81;->δ:Lh81;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final α(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lf81;->δ:Lh81;

    .line 2
    .line 3
    iget-object v0, v0, Lh81;->δ:[I

    .line 4
    .line 5
    iget p0, p0, Lf81;->β:I

    .line 6
    .line 7
    add-int/2addr p0, p1

    .line 8
    aget p0, v0, p0

    .line 9
    .line 10
    return p0
.end method

.method public final β(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lf81;->δ:Lh81;

    .line 2
    .line 3
    iget-object v0, v0, Lh81;->ζ:[Ljava/lang/Object;

    .line 4
    .line 5
    iget p0, p0, Lf81;->γ:I

    .line 6
    .line 7
    add-int/2addr p0, p1

    .line 8
    aget-object p0, v0, p0

    .line 9
    .line 10
    return-object p0
.end method
