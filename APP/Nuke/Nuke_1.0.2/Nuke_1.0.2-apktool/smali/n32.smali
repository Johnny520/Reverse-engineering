.class public final Ln32;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxk1;
.implements Lj20;


# instance fields
.field public final synthetic h:Lxk1;

.field public final i:La20;


# direct methods
.method public constructor <init>(Lxk1;La20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln32;->h:Lxk1;

    .line 5
    .line 6
    iput-object p2, p0, Ln32;->i:La20;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final g()La20;
    .locals 0

    .line 1
    iget-object p0, p0, Ln32;->i:La20;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ln32;->h:Lxk1;

    .line 2
    .line 3
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final setValue(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ln32;->h:Lxk1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
