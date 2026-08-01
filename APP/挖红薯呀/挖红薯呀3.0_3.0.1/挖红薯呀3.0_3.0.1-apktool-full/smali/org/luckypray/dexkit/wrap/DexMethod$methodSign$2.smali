.class final Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhw;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/wrap/DexMethod;-><init>(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc50;",
        "Lhw;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/wrap/DexMethod;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/wrap/DexMethod;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;->this$0:Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;->invoke()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final invoke()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;->this$0:Lorg/luckypray/dexkit/wrap/DexMethod;

    .line 2
    .line 3
    invoke-static {p0}, Lorg/luckypray/dexkit/wrap/DexMethod;->access$getSign(Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
