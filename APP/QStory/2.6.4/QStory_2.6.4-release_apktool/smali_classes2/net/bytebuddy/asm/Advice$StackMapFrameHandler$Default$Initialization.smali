.class public abstract enum Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "Initialization"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

.field public static final enum INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

.field public static final enum UNITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization$1;

    .line 2
    .line 3
    const-string v1, "UNITIALIZED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->UNITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization$2;

    .line 12
    .line 13
    const-string v3, "INITIALIZED"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->INITIALIZED:Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 23
    .line 24
    aput-object v0, v3, v2

    .line 25
    .line 26
    aput-object v1, v3, v4

    .line 27
    .line 28
    sput-object v3, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->$VALUES:[Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 29
    .line 30
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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/asm/Advice$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->$VALUES:[Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/asm/Advice$StackMapFrameHandler$Default$Initialization;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract toFrame(Lnet/bytebuddy/description/type/TypeDescription;)Ljava/lang/Object;
.end method
