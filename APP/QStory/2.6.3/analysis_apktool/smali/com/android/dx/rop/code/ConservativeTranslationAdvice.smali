.class public final Lcom/android/dx/rop/code/ConservativeTranslationAdvice;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/rop/code/TranslationAdvice;


# static fields
.field public static final THE_ONE:Lcom/android/dx/rop/code/ConservativeTranslationAdvice;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/android/dx/rop/code/ConservativeTranslationAdvice;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/rop/code/ConservativeTranslationAdvice;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/android/dx/rop/code/ConservativeTranslationAdvice;->THE_ONE:Lcom/android/dx/rop/code/ConservativeTranslationAdvice;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getMaxOptimalRegisterCount()I
    .locals 0

    .line 1
    const p0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public hasConstantOperation(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/RegisterSpec;Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public requiresSourcesInOrder(Lcom/android/dx/rop/code/Rop;Lcom/android/dx/rop/code/RegisterSpecList;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
