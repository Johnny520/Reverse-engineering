.class public interface abstract Lcom/android/dx/dex/code/CatchBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# virtual methods
.method public abstract build()Lcom/android/dx/dex/code/CatchTable;
.end method

.method public abstract getCatchTypes()Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/android/dx/rop/type/Type;",
            ">;"
        }
    .end annotation
.end method

.method public abstract hasAnyCatches()Z
.end method
