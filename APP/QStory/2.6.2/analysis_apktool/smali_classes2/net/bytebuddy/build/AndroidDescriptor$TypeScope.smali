.class public final enum Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/AndroidDescriptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TypeScope"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

.field public static final enum EXTERNAL:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

.field public static final enum LOCAL:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 2
    .line 3
    const-string v1, "LOCAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;->LOCAL:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 12
    .line 13
    const-string v2, "EXTERNAL"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;->EXTERNAL:Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;->$VALUES:[Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 26
    .line 27
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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;->$VALUES:[Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/AndroidDescriptor$TypeScope;

    .line 8
    .line 9
    return-object v0
.end method
