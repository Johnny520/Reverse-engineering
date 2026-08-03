.class public final L۟/h2$e;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/h2;->ۥ(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Ljava/lang/reflect/Method;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/h2$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/h2$e;

    invoke-direct {v0}, L۟/h2$e;-><init>()V

    sput-object v0, L۟/h2$e;->ۥ:L۟/h2$e;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/lang/reflect/Method;

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    aget-object p1, p1, v1

    const-class v0, Landroid/view/ViewGroup;

    invoke-static {p1, v0}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    move v1, v2

    :cond_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :array_0
    .array-data 1
        -0x51t
        0x66t
        -0x7ct
        0x78t
        -0x23t
        -0x5et
        -0x13t
        0x7bt
        -0x7et
        0x75t
        -0x1dt
        -0x1dt
        -0x1t
        0x7at
        -0x7dt
        0x75t
    .end array-data

    :array_1
    .array-data 1
        -0x75t
        0x12t
        -0x14t
        0x11t
        -0x52t
        -0x7at
    .end array-data
.end method
