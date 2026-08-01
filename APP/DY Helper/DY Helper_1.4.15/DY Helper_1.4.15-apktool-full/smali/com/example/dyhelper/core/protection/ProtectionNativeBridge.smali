.class public final Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkt0;

    .line 2
    .line 3
    const/16 v1, 0x17

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkt0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lqq0;->ε:Lqq0;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lln0;->Σ(Lqq0;Lp70;)Loq0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->α:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method private static final native nativeDecode(Ljava/lang/String;)Ljava/lang/String;
.end method

.method private static final native nativeEvaluate(I[I)Z
.end method

.method public static α(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const/16 v0, 0x7e

    .line 2
    .line 3
    invoke-static {p0, v0}, Lq02;->у(Ljava/lang/String;C)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v0, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->α:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-interface {v0}, Loq0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-static {p0}, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->nativeDecode(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    :goto_0
    if-eqz p0, :cond_2

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_2
    const-string p0, "invalid protected string"

    .line 40
    .line 41
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :goto_1
    const/4 p0, 0x0

    .line 45
    return-object p0

    .line 46
    :cond_3
    const-string p0, "release native protection unavailable"

    .line 47
    .line 48
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1
.end method

.method public static β(I[I)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->α:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-interface {v0}, Loq0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p0, p1}, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->nativeEvaluate(I[I)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method
