.class public final enum Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Illegal"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;",
        ">;",
        "Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

.field public static final enum INSTANCE:Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;->INSTANCE:Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;->$VALUES:[Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;->$VALUES:[Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/pool/TypePool$Default$ComponentTypeLocator$Illegal;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bind(Ljava/lang/String;)Lnet/bytebuddy/pool/TypePool$AbstractBase$ComponentTypeReference;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Unexpected lookup of component type for "

    .line 4
    .line 5
    invoke-static {v0, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    throw p0
.end method
