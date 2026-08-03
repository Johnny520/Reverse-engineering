.class public final L۟/h2$f;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/f3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = L۟/h2;->ۥ۟ۢ(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/f3<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field public static final ۥ:L۟/h2$f;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, L۟/h2$f;

    invoke-direct {v0}, L۟/h2$f;-><init>()V

    sput-object v0, L۟/h2$f;->ۥ:L۟/h2$f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()Ljava/lang/Object;
    .locals 2

    sget-object v0, L۟/o7;->ۥ:L۟/o7;

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, L۟/o7;->ۥۣ۟(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    nop

    :array_0
    .array-data 1
        -0x20t
        0x7bt
        0x66t
        0x2dt
        0x19t
        0x3bt
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x6bt
        0xbt
        0x2t
        0x4ct
        0x6dt
        0x5et
    .end array-data
.end method
