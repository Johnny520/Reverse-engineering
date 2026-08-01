.class public abstract Lmb;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lej;

.field public static final b:Llb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw9;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lw9;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lej;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lej;-><init>(Lsw;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lmb;->a:Lej;

    .line 13
    .line 14
    new-instance v0, Llb;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lmb;->b:Llb;

    .line 20
    .line 21
    return-void
.end method
