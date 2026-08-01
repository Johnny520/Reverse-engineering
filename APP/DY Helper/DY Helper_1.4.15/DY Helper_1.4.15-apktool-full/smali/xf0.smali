.class public final synthetic Lxf0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Ldg0;

.field public final synthetic ζ:I

.field public final synthetic η:Lsz;


# direct methods
.method public synthetic constructor <init>(Ldg0;ILsz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxf0;->ε:Ldg0;

    .line 5
    .line 6
    iput p2, p0, Lxf0;->ζ:I

    .line 7
    .line 8
    iput-object p3, p0, Lxf0;->η:Lsz;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lxf0;->ε:Ldg0;

    .line 2
    .line 3
    iget v1, p0, Lxf0;->ζ:I

    .line 4
    .line 5
    iget-object p0, p0, Lxf0;->η:Lsz;

    .line 6
    .line 7
    :try_start_0
    iget-object v2, v0, Ldg0;->Γ:Llg0;

    .line 8
    .line 9
    invoke-virtual {v2, v1, p0}, Llg0;->ρ(ILsz;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception p0

    .line 14
    sget-object v1, Lsz;->θ:Lsz;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v1, p0}, Ldg0;->δ(Lsz;Lsz;Ljava/io/IOException;)V

    .line 17
    .line 18
    .line 19
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 20
    .line 21
    return-object p0
.end method
