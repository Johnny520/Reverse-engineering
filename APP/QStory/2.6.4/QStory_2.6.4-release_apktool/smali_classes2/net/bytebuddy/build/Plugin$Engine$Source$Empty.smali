.class public final enum Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/build/Plugin$Engine$Source;
.implements Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Source;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Empty"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;",
        ">;",
        "Lnet/bytebuddy/build/Plugin$Engine$Source;",
        "Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;

.field public static final enum INSTANCE:Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;->INSTANCE:Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;->$VALUES:[Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;->$VALUES:[Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/Plugin$Engine$Source$Empty;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 0

    .line 1
    return-void
.end method

.method public getManifest()Ljava/util/jar/Manifest;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;->NO_MANIFEST:Ljava/util/jar/Manifest;

    .line 2
    .line 3
    return-object p0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public read()Lnet/bytebuddy/build/Plugin$Engine$Source$Origin;
    .locals 0

    .line 1
    return-object p0
.end method

.method public toClassFileLocator(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/dynamic/ClassFileLocator;
    .locals 0
    .param p1    # Lnet/bytebuddy/ClassFileVersion;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    sget-object p0, Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/ClassFileLocator$NoOp;

    .line 2
    .line 3
    return-object p0
.end method
