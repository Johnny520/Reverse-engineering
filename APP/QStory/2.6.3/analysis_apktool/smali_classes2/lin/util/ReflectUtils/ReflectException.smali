.class public Llin/util/ReflectUtils/ReflectException;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private otherExceptions:Ljava/lang/Exception;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Llin/util/ReflectUtils/ReflectException;->otherExceptions:Ljava/lang/Exception;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getOtherExceptions()Ljava/lang/Exception;
    .locals 0

    .line 1
    iget-object p0, p0, Llin/util/ReflectUtils/ReflectException;->otherExceptions:Ljava/lang/Exception;

    .line 2
    .line 3
    return-object p0
.end method

.method public hasOtherExceptions()Z
    .locals 0

    .line 1
    iget-object p0, p0, Llin/util/ReflectUtils/ReflectException;->otherExceptions:Ljava/lang/Exception;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method
