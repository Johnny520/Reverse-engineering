.class Lcom/android/dx/rop/code/RegisterSpec$1;
.super Ljava/lang/ThreadLocal;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/rop/code/RegisterSpec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/ThreadLocal<",
        "Lcom/android/dx/rop/code/RegisterSpec$ForComparison;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public initialValue()Lcom/android/dx/rop/code/RegisterSpec$ForComparison;
    .locals 1

    .line 1
    new-instance p0, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0}, Lcom/android/dx/rop/code/RegisterSpec$ForComparison;-><init>(Lcom/android/dx/rop/code/RegisterSpec$1;)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic initialValue()Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec$1;->initialValue()Lcom/android/dx/rop/code/RegisterSpec$ForComparison;

    move-result-object p0

    return-object p0
.end method
