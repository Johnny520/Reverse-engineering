.class public abstract LPu;
.super Ljava/lang/Object;


# static fields
.field public static final a:[I

.field public static final b:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const v0, 0x550402d2

    const v1, 0x5504049c

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, LPu;->a:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, LPu;->b:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100b3
        0x550402e1
        0x550402e2
        0x550402e3
        0x55040314
        0x5504031e
        0x5504031f
    .end array-data
.end method
