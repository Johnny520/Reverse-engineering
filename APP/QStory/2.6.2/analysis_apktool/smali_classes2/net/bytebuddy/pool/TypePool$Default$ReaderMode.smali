.class public final enum Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ReaderMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

.field public static final enum EXTENDED:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

.field public static final enum FAST:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;


# instance fields
.field private final flags:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x4

    .line 5
    const-string v3, "EXTENDED"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->EXTENDED:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 13
    .line 14
    const-string v2, "FAST"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v1, v2, v3, v3}, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->FAST:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 21
    .line 22
    filled-new-array {v0, v1}, [Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->$VALUES:[Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 27
    .line 28
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->flags:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->$VALUES:[Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getFlags()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->flags:I

    .line 2
    .line 3
    return p0
.end method

.method public isExtended()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;->EXTENDED:Lnet/bytebuddy/pool/TypePool$Default$ReaderMode;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method
