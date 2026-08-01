.class public final Lxn;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lr71;
.implements Lsp;


# static fields
.field public static final ζ:Li2;


# instance fields
.field public final ε:Lv80;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li2;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li2;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lxn;->ζ:Li2;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lv80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxn;->ε:Lv80;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final getKey()Ltp;
    .locals 0

    .line 1
    sget-object p0, Lxn;->ζ:Li2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final δ(Ljava/lang/Integer;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lxn;->ε:Lv80;

    .line 2
    .line 3
    invoke-virtual {p0}, Lv80;->Δ()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ε()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxn;->ε:Lv80;

    .line 2
    .line 3
    iget-boolean p0, p0, Lv80;->Ε:Z

    .line 4
    .line 5
    return p0
.end method

.method public final bridge η(Lup;)Lup;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd2;->Θ(Lsp;Lup;)Lup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge θ(Ltp;)Lsp;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd2;->υ(Lsp;Ltp;)Lsp;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final λ(Le80;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge ξ(Ltp;)Lup;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lpd2;->Δ(Lsp;Ltp;)Lup;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
