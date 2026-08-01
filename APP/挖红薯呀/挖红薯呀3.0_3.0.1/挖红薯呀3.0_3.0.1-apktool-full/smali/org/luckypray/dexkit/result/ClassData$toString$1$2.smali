.class final Lorg/luckypray/dexkit/result/ClassData$toString$1$2;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/result/ClassData;->toString()Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc50;",
        "Lsw;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lorg/luckypray/dexkit/result/ClassData$toString$1$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;->INSTANCE:Lorg/luckypray/dexkit/result/ClassData$toString$1$2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lc50;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final invoke(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lorg/luckypray/dexkit/result/ClassData;->getName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 9
    check-cast p1, Lorg/luckypray/dexkit/result/ClassData;

    invoke-virtual {p0, p1}, Lorg/luckypray/dexkit/result/ClassData$toString$1$2;->invoke(Lorg/luckypray/dexkit/result/ClassData;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method
