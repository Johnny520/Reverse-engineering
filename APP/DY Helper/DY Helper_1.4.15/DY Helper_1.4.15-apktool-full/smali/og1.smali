.class public final synthetic Log1;
.super Lwj1;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final ζ:Log1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Log1;

    .line 2
    .line 3
    const-string v1, "isClaimable"

    .line 4
    .line 5
    const-string v2, "isClaimable()Z"

    .line 6
    .line 7
    const-class v3, Ltf1;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lwj1;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Log1;->ζ:Log1;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ltf1;

    .line 2
    .line 3
    iget p0, p1, Ltf1;->γ:I

    .line 4
    .line 5
    const/16 p1, 0x71a3

    .line 6
    .line 7
    filled-new-array {p0}, [I

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1, p0}, Lcom/example/dyhelper/core/protection/ProtectionNativeBridge;->β(I[I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
