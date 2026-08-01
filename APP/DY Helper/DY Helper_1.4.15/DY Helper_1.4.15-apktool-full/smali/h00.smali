.class public final Lh00;
.super Lв;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final ζ:Lf3;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lf3;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lf3;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lh00;->ζ:Lf3;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final α()Ljava/util/Random;
    .locals 0

    .line 1
    iget-object p0, p0, Lh00;->ζ:Lf3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/util/Random;

    .line 11
    .line 12
    return-object p0
.end method
