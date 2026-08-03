.class public final enum Lnet/bytebuddy/build/AndroidDescriptor$Trivial;
.super Ljava/lang/Enum;
.source "SourceFile"

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

    new-instance v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    const/4 v1, 0x0

    sget-object v2, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;->LOCAL:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    const-string v3, "LOCAL"

    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;-><init>(Ljava/lang/String;ILnet/bytebuddy/build/AndroidDescriptor$TypeScope;)V

    sput-object v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->LOCAL:Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    new-instance v1, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    const/4 v2, 0x1

    sget-object v3, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;->EXTERNAL:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    const-string v4, "EXTERNAL"

    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;-><init>(Ljava/lang/String;ILnet/bytebuddy/build/AndroidDescriptor$TypeScope;)V

    sput-object v1, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->EXTERNAL:Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    filled-new-array {v0, v1}, [Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->$VALUES:[Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

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

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->typeScope:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/AndroidDescriptor$Trivial;
    .locals 1

    const-class v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/AndroidDescriptor$Trivial;
    .locals 1

    sget-object v0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->$VALUES:[Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    invoke-virtual {v0}, [Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/build/AndroidDescriptor$Trivial;

    return-object v0
.end method


# virtual methods
.method public getTypeScope(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;
    .locals 0

    iget-object p1, p0, Lnet/bytebuddy/build/AndroidDescriptor$Trivial;->typeScope:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    return-object p1
.end method
