.class public final Ldr;
.super Lgy;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic ε:Lx91;

.field public final synthetic ζ:Ln;


# direct methods
.method public constructor <init>(Lx91;Ln;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldr;->ε:Lx91;

    .line 5
    .line 6
    iput-object p2, p0, Ldr;->ζ:Ln;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final α()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldr;->ζ:Ln;

    .line 2
    .line 3
    sget-object v0, Lbd;->κ:Ljl0;

    .line 4
    .line 5
    iput-object v0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    return-void
.end method

.method public final β()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldr;->ε:Lx91;

    .line 2
    .line 3
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lx91;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljl0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Ljl0;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ldr;->ζ:Ln;

    .line 15
    .line 16
    iput-object v0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method
