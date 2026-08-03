.class final Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;
.super LQ0/h;
.source "SourceFile"

# interfaces
.implements LP0/a;


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
        "LQ0/h;",
        "LP0/a;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lorg/luckypray/dexkit/wrap/DexMethod;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/wrap/DexMethod;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;->this$0:Lorg/luckypray/dexkit/wrap/DexMethod;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LQ0/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;->invoke()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lorg/luckypray/dexkit/wrap/DexMethod$methodSign$2;->this$0:Lorg/luckypray/dexkit/wrap/DexMethod;

    invoke-static {v0}, Lorg/luckypray/dexkit/wrap/DexMethod;->access$getSign(Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
