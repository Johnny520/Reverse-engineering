.class public final enum Lnet/bytebuddy/build/AndroidDescriptor$Trivial;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/build/AndroidDescriptor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/AndroidDescriptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Trivial"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/AndroidDescriptor$Trivial;",
        ">;",
        "Lnet/bytebuddy/build/AndroidDescriptor;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

.field public static final enum EXTERNAL:Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

.field public static final enum LOCAL:Lnet/bytebuddy/build/AndroidDescriptor$Trivial;


# instance fields
.field private final typeScope:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;->LOCAL:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 5
    .line 6
    const-string v3, "LOCAL"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;-><init>(Ljava/lang/String;ILnet/bytebuddy/build/AndroidDescriptor$TypeScope;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->LOCAL:Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;->EXTERNAL:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 17
    .line 18
    const-string v4, "EXTERNAL"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;-><init>(Ljava/lang/String;ILnet/bytebuddy/build/AndroidDescriptor$TypeScope;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->EXTERNAL:Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 24
    .line 25
    filled-new-array {v0, v1}, [Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->$VALUES:[Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 30
    .line 31
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILnet/bytebuddy/build/AndroidDescriptor$TypeScope;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->typeScope:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/AndroidDescriptor$Trivial;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/AndroidDescriptor$Trivial;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->$VALUES:[Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getTypeScope(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->typeScope:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 2
    .line 3
    return-object p0
.end method
