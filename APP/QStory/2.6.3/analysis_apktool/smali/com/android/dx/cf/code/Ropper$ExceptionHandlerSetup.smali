.class Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/Ropper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExceptionHandlerSetup"
.end annotation


# instance fields
.field private caughtType:Lcom/android/dx/rop/type/Type;

.field private label:I


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/type/Type;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->caughtType:Lcom/android/dx/rop/type/Type;

    .line 5
    .line 6
    iput p2, p0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->label:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getCaughtType()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->caughtType:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLabel()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/code/Ropper$ExceptionHandlerSetup;->label:I

    .line 2
    .line 3
    return p0
.end method
