.class public Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;
.super Lnet/bytebuddy/description/module/ModuleDescription$Opens$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/module/ModuleDescription$Opens;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Simple"
.end annotation


# instance fields
.field protected final modifiers:I

.field private final targets:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Set;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/module/ModuleDescription$Opens$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;->targets:Ljava/util/Set;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;->modifiers:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public getTargets()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;->targets:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method
