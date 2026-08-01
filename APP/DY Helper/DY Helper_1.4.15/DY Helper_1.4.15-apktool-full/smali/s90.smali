.class public final enum Ls90;
.super Ljava/lang/Enum;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final θ:Li2;

.field public static final enum ι:Ls90;

.field public static final synthetic κ:[Ls90;


# instance fields
.field public final ε:Ljava/lang/String;

.field public final ζ:Ljava/lang/String;

.field public final η:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Ls90;

    .line 2
    .line 3
    const-string v4, "GitHub \u539f\u7ad9"

    .line 4
    .line 5
    const-string v5, "https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/geonames/geonames_regions.zip."

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "GITHUB_RAW"

    .line 9
    .line 10
    const-string v3, "github_raw"

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Ls90;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ls90;->ι:Ls90;

    .line 16
    .line 17
    new-instance v1, Ls90;

    .line 18
    .line 19
    const-string v5, "gh-proxy \u4ee3\u7406"

    .line 20
    .line 21
    const-string v6, "https://gh-proxy.org/https://raw.githubusercontent.com/yyhh73144-max/dyhelperUser/refs/heads/main/geonames/geonames_regions.zip."

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    const-string v3, "GH_PROXY"

    .line 25
    .line 26
    const-string v4, "gh_proxy"

    .line 27
    .line 28
    invoke-direct/range {v1 .. v6}, Ls90;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    filled-new-array {v0, v1}, [Ls90;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Ls90;->κ:[Ls90;

    .line 36
    .line 37
    new-instance v0, Li2;

    .line 38
    .line 39
    const/16 v1, 0x1b

    .line 40
    .line 41
    invoke-direct {v0, v1}, Li2;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Ls90;->θ:Li2;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Ls90;->ε:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Ls90;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p5, p0, Ls90;->η:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls90;
    .locals 1

    .line 1
    const-class v0, Ls90;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ls90;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ls90;
    .locals 1

    .line 1
    sget-object v0, Ls90;->κ:[Ls90;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ls90;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final α(I)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-gt v0, p1, :cond_0

    .line 3
    .line 4
    const/16 v1, 0x9

    .line 5
    .line 6
    if-ge p1, v1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string v0, "%03d"

    .line 21
    .line 22
    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p0, p0, Ls90;->η:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    const-string p0, "\u5206\u5377\u7f16\u53f7\u8d85\u51fa\u8303\u56f4: "

    .line 34
    .line 35
    invoke-static {p0, p1}, La12;->δ(Ljava/lang/String;I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, Lγ;->δ(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method
