.class public final Lm70;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:I

.field public β:Ln60;

.field public γ:Z

.field public δ:I

.field public ε:I

.field public ζ:I

.field public η:I

.field public θ:Lcr0;

.field public ι:Lcr0;


# direct methods
.method public constructor <init>(ILn60;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lm70;->α:I

    .line 5
    .line 6
    iput-object p2, p0, Lm70;->β:Ln60;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lm70;->γ:Z

    .line 10
    .line 11
    sget-object p1, Lcr0;->ι:Lcr0;

    .line 12
    .line 13
    iput-object p1, p0, Lm70;->θ:Lcr0;

    .line 14
    .line 15
    iput-object p1, p0, Lm70;->ι:Lcr0;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(ILn60;I)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Lm70;->α:I

    .line 20
    iput-object p2, p0, Lm70;->β:Ln60;

    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lm70;->γ:Z

    .line 22
    sget-object p1, Lcr0;->ι:Lcr0;

    iput-object p1, p0, Lm70;->θ:Lcr0;

    .line 23
    iput-object p1, p0, Lm70;->ι:Lcr0;

    return-void
.end method
