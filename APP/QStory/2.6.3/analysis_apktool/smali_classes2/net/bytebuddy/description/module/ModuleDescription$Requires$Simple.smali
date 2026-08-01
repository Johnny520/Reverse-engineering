.class public Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;
.super Lnet/bytebuddy/description/module/ModuleDescription$Requires$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/module/ModuleDescription$Requires;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Simple"
.end annotation


# instance fields
.field private final modifiers:I

.field private final version:Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/module/ModuleDescription$Requires$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;->version:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;->modifiers:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;->modifiers:I

    .line 2
    .line 3
    return p0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;->version:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
