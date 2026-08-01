.class public abstract Ln71;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lej;

.field public static final b:Lm71;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lus0;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lus0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lej;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lej;-><init>(Lhw;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Ln71;->a:Lej;

    .line 14
    .line 15
    const-wide v0, 0xff4286f4L

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lp30;->c(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    new-instance v2, Lm71;

    .line 25
    .line 26
    const v3, 0x3ecccccd    # 0.4f

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v0, v1}, Lff;->b(FJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    invoke-direct {v2, v0, v1, v3, v4}, Lm71;-><init>(JJ)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Ln71;->b:Lm71;

    .line 37
    .line 38
    return-void
.end method
