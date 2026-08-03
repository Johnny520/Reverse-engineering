.class public final LAd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Luu;


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:LAd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LAd;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, LAd;->a:Ljava/util/logging/Logger;

    new-instance v0, LAd;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LAd;->b:LAd;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    const-class v0, Lxd;

    return-object v0
.end method

.method public final b(Lw4;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lzd;

    invoke-direct {v0, p1}, Lzd;-><init>(Lw4;)V

    return-object v0
.end method

.method public final c()Ljava/lang/Class;
    .locals 1

    const-class v0, Lxd;

    return-object v0
.end method
